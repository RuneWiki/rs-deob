package jagex2.client;

import deob.ObfuscatedName;
import jagex2.config.FloType;
import jagex2.config.IdkType;
import jagex2.config.IfType;
import jagex2.config.LocType;
import jagex2.config.NpcType;
import jagex2.config.ObjType;
import jagex2.config.SeqType;
import jagex2.config.SpotType;
import jagex2.config.UnkType;
import jagex2.config.VarpType;
import jagex2.dash3d.AnimBase;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.ClientEntity;
import jagex2.dash3d.ClientLocAnim;
import jagex2.dash3d.ClientLocMerge;
import jagex2.dash3d.ClientNpc;
import jagex2.dash3d.ClientObj;
import jagex2.dash3d.ClientPlayer;
import jagex2.dash3d.ClientProj;
import jagex2.dash3d.CollisionMap;
import jagex2.dash3d.LocChange;
import jagex2.dash3d.MapSpotAnim;
import jagex2.dash3d.Model;
import jagex2.dash3d.Pix3D;
import jagex2.dash3d.World;
import jagex2.datastruct.JString;
import jagex2.datastruct.LinkList;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix32;
import jagex2.graphics.Pix8;
import jagex2.graphics.PixFont;
import jagex2.graphics.PixMap;
import jagex2.io.BZip2;
import jagex2.io.ClientStream;
import jagex2.io.Isaac;
import jagex2.io.JagFile;
import jagex2.io.Packet;
import jagex2.io.Protocol;
import jagex2.sound.JagFX;
import jagex2.wordfilter.WordFilter;
import jagex2.wordfilter.WordPack;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.zip.CRC32;
import sign.signlink;

@ObfuscatedName("client")
public final class Client extends GameShell {

	@ObfuscatedName("client.ab")
	public int hintTileZ;

	@ObfuscatedName("client.bb")
	public int hintHeight;

	@ObfuscatedName("client.cb")
	public int hintOffsetX;

	@ObfuscatedName("client.db")
	public int hintOffsetZ;

	@ObfuscatedName("client.eb")
	public int macroMinimapCycle;

	@ObfuscatedName("client.fb")
	public boolean redrawFrame = false;

	@ObfuscatedName("client.gb")
	public LinkList locAnims = new LinkList();

	@ObfuscatedName("client.hb")
	public Isaac randomIn;

	@ObfuscatedName("client.ib")
	public boolean[] camShake = new boolean[5];

	@ObfuscatedName("client.jb")
	public int chatPrivateMode;

	@ObfuscatedName("client.lb")
	public int activeIcon = 3;

	@ObfuscatedName("client.mb")
	public int[][] distMap = new int[104][104];

	@ObfuscatedName("client.ob")
	public int socialInputType;

	@ObfuscatedName("client.pb")
	public int mapBuildBaseX;

	@ObfuscatedName("client.qb")
	public int mapBuildBaseZ;

	@ObfuscatedName("client.rb")
	public int mapBuildPrevBaseX;

	@ObfuscatedName("client.sb")
	public int mapBuildPrevBaseZ;

	@ObfuscatedName("client.tb")
	public String socialInput = "";

	@ObfuscatedName("client.vb")
	public LinkList locMerges = new LinkList();

	@ObfuscatedName("client.wb")
	public long[] ignoreUserhash = new long[100];

	@ObfuscatedName("client.xb")
	public int runweight;

	@ObfuscatedName("client.yb")
	public byte[][] mapBuildGroundData;

	@ObfuscatedName("client.ac")
	public Packet out = Packet.alloc(1);

	@ObfuscatedName("client.bc")
	public boolean startMidiThread = false;

	@ObfuscatedName("client.cc")
	public int chatEffects;

	@ObfuscatedName("client.dc")
	public int hintNpc;

	@ObfuscatedName("client.ec")
	public int chatDisabled;

	@ObfuscatedName("client.gc")
	public static int cyclelogic2;

	@ObfuscatedName("client.ic")
	public static int oplogic3;

	@ObfuscatedName("client.jc")
	public int[] statEffectiveLevel = new int[50];

	@ObfuscatedName("client.kc")
	public IfType chatInterface = new IfType();

	@ObfuscatedName("client.lc")
	public int[] waveLoops = new int[50];

	@ObfuscatedName("client.mc")
	public int oneMouseButton;

	@ObfuscatedName("client.O")
	public int selfSlot = -1;

	@ObfuscatedName("client.W")
	public int[] idkDesignColour = new int[5];

	@ObfuscatedName("client.X")
	public Packet loginout = Packet.alloc(1);

	@ObfuscatedName("client.Bb")
	public int[] friendNodeId = new int[100];

	@ObfuscatedName("client.Cb")
	public int minimapLevel = -1;

	@ObfuscatedName("client.Db")
	public String socialInputHeader = "";

	@ObfuscatedName("client.Eb")
	public Pix32[] hitmarks = new Pix32[20];

	@ObfuscatedName("client.Mb")
	public String dialogInput = "";

	@ObfuscatedName("client.Ob")
	public int lastWaveId = -1;

	@ObfuscatedName("client.Qb")
	public boolean idkDesignRedraw = false;

	@ObfuscatedName("client.Rb")
	public int[] idkDesignPart = new int[7];

	@ObfuscatedName("client.Tb")
	public Pix32[] activeMapFunctions = new Pix32[1000];

	@ObfuscatedName("client.Ub")
	public int scrollHeight = 78;

	@ObfuscatedName("client.Xb")
	public Packet in = Packet.alloc(1);

	@ObfuscatedName("client.nc")
	public int[] jagChecksum = new int[9];

	@ObfuscatedName("client.oc")
	public boolean midiThreadActive = true;

	@ObfuscatedName("client.qc")
	public Pix8[] sideicons = new Pix8[13];

	@ObfuscatedName("client.sc")
	public int orbitCameraPitch = 128;

	@ObfuscatedName("client.wc")
	public int MAX_PLAYER_COUNT = 2048;

	@ObfuscatedName("client.xc")
	public int LOCAL_PLAYER_INDEX = 2047;

	@ObfuscatedName("client.yc")
	public ClientPlayer[] players = new ClientPlayer[MAX_PLAYER_COUNT];

	@ObfuscatedName("client.Ac")
	public int[] playerIds = new int[MAX_PLAYER_COUNT];

	@ObfuscatedName("client.Cc")
	public int[] entityUpdateIds = new int[MAX_PLAYER_COUNT];

	@ObfuscatedName("client.Dc")
	public Packet[] playerAppearanceBuffer = new Packet[MAX_PLAYER_COUNT];

	@ObfuscatedName("client.Ic")
	public LinkList projectiles = new LinkList();

	@ObfuscatedName("client.Kc")
	public String[] menuOption = new String[500];

	@ObfuscatedName("client.Lc")
	public boolean midiActive = true;

	@ObfuscatedName("client.Mc")
	public boolean idkDesignGender = true;

	@ObfuscatedName("client.ad")
	public int[] flameLineOffset = new int[256];

	@ObfuscatedName("client.gd")
	public int[] compassMaskLineOffsets = new int[33];

	@ObfuscatedName("client.id")
	public int[] waveDelay = new int[50];

	@ObfuscatedName("client.ld")
	public int[] sideIcon = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.pd")
	public boolean errorLoading = false;

	@ObfuscatedName("client.td")
	public boolean socialInputOpen = false;

	@ObfuscatedName("client.wd")
	public boolean resumedPauseButton = false;

	@ObfuscatedName("client.Bd")
	public final int field1081 = 100;

	@ObfuscatedName("client.Cd")
	public int[] privateMessageIds = new int[100];

	@ObfuscatedName("client.Dd")
	public boolean isMenuOpen = false;

	@ObfuscatedName("client.Fd")
	public boolean reportAbuseMuteOption = false;

	@ObfuscatedName("client.Id")
	public LinkList locChanges = new LinkList();

	@ObfuscatedName("client.Ud")
	public int[] chatType = new int[100];

	@ObfuscatedName("client.Vd")
	public String[] chatUsername = new String[100];

	@ObfuscatedName("client.Wd")
	public String[] chatText = new String[100];

	@ObfuscatedName("client.ae")
	public boolean flameActive = false;

	@ObfuscatedName("client.fe")
	public int reportAbuseComId = -1;

	@ObfuscatedName("client.qe")
	public int[] activeMapFunctionX = new int[1000];

	@ObfuscatedName("client.re")
	public int[] activeMapFunctionZ = new int[1000];

	@ObfuscatedName("client.se")
	public int[][] tileLastOccupiedCycle = new int[104][104];

	@ObfuscatedName("client.te")
	public boolean redrawChatMode = false;

	@ObfuscatedName("client.ve")
	public boolean errorHost = false;

	@ObfuscatedName("client.ye")
	public int[] statBaseLevel = new int[50];

	@ObfuscatedName("client.ze")
	public ClientNpc[] npc = new ClientNpc[8192];

	@ObfuscatedName("client.Be")
	public int[] npcIds = new int[8192];

	@ObfuscatedName("client.De")
	public int macroMinimapZoomModifier = 1;

	@ObfuscatedName("client.Ke")
	public int[] var = new int[2000];

	@ObfuscatedName("client.Me")
	public int[] entityRemovalIds = new int[1000];

	@ObfuscatedName("client.Pe")
	public long[] friendUserhash = new long[100];

	@ObfuscatedName("client.Ze")
	public int[] minimapMaskLineLengths = new int[151];

	@ObfuscatedName("client.af")
	public CollisionMap[] collision = new CollisionMap[4];

	@ObfuscatedName("client.cf")
	public Pix32[] headicons = new Pix32[20];

	@ObfuscatedName("client.ff")
	public int[] camShakeAxis = new int[5];

	@ObfuscatedName("client.gf")
	public boolean objGrabThreshold = false;

	@ObfuscatedName("client.lf")
	public boolean redrawSidebar = false;

	@ObfuscatedName("client.mf")
	public boolean redrawChatback = false;

	@ObfuscatedName("client.nf")
	public int[] camShakeRan = new int[5];

	@ObfuscatedName("client.pf")
	public boolean cinemaCam = false;

	@ObfuscatedName("client.rf")
	public String reportAbuseInput = "";

	@ObfuscatedName("client.sf")
	public int mainModalId = -1;

	@ObfuscatedName("client.vf")
	public boolean ingame = false;

	@ObfuscatedName("client.wf")
	public boolean flamesThread = false;

	@ObfuscatedName("client.Bf")
	public int SCROLLBAR_GRIP_LOWLIGHT = 0x332D25;

	@ObfuscatedName("client.Of")
	public int SCROLLBAR_GRIP_HIGHLIGHT = 0x766654;

	@ObfuscatedName("client.Pf")
	public int[] routeX = new int[4000];

	@ObfuscatedName("client.Qf")
	public int[] routeZ = new int[4000];

	@ObfuscatedName("client.Rf")
	public CRC32 crc32 = new CRC32();

	@ObfuscatedName("client.Wf")
	public int chatComId = -1;

	@ObfuscatedName("client.og")
	public int projectX = -1;

	@ObfuscatedName("client.pg")
	public int projectY = -1;

	@ObfuscatedName("client.qg")
	public int tutComId = -1;

	@ObfuscatedName("client.sg")
	public boolean staffmod = false;

	@ObfuscatedName("client.tg")
	public int[] camShakeCycle = new int[5];

	@ObfuscatedName("client.Hg")
	public Pix8[] mapscene = new Pix8[50];

	@ObfuscatedName("client.Og")
	public int[] CHAT_COLOURS = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.Tg")
	public int SCROLLBAR_TRACK = 0x23201B;

	@ObfuscatedName("client.Yg")
	public boolean dialogInputOpen = false;

	@ObfuscatedName("client.Zg")
	public LinkList spotanims = new LinkList();

	@ObfuscatedName("client.ih")
	public int lastWaveLoops = -1;

	@ObfuscatedName("client.jh")
	public String loginUser = "";

	@ObfuscatedName("client.kh")
	public String loginPass = "";

	@ObfuscatedName("client.mh")
	public byte[] textureBuffer = new byte[16384];

	@ObfuscatedName("client.nh")
	public boolean errorStarted = false;

	@ObfuscatedName("client.sh")
	public int[] varServ = new int[2000];

	@ObfuscatedName("client.wh")
	public int[] statXP = new int[50];

	@ObfuscatedName("client.xh")
	public boolean redrawIcons = false;

	@ObfuscatedName("client.Ah")
	public String loginMes1 = "";

	@ObfuscatedName("client.Bh")
	public String loginMes2 = "";

	@ObfuscatedName("client.Dh")
	public int macroMinimapAngleModifier = 2;

	@ObfuscatedName("client.Jh")
	public int MAX_CHATS = 50;

	@ObfuscatedName("client.Kh")
	public int[] chatX = new int[MAX_CHATS];

	@ObfuscatedName("client.Lh")
	public int[] chatY = new int[MAX_CHATS];

	@ObfuscatedName("client.Mh")
	public int[] chatHeight = new int[MAX_CHATS];

	@ObfuscatedName("client.Nh")
	public int[] chatWidth = new int[MAX_CHATS];

	@ObfuscatedName("client.Oh")
	public int[] chatColour = new int[MAX_CHATS];

	@ObfuscatedName("client.Ph")
	public int[] chatEffect = new int[MAX_CHATS];

	@ObfuscatedName("client.Qh")
	public int[] chatTimer = new int[MAX_CHATS];

	@ObfuscatedName("client.Rh")
	public String[] chats = new String[MAX_CHATS];

	@ObfuscatedName("client.Yh")
	public final int[] LOC_SHAPE_TO_LAYER = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.ii")
	public int[] compassMaskLineLengths = new int[33];

	@ObfuscatedName("client.ji")
	public int[][] dirMap = new int[104][104];

	@ObfuscatedName("client.li")
	public Pix32[] cross = new Pix32[8];

	@ObfuscatedName("client.mi")
	public boolean flameThread = false;

	@ObfuscatedName("client.oi")
	public Object midiSync = new Object();

	@ObfuscatedName("client.pi")
	public int[] waveIds = new int[50];

	@ObfuscatedName("client.ri")
	public int macroCameraXModifier = 2;

	@ObfuscatedName("client.si")
	public String[] friendUsername = new String[100];

	@ObfuscatedName("client.ti")
	public int tutFlashIcon = -1;

	@ObfuscatedName("client.ui")
	public int sideModalId = -1;

	@ObfuscatedName("client.wi")
	public int macroCameraZModifier = 2;

	@ObfuscatedName("client.yi")
	public int[] minimapMaskLineOffsets = new int[151];

	@ObfuscatedName("client.Ai")
	public int macroCameraAngleModifier = 1;

	@ObfuscatedName("client.Ci")
	public String chatInput = "";

	@ObfuscatedName("client.Di")
	public Pix32[] mapfunction = new Pix32[50];

	@ObfuscatedName("client.Ei")
	public int[] menuParamB = new int[500];

	@ObfuscatedName("client.Fi")
	public int[] menuParamC = new int[500];

	@ObfuscatedName("client.Gi")
	public int[] menuAction = new int[500];

	@ObfuscatedName("client.Hi")
	public int[] menuParamA = new int[500];

	@ObfuscatedName("client.Ji")
	public boolean scrollGrabbed = false;

	@ObfuscatedName("client.Si")
	public boolean waveEnabled = true;

	@ObfuscatedName("client.Wi")
	public LinkList[][][] groundObj = new LinkList[4][104][104];

	@ObfuscatedName("client.Xi")
	public int SCROLLBAR_GRIP_FOREGROUND = 0x4D4233;

	@ObfuscatedName("client.Yi")
	public int[] camShakeAmp = new int[5];

	@ObfuscatedName("client.F")
	public static String CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.od")
	public static int[] skillxp = new int[99];

	@ObfuscatedName("client.Kd")
	public static int nodeId = 10;

	@ObfuscatedName("client.Md")
	public static boolean memServer = true;

	@ObfuscatedName("client.ue")
	public static BigInteger LOGIN_RSAE = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.Oe")
	public static final int[][] recol1d = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.fh")
	public static BigInteger LOGIN_RSAN = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.qh")
	public static final int[] recol2d = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Lb")
	public int logoutTimer;

	@ObfuscatedName("client.Nb")
	public int macroCameraCycle;

	@ObfuscatedName("client.Vb")
	public int ignoreCount;

	@ObfuscatedName("client.Zb")
	public static int oplogic4;

	@ObfuscatedName("client.rc")
	public int lastWaveLength;

	@ObfuscatedName("client.tc")
	public int orbitCameraYaw;

	@ObfuscatedName("client.uc")
	public int orbitCameraYawVelocity;

	@ObfuscatedName("client.vc")
	public int orbitCameraPitchVelocity;

	@ObfuscatedName("client.zc")
	public int playerCount;

	@ObfuscatedName("client.Bc")
	public int entityUpdateCount;

	@ObfuscatedName("client.Ec")
	public int ptype0;

	@ObfuscatedName("client.Fc")
	public int ptype1;

	@ObfuscatedName("client.Gc")
	public int ptype2;

	@ObfuscatedName("client.Jc")
	public int splitPrivateChat;

	@ObfuscatedName("client.Nc")
	public int sceneCycle;

	@ObfuscatedName("client.Oc")
	public int mapBuildCentreZoneX;

	@ObfuscatedName("client.Pc")
	public int mapBuildCentreZoneZ;

	@ObfuscatedName("client.Uc")
	public int objDragComId;

	@ObfuscatedName("client.Vc")
	public int objDragSlot;

	@ObfuscatedName("client.Wc")
	public int objDragArea;

	@ObfuscatedName("client.Xc")
	public int objGrabX;

	@ObfuscatedName("client.Yc")
	public int objGrabY;

	@ObfuscatedName("client.fd")
	public int privateMessageCount;

	@ObfuscatedName("client.hd")
	public static int oplogic6;

	@ObfuscatedName("client.jd")
	public int overChatComId;

	@ObfuscatedName("client.md")
	public int zoneUpdateX;

	@ObfuscatedName("client.nd")
	public int zoneUpdateZ;

	@ObfuscatedName("client.rd")
	public static int oplogic2;

	@ObfuscatedName("client.sd")
	public int lastOverComId;

	@ObfuscatedName("client.xd")
	public int daysSinceLastLogin;

	@ObfuscatedName("client.yd")
	public int flameGradientCycle0;

	@ObfuscatedName("client.zd")
	public int flameGradientCycle1;

	@ObfuscatedName("client.Ad")
	public static int oplogic9;

	@ObfuscatedName("client.Ed")
	public int minusedlevel;

	@ObfuscatedName("client.Gd")
	public static int cyclelogic1;

	@ObfuscatedName("client.Jd")
	public int chatTradeMode;

	@ObfuscatedName("client.Ld")
	public static int portOffset;

	@ObfuscatedName("client.Od")
	public static int oplogic8;

	@ObfuscatedName("client.Zd")
	public int daysSinceRecoveriesChanged;

	@ObfuscatedName("client.je")
	public int hintType;

	@ObfuscatedName("client.le")
	public static int cyclelogic6;

	@ObfuscatedName("client.me")
	public int orbitCameraX;

	@ObfuscatedName("client.ne")
	public int orbitCameraZ;

	@ObfuscatedName("client.oe")
	public int sendCameraDelay;

	@ObfuscatedName("client.pe")
	public int activeMapFunctionCount;

	@ObfuscatedName("client.we")
	public int objDragCycle;

	@ObfuscatedName("client.Ae")
	public int npcCount;

	@ObfuscatedName("client.Ce")
	public int macroMinimapZoom;

	@ObfuscatedName("client.Ee")
	public int cameraPitchClamp;

	@ObfuscatedName("client.Fe")
	public int worldLocationState;

	@ObfuscatedName("client.Ge")
	public int scrollCycle;

	@ObfuscatedName("client.Je")
	public static int oplogic7;

	@ObfuscatedName("client.Le")
	public int entityRemovalCount;

	@ObfuscatedName("client.Ne")
	public int overSideComId;

	@ObfuscatedName("client.Qe")
	public int selectedCycle;

	@ObfuscatedName("client.Re")
	public int selectedComId;

	@ObfuscatedName("client.Se")
	public int selectedItem;

	@ObfuscatedName("client.Te")
	public int selectedArea;

	@ObfuscatedName("client.Ue")
	public int camLookAtLx;

	@ObfuscatedName("client.Ve")
	public int camLookAtLz;

	@ObfuscatedName("client.We")
	public int camLookAtHei;

	@ObfuscatedName("client.Xe")
	public int camLookAtRate;

	@ObfuscatedName("client.Ye")
	public int camLookAtRate2;

	@ObfuscatedName("client.bf")
	public static int loopCycle;

	@ObfuscatedName("client.df")
	public int rebootTimer;

	@ObfuscatedName("client.kf")
	public int midiSyncCrc;

	@ObfuscatedName("client.qf")
	public int worldUpdateNum;

	@ObfuscatedName("client.tf")
	public int loginSelect;

	@ObfuscatedName("client.xf")
	public int chatPublicMode;

	@ObfuscatedName("client.yf")
	public int chatScrollPos;

	@ObfuscatedName("client.Ff")
	public int inMultizone;

	@ObfuscatedName("client.Kf")
	public int tryMoveNearest;

	@ObfuscatedName("client.Tf")
	public static int cyclelogic3;

	@ObfuscatedName("client.Xf")
	public int useMode;

	@ObfuscatedName("client.Yf")
	public int objSelectedSlot;

	@ObfuscatedName("client.Zf")
	public int objSelectedComId;

	@ObfuscatedName("client.ag")
	public int objComId;

	@ObfuscatedName("client.ng")
	public int waveCount;

	@ObfuscatedName("client.ug")
	public int targetMode;

	@ObfuscatedName("client.vg")
	public int targetComId;

	@ObfuscatedName("client.wg")
	public int targetMask;

	@ObfuscatedName("client.Ug")
	public int minimapFlagX;

	@ObfuscatedName("client.Vg")
	public int minimapFlagZ;

	@ObfuscatedName("client.Xg")
	public int unreadMessages;

	@ObfuscatedName("client.eh")
	public int lastAddress;

	@ObfuscatedName("client.gh")
	public int overMainComId;

	@ObfuscatedName("client.ph")
	public int runenergy;

	@ObfuscatedName("client.rh")
	public int menuNumEntries;

	@ObfuscatedName("client.th")
	public int hintPlayer;

	@ObfuscatedName("client.vh")
	public int sceneState;

	@ObfuscatedName("client.Ch")
	public int macroMinimapAngle;

	@ObfuscatedName("client.Eh")
	public int hoveredSlot;

	@ObfuscatedName("client.Fh")
	public int hoveredSlotComId;

	@ObfuscatedName("client.Gh")
	public int friendCount;

	@ObfuscatedName("client.Hh")
	public static int cyclelogic4;

	@ObfuscatedName("client.Ih")
	public int chatCount;

	@ObfuscatedName("client.Sh")
	public int wildernessLevel;

	@ObfuscatedName("client.Zh")
	public static int cyclelogic5;

	@ObfuscatedName("client.ai")
	public int loginscreen;

	@ObfuscatedName("client.bi")
	public int midiCrc;

	@ObfuscatedName("client.ci")
	public int camX;

	@ObfuscatedName("client.di")
	public int camY;

	@ObfuscatedName("client.ei")
	public int camZ;

	@ObfuscatedName("client.fi")
	public int camPitch;

	@ObfuscatedName("client.gi")
	public int camYaw;

	@ObfuscatedName("client.qi")
	public int macroCameraX;

	@ObfuscatedName("client.vi")
	public int macroCameraZ;

	@ObfuscatedName("client.zi")
	public int macroCameraAngle;

	@ObfuscatedName("client.Ni")
	public int menuArea;

	@ObfuscatedName("client.Oi")
	public int menuX;

	@ObfuscatedName("client.Pi")
	public int menuY;

	@ObfuscatedName("client.Qi")
	public int menuWidth;

	@ObfuscatedName("client.Ri")
	public int menuHeight;

	@ObfuscatedName("client.Ti")
	public int scrollInputPadding;

	@ObfuscatedName("client.Ui")
	public int midiSize;

	@ObfuscatedName("client.Vi")
	public int coolingCycle;

	@ObfuscatedName("client.E")
	public static int oplogic5;

	@ObfuscatedName("client.G")
	public int midiSyncLen;

	@ObfuscatedName("client.I")
	public int camMoveToLx;

	@ObfuscatedName("client.J")
	public int camMoveToLz;

	@ObfuscatedName("client.K")
	public int camMoveToHei;

	@ObfuscatedName("client.L")
	public int camMoveToRate;

	@ObfuscatedName("client.M")
	public int camMoveToRate2;

	@ObfuscatedName("client.S")
	public int crossX;

	@ObfuscatedName("client.T")
	public int crossY;

	@ObfuscatedName("client.U")
	public int crossCycle;

	@ObfuscatedName("client.V")
	public int crossMode;

	@ObfuscatedName("client.Y")
	public int nextMusicDelay;

	@ObfuscatedName("client.Z")
	public int hintTileX;

	@ObfuscatedName("client.Ab")
	public static int oplogic1;

	@ObfuscatedName("client.Hb")
	public int psize;

	@ObfuscatedName("client.Ib")
	public int ptype;

	@ObfuscatedName("client.Jb")
	public int timeoutTimer;

	@ObfuscatedName("client.Kb")
	public int noTimeoutTimer;

	@ObfuscatedName("client.Yd")
	public long socialUserhash;

	@ObfuscatedName("client.Li")
	public long loginSeed;

	@ObfuscatedName("client.Fb")
	public long lastWaveStartTime;

	@ObfuscatedName("client.Hc")
	public World world;

	@ObfuscatedName("client.of")
	public ClientPlayer localPlayer;

	@ObfuscatedName("client.hf")
	public Pix32 idkDesignButton1;

	@ObfuscatedName("client.jf")
	public Pix32 idkDesignButton2;

	@ObfuscatedName("client.zf")
	public Pix32 flameLeft;

	@ObfuscatedName("client.Af")
	public Pix32 flameRight;

	@ObfuscatedName("client.Sf")
	public Pix32 mapmarker1;

	@ObfuscatedName("client.Wg")
	public Pix32 minimap;

	@ObfuscatedName("client.ah")
	public Pix32 mapdots1;

	@ObfuscatedName("client.bh")
	public Pix32 mapdots2;

	@ObfuscatedName("client.ch")
	public Pix32 mapdots3;

	@ObfuscatedName("client.dh")
	public Pix32 mapdots4;

	@ObfuscatedName("client.Ki")
	public Pix32 compass;

	@ObfuscatedName("client.Pd")
	public Pix8 redstone1;

	@ObfuscatedName("client.Qd")
	public Pix8 redstone2;

	@ObfuscatedName("client.Rd")
	public Pix8 redstone3;

	@ObfuscatedName("client.Sd")
	public Pix8 redstone1h;

	@ObfuscatedName("client.Td")
	public Pix8 redstone2h;

	@ObfuscatedName("client.ge")
	public Pix8 backbase1;

	@ObfuscatedName("client.he")
	public Pix8 backbase2;

	@ObfuscatedName("client.ie")
	public Pix8 backhmid1;

	@ObfuscatedName("client.Cf")
	public Pix8 invback;

	@ObfuscatedName("client.Df")
	public Pix8 mapback;

	@ObfuscatedName("client.Ef")
	public Pix8 chatback;

	@ObfuscatedName("client.Jg")
	public Pix8 redstone1v;

	@ObfuscatedName("client.Kg")
	public Pix8 redstone2v;

	@ObfuscatedName("client.Lg")
	public Pix8 redstone3v;

	@ObfuscatedName("client.Mg")
	public Pix8 redstone1hv;

	@ObfuscatedName("client.Ng")
	public Pix8 redstone2hv;

	@ObfuscatedName("client.yh")
	public Pix8 scrollbar1;

	@ObfuscatedName("client.zh")
	public Pix8 scrollbar2;

	@ObfuscatedName("client.Uh")
	public Pix8 titlebox;

	@ObfuscatedName("client.Vh")
	public Pix8 titlebutton;

	@ObfuscatedName("client.Gf")
	public PixFont p11;

	@ObfuscatedName("client.Hf")
	public PixFont p12;

	@ObfuscatedName("client.If")
	public PixFont b12;

	@ObfuscatedName("client.Jf")
	public PixFont q8;

	@ObfuscatedName("client.cd")
	public PixMap areaBackbase1;

	@ObfuscatedName("client.dd")
	public PixMap areaBackbase2;

	@ObfuscatedName("client.ed")
	public PixMap areaBackhmid1;

	@ObfuscatedName("client.cg")
	public PixMap areaBackleft1;

	@ObfuscatedName("client.dg")
	public PixMap areaBackleft2;

	@ObfuscatedName("client.eg")
	public PixMap areaBackright1;

	@ObfuscatedName("client.fg")
	public PixMap areaBackright2;

	@ObfuscatedName("client.gg")
	public PixMap areaBacktop1;

	@ObfuscatedName("client.hg")
	public PixMap areaBacktop2;

	@ObfuscatedName("client.ig")
	public PixMap areaBackvmid1;

	@ObfuscatedName("client.jg")
	public PixMap areaBackvmid2;

	@ObfuscatedName("client.kg")
	public PixMap areaBackvmid3;

	@ObfuscatedName("client.lg")
	public PixMap areaBackhmid2;

	@ObfuscatedName("client.yg")
	public PixMap imageTitle2;

	@ObfuscatedName("client.zg")
	public PixMap imageTitle3;

	@ObfuscatedName("client.Ag")
	public PixMap imageTitle4;

	@ObfuscatedName("client.Bg")
	public PixMap imageTitle0;

	@ObfuscatedName("client.Cg")
	public PixMap imageTitle1;

	@ObfuscatedName("client.Dg")
	public PixMap imageTitle5;

	@ObfuscatedName("client.Eg")
	public PixMap imageTitle6;

	@ObfuscatedName("client.Fg")
	public PixMap imageTitle7;

	@ObfuscatedName("client.Gg")
	public PixMap imageTitle8;

	@ObfuscatedName("client.Pg")
	public PixMap areaSide;

	@ObfuscatedName("client.Qg")
	public PixMap areaMap;

	@ObfuscatedName("client.Rg")
	public PixMap areaGame;

	@ObfuscatedName("client.Sg")
	public PixMap areaChat;

	@ObfuscatedName("client.Bi")
	public JagFile title;

	@ObfuscatedName("client.Uf")
	public ClientStream stream;

	@ObfuscatedName("client.Ie")
	public String tutComMessage;

	@ObfuscatedName("client.bg")
	public String objSelectedName;

	@ObfuscatedName("client.xg")
	public String targetOp;

	@ObfuscatedName("client.hh")
	public String midiSyncName;

	@ObfuscatedName("client.ki")
	public String currentMidi;

	@ObfuscatedName("client.Nd")
	public static boolean lowMem;

	@ObfuscatedName("client.Th")
	public static boolean alreadystarted;

	@ObfuscatedName("client.Rc")
	public int[] flameBuffer0;

	@ObfuscatedName("client.Sc")
	public int[] flameBuffer1;

	@ObfuscatedName("client.be")
	public int[] flameGradient;

	@ObfuscatedName("client.ce")
	public int[] flameGradient0;

	@ObfuscatedName("client.de")
	public int[] flameGradient1;

	@ObfuscatedName("client.ee")
	public int[] flameGradient2;

	@ObfuscatedName("client.xe")
	public int[] mapBuildIndex;

	@ObfuscatedName("client.Mf")
	public int[] flameBuffer3;

	@ObfuscatedName("client.Nf")
	public int[] flameBuffer2;

	@ObfuscatedName("client.P")
	public int[] chatScanline;

	@ObfuscatedName("client.Q")
	public int[] sideScanline;

	@ObfuscatedName("client.R")
	public int[] gameScanline;

	@ObfuscatedName("client.uf")
	public Pix8[] runes;

	@ObfuscatedName("client.Vf")
	public byte[][] mapBuildLocationData;

	@ObfuscatedName("client.Qc")
	public byte[][][] mapl;

	@ObfuscatedName("client.Wb")
	public int[][][] groundh;

	@ObfuscatedName("client.a(ZILjava/lang/String;I)V")
	public final void playMidi(int arg0, String arg1, int arg2) {
		if (arg1 != null) {
			synchronized (midiSync) {
				midiSyncName = arg1;
				midiSyncCrc = arg0;
				midiSyncLen = arg2;
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void entityOverlays() {
		chatCount = 0;
		for (int var1 = -1; var1 < npcCount + playerCount; var1++) {
			ClientEntity var2;
			if (var1 == -1) {
				var2 = localPlayer;
			} else if (var1 < playerCount) {
				var2 = players[playerIds[var1]];
			} else {
				var2 = npc[npcIds[var1 - playerCount]];
			}

			if (var2 != null && var2.isReady()) {
				if (var1 < playerCount) {
					int var3 = 30;
					ClientPlayer var4 = (ClientPlayer) var2;
					if (var4.headicons != 0) {
						getOverlayPos(var2.height + 15, var2);

						if (projectX > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.headicons & 1 << var5) != 0) {
									headicons[var5].plotSprite(projectY - var3, projectX - 12);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && hintType == 10 && playerIds[var1] == hintPlayer) {
						getOverlayPos(var2.height + 15, var2);

						if (projectX > -1) {
							headicons[7].plotSprite(projectY - var3, projectX - 12);
						}
					}
				} else if (hintType == 1 && npcIds[var1 - playerCount] == hintNpc && loopCycle % 20 < 10) {
					getOverlayPos(var2.height + 15, var2);

					if (projectX > -1) {
						headicons[2].plotSprite(projectY - 28, projectX - 12);
					}
				}

				if (var2.chatMessage != null && (var1 >= playerCount || chatPublicMode == 0 || chatPublicMode == 3 || chatPublicMode == 1 && isFriend(((ClientPlayer) var2).name))) {
					getOverlayPos(var2.height, var2);

					if (projectX > -1 && chatCount < MAX_CHATS) {
						chatWidth[chatCount] = b12.stringWidTag(var2.chatMessage) / 2;
						chatHeight[chatCount] = b12.height;
						chatX[chatCount] = projectX;
						chatY[chatCount] = projectY;
						chatColour[chatCount] = var2.chatColour;
						chatEffect[chatCount] = var2.chatEffect;
						chatTimer[chatCount] = var2.chatTimer;
						chats[chatCount++] = var2.chatMessage;

						if (chatEffects == 0 && var2.chatEffect == 1) {
							chatHeight[chatCount] += 10;
							chatY[chatCount] += 5;
						}

						if (chatEffects == 0 && var2.chatEffect == 2) {
							chatWidth[chatCount] = 60;
						}
					}
				}

				if (var2.combatCycle > loopCycle + 100) {
					getOverlayPos(var2.height + 15, var2);

					if (projectX > -1) {
						int var6 = var2.health * 30 / var2.totalHealth;
						if (var6 > 30) {
							var6 = 30;
						}

						Pix2D.fillRect(projectY - 3, projectX - 15, 0xFF00, var6, 5);
						Pix2D.fillRect(projectY - 3, projectX - 15 + var6, 0xFF0000, 30 - var6, 5);
					}
				}

				if (var2.combatCycle > loopCycle + 330) {
					getOverlayPos(var2.height / 2, var2);

					if (projectX > -1) {
						hitmarks[var2.damageType].plotSprite(projectY - 12, projectX - 12);
						p11.centreString(projectY + 4, 0, String.valueOf(var2.damageValue), projectX);
						p11.centreString(projectY + 3, 0xFFFFFF, String.valueOf(var2.damageValue), projectX - 1);
					}
				}
			}
		}

		for (int var7 = 0; var7 < chatCount; var7++) {
			int var8 = chatX[var7];
			int var9 = chatY[var7];
			int var10 = chatWidth[var7];
			int var11 = chatHeight[var7];
			boolean var12 = true;
			while (var12) {
				var12 = false;
				for (int var13 = 0; var13 < var7; var13++) {
					if (var9 + 2 > chatY[var13] - chatHeight[var13] && var9 - var11 < chatY[var13] + 2 && var8 - var10 < chatWidth[var13] + chatX[var13] && var8 + var10 > chatX[var13] - chatWidth[var13] && chatY[var13] - chatHeight[var13] < var9) {
						var9 = chatY[var13] - chatHeight[var13];
						var12 = true;
					}
				}
			}

			projectX = chatX[var7];
			projectY = chatY[var7] = var9;
			String var14 = chats[var7];
			if (chatEffects == 0) {
				int var15 = 0xFFFF00;
				if (chatColour[var7] < 6) {
					var15 = CHAT_COLOURS[chatColour[var7]];
				}

				if (chatColour[var7] == 6) {
					var15 = sceneCycle % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (chatColour[var7] == 7) {
					var15 = sceneCycle % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (chatColour[var7] == 8) {
					var15 = sceneCycle % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (chatColour[var7] == 9) {
					int var16 = 150 - chatTimer[var7];
					if (var16 < 50) {
						var15 = var16 * 1280 + 0xFF0000;
					} else if (var16 < 100) {
						var15 = 0xFFFF00 - (var16 - 50) * 0x50000;
					} else if (var16 < 150) {
						var15 = (var16 - 100) * 5 + 0xFF00;
					}
				}

				if (chatColour[var7] == 10) {
					int var17 = 150 - chatTimer[var7];
					if (var17 < 50) {
						var15 = var17 * 5 + 0xFF0000;
					} else if (var17 < 100) {
						var15 = 0xFF00FF - (var17 - 50) * 0x50000;
					} else if (var17 < 150) {
						var15 = (var17 - 100) * 0x50000 + 255 - (var17 - 100) * 5;
					}
				}

				if (chatColour[var7] == 11) {
					int var18 = 150 - chatTimer[var7];
					if (var18 < 50) {
						var15 = 0xFFFFFF - var18 * 327685;
					} else if (var18 < 100) {
						var15 = (var18 - 50) * 327685 + 0xFF00;
					} else if (var18 < 150) {
						var15 = 0xFFFFFF - (var18 - 100) * 0x50000;
					}
				}

				if (chatEffect[var7] == 0) {
					b12.centreString(projectY + 1, 0, var14, projectX);
					b12.centreString(projectY, var15, var14, projectX);
				}

				if (chatEffect[var7] == 1) {
					b12.centreStringWave(sceneCycle, projectX, projectY + 1, 0, var14);
					b12.centreStringWave(sceneCycle, projectX, projectY, var15, var14);
				}

				if (chatEffect[var7] == 2) {
					int var19 = b12.stringWidTag(var14);
					int var20 = (150 - chatTimer[var7]) * (var19 + 100) / 150;
					Pix2D.setClipping(334, 0, projectX + 50, projectX - 50);
					b12.drawString(projectX + 50 - var20, projectY + 1, 0, var14);
					b12.drawString(projectX + 50 - var20, projectY, var15, var14);
					Pix2D.resetClipping();
				}
			} else {
				b12.centreString(projectY + 1, 0, var14, projectX);
				b12.centreString(projectY, 0xFFFF00, var14, projectX);
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void closeModal() {
		out.p1enc(231);

		if (sideModalId != -1) {
			sideModalId = -1;
			redrawSidebar = true;
			resumedPauseButton = false;
			redrawIcons = true;
		}

		if (chatComId != -1) {
			chatComId = -1;
			redrawChatback = true;
			resumedPauseButton = false;
		}

		mainModalId = -1;
	}

	@ObfuscatedName("client.e(I)V")
	public final void stopMidi() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.f(I)V")
	public final void getSpecialArea() {
		int var1 = (localPlayer.x >> 7) + mapBuildBaseX;
		int var2 = (localPlayer.z >> 7) + mapBuildBaseZ;
		if (var1 >= 2944 && var1 < 3392 && var2 >= 3520 && var2 < 6400) {
			wildernessLevel = (var2 - 3520) / 8 + 1;
		} else if (var1 >= 2944 && var1 < 3392 && var2 >= 9920 && var2 < 12800) {
			wildernessLevel = (var2 - 9920) / 8 + 1;
		} else {
			wildernessLevel = 0;
		}

		worldLocationState = 0;
		if (var1 >= 3328 && var1 < 3392 && var2 >= 3200 && var2 < 3264) {
			int var3 = var1 & 0x3F;
			int var4 = var2 & 0x3F;
			if (var3 >= 4 && var3 <= 29 && var4 >= 44 && var4 <= 58) {
				worldLocationState = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 44 && var4 <= 58) {
				worldLocationState = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 25 && var4 <= 39) {
				worldLocationState = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 25 && var4 <= 39) {
				worldLocationState = 1;
			}

			if (var3 >= 4 && var3 <= 29 && var4 >= 6 && var4 <= 20) {
				worldLocationState = 1;
			}

			if (var3 >= 36 && var3 <= 61 && var4 >= 6 && var4 <= 20) {
				worldLocationState = 1;
			}
		}

		if (worldLocationState == 0 && var1 >= 3328 && var1 <= 3393 && var2 >= 3203 && var2 <= 3325) {
			worldLocationState = 2;
		}

		chatDisabled = 0;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			chatDisabled = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			chatDisabled = 1;
		}

		if (chatDisabled == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			chatDisabled = 0;
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void drawPrivateMessages() {
		if (splitPrivateChat != 0) {
			PixFont var1 = p12;
			int var2 = 0;
			if (rebootTimer != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (chatText[var3] != null) {
					int var4 = chatType[var3];
					if ((var4 == 3 || var4 == 7) && (var4 == 7 || chatPrivateMode == 0 || chatPrivateMode == 1 && isFriend(chatUsername[var3]))) {
						int var5 = 329 - var2 * 13;
						var1.drawString(4, var5, 0, "From " + chatUsername[var3] + ": " + chatText[var3]);
						var1.drawString(4, var5 - 1, 0xFFFF, "From " + chatUsername[var3] + ": " + chatText[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && chatPrivateMode < 2) {
						int var6 = 329 - var2 * 13;
						var1.drawString(4, var6, 0, chatText[var3]);
						var1.drawString(4, var6 - 1, 0xFFFF, chatText[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && chatPrivateMode < 2) {
						int var7 = 329 - var2 * 13;
						var1.drawString(4, var7, 0, "To " + chatUsername[var3] + ": " + chatText[var3]);
						var1.drawString(4, var7 - 1, 0xFFFF, "To " + chatUsername[var3] + ": " + chatText[var3]);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lkb;II)V")
	public final void getNpcPosExtended(Packet arg0, int arg1) {
		for (int var3 = 0; var3 < entityUpdateCount; var3++) {
			int var4 = entityUpdateIds[var3];
			ClientNpc var5 = npc[var4];
			int var6 = arg0.g1();
			if ((var6 & 0x2) == 2) {
				int var7 = arg0.g2();
				if (var7 == 0xFFFF) {
					var7 = -1;
				}

				if (var5.primaryAnim == var7) {
					var5.primaryAnimLoop = 0;
				}

				int var8 = arg0.g1();
				if (var7 == -1 || var5.primaryAnim == -1 || SeqType.list[var7].priority > SeqType.list[var5.primaryAnim].priority || SeqType.list[var5.primaryAnim].priority == 0) {
					var5.primaryAnim = var7;
					var5.primaryFrame = 0;
					var5.primaryAnimCycle = 0;
					var5.primaryAnimDelay = var8;
					var5.primaryAnimLoop = 0;
				}
			}

			if ((var6 & 0x4) == 4) {
				var5.faceEntity = arg0.g2();
				if (var5.faceEntity == 0xFFFF) {
					var5.faceEntity = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.chatMessage = arg0.gstr();
				var5.chatTimer = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				var5.damageValue = arg0.g1();
				var5.damageType = arg0.g1();
				var5.combatCycle = loopCycle + 400;
				var5.health = arg0.g1();
				var5.totalHealth = arg0.g1();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.type = NpcType.list(arg0.g2());
				var5.walkanim = var5.type.walkanim;
				var5.walkanim_b = var5.type.walkanim_b;
				var5.walkanim_l = var5.type.walkanim_r;
				var5.walkanim_r = var5.type.walkanim_l;
				var5.readyanim = var5.type.readyanim;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.spotanimId = arg0.g2();
				int var9 = arg0.g4();
				var5.spotanimHeight = var9 >> 16;
				var5.spotanimLastCycle = (var9 & 0xFFFF) + loopCycle;
				var5.spotanimFrame = 0;
				var5.spotanimCycle = 0;

				if (var5.spotanimLastCycle > loopCycle) {
					var5.spotanimFrame = -1;
				}

				if (var5.spotanimId == 0xFFFF) {
					var5.spotanimId = -1;
				}
			}

			if ((var6 & 0x80) == 0x80) {
				var5.faceSquareX = arg0.g2();
				var5.faceSquareZ = arg0.g2();
			}
		}
	}

	@ObfuscatedName("client.a(JB)V")
	public final void addIgnore(long arg0) {
		if (arg0 != 0L) {
			if (ignoreCount >= 100) {
				addChat(0, "Your ignore list is full. Max of 100 hit", "");
			} else {
				String var3 = JString.toScreenName(JString.toRawUsername(arg0));
				for (int var4 = 0; var4 < ignoreCount; var4++) {
					if (ignoreUserhash[var4] == arg0) {
						addChat(0, var3 + " is already on your ignore list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < friendCount; var5++) {
					if (friendUserhash[var5] == arg0) {
						addChat(0, "Please remove " + var3 + " from your friend list first", "");
						return;
					}
				}

				ignoreUserhash[ignoreCount++] = arg0;
				redrawSidebar = true;
				out.p1enc(79);
				out.p8(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(BLkb;I)V")
	public final void zonePacket(Packet arg0, int arg1) {
		if (arg1 == 59 || arg1 == 76) {
			int var3 = arg0.g1();
			int var4 = (var3 >> 4 & 0x7) + zoneUpdateX;
			int var5 = (var3 & 0x7) + zoneUpdateZ;
			int var6 = arg0.g1();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = LOC_SHAPE_TO_LAYER[var7];
			int var10;
			if (arg1 == 76) {
				var10 = -1;
			} else {
				var10 = arg0.g2();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				LocChange var11 = null;
				for (LocChange var12 = (LocChange) locChanges.head(); var12 != null; var12 = (LocChange) locChanges.next()) {
					if (minusedlevel == var12.level && var12.x == var4 && var12.z == var5 && var12.layer == var9) {
						var11 = var12;
						break;
					}
				}

				if (var11 == null) {
					int var13 = 0;
					int var14 = -1;
					int var15 = 0;
					int var16 = 0;

					if (var9 == 0) {
						var13 = world.wallType(minusedlevel, var4, var5);
					}

					if (var9 == 1) {
						var13 = world.decorType(minusedlevel, var5, var4);
					}

					if (var9 == 2) {
						var13 = world.sceneType(minusedlevel, var4, var5);
					}

					if (var9 == 3) {
						var13 = world.gdType(minusedlevel, var4, var5);
					}

					if (var13 != 0) {
						int var17 = world.typeCode2(minusedlevel, var4, var5, var13);
						var14 = var13 >> 14 & 0x7FFF;
						var15 = var17 & 0x1F;
						var16 = var17 >> 6;
					}

					var11 = new LocChange();
					var11.level = minusedlevel;
					var11.layer = var9;
					var11.x = var4;
					var11.z = var5;
					var11.oldType = var14;
					var11.oldShape = var15;
					var11.oldAngle = var16;
					locChanges.push(var11);
				}

				var11.newType = var10;
				var11.newShape = var7;
				var11.newAngle = var8;
				locChangeUnchecked(var8, var4, var5, var9, var10, var7, minusedlevel);
			}
		} else if (arg1 == 42) {
			int var18 = arg0.g1();
			int var19 = (var18 >> 4 & 0x7) + zoneUpdateX;
			int var20 = (var18 & 0x7) + zoneUpdateZ;
			int var21 = arg0.g1();
			int var22 = var21 >> 2;
			int var23 = LOC_SHAPE_TO_LAYER[var22];
			int var24 = arg0.g2();
			if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
				int var25 = 0;
				if (var23 == 0) {
					var25 = world.wallType(minusedlevel, var19, var20);
				}

				if (var23 == 1) {
					var25 = world.decorType(minusedlevel, var20, var19);
				}

				if (var23 == 2) {
					var25 = world.sceneType(minusedlevel, var19, var20);
				}

				if (var23 == 3) {
					var25 = world.gdType(minusedlevel, var19, var20);
				}

				if (var25 != 0) {
					ClientLocAnim var26 = new ClientLocAnim(false, var25 >> 14 & 0x7FFF, minusedlevel, var23, SeqType.list[var24], var20, var19);
					locAnims.push(var26);
				}
			}
		} else if (arg1 == 223) {
			int var27 = arg0.g1();
			int var28 = (var27 >> 4 & 0x7) + zoneUpdateX;
			int var29 = (var27 & 0x7) + zoneUpdateZ;
			int var30 = arg0.g2();
			int var31 = arg0.g2();
			if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
				ClientObj var32 = new ClientObj();
				var32.id = var30;
				var32.count = var31;

				if (groundObj[minusedlevel][var28][var29] == null) {
					groundObj[minusedlevel][var28][var29] = new LinkList();
				}

				groundObj[minusedlevel][var28][var29].push(var32);
				showObject(var28, var29);
			}
		} else if (arg1 == 49) {
			int var33 = arg0.g1();
			int var34 = (var33 >> 4 & 0x7) + zoneUpdateX;
			int var35 = (var33 & 0x7) + zoneUpdateZ;
			int var36 = arg0.g2();
			if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
				LinkList var37 = groundObj[minusedlevel][var34][var35];
				if (var37 != null) {
					for (ClientObj var38 = (ClientObj) var37.head(); var38 != null; var38 = (ClientObj) var37.next()) {
						if ((var36 & 0x7FFF) == var38.id) {
							var38.unlink();
							break;
						}
					}

					if (var37.head() == null) {
						groundObj[minusedlevel][var34][var35] = null;
					}

					showObject(var34, var35);
				}
			}
		} else if (arg1 == 69) {
			int var39 = arg0.g1();
			int var40 = (var39 >> 4 & 0x7) + zoneUpdateX;
			int var41 = (var39 & 0x7) + zoneUpdateZ;
			int var42 = var40 + arg0.g1b();
			int var43 = var41 + arg0.g1b();
			int var44 = arg0.g2b();
			int var45 = arg0.g2();
			int var46 = arg0.g1();
			int var47 = arg0.g1();
			int var48 = arg0.g2();
			int var49 = arg0.g2();
			int var50 = arg0.g1();
			int var51 = arg0.g1();
			if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104 && var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
				var40 = var40 * 128 + 64;
				var41 = var41 * 128 + 64;
				var42 = var42 * 128 + 64;
				var43 = var43 * 128 + 64;
				ClientProj var52 = new ClientProj(var47, var50, var41, loopCycle + var49, minusedlevel, var44, loopCycle + var48, var51, getAvH(minusedlevel, var40, var41) - var46, var45, var40);
				var52.setTarget(getAvH(minusedlevel, var42, var43) - var47, var43, var42, loopCycle + var48);
				projectiles.push(var52);
			}
		} else if (arg1 == 191) {
			int var53 = arg0.g1();
			int var54 = (var53 >> 4 & 0x7) + zoneUpdateX;
			int var55 = (var53 & 0x7) + zoneUpdateZ;
			int var56 = arg0.g2();
			int var57 = arg0.g1();
			int var58 = arg0.g2();
			if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
				var54 = var54 * 128 + 64;
				var55 = var55 * 128 + 64;
				MapSpotAnim var59 = new MapSpotAnim(var54, var56, var55, var58, getAvH(minusedlevel, var54, var55) - var57, minusedlevel, loopCycle);
				spotanims.push(var59);
			}
		} else if (arg1 == 50) {
			int var60 = arg0.g1();
			int var61 = (var60 >> 4 & 0x7) + zoneUpdateX;
			int var62 = (var60 & 0x7) + zoneUpdateZ;
			int var63 = arg0.g2();
			int var64 = arg0.g2();
			int var65 = arg0.g2();
			if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && selfSlot != var65) {
				ClientObj var66 = new ClientObj();
				var66.id = var63;
				var66.count = var64;

				if (groundObj[minusedlevel][var61][var62] == null) {
					groundObj[minusedlevel][var61][var62] = new LinkList();
				}

				groundObj[minusedlevel][var61][var62].push(var66);
				showObject(var61, var62);
			}
		} else if (arg1 == 23) {
			int var67 = arg0.g1();
			int var68 = (var67 >> 4 & 0x7) + zoneUpdateX;
			int var69 = (var67 & 0x7) + zoneUpdateZ;
			int var70 = arg0.g1();
			int var71 = var70 >> 2;
			int var72 = var70 & 0x3;
			int var73 = LOC_SHAPE_TO_LAYER[var71];
			int var74 = arg0.g2();
			int var75 = arg0.g2();
			int var76 = arg0.g2();
			int var77 = arg0.g2();
			byte var78 = arg0.g1b();
			byte var79 = arg0.g1b();
			byte var80 = arg0.g1b();
			byte var81 = arg0.g1b();
			ClientPlayer var82;
			if (selfSlot == var77) {
				var82 = localPlayer;
			} else {
				var82 = players[var77];
			}

			if (var82 != null) {
				ClientLocMerge var83 = new ClientLocMerge(minusedlevel, var72, var69, loopCycle + var75, var71, -1, var68, var73);
				locMerges.push(var83);
				ClientLocMerge var84 = new ClientLocMerge(minusedlevel, var72, var69, loopCycle + var76, var71, var74, var68, var73);
				locMerges.push(var84);
				int var85 = groundh[minusedlevel][var68][var69];
				int var86 = groundh[minusedlevel][var68 + 1][var69];
				int var87 = groundh[minusedlevel][var68 + 1][var69 + 1];
				int var88 = groundh[minusedlevel][var68][var69 + 1];
				LocType var89 = LocType.list(var74);
				var82.locStartCycle = loopCycle + var75;
				var82.locStopCycle = loopCycle + var76;
				var82.locModel = var89.buildModel(var71, var72, var85, var86, var87, var88, -1);
				int var90 = var89.width;
				int var91 = var89.length;
				if (var72 == 1 || var72 == 3) {
					var90 = var89.length;
					var91 = var89.width;
				}

				var82.locOffsetX = var68 * 128 + var90 * 64;
				var82.locOffsetZ = var69 * 128 + var91 * 64;
				var82.locOffsetY = getAvH(minusedlevel, var82.locOffsetX, var82.locOffsetZ);

				if (var78 > var80) {
					byte var92 = var78;
					var78 = var80;
					var80 = var92;
				}

				if (var79 > var81) {
					byte var93 = var79;
					var79 = var81;
					var81 = var93;
				}

				var82.minTileX = var68 + var78;
				var82.maxTileX = var68 + var80;
				var82.minTileZ = var69 + var79;
				var82.maxTileZ = var69 + var81;
			}
		} else if (arg1 == 151) {
			int var94 = arg0.g1();
			int var95 = (var94 >> 4 & 0x7) + zoneUpdateX;
			int var96 = (var94 & 0x7) + zoneUpdateZ;
			int var97 = arg0.g2();
			int var98 = arg0.g2();
			int var99 = arg0.g2();
			if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
				LinkList var100 = groundObj[minusedlevel][var95][var96];
				if (var100 != null) {
					for (ClientObj var101 = (ClientObj) var100.head(); var101 != null; var101 = (ClientObj) var100.next()) {
						if ((var97 & 0x7FFF) == var101.id && var101.count == var98) {
							var101.count = var99;
							break;
						}
					}

					showObject(var95, var96);
				}
			}
		}
	}

	@ObfuscatedName("client.d(B)I")
	public final int roofCheck() {
		int var1 = 3;
		if (camPitch < 310) {
			int var2 = camX >> 7;
			int var3 = camZ >> 7;
			int var4 = localPlayer.x >> 7;
			int var5 = localPlayer.z >> 7;

			if ((mapl[minusedlevel][var2][var3] & 0x4) != 0) {
				var1 = minusedlevel;
			}

			int var6;
			if (var4 > var2) {
				var6 = var4 - var2;
			} else {
				var6 = var2 - var4;
			}

			int var7;
			if (var5 > var3) {
				var7 = var5 - var3;
			} else {
				var7 = var3 - var5;
			}

			if (var6 > var7) {
				int var8 = var7 * 0x10000 / var6;
				int var9 = 32768;
				while (var2 != var4) {
					if (var2 < var4) {
						var2++;
					} else if (var2 > var4) {
						var2--;
					}

					if ((mapl[minusedlevel][var2][var3] & 0x4) != 0) {
						var1 = minusedlevel;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((mapl[minusedlevel][var2][var3] & 0x4) != 0) {
							var1 = minusedlevel;
						}
					}
				}
			} else {
				int var10 = var6 * 0x10000 / var7;
				int var11 = 32768;
				while (var3 != var5) {
					if (var3 < var5) {
						var3++;
					} else if (var3 > var5) {
						var3--;
					}

					if ((mapl[minusedlevel][var2][var3] & 0x4) != 0) {
						var1 = minusedlevel;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((mapl[minusedlevel][var2][var3] & 0x4) != 0) {
							var1 = minusedlevel;
						}
					}
				}
			}
		}

		if ((mapl[minusedlevel][localPlayer.x >> 7][localPlayer.z >> 7] & 0x4) != 0) {
			var1 = minusedlevel;
		}

		return var1;
	}

	@ObfuscatedName("client.h(I)I")
	public final int roofCheck2() {
		int var1 = getAvH(minusedlevel, camX, camZ);
		if (var1 - camY < 800 && (mapl[minusedlevel][camX >> 7][camZ >> 7] & 0x4) != 0) {
			return minusedlevel;
		}

		return 3;
	}

	@ObfuscatedName("client.i(I)V")
	public final void gameDrawMain() {
		sceneCycle++;
		addPlayers();
		addNpcs();
		addProjectiles();
		addMapAnim();
		addLocAnim();

		if (!cinemaCam) {
			int var1 = orbitCameraPitch;
			if (cameraPitchClamp / 256 > var1) {
				var1 = cameraPitchClamp / 256;
			}

			if (camShake[4] && camShakeRan[4] + 128 > var1) {
				var1 = camShakeRan[4] + 128;
			}

			int var2 = macroCameraAngle + orbitCameraYaw & 0x7FF;
			camFollow(getAvH(minusedlevel, localPlayer.x, localPlayer.z) - 50, orbitCameraX, var2, var1, orbitCameraZ, var1 * 3 + 600);
			cyclelogic2++;
			if (cyclelogic2 > 1802) {
				cyclelogic2 = 0;
				out.p1enc(146);
				out.p1(0);
				int var3 = out.pos;
				out.p2(29711);
				out.p1(70);
				out.p1((int) (Math.random() * 256.0D));
				out.p1(242);
				out.p1(186);
				out.p1(39);
				out.p1(61);

				if ((int) (Math.random() * 2.0D) == 0) {
					out.p1(13);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					out.p2(57856);
				}

				out.p2((int) (Math.random() * 65536.0D));
				out.psize1(out.pos - var3);
			}
		}

		int var4;
		if (cinemaCam) {
			var4 = roofCheck2();
		} else {
			var4 = roofCheck();
		}

		int var5 = camX;
		int var6 = camY;
		int var7 = camZ;
		int var8 = camPitch;
		int var9 = camYaw;

		for (int var10 = 0; var10 < 5; var10++) {
			if (camShake[var10]) {
				int var11 = (int) (Math.random() * (camShakeAxis[var10] * 2 + 1) + Math.sin(camShakeAmp[var10] / 100.0D * camShakeCycle[var10]) * camShakeRan[var10] - camShakeAxis[var10]);
				if (var10 == 0) {
					camX += var11;
				}

				if (var10 == 1) {
					camY += var11;
				}

				if (var10 == 2) {
					camZ += var11;
				}

				if (var10 == 3) {
					camYaw = camYaw + var11 & 0x7FF;
				}

				if (var10 == 4) {
					camPitch += var11;
					if (camPitch < 128) {
						camPitch = 128;
					}

					if (camPitch > 383) {
						camPitch = 383;
					}
				}
			}
		}

		int var12 = Pix3D.cycle;
		Model.mouseCheck = true;
		Model.pickedCount = 0;
		Model.mouseX = mouseX - 8;
		Model.mouseY = mouseY - 11;
		Pix2D.cls();
		world.renderAll(camYaw, camX, var4, camPitch, camY, camZ);
		world.removeSprites();
		entityOverlays();
		coordArrow();
		textureRunAnims(var12);
		otherOverlays();
		areaGame.draw(11, graphics, 8);
		camX = var5;
		camY = var6;
		camZ = var7;
		camPitch = var8;
		camYaw = var9;
	}

	@ObfuscatedName("client.c(Z)V")
	public final void runMidi() {
		startMidiThread = false;

		while (midiThreadActive) {
			try {
				Thread.sleep(50L);
			} catch (Exception var15) {
			}

			String var2;
			int var3;
			int var4;
			synchronized (midiSync) {
				var2 = midiSyncName;
				var3 = midiSyncCrc;
				var4 = midiSyncLen;
				midiSyncName = null;
				midiSyncCrc = 0;
				midiSyncLen = 0;
			}

			if (var2 != null) {
				byte[] var5 = signlink.cacheload(var2 + ".mid");
				if (var5 != null && var3 != 12345678) {
					crc32.reset();
					crc32.update(var5);
					int var6 = (int) crc32.getValue();
					if (var3 != var6) {
						var5 = null;
					}
				}

				if (var5 == null) {
					try {
						DataInputStream var7 = openUrl(var2 + "_" + var3 + ".mid");
						var5 = new byte[var4];
						int var9;
						for (int var8 = 0; var8 < var4; var8 += var9) {
							var9 = var7.read(var5, var8, var4 - var8);
							if (var9 == -1) {
								byte[] var10 = new byte[var8];
								for (int var11 = 0; var11 < var8; var11++) {
									var10[var11] = var5[var11];
								}

								var5 = var10;
								var4 = var8;
								break;
							}
						}

						var7.close();
						signlink.cachesave(var2 + ".mid", var5);
					} catch (Exception var16) {
					}
				}

				if (var5 == null) {
					return;
				}

				int var12 = (new Packet(var5)).g4();
				byte[] var13 = new byte[var12];
				BZip2.decompress(var13, var12, var5, var4, 4);
				saveMidi(var13, var12, true);
			}
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public static final void setLowMem() {
		World.lowMem = true;
		Pix3D.lowMem = true;
		lowMem = true;
		ClientBuild.lowMem = true;
	}

	@ObfuscatedName("client.e(Z)V")
	public final void drawFlames() {
		short var1 = 256;

		if (flameGradientCycle0 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (flameGradientCycle0 > 768) {
					flameGradient[var2] = titleFlamesMerge(flameGradient0[var2], 1024 - flameGradientCycle0, flameGradient1[var2]);
				} else if (flameGradientCycle0 > 256) {
					flameGradient[var2] = flameGradient1[var2];
				} else {
					flameGradient[var2] = titleFlamesMerge(flameGradient1[var2], 256 - flameGradientCycle0, flameGradient0[var2]);
				}
			}
		} else if (flameGradientCycle1 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (flameGradientCycle1 > 768) {
					flameGradient[var3] = titleFlamesMerge(flameGradient0[var3], 1024 - flameGradientCycle1, flameGradient2[var3]);
				} else if (flameGradientCycle1 > 256) {
					flameGradient[var3] = flameGradient2[var3];
				} else {
					flameGradient[var3] = titleFlamesMerge(flameGradient2[var3], 256 - flameGradientCycle1, flameGradient0[var3]);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				flameGradient[var4] = flameGradient0[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			imageTitle0.data[var5] = flameLeft.data[var5];
		}

		int var6 = 0;
		int var7 = 1152;
		for (int var8 = 1; var8 < var1 - 1; var8++) {
			int var9 = (var1 - var8) * flameLineOffset[var8] / var1;
			int var10 = var9 + 22;
			if (var10 < 0) {
				var10 = 0;
			}

			var6 += var10;
			for (int var11 = var10; var11 < 128; var11++) {
				int var12 = flameBuffer3[var6++];
				if (var12 == 0) {
					var7++;
				} else {
					int var13 = var12;
					int var14 = 256 - var12;
					var12 = flameGradient[var12];
					int var15 = imageTitle0.data[var7];
					imageTitle0.data[var7++] = ((var12 & 0xFF00FF) * var13 + (var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var12 & 0xFF00) * var13 + (var15 & 0xFF00) * var14 & 0xFF0000) >> 8;
				}
			}

			var7 += var10;
		}

		imageTitle0.draw(0, graphics, 0);

		for (int var16 = 0; var16 < 33920; var16++) {
			imageTitle1.data[var16] = flameRight.data[var16];
		}

		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < var1 - 1; var19++) {
			int var20 = (var1 - var19) * flameLineOffset[var19] / var1;
			int var21 = 103 - var20;
			var18 += var20;
			for (int var22 = 0; var22 < var21; var22++) {
				int var23 = flameBuffer3[var17++];
				if (var23 == 0) {
					var18++;
				} else {
					int var24 = var23;
					int var25 = 256 - var23;
					var23 = flameGradient[var23];
					int var26 = imageTitle1.data[var18];
					imageTitle1.data[var18++] = ((var23 & 0xFF00FF) * var24 + (var26 & 0xFF00FF) * var25 & 0xFF00FF00) + ((var23 & 0xFF00) * var24 + (var26 & 0xFF00) * var25 & 0xFF0000) >> 8;
				}
			}

			var17 += 128 - var21;
			var18 += 128 - var21 - var20;
		}

		imageTitle1.draw(0, graphics, 661);
	}

	@ObfuscatedName("client.a(IIILhc;III)V")
	public final void addComponentOptions(int arg0, int arg1, int arg2, IfType arg3, int arg4, int arg5) {
		if (arg3.type == 0 && arg3.children != null && !arg3.hide && (arg1 >= arg4 && arg0 >= arg2 && arg1 <= arg3.width + arg4 && arg0 <= arg3.height + arg2)) {
			int var7 = arg3.children.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg3.childX[var8] + arg4;
				int var10 = arg3.childY[var8] + arg2 - arg5;
				IfType var11 = IfType.list[arg3.children[var8]];
				var9 += var11.x;
				var10 += var11.y;
				if ((var11.overLayerId >= 0 || var11.colourOver != 0) && arg1 >= var9 && arg0 >= var10 && arg1 < var11.width + var9 && arg0 < var11.height + var10) {
					if (var11.overLayerId >= 0) {
						lastOverComId = var11.overLayerId;
					} else {
						lastOverComId = var11.id;
					}
				}

				if (var11.type == 0) {
					addComponentOptions(arg0, arg1, var10, var11, var9, var11.scrollPos);

					if (var11.scrollHeight > var11.height) {
						doScrollbar(arg1, arg0, var11.scrollHeight, var11.height, true, var11.width + var9, var10, var11);
					}
				} else {
					if (var11.buttonType == 1 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.width + var9 && arg0 < var11.height + var10) {
						boolean var12 = false;
						if (var11.clientCode != 0) {
							var12 = addSocialOptions(var11);
						}

						if (!var12) {
							menuOption[menuNumEntries] = var11.buttonText;
							menuAction[menuNumEntries] = 951;
							menuParamC[menuNumEntries] = var11.id;
							menuNumEntries++;
						}
					}

					if (var11.buttonType == 2 && targetMode == 0 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.width + var9 && arg0 < var11.height + var10) {
						String var13 = var11.targetVerb;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						menuOption[menuNumEntries] = var13 + " @gre@" + var11.targetBase;
						menuAction[menuNumEntries] = 930;
						menuParamC[menuNumEntries] = var11.id;
						menuNumEntries++;
					}

					if (var11.buttonType == 3 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.width + var9 && arg0 < var11.height + var10) {
						menuOption[menuNumEntries] = "Close";
						menuAction[menuNumEntries] = 947;
						menuParamC[menuNumEntries] = var11.id;
						menuNumEntries++;
					}

					if (var11.buttonType == 4 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.width + var9 && arg0 < var11.height + var10) {
						menuOption[menuNumEntries] = var11.buttonText;
						menuAction[menuNumEntries] = 465;
						menuParamC[menuNumEntries] = var11.id;
						menuNumEntries++;
					}

					if (var11.buttonType == 5 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.width + var9 && arg0 < var11.height + var10) {
						menuOption[menuNumEntries] = var11.buttonText;
						menuAction[menuNumEntries] = 960;
						menuParamC[menuNumEntries] = var11.id;
						menuNumEntries++;
					}

					if (var11.buttonType == 6 && !resumedPauseButton && arg1 >= var9 && arg0 >= var10 && arg1 < var11.width + var9 && arg0 < var11.height + var10) {
						menuOption[menuNumEntries] = var11.buttonText;
						menuAction[menuNumEntries] = 44;
						menuParamC[menuNumEntries] = var11.id;
						menuNumEntries++;
					}

					if (var11.type == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.height; var15++) {
							for (int var16 = 0; var16 < var11.width; var16++) {
								int var17 = (var11.marginX + 32) * var16 + var9;
								int var18 = (var11.marginY + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.invBackgroundX[var14];
									var18 += var11.invBackgroundY[var14];
								}

								if (arg1 >= var17 && arg0 >= var18 && arg1 < var17 + 32 && arg0 < var18 + 32) {
									hoveredSlot = var14;
									hoveredSlotComId = var11.id;

									if (var11.linkObjType[var14] > 0) {
										ObjType var19 = ObjType.list(var11.linkObjType[var14] - 1);
										if (useMode == 1 && var11.objOps) {
											if (objSelectedComId != var11.id || objSelectedSlot != var14) {
												menuOption[menuNumEntries] = "Use " + objSelectedName + " with @lre@" + var19.name;
												menuAction[menuNumEntries] = 881;
												menuParamA[menuNumEntries] = var19.id;
												menuParamB[menuNumEntries] = var14;
												menuParamC[menuNumEntries] = var11.id;
												menuNumEntries++;
											}
										} else if (targetMode != 1 || !var11.objOps) {
											if (var11.objOps) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.iop != null && var19.iop[var20] != null) {
														menuOption[menuNumEntries] = var19.iop[var20] + " @lre@" + var19.name;

														if (var20 == 3) {
															menuAction[menuNumEntries] = 478;
														}

														if (var20 == 4) {
															menuAction[menuNumEntries] = 347;
														}

														menuParamA[menuNumEntries] = var19.id;
														menuParamB[menuNumEntries] = var14;
														menuParamC[menuNumEntries] = var11.id;
														menuNumEntries++;
													} else if (var20 == 4) {
														menuOption[menuNumEntries] = "Drop @lre@" + var19.name;
														menuAction[menuNumEntries] = 347;
														menuParamA[menuNumEntries] = var19.id;
														menuParamB[menuNumEntries] = var14;
														menuParamC[menuNumEntries] = var11.id;
														menuNumEntries++;
													}
												}
											}

											if (var11.objUse) {
												menuOption[menuNumEntries] = "Use @lre@" + var19.name;
												menuAction[menuNumEntries] = 188;
												menuParamA[menuNumEntries] = var19.id;
												menuParamB[menuNumEntries] = var14;
												menuParamC[menuNumEntries] = var11.id;
												menuNumEntries++;
											}

											if (var11.objOps && var19.iop != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.iop[var21] != null) {
														menuOption[menuNumEntries] = var19.iop[var21] + " @lre@" + var19.name;

														if (var21 == 0) {
															menuAction[menuNumEntries] = 405;
														}

														if (var21 == 1) {
															menuAction[menuNumEntries] = 38;
														}

														if (var21 == 2) {
															menuAction[menuNumEntries] = 422;
														}

														menuParamA[menuNumEntries] = var19.id;
														menuParamB[menuNumEntries] = var14;
														menuParamC[menuNumEntries] = var11.id;
														menuNumEntries++;
													}
												}
											}

											if (var11.iop != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.iop[var22] != null) {
														menuOption[menuNumEntries] = var11.iop[var22] + " @lre@" + var19.name;

														if (var22 == 0) {
															menuAction[menuNumEntries] = 602;
														}

														if (var22 == 1) {
															menuAction[menuNumEntries] = 596;
														}

														if (var22 == 2) {
															menuAction[menuNumEntries] = 22;
														}

														if (var22 == 3) {
															menuAction[menuNumEntries] = 892;
														}

														if (var22 == 4) {
															menuAction[menuNumEntries] = 415;
														}

														menuParamA[menuNumEntries] = var19.id;
														menuParamB[menuNumEntries] = var14;
														menuParamC[menuNumEntries] = var11.id;
														menuNumEntries++;
													}
												}
											}

											menuOption[menuNumEntries] = "Examine @lre@" + var19.name;
											menuAction[menuNumEntries] = 1773;
											menuParamA[menuNumEntries] = var19.id;
											menuParamC[menuNumEntries] = var11.linkObjNumber[var14];
											menuNumEntries++;
										} else if ((targetMask & 0x10) == 0x10) {
											menuOption[menuNumEntries] = targetOp + " @lre@" + var19.name;
											menuAction[menuNumEntries] = 391;
											menuParamA[menuNumEntries] = var19.id;
											menuParamB[menuNumEntries] = var14;
											menuParamC[menuNumEntries] = var11.id;
											menuNumEntries++;
										}
									}
								}

								var14++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void chatModeLoop() {
		if (mouseClickButton == 1) {
			if (mouseClickX >= 8 && mouseClickX <= 108 && mouseClickY >= 490 && mouseClickY <= 522) {
				chatPublicMode = (chatPublicMode + 1) % 4;
				redrawChatMode = true;
				redrawChatback = true;
				out.p1enc(244);
				out.p1(chatPublicMode);
				out.p1(chatPrivateMode);
				out.p1(chatTradeMode);
			}

			if (mouseClickX >= 137 && mouseClickX <= 237 && mouseClickY >= 490 && mouseClickY <= 522) {
				chatPrivateMode = (chatPrivateMode + 1) % 3;
				redrawChatMode = true;
				redrawChatback = true;
				out.p1enc(244);
				out.p1(chatPublicMode);
				out.p1(chatPrivateMode);
				out.p1(chatTradeMode);
			}

			if (mouseClickX >= 275 && mouseClickX <= 375 && mouseClickY >= 490 && mouseClickY <= 522) {
				chatTradeMode = (chatTradeMode + 1) % 3;
				redrawChatMode = true;
				redrawChatback = true;
				out.p1enc(244);
				out.p1(chatPublicMode);
				out.p1(chatPrivateMode);
				out.p1(chatTradeMode);
			}

			if (mouseClickX >= 416 && mouseClickX <= 516 && mouseClickY >= 490 && mouseClickY <= 522) {
				closeModal();
				reportAbuseInput = "";
				reportAbuseMuteOption = false;

				for (int var1 = 0; var1 < IfType.list.length; var1++) {
					if (IfType.list[var1] != null && IfType.list[var1].clientCode == 600) {
						reportAbuseComId = mainModalId = IfType.list[var1].layerId;
						return;
					}
				}

				return;
			}
		}
	}

	@ObfuscatedName("client.b(III)V")
	public final void addChatOptions(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (chatText[var4] != null) {
				int var5 = chatType[var4];
				int var6 = chatScrollPos + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				if (var5 == 0) {
					var3++;
				}

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || chatPublicMode == 0 || chatPublicMode == 1 && isFriend(chatUsername[var4]))) {
					if (arg0 > var6 - 14 && arg0 <= var6 && !chatUsername[var4].equals(localPlayer.name)) {
						if (staffmod) {
							menuOption[menuNumEntries] = "Report abuse @whi@" + chatUsername[var4];
							menuAction[menuNumEntries] = 34;
							menuNumEntries++;
						}

						menuOption[menuNumEntries] = "Add ignore @whi@" + chatUsername[var4];
						menuAction[menuNumEntries] = 436;
						menuNumEntries++;
						menuOption[menuNumEntries] = "Add friend @whi@" + chatUsername[var4];
						menuAction[menuNumEntries] = 406;
						menuNumEntries++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && splitPrivateChat == 0 && (var5 == 7 || chatPrivateMode == 0 || chatPrivateMode == 1 && isFriend(chatUsername[var4]))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						if (staffmod) {
							menuOption[menuNumEntries] = "Report abuse @whi@" + chatUsername[var4];
							menuAction[menuNumEntries] = 34;
							menuNumEntries++;
						}

						menuOption[menuNumEntries] = "Add ignore @whi@" + chatUsername[var4];
						menuAction[menuNumEntries] = 436;
						menuNumEntries++;
						menuOption[menuNumEntries] = "Add friend @whi@" + chatUsername[var4];
						menuAction[menuNumEntries] = 406;
						menuNumEntries++;
					}

					var3++;
				}

				if (var5 == 4 && (chatTradeMode == 0 || chatTradeMode == 1 && isFriend(chatUsername[var4]))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						menuOption[menuNumEntries] = "Accept trade @whi@" + chatUsername[var4];
						menuAction[menuNumEntries] = 903;
						menuNumEntries++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && splitPrivateChat == 0 && chatPrivateMode < 2) {
					var3++;
				}

				if (var5 == 8 && (chatTradeMode == 0 || chatTradeMode == 1 && isFriend(chatUsername[var4]))) {
					if (arg0 > var6 - 14 && arg0 <= var6) {
						menuOption[menuNumEntries] = "Accept duel @whi@" + chatUsername[var4];
						menuAction[menuNumEntries] = 363;
						menuNumEntries++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void addPlayers() {
		if (localPlayer.x >> 7 == minimapFlagX && localPlayer.z >> 7 == minimapFlagZ) {
			minimapFlagX = 0;
		}

		for (int var1 = -1; var1 < playerCount; var1++) {
			ClientPlayer var2;
			int var3;
			if (var1 == -1) {
				var2 = localPlayer;
				var3 = LOCAL_PLAYER_INDEX << 14;
			} else {
				var2 = players[playerIds[var1]];
				var3 = playerIds[var1] << 14;
			}

			if (var2 != null && var2.isReady()) {
				var2.lowMemory = false;
				if ((lowMem && playerCount > 50 || playerCount > 200) && var1 != -1 && var2.secondaryAnim == var2.readyanim) {
					var2.lowMemory = true;
				}

				int var4 = var2.x >> 7;
				int var5 = var2.z >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.locModel == null || loopCycle < var2.locStartCycle || loopCycle >= var2.locStopCycle) {
						if ((var2.x & 0x7F) == 0x40 && (var2.z & 0x7F) == 0x40) {
							if (tileLastOccupiedCycle[var4][var5] == sceneCycle) {
								continue;
							}

							tileLastOccupiedCycle[var4][var5] = sceneCycle;
						}

						var2.y = getAvH(minusedlevel, var2.x, var2.z);
						world.addDynamic(var2.z, 60, var2.yaw, var2.x, var3, var2.needsForwardDrawPadding, null, var2, var2.y, minusedlevel);
					} else {
						var2.lowMemory = false;
						var2.y = getAvH(minusedlevel, var2.x, var2.z);
						world.addDynamic2(var2.maxTileX, 60, null, var2.z, var2.y, var3, var2.yaw, var2.minTileZ, var2.minTileX, var2, minusedlevel, var2.maxTileZ, var2.x);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIBI)I")
	public final int getAvH(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg2 >> 7;
		int var6 = arg0;
		if (arg0 < 3 && (mapl[1][var4][var5] & 0x2) == 2) {
			var6 = arg0 + 1;
		}

		int var7 = arg1 & 0x7F;
		int var8 = arg2 & 0x7F;
		int var9 = (128 - var7) * groundh[var6][var4][var5] + groundh[var6][var4 + 1][var5] * var7 >> 7;
		int var10 = (128 - var7) * groundh[var6][var4][var5 + 1] + groundh[var6][var4 + 1][var5 + 1] * var7 >> 7;
		return (128 - var8) * var9 + var8 * var10 >> 7;
	}

	@ObfuscatedName("client.a(Lbc;IIII)V")
	public final void addNpcOptions(NpcType arg0, int arg1, int arg2, int arg3) {
		if (menuNumEntries < 400) {
			String var5 = arg0.name;
			if (arg0.vislevel != 0) {
				var5 = var5 + combatColourCode(localPlayer.combatLevel, arg0.vislevel) + " (level-" + arg0.vislevel + ")";
			}

			if (useMode == 1) {
				menuOption[menuNumEntries] = "Use " + objSelectedName + " with @yel@" + var5;
				menuAction[menuNumEntries] = 900;
				menuParamA[menuNumEntries] = arg3;
				menuParamB[menuNumEntries] = arg2;
				menuParamC[menuNumEntries] = arg1;
				menuNumEntries++;
			} else if (targetMode != 1) {
				if (arg0.op != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg0.op[var6] != null && !arg0.op[var6].equalsIgnoreCase("attack")) {
							menuOption[menuNumEntries] = arg0.op[var6] + " @yel@" + var5;

							if (var6 == 0) {
								menuAction[menuNumEntries] = 728;
							}

							if (var6 == 1) {
								menuAction[menuNumEntries] = 542;
							}

							if (var6 == 2) {
								menuAction[menuNumEntries] = 6;
							}

							if (var6 == 3) {
								menuAction[menuNumEntries] = 963;
							}

							if (var6 == 4) {
								menuAction[menuNumEntries] = 245;
							}

							menuParamA[menuNumEntries] = arg3;
							menuParamB[menuNumEntries] = arg2;
							menuParamC[menuNumEntries] = arg1;
							menuNumEntries++;
						}
					}
				}

				if (arg0.op != null) {
					for (int var7 = 4; var7 >= 0; var7--) {
						if (arg0.op[var7] != null && arg0.op[var7].equalsIgnoreCase("attack")) {
							short var8 = 0;
							if (arg0.vislevel > localPlayer.combatLevel) {
								var8 = 2000;
							}

							menuOption[menuNumEntries] = arg0.op[var7] + " @yel@" + var5;

							if (var7 == 0) {
								menuAction[menuNumEntries] = var8 + 728;
							}

							if (var7 == 1) {
								menuAction[menuNumEntries] = var8 + 542;
							}

							if (var7 == 2) {
								menuAction[menuNumEntries] = var8 + 6;
							}

							if (var7 == 3) {
								menuAction[menuNumEntries] = var8 + 963;
							}

							if (var7 == 4) {
								menuAction[menuNumEntries] = var8 + 245;
							}

							menuParamA[menuNumEntries] = arg3;
							menuParamB[menuNumEntries] = arg2;
							menuParamC[menuNumEntries] = arg1;
							menuNumEntries++;
						}
					}
				}

				menuOption[menuNumEntries] = "Examine @yel@" + var5;
				menuAction[menuNumEntries] = 1607;
				menuParamA[menuNumEntries] = arg3;
				menuParamB[menuNumEntries] = arg2;
				menuParamC[menuNumEntries] = arg1;
				menuNumEntries++;
			} else if ((targetMask & 0x2) == 2) {
				menuOption[menuNumEntries] = targetOp + " @yel@" + var5;
				menuAction[menuNumEntries] = 265;
				menuParamA[menuNumEntries] = arg3;
				menuParamB[menuNumEntries] = arg2;
				menuParamC[menuNumEntries] = arg1;
				menuNumEntries++;
				return;
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void handleInputKey() {
		while (true) {
			int var1 = pollKey();
			if (var1 == -1) {
				return;
			}

			if (mainModalId != -1 && mainModalId == reportAbuseComId) {
				if (var1 == 8 && reportAbuseInput.length() > 0) {
					reportAbuseInput = reportAbuseInput.substring(0, reportAbuseInput.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && reportAbuseInput.length() < 12) {
					reportAbuseInput = reportAbuseInput + (char) var1;
				}
			} else if (socialInputOpen) {
				if (var1 >= 32 && var1 <= 122 && socialInput.length() < 80) {
					socialInput = socialInput + (char) var1;
					redrawChatback = true;
				}

				if (var1 == 8 && socialInput.length() > 0) {
					socialInput = socialInput.substring(0, socialInput.length() - 1);
					redrawChatback = true;
				}

				if (var1 == 13 || var1 == 10) {
					socialInputOpen = false;
					redrawChatback = true;

					if (socialInputType == 1) {
						long var2 = JString.toUserhash(socialInput);
						addFriend(var2);
					}

					if (socialInputType == 2 && friendCount > 0) {
						long var4 = JString.toUserhash(socialInput);
						delFriend(var4);
					}

					if (socialInputType == 3 && socialInput.length() > 0) {
						out.p1enc(148);
						out.p1(0);
						int var6 = out.pos;
						out.p8(socialUserhash);
						WordPack.pack(out, socialInput);
						out.psize1(out.pos - var6);
						socialInput = JString.toSentenceCase(socialInput);
						socialInput = WordFilter.filter(socialInput);
						addChat(6, socialInput, JString.toScreenName(JString.toRawUsername(socialUserhash)));

						if (chatPrivateMode == 2) {
							chatPrivateMode = 1;
							redrawChatMode = true;
							out.p1enc(244);
							out.p1(chatPublicMode);
							out.p1(chatPrivateMode);
							out.p1(chatTradeMode);
						}
					}

					if (socialInputType == 4 && ignoreCount < 100) {
						long var7 = JString.toUserhash(socialInput);
						addIgnore(var7);
					}

					if (socialInputType == 5 && ignoreCount > 0) {
						long var9 = JString.toUserhash(socialInput);
						delIgnore(var9);
					}
				}
			} else if (dialogInputOpen) {
				if (var1 >= 48 && var1 <= 57 && dialogInput.length() < 10) {
					dialogInput = dialogInput + (char) var1;
					redrawChatback = true;
				}

				if (var1 == 8 && dialogInput.length() > 0) {
					dialogInput = dialogInput.substring(0, dialogInput.length() - 1);
					redrawChatback = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (dialogInput.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(dialogInput);
						} catch (Exception var15) {
						}

						out.p1enc(237);
						out.p4(var11);
					}

					dialogInputOpen = false;
					redrawChatback = true;
				}
			} else if (chatComId == -1) {
				if (var1 >= 32 && var1 <= 122 && chatInput.length() < 80) {
					chatInput = chatInput + (char) var1;
					redrawChatback = true;
				}

				if (var1 == 8 && chatInput.length() > 0) {
					chatInput = chatInput.substring(0, chatInput.length() - 1);
					redrawChatback = true;
				}

				if ((var1 == 13 || var1 == 10) && chatInput.length() > 0) {
					if (chatInput.equals("::clientdrop") && (frame != null || getHost().indexOf("192.168.1.") != -1)) {
						lostCon();
					} else if (chatInput.startsWith("::")) {
						out.p1enc(4);
						out.p1(chatInput.length() - 1);
						out.pjstr(chatInput.substring(2));
					} else {
						byte var12 = 0;
						if (chatInput.startsWith("yellow:")) {
							var12 = 0;
							chatInput = chatInput.substring(7);
						}

						if (chatInput.startsWith("red:")) {
							var12 = 1;
							chatInput = chatInput.substring(4);
						}

						if (chatInput.startsWith("green:")) {
							var12 = 2;
							chatInput = chatInput.substring(6);
						}

						if (chatInput.startsWith("cyan:")) {
							var12 = 3;
							chatInput = chatInput.substring(5);
						}

						if (chatInput.startsWith("purple:")) {
							var12 = 4;
							chatInput = chatInput.substring(7);
						}

						if (chatInput.startsWith("white:")) {
							var12 = 5;
							chatInput = chatInput.substring(6);
						}

						if (chatInput.startsWith("flash1:")) {
							var12 = 6;
							chatInput = chatInput.substring(7);
						}

						if (chatInput.startsWith("flash2:")) {
							var12 = 7;
							chatInput = chatInput.substring(7);
						}

						if (chatInput.startsWith("flash3:")) {
							var12 = 8;
							chatInput = chatInput.substring(7);
						}

						if (chatInput.startsWith("glow1:")) {
							var12 = 9;
							chatInput = chatInput.substring(6);
						}

						if (chatInput.startsWith("glow2:")) {
							var12 = 10;
							chatInput = chatInput.substring(6);
						}

						if (chatInput.startsWith("glow3:")) {
							var12 = 11;
							chatInput = chatInput.substring(6);
						}

						byte var13 = 0;
						if (chatInput.startsWith("wave:")) {
							var13 = 1;
							chatInput = chatInput.substring(5);
						}

						if (chatInput.startsWith("scroll:")) {
							var13 = 2;
							chatInput = chatInput.substring(7);
						}

						out.p1enc(158);
						out.p1(0);
						int var14 = out.pos;
						out.p1(var12);
						out.p1(var13);
						WordPack.pack(out, chatInput);
						out.psize1(out.pos - var14);
						chatInput = JString.toSentenceCase(chatInput);
						chatInput = WordFilter.filter(chatInput);
						localPlayer.chatMessage = chatInput;
						localPlayer.chatColour = var12;
						localPlayer.chatEffect = var13;
						localPlayer.chatTimer = 150;
						addChat(2, localPlayer.chatMessage, localPlayer.name);

						if (chatPublicMode == 2) {
							chatPublicMode = 3;
							redrawChatMode = true;
							out.p1enc(244);
							out.p1(chatPublicMode);
							out.p1(chatPrivateMode);
							out.p1(chatTradeMode);
						}
					}

					chatInput = "";
					redrawChatback = true;
				}
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void mainredraw() {
		if (errorStarted || errorLoading || errorHost) {
			drawError();
		} else {
			if (ingame) {
				gameDraw();
			} else {
				titleScreenDraw();
			}

			scrollCycle = 0;
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void titleScreenLoop() {
		if (loginscreen == 0) {
			int var1 = sWid / 2 - 80;
			int var2 = sHei / 2 + 20;
			var2 += 20;
			if (mouseClickButton == 1 && mouseClickX >= var1 - 75 && mouseClickX <= var1 + 75 && mouseClickY >= var2 - 20 && mouseClickY <= var2 + 20) {
				loginscreen = 3;
				loginSelect = 0;
			}

			int var3 = sWid / 2 + 80;
			if (mouseClickButton == 1 && mouseClickX >= var3 - 75 && mouseClickX <= var3 + 75 && mouseClickY >= var2 - 20 && mouseClickY <= var2 + 20) {
				loginMes1 = "";
				loginMes2 = "Enter your username & password.";
				loginscreen = 2;
				loginSelect = 0;
			}
		} else if (loginscreen == 2) {
			int var4 = sHei / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (mouseClickButton == 1 && mouseClickY >= var4 - 15 && mouseClickY < var4) {
				loginSelect = 0;
			}

			var4 += 15;
			if (mouseClickButton == 1 && mouseClickY >= var4 - 15 && mouseClickY < var4) {
				loginSelect = 1;
			}

			var4 += 15;
			int var5 = sWid / 2 - 80;
			int var6 = sHei / 2 + 50;
			var6 += 20;
			if (mouseClickButton == 1 && mouseClickX >= var5 - 75 && mouseClickX <= var5 + 75 && mouseClickY >= var6 - 20 && mouseClickY <= var6 + 20) {
				login(loginUser, loginPass, false);
			}

			int var7 = sWid / 2 + 80;
			if (mouseClickButton == 1 && mouseClickX >= var7 - 75 && mouseClickX <= var7 + 75 && mouseClickY >= var6 - 20 && mouseClickY <= var6 + 20) {
				loginscreen = 0;
				loginUser = "";
				loginPass = "";
			}

			while (true) {
				int var8 = pollKey();
				if (var8 == -1) {
					return;
				}

				boolean var9 = false;
				for (int var10 = 0; var10 < CHARSET.length(); var10++) {
					if (var8 == CHARSET.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (loginSelect == 0) {
					if (var8 == 8 && loginUser.length() > 0) {
						loginUser = loginUser.substring(0, loginUser.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						loginSelect = 1;
					}

					if (var9) {
						loginUser = loginUser + (char) var8;
					}

					if (loginUser.length() > 12) {
						loginUser = loginUser.substring(0, 12);
					}
				} else if (loginSelect == 1) {
					if (var8 == 8 && loginPass.length() > 0) {
						loginPass = loginPass.substring(0, loginPass.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						loginSelect = 0;
					}

					if (var9) {
						loginPass = loginPass + (char) var8;
					}

					if (loginPass.length() > 20) {
						loginPass = loginPass.substring(0, 20);
					}
				}
			}
		} else if (loginscreen == 3) {
			int var11 = sWid / 2;
			int var12 = sHei / 2 + 50;
			var12 += 20;
			if (mouseClickButton == 1 && mouseClickX >= var11 - 75 && mouseClickX <= var11 + 75 && mouseClickY >= var12 - 20 && mouseClickY <= var12 + 20) {
				loginscreen = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;II)Lub;")
	public final JagFile getJagFile(String arg0, int arg1, String arg2, int arg3) {
		int var5 = 5;
		byte[] var6 = signlink.cacheload(arg2);
		if (var6 != null) {
			crc32.reset();
			crc32.update(var6);
			int var7 = (int) crc32.getValue();
			if (arg1 != var7) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new JagFile(var6);
		}

		while (var6 == null) {
			drawProgress("Requesting " + arg0, arg3);

			try {
				int var9 = 0;
				DataInputStream var10 = openUrl(arg2 + arg1);
				byte[] var11 = new byte[6];
				var10.readFully(var11, 0, 6);
				Packet var12 = new Packet(var11);
				var12.pos = 3;
				int var13 = var12.g3() + 6;
				int var14 = 6;
				var6 = new byte[var13];
				for (int var15 = 0; var15 < 6; var15++) {
					var6[var15] = var11[var15];
				}

				while (var14 < var13) {
					int var16 = var13 - var14;
					if (var16 > 1000) {
						var16 = 1000;
					}

					var14 += var10.read(var6, var14, var16);
					int var17 = var14 * 100 / var13;
					if (var9 != var17) {
						drawProgress("Loading " + arg0 + " - " + var17 + "%", arg3);
					}

					var9 = var17;
				}

				var10.close();
			} catch (IOException var21) {
				var6 = null;

				for (int var18 = var5; var18 > 0; var18--) {
					drawProgress("Error loading - Will retry in " + var18 + " secs.", arg3);

					try {
						Thread.sleep(1000L);
					} catch (Exception var20) {
					}
				}

				var5 *= 2;
				if (var5 > 60) {
					var5 = 60;
				}
			}
		}

		signlink.cachesave(arg2, var6);
		return new JagFile(var6);
	}

	@ObfuscatedName("client.f(Z)V")
	public final void unloadTitle() {
		flameActive = false;
		while (flameThread) {
			flameActive = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		titlebox = null;
		titlebutton = null;
		runes = null;
		flameGradient = null;
		flameGradient0 = null;
		flameGradient1 = null;
		flameGradient2 = null;
		flameBuffer0 = null;
		flameBuffer1 = null;
		flameBuffer3 = null;
		flameBuffer2 = null;
		flameLeft = null;
		flameRight = null;
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void camFollow(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg3 & 0x7FF;
		int var8 = 2048 - arg2 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg5;
		if (var7 != 0) {
			int var12 = Model.sinTable[var7];
			int var13 = Model.cosTable[var7];
			int var14 = var10 * var13 - arg5 * var12 >> 16;
			var11 = var10 * var12 + arg5 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = Model.sinTable[var8];
			int var16 = Model.cosTable[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		camX = arg1 - var9;
		camY = arg0 - var10;
		camZ = arg4 - var11;
		camPitch = arg3;
		camYaw = arg2;
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public static final String niceNumber(int arg0) {
		String var1 = String.valueOf(arg0);
		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		if (var1.length() > 8) {
			var1 = "@gre@" + var1.substring(0, var1.length() - 8) + " million @whi@(" + var1 + ")";
		} else if (var1.length() > 4) {
			var1 = "@cya@" + var1.substring(0, var1.length() - 4) + "K @whi@(" + var1 + ")";
		}

		return " " + var1;
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void textureRunAnims(int arg0) {
		if (!lowMem) {
			if (Pix3D.texCycle[17] >= arg0) {
				Pix8 var2 = Pix3D.textures[17];
				int var3 = var2.hi * var2.wi - 1;
				int var4 = worldUpdateNum * var2.wi * 2;
				byte[] var5 = var2.data;
				byte[] var6 = textureBuffer;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.data = var6;
				textureBuffer = var5;
				Pix3D.pushTexture(17);
			}

			if (Pix3D.texCycle[24] >= arg0) {
				Pix8 var8 = Pix3D.textures[24];
				int var9 = var8.hi * var8.wi - 1;
				int var10 = worldUpdateNum * var8.wi * 2;
				byte[] var11 = var8.data;
				byte[] var12 = textureBuffer;
				for (int var13 = 0; var13 <= var9; var13++) {
					var12[var13] = var11[var13 - var10 & var9];
				}

				var8.data = var12;
				textureBuffer = var11;
				Pix3D.pushTexture(24);
				return;
			}
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void updateFlames() {
		short var1 = 256;
		for (int var2 = 10; var2 < 117; var2++) {
			int var3 = (int) (Math.random() * 100.0D);
			if (var3 < 50) {
				flameBuffer3[(var1 - 2 << 7) + var2] = 255;
			}
		}

		for (int var4 = 0; var4 < 100; var4++) {
			int var5 = (int) (Math.random() * 124.0D) + 2;
			int var6 = (int) (Math.random() * 128.0D) + 128;
			int var7 = (var6 << 7) + var5;
			flameBuffer3[var7] = 192;
		}

		for (int var8 = 1; var8 < var1 - 1; var8++) {
			for (int var9 = 1; var9 < 127; var9++) {
				int var10 = (var8 << 7) + var9;
				flameBuffer2[var10] = (flameBuffer3[var10 - 1] + flameBuffer3[var10 + 1] + flameBuffer3[var10 - 128] + flameBuffer3[var10 + 128]) / 4;
			}
		}

		coolingCycle += 128;
		if (coolingCycle > flameBuffer0.length) {
			coolingCycle -= flameBuffer0.length;
			int var11 = (int) (Math.random() * 12.0D);
			generateFlameCoolingMap(runes[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = flameBuffer2[var14 + 128] - flameBuffer0[coolingCycle + var14 & flameBuffer0.length - 1] / 5;
				if (var15 < 0) {
					var15 = 0;
				}

				flameBuffer3[var14] = var15;
			}
		}

		for (int var16 = 0; var16 < var1 - 1; var16++) {
			flameLineOffset[var16] = flameLineOffset[var16 + 1];
		}

		flameLineOffset[var1 - 1] = (int) (Math.sin(loopCycle / 14.0D) * 16.0D + Math.sin(loopCycle / 15.0D) * 14.0D + Math.sin(loopCycle / 16.0D) * 12.0D);

		if (flameGradientCycle0 > 0) {
			flameGradientCycle0 -= 4;
		}

		if (flameGradientCycle1 > 0) {
			flameGradientCycle1 -= 4;
		}

		if (flameGradientCycle0 == 0 && flameGradientCycle1 == 0) {
			int var17 = (int) (Math.random() * 2000.0D);
			if (var17 == 0) {
				flameGradientCycle0 = 1024;
			}

			if (var17 == 1) {
				flameGradientCycle1 = 1024;
				return;
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void minimapDraw() {
		areaMap.setPixels();
		int var1 = macroMinimapAngle + orbitCameraYaw & 0x7FF;
		int var2 = localPlayer.x / 32 + 48;
		int var3 = 464 - localPlayer.z / 32;
		minimap.scanlineRotatePlotSprite(var1, 146, minimapMaskLineOffsets, 151, var3, macroMinimapZoom + 256, var2, 21, 9, minimapMaskLineLengths);
		compass.scanlineRotatePlotSprite(orbitCameraYaw, 33, compassMaskLineOffsets, 33, 25, 256, 25, 0, 0, compassMaskLineLengths);

		for (int var4 = 0; var4 < activeMapFunctionCount; var4++) {
			int var5 = activeMapFunctionX[var4] * 4 + 2 - localPlayer.x / 32;
			int var6 = activeMapFunctionZ[var4] * 4 + 2 - localPlayer.z / 32;
			minimapDrawDot(var6, activeMapFunctions[var4], var5);
		}

		for (int var7 = 0; var7 < 104; var7++) {
			for (int var8 = 0; var8 < 104; var8++) {
				LinkList var9 = groundObj[minusedlevel][var7][var8];
				if (var9 != null) {
					int var10 = var7 * 4 + 2 - localPlayer.x / 32;
					int var11 = var8 * 4 + 2 - localPlayer.z / 32;
					minimapDrawDot(var11, mapdots1, var10);
				}
			}
		}

		for (int var12 = 0; var12 < npcCount; var12++) {
			ClientNpc var13 = npc[npcIds[var12]];
			if (var13 != null && var13.isReady() && var13.type.minimap) {
				int var14 = var13.x / 32 - localPlayer.x / 32;
				int var15 = var13.z / 32 - localPlayer.z / 32;
				minimapDrawDot(var15, mapdots2, var14);
			}
		}

		for (int var16 = 0; var16 < playerCount; var16++) {
			ClientPlayer var17 = players[playerIds[var16]];
			if (var17 != null && var17.isReady()) {
				int var18 = var17.x / 32 - localPlayer.x / 32;
				int var19 = var17.z / 32 - localPlayer.z / 32;
				boolean var20 = false;
				long var21 = JString.toUserhash(var17.name);
				for (int var23 = 0; var23 < friendCount; var23++) {
					if (friendUserhash[var23] == var21 && friendNodeId[var23] != 0) {
						var20 = true;
						break;
					}
				}

				if (var20) {
					minimapDrawDot(var19, mapdots4, var18);
				} else {
					minimapDrawDot(var19, mapdots3, var18);
				}
			}
		}

		if (minimapFlagX != 0) {
			int var24 = minimapFlagX * 4 + 2 - localPlayer.x / 32;
			int var25 = minimapFlagZ * 4 + 2 - localPlayer.z / 32;
			minimapDrawDot(var25, mapmarker1, var24);
		}

		Pix2D.fillRect(82, 93, 0xFFFFFF, 3, 3);
		areaGame.setPixels();
	}

	@ObfuscatedName("client.b(B)Ljava/awt/Component;")
	public final Component getBaseComponent() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (frame != null) {
			return frame;
		}

		return this;
	}

	@ObfuscatedName("client.m(I)V")
	public final void locChangeDoQueue() {
		if (sceneState == 2) {
			for (ClientLocMerge var1 = (ClientLocMerge) locMerges.head(); var1 != null; var1 = (ClientLocMerge) locMerges.next()) {
				if (loopCycle >= var1.endTime) {
					locChangeUnchecked(var1.angle, var1.x, var1.z, var1.layer, var1.id, var1.shape, var1.level);
					var1.unlink();
				}
			}

			cyclelogic5++;
			if (cyclelogic5 > 85) {
				cyclelogic5 = 0;
				out.p1enc(85);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void minimapBuildBuffer(int arg0) {
		int[] var2 = minimap.data;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((mapl[arg0][var7][var5] & 0x18) == 0) {
					world.render2DGround(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (mapl[arg0 + 1][var7][var5] & 0x8) != 0) {
					world.render2DGround(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		minimap.setPixels();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((mapl[arg0][var11][var10] & 0x18) == 0) {
					drawDetail(arg0, var8, var11, var9, var10);
				}

				if (arg0 < 3 && (mapl[arg0 + 1][var11][var10] & 0x8) != 0) {
					drawDetail(arg0 + 1, var8, var11, var9, var10);
				}
			}
		}

		areaGame.setPixels();
		activeMapFunctionCount = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = world.gdType(minusedlevel, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = LocType.list(var14).mapfunction;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = collision[minusedlevel].flags;
							for (int var21 = 0; var21 < 10; var21++) {
								int var22 = (int) (Math.random() * 4.0D);
								if (var22 == 0 && var16 > 0 && var16 > var12 - 3 && (var20[var16 - 1][var17] & 0x280108) == 0) {
									var16--;
								}

								if (var22 == 1 && var16 < var18 - 1 && var16 < var12 + 3 && (var20[var16 + 1][var17] & 0x280180) == 0) {
									var16++;
								}

								if (var22 == 2 && var17 > 0 && var17 > var13 - 3 && (var20[var16][var17 - 1] & 0x280102) == 0) {
									var17--;
								}

								if (var22 == 3 && var17 < var19 - 1 && var17 < var13 + 3 && (var20[var16][var17 + 1] & 0x280120) == 0) {
									var17++;
								}
							}
						}

						activeMapFunctions[activeMapFunctionCount] = mapfunction[var15];
						activeMapFunctionX[activeMapFunctionCount] = var16;
						activeMapFunctionZ[activeMapFunctionCount] = var17;
						activeMapFunctionCount++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void drawDetail(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = world.wallType(arg0, arg2, arg4);
		if (var6 != 0) {
			int var7 = world.typeCode2(arg0, arg2, arg4, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg1;
			if (var6 > 0) {
				var10 = arg3;
			}

			int[] var11 = minimap.data;
			int var12 = (103 - arg4) * 512 * 4 + arg2 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			LocType var14 = LocType.list(var13);
			if (var14.mapscene == -1) {
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
				Pix8 var15 = mapscene[var14.mapscene];
				if (var15 != null) {
					int var16 = (var14.width * 4 - var15.wi) / 2;
					int var17 = (var14.length * 4 - var15.hi) / 2;
					var15.plotSprite((104 - arg4 - var14.length) * 4 + var17 + 48, arg2 * 4 + 48 + var16);
				}
			}
		}

		int var18 = world.sceneType(arg0, arg2, arg4);
		if (var18 != 0) {
			int var19 = world.typeCode2(arg0, arg2, arg4, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			LocType var23 = LocType.list(var22);
			if (var23.mapscene != -1) {
				Pix8 var24 = mapscene[var23.mapscene];
				if (var24 != null) {
					int var25 = (var23.width * 4 - var24.wi) / 2;
					int var26 = (var23.length * 4 - var24.hi) / 2;
					var24.plotSprite((104 - arg4 - var23.length) * 4 + var26 + 48, arg2 * 4 + 48 + var25);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = minimap.data;
				int var29 = (103 - arg4) * 512 * 4 + arg2 * 4 + 24624;
				if (var20 == 0 || var20 == 2) {
					var28[var29 + 1536] = var27;
					var28[var29 + 1024 + 1] = var27;
					var28[var29 + 512 + 2] = var27;
					var28[var29 + 3] = var27;
				} else {
					var28[var29] = var27;
					var28[var29 + 512 + 1] = var27;
					var28[var29 + 1024 + 2] = var27;
					var28[var29 + 1536 + 3] = var27;
				}
			}
		}

		int var30 = world.gdType(arg0, arg2, arg4);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			LocType var32 = LocType.list(var31);
			if (var32.mapscene != -1) {
				Pix8 var33 = mapscene[var32.mapscene];
				if (var33 != null) {
					int var34 = (var32.width * 4 - var33.wi) / 2;
					int var35 = (var32.length * 4 - var33.hi) / 2;
					var33.plotSprite((104 - arg4 - var32.length) * 4 + var35 + 48, arg2 * 4 + 48 + var34);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lkb;IZ)V")
	public final void getNpcPos(Packet arg0, int arg1) {
		entityRemovalCount = 0;
		entityUpdateCount = 0;
		getNpcPosOldVis(arg0, arg1);
		getNpcPosNewVis(arg0, arg1);
		getNpcPosExtended(arg0, arg1);

		for (int var3 = 0; var3 < entityRemovalCount; var3++) {
			int var4 = entityRemovalIds[var3];
			if (loopCycle != npc[var4].cycle) {
				npc[var4].type = null;
				npc[var4] = null;
			}
		}

		if (arg0.pos != arg1) {
			signlink.reporterror(loginUser + " size mismatch in getnpcpos - pos:" + arg0.pos + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < npcCount; var5++) {
			if (npc[npcIds[var5]] == null) {
				signlink.reporterror(loginUser + " null entry in npc list - pos:" + var5 + " size:" + npcCount);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void startThread(Runnable arg0, int arg1) {
		if (signlink.mainapp == null) {
			super.startThread(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void loadTitleImages() {
		titlebox = new Pix8(title, "titlebox", 0);
		titlebutton = new Pix8(title, "titlebutton", 0);
		runes = new Pix8[12];
		for (int var1 = 0; var1 < 12; var1++) {
			runes[var1] = new Pix8(title, "runes", var1);
		}

		flameLeft = new Pix32(128, 265);
		flameRight = new Pix32(128, 265);

		for (int var2 = 0; var2 < 33920; var2++) {
			flameLeft.data[var2] = imageTitle0.data[var2];
		}

		for (int var3 = 0; var3 < 33920; var3++) {
			flameRight.data[var3] = imageTitle1.data[var3];
		}

		flameGradient0 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			flameGradient0[var4] = var4 * 0x40000;
		}

		for (int var5 = 0; var5 < 64; var5++) {
			flameGradient0[var5 + 64] = var5 * 1024 + 0xFF0000;
		}

		for (int var6 = 0; var6 < 64; var6++) {
			flameGradient0[var6 + 128] = var6 * 4 + 0xFFFF00;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			flameGradient0[var7 + 192] = 0xFFFFFF;
		}

		flameGradient1 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			flameGradient1[var8] = var8 * 1024;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			flameGradient1[var9 + 64] = var9 * 4 + 0xFF00;
		}

		for (int var10 = 0; var10 < 64; var10++) {
			flameGradient1[var10 + 128] = var10 * 0x40000 + 0xFFFF;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			flameGradient1[var11 + 192] = 0xFFFFFF;
		}

		flameGradient2 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			flameGradient2[var12] = var12 * 4;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			flameGradient2[var13 + 64] = var13 * 0x40000 + 255;
		}

		for (int var14 = 0; var14 < 64; var14++) {
			flameGradient2[var14 + 128] = var14 * 1024 + 0xFF00FF;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			flameGradient2[var15 + 192] = 0xFFFFFF;
		}

		flameGradient = new int[256];
		flameBuffer0 = new int[32768];
		flameBuffer1 = new int[32768];
		generateFlameCoolingMap(null);
		flameBuffer3 = new int[32768];
		flameBuffer2 = new int[32768];
		drawProgress("Connecting to fileserver", 10);

		if (!flameActive) {
			flamesThread = true;
			flameActive = true;
			startThread(this, 2);
		}
	}

	@ObfuscatedName("client.a(ILkb;I)V")
	public final void getPlayerPosOldVis(int arg0, Packet arg1) {
		int var3 = arg1.gbit(8);
		if (var3 < playerCount) {
			for (int var4 = var3; var4 < playerCount; var4++) {
				entityRemovalIds[entityRemovalCount++] = playerIds[var4];
			}
		}

		if (var3 > playerCount) {
			signlink.reporterror(loginUser + " Too many players");
			throw new RuntimeException("eek");
		}

		playerCount = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = playerIds[var5];
			ClientPlayer var7 = players[var6];
			int var8 = arg1.gbit(1);
			if (var8 == 0) {
				playerIds[playerCount++] = var6;
				var7.cycle = loopCycle;
			} else {
				int var9 = arg1.gbit(2);
				if (var9 == 0) {
					playerIds[playerCount++] = var6;
					var7.cycle = loopCycle;
					entityUpdateIds[entityUpdateCount++] = var6;
				} else if (var9 == 1) {
					playerIds[playerCount++] = var6;
					var7.cycle = loopCycle;
					int var10 = arg1.gbit(3);
					var7.moveCode(false, var10);
					int var11 = arg1.gbit(1);
					if (var11 == 1) {
						entityUpdateIds[entityUpdateCount++] = var6;
					}
				} else if (var9 == 2) {
					playerIds[playerCount++] = var6;
					var7.cycle = loopCycle;
					int var12 = arg1.gbit(3);
					var7.moveCode(true, var12);
					int var13 = arg1.gbit(3);
					var7.moveCode(true, var13);
					int var14 = arg1.gbit(1);
					if (var14 == 1) {
						entityUpdateIds[entityUpdateCount++] = var6;
					}
				} else if (var9 == 3) {
					entityRemovalIds[entityRemovalCount++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void drawScrollbar(int arg0, int arg1, int arg2, int arg3, int arg4) {
		scrollbar1.plotSprite(arg1, arg0);
		scrollbar2.plotSprite(arg1 + arg4 - 16, arg0);
		Pix2D.fillRect(arg1 + 16, arg0, SCROLLBAR_TRACK, 16, arg4 - 32);
		int var6 = (arg4 - 32) * arg4 / arg3;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg2 / (arg3 - arg4);
		Pix2D.fillRect(arg1 + var7 + 16, arg0, SCROLLBAR_GRIP_FOREGROUND, 16, var6);
		Pix2D.vline(SCROLLBAR_GRIP_HIGHLIGHT, arg1 + var7 + 16, var6, arg0);
		Pix2D.vline(SCROLLBAR_GRIP_HIGHLIGHT, arg1 + var7 + 16, var6, arg0 + 1);
		Pix2D.hline(SCROLLBAR_GRIP_HIGHLIGHT, arg1 + var7 + 16, 16, arg0);
		Pix2D.hline(SCROLLBAR_GRIP_HIGHLIGHT, arg1 + var7 + 17, 16, arg0);
		Pix2D.vline(SCROLLBAR_GRIP_LOWLIGHT, arg1 + var7 + 16, var6, arg0 + 15);
		Pix2D.vline(SCROLLBAR_GRIP_LOWLIGHT, arg1 + var7 + 17, var6 - 1, arg0 + 14);
		Pix2D.hline(SCROLLBAR_GRIP_LOWLIGHT, arg1 + var7 + var6 + 15, 16, arg0);
		Pix2D.hline(SCROLLBAR_GRIP_LOWLIGHT, arg1 + var7 + var6 + 14, 15, arg0 + 1);
	}

	@ObfuscatedName("client.g(B)V")
	public final void validateIdkDesign() {
		idkDesignRedraw = true;

		for (int var1 = 0; var1 < 7; var1++) {
			idkDesignPart[var1] = -1;
			for (int var2 = 0; var2 < IdkType.numDefinitions; var2++) {
				if (!IdkType.list[var2].disable && IdkType.list[var2].part == var1 + (idkDesignGender ? 0 : 7)) {
					idkDesignPart[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a([BIIZ)V")
	public final void saveMidi(byte[] arg0, int arg1, boolean arg2) {
		signlink.midifade = arg2 ? 1 : 0;
		signlink.midisave(arg0, arg1);
	}

	@ObfuscatedName("client.h(Z)V")
	public final void addNpcs() {
		for (int var1 = 0; var1 < npcCount; var1++) {
			ClientNpc var2 = npc[npcIds[var1]];
			int var3 = (npcIds[var1] << 14) + 0x20000000;
			if (var2 != null && var2.isReady()) {
				int var4 = var2.x >> 7;
				int var5 = var2.z >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.size == 1 && (var2.x & 0x7F) == 0x40 && (var2.z & 0x7F) == 0x40) {
						if (tileLastOccupiedCycle[var4][var5] == sceneCycle) {
							continue;
						}

						tileLastOccupiedCycle[var4][var5] = sceneCycle;
					}

					world.addDynamic(var2.z, (var2.size - 1) * 64 + 60, var2.yaw, var2.x, var3, var2.needsForwardDrawPadding, null, var2, getAvH(minusedlevel, var2.x, var2.z), minusedlevel);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIZ)V")
	public final void setMidiVolume(int arg0, boolean arg1) {
		signlink.midivol = arg0;

		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void titleScreenDraw() {
		prepareTitle();
		imageTitle4.setPixels();
		titlebox.plotSprite(0, 0);
		short var1 = 360;
		short var2 = 200;
		if (loginscreen == 0) {
			int var3 = var2 / 2 - 20;
			b12.centreStringTag(var1 / 2, 0xFFFF00, true, var3, "Welcome to RuneScape");
			var3 += 30;
			int var4 = var1 / 2 - 80;
			int var5 = var2 / 2 + 20;
			titlebutton.plotSprite(var5 - 20, var4 - 73);
			b12.centreStringTag(var4, 0xFFFFFF, true, var5 + 5, "New user");
			int var6 = var1 / 2 + 80;
			titlebutton.plotSprite(var5 - 20, var6 - 73);
			b12.centreStringTag(var6, 0xFFFFFF, true, var5 + 5, "Existing User");
		}

		if (loginscreen == 2) {
			int var7 = var2 / 2 - 40;
			if (loginMes1.length() > 0) {
				b12.centreStringTag(var1 / 2, 0xFFFF00, true, var7 - 15, loginMes1);
				b12.centreStringTag(var1 / 2, 0xFFFF00, true, var7, loginMes2);
				var7 += 30;
			} else {
				b12.centreStringTag(var1 / 2, 0xFFFF00, true, var7 - 7, loginMes2);
				var7 += 30;
			}

			b12.drawStringTag(var1 / 2 - 90, var7, "Username: " + loginUser + (loginSelect == 0 & loopCycle % 40 < 20 ? "@yel@|" : ""), true, 0xFFFFFF);
			var7 += 15;
			b12.drawStringTag(var1 / 2 - 88, var7, "Password: " + JString.getRepeatedCharacter(loginPass) + (loginSelect == 1 & loopCycle % 40 < 20 ? "@yel@|" : ""), true, 0xFFFFFF);
			var7 += 15;
			int var8 = var1 / 2 - 80;
			int var9 = var2 / 2 + 50;
			titlebutton.plotSprite(var9 - 20, var8 - 73);
			b12.centreStringTag(var8, 0xFFFFFF, true, var9 + 5, "Login");
			int var10 = var1 / 2 + 80;
			titlebutton.plotSprite(var9 - 20, var10 - 73);
			b12.centreStringTag(var10, 0xFFFFFF, true, var9 + 5, "Cancel");
		}

		if (loginscreen == 3) {
			b12.centreStringTag(var1 / 2, 0xFFFF00, true, var2 / 2 - 60, "Create a free account");
			int var11 = var2 / 2 - 35;
			b12.centreStringTag(var1 / 2, 0xFFFFFF, true, var11, "To create a new account you need to");
			var11 += 15;
			b12.centreStringTag(var1 / 2, 0xFFFFFF, true, var11, "go back to the main RuneScape webpage");
			var11 += 15;
			b12.centreStringTag(var1 / 2, 0xFFFFFF, true, var11, "and choose the red 'create account'");
			var11 += 15;
			b12.centreStringTag(var1 / 2, 0xFFFFFF, true, var11, "button at the top right of that page.");
			var11 += 15;
			int var12 = var1 / 2;
			int var13 = var2 / 2 + 50;
			titlebutton.plotSprite(var13 - 20, var12 - 73);
			b12.centreStringTag(var12, 0xFFFFFF, true, var13 + 5, "Cancel");
		}

		imageTitle4.draw(186, graphics, 214);

		if (redrawFrame) {
			redrawFrame = false;
			imageTitle2.draw(0, graphics, 128);
			imageTitle3.draw(386, graphics, 214);
			imageTitle5.draw(265, graphics, 0);
			imageTitle6.draw(265, graphics, 574);
			imageTitle7.draw(186, graphics, 128);
			imageTitle8.draw(186, graphics, 574);
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void prepareGame() {
		if (areaChat == null) {
			unloadTitle();
			drawArea = null;
			imageTitle2 = null;
			imageTitle3 = null;
			imageTitle4 = null;
			imageTitle0 = null;
			imageTitle1 = null;
			imageTitle5 = null;
			imageTitle6 = null;
			imageTitle7 = null;
			imageTitle8 = null;
			areaChat = new PixMap(getBaseComponent(), 479, 96);
			areaMap = new PixMap(getBaseComponent(), 168, 160);
			Pix2D.cls();
			mapback.plotSprite(0, 0);
			areaSide = new PixMap(getBaseComponent(), 190, 261);
			areaGame = new PixMap(getBaseComponent(), 512, 334);
			Pix2D.cls();
			areaBackbase1 = new PixMap(getBaseComponent(), 501, 61);
			areaBackbase2 = new PixMap(getBaseComponent(), 288, 40);
			areaBackhmid1 = new PixMap(getBaseComponent(), 269, 66);
			redrawFrame = true;
		}
	}

	@ObfuscatedName("client.a(IILkb;)V")
	public final void getPlayerPosNewVis(int arg0, Packet arg1) {
		while (arg1.bitpos + 10 < arg0 * 8) {
			int var3 = arg1.gbit(11);
			if (var3 == 2047) {
				break;
			}

			if (players[var3] == null) {
				players[var3] = new ClientPlayer();
				if (playerAppearanceBuffer[var3] != null) {
					players[var3].setAppearance(playerAppearanceBuffer[var3]);
				}
			}

			playerIds[playerCount++] = var3;
			ClientPlayer var4 = players[var3];
			var4.cycle = loopCycle;
			int var5 = arg1.gbit(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.gbit(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.gbit(1);
			var4.teleport(var7 == 1, localPlayer.routeX[0] + var5, localPlayer.routeZ[0] + var6);
			int var8 = arg1.gbit(1);
			if (var8 == 1) {
				entityUpdateIds[entityUpdateCount++] = var3;
			}
		}

		arg1.gbitend();
	}

	@ObfuscatedName("client.q(I)V")
	public final void logout() {
		try {
			if (stream != null) {
				stream.close();
			}
		} catch (Exception var2) {
		}

		stream = null;
		ingame = false;
		loginscreen = 0;
		loginUser = "";
		loginPass = "";
		InputTracking.deactivate();
		clearCaches();
		world.resetMap();

		for (int var1 = 0; var1 < 4; var1++) {
			collision[var1].reset();
		}

		System.gc();
		stopMidi();
		currentMidi = null;
		nextMusicDelay = 0;
	}

	@ObfuscatedName("client.a(IIILhc;I)V")
	public final void drawInterface(int arg0, int arg1, IfType arg2, int arg3) {
		if (arg2.type == 0 && arg2.children != null && (!arg2.hide || overMainComId == arg2.id || overSideComId == arg2.id || overChatComId == arg2.id)) {
			int var5 = Pix2D.clipMinX;
			int var6 = Pix2D.clipMinY;
			int var7 = Pix2D.clipMaxX;
			int var8 = Pix2D.clipMaxY;
			Pix2D.setClipping(arg2.height + arg0, arg0, arg2.width + arg1, arg1);
			int var9 = arg2.children.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.childX[var10] + arg1;
				int var12 = arg2.childY[var10] + arg0 - arg3;
				IfType var13 = IfType.list[arg2.children[var10]];
				var11 += var13.x;
				var12 += var13.y;

				if (var13.clientCode > 0) {
					clientComponent(var13);
				}

				if (var13.type == 0) {
					if (var13.scrollPos > var13.scrollHeight - var13.height) {
						var13.scrollPos = var13.scrollHeight - var13.height;
					}

					if (var13.scrollPos < 0) {
						var13.scrollPos = 0;
					}

					drawInterface(var12, var11, var13, var13.scrollPos);

					if (var13.scrollHeight > var13.height) {
						drawScrollbar(var13.width + var11, var12, var13.scrollPos, var13.scrollHeight, var13.height);
					}
				} else if (var13.type != 1) {
					if (var13.type == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.height; var15++) {
							for (int var16 = 0; var16 < var13.width; var16++) {
								int var17 = (var13.marginX + 32) * var16 + var11;
								int var18 = (var13.marginY + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.invBackgroundX[var14];
									var18 += var13.invBackgroundY[var14];
								}

								if (var13.linkObjType[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.linkObjType[var14] - 1;
									if (var17 >= -32 && var17 <= 512 && var18 >= -32 && var18 <= 334 || objDragArea != 0 && objDragSlot == var14) {
										Pix32 var22 = ObjType.getSprite(var21, var13.linkObjNumber[var14]);
										if (objDragArea != 0 && objDragSlot == var14 && objDragComId == var13.id) {
											var19 = mouseX - objGrabX;
											var20 = mouseY - objGrabY;

											if (var19 < 5 && var19 > -5) {
												var19 = 0;
											}

											if (var20 < 5 && var20 > -5) {
												var20 = 0;
											}

											if (objDragCycle < 5) {
												var19 = 0;
												var20 = 0;
											}

											var22.transPlotSprite(128, var17 + var19, var18 + var20);
										} else if (selectedArea != 0 && selectedItem == var14 && selectedComId == var13.id) {
											var22.transPlotSprite(128, var17, var18);
										} else {
											var22.plotSprite(var18, var17);
										}

										if (var22.owi == 33 || var13.linkObjNumber[var14] != 1) {
											int var23 = var13.linkObjNumber[var14];
											p11.drawString(var17 + var19 + 1, var18 + 10 + var20, 0, invNumber(var23));
											p11.drawString(var17 + var19, var18 + 9 + var20, 0xFFFF00, invNumber(var23));
										}
									}
								} else if (var13.invBackground != null && var14 < 20) {
									Pix32 var24 = var13.invBackground[var14];
									if (var24 != null) {
										var24.plotSprite(var18, var17);
									}
								}

								var14++;
							}
						}
					} else if (var13.type == 3) {
						if (var13.fill) {
							Pix2D.fillRect(var12, var11, var13.colour, var13.width, var13.height);
						} else {
							Pix2D.drawRect(var11, var13.colour, var13.height, var12, var13.width);
						}
					} else if (var13.type == 4) {
						PixFont var25 = var13.font;
						int var26 = var13.colour;
						String var27 = var13.text;

						if ((overChatComId == var13.id || overSideComId == var13.id || overMainComId == var13.id) && var13.colourOver != 0) {
							var26 = var13.colourOver;
						}

						if (getIfActive(var13)) {
							var26 = var13.colour2;

							if (var13.text2.length() > 0) {
								var27 = var13.text2;
							}
						}

						if (var13.buttonType == 6 && resumedPauseButton) {
							var27 = "Please wait...";
							var26 = var13.colour;
						}

						int var28 = var25.height + var12;
						while (var27.length() > 0) {
							if (var27.indexOf("%") != -1) {
								while (true) {
									int var29 = var27.indexOf("%1");
									if (var29 == -1) {
										break;
									}

									var27 = var27.substring(0, var29) + inf(getIfVar(var13, 0)) + var27.substring(var29 + 2);
								}

								while (true) {
									int var30 = var27.indexOf("%2");
									if (var30 == -1) {
										break;
									}

									var27 = var27.substring(0, var30) + inf(getIfVar(var13, 1)) + var27.substring(var30 + 2);
								}

								while (true) {
									int var31 = var27.indexOf("%3");
									if (var31 == -1) {
										break;
									}

									var27 = var27.substring(0, var31) + inf(getIfVar(var13, 2)) + var27.substring(var31 + 2);
								}

								while (true) {
									int var32 = var27.indexOf("%4");
									if (var32 == -1) {
										break;
									}

									var27 = var27.substring(0, var32) + inf(getIfVar(var13, 3)) + var27.substring(var32 + 2);
								}

								while (true) {
									int var33 = var27.indexOf("%5");
									if (var33 == -1) {
										break;
									}

									var27 = var27.substring(0, var33) + inf(getIfVar(var13, 4)) + var27.substring(var33 + 2);
								}
							}

							int var34 = var27.indexOf("\\n");
							String var35;
							if (var34 == -1) {
								var35 = var27;
								var27 = "";
							} else {
								var35 = var27.substring(0, var34);
								var27 = var27.substring(var34 + 2);
							}

							if (var13.centre) {
								var25.centreStringTag(var13.width / 2 + var11, var26, var13.shadow, var28, var35);
							} else {
								var25.drawStringTag(var11, var28, var35, var13.shadow, var26);
							}

							var28 += var25.height;
						}
					} else if (var13.type == 5) {
						Pix32 var36;
						if (getIfActive(var13)) {
							var36 = var13.graphic2;
						} else {
							var36 = var13.graphic;
						}

						if (var36 != null) {
							var36.plotSprite(var12, var11);
						}
					} else if (var13.type == 6) {
						int var37 = Pix3D.originX;
						int var38 = Pix3D.originY;
						Pix3D.originX = var13.width / 2 + var11;
						Pix3D.originY = var13.height / 2 + var12;
						int var39 = Pix3D.sinTable[var13.modelXAn] * var13.modelZoom >> 16;
						int var40 = Pix3D.cosTable[var13.modelXAn] * var13.modelZoom >> 16;
						boolean var41 = getIfActive(var13);
						int var42;
						if (var41) {
							var42 = var13.modelAnim2;
						} else {
							var42 = var13.modelAnim;
						}

						Model var43;
						if (var42 == -1) {
							var43 = var13.getTempModel(-1, -1, var41);
						} else {
							SeqType var44 = SeqType.list[var42];
							var43 = var13.getTempModel(var44.frames[var13.animFrame], var44.iframes[var13.animFrame], var41);
						}

						if (var43 != null) {
							var43.objRender(0, var13.modelYAn, 0, var13.modelXAn, 0, var39, var40);
						}

						Pix3D.originX = var37;
						Pix3D.originY = var38;
					} else if (var13.type == 7) {
						PixFont var45 = var13.font;
						int var46 = 0;
						for (int var47 = 0; var47 < var13.height; var47++) {
							for (int var48 = 0; var48 < var13.width; var48++) {
								if (var13.linkObjType[var46] > 0) {
									ObjType var49 = ObjType.list(var13.linkObjType[var46] - 1);
									String var50 = var49.name;
									if (var49.stackable || var13.linkObjNumber[var46] != 1) {
										var50 = var50 + " x" + niceNumber(var13.linkObjNumber[var46]);
									}

									int var51 = (var13.marginX + 115) * var48 + var11;
									int var52 = (var13.marginY + 12) * var47 + var12;
									if (var13.centre) {
										var45.centreStringTag(var13.width / 2 + var51, var13.colour, var13.shadow, var52, var50);
									} else {
										var45.drawStringTag(var51, var52, var50, var13.shadow, var13.colour);
									}
								}

								var46++;
							}
						}
					}
				}
			}

			Pix2D.setClipping(var8, var6, var7, var5);
		}
	}

	@ObfuscatedName("client.a(ZILkb;)V")
	public final void getPlayerPosExtended(int arg0, Packet arg1) {
		for (int var3 = 0; var3 < entityUpdateCount; var3++) {
			int var4 = entityUpdateIds[var3];
			ClientPlayer var5 = players[var4];
			int var6 = arg1.g1();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg1.g1() << 8;
			}

			getPlayerPosDecodeExtended(var4, var6, arg1, var5);
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void clientVar(int arg0) {
		int var2 = VarpType.list[arg0].clientCode;
		if (var2 != 0) {
			int var3 = var[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					Pix3D.initColourTable(0.9D);
				}

				if (var3 == 2) {
					Pix3D.initColourTable(0.8D);
				}

				if (var3 == 3) {
					Pix3D.initColourTable(0.7D);
				}

				if (var3 == 4) {
					Pix3D.initColourTable(0.6D);
				}

				ObjType.spriteCache.clear();
				redrawFrame = true;
			}

			if (var2 == 3) {
				boolean var4 = midiActive;

				if (var3 == 0) {
					setMidiVolume(0, midiActive);
					midiActive = true;
				}

				if (var3 == 1) {
					setMidiVolume(-400, midiActive);
					midiActive = true;
				}

				if (var3 == 2) {
					setMidiVolume(-800, midiActive);
					midiActive = true;
				}

				if (var3 == 3) {
					setMidiVolume(-1200, midiActive);
					midiActive = true;
				}

				if (var3 == 4) {
					midiActive = false;
				}

				if (midiActive != var4) {
					if (midiActive) {
						playMidi(midiCrc, currentMidi, midiSize);
					} else {
						stopMidi();
					}

					nextMusicDelay = 0;
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					waveEnabled = true;
					setWaveVolume(0);
				}

				if (var3 == 1) {
					waveEnabled = true;
					setWaveVolume(-400);
				}

				if (var3 == 2) {
					waveEnabled = true;
					setWaveVolume(-800);
				}

				if (var3 == 3) {
					waveEnabled = true;
					setWaveVolume(-1200);
				}

				if (var3 == 4) {
					waveEnabled = false;
				}
			}

			if (var2 == 5) {
				oneMouseButton = var3;
			}

			if (var2 == 6) {
				chatEffects = var3;
			}

			if (var2 == 8) {
				splitPrivateChat = var3;
				redrawChatback = true;
			}
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void moveNpcs() {
		for (int var1 = 0; var1 < npcCount; var1++) {
			int var2 = npcIds[var1];
			ClientNpc var3 = npc[var2];
			if (var3 != null) {
				moveEntity(var3, var3.type.size);
			}
		}
	}

	@ObfuscatedName("client.a(Lx;BI)V")
	public final void moveEntity(ClientEntity arg0, int arg1) {
		if (arg0.x < 128 || arg0.z < 128 || arg0.x >= 13184 || arg0.z >= 13184) {
			arg0.primaryAnim = -1;
			arg0.spotanimId = -1;
			arg0.exactMoveEnd = 0;
			arg0.exactMoveStart = 0;
			arg0.x = arg0.routeX[0] * 128 + arg0.size * 64;
			arg0.z = arg0.routeZ[0] * 128 + arg0.size * 64;
			arg0.routeLength = 0;
		}

		if (localPlayer == arg0 && (arg0.x < 1536 || arg0.z < 1536 || arg0.x >= 11776 || arg0.z >= 11776)) {
			arg0.primaryAnim = -1;
			arg0.spotanimId = -1;
			arg0.exactMoveEnd = 0;
			arg0.exactMoveStart = 0;
			arg0.x = arg0.routeX[0] * 128 + arg0.size * 64;
			arg0.z = arg0.routeZ[0] * 128 + arg0.size * 64;
			arg0.routeLength = 0;
		}

		if (arg0.exactMoveEnd > loopCycle) {
			exactMove1(arg0);
		} else if (arg0.exactMoveStart >= loopCycle) {
			exactMove2(arg0);
		} else {
			routeMove(arg0);
		}

		entityFace(arg0);
		entityAnim(arg0);
	}

	@ObfuscatedName("client.a(Lx;I)V")
	public final void exactMove1(ClientEntity arg0) {
		int var2 = arg0.exactMoveEnd - loopCycle;
		int var3 = arg0.exactStartX * 128 + arg0.size * 64;
		int var4 = arg0.exactStartZ * 128 + arg0.size * 64;
		arg0.x += (var3 - arg0.x) / var2;
		arg0.z += (var4 - arg0.z) / var2;
		arg0.animDelayMove = 0;

		if (arg0.exactMoveFacing == 0) {
			arg0.dstYaw = 1024;
		}

		if (arg0.exactMoveFacing == 1) {
			arg0.dstYaw = 1536;
		}

		if (arg0.exactMoveFacing == 2) {
			arg0.dstYaw = 0;
		}

		if (arg0.exactMoveFacing == 3) {
			arg0.dstYaw = 512;
		}
	}

	@ObfuscatedName("client.b(Lx;I)V")
	public final void exactMove2(ClientEntity arg0) {
		if (loopCycle == arg0.exactMoveStart || arg0.primaryAnim == -1 || arg0.primaryAnimDelay != 0 || arg0.primaryAnimCycle + 1 > SeqType.list[arg0.primaryAnim].delay[arg0.primaryFrame]) {
			int var2 = arg0.exactMoveStart - arg0.exactMoveEnd;
			int var3 = loopCycle - arg0.exactMoveEnd;
			int var4 = arg0.exactStartX * 128 + arg0.size * 64;
			int var5 = arg0.exactStartZ * 128 + arg0.size * 64;
			int var6 = arg0.exactEndX * 128 + arg0.size * 64;
			int var7 = arg0.exactEndZ * 128 + arg0.size * 64;
			arg0.x = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.z = ((var2 - var3) * var5 + var3 * var7) / var2;
		}

		arg0.animDelayMove = 0;

		if (arg0.exactMoveFacing == 0) {
			arg0.dstYaw = 1024;
		}

		if (arg0.exactMoveFacing == 1) {
			arg0.dstYaw = 1536;
		}

		if (arg0.exactMoveFacing == 2) {
			arg0.dstYaw = 0;
		}

		if (arg0.exactMoveFacing == 3) {
			arg0.dstYaw = 512;
		}

		arg0.yaw = arg0.dstYaw;
	}

	@ObfuscatedName("client.a(ILx;)V")
	public final void routeMove(ClientEntity arg0) {
		arg0.secondaryAnim = arg0.readyanim;
		if (arg0.routeLength == 0) {
			arg0.animDelayMove = 0;
		} else {
			if (arg0.primaryAnim != -1 && arg0.primaryAnimDelay == 0) {
				SeqType var2 = SeqType.list[arg0.primaryAnim];
				if (var2.walkmerge == null) {
					arg0.animDelayMove++;
					return;
				}
			}

			int var3 = arg0.x;
			int var4 = arg0.z;
			int var5 = arg0.routeX[arg0.routeLength - 1] * 128 + arg0.size * 64;
			int var6 = arg0.routeZ[arg0.routeLength - 1] * 128 + arg0.size * 64;
			if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var3 < var5) {
					if (var4 < var6) {
						arg0.dstYaw = 1280;
					} else if (var4 > var6) {
						arg0.dstYaw = 1792;
					} else {
						arg0.dstYaw = 1536;
					}
				} else if (var3 > var5) {
					if (var4 < var6) {
						arg0.dstYaw = 768;
					} else if (var4 > var6) {
						arg0.dstYaw = 256;
					} else {
						arg0.dstYaw = 512;
					}
				} else if (var4 < var6) {
					arg0.dstYaw = 1024;
				} else {
					arg0.dstYaw = 0;
				}

				int var7 = arg0.dstYaw - arg0.yaw & 0x7FF;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = arg0.walkanim_b;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.walkanim;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.walkanim_r;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.walkanim_l;
				}

				if (var8 == -1) {
					var8 = arg0.walkanim;
				}

				arg0.secondaryAnim = var8;
				int var9 = 4;
				if (arg0.dstYaw != arg0.yaw && arg0.faceEntity == -1) {
					var9 = 2;
				}

				if (arg0.routeLength > 2) {
					var9 = 6;
				}

				if (arg0.routeLength > 3) {
					var9 = 8;
				}

				if (arg0.animDelayMove > 0 && arg0.routeLength > 1) {
					var9 = 8;
					arg0.animDelayMove--;
				}

				if (arg0.routeRun[arg0.routeLength - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.secondaryAnim == arg0.walkanim && arg0.runanim != -1) {
					arg0.secondaryAnim = arg0.runanim;
				}

				if (var3 < var5) {
					arg0.x += var9;
					if (arg0.x > var5) {
						arg0.x = var5;
					}
				} else if (var3 > var5) {
					arg0.x -= var9;
					if (arg0.x < var5) {
						arg0.x = var5;
					}
				}

				if (var4 < var6) {
					arg0.z += var9;
					if (arg0.z > var6) {
						arg0.z = var6;
					}
				} else if (var4 > var6) {
					arg0.z -= var9;
					if (arg0.z < var6) {
						arg0.z = var6;
					}
				}

				if (arg0.x == var5 && arg0.z == var6) {
					arg0.routeLength--;
				}
			} else {
				arg0.x = var5;
				arg0.z = var6;
			}
		}
	}

	@ObfuscatedName("client.a(Lx;B)V")
	public final void entityFace(ClientEntity arg0) {
		if (arg0.faceEntity != -1 && arg0.faceEntity < 32768) {
			ClientNpc var2 = npc[arg0.faceEntity];
			if (var2 != null) {
				int var3 = arg0.x - var2.x;
				int var4 = arg0.z - var2.z;
				if (var3 != 0 || var4 != 0) {
					arg0.dstYaw = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
				}
			}
		}

		if (arg0.faceEntity >= 32768) {
			int var5 = arg0.faceEntity - 32768;
			if (selfSlot == var5) {
				var5 = LOCAL_PLAYER_INDEX;
			}

			ClientPlayer var6 = players[var5];
			if (var6 != null) {
				int var7 = arg0.x - var6.x;
				int var8 = arg0.z - var6.z;
				if (var7 != 0 || var8 != 0) {
					arg0.dstYaw = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
				}
			}
		}

		if ((arg0.faceSquareX != 0 || arg0.faceSquareZ != 0) && (arg0.routeLength == 0 || arg0.animDelayMove > 0)) {
			int var9 = arg0.x - (arg0.faceSquareX - mapBuildBaseX - mapBuildBaseX) * 64;
			int var10 = arg0.z - (arg0.faceSquareZ - mapBuildBaseZ - mapBuildBaseZ) * 64;
			if (var9 != 0 || var10 != 0) {
				arg0.dstYaw = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
			}

			arg0.faceSquareX = 0;
			arg0.faceSquareZ = 0;
		}

		int var11 = arg0.dstYaw - arg0.yaw & 0x7FF;
		if (var11 != 0) {
			if (var11 < 32 || var11 > 2016) {
				arg0.yaw = arg0.dstYaw;
			} else if (var11 > 1024) {
				arg0.yaw -= 32;
			} else {
				arg0.yaw += 32;
			}

			arg0.yaw &= 0x7FF;
			if (arg0.secondaryAnim == arg0.readyanim && arg0.dstYaw != arg0.yaw) {
				if (arg0.turnanim != -1) {
					arg0.secondaryAnim = arg0.turnanim;
					return;
				}

				arg0.secondaryAnim = arg0.walkanim;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZLx;)V")
	public final void entityAnim(ClientEntity arg0) {
		arg0.needsForwardDrawPadding = false;

		if (arg0.secondaryAnim != -1) {
			SeqType var2 = SeqType.list[arg0.secondaryAnim];
			arg0.secondaryAnimCycle++;
			if (arg0.secondaryFrame < var2.numFrames && arg0.secondaryAnimCycle > var2.delay[arg0.secondaryFrame]) {
				arg0.secondaryAnimCycle = 0;
				arg0.secondaryFrame++;
			}

			if (arg0.secondaryFrame >= var2.numFrames) {
				arg0.secondaryAnimCycle = 0;
				arg0.secondaryFrame = 0;
			}
		}

		if (arg0.primaryAnim != -1 && arg0.primaryAnimDelay == 0) {
			SeqType var3 = SeqType.list[arg0.primaryAnim];
			arg0.primaryAnimCycle++;
			while (arg0.primaryFrame < var3.numFrames && arg0.primaryAnimCycle > var3.delay[arg0.primaryFrame]) {
				arg0.primaryAnimCycle -= var3.delay[arg0.primaryFrame];
				arg0.primaryFrame++;
			}

			if (arg0.primaryFrame >= var3.numFrames) {
				arg0.primaryFrame -= var3.loops;
				arg0.primaryAnimLoop++;
				if (arg0.primaryAnimLoop >= var3.maxloops) {
					arg0.primaryAnim = -1;
				}

				if (arg0.primaryFrame < 0 || arg0.primaryFrame >= var3.numFrames) {
					arg0.primaryAnim = -1;
				}
			}

			arg0.needsForwardDrawPadding = var3.reachforward;
		}

		if (arg0.primaryAnimDelay > 0) {
			arg0.primaryAnimDelay--;
		}

		if (arg0.spotanimId != -1 && loopCycle >= arg0.spotanimLastCycle) {
			if (arg0.spotanimFrame < 0) {
				arg0.spotanimFrame = 0;
			}

			SeqType var4 = SpotType.list[arg0.spotanimId].seq;
			arg0.spotanimCycle++;
			while (arg0.spotanimFrame < var4.numFrames && arg0.spotanimCycle > var4.delay[arg0.spotanimFrame]) {
				arg0.spotanimCycle -= var4.delay[arg0.spotanimFrame];
				arg0.spotanimFrame++;
			}

			if (arg0.spotanimFrame >= var4.numFrames) {
				if (arg0.spotanimFrame < 0 || arg0.spotanimFrame >= var4.numFrames) {
					arg0.spotanimId = -1;
				}

				return;
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void gameDraw() {
		if (redrawFrame) {
			redrawFrame = false;
			areaBackleft1.draw(11, graphics, 0);
			areaBackleft2.draw(375, graphics, 0);
			areaBackright1.draw(5, graphics, 729);
			areaBackright2.draw(231, graphics, 752);
			areaBacktop1.draw(0, graphics, 0);
			areaBacktop2.draw(0, graphics, 561);
			areaBackvmid1.draw(11, graphics, 520);
			areaBackvmid2.draw(231, graphics, 520);
			areaBackvmid3.draw(375, graphics, 501);
			areaBackhmid2.draw(345, graphics, 0);
			redrawSidebar = true;
			redrawChatback = true;
			redrawIcons = true;
			redrawChatMode = true;

			if (sceneState != 2) {
				areaGame.draw(11, graphics, 8);
				areaMap.draw(5, graphics, 561);
			}
		}

		if (sceneState == 2) {
			gameDrawMain();
		}

		if (isMenuOpen && menuArea == 1) {
			redrawSidebar = true;
		}

		if (sideModalId != -1) {
			boolean var1 = animateInterface(sideModalId, worldUpdateNum);
			if (var1) {
				redrawSidebar = true;
			}
		}

		if (selectedArea == 2) {
			redrawSidebar = true;
		}

		if (objDragArea == 2) {
			redrawSidebar = true;
		}

		if (redrawSidebar) {
			drawSide();
			redrawSidebar = false;
		}

		if (chatComId == -1) {
			chatInterface.scrollPos = scrollHeight - chatScrollPos - 77;

			if (mouseX > 453 && mouseX < 565 && mouseY > 350) {
				doScrollbar(mouseX - 22, mouseY - 375, scrollHeight, 77, false, 463, 0, chatInterface);
			}

			int var2 = scrollHeight - chatInterface.scrollPos - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > scrollHeight - 77) {
				var2 = scrollHeight - 77;
			}

			if (chatScrollPos != var2) {
				chatScrollPos = var2;
				redrawChatback = true;
			}
		}

		if (chatComId != -1) {
			boolean var3 = animateInterface(chatComId, worldUpdateNum);
			if (var3) {
				redrawChatback = true;
			}
		}

		if (selectedArea == 3) {
			redrawChatback = true;
		}

		if (objDragArea == 3) {
			redrawChatback = true;
		}

		if (tutComMessage != null) {
			redrawChatback = true;
		}

		if (isMenuOpen && menuArea == 2) {
			redrawChatback = true;
		}

		if (redrawChatback) {
			drawChat();
			redrawChatback = false;
		}

		if (sceneState == 2) {
			minimapDraw();
			areaMap.draw(5, graphics, 561);
		}

		if (tutFlashIcon != -1) {
			redrawIcons = true;
		}

		if (redrawIcons) {
			if (tutFlashIcon != -1 && activeIcon == tutFlashIcon) {
				tutFlashIcon = -1;
				out.p1enc(175);
				out.p1(activeIcon);
			}

			redrawIcons = false;
			areaBackhmid1.setPixels();
			backhmid1.plotSprite(0, 0);

			if (sideModalId == -1) {
				if (sideIcon[activeIcon] != -1) {
					if (activeIcon == 0) {
						redstone1.plotSprite(30, 29);
					}

					if (activeIcon == 1) {
						redstone2.plotSprite(29, 59);
					}

					if (activeIcon == 2) {
						redstone2.plotSprite(29, 87);
					}

					if (activeIcon == 3) {
						redstone3.plotSprite(29, 115);
					}

					if (activeIcon == 4) {
						redstone2h.plotSprite(29, 156);
					}

					if (activeIcon == 5) {
						redstone2h.plotSprite(29, 184);
					}

					if (activeIcon == 6) {
						redstone1h.plotSprite(30, 212);
					}
				}

				if (sideIcon[0] != -1 && (tutFlashIcon != 0 || loopCycle % 20 < 10)) {
					sideicons[0].plotSprite(34, 35);
				}

				if (sideIcon[1] != -1 && (tutFlashIcon != 1 || loopCycle % 20 < 10)) {
					sideicons[1].plotSprite(32, 59);
				}

				if (sideIcon[2] != -1 && (tutFlashIcon != 2 || loopCycle % 20 < 10)) {
					sideicons[2].plotSprite(32, 86);
				}

				if (sideIcon[3] != -1 && (tutFlashIcon != 3 || loopCycle % 20 < 10)) {
					sideicons[3].plotSprite(33, 121);
				}

				if (sideIcon[4] != -1 && (tutFlashIcon != 4 || loopCycle % 20 < 10)) {
					sideicons[4].plotSprite(34, 157);
				}

				if (sideIcon[5] != -1 && (tutFlashIcon != 5 || loopCycle % 20 < 10)) {
					sideicons[5].plotSprite(32, 185);
				}

				if (sideIcon[6] != -1 && (tutFlashIcon != 6 || loopCycle % 20 < 10)) {
					sideicons[6].plotSprite(34, 212);
				}
			}

			areaBackhmid1.draw(165, graphics, 520);
			areaBackbase2.setPixels();
			backbase2.plotSprite(0, 0);

			if (sideModalId == -1) {
				if (sideIcon[activeIcon] != -1) {
					if (activeIcon == 7) {
						redstone1v.plotSprite(0, 49);
					}

					if (activeIcon == 8) {
						redstone2v.plotSprite(0, 81);
					}

					if (activeIcon == 9) {
						redstone2v.plotSprite(0, 108);
					}

					if (activeIcon == 10) {
						redstone3v.plotSprite(1, 136);
					}

					if (activeIcon == 11) {
						redstone2hv.plotSprite(0, 178);
					}

					if (activeIcon == 12) {
						redstone2hv.plotSprite(0, 205);
					}

					if (activeIcon == 13) {
						redstone1hv.plotSprite(0, 233);
					}
				}

				if (sideIcon[8] != -1 && (tutFlashIcon != 8 || loopCycle % 20 < 10)) {
					sideicons[7].plotSprite(2, 80);
				}

				if (sideIcon[9] != -1 && (tutFlashIcon != 9 || loopCycle % 20 < 10)) {
					sideicons[8].plotSprite(3, 107);
				}

				if (sideIcon[10] != -1 && (tutFlashIcon != 10 || loopCycle % 20 < 10)) {
					sideicons[9].plotSprite(4, 142);
				}

				if (sideIcon[11] != -1 && (tutFlashIcon != 11 || loopCycle % 20 < 10)) {
					sideicons[10].plotSprite(2, 179);
				}

				if (sideIcon[12] != -1 && (tutFlashIcon != 12 || loopCycle % 20 < 10)) {
					sideicons[11].plotSprite(2, 206);
				}

				if (sideIcon[13] != -1 && (tutFlashIcon != 13 || loopCycle % 20 < 10)) {
					sideicons[12].plotSprite(2, 230);
				}
			}

			areaBackbase2.draw(492, graphics, 501);
			areaGame.setPixels();
		}

		if (redrawChatMode) {
			redrawChatMode = false;
			areaBackbase1.setPixels();
			backbase1.plotSprite(0, 0);
			p12.centreStringTag(57, 0xFFFFFF, true, 33, "Public chat");

			if (chatPublicMode == 0) {
				p12.centreStringTag(57, 0xFF00, true, 46, "On");
			}

			if (chatPublicMode == 1) {
				p12.centreStringTag(57, 0xFFFF00, true, 46, "Friends");
			}

			if (chatPublicMode == 2) {
				p12.centreStringTag(57, 0xFF0000, true, 46, "Off");
			}

			if (chatPublicMode == 3) {
				p12.centreStringTag(57, 0xFFFF, true, 46, "Hide");
			}

			p12.centreStringTag(186, 0xFFFFFF, true, 33, "Private chat");

			if (chatPrivateMode == 0) {
				p12.centreStringTag(186, 0xFF00, true, 46, "On");
			}

			if (chatPrivateMode == 1) {
				p12.centreStringTag(186, 0xFFFF00, true, 46, "Friends");
			}

			if (chatPrivateMode == 2) {
				p12.centreStringTag(186, 0xFF0000, true, 46, "Off");
			}

			p12.centreStringTag(326, 0xFFFFFF, true, 33, "Trade/duel");

			if (chatTradeMode == 0) {
				p12.centreStringTag(326, 0xFF00, true, 46, "On");
			}

			if (chatTradeMode == 1) {
				p12.centreStringTag(326, 0xFFFF00, true, 46, "Friends");
			}

			if (chatTradeMode == 2) {
				p12.centreStringTag(326, 0xFF0000, true, 46, "Off");
			}

			p12.centreStringTag(462, 0xFFFFFF, true, 38, "Report abuse");
			areaBackbase1.draw(471, graphics, 0);
			areaGame.setPixels();
		}

		worldUpdateNum = 0;
	}

	@ObfuscatedName("client.e(II)Z")
	public final boolean isAddFriendOption(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = menuAction[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 406) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.f(II)V")
	public final void doAction(int arg0) {
		if (arg0 >= 0) {
			if (dialogInputOpen) {
				dialogInputOpen = false;
				redrawChatback = true;
			}

			int var2 = menuParamB[arg0];
			int var3 = menuParamC[arg0];
			int var4 = menuAction[arg0];
			int var5 = menuParamA[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 903 || var4 == 363) {
				String var6 = menuOption[arg0];
				int var7 = var6.indexOf("@whi@");
				if (var7 != -1) {
					var6 = var6.substring(var7 + 5).trim();
					String var8 = JString.toScreenName(JString.toRawUsername(JString.toUserhash(var6)));
					boolean var9 = false;
					for (int var10 = 0; var10 < playerCount; var10++) {
						ClientPlayer var11 = players[playerIds[var10]];
						if (var11 != null && var11.name != null && var11.name.equalsIgnoreCase(var8)) {
							tryMove(localPlayer.routeX[0], 1, false, var11.routeX[0], localPlayer.routeZ[0], 2, 1, var11.routeZ[0], 0, 0, 0);

							if (var4 == 903) {
								out.p1enc(206);
							}

							if (var4 == 363) {
								out.p1enc(164);
							}

							out.p2(playerIds[var10]);
							var9 = true;
							break;
						}
					}

					if (!var9) {
						addChat(0, "Unable to find " + var8, "");
					}
				}
			}

			if (var4 == 450 && interactWithLoc(75, var2, var3, var5)) {
				out.p2(objComId);
				out.p2(objSelectedSlot);
				out.p2(objSelectedComId);
			}

			if (var4 == 405 || var4 == 38 || var4 == 422 || var4 == 478 || var4 == 347) {
				if (var4 == 478) {
					if ((var2 & 0x3) == 0) {
						oplogic5++;
					}

					if (oplogic5 >= 90) {
						out.p1enc(220);
					}

					out.p1enc(157);
				}

				if (var4 == 347) {
					out.p1enc(211);
				}

				if (var4 == 422) {
					out.p1enc(133);
				}

				if (var4 == 405) {
					oplogic3 += var5;
					if (oplogic3 >= 97) {
						out.p1enc(30);
						out.p3(0xE42D58);
					}

					out.p1enc(195);
				}

				if (var4 == 38) {
					out.p1enc(71);
				}

				out.p2(var5);
				out.p2(var2);
				out.p2(var3);
				selectedCycle = 0;
				selectedComId = var3;
				selectedItem = var2;
				selectedArea = 2;
				if (IfType.list[var3].layerId == mainModalId) {
					selectedArea = 1;
				}

				if (IfType.list[var3].layerId == chatComId) {
					selectedArea = 3;
				}
			}

			if (var4 == 728 || var4 == 542 || var4 == 6 || var4 == 963 || var4 == 245) {
				ClientNpc var12 = npc[var5];
				if (var12 != null) {
					tryMove(localPlayer.routeX[0], 1, false, var12.routeX[0], localPlayer.routeZ[0], 2, 1, var12.routeZ[0], 0, 0, 0);
					crossX = mouseClickX;
					crossY = mouseClickY;
					crossMode = 2;
					crossCycle = 0;

					if (var4 == 542) {
						out.p1enc(8);
					}

					if (var4 == 6) {
						if ((var5 & 0x3) == 0) {
							oplogic2++;
						}

						if (oplogic2 >= 124) {
							out.p1enc(88);
							out.p4(0);
						}

						out.p1enc(27);
					}

					if (var4 == 963) {
						out.p1enc(113);
					}

					if (var4 == 728) {
						out.p1enc(194);
					}

					if (var4 == 245) {
						if ((var5 & 0x3) == 0) {
							oplogic4++;
						}

						if (oplogic4 >= 85) {
							out.p1enc(176);
							out.p2(39596);
						}

						out.p1enc(100);
					}

					out.p2(var5);
				}
			}

			if (var4 == 217) {
				boolean var13 = tryMove(localPlayer.routeX[0], 0, false, var2, localPlayer.routeZ[0], 2, 0, var3, 0, 0, 0);
				if (!var13) {
					tryMove(localPlayer.routeX[0], 1, false, var2, localPlayer.routeZ[0], 2, 1, var3, 0, 0, 0);
				}

				crossX = mouseClickX;
				crossY = mouseClickY;
				crossMode = 2;
				crossCycle = 0;
				out.p1enc(239);
				out.p2(mapBuildBaseX + var2);
				out.p2(mapBuildBaseZ + var3);
				out.p2(var5);
				out.p2(objComId);
				out.p2(objSelectedSlot);
				out.p2(objSelectedComId);
			}

			if (var4 == 1175) {
				int var15 = var5 >> 14 & 0x7FFF;
				LocType var16 = LocType.list(var15);
				String var17;
				if (var16.desc == null) {
					var17 = "It's a " + var16.name + ".";
				} else {
					var17 = new String(var16.desc);
				}

				addChat(0, var17, "");
			}

			if (var4 == 285) {
				interactWithLoc(245, var2, var3, var5);
			}

			if (var4 == 881) {
				out.p1enc(130);
				out.p2(var5);
				out.p2(var2);
				out.p2(var3);
				out.p2(objComId);
				out.p2(objSelectedSlot);
				out.p2(objSelectedComId);
				selectedCycle = 0;
				selectedComId = var3;
				selectedItem = var2;
				selectedArea = 2;
				if (IfType.list[var3].layerId == mainModalId) {
					selectedArea = 1;
				}

				if (IfType.list[var3].layerId == chatComId) {
					selectedArea = 3;
				}
			}

			if (var4 == 391) {
				out.p1enc(48);
				out.p2(var5);
				out.p2(var2);
				out.p2(var3);
				out.p2(targetComId);
				selectedCycle = 0;
				selectedComId = var3;
				selectedItem = var2;
				selectedArea = 2;
				if (IfType.list[var3].layerId == mainModalId) {
					selectedArea = 1;
				}

				if (IfType.list[var3].layerId == chatComId) {
					selectedArea = 3;
				}
			}

			if (var4 == 660) {
				if (isMenuOpen) {
					world.updateMousePicking(var3 - 11, var2 - 8);
				} else {
					world.updateMousePicking(mouseClickY - 11, mouseClickX - 8);
				}
			}

			if (var4 == 188) {
				useMode = 1;
				objSelectedSlot = var2;
				objSelectedComId = var3;
				objComId = var5;
				objSelectedName = ObjType.list(var5).name;
				targetMode = 0;
			} else {
				if (var4 == 44 && !resumedPauseButton) {
					out.p1enc(235);
					out.p2(var3);
					resumedPauseButton = true;
				}

				if (var4 == 1773) {
					ObjType var18 = ObjType.list(var5);
					String var19;
					if (var3 >= 100000) {
						var19 = var3 + " x " + var18.name;
					} else if (var18.desc == null) {
						var19 = "It's a " + var18.name + ".";
					} else {
						var19 = new String(var18.desc);
					}

					addChat(0, var19, "");
				}

				if (var4 == 900) {
					ClientNpc var20 = npc[var5];
					if (var20 != null) {
						tryMove(localPlayer.routeX[0], 1, false, var20.routeX[0], localPlayer.routeZ[0], 2, 1, var20.routeZ[0], 0, 0, 0);
						crossX = mouseClickX;
						crossY = mouseClickY;
						crossMode = 2;
						crossCycle = 0;
						out.p1enc(202);
						out.p2(var5);
						out.p2(objComId);
						out.p2(objSelectedSlot);
						out.p2(objSelectedComId);
					}
				}

				if (var4 == 1373 || var4 == 1544 || var4 == 151 || var4 == 1101) {
					ClientPlayer var21 = players[var5];
					if (var21 != null) {
						tryMove(localPlayer.routeX[0], 1, false, var21.routeX[0], localPlayer.routeZ[0], 2, 1, var21.routeZ[0], 0, 0, 0);
						crossX = mouseClickX;
						crossY = mouseClickY;
						crossMode = 2;
						crossCycle = 0;

						if (var4 == 1101) {
							out.p1enc(164);
						}

						if (var4 == 151) {
							oplogic8++;
							if (oplogic8 >= 90) {
								out.p1enc(2);
								out.p2(31114);
							}

							out.p1enc(53);
						}

						if (var4 == 1373) {
							out.p1enc(206);
						}

						if (var4 == 1544) {
							out.p1enc(185);
						}

						out.p2(var5);
					}
				}

				if (var4 == 265) {
					ClientNpc var22 = npc[var5];
					if (var22 != null) {
						tryMove(localPlayer.routeX[0], 1, false, var22.routeX[0], localPlayer.routeZ[0], 2, 1, var22.routeZ[0], 0, 0, 0);
						crossX = mouseClickX;
						crossY = mouseClickY;
						crossMode = 2;
						crossCycle = 0;
						out.p1enc(134);
						out.p2(var5);
						out.p2(targetComId);
					}
				}

				if (var4 == 679) {
					String var23 = menuOption[arg0];
					int var24 = var23.indexOf("@whi@");
					if (var24 != -1) {
						long var25 = JString.toUserhash(var23.substring(var24 + 5).trim());
						int var27 = -1;
						for (int var28 = 0; var28 < friendCount; var28++) {
							if (friendUserhash[var28] == var25) {
								var27 = var28;
								break;
							}
						}

						if (var27 != -1 && friendNodeId[var27] > 0) {
							redrawChatback = true;
							dialogInputOpen = false;
							socialInputOpen = true;
							socialInput = "";
							socialInputType = 3;
							socialUserhash = friendUserhash[var27];
							socialInputHeader = "Enter message to send to " + friendUsername[var27];
						}
					}
				}

				if (var4 == 55 && interactWithLoc(9, var2, var3, var5)) {
					out.p2(targetComId);
				}

				if (var4 == 224 || var4 == 993 || var4 == 99 || var4 == 746 || var4 == 877) {
					boolean var29 = tryMove(localPlayer.routeX[0], 0, false, var2, localPlayer.routeZ[0], 2, 0, var3, 0, 0, 0);
					if (!var29) {
						tryMove(localPlayer.routeX[0], 1, false, var2, localPlayer.routeZ[0], 2, 1, var3, 0, 0, 0);
					}

					crossX = mouseClickX;
					crossY = mouseClickY;
					crossMode = 2;
					crossCycle = 0;

					if (var4 == 224) {
						out.p1enc(140);
					}

					if (var4 == 746) {
						out.p1enc(178);
					}

					if (var4 == 877) {
						out.p1enc(247);
					}

					if (var4 == 99) {
						out.p1enc(200);
					}

					if (var4 == 993) {
						out.p1enc(40);
					}

					out.p2(mapBuildBaseX + var2);
					out.p2(mapBuildBaseZ + var3);
					out.p2(var5);
				}

				if (var4 == 1607) {
					ClientNpc var31 = npc[var5];
					if (var31 != null) {
						String var32;
						if (var31.type.desc == null) {
							var32 = "It's a " + var31.type.name + ".";
						} else {
							var32 = new String(var31.type.desc);
						}

						addChat(0, var32, "");
					}
				}

				if (var4 == 504) {
					interactWithLoc(172, var2, var3, var5);
				}

				if (var4 == 930) {
					IfType var33 = IfType.list[var3];
					targetMode = 1;
					targetComId = var3;
					targetMask = var33.targetMask;
					useMode = 0;
					String var34 = var33.targetVerb;
					if (var34.indexOf(" ") != -1) {
						var34 = var34.substring(0, var34.indexOf(" "));
					}

					String var35 = var33.targetVerb;
					if (var35.indexOf(" ") != -1) {
						var35 = var35.substring(var35.indexOf(" ") + 1);
					}

					targetOp = var34 + " " + var33.targetBase + " " + var35;

					if (targetMask == 16) {
						redrawSidebar = true;
						activeIcon = 3;
						redrawIcons = true;
					}
				} else {
					if (var4 == 951) {
						IfType var36 = IfType.list[var3];
						boolean var37 = true;
						if (var36.clientCode > 0) {
							var37 = clientButton(var36);
						}

						if (var37) {
							out.p1enc(155);
							out.p2(var3);
						}
					}

					if (var4 == 602 || var4 == 596 || var4 == 22 || var4 == 892 || var4 == 415) {
						if (var4 == 22) {
							out.p1enc(212);
						}

						if (var4 == 415) {
							if ((var3 & 0x3) == 0) {
								oplogic7++;
							}

							if (oplogic7 >= 55) {
								out.p1enc(17);
								out.p4(0);
							}

							out.p1enc(6);
						}

						if (var4 == 602) {
							out.p1enc(31);
						}

						if (var4 == 892) {
							if ((var2 & 0x3) == 0) {
								oplogic9++;
							}

							if (oplogic9 >= 130) {
								out.p1enc(238);
								out.p1(177);
							}

							out.p1enc(38);
						}

						if (var4 == 596) {
							out.p1enc(59);
						}

						out.p2(var5);
						out.p2(var2);
						out.p2(var3);
						selectedCycle = 0;
						selectedComId = var3;
						selectedItem = var2;
						selectedArea = 2;
						if (IfType.list[var3].layerId == mainModalId) {
							selectedArea = 1;
						}

						if (IfType.list[var3].layerId == chatComId) {
							selectedArea = 3;
						}
					}

					if (var4 == 581) {
						if ((var5 & 0x3) == 0) {
							oplogic1++;
						}

						if (oplogic1 >= 99) {
							out.p1enc(7);
							out.p4(0);
						}

						interactWithLoc(97, var2, var3, var5);
					}

					if (var4 == 965) {
						boolean var38 = tryMove(localPlayer.routeX[0], 0, false, var2, localPlayer.routeZ[0], 2, 0, var3, 0, 0, 0);
						if (!var38) {
							tryMove(localPlayer.routeX[0], 1, false, var2, localPlayer.routeZ[0], 2, 1, var3, 0, 0, 0);
						}

						crossX = mouseClickX;
						crossY = mouseClickY;
						crossMode = 2;
						crossCycle = 0;
						out.p1enc(138);
						out.p2(mapBuildBaseX + var2);
						out.p2(mapBuildBaseZ + var3);
						out.p2(var5);
						out.p2(targetComId);
					}

					if (var4 == 1501) {
						oplogic6 += mapBuildBaseZ;
						if (oplogic6 >= 92) {
							out.p1enc(66);
							out.p4(0);
						}

						interactWithLoc(116, var2, var3, var5);
					}

					if (var4 == 364) {
						interactWithLoc(96, var2, var3, var5);
					}

					if (var4 == 1102) {
						ObjType var40 = ObjType.list(var5);
						String var41;
						if (var40.desc == null) {
							var41 = "It's a " + var40.name + ".";
						} else {
							var41 = new String(var40.desc);
						}

						addChat(0, var41, "");
					}

					if (var4 == 960) {
						out.p1enc(155);
						out.p2(var3);
						IfType var42 = IfType.list[var3];
						if (var42.scripts != null && var42.scripts[0][0] == 5) {
							int var43 = var42.scripts[0][1];
							if (var[var43] != var42.scriptOperand[0]) {
								var[var43] = var42.scriptOperand[0];
								clientVar(var43);
								redrawSidebar = true;
							}
						}
					}

					if (var4 == 34) {
						String var44 = menuOption[arg0];
						int var45 = var44.indexOf("@whi@");
						if (var45 != -1) {
							closeModal();
							reportAbuseInput = var44.substring(var45 + 5).trim();
							reportAbuseMuteOption = false;

							for (int var46 = 0; var46 < IfType.list.length; var46++) {
								if (IfType.list[var46] != null && IfType.list[var46].clientCode == 600) {
									reportAbuseComId = mainModalId = IfType.list[var46].layerId;
									break;
								}
							}
						}
					}

					if (var4 == 947) {
						closeModal();
					}

					if (var4 == 367) {
						ClientPlayer var47 = players[var5];
						if (var47 != null) {
							tryMove(localPlayer.routeX[0], 1, false, var47.routeX[0], localPlayer.routeZ[0], 2, 1, var47.routeZ[0], 0, 0, 0);
							crossX = mouseClickX;
							crossY = mouseClickY;
							crossMode = 2;
							crossCycle = 0;
							out.p1enc(248);
							out.p2(var5);
							out.p2(objComId);
							out.p2(objSelectedSlot);
							out.p2(objSelectedComId);
						}
					}

					if (var4 == 465) {
						out.p1enc(155);
						out.p2(var3);
						IfType var48 = IfType.list[var3];
						if (var48.scripts != null && var48.scripts[0][0] == 5) {
							int var49 = var48.scripts[0][1];
							var[var49] = 1 - var[var49];
							clientVar(var49);
							redrawSidebar = true;
						}
					}

					if (var4 == 406 || var4 == 436 || var4 == 557 || var4 == 556) {
						String var50 = menuOption[arg0];
						int var51 = var50.indexOf("@whi@");
						if (var51 != -1) {
							long var52 = JString.toUserhash(var50.substring(var51 + 5).trim());
							if (var4 == 406) {
								addFriend(var52);
							}

							if (var4 == 436) {
								addIgnore(var52);
							}

							if (var4 == 557) {
								delFriend(var52);
							}

							if (var4 == 556) {
								delIgnore(var52);
							}
						}
					}

					if (var4 == 651) {
						ClientPlayer var54 = players[var5];
						if (var54 != null) {
							tryMove(localPlayer.routeX[0], 1, false, var54.routeX[0], localPlayer.routeZ[0], 2, 1, var54.routeZ[0], 0, 0, 0);
							crossX = mouseClickX;
							crossY = mouseClickY;
							crossMode = 2;
							crossCycle = 0;
							out.p1enc(177);
							out.p2(var5);
							out.p2(targetComId);
						}
					}

					useMode = 0;
					targetMode = 0;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IZI)Ljava/lang/String;")
	public static final String combatColourCode(int arg0, int arg1) {
		int var2 = arg0 - arg1;
		if (var2 < -9) {
			return "@red@";
		}

		if (var2 < -6) {
			return "@or3@";
		}

		if (var2 < -3) {
			return "@or2@";
		}

		if (var2 < 0) {
			return "@or1@";
		}

		if (var2 > 9) {
			return "@gre@";
		}

		if (var2 > 6) {
			return "@gr3@";
		}

		if (var2 > 3) {
			return "@gr2@";
		}

		if (var2 > 0) {
			return "@gr1@";
		}

		return "@yel@";
	}

	@ObfuscatedName("client.s(I)Ljava/lang/String;")
	public final String getHost() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (frame != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.t(I)V")
	public final void drawMinimenu() {
		int var1 = menuX;
		int var2 = menuY;
		int var3 = menuWidth;
		int var4 = menuHeight;
		int var5 = 0x5D5447;
		Pix2D.fillRect(var2, var1, var5, var3, var4);
		Pix2D.fillRect(var2 + 1, var1 + 1, 0, var3 - 2, 16);
		Pix2D.drawRect(var1 + 1, 0, var4 - 19, var2 + 18, var3 - 2);
		b12.drawString(var1 + 3, var2 + 14, var5, "Choose Option");
		int var6 = mouseX;
		int var7 = mouseY;
		if (menuArea == 0) {
			var6 -= 8;
			var7 -= 11;
		}

		if (menuArea == 1) {
			var6 -= 562;
			var7 -= 231;
		}

		if (menuArea == 2) {
			var6 -= 22;
			var7 -= 375;
		}

		for (int var8 = 0; var8 < menuNumEntries; var8++) {
			int var9 = (menuNumEntries - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			b12.drawStringTag(var1 + 3, var9, menuOption[var8], true, var10);
		}
	}

	@ObfuscatedName("client.c(III)V")
	public final void addPrivateChatOptions(int arg0, int arg1) {
		if (splitPrivateChat != 0) {
			int var3 = 0;
			if (rebootTimer != 0) {
				var3 = 1;
			}

			for (int var4 = 0; var4 < 100; var4++) {
				if (chatText[var4] != null) {
					int var5 = chatType[var4];
					if ((var5 == 3 || var5 == 7) && (var5 == 7 || chatPrivateMode == 0 || chatPrivateMode == 1 && isFriend(chatUsername[var4]))) {
						int var6 = 329 - var3 * 13;
						if (mouseX > 8 && mouseX < 520 && arg1 - 11 > var6 - 10 && arg1 - 11 <= var6 + 3) {
							if (staffmod) {
								menuOption[menuNumEntries] = "Report abuse @whi@" + chatUsername[var4];
								menuAction[menuNumEntries] = 2034;
								menuNumEntries++;
							}

							menuOption[menuNumEntries] = "Add ignore @whi@" + chatUsername[var4];
							menuAction[menuNumEntries] = 2436;
							menuNumEntries++;
							menuOption[menuNumEntries] = "Add friend @whi@" + chatUsername[var4];
							menuAction[menuNumEntries] = 2406;
							menuNumEntries++;
						}

						var3++;
						if (var3 >= 5) {
							return;
						}
					}

					if ((var5 == 5 || var5 == 6) && chatPrivateMode < 2) {
						var3++;
						if (var3 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILhc;)V")
	public final void clientComponent(IfType arg0) {
		int var2 = arg0.clientCode;
		if (var2 >= 1 && var2 <= 100) {
			var2--;
			if (var2 >= friendCount) {
				arg0.text = "";
				arg0.buttonType = 0;
			} else {
				arg0.text = friendUsername[var2];
				arg0.buttonType = 1;
			}
		} else if (var2 >= 101 && var2 <= 200) {
			var2 -= 101;
			if (var2 >= friendCount) {
				arg0.text = "";
				arg0.buttonType = 0;
			} else {
				if (friendNodeId[var2] == 0) {
					arg0.text = "@red@Offline";
				} else if (friendNodeId[var2] == nodeId) {
					arg0.text = "@gre@World-" + (friendNodeId[var2] - 9);
				} else {
					arg0.text = "@yel@World-" + (friendNodeId[var2] - 9);
				}

				arg0.buttonType = 1;
			}
		} else if (var2 == 203) {
			arg0.scrollHeight = friendCount * 15 + 20;
			if (arg0.scrollHeight <= arg0.height) {
				arg0.scrollHeight = arg0.height + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 >= ignoreCount) {
				arg0.text = "";
				arg0.buttonType = 0;
			} else {
				arg0.text = JString.toScreenName(JString.toRawUsername(ignoreUserhash[var2]));
				arg0.buttonType = 1;
			}
		} else if (var2 == 503) {
			arg0.scrollHeight = ignoreCount * 15 + 20;
			if (arg0.scrollHeight <= arg0.height) {
				arg0.scrollHeight = arg0.height + 1;
			}
		} else if (var2 == 327) {
			arg0.modelXAn = 150;
			arg0.modelYAn = (int) (Math.sin(loopCycle / 40.0D) * 256.0D) & 0x7FF;

			if (idkDesignRedraw) {
				idkDesignRedraw = false;
				Model[] var3 = new Model[7];
				int var4 = 0;
				for (int var5 = 0; var5 < 7; var5++) {
					int var6 = idkDesignPart[var5];
					if (var6 >= 0) {
						var3[var4++] = IdkType.list[var6].getModelNoCheck();
					}
				}

				Model var7 = new Model(var3, var4);
				for (int var8 = 0; var8 < 5; var8++) {
					if (idkDesignColour[var8] != 0) {
						var7.recolour(recol1d[var8][0], recol1d[var8][idkDesignColour[var8]]);

						if (var8 == 1) {
							var7.recolour(recol2d[0], recol2d[idkDesignColour[var8]]);
						}
					}
				}

				var7.prepareAnim();
				var7.animate(SeqType.list[localPlayer.readyanim].frames[0]);
				var7.calculateNormals(64, 850, -30, -50, -30, true);
				arg0.model1 = var7;
			}
		} else if (var2 == 324) {
			if (idkDesignButton1 == null) {
				idkDesignButton1 = arg0.graphic;
				idkDesignButton2 = arg0.graphic2;
			}

			if (idkDesignGender) {
				arg0.graphic = idkDesignButton2;
			} else {
				arg0.graphic = idkDesignButton1;
			}
		} else if (var2 == 325) {
			if (idkDesignButton1 == null) {
				idkDesignButton1 = arg0.graphic;
				idkDesignButton2 = arg0.graphic2;
			}

			if (idkDesignGender) {
				arg0.graphic = idkDesignButton1;
			} else {
				arg0.graphic = idkDesignButton2;
			}
		} else if (var2 == 600) {
			arg0.text = reportAbuseInput;
			if (loopCycle % 20 < 10) {
				arg0.text = arg0.text + "|";
			} else {
				arg0.text = arg0.text + " ";
			}
		} else if (var2 == 613) {
			if (!staffmod) {
				arg0.text = "";
			} else if (reportAbuseMuteOption) {
				arg0.colour = 0xFF0000;
				arg0.text = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				arg0.colour = 0xFFFFFF;
				arg0.text = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (var2 == 650 || var2 == 655) {
			if (lastAddress == 0) {
				arg0.text = "";
			} else {
				String var9;
				if (daysSinceLastLogin == 0) {
					var9 = "earlier today";
				} else if (daysSinceLastLogin == 1) {
					var9 = "yesterday";
				} else {
					var9 = daysSinceLastLogin + " days ago";
				}

				arg0.text = "You last logged in " + var9 + " from: " + signlink.dns;
			}
		} else if (var2 == 651) {
			if (unreadMessages == 0) {
				arg0.text = "0 unread messages";
				arg0.colour = 0xFFFF00;
			}

			if (unreadMessages == 1) {
				arg0.text = "1 unread message";
				arg0.colour = 0xFF00;
			}

			if (unreadMessages > 1) {
				arg0.text = unreadMessages + " unread messages";
				arg0.colour = 0xFF00;
			}
		} else if (var2 == 652) {
			if (daysSinceRecoveriesChanged == 201) {
				arg0.text = "";
			} else if (daysSinceRecoveriesChanged == 200) {
				arg0.text = "You have not yet set any password recovery questions.";
			} else {
				String var10;
				if (daysSinceRecoveriesChanged == 0) {
					var10 = "Earlier today";
				} else if (daysSinceRecoveriesChanged == 1) {
					var10 = "Yesterday";
				} else {
					var10 = daysSinceRecoveriesChanged + " days ago";
				}

				arg0.text = var10 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (daysSinceRecoveriesChanged == 201) {
				arg0.text = "";
			} else if (daysSinceRecoveriesChanged == 200) {
				arg0.text = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.text = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (daysSinceRecoveriesChanged == 201) {
				arg0.text = "";
			} else if (daysSinceRecoveriesChanged == 200) {
				arg0.text = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.text = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.a([BII)Z")
	public final boolean saveWave(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.u(I)Z")
	public final boolean replayWave() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.g(II)V")
	public final void setWaveVolume(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.a(ZLkb;I)V")
	public final void getNpcPosNewVis(Packet arg0, int arg1) {
		while (arg0.bitpos + 21 < arg1 * 8) {
			int var3 = arg0.gbit(13);
			if (var3 == 8191) {
				break;
			}

			if (npc[var3] == null) {
				npc[var3] = new ClientNpc();
			}

			ClientNpc var4 = npc[var3];
			npcIds[npcCount++] = var3;
			var4.cycle = loopCycle;
			var4.type = NpcType.list(arg0.gbit(11));
			var4.size = var4.type.size;
			var4.walkanim = var4.type.walkanim;
			var4.walkanim_b = var4.type.walkanim_b;
			var4.walkanim_l = var4.type.walkanim_r;
			var4.walkanim_r = var4.type.walkanim_l;
			var4.readyanim = var4.type.readyanim;
			int var5 = arg0.gbit(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.gbit(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			var4.teleport(false, localPlayer.routeX[0] + var5, localPlayer.routeZ[0] + var6);
			int var7 = arg0.gbit(1);
			if (var7 == 1) {
				entityUpdateIds[entityUpdateCount++] = var3;
			}
		}

		arg0.gbitend();
	}

	@ObfuscatedName("client.a(ZLhc;)Z")
	public final boolean clientButton(IfType arg0) {
		int var2 = arg0.clientCode;
		if (var2 == 201) {
			redrawChatback = true;
			dialogInputOpen = false;
			socialInputOpen = true;
			socialInput = "";
			socialInputType = 1;
			socialInputHeader = "Enter name of friend to add to list";
		}

		if (var2 == 202) {
			redrawChatback = true;
			dialogInputOpen = false;
			socialInputOpen = true;
			socialInput = "";
			socialInputType = 2;
			socialInputHeader = "Enter name of friend to delete from list";
		}

		if (var2 == 205) {
			logoutTimer = 250;
			return true;
		}

		if (var2 == 501) {
			redrawChatback = true;
			dialogInputOpen = false;
			socialInputOpen = true;
			socialInput = "";
			socialInputType = 4;
			socialInputHeader = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			redrawChatback = true;
			dialogInputOpen = false;
			socialInputOpen = true;
			socialInput = "";
			socialInputType = 5;
			socialInputHeader = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = idkDesignPart[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = IdkType.numDefinitions - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= IdkType.numDefinitions) {
							var5 = 0;
						}
					}

					if (!IdkType.list[var5].disable && IdkType.list[var5].part == var3 + (idkDesignGender ? 0 : 7)) {
						break;
					}
				}

				idkDesignPart[var3] = var5;
				idkDesignRedraw = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = idkDesignColour[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = recol1d[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= recol1d[var6].length) {
					var8 = 0;
				}
			}

			idkDesignColour[var6] = var8;
			idkDesignRedraw = true;
		}

		if (var2 == 324 && !idkDesignGender) {
			idkDesignGender = true;
			validateIdkDesign();
		}

		if (var2 == 325 && idkDesignGender) {
			idkDesignGender = false;
			validateIdkDesign();
		}

		if (var2 == 326) {
			out.p1enc(52);
			out.p1(idkDesignGender ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				out.p1(idkDesignPart[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				out.p1(idkDesignColour[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			reportAbuseMuteOption = !reportAbuseMuteOption;
		}

		if (var2 >= 601 && var2 <= 612) {
			closeModal();

			if (reportAbuseInput.length() > 0) {
				out.p1enc(190);
				out.p8(JString.toUserhash(reportAbuseInput));
				out.p1(var2 - 601);
				out.p1(reportAbuseMuteOption ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a()V")
	public final void maininit() {
		if (signlink.sunjava) {
			mindel = 5;
		}

		if (!lowMem) {
			startMidiThread = true;
			midiThreadActive = true;
			startThread(this, 2);
			playMidi(12345678, "scape_main", 40000);
		}

		if (alreadystarted) {
			errorStarted = true;
		} else {
			alreadystarted = true;
			boolean var1 = false;
			String var2 = getHost();
			if (var2.endsWith("jagex.com")) {
				var1 = true;
			}

			if (var2.endsWith("runescape.com")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.2")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.249")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.252")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.253")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.254")) {
				var1 = true;
			}

			if (var2.endsWith("127.0.0.1")) {
				var1 = true;
			}

			if (var1) {
				try {
					int var3 = 5;
					jagChecksum[8] = 0;
					while (jagChecksum[8] == 0) {
						drawProgress("Connecting to fileserver", 10);

						try {
							DataInputStream var4 = openUrl("crc" + (int) (Math.random() * 9.9999999E7D));
							Packet var5 = new Packet(new byte[36]);
							var4.readFully(var5.data, 0, 36);

							for (int var6 = 0; var6 < 9; var6++) {
								jagChecksum[var6] = var5.g4();
							}

							var4.close();
						} catch (IOException var59) {
							for (int var7 = var3; var7 > 0; var7--) {
								drawProgress("Error loading - Will retry in " + var7 + " secs.", 10);

								try {
									Thread.sleep(1000L);
								} catch (Exception var54) {
								}
							}

							var3 *= 2;
							if (var3 > 60) {
								var3 = 60;
							}
						}
					}

					title = getJagFile("title screen", jagChecksum[1], "title", 10);
					p11 = new PixFont(title, "p11");
					p12 = new PixFont(title, "p12");
					b12 = new PixFont(title, "b12");
					q8 = new PixFont(title, "q8");
					loadTitleBackground();
					loadTitleImages();
					JagFile var8 = getJagFile("config", jagChecksum[2], "config", 15);
					JagFile var9 = getJagFile("interface", jagChecksum[3], "interface", 20);
					JagFile var10 = getJagFile("2d graphics", jagChecksum[4], "media", 30);
					JagFile var11 = getJagFile("3d graphics", jagChecksum[5], "models", 40);
					JagFile var12 = getJagFile("textures", jagChecksum[6], "textures", 60);
					JagFile var13 = getJagFile("chat system", jagChecksum[7], "wordenc", 65);
					JagFile var14 = getJagFile("sound effects", jagChecksum[8], "sounds", 70);
					mapl = new byte[4][104][104];
					groundh = new int[4][105][105];
					world = new World(groundh, 104, 4, 104);

					for (int var15 = 0; var15 < 4; var15++) {
						collision[var15] = new CollisionMap(104, 104);
					}

					minimap = new Pix32(512, 512);
					drawProgress("Unpacking media", 75);
					invback = new Pix8(var10, "invback", 0);
					chatback = new Pix8(var10, "chatback", 0);
					mapback = new Pix8(var10, "mapback", 0);
					backbase1 = new Pix8(var10, "backbase1", 0);
					backbase2 = new Pix8(var10, "backbase2", 0);
					backhmid1 = new Pix8(var10, "backhmid1", 0);

					for (int var16 = 0; var16 < 13; var16++) {
						sideicons[var16] = new Pix8(var10, "sideicons", var16);
					}

					compass = new Pix32(var10, "compass", 0);

					try {
						for (int var17 = 0; var17 < 50; var17++) {
							mapscene[var17] = new Pix8(var10, "mapscene", var17);
						}
					} catch (Exception var58) {
					}

					try {
						for (int var18 = 0; var18 < 50; var18++) {
							mapfunction[var18] = new Pix32(var10, "mapfunction", var18);
						}
					} catch (Exception var57) {
					}

					try {
						for (int var19 = 0; var19 < 20; var19++) {
							hitmarks[var19] = new Pix32(var10, "hitmarks", var19);
						}
					} catch (Exception var56) {
					}

					try {
						for (int var20 = 0; var20 < 20; var20++) {
							headicons[var20] = new Pix32(var10, "headicons", var20);
						}
					} catch (Exception var55) {
					}

					mapmarker1 = new Pix32(var10, "mapflag", 0);

					for (int var21 = 0; var21 < 8; var21++) {
						cross[var21] = new Pix32(var10, "cross", var21);
					}

					mapdots1 = new Pix32(var10, "mapdots", 0);
					mapdots2 = new Pix32(var10, "mapdots", 1);
					mapdots3 = new Pix32(var10, "mapdots", 2);
					mapdots4 = new Pix32(var10, "mapdots", 3);
					scrollbar1 = new Pix8(var10, "scrollbar", 0);
					scrollbar2 = new Pix8(var10, "scrollbar", 1);
					redstone1 = new Pix8(var10, "redstone1", 0);
					redstone2 = new Pix8(var10, "redstone2", 0);
					redstone3 = new Pix8(var10, "redstone3", 0);
					redstone1h = new Pix8(var10, "redstone1", 0);
					redstone1h.hflip();
					redstone2h = new Pix8(var10, "redstone2", 0);
					redstone2h.hflip();
					redstone1v = new Pix8(var10, "redstone1", 0);
					redstone1v.vflip();
					redstone2v = new Pix8(var10, "redstone2", 0);
					redstone2v.vflip();
					redstone3v = new Pix8(var10, "redstone3", 0);
					redstone3v.vflip();
					redstone1hv = new Pix8(var10, "redstone1", 0);
					redstone1hv.hflip();
					redstone1hv.vflip();
					redstone2hv = new Pix8(var10, "redstone2", 0);
					redstone2hv.hflip();
					redstone2hv.vflip();
					Pix32 var22 = new Pix32(var10, "backleft1", 0);
					areaBackleft1 = new PixMap(getBaseComponent(), var22.wi, var22.hi);
					var22.quickPlotSprite(0, 0);
					Pix32 var23 = new Pix32(var10, "backleft2", 0);
					areaBackleft2 = new PixMap(getBaseComponent(), var23.wi, var23.hi);
					var23.quickPlotSprite(0, 0);
					Pix32 var24 = new Pix32(var10, "backright1", 0);
					areaBackright1 = new PixMap(getBaseComponent(), var24.wi, var24.hi);
					var24.quickPlotSprite(0, 0);
					Pix32 var25 = new Pix32(var10, "backright2", 0);
					areaBackright2 = new PixMap(getBaseComponent(), var25.wi, var25.hi);
					var25.quickPlotSprite(0, 0);
					Pix32 var26 = new Pix32(var10, "backtop1", 0);
					areaBacktop1 = new PixMap(getBaseComponent(), var26.wi, var26.hi);
					var26.quickPlotSprite(0, 0);
					Pix32 var27 = new Pix32(var10, "backtop2", 0);
					areaBacktop2 = new PixMap(getBaseComponent(), var27.wi, var27.hi);
					var27.quickPlotSprite(0, 0);
					Pix32 var28 = new Pix32(var10, "backvmid1", 0);
					areaBackvmid1 = new PixMap(getBaseComponent(), var28.wi, var28.hi);
					var28.quickPlotSprite(0, 0);
					Pix32 var29 = new Pix32(var10, "backvmid2", 0);
					areaBackvmid2 = new PixMap(getBaseComponent(), var29.wi, var29.hi);
					var29.quickPlotSprite(0, 0);
					Pix32 var30 = new Pix32(var10, "backvmid3", 0);
					areaBackvmid3 = new PixMap(getBaseComponent(), var30.wi, var30.hi);
					var30.quickPlotSprite(0, 0);
					Pix32 var31 = new Pix32(var10, "backhmid2", 0);
					areaBackhmid2 = new PixMap(getBaseComponent(), var31.wi, var31.hi);
					var31.quickPlotSprite(0, 0);
					int var32 = (int) (Math.random() * 21.0D) - 10;
					int var33 = (int) (Math.random() * 21.0D) - 10;
					int var34 = (int) (Math.random() * 21.0D) - 10;
					int var35 = (int) (Math.random() * 41.0D) - 20;
					for (int var36 = 0; var36 < 50; var36++) {
						if (mapfunction[var36] != null) {
							mapfunction[var36].rgbAdjust(var32 + var35, var33 + var35, var34 + var35);
						}

						if (mapscene[var36] != null) {
							mapscene[var36].rgbAdjust(var32 + var35, var33 + var35, var34 + var35);
						}
					}

					drawProgress("Unpacking textures", 80);
					Pix3D.unpackTextures(var12);
					Pix3D.initColourTable(0.8D);
					Pix3D.initPool(20);
					drawProgress("Unpacking models", 83);
					Model.unpack(var11);
					AnimBase.unpack(var11);
					AnimFrame.unpack(var11);
					drawProgress("Unpacking config", 86);
					SeqType.init(var8);
					LocType.init(var8);
					FloType.init(var8);
					ObjType.init(var8);
					NpcType.init(var8);
					IdkType.init(var8);
					SpotType.init(var8);
					VarpType.init(var8);
					ObjType.memServer = memServer;

					if (!lowMem) {
						drawProgress("Unpacking sounds", 90);
						byte[] var37 = var14.read("sounds.dat", null);
						Packet var38 = new Packet(var37);
						JagFX.init(var38);
					}

					drawProgress("Unpacking interfaces", 92);
					PixFont[] var39 = new PixFont[] { p11, p12, b12, q8 };
					IfType.unpack(var10, var39, var9);
					drawProgress("Preparing game engine", 97);

					for (int var40 = 0; var40 < 33; var40++) {
						int var41 = 999;
						int var42 = 0;
						for (int var43 = 0; var43 < 35; var43++) {
							if (mapback.data[mapback.wi * var40 + var43] == 0) {
								if (var41 == 999) {
									var41 = var43;
								}
							} else if (var41 != 999) {
								var42 = var43;
								break;
							}
						}

						compassMaskLineOffsets[var40] = var41;
						compassMaskLineLengths[var40] = var42 - var41;
					}

					for (int var44 = 9; var44 < 160; var44++) {
						int var45 = 999;
						int var46 = 0;
						for (int var47 = 10; var47 < 168; var47++) {
							if (mapback.data[mapback.wi * var44 + var47] == 0 && (var47 > 34 || var44 > 34)) {
								if (var45 == 999) {
									var45 = var47;
								}
							} else if (var45 != 999) {
								var46 = var47;
								break;
							}
						}

						minimapMaskLineOffsets[var44 - 9] = var45 - 21;
						minimapMaskLineLengths[var44 - 9] = var46 - var45;
					}

					Pix3D.setClipping(96, 479);
					chatScanline = Pix3D.scanline;
					Pix3D.setClipping(261, 190);
					sideScanline = Pix3D.scanline;
					Pix3D.setClipping(334, 512);
					gameScanline = Pix3D.scanline;
					int[] var48 = new int[9];
					for (int var49 = 0; var49 < 9; var49++) {
						int var50 = var49 * 32 + 128 + 15;
						int var51 = var50 * 3 + 600;
						int var52 = Pix3D.sinTable[var50];
						var48[var49] = var51 * var52 >> 16;
					}

					World.resetVisCalc(var48, 800, 512, 334, 500);
					WordFilter.unpack(var13);
				} catch (Exception var60) {
					errorLoading = true;
				}
			} else {
				errorHost = true;
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void buildMinimenu() {
		if (objDragArea == 0) {
			menuOption[0] = "Cancel";
			menuAction[0] = 1252;
			menuNumEntries = 1;
			addPrivateChatOptions(mouseX, mouseY);
			lastOverComId = 0;

			if (mouseX > 8 && mouseY > 11 && mouseX < 520 && mouseY < 345) {
				if (mainModalId == -1) {
					addWorldOptions();
				} else {
					addComponentOptions(mouseY, mouseX, 11, IfType.list[mainModalId], 8, 0);
				}
			}

			if (overMainComId != lastOverComId) {
				overMainComId = lastOverComId;
			}

			lastOverComId = 0;

			if (mouseX > 562 && mouseY > 231 && mouseX < 752 && mouseY < 492) {
				if (sideModalId != -1) {
					addComponentOptions(mouseY, mouseX, 231, IfType.list[sideModalId], 562, 0);
				} else if (sideIcon[activeIcon] != -1) {
					addComponentOptions(mouseY, mouseX, 231, IfType.list[sideIcon[activeIcon]], 562, 0);
				}
			}

			if (overSideComId != lastOverComId) {
				redrawSidebar = true;
				overSideComId = lastOverComId;
			}

			lastOverComId = 0;

			if (mouseX > 22 && mouseY > 375 && mouseX < 431 && mouseY < 471) {
				if (chatComId == -1) {
					addChatOptions(mouseY - 375, mouseX - 22);
				} else {
					addComponentOptions(mouseY, mouseX, 375, IfType.list[chatComId], 22, 0);
				}
			}

			if (chatComId != -1 && lastOverComId != overChatComId) {
				redrawChatback = true;
				overChatComId = lastOverComId;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < menuNumEntries - 1; var2++) {
					if (menuAction[var2] < 1000 && menuAction[var2 + 1] > 1000) {
						String var3 = menuOption[var2];
						menuOption[var2] = menuOption[var2 + 1];
						menuOption[var2 + 1] = var3;
						int var4 = menuAction[var2];
						menuAction[var2] = menuAction[var2 + 1];
						menuAction[var2 + 1] = var4;
						int var5 = menuParamB[var2];
						menuParamB[var2] = menuParamB[var2 + 1];
						menuParamB[var2 + 1] = var5;
						int var6 = menuParamC[var2];
						menuParamC[var2] = menuParamC[var2 + 1];
						menuParamC[var2 + 1] = var6;
						int var7 = menuParamA[var2];
						menuParamA[var2] = menuParamA[var2 + 1];
						menuParamA[var2 + 1] = var7;
						var1 = false;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void clearCaches() {
		LocType.mc1.clear();
		LocType.mc2.clear();
		NpcType.modelCache.clear();
		ObjType.modelcache.clear();
		ObjType.spriteCache.clear();
		ClientPlayer.modelCache.clear();
		SpotType.modelCache.clear();
	}

	@ObfuscatedName("client.w(I)V")
	public final void otherOverlays() {
		drawPrivateMessages();

		if (crossMode == 1) {
			cross[crossCycle / 100].plotSprite(crossY - 8 - 11, crossX - 8 - 8);
		}

		if (crossMode == 2) {
			cross[crossCycle / 100 + 4].plotSprite(crossY - 8 - 11, crossX - 8 - 8);
		}

		if (mainModalId != -1) {
			animateInterface(mainModalId, worldUpdateNum);
			drawInterface(0, 0, IfType.list[mainModalId], 0);
		}

		getSpecialArea();

		if (!isMenuOpen) {
			buildMinimenu();
			drawFeedback();
		} else if (menuArea == 0) {
			drawMinimenu();
		}

		if (inMultizone == 1) {
			if (wildernessLevel > 0 || worldLocationState == 1) {
				headicons[1].plotSprite(258, 472);
			} else {
				headicons[1].plotSprite(296, 472);
			}
		}

		if (wildernessLevel > 0) {
			headicons[0].plotSprite(296, 472);
			p12.centreString(329, 0xFFFF00, "Level: " + wildernessLevel, 484);
		}

		if (worldLocationState == 1) {
			headicons[6].plotSprite(296, 472);
			p12.centreString(329, 0xFFFF00, "Arena", 484);
		}

		if (rebootTimer != 0) {
			int var1 = rebootTimer / 50;
			int var2 = var1 / 60;
			var1 %= 60;
			if (var1 < 10) {
				p12.drawString(4, 329, 0xFFFF00, "System update in: " + var2 + ":0" + var1);
			} else {
				p12.drawString(4, 329, 0xFFFF00, "System update in: " + var2 + ":" + var1);
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void followCamera() {
		int var1 = localPlayer.x + macroCameraX;
		int var2 = localPlayer.z + macroCameraZ;
		if (orbitCameraX - var1 < -500 || orbitCameraX - var1 > 500 || orbitCameraZ - var2 < -500 || orbitCameraZ - var2 > 500) {
			orbitCameraX = var1;
			orbitCameraZ = var2;
		}

		if (orbitCameraX != var1) {
			orbitCameraX += (var1 - orbitCameraX) / 16;
		}

		if (orbitCameraZ != var2) {
			orbitCameraZ += (var2 - orbitCameraZ) / 16;
		}

		if (keyHeld[1] == 1) {
			orbitCameraYawVelocity += (-orbitCameraYawVelocity - 24) / 2;
		} else if (keyHeld[2] == 1) {
			orbitCameraYawVelocity += (24 - orbitCameraYawVelocity) / 2;
		} else {
			orbitCameraYawVelocity /= 2;
		}

		if (keyHeld[3] == 1) {
			orbitCameraPitchVelocity += (12 - orbitCameraPitchVelocity) / 2;
		} else if (keyHeld[4] == 1) {
			orbitCameraPitchVelocity += (-orbitCameraPitchVelocity - 12) / 2;
		} else {
			orbitCameraPitchVelocity /= 2;
		}

		orbitCameraYaw = orbitCameraYawVelocity / 2 + orbitCameraYaw & 0x7FF;
		orbitCameraPitch += orbitCameraPitchVelocity / 2;
		if (orbitCameraPitch < 128) {
			orbitCameraPitch = 128;
		}

		if (orbitCameraPitch > 383) {
			orbitCameraPitch = 383;
		}

		int var3 = orbitCameraX >> 7;
		int var4 = orbitCameraZ >> 7;
		int var5 = getAvH(minusedlevel, orbitCameraX, orbitCameraZ);
		int var6 = 0;
		if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
			for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
				for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
					int var9 = minusedlevel;
					if (var9 < 3 && (mapl[1][var7][var8] & 0x2) == 2) {
						var9++;
					}

					int var10 = var5 - groundh[var9][var7][var8];
					if (var10 > var6) {
						var6 = var10;
					}
				}
			}
		}

		int var11 = var6 * 192;
		if (var11 > 98048) {
			var11 = 98048;
		}

		if (var11 < 32768) {
			var11 = 32768;
		}

		if (var11 > cameraPitchClamp) {
			cameraPitchClamp += (var11 - cameraPitchClamp) / 24;
		} else if (var11 < cameraPitchClamp) {
			cameraPitchClamp += (var11 - cameraPitchClamp) / 80;
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void addProjectiles() {
		for (ClientProj var1 = (ClientProj) projectiles.head(); var1 != null; var1 = (ClientProj) projectiles.next()) {
			if (minusedlevel != var1.level || loopCycle > var1.t2) {
				var1.unlink();
			} else if (loopCycle >= var1.t1) {
				if (var1.endpos > 0) {
					ClientNpc var2 = npc[var1.endpos - 1];
					if (var2 != null) {
						var1.setTarget(getAvH(var1.level, var2.x, var2.z) - var1.h2, var2.z, var2.x, loopCycle);
					}
				}

				if (var1.endpos < 0) {
					int var3 = -var1.endpos - 1;
					ClientPlayer var4;
					if (selfSlot == var3) {
						var4 = localPlayer;
					} else {
						var4 = players[var3];
					}

					if (var4 != null) {
						var1.setTarget(getAvH(var1.level, var4.x, var4.z) - var1.h2, var4.z, var4.x, loopCycle);
					}
				}

				var1.move(worldUpdateNum);
				world.addDynamic((int) var1.z, 60, var1.yaw, (int) var1.x, -1, false, null, var1, (int) var1.y, minusedlevel);
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void refresh() {
		redrawFrame = true;
	}

	@ObfuscatedName("client.a(IILhb;I)V")
	public final void minimapDrawDot(int arg0, Pix32 arg1, int arg2) {
		int var4 = macroMinimapAngle + orbitCameraYaw & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = Model.sinTable[var4];
			int var7 = Model.cosTable[var4];
			var6 = var6 * 256 / (macroMinimapZoom + 256);
			var7 = var7 * 256 / (macroMinimapZoom + 256);
			int var8 = arg0 * var6 + arg2 * var7 >> 16;
			int var9 = arg0 * var7 - arg2 * var6 >> 16;
			if (var5 > 2500) {
				arg1.scanlinePlotSprite(mapback, 83 - var9 - arg1.ohi / 2, var8 + 94 - arg1.owi / 2);
			} else {
				arg1.plotSprite(83 - var9 - arg1.ohi / 2, var8 + 94 - arg1.owi / 2);
			}
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int titleFlamesMerge(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg1 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.h(II)Ljava/lang/String;")
	public final String inf(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.a(IZLx;)V")
	public final void getOverlayPos(int arg0, ClientEntity arg1) {
		getOverlayPos(arg1.z, arg1.x, arg0);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void getOverlayPos(int arg0, int arg1, int arg2) {
		if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
			int var4 = getAvH(minusedlevel, arg1, arg0) - arg2;
			arg1 -= camX;
			var4 -= camY;
			arg0 -= camZ;
			int var5 = Model.sinTable[camPitch];
			int var6 = Model.cosTable[camPitch];
			int var7 = Model.sinTable[camYaw];
			int var8 = Model.cosTable[camYaw];
			int var9 = arg0 * var7 + arg1 * var8 >> 16;
			arg0 = arg0 * var8 - arg1 * var7 >> 16;
			int var11 = var4 * var6 - arg0 * var5 >> 16;
			arg0 = arg0 * var6 + var4 * var5 >> 16;
			if (arg0 >= 50) {
				projectX = (var9 << 9) / arg0 + Pix3D.originX;
				projectY = (var11 << 9) / arg0 + Pix3D.originY;
			} else {
				projectX = -1;
				projectY = -1;
			}
		} else {
			projectX = -1;
			projectY = -1;
		}
	}

	@ObfuscatedName("client.a(IIIIZ)Z")
	public final boolean interactWithLoc(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg3 >> 14 & 0x7FFF;
		int var6 = world.typeCode2(minusedlevel, arg1, arg2, arg3);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		if (var7 == 10 || var7 == 11 || var7 == 22) {
			LocType var9 = LocType.list(var5);
			int var10;
			int var11;
			if (var8 == 0 || var8 == 2) {
				var10 = var9.width;
				var11 = var9.length;
			} else {
				var10 = var9.length;
				var11 = var9.width;
			}

			int var12 = var9.forceapproach;
			if (var8 != 0) {
				var12 = (var12 >> 4 - var8) + (var12 << var8 & 0xF);
			}

			tryMove(localPlayer.routeX[0], var10, false, arg1, localPlayer.routeZ[0], 2, var11, arg2, 0, 0, var12);
		} else {
			tryMove(localPlayer.routeX[0], 0, false, arg1, localPlayer.routeZ[0], 2, 0, arg2, var8, var7 + 1, 0);
		}

		crossX = mouseClickX;
		crossY = mouseClickY;
		crossMode = 2;
		crossCycle = 0;
		out.p1enc(arg0);
		out.p2(mapBuildBaseX + arg1);
		out.p2(mapBuildBaseZ + arg2);
		out.p2(var5);
		return true;
	}

	@ObfuscatedName("client.y(I)V")
	public final void openMenu() {
		int var1 = b12.stringWidTag("Choose Option");
		for (int var2 = 0; var2 < menuNumEntries; var2++) {
			int var3 = b12.stringWidTag(menuOption[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = menuNumEntries * 15 + 21;
		if (mouseClickX > 8 && mouseClickY > 11 && mouseClickX < 520 && mouseClickY < 345) {
			int var5 = mouseClickX - var1 / 2 - 8;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = mouseClickY - 11;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}

			if (var6 < 0) {
				var6 = 0;
			}

			isMenuOpen = true;
			menuArea = 0;
			menuX = var5;
			menuY = var6;
			menuWidth = var1;
			menuHeight = menuNumEntries * 15 + 22;
		}

		if (mouseClickX > 562 && mouseClickY > 231 && mouseClickX < 752 && mouseClickY < 492) {
			int var7 = mouseClickX - var1 / 2 - 562;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = mouseClickY - 231;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}

			isMenuOpen = true;
			menuArea = 1;
			menuX = var7;
			menuY = var8;
			menuWidth = var1;
			menuHeight = menuNumEntries * 15 + 22;
		}

		if (mouseClickX > 22 && mouseClickY > 375 && mouseClickX < 501 && mouseClickY < 471) {
			int var9 = mouseClickX - var1 / 2 - 22;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = mouseClickY - 375;
			if (var10 < 0) {
				var10 = 0;
			} else if (var4 + var10 > 96) {
				var10 = 96 - var4;
			}

			isMenuOpen = true;
			menuArea = 2;
			menuX = var9;
			menuY = var10;
			menuWidth = var1;
			menuHeight = menuNumEntries * 15 + 22;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream openUrl(String arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.openurl(arg0);
		}

		return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
	}

	@ObfuscatedName("client.j(B)V")
	public final void prepareTitle() {
		if (imageTitle2 == null) {
			drawArea = null;
			areaChat = null;
			areaMap = null;
			areaSide = null;
			areaGame = null;
			areaBackbase1 = null;
			areaBackbase2 = null;
			areaBackhmid1 = null;
			imageTitle0 = new PixMap(getBaseComponent(), 128, 265);
			Pix2D.cls();
			imageTitle1 = new PixMap(getBaseComponent(), 128, 265);
			Pix2D.cls();
			imageTitle2 = new PixMap(getBaseComponent(), 533, 186);
			Pix2D.cls();
			imageTitle3 = new PixMap(getBaseComponent(), 360, 146);
			Pix2D.cls();
			imageTitle4 = new PixMap(getBaseComponent(), 360, 200);
			Pix2D.cls();
			imageTitle5 = new PixMap(getBaseComponent(), 214, 267);
			Pix2D.cls();
			imageTitle6 = new PixMap(getBaseComponent(), 215, 267);
			Pix2D.cls();
			imageTitle7 = new PixMap(getBaseComponent(), 86, 79);
			Pix2D.cls();
			imageTitle8 = new PixMap(getBaseComponent(), 87, 79);
			Pix2D.cls();

			if (title != null) {
				loadTitleBackground();
				loadTitleImages();
			}

			redrawFrame = true;
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void renderFlames() {
		flameThread = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (flameActive) {
				updateFlames();
				updateFlames();
				drawFlames();
				var3++;
				if (var3 > 10) {
					long var5 = System.currentTimeMillis();
					int var7 = (int) (var5 - var1) / 10 - var4;
					var4 = 40 - var7;
					if (var4 < 5) {
						var4 = 5;
					}

					var3 = 0;
					var1 = var5;
				}

				try {
					Thread.sleep(var4);
				} catch (Exception var8) {
				}
			}
		} catch (Exception var9) {
		}

		flameThread = false;
	}

	public final void run() {
		if (flamesThread) {
			renderFlames();
		} else if (startMidiThread) {
			runMidi();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(IIIIIZIILhc;)V")
	public final void doScrollbar(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, IfType arg7) {
		if (scrollGrabbed) {
			scrollInputPadding = 32;
		} else {
			scrollInputPadding = 0;
		}

		scrollGrabbed = false;
		if (arg0 >= arg5 && arg0 < arg5 + 16 && arg1 >= arg6 && arg1 < arg6 + 16) {
			arg7.scrollPos -= scrollCycle * 4;

			if (arg4) {
				redrawSidebar = true;
				return;
			}
		} else if (arg0 >= arg5 && arg0 < arg5 + 16 && arg1 >= arg3 + arg6 - 16 && arg1 < arg3 + arg6) {
			arg7.scrollPos += scrollCycle * 4;

			if (arg4) {
				redrawSidebar = true;
				return;
			}
		} else if (arg0 >= arg5 - scrollInputPadding && arg0 < arg5 + scrollInputPadding + 16 && arg1 >= arg6 + 16 && arg1 < arg3 + arg6 - 16 && scrollCycle > 0) {
			int var9 = (arg3 - 32) * arg3 / arg2;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg1 - arg6 - var9 / 2 - 16;
			int var11 = arg3 - var9 - 32;
			arg7.scrollPos = (arg2 - arg3) * var10 / var11;

			if (arg4) {
				redrawSidebar = true;
			}

			scrollGrabbed = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void login(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				loginMes1 = "";
				loginMes2 = "Connecting to server...";
				titleScreenDraw();
			}

			stream = new ClientStream(this, openSocket(portOffset + 43594));
			stream.read(in.data, 0, 8);
			in.pos = 0;
			loginSeed = in.g8();
			int[] var4 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (loginSeed >> 32), (int) loginSeed };
			out.pos = 0;
			out.p1(10);
			out.p4(var4[0]);
			out.p4(var4[1]);
			out.p4(var4[2]);
			out.p4(var4[3]);
			out.p4(signlink.uid);
			out.pjstr(arg0);
			out.pjstr(arg1);
			out.rsaenc(LOGIN_RSAN, LOGIN_RSAE);
			loginout.pos = 0;

			if (arg2) {
				loginout.p1(18);
			} else {
				loginout.p1(16);
			}

			loginout.p1(out.pos + 36 + 1 + 1);
			loginout.p1(225);
			loginout.p1(lowMem ? 1 : 0);

			for (int var5 = 0; var5 < 9; var5++) {
				loginout.p4(jagChecksum[var5]);
			}

			loginout.pdata(out.data, out.pos, 0);
			out.random = new Isaac(var4);

			for (int var6 = 0; var6 < 4; var6++) {
				var4[var6] += 50;
			}

			randomIn = new Isaac(var4);
			stream.write(loginout.data, loginout.pos, 0);
			int var7 = stream.read();
			if (var7 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var15) {
				}

				login(arg0, arg1, arg2);
				return;
			}

			if (var7 == 2 || var7 == 18) {
				if (var7 == 18) {
					staffmod = true;
				} else {
					staffmod = false;
				}

				InputTracking.deactivate();
				ingame = true;
				out.pos = 0;
				in.pos = 0;
				ptype = -1;
				ptype0 = -1;
				ptype1 = -1;
				ptype2 = -1;
				psize = 0;
				timeoutTimer = 0;
				rebootTimer = 0;
				logoutTimer = 0;
				hintType = 0;
				menuNumEntries = 0;
				isMenuOpen = false;
				idleTimer = 0;

				for (int var8 = 0; var8 < 100; var8++) {
					chatText[var8] = null;
				}

				useMode = 0;
				targetMode = 0;
				sceneState = 0;
				waveCount = 0;
				macroCameraX = (int) (Math.random() * 100.0D) - 50;
				macroCameraZ = (int) (Math.random() * 110.0D) - 55;
				macroCameraAngle = (int) (Math.random() * 80.0D) - 40;
				macroMinimapAngle = (int) (Math.random() * 120.0D) - 60;
				macroMinimapZoom = (int) (Math.random() * 30.0D) - 20;
				orbitCameraYaw = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				minimapLevel = -1;
				minimapFlagX = 0;
				minimapFlagZ = 0;
				playerCount = 0;
				npcCount = 0;

				for (int var9 = 0; var9 < MAX_PLAYER_COUNT; var9++) {
					players[var9] = null;
					playerAppearanceBuffer[var9] = null;
				}

				for (int var10 = 0; var10 < 8192; var10++) {
					npc[var10] = null;
				}

				localPlayer = players[LOCAL_PLAYER_INDEX] = new ClientPlayer();
				projectiles.clear();
				spotanims.clear();
				locMerges.clear();

				for (int var11 = 0; var11 < 4; var11++) {
					for (int var12 = 0; var12 < 104; var12++) {
						for (int var13 = 0; var13 < 104; var13++) {
							groundObj[var11][var12][var13] = null;
						}
					}
				}

				locChanges = new LinkList();
				friendCount = 0;
				tutComId = -1;
				chatComId = -1;
				mainModalId = -1;
				sideModalId = -1;
				resumedPauseButton = false;
				activeIcon = 3;
				dialogInputOpen = false;
				isMenuOpen = false;
				socialInputOpen = false;
				tutComMessage = null;
				inMultizone = 0;
				tutFlashIcon = -1;
				idkDesignGender = true;
				validateIdkDesign();

				for (int var14 = 0; var14 < 5; var14++) {
					idkDesignColour[var14] = 0;
				}

				oplogic1 = 0;
				oplogic2 = 0;
				oplogic3 = 0;
				oplogic4 = 0;
				oplogic5 = 0;
				oplogic6 = 0;
				oplogic7 = 0;
				oplogic8 = 0;
				oplogic9 = 0;
				prepareGame();
				return;
			}

			if (var7 == 3) {
				loginMes1 = "";
				loginMes2 = "Invalid username or password.";
				return;
			}

			if (var7 == 4) {
				loginMes1 = "Your account has been disabled.";
				loginMes2 = "Please check your message-centre for details.";
				return;
			}

			if (var7 == 5) {
				loginMes1 = "Your account is already logged in.";
				loginMes2 = "Try again in 60 secs...";
				return;
			}

			if (var7 == 6) {
				loginMes1 = "RuneScape has been updated!";
				loginMes2 = "Please reload this page.";
				return;
			}

			if (var7 == 7) {
				loginMes1 = "This world is full.";
				loginMes2 = "Please use a different world.";
				return;
			}

			if (var7 == 8) {
				loginMes1 = "Unable to connect.";
				loginMes2 = "Login server offline.";
				return;
			}

			if (var7 == 9) {
				loginMes1 = "Login limit exceeded.";
				loginMes2 = "Too many connections from your address.";
				return;
			}

			if (var7 == 10) {
				loginMes1 = "Unable to connect.";
				loginMes2 = "Bad session id.";
				return;
			}

			if (var7 == 11) {
				loginMes2 = "Login server rejected session.";
				loginMes2 = "Please try again.";
				return;
			}

			if (var7 == 12) {
				loginMes1 = "You need a members account to login to this world.";
				loginMes2 = "Please subscribe, or use a different world.";
				return;
			}

			if (var7 == 13) {
				loginMes1 = "Could not complete login.";
				loginMes2 = "Please try using a different world.";
				return;
			}

			if (var7 == 14) {
				loginMes1 = "The server is being updated.";
				loginMes2 = "Please wait 1 minute and try again.";
				return;
			}

			if (var7 == 15) {
				ingame = true;
				out.pos = 0;
				in.pos = 0;
				ptype = -1;
				ptype0 = -1;
				ptype1 = -1;
				ptype2 = -1;
				psize = 0;
				timeoutTimer = 0;
				rebootTimer = 0;
				menuNumEntries = 0;
				isMenuOpen = false;
				return;
			}

			if (var7 == 16) {
				loginMes1 = "Login attempts exceeded.";
				loginMes2 = "Please wait 1 minute and try again.";
				return;
			}

			if (var7 == 17) {
				loginMes1 = "You are standing in a members-only area.";
				loginMes2 = "To play on this world move to a free area first";
				return;
			}
		} catch (IOException var16) {
			loginMes1 = "";
			loginMes2 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void locChangeUnchecked(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 >= 1 && arg2 >= 1 && arg1 <= 102 && arg2 <= 102) {
			if (lowMem && minusedlevel != arg6) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg3 == 0) {
				var8 = world.wallType(arg6, arg1, arg2);
			}

			if (arg3 == 1) {
				var8 = world.decorType(arg6, arg2, arg1);
			}

			if (arg3 == 2) {
				var8 = world.sceneType(arg6, arg1, arg2);
			}

			if (arg3 == 3) {
				var8 = world.gdType(arg6, arg1, arg2);
			}

			if (var8 != 0) {
				int var12 = world.typeCode2(arg6, arg1, arg2, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg3 == 0) {
					world.delWall(arg1, arg6, arg2);
					LocType var16 = LocType.list(var13);
					if (var16.blockwalk) {
						collision[arg6].delWall(var16.blockrange, var15, arg1, arg2, var14);
					}
				}

				if (arg3 == 1) {
					world.delDecor(arg6, arg2, arg1);
				}

				if (arg3 == 2) {
					world.delLoc(arg1, arg2, arg6);
					LocType var17 = LocType.list(var13);
					if (var17.width + arg1 > 103 || var17.width + arg2 > 103 || var17.length + arg1 > 103 || var17.length + arg2 > 103) {
						return;
					}

					if (var17.blockwalk) {
						collision[arg6].delLoc(arg2, arg1, var15, var17.width, var17.blockrange, var17.length);
					}
				}

				if (arg3 == 3) {
					world.delGroundDecor(arg6, arg1, arg2);
					LocType var18 = LocType.list(var13);
					if (var18.blockwalk && var18.active) {
						collision[arg6].unblockGround(arg2, arg1);
					}
				}
			}

			if (arg4 >= 0) {
				int var19 = arg6;
				if (arg6 < 3 && (mapl[1][arg1][arg2] & 0x2) == 2) {
					var19 = arg6 + 1;
				}

				ClientBuild.changeLocUnchecked(arg1, locAnims, collision[arg6], arg2, arg0, groundh, arg6, arg4, arg5, world, var19);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void addFriend(long arg0) {
		if (arg0 != 0L) {
			if (friendCount >= 100) {
				addChat(0, "Your friends list is full. Max of 100 hit", "");
			} else {
				String var3 = JString.toScreenName(JString.toRawUsername(arg0));
				for (int var4 = 0; var4 < friendCount; var4++) {
					if (friendUserhash[var4] == arg0) {
						addChat(0, var3 + " is already on your friend list", "");
						return;
					}
				}

				for (int var5 = 0; var5 < ignoreCount; var5++) {
					if (ignoreUserhash[var5] == arg0) {
						addChat(0, "Please remove " + var3 + " from your ignore list first", "");
						return;
					}
				}

				if (!var3.equals(localPlayer.name)) {
					friendUsername[friendCount] = var3;
					friendUserhash[friendCount] = arg0;
					friendNodeId[friendCount] = 0;
					friendCount++;
					redrawSidebar = true;
					out.p1enc(118);
					out.p8(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(B)V")
	public final void mainquit() {
		signlink.reporterror = false;

		try {
			if (stream != null) {
				stream.close();
			}
		} catch (Exception var1) {
		}

		stream = null;
		stopMidi();
		midiThreadActive = false;
		out = null;
		loginout = null;
		in = null;
		mapBuildIndex = null;
		mapBuildGroundData = null;
		mapBuildLocationData = null;
		groundh = null;
		mapl = null;
		world = null;
		collision = null;
		dirMap = null;
		distMap = null;
		routeX = null;
		routeZ = null;
		textureBuffer = null;
		areaSide = null;
		areaMap = null;
		areaGame = null;
		areaChat = null;
		areaBackbase1 = null;
		areaBackbase2 = null;
		areaBackhmid1 = null;
		areaBackleft1 = null;
		areaBackleft2 = null;
		areaBackright1 = null;
		areaBackright2 = null;
		areaBacktop1 = null;
		areaBacktop2 = null;
		areaBackvmid1 = null;
		areaBackvmid2 = null;
		areaBackvmid3 = null;
		areaBackhmid2 = null;
		invback = null;
		mapback = null;
		chatback = null;
		backbase1 = null;
		backbase2 = null;
		backhmid1 = null;
		sideicons = null;
		redstone1 = null;
		redstone2 = null;
		redstone3 = null;
		redstone1h = null;
		redstone2h = null;
		redstone1v = null;
		redstone2v = null;
		redstone3v = null;
		redstone1hv = null;
		redstone2hv = null;
		compass = null;
		hitmarks = null;
		headicons = null;
		cross = null;
		mapdots1 = null;
		mapdots2 = null;
		mapdots3 = null;
		mapdots4 = null;
		mapscene = null;
		mapfunction = null;
		tileLastOccupiedCycle = null;
		players = null;
		playerIds = null;
		entityUpdateIds = null;
		playerAppearanceBuffer = null;
		entityRemovalIds = null;
		npc = null;
		npcIds = null;
		groundObj = null;
		locChanges = null;
		locMerges = null;
		projectiles = null;
		spotanims = null;
		locAnims = null;
		menuParamB = null;
		menuParamC = null;
		menuAction = null;
		menuParamA = null;
		menuOption = null;
		var = null;
		activeMapFunctionX = null;
		activeMapFunctionZ = null;
		activeMapFunctions = null;
		minimap = null;
		friendUsername = null;
		friendUserhash = null;
		friendNodeId = null;
		imageTitle0 = null;
		imageTitle1 = null;
		imageTitle2 = null;
		imageTitle3 = null;
		imageTitle4 = null;
		imageTitle5 = null;
		imageTitle6 = null;
		imageTitle7 = null;
		imageTitle8 = null;
		unloadTitle();
		LocType.unload();
		NpcType.unload();
		ObjType.unload();
		FloType.list = null;
		IdkType.list = null;
		IfType.list = null;
		UnkType.list = null;
		SeqType.list = null;
		SpotType.list = null;
		SpotType.modelCache = null;
		VarpType.list = null;
		drawArea = null;
		ClientPlayer.modelCache = null;
		Pix3D.unload();
		World.unload();
		Model.unload();
		AnimBase.list = null;
		AnimFrame.list = null;
		System.gc();
	}

	@ObfuscatedName("client.A(I)Ljava/net/Socket;")
	public final Socket openSocket(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.a(ZIILz;I)V")
	public final void addPlayerOptions(int arg0, int arg1, ClientPlayer arg2, int arg3) {
		if (localPlayer != arg2 && menuNumEntries < 400) {
			String var5 = arg2.name + combatColourCode(localPlayer.combatLevel, arg2.combatLevel) + " (level-" + arg2.combatLevel + ")";
			if (useMode == 1) {
				menuOption[menuNumEntries] = "Use " + objSelectedName + " with @whi@" + var5;
				menuAction[menuNumEntries] = 367;
				menuParamA[menuNumEntries] = arg1;
				menuParamB[menuNumEntries] = arg3;
				menuParamC[menuNumEntries] = arg0;
				menuNumEntries++;
			} else if (targetMode != 1) {
				menuOption[menuNumEntries] = "Follow @whi@" + var5;
				menuAction[menuNumEntries] = 1544;
				menuParamA[menuNumEntries] = arg1;
				menuParamB[menuNumEntries] = arg3;
				menuParamC[menuNumEntries] = arg0;
				menuNumEntries++;
				if (chatDisabled == 0) {
					menuOption[menuNumEntries] = "Trade with @whi@" + var5;
					menuAction[menuNumEntries] = 1373;
					menuParamA[menuNumEntries] = arg1;
					menuParamB[menuNumEntries] = arg3;
					menuParamC[menuNumEntries] = arg0;
					menuNumEntries++;
				}

				if (wildernessLevel > 0) {
					menuOption[menuNumEntries] = "Attack @whi@" + var5;

					if (localPlayer.combatLevel >= arg2.combatLevel) {
						menuAction[menuNumEntries] = 151;
					} else {
						menuAction[menuNumEntries] = 2151;
					}

					menuParamA[menuNumEntries] = arg1;
					menuParamB[menuNumEntries] = arg3;
					menuParamC[menuNumEntries] = arg0;
					menuNumEntries++;
				}

				if (worldLocationState == 1) {
					menuOption[menuNumEntries] = "Fight @whi@" + var5;
					menuAction[menuNumEntries] = 151;
					menuParamA[menuNumEntries] = arg1;
					menuParamB[menuNumEntries] = arg3;
					menuParamC[menuNumEntries] = arg0;
					menuNumEntries++;
				}

				if (worldLocationState == 2) {
					menuOption[menuNumEntries] = "Duel-with @whi@" + var5;
					menuAction[menuNumEntries] = 1101;
					menuParamA[menuNumEntries] = arg1;
					menuParamB[menuNumEntries] = arg3;
					menuParamC[menuNumEntries] = arg0;
					menuNumEntries++;
				}
			} else if ((targetMask & 0x8) == 8) {
				menuOption[menuNumEntries] = targetOp + " @whi@" + var5;
				menuAction[menuNumEntries] = 651;
				menuParamA[menuNumEntries] = arg1;
				menuParamB[menuNumEntries] = arg3;
				menuParamC[menuNumEntries] = arg0;
				menuNumEntries++;
			}

			for (int var6 = 0; var6 < menuNumEntries; var6++) {
				if (menuAction[var6] == 660) {
					menuOption[var6] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void gameLoop() {
		if (rebootTimer > 1) {
			rebootTimer--;
		}

		if (logoutTimer > 0) {
			logoutTimer--;
		}

		for (int var1 = 0; var1 < 5 && tcpIn(); var1++) {
		}

		if (ingame) {
			for (int var2 = 0; var2 < waveCount; var2++) {
				if (waveDelay[var2] <= 0) {
					boolean var3 = false;
					try {
						if (waveIds[var2] != lastWaveId || waveLoops[var2] != lastWaveLoops) {
							Packet var4 = JagFX.generate(waveLoops[var2], waveIds[var2]);
							if (System.currentTimeMillis() + var4.pos / 22 > lastWaveLength / 22 + lastWaveStartTime) {
								lastWaveLength = var4.pos;
								lastWaveStartTime = System.currentTimeMillis();

								if (saveWave(var4.data, var4.pos)) {
									lastWaveId = waveIds[var2];
									lastWaveLoops = waveLoops[var2];
								} else {
									var3 = true;
								}
							}
						} else if (!replayWave()) {
							var3 = true;
						}
					} catch (Exception var20) {
					}

					if (var3 && waveDelay[var2] != -5) {
						waveDelay[var2] = -5;
					} else {
						waveCount--;
						for (int var6 = var2; var6 < waveCount; var6++) {
							waveIds[var6] = waveIds[var6 + 1];
							waveLoops[var6] = waveLoops[var6 + 1];
							waveDelay[var6] = waveDelay[var6 + 1];
						}

						var2--;
					}
				} else {
					waveDelay[var2]--;
				}
			}

			if (nextMusicDelay > 0) {
				nextMusicDelay -= 20;
				if (nextMusicDelay < 0) {
					nextMusicDelay = 0;
				}

				if (nextMusicDelay == 0 && midiActive && !lowMem) {
					playMidi(midiCrc, currentMidi, midiSize);
				}
			}

			Packet var7 = InputTracking.flush();
			if (var7 != null) {
				out.p1enc(81);
				out.p2(var7.pos);
				out.pdata(var7.data, var7.pos, 0);
				var7.release();
			}

			timeoutTimer++;
			if (timeoutTimer > 750) {
				lostCon();
			}

			movePlayers();
			moveNpcs();
			timeoutChat();
			locChangeDoQueue();

			if ((keyHeld[1] == 1 || keyHeld[2] == 1 || keyHeld[3] == 1 || keyHeld[4] == 1) && sendCameraDelay++ > 5) {
				sendCameraDelay = 0;
				out.p1enc(189);
				out.p2(orbitCameraPitch);
				out.p2(orbitCameraYaw);
				out.p1(macroMinimapAngle);
				out.p1(macroMinimapZoom);
			}

			worldUpdateNum++;

			if (crossMode != 0) {
				crossCycle += 20;
				if (crossCycle >= 400) {
					crossMode = 0;
				}
			}

			if (selectedArea != 0) {
				selectedCycle++;
				if (selectedCycle >= 15) {
					if (selectedArea == 2) {
						redrawSidebar = true;
					}

					if (selectedArea == 3) {
						redrawChatback = true;
					}

					selectedArea = 0;
				}
			}

			if (objDragArea != 0) {
				objDragCycle++;

				if (mouseX > objGrabX + 5 || mouseX < objGrabX - 5 || mouseY > objGrabY + 5 || mouseY < objGrabY - 5) {
					objGrabThreshold = true;
				}

				if (mouseButton == 0) {
					if (objDragArea == 2) {
						redrawSidebar = true;
					}

					if (objDragArea == 3) {
						redrawChatback = true;
					}

					objDragArea = 0;

					if (objGrabThreshold && objDragCycle >= 5) {
						hoveredSlotComId = -1;
						buildMinimenu();

						if (hoveredSlotComId == objDragComId && hoveredSlot != objDragSlot) {
							IfType var8 = IfType.list[objDragComId];
							int var9 = var8.linkObjType[hoveredSlot];
							var8.linkObjType[hoveredSlot] = var8.linkObjType[objDragSlot];
							var8.linkObjType[objDragSlot] = var9;
							int var10 = var8.linkObjNumber[hoveredSlot];
							var8.linkObjNumber[hoveredSlot] = var8.linkObjNumber[objDragSlot];
							var8.linkObjNumber[objDragSlot] = var10;
							out.p1enc(159);
							out.p2(objDragComId);
							out.p2(objDragSlot);
							out.p2(hoveredSlot);
						}
					} else if ((oneMouseButton == 1 || isAddFriendOption(menuNumEntries - 1)) && menuNumEntries > 2) {
						openMenu();
					} else if (menuNumEntries > 0) {
						doAction(menuNumEntries - 1);
					}

					selectedCycle = 10;
					mouseClickButton = 0;
				}
			}

			cyclelogic3++;
			if (cyclelogic3 > 127) {
				cyclelogic3 = 0;
				out.p1enc(215);
				out.p3(0x4C2B2C);
			}

			if (World.groundX != -1) {
				int var11 = World.groundX;
				int var12 = World.groundZ;
				boolean var13 = tryMove(localPlayer.routeX[0], 0, true, var11, localPlayer.routeZ[0], 0, 0, var12, 0, 0, 0);
				World.groundX = -1;

				if (var13) {
					crossX = mouseClickX;
					crossY = mouseClickY;
					crossMode = 1;
					crossCycle = 0;
				}
			}

			if (mouseClickButton == 1 && tutComMessage != null) {
				tutComMessage = null;
				redrawChatback = true;
				mouseClickButton = 0;
			}

			mouseLoop();
			minimapLoop();
			iconLoop();
			chatModeLoop();

			if (mouseButton == 1 || mouseClickButton == 1) {
				scrollCycle++;
			}

			if (sceneState == 2) {
				followCamera();
			}

			if (sceneState == 2 && cinemaCam) {
				cinemaCamera();
			}

			for (int var14 = 0; var14 < 5; var14++) {
				camShakeCycle[var14]++;
			}

			handleInputKey();
			idleTimer++;
			if (idleTimer > 4500) {
				logoutTimer = 250;
				idleTimer -= 500;
				out.p1enc(70);
			}

			macroCameraCycle++;
			if (macroCameraCycle > 500) {
				macroCameraCycle = 0;
				int var15 = (int) (Math.random() * 8.0D);
				if ((var15 & 0x1) == 1) {
					macroCameraX += macroCameraXModifier;
				}

				if ((var15 & 0x2) == 2) {
					macroCameraZ += macroCameraZModifier;
				}

				if ((var15 & 0x4) == 4) {
					macroCameraAngle += macroCameraAngleModifier;
				}
			}

			if (macroCameraX < -50) {
				macroCameraXModifier = 2;
			}

			if (macroCameraX > 50) {
				macroCameraXModifier = -2;
			}

			if (macroCameraZ < -55) {
				macroCameraZModifier = 2;
			}

			if (macroCameraZ > 55) {
				macroCameraZModifier = -2;
			}

			if (macroCameraAngle < -40) {
				macroCameraAngleModifier = 1;
			}

			if (macroCameraAngle > 40) {
				macroCameraAngleModifier = -1;
			}

			macroMinimapCycle++;
			if (macroMinimapCycle > 500) {
				macroMinimapCycle = 0;
				int var16 = (int) (Math.random() * 8.0D);
				if ((var16 & 0x1) == 1) {
					macroMinimapAngle += macroMinimapAngleModifier;
				}

				if ((var16 & 0x2) == 2) {
					macroMinimapZoom += macroMinimapZoomModifier;
				}
			}

			if (macroMinimapAngle < -60) {
				macroMinimapAngleModifier = 2;
			}

			if (macroMinimapAngle > 60) {
				macroMinimapAngleModifier = -2;
			}

			if (macroMinimapZoom < -20) {
				macroMinimapZoomModifier = 1;
			}

			if (macroMinimapZoom > 10) {
				macroMinimapZoomModifier = -1;
			}

			cyclelogic4++;
			if (cyclelogic4 > 110) {
				cyclelogic4 = 0;
				out.p1enc(236);
				out.p4(0);
			}

			noTimeoutTimer++;
			if (noTimeoutTimer > 50) {
				out.p1enc(108);
			}

			try {
				if (stream != null && out.pos > 0) {
					stream.write(out.data, out.pos, 0);
					out.pos = 0;
					noTimeoutTimer = 0;
				}
			} catch (IOException var18) {
				lostCon();
			} catch (Exception var19) {
				logout();
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void drawFeedback() {
		if (menuNumEntries >= 2 || useMode != 0 || targetMode != 0) {
			String var1;
			if (useMode == 1 && menuNumEntries < 2) {
				var1 = "Use " + objSelectedName + " with...";
			} else if (targetMode == 1 && menuNumEntries < 2) {
				var1 = targetOp + "...";
			} else {
				var1 = menuOption[menuNumEntries - 1];
			}

			if (menuNumEntries > 2) {
				var1 = var1 + "@whi@ / " + (menuNumEntries - 2) + " more options";
			}

			b12.drawStringAntiMacro(loopCycle / 1000, true, 15, 0xFFFFFF, var1, 4);
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void addMapAnim() {
		for (MapSpotAnim var1 = (MapSpotAnim) spotanims.head(); var1 != null; var1 = (MapSpotAnim) spotanims.next()) {
			if (minusedlevel != var1.level || var1.animComplete) {
				var1.unlink();
			} else if (loopCycle >= var1.startCycle) {
				var1.update(worldUpdateNum);

				if (var1.animComplete) {
					var1.unlink();
				} else {
					world.addDynamic(var1.z, 60, 0, var1.x, -1, false, null, var1, var1.y, var1.level);
				}
			}
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (frame != null) {
				return new URL("http://127.0.0.1:" + (portOffset + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	@ObfuscatedName("client.B(I)V")
	public static final void setHighMem() {
		World.lowMem = false;
		Pix3D.lowMem = false;
		lowMem = false;
		ClientBuild.lowMem = false;
	}

	@ObfuscatedName("client.a(IIZIIIIIIIII)Z")
	public final boolean tryMove(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				dirMap[var14][var15] = 0;
				distMap[var14][var15] = 99999999;
			}
		}

		int var16 = arg0;
		int var17 = arg4;
		dirMap[arg0][arg4] = 99;
		distMap[arg0][arg4] = 0;
		byte var18 = 0;
		int var19 = 0;
		routeX[var18] = arg0;
		int var35 = var18 + 1;
		routeZ[var18] = arg4;
		boolean var20 = false;
		int var21 = routeX.length;
		int[][] var22 = collision[minusedlevel].flags;
		while (var35 != var19) {
			var16 = routeX[var19];
			var17 = routeZ[var19];
			var19 = (var19 + 1) % var21;

			if (arg3 == var16 && arg7 == var17) {
				var20 = true;
				break;
			}

			if (arg9 != 0) {
				if ((arg9 < 5 || arg9 == 10) && collision[minusedlevel].testWall(arg8, arg7, arg9 - 1, var17, arg3, var16)) {
					var20 = true;
					break;
				}

				if (arg9 < 10 && collision[minusedlevel].testWDecor(arg8, arg9 - 1, var16, arg3, var17, arg7)) {
					var20 = true;
					break;
				}
			}

			if (arg1 != 0 && arg6 != 0 && collision[minusedlevel].testLoc(var17, arg6, var16, arg3, arg10, arg7, arg1)) {
				var20 = true;
				break;
			}

			int var23 = distMap[var16][var17] + 1;
			if (var16 > 0 && dirMap[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				routeX[var35] = var16 - 1;
				routeZ[var35] = var17;
				var35 = (var35 + 1) % var21;
				dirMap[var16 - 1][var17] = 2;
				distMap[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && dirMap[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				routeX[var35] = var16 + 1;
				routeZ[var35] = var17;
				var35 = (var35 + 1) % var21;
				dirMap[var16 + 1][var17] = 8;
				distMap[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && dirMap[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				routeX[var35] = var16;
				routeZ[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				dirMap[var16][var17 - 1] = 1;
				distMap[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && dirMap[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				routeX[var35] = var16;
				routeZ[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				dirMap[var16][var17 + 1] = 4;
				distMap[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && dirMap[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				routeX[var35] = var16 - 1;
				routeZ[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				dirMap[var16 - 1][var17 - 1] = 3;
				distMap[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && dirMap[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				routeX[var35] = var16 + 1;
				routeZ[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				dirMap[var16 + 1][var17 - 1] = 9;
				distMap[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && dirMap[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				routeX[var35] = var16 - 1;
				routeZ[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				dirMap[var16 - 1][var17 + 1] = 6;
				distMap[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && dirMap[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				routeX[var35] = var16 + 1;
				routeZ[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				dirMap[var16 + 1][var17 + 1] = 12;
				distMap[var16 + 1][var17 + 1] = var23;
			}
		}

		tryMoveNearest = 0;
		if (!var20) {
			if (arg2) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg3 - var25; var26 <= arg3 + var25; var26++) {
						for (int var27 = arg7 - var25; var27 <= arg7 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && distMap[var26][var27] < var24) {
								var24 = distMap[var26][var27];
								var16 = var26;
								var17 = var27;
								tryMoveNearest = 1;
								var20 = true;
							}
						}
					}

					if (var20) {
						break;
					}
				}
			}

			if (!var20) {
				return false;
			}
		}

		byte var28 = 0;
		routeX[var28] = var16;
		int var36 = var28 + 1;
		routeZ[var28] = var17;
		int var29;
		int var30 = var29 = dirMap[var16][var17];
		while (arg0 != var16 || arg4 != var17) {
			if (var29 != var30) {
				var29 = var30;
				routeX[var36] = var16;
				routeZ[var36++] = var17;
			}

			if ((var30 & 0x2) != 0) {
				var16++;
			} else if ((var30 & 0x8) != 0) {
				var16--;
			}

			if ((var30 & 0x1) != 0) {
				var17++;
			} else if ((var30 & 0x4) != 0) {
				var17--;
			}

			var30 = dirMap[var16][var17];
		}

		if (var36 <= 0) {
			if (arg5 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = routeX[var36];
		int var33 = routeZ[var36];

		if (arg5 == 0) {
			out.p1enc(181);
			out.p1(var31 + var31 + 3);
		}

		if (arg5 == 1) {
			out.p1enc(165);
			out.p1(var31 + var31 + 3 + 14);
		}

		if (arg5 == 2) {
			out.p1enc(93);
			out.p1(var31 + var31 + 3);
		}

		if (keyHeld[5] == 1) {
			out.p1(1);
		} else {
			out.p1(0);
		}

		out.p2(mapBuildBaseX + var32);
		out.p2(mapBuildBaseZ + var33);
		minimapFlagX = routeX[0];
		minimapFlagZ = routeZ[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			out.p1(routeX[var36] - var32);
			out.p1(routeZ[var36] - var33);
		}

		return true;
	}

	@ObfuscatedName("client.a(ZI)Ljava/lang/String;")
	public static final String invNumber(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.b(Lkb;II)V")
	public final void getPlayerPos(Packet arg0, int arg1) {
		entityRemovalCount = 0;
		entityUpdateCount = 0;
		getPlayerPosLocal(arg1, arg0);
		getPlayerPosOldVis(arg1, arg0);
		getPlayerPosNewVis(arg1, arg0);
		getPlayerPosExtended(arg1, arg0);

		for (int var3 = 0; var3 < entityRemovalCount; var3++) {
			int var4 = entityRemovalIds[var3];
			if (loopCycle != players[var4].cycle) {
				players[var4] = null;
			}
		}

		if (arg0.pos != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.pos + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < playerCount; var5++) {
			if (players[playerIds[var5]] == null) {
				signlink.reporterror(loginUser + " null entry in pl list - pos:" + var5 + " size:" + playerCount);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.d(III)Z")
	public final boolean animateInterface(int arg0, int arg1) {
		boolean var3 = false;
		IfType var4 = IfType.list[arg0];
		for (int var5 = 0; var5 < var4.children.length && var4.children[var5] != -1; var5++) {
			IfType var6 = IfType.list[var4.children[var5]];
			if (var6.type == 1) {
				var3 |= animateInterface(var6.id, arg1);
			}

			if (var6.type == 6 && (var6.modelAnim != -1 || var6.modelAnim2 != -1)) {
				boolean var7 = getIfActive(var6);
				int var8;
				if (var7) {
					var8 = var6.modelAnim2;
				} else {
					var8 = var6.modelAnim;
				}

				if (var8 != -1) {
					SeqType var9 = SeqType.list[var8];
					var6.animCycle += arg1;
					while (var6.animCycle > var9.delay[var6.animFrame]) {
						var6.animCycle -= var9.delay[var6.animFrame] + 1;
						var6.animFrame++;
						if (var6.animFrame >= var9.numFrames) {
							var6.animFrame -= var9.loops;
							if (var6.animFrame < 0 || var6.animFrame >= var9.numFrames) {
								var6.animFrame = 0;
							}
						}

						var3 = true;
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;BLjava/lang/String;)V")
	public final void addChat(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && tutComId != -1) {
			tutComMessage = arg1;
			mouseClickButton = 0;
		}

		if (chatComId == -1) {
			redrawChatback = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			chatType[var4] = chatType[var4 - 1];
			chatUsername[var4] = chatUsername[var4 - 1];
			chatText[var4] = chatText[var4 - 1];
		}

		chatType[0] = arg0;
		chatUsername[0] = arg2;
		chatText[0] = arg1;
	}

	@ObfuscatedName("client.i(II)V")
	public final void ifAnimReset(int arg0) {
		IfType var2 = IfType.list[arg0];
		for (int var3 = 0; var3 < var2.children.length && var2.children[var3] != -1; var3++) {
			IfType var4 = IfType.list[var2.children[var3]];
			if (var4.type == 1) {
				ifAnimReset(var4.id);
			}

			var4.animFrame = 0;
			var4.animCycle = 0;
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void delFriend(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < friendCount; var3++) {
				if (friendUserhash[var3] == arg0) {
					friendCount--;
					redrawSidebar = true;

					for (int var4 = var3; var4 < friendCount; var4++) {
						friendUsername[var4] = friendUsername[var4 + 1];
						friendNodeId[var4] = friendNodeId[var4 + 1];
						friendUserhash[var4] = friendUserhash[var4 + 1];
					}

					out.p1enc(11);
					out.p8(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lhc;I)Z")
	public final boolean getIfActive(IfType arg0) {
		if (arg0.scriptComparator == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.scriptComparator.length; var2++) {
			int var3 = getIfVar(arg0, var2);
			int var4 = arg0.scriptOperand[var2];
			if (arg0.scriptComparator[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.scriptComparator[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.scriptComparator[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}

		return true;
	}

	@ObfuscatedName("client.l(B)V")
	public final void minimapLoop() {
		if (mouseClickButton == 1) {
			int var1 = mouseClickX - 21 - 561;
			int var2 = mouseClickY - 9 - 5;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = macroMinimapAngle + orbitCameraYaw & 0x7FF;
				int var4 = Pix3D.sinTable[var3];
				int var5 = Pix3D.cosTable[var3];
				var4 = (macroMinimapZoom + 256) * var4 >> 8;
				var5 = (macroMinimapZoom + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = localPlayer.x + var6 >> 7;
				int var9 = localPlayer.z - var7 >> 7;
				boolean var10 = tryMove(localPlayer.routeX[0], 0, true, var8, localPlayer.routeZ[0], 1, 0, var9, 0, 0, 0);
				if (var10) {
					out.p1(var1);
					out.p1(var2);
					out.p2(orbitCameraYaw);
					out.p1(57);
					out.p1(macroMinimapAngle);
					out.p1(macroMinimapZoom);
					out.p1(89);
					out.p2(localPlayer.x);
					out.p2(localPlayer.z);
					out.p1(tryMoveNearest);
					out.p1(63);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void mouseLoop() {
		if (objDragArea == 0) {
			int var1 = mouseClickButton;
			if (targetMode == 1 && mouseClickX >= 520 && mouseClickY >= 165 && mouseClickX <= 788 && mouseClickY <= 230) {
				var1 = 0;
			}

			if (isMenuOpen) {
				if (var1 != 1) {
					int var2 = mouseX;
					int var3 = mouseY;
					if (menuArea == 0) {
						var2 -= 8;
						var3 -= 11;
					}

					if (menuArea == 1) {
						var2 -= 562;
						var3 -= 231;
					}

					if (menuArea == 2) {
						var2 -= 22;
						var3 -= 375;
					}

					if (var2 < menuX - 10 || var2 > menuWidth + menuX + 10 || var3 < menuY - 10 || var3 > menuHeight + menuY + 10) {
						isMenuOpen = false;

						if (menuArea == 1) {
							redrawSidebar = true;
						}

						if (menuArea == 2) {
							redrawChatback = true;
						}
					}
				}

				if (var1 == 1) {
					int var4 = menuX;
					int var5 = menuY;
					int var6 = menuWidth;
					int var7 = mouseClickX;
					int var8 = mouseClickY;
					if (menuArea == 0) {
						var7 -= 8;
						var8 -= 11;
					}

					if (menuArea == 1) {
						var7 -= 562;
						var8 -= 231;
					}

					if (menuArea == 2) {
						var7 -= 22;
						var8 -= 375;
					}

					int var9 = -1;
					for (int var10 = 0; var10 < menuNumEntries; var10++) {
						int var11 = (menuNumEntries - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						doAction(var9);
					}

					isMenuOpen = false;

					if (menuArea == 1) {
						redrawSidebar = true;
					}

					if (menuArea == 2) {
						redrawChatback = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && menuNumEntries > 0) {
					int var12 = menuAction[menuNumEntries - 1];
					if (var12 == 602 || var12 == 596 || var12 == 22 || var12 == 892 || var12 == 415 || var12 == 405 || var12 == 38 || var12 == 422 || var12 == 478 || var12 == 347 || var12 == 188) {
						int var13 = menuParamB[menuNumEntries - 1];
						int var14 = menuParamC[menuNumEntries - 1];
						IfType var15 = IfType.list[var14];
						if (var15.objSwap) {
							objGrabThreshold = false;
							objDragCycle = 0;
							objDragComId = var14;
							objDragSlot = var13;
							objDragArea = 2;
							objGrabX = mouseClickX;
							objGrabY = mouseClickY;

							if (IfType.list[var14].layerId == mainModalId) {
								objDragArea = 1;
							}

							if (IfType.list[var14].layerId == chatComId) {
								objDragArea = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (oneMouseButton == 1 || isAddFriendOption(menuNumEntries - 1)) && menuNumEntries > 2) {
					var1 = 2;
				}

				if (var1 == 1 && menuNumEntries > 0) {
					doAction(menuNumEntries - 1);
				}

				if (var1 != 2 || menuNumEntries <= 0) {
					return;
				}

				openMenu();
			}
		}
	}

	@ObfuscatedName("client.n(B)V")
	public final void cinemaCamera() {
		int var1 = camMoveToLx * 128 + 64;
		int var2 = camMoveToLz * 128 + 64;
		int var3 = getAvH(minusedlevel, camMoveToLx, camMoveToLz) - camMoveToHei;

		if (camX < var1) {
			camX += (var1 - camX) * camMoveToRate2 / 1000 + camMoveToRate;
			if (camX > var1) {
				camX = var1;
			}
		}

		if (camX > var1) {
			camX -= (camX - var1) * camMoveToRate2 / 1000 + camMoveToRate;
			if (camX < var1) {
				camX = var1;
			}
		}

		if (camY < var3) {
			camY += (var3 - camY) * camMoveToRate2 / 1000 + camMoveToRate;
			if (camY > var3) {
				camY = var3;
			}
		}

		if (camY > var3) {
			camY -= (camY - var3) * camMoveToRate2 / 1000 + camMoveToRate;
			if (camY < var3) {
				camY = var3;
			}
		}

		if (camZ < var2) {
			camZ += (var2 - camZ) * camMoveToRate2 / 1000 + camMoveToRate;
			if (camZ > var2) {
				camZ = var2;
			}
		}

		if (camZ > var2) {
			camZ -= (camZ - var2) * camMoveToRate2 / 1000 + camMoveToRate;
			if (camZ < var2) {
				camZ = var2;
			}
		}

		int var4 = camLookAtLx * 128 + 64;
		int var5 = camLookAtLz * 128 + 64;
		int var6 = getAvH(minusedlevel, camLookAtLx, camLookAtLz) - camLookAtHei;
		int var7 = var4 - camX;
		int var8 = var6 - camY;
		int var9 = var5 - camZ;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (camPitch < var11) {
			camPitch += (var11 - camPitch) * camLookAtRate2 / 1000 + camLookAtRate;
			if (camPitch > var11) {
				camPitch = var11;
			}
		}

		if (camPitch > var11) {
			camPitch -= (camPitch - var11) * camLookAtRate2 / 1000 + camLookAtRate;
			if (camPitch < var11) {
				camPitch = var11;
			}
		}

		int var13 = var12 - camYaw;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			camYaw += camLookAtRate2 * var13 / 1000 + camLookAtRate;
			camYaw &= 0x7FF;
		}

		if (var13 < 0) {
			camYaw -= -var13 * camLookAtRate2 / 1000 + camLookAtRate;
			camYaw &= 0x7FF;
		}

		int var14 = var12 - camYaw;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			camYaw = var12;
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void iconLoop() {
		if (mouseClickButton == 1) {
			if (mouseClickX >= 549 && mouseClickX <= 583 && mouseClickY >= 195 && mouseClickY < 231 && sideIcon[0] != -1) {
				redrawSidebar = true;
				activeIcon = 0;
				redrawIcons = true;
			}

			if (mouseClickX >= 579 && mouseClickX <= 609 && mouseClickY >= 194 && mouseClickY < 231 && sideIcon[1] != -1) {
				redrawSidebar = true;
				activeIcon = 1;
				redrawIcons = true;
			}

			if (mouseClickX >= 607 && mouseClickX <= 637 && mouseClickY >= 194 && mouseClickY < 231 && sideIcon[2] != -1) {
				redrawSidebar = true;
				activeIcon = 2;
				redrawIcons = true;
			}

			if (mouseClickX >= 635 && mouseClickX <= 679 && mouseClickY >= 194 && mouseClickY < 229 && sideIcon[3] != -1) {
				redrawSidebar = true;
				activeIcon = 3;
				redrawIcons = true;
			}

			if (mouseClickX >= 676 && mouseClickX <= 706 && mouseClickY >= 194 && mouseClickY < 231 && sideIcon[4] != -1) {
				redrawSidebar = true;
				activeIcon = 4;
				redrawIcons = true;
			}

			if (mouseClickX >= 704 && mouseClickX <= 734 && mouseClickY >= 194 && mouseClickY < 231 && sideIcon[5] != -1) {
				redrawSidebar = true;
				activeIcon = 5;
				redrawIcons = true;
			}

			if (mouseClickX >= 732 && mouseClickX <= 766 && mouseClickY >= 195 && mouseClickY < 231 && sideIcon[6] != -1) {
				redrawSidebar = true;
				activeIcon = 6;
				redrawIcons = true;
			}

			if (mouseClickX >= 550 && mouseClickX <= 584 && mouseClickY >= 492 && mouseClickY < 528 && sideIcon[7] != -1) {
				redrawSidebar = true;
				activeIcon = 7;
				redrawIcons = true;
			}

			if (mouseClickX >= 582 && mouseClickX <= 612 && mouseClickY >= 492 && mouseClickY < 529 && sideIcon[8] != -1) {
				redrawSidebar = true;
				activeIcon = 8;
				redrawIcons = true;
			}

			if (mouseClickX >= 609 && mouseClickX <= 639 && mouseClickY >= 492 && mouseClickY < 529 && sideIcon[9] != -1) {
				redrawSidebar = true;
				activeIcon = 9;
				redrawIcons = true;
			}

			if (mouseClickX >= 637 && mouseClickX <= 681 && mouseClickY >= 493 && mouseClickY < 528 && sideIcon[10] != -1) {
				redrawSidebar = true;
				activeIcon = 10;
				redrawIcons = true;
			}

			if (mouseClickX >= 679 && mouseClickX <= 709 && mouseClickY >= 492 && mouseClickY < 529 && sideIcon[11] != -1) {
				redrawSidebar = true;
				activeIcon = 11;
				redrawIcons = true;
			}

			if (mouseClickX >= 706 && mouseClickX <= 736 && mouseClickY >= 492 && mouseClickY < 529 && sideIcon[12] != -1) {
				redrawSidebar = true;
				activeIcon = 12;
				redrawIcons = true;
			}

			if (mouseClickX >= 734 && mouseClickX <= 768 && mouseClickY >= 492 && mouseClickY < 528 && sideIcon[13] != -1) {
				redrawSidebar = true;
				activeIcon = 13;
				redrawIcons = true;
			}

			cyclelogic1++;
			if (cyclelogic1 > 150) {
				cyclelogic1 = 0;
				out.p1enc(233);
				out.p1(43);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(Lhc;B)Z")
	public final boolean addSocialOptions(IfType arg0) {
		int var2 = arg0.clientCode;
		if (var2 >= 1 && var2 <= 200) {
			if (var2 >= 101) {
				var2 -= 101;
			} else {
				var2--;
			}

			menuOption[menuNumEntries] = "Remove @whi@" + friendUsername[var2];
			menuAction[menuNumEntries] = 557;
			menuNumEntries++;
			menuOption[menuNumEntries] = "Message @whi@" + friendUsername[var2];
			menuAction[menuNumEntries] = 679;
			menuNumEntries++;
			return true;
		}

		if (var2 >= 401 && var2 <= 500) {
			menuOption[menuNumEntries] = "Remove @whi@" + arg0.text;
			menuAction[menuNumEntries] = 556;
			menuNumEntries++;
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.b(ILkb;I)V")
	public final void getNpcPosOldVis(Packet arg0, int arg1) {
		arg0.gbitstart();
		int var3 = arg0.gbit(8);
		if (var3 < npcCount) {
			for (int var4 = var3; var4 < npcCount; var4++) {
				entityRemovalIds[entityRemovalCount++] = npcIds[var4];
			}
		}

		if (var3 > npcCount) {
			signlink.reporterror(loginUser + " Too many npcs");
			throw new RuntimeException("eek");
		}

		npcCount = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = npcIds[var5];
			ClientNpc var7 = npc[var6];
			int var8 = arg0.gbit(1);
			if (var8 == 0) {
				npcIds[npcCount++] = var6;
				var7.cycle = loopCycle;
			} else {
				int var9 = arg0.gbit(2);
				if (var9 == 0) {
					npcIds[npcCount++] = var6;
					var7.cycle = loopCycle;
					entityUpdateIds[entityUpdateCount++] = var6;
				} else if (var9 == 1) {
					npcIds[npcCount++] = var6;
					var7.cycle = loopCycle;
					int var10 = arg0.gbit(3);
					var7.moveCode(false, var10);
					int var11 = arg0.gbit(1);
					if (var11 == 1) {
						entityUpdateIds[entityUpdateCount++] = var6;
					}
				} else if (var9 == 2) {
					npcIds[npcCount++] = var6;
					var7.cycle = loopCycle;
					int var12 = arg0.gbit(3);
					var7.moveCode(true, var12);
					int var13 = arg0.gbit(3);
					var7.moveCode(true, var13);
					int var14 = arg0.gbit(1);
					if (var14 == 1) {
						entityUpdateIds[entityUpdateCount++] = var6;
					}
				} else if (var9 == 3) {
					entityRemovalIds[entityRemovalCount++] = var6;
				}
			}
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.l(Z)V")
	public final void lostCon() {
		if (logoutTimer > 0) {
			logout();
		} else {
			areaGame.setPixels();
			p12.centreString(144, 0, "Connection lost", 257);
			p12.centreString(143, 0xFFFFFF, "Connection lost", 256);
			p12.centreString(159, 0, "Please wait - attempting to reestablish", 257);
			p12.centreString(158, 0xFFFFFF, "Please wait - attempting to reestablish", 256);
			areaGame.draw(11, graphics, 8);
			minimapFlagX = 0;
			ClientStream var1 = stream;
			ingame = false;
			login(loginUser, loginPass, true);

			if (!ingame) {
				logout();
			}

			try {
				var1.close();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.a(ILib;)V")
	public final void generateFlameCoolingMap(Pix8 arg0) {
		short var2 = 256;

		for (int var3 = 0; var3 < flameBuffer0.length; var3++) {
			flameBuffer0[var3] = 0;
		}

		for (int var4 = 0; var4 < 5000; var4++) {
			int var5 = (int) (Math.random() * 128.0D * var2);
			flameBuffer0[var5] = (int) (Math.random() * 256.0D);
		}

		for (int var6 = 0; var6 < 20; var6++) {
			for (int var7 = 1; var7 < var2 - 1; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = (var7 << 7) + var8;
					flameBuffer1[var9] = (flameBuffer0[var9 - 1] + flameBuffer0[var9 + 1] + flameBuffer0[var9 - 128] + flameBuffer0[var9 + 128]) / 4;
				}
			}

			int[] var10 = flameBuffer0;
			flameBuffer0 = flameBuffer1;
			flameBuffer1 = var10;
		}

		if (arg0 != null) {
			int var11 = 0;
			for (int var12 = 0; var12 < arg0.hi; var12++) {
				for (int var13 = 0; var13 < arg0.wi; var13++) {
					if (arg0.data[var11++] != 0) {
						int var14 = var13 + arg0.xof + 16;
						int var15 = var12 + arg0.yof + 16;
						int var16 = (var15 << 7) + var14;
						flameBuffer0[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.j(II)V")
	public final void showObject(int arg0, int arg1) {
		LinkList var3 = groundObj[minusedlevel][arg0][arg1];
		if (var3 == null) {
			world.delObj(minusedlevel, arg0, arg1);
		} else {
			int var4 = -99999999;
			ClientObj var5 = null;
			for (ClientObj var6 = (ClientObj) var3.head(); var6 != null; var6 = (ClientObj) var3.next()) {
				ObjType var7 = ObjType.list(var6.id);
				int var8 = var7.cost;
				if (var7.stackable) {
					var8 = (var6.count + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.pushFront(var5);
			int var9 = -1;
			int var10 = -1;
			int var11 = 0;
			int var12 = 0;
			for (ClientObj var13 = (ClientObj) var3.head(); var13 != null; var13 = (ClientObj) var3.next()) {
				if (var5.id != var13.id && var9 == -1) {
					var9 = var13.id;
					var11 = var13.count;
				}

				if (var5.id != var13.id && var13.id != var9 && var10 == -1) {
					var10 = var13.id;
					var12 = var13.count;
				}
			}

			Model var14 = null;
			if (var9 != -1) {
				var14 = ObjType.list(var9).getModelLit(var11);
			}

			Model var15 = null;
			if (var10 != -1) {
				var15 = ObjType.list(var10).getModelLit(var12);
			}

			int var16 = (arg1 << 7) + arg0 + 0x60000000;
			ObjType var17 = ObjType.list(var5.id);
			world.setObj(var17.getModelLit(var5.count), var14, getAvH(minusedlevel, arg0 * 128 + 64, arg1 * 128 + 64), minusedlevel, var16, arg1, arg0, var15);
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void mapBuild() {
		try {
			minimapLevel = -1;
			locMerges.clear();
			locAnims.clear();
			spotanims.clear();
			projectiles.clear();
			Pix3D.clearTexels();
			clearCaches();
			world.resetMap();

			for (int var1 = 0; var1 < 4; var1++) {
				collision[var1].reset();
			}

			System.gc();
			ClientBuild var2 = new ClientBuild(104, mapl, 104, groundh);
			byte[] var3 = new byte[100000];
			int var4 = mapBuildGroundData.length;
			ClientBuild.lowMem = World.lowMem;
			for (int var5 = 0; var5 < var4; var5++) {
				int var6 = mapBuildIndex[var5] >> 8;
				int var7 = mapBuildIndex[var5] & 0xFF;
				if (var6 == 33 && var7 >= 71 && var7 <= 73) {
					ClientBuild.lowMem = false;
				}
			}

			if (ClientBuild.lowMem) {
				world.fillBaseLevel(minusedlevel);
			} else {
				world.fillBaseLevel(0);
			}

			out.p1enc(108);

			for (int var8 = 0; var8 < var4; var8++) {
				int var9 = (mapBuildIndex[var8] >> 8) * 64 - mapBuildBaseX;
				int var10 = (mapBuildIndex[var8] & 0xFF) * 64 - mapBuildBaseZ;
				byte[] var11 = mapBuildGroundData[var8];
				if (var11 != null) {
					int var12 = (new Packet(var11)).g4();
					BZip2.decompress(var3, var12, var11, var11.length - 4, 4);
					var2.loadGround(var3, (mapBuildCentreZoneX - 6) * 8, var10, var9, (mapBuildCentreZoneZ - 6) * 8);
				} else if (mapBuildCentreZoneZ < 800) {
					var2.fadeAdjacent(var9, var10, 64, 64);
				}
			}

			out.p1enc(108);

			for (int var13 = 0; var13 < var4; var13++) {
				byte[] var14 = mapBuildLocationData[var13];
				if (var14 != null) {
					int var15 = (new Packet(var14)).g4();
					BZip2.decompress(var3, var15, var14, var14.length - 4, 4);
					int var16 = (mapBuildIndex[var13] >> 8) * 64 - mapBuildBaseX;
					int var17 = (mapBuildIndex[var13] & 0xFF) * 64 - mapBuildBaseZ;
					var2.loadLocations(var3, world, collision, locAnims, var17, var16);
				}
			}

			out.p1enc(108);
			var2.finishBuild(world, collision);
			areaGame.setPixels();
			out.p1enc(108);

			for (ClientLocAnim var18 = (ClientLocAnim) locAnims.head(); var18 != null; var18 = (ClientLocAnim) locAnims.next()) {
				if ((mapl[1][var18.x][var18.z] & 0x2) == 2) {
					var18.level--;
					if (var18.level < 0) {
						var18.unlink();
					}
				}
			}

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					showObject(var19, var20);
				}
			}

			for (LocChange var21 = (LocChange) locChanges.head(); var21 != null; var21 = (LocChange) locChanges.next()) {
				locChangeUnchecked(var21.newAngle, var21.x, var21.z, var21.layer, var21.newType, var21.newShape, var21.level);
			}
		} catch (Exception var23) {
		}

		LocType.mc1.clear();
		System.gc();
		Pix3D.initPool(20);
	}

	@ObfuscatedName("client.b(I)V")
	public final void mainloop() {
		if (!errorStarted && !errorLoading && !errorHost) {
			loopCycle++;

			if (ingame) {
				gameLoop();
			} else {
				titleScreenLoop();
			}
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void timeoutChat() {
		for (int var1 = -1; var1 < playerCount; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = LOCAL_PLAYER_INDEX;
			} else {
				var2 = playerIds[var1];
			}

			ClientPlayer var3 = players[var2];
			if (var3 != null && var3.chatTimer > 0) {
				var3.chatTimer--;
				if (var3.chatTimer == 0) {
					var3.chatMessage = null;
				}
			}
		}

		for (int var4 = 0; var4 < npcCount; var4++) {
			int var5 = npcIds[var4];
			ClientNpc var6 = npc[var5];
			if (var6 != null && var6.chatTimer > 0) {
				var6.chatTimer--;
				if (var6.chatTimer == 0) {
					var6.chatMessage = null;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lhc;ZI)I")
	public final int getIfVar(IfType arg0, int arg1) {
		if (arg0.scripts == null || arg1 >= arg0.scripts.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.scripts[arg1];
			int var4 = 0;
			int var5 = 0;
			while (true) {
				int var6 = var3[var5++];
				if (var6 == 0) {
					return var4;
				}

				if (var6 == 1) {
					var4 += statEffectiveLevel[var3[var5++]];
				}

				if (var6 == 2) {
					var4 += statBaseLevel[var3[var5++]];
				}

				if (var6 == 3) {
					var4 += statXP[var3[var5++]];
				}

				if (var6 == 4) {
					IfType var7 = IfType.list[var3[var5++]];
					int var8 = var3[var5++] + 1;
					for (int var9 = 0; var9 < var7.linkObjType.length; var9++) {
						if (var7.linkObjType[var9] == var8) {
							var4 += var7.linkObjNumber[var9];
						}
					}
				}

				if (var6 == 5) {
					var4 += var[var3[var5++]];
				}

				if (var6 == 6) {
					var4 += skillxp[statBaseLevel[var3[var5++]] - 1];
				}

				if (var6 == 7) {
					var4 += var[var3[var5++]] * 100 / 46875;
				}

				if (var6 == 8) {
					var4 += localPlayer.combatLevel;
				}

				if (var6 == 9) {
					for (int var10 = 0; var10 < 19; var10++) {
						if (var10 == 18) {
							var10 = 20;
						}

						var4 += statBaseLevel[var10];
					}
				}

				if (var6 == 10) {
					IfType var11 = IfType.list[var3[var5++]];
					int var12 = var3[var5++] + 1;
					for (int var13 = 0; var13 < var11.linkObjType.length; var13++) {
						if (var11.linkObjType[var13] == var12) {
							var4 += 999999999;
							break;
						}
					}
				}

				if (var6 == 11) {
					var4 += runenergy;
				}

				if (var6 == 12) {
					var4 += runweight;
				}

				if (var6 == 13) {
					int var14 = var[var3[var5++]];
					int var15 = var3[var5++];
					var4 += (var14 & 1 << var15) == 0 ? 0 : 1;
				}
			}
		} catch (Exception var16) {
			return -1;
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void drawError() {
		Graphics var1 = getBaseComponent().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 789, 532);
		setFramerate(1);

		if (errorLoading) {
			flameActive = false;
			var1.setFont(new Font("Helvetica", 1, 16));
			var1.setColor(Color.yellow);
			int var2 = 35;
			var1.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var2);
			var2 += 50;
			var1.setColor(Color.white);
			var1.drawString("To fix this try the following (in order):", 30, var2);
			var2 += 50;
			var1.setColor(Color.white);
			var1.setFont(new Font("Helvetica", 1, 12));
			var1.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var2);
			var2 += 30;
			var1.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var2);
			var2 += 30;
			var1.drawString("3: Try using a different game-world", 30, var2);
			var2 += 30;
			var1.drawString("4: Try rebooting your computer", 30, var2);
			var2 += 30;
			var1.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var2);
		}

		if (errorHost) {
			flameActive = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (errorStarted) {
			flameActive = false;
			var1.setColor(Color.yellow);
			int var3 = 35;
			var1.drawString("Error a copy of RuneScape already appears to be loaded", 30, var3);
			var3 += 50;
			var1.setColor(Color.white);
			var1.drawString("To fix this try the following (in order):", 30, var3);
			var3 += 50;
			var1.setColor(Color.white);
			var1.setFont(new Font("Helvetica", 1, 12));
			var1.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var3);
			var3 += 30;
			var1.drawString("2: Try rebooting your computer, and reloading", 30, var3);
			var3 += 30;
		}
	}

	@ObfuscatedName("client.p(B)V")
	public final void loadTitleBackground() {
		byte[] var1 = title.read("title.dat", null);
		Pix32 var2 = new Pix32(var1, this);
		imageTitle0.setPixels();
		var2.quickPlotSprite(0, 0);
		imageTitle1.setPixels();
		var2.quickPlotSprite(-661, 0);
		imageTitle2.setPixels();
		var2.quickPlotSprite(-128, 0);
		imageTitle3.setPixels();
		var2.quickPlotSprite(-214, -386);
		imageTitle4.setPixels();
		var2.quickPlotSprite(-214, -186);
		imageTitle5.setPixels();
		var2.quickPlotSprite(0, -265);
		imageTitle6.setPixels();
		var2.quickPlotSprite(-574, -265);
		imageTitle7.setPixels();
		var2.quickPlotSprite(-128, -186);
		imageTitle8.setPixels();
		var2.quickPlotSprite(-574, -186);
		int[] var3 = new int[var2.wi];
		for (int var4 = 0; var4 < var2.hi; var4++) {
			for (int var5 = 0; var5 < var2.wi; var5++) {
				var3[var5] = var2.data[var2.wi * var4 + var2.wi - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.wi; var6++) {
				var2.data[var2.wi * var4 + var6] = var3[var6];
			}
		}

		imageTitle0.setPixels();
		var2.quickPlotSprite(394, 0);
		imageTitle1.setPixels();
		var2.quickPlotSprite(-267, 0);
		imageTitle2.setPixels();
		var2.quickPlotSprite(266, 0);
		imageTitle3.setPixels();
		var2.quickPlotSprite(180, -386);
		imageTitle4.setPixels();
		var2.quickPlotSprite(180, -186);
		imageTitle5.setPixels();
		var2.quickPlotSprite(394, -265);
		imageTitle6.setPixels();
		var2.quickPlotSprite(-180, -265);
		imageTitle7.setPixels();
		var2.quickPlotSprite(212, -186);
		imageTitle8.setPixels();
		var2.quickPlotSprite(-180, -186);
		Pix32 var7 = new Pix32(title, "logo", 0);
		imageTitle2.setPixels();
		var7.plotSprite(18, sWid / 2 - var7.wi / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.E(I)V")
	public final void addLocAnim() {
		for (ClientLocAnim var1 = (ClientLocAnim) locAnims.head(); var1 != null; var1 = (ClientLocAnim) locAnims.next()) {
			boolean var2 = false;
			var1.animCycle += worldUpdateNum;

			if (var1.animFrame == -1) {
				var1.animFrame = 0;
				var2 = true;
			}

			while (var1.animCycle > var1.anim.delay[var1.animFrame]) {
				var1.animCycle -= var1.anim.delay[var1.animFrame] + 1;
				var1.animFrame++;
				var2 = true;

				if (var1.animFrame >= var1.anim.numFrames) {
					var1.animFrame -= var1.anim.loops;
					if (var1.animFrame < 0 || var1.animFrame >= var1.anim.numFrames) {
						break;
					}
				}
			}

			var1.unlink();
			var2 = false;
			if (var2) {
				int var3 = var1.level;
				int var4 = var1.x;
				int var5 = var1.z;
				int var6 = 0;
				if (var1.layer == 0) {
					var6 = world.wallType(var3, var4, var5);
				}

				if (var1.layer == 1) {
					var6 = world.decorType(var3, var5, var4);
				}

				if (var1.layer == 2) {
					var6 = world.sceneType(var3, var4, var5);
				}

				if (var1.layer == 3) {
					var6 = world.gdType(var3, var4, var5);
				}

				if (var6 != 0 && (var6 >> 14 & 0x7FFF) == var1.id) {
					int var7 = groundh[var3][var4][var5];
					int var8 = groundh[var3][var4 + 1][var5];
					int var9 = groundh[var3][var4 + 1][var5 + 1];
					int var10 = groundh[var3][var4][var5 + 1];
					LocType var11 = LocType.list(var1.id);
					int var12 = -1;
					if (var1.animFrame != -1) {
						var12 = var1.anim.frames[var1.animFrame];
					}

					if (var1.layer == 2) {
						int var13 = world.typeCode2(var3, var4, var5, var6);
						int var14 = var13 & 0x1F;
						int var15 = var13 >> 6;

						if (var14 == 11) {
							var14 = 10;
						}

						Model var16 = var11.buildModel(var14, var15, var7, var8, var9, var10, var12);
						world.setSpriteModel(var4, var16, var3, var5);
					} else if (var1.layer == 1) {
						Model var17 = var11.buildModel(4, 0, var7, var8, var9, var10, var12);
						world.setDecorModel(var5, var4, var17, var3);
					} else if (var1.layer == 0) {
						int var18 = world.typeCode2(var3, var4, var5, var6);
						int var19 = var18 & 0x1F;
						int var20 = var18 >> 6;
						if (var19 == 2) {
							int var21 = var20 + 1 & 0x3;
							Model var22 = var11.buildModel(2, var20 + 4, var7, var8, var9, var10, var12);
							Model var23 = var11.buildModel(2, var21, var7, var8, var9, var10, var12);
							world.setWallModels(var22, var23, var5, var4, var3);
						} else {
							Model var24 = var11.buildModel(var19, var20, var7, var8, var9, var10, var12);
							world.setWallModel(var24, var5, var4, var3);
						}
					} else if (var1.layer == 3) {
						int var25 = world.typeCode2(var3, var4, var5, var6);
						int var26 = var25 >> 6;
						Model var27 = var11.buildModel(22, var26, var7, var8, var9, var10, var12);
						world.setGroundDecorModel(var27, var5, var4, var3);
					}
				} else {
					var1.unlink();
				}
			}
		}
	}

	@ObfuscatedName("client.b(IJ)V")
	public final void delIgnore(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < ignoreCount; var3++) {
				if (ignoreUserhash[var3] == arg0) {
					ignoreCount--;
					redrawSidebar = true;

					for (int var4 = var3; var4 < ignoreCount; var4++) {
						ignoreUserhash[var4] = ignoreUserhash[var4 + 1];
					}

					out.p1enc(171);
					out.p8(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.q(B)V")
	public final void addWorldOptions() {
		if (useMode == 0 && targetMode == 0) {
			menuOption[menuNumEntries] = "Walk here";
			menuAction[menuNumEntries] = 660;
			menuParamB[menuNumEntries] = mouseX;
			menuParamC[menuNumEntries] = mouseY;
			menuNumEntries++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < Model.pickedCount; var2++) {
			int var3 = Model.pickedEntityTypecode[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && world.typeCode2(minusedlevel, var4, var5, var3) >= 0) {
					LocType var8 = LocType.list(var7);
					if (useMode == 1) {
						menuOption[menuNumEntries] = "Use " + objSelectedName + " with @cya@" + var8.name;
						menuAction[menuNumEntries] = 450;
						menuParamA[menuNumEntries] = var3;
						menuParamB[menuNumEntries] = var4;
						menuParamC[menuNumEntries] = var5;
						menuNumEntries++;
					} else if (targetMode != 1) {
						if (var8.op != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.op[var9] != null) {
									menuOption[menuNumEntries] = var8.op[var9] + " @cya@" + var8.name;

									if (var9 == 0) {
										menuAction[menuNumEntries] = 285;
									}

									if (var9 == 1) {
										menuAction[menuNumEntries] = 504;
									}

									if (var9 == 2) {
										menuAction[menuNumEntries] = 364;
									}

									if (var9 == 3) {
										menuAction[menuNumEntries] = 581;
									}

									if (var9 == 4) {
										menuAction[menuNumEntries] = 1501;
									}

									menuParamA[menuNumEntries] = var3;
									menuParamB[menuNumEntries] = var4;
									menuParamC[menuNumEntries] = var5;
									menuNumEntries++;
								}
							}
						}

						menuOption[menuNumEntries] = "Examine @cya@" + var8.name;
						menuAction[menuNumEntries] = 1175;
						menuParamA[menuNumEntries] = var3;
						menuParamB[menuNumEntries] = var4;
						menuParamC[menuNumEntries] = var5;
						menuNumEntries++;
					} else if ((targetMask & 0x4) == 4) {
						menuOption[menuNumEntries] = targetOp + " @cya@" + var8.name;
						menuAction[menuNumEntries] = 55;
						menuParamA[menuNumEntries] = var3;
						menuParamB[menuNumEntries] = var4;
						menuParamC[menuNumEntries] = var5;
						menuNumEntries++;
					}
				}

				if (var6 == 1) {
					ClientNpc var10 = npc[var7];
					if (var10.type.size == 1 && (var10.x & 0x7F) == 0x40 && (var10.z & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < npcCount; var11++) {
							ClientNpc var12 = npc[npcIds[var11]];
							if (var12 != null && var10 != var12 && var12.type.size == 1 && var10.x == var12.x && var10.z == var12.z) {
								addNpcOptions(var12.type, var5, var4, npcIds[var11]);
							}
						}
					}

					addNpcOptions(var10.type, var5, var4, var7);
				}

				if (var6 == 0) {
					ClientPlayer var13 = players[var7];
					if ((var13.x & 0x7F) == 0x40 && (var13.z & 0x7F) == 0x40) {
						for (int var14 = 0; var14 < npcCount; var14++) {
							ClientNpc var15 = npc[npcIds[var14]];
							if (var15 != null && var15.type.size == 1 && var13.x == var15.x && var13.z == var15.z) {
								addNpcOptions(var15.type, var5, var4, npcIds[var14]);
							}
						}

						for (int var16 = 0; var16 < playerCount; var16++) {
							ClientPlayer var17 = players[playerIds[var16]];
							if (var17 != null && var13 != var17 && var13.x == var17.x && var13.z == var17.z) {
								addPlayerOptions(var5, playerIds[var16], var17, var4);
							}
						}
					}

					addPlayerOptions(var5, var7, var13, var4);
				}

				if (var6 == 3) {
					LinkList var18 = groundObj[minusedlevel][var4][var5];
					if (var18 != null) {
						for (ClientObj var19 = (ClientObj) var18.tail(); var19 != null; var19 = (ClientObj) var18.prev()) {
							ObjType var20 = ObjType.list(var19.id);
							if (useMode == 1) {
								menuOption[menuNumEntries] = "Use " + objSelectedName + " with @lre@" + var20.name;
								menuAction[menuNumEntries] = 217;
								menuParamA[menuNumEntries] = var19.id;
								menuParamB[menuNumEntries] = var4;
								menuParamC[menuNumEntries] = var5;
								menuNumEntries++;
							} else if (targetMode != 1) {
								for (int var21 = 4; var21 >= 0; var21--) {
									if (var20.op != null && var20.op[var21] != null) {
										menuOption[menuNumEntries] = var20.op[var21] + " @lre@" + var20.name;

										if (var21 == 0) {
											menuAction[menuNumEntries] = 224;
										}

										if (var21 == 1) {
											menuAction[menuNumEntries] = 993;
										}

										if (var21 == 2) {
											menuAction[menuNumEntries] = 99;
										}

										if (var21 == 3) {
											menuAction[menuNumEntries] = 746;
										}

										if (var21 == 4) {
											menuAction[menuNumEntries] = 877;
										}

										menuParamA[menuNumEntries] = var19.id;
										menuParamB[menuNumEntries] = var4;
										menuParamC[menuNumEntries] = var5;
										menuNumEntries++;
									} else if (var21 == 2) {
										menuOption[menuNumEntries] = "Take @lre@" + var20.name;
										menuAction[menuNumEntries] = 99;
										menuParamA[menuNumEntries] = var19.id;
										menuParamB[menuNumEntries] = var4;
										menuParamC[menuNumEntries] = var5;
										menuNumEntries++;
									}
								}

								menuOption[menuNumEntries] = "Examine @lre@" + var20.name;
								menuAction[menuNumEntries] = 1102;
								menuParamA[menuNumEntries] = var19.id;
								menuParamB[menuNumEntries] = var4;
								menuParamC[menuNumEntries] = var5;
								menuNumEntries++;
							} else if ((targetMask & 0x1) == 1) {
								menuOption[menuNumEntries] = targetOp + " @lre@" + var20.name;
								menuAction[menuNumEntries] = 965;
								menuParamA[menuNumEntries] = var19.id;
								menuParamB[menuNumEntries] = var4;
								menuParamC[menuNumEntries] = var5;
								menuNumEntries++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void movePlayers() {
		for (int var1 = -1; var1 < playerCount; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = LOCAL_PLAYER_INDEX;
			} else {
				var2 = playerIds[var1];
			}

			ClientPlayer var3 = players[var2];
			if (var3 != null) {
				moveEntity(var3, 1);
			}
		}

		cyclelogic6++;
		if (cyclelogic6 > 1406) {
			cyclelogic6 = 0;
			out.p1enc(219);
			out.p1(0);
			int var4 = out.pos;
			out.p1(162);
			out.p1(22);

			if ((int) (Math.random() * 2.0D) == 0) {
				out.p1(84);
			}

			out.p2(31824);
			out.p2(13490);

			if ((int) (Math.random() * 2.0D) == 0) {
				out.p1(123);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				out.p1(134);
			}

			out.p1(100);
			out.p1(94);
			out.p2(35521);
			out.psize1(out.pos - var4);
		}
	}

	@ObfuscatedName("client.r(B)V")
	public final void coordArrow() {
		if (hintType == 2) {
			getOverlayPos((hintTileZ - mapBuildBaseZ << 7) + hintOffsetZ, (hintTileX - mapBuildBaseX << 7) + hintOffsetX, hintHeight * 2);

			if (projectX > -1 && loopCycle % 20 < 10) {
				headicons[2].plotSprite(projectY - 28, projectX - 12);
			}
		}
	}

	@ObfuscatedName("client.b(IILkb;)V")
	public final void getPlayerPosLocal(int arg0, Packet arg1) {
		arg1.gbitstart();
		int var3 = arg1.gbit(1);
		if (var3 != 0) {
			int var4 = arg1.gbit(2);
			if (var4 == 0) {
				entityUpdateIds[entityUpdateCount++] = LOCAL_PLAYER_INDEX;
			} else if (var4 == 1) {
				int var5 = arg1.gbit(3);
				localPlayer.moveCode(false, var5);
				int var6 = arg1.gbit(1);
				if (var6 == 1) {
					entityUpdateIds[entityUpdateCount++] = LOCAL_PLAYER_INDEX;
				}
			} else if (var4 == 2) {
				int var7 = arg1.gbit(3);
				localPlayer.moveCode(true, var7);
				int var8 = arg1.gbit(3);
				localPlayer.moveCode(true, var8);
				int var9 = arg1.gbit(1);
				if (var9 == 1) {
					entityUpdateIds[entityUpdateCount++] = LOCAL_PLAYER_INDEX;
				}
			} else if (var4 == 3) {
				minusedlevel = arg1.gbit(2);
				int var10 = arg1.gbit(7);
				int var11 = arg1.gbit(7);
				int var12 = arg1.gbit(1);
				localPlayer.teleport(var12 == 1, var10, var11);
				int var13 = arg1.gbit(1);
				if (var13 == 1) {
					entityUpdateIds[entityUpdateCount++] = LOCAL_PLAYER_INDEX;
				}
			}
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void drawChat() {
		areaChat.setPixels();
		Pix3D.scanline = chatScanline;
		chatback.plotSprite(0, 0);

		if (socialInputOpen) {
			b12.centreString(40, 0, socialInputHeader, 239);
			b12.centreString(60, 128, socialInput + "*", 239);
		} else if (dialogInputOpen) {
			b12.centreString(40, 0, "Enter amount:", 239);
			b12.centreString(60, 128, dialogInput + "*", 239);
		} else if (tutComMessage != null) {
			b12.centreString(40, 0, tutComMessage, 239);
			b12.centreString(60, 128, "Click to continue", 239);
		} else if (chatComId != -1) {
			drawInterface(0, 0, IfType.list[chatComId], 0);
		} else if (tutComId == -1) {
			PixFont var1 = p12;
			int var2 = 0;
			Pix2D.setClipping(77, 0, 463, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (chatText[var3] != null) {
					int var4 = chatType[var3];
					int var5 = chatScrollPos + 70 - var2 * 14;
					if (var4 == 0) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(4, var5, 0, chatText[var3]);
						}

						var2++;
					}

					if (var4 == 1) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(4, var5, 0xFFFFFF, chatUsername[var3] + ":");
							var1.drawString(var1.stringWidTag(chatUsername[var3]) + 12, var5, 255, chatText[var3]);
						}

						var2++;
					}

					if (var4 == 2 && (chatPublicMode == 0 || chatPublicMode == 1 && isFriend(chatUsername[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(4, var5, 0, chatUsername[var3] + ":");
							var1.drawString(var1.stringWidTag(chatUsername[var3]) + 12, var5, 255, chatText[var3]);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && splitPrivateChat == 0 && (var4 == 7 || chatPrivateMode == 0 || chatPrivateMode == 1 && isFriend(chatUsername[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(4, var5, 0, "From " + chatUsername[var3] + ":");
							var1.drawString(var1.stringWidTag("From " + chatUsername[var3]) + 12, var5, 0x800000, chatText[var3]);
						}

						var2++;
					}

					if (var4 == 4 && (chatTradeMode == 0 || chatTradeMode == 1 && isFriend(chatUsername[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(4, var5, 0x800080, chatUsername[var3] + " " + chatText[var3]);
						}

						var2++;
					}

					if (var4 == 5 && splitPrivateChat == 0 && chatPrivateMode < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(4, var5, 0x800000, chatText[var3]);
						}

						var2++;
					}

					if (var4 == 6 && splitPrivateChat == 0 && chatPrivateMode < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(4, var5, 0, "To " + chatUsername[var3] + ":");
							var1.drawString(var1.stringWidTag("To " + chatUsername[var3]) + 12, var5, 0x800000, chatText[var3]);
						}

						var2++;
					}

					if (var4 == 8 && (chatTradeMode == 0 || chatTradeMode == 1 && isFriend(chatUsername[var3]))) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(4, var5, 0xCBB789, chatUsername[var3] + " " + chatText[var3]);
						}

						var2++;
					}
				}
			}

			Pix2D.resetClipping();
			scrollHeight = var2 * 14 + 7;
			if (scrollHeight < 78) {
				scrollHeight = 78;
			}

			drawScrollbar(463, 0, scrollHeight - chatScrollPos - 77, scrollHeight, 77);
			var1.drawString(4, 90, 0, JString.toScreenName(loginUser) + ":");
			var1.drawString(var1.stringWidTag(loginUser + ": ") + 6, 90, 255, chatInput + "*");
			Pix2D.hline(0, 77, 479, 0);
		} else {
			drawInterface(0, 0, IfType.list[tutComId], 0);
		}

		if (isMenuOpen && menuArea == 2) {
			drawMinimenu();
		}

		areaChat.draw(375, graphics, 22);
		areaGame.setPixels();
		Pix3D.scanline = gameScanline;
	}

	@ObfuscatedName("client.p(Z)Z")
	public final boolean tcpIn() {
		if (stream == null) {
			return false;
		}

		try {
			int var1 = stream.available();
			if (var1 == 0) {
				return false;
			}

			if (ptype == -1) {
				stream.read(in.data, 0, 1);
				ptype = in.data[0] & 0xFF;
				if (randomIn != null) {
					ptype = ptype - randomIn.takeNextValue() & 0xFF;
				}

				psize = Protocol.SERVERPROT_SIZE[ptype];
				var1--;
			}

			if (psize == -1) {
				if (var1 <= 0) {
					return false;
				}

				stream.read(in.data, 0, 1);
				psize = in.data[0] & 0xFF;
				var1--;
			}

			if (psize == -2) {
				if (var1 <= 1) {
					return false;
				}

				stream.read(in.data, 0, 2);
				in.pos = 0;
				psize = in.g2();
				var1 -= 2;
			}

			if (var1 < psize) {
				return false;
			}

			in.pos = 0;
			stream.read(in.data, 0, psize);
			timeoutTimer = 0;
			ptype2 = ptype1;
			ptype1 = ptype0;
			ptype0 = ptype;

			if (ptype == 150) {
				int var2 = in.g2();
				byte var3 = in.g1b();
				varServ[var2] = var3;

				if (var[var2] != var3) {
					var[var2] = var3;
					clientVar(var2);
					redrawSidebar = true;

					if (tutComId != -1) {
						redrawChatback = true;
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 152) {
				long var4 = in.g8();
				int var6 = in.g1();
				String var7 = JString.toScreenName(JString.toRawUsername(var4));
				for (int var8 = 0; var8 < friendCount; var8++) {
					if (friendUserhash[var8] == var4) {
						if (friendNodeId[var8] != var6) {
							friendNodeId[var8] = var6;
							redrawSidebar = true;

							if (var6 > 0) {
								addChat(5, var7 + " has logged in.", "");
							}

							if (var6 == 0) {
								addChat(5, var7 + " has logged out.", "");
							}
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null && friendCount < 100) {
					friendUserhash[friendCount] = var4;
					friendUsername[friendCount] = var7;
					friendNodeId[friendCount] = var6;
					friendCount++;
					redrawSidebar = true;
				}

				boolean var9 = false;
				while (!var9) {
					var9 = true;
					for (int var10 = 0; var10 < friendCount - 1; var10++) {
						if (friendNodeId[var10] != nodeId && friendNodeId[var10 + 1] == nodeId || friendNodeId[var10] == 0 && friendNodeId[var10 + 1] != 0) {
							int var11 = friendNodeId[var10];
							friendNodeId[var10] = friendNodeId[var10 + 1];
							friendNodeId[var10 + 1] = var11;
							String var12 = friendUsername[var10];
							friendUsername[var10] = friendUsername[var10 + 1];
							friendUsername[var10 + 1] = var12;
							long var13 = friendUserhash[var10];
							friendUserhash[var10] = friendUserhash[var10 + 1];
							friendUserhash[var10 + 1] = var13;
							redrawSidebar = true;
							var9 = false;
						}
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 43) {
				rebootTimer = in.g2() * 30;
				ptype = -1;
				return true;
			}

			if (ptype == 80) {
				int var15 = in.g1();
				int var16 = in.g1();
				int var17 = -1;
				for (int var18 = 0; var18 < mapBuildIndex.length; var18++) {
					if ((var15 << 8) + var16 == mapBuildIndex[var18]) {
						var17 = var18;
					}
				}

				if (var17 != -1) {
					signlink.cachesave("m" + var15 + "_" + var16, mapBuildGroundData[var17]);
					sceneState = 1;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 1) {
				getNpcPos(in, psize);
				ptype = -1;
				return true;
			}

			if (ptype == 237) {
				int var19 = in.g2();
				int var20 = in.g2();
				if (mapBuildCentreZoneX == var19 && mapBuildCentreZoneZ == var20 && sceneState != 0) {
					ptype = -1;
					return true;
				}

				mapBuildCentreZoneX = var19;
				mapBuildCentreZoneZ = var20;
				mapBuildBaseX = (mapBuildCentreZoneX - 6) * 8;
				mapBuildBaseZ = (mapBuildCentreZoneZ - 6) * 8;
				sceneState = 1;
				areaGame.setPixels();
				p12.centreString(151, 0, "Loading - please wait.", 257);
				p12.centreString(150, 0xFFFFFF, "Loading - please wait.", 256);
				areaGame.draw(11, graphics, 8);
				signlink.looprate(5);
				int var21 = (psize - 2) / 10;
				mapBuildGroundData = new byte[var21][];
				mapBuildLocationData = new byte[var21][];
				mapBuildIndex = new int[var21];
				out.p1enc(150);
				out.p1(0);
				int var22 = 0;
				for (int var23 = 0; var23 < var21; var23++) {
					int var24 = in.g1();
					int var25 = in.g1();
					int var26 = in.g4();
					int var27 = in.g4();
					mapBuildIndex[var23] = (var24 << 8) + var25;

					if (var26 != 0) {
						byte[] var28 = signlink.cacheload("m" + var24 + "_" + var25);
						if (var28 != null) {
							crc32.reset();
							crc32.update(var28);

							if ((int) crc32.getValue() != var26) {
								var28 = null;
							}
						}

						if (var28 == null) {
							sceneState = 0;
							out.p1(0);
							out.p1(var24);
							out.p1(var25);
							var22 += 3;
						} else {
							mapBuildGroundData[var23] = var28;
						}
					}

					if (var27 != 0) {
						byte[] var29 = signlink.cacheload("l" + var24 + "_" + var25);
						if (var29 != null) {
							crc32.reset();
							crc32.update(var29);

							if ((int) crc32.getValue() != var27) {
								var29 = null;
							}
						}

						if (var29 == null) {
							sceneState = 0;
							out.p1(1);
							out.p1(var24);
							out.p1(var25);
							var22 += 3;
						} else {
							mapBuildLocationData[var23] = var29;
						}
					}
				}

				out.psize1(var22);
				signlink.looprate(50);
				areaGame.setPixels();

				if (sceneState == 0) {
					p12.centreString(166, 0, "Map area updated since last visit, so load will take longer this time only", 257);
					p12.centreString(165, 0xFFFFFF, "Map area updated since last visit, so load will take longer this time only", 256);
				}

				areaGame.draw(11, graphics, 8);
				int var30 = mapBuildBaseX - mapBuildPrevBaseX;
				int var31 = mapBuildBaseZ - mapBuildPrevBaseZ;
				mapBuildPrevBaseX = mapBuildBaseX;
				mapBuildPrevBaseZ = mapBuildBaseZ;

				for (int var32 = 0; var32 < 8192; var32++) {
					ClientNpc var33 = npc[var32];
					if (var33 != null) {
						for (int var34 = 0; var34 < 10; var34++) {
							var33.routeX[var34] -= var30;
							var33.routeZ[var34] -= var31;
						}

						var33.x -= var30 * 128;
						var33.z -= var31 * 128;
					}
				}

				for (int var35 = 0; var35 < MAX_PLAYER_COUNT; var35++) {
					ClientPlayer var36 = players[var35];
					if (var36 != null) {
						for (int var37 = 0; var37 < 10; var37++) {
							var36.routeX[var37] -= var30;
							var36.routeZ[var37] -= var31;
						}

						var36.x -= var30 * 128;
						var36.z -= var31 * 128;
					}
				}

				byte var38 = 0;
				byte var39 = 104;
				byte var40 = 1;
				if (var30 < 0) {
					var38 = 103;
					var39 = -1;
					var40 = -1;
				}

				byte var41 = 0;
				byte var42 = 104;
				byte var43 = 1;
				if (var31 < 0) {
					var41 = 103;
					var42 = -1;
					var43 = -1;
				}

				for (int var44 = var38; var44 != var39; var44 += var40) {
					for (int var45 = var41; var45 != var42; var45 += var43) {
						int var46 = var30 + var44;
						int var47 = var31 + var45;
						for (int var48 = 0; var48 < 4; var48++) {
							if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
								groundObj[var48][var44][var45] = groundObj[var48][var46][var47];
							} else {
								groundObj[var48][var44][var45] = null;
							}
						}
					}
				}

				for (LocChange var49 = (LocChange) locChanges.head(); var49 != null; var49 = (LocChange) locChanges.next()) {
					var49.x -= var30;
					var49.z -= var31;
					if (var49.x < 0 || var49.z < 0 || var49.x >= 104 || var49.z >= 104) {
						var49.unlink();
					}
				}

				if (minimapFlagX != 0) {
					minimapFlagX -= var30;
					minimapFlagZ -= var31;
				}

				cinemaCam = false;
				ptype = -1;
				return true;
			}

			if (ptype == 197) {
				int var50 = in.g2();
				IfType.list[var50].model1 = localPlayer.getHeadModel();
				ptype = -1;
				return true;
			}

			if (ptype == 25) {
				hintType = in.g1();
				if (hintType == 1) {
					hintNpc = in.g2();
				}

				if (hintType >= 2 && hintType <= 6) {
					if (hintType == 2) {
						hintOffsetX = 64;
						hintOffsetZ = 64;
					}

					if (hintType == 3) {
						hintOffsetX = 0;
						hintOffsetZ = 64;
					}

					if (hintType == 4) {
						hintOffsetX = 128;
						hintOffsetZ = 64;
					}

					if (hintType == 5) {
						hintOffsetX = 64;
						hintOffsetZ = 0;
					}

					if (hintType == 6) {
						hintOffsetX = 64;
						hintOffsetZ = 128;
					}

					hintType = 2;
					hintTileX = in.g2();
					hintTileZ = in.g2();
					hintHeight = in.g1();
				}

				if (hintType == 10) {
					hintPlayer = in.g2();
				}

				ptype = -1;
				return true;
			}

			if (ptype == 54) {
				String var51 = in.gstr();
				int var52 = in.g4();
				int var53 = in.g4();
				if (!var51.equals(currentMidi) && midiActive && !lowMem) {
					playMidi(var52, var51, var53);
				}

				currentMidi = var51;
				midiCrc = var52;
				midiSize = var53;
				nextMusicDelay = 0;
				ptype = -1;
				return true;
			}

			if (ptype == 142) {
				logout();
				ptype = -1;
				return false;
			}

			if (ptype == 20) {
				int var54 = in.g1();
				int var55 = in.g1();
				int var56 = -1;
				for (int var57 = 0; var57 < mapBuildIndex.length; var57++) {
					if ((var54 << 8) + var55 == mapBuildIndex[var57]) {
						var56 = var57;
					}
				}

				if (var56 != -1) {
					signlink.cachesave("l" + var54 + "_" + var55, mapBuildLocationData[var56]);
					sceneState = 1;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 19) {
				minimapFlagX = 0;
				ptype = -1;
				return true;
			}

			if (ptype == 139) {
				selfSlot = in.g2();
				ptype = -1;
				return true;
			}

			if (ptype == 151 || ptype == 23 || ptype == 50 || ptype == 191 || ptype == 69 || ptype == 49 || ptype == 223 || ptype == 42 || ptype == 76 || ptype == 59) {
				zonePacket(in, ptype);
				ptype = -1;
				return true;
			}

			if (ptype == 28) {
				int var58 = in.g2();
				int var59 = in.g2();

				if (chatComId != -1) {
					chatComId = -1;
					redrawChatback = true;
				}

				if (dialogInputOpen) {
					dialogInputOpen = false;
					redrawChatback = true;
				}

				mainModalId = var58;
				sideModalId = var59;
				redrawSidebar = true;
				redrawIcons = true;
				resumedPauseButton = false;
				ptype = -1;
				return true;
			}

			if (ptype == 175) {
				int var60 = in.g2();
				int var61 = in.g4();
				varServ[var60] = var61;

				if (var[var60] != var61) {
					var[var60] = var61;
					clientVar(var60);
					redrawSidebar = true;

					if (tutComId != -1) {
						redrawChatback = true;
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 146) {
				int var62 = in.g2();
				int var63 = in.g2();
				IfType.list[var62].modelAnim = var63;
				ptype = -1;
				return true;
			}

			if (ptype == 167) {
				int var64 = in.g2();
				int var65 = in.g1();

				if (var64 == 0xFFFF) {
					var64 = -1;
				}

				sideIcon[var65] = var64;
				redrawSidebar = true;
				redrawIcons = true;
				ptype = -1;
				return true;
			}

			if (ptype == 220) {
				int var66 = in.g1();
				int var67 = in.g1();
				int var68 = in.g2();
				int var69 = in.g2();
				int var70 = -1;
				for (int var71 = 0; var71 < mapBuildIndex.length; var71++) {
					if ((var66 << 8) + var67 == mapBuildIndex[var71]) {
						var70 = var71;
					}
				}

				if (var70 != -1) {
					if (mapBuildLocationData[var70] == null || mapBuildLocationData[var70].length != var69) {
						mapBuildLocationData[var70] = new byte[var69];
					}

					in.gdata(psize - 6, var68, mapBuildLocationData[var70]);
				}

				ptype = -1;
				return true;
			}

			if (ptype == 133) {
				Packet var72 = InputTracking.stop();
				if (var72 != null) {
					out.p1enc(81);
					out.p2(var72.pos);
					out.pdata(var72.data, var72.pos, 0);
					var72.release();
				}

				ptype = -1;
				return true;
			}

			if (ptype == 98) {
				redrawSidebar = true;
				int var73 = in.g2();
				IfType var74 = IfType.list[var73];
				int var75 = in.g1();
				for (int var76 = 0; var76 < var75; var76++) {
					var74.linkObjType[var76] = in.g2();
					int var77 = in.g1();
					if (var77 == 255) {
						var77 = in.g4();
					}

					var74.linkObjNumber[var76] = var77;
				}

				for (int var78 = var75; var78 < var74.linkObjType.length; var78++) {
					var74.linkObjType[var78] = 0;
					var74.linkObjNumber[var78] = 0;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 226) {
				InputTracking.activate();
				ptype = -1;
				return true;
			}

			if (ptype == 243) {
				socialInputOpen = false;
				dialogInputOpen = true;
				dialogInput = "";
				redrawChatback = true;
				ptype = -1;
				return true;
			}

			if (ptype == 15) {
				int var79 = in.g2();
				IfType var80 = IfType.list[var79];
				for (int var81 = 0; var81 < var80.linkObjType.length; var81++) {
					var80.linkObjType[var81] = -1;
					var80.linkObjType[var81] = 0;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 140) {
				lastAddress = in.g4();
				daysSinceLastLogin = in.g2();
				daysSinceRecoveriesChanged = in.g1();
				unreadMessages = in.g2();

				if (lastAddress != 0 && mainModalId == -1) {
					signlink.dnslookup(JString.formatIPv4(lastAddress));
					closeModal();
					short var82 = 650;
					if (daysSinceRecoveriesChanged != 201) {
						var82 = 655;
					}

					reportAbuseInput = "";
					reportAbuseMuteOption = false;

					for (int var83 = 0; var83 < IfType.list.length; var83++) {
						if (IfType.list[var83] != null && IfType.list[var83].clientCode == var82) {
							mainModalId = IfType.list[var83].layerId;
							break;
						}
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 126) {
				tutFlashIcon = in.g1();
				if (activeIcon == tutFlashIcon) {
					if (tutFlashIcon == 3) {
						activeIcon = 1;
					} else {
						activeIcon = 3;
					}

					redrawSidebar = true;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 212) {
				if (midiActive && !lowMem) {
					int var84 = in.g2();
					int var85 = in.g4();
					int var86 = psize - 6;
					byte[] var87 = new byte[var85];
					BZip2.decompress(var87, var85, in.data, var86, in.pos);
					saveMidi(var87, var85, false);
					nextMusicDelay = var84;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 254) {
				inMultizone = in.g1();
				ptype = -1;
				return true;
			}

			if (ptype == 12) {
				int var88 = in.g2();
				int var89 = in.g1();
				int var90 = in.g2();
				if (waveEnabled && !lowMem && waveCount < 50) {
					waveIds[waveCount] = var88;
					waveLoops[waveCount] = var89;
					waveDelay[waveCount] = JagFX.delays[var88] + var90;
					waveCount++;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 204) {
				int var91 = in.g2();
				int var92 = in.g2();
				NpcType var93 = NpcType.list(var92);
				IfType.list[var91].model1 = var93.getHeadModel();
				ptype = -1;
				return true;
			}

			if (ptype == 7) {
				zoneUpdateX = in.g1();
				zoneUpdateZ = in.g1();
				ptype = -1;
				return true;
			}

			if (ptype == 103) {
				int var94 = in.g2();
				int var95 = in.g2();
				int var96 = in.g2();
				IfType var97 = IfType.list[var94];
				Model var98 = var97.model1;
				if (var98 != null) {
					var98.recolour(var95, var96);
				}

				ptype = -1;
				return true;
			}

			if (ptype == 32) {
				chatPublicMode = in.g1();
				chatPrivateMode = in.g1();
				chatTradeMode = in.g1();
				redrawChatMode = true;
				redrawChatback = true;
				ptype = -1;
				return true;
			}

			if (ptype == 195) {
				int var99 = in.g2();
				ifAnimReset(var99);

				if (chatComId != -1) {
					chatComId = -1;
					redrawChatback = true;
				}

				if (dialogInputOpen) {
					dialogInputOpen = false;
					redrawChatback = true;
				}

				sideModalId = var99;
				redrawSidebar = true;
				redrawIcons = true;
				mainModalId = -1;
				resumedPauseButton = false;
				ptype = -1;
				return true;
			}

			if (ptype == 14) {
				int var100 = in.g2();
				ifAnimReset(var100);

				if (sideModalId != -1) {
					sideModalId = -1;
					redrawSidebar = true;
					redrawIcons = true;
				}

				chatComId = var100;
				redrawChatback = true;
				mainModalId = -1;
				resumedPauseButton = false;
				ptype = -1;
				return true;
			}

			if (ptype == 209) {
				int var101 = in.g2();
				int var102 = in.g2b();
				int var103 = in.g2b();
				IfType var104 = IfType.list[var101];
				var104.x = var102;
				var104.y = var103;
				ptype = -1;
				return true;
			}

			if (ptype == 3) {
				cinemaCam = true;
				camMoveToLx = in.g1();
				camMoveToLz = in.g1();
				camMoveToHei = in.g2();
				camMoveToRate = in.g1();
				camMoveToRate2 = in.g1();
				if (camMoveToRate2 >= 100) {
					camX = camMoveToLx * 128 + 64;
					camZ = camMoveToLz * 128 + 64;
					camY = getAvH(minusedlevel, camMoveToLx, camMoveToLz) - camMoveToHei;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 135) {
				zoneUpdateX = in.g1();
				zoneUpdateZ = in.g1();
				for (int var105 = zoneUpdateX; var105 < zoneUpdateX + 8; var105++) {
					for (int var106 = zoneUpdateZ; var106 < zoneUpdateZ + 8; var106++) {
						if (groundObj[minusedlevel][var105][var106] != null) {
							groundObj[minusedlevel][var105][var106] = null;
							showObject(var105, var106);
						}
					}
				}

				for (LocChange var107 = (LocChange) locChanges.head(); var107 != null; var107 = (LocChange) locChanges.next()) {
					if (var107.x >= zoneUpdateX && var107.x < zoneUpdateX + 8 && var107.z >= zoneUpdateZ && var107.z < zoneUpdateZ + 8 && minusedlevel == var107.level) {
						locChangeUnchecked(var107.oldAngle, var107.x, var107.z, var107.layer, var107.oldType, var107.oldShape, var107.level);
						var107.unlink();
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 132) {
				int var108 = in.g1();
				int var109 = in.g1();
				int var110 = in.g2();
				int var111 = in.g2();
				int var112 = -1;
				for (int var113 = 0; var113 < mapBuildIndex.length; var113++) {
					if ((var108 << 8) + var109 == mapBuildIndex[var113]) {
						var112 = var113;
					}
				}

				if (var112 != -1) {
					if (mapBuildGroundData[var112] == null || mapBuildGroundData[var112].length != var111) {
						mapBuildGroundData[var112] = new byte[var111];
					}

					in.gdata(psize - 6, var110, mapBuildGroundData[var112]);
				}

				ptype = -1;
				return true;
			}

			if (ptype == 41) {
				long var114 = in.g8();
				int var116 = in.g4();
				int var117 = in.g1();
				boolean var118 = false;
				for (int var119 = 0; var119 < 100; var119++) {
					if (privateMessageIds[var119] == var116) {
						var118 = true;
						break;
					}
				}

				if (var117 <= 1) {
					for (int var120 = 0; var120 < ignoreCount; var120++) {
						if (ignoreUserhash[var120] == var114) {
							var118 = true;
							break;
						}
					}
				}

				if (!var118 && chatDisabled == 0) {
					try {
						privateMessageIds[privateMessageCount] = var116;
						privateMessageCount = (privateMessageCount + 1) % 100;
						String var121 = WordPack.unpack(in, psize - 13);
						var121 = WordFilter.filter(var121);
						if (var117 > 1) {
							addChat(7, var121, JString.toScreenName(JString.toRawUsername(var114)));
						} else {
							addChat(3, var121, JString.toScreenName(JString.toRawUsername(var114)));
						}
					} catch (Exception var180) {
						signlink.reporterror("cde1");
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 193) {
				for (int var123 = 0; var123 < var.length; var123++) {
					if (varServ[var123] != var[var123]) {
						var[var123] = varServ[var123];
						clientVar(var123);
						redrawSidebar = true;
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 87) {
				int var124 = in.g2();
				int var125 = in.g2();
				IfType.list[var124].model1 = new Model(var125);
				ptype = -1;
				return true;
			}

			if (ptype == 185) {
				int var126 = in.g2b();
				tutComId = var126;
				redrawChatback = true;
				ptype = -1;
				return true;
			}

			if (ptype == 68) {
				if (activeIcon == 12) {
					redrawSidebar = true;
				}

				runenergy = in.g1();
				ptype = -1;
				return true;
			}

			if (ptype == 74) {
				cinemaCam = true;
				camLookAtLx = in.g1();
				camLookAtLz = in.g1();
				camLookAtHei = in.g2();
				camLookAtRate = in.g1();
				camLookAtRate2 = in.g1();
				if (camLookAtRate2 >= 100) {
					int var127 = camLookAtLx * 128 + 64;
					int var128 = camLookAtLz * 128 + 64;
					int var129 = getAvH(minusedlevel, camLookAtLx, camLookAtLz) - camLookAtHei;
					int var130 = var127 - camX;
					int var131 = var129 - camY;
					int var132 = var128 - camZ;
					int var133 = (int) Math.sqrt(var130 * var130 + var132 * var132);
					camPitch = (int) (Math.atan2(var131, var133) * 325.949D) & 0x7FF;
					camYaw = (int) (Math.atan2(var130, var132) * -325.949D) & 0x7FF;

					if (camPitch < 128) {
						camPitch = 128;
					}

					if (camPitch > 383) {
						camPitch = 383;
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 84) {
				activeIcon = in.g1();
				redrawSidebar = true;
				redrawIcons = true;
				ptype = -1;
				return true;
			}

			if (ptype == 4) {
				String var134 = in.gstr();
				if (var134.endsWith(":tradereq:")) {
					String var135 = var134.substring(0, var134.indexOf(":"));
					long var136 = JString.toUserhash(var135);
					boolean var138 = false;
					for (int var139 = 0; var139 < ignoreCount; var139++) {
						if (ignoreUserhash[var139] == var136) {
							var138 = true;
							break;
						}
					}

					if (!var138 && chatDisabled == 0) {
						addChat(4, "wishes to trade with you.", var135);
					}
				} else if (var134.endsWith(":duelreq:")) {
					String var140 = var134.substring(0, var134.indexOf(":"));
					long var141 = JString.toUserhash(var140);
					boolean var143 = false;
					for (int var144 = 0; var144 < ignoreCount; var144++) {
						if (ignoreUserhash[var144] == var141) {
							var143 = true;
							break;
						}
					}

					if (!var143 && chatDisabled == 0) {
						addChat(8, "wishes to duel with you.", var140);
					}
				} else {
					addChat(0, var134, "");
				}

				ptype = -1;
				return true;
			}

			if (ptype == 46) {
				int var145 = in.g2();
				int var146 = in.g2();
				int var147 = in.g2();
				ObjType var148 = ObjType.list(var146);
				IfType.list[var145].model1 = var148.getModelLit(50);
				IfType.list[var145].modelXAn = var148.xan2d;
				IfType.list[var145].modelYAn = var148.yan2d;
				IfType.list[var145].modelZoom = var148.zoom2d * 100 / var147;
				ptype = -1;
				return true;
			}

			if (ptype == 168) {
				int var149 = in.g2();
				ifAnimReset(var149);

				if (sideModalId != -1) {
					sideModalId = -1;
					redrawSidebar = true;
					redrawIcons = true;
				}

				if (chatComId != -1) {
					chatComId = -1;
					redrawChatback = true;
				}

				if (dialogInputOpen) {
					dialogInputOpen = false;
					redrawChatback = true;
				}

				mainModalId = var149;
				resumedPauseButton = false;
				ptype = -1;
				return true;
			}

			if (ptype == 2) {
				int var150 = in.g2();
				int var151 = in.g2();
				int var152 = var151 >> 10 & 0x1F;
				int var153 = var151 >> 5 & 0x1F;
				int var154 = var151 & 0x1F;
				IfType.list[var150].colour = (var154 << 3) + (var152 << 19) + (var153 << 11);
				ptype = -1;
				return true;
			}

			if (ptype == 136) {
				for (int var155 = 0; var155 < players.length; var155++) {
					if (players[var155] != null) {
						players[var155].primaryAnim = -1;
					}
				}

				for (int var156 = 0; var156 < npc.length; var156++) {
					if (npc[var156] != null) {
						npc[var156].primaryAnim = -1;
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 26) {
				int var157 = in.g2();
				boolean var158 = in.g1() == 1;
				IfType.list[var157].hide = var158;
				ptype = -1;
				return true;
			}

			if (ptype == 21) {
				ignoreCount = psize / 8;
				for (int var159 = 0; var159 < ignoreCount; var159++) {
					ignoreUserhash[var159] = in.g8();
				}

				ptype = -1;
				return true;
			}

			if (ptype == 239) {
				cinemaCam = false;

				for (int var160 = 0; var160 < 5; var160++) {
					camShake[var160] = false;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 129) {
				if (sideModalId != -1) {
					sideModalId = -1;
					redrawSidebar = true;
					redrawIcons = true;
				}

				if (chatComId != -1) {
					chatComId = -1;
					redrawChatback = true;
				}

				if (dialogInputOpen) {
					dialogInputOpen = false;
					redrawChatback = true;
				}

				mainModalId = -1;
				resumedPauseButton = false;
				ptype = -1;
				return true;
			}

			if (ptype == 201) {
				int var161 = in.g2();
				String var162 = in.gstr();
				IfType.list[var161].text = var162;

				if (sideIcon[activeIcon] == IfType.list[var161].layerId) {
					redrawSidebar = true;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 44) {
				redrawSidebar = true;
				int var163 = in.g1();
				int var164 = in.g4();
				int var165 = in.g1();
				statXP[var163] = var164;
				statEffectiveLevel[var163] = var165;
				statBaseLevel[var163] = 1;
				for (int var166 = 0; var166 < 98; var166++) {
					if (var164 >= skillxp[var166]) {
						statBaseLevel[var163] = var166 + 2;
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 162) {
				zoneUpdateX = in.g1();
				zoneUpdateZ = in.g1();

				while (in.pos < psize) {
					int var167 = in.g1();
					zonePacket(in, var167);
				}

				ptype = -1;
				return true;
			}

			if (ptype == 22) {
				if (activeIcon == 12) {
					redrawSidebar = true;
				}

				runweight = in.g2b();
				ptype = -1;
				return true;
			}

			if (ptype == 13) {
				int var168 = in.g1();
				int var169 = in.g1();
				int var170 = in.g1();
				int var171 = in.g1();
				camShake[var168] = true;
				camShakeAxis[var168] = var169;
				camShakeRan[var168] = var170;
				camShakeAmp[var168] = var171;
				camShakeCycle[var168] = 0;
				ptype = -1;
				return true;
			}

			if (ptype == 213) {
				redrawSidebar = true;
				int var172 = in.g2();
				IfType var173 = IfType.list[var172];
				while (in.pos < psize) {
					int var174 = in.g1();
					int var175 = in.g2();
					int var176 = in.g1();
					if (var176 == 255) {
						var176 = in.g4();
					}

					if (var174 >= 0 && var174 < var173.linkObjType.length) {
						var173.linkObjType[var174] = var175;
						var173.linkObjNumber[var174] = var176;
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 184) {
				getPlayerPos(in, psize);

				if (sceneState == 1) {
					sceneState = 2;
					ClientBuild.minusedlevel = minusedlevel;
					mapBuild();
				}

				if (lowMem && sceneState == 2 && ClientBuild.minusedlevel != minusedlevel) {
					areaGame.setPixels();
					p12.centreString(151, 0, "Loading - please wait.", 257);
					p12.centreString(150, 0xFFFFFF, "Loading - please wait.", 256);
					areaGame.draw(11, graphics, 8);
					ClientBuild.minusedlevel = minusedlevel;
					mapBuild();
				}

				if (minimapLevel != minusedlevel && sceneState == 2) {
					minimapLevel = minusedlevel;
					minimapBuildBuffer(minusedlevel);
				}

				ptype = -1;
				return true;
			}

			signlink.reporterror("T1 - " + ptype + "," + psize + " - " + ptype1 + "," + ptype2);
			logout();
		} catch (IOException var181) {
			lostCon();
		} catch (Exception var182) {
			String var178 = "T2 - " + ptype + "," + ptype1 + "," + ptype2 + " - " + psize + "," + (localPlayer.routeX[0] + mapBuildBaseX) + "," + (localPlayer.routeZ[0] + mapBuildBaseZ) + " - ";
			for (int var179 = 0; var179 < psize && var179 < 50; var179++) {
				var178 = var178 + in.data[var179] + ",";
			}

			signlink.reporterror(var178);
			logout();
		}

		return true;
	}

	@ObfuscatedName("client.s(B)V")
	public final void drawSide() {
		areaSide.setPixels();
		Pix3D.scanline = sideScanline;
		invback.plotSprite(0, 0);

		if (sideModalId != -1) {
			drawInterface(0, 0, IfType.list[sideModalId], 0);
		} else if (sideIcon[activeIcon] != -1) {
			drawInterface(0, 0, IfType.list[sideIcon[activeIcon]], 0);
		}

		if (isMenuOpen && menuArea == 1) {
			drawMinimenu();
		}

		areaSide.draw(231, graphics, 562);
		areaGame.setPixels();
		Pix3D.scanline = gameScanline;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public final boolean isFriend(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < friendCount; var2++) {
			if (arg0.equalsIgnoreCase(friendUsername[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(localPlayer.name)) {
			return true;
		}

		return false;
	}

	public final void init() {
		nodeId = Integer.parseInt(getParameter("nodeid"));
		portOffset = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			setLowMem();
		} else {
			setHighMem();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			memServer = false;
		} else {
			memServer = true;
		}

		initApplet(532, 789);
	}

	@ObfuscatedName("client.a(ZIILkb;Lz;)V")
	public final void getPlayerPosDecodeExtended(int arg0, int arg1, Packet arg2, ClientPlayer arg3) {
		if ((arg1 & 0x1) == 1) {
			int var5 = arg2.g1();
			byte[] var6 = new byte[var5];
			Packet var7 = new Packet(var6);
			arg2.gdata(var5, 0, var6);
			playerAppearanceBuffer[arg0] = var7;
			arg3.setAppearance(var7);
		}

		if ((arg1 & 0x2) == 2) {
			int var8 = arg2.g2();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg3.primaryAnim == var8) {
				arg3.primaryAnimLoop = 0;
			}

			int var9 = arg2.g1();
			if (var8 == -1 || arg3.primaryAnim == -1 || SeqType.list[var8].priority > SeqType.list[arg3.primaryAnim].priority || SeqType.list[arg3.primaryAnim].priority == 0) {
				arg3.primaryAnim = var8;
				arg3.primaryFrame = 0;
				arg3.primaryAnimCycle = 0;
				arg3.primaryAnimDelay = var9;
				arg3.primaryAnimLoop = 0;
			}
		}

		if ((arg1 & 0x4) == 4) {
			arg3.faceEntity = arg2.g2();
			if (arg3.faceEntity == 0xFFFF) {
				arg3.faceEntity = -1;
			}
		}

		if ((arg1 & 0x8) == 8) {
			arg3.chatMessage = arg2.gstr();
			arg3.chatColour = 0;
			arg3.chatEffect = 0;
			arg3.chatTimer = 150;
			addChat(2, arg3.chatMessage, arg3.name);
		}

		if ((arg1 & 0x10) == 0x10) {
			arg3.damageValue = arg2.g1();
			arg3.damageType = arg2.g1();
			arg3.combatCycle = loopCycle + 400;
			arg3.health = arg2.g1();
			arg3.totalHealth = arg2.g1();
		}

		if ((arg1 & 0x20) == 0x20) {
			arg3.faceSquareX = arg2.g2();
			arg3.faceSquareZ = arg2.g2();
		}

		if ((arg1 & 0x40) == 0x40) {
			int var10 = arg2.g2();
			int var11 = arg2.g1();
			int var12 = arg2.g1();
			int var13 = arg2.pos;

			if (arg3.name != null) {
				long var14 = JString.toUserhash(arg3.name);
				boolean var16 = false;
				if (var11 <= 1) {
					for (int var17 = 0; var17 < ignoreCount; var17++) {
						if (ignoreUserhash[var17] == var14) {
							var16 = true;
							break;
						}
					}
				}

				if (!var16 && chatDisabled == 0) {
					try {
						String var18 = WordPack.unpack(arg2, var12);
						var18 = WordFilter.filter(var18);
						arg3.chatMessage = var18;
						arg3.chatColour = var10 >> 8;
						arg3.chatEffect = var10 & 0xFF;
						arg3.chatTimer = 150;

						if (var11 > 1) {
							addChat(1, var18, arg3.name);
						} else {
							addChat(2, var18, arg3.name);
						}
					} catch (Exception var21) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg2.pos = var12 + var13;
		}

		if ((arg1 & 0x100) == 0x100) {
			arg3.spotanimId = arg2.g2();
			int var20 = arg2.g4();
			arg3.spotanimHeight = var20 >> 16;
			arg3.spotanimLastCycle = (var20 & 0xFFFF) + loopCycle;
			arg3.spotanimFrame = 0;
			arg3.spotanimCycle = 0;

			if (arg3.spotanimLastCycle > loopCycle) {
				arg3.spotanimFrame = -1;
			}

			if (arg3.spotanimId == 0xFFFF) {
				arg3.spotanimId = -1;
			}
		}

		if ((arg1 & 0x200) == 0x200) {
			arg3.exactStartX = arg2.g1();
			arg3.exactStartZ = arg2.g1();
			arg3.exactEndX = arg2.g1();
			arg3.exactEndZ = arg2.g1();
			arg3.exactMoveEnd = arg2.g2() + loopCycle;
			arg3.exactMoveStart = arg2.g2() + loopCycle;
			arg3.exactMoveFacing = arg2.g1();
			arg3.routeLength = 0;
			arg3.routeX[0] = arg3.exactEndX;
			arg3.routeZ[0] = arg3.exactEndZ;
		}
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;I)V")
	public final void drawProgress(String arg0, int arg1) {
		prepareTitle();

		if (title == null) {
			super.drawProgress(arg0, arg1);
		} else {
			imageTitle4.setPixels();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			b12.centreString(var4 / 2 - var5 - 26, 0xFFFFFF, "RuneScape is loading - please wait...", var3 / 2);
			int var6 = var4 / 2 - var5 - 18;
			Pix2D.drawRect(var3 / 2 - 152, 0x8C1111, 34, var6, 304);
			Pix2D.drawRect(var3 / 2 - 151, 0, 32, var6 + 1, 302);
			Pix2D.fillRect(var6 + 2, var3 / 2 - 150, 0x8C1111, arg1 * 3, 30);
			Pix2D.fillRect(var6 + 2, arg1 * 3 + (var3 / 2 - 150), 0, 300 - arg1 * 3, 30);
			b12.centreString(var4 / 2 + 5 - var5, 0xFFFFFF, arg0, var3 / 2);
			imageTitle4.draw(186, graphics, 214);

			if (redrawFrame) {
				redrawFrame = false;

				if (!flameActive) {
					imageTitle0.draw(0, graphics, 0);
					imageTitle1.draw(0, graphics, 661);
				}

				imageTitle2.draw(0, graphics, 128);
				imageTitle3.draw(386, graphics, 214);
				imageTitle5.draw(265, graphics, 0);
				imageTitle6.draw(265, graphics, 574);
				imageTitle7.draw(186, graphics, 128);
				imageTitle8.draw(186, graphics, 574);
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 225);

			if (arg0.length == 4) {
				nodeId = Integer.parseInt(arg0[0]);
				portOffset = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					setLowMem();
				} else if (arg0[2].equals("highmem")) {
					setHighMem();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
					return;
				}

				if (arg0[3].equals("free")) {
					memServer = false;
				} else if (arg0[3].equals("members")) {
					memServer = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
					return;
				}

				signlink.startpriv(InetAddress.getLocalHost());
				Client var1 = new Client();
				var1.initApplication(532, 789);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
			}
		} catch (Exception var3) {
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			skillxp[var1] = var0 / 4;
		}
	}
}

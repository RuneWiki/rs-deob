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
import jagex2.config.VarbitType;
import jagex2.config.VarpType;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.ClientEntity;
import jagex2.dash3d.ClientLocAnim;
import jagex2.dash3d.ClientNpc;
import jagex2.dash3d.ClientObj;
import jagex2.dash3d.ClientPlayer;
import jagex2.dash3d.ClientProj;
import jagex2.dash3d.CollisionMap;
import jagex2.dash3d.Decor;
import jagex2.dash3d.GroundDecor;
import jagex2.dash3d.LocChange;
import jagex2.dash3d.MapSpotAnim;
import jagex2.dash3d.Model;
import jagex2.dash3d.Pix3D;
import jagex2.dash3d.Sprite;
import jagex2.dash3d.Wall;
import jagex2.dash3d.World;
import jagex2.datastruct.JString;
import jagex2.datastruct.LinkList;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix32;
import jagex2.graphics.Pix8;
import jagex2.graphics.PixFont;
import jagex2.graphics.PixMap;
import jagex2.io.ClientStream;
import jagex2.io.FileStream;
import jagex2.io.Isaac;
import jagex2.io.JagFile;
import jagex2.io.OnDemand;
import jagex2.io.OnDemandRequest;
import jagex2.io.Packet;
import jagex2.io.Protocol;
import jagex2.sound.JagFX;
import jagex2.wordfilter.WordFilter;
import jagex2.wordfilter.WordPack;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.zip.CRC32;
import sign.signlink;

@ObfuscatedName("client")
public final class Client extends GameShell {

	@ObfuscatedName("client.ab")
	public int objSelectedComId;

	@ObfuscatedName("client.bb")
	public int objComId;

	@ObfuscatedName("client.cb")
	public String objSelectedName;

	@ObfuscatedName("client.db")
	public LinkList[][][] groundObj = new LinkList[4][104][104];

	@ObfuscatedName("client.eb")
	public long[] ignoreUserhash = new long[100];

	@ObfuscatedName("client.fb")
	public int inMultizone;

	@ObfuscatedName("client.hb")
	public int camX;

	@ObfuscatedName("client.ib")
	public int camY;

	@ObfuscatedName("client.jb")
	public int camZ;

	@ObfuscatedName("client.kb")
	public int camPitch;

	@ObfuscatedName("client.lb")
	public int camYaw;

	@ObfuscatedName("client.mb")
	public int SCROLLBAR_GRIP_LOWLIGHT = 0x332D25;

	@ObfuscatedName("client.ob")
	public byte[][][] mapl;

	@ObfuscatedName("client.pb")
	public String lastProgressMessage;

	@ObfuscatedName("client.qb")
	public String tutComMessage;

	@ObfuscatedName("client.rb")
	public int[] mapBuildIndex;

	@ObfuscatedName("client.sb")
	public int[] mapBuildGroundFile;

	@ObfuscatedName("client.tb")
	public int[] mapBuildLocationFile;

	@ObfuscatedName("client.ub")
	public String[] friendUsername = new String[200];

	@ObfuscatedName("client.vb")
	public int macroCameraZ;

	@ObfuscatedName("client.wb")
	public int macroCameraZModifier = 2;

	@ObfuscatedName("client.yb")
	public int macroCameraCycle;

	@ObfuscatedName("client.zb")
	public int[] routeX = new int[4000];

	@ObfuscatedName("client.ac")
	public PixMap areaChat;

	@ObfuscatedName("client.bc")
	public int staffmodlevel;

	@ObfuscatedName("client.cc")
	public long socialUserhash;

	@ObfuscatedName("client.dc")
	public int sceneCycle;

	@ObfuscatedName("client.ec")
	public int camMoveToLx;

	@ObfuscatedName("client.fc")
	public int camMoveToLz;

	@ObfuscatedName("client.gc")
	public int camMoveToHei;

	@ObfuscatedName("client.hc")
	public int camMoveToRate;

	@ObfuscatedName("client.ic")
	public int camMoveToRate2;

	@ObfuscatedName("client.jc")
	public int lastWaveLength;

	@ObfuscatedName("client.kc")
	public Pix8 redstone1;

	@ObfuscatedName("client.lc")
	public Pix8 redstone2;

	@ObfuscatedName("client.mc")
	public Pix8 redstone3;

	@ObfuscatedName("client.nc")
	public Pix8 redstone1h;

	@ObfuscatedName("client.oc")
	public Pix8 redstone2h;

	@ObfuscatedName("client.pc")
	public static int oplogic8;

	@ObfuscatedName("client.rc")
	public int bankArrangeMode;

	@ObfuscatedName("client.sc")
	public int[] compassMaskLineOffsets = new int[33];

	@ObfuscatedName("client.M")
	public String[] playerOp = new String[5];

	@ObfuscatedName("client.N")
	public boolean[] playerOpPriority = new boolean[5];

	@ObfuscatedName("client.R")
	public int[] waveLoops = new int[50];

	@ObfuscatedName("client.X")
	public int[] idkDesignPart = new int[7];

	@ObfuscatedName("client.Ab")
	public int[] routeZ = new int[4000];

	@ObfuscatedName("client.Cb")
	public boolean redrawIcons = false;

	@ObfuscatedName("client.Eb")
	public Packet out = Packet.alloc(1);

	@ObfuscatedName("client.Fb")
	public int[] camShakeAmp = new int[5];

	@ObfuscatedName("client.Mb")
	public boolean isMenuOpen = false;

	@ObfuscatedName("client.Wb")
	public IfType chatInterface = new IfType();

	@ObfuscatedName("client.tc")
	public int[] statEffectiveLevel = new int[Skills.count];

	@ObfuscatedName("client.uc")
	public int[] jagChecksum = new int[9];

	@ObfuscatedName("client.yc")
	public int macroCameraAngleModifier = 1;

	@ObfuscatedName("client.Hc")
	public boolean errorHost = false;

	@ObfuscatedName("client.Mc")
	public int[] flameLineOffset = new int[256];

	@ObfuscatedName("client.Nc")
	public int[] camShakeRan = new int[5];

	@ObfuscatedName("client.Oc")
	public boolean ingame = false;

	@ObfuscatedName("client.Pc")
	public boolean flameActive = false;

	@ObfuscatedName("client.Xc")
	public Pix8[] modIcons = new Pix8[2];

	@ObfuscatedName("client.ad")
	public boolean redrawFrame = false;

	@ObfuscatedName("client.hd")
	public LinkList spotanims = new LinkList();

	@ObfuscatedName("client.ld")
	public boolean redrawSidebar = false;

	@ObfuscatedName("client.od")
	public int scrollHeight = 78;

	@ObfuscatedName("client.pd")
	public String loginMes1 = "";

	@ObfuscatedName("client.qd")
	public String loginMes2 = "";

	@ObfuscatedName("client.rd")
	public int minimapLevel = -1;

	@ObfuscatedName("client.sd")
	public Pix32[] hitmarks = new Pix32[20];

	@ObfuscatedName("client.Ad")
	public Pix32[] mapfunction = new Pix32[100];

	@ObfuscatedName("client.Cd")
	public boolean focusIn = true;

	@ObfuscatedName("client.Ed")
	public int selfSlot = -1;

	@ObfuscatedName("client.Fd")
	public int[] chatType = new int[100];

	@ObfuscatedName("client.Gd")
	public String[] chatUsername = new String[100];

	@ObfuscatedName("client.Hd")
	public String[] chatText = new String[100];

	@ObfuscatedName("client.Id")
	public String reportAbuseInput = "";

	@ObfuscatedName("client.Jd")
	public Pix8[] sideicons = new Pix8[13];

	@ObfuscatedName("client.Ld")
	public int[] sideIcon = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Zd")
	public int[] camShakeCycle = new int[5];

	@ObfuscatedName("client.ce")
	public boolean idkDesignRedraw = false;

	@ObfuscatedName("client.ee")
	public final int[] LOC_SHAPE_TO_LAYER = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.he")
	public boolean flameThread = false;

	@ObfuscatedName("client.ke")
	public CRC32 crc32 = new CRC32();

	@ObfuscatedName("client.ne")
	public boolean idkDesignGender = true;

	@ObfuscatedName("client.pe")
	public String socialInput = "";

	@ObfuscatedName("client.qe")
	public int[] CHAT_COLOURS = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

	@ObfuscatedName("client.re")
	public int[][] dirMap = new int[104][104];

	@ObfuscatedName("client.te")
	public int[] activeMapFunctionX = new int[1000];

	@ObfuscatedName("client.ue")
	public int[] activeMapFunctionZ = new int[1000];

	@ObfuscatedName("client.De")
	public int[] camShakeAxis = new int[5];

	@ObfuscatedName("client.Ee")
	public int projectX = -1;

	@ObfuscatedName("client.Fe")
	public int projectY = -1;

	@ObfuscatedName("client.Ge")
	public Pix32[] headicons = new Pix32[20];

	@ObfuscatedName("client.Me")
	public int SCROLLBAR_GRIP_FOREGROUND = 0x4D4233;

	@ObfuscatedName("client.Ne")
	public boolean cinemaCam = false;

	@ObfuscatedName("client.Oe")
	public String chatInput = "";

	@ObfuscatedName("client.Qe")
	public int chatComId = -1;

	@ObfuscatedName("client.Se")
	public int activeIcon = 3;

	@ObfuscatedName("client.We")
	public boolean scrollGrabbed = false;

	@ObfuscatedName("client.Xe")
	public Pix8[] mapscene = new Pix8[100];

	@ObfuscatedName("client.Ye")
	public String socialInputHeader = "";

	@ObfuscatedName("client.Ze")
	public int[][] tileLastOccupiedCycle = new int[104][104];

	@ObfuscatedName("client.df")
	public boolean sendCamera = false;

	@ObfuscatedName("client.kf")
	public int nextMidiSong = -1;

	@ObfuscatedName("client.pf")
	public boolean errorStarted = false;

	@ObfuscatedName("client.rf")
	public int mainModalId = -1;

	@ObfuscatedName("client.Cf")
	public int[] waveIds = new int[50];

	@ObfuscatedName("client.Hf")
	public boolean jaggrabEnabled = false;

	@ObfuscatedName("client.If")
	public int[] compassMaskLineLengths = new int[33];

	@ObfuscatedName("client.Tf")
	public int[] entityRemovalIds = new int[1000];

	@ObfuscatedName("client.Vf")
	public final int field1282 = 100;

	@ObfuscatedName("client.Wf")
	public int[] privateMessageIds = new int[100];

	@ObfuscatedName("client.Xf")
	public boolean midiActive = true;

	@ObfuscatedName("client.bg")
	public int[] friendNodeId = new int[200];

	@ObfuscatedName("client.ig")
	public boolean waveEnabled = true;

	@ObfuscatedName("client.jg")
	public int reportAbuseComId = -1;

	@ObfuscatedName("client.lg")
	public int[] waveDelay = new int[50];

	@ObfuscatedName("client.mg")
	public int[][] distMap = new int[104][104];

	@ObfuscatedName("client.qg")
	public byte[] textureBuffer = new byte[16384];

	@ObfuscatedName("client.rg")
	public int[] idkDesignColour = new int[5];

	@ObfuscatedName("client.tg")
	public int MAX_CHATS = 50;

	@ObfuscatedName("client.ug")
	public int[] chatX = new int[MAX_CHATS];

	@ObfuscatedName("client.vg")
	public int[] chatY = new int[MAX_CHATS];

	@ObfuscatedName("client.wg")
	public int[] chatHeight = new int[MAX_CHATS];

	@ObfuscatedName("client.xg")
	public int[] chatWidth = new int[MAX_CHATS];

	@ObfuscatedName("client.yg")
	public int[] chatColour = new int[MAX_CHATS];

	@ObfuscatedName("client.zg")
	public int[] chatEffect = new int[MAX_CHATS];

	@ObfuscatedName("client.Ag")
	public int[] chatTimer = new int[MAX_CHATS];

	@ObfuscatedName("client.Bg")
	public String[] chats = new String[MAX_CHATS];

	@ObfuscatedName("client.Fg")
	public int mainOverlayId = -1;

	@ObfuscatedName("client.Gg")
	public boolean dialogInputOpen = false;

	@ObfuscatedName("client.Hg")
	public CollisionMap[] collision = new CollisionMap[4];

	@ObfuscatedName("client.Ig")
	public Packet loginout = Packet.alloc(1);

	@ObfuscatedName("client.Jg")
	public int[] var = new int[2000];

	@ObfuscatedName("client.Lg")
	public boolean redrawChatback = false;

	@ObfuscatedName("client.Mg")
	public int tutComId = -1;

	@ObfuscatedName("client.Qg")
	public String[] menuOption = new String[500];

	@ObfuscatedName("client.Ug")
	public int MAX_PLAYER_COUNT = 2048;

	@ObfuscatedName("client.Vg")
	public int LOCAL_PLAYER_INDEX = 2047;

	@ObfuscatedName("client.Wg")
	public ClientPlayer[] players = new ClientPlayer[MAX_PLAYER_COUNT];

	@ObfuscatedName("client.Yg")
	public int[] playerIds = new int[MAX_PLAYER_COUNT];

	@ObfuscatedName("client.ah")
	public int[] entityUpdateIds = new int[MAX_PLAYER_COUNT];

	@ObfuscatedName("client.bh")
	public Packet[] playerAppearanceBuffer = new Packet[MAX_PLAYER_COUNT];

	@ObfuscatedName("client.eh")
	public boolean reportAbuseMuteOption = false;

	@ObfuscatedName("client.hh")
	public int lastWaveLoops = -1;

	@ObfuscatedName("client.lh")
	public Packet in = Packet.alloc(1);

	@ObfuscatedName("client.mh")
	public int[] minimapMaskLineOffsets = new int[151];

	@ObfuscatedName("client.rh")
	public boolean redrawChatMode = false;

	@ObfuscatedName("client.wh")
	public boolean objGrabThreshold = false;

	@ObfuscatedName("client.xh")
	public String loginUser = "";

	@ObfuscatedName("client.yh")
	public String loginPass = "";

	@ObfuscatedName("client.Ah")
	public int[] minimapMaskLineLengths = new int[151];

	@ObfuscatedName("client.Dh")
	public int[] statBaseLevel = new int[Skills.count];

	@ObfuscatedName("client.Gh")
	public LinkList projectiles = new LinkList();

	@ObfuscatedName("client.Ih")
	public int SCROLLBAR_TRACK = 0x23201B;

	@ObfuscatedName("client.Jh")
	public long[] friendUserhash = new long[200];

	@ObfuscatedName("client.Lh")
	public boolean[] camShake = new boolean[5];

	@ObfuscatedName("client.Sh")
	public boolean resumedPauseButton = false;

	@ObfuscatedName("client.Th")
	public boolean withinTutorialIsland = false;

	@ObfuscatedName("client.Vh")
	public int macroMinimapZoomModifier = 1;

	@ObfuscatedName("client.Wh")
	public int[] varServ = new int[2000];

	@ObfuscatedName("client.Xh")
	public int tutFlashIcon = -1;

	@ObfuscatedName("client.Yh")
	public boolean errorLoading = false;

	@ObfuscatedName("client.Zh")
	public boolean flamesThread = false;

	@ObfuscatedName("client.bi")
	public int SCROLLBAR_GRIP_HIGHLIGHT = 0x766654;

	@ObfuscatedName("client.gi")
	public String dialogInput = "";

	@ObfuscatedName("client.ii")
	public boolean midiFading = true;

	@ObfuscatedName("client.pi")
	public int[] menuParamB = new int[500];

	@ObfuscatedName("client.qi")
	public int[] menuParamC = new int[500];

	@ObfuscatedName("client.ri")
	public int[] menuAction = new int[500];

	@ObfuscatedName("client.si")
	public int[] menuParamA = new int[500];

	@ObfuscatedName("client.Ci")
	public Pix32[] activeMapFunctions = new Pix32[1000];

	@ObfuscatedName("client.Di")
	public int orbitCameraPitch = 128;

	@ObfuscatedName("client.Ni")
	public Pix32[] cross = new Pix32[8];

	@ObfuscatedName("client.Oi")
	public int sideModalId = -1;

	@ObfuscatedName("client.Qi")
	public int macroMinimapAngleModifier = 2;

	@ObfuscatedName("client.Xi")
	public FileStream[] fileStreams = new FileStream[5];

	@ObfuscatedName("client.aj")
	public LinkList locChanges = new LinkList();

	@ObfuscatedName("client.oj")
	public int lastWaveId = -1;

	@ObfuscatedName("client.tj")
	public int macroCameraXModifier = 2;

	@ObfuscatedName("client.vj")
	public boolean awaitingPlayerInfo = false;

	@ObfuscatedName("client.zj")
	public int[] statXP = new int[Skills.count];

	@ObfuscatedName("client.Fj")
	public ClientNpc[] npc = new ClientNpc[16384];

	@ObfuscatedName("client.Hj")
	public int[] npcIds = new int[16384];

	@ObfuscatedName("client.Lj")
	public boolean socialInputOpen = false;

	@ObfuscatedName("client.U")
	public static String CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.W")
	public static int[] readbit = new int[32];

	@ObfuscatedName("client.Re")
	public static BigInteger LOGIN_RSAN = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Ef")
	public static BigInteger LOGIN_RSAE = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.kh")
	public static final int[] recol2d = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.ij")
	public static int[] skillxp = new int[99];

	@ObfuscatedName("client.jj")
	public static int nodeId = 10;

	@ObfuscatedName("client.lj")
	public static boolean memServer = true;

	@ObfuscatedName("client.nj")
	public static final int[][] recol1d = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.P")
	public static int loopCycle;

	@ObfuscatedName("client.Q")
	public int rebootTimer;

	@ObfuscatedName("client.S")
	public int chatTradeMode;

	@ObfuscatedName("client.V")
	public int membersAccount;

	@ObfuscatedName("client.Y")
	public int useMode;

	@ObfuscatedName("client.Z")
	public int objSelectedSlot;

	@ObfuscatedName("client.Bb")
	public int runenergy;

	@ObfuscatedName("client.Db")
	public static int drawCycle;

	@ObfuscatedName("client.Ib")
	public int selectedCycle;

	@ObfuscatedName("client.Jb")
	public int selectedComId;

	@ObfuscatedName("client.Kb")
	public int selectedItem;

	@ObfuscatedName("client.Lb")
	public int selectedArea;

	@ObfuscatedName("client.wc")
	public int unreadMessages;

	@ObfuscatedName("client.xc")
	public int macroCameraAngle;

	@ObfuscatedName("client.zc")
	public int chatDisabled;

	@ObfuscatedName("client.Cc")
	public int objDragComId;

	@ObfuscatedName("client.Dc")
	public int objDragSlot;

	@ObfuscatedName("client.Ec")
	public int objDragArea;

	@ObfuscatedName("client.Fc")
	public int objGrabX;

	@ObfuscatedName("client.Gc")
	public int objGrabY;

	@ObfuscatedName("client.Jc")
	public static int oplogic4;

	@ObfuscatedName("client.Rc")
	public int lastProgressPercent;

	@ObfuscatedName("client.Sc")
	public int camLookAtLx;

	@ObfuscatedName("client.Tc")
	public int camLookAtLz;

	@ObfuscatedName("client.Uc")
	public int camLookAtHei;

	@ObfuscatedName("client.Vc")
	public int camLookAtRate;

	@ObfuscatedName("client.Wc")
	public int camLookAtRate2;

	@ObfuscatedName("client.Zc")
	public int macroMinimapCycle;

	@ObfuscatedName("client.bd")
	public int zoneUpdateX;

	@ObfuscatedName("client.cd")
	public int zoneUpdateZ;

	@ObfuscatedName("client.dd")
	public int hintNpc;

	@ObfuscatedName("client.ed")
	public int runweight;

	@ObfuscatedName("client.fd")
	public int mapBuildCentreZoneX;

	@ObfuscatedName("client.gd")
	public int mapBuildCentreZoneZ;

	@ObfuscatedName("client.kd")
	public int nextMidiDelay;

	@ObfuscatedName("client.md")
	public int waveCount;

	@ObfuscatedName("client.Md")
	public int loginSelect;

	@ObfuscatedName("client.Sd")
	public int ignoreCount;

	@ObfuscatedName("client.Td")
	public int hoveredSlot;

	@ObfuscatedName("client.Ud")
	public int hoveredSlotComId;

	@ObfuscatedName("client.Xd")
	public int flameCycle;

	@ObfuscatedName("client.Yd")
	public int chatPublicMode;

	@ObfuscatedName("client.ae")
	public static int oplogic2;

	@ObfuscatedName("client.be")
	public int lastAddress;

	@ObfuscatedName("client.de")
	public int chatPrivateMode;

	@ObfuscatedName("client.ge")
	public int worldUpdateNum;

	@ObfuscatedName("client.le")
	public int menuNumEntries;

	@ObfuscatedName("client.me")
	public static int cyclelogic6;

	@ObfuscatedName("client.oe")
	public int mouseTrackedDelta;

	@ObfuscatedName("client.se")
	public int activeMapFunctionCount;

	@ObfuscatedName("client.ye")
	public int scrollCycle;

	@ObfuscatedName("client.ze")
	public int flameGradientCycle0;

	@ObfuscatedName("client.Ae")
	public int flameGradientCycle1;

	@ObfuscatedName("client.Be")
	public static int cyclelogic3;

	@ObfuscatedName("client.Ce")
	public static int cyclelogic1;

	@ObfuscatedName("client.Ke")
	public int loginscreen;

	@ObfuscatedName("client.Le")
	public int tryMoveNearest;

	@ObfuscatedName("client.Pe")
	public int daysSinceLastLogin;

	@ObfuscatedName("client.Ve")
	public int overSideComId;

	@ObfuscatedName("client.af")
	public int orbitCameraX;

	@ObfuscatedName("client.bf")
	public int orbitCameraZ;

	@ObfuscatedName("client.cf")
	public int sendCameraDelay;

	@ObfuscatedName("client.ef")
	public int minimapFlagX;

	@ObfuscatedName("client.ff")
	public int minimapFlagZ;

	@ObfuscatedName("client.hf")
	public static int oplogic9;

	@ObfuscatedName("client.jf")
	public int daysSinceRecoveriesChanged;

	@ObfuscatedName("client.lf")
	public int minimapState;

	@ObfuscatedName("client.sf")
	public static int cyclelogic4;

	@ObfuscatedName("client.Df")
	public int oneMouseButton;

	@ObfuscatedName("client.Ff")
	public int socialInputType;

	@ObfuscatedName("client.Gf")
	public static int oplogic5;

	@ObfuscatedName("client.Jf")
	public int mapBuildBaseX;

	@ObfuscatedName("client.Kf")
	public int mapBuildBaseZ;

	@ObfuscatedName("client.Lf")
	public int mapBuildPrevBaseX;

	@ObfuscatedName("client.Mf")
	public int mapBuildPrevBaseZ;

	@ObfuscatedName("client.Pf")
	public int chatEffects;

	@ObfuscatedName("client.Qf")
	public int minusedlevel;

	@ObfuscatedName("client.Rf")
	public int coolingCycle;

	@ObfuscatedName("client.Sf")
	public int entityRemovalCount;

	@ObfuscatedName("client.Uf")
	public int overChatComId;

	@ObfuscatedName("client.ag")
	public int cameraPitchClamp;

	@ObfuscatedName("client.cg")
	public int splitPrivateChat;

	@ObfuscatedName("client.kg")
	public int chatScrollPos;

	@ObfuscatedName("client.og")
	public int scrollInputPadding;

	@ObfuscatedName("client.sg")
	public int chatCount;

	@ObfuscatedName("client.Cg")
	public int warnMembersInNonMembers;

	@ObfuscatedName("client.Dg")
	public static int cyclelogic5;

	@ObfuscatedName("client.Rg")
	public int friendCount;

	@ObfuscatedName("client.Sg")
	public int friendServerStatus;

	@ObfuscatedName("client.Xg")
	public int playerCount;

	@ObfuscatedName("client.Zg")
	public int entityUpdateCount;

	@ObfuscatedName("client.fh")
	public int sceneState;

	@ObfuscatedName("client.gh")
	public int lastOverComId;

	@ObfuscatedName("client.ih")
	public static int cyclelogic2;

	@ObfuscatedName("client.oh")
	public int ptype0;

	@ObfuscatedName("client.ph")
	public int ptype1;

	@ObfuscatedName("client.qh")
	public int ptype2;

	@ObfuscatedName("client.sh")
	public int crossX;

	@ObfuscatedName("client.th")
	public int crossY;

	@ObfuscatedName("client.uh")
	public int crossCycle;

	@ObfuscatedName("client.vh")
	public int crossMode;

	@ObfuscatedName("client.Bh")
	public static int oplogic3;

	@ObfuscatedName("client.Hh")
	public static int oplogic6;

	@ObfuscatedName("client.Mh")
	public int hintTileX;

	@ObfuscatedName("client.Nh")
	public int hintTileZ;

	@ObfuscatedName("client.Oh")
	public int hintHeight;

	@ObfuscatedName("client.Ph")
	public int hintOffsetX;

	@ObfuscatedName("client.Qh")
	public int hintOffsetZ;

	@ObfuscatedName("client.Uh")
	public int macroMinimapZoom;

	@ObfuscatedName("client.fi")
	public int hintPlayer;

	@ObfuscatedName("client.hi")
	public int midiSong;

	@ObfuscatedName("client.ki")
	public int privateMessageCount;

	@ObfuscatedName("client.ti")
	public static int oplogic7;

	@ObfuscatedName("client.ui")
	public int targetMode;

	@ObfuscatedName("client.vi")
	public int targetComId;

	@ObfuscatedName("client.wi")
	public int targetMask;

	@ObfuscatedName("client.yi")
	public int hintType;

	@ObfuscatedName("client.Ei")
	public int orbitCameraYaw;

	@ObfuscatedName("client.Fi")
	public int orbitCameraYawVelocity;

	@ObfuscatedName("client.Gi")
	public int orbitCameraPitchVelocity;

	@ObfuscatedName("client.Pi")
	public int macroMinimapAngle;

	@ObfuscatedName("client.Ri")
	public int psize;

	@ObfuscatedName("client.Si")
	public int ptype;

	@ObfuscatedName("client.Ti")
	public int timeoutTimer;

	@ObfuscatedName("client.Ui")
	public int noTimeoutTimer;

	@ObfuscatedName("client.Vi")
	public int logoutTimer;

	@ObfuscatedName("client.Zi")
	public static int cyclelogic7;

	@ObfuscatedName("client.ej")
	public static int oplogic1;

	@ObfuscatedName("client.fj")
	public int mouseTrackedX;

	@ObfuscatedName("client.gj")
	public int mouseTrackedY;

	@ObfuscatedName("client.kj")
	public static int portOffset;

	@ObfuscatedName("client.sj")
	public int macroCameraX;

	@ObfuscatedName("client.uj")
	public int overMainComId;

	@ObfuscatedName("client.wj")
	public int objDragCycle;

	@ObfuscatedName("client.Aj")
	public int menuArea;

	@ObfuscatedName("client.Bj")
	public int menuX;

	@ObfuscatedName("client.Cj")
	public int menuY;

	@ObfuscatedName("client.Dj")
	public int menuWidth;

	@ObfuscatedName("client.Ej")
	public int menuHeight;

	@ObfuscatedName("client.Gj")
	public int npcCount;

	@ObfuscatedName("client.hg")
	public long lastWaveStartTime;

	@ObfuscatedName("client.dh")
	public long sceneLoadStartTime;

	@ObfuscatedName("client.cj")
	public long prevMouseClickTime;

	@ObfuscatedName("client.dj")
	public long loginSeed;

	@ObfuscatedName("client.Yc")
	public World world;

	@ObfuscatedName("client.yj")
	public static ClientPlayer localPlayer;

	@ObfuscatedName("client.Ac")
	public Pix32 flameLeft;

	@ObfuscatedName("client.Bc")
	public Pix32 flameRight;

	@ObfuscatedName("client.Vd")
	public Pix32 mapmarker1;

	@ObfuscatedName("client.Wd")
	public Pix32 mapmarker2;

	@ObfuscatedName("client.gf")
	public Pix32 minimap;

	@ObfuscatedName("client.Nf")
	public Pix32 idkDesignButton1;

	@ObfuscatedName("client.Of")
	public Pix32 idkDesignButton2;

	@ObfuscatedName("client.ng")
	public Pix32 compass;

	@ObfuscatedName("client.ch")
	public Pix32 mapedge;

	@ObfuscatedName("client.li")
	public Pix32 mapdots1;

	@ObfuscatedName("client.mi")
	public Pix32 mapdots2;

	@ObfuscatedName("client.ni")
	public Pix32 mapdots3;

	@ObfuscatedName("client.oi")
	public Pix32 mapdots4;

	@ObfuscatedName("client.Eh")
	public Pix8 scrollbar1;

	@ObfuscatedName("client.Fh")
	public Pix8 scrollbar2;

	@ObfuscatedName("client.ci")
	public Pix8 backbase1;

	@ObfuscatedName("client.di")
	public Pix8 backbase2;

	@ObfuscatedName("client.ei")
	public Pix8 backhmid1;

	@ObfuscatedName("client.zi")
	public Pix8 invback;

	@ObfuscatedName("client.Ai")
	public Pix8 mapback;

	@ObfuscatedName("client.Bi")
	public Pix8 chatback;

	@ObfuscatedName("client.Ii")
	public Pix8 redstone1v;

	@ObfuscatedName("client.Ji")
	public Pix8 redstone2v;

	@ObfuscatedName("client.Ki")
	public Pix8 redstone3v;

	@ObfuscatedName("client.Li")
	public Pix8 redstone1hv;

	@ObfuscatedName("client.Mi")
	public Pix8 redstone2hv;

	@ObfuscatedName("client.Jj")
	public Pix8 titlebox;

	@ObfuscatedName("client.Kj")
	public Pix8 titlebutton;

	@ObfuscatedName("client.dg")
	public PixFont p11;

	@ObfuscatedName("client.eg")
	public PixFont p12;

	@ObfuscatedName("client.fg")
	public PixFont b12;

	@ObfuscatedName("client.gg")
	public PixFont q8;

	@ObfuscatedName("client.Nb")
	public PixMap areaBackleft1;

	@ObfuscatedName("client.Ob")
	public PixMap areaBackleft2;

	@ObfuscatedName("client.Pb")
	public PixMap areaBackright1;

	@ObfuscatedName("client.Qb")
	public PixMap areaBackright2;

	@ObfuscatedName("client.Rb")
	public PixMap areaBacktop1;

	@ObfuscatedName("client.Sb")
	public PixMap areaBackvmid1;

	@ObfuscatedName("client.Tb")
	public PixMap areaBackvmid2;

	@ObfuscatedName("client.Ub")
	public PixMap areaBackvmid3;

	@ObfuscatedName("client.Vb")
	public PixMap areaBackhmid2;

	@ObfuscatedName("client.Xb")
	public PixMap areaSide;

	@ObfuscatedName("client.Yb")
	public PixMap areaMap;

	@ObfuscatedName("client.Zb")
	public PixMap areaGame;

	@ObfuscatedName("client.ve")
	public PixMap areaBackbase1;

	@ObfuscatedName("client.we")
	public PixMap areaBackbase2;

	@ObfuscatedName("client.xe")
	public PixMap areaBackhmid1;

	@ObfuscatedName("client.tf")
	public PixMap imageTitle2;

	@ObfuscatedName("client.uf")
	public PixMap imageTitle3;

	@ObfuscatedName("client.vf")
	public PixMap imageTitle4;

	@ObfuscatedName("client.wf")
	public PixMap imageTitle0;

	@ObfuscatedName("client.xf")
	public PixMap imageTitle1;

	@ObfuscatedName("client.yf")
	public PixMap imageTitle5;

	@ObfuscatedName("client.zf")
	public PixMap imageTitle6;

	@ObfuscatedName("client.Af")
	public PixMap imageTitle7;

	@ObfuscatedName("client.Bf")
	public PixMap imageTitle8;

	@ObfuscatedName("client.Ue")
	public OnDemand onDemand;

	@ObfuscatedName("client.Bd")
	public Isaac randomIn;

	@ObfuscatedName("client.zd")
	public JagFile title;

	@ObfuscatedName("client.Kh")
	public MouseTracking mouseTracking;

	@ObfuscatedName("client.Kg")
	public ClientStream stream;

	@ObfuscatedName("client.xi")
	public String targetOp;

	@ObfuscatedName("client.Je")
	public Socket jaggrabSocket;

	@ObfuscatedName("client.jd")
	public static boolean alreadystarted;

	@ObfuscatedName("client.Rh")
	public static boolean mouseTracked;

	@ObfuscatedName("client.mj")
	public static boolean lowMem;

	@ObfuscatedName("client.td")
	public int[] flameGradient;

	@ObfuscatedName("client.ud")
	public int[] flameGradient0;

	@ObfuscatedName("client.vd")
	public int[] flameGradient1;

	@ObfuscatedName("client.wd")
	public int[] flameGradient2;

	@ObfuscatedName("client.ie")
	public int[] flameBuffer3;

	@ObfuscatedName("client.je")
	public int[] flameBuffer2;

	@ObfuscatedName("client.Ng")
	public int[] flameBuffer0;

	@ObfuscatedName("client.Og")
	public int[] flameBuffer1;

	@ObfuscatedName("client.pj")
	public int[] chatScanline;

	@ObfuscatedName("client.qj")
	public int[] sideScanline;

	@ObfuscatedName("client.rj")
	public int[] gameScanline;

	@ObfuscatedName("client.bj")
	public Pix8[] runes;

	@ObfuscatedName("client.vc")
	public byte[][] mapBuildGroundData;

	@ObfuscatedName("client.Kd")
	public byte[][] mapBuildLocationData;

	@ObfuscatedName("client.Od")
	public int[][][] groundh;

	@ObfuscatedName("client.a(III)Z")
	public final boolean animateInterface(int arg0, int arg1) {
		boolean var3 = false;
		IfType var4 = IfType.list[arg1];
		for (int var5 = 0; var5 < var4.children.length && var4.children[var5] != -1; var5++) {
			IfType var6 = IfType.list[var4.children[var5]];
			if (var6.type == 1) {
				var3 |= animateInterface(arg0, var6.id);
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
					var6.animCycle += arg0;
					while (var6.animCycle > var9.getDelay(var6.animFrame)) {
						var6.animCycle -= var9.getDelay(var6.animFrame) + 1;
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

	@ObfuscatedName("client.e(I)V")
	public final void drawMinimenu() {
		int var1 = menuX;
		int var2 = menuY;
		int var3 = menuWidth;
		int var4 = menuHeight;
		int var5 = 0x5D5447;
		Pix2D.fillRect(var4, var5, var3, var1, var2);
		Pix2D.fillRect(16, 0, var3 - 2, var1 + 1, var2 + 1);
		Pix2D.drawRect(var3 - 2, 0, var4 - 19, var1 + 1, var2 + 18);
		b12.drawString(var1 + 3, "Choose Option", var5, var2 + 14);
		int var6 = mouseX;
		int var7 = mouseY;
		if (menuArea == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (menuArea == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (menuArea == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < menuNumEntries; var8++) {
			int var9 = (menuNumEntries - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			b12.drawStringTag(menuOption[var8], true, var9, var1 + 3, var10);
		}
	}

	@ObfuscatedName("client.f(I)V")
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
			imageTitle0 = new PixMap(265, 128, getBaseComponent());
			Pix2D.cls();
			imageTitle1 = new PixMap(265, 128, getBaseComponent());
			Pix2D.cls();
			imageTitle2 = new PixMap(171, 509, getBaseComponent());
			Pix2D.cls();
			imageTitle3 = new PixMap(132, 360, getBaseComponent());
			Pix2D.cls();
			imageTitle4 = new PixMap(200, 360, getBaseComponent());
			Pix2D.cls();
			imageTitle5 = new PixMap(238, 202, getBaseComponent());
			Pix2D.cls();
			imageTitle6 = new PixMap(238, 203, getBaseComponent());
			Pix2D.cls();
			imageTitle7 = new PixMap(94, 74, getBaseComponent());
			Pix2D.cls();
			imageTitle8 = new PixMap(94, 75, getBaseComponent());
			Pix2D.cls();

			if (title != null) {
				loadTitleBackground();
				loadTitleImages();
			}

			redrawFrame = true;
		}
	}

	@ObfuscatedName("client.a(IZIIIII)V")
	public final void camFollow(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg1 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
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

		camX = arg3 - var9;
		camY = arg2 - var10;
		camZ = arg0 - var11;
		camPitch = arg1;
		camYaw = arg4;
	}

	@ObfuscatedName("client.g(I)V")
	public final void otherOverlays() {
		drawPrivateMessages();

		if (crossMode == 1) {
			cross[crossCycle / 100].plotSprite(crossX - 8 - 4, crossY - 8 - 4);
		}

		if (crossMode == 2) {
			cross[crossCycle / 100 + 4].plotSprite(crossX - 8 - 4, crossY - 8 - 4);
			cyclelogic5++;
			if (cyclelogic5 > 57) {
				cyclelogic5 = 0;
				out.p1enc(100);
			}
		}

		if (mainOverlayId != -1) {
			animateInterface(worldUpdateNum, mainOverlayId);
			drawInterface(0, IfType.list[mainOverlayId], 0, 0);
		}

		if (mainModalId != -1) {
			animateInterface(worldUpdateNum, mainModalId);
			drawInterface(0, IfType.list[mainModalId], 0, 0);
		}

		getSpecialArea();

		if (!isMenuOpen) {
			buildMinimenu();
			drawFeedback();
		} else if (menuArea == 0) {
			drawMinimenu();
		}

		if (inMultizone == 1) {
			headicons[1].plotSprite(472, 296);
		}

		if (rebootTimer != 0) {
			int var1 = rebootTimer / 50;
			int var2 = var1 / 60;
			var1 %= 60;
			if (var1 < 10) {
				p12.drawString(4, "System update in: " + var2 + ":0" + var1, 0xFFFF00, 329);
			} else {
				p12.drawString(4, "System update in: " + var2 + ":" + var1, 0xFFFF00, 329);
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void mapBuild() {
		try {
			minimapLevel = -1;
			spotanims.clear();
			projectiles.clear();
			Pix3D.clearTexels();
			clearCaches();
			world.resetMap();

			for (int var1 = 0; var1 < 4; var1++) {
				collision[var1].reset();
			}

			System.gc();
			ClientBuild var2 = new ClientBuild(104, groundh, 104, mapl);
			int var3 = mapBuildGroundData.length;
			ClientBuild.lowMem = World.lowMem;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = mapBuildIndex[var4] >> 8;
				int var6 = mapBuildIndex[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					ClientBuild.lowMem = false;
				}
			}

			if (ClientBuild.lowMem) {
				world.fillBaseLevel(minusedlevel);
			} else {
				world.fillBaseLevel(0);
			}

			out.p1enc(120);

			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (mapBuildIndex[var7] >> 8) * 64 - mapBuildBaseX;
				int var9 = (mapBuildIndex[var7] & 0xFF) * 64 - mapBuildBaseZ;
				byte[] var10 = mapBuildGroundData[var7];
				if (var10 != null) {
					var2.loadGround((mapBuildCentreZoneX - 6) * 8, var10, var9, (mapBuildCentreZoneZ - 6) * 8, var8);
				}
			}

			for (int var11 = 0; var11 < var3; var11++) {
				int var12 = (mapBuildIndex[var11] >> 8) * 64 - mapBuildBaseX;
				int var13 = (mapBuildIndex[var11] & 0xFF) * 64 - mapBuildBaseZ;
				byte[] var14 = mapBuildGroundData[var11];
				if (var14 == null && mapBuildCentreZoneZ < 800) {
					var2.fadeAdjacent(var13, var12, 64, 64);
				}
			}

			out.p1enc(120);

			for (int var15 = 0; var15 < var3; var15++) {
				byte[] var16 = mapBuildLocationData[var15];
				if (var16 != null) {
					int var17 = (mapBuildIndex[var15] >> 8) * 64 - mapBuildBaseX;
					int var18 = (mapBuildIndex[var15] & 0xFF) * 64 - mapBuildBaseZ;
					var2.loadLocations(var18, var16, world, var17, collision);
				}
			}

			out.p1enc(120);
			var2.finishBuild(collision, world);
			areaGame.setPixels();
			out.p1enc(120);

			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					showObject(var19, var20);
				}
			}

			locChangePostBuildCorrect();
		} catch (Exception var33) {
		}

		LocType.mc1.clear();

		if (lowMem && signlink.cache_dat != null) {
			int var22 = onDemand.getFileCount(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = onDemand.getModelUse(var23);
				if ((var24 & 0x79) == 0) {
					Model.unload(var23);
				}
			}
		}

		System.gc();
		Pix3D.initPool(20);
		onDemand.clearPrefetches();
		int var25 = (mapBuildCentreZoneX - 6) / 8 - 1;
		int var26 = (mapBuildCentreZoneX + 6) / 8 + 1;
		int var27 = (mapBuildCentreZoneZ - 6) / 8 - 1;
		int var28 = (mapBuildCentreZoneZ + 6) / 8 + 1;
		if (withinTutorialIsland) {
			var25 = 49;
			var26 = 50;
			var27 = 49;
			var28 = 50;
		}

		for (int var29 = var25; var29 <= var26; var29++) {
			for (int var30 = var27; var30 <= var28; var30++) {
				if (var25 == var29 || var26 == var29 || var27 == var30 || var28 == var30) {
					int var31 = onDemand.getMapFile(0, var29, var30);
					if (var31 != -1) {
						onDemand.prefetch(3, var31);
					}

					int var32 = onDemand.getMapFile(1, var29, var30);
					if (var32 != -1) {
						onDemand.prefetch(3, var32);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(II)V")
	public final void setWaveVolume(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.d(B)V")
	public final void mouseLoop() {
		if (objDragArea == 0) {
			int var1 = mouseClickButton;
			if (targetMode == 1 && mouseClickX >= 516 && mouseClickY >= 160 && mouseClickX <= 765 && mouseClickY <= 205) {
				var1 = 0;
			}

			if (isMenuOpen) {
				if (var1 != 1) {
					int var2 = mouseX;
					int var3 = mouseY;
					if (menuArea == 0) {
						var2 -= 4;
						var3 -= 4;
					}

					if (menuArea == 1) {
						var2 -= 553;
						var3 -= 205;
					}

					if (menuArea == 2) {
						var2 -= 17;
						var3 -= 357;
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
						var7 -= 4;
						var8 -= 4;
					}

					if (menuArea == 1) {
						var7 -= 553;
						var8 -= 205;
					}

					if (menuArea == 2) {
						var7 -= 17;
						var8 -= 357;
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
					if (var12 == 582 || var12 == 113 || var12 == 555 || var12 == 331 || var12 == 354 || var12 == 694 || var12 == 962 || var12 == 795 || var12 == 681 || var12 == 100 || var12 == 102 || var12 == 1328) {
						int var13 = menuParamB[menuNumEntries - 1];
						int var14 = menuParamC[menuNumEntries - 1];
						IfType var15 = IfType.list[var14];
						if (var15.objSwap || var15.objReplace) {
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

	@ObfuscatedName("client.b(I)V")
	public final void mainloop() {
		if (!errorStarted && !errorLoading && !errorHost) {
			loopCycle++;

			if (ingame) {
				gameLoop();
			} else {
				titleScreenLoop();
			}

			onDemandLoop();
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void onDemandLoop() {
		while (true) {
			OnDemandRequest var1 = onDemand.loop();
			if (var1 == null) {
				return;
			}

			if (var1.archive == 0) {
				Model.unpack(var1.file, var1.data);

				if ((onDemand.getModelUse(var1.file) & 0x62) != 0) {
					redrawSidebar = true;

					if (chatComId != -1) {
						redrawChatback = true;
					}
				}
			}

			if (var1.archive == 1 && var1.data != null) {
				AnimFrame.unpack(var1.data);
			}

			if (var1.archive == 2 && midiSong == var1.file && var1.data != null) {
				saveMidi(midiFading, var1.data);
			}

			if (var1.archive == 3 && sceneState == 1) {
				for (int var2 = 0; var2 < mapBuildGroundData.length; var2++) {
					if (mapBuildGroundFile[var2] == var1.file) {
						mapBuildGroundData[var2] = var1.data;

						if (var1.data == null) {
							mapBuildGroundFile[var2] = -1;
						}

						break;
					}

					if (mapBuildLocationFile[var2] == var1.file) {
						mapBuildLocationData[var2] = var1.data;

						if (var1.data == null) {
							mapBuildLocationFile[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.archive == 93 && onDemand.hasMapLocFile(var1.file)) {
				ClientBuild.prefetchLocations(new Packet(var1.data), onDemand);
			}
		}
	}

	@ObfuscatedName("client.a(Ld;B)Z")
	public final boolean addSocialOptions(IfType arg0) {
		int var2 = arg0.clientCode;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				menuOption[menuNumEntries] = "Remove @whi@" + arg0.text;
				menuAction[menuNumEntries] = 884;
				menuNumEntries++;
				return true;
			}

			return false;
		}

		if (var2 >= 801) {
			var2 -= 701;
		} else if (var2 >= 701) {
			var2 -= 601;
		} else if (var2 >= 101) {
			var2 -= 101;
		} else {
			var2--;
		}

		menuOption[menuNumEntries] = "Remove @whi@" + friendUsername[var2];
		menuAction[menuNumEntries] = 513;
		menuNumEntries++;
		menuOption[menuNumEntries] = "Message @whi@" + friendUsername[var2];
		menuAction[menuNumEntries] = 902;
		menuNumEntries++;
		return true;
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 274);

			if (arg0.length == 5) {
				nodeId = Integer.parseInt(arg0[0]);
				portOffset = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					setLowMem();
				} else if (arg0[2].equals("highmem")) {
					setHighMem();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (arg0[3].equals("free")) {
					memServer = false;
				} else if (arg0[3].equals("members")) {
					memServer = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				Client var1 = new Client();
				var1.initApplication(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(ILlb;I)V")
	public final void getNpcPosNewVis(Packet arg0, int arg1) {
		while (arg0.bitpos + 21 < arg1 * 8) {
			int var3 = arg0.gbit(14);
			if (var3 == 16383) {
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
			var4.turnspeed = var4.type.turnspeed;
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

			int var7 = arg0.gbit(1);
			var4.teleport(localPlayer.routeX[0] + var5, var7 == 1, localPlayer.routeZ[0] + var6);
			int var8 = arg0.gbit(1);
			if (var8 == 1) {
				entityUpdateIds[entityUpdateCount++] = var3;
			}
		}

		arg0.gbitend();
	}

	@ObfuscatedName("client.a(BI)Ljava/lang/String;")
	public final String inf(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
	}

	@ObfuscatedName("client.i(I)V")
	public final void soundsDoQueue() {
		for (int var1 = 0; var1 < waveCount; var1++) {
			if (waveDelay[var1] <= 0) {
				boolean var2 = false;
				try {
					if (waveIds[var1] != lastWaveId || waveLoops[var1] != lastWaveLoops) {
						Packet var3 = JagFX.generate(waveIds[var1], waveLoops[var1]);
						if (System.currentTimeMillis() + var3.pos / 22 > lastWaveLength / 22 + lastWaveStartTime) {
							lastWaveLength = var3.pos;
							lastWaveStartTime = System.currentTimeMillis();

							if (saveWave(var3.data, var3.pos)) {
								lastWaveId = waveIds[var1];
								lastWaveLoops = waveLoops[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!replayWave()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}

				if (var2 && waveDelay[var1] != -5) {
					waveDelay[var1] = -5;
				} else {
					waveCount--;
					for (int var5 = var1; var5 < waveCount; var5++) {
						waveIds[var5] = waveIds[var5 + 1];
						waveLoops[var5] = waveLoops[var5 + 1];
						waveDelay[var5] = waveDelay[var5 + 1];
					}

					var1--;
				}
			} else {
				waveDelay[var1]--;
			}
		}

		if (nextMidiDelay > 0) {
			nextMidiDelay -= 20;
			if (nextMidiDelay < 0) {
				nextMidiDelay = 0;
			}

			if (nextMidiDelay == 0 && midiActive && !lowMem) {
				midiSong = nextMidiSong;
				midiFading = true;
				onDemand.request(2, midiSong);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
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

	@ObfuscatedName("client.a(Ly;II)V")
	public final void getOverlayPos(ClientEntity arg0, int arg1) {
		getOverlayPos(arg0.x, arg0.z, arg1);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void getOverlayPos(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg1 >= 128 && arg0 <= 13056 && arg1 <= 13056) {
			int var4 = getAvH(arg0, arg1, minusedlevel) - arg2;
			arg0 -= camX;
			var4 -= camY;
			arg1 -= camZ;
			int var5 = Model.sinTable[camPitch];
			int var6 = Model.cosTable[camPitch];
			int var7 = Model.sinTable[camYaw];
			int var8 = Model.cosTable[camYaw];
			int var9 = arg0 * var8 + arg1 * var7 >> 16;
			arg1 = arg1 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg1 * var5 >> 16;
			arg1 = arg1 * var6 + var4 * var5 >> 16;
			if (arg1 >= 50) {
				projectX = (var9 << 9) / arg1 + Pix3D.originX;
				projectY = (var11 << 9) / arg1 + Pix3D.originY;
			} else {
				projectX = -1;
				projectY = -1;
			}
		} else {
			projectX = -1;
			projectY = -1;
		}
	}

	@ObfuscatedName("client.j(I)V")
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

			b12.drawStringAntiMacro(4, var1, 15, 0xFFFFFF, loopCycle / 1000, true);
		}
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void addNpcs(boolean arg0) {
		for (int var2 = 0; var2 < npcCount; var2++) {
			ClientNpc var3 = npc[npcIds[var2]];
			int var4 = (npcIds[var2] << 14) + 0x20000000;
			if (var3 != null && var3.isReady() && var3.type.alwaysontop == arg0) {
				int var5 = var3.x >> 7;
				int var6 = var3.z >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.size == 1 && (var3.x & 0x7F) == 0x40 && (var3.z & 0x7F) == 0x40) {
						if (tileLastOccupiedCycle[var5][var6] == sceneCycle) {
							continue;
						}

						tileLastOccupiedCycle[var5][var6] = sceneCycle;
					}

					world.addDynamic(getAvH(var3.x, var3.z, minusedlevel), var3, var3.x, var4, var3.z, (var3.size - 1) * 64 + 60, var3.yaw, minusedlevel, var3.needsForwardDrawPadding);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIBLib;)V")
	public final void minimapDrawDot(int arg0, int arg1, Pix32 arg2) {
		int var4 = macroMinimapAngle + orbitCameraYaw & 0x7FF;
		int var5 = arg0 * arg0 + arg1 * arg1;
		if (var5 <= 6400) {
			int var6 = Model.sinTable[var4];
			int var7 = Model.cosTable[var4];
			var6 = var6 * 256 / (macroMinimapZoom + 256);
			var7 = var7 * 256 / (macroMinimapZoom + 256);
			int var8 = arg0 * var6 + arg1 * var7 >> 16;
			int var9 = arg0 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg2.scanlinePlotSprite(var8 + 94 + 4 - arg2.owi / 2, mapback, 83 - var9 - arg2.ohi / 2 - 4);
			} else {
				arg2.plotSprite(var8 + 94 + 4 - arg2.owi / 2, 83 - var9 - arg2.ohi / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
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

		if (mouseTracking != null) {
			mouseTracking.active = false;
		}

		mouseTracking = null;
		onDemand.stop();
		onDemand = null;
		out = null;
		loginout = null;
		in = null;
		mapBuildIndex = null;
		mapBuildGroundData = null;
		mapBuildLocationData = null;
		mapBuildGroundFile = null;
		mapBuildLocationFile = null;
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
		projectiles = null;
		spotanims = null;
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
		AnimFrame.unload();
		System.gc();
	}

	@ObfuscatedName("client.a(ZLd;I)I")
	public final int getIfVar(IfType arg0, int arg1) {
		if (arg0.scripts == null || arg1 >= arg0.scripts.length) {
			return -2;
		}

		try {
			int[] var3 = arg0.scripts[arg1];
			int var4 = 0;
			int var5 = 0;
			byte var6 = 0;
			while (true) {
				int var7 = var3[var5++];
				int var8 = 0;
				byte var9 = 0;

				if (var7 == 0) {
					return var4;
				}

				if (var7 == 1) {
					var8 = statEffectiveLevel[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = statBaseLevel[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = statXP[var3[var5++]];
				}

				if (var7 == 4) {
					IfType var10 = IfType.list[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < ObjType.numDefinitions && (!ObjType.list(var11).members || memServer)) {
						for (int var12 = 0; var12 < var10.linkObjType.length; var12++) {
							if (var11 + 1 == var10.linkObjType[var12]) {
								var8 += var10.linkObjNumber[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = var[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = skillxp[statBaseLevel[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = var[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = localPlayer.combatLevel;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < Skills.count; var13++) {
						if (Skills.used[var13]) {
							var8 += statBaseLevel[var13];
						}
					}
				}

				if (var7 == 10) {
					IfType var14 = IfType.list[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < ObjType.numDefinitions && (!ObjType.list(var15).members || memServer)) {
						for (int var16 = 0; var16 < var14.linkObjType.length; var16++) {
							if (var14.linkObjType[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = runenergy;
				}

				if (var7 == 12) {
					var8 = runweight;
				}

				if (var7 == 13) {
					int var17 = var[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					VarbitType var20 = VarbitType.list[var19];
					int var21 = var20.basevar;
					int var22 = var20.startbit;
					int var23 = var20.endbit;
					int var24 = readbit[var23 - var22];
					var8 = var[var21] >> var22 & var24;
				}

				if (var7 == 15) {
					var9 = 1;
				}

				if (var7 == 16) {
					var9 = 2;
				}

				if (var7 == 17) {
					var9 = 3;
				}

				if (var7 == 18) {
					var8 = (localPlayer.x >> 7) + mapBuildBaseX;
				}

				if (var7 == 19) {
					var8 = (localPlayer.z >> 7) + mapBuildBaseZ;
				}

				if (var7 == 20) {
					var8 = var3[var5++];
				}

				if (var9 == 0) {
					if (var6 == 0) {
						var4 += var8;
					}

					if (var6 == 1) {
						var4 -= var8;
					}

					if (var6 == 2 && var8 != 0) {
						var4 /= var8;
					}

					if (var6 == 3) {
						var4 *= var8;
					}

					var6 = 0;
				} else {
					var6 = var9;
				}
			}
		} catch (Exception var25) {
			return -1;
		}
	}

	@ObfuscatedName("client.a(BLd;)V")
	public final void clientComponent(IfType arg0) {
		int var2 = arg0.clientCode;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && friendServerStatus == 0) {
				arg0.text = "Loading friend list";
				arg0.buttonType = 0;
			} else if (var2 == 1 && friendServerStatus == 1) {
				arg0.text = "Connecting to friendserver";
				arg0.buttonType = 0;
			} else if (var2 == 2 && friendServerStatus != 2) {
				arg0.text = "Please wait...";
				arg0.buttonType = 0;
			} else {
				int var3 = friendCount;
				if (friendServerStatus != 2) {
					var3 = 0;
				}

				if (var2 > 700) {
					var2 -= 601;
				} else {
					var2--;
				}

				if (var2 >= var3) {
					arg0.text = "";
					arg0.buttonType = 0;
				} else {
					arg0.text = friendUsername[var2];
					arg0.buttonType = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = friendCount;
			if (friendServerStatus != 2) {
				var4 = 0;
			}

			if (var2 > 800) {
				var2 -= 701;
			} else {
				var2 -= 101;
			}

			if (var2 >= var4) {
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
			int var5 = friendCount;
			if (friendServerStatus != 2) {
				var5 = 0;
			}

			arg0.scrollHeight = var5 * 15 + 20;
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
				for (int var6 = 0; var6 < 7; var6++) {
					int var7 = idkDesignPart[var6];
					if (var7 >= 0 && !IdkType.list[var7].checkModel()) {
						return;
					}
				}

				idkDesignRedraw = false;
				Model[] var8 = new Model[7];
				int var9 = 0;
				for (int var10 = 0; var10 < 7; var10++) {
					int var11 = idkDesignPart[var10];
					if (var11 >= 0) {
						var8[var9++] = IdkType.list[var11].getModelNoCheck();
					}
				}

				Model var12 = new Model(var9, var8);
				for (int var13 = 0; var13 < 5; var13++) {
					if (idkDesignColour[var13] != 0) {
						var12.recolour(recol1d[var13][0], recol1d[var13][idkDesignColour[var13]]);

						if (var13 == 1) {
							var12.recolour(recol2d[0], recol2d[idkDesignColour[var13]]);
						}
					}
				}

				var12.prepareAnim();
				var12.animate(SeqType.list[localPlayer.readyanim].frames[0]);
				var12.calculateNormals(64, 850, -30, -50, -30, true);
				arg0.model1Type = 5;
				arg0.model1Id = 0;
				IfType.cacheModel(0, var12, 5);
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
			if (staffmodlevel < 1) {
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
				String var14;
				if (daysSinceLastLogin == 0) {
					var14 = "earlier today";
				} else if (daysSinceLastLogin == 1) {
					var14 = "yesterday";
				} else {
					var14 = daysSinceLastLogin + " days ago";
				}

				arg0.text = "You last logged in " + var14 + " from: " + signlink.dns;
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
				if (warnMembersInNonMembers == 1) {
					arg0.text = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					arg0.text = "";
				}
			} else if (daysSinceRecoveriesChanged == 200) {
				arg0.text = "You have not yet set any password recovery questions.";
			} else {
				String var15;
				if (daysSinceRecoveriesChanged == 0) {
					var15 = "Earlier today";
				} else if (daysSinceRecoveriesChanged == 1) {
					var15 = "Yesterday";
				} else {
					var15 = daysSinceRecoveriesChanged + " days ago";
				}

				arg0.text = var15 + " you changed your recovery questions";
			}
		} else if (var2 == 653) {
			if (daysSinceRecoveriesChanged == 201) {
				if (warnMembersInNonMembers == 1) {
					arg0.text = "@whi@recommend you use a members world instead. You may use";
				} else {
					arg0.text = "";
				}
			} else if (daysSinceRecoveriesChanged == 200) {
				arg0.text = "We strongly recommend you do so now to secure your account.";
			} else {
				arg0.text = "If you do not remember making this change then cancel it immediately";
			}
		} else if (var2 == 654) {
			if (daysSinceRecoveriesChanged == 201) {
				if (warnMembersInNonMembers == 1) {
					arg0.text = "@whi@this world but member benefits are unavailable whilst here.";
				} else {
					arg0.text = "";
				}
			} else if (daysSinceRecoveriesChanged == 200) {
				arg0.text = "Do this from the 'account management' area on our front webpage";
			} else {
				arg0.text = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	@ObfuscatedName("client.a(IIILab;Z)V")
	public final void addPlayerOptions(int arg0, int arg1, int arg2, ClientPlayer arg3) {
		if (localPlayer != arg3 && menuNumEntries < 400) {
			String var5;
			if (arg3.skillLevel == 0) {
				var5 = arg3.name + combatColourCode(arg3.combatLevel, localPlayer.combatLevel) + " (level-" + arg3.combatLevel + ")";
			} else {
				var5 = arg3.name + " (skill-" + arg3.skillLevel + ")";
			}

			if (useMode == 1) {
				menuOption[menuNumEntries] = "Use " + objSelectedName + " with @whi@" + var5;
				menuAction[menuNumEntries] = 275;
				menuParamA[menuNumEntries] = arg1;
				menuParamB[menuNumEntries] = arg0;
				menuParamC[menuNumEntries] = arg2;
				menuNumEntries++;
			} else if (targetMode != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (playerOp[var6] != null) {
						menuOption[menuNumEntries] = playerOp[var6] + " @whi@" + var5;
						short var7 = 0;
						if (playerOp[var6].equalsIgnoreCase("attack")) {
							if (arg3.combatLevel > localPlayer.combatLevel) {
								var7 = 2000;
							}
						} else if (playerOpPriority[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							menuAction[menuNumEntries] = var7 + 639;
						}

						if (var6 == 1) {
							menuAction[menuNumEntries] = var7 + 499;
						}

						if (var6 == 2) {
							menuAction[menuNumEntries] = var7 + 27;
						}

						if (var6 == 3) {
							menuAction[menuNumEntries] = var7 + 387;
						}

						if (var6 == 4) {
							menuAction[menuNumEntries] = var7 + 185;
						}

						menuParamA[menuNumEntries] = arg1;
						menuParamB[menuNumEntries] = arg0;
						menuParamC[menuNumEntries] = arg2;
						menuNumEntries++;
					}
				}
			} else if ((targetMask & 0x8) == 8) {
				menuOption[menuNumEntries] = targetOp + " @whi@" + var5;
				menuAction[menuNumEntries] = 131;
				menuParamA[menuNumEntries] = arg1;
				menuParamB[menuNumEntries] = arg0;
				menuParamC[menuNumEntries] = arg2;
				menuNumEntries++;
			}

			for (int var8 = 0; var8 < menuNumEntries; var8++) {
				if (menuAction[var8] == 718) {
					menuOption[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void gameDrawMain() {
		sceneCycle++;
		addPlayers(true);
		addNpcs(true);
		addPlayers(false);
		addNpcs(false);
		addProjectiles();
		addMapAnim();

		if (!cinemaCam) {
			int var1 = orbitCameraPitch;
			if (cameraPitchClamp / 256 > var1) {
				var1 = cameraPitchClamp / 256;
			}

			if (camShake[4] && camShakeRan[4] + 128 > var1) {
				var1 = camShakeRan[4] + 128;
			}

			int var2 = orbitCameraYaw + macroCameraAngle & 0x7FF;
			camFollow(orbitCameraZ, var1, getAvH(localPlayer.x, localPlayer.z, minusedlevel) - 50, orbitCameraX, var2, var1 * 3 + 600);
		}

		int var3;
		if (cinemaCam) {
			var3 = roofCheck2();
		} else {
			var3 = roofCheck();
		}

		int var4 = camX;
		int var5 = camY;
		int var6 = camZ;
		int var7 = camPitch;
		int var8 = camYaw;

		for (int var9 = 0; var9 < 5; var9++) {
			if (camShake[var9]) {
				int var10 = (int) (Math.random() * (camShakeAxis[var9] * 2 + 1) + Math.sin(camShakeAmp[var9] / 100.0D * camShakeCycle[var9]) * camShakeRan[var9] - camShakeAxis[var9]);
				if (var9 == 0) {
					camX += var10;
				}

				if (var9 == 1) {
					camY += var10;
				}

				if (var9 == 2) {
					camZ += var10;
				}

				if (var9 == 3) {
					camYaw = camYaw + var10 & 0x7FF;
				}

				if (var9 == 4) {
					camPitch += var10;
					if (camPitch < 128) {
						camPitch = 128;
					}

					if (camPitch > 383) {
						camPitch = 383;
					}
				}
			}
		}

		int var11 = Pix3D.cycle;
		Model.mouseCheck = true;
		Model.pickedCount = 0;
		Model.mouseX = mouseX - 4;
		Model.mouseY = mouseY - 4;
		Pix2D.cls();
		world.renderAll(camX, camZ, camYaw, camY, var3, camPitch);
		world.removeSprites();
		entityOverlays();
		coordArrow();
		textureRunAnims(var11);
		otherOverlays();
		areaGame.draw(4, graphics, 4);
		camX = var4;
		camY = var5;
		camZ = var6;
		camPitch = var7;
		camYaw = var8;
	}

	@ObfuscatedName("client.b(Z)V")
	public final void chatModeLoop() {
		if (mouseClickButton == 1) {
			if (mouseClickX >= 6 && mouseClickX <= 106 && mouseClickY >= 467 && mouseClickY <= 499) {
				chatPublicMode = (chatPublicMode + 1) % 4;
				redrawChatMode = true;
				redrawChatback = true;
				out.p1enc(154);
				out.p1(chatPublicMode);
				out.p1(chatPrivateMode);
				out.p1(chatTradeMode);
			}

			if (mouseClickX >= 135 && mouseClickX <= 235 && mouseClickY >= 467 && mouseClickY <= 499) {
				chatPrivateMode = (chatPrivateMode + 1) % 3;
				redrawChatMode = true;
				redrawChatback = true;
				out.p1enc(154);
				out.p1(chatPublicMode);
				out.p1(chatPrivateMode);
				out.p1(chatTradeMode);
			}

			if (mouseClickX >= 273 && mouseClickX <= 373 && mouseClickY >= 467 && mouseClickY <= 499) {
				chatTradeMode = (chatTradeMode + 1) % 3;
				redrawChatMode = true;
				redrawChatback = true;
				out.p1enc(154);
				out.p1(chatPublicMode);
				out.p1(chatPrivateMode);
				out.p1(chatTradeMode);
			}

			if (mouseClickX >= 412 && mouseClickX <= 512 && mouseClickY >= 467 && mouseClickY <= 499) {
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

	@ObfuscatedName("client.a(IIIIIIIZIIBI)Z")
	public final boolean tryMove(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				dirMap[var14][var15] = 0;
				distMap[var14][var15] = 99999999;
			}
		}

		int var16 = arg5;
		int var17 = arg0;
		dirMap[arg5][arg0] = 99;
		distMap[arg5][arg0] = 0;
		byte var18 = 0;
		int var19 = 0;
		routeX[var18] = arg5;
		int var35 = var18 + 1;
		routeZ[var18] = arg0;
		boolean var20 = false;
		int var21 = routeX.length;
		int[][] var22 = collision[minusedlevel].flags;
		while (var35 != var19) {
			var16 = routeX[var19];
			var17 = routeZ[var19];
			var19 = (var19 + 1) % var21;

			if (arg1 == var16 && arg9 == var17) {
				var20 = true;
				break;
			}

			if (arg6 != 0) {
				if ((arg6 < 5 || arg6 == 10) && collision[minusedlevel].testWall(var16, arg8, arg1, arg9, arg6 - 1, var17)) {
					var20 = true;
					break;
				}

				if (arg6 < 10 && collision[minusedlevel].testWDecor(arg1, arg9, var16, arg6 - 1, arg8, var17)) {
					var20 = true;
					break;
				}
			}

			if (arg2 != 0 && arg3 != 0 && collision[minusedlevel].testLoc(arg1, arg2, arg4, arg9, var17, var16, arg3)) {
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
			if (arg7) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg1 - var25; var26 <= arg1 + var25; var26++) {
						for (int var27 = arg9 - var25; var27 <= arg9 + var25; var27++) {
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
		while (arg5 != var16 || arg0 != var17) {
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
			if (arg10 == 1) {
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

		if (arg10 == 0) {
			out.p1enc(207);
			out.p1(var31 + var31 + 3);
		}

		if (arg10 == 1) {
			out.p1enc(86);
			out.p1(var31 + var31 + 3 + 14);
		}

		if (arg10 == 2) {
			out.p1enc(138);
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

	@ObfuscatedName("client.a(ZI)V")
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
					setMidiVolume(midiActive, 0);
					midiActive = true;
				}

				if (var3 == 1) {
					setMidiVolume(midiActive, -400);
					midiActive = true;
				}

				if (var3 == 2) {
					setMidiVolume(midiActive, -800);
					midiActive = true;
				}

				if (var3 == 3) {
					setMidiVolume(midiActive, -1200);
					midiActive = true;
				}

				if (var3 == 4) {
					midiActive = false;
				}

				if (midiActive != var4 && !lowMem) {
					if (midiActive) {
						midiSong = nextMidiSong;
						midiFading = true;
						onDemand.request(2, midiSong);
					} else {
						stopMidi();
					}

					nextMidiDelay = 0;
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

			if (var2 == 9) {
				bankArrangeMode = var3;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void drawDetail(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = world.wallType(arg4, arg0, arg2);
		if (var6 != 0) {
			int var7 = world.typeCode2(arg4, arg0, arg2, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg1;
			if (var6 > 0) {
				var10 = arg3;
			}

			int[] var11 = minimap.data;
			int var12 = (103 - arg2) * 512 * 4 + arg0 * 4 + 24624;
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
					var15.plotSprite(arg0 * 4 + var16 + 48, (104 - arg2 - var14.length) * 4 + 48 + var17);
				}
			}
		}

		int var18 = world.sceneType(arg4, arg0, arg2);
		if (var18 != 0) {
			int var19 = world.typeCode2(arg4, arg0, arg2, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			LocType var23 = LocType.list(var22);
			if (var23.mapscene != -1) {
				Pix8 var24 = mapscene[var23.mapscene];
				if (var24 != null) {
					int var25 = (var23.width * 4 - var24.wi) / 2;
					int var26 = (var23.length * 4 - var24.hi) / 2;
					var24.plotSprite(arg0 * 4 + var25 + 48, (104 - arg2 - var23.length) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = minimap.data;
				int var29 = (103 - arg2) * 512 * 4 + arg0 * 4 + 24624;
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

		int var30 = world.gdType(arg4, arg0, arg2);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			LocType var32 = LocType.list(var31);
			if (var32.mapscene != -1) {
				Pix8 var33 = mapscene[var32.mapscene];
				if (var33 != null) {
					int var34 = (var32.width * 4 - var33.wi) / 2;
					int var35 = (var32.length * 4 - var33.hi) / 2;
					var33.plotSprite(arg0 * 4 + var34 + 48, (104 - arg2 - var32.length) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void checkMinimap() {
		if (lowMem && sceneState == 2 && ClientBuild.minusedlevel != minusedlevel) {
			areaGame.setPixels();
			p12.centreString(257, 151, 0, "Loading - please wait.");
			p12.centreString(256, 150, 0xFFFFFF, "Loading - please wait.");
			areaGame.draw(4, graphics, 4);
			sceneState = 1;
			sceneLoadStartTime = System.currentTimeMillis();
		}

		if (sceneState == 1) {
			int var1 = checkScene();
			if (var1 != 0 && System.currentTimeMillis() - sceneLoadStartTime > 360000L) {
				signlink.reporterror(loginUser + " glcfb " + loginSeed + "," + var1 + "," + lowMem + "," + fileStreams[0] + "," + onDemand.remaining() + "," + minusedlevel + "," + mapBuildCentreZoneX + "," + mapBuildCentreZoneZ);
				sceneLoadStartTime = System.currentTimeMillis();
			}
		}

		if (sceneState == 2 && minusedlevel != minimapLevel) {
			minimapLevel = minusedlevel;
			minimapBuildBuffer(minusedlevel);
		}
	}

	@ObfuscatedName("client.e(B)I")
	public final int checkScene() {
		for (int var1 = 0; var1 < mapBuildGroundData.length; var1++) {
			if (mapBuildGroundData[var1] == null && mapBuildGroundFile[var1] != -1) {
				return -1;
			}

			if (mapBuildLocationData[var1] == null && mapBuildLocationFile[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < mapBuildGroundData.length; var3++) {
			byte[] var4 = mapBuildLocationData[var3];
			if (var4 != null) {
				int var5 = (mapBuildIndex[var3] >> 8) * 64 - mapBuildBaseX;
				int var6 = (mapBuildIndex[var3] & 0xFF) * 64 - mapBuildBaseZ;
				var2 &= ClientBuild.checkLocations(var4, var6, var5);
			}
		}

		if (!var2) {
			return -3;
		} else if (awaitingPlayerInfo) {
			return -4;
		} else {
			sceneState = 2;
			ClientBuild.minusedlevel = minusedlevel;
			mapBuild();
			out.p1enc(214);
			return 0;
		}
	}

	@ObfuscatedName("client.a(IIIIZIII)V")
	public final void locChangeUnchecked(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2 >= 1 && arg6 >= 1 && arg2 <= 102 && arg6 <= 102) {
			if (lowMem && minusedlevel != arg5) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg1 == 0) {
				var8 = world.wallType(arg5, arg2, arg6);
			}

			if (arg1 == 1) {
				var8 = world.decorType(arg6, arg2, arg5);
			}

			if (arg1 == 2) {
				var8 = world.sceneType(arg5, arg2, arg6);
			}

			if (arg1 == 3) {
				var8 = world.gdType(arg5, arg2, arg6);
			}

			if (var8 != 0) {
				int var12 = world.typeCode2(arg5, arg2, arg6, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg1 == 0) {
					world.delWall(arg5, arg6, arg2);
					LocType var16 = LocType.list(var13);
					if (var16.blockwalk) {
						collision[arg5].delWall(var14, var16.blockrange, var15, arg6, arg2);
					}
				}

				if (arg1 == 1) {
					world.delDecor(arg6, arg5, arg2);
				}

				if (arg1 == 2) {
					world.delLoc(arg6, arg5, arg2);
					LocType var17 = LocType.list(var13);
					if (var17.width + arg2 > 103 || var17.width + arg6 > 103 || var17.length + arg2 > 103 || var17.length + arg6 > 103) {
						return;
					}

					if (var17.blockwalk) {
						collision[arg5].delLoc(var17.width, arg2, arg6, var15, var17.blockrange, var17.length);
					}
				}

				if (arg1 == 3) {
					world.delGroundDecor(arg2, arg5, arg6);
					LocType var18 = LocType.list(var13);
					if (var18.blockwalk && var18.active) {
						collision[arg5].unblockGround(arg2, arg6);
					}
				}
			}

			if (arg4 >= 0) {
				int var19 = arg5;
				if (arg5 < 3 && (mapl[1][arg2][arg6] & 0x2) == 2) {
					var19 = arg5 + 1;
				}

				ClientBuild.changeLocUnchecked(world, var19, arg5, arg4, arg3, arg0, collision[arg5], groundh, arg6, arg2);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void closeModal() {
		out.p1enc(51);

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

	@ObfuscatedName("client.m(I)Z")
	public final boolean replayWave() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.n(I)V")
	public final void addWorldOptions() {
		if (useMode == 0 && targetMode == 0) {
			menuOption[menuNumEntries] = "Walk here";
			menuAction[menuNumEntries] = 718;
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
						menuAction[menuNumEntries] = 810;
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
										menuAction[menuNumEntries] = 625;
									}

									if (var9 == 1) {
										menuAction[menuNumEntries] = 721;
									}

									if (var9 == 2) {
										menuAction[menuNumEntries] = 743;
									}

									if (var9 == 3) {
										menuAction[menuNumEntries] = 357;
									}

									if (var9 == 4) {
										menuAction[menuNumEntries] = 1071;
									}

									menuParamA[menuNumEntries] = var3;
									menuParamB[menuNumEntries] = var4;
									menuParamC[menuNumEntries] = var5;
									menuNumEntries++;
								}
							}
						}

						menuOption[menuNumEntries] = "Examine @cya@" + var8.name;
						menuAction[menuNumEntries] = 1381;
						menuParamA[menuNumEntries] = var3;
						menuParamB[menuNumEntries] = var4;
						menuParamC[menuNumEntries] = var5;
						menuNumEntries++;
					} else if ((targetMask & 0x4) == 4) {
						menuOption[menuNumEntries] = targetOp + " @cya@" + var8.name;
						menuAction[menuNumEntries] = 899;
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
								addNpcOptions(var4, var5, var12.type, npcIds[var11]);
							}
						}

						for (int var13 = 0; var13 < playerCount; var13++) {
							ClientPlayer var14 = players[playerIds[var13]];
							if (var14 != null && var10.x == var14.x && var10.z == var14.z) {
								addPlayerOptions(var4, playerIds[var13], var5, var14);
							}
						}
					}

					addNpcOptions(var4, var5, var10.type, var7);
				}

				if (var6 == 0) {
					ClientPlayer var15 = players[var7];
					if ((var15.x & 0x7F) == 0x40 && (var15.z & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < npcCount; var16++) {
							ClientNpc var17 = npc[npcIds[var16]];
							if (var17 != null && var17.type.size == 1 && var15.x == var17.x && var15.z == var17.z) {
								addNpcOptions(var4, var5, var17.type, npcIds[var16]);
							}
						}

						for (int var18 = 0; var18 < playerCount; var18++) {
							ClientPlayer var19 = players[playerIds[var18]];
							if (var19 != null && var15 != var19 && var15.x == var19.x && var15.z == var19.z) {
								addPlayerOptions(var4, playerIds[var18], var5, var19);
							}
						}
					}

					addPlayerOptions(var4, var7, var5, var15);
				}

				if (var6 == 3) {
					LinkList var20 = groundObj[minusedlevel][var4][var5];
					if (var20 != null) {
						for (ClientObj var21 = (ClientObj) var20.tail(); var21 != null; var21 = (ClientObj) var20.prev()) {
							ObjType var22 = ObjType.list(var21.id);
							if (useMode == 1) {
								menuOption[menuNumEntries] = "Use " + objSelectedName + " with @lre@" + var22.name;
								menuAction[menuNumEntries] = 111;
								menuParamA[menuNumEntries] = var21.id;
								menuParamB[menuNumEntries] = var4;
								menuParamC[menuNumEntries] = var5;
								menuNumEntries++;
							} else if (targetMode != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.op != null && var22.op[var23] != null) {
										menuOption[menuNumEntries] = var22.op[var23] + " @lre@" + var22.name;

										if (var23 == 0) {
											menuAction[menuNumEntries] = 139;
										}

										if (var23 == 1) {
											menuAction[menuNumEntries] = 778;
										}

										if (var23 == 2) {
											menuAction[menuNumEntries] = 617;
										}

										if (var23 == 3) {
											menuAction[menuNumEntries] = 224;
										}

										if (var23 == 4) {
											menuAction[menuNumEntries] = 662;
										}

										menuParamA[menuNumEntries] = var21.id;
										menuParamB[menuNumEntries] = var4;
										menuParamC[menuNumEntries] = var5;
										menuNumEntries++;
									} else if (var23 == 2) {
										menuOption[menuNumEntries] = "Take @lre@" + var22.name;
										menuAction[menuNumEntries] = 617;
										menuParamA[menuNumEntries] = var21.id;
										menuParamB[menuNumEntries] = var4;
										menuParamC[menuNumEntries] = var5;
										menuNumEntries++;
									}
								}

								menuOption[menuNumEntries] = "Examine @lre@" + var22.name;
								menuAction[menuNumEntries] = 1152;
								menuParamA[menuNumEntries] = var21.id;
								menuParamB[menuNumEntries] = var4;
								menuParamC[menuNumEntries] = var5;
								menuNumEntries++;
							} else if ((targetMask & 0x1) == 1) {
								menuOption[menuNumEntries] = targetOp + " @lre@" + var22.name;
								menuAction[menuNumEntries] = 370;
								menuParamA[menuNumEntries] = var21.id;
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

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void login(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				loginMes1 = "";
				loginMes2 = "Connecting to server...";
				titleScreenDraw(true);
			}

			stream = new ClientStream(openSocket(portOffset + 43594), this);
			long var4 = JString.toUserhash(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			out.pos = 0;
			out.p1(14);
			out.p1(var6);
			stream.write(2, out.data, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				stream.read();
			}

			int var8 = stream.read();
			if (var8 == 0) {
				stream.read(in.data, 0, 8);
				in.pos = 0;
				loginSeed = in.g8();
				int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (loginSeed >> 32), (int) loginSeed };
				out.pos = 0;
				out.p1(10);
				out.p4(var9[0]);
				out.p4(var9[1]);
				out.p4(var9[2]);
				out.p4(var9[3]);
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

				loginout.p1(out.pos + 36 + 1 + 1 + 2);
				loginout.p1(255);
				loginout.p2(274);
				loginout.p1(lowMem ? 1 : 0);

				for (int var10 = 0; var10 < 9; var10++) {
					loginout.p4(jagChecksum[var10]);
				}

				loginout.pdata(out.data, 0, out.pos);
				out.random = new Isaac(var9);

				for (int var11 = 0; var11 < 4; var11++) {
					var9[var11] += 50;
				}

				randomIn = new Isaac(var9);
				stream.write(loginout.pos, loginout.data, 0);
				var8 = stream.read();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var21) {
				}

				login(arg0, arg1, arg2);
			} else if (var8 == 2) {
				staffmodlevel = stream.read();
				mouseTracked = stream.read() == 1;
				prevMouseClickTime = 0L;
				mouseTrackedDelta = 0;
				mouseTracking.length = 0;
				focus = true;
				focusIn = true;
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

				for (int var12 = 0; var12 < 100; var12++) {
					chatText[var12] = null;
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
				minimapState = 0;
				minimapLevel = -1;
				minimapFlagX = 0;
				minimapFlagZ = 0;
				playerCount = 0;
				npcCount = 0;

				for (int var13 = 0; var13 < MAX_PLAYER_COUNT; var13++) {
					players[var13] = null;
					playerAppearanceBuffer[var13] = null;
				}

				for (int var14 = 0; var14 < 16384; var14++) {
					npc[var14] = null;
				}

				localPlayer = players[LOCAL_PLAYER_INDEX] = new ClientPlayer();
				projectiles.clear();
				spotanims.clear();

				for (int var15 = 0; var15 < 4; var15++) {
					for (int var16 = 0; var16 < 104; var16++) {
						for (int var17 = 0; var17 < 104; var17++) {
							groundObj[var15][var16][var17] = null;
						}
					}
				}

				locChanges = new LinkList();
				friendServerStatus = 0;
				friendCount = 0;
				tutComId = -1;
				chatComId = -1;
				mainModalId = -1;
				sideModalId = -1;
				mainOverlayId = -1;
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

				for (int var18 = 0; var18 < 5; var18++) {
					idkDesignColour[var18] = 0;
				}

				for (int var19 = 0; var19 < 5; var19++) {
					playerOp[var19] = null;
					playerOpPriority[var19] = false;
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
			} else if (var8 == 3) {
				loginMes1 = "";
				loginMes2 = "Invalid username or password.";
			} else if (var8 == 4) {
				loginMes1 = "Your account has been disabled.";
				loginMes2 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				loginMes1 = "Your account is already logged in.";
				loginMes2 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				loginMes1 = "RuneScape has been updated!";
				loginMes2 = "Please reload this page.";
			} else if (var8 == 7) {
				loginMes1 = "This world is full.";
				loginMes2 = "Please use a different world.";
			} else if (var8 == 8) {
				loginMes1 = "Unable to connect.";
				loginMes2 = "Login server offline.";
			} else if (var8 == 9) {
				loginMes1 = "Login limit exceeded.";
				loginMes2 = "Too many connections from your address.";
			} else if (var8 == 10) {
				loginMes1 = "Unable to connect.";
				loginMes2 = "Bad session id.";
			} else if (var8 == 11) {
				loginMes2 = "Login server rejected session.";
				loginMes2 = "Please try again.";
			} else if (var8 == 12) {
				loginMes1 = "You need a members account to login to this world.";
				loginMes2 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				loginMes1 = "Could not complete login.";
				loginMes2 = "Please try using a different world.";
			} else if (var8 == 14) {
				loginMes1 = "The server is being updated.";
				loginMes2 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
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
				sceneLoadStartTime = System.currentTimeMillis();
			} else if (var8 == 16) {
				loginMes1 = "Login attempts exceeded.";
				loginMes2 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				loginMes1 = "You are standing in a members-only area.";
				loginMes2 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				loginMes1 = "Invalid loginserver requested";
				loginMes2 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var20 = stream.read(); var20 >= 0; var20--) {
					loginMes1 = "You have only just left another world";
					loginMes2 = "Your profile will be transferred in: " + var20 + " seconds";
					titleScreenDraw(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var22) {
					}
				}

				login(arg0, arg1, arg2);
			} else if (var8 == -1) {
				loginMes1 = "No response from server";
				loginMes2 = "Please try using a different world.";
			} else {
				System.out.println("response:" + var8);
				loginMes1 = "Unexpected server response";
				loginMes2 = "Please try using a different world.";
			}
		} catch (IOException var23) {
			loginMes1 = "";
			loginMes2 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(IILjava/lang/String;Ljava/lang/String;)V")
	public final void addChat(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && tutComId != -1) {
			tutComMessage = arg2;
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
		chatUsername[0] = arg1;
		chatText[0] = arg2;
	}

	@ObfuscatedName("client.b(IIII)I")
	public final int getAvH(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 7;
		int var5 = arg1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg2;
			if (arg2 < 3 && (mapl[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}

			int var7 = arg0 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = (128 - var7) * groundh[var6][var4][var5] + groundh[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * groundh[var6][var4][var5 + 1] + groundh[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean interactWithLoc(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg3 >> 14 & 0x7FFF;
		int var6 = world.typeCode2(minusedlevel, arg1, arg0, arg3);
		if (var6 == -1) {
			return false;
		}

		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		cyclelogic2++;
		if (cyclelogic2 > 1086) {
			cyclelogic2 = 0;
			out.p1enc(149);
			out.p1(0);
			int var9 = out.pos;

			if ((int) (Math.random() * 2.0D) == 0) {
				out.p2(16791);
			}

			out.p1(254);
			out.p2((int) (Math.random() * 65536.0D));
			out.p2(16128);
			out.p2(52610);
			out.p2((int) (Math.random() * 65536.0D));
			out.p2(55420);

			if ((int) (Math.random() * 2.0D) == 0) {
				out.p2(35025);
			}

			out.p2(46628);
			out.p1((int) (Math.random() * 256.0D));
			out.psize1(out.pos - var9);
		}

		if (var7 == 10 || var7 == 11 || var7 == 22) {
			LocType var10 = LocType.list(var5);
			int var11;
			int var12;
			if (var8 == 0 || var8 == 2) {
				var11 = var10.width;
				var12 = var10.length;
			} else {
				var11 = var10.length;
				var12 = var10.width;
			}

			int var13 = var10.forceapproach;
			if (var8 != 0) {
				var13 = (var13 >> 4 - var8) + (var13 << var8 & 0xF);
			}

			tryMove(localPlayer.routeZ[0], arg1, var11, var12, var13, localPlayer.routeX[0], 0, false, 0, arg0, 2);
		} else {
			tryMove(localPlayer.routeZ[0], arg1, 0, 0, 0, localPlayer.routeX[0], var7 + 1, false, var8, arg0, 2);
		}

		crossX = mouseClickX;
		crossY = mouseClickY;
		crossMode = 2;
		crossCycle = 0;
		out.p1enc(arg2);
		out.p2(mapBuildBaseX + arg1);
		out.p2(mapBuildBaseZ + arg0);
		out.p2(var5);
		return true;
	}

	@ObfuscatedName("client.d(II)V")
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
			ClientObj var9 = null;
			ClientObj var10 = null;
			for (ClientObj var11 = (ClientObj) var3.head(); var11 != null; var11 = (ClientObj) var3.next()) {
				if (var5.id != var11.id && var9 == null) {
					var9 = var11;
				}

				if (var5.id != var11.id && var9.id != var11.id && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			world.setObj(arg1, var12, minusedlevel, var9, var5, arg0, getAvH(arg0 * 128 + 64, arg1 * 128 + 64, minusedlevel), var10);
		}
	}

	@ObfuscatedName("client.b(ZZ)V")
	public final void titleScreenDraw(boolean arg0) {
		prepareTitle();
		imageTitle4.setPixels();
		titlebox.plotSprite(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (loginscreen == 0) {
			int var4 = var3 / 2 + 80;
			p11.centreStringTag(var2 / 2, var4, onDemand.message, 0x75A9A9, true);
			int var5 = var3 / 2 - 20;
			b12.centreStringTag(var2 / 2, var5, "Welcome to RuneScape", 0xFFFF00, true);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			titlebutton.plotSprite(var6 - 73, var7 - 20);
			b12.centreStringTag(var6, var7 + 5, "New User", 0xFFFFFF, true);
			int var8 = var2 / 2 + 80;
			titlebutton.plotSprite(var8 - 73, var7 - 20);
			b12.centreStringTag(var8, var7 + 5, "Existing User", 0xFFFFFF, true);
		}

		if (loginscreen == 2) {
			int var9 = var3 / 2 - 40;
			if (loginMes1.length() > 0) {
				b12.centreStringTag(var2 / 2, var9 - 15, loginMes1, 0xFFFF00, true);
				b12.centreStringTag(var2 / 2, var9, loginMes2, 0xFFFF00, true);
				var9 += 30;
			} else {
				b12.centreStringTag(var2 / 2, var9 - 7, loginMes2, 0xFFFF00, true);
				var9 += 30;
			}

			b12.drawStringTag("Username: " + loginUser + (loginSelect == 0 & loopCycle % 40 < 20 ? "@yel@|" : ""), true, var9, var2 / 2 - 90, 0xFFFFFF);
			var9 += 15;
			b12.drawStringTag("Password: " + JString.getRepeatedCharacter(loginPass) + (loginSelect == 1 & loopCycle % 40 < 20 ? "@yel@|" : ""), true, var9, var2 / 2 - 88, 0xFFFFFF);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				titlebutton.plotSprite(var10 - 73, var11 - 20);
				b12.centreStringTag(var10, var11 + 5, "Login", 0xFFFFFF, true);
				int var12 = var2 / 2 + 80;
				titlebutton.plotSprite(var12 - 73, var11 - 20);
				b12.centreStringTag(var12, var11 + 5, "Cancel", 0xFFFFFF, true);
			}
		}

		if (loginscreen == 3) {
			b12.centreStringTag(var2 / 2, var3 / 2 - 60, "Create a free account", 0xFFFF00, true);
			int var13 = var3 / 2 - 35;
			b12.centreStringTag(var2 / 2, var13, "To create a new account you need to", 0xFFFFFF, true);
			var13 += 15;
			b12.centreStringTag(var2 / 2, var13, "go back to the main RuneScape webpage", 0xFFFFFF, true);
			var13 += 15;
			b12.centreStringTag(var2 / 2, var13, "and choose the red 'create account'", 0xFFFFFF, true);
			var13 += 15;
			b12.centreStringTag(var2 / 2, var13, "button at the top right of that page.", 0xFFFFFF, true);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			titlebutton.plotSprite(var14 - 73, var15 - 20);
			b12.centreStringTag(var14, var15 + 5, "Cancel", 0xFFFFFF, true);
		}

		imageTitle4.draw(202, graphics, 171);

		if (redrawFrame) {
			redrawFrame = false;
			imageTitle2.draw(128, graphics, 0);
			imageTitle3.draw(202, graphics, 371);
			imageTitle5.draw(0, graphics, 265);
			imageTitle6.draw(562, graphics, 265);
			imageTitle7.draw(128, graphics, 171);
			imageTitle8.draw(562, graphics, 171);
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
	public final void addProjectiles() {
		for (ClientProj var1 = (ClientProj) projectiles.head(); var1 != null; var1 = (ClientProj) projectiles.next()) {
			if (minusedlevel != var1.level || loopCycle > var1.t2) {
				var1.unlink();
			} else if (loopCycle >= var1.t1) {
				if (var1.target > 0) {
					ClientNpc var2 = npc[var1.target - 1];
					if (var2 != null && var2.x >= 0 && var2.x < 13312 && var2.z >= 0 && var2.z < 13312) {
						var1.setTarget(loopCycle, getAvH(var2.x, var2.z, var1.level) - var1.h2, var2.x, var2.z);
					}
				}

				if (var1.target < 0) {
					int var3 = -var1.target - 1;
					ClientPlayer var4;
					if (selfSlot == var3) {
						var4 = localPlayer;
					} else {
						var4 = players[var3];
					}

					if (var4 != null && var4.x >= 0 && var4.x < 13312 && var4.z >= 0 && var4.z < 13312) {
						var1.setTarget(loopCycle, getAvH(var4.x, var4.z, var1.level) - var1.h2, var4.x, var4.z);
					}
				}

				var1.move(worldUpdateNum);
				world.addDynamic((int) var1.y, var1, (int) var1.x, -1, (int) var1.z, 60, var1.yaw, minusedlevel, false);
			}
		}

		cyclelogic1++;
		if (cyclelogic1 > 1174) {
			cyclelogic1 = 0;
			out.p1enc(12);
			out.p1(0);
			int var5 = out.pos;

			if ((int) (Math.random() * 2.0D) == 0) {
				out.p2(11499);
			}

			out.p2(10548);

			if ((int) (Math.random() * 2.0D) == 0) {
				out.p1(139);
			}

			if ((int) (Math.random() * 2.0D) == 0) {
				out.p1(94);
			}

			out.p2(51693);
			out.p1(16);
			out.p2(15036);

			if ((int) (Math.random() * 2.0D) == 0) {
				out.p1(65);
			}

			out.p1((int) (Math.random() * 256.0D));
			out.p2(22990);
			out.psize1(out.pos - var5);
		}
	}

	@ObfuscatedName("client.a(IIIBII)V")
	public final void drawScrollbar(int arg0, int arg1, int arg2, int arg3, int arg4) {
		scrollbar1.plotSprite(arg3, arg1);
		scrollbar2.plotSprite(arg3, arg1 + arg4 - 16);
		Pix2D.fillRect(arg4 - 32, SCROLLBAR_TRACK, 16, arg3, arg1 + 16);
		int var6 = (arg4 - 32) * arg4 / arg2;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg4 - var6 - 32) * arg0 / (arg2 - arg4);
		Pix2D.fillRect(var6, SCROLLBAR_GRIP_FOREGROUND, 16, arg3, arg1 + var7 + 16);
		Pix2D.vline(SCROLLBAR_GRIP_HIGHLIGHT, var6, arg3, arg1 + var7 + 16);
		Pix2D.vline(SCROLLBAR_GRIP_HIGHLIGHT, var6, arg3 + 1, arg1 + 16 + var7);
		Pix2D.hline(16, SCROLLBAR_GRIP_HIGHLIGHT, arg3, arg1 + var7 + 16);
		Pix2D.hline(16, SCROLLBAR_GRIP_HIGHLIGHT, arg3, arg1 + var7 + 17);
		Pix2D.vline(SCROLLBAR_GRIP_LOWLIGHT, var6, arg3 + 15, arg1 + 16 + var7);
		Pix2D.vline(SCROLLBAR_GRIP_LOWLIGHT, var6 - 1, arg3 + 14, arg1 + var7 + 17);
		Pix2D.hline(16, SCROLLBAR_GRIP_LOWLIGHT, arg3, arg1 + var7 + var6 + 15);
		Pix2D.hline(15, SCROLLBAR_GRIP_LOWLIGHT, arg3 + 1, arg1 + 14 + var7 + var6);
	}

	@ObfuscatedName("client.e(II)V")
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

	@ObfuscatedName("client.o(I)V")
	public final void iconLoop() {
		if (mouseClickButton == 1) {
			if (mouseClickX >= 539 && mouseClickX <= 573 && mouseClickY >= 169 && mouseClickY < 205 && sideIcon[0] != -1) {
				redrawSidebar = true;
				activeIcon = 0;
				redrawIcons = true;
			}

			if (mouseClickX >= 569 && mouseClickX <= 599 && mouseClickY >= 168 && mouseClickY < 205 && sideIcon[1] != -1) {
				redrawSidebar = true;
				activeIcon = 1;
				redrawIcons = true;
			}

			if (mouseClickX >= 597 && mouseClickX <= 627 && mouseClickY >= 168 && mouseClickY < 205 && sideIcon[2] != -1) {
				redrawSidebar = true;
				activeIcon = 2;
				redrawIcons = true;
			}

			if (mouseClickX >= 625 && mouseClickX <= 669 && mouseClickY >= 168 && mouseClickY < 203 && sideIcon[3] != -1) {
				redrawSidebar = true;
				activeIcon = 3;
				redrawIcons = true;
			}

			if (mouseClickX >= 666 && mouseClickX <= 696 && mouseClickY >= 168 && mouseClickY < 205 && sideIcon[4] != -1) {
				redrawSidebar = true;
				activeIcon = 4;
				redrawIcons = true;
			}

			if (mouseClickX >= 694 && mouseClickX <= 724 && mouseClickY >= 168 && mouseClickY < 205 && sideIcon[5] != -1) {
				redrawSidebar = true;
				activeIcon = 5;
				redrawIcons = true;
			}

			if (mouseClickX >= 722 && mouseClickX <= 756 && mouseClickY >= 169 && mouseClickY < 205 && sideIcon[6] != -1) {
				redrawSidebar = true;
				activeIcon = 6;
				redrawIcons = true;
			}

			if (mouseClickX >= 540 && mouseClickX <= 574 && mouseClickY >= 466 && mouseClickY < 502 && sideIcon[7] != -1) {
				redrawSidebar = true;
				activeIcon = 7;
				redrawIcons = true;
			}

			if (mouseClickX >= 572 && mouseClickX <= 602 && mouseClickY >= 466 && mouseClickY < 503 && sideIcon[8] != -1) {
				redrawSidebar = true;
				activeIcon = 8;
				redrawIcons = true;
			}

			if (mouseClickX >= 599 && mouseClickX <= 629 && mouseClickY >= 466 && mouseClickY < 503 && sideIcon[9] != -1) {
				redrawSidebar = true;
				activeIcon = 9;
				redrawIcons = true;
			}

			if (mouseClickX >= 627 && mouseClickX <= 671 && mouseClickY >= 467 && mouseClickY < 502 && sideIcon[10] != -1) {
				redrawSidebar = true;
				activeIcon = 10;
				redrawIcons = true;
			}

			if (mouseClickX >= 669 && mouseClickX <= 699 && mouseClickY >= 466 && mouseClickY < 503 && sideIcon[11] != -1) {
				redrawSidebar = true;
				activeIcon = 11;
				redrawIcons = true;
			}

			if (mouseClickX >= 696 && mouseClickX <= 726 && mouseClickY >= 466 && mouseClickY < 503 && sideIcon[12] != -1) {
				redrawSidebar = true;
				activeIcon = 12;
				redrawIcons = true;
			}

			if (mouseClickX >= 724 && mouseClickX <= 758 && mouseClickY >= 466 && mouseClickY < 502 && sideIcon[13] != -1) {
				redrawSidebar = true;
				activeIcon = 13;
				redrawIcons = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void loadTitleBackground() {
		byte[] var1 = title.read("title.dat", null);
		Pix32 var2 = new Pix32(var1, this);
		imageTitle0.setPixels();
		var2.quickPlotSprite(0, 0);
		imageTitle1.setPixels();
		var2.quickPlotSprite(0, -637);
		imageTitle2.setPixels();
		var2.quickPlotSprite(0, -128);
		imageTitle3.setPixels();
		var2.quickPlotSprite(-371, -202);
		imageTitle4.setPixels();
		var2.quickPlotSprite(-171, -202);
		imageTitle5.setPixels();
		var2.quickPlotSprite(-265, 0);
		imageTitle6.setPixels();
		var2.quickPlotSprite(-265, -562);
		imageTitle7.setPixels();
		var2.quickPlotSprite(-171, -128);
		imageTitle8.setPixels();
		var2.quickPlotSprite(-171, -562);
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
		var2.quickPlotSprite(0, 382);
		imageTitle1.setPixels();
		var2.quickPlotSprite(0, -255);
		imageTitle2.setPixels();
		var2.quickPlotSprite(0, 254);
		imageTitle3.setPixels();
		var2.quickPlotSprite(-371, 180);
		imageTitle4.setPixels();
		var2.quickPlotSprite(-171, 180);
		imageTitle5.setPixels();
		var2.quickPlotSprite(-265, 382);
		imageTitle6.setPixels();
		var2.quickPlotSprite(-265, -180);
		imageTitle7.setPixels();
		var2.quickPlotSprite(-171, 254);
		imageTitle8.setPixels();
		var2.quickPlotSprite(-171, -180);
		Pix32 var7 = new Pix32(title, "logo", 0);
		imageTitle2.setPixels();
		var7.plotSprite(382 - var7.wi / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.b(BI)V")
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

			if (var4 == 829) {
				ClientNpc var6 = npc[var5];
				if (var6 != null) {
					tryMove(localPlayer.routeZ[0], var6.routeX[0], 1, 1, 0, localPlayer.routeX[0], 0, false, 0, var6.routeZ[0], 2);
					crossX = mouseClickX;
					crossY = mouseClickY;
					crossMode = 2;
					crossCycle = 0;
					out.p1enc(150);
					out.p2(var5);
					out.p2(objComId);
					out.p2(objSelectedSlot);
					out.p2(objSelectedComId);
				}
			}

			if (var4 == 524) {
				String var7 = menuOption[arg0];
				int var8 = var7.indexOf("@whi@");
				if (var8 != -1) {
					closeModal();
					reportAbuseInput = var7.substring(var8 + 5).trim();
					reportAbuseMuteOption = false;

					for (int var9 = 0; var9 < IfType.list.length; var9++) {
						if (IfType.list[var9] != null && IfType.list[var9].clientCode == 600) {
							reportAbuseComId = mainModalId = IfType.list[var9].layerId;
							break;
						}
					}
				}
			}

			if (var4 == 275) {
				ClientPlayer var10 = players[var5];
				if (var10 != null) {
					tryMove(localPlayer.routeZ[0], var10.routeX[0], 1, 1, 0, localPlayer.routeX[0], 0, false, 0, var10.routeZ[0], 2);
					crossX = mouseClickX;
					crossY = mouseClickY;
					crossMode = 2;
					crossCycle = 0;
					out.p1enc(36);
					out.p2(var5);
					out.p2(objComId);
					out.p2(objSelectedSlot);
					out.p2(objSelectedComId);
				}
			}

			if (var4 == 743) {
				oplogic2++;
				if (oplogic2 >= 124) {
					out.p1enc(201);
					out.p2(37954);
				}

				interactWithLoc(var3, var2, 187, var5);
			}

			if (var4 == 718) {
				if (isMenuOpen) {
					world.updateMousePicking(var2 - 4, var3 - 4);
				} else {
					world.updateMousePicking(mouseClickX - 4, mouseClickY - 4);
				}
			}

			if (var4 == 721) {
				oplogic1 += var3;
				if (oplogic1 >= 139) {
					out.p1enc(219);
					out.p4(0);
				}

				interactWithLoc(var3, var2, 103, var5);
			}

			if (var4 == 605 || var4 == 47 || var4 == 513 || var4 == 884) {
				String var11 = menuOption[arg0];
				int var12 = var11.indexOf("@whi@");
				if (var12 != -1) {
					long var13 = JString.toUserhash(var11.substring(var12 + 5).trim());
					if (var4 == 605) {
						addFriend(var13);
					}

					if (var4 == 47) {
						addIgnore(var13);
					}

					if (var4 == 513) {
						delFriend(var13);
					}

					if (var4 == 884) {
						delIgnore(var13);
					}
				}
			}

			if (var4 == 563) {
				out.p1enc(135);
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

			if (var4 == 435) {
				out.p1enc(9);
				out.p2(var3);
				IfType var15 = IfType.list[var3];
				if (var15.scripts != null && var15.scripts[0][0] == 5) {
					int var16 = var15.scripts[0][1];
					var[var16] = 1 - var[var16];
					clientVar(var16);
					redrawSidebar = true;
				}
			}

			if (var4 == 810 && interactWithLoc(var3, var2, 60, var5)) {
				out.p2(objComId);
				out.p2(objSelectedSlot);
				out.p2(objSelectedComId);
			}

			if (var4 == 102) {
				useMode = 1;
				objSelectedSlot = var2;
				objSelectedComId = var3;
				objComId = var5;
				objSelectedName = ObjType.list(var5).name;
				targetMode = 0;
				redrawSidebar = true;
			} else {
				if (var4 == 1328) {
					ObjType var17 = ObjType.list(var5);
					IfType var18 = IfType.list[var3];
					String var19;
					if (var18 != null && var18.linkObjNumber[var2] >= 100000) {
						var19 = var18.linkObjNumber[var2] + " x " + var17.name;
					} else if (var17.desc == null) {
						var19 = "It's a " + var17.name + ".";
					} else {
						var19 = new String(var17.desc);
					}

					addChat(0, "", var19);
				}

				if (var4 == 639 || var4 == 499 || var4 == 27 || var4 == 387 || var4 == 185) {
					ClientPlayer var20 = players[var5];
					if (var20 != null) {
						tryMove(localPlayer.routeZ[0], var20.routeX[0], 1, 1, 0, localPlayer.routeX[0], 0, false, 0, var20.routeZ[0], 2);
						crossX = mouseClickX;
						crossY = mouseClickY;
						crossMode = 2;
						crossCycle = 0;

						if (var4 == 387) {
							oplogic5 += var5;
							if (oplogic5 >= 66) {
								out.p1enc(235);
								out.p1(154);
							}

							out.p1enc(98);
						}

						if (var4 == 185) {
							out.p1enc(174);
						}

						if (var4 == 639) {
							oplogic4++;
							if (oplogic4 >= 52) {
								out.p1enc(80);
								out.p1(131);
							}

							out.p1enc(109);
						}

						if (var4 == 27) {
							out.p1enc(196);
						}

						if (var4 == 499) {
							out.p1enc(166);
						}

						out.p2(var5);
					}
				}

				if (var4 == 242 || var4 == 209 || var4 == 309 || var4 == 852 || var4 == 793) {
					ClientNpc var21 = npc[var5];
					if (var21 != null) {
						tryMove(localPlayer.routeZ[0], var21.routeX[0], 1, 1, 0, localPlayer.routeX[0], 0, false, 0, var21.routeZ[0], 2);
						crossX = mouseClickX;
						crossY = mouseClickY;
						crossMode = 2;
						crossCycle = 0;

						if (var4 == 309) {
							out.p1enc(223);
						}

						if (var4 == 242) {
							out.p1enc(236);
						}

						if (var4 == 852) {
							out.p1enc(147);
						}

						if (var4 == 793) {
							out.p1enc(189);
						}

						if (var4 == 209) {
							out.p1enc(233);
						}

						out.p2(var5);
					}
				}

				if (var4 == 582 || var4 == 113 || var4 == 555 || var4 == 331 || var4 == 354) {
					if (var4 == 331) {
						out.p1enc(179);
					}

					if (var4 == 113) {
						out.p1enc(82);
					}

					if (var4 == 555) {
						out.p1enc(239);
					}

					if (var4 == 354) {
						out.p1enc(46);
					}

					if (var4 == 582) {
						if ((var5 & 0x3) == 0) {
							oplogic6++;
						}

						if (oplogic6 >= 133) {
							out.p1enc(250);
							out.p2(6118);
						}

						out.p1enc(74);
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

				if (var4 == 997 && !resumedPauseButton) {
					out.p1enc(72);
					out.p2(var3);
					resumedPauseButton = true;
				}

				if (var4 == 1714) {
					ClientNpc var22 = npc[var5];
					if (var22 != null) {
						String var23;
						if (var22.type.desc == null) {
							var23 = "It's a " + var22.type.name + ".";
						} else {
							var23 = new String(var22.type.desc);
						}

						addChat(0, "", var23);
					}
				}

				if (var4 == 240) {
					ClientNpc var24 = npc[var5];
					if (var24 != null) {
						tryMove(localPlayer.routeZ[0], var24.routeX[0], 1, 1, 0, localPlayer.routeX[0], 0, false, 0, var24.routeZ[0], 2);
						crossX = mouseClickX;
						crossY = mouseClickY;
						crossMode = 2;
						crossCycle = 0;
						out.p1enc(181);
						out.p2(var5);
						out.p2(targetComId);
					}
				}

				if (var4 == 902) {
					String var25 = menuOption[arg0];
					int var26 = var25.indexOf("@whi@");
					if (var26 != -1) {
						long var27 = JString.toUserhash(var25.substring(var26 + 5).trim());
						int var29 = -1;
						for (int var30 = 0; var30 < friendCount; var30++) {
							if (friendUserhash[var30] == var27) {
								var29 = var30;
								break;
							}
						}

						if (var29 != -1 && friendNodeId[var29] > 0) {
							redrawChatback = true;
							dialogInputOpen = false;
							socialInputOpen = true;
							socialInput = "";
							socialInputType = 3;
							socialUserhash = friendUserhash[var29];
							socialInputHeader = "Enter message to send to " + friendUsername[var29];
						}
					}
				}

				if (var4 == 1381) {
					int var31 = var5 >> 14 & 0x7FFF;
					LocType var32 = LocType.list(var31);
					String var33;
					if (var32.desc == null) {
						var33 = "It's a " + var32.name + ".";
					} else {
						var33 = new String(var32.desc);
					}

					addChat(0, "", var33);
				}

				if (var4 == 231) {
					IfType var34 = IfType.list[var3];
					boolean var35 = true;
					if (var34.clientCode > 0) {
						var35 = clientButton(var34);
					}

					if (var35) {
						out.p1enc(9);
						out.p2(var3);
					}
				}

				if (var4 == 139 || var4 == 778 || var4 == 617 || var4 == 224 || var4 == 662) {
					boolean var36 = tryMove(localPlayer.routeZ[0], var2, 0, 0, 0, localPlayer.routeX[0], 0, false, 0, var3, 2);
					if (!var36) {
						tryMove(localPlayer.routeZ[0], var2, 1, 1, 0, localPlayer.routeX[0], 0, false, 0, var3, 2);
					}

					crossX = mouseClickX;
					crossY = mouseClickY;
					crossMode = 2;
					crossCycle = 0;

					if (var4 == 662) {
						oplogic3 += mapBuildBaseZ;
						if (oplogic3 >= 118) {
							out.p1enc(41);
							out.p4(0);
						}

						out.p1enc(117);
					}

					if (var4 == 139) {
						if ((var2 & 0x3) == 0) {
							oplogic7++;
						}

						if (oplogic7 >= 123) {
							out.p1enc(25);
							out.p4(0);
						}

						out.p1enc(247);
					}

					if (var4 == 224) {
						oplogic8 += var3;
						if (oplogic8 >= 75) {
							out.p1enc(0);
							out.p1(19);
						}

						out.p1enc(62);
					}

					if (var4 == 617) {
						out.p1enc(108);
					}

					if (var4 == 778) {
						out.p1enc(169);
					}

					out.p2(mapBuildBaseX + var2);
					out.p2(mapBuildBaseZ + var3);
					out.p2(var5);
				}

				if (var4 == 1071) {
					interactWithLoc(var3, var2, 127, var5);
				}

				if (var4 == 507 || var4 == 957) {
					String var38 = menuOption[arg0];
					int var39 = var38.indexOf("@whi@");
					if (var39 != -1) {
						var38 = var38.substring(var39 + 5).trim();
						String var40 = JString.toScreenName(JString.toRawUsername(JString.toUserhash(var38)));
						boolean var41 = false;
						for (int var42 = 0; var42 < playerCount; var42++) {
							ClientPlayer var43 = players[playerIds[var42]];
							if (var43 != null && var43.name != null && var43.name.equalsIgnoreCase(var40)) {
								tryMove(localPlayer.routeZ[0], var43.routeX[0], 1, 1, 0, localPlayer.routeX[0], 0, false, 0, var43.routeZ[0], 2);

								if (var4 == 507) {
									oplogic5 += var5;
									if (oplogic5 >= 66) {
										out.p1enc(235);
										out.p1(154);
									}

									out.p1enc(98);
								}

								if (var4 == 957) {
									oplogic4++;
									if (oplogic4 >= 52) {
										out.p1enc(80);
										out.p1(131);
									}

									out.p1enc(109);
								}

								out.p2(playerIds[var42]);
								var41 = true;
								break;
							}
						}

						if (!var41) {
							addChat(0, "", "Unable to find " + var40);
						}
					}
				}

				if (var4 == 131) {
					ClientPlayer var44 = players[var5];
					if (var44 != null) {
						tryMove(localPlayer.routeZ[0], var44.routeX[0], 1, 1, 0, localPlayer.routeX[0], 0, false, 0, var44.routeZ[0], 2);
						crossX = mouseClickX;
						crossY = mouseClickY;
						crossMode = 2;
						crossCycle = 0;
						out.p1enc(240);
						out.p2(var5);
						out.p2(targetComId);
					}
				}

				if (var4 == 398) {
					out.p1enc(136);
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

				if (var4 == 737) {
					closeModal();
				}

				if (var4 == 694 || var4 == 962 || var4 == 795 || var4 == 681 || var4 == 100) {
					if (var4 == 681) {
						oplogic9++;
						if (oplogic9 >= 116) {
							out.p1enc(24);
							out.p3(0xC6A439);
						}

						out.p1enc(216);
					}

					if (var4 == 100) {
						out.p1enc(42);
					}

					if (var4 == 694) {
						out.p1enc(185);
					}

					if (var4 == 962) {
						out.p1enc(2);
					}

					if (var4 == 795) {
						out.p1enc(123);
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

				if (var4 == 357) {
					interactWithLoc(var3, var2, 157, var5);
				}

				if (var4 == 1152) {
					ObjType var45 = ObjType.list(var5);
					String var46;
					if (var45.desc == null) {
						var46 = "It's a " + var45.name + ".";
					} else {
						var46 = new String(var45.desc);
					}

					addChat(0, "", var46);
				}

				if (var4 == 370) {
					boolean var47 = tryMove(localPlayer.routeZ[0], var2, 0, 0, 0, localPlayer.routeX[0], 0, false, 0, var3, 2);
					if (!var47) {
						tryMove(localPlayer.routeZ[0], var2, 1, 1, 0, localPlayer.routeX[0], 0, false, 0, var3, 2);
					}

					crossX = mouseClickX;
					crossY = mouseClickY;
					crossMode = 2;
					crossCycle = 0;
					out.p1enc(91);
					out.p2(mapBuildBaseX + var2);
					out.p2(mapBuildBaseZ + var3);
					out.p2(var5);
					out.p2(targetComId);
				}

				if (var4 == 899 && interactWithLoc(var3, var2, 213, var5)) {
					out.p2(targetComId);
				}

				if (var4 == 625) {
					interactWithLoc(var3, var2, 215, var5);
				}

				if (var4 == 111) {
					boolean var49 = tryMove(localPlayer.routeZ[0], var2, 0, 0, 0, localPlayer.routeX[0], 0, false, 0, var3, 2);
					if (!var49) {
						tryMove(localPlayer.routeZ[0], var2, 1, 1, 0, localPlayer.routeX[0], 0, false, 0, var3, 2);
					}

					crossX = mouseClickX;
					crossY = mouseClickY;
					crossMode = 2;
					crossCycle = 0;
					out.p1enc(39);
					out.p2(mapBuildBaseX + var2);
					out.p2(mapBuildBaseZ + var3);
					out.p2(var5);
					out.p2(objComId);
					out.p2(objSelectedSlot);
					out.p2(objSelectedComId);
				}

				if (var4 == 274) {
					IfType var51 = IfType.list[var3];
					targetMode = 1;
					targetComId = var3;
					targetMask = var51.targetMask;
					useMode = 0;
					redrawSidebar = true;
					String var52 = var51.targetVerb;
					if (var52.indexOf(" ") != -1) {
						var52 = var52.substring(0, var52.indexOf(" "));
					}

					String var53 = var51.targetVerb;
					if (var53.indexOf(" ") != -1) {
						var53 = var53.substring(var53.indexOf(" ") + 1);
					}

					targetOp = var52 + " " + var51.targetBase + " " + var53;

					if (targetMask == 16) {
						redrawSidebar = true;
						activeIcon = 3;
						redrawIcons = true;
					}
				} else {
					if (var4 == 225) {
						out.p1enc(9);
						out.p2(var3);
						IfType var54 = IfType.list[var3];
						if (var54.scripts != null && var54.scripts[0][0] == 5) {
							int var55 = var54.scripts[0][1];
							if (var[var55] != var54.scriptOperand[0]) {
								var[var55] = var54.scriptOperand[0];
								clientVar(var55);
								redrawSidebar = true;
							}
						}
					}

					useMode = 0;
					targetMode = 0;
					redrawSidebar = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;IBI)Lxb;")
	public final JagFile getJagFile(String arg0, int arg1, String arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (fileStreams[0] != null) {
				var6 = fileStreams[0].readFromFile(arg1);
			}
		} catch (Exception var29) {
		}

		if (var6 != null) {
			crc32.reset();
			crc32.update(var6);
			int var8 = (int) crc32.getValue();
			if (arg3 != var8) {
				var6 = null;
			}
		}

		if (var6 != null) {
			return new JagFile(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			drawProgress("Requesting " + arg0, arg4);
			Object var12 = null;

			try {
				int var13 = 0;
				DataInputStream var14 = openUrl(arg2 + arg3);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				Packet var16 = new Packet(var15);
				var16.pos = 3;
				int var17 = var16.g3() + 6;
				int var18 = 6;
				var6 = new byte[var17];
				for (int var19 = 0; var19 < 6; var19++) {
					var6[var19] = var15[var19];
				}

				while (var18 < var17) {
					int var20 = var17 - var18;
					if (var20 > 1000) {
						var20 = 1000;
					}

					int var21 = var14.read(var6, var18, var20);
					if (var21 < 0) {
						(new StringBuffer("Length error: ")).append(var18).append("/").append(var17).toString();
						throw new IOException("EOF");
					}

					var18 += var21;
					int var22 = var18 * 100 / var17;
					if (var13 != var22) {
						drawProgress("Loading " + arg0 + " - " + var22 + "%", arg4);
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (fileStreams[0] != null) {
						fileStreams[0].writeToFile(var6.length, arg1, var6);
					}
				} catch (Exception var28) {
					fileStreams[0] = null;
				}

				if (var6 != null) {
					crc32.reset();
					crc32.update(var6);
					int var23 = (int) crc32.getValue();
					if (arg3 != var23) {
						var6 = null;
						var10++;
						var11 = "Checksum error: " + var23;
					}
				}
			} catch (IOException var30) {
				if (var11.equals("Unknown error")) {
					var11 = "Connection error";
				}

				var6 = null;
			} catch (NullPointerException var31) {
				var11 = "Null error";
				var6 = null;

				if (!signlink.reporterror) {
					return null;
				}
			} catch (ArrayIndexOutOfBoundsException var32) {
				var11 = "Bounds error";
				var6 = null;

				if (!signlink.reporterror) {
					return null;
				}
			} catch (Exception var33) {
				var11 = "Unexpected error";
				var6 = null;

				if (!signlink.reporterror) {
					return null;
				}
			}

			if (var6 == null) {
				for (int var25 = var7; var25 > 0; var25--) {
					if (var10 >= 3) {
						drawProgress("Game updated - please reload page", arg4);
						var25 = 10;
					} else {
						drawProgress(var11 + " - Retrying in " + var25, arg4);
					}

					try {
						Thread.sleep(1000L);
					} catch (Exception var27) {
					}
				}

				var7 *= 2;
				if (var7 > 60) {
					var7 = 60;
				}

				jaggrabEnabled = !jaggrabEnabled;
			}
		}

		return new JagFile(var6);
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

					out.p1enc(106);
					out.p8(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void drawChat() {
		areaChat.setPixels();
		Pix3D.scanline = chatScanline;
		chatback.plotSprite(0, 0);

		if (socialInputOpen) {
			b12.centreString(239, 40, 0, socialInputHeader);
			b12.centreString(239, 60, 128, socialInput + "*");
		} else if (dialogInputOpen) {
			b12.centreString(239, 40, 0, "Enter amount:");
			b12.centreString(239, 60, 128, dialogInput + "*");
		} else if (tutComMessage != null) {
			b12.centreString(239, 40, 0, tutComMessage);
			b12.centreString(239, 60, 128, "Click to continue");
		} else if (chatComId != -1) {
			drawInterface(0, IfType.list[chatComId], 0, 0);
		} else if (tutComId == -1) {
			PixFont var1 = p12;
			int var2 = 0;
			Pix2D.setClipping(77, 463, 0, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (chatText[var3] != null) {
					int var4 = chatType[var3];
					int var5 = chatScrollPos + 70 - var2 * 14;
					String var6 = chatUsername[var3];
					byte var7 = 0;
					if (var6 != null && var6.startsWith("@cr1@")) {
						var6 = var6.substring(5);
						var7 = 1;
					}

					if (var6 != null && var6.startsWith("@cr2@")) {
						var6 = var6.substring(5);
						var7 = 2;
					}

					if (var4 == 0) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(4, chatText[var3], 0, var5);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || chatPublicMode == 0 || chatPublicMode == 1 && isFriend(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								modIcons[0].plotSprite(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								modIcons[1].plotSprite(var8, var5 - 12);
								var8 += 14;
							}

							var1.drawString(var8, var6 + ":", 0, var5);
							var8 += var1.stringWidTag(var6) + 8;
							var1.drawString(var8, chatText[var3], 255, var5);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && splitPrivateChat == 0 && (var4 == 7 || chatPrivateMode == 0 || chatPrivateMode == 1 && isFriend(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.drawString(var9, "From", 0, var5);
							int var11 = var9 + var1.stringWidTag("From ");
							if (var7 == 1) {
								modIcons[0].plotSprite(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								modIcons[1].plotSprite(var11, var5 - 12);
								var11 += 14;
							}

							var1.drawString(var11, var6 + ":", 0, var5);
							var11 += var1.stringWidTag(var6) + 8;
							var1.drawString(var11, chatText[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 4 && (chatTradeMode == 0 || chatTradeMode == 1 && isFriend(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(4, var6 + " " + chatText[var3], 0x800080, var5);
						}

						var2++;
					}

					if (var4 == 5 && splitPrivateChat == 0 && chatPrivateMode < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(4, chatText[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 6 && splitPrivateChat == 0 && chatPrivateMode < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(4, "To " + var6 + ":", 0, var5);
							var1.drawString(var1.stringWidTag("To " + var6) + 12, chatText[var3], 0x800000, var5);
						}

						var2++;
					}

					if (var4 == 8 && (chatTradeMode == 0 || chatTradeMode == 1 && isFriend(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(4, var6 + " " + chatText[var3], 0x7E3200, var5);
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

			drawScrollbar(scrollHeight - chatScrollPos - 77, 0, scrollHeight, 463, 77);
			String var10;
			if (localPlayer == null || localPlayer.name == null) {
				var10 = JString.toScreenName(loginUser);
			} else {
				var10 = localPlayer.name;
			}

			var1.drawString(4, var10 + ":", 0, 90);
			var1.drawString(var1.stringWidTag(var10 + ": ") + 6, chatInput + "*", 255, 90);
			Pix2D.hline(479, 0, 0, 77);
		} else {
			drawInterface(0, IfType.list[tutComId], 0, 0);
		}

		if (isMenuOpen && menuArea == 2) {
			drawMinimenu();
		}

		areaChat.draw(17, graphics, 357);
		areaGame.setPixels();
		Pix3D.scanline = gameScanline;
	}

	@ObfuscatedName("client.a()V")
	public final void maininit() {
		drawProgress("Starting up", 20);

		if (signlink.sunjava) {
			mindel = 5;
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

			if (var2.endsWith("192.168.1.246")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.247")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.249")) {
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
				if (signlink.cache_dat != null) {
					for (int var3 = 0; var3 < 5; var3++) {
						fileStreams[var3] = new FileStream(signlink.cache_dat, signlink.cache_idx[var3], var3 + 1, 500000);
					}
				}

				try {
					getJagChecksums();
					title = getJagFile("title screen", 1, "title", jagChecksum[1], 25);
					p11 = new PixFont(title, false, "p11_full");
					p12 = new PixFont(title, false, "p12_full");
					b12 = new PixFont(title, false, "b12_full");
					q8 = new PixFont(title, true, "q8_full");
					loadTitleBackground();
					loadTitleImages();
					JagFile var4 = getJagFile("config", 2, "config", jagChecksum[2], 30);
					JagFile var5 = getJagFile("interface", 3, "interface", jagChecksum[3], 35);
					JagFile var6 = getJagFile("2d graphics", 4, "media", jagChecksum[4], 40);
					JagFile var7 = getJagFile("textures", 6, "textures", jagChecksum[6], 45);
					JagFile var8 = getJagFile("chat system", 7, "wordenc", jagChecksum[7], 50);
					JagFile var9 = getJagFile("sound effects", 8, "sounds", jagChecksum[8], 55);
					mapl = new byte[4][104][104];
					groundh = new int[4][105][105];
					world = new World(4, 104, 104, groundh);

					for (int var10 = 0; var10 < 4; var10++) {
						collision[var10] = new CollisionMap(104, 104);
					}

					minimap = new Pix32(512, 512);
					JagFile var11 = getJagFile("update list", 5, "versionlist", jagChecksum[5], 60);
					drawProgress("Connecting to update server", 60);
					onDemand = new OnDemand();
					onDemand.init(var11, this);
					AnimFrame.init(onDemand.getAnimFrameCount());
					Model.init(onDemand.getFileCount(0), onDemand);

					if (!lowMem) {
						midiSong = 0;
						try {
							midiSong = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						midiFading = true;
						onDemand.request(2, midiSong);

						while (onDemand.remaining() > 0) {
							onDemandLoop();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (onDemand.failCount > 3) {
								showLoadError("ondemand");
								return;
							}
						}
					}

					drawProgress("Requesting animations", 65);
					int var12 = onDemand.getFileCount(1);
					for (int var13 = 0; var13 < var12; var13++) {
						onDemand.request(1, var13);
					}

					while (onDemand.remaining() > 0) {
						int var14 = var12 - onDemand.remaining();
						if (var14 > 0) {
							drawProgress("Loading animations - " + var14 * 100 / var12 + "%", 65);
						}

						onDemandLoop();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (onDemand.failCount > 3) {
							showLoadError("ondemand");
							return;
						}
					}

					drawProgress("Requesting models", 70);
					int var15 = onDemand.getFileCount(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = onDemand.getModelUse(var16);
						if ((var17 & 0x1) != 0) {
							onDemand.request(0, var16);
						}
					}

					int var18 = onDemand.remaining();
					while (onDemand.remaining() > 0) {
						int var19 = var18 - onDemand.remaining();
						if (var19 > 0) {
							drawProgress("Loading models - " + var19 * 100 / var18 + "%", 70);
						}

						onDemandLoop();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (fileStreams[0] != null) {
						drawProgress("Requesting maps", 75);
						onDemand.request(3, onDemand.getMapFile(0, 47, 48));
						onDemand.request(3, onDemand.getMapFile(1, 47, 48));
						onDemand.request(3, onDemand.getMapFile(0, 48, 48));
						onDemand.request(3, onDemand.getMapFile(1, 48, 48));
						onDemand.request(3, onDemand.getMapFile(0, 49, 48));
						onDemand.request(3, onDemand.getMapFile(1, 49, 48));
						onDemand.request(3, onDemand.getMapFile(0, 47, 47));
						onDemand.request(3, onDemand.getMapFile(1, 47, 47));
						onDemand.request(3, onDemand.getMapFile(0, 48, 47));
						onDemand.request(3, onDemand.getMapFile(1, 48, 47));
						onDemand.request(3, onDemand.getMapFile(0, 48, 148));
						onDemand.request(3, onDemand.getMapFile(1, 48, 148));
						int var20 = onDemand.remaining();
						while (onDemand.remaining() > 0) {
							int var21 = var20 - onDemand.remaining();
							if (var21 > 0) {
								drawProgress("Loading maps - " + var21 * 100 / var20 + "%", 75);
							}

							onDemandLoop();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = onDemand.getFileCount(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = onDemand.getModelUse(var23);
						byte var25 = 0;
						if ((var24 & 0x8) != 0) {
							var25 = 10;
						} else if ((var24 & 0x20) != 0) {
							var25 = 9;
						} else if ((var24 & 0x10) != 0) {
							var25 = 8;
						} else if ((var24 & 0x40) != 0) {
							var25 = 7;
						} else if ((var24 & 0x80) != 0) {
							var25 = 6;
						} else if ((var24 & 0x2) != 0) {
							var25 = 5;
						} else if ((var24 & 0x4) != 0) {
							var25 = 4;
						}

						if ((var24 & 0x1) != 0) {
							var25 = 3;
						}

						if (var25 != 0) {
							onDemand.prefetchPriority(var23, 0, var25);
						}
					}

					onDemand.prefetchMaps(memServer);

					if (!lowMem) {
						int var26 = onDemand.getFileCount(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (onDemand.isMidiJingle(var27)) {
								onDemand.prefetchPriority(var27, 2, (byte) 1);
							}
						}
					}

					drawProgress("Unpacking media", 80);
					invback = new Pix8(var6, "invback", 0);
					chatback = new Pix8(var6, "chatback", 0);
					mapback = new Pix8(var6, "mapback", 0);
					backbase1 = new Pix8(var6, "backbase1", 0);
					backbase2 = new Pix8(var6, "backbase2", 0);
					backhmid1 = new Pix8(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						sideicons[var28] = new Pix8(var6, "sideicons", var28);
					}

					compass = new Pix32(var6, "compass", 0);
					mapedge = new Pix32(var6, "mapedge", 0);
					mapedge.trim();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							mapscene[var29] = new Pix8(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							mapfunction[var30] = new Pix32(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							hitmarks[var31] = new Pix32(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							headicons[var32] = new Pix32(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					mapmarker1 = new Pix32(var6, "mapmarker", 0);
					mapmarker2 = new Pix32(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						cross[var33] = new Pix32(var6, "cross", var33);
					}

					mapdots1 = new Pix32(var6, "mapdots", 0);
					mapdots2 = new Pix32(var6, "mapdots", 1);
					mapdots3 = new Pix32(var6, "mapdots", 2);
					mapdots4 = new Pix32(var6, "mapdots", 3);
					scrollbar1 = new Pix8(var6, "scrollbar", 0);
					scrollbar2 = new Pix8(var6, "scrollbar", 1);
					redstone1 = new Pix8(var6, "redstone1", 0);
					redstone2 = new Pix8(var6, "redstone2", 0);
					redstone3 = new Pix8(var6, "redstone3", 0);
					redstone1h = new Pix8(var6, "redstone1", 0);
					redstone1h.hflip();
					redstone2h = new Pix8(var6, "redstone2", 0);
					redstone2h.hflip();
					redstone1v = new Pix8(var6, "redstone1", 0);
					redstone1v.vflip();
					redstone2v = new Pix8(var6, "redstone2", 0);
					redstone2v.vflip();
					redstone3v = new Pix8(var6, "redstone3", 0);
					redstone3v.vflip();
					redstone1hv = new Pix8(var6, "redstone1", 0);
					redstone1hv.hflip();
					redstone1hv.vflip();
					redstone2hv = new Pix8(var6, "redstone2", 0);
					redstone2hv.hflip();
					redstone2hv.vflip();

					for (int var34 = 0; var34 < 2; var34++) {
						modIcons[var34] = new Pix8(var6, "mod_icons", var34);
					}

					Pix32 var35 = new Pix32(var6, "backleft1", 0);
					areaBackleft1 = new PixMap(var35.hi, var35.wi, getBaseComponent());
					var35.quickPlotSprite(0, 0);
					Pix32 var36 = new Pix32(var6, "backleft2", 0);
					areaBackleft2 = new PixMap(var36.hi, var36.wi, getBaseComponent());
					var36.quickPlotSprite(0, 0);
					Pix32 var37 = new Pix32(var6, "backright1", 0);
					areaBackright1 = new PixMap(var37.hi, var37.wi, getBaseComponent());
					var37.quickPlotSprite(0, 0);
					Pix32 var38 = new Pix32(var6, "backright2", 0);
					areaBackright2 = new PixMap(var38.hi, var38.wi, getBaseComponent());
					var38.quickPlotSprite(0, 0);
					Pix32 var39 = new Pix32(var6, "backtop1", 0);
					areaBacktop1 = new PixMap(var39.hi, var39.wi, getBaseComponent());
					var39.quickPlotSprite(0, 0);
					Pix32 var40 = new Pix32(var6, "backvmid1", 0);
					areaBackvmid1 = new PixMap(var40.hi, var40.wi, getBaseComponent());
					var40.quickPlotSprite(0, 0);
					Pix32 var41 = new Pix32(var6, "backvmid2", 0);
					areaBackvmid2 = new PixMap(var41.hi, var41.wi, getBaseComponent());
					var41.quickPlotSprite(0, 0);
					Pix32 var42 = new Pix32(var6, "backvmid3", 0);
					areaBackvmid3 = new PixMap(var42.hi, var42.wi, getBaseComponent());
					var42.quickPlotSprite(0, 0);
					Pix32 var43 = new Pix32(var6, "backhmid2", 0);
					areaBackhmid2 = new PixMap(var43.hi, var43.wi, getBaseComponent());
					var43.quickPlotSprite(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (mapfunction[var48] != null) {
							mapfunction[var48].rgbAdjust(var46 + var47, var44 + var47, var45 + var47);
						}

						if (mapscene[var48] != null) {
							mapscene[var48].rgbAdjust(var46 + var47, var44 + var47, var45 + var47);
						}
					}

					drawProgress("Unpacking textures", 83);
					Pix3D.unpackTextures(var7);
					Pix3D.initColourTable(0.8D);
					Pix3D.initPool(20);
					drawProgress("Unpacking config", 86);
					SeqType.init(var4);
					LocType.init(var4);
					FloType.init(var4);
					ObjType.init(var4);
					NpcType.init(var4);
					IdkType.init(var4);
					SpotType.init(var4);
					VarpType.init(var4);
					VarbitType.init(var4);
					ObjType.memServer = memServer;

					if (!lowMem) {
						drawProgress("Unpacking sounds", 90);
						byte[] var49 = var9.read("sounds.dat", null);
						Packet var50 = new Packet(var49);
						JagFX.init(var50);
					}

					drawProgress("Unpacking interfaces", 95);
					PixFont[] var51 = new PixFont[] { p11, p12, b12, q8 };
					IfType.unpack(var5, var6, var51);
					drawProgress("Preparing game engine", 100);

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (mapback.data[mapback.wi * var52 + var55] == 0) {
								if (var53 == 999) {
									var53 = var55;
								}
							} else if (var53 != 999) {
								var54 = var55;
								break;
							}
						}

						compassMaskLineOffsets[var52] = var53;
						compassMaskLineLengths[var52] = var54 - var53;
					}

					for (int var56 = 5; var56 < 156; var56++) {
						int var57 = 999;
						int var58 = 0;
						for (int var59 = 25; var59 < 172; var59++) {
							if (mapback.data[mapback.wi * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
								if (var57 == 999) {
									var57 = var59;
								}
							} else if (var57 != 999) {
								var58 = var59;
								break;
							}
						}

						minimapMaskLineOffsets[var56 - 5] = var57 - 25;
						minimapMaskLineLengths[var56 - 5] = var58 - var57;
					}

					Pix3D.setClipping(479, 96);
					chatScanline = Pix3D.scanline;
					Pix3D.setClipping(190, 261);
					sideScanline = Pix3D.scanline;
					Pix3D.setClipping(512, 334);
					gameScanline = Pix3D.scanline;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = Pix3D.sinTable[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					World.resetVisCalc(334, 800, 512, 500, var60);
					WordFilter.unpack(var8);
					mouseTracking = new MouseTracking(this);
					startThread(mouseTracking, 10);
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + lastProgressMessage + " " + lastProgressPercent);
					errorLoading = true;
				}
			} else {
				errorHost = true;
			}
		}
	}

	@ObfuscatedName("client.a(IILd;IIIIZI)V")
	public final void doScrollbar(int arg0, IfType arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
		if (scrollGrabbed) {
			scrollInputPadding = 32;
		} else {
			scrollInputPadding = 0;
		}

		scrollGrabbed = false;
		if (arg5 >= arg4 && arg5 < arg4 + 16 && arg2 >= arg3 && arg2 < arg3 + 16) {
			arg1.scrollPos -= scrollCycle * 4;

			if (arg6) {
				redrawSidebar = true;
				return;
			}
		} else if (arg5 >= arg4 && arg5 < arg4 + 16 && arg2 >= arg0 + arg3 - 16 && arg2 < arg0 + arg3) {
			arg1.scrollPos += scrollCycle * 4;

			if (arg6) {
				redrawSidebar = true;
				return;
			}
		} else if (arg5 >= arg4 - scrollInputPadding && arg5 < arg4 + scrollInputPadding + 16 && arg2 >= arg3 + 16 && arg2 < arg0 + arg3 - 16 && scrollCycle > 0) {
			int var9 = (arg0 - 32) * arg0 / arg7;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg2 - arg3 - var9 / 2 - 16;
			int var11 = arg0 - var9 - 32;
			arg1.scrollPos = (arg7 - arg0) * var10 / var11;

			if (arg6) {
				redrawSidebar = true;
			}

			scrollGrabbed = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(IB)Z")
	public final boolean isAddFriendOption(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = menuAction[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 605) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(IILlb;)V")
	public final void getNpcPosOldVis(int arg0, Packet arg1) {
		arg1.gbitstart();
		int var3 = arg1.gbit(8);
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
			int var8 = arg1.gbit(1);
			if (var8 == 0) {
				npcIds[npcCount++] = var6;
				var7.cycle = loopCycle;
			} else {
				int var9 = arg1.gbit(2);
				if (var9 == 0) {
					npcIds[npcCount++] = var6;
					var7.cycle = loopCycle;
					entityUpdateIds[entityUpdateCount++] = var6;
				} else if (var9 == 1) {
					npcIds[npcCount++] = var6;
					var7.cycle = loopCycle;
					int var10 = arg1.gbit(3);
					var7.moveCode(var10, false);
					int var11 = arg1.gbit(1);
					if (var11 == 1) {
						entityUpdateIds[entityUpdateCount++] = var6;
					}
				} else if (var9 == 2) {
					npcIds[npcCount++] = var6;
					var7.cycle = loopCycle;
					int var12 = arg1.gbit(3);
					var7.moveCode(var12, true);
					int var13 = arg1.gbit(3);
					var7.moveCode(var13, true);
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

	@ObfuscatedName("client.b(IILlb;)V")
	public final void zonePacket(int arg0, Packet arg1) {
		if (arg0 == 138 || arg0 == 173) {
			int var3 = arg1.g1();
			int var4 = (var3 >> 4 & 0x7) + zoneUpdateX;
			int var5 = (var3 & 0x7) + zoneUpdateZ;
			int var6 = arg1.g1();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = LOC_SHAPE_TO_LAYER[var7];
			int var10;
			if (arg0 == 173) {
				var10 = -1;
			} else {
				var10 = arg1.g2();
			}

			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				locChangeCreate(var5, -1, var10, minusedlevel, var8, var4, var9, var7, 0);
			}
		} else if (arg0 == 48) {
			int var11 = arg1.g1();
			int var12 = (var11 >> 4 & 0x7) + zoneUpdateX;
			int var13 = (var11 & 0x7) + zoneUpdateZ;
			int var14 = arg1.g1();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = LOC_SHAPE_TO_LAYER[var15];
			int var18 = arg1.g2();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = groundh[minusedlevel][var12][var13];
				int var20 = groundh[minusedlevel][var12 + 1][var13];
				int var21 = groundh[minusedlevel][var12 + 1][var13 + 1];
				int var22 = groundh[minusedlevel][var12][var13 + 1];
				if (var17 == 0) {
					Wall var23 = world.getWall(var13, minusedlevel, var12);
					if (var23 != null) {
						int var24 = var23.typecode >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.model1 = new ClientLocAnim(2, var16 + 4, var18, var24, var21, false, var20, var22, var19);
							var23.model2 = new ClientLocAnim(2, var16 + 1 & 0x3, var18, var24, var21, false, var20, var22, var19);
						} else {
							var23.model1 = new ClientLocAnim(var15, var16, var18, var24, var21, false, var20, var22, var19);
						}
					}
				}

				if (var17 == 1) {
					Decor var25 = world.getDecor(var12, minusedlevel, var13);
					if (var25 != null) {
						var25.model = new ClientLocAnim(4, 0, var18, var25.typecode >> 14 & 0x7FFF, var21, false, var20, var22, var19);
					}
				}

				if (var17 == 2) {
					Sprite var26 = world.getScene(var12, minusedlevel, var13);

					if (var15 == 11) {
						var15 = 10;
					}

					if (var26 != null) {
						var26.model = new ClientLocAnim(var15, var16, var18, var26.typecode >> 14 & 0x7FFF, var21, false, var20, var22, var19);
					}
				}

				if (var17 == 3) {
					GroundDecor var27 = world.getGd(var12, minusedlevel, var13);
					if (var27 != null) {
						var27.model = new ClientLocAnim(22, var16, var18, var27.typecode >> 14 & 0x7FFF, var21, false, var20, var22, var19);
					}
				}
			}
		} else if (arg0 == 81) {
			int var28 = arg1.g1();
			int var29 = (var28 >> 4 & 0x7) + zoneUpdateX;
			int var30 = (var28 & 0x7) + zoneUpdateZ;
			int var31 = arg1.g2();
			int var32 = arg1.g2();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				ClientObj var33 = new ClientObj();
				var33.id = var31;
				var33.count = var32;

				if (groundObj[minusedlevel][var29][var30] == null) {
					groundObj[minusedlevel][var29][var30] = new LinkList();
				}

				groundObj[minusedlevel][var29][var30].push(var33);
				showObject(var29, var30);
			}
		} else if (arg0 == 52) {
			int var34 = arg1.g1();
			int var35 = (var34 >> 4 & 0x7) + zoneUpdateX;
			int var36 = (var34 & 0x7) + zoneUpdateZ;
			int var37 = arg1.g2();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				LinkList var38 = groundObj[minusedlevel][var35][var36];
				if (var38 != null) {
					for (ClientObj var39 = (ClientObj) var38.head(); var39 != null; var39 = (ClientObj) var38.next()) {
						if ((var37 & 0x7FFF) == var39.id) {
							var39.unlink();
							break;
						}
					}

					if (var38.head() == null) {
						groundObj[minusedlevel][var35][var36] = null;
					}

					showObject(var35, var36);
				}
			}
		} else if (arg0 == 107) {
			int var40 = arg1.g1();
			int var41 = (var40 >> 4 & 0x7) + zoneUpdateX;
			int var42 = (var40 & 0x7) + zoneUpdateZ;
			int var43 = var41 + arg1.g1b();
			int var44 = var42 + arg1.g1b();
			int var45 = arg1.g2b();
			int var46 = arg1.g2();
			int var47 = arg1.g1() * 4;
			int var48 = arg1.g1() * 4;
			int var49 = arg1.g2();
			int var50 = arg1.g2();
			int var51 = arg1.g1();
			int var52 = arg1.g1();
			if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104 && var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
				var41 = var41 * 128 + 64;
				var42 = var42 * 128 + 64;
				var43 = var43 * 128 + 64;
				var44 = var44 * 128 + 64;
				ClientProj var53 = new ClientProj(var41, var52, var48, loopCycle + var50, var51, loopCycle + var49, minusedlevel, var46, getAvH(var41, var42, minusedlevel) - var47, var45, var42);
				var53.setTarget(loopCycle + var49, getAvH(var43, var44, minusedlevel) - var48, var43, var44);
				projectiles.push(var53);
			}
		} else if (arg0 == 85) {
			int var54 = arg1.g1();
			int var55 = (var54 >> 4 & 0x7) + zoneUpdateX;
			int var56 = (var54 & 0x7) + zoneUpdateZ;
			int var57 = arg1.g2();
			int var58 = arg1.g1();
			int var59 = arg1.g2();
			if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
				var55 = var55 * 128 + 64;
				var56 = var56 * 128 + 64;
				MapSpotAnim var60 = new MapSpotAnim(var59, var56, var55, minusedlevel, getAvH(var55, var56, minusedlevel) - var58, var57, loopCycle);
				spotanims.push(var60);
			}
		} else if (arg0 == 219) {
			int var61 = arg1.g1();
			int var62 = (var61 >> 4 & 0x7) + zoneUpdateX;
			int var63 = (var61 & 0x7) + zoneUpdateZ;
			int var64 = arg1.g2();
			int var65 = arg1.g2();
			int var66 = arg1.g2();
			if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && selfSlot != var66) {
				ClientObj var67 = new ClientObj();
				var67.id = var64;
				var67.count = var65;

				if (groundObj[minusedlevel][var62][var63] == null) {
					groundObj[minusedlevel][var62][var63] = new LinkList();
				}

				groundObj[minusedlevel][var62][var63].push(var67);
				showObject(var62, var63);
			}
		} else if (arg0 == 176) {
			int var68 = arg1.g1();
			int var69 = (var68 >> 4 & 0x7) + zoneUpdateX;
			int var70 = (var68 & 0x7) + zoneUpdateZ;
			int var71 = arg1.g1();
			int var72 = var71 >> 2;
			int var73 = var71 & 0x3;
			int var74 = LOC_SHAPE_TO_LAYER[var72];
			int var75 = arg1.g2();
			int var76 = arg1.g2();
			int var77 = arg1.g2();
			int var78 = arg1.g2();
			byte var79 = arg1.g1b();
			byte var80 = arg1.g1b();
			byte var81 = arg1.g1b();
			byte var82 = arg1.g1b();
			ClientPlayer var83;
			if (selfSlot == var78) {
				var83 = localPlayer;
			} else {
				var83 = players[var78];
			}

			if (var83 != null) {
				LocType var84 = LocType.list(var75);
				int var85 = groundh[minusedlevel][var69][var70];
				int var86 = groundh[minusedlevel][var69 + 1][var70];
				int var87 = groundh[minusedlevel][var69 + 1][var70 + 1];
				int var88 = groundh[minusedlevel][var69][var70 + 1];
				Model var89 = var84.getModel(var72, var73, var85, var86, var87, var88, -1);
				if (var89 != null) {
					locChangeCreate(var70, var77 + 1, -1, minusedlevel, 0, var69, var74, 0, var76 + 1);
					var83.locStartCycle = loopCycle + var76;
					var83.locStopCycle = loopCycle + var77;
					var83.locModel = var89;
					int var90 = var84.width;
					int var91 = var84.length;
					if (var73 == 1 || var73 == 3) {
						var90 = var84.length;
						var91 = var84.width;
					}

					var83.locOffsetX = var69 * 128 + var90 * 64;
					var83.locOffsetZ = var70 * 128 + var91 * 64;
					var83.locOffsetY = getAvH(var83.locOffsetX, var83.locOffsetZ, minusedlevel);

					if (var79 > var81) {
						byte var92 = var79;
						var79 = var81;
						var81 = var92;
					}

					if (var80 > var82) {
						byte var93 = var80;
						var80 = var82;
						var82 = var93;
					}

					var83.minTileX = var69 + var79;
					var83.maxTileX = var69 + var81;
					var83.minTileZ = var70 + var80;
					var83.maxTileZ = var70 + var82;
				}
			}
		} else if (arg0 == 95) {
			int var94 = arg1.g1();
			int var95 = (var94 >> 4 & 0x7) + zoneUpdateX;
			int var96 = (var94 & 0x7) + zoneUpdateZ;
			int var97 = arg1.g2();
			int var98 = arg1.g2();
			int var99 = arg1.g2();
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

	@ObfuscatedName("client.q(I)V")
	public final void buildMinimenu() {
		if (objDragArea == 0) {
			menuOption[0] = "Cancel";
			menuAction[0] = 1106;
			menuNumEntries = 1;
			addPrivateChatOptions();
			lastOverComId = 0;

			if (mouseX > 4 && mouseY > 4 && mouseX < 516 && mouseY < 338) {
				if (mainModalId == -1) {
					addWorldOptions();
				} else {
					addComponentOptions(mouseY, mouseX, 4, IfType.list[mainModalId], 0, 4);
				}
			}

			if (overMainComId != lastOverComId) {
				overMainComId = lastOverComId;
			}

			lastOverComId = 0;

			if (mouseX > 553 && mouseY > 205 && mouseX < 743 && mouseY < 466) {
				if (sideModalId != -1) {
					addComponentOptions(mouseY, mouseX, 205, IfType.list[sideModalId], 0, 553);
				} else if (sideIcon[activeIcon] != -1) {
					addComponentOptions(mouseY, mouseX, 205, IfType.list[sideIcon[activeIcon]], 0, 553);
				}
			}

			if (lastOverComId != overSideComId) {
				redrawSidebar = true;
				overSideComId = lastOverComId;
			}

			lastOverComId = 0;

			if (mouseX > 17 && mouseY > 357 && mouseX < 496 && mouseY < 453) {
				if (chatComId != -1) {
					addComponentOptions(mouseY, mouseX, 357, IfType.list[chatComId], 0, 17);
				} else if (mouseY < 434 && mouseX < 426) {
					addChatOptions(mouseX - 17, mouseY - 357);
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

	@ObfuscatedName("client.d(I)V")
	public final void refresh() {
		redrawFrame = true;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;II)V")
	public final void drawProgress(String arg0, int arg1) {
		lastProgressPercent = arg1;
		lastProgressMessage = arg0;
		prepareTitle();

		if (title == null) {
			super.drawProgress(arg0, arg1);
		} else {
			imageTitle4.setPixels();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			b12.centreString(var3 / 2, var4 / 2 - var5 - 26, 0xFFFFFF, "RuneScape is loading - please wait...");
			int var6 = var4 / 2 - var5 - 18;
			Pix2D.drawRect(304, 0x8C1111, 34, var3 / 2 - 152, var6);
			Pix2D.drawRect(302, 0, 32, var3 / 2 - 151, var6 + 1);
			Pix2D.fillRect(30, 0x8C1111, arg1 * 3, var3 / 2 - 150, var6 + 2);
			Pix2D.fillRect(30, 0, 300 - arg1 * 3, arg1 * 3 + (var3 / 2 - 150), var6 + 2);
			b12.centreString(var3 / 2, var4 / 2 + 5 - var5, 0xFFFFFF, arg0);
			imageTitle4.draw(202, graphics, 171);

			if (redrawFrame) {
				redrawFrame = false;

				if (!flameActive) {
					imageTitle0.draw(0, graphics, 0);
					imageTitle1.draw(637, graphics, 0);
				}

				imageTitle2.draw(128, graphics, 0);
				imageTitle3.draw(202, graphics, 371);
				imageTitle5.draw(0, graphics, 265);
				imageTitle6.draw(562, graphics, 265);
				imageTitle7.draw(128, graphics, 171);
				imageTitle8.draw(562, graphics, 171);
			}
		}
	}

	@ObfuscatedName("client.a(IIILd;III)V")
	public final void addComponentOptions(int arg0, int arg1, int arg2, IfType arg3, int arg4, int arg5) {
		if (arg3.type == 0 && arg3.children != null && !arg3.hide && (arg1 >= arg5 && arg0 >= arg2 && arg1 <= arg3.width + arg5 && arg0 <= arg3.height + arg2)) {
			int var7 = arg3.children.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg3.childX[var8] + arg5;
				int var10 = arg3.childY[var8] + arg2 - arg4;
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
					addComponentOptions(arg0, arg1, var10, var11, var11.scrollPos, var9);

					if (var11.scrollHeight > var11.height) {
						doScrollbar(var11.height, var11, arg0, var10, var11.width + var9, arg1, true, var11.scrollHeight);
					}
				} else {
					if (var11.buttonType == 1 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.width + var9 && arg0 < var11.height + var10) {
						boolean var12 = false;
						if (var11.clientCode != 0) {
							var12 = addSocialOptions(var11);
						}

						if (!var12) {
							menuOption[menuNumEntries] = var11.buttonText;
							menuAction[menuNumEntries] = 231;
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
						menuAction[menuNumEntries] = 274;
						menuParamC[menuNumEntries] = var11.id;
						menuNumEntries++;
					}

					if (var11.buttonType == 3 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.width + var9 && arg0 < var11.height + var10) {
						menuOption[menuNumEntries] = "Close";
						menuAction[menuNumEntries] = 737;
						menuParamC[menuNumEntries] = var11.id;
						menuNumEntries++;
					}

					if (var11.buttonType == 4 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.width + var9 && arg0 < var11.height + var10) {
						menuOption[menuNumEntries] = var11.buttonText;
						menuAction[menuNumEntries] = 435;
						menuParamC[menuNumEntries] = var11.id;
						menuNumEntries++;
					}

					if (var11.buttonType == 5 && arg1 >= var9 && arg0 >= var10 && arg1 < var11.width + var9 && arg0 < var11.height + var10) {
						menuOption[menuNumEntries] = var11.buttonText;
						menuAction[menuNumEntries] = 225;
						menuParamC[menuNumEntries] = var11.id;
						menuNumEntries++;
					}

					if (var11.buttonType == 6 && !resumedPauseButton && arg1 >= var9 && arg0 >= var10 && arg1 < var11.width + var9 && arg0 < var11.height + var10) {
						menuOption[menuNumEntries] = var11.buttonText;
						menuAction[menuNumEntries] = 997;
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
												menuAction[menuNumEntries] = 398;
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
															menuAction[menuNumEntries] = 681;
														}

														if (var20 == 4) {
															menuAction[menuNumEntries] = 100;
														}

														menuParamA[menuNumEntries] = var19.id;
														menuParamB[menuNumEntries] = var14;
														menuParamC[menuNumEntries] = var11.id;
														menuNumEntries++;
													} else if (var20 == 4) {
														menuOption[menuNumEntries] = "Drop @lre@" + var19.name;
														menuAction[menuNumEntries] = 100;
														menuParamA[menuNumEntries] = var19.id;
														menuParamB[menuNumEntries] = var14;
														menuParamC[menuNumEntries] = var11.id;
														menuNumEntries++;
													}
												}
											}

											if (var11.objUse) {
												menuOption[menuNumEntries] = "Use @lre@" + var19.name;
												menuAction[menuNumEntries] = 102;
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
															menuAction[menuNumEntries] = 694;
														}

														if (var21 == 1) {
															menuAction[menuNumEntries] = 962;
														}

														if (var21 == 2) {
															menuAction[menuNumEntries] = 795;
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
															menuAction[menuNumEntries] = 582;
														}

														if (var22 == 1) {
															menuAction[menuNumEntries] = 113;
														}

														if (var22 == 2) {
															menuAction[menuNumEntries] = 555;
														}

														if (var22 == 3) {
															menuAction[menuNumEntries] = 331;
														}

														if (var22 == 4) {
															menuAction[menuNumEntries] = 354;
														}

														menuParamA[menuNumEntries] = var19.id;
														menuParamB[menuNumEntries] = var14;
														menuParamC[menuNumEntries] = var11.id;
														menuNumEntries++;
													}
												}
											}

											menuOption[menuNumEntries] = "Examine @lre@" + var19.name;
											menuAction[menuNumEntries] = 1328;
											menuParamA[menuNumEntries] = var19.id;
											menuParamB[menuNumEntries] = var14;
											menuParamC[menuNumEntries] = var11.id;
											menuNumEntries++;
										} else if ((targetMask & 0x10) == 0x10) {
											menuOption[menuNumEntries] = targetOp + " @lre@" + var19.name;
											menuAction[menuNumEntries] = 563;
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

	@ObfuscatedName("client.f(Z)V")
	public final void addMapAnim() {
		for (MapSpotAnim var1 = (MapSpotAnim) spotanims.head(); var1 != null; var1 = (MapSpotAnim) spotanims.next()) {
			if (minusedlevel != var1.level || var1.animComplete) {
				var1.unlink();
			} else if (loopCycle >= var1.startCycle) {
				var1.update(worldUpdateNum);

				if (var1.animComplete) {
					var1.unlink();
				} else {
					world.addDynamic(var1.y, var1, var1.x, -1, var1.z, 60, 0, var1.level, false);
				}
			}
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void lostCon() {
		if (logoutTimer > 0) {
			logout();
		} else {
			areaGame.setPixels();
			p12.centreString(257, 144, 0, "Connection lost");
			p12.centreString(256, 143, 0xFFFFFF, "Connection lost");
			p12.centreString(257, 159, 0, "Please wait - attempting to reestablish");
			p12.centreString(256, 158, 0xFFFFFF, "Please wait - attempting to reestablish");
			areaGame.draw(4, graphics, 4);
			minimapState = 0;
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

	@ObfuscatedName("client.s(I)Ljava/net/Socket;")
	public final Socket openSocket(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.t(I)V")
	public static final void setHighMem() {
		World.lowMem = false;
		Pix3D.lowMem = false;
		lowMem = false;
		ClientBuild.lowMem = false;
	}

	public final void run() {
		if (flamesThread) {
			renderFlames();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.u(I)V")
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
					String var5 = chatUsername[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || chatPrivateMode == 0 || chatPrivateMode == 1 && isFriend(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.drawString(var8, "From", 0, var7);
						var1.drawString(var8, "From", 0xFFFF, var7 - 1);
						int var11 = var8 + var1.stringWidTag("From ");
						if (var6 == 1) {
							modIcons[0].plotSprite(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							modIcons[1].plotSprite(var11, var7 - 12);
							var11 += 14;
						}

						var1.drawString(var11, var5 + ": " + chatText[var3], 0, var7);
						var1.drawString(var11, var5 + ": " + chatText[var3], 0xFFFF, var7 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && chatPrivateMode < 2) {
						int var9 = 329 - var2 * 13;
						var1.drawString(4, chatText[var3], 0, var9);
						var1.drawString(4, chatText[var3], 0xFFFF, var9 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && chatPrivateMode < 2) {
						int var10 = 329 - var2 * 13;
						var1.drawString(4, "To " + var5 + ": " + chatText[var3], 0, var10);
						var1.drawString(4, "To " + var5 + ": " + chatText[var3], 0xFFFF, var10 - 1);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Llb;II)V")
	public final void getPlayerPosExtended(Packet arg0, int arg1) {
		for (int var3 = 0; var3 < entityUpdateCount; var3++) {
			int var4 = entityUpdateIds[var3];
			ClientPlayer var5 = players[var4];
			int var6 = arg0.g1();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg0.g1() << 8;
			}

			getPlayerPosDecodeExtended(var6, var4, var5, arg0);
		}
	}

	@ObfuscatedName("client.a(Z[BI)V")
	public final void saveMidi(boolean arg0, byte[] arg1) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg1, arg1.length);
	}

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static final String combatColourCode(int arg0, int arg1) {
		int var2 = arg1 - arg0;
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

	@ObfuscatedName("client.v(I)V")
	public final void stopMidi() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(IZ)V")
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
					drawDetail(var11, var8, var10, var9, arg0);
				}

				if (arg0 < 3 && (mapl[arg0 + 1][var11][var10] & 0x8) != 0) {
					drawDetail(var11, var8, var10, var9, arg0 + 1);
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

		cyclelogic3++;
		if (cyclelogic3 > 112) {
			cyclelogic3 = 0;
			out.p1enc(52);
			out.p1(50);
		}
	}

	@ObfuscatedName("client.g(Z)V")
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
		clearCaches();
		world.resetMap();

		for (int var1 = 0; var1 < 4; var1++) {
			collision[var1].reset();
		}

		System.gc();
		stopMidi();
		nextMidiSong = -1;
		midiSong = -1;
		nextMidiDelay = 0;
	}

	@ObfuscatedName("client.a(ILnb;)V")
	public final void locChangeSetOld(LocChange arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.layer == 0) {
			var2 = world.wallType(arg0.level, arg0.x, arg0.z);
		}

		if (arg0.layer == 1) {
			var2 = world.decorType(arg0.z, arg0.x, arg0.level);
		}

		if (arg0.layer == 2) {
			var2 = world.sceneType(arg0.level, arg0.x, arg0.z);
		}

		if (arg0.layer == 3) {
			var2 = world.gdType(arg0.level, arg0.x, arg0.z);
		}

		if (var2 != 0) {
			int var6 = world.typeCode2(arg0.level, arg0.x, arg0.z, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.oldType = var3;
		arg0.oldShape = var4;
		arg0.oldAngle = var5;
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void startThread(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}

		if (signlink.mainapp == null) {
			super.startThread(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void locChangeCreate(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		LocChange var10 = null;
		for (LocChange var11 = (LocChange) locChanges.head(); var11 != null; var11 = (LocChange) locChanges.next()) {
			if (var11.level == arg3 && var11.x == arg5 && var11.z == arg0 && var11.layer == arg6) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new LocChange();
			var10.level = arg3;
			var10.layer = arg6;
			var10.x = arg5;
			var10.z = arg0;
			locChangeSetOld(var10);
			locChanges.push(var10);
		}

		var10.newType = arg2;
		var10.newShape = arg7;
		var10.newAngle = arg4;
		var10.startTime = arg8;
		var10.endTime = arg1;
	}

	@ObfuscatedName("client.h(Z)V")
	public final void addPrivateChatOptions() {
		if (splitPrivateChat != 0) {
			int var1 = 0;
			if (rebootTimer != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (chatText[var2] != null) {
					int var3 = chatType[var2];
					String var4 = chatUsername[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || chatPrivateMode == 0 || chatPrivateMode == 1 && isFriend(var4))) {
						int var8 = 329 - var1 * 13;
						if (mouseX > 4 && mouseY - 4 > var8 - 10 && mouseY - 4 <= var8 + 3) {
							int var9 = p12.stringWidTag("From:  " + var4 + chatText[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (mouseX < var9 + 4) {
								if (staffmodlevel >= 1) {
									menuOption[menuNumEntries] = "Report abuse @whi@" + var4;
									menuAction[menuNumEntries] = 2524;
									menuNumEntries++;
								}

								menuOption[menuNumEntries] = "Add ignore @whi@" + var4;
								menuAction[menuNumEntries] = 2047;
								menuNumEntries++;
								menuOption[menuNumEntries] = "Add friend @whi@" + var4;
								menuAction[menuNumEntries] = 2605;
								menuNumEntries++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && chatPrivateMode < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream openUrl(String arg0) throws IOException {
		if (jaggrabEnabled) {
			if (jaggrabSocket != null) {
				try {
					jaggrabSocket.close();
				} catch (Exception var4) {
				}

				jaggrabSocket = null;
			}

			jaggrabSocket = openSocket(43595);
			jaggrabSocket.setSoTimeout(10000);
			InputStream var2 = jaggrabSocket.getInputStream();
			OutputStream var3 = jaggrabSocket.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}

		if (signlink.mainapp == null) {
			return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
		}

		return signlink.openurl(arg0);
	}

	@ObfuscatedName("client.w(I)V")
	public final void renderFlames() {
		flameThread = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (flameActive) {
				flameCycle++;
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

	@ObfuscatedName("client.g(B)V")
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

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.x(I)V")
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

				if (ingame) {
					return;
				}
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

	@ObfuscatedName("client.a(IIILib;)V")
	public final void minimapDrawArrow(int arg0, int arg1, Pix32 arg2) {
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = macroMinimapAngle + orbitCameraYaw & 0x7FF;
			int var6 = Model.sinTable[var5];
			int var7 = Model.cosTable[var5];
			var6 = var6 * 256 / (macroMinimapZoom + 256);
			var7 = var7 * 256 / (macroMinimapZoom + 256);
			int var8 = arg0 * var7 + arg1 * var6 >> 16;
			int var9 = arg1 * var7 - arg0 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			mapedge.rotatePlotSprite(15, 20, var12 + 94 + 4 - 10, 83 - var13 - 20, var10, 256, 15, 20);
		} else {
			minimapDrawDot(arg1, arg0, arg2);
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void locChangePostBuildCorrect() {
		for (LocChange var1 = (LocChange) locChanges.head(); var1 != null; var1 = (LocChange) locChanges.next()) {
			if (var1.endTime == -1) {
				var1.startTime = 0;
				locChangeSetOld(var1);
			} else {
				var1.unlink();
			}
		}
	}

	public final String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}

		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(IZI)V")
	public final void addChatOptions(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (chatText[var4] != null) {
				int var5 = chatType[var4];
				int var6 = chatScrollPos + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = chatUsername[var4];
				boolean var8 = false;

				if (var7 != null && var7.startsWith("@cr1@")) {
					var7 = var7.substring(5);
					boolean var9 = true;
				}

				if (var7 != null && var7.startsWith("@cr2@")) {
					var7 = var7.substring(5);
					boolean var10 = true;
				}

				if (var5 == 0) {
					var3++;
				}

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || chatPublicMode == 0 || chatPublicMode == 1 && isFriend(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(localPlayer.name)) {
						if (staffmodlevel >= 1) {
							menuOption[menuNumEntries] = "Report abuse @whi@" + var7;
							menuAction[menuNumEntries] = 524;
							menuNumEntries++;
						}

						menuOption[menuNumEntries] = "Add ignore @whi@" + var7;
						menuAction[menuNumEntries] = 47;
						menuNumEntries++;
						menuOption[menuNumEntries] = "Add friend @whi@" + var7;
						menuAction[menuNumEntries] = 605;
						menuNumEntries++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && splitPrivateChat == 0 && (var5 == 7 || chatPrivateMode == 0 || chatPrivateMode == 1 && isFriend(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (staffmodlevel >= 1) {
							menuOption[menuNumEntries] = "Report abuse @whi@" + var7;
							menuAction[menuNumEntries] = 524;
							menuNumEntries++;
						}

						menuOption[menuNumEntries] = "Add ignore @whi@" + var7;
						menuAction[menuNumEntries] = 47;
						menuNumEntries++;
						menuOption[menuNumEntries] = "Add friend @whi@" + var7;
						menuAction[menuNumEntries] = 605;
						menuNumEntries++;
					}

					var3++;
				}

				if (var5 == 4 && (chatTradeMode == 0 || chatTradeMode == 1 && isFriend(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						menuOption[menuNumEntries] = "Accept trade @whi@" + var7;
						menuAction[menuNumEntries] = 507;
						menuNumEntries++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && splitPrivateChat == 0 && chatPrivateMode < 2) {
					var3++;
				}

				if (var5 == 8 && (chatTradeMode == 0 || chatTradeMode == 1 && isFriend(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						menuOption[menuNumEntries] = "Accept duel @whi@" + var7;
						menuAction[menuNumEntries] = 957;
						menuNumEntries++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void loadTitleImages() {
		titlebox = new Pix8(title, "titlebox", 0);
		titlebutton = new Pix8(title, "titlebutton", 0);
		runes = new Pix8[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				runes[var2] = new Pix8(title, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				runes[var3] = new Pix8(title, "runes", (var3 & 0x3) + 12);
			}
		}

		flameLeft = new Pix32(128, 265);
		flameRight = new Pix32(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			flameLeft.data[var4] = imageTitle0.data[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			flameRight.data[var5] = imageTitle1.data[var5];
		}

		flameGradient0 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			flameGradient0[var6] = var6 * 0x40000;
		}

		for (int var7 = 0; var7 < 64; var7++) {
			flameGradient0[var7 + 64] = var7 * 1024 + 0xFF0000;
		}

		for (int var8 = 0; var8 < 64; var8++) {
			flameGradient0[var8 + 128] = var8 * 4 + 0xFFFF00;
		}

		for (int var9 = 0; var9 < 64; var9++) {
			flameGradient0[var9 + 192] = 0xFFFFFF;
		}

		flameGradient1 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			flameGradient1[var10] = var10 * 1024;
		}

		for (int var11 = 0; var11 < 64; var11++) {
			flameGradient1[var11 + 64] = var11 * 4 + 0xFF00;
		}

		for (int var12 = 0; var12 < 64; var12++) {
			flameGradient1[var12 + 128] = var12 * 0x40000 + 0xFFFF;
		}

		for (int var13 = 0; var13 < 64; var13++) {
			flameGradient1[var13 + 192] = 0xFFFFFF;
		}

		flameGradient2 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			flameGradient2[var14] = var14 * 4;
		}

		for (int var15 = 0; var15 < 64; var15++) {
			flameGradient2[var15 + 64] = var15 * 0x40000 + 255;
		}

		for (int var16 = 0; var16 < 64; var16++) {
			flameGradient2[var16 + 128] = var16 * 1024 + 0xFF00FF;
		}

		for (int var17 = 0; var17 < 64; var17++) {
			flameGradient2[var17 + 192] = 0xFFFFFF;
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

	@ObfuscatedName("client.z(I)V")
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
			areaChat = new PixMap(96, 479, getBaseComponent());
			areaMap = new PixMap(156, 172, getBaseComponent());
			Pix2D.cls();
			mapback.plotSprite(0, 0);
			areaSide = new PixMap(261, 190, getBaseComponent());
			areaGame = new PixMap(334, 512, getBaseComponent());
			Pix2D.cls();
			areaBackbase1 = new PixMap(50, 496, getBaseComponent());
			areaBackbase2 = new PixMap(37, 269, getBaseComponent());
			areaBackhmid1 = new PixMap(45, 249, getBaseComponent());
			redrawFrame = true;
		}
	}

	@ObfuscatedName("client.A(I)Ljava/lang/String;")
	public final String getHost() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (frame != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.b(ILlb;I)V")
	public final void getPlayerPosOldVis(Packet arg0, int arg1) {
		int var3 = arg0.gbit(8);
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
			int var8 = arg0.gbit(1);
			if (var8 == 0) {
				playerIds[playerCount++] = var6;
				var7.cycle = loopCycle;
			} else {
				int var9 = arg0.gbit(2);
				if (var9 == 0) {
					playerIds[playerCount++] = var6;
					var7.cycle = loopCycle;
					entityUpdateIds[entityUpdateCount++] = var6;
				} else if (var9 == 1) {
					playerIds[playerCount++] = var6;
					var7.cycle = loopCycle;
					int var10 = arg0.gbit(3);
					var7.moveCode(var10, false);
					int var11 = arg0.gbit(1);
					if (var11 == 1) {
						entityUpdateIds[entityUpdateCount++] = var6;
					}
				} else if (var9 == 2) {
					playerIds[playerCount++] = var6;
					var7.cycle = loopCycle;
					int var12 = arg0.gbit(3);
					var7.moveCode(var12, true);
					int var13 = arg0.gbit(3);
					var7.moveCode(var13, true);
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

	@ObfuscatedName("client.B(I)V")
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
		if (mouseClickX > 4 && mouseClickY > 4 && mouseClickX < 516 && mouseClickY < 338) {
			int var5 = mouseClickX - var1 / 2 - 4;
			if (var1 + var5 > 512) {
				var5 = 512 - var1;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			int var6 = mouseClickY - 4;
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

		if (mouseClickX > 553 && mouseClickY > 205 && mouseClickX < 743 && mouseClickY < 466) {
			int var7 = mouseClickX - var1 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var1 + var7 > 190) {
				var7 = 190 - var1;
			}

			int var8 = mouseClickY - 205;
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

		if (mouseClickX > 17 && mouseClickY > 357 && mouseClickX < 496 && mouseClickY < 453) {
			int var9 = mouseClickX - var1 / 2 - 17;
			if (var9 < 0) {
				var9 = 0;
			} else if (var1 + var9 > 479) {
				var9 = 479 - var1;
			}

			int var10 = mouseClickY - 357;
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

	@ObfuscatedName("client.a(JZ)V")
	public final void addIgnore(long arg0) {
		if (arg0 != 0L) {
			if (ignoreCount >= 100) {
				addChat(0, "", "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = JString.toScreenName(JString.toRawUsername(arg0));
				for (int var4 = 0; var4 < ignoreCount; var4++) {
					if (ignoreUserhash[var4] == arg0) {
						addChat(0, "", var3 + " is already on your ignore list");
						return;
					}
				}

				for (int var5 = 0; var5 < friendCount; var5++) {
					if (friendUserhash[var5] == arg0) {
						addChat(0, "", "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				ignoreUserhash[ignoreCount++] = arg0;
				redrawSidebar = true;
				out.p1enc(255);
				out.p8(arg0);
			}
		}
	}

	@ObfuscatedName("client.b(IZ)Ljava/lang/String;")
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

		initApplet(503, 765);
	}

	@ObfuscatedName("client.i(Z)V")
	public final void drawSide() {
		areaSide.setPixels();
		Pix3D.scanline = sideScanline;
		invback.plotSprite(0, 0);

		if (sideModalId != -1) {
			drawInterface(0, IfType.list[sideModalId], 0, 0);
		} else if (sideIcon[activeIcon] != -1) {
			drawInterface(0, IfType.list[sideIcon[activeIcon]], 0, 0);
		}

		if (isMenuOpen && menuArea == 1) {
			drawMinimenu();
		}

		areaSide.draw(553, graphics, 205);
		areaGame.setPixels();
		Pix3D.scanline = gameScanline;
	}

	@ObfuscatedName("client.a(IBLlb;)V")
	public final void getNpcPosExtended(int arg0, Packet arg1) {
		for (int var3 = 0; var3 < entityUpdateCount; var3++) {
			int var4 = entityUpdateIds[var3];
			ClientNpc var5 = npc[var4];
			int var6 = arg1.g1();
			if ((var6 & 0x1) == 1) {
				int var7 = arg1.g1();
				int var8 = arg1.g1();
				var5.addHitmark(loopCycle, var7, var8);
				var5.combatCycle = loopCycle + 300;
				var5.health = arg1.g1();
				var5.totalHealth = arg1.g1();
			}

			if ((var6 & 0x2) == 2) {
				int var9 = arg1.g2();
				if (var9 == 0xFFFF) {
					var9 = -1;
				}

				if (var5.primaryAnim == var9) {
					var5.primaryAnimLoop = 0;
				}

				int var10 = arg1.g1();
				if (var5.primaryAnim == var9 && var9 != -1) {
					int var11 = SeqType.list[var9].duplicatebehaviour;
					if (var11 == 1) {
						var5.primaryFrame = 0;
						var5.primaryAnimCycle = 0;
						var5.primaryAnimDelay = var10;
						var5.primaryAnimLoop = 0;
					}

					if (var11 == 2) {
						var5.primaryAnimLoop = 0;
					}
				} else if (var9 == -1 || var5.primaryAnim == -1 || SeqType.list[var9].priority >= SeqType.list[var5.primaryAnim].priority) {
					var5.primaryAnim = var9;
					var5.primaryFrame = 0;
					var5.primaryAnimCycle = 0;
					var5.primaryAnimDelay = var10;
					var5.primaryAnimLoop = 0;
					var5.preanimRouteLength = var5.routeLength;
				}
			}

			if ((var6 & 0x4) == 4) {
				var5.faceEntity = arg1.g2();
				if (var5.faceEntity == 0xFFFF) {
					var5.faceEntity = -1;
				}
			}

			if ((var6 & 0x8) == 8) {
				var5.chatMessage = arg1.gstr();
				var5.chatTimer = 100;
			}

			if ((var6 & 0x10) == 0x10) {
				int var12 = arg1.g1();
				int var13 = arg1.g1();
				var5.addHitmark(loopCycle, var12, var13);
				var5.combatCycle = loopCycle + 300;
				var5.health = arg1.g1();
				var5.totalHealth = arg1.g1();
			}

			if ((var6 & 0x20) == 0x20) {
				var5.type = NpcType.list(arg1.g2());
				var5.size = var5.type.size;
				var5.turnspeed = var5.type.turnspeed;
				var5.walkanim = var5.type.walkanim;
				var5.walkanim_b = var5.type.walkanim_b;
				var5.walkanim_l = var5.type.walkanim_r;
				var5.walkanim_r = var5.type.walkanim_l;
				var5.readyanim = var5.type.readyanim;
			}

			if ((var6 & 0x40) == 0x40) {
				var5.spotanimId = arg1.g2();
				int var14 = arg1.g4();
				var5.spotanimHeight = var14 >> 16;
				var5.spotanimLastCycle = (var14 & 0xFFFF) + loopCycle;
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
				var5.faceSquareX = arg1.g2();
				var5.faceSquareZ = arg1.g2();
			}
		}
	}

	@ObfuscatedName("client.a(ILjb;)V")
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

	@ObfuscatedName("client.a(IIBLab;Llb;)V")
	public final void getPlayerPosDecodeExtended(int arg0, int arg1, ClientPlayer arg2, Packet arg3) {
		if ((arg0 & 0x1) == 1) {
			int var5 = arg3.g1();
			byte[] var6 = new byte[var5];
			Packet var7 = new Packet(var6);
			arg3.gdata(var5, var6, 0);
			playerAppearanceBuffer[arg1] = var7;
			arg2.setAppearance(var7);
		}

		if ((arg0 & 0x2) == 2) {
			int var8 = arg3.g2();
			if (var8 == 0xFFFF) {
				var8 = -1;
			}

			if (arg2.primaryAnim == var8) {
				arg2.primaryAnimLoop = 0;
			}

			int var9 = arg3.g1();
			if (arg2.primaryAnim == var8 && var8 != -1) {
				int var10 = SeqType.list[var8].duplicatebehaviour;
				if (var10 == 1) {
					arg2.primaryFrame = 0;
					arg2.primaryAnimCycle = 0;
					arg2.primaryAnimDelay = var9;
					arg2.primaryAnimLoop = 0;
				}

				if (var10 == 2) {
					arg2.primaryAnimLoop = 0;
				}
			} else if (var8 == -1 || arg2.primaryAnim == -1 || SeqType.list[var8].priority >= SeqType.list[arg2.primaryAnim].priority) {
				arg2.primaryAnim = var8;
				arg2.primaryFrame = 0;
				arg2.primaryAnimCycle = 0;
				arg2.primaryAnimDelay = var9;
				arg2.primaryAnimLoop = 0;
				arg2.preanimRouteLength = arg2.routeLength;
			}
		}

		if ((arg0 & 0x4) == 4) {
			arg2.faceEntity = arg3.g2();
			if (arg2.faceEntity == 0xFFFF) {
				arg2.faceEntity = -1;
			}
		}

		if ((arg0 & 0x8) == 8) {
			arg2.chatMessage = arg3.gstr();
			arg2.chatColour = 0;
			arg2.chatEffect = 0;
			arg2.chatTimer = 150;
			addChat(2, arg2.name, arg2.chatMessage);
		}

		if ((arg0 & 0x10) == 0x10) {
			int var11 = arg3.g1();
			int var12 = arg3.g1();
			arg2.addHitmark(loopCycle, var11, var12);
			arg2.combatCycle = loopCycle + 300;
			arg2.health = arg3.g1();
			arg2.totalHealth = arg3.g1();
		}

		if ((arg0 & 0x20) == 0x20) {
			arg2.faceSquareX = arg3.g2();
			arg2.faceSquareZ = arg3.g2();
		}

		if ((arg0 & 0x40) == 0x40) {
			int var13 = arg3.g2();
			int var14 = arg3.g1();
			int var15 = arg3.g1();
			int var16 = arg3.pos;

			if (arg2.name != null && arg2.ready) {
				long var17 = JString.toUserhash(arg2.name);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < ignoreCount; var20++) {
						if (ignoreUserhash[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}

				if (!var19 && chatDisabled == 0) {
					try {
						String var21 = WordPack.unpack(var15, arg3);
						var21 = WordFilter.filter(var21);
						arg2.chatMessage = var21;
						arg2.chatColour = var13 >> 8;
						arg2.chatEffect = var13 & 0xFF;
						arg2.chatTimer = 150;

						if (var14 == 2 || var14 == 3) {
							addChat(1, "@cr2@" + arg2.name, var21);
						} else if (var14 == 1) {
							addChat(1, "@cr1@" + arg2.name, var21);
						} else {
							addChat(2, arg2.name, var21);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg3.pos = var15 + var16;
		}

		if ((arg0 & 0x100) == 0x100) {
			arg2.spotanimId = arg3.g2();
			int var23 = arg3.g4();
			arg2.spotanimHeight = var23 >> 16;
			arg2.spotanimLastCycle = (var23 & 0xFFFF) + loopCycle;
			arg2.spotanimFrame = 0;
			arg2.spotanimCycle = 0;

			if (arg2.spotanimLastCycle > loopCycle) {
				arg2.spotanimFrame = -1;
			}

			if (arg2.spotanimId == 0xFFFF) {
				arg2.spotanimId = -1;
			}
		}

		if ((arg0 & 0x200) == 0x200) {
			arg2.exactStartX = arg3.g1();
			arg2.exactStartZ = arg3.g1();
			arg2.exactEndX = arg3.g1();
			arg2.exactEndZ = arg3.g1();
			arg2.exactMoveEnd = arg3.g2() + loopCycle;
			arg2.exactMoveStart = arg3.g2() + loopCycle;
			arg2.exactMoveFacing = arg3.g1();
			arg2.abortRoute();
		}

		if ((arg0 & 0x400) == 0x400) {
			int var24 = arg3.g1();
			int var25 = arg3.g1();
			arg2.addHitmark(loopCycle, var24, var25);
			arg2.combatCycle = loopCycle + 300;
			arg2.health = arg3.g1();
			arg2.totalHealth = arg3.g1();
		}
	}

	@ObfuscatedName("client.b(IJ)V")
	public final void addFriend(long arg0) {
		if (arg0 != 0L) {
			if (friendCount >= 100 && membersAccount != 1) {
				addChat(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (friendCount >= 200) {
				addChat(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var3 = JString.toScreenName(JString.toRawUsername(arg0));
				for (int var4 = 0; var4 < friendCount; var4++) {
					if (friendUserhash[var4] == arg0) {
						addChat(0, "", var3 + " is already on your friend list");
						return;
					}
				}

				for (int var5 = 0; var5 < ignoreCount; var5++) {
					if (ignoreUserhash[var5] == arg0) {
						addChat(0, "", "Please remove " + var3 + " from your ignore list first");
						return;
					}
				}

				if (!var3.equals(localPlayer.name)) {
					friendUsername[friendCount] = var3;
					friendUserhash[friendCount] = arg0;
					friendNodeId[friendCount] = 0;
					friendCount++;
					redrawSidebar = true;
					out.p1enc(13);
					out.p8(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void mainredraw() {
		if (errorStarted || errorLoading || errorHost) {
			drawError();
		} else {
			drawCycle++;

			if (ingame) {
				gameDraw();
			} else {
				titleScreenDraw(false);
			}

			scrollCycle = 0;
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void minimapDraw() {
		areaMap.setPixels();

		if (minimapState == 2) {
			byte[] var1 = mapback.data;
			int[] var2 = Pix2D.pixels;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			compass.scanlineRotatePlotSprite(256, 25, 33, 33, 0, compassMaskLineLengths, 25, compassMaskLineOffsets, orbitCameraYaw, 0);
			areaGame.setPixels();
		} else {
			int var5 = macroMinimapAngle + orbitCameraYaw & 0x7FF;
			int var6 = localPlayer.x / 32 + 48;
			int var7 = 464 - localPlayer.z / 32;
			minimap.scanlineRotatePlotSprite(macroMinimapZoom + 256, var6, 146, 151, 25, minimapMaskLineLengths, var7, minimapMaskLineOffsets, var5, 5);
			compass.scanlineRotatePlotSprite(256, 25, 33, 33, 0, compassMaskLineLengths, 25, compassMaskLineOffsets, orbitCameraYaw, 0);

			for (int var8 = 0; var8 < activeMapFunctionCount; var8++) {
				int var9 = activeMapFunctionX[var8] * 4 + 2 - localPlayer.x / 32;
				int var10 = activeMapFunctionZ[var8] * 4 + 2 - localPlayer.z / 32;
				minimapDrawDot(var10, var9, activeMapFunctions[var8]);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					LinkList var13 = groundObj[minusedlevel][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - localPlayer.x / 32;
						int var15 = var12 * 4 + 2 - localPlayer.z / 32;
						minimapDrawDot(var15, var14, mapdots1);
					}
				}
			}

			for (int var16 = 0; var16 < npcCount; var16++) {
				ClientNpc var17 = npc[npcIds[var16]];
				if (var17 != null && var17.isReady() && var17.type.minimap) {
					int var18 = var17.x / 32 - localPlayer.x / 32;
					int var19 = var17.z / 32 - localPlayer.z / 32;
					minimapDrawDot(var19, var18, mapdots2);
				}
			}

			for (int var20 = 0; var20 < playerCount; var20++) {
				ClientPlayer var21 = players[playerIds[var20]];
				if (var21 != null && var21.isReady()) {
					int var22 = var21.x / 32 - localPlayer.x / 32;
					int var23 = var21.z / 32 - localPlayer.z / 32;
					boolean var24 = false;
					long var25 = JString.toUserhash(var21.name);
					for (int var27 = 0; var27 < friendCount; var27++) {
						if (friendUserhash[var27] == var25 && friendNodeId[var27] != 0) {
							var24 = true;
							break;
						}
					}

					if (var24) {
						minimapDrawDot(var23, var22, mapdots4);
					} else {
						minimapDrawDot(var23, var22, mapdots3);
					}
				}
			}

			if (hintType != 0 && loopCycle % 20 < 10) {
				if (hintType == 1 && hintNpc >= 0 && hintNpc < npc.length) {
					ClientNpc var28 = npc[hintNpc];
					if (var28 != null) {
						int var29 = var28.x / 32 - localPlayer.x / 32;
						int var30 = var28.z / 32 - localPlayer.z / 32;
						minimapDrawArrow(var29, var30, mapmarker2);
					}
				}

				if (hintType == 2) {
					int var31 = (hintTileX - mapBuildBaseX) * 4 + 2 - localPlayer.x / 32;
					int var32 = (hintTileZ - mapBuildBaseZ) * 4 + 2 - localPlayer.z / 32;
					minimapDrawArrow(var31, var32, mapmarker2);
				}

				if (hintType == 10 && hintPlayer >= 0 && hintPlayer < players.length) {
					ClientPlayer var33 = players[hintPlayer];
					if (var33 != null) {
						int var34 = var33.x / 32 - localPlayer.x / 32;
						int var35 = var33.z / 32 - localPlayer.z / 32;
						minimapDrawArrow(var34, var35, mapmarker2);
					}
				}
			}

			if (minimapFlagX != 0) {
				int var36 = minimapFlagX * 4 + 2 - localPlayer.x / 32;
				int var37 = minimapFlagZ * 4 + 2 - localPlayer.z / 32;
				minimapDrawDot(var37, var36, mapmarker1);
			}

			Pix2D.fillRect(3, 0xFFFFFF, 3, 97, 78);
			areaGame.setPixels();
		}
	}

	@ObfuscatedName("client.j(Z)V")
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
	}

	@ObfuscatedName("client.c(IZ)V")
	public final void addPlayers(boolean arg0) {
		if (localPlayer.x >> 7 == minimapFlagX && localPlayer.z >> 7 == minimapFlagZ) {
			minimapFlagX = 0;
			cyclelogic6++;
			if (cyclelogic6 > 122) {
				cyclelogic6 = 0;
				out.p1enc(188);
				out.p1(62);
			}
		}

		int var2 = playerCount;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			ClientPlayer var4;
			int var5;
			if (arg0) {
				var4 = localPlayer;
				var5 = LOCAL_PLAYER_INDEX << 14;
			} else {
				var4 = players[playerIds[var3]];
				var5 = playerIds[var3] << 14;
			}

			if (var4 != null && var4.isReady()) {
				var4.lowMemory = false;
				if ((lowMem && playerCount > 50 || playerCount > 200) && !arg0 && var4.secondaryAnim == var4.readyanim) {
					var4.lowMemory = true;
				}

				int var6 = var4.x >> 7;
				int var7 = var4.z >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.locModel == null || loopCycle < var4.locStartCycle || loopCycle >= var4.locStopCycle) {
						if ((var4.x & 0x7F) == 0x40 && (var4.z & 0x7F) == 0x40) {
							if (tileLastOccupiedCycle[var6][var7] == sceneCycle) {
								continue;
							}

							tileLastOccupiedCycle[var6][var7] = sceneCycle;
						}

						var4.y = getAvH(var4.x, var4.z, minusedlevel);
						world.addDynamic(var4.y, var4, var4.x, var5, var4.z, 60, var4.yaw, minusedlevel, var4.needsForwardDrawPadding);
					} else {
						var4.lowMemory = false;
						var4.y = getAvH(var4.x, var4.z, minusedlevel);
						world.addDynamic2(var4.maxTileZ, var4.yaw, var4.maxTileX, var4.y, var4.minTileX, 60, var4.x, minusedlevel, var4, var4.z, var4.minTileZ, var5);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
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

	@ObfuscatedName("client.D(I)V")
	public final void getSpecialArea() {
		chatDisabled = 0;
		int var1 = (localPlayer.x >> 7) + mapBuildBaseX;
		int var2 = (localPlayer.z >> 7) + mapBuildBaseZ;
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

	@ObfuscatedName("client.E(I)V")
	public final void drawError() {
		Graphics var1 = getBaseComponent().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
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

	@ObfuscatedName("client.b(IZI)V")
	public final void setMidiVolume(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public static final String invNumber(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.b(IBLlb;)V")
	public final void getPlayerPos(int arg0, Packet arg1) {
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

		if (arg1.pos != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.pos + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < playerCount; var5++) {
			if (players[playerIds[var5]] == null) {
				signlink.reporterror(loginUser + " null entry in pl list - pos:" + var5 + " size:" + playerCount);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.F(I)Z")
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

			if (ptype == 207) {
				inMultizone = in.g1();
				ptype = -1;
				return true;
			}

			if (ptype == 241) {
				activeIcon = in.g1();
				redrawSidebar = true;
				redrawIcons = true;
				ptype = -1;
				return true;
			}

			if (ptype == 203) {
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

			if (ptype == 115) {
				minimapFlagX = 0;
				ptype = -1;
				return true;
			}

			if (ptype == 64) {
				int var4 = in.g1();
				int var5 = in.g1();
				int var6 = in.g1();
				int var7 = in.g1();
				camShake[var4] = true;
				camShakeAxis[var4] = var5;
				camShakeRan[var4] = var6;
				camShakeAmp[var4] = var7;
				camShakeCycle[var4] = 0;
				ptype = -1;
				return true;
			}

			if (ptype == 95 || ptype == 176 || ptype == 219 || ptype == 85 || ptype == 107 || ptype == 52 || ptype == 81 || ptype == 48 || ptype == 173 || ptype == 138) {
				zonePacket(ptype, in);
				ptype = -1;
				return true;
			}

			if (ptype == 211) {
				int var8 = in.g2();
				ifAnimReset(var8);

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

				mainModalId = var8;
				resumedPauseButton = false;
				ptype = -1;
				return true;
			}

			if (ptype == 192) {
				int var9 = in.g2();
				IfType.list[var9].model1Type = 3;
				IfType.list[var9].model1Id = (localPlayer.appearance[8] << 6) + (localPlayer.appearance[0] << 12) + (localPlayer.colour[0] << 24) + (localPlayer.colour[4] << 18) + localPlayer.appearance[11];
				ptype = -1;
				return true;
			}

			if (ptype == 210) {
				socialInputOpen = false;
				dialogInputOpen = true;
				dialogInput = "";
				redrawChatback = true;
				ptype = -1;
				return true;
			}

			if (ptype == 130) {
				int var10 = in.g2b();
				tutComId = var10;
				redrawChatback = true;
				ptype = -1;
				return true;
			}

			if (ptype == 167) {
				getPlayerPos(psize, in);
				awaitingPlayerInfo = false;
				ptype = -1;
				return true;
			}

			if (ptype == 34) {
				int var11 = in.g2();
				int var12 = in.g1();
				int var13 = in.g2();
				if (waveEnabled && !lowMem && waveCount < 50) {
					waveIds[waveCount] = var11;
					waveLoops[waveCount] = var12;
					waveDelay[waveCount] = JagFX.delays[var11] + var13;
					waveCount++;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 91) {
				lastAddress = in.g4();
				daysSinceLastLogin = in.g2();
				daysSinceRecoveriesChanged = in.g1();
				unreadMessages = in.g2();
				warnMembersInNonMembers = in.g1();
				if (lastAddress != 0 && mainModalId == -1) {
					signlink.dnslookup(JString.formatIPv4(lastAddress));
					closeModal();
					short var14 = 650;
					if (daysSinceRecoveriesChanged != 201 || warnMembersInNonMembers == 1) {
						var14 = 655;
					}

					reportAbuseInput = "";
					reportAbuseMuteOption = false;

					for (int var15 = 0; var15 < IfType.list.length; var15++) {
						if (IfType.list[var15] != null && IfType.list[var15].clientCode == var14) {
							mainModalId = IfType.list[var15].layerId;
							break;
						}
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 88) {
				logout();
				ptype = -1;
				return false;
			}

			if (ptype == 134) {
				int var16 = in.g2();
				int var17 = in.g2b();
				IfType var18 = IfType.list[var16];
				var18.modelAnim = var17;

				if (var17 == -1) {
					var18.animFrame = 0;
					var18.animCycle = 0;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 156) {
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

			if (ptype == 67) {
				if (activeIcon == 12) {
					redrawSidebar = true;
				}

				runweight = in.g2b();
				ptype = -1;
				return true;
			}

			if (ptype == 3) {
				ignoreCount = psize / 8;
				for (int var19 = 0; var19 < ignoreCount; var19++) {
					ignoreUserhash[var19] = in.g8();
				}

				ptype = -1;
				return true;
			}

			if (ptype == 142) {
				int var20 = in.g2();
				int var21 = in.g2();
				IfType.list[var20].model1Type = 2;
				IfType.list[var20].model1Id = var21;
				ptype = -1;
				return true;
			}

			if (ptype == 215) {
				int var22 = in.g2();
				int var23 = in.g1();

				if (var22 == 0xFFFF) {
					var22 = -1;
				}

				sideIcon[var23] = var22;
				redrawSidebar = true;
				redrawIcons = true;
				ptype = -1;
				return true;
			}

			if (ptype == 153) {
				zoneUpdateX = in.g1();
				zoneUpdateZ = in.g1();
				for (int var24 = zoneUpdateX; var24 < zoneUpdateX + 8; var24++) {
					for (int var25 = zoneUpdateZ; var25 < zoneUpdateZ + 8; var25++) {
						if (groundObj[minusedlevel][var24][var25] != null) {
							groundObj[minusedlevel][var24][var25] = null;
							showObject(var24, var25);
						}
					}
				}

				for (LocChange var26 = (LocChange) locChanges.head(); var26 != null; var26 = (LocChange) locChanges.next()) {
					if (var26.x >= zoneUpdateX && var26.x < zoneUpdateX + 8 && var26.z >= zoneUpdateZ && var26.z < zoneUpdateZ + 8 && minusedlevel == var26.level) {
						var26.endTime = 0;
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 114) {
				chatPublicMode = in.g1();
				chatPrivateMode = in.g1();
				chatTradeMode = in.g1();
				redrawChatMode = true;
				redrawChatback = true;
				ptype = -1;
				return true;
			}

			if (ptype == 158) {
				int var27 = in.g2();
				int var28 = in.g2();

				if (chatComId != -1) {
					chatComId = -1;
					redrawChatback = true;
				}

				if (dialogInputOpen) {
					dialogInputOpen = false;
					redrawChatback = true;
				}

				mainModalId = var27;
				sideModalId = var28;
				redrawSidebar = true;
				redrawIcons = true;
				resumedPauseButton = false;
				ptype = -1;
				return true;
			}

			if (ptype == 240) {
				int var29 = in.g2b();
				if (var29 >= 0) {
					ifAnimReset(var29);
				}

				mainOverlayId = var29;
				ptype = -1;
				return true;
			}

			if (ptype == 195) {
				zoneUpdateX = in.g1();
				zoneUpdateZ = in.g1();

				while (in.pos < psize) {
					int var30 = in.g1();
					zonePacket(var30, in);
				}

				ptype = -1;
				return true;
			}

			if (ptype == 161) {
				String var31 = in.gstr();
				if (var31.endsWith(":tradereq:")) {
					String var32 = var31.substring(0, var31.indexOf(":"));
					long var33 = JString.toUserhash(var32);
					boolean var35 = false;
					for (int var36 = 0; var36 < ignoreCount; var36++) {
						if (ignoreUserhash[var36] == var33) {
							var35 = true;
							break;
						}
					}

					if (!var35 && chatDisabled == 0) {
						addChat(4, var32, "wishes to trade with you.");
					}
				} else if (var31.endsWith(":duelreq:")) {
					String var37 = var31.substring(0, var31.indexOf(":"));
					long var38 = JString.toUserhash(var37);
					boolean var40 = false;
					for (int var41 = 0; var41 < ignoreCount; var41++) {
						if (ignoreUserhash[var41] == var38) {
							var40 = true;
							break;
						}
					}

					if (!var40 && chatDisabled == 0) {
						addChat(8, var37, "wishes to duel with you.");
					}
				} else {
					addChat(0, "", var31);
				}

				ptype = -1;
				return true;
			}

			if (ptype == 101) {
				cinemaCam = false;

				for (int var42 = 0; var42 < 5; var42++) {
					camShake[var42] = false;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 16) {
				int var43 = in.g2();
				ifAnimReset(var43);

				if (chatComId != -1) {
					chatComId = -1;
					redrawChatback = true;
				}

				if (dialogInputOpen) {
					dialogInputOpen = false;
					redrawChatback = true;
				}

				sideModalId = var43;
				redrawSidebar = true;
				redrawIcons = true;
				mainModalId = -1;
				resumedPauseButton = false;
				ptype = -1;
				return true;
			}

			if (ptype == 44) {
				int var44 = in.g2();
				String var45 = in.gstr();
				IfType.list[var44].text = var45;

				if (sideIcon[activeIcon] == IfType.list[var44].layerId) {
					redrawSidebar = true;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 245) {
				int var46 = in.g2();
				int var47 = in.g4();
				varServ[var46] = var47;

				if (var[var46] != var47) {
					var[var46] = var47;
					clientVar(var46);
					redrawSidebar = true;

					if (tutComId != -1) {
						redrawChatback = true;
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 166) {
				int var48 = in.g2();
				ifAnimReset(var48);

				if (sideModalId != -1) {
					sideModalId = -1;
					redrawSidebar = true;
					redrawIcons = true;
				}

				chatComId = var48;
				redrawChatback = true;
				mainModalId = -1;
				resumedPauseButton = false;
				ptype = -1;
				return true;
			}

			if (ptype == 28) {
				int var49 = in.g2();
				int var50 = in.g2();
				int var51 = in.g2();
				ObjType var52 = ObjType.list(var50);
				IfType.list[var49].model1Type = 4;
				IfType.list[var49].model1Id = var50;
				IfType.list[var49].modelXAn = var52.xan2d;
				IfType.list[var49].modelYAn = var52.yan2d;
				IfType.list[var49].modelZoom = var52.zoom2d * 100 / var51;
				ptype = -1;
				return true;
			}

			if (ptype == 54) {
				int var53 = in.g2();
				int var54 = in.g2();
				IfType var55 = IfType.list[var53];
				if (var55 != null && var55.type == 0) {
					if (var54 < 0) {
						var54 = 0;
					}

					if (var54 > var55.scrollHeight - var55.height) {
						var54 = var55.scrollHeight - var55.height;
					}

					var55.scrollPos = var54;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 47) {
				for (int var56 = 0; var56 < players.length; var56++) {
					if (players[var56] != null) {
						players[var56].primaryAnim = -1;
					}
				}

				for (int var57 = 0; var57 < npc.length; var57++) {
					if (npc[var57] != null) {
						npc[var57].primaryAnim = -1;
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 194) {
				minimapState = in.g1();
				ptype = -1;
				return true;
			}

			if (ptype == 90) {
				tutFlashIcon = in.g1();
				if (tutFlashIcon == activeIcon) {
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

			if (ptype == 89) {
				rebootTimer = in.g2() * 30;
				ptype = -1;
				return true;
			}

			if (ptype == 190) {
				for (int var58 = 0; var58 < var.length; var58++) {
					if (varServ[var58] != var[var58]) {
						var[var58] = varServ[var58];
						clientVar(var58);
						redrawSidebar = true;
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 83) {
				if (activeIcon == 12) {
					redrawSidebar = true;
				}

				runenergy = in.g1();
				ptype = -1;
				return true;
			}

			if (ptype == 231) {
				int var59 = in.g2();
				int var60 = in.g2();
				if (mapBuildCentreZoneX == var59 && mapBuildCentreZoneZ == var60 && sceneState == 2) {
					ptype = -1;
					return true;
				}

				mapBuildCentreZoneX = var59;
				mapBuildCentreZoneZ = var60;
				mapBuildBaseX = (mapBuildCentreZoneX - 6) * 8;
				mapBuildBaseZ = (mapBuildCentreZoneZ - 6) * 8;
				withinTutorialIsland = false;
				if ((mapBuildCentreZoneX / 8 == 48 || mapBuildCentreZoneX / 8 == 49) && mapBuildCentreZoneZ / 8 == 48) {
					withinTutorialIsland = true;
				}

				if (mapBuildCentreZoneX / 8 == 48 && mapBuildCentreZoneZ / 8 == 148) {
					withinTutorialIsland = true;
				}

				sceneState = 1;
				sceneLoadStartTime = System.currentTimeMillis();
				areaGame.setPixels();
				p12.centreString(257, 151, 0, "Loading - please wait.");
				p12.centreString(256, 150, 0xFFFFFF, "Loading - please wait.");
				areaGame.draw(4, graphics, 4);
				int var61 = 0;
				for (int var62 = (mapBuildCentreZoneX - 6) / 8; var62 <= (mapBuildCentreZoneX + 6) / 8; var62++) {
					for (int var63 = (mapBuildCentreZoneZ - 6) / 8; var63 <= (mapBuildCentreZoneZ + 6) / 8; var63++) {
						var61++;
					}
				}

				mapBuildGroundData = new byte[var61][];
				mapBuildLocationData = new byte[var61][];
				mapBuildIndex = new int[var61];
				mapBuildGroundFile = new int[var61];
				mapBuildLocationFile = new int[var61];
				int var64 = 0;
				for (int var65 = (mapBuildCentreZoneX - 6) / 8; var65 <= (mapBuildCentreZoneX + 6) / 8; var65++) {
					for (int var66 = (mapBuildCentreZoneZ - 6) / 8; var66 <= (mapBuildCentreZoneZ + 6) / 8; var66++) {
						mapBuildIndex[var64] = (var65 << 8) + var66;

						if (withinTutorialIsland && (var66 == 49 || var66 == 149 || var66 == 147 || var65 == 50 || var65 == 49 && var66 == 47)) {
							mapBuildGroundFile[var64] = -1;
							mapBuildLocationFile[var64] = -1;
							var64++;
						} else {
							int var67 = mapBuildGroundFile[var64] = onDemand.getMapFile(0, var65, var66);
							if (var67 != -1) {
								onDemand.request(3, var67);
							}

							int var68 = mapBuildLocationFile[var64] = onDemand.getMapFile(1, var65, var66);
							if (var68 != -1) {
								onDemand.request(3, var68);
							}

							var64++;
						}
					}
				}

				int var69 = mapBuildBaseX - mapBuildPrevBaseX;
				int var70 = mapBuildBaseZ - mapBuildPrevBaseZ;
				mapBuildPrevBaseX = mapBuildBaseX;
				mapBuildPrevBaseZ = mapBuildBaseZ;

				for (int var71 = 0; var71 < 16384; var71++) {
					ClientNpc var72 = npc[var71];
					if (var72 != null) {
						for (int var73 = 0; var73 < 10; var73++) {
							var72.routeX[var73] -= var69;
							var72.routeZ[var73] -= var70;
						}

						var72.x -= var69 * 128;
						var72.z -= var70 * 128;
					}
				}

				for (int var74 = 0; var74 < MAX_PLAYER_COUNT; var74++) {
					ClientPlayer var75 = players[var74];
					if (var75 != null) {
						for (int var76 = 0; var76 < 10; var76++) {
							var75.routeX[var76] -= var69;
							var75.routeZ[var76] -= var70;
						}

						var75.x -= var69 * 128;
						var75.z -= var70 * 128;
					}
				}

				awaitingPlayerInfo = true;
				byte var77 = 0;
				byte var78 = 104;
				byte var79 = 1;
				if (var69 < 0) {
					var77 = 103;
					var78 = -1;
					var79 = -1;
				}

				byte var80 = 0;
				byte var81 = 104;
				byte var82 = 1;
				if (var70 < 0) {
					var80 = 103;
					var81 = -1;
					var82 = -1;
				}

				for (int var83 = var77; var83 != var78; var83 += var79) {
					for (int var84 = var80; var84 != var81; var84 += var82) {
						int var85 = var69 + var83;
						int var86 = var70 + var84;
						for (int var87 = 0; var87 < 4; var87++) {
							if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
								groundObj[var87][var83][var84] = groundObj[var87][var85][var86];
							} else {
								groundObj[var87][var83][var84] = null;
							}
						}
					}
				}

				for (LocChange var88 = (LocChange) locChanges.head(); var88 != null; var88 = (LocChange) locChanges.next()) {
					var88.x -= var69;
					var88.z -= var70;
					if (var88.x < 0 || var88.z < 0 || var88.x >= 104 || var88.z >= 104) {
						var88.unlink();
					}
				}

				if (minimapFlagX != 0) {
					minimapFlagX -= var69;
					minimapFlagZ -= var70;
				}

				cinemaCam = false;
				ptype = -1;
				return true;
			}

			if (ptype == 171) {
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

			if (ptype == 247) {
				long var89 = in.g8();
				int var91 = in.g1();
				String var92 = JString.toScreenName(JString.toRawUsername(var89));
				for (int var93 = 0; var93 < friendCount; var93++) {
					if (friendUserhash[var93] == var89) {
						if (friendNodeId[var93] != var91) {
							friendNodeId[var93] = var91;
							redrawSidebar = true;

							if (var91 > 0) {
								addChat(5, "", var92 + " has logged in.");
							}

							if (var91 == 0) {
								addChat(5, "", var92 + " has logged out.");
							}
						}

						var92 = null;
						break;
					}
				}

				if (var92 != null && friendCount < 200) {
					friendUserhash[friendCount] = var89;
					friendUsername[friendCount] = var92;
					friendNodeId[friendCount] = var91;
					friendCount++;
					redrawSidebar = true;
				}

				boolean var94 = false;
				while (!var94) {
					var94 = true;
					for (int var95 = 0; var95 < friendCount - 1; var95++) {
						if (friendNodeId[var95] != nodeId && friendNodeId[var95 + 1] == nodeId || friendNodeId[var95] == 0 && friendNodeId[var95 + 1] != 0) {
							int var96 = friendNodeId[var95];
							friendNodeId[var95] = friendNodeId[var95 + 1];
							friendNodeId[var95 + 1] = var96;
							String var97 = friendUsername[var95];
							friendUsername[var95] = friendUsername[var95 + 1];
							friendUsername[var95 + 1] = var97;
							long var98 = friendUserhash[var95];
							friendUserhash[var95] = friendUserhash[var95 + 1];
							friendUserhash[var95 + 1] = var98;
							redrawSidebar = true;
							var94 = false;
						}
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 10) {
				int var100 = in.g2();
				boolean var101 = in.g1() == 1;
				IfType.list[var100].hide = var101;
				ptype = -1;
				return true;
			}

			if (ptype == 105) {
				redrawSidebar = true;
				int var102 = in.g1();
				int var103 = in.g4();
				int var104 = in.g1();
				statXP[var102] = var103;
				statEffectiveLevel[var102] = var104;
				statBaseLevel[var102] = 1;
				for (int var105 = 0; var105 < 98; var105++) {
					if (var103 >= skillxp[var105]) {
						statBaseLevel[var102] = var105 + 2;
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 23) {
				int var106 = in.g2();
				if (var106 == 0xFFFF) {
					var106 = -1;
				}

				if (nextMidiSong != var106 && midiActive && !lowMem && nextMidiDelay == 0) {
					midiSong = var106;
					midiFading = true;
					onDemand.request(2, midiSong);
				}

				nextMidiSong = var106;
				ptype = -1;
				return true;
			}

			if (ptype == 15) {
				int var107 = in.g2();
				int var108 = in.g2();
				if (midiActive && !lowMem) {
					midiSong = var107;
					midiFading = false;
					onDemand.request(2, midiSong);
					nextMidiDelay = var108;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 200) {
				cinemaCam = true;
				camMoveToLx = in.g1();
				camMoveToLz = in.g1();
				camMoveToHei = in.g2();
				camMoveToRate = in.g1();
				camMoveToRate2 = in.g1();
				if (camMoveToRate2 >= 100) {
					camX = camMoveToLx * 128 + 64;
					camZ = camMoveToLz * 128 + 64;
					camY = getAvH(camX, camZ, minusedlevel) - camMoveToHei;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 172) {
				redrawSidebar = true;
				int var109 = in.g2();
				IfType var110 = IfType.list[var109];
				while (in.pos < psize) {
					int var111 = in.g1();
					int var112 = in.g2();
					int var113 = in.g1();
					if (var113 == 255) {
						var113 = in.g4();
					}

					if (var111 >= 0 && var111 < var110.linkObjType.length) {
						var110.linkObjType[var111] = var112;
						var110.linkObjNumber[var111] = var113;
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 17) {
				int var114 = in.g1();
				int var115 = in.g1();
				String var116 = in.gstr();
				if (var114 >= 1 && var114 <= 5) {
					if (var116.equalsIgnoreCase("null")) {
						var116 = null;
					}

					playerOp[var114 - 1] = var116;
					playerOpPriority[var114 - 1] = var115 == 0;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 32) {
				zoneUpdateX = in.g1();
				zoneUpdateZ = in.g1();
				ptype = -1;
				return true;
			}

			if (ptype == 106) {
				redrawSidebar = true;
				int var117 = in.g2();
				IfType var118 = IfType.list[var117];
				int var119 = in.g1();
				for (int var120 = 0; var120 < var119; var120++) {
					var118.linkObjType[var120] = in.g2();
					int var121 = in.g1();
					if (var121 == 255) {
						var121 = in.g4();
					}

					var118.linkObjNumber[var120] = var121;
				}

				for (int var122 = var119; var122 < var118.linkObjType.length; var122++) {
					var118.linkObjType[var122] = 0;
					var118.linkObjNumber[var122] = 0;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 133) {
				selfSlot = in.g2();
				membersAccount = in.g1();
				ptype = -1;
				return true;
			}

			if (ptype == 129) {
				int var123 = in.g2();
				int var124 = in.g2();
				IfType.list[var123].model1Type = 1;
				IfType.list[var123].model1Id = var124;
				ptype = -1;
				return true;
			}

			if (ptype == 233) {
				cinemaCam = true;
				camLookAtLx = in.g1();
				camLookAtLz = in.g1();
				camLookAtHei = in.g2();
				camLookAtRate = in.g1();
				camLookAtRate2 = in.g1();
				if (camLookAtRate2 >= 100) {
					int var125 = camLookAtLx * 128 + 64;
					int var126 = camLookAtLz * 128 + 64;
					int var127 = getAvH(var125, var126, minusedlevel) - camLookAtHei;
					int var128 = var125 - camX;
					int var129 = var127 - camY;
					int var130 = var126 - camZ;
					int var131 = (int) Math.sqrt(var128 * var128 + var130 * var130);
					camPitch = (int) (Math.atan2(var129, var131) * 325.949D) & 0x7FF;
					camYaw = (int) (Math.atan2(var128, var130) * -325.949D) & 0x7FF;

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

			if (ptype == 227) {
				int var132 = in.g2();
				IfType var133 = IfType.list[var132];
				for (int var134 = 0; var134 < var133.linkObjType.length; var134++) {
					var133.linkObjType[var134] = -1;
					var133.linkObjType[var134] = 0;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 77) {
				int var135 = in.g2();
				int var136 = in.g2b();
				int var137 = in.g2b();
				IfType var138 = IfType.list[var135];
				var138.x = var136;
				var138.y = var137;
				ptype = -1;
				return true;
			}

			if (ptype == 185) {
				friendServerStatus = in.g1();
				redrawSidebar = true;
				ptype = -1;
				return true;
			}

			if (ptype == 197) {
				getNpcPos(psize, in);
				ptype = -1;
				return true;
			}

			if (ptype == 183) {
				int var139 = in.g2();
				int var140 = in.g2();
				int var141 = var140 >> 10 & 0x1F;
				int var142 = var140 >> 5 & 0x1F;
				int var143 = var140 & 0x1F;
				IfType.list[var139].colour = (var143 << 3) + (var141 << 19) + (var142 << 11);
				ptype = -1;
				return true;
			}

			if (ptype == 235) {
				long var144 = in.g8();
				int var146 = in.g4();
				int var147 = in.g1();
				boolean var148 = false;
				for (int var149 = 0; var149 < 100; var149++) {
					if (privateMessageIds[var149] == var146) {
						var148 = true;
						break;
					}
				}

				if (var147 <= 1) {
					for (int var150 = 0; var150 < ignoreCount; var150++) {
						if (ignoreUserhash[var150] == var144) {
							var148 = true;
							break;
						}
					}
				}

				if (!var148 && chatDisabled == 0) {
					try {
						privateMessageIds[privateMessageCount] = var146;
						privateMessageCount = (privateMessageCount + 1) % 100;
						String var151 = WordPack.unpack(psize - 13, in);
						var151 = WordFilter.filter(var151);
						if (var147 == 2 || var147 == 3) {
							addChat(7, "@cr2@" + JString.toScreenName(JString.toRawUsername(var144)), var151);
						} else if (var147 == 1) {
							addChat(7, "@cr1@" + JString.toScreenName(JString.toRawUsername(var144)), var151);
						} else {
							addChat(3, JString.toScreenName(JString.toRawUsername(var144)), var151);
						}
					} catch (Exception var156) {
						signlink.reporterror("cde1");
					}
				}

				ptype = -1;
				return true;
			}

			signlink.reporterror("T1 - " + ptype + "," + psize + " - " + ptype1 + "," + ptype2);
			logout();
		} catch (IOException var157) {
			lostCon();
		} catch (Exception var158) {
			String var154 = "T2 - " + ptype + "," + ptype1 + "," + ptype2 + " - " + psize + "," + (localPlayer.routeX[0] + mapBuildBaseX) + "," + (localPlayer.routeZ[0] + mapBuildBaseZ) + " - ";
			for (int var155 = 0; var155 < psize && var155 < 50; var155++) {
				var154 = var154 + in.data[var155] + ",";
			}

			signlink.reporterror(var154);
			logout();
		}

		return true;
	}

	@ObfuscatedName("client.a(Ld;I)Z")
	public final boolean clientButton(IfType arg0) {
		int var2 = arg0.clientCode;
		if (friendServerStatus == 2) {
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
			out.p1enc(125);
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
				out.p1enc(137);
				out.p8(JString.toUserhash(reportAbuseInput));
				out.p1(var2 - 601);
				out.p1(reportAbuseMuteOption ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.G(I)V")
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

	@ObfuscatedName("client.H(I)V")
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
				if (var1 >= playerCount) {
					NpcType var6 = ((ClientNpc) var2).type;
					if (var6.headicon >= 0 && var6.headicon < headicons.length) {
						getOverlayPos(var2, var2.height + 15);

						if (projectX > -1) {
							headicons[var6.headicon].plotSprite(projectX - 12, projectY - 30);
						}
					}

					if (hintType == 1 && npcIds[var1 - playerCount] == hintNpc && loopCycle % 20 < 10) {
						getOverlayPos(var2, var2.height + 15);

						if (projectX > -1) {
							headicons[2].plotSprite(projectX - 12, projectY - 28);
						}
					}
				} else {
					int var3 = 30;
					ClientPlayer var4 = (ClientPlayer) var2;
					if (var4.headicons != 0) {
						getOverlayPos(var2, var2.height + 15);

						if (projectX > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.headicons & 1 << var5) != 0) {
									headicons[var5].plotSprite(projectX - 12, projectY - var3);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && hintType == 10 && playerIds[var1] == hintPlayer) {
						getOverlayPos(var2, var2.height + 15);

						if (projectX > -1) {
							headicons[7].plotSprite(projectX - 12, projectY - var3);
						}
					}
				}

				if (var2.chatMessage != null && (var1 >= playerCount || chatPublicMode == 0 || chatPublicMode == 3 || chatPublicMode == 1 && isFriend(((ClientPlayer) var2).name))) {
					getOverlayPos(var2, var2.height);

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

				if (var2.combatCycle > loopCycle) {
					getOverlayPos(var2, var2.height + 15);

					if (projectX > -1) {
						int var7 = var2.health * 30 / var2.totalHealth;
						if (var7 > 30) {
							var7 = 30;
						}

						Pix2D.fillRect(5, 0xFF00, var7, projectX - 15, projectY - 3);
						Pix2D.fillRect(5, 0xFF0000, 30 - var7, projectX - 15 + var7, projectY - 3);
					}
				}

				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.damageCycles[var8] > loopCycle) {
						getOverlayPos(var2, var2.height / 2);

						if (projectX > -1) {
							if (var8 == 1) {
								projectY -= 20;
							}

							if (var8 == 2) {
								projectX -= 15;
								projectY -= 10;
							}

							if (var8 == 3) {
								projectX += 15;
								projectY -= 10;
							}

							hitmarks[var2.damageTypes[var8]].plotSprite(projectX - 12, projectY - 12);
							p11.centreString(projectX, projectY + 4, 0, String.valueOf(var2.damageValues[var8]));
							p11.centreString(projectX - 1, projectY + 3, 0xFFFFFF, String.valueOf(var2.damageValues[var8]));
						}
					}
				}
			}
		}

		for (int var9 = 0; var9 < chatCount; var9++) {
			int var10 = chatX[var9];
			int var11 = chatY[var9];
			int var12 = chatWidth[var9];
			int var13 = chatHeight[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > chatY[var15] - chatHeight[var15] && var11 - var13 < chatY[var15] + 2 && var10 - var12 < chatWidth[var15] + chatX[var15] && var10 + var12 > chatX[var15] - chatWidth[var15] && chatY[var15] - chatHeight[var15] < var11) {
						var11 = chatY[var15] - chatHeight[var15];
						var14 = true;
					}
				}
			}

			projectX = chatX[var9];
			projectY = chatY[var9] = var11;
			String var16 = chats[var9];
			if (chatEffects == 0) {
				int var17 = 0xFFFF00;
				if (chatColour[var9] < 6) {
					var17 = CHAT_COLOURS[chatColour[var9]];
				}

				if (chatColour[var9] == 6) {
					var17 = sceneCycle % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (chatColour[var9] == 7) {
					var17 = sceneCycle % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (chatColour[var9] == 8) {
					var17 = sceneCycle % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (chatColour[var9] == 9) {
					int var18 = 150 - chatTimer[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 0xFF0000;
					} else if (var18 < 100) {
						var17 = 0xFFFF00 - (var18 - 50) * 0x50000;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 0xFF00;
					}
				}

				if (chatColour[var9] == 10) {
					int var19 = 150 - chatTimer[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 0xFF0000;
					} else if (var19 < 100) {
						var17 = 0xFF00FF - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 0x50000 + 255 - (var19 - 100) * 5;
					}
				}

				if (chatColour[var9] == 11) {
					int var20 = 150 - chatTimer[var9];
					if (var20 < 50) {
						var17 = 0xFFFFFF - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 0xFF00;
					} else if (var20 < 150) {
						var17 = 0xFFFFFF - (var20 - 100) * 0x50000;
					}
				}

				if (chatEffect[var9] == 0) {
					b12.centreString(projectX, projectY + 1, 0, var16);
					b12.centreString(projectX, projectY, var17, var16);
				}

				if (chatEffect[var9] == 1) {
					b12.centreStringWave(var16, projectY + 1, projectX, 0, sceneCycle);
					b12.centreStringWave(var16, projectY, projectX, var17, sceneCycle);
				}

				if (chatEffect[var9] == 2) {
					int var21 = b12.stringWidTag(var16);
					int var22 = (150 - chatTimer[var9]) * (var21 + 100) / 150;
					Pix2D.setClipping(334, projectX + 50, projectX - 50, 0);
					b12.drawString(projectX + 50 - var22, var16, 0, projectY + 1);
					b12.drawString(projectX + 50 - var22, var16, var17, projectY);
					Pix2D.resetClipping();
				}
			} else {
				b12.centreString(projectX, projectY + 1, 0, var16);
				b12.centreString(projectX, projectY, 0xFFFF00, var16);
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void cinemaCamera() {
		int var1 = camMoveToLx * 128 + 64;
		int var2 = camMoveToLz * 128 + 64;
		int var3 = getAvH(var1, var2, minusedlevel) - camMoveToHei;

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
		int var6 = getAvH(var4, var5, minusedlevel) - camLookAtHei;
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

	@ObfuscatedName("client.J(I)V")
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

	@ObfuscatedName("client.k(Z)V")
	public void lag() {
		System.out.println("============");
		System.out.println("flame-cycle:" + flameCycle);

		if (onDemand != null) {
			System.out.println("Od-cycle:" + onDemand.cycle);
		}

		System.out.println("loop-cycle:" + loopCycle);
		System.out.println("draw-cycle:" + drawCycle);
		System.out.println("ptype:" + ptype);
		System.out.println("psize:" + psize);

		if (stream != null) {
			stream.debug();
		}

		debug = true;
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

	@ObfuscatedName("client.a(Llb;IB)V")
	public final void getPlayerPosLocal(Packet arg0, int arg1) {
		arg0.gbitstart();
		int var3 = arg0.gbit(1);
		if (var3 != 0) {
			int var4 = arg0.gbit(2);
			if (var4 == 0) {
				entityUpdateIds[entityUpdateCount++] = LOCAL_PLAYER_INDEX;
			} else if (var4 == 1) {
				int var5 = arg0.gbit(3);
				localPlayer.moveCode(var5, false);
				int var6 = arg0.gbit(1);
				if (var6 == 1) {
					entityUpdateIds[entityUpdateCount++] = LOCAL_PLAYER_INDEX;
				}
			} else if (var4 == 2) {
				int var7 = arg0.gbit(3);
				localPlayer.moveCode(var7, true);
				int var8 = arg0.gbit(3);
				localPlayer.moveCode(var8, true);
				int var9 = arg0.gbit(1);
				if (var9 == 1) {
					entityUpdateIds[entityUpdateCount++] = LOCAL_PLAYER_INDEX;
				}
			} else if (var4 == 3) {
				minusedlevel = arg0.gbit(2);
				int var10 = arg0.gbit(7);
				int var11 = arg0.gbit(7);
				int var12 = arg0.gbit(1);
				localPlayer.teleport(var10, var12 == 1, var11);
				int var13 = arg0.gbit(1);
				if (var13 == 1) {
					entityUpdateIds[entityUpdateCount++] = LOCAL_PLAYER_INDEX;
				}
			}
		}
	}

	@ObfuscatedName("client.K(I)I")
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

	@ObfuscatedName("client.L(I)I")
	public final int roofCheck2() {
		int var1 = getAvH(camX, camZ, minusedlevel);
		if (var1 - camY < 800 && (mapl[minusedlevel][camX >> 7][camZ >> 7] & 0x4) != 0) {
			return minusedlevel;
		}

		return 3;
	}

	@ObfuscatedName("client.M(I)V")
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
			synchronized (mouseTracking.lock) {
				if (!mouseTracked) {
					mouseTracking.length = 0;
				} else if (mouseClickButton != 0 || mouseTracking.length >= 40) {
					out.p1enc(222);
					out.p1(0);
					int var3 = out.pos;
					int var4 = 0;
					for (int var5 = 0; var5 < mouseTracking.length && var3 - out.pos < 240; var5++) {
						var4++;
						int var6 = mouseTracking.y[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = mouseTracking.x[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						int var8 = var6 * 765 + var7;
						if (mouseTracking.y[var5] == -1 && mouseTracking.x[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 0x7FFFF;
						}

						if (mouseTrackedX != var7 || mouseTrackedY != var6) {
							int var9 = var7 - mouseTrackedX;
							mouseTrackedX = var7;
							int var10 = var6 - mouseTrackedY;
							mouseTrackedY = var6;

							if (mouseTrackedDelta < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								out.p2((mouseTrackedDelta << 12) + (var9 << 6) + var10);
								mouseTrackedDelta = 0;
							} else if (mouseTrackedDelta < 8) {
								out.p3((mouseTrackedDelta << 19) + var8 + 0x800000);
								mouseTrackedDelta = 0;
							} else {
								out.p4((mouseTrackedDelta << 19) + var8 - 0x40000000);
								mouseTrackedDelta = 0;
							}
						} else if (mouseTrackedDelta < 2047) {
							mouseTrackedDelta++;
						}
					}

					out.psize1(out.pos - var3);

					if (var4 >= mouseTracking.length) {
						mouseTracking.length = 0;
					} else {
						mouseTracking.length -= var4;
						for (int var11 = 0; var11 < mouseTracking.length; var11++) {
							mouseTracking.x[var11] = mouseTracking.x[var4 + var11];
							mouseTracking.y[var11] = mouseTracking.y[var4 + var11];
						}
					}
				}
			}

			if (mouseClickButton != 0) {
				long var12 = (mouseClickTime - prevMouseClickTime) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				prevMouseClickTime = mouseClickTime;
				int var14 = mouseClickY;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 502) {
					var14 = 502;
				}

				int var15 = mouseClickX;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 764) {
					var15 = 764;
				}

				int var16 = var14 * 765 + var15;
				byte var17 = 0;
				if (mouseClickButton == 2) {
					var17 = 1;
				}

				int var18 = (int) var12;
				out.p1enc(20);
				out.p4((var17 << 19) + (var18 << 20) + var16);
			}

			if (sendCameraDelay > 0) {
				sendCameraDelay--;
			}

			if (keyHeld[1] == 1 || keyHeld[2] == 1 || keyHeld[3] == 1 || keyHeld[4] == 1) {
				sendCamera = true;
			}

			if (sendCamera && sendCameraDelay <= 0) {
				sendCameraDelay = 20;
				sendCamera = false;
				out.p1enc(53);
				out.p2(orbitCameraPitch);
				out.p2(orbitCameraYaw);
			}

			if (focus && !focusIn) {
				focusIn = true;
				out.p1enc(73);
				out.p1(1);
			}

			if (!focus && focusIn) {
				focusIn = false;
				out.p1enc(73);
				out.p1(0);
			}

			checkMinimap();
			locChangeDoQueue();
			soundsDoQueue();
			timeoutTimer++;
			if (timeoutTimer > 750) {
				lostCon();
			}

			movePlayers();
			moveNpcs();
			timeoutChat();
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
							IfType var19 = IfType.list[objDragComId];
							byte var20 = 0;
							if (bankArrangeMode == 1 && var19.clientCode == 206) {
								var20 = 1;
							}

							if (var19.linkObjType[hoveredSlot] <= 0) {
								var20 = 0;
							}

							if (var19.objReplace) {
								int var21 = objDragSlot;
								int var22 = hoveredSlot;
								var19.linkObjType[var22] = var19.linkObjType[var21];
								var19.linkObjNumber[var22] = var19.linkObjNumber[var21];
								var19.linkObjType[var21] = -1;
								var19.linkObjNumber[var21] = 0;
							} else if (var20 == 1) {
								int var23 = objDragSlot;
								int var24 = hoveredSlot;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.swapSlots(var23, var23 - 1);
										var23--;
									} else if (var23 < var24) {
										var19.swapSlots(var23, var23 + 1);
										var23++;
									}
								}
							} else {
								var19.swapSlots(objDragSlot, hoveredSlot);
							}

							out.p1enc(93);
							out.p2(objDragComId);
							out.p2(objDragSlot);
							out.p2(hoveredSlot);
							out.p1(var20);
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

			cyclelogic7++;
			if (cyclelogic7 > 62) {
				cyclelogic7 = 0;
				out.p1enc(89);
			}

			if (World.groundX != -1) {
				int var25 = World.groundX;
				int var26 = World.groundZ;
				boolean var27 = tryMove(localPlayer.routeZ[0], var25, 0, 0, 0, localPlayer.routeX[0], 0, true, 0, var26, 0);
				World.groundX = -1;

				if (var27) {
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

			for (int var28 = 0; var28 < 5; var28++) {
				camShakeCycle[var28]++;
			}

			handleInputKey();
			idleTimer++;
			if (idleTimer > 4500) {
				logoutTimer = 250;
				idleTimer -= 500;
				out.p1enc(209);
			}

			macroCameraCycle++;
			if (macroCameraCycle > 500) {
				macroCameraCycle = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					macroCameraX += macroCameraXModifier;
				}

				if ((var29 & 0x2) == 2) {
					macroCameraZ += macroCameraZModifier;
				}

				if ((var29 & 0x4) == 4) {
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
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					macroMinimapAngle += macroMinimapAngleModifier;
				}

				if ((var30 & 0x2) == 2) {
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

			noTimeoutTimer++;
			if (noTimeoutTimer > 50) {
				out.p1enc(120);
			}

			try {
				if (stream != null && out.pos > 0) {
					stream.write(out.pos, out.data, 0);
					out.pos = 0;
					noTimeoutTimer = 0;
				}
			} catch (IOException var32) {
				lostCon();
			} catch (Exception var33) {
				logout();
			}
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void delIgnore(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < ignoreCount; var3++) {
				if (ignoreUserhash[var3] == arg0) {
					ignoreCount--;
					redrawSidebar = true;

					for (int var4 = var3; var4 < ignoreCount; var4++) {
						ignoreUserhash[var4] = ignoreUserhash[var4 + 1];
					}

					out.p1enc(101);
					out.p8(arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.c(IIII)I")
	public final int titleFlamesMerge(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg1 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.N(I)V")
	public final void clearCaches() {
		LocType.mc1.clear();
		LocType.mc2.clear();
		NpcType.modelCache.clear();
		ObjType.modelcache.clear();
		ObjType.spriteCache.clear();
		ClientPlayer.modelCache.clear();
		SpotType.modelCache.clear();
	}

	@ObfuscatedName("client.O(I)V")
	public final void coordArrow() {
		if (hintType == 2) {
			getOverlayPos((hintTileX - mapBuildBaseX << 7) + hintOffsetX, (hintTileZ - mapBuildBaseZ << 7) + hintOffsetZ, hintHeight * 2);

			if (projectX > -1 && loopCycle % 20 < 10) {
				headicons[2].plotSprite(projectX - 12, projectY - 28);
			}
		}
	}

	@ObfuscatedName("client.a(ILd;IIB)V")
	public final void drawInterface(int arg0, IfType arg1, int arg2, int arg3) {
		if (arg1.type == 0 && arg1.children != null && (!arg1.hide || overMainComId == arg1.id || overSideComId == arg1.id || overChatComId == arg1.id)) {
			int var5 = Pix2D.clipMinX;
			int var6 = Pix2D.clipMinY;
			int var7 = Pix2D.clipMaxX;
			int var8 = Pix2D.clipMaxY;
			Pix2D.setClipping(arg1.height + arg2, arg1.width + arg0, arg0, arg2);
			int var9 = arg1.children.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg1.childX[var10] + arg0;
				int var12 = arg1.childY[var10] + arg2 - arg3;
				IfType var13 = IfType.list[arg1.children[var10]];
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

					drawInterface(var11, var13, var12, var13.scrollPos);

					if (var13.scrollHeight > var13.height) {
						drawScrollbar(var13.scrollPos, var12, var13.scrollHeight, var13.width + var11, var13.height);
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
									if (var17 > Pix2D.clipMinX - 32 && var17 < Pix2D.clipMaxX && var18 > Pix2D.clipMinY - 32 && var18 < Pix2D.clipMaxY || objDragArea != 0 && objDragSlot == var14) {
										int var22 = 0;
										if (useMode == 1 && objSelectedSlot == var14 && objSelectedComId == var13.id) {
											var22 = 0xFFFFFF;
										}

										Pix32 var23 = ObjType.getSprite(var21, var22, var13.linkObjNumber[var14]);
										if (var23 != null) {
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

												var23.transPlotSprite(var18 + var20, var17 + var19, 128);

												if (var18 + var20 < Pix2D.clipMinY && arg1.scrollPos > 0) {
													int var24 = (Pix2D.clipMinY - var18 - var20) * worldUpdateNum / 3;
													if (var24 > worldUpdateNum * 10) {
														var24 = worldUpdateNum * 10;
													}

													if (var24 > arg1.scrollPos) {
														var24 = arg1.scrollPos;
													}

													arg1.scrollPos -= var24;
													objGrabY += var24;
												}

												if (var18 + var20 + 32 > Pix2D.clipMaxY && arg1.scrollPos < arg1.scrollHeight - arg1.height) {
													int var25 = (var18 + var20 + 32 - Pix2D.clipMaxY) * worldUpdateNum / 3;
													if (var25 > worldUpdateNum * 10) {
														var25 = worldUpdateNum * 10;
													}

													if (var25 > arg1.scrollHeight - arg1.height - arg1.scrollPos) {
														var25 = arg1.scrollHeight - arg1.height - arg1.scrollPos;
													}

													arg1.scrollPos += var25;
													objGrabY -= var25;
												}
											} else if (selectedArea != 0 && selectedItem == var14 && selectedComId == var13.id) {
												var23.transPlotSprite(var18, var17, 128);
											} else {
												var23.plotSprite(var17, var18);
											}

											if (var23.owi == 33 || var13.linkObjNumber[var14] != 1) {
												int var26 = var13.linkObjNumber[var14];
												p11.drawString(var17 + var19 + 1, invNumber(var26), 0, var18 + var20 + 10);
												p11.drawString(var17 + var19, invNumber(var26), 0xFFFF00, var18 + var20 + 9);
											}
										}
									}
								} else if (var13.invBackground != null && var14 < 20) {
									Pix32 var27 = var13.invBackground[var14];
									if (var27 != null) {
										var27.plotSprite(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.type == 3) {
						boolean var28 = false;
						if (overChatComId == var13.id || overSideComId == var13.id || overMainComId == var13.id) {
							var28 = true;
						}

						int var29;
						if (getIfActive(var13)) {
							var29 = var13.colour2;
							if (var28 && var13.colour2Over != 0) {
								var29 = var13.colour2Over;
							}
						} else {
							var29 = var13.colour;
							if (var28 && var13.colourOver != 0) {
								var29 = var13.colourOver;
							}
						}

						if (var13.trans == 0) {
							if (var13.fill) {
								Pix2D.fillRect(var13.height, var29, var13.width, var11, var12);
							} else {
								Pix2D.drawRect(var13.width, var29, var13.height, var11, var12);
							}
						} else if (var13.fill) {
							Pix2D.fillRectTrans(var13.width, var13.height, var12, var29, var11, 256 - (var13.trans & 0xFF));
						} else {
							Pix2D.drawRectTrans(var13.width, var12, var11, var29, var13.height, 256 - (var13.trans & 0xFF));
						}
					} else if (var13.type == 4) {
						PixFont var30 = var13.font;
						String var31 = var13.text;
						boolean var32 = false;
						if (overChatComId == var13.id || overSideComId == var13.id || overMainComId == var13.id) {
							var32 = true;
						}

						int var33;
						if (getIfActive(var13)) {
							var33 = var13.colour2;
							if (var32 && var13.colour2Over != 0) {
								var33 = var13.colour2Over;
							}

							if (var13.text2.length() > 0) {
								var31 = var13.text2;
							}
						} else {
							var33 = var13.colour;
							if (var32 && var13.colourOver != 0) {
								var33 = var13.colourOver;
							}
						}

						if (var13.buttonType == 6 && resumedPauseButton) {
							var31 = "Please wait...";
							var33 = var13.colour;
						}

						if (Pix2D.width == 479) {
							if (var33 == 0xFFFF00) {
								var33 = 255;
							}

							if (var33 == 49152) {
								var33 = 0xFFFFFF;
							}
						}

						int var34 = var30.height + var12;
						while (var31.length() > 0) {
							if (var31.indexOf("%") != -1) {
								while (true) {
									int var35 = var31.indexOf("%1");
									if (var35 == -1) {
										break;
									}

									var31 = var31.substring(0, var35) + inf(getIfVar(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + inf(getIfVar(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + inf(getIfVar(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + inf(getIfVar(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + inf(getIfVar(var13, 4)) + var31.substring(var39 + 2);
								}
							}

							int var40 = var31.indexOf("\\n");
							String var41;
							if (var40 == -1) {
								var41 = var31;
								var31 = "";
							} else {
								var41 = var31.substring(0, var40);
								var31 = var31.substring(var40 + 2);
							}

							if (var13.centre) {
								var30.centreStringTag(var13.width / 2 + var11, var34, var41, var33, var13.shadow);
							} else {
								var30.drawStringTag(var41, var13.shadow, var34, var11, var33);
							}

							var34 += var30.height;
						}
					} else if (var13.type == 5) {
						Pix32 var42;
						if (getIfActive(var13)) {
							var42 = var13.graphic2;
						} else {
							var42 = var13.graphic;
						}

						if (var42 != null) {
							var42.plotSprite(var11, var12);
						}
					} else if (var13.type == 6) {
						int var43 = Pix3D.originX;
						int var44 = Pix3D.originY;
						Pix3D.originX = var13.width / 2 + var11;
						Pix3D.originY = var13.height / 2 + var12;
						int var45 = Pix3D.sinTable[var13.modelXAn] * var13.modelZoom >> 16;
						int var46 = Pix3D.cosTable[var13.modelXAn] * var13.modelZoom >> 16;
						boolean var47 = getIfActive(var13);
						int var48;
						if (var47) {
							var48 = var13.modelAnim2;
						} else {
							var48 = var13.modelAnim;
						}

						Model var49;
						if (var48 == -1) {
							var49 = var13.getTempModel(-1, -1, var47);
						} else {
							SeqType var50 = SeqType.list[var48];
							var49 = var13.getTempModel(var50.frames[var13.animFrame], var50.iframes[var13.animFrame], var47);
						}

						if (var49 != null) {
							var49.objRender(0, var13.modelYAn, 0, var13.modelXAn, 0, var45, var46);
						}

						Pix3D.originX = var43;
						Pix3D.originY = var44;
					} else if (var13.type == 7) {
						PixFont var51 = var13.font;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.height; var53++) {
							for (int var54 = 0; var54 < var13.width; var54++) {
								if (var13.linkObjType[var52] > 0) {
									ObjType var55 = ObjType.list(var13.linkObjType[var52] - 1);
									String var56 = var55.name;
									if (var55.stackable || var13.linkObjNumber[var52] != 1) {
										var56 = var56 + " x" + niceNumber(var13.linkObjNumber[var52]);
									}

									int var57 = (var13.marginX + 115) * var54 + var11;
									int var58 = (var13.marginY + 12) * var53 + var12;
									if (var13.centre) {
										var51.centreStringTag(var13.width / 2 + var57, var58, var56, var13.colour, var13.shadow);
									} else {
										var51.drawStringTag(var56, var13.shadow, var58, var57, var13.colour);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			Pix2D.setClipping(var8, var7, var5, var6);
		}
	}

	@ObfuscatedName("client.P(I)V")
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

		imageTitle1.draw(637, graphics, 0);
	}

	@ObfuscatedName("client.l(Z)V")
	public final void followCamera() {
		try {
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
			int var5 = getAvH(orbitCameraX, orbitCameraZ, minusedlevel);
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
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + localPlayer.x + "," + localPlayer.z + "," + orbitCameraX + "," + orbitCameraZ + "," + mapBuildCentreZoneX + "," + mapBuildCentreZoneZ + "," + mapBuildBaseX + "," + mapBuildBaseZ);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.Q(I)V")
	public final void minimapLoop() {
		if (minimapState == 0 && mouseClickButton == 1) {
			int var1 = mouseClickX - 25 - 550;
			int var2 = mouseClickY - 5 - 4;
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
				boolean var10 = tryMove(localPlayer.routeZ[0], var8, 0, 0, 0, localPlayer.routeX[0], 0, true, 0, var9, 1);
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

	@ObfuscatedName("client.j(B)V")
	public final void handleInputKey() {
		cyclelogic4++;
		if (cyclelogic4 > 192) {
			cyclelogic4 = 0;
			out.p1enc(230);
			out.p1(232);
		}

		while (true) {
			int var1 = pollKey();
			if (var1 == -1) {
				return;
			}

			if (mainModalId != -1 && reportAbuseComId == mainModalId) {
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
						out.p1enc(139);
						out.p1(0);
						int var6 = out.pos;
						out.p8(socialUserhash);
						WordPack.pack(socialInput, out);
						out.psize1(out.pos - var6);
						socialInput = JString.toSentenceCase(socialInput);
						socialInput = WordFilter.filter(socialInput);
						addChat(6, JString.toScreenName(JString.toRawUsername(socialUserhash)), socialInput);

						if (chatPrivateMode == 2) {
							chatPrivateMode = 1;
							redrawChatMode = true;
							out.p1enc(154);
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
						} catch (Exception var16) {
						}

						out.p1enc(102);
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
					if (staffmodlevel == 2) {
						if (chatInput.equals("::clientdrop")) {
							lostCon();
						}

						if (chatInput.equals("::lag")) {
							lag();
						}

						if (chatInput.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < onDemand.getFileCount(2); var12++) {
								onDemand.prefetchPriority(var12, 2, (byte) 1);
							}
						}
					}

					if (chatInput.startsWith("::")) {
						out.p1enc(224);
						out.p1(chatInput.length() - 1);
						out.pjstr(chatInput.substring(2));
					} else {
						byte var13 = 0;
						if (chatInput.startsWith("yellow:")) {
							var13 = 0;
							chatInput = chatInput.substring(7);
						}

						if (chatInput.startsWith("red:")) {
							var13 = 1;
							chatInput = chatInput.substring(4);
						}

						if (chatInput.startsWith("green:")) {
							var13 = 2;
							chatInput = chatInput.substring(6);
						}

						if (chatInput.startsWith("cyan:")) {
							var13 = 3;
							chatInput = chatInput.substring(5);
						}

						if (chatInput.startsWith("purple:")) {
							var13 = 4;
							chatInput = chatInput.substring(7);
						}

						if (chatInput.startsWith("white:")) {
							var13 = 5;
							chatInput = chatInput.substring(6);
						}

						if (chatInput.startsWith("flash1:")) {
							var13 = 6;
							chatInput = chatInput.substring(7);
						}

						if (chatInput.startsWith("flash2:")) {
							var13 = 7;
							chatInput = chatInput.substring(7);
						}

						if (chatInput.startsWith("flash3:")) {
							var13 = 8;
							chatInput = chatInput.substring(7);
						}

						if (chatInput.startsWith("glow1:")) {
							var13 = 9;
							chatInput = chatInput.substring(6);
						}

						if (chatInput.startsWith("glow2:")) {
							var13 = 10;
							chatInput = chatInput.substring(6);
						}

						if (chatInput.startsWith("glow3:")) {
							var13 = 11;
							chatInput = chatInput.substring(6);
						}

						byte var14 = 0;
						if (chatInput.startsWith("wave:")) {
							var14 = 1;
							chatInput = chatInput.substring(5);
						}

						if (chatInput.startsWith("scroll:")) {
							var14 = 2;
							chatInput = chatInput.substring(7);
						}

						out.p1enc(253);
						out.p1(0);
						int var15 = out.pos;
						out.p1(var13);
						out.p1(var14);
						WordPack.pack(chatInput, out);
						out.psize1(out.pos - var15);
						chatInput = JString.toSentenceCase(chatInput);
						chatInput = WordFilter.filter(chatInput);
						localPlayer.chatMessage = chatInput;
						localPlayer.chatColour = var13;
						localPlayer.chatEffect = var14;
						localPlayer.chatTimer = 150;

						if (staffmodlevel == 2) {
							addChat(2, "@cr2@" + localPlayer.name, localPlayer.chatMessage);
						} else if (staffmodlevel == 1) {
							addChat(2, "@cr1@" + localPlayer.name, localPlayer.chatMessage);
						} else {
							addChat(2, localPlayer.name, localPlayer.chatMessage);
						}

						if (chatPublicMode == 2) {
							chatPublicMode = 3;
							redrawChatMode = true;
							out.p1enc(154);
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

	@ObfuscatedName("client.b(Ljava/lang/String;)V")
	public final void showLoadError(String arg0) {
		System.out.println(arg0);

		try {
			getAppletContext().showDocument(new URL(getCodeBase(), "loaderror_" + arg0 + ".html"));
		} catch (Exception var4) {
			var4.printStackTrace();
		}

		while (true) {
			try {
				Thread.sleep(1000L);
			} catch (Exception var3) {
			}
		}
	}

	@ObfuscatedName("client.a(IIILgc;I)V")
	public final void addNpcOptions(int arg0, int arg1, NpcType arg2, int arg3) {
		if (menuNumEntries < 400) {
			String var5 = arg2.name;
			if (arg2.vislevel != 0) {
				var5 = var5 + combatColourCode(arg2.vislevel, localPlayer.combatLevel) + " (level-" + arg2.vislevel + ")";
			}

			if (useMode == 1) {
				menuOption[menuNumEntries] = "Use " + objSelectedName + " with @yel@" + var5;
				menuAction[menuNumEntries] = 829;
				menuParamA[menuNumEntries] = arg3;
				menuParamB[menuNumEntries] = arg0;
				menuParamC[menuNumEntries] = arg1;
				menuNumEntries++;
			} else if (targetMode != 1) {
				if (arg2.op != null) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (arg2.op[var6] != null && !arg2.op[var6].equalsIgnoreCase("attack")) {
							menuOption[menuNumEntries] = arg2.op[var6] + " @yel@" + var5;

							if (var6 == 0) {
								menuAction[menuNumEntries] = 242;
							}

							if (var6 == 1) {
								menuAction[menuNumEntries] = 209;
							}

							if (var6 == 2) {
								menuAction[menuNumEntries] = 309;
							}

							if (var6 == 3) {
								menuAction[menuNumEntries] = 852;
							}

							if (var6 == 4) {
								menuAction[menuNumEntries] = 793;
							}

							menuParamA[menuNumEntries] = arg3;
							menuParamB[menuNumEntries] = arg0;
							menuParamC[menuNumEntries] = arg1;
							menuNumEntries++;
						}
					}
				}

				if (arg2.op != null) {
					for (int var7 = 4; var7 >= 0; var7--) {
						if (arg2.op[var7] != null && arg2.op[var7].equalsIgnoreCase("attack")) {
							short var8 = 0;
							if (arg2.vislevel > localPlayer.combatLevel) {
								var8 = 2000;
							}

							menuOption[menuNumEntries] = arg2.op[var7] + " @yel@" + var5;

							if (var7 == 0) {
								menuAction[menuNumEntries] = var8 + 242;
							}

							if (var7 == 1) {
								menuAction[menuNumEntries] = var8 + 209;
							}

							if (var7 == 2) {
								menuAction[menuNumEntries] = var8 + 309;
							}

							if (var7 == 3) {
								menuAction[menuNumEntries] = var8 + 852;
							}

							if (var7 == 4) {
								menuAction[menuNumEntries] = var8 + 793;
							}

							menuParamA[menuNumEntries] = arg3;
							menuParamB[menuNumEntries] = arg0;
							menuParamC[menuNumEntries] = arg1;
							menuNumEntries++;
						}
					}
				}

				menuOption[menuNumEntries] = "Examine @yel@" + var5;
				menuAction[menuNumEntries] = 1714;
				menuParamA[menuNumEntries] = arg3;
				menuParamB[menuNumEntries] = arg0;
				menuParamC[menuNumEntries] = arg1;
				menuNumEntries++;
			} else if ((targetMask & 0x2) == 2) {
				menuOption[menuNumEntries] = targetOp + " @yel@" + var5;
				menuAction[menuNumEntries] = 240;
				menuParamA[menuNumEntries] = arg3;
				menuParamB[menuNumEntries] = arg0;
				menuParamC[menuNumEntries] = arg1;
				menuNumEntries++;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(Ld;I)Z")
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

	@ObfuscatedName("client.k(B)V")
	public final void moveNpcs() {
		for (int var1 = 0; var1 < npcCount; var1++) {
			int var2 = npcIds[var1];
			ClientNpc var3 = npc[var2];
			if (var3 != null) {
				moveEntity(var3, var3.type.size);
			}
		}
	}

	@ObfuscatedName("client.b(Ly;II)V")
	public final void moveEntity(ClientEntity arg0, int arg1) {
		if (arg0.x < 128 || arg0.z < 128 || arg0.x >= 13184 || arg0.z >= 13184) {
			arg0.primaryAnim = -1;
			arg0.spotanimId = -1;
			arg0.exactMoveEnd = 0;
			arg0.exactMoveStart = 0;
			arg0.x = arg0.routeX[0] * 128 + arg0.size * 64;
			arg0.z = arg0.routeZ[0] * 128 + arg0.size * 64;
			arg0.abortRoute();
		}

		if (localPlayer == arg0 && (arg0.x < 1536 || arg0.z < 1536 || arg0.x >= 11776 || arg0.z >= 11776)) {
			arg0.primaryAnim = -1;
			arg0.spotanimId = -1;
			arg0.exactMoveEnd = 0;
			arg0.exactMoveStart = 0;
			arg0.x = arg0.routeX[0] * 128 + arg0.size * 64;
			arg0.z = arg0.routeZ[0] * 128 + arg0.size * 64;
			arg0.abortRoute();
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

	@ObfuscatedName("client.a(Ly;I)V")
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

	@ObfuscatedName("client.b(Ly;I)V")
	public final void exactMove2(ClientEntity arg0) {
		if (loopCycle == arg0.exactMoveStart || arg0.primaryAnim == -1 || arg0.primaryAnimDelay != 0 || arg0.primaryAnimCycle + 1 > SeqType.list[arg0.primaryAnim].getDelay(arg0.primaryFrame)) {
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

	@ObfuscatedName("client.a(ILy;)V")
	public final void routeMove(ClientEntity arg0) {
		arg0.secondaryAnim = arg0.readyanim;
		if (arg0.routeLength == 0) {
			arg0.animDelayMove = 0;
		} else {
			if (arg0.primaryAnim != -1 && arg0.primaryAnimDelay == 0) {
				SeqType var2 = SeqType.list[arg0.primaryAnim];
				if (arg0.preanimRouteLength > 0 && var2.preanim_move == 0) {
					arg0.animDelayMove++;
					return;
				}

				if (arg0.preanimRouteLength <= 0 && var2.postanim_move == 0) {
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
				if (arg0.dstYaw != arg0.yaw && arg0.faceEntity == -1 && arg0.turnspeed != 0) {
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

					if (arg0.preanimRouteLength > 0) {
						arg0.preanimRouteLength--;
						return;
					}
				}
			} else {
				arg0.x = var5;
				arg0.z = var6;
			}
		}
	}

	@ObfuscatedName("client.c(Ly;I)V")
	public final void entityFace(ClientEntity arg0) {
		if (arg0.turnspeed != 0) {
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
				if (var11 < arg0.turnspeed || var11 > 2048 - arg0.turnspeed) {
					arg0.yaw = arg0.dstYaw;
				} else if (var11 > 1024) {
					arg0.yaw -= arg0.turnspeed;
				} else {
					arg0.yaw += arg0.turnspeed;
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
	}

	@ObfuscatedName("client.d(Ly;I)V")
	public final void entityAnim(ClientEntity arg0) {
		arg0.needsForwardDrawPadding = false;

		if (arg0.secondaryAnim != -1) {
			SeqType var2 = SeqType.list[arg0.secondaryAnim];
			arg0.secondaryAnimCycle++;
			if (arg0.secondaryFrame < var2.numFrames && arg0.secondaryAnimCycle > var2.getDelay(arg0.secondaryFrame)) {
				arg0.secondaryAnimCycle = 0;
				arg0.secondaryFrame++;
			}

			if (arg0.secondaryFrame >= var2.numFrames) {
				arg0.secondaryAnimCycle = 0;
				arg0.secondaryFrame = 0;
			}
		}

		if (arg0.spotanimId != -1 && loopCycle >= arg0.spotanimLastCycle) {
			if (arg0.spotanimFrame < 0) {
				arg0.spotanimFrame = 0;
			}

			SeqType var3 = SpotType.list[arg0.spotanimId].seq;
			arg0.spotanimCycle++;
			while (arg0.spotanimFrame < var3.numFrames && arg0.spotanimCycle > var3.getDelay(arg0.spotanimFrame)) {
				arg0.spotanimCycle -= var3.getDelay(arg0.spotanimFrame);
				arg0.spotanimFrame++;
			}

			if (arg0.spotanimFrame >= var3.numFrames && (arg0.spotanimFrame < 0 || arg0.spotanimFrame >= var3.numFrames)) {
				arg0.spotanimId = -1;
			}
		}

		if (arg0.primaryAnim != -1 && arg0.primaryAnimDelay <= 1) {
			SeqType var4 = SeqType.list[arg0.primaryAnim];
			if (var4.preanim_move == 1 && arg0.preanimRouteLength > 0 && arg0.exactMoveEnd <= loopCycle && arg0.exactMoveStart < loopCycle) {
				arg0.primaryAnimDelay = 1;
				return;
			}
		}

		if (arg0.primaryAnim != -1 && arg0.primaryAnimDelay == 0) {
			SeqType var5 = SeqType.list[arg0.primaryAnim];
			arg0.primaryAnimCycle++;
			while (arg0.primaryFrame < var5.numFrames && arg0.primaryAnimCycle > var5.getDelay(arg0.primaryFrame)) {
				arg0.primaryAnimCycle -= var5.getDelay(arg0.primaryFrame);
				arg0.primaryFrame++;
			}

			if (arg0.primaryFrame >= var5.numFrames) {
				arg0.primaryFrame -= var5.loops;
				arg0.primaryAnimLoop++;
				if (arg0.primaryAnimLoop >= var5.maxloops) {
					arg0.primaryAnim = -1;
				}

				if (arg0.primaryFrame < 0 || arg0.primaryFrame >= var5.numFrames) {
					arg0.primaryAnim = -1;
				}
			}

			arg0.needsForwardDrawPadding = var5.reachforward;
		}

		if (arg0.primaryAnimDelay > 0) {
			arg0.primaryAnimDelay--;
		}
	}

	@ObfuscatedName("client.R(I)V")
	public final void gameDraw() {
		if (redrawFrame) {
			redrawFrame = false;
			areaBackleft1.draw(0, graphics, 4);
			areaBackleft2.draw(0, graphics, 357);
			areaBackright1.draw(722, graphics, 4);
			areaBackright2.draw(743, graphics, 205);
			areaBacktop1.draw(0, graphics, 0);
			areaBackvmid1.draw(516, graphics, 4);
			areaBackvmid2.draw(516, graphics, 205);
			areaBackvmid3.draw(496, graphics, 357);
			areaBackhmid2.draw(0, graphics, 338);
			redrawSidebar = true;
			redrawChatback = true;
			redrawIcons = true;
			redrawChatMode = true;

			if (sceneState != 2) {
				areaGame.draw(4, graphics, 4);
				areaMap.draw(550, graphics, 4);
			}
		}

		if (sceneState == 2) {
			gameDrawMain();
		}

		if (isMenuOpen && menuArea == 1) {
			redrawSidebar = true;
		}

		if (sideModalId != -1) {
			boolean var1 = animateInterface(worldUpdateNum, sideModalId);
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

			if (mouseX > 448 && mouseX < 560 && mouseY > 332) {
				doScrollbar(77, chatInterface, mouseY - 357, 0, 463, mouseX - 17, false, scrollHeight);
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
			boolean var3 = animateInterface(worldUpdateNum, chatComId);
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
			areaMap.draw(550, graphics, 4);
		}

		if (tutFlashIcon != -1) {
			redrawIcons = true;
		}

		if (redrawIcons) {
			if (tutFlashIcon != -1 && tutFlashIcon == activeIcon) {
				tutFlashIcon = -1;
				out.p1enc(94);
				out.p1(activeIcon);
			}

			redrawIcons = false;
			areaBackhmid1.setPixels();
			backhmid1.plotSprite(0, 0);

			if (sideModalId == -1) {
				if (sideIcon[activeIcon] != -1) {
					if (activeIcon == 0) {
						redstone1.plotSprite(22, 10);
					}

					if (activeIcon == 1) {
						redstone2.plotSprite(54, 8);
					}

					if (activeIcon == 2) {
						redstone2.plotSprite(82, 8);
					}

					if (activeIcon == 3) {
						redstone3.plotSprite(110, 8);
					}

					if (activeIcon == 4) {
						redstone2h.plotSprite(153, 8);
					}

					if (activeIcon == 5) {
						redstone2h.plotSprite(181, 8);
					}

					if (activeIcon == 6) {
						redstone1h.plotSprite(209, 9);
					}
				}

				if (sideIcon[0] != -1 && (tutFlashIcon != 0 || loopCycle % 20 < 10)) {
					sideicons[0].plotSprite(29, 13);
				}

				if (sideIcon[1] != -1 && (tutFlashIcon != 1 || loopCycle % 20 < 10)) {
					sideicons[1].plotSprite(53, 11);
				}

				if (sideIcon[2] != -1 && (tutFlashIcon != 2 || loopCycle % 20 < 10)) {
					sideicons[2].plotSprite(82, 11);
				}

				if (sideIcon[3] != -1 && (tutFlashIcon != 3 || loopCycle % 20 < 10)) {
					sideicons[3].plotSprite(115, 12);
				}

				if (sideIcon[4] != -1 && (tutFlashIcon != 4 || loopCycle % 20 < 10)) {
					sideicons[4].plotSprite(153, 13);
				}

				if (sideIcon[5] != -1 && (tutFlashIcon != 5 || loopCycle % 20 < 10)) {
					sideicons[5].plotSprite(180, 11);
				}

				if (sideIcon[6] != -1 && (tutFlashIcon != 6 || loopCycle % 20 < 10)) {
					sideicons[6].plotSprite(208, 13);
				}
			}

			areaBackhmid1.draw(516, graphics, 160);
			areaBackbase2.setPixels();
			backbase2.plotSprite(0, 0);

			if (sideModalId == -1) {
				if (sideIcon[activeIcon] != -1) {
					if (activeIcon == 7) {
						redstone1v.plotSprite(42, 0);
					}

					if (activeIcon == 8) {
						redstone2v.plotSprite(74, 0);
					}

					if (activeIcon == 9) {
						redstone2v.plotSprite(102, 0);
					}

					if (activeIcon == 10) {
						redstone3v.plotSprite(130, 1);
					}

					if (activeIcon == 11) {
						redstone2hv.plotSprite(173, 0);
					}

					if (activeIcon == 12) {
						redstone2hv.plotSprite(201, 0);
					}

					if (activeIcon == 13) {
						redstone1hv.plotSprite(229, 0);
					}
				}

				if (sideIcon[8] != -1 && (tutFlashIcon != 8 || loopCycle % 20 < 10)) {
					sideicons[7].plotSprite(74, 2);
				}

				if (sideIcon[9] != -1 && (tutFlashIcon != 9 || loopCycle % 20 < 10)) {
					sideicons[8].plotSprite(102, 3);
				}

				if (sideIcon[10] != -1 && (tutFlashIcon != 10 || loopCycle % 20 < 10)) {
					sideicons[9].plotSprite(137, 4);
				}

				if (sideIcon[11] != -1 && (tutFlashIcon != 11 || loopCycle % 20 < 10)) {
					sideicons[10].plotSprite(174, 2);
				}

				if (sideIcon[12] != -1 && (tutFlashIcon != 12 || loopCycle % 20 < 10)) {
					sideicons[11].plotSprite(201, 2);
				}

				if (sideIcon[13] != -1 && (tutFlashIcon != 13 || loopCycle % 20 < 10)) {
					sideicons[12].plotSprite(226, 2);
				}
			}

			areaBackbase2.draw(496, graphics, 466);
			areaGame.setPixels();
		}

		if (redrawChatMode) {
			redrawChatMode = false;
			areaBackbase1.setPixels();
			backbase1.plotSprite(0, 0);
			p12.centreStringTag(55, 28, "Public chat", 0xFFFFFF, true);

			if (chatPublicMode == 0) {
				p12.centreStringTag(55, 41, "On", 0xFF00, true);
			}

			if (chatPublicMode == 1) {
				p12.centreStringTag(55, 41, "Friends", 0xFFFF00, true);
			}

			if (chatPublicMode == 2) {
				p12.centreStringTag(55, 41, "Off", 0xFF0000, true);
			}

			if (chatPublicMode == 3) {
				p12.centreStringTag(55, 41, "Hide", 0xFFFF, true);
			}

			p12.centreStringTag(184, 28, "Private chat", 0xFFFFFF, true);

			if (chatPrivateMode == 0) {
				p12.centreStringTag(184, 41, "On", 0xFF00, true);
			}

			if (chatPrivateMode == 1) {
				p12.centreStringTag(184, 41, "Friends", 0xFFFF00, true);
			}

			if (chatPrivateMode == 2) {
				p12.centreStringTag(184, 41, "Off", 0xFF0000, true);
			}

			p12.centreStringTag(324, 28, "Trade/duel", 0xFFFFFF, true);

			if (chatTradeMode == 0) {
				p12.centreStringTag(324, 41, "On", 0xFF00, true);
			}

			if (chatTradeMode == 1) {
				p12.centreStringTag(324, 41, "Friends", 0xFFFF00, true);
			}

			if (chatTradeMode == 2) {
				p12.centreStringTag(324, 41, "Off", 0xFF0000, true);
			}

			p12.centreStringTag(458, 33, "Report abuse", 0xFFFFFF, true);
			areaBackbase1.draw(0, graphics, 453);
			areaGame.setPixels();
		}

		worldUpdateNum = 0;
	}

	@ObfuscatedName("client.c(IILlb;)V")
	public final void getNpcPos(int arg0, Packet arg1) {
		entityRemovalCount = 0;
		entityUpdateCount = 0;
		getNpcPosOldVis(arg0, arg1);
		getNpcPosNewVis(arg1, arg0);
		getNpcPosExtended(arg0, arg1);

		for (int var3 = 0; var3 < entityRemovalCount; var3++) {
			int var4 = entityRemovalIds[var3];
			if (loopCycle != npc[var4].cycle) {
				npc[var4].type = null;
				npc[var4] = null;
			}
		}

		if (arg1.pos != arg0) {
			signlink.reporterror(loginUser + " size mismatch in getnpcpos - pos:" + arg1.pos + " psize:" + arg0);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < npcCount; var5++) {
			if (npc[npcIds[var5]] == null) {
				signlink.reporterror(loginUser + " null entry in npc list - pos:" + var5 + " size:" + npcCount);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.S(I)V")
	public final void locChangeDoQueue() {
		if (sceneState == 2) {
			for (LocChange var1 = (LocChange) locChanges.head(); var1 != null; var1 = (LocChange) locChanges.next()) {
				if (var1.endTime > 0) {
					var1.endTime--;
				}

				if (var1.endTime != 0) {
					if (var1.startTime > 0) {
						var1.startTime--;
					}

					if (var1.startTime == 0 && var1.x >= 1 && var1.z >= 1 && var1.x <= 102 && var1.z <= 102 && (var1.newType < 0 || ClientBuild.changeLocAvailable(var1.newType, var1.newShape))) {
						locChangeUnchecked(var1.newAngle, var1.layer, var1.x, var1.newShape, var1.newType, var1.level, var1.z);
						var1.startTime = -1;

						if (var1.newType == var1.oldType && var1.oldType == -1) {
							var1.unlink();
						} else if (var1.newType == var1.oldType && var1.newAngle == var1.oldAngle && var1.newShape == var1.oldShape) {
							var1.unlink();
						}
					}
				} else if (var1.oldType < 0 || ClientBuild.changeLocAvailable(var1.oldType, var1.oldShape)) {
					locChangeUnchecked(var1.oldAngle, var1.layer, var1.x, var1.oldShape, var1.oldType, var1.level, var1.z);
					var1.unlink();
				}
			}
		}
	}

	@ObfuscatedName("client.b(Llb;II)V")
	public final void getPlayerPosNewVis(Packet arg0, int arg1) {
		while (arg0.bitpos + 10 < arg1 * 8) {
			int var3 = arg0.gbit(11);
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
			int var5 = arg0.gbit(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg0.gbit(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg0.gbit(1);
			var4.teleport(localPlayer.routeX[0] + var5, var7 == 1, localPlayer.routeZ[0] + var6);
			int var8 = arg0.gbit(1);
			if (var8 == 1) {
				entityUpdateIds[entityUpdateCount++] = var3;
			}
		}

		arg0.gbitend();
	}

	@ObfuscatedName("client.a([BIB)Z")
	public final boolean saveWave(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.T(I)V")
	public final void getJagChecksums() {
		int var1 = 5;
		jagChecksum[8] = 0;
		int var2 = 0;
		while (jagChecksum[8] == 0) {
			String var3 = "Unknown problem";
			drawProgress("Connecting to web server", 20);

			try {
				DataInputStream var4 = openUrl("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 274);
				Packet var5 = new Packet(new byte[40]);
				var4.readFully(var5.data, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					jagChecksum[var6] = var5.g4();
				}

				int var7 = var5.g4();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + jagChecksum[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					jagChecksum[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				jagChecksum[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				jagChecksum[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				jagChecksum[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (jagChecksum[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						drawProgress("Game updated - please reload page", 10);
						var10 = 10;
					} else {
						drawProgress(var3 + " - Will retry in " + var10 + " secs.", 10);
					}

					try {
						Thread.sleep(1000L);
					} catch (Exception var11) {
					}
				}

				var1 *= 2;
				if (var1 > 60) {
					var1 = 60;
				}

				jaggrabEnabled = !jaggrabEnabled;
			}
		}
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			readbit[var1] = var0 - 1;
			var0 += var0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) (var4 + Math.pow(2.0D, var4 / 7.0D) * 300.0D);
			var2 += var5;
			skillxp[var3] = var2 / 4;
		}
	}
}

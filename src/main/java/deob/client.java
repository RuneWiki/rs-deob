package deob;

import jagex2.client.GameShell;
import jagex2.client.MouseTracking;
import jagex2.client.Stats;
import jagex2.config.Component;
import jagex2.config.FloType;
import jagex2.config.IdkType;
import jagex2.config.LocType;
import jagex2.config.NpcType;
import jagex2.config.ObjType;
import jagex2.config.SeqType;
import jagex2.config.SpotAnimType;
import jagex2.config.VarbitType;
import jagex2.config.VarpType;
import jagex2.dash3d.CollisionMap;
import jagex2.dash3d.World;
import jagex2.dash3d.World3D;
import jagex2.dash3d.entity.LocAddEntity;
import jagex2.dash3d.entity.LocEntity;
import jagex2.dash3d.entity.NpcEntity;
import jagex2.dash3d.entity.ObjStackEntity;
import jagex2.dash3d.entity.PathingEntity;
import jagex2.dash3d.entity.PlayerEntity;
import jagex2.dash3d.entity.ProjectileEntity;
import jagex2.dash3d.entity.SpotAnimEntity;
import jagex2.dash3d.type.Decor;
import jagex2.dash3d.type.GroundDecor;
import jagex2.dash3d.type.Location;
import jagex2.dash3d.type.Wall;
import jagex2.datastruct.LinkList;
import jagex2.datastruct.Linkable;
import jagex2.graphics.AnimFrame;
import jagex2.graphics.Model;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix32;
import jagex2.graphics.Pix3D;
import jagex2.graphics.Pix8;
import jagex2.graphics.PixFont;
import jagex2.graphics.PixMap;
import jagex2.io.ClientStream;
import jagex2.io.FileStream;
import jagex2.io.Isaac;
import jagex2.io.Jagfile;
import jagex2.io.OnDemand;
import jagex2.io.OnDemandRequest;
import jagex2.io.Packet;
import jagex2.io.Protocol;
import jagex2.jstring.JString;
import jagex2.sound.Wave;
import jagex2.wordenc.WordFilter;
import jagex2.wordenc.WordPack;
import java.applet.AppletContext;
import java.awt.Color;
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

public class client extends GameShell {

	@ObfuscatedName("client.L")
	public int[][] bfsCost = new int[104][104];

	@ObfuscatedName("client.M")
	public int[] friendWorld = new int[200];

	@ObfuscatedName("client.N")
	public LinkList[][][] levelObjStacks = new LinkList[4][104][104];

	@ObfuscatedName("client.Q")
	public boolean _flowObfuscator6 = true;

	@ObfuscatedName("client.R")
	public volatile boolean flameActive = false;

	@ObfuscatedName("client.U")
	public Packet chatBuffer = new Packet(new byte[5000], 891);

	@ObfuscatedName("client.V")
	public NpcEntity[] npcs = new NpcEntity[16384];

	@ObfuscatedName("client.X")
	public int[] npcIds = new int[16384];

	@ObfuscatedName("client.Y")
	public int _flowObfuscator7 = 9;

	@ObfuscatedName("client.ab")
	public int[] entityRemovalIds = new int[1000];

	@ObfuscatedName("client.hb")
	public Packet login = Packet.alloc(1, 9);

	@ObfuscatedName("client.ib")
	public boolean waveEnabled = true;

	@ObfuscatedName("client.rb")
	public int viewportInterfaceId = -1;

	@ObfuscatedName("client.yb")
	public int[] skillExperience = new int[Stats.count];

	@ObfuscatedName("client.Gb")
	public boolean jaggrabEnabled = false;

	@ObfuscatedName("client.Hb")
	public int[] cameraModifierJitter = new int[5];

	@ObfuscatedName("client.Ib")
	public int lastWaveId = -1;

	@ObfuscatedName("client.Jb")
	public int _flowObfuscator9 = -680;

	@ObfuscatedName("client.Kb")
	public boolean[] cameraModifierEnabled = new boolean[5];

	@ObfuscatedName("client.Lb")
	public int _flowObfuscator10 = 1834;

	@ObfuscatedName("client.Ob")
	public volatile boolean flamesThread = false;

	@ObfuscatedName("client.Pb")
	public String reportAbuseInput = "";

	@ObfuscatedName("client.Qb")
	public int _flowObfuscator11 = -30815;

	@ObfuscatedName("client.Rb")
	public int _flowObfuscator12 = 533;

	@ObfuscatedName("client.Sb")
	public int localPid = -1;

	@ObfuscatedName("client.Tb")
	public boolean menuVisible = false;

	@ObfuscatedName("client.Vb")
	public String chatTyped = "";

	@ObfuscatedName("client.Wb")
	public int MAX_PLAYER_COUNT = 2048;

	@ObfuscatedName("client.Xb")
	public int LOCAL_PLAYER_INDEX = 2047;

	@ObfuscatedName("client.Yb")
	public PlayerEntity[] players = new PlayerEntity[this.MAX_PLAYER_COUNT];

	@ObfuscatedName("client.ac")
	public int[] playerIds = new int[this.MAX_PLAYER_COUNT];

	@ObfuscatedName("client.cc")
	public int[] entityUpdateIds = new int[this.MAX_PLAYER_COUNT];

	@ObfuscatedName("client.dc")
	public Packet[] playerAppearanceBuffer = new Packet[this.MAX_PLAYER_COUNT];

	@ObfuscatedName("client.fc")
	public int cameraOffsetYawModifier = 1;

	@ObfuscatedName("client.jc")
	public int[][] bfsDirection = new int[104][104];

	@ObfuscatedName("client.kc")
	public int SCROLLBAR_GRIP_HIGHLIGHT = 7759444;

	@ObfuscatedName("client.uc")
	public byte[] textureBuffer = new byte[16384];

	@ObfuscatedName("client.Cc")
	public byte _flowObfuscator15 = 14;

	@ObfuscatedName("client.Dc")
	public int _flowObfuscator16 = 732;

	@ObfuscatedName("client.Ec")
	public int[] skillLevel = new int[Stats.count];

	@ObfuscatedName("client.Fc")
	public byte _flowObfuscator17 = 25;

	@ObfuscatedName("client.Hc")
	public long[] ignoreName37 = new long[100];

	@ObfuscatedName("client.Ic")
	public boolean errorLoading = false;

	@ObfuscatedName("client.Jc")
	public int SCROLLBAR_GRIP_LOWLIGHT = 3353893;

	@ObfuscatedName("client.Kc")
	public int[] cameraModifierWobbleSpeed = new int[5];

	@ObfuscatedName("client.Lc")
	public int[][] tileLastOccupiedCycle = new int[104][104];

	@ObfuscatedName("client.Mc")
	public CRC32 crc32 = new CRC32();

	@ObfuscatedName("client.Vc")
	public int _flowObfuscator18 = 748;

	@ObfuscatedName("client.Yc")
	public int[] messageType = new int[100];

	@ObfuscatedName("client.Zc")
	public String[] messageSender = new String[100];

	@ObfuscatedName("client.ad")
	public String[] messageText = new String[100];

	@ObfuscatedName("client.dd")
	public Pix8[] imageSideicons = new Pix8[13];

	@ObfuscatedName("client.kd")
	public boolean focused = true;

	@ObfuscatedName("client.ld")
	public long[] friendName37 = new long[200];

	@ObfuscatedName("client.md")
	public int nextMidiSong = -1;

	@ObfuscatedName("client.sd")
	public volatile boolean flameThread = false;

	@ObfuscatedName("client.td")
	public int projectX = -1;

	@ObfuscatedName("client.ud")
	public int projectY = -1;

	@ObfuscatedName("client.vd")
	public int[] CHAT_COLORS = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@ObfuscatedName("client.yd")
	public int[] compassMaskLineOffsets = new int[33];

	@ObfuscatedName("client.zd")
	public int[] flameLineOffset = new int[256];

	@ObfuscatedName("client.Ad")
	public FileStream[] fileStreams = new FileStream[5];

	@ObfuscatedName("client.Bd")
	public int[] varps = new int[2000];

	@ObfuscatedName("client.Cd")
	public boolean scrollGrabbed = false;

	@ObfuscatedName("client.Dd")
	public byte _flowObfuscator20 = -74;

	@ObfuscatedName("client.Fd")
	public int MAX_CHATS = 50;

	@ObfuscatedName("client.Gd")
	public int[] chatX = new int[this.MAX_CHATS];

	@ObfuscatedName("client.Hd")
	public int[] chatY = new int[this.MAX_CHATS];

	@ObfuscatedName("client.Id")
	public int[] chatHeight = new int[this.MAX_CHATS];

	@ObfuscatedName("client.Jd")
	public int[] chatWidth = new int[this.MAX_CHATS];

	@ObfuscatedName("client.Kd")
	public int[] chatColors = new int[this.MAX_CHATS];

	@ObfuscatedName("client.Ld")
	public int[] chatStyles = new int[this.MAX_CHATS];

	@ObfuscatedName("client.Md")
	public int[] chatTimers = new int[this.MAX_CHATS];

	@ObfuscatedName("client.Nd")
	public String[] chats = new String[this.MAX_CHATS];

	@ObfuscatedName("client.Pd")
	public int minimapLevel = -1;

	@ObfuscatedName("client.Rd")
	public Pix32[] imageHitmarks = new Pix32[20];

	@ObfuscatedName("client.Ud")
	public int[] designColors = new int[5];

	@ObfuscatedName("client.Vd")
	public boolean _flowObfuscator21 = false;

	@ObfuscatedName("client.Yd")
	public boolean _flowObfuscator22 = false;

	@ObfuscatedName("client.ge")
	public int SCROLLBAR_TRACK = 2301979;

	@ObfuscatedName("client.ie")
	public String chatbackInput = "";

	@ObfuscatedName("client.qe")
	public byte _flowObfuscator23 = 24;

	@ObfuscatedName("client.re")
	public LinkList projectiles = new LinkList(169);

	@ObfuscatedName("client.ve")
	public boolean sendCamera = false;

	@ObfuscatedName("client.we")
	public int viewportOverlayInterfaceId = -1;

	@ObfuscatedName("client.Ie")
	public int[] cameraModifierCycle = new int[5];

	@ObfuscatedName("client.Je")
	public boolean updateDesignModel = false;

	@ObfuscatedName("client.Le")
	public Pix32[] imageMapfunction = new Pix32[100];

	@ObfuscatedName("client.Ue")
	public int stickyChatInterfaceId = -1;

	@ObfuscatedName("client.Ve")
	public boolean _flowObfuscator25 = false;

	@ObfuscatedName("client.We")
	public int[] skillBaseLevel = new int[Stats.count];

	@ObfuscatedName("client.Xe")
	public int[] varCache = new int[2000];

	@ObfuscatedName("client.Ze")
	public boolean designGenderMale = true;

	@ObfuscatedName("client.cf")
	public int _flowObfuscator26 = 111;

	@ObfuscatedName("client.ef")
	public int[] minimapMaskLineOffsets = new int[151];

	@ObfuscatedName("client.gf")
	public int flashingTab = -1;

	@ObfuscatedName("client.jf")
	public LinkList spotanims = new LinkList(169);

	@ObfuscatedName("client.kf")
	public int[] compassMaskLineLengths = new int[33];

	@ObfuscatedName("client.lf")
	public int _flowObfuscator27 = 24869;

	@ObfuscatedName("client.mf")
	public Component chatInterface = new Component();

	@ObfuscatedName("client.nf")
	public Pix8[] imageMapscene = new Pix8[100];

	@ObfuscatedName("client.qf")
	public int SCROLLBAR_GRIP_FOREGROUND = 5063219;

	@ObfuscatedName("client.sf")
	public int[] designIdentikits = new int[7];

	@ObfuscatedName("client.zf")
	public int[] activeMapFunctionX = new int[1000];

	@ObfuscatedName("client.Af")
	public int[] activeMapFunctionZ = new int[1000];

	@ObfuscatedName("client.Hf")
	public boolean awaitingSync = false;

	@ObfuscatedName("client.If")
	public int _flowObfuscator28 = -733;

	@ObfuscatedName("client.Jf")
	public String[] friendName = new String[200];

	@ObfuscatedName("client.Kf")
	public Packet in = Packet.alloc(1, 9);

	@ObfuscatedName("client.Rf")
	public int[] archiveChecksum = new int[9];

	@ObfuscatedName("client.Sf")
	public int[] menuParamB = new int[500];

	@ObfuscatedName("client.Tf")
	public int[] menuParamC = new int[500];

	@ObfuscatedName("client.Uf")
	public int[] menuAction = new int[500];

	@ObfuscatedName("client.Vf")
	public int[] menuParamA = new int[500];

	@ObfuscatedName("client.Wf")
	public Pix32[] imageHeadicons = new Pix32[20];

	@ObfuscatedName("client.eg")
	public boolean redrawSideicons = false;

	@ObfuscatedName("client.gg")
	public int _flowObfuscator30 = 519;

	@ObfuscatedName("client.hg")
	public boolean _flowObfuscator31 = false;

	@ObfuscatedName("client.rg")
	public int _flowObfuscator32 = 445;

	@ObfuscatedName("client.tg")
	public int _flowObfuscator33 = -29508;

	@ObfuscatedName("client.ug")
	public int _flowObfuscator34 = -77;

	@ObfuscatedName("client.wg")
	public String socialMessage = "";

	@ObfuscatedName("client.Cg")
	public String[] playerOptions = new String[5];

	@ObfuscatedName("client.Dg")
	public boolean[] playerOptionPushDown = new boolean[5];

	@ObfuscatedName("client.Eg")
	public int[][][] levelChunkBitset = new int[4][13][13];

	@ObfuscatedName("client.Fg")
	public int[] tabInterfaceId = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Hg")
	public int cameraOffsetZModifier = 2;

	@ObfuscatedName("client.Kg")
	public int _flowObfuscator35 = -12499;

	@ObfuscatedName("client.Pg")
	public Pix32[] activeMapFunctions = new Pix32[1000];

	@ObfuscatedName("client.Qg")
	public boolean withinTutorialIsland = false;

	@ObfuscatedName("client.Yg")
	public boolean pressedContinueOption = false;

	@ObfuscatedName("client.Zg")
	public Pix32[] imageCrosses = new Pix32[8];

	@ObfuscatedName("client.ah")
	public boolean midiActive = true;

	@ObfuscatedName("client.ch")
	public boolean redrawSidebar = false;

	@ObfuscatedName("client.gh")
	public boolean ingame = false;

	@ObfuscatedName("client.hh")
	public boolean reportAbuseMuteOption = false;

	@ObfuscatedName("client.ih")
	public boolean sceneInstanced = false;

	@ObfuscatedName("client.jh")
	public boolean cutscene = false;

	@ObfuscatedName("client.uh")
	public int minimapZoomModifier = 1;

	@ObfuscatedName("client.wh")
	public String username = "";

	@ObfuscatedName("client.xh")
	public String password = "";

	@ObfuscatedName("client.zh")
	public boolean errorHost = false;

	@ObfuscatedName("client.Ah")
	public final int[] LOC_LAYER = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Bh")
	public int reportAbuseInterfaceId = -1;

	@ObfuscatedName("client.Ch")
	public LinkList temporaryLocs = new LinkList(169);

	@ObfuscatedName("client.Hh")
	public int orbitCameraPitch = 128;

	@ObfuscatedName("client.Mh")
	public int sidebarInterfaceId = -1;

	@ObfuscatedName("client.Ph")
	public Packet out = Packet.alloc(1, 9);

	@ObfuscatedName("client.Rh")
	public byte _flowObfuscator36 = 5;

	@ObfuscatedName("client.Wh")
	public String[] menuOption = new String[500];

	@ObfuscatedName("client.ai")
	public int[] cameraModifierWobbleScale = new int[5];

	@ObfuscatedName("client.di")
	public boolean _flowObfuscator38 = true;

	@ObfuscatedName("client.ei")
	public int[] waveIds = new int[50];

	@ObfuscatedName("client.hi")
	public int minimapAngleModifier = 2;

	@ObfuscatedName("client.ii")
	public int chatScrollHeight = 78;

	@ObfuscatedName("client.ji")
	public String socialInput = "";

	@ObfuscatedName("client.oi")
	public byte _flowObfuscator39 = 6;

	@ObfuscatedName("client.pi")
	public int _flowObfuscator40 = -589;

	@ObfuscatedName("client.qi")
	public Pix8[] imageModIcons = new Pix8[2];

	@ObfuscatedName("client.si")
	public int selectedTab = 3;

	@ObfuscatedName("client.ui")
	public boolean redrawChatback = false;

	@ObfuscatedName("client.zi")
	public boolean midiFading = true;

	@ObfuscatedName("client.Ai")
	public int[] minimapMaskLineLengths = new int[151];

	@ObfuscatedName("client.Bi")
	public CollisionMap[] levelCollisionMap = new CollisionMap[4];

	@ObfuscatedName("client.Ei")
	public boolean redrawPrivacySettings = false;

	@ObfuscatedName("client.Ki")
	public final int _flowObfuscator43 = 100;

	@ObfuscatedName("client.Li")
	public int[] messageIds = new int[100];

	@ObfuscatedName("client.Mi")
	public int[] waveLoops = new int[50];

	@ObfuscatedName("client.Ni")
	public boolean objGrabThreshold = false;

	@ObfuscatedName("client.Vi")
	public int[] waveDelay = new int[50];

	@ObfuscatedName("client.Xi")
	public boolean errorStarted = false;

	@ObfuscatedName("client.aj")
	public boolean redrawTitleBackground = false;

	@ObfuscatedName("client.bj")
	public boolean showSocialInput = false;

	@ObfuscatedName("client.lj")
	public String loginMessage0 = "";

	@ObfuscatedName("client.mj")
	public String loginMessage1 = "";

	@ObfuscatedName("client.tj")
	public byte _flowObfuscator44 = -13;

	@ObfuscatedName("client.vj")
	public int chatInterfaceId = -1;

	@ObfuscatedName("client.wj")
	public boolean _flowObfuscator45 = true;

	@ObfuscatedName("client.yj")
	public int cameraOffsetXModifier = 2;

	@ObfuscatedName("client.zj")
	public int[] bfsStepX = new int[4000];

	@ObfuscatedName("client.Aj")
	public int[] bfsStepZ = new int[4000];

	@ObfuscatedName("client.Ij")
	public int lastWaveLoops = -1;

	@ObfuscatedName("client.J")
	public static byte _flowObfuscator5 = 77;

	@ObfuscatedName("client.qb")
	public static BigInteger RSA_MODULUS = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Bc")
	public static boolean _flowObfuscator14 = true;

	@ObfuscatedName("client.nd")
	public static int nodeId = 10;

	@ObfuscatedName("client.pd")
	public static boolean members = true;

	@ObfuscatedName("client.he")
	public static final int[][] DESIGN_BODY_COLOR = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.xe")
	public static int[] levelExperience = new int[99];

	@ObfuscatedName("client.Ke")
	public static BigInteger RSA_EXPONENT;

	@ObfuscatedName("client.Xf")
	public static int _flowObfuscator29;

	@ObfuscatedName("client.lh")
	public static String CHARSET;

	@ObfuscatedName("client.Xh")
	public static byte _flowObfuscator37;

	@ObfuscatedName("client.bi")
	public static final int[] DESIGN_HAIR_COLOR;

	@ObfuscatedName("client.vi")
	public static boolean _flowObfuscator41;

	@ObfuscatedName("client.Di")
	public static int[] BITMASK;

	@ObfuscatedName("client.gb")
	public static int _flowObfuscator8;

	@ObfuscatedName("client.jb")
	public static int cyclelogic1;

	@ObfuscatedName("client.ob")
	public static int cyclelogic2;

	@ObfuscatedName("client.pb")
	public int hintType;

	@ObfuscatedName("client.sb")
	public int cameraX;

	@ObfuscatedName("client.tb")
	public int cameraY;

	@ObfuscatedName("client.ub")
	public int cameraZ;

	@ObfuscatedName("client.vb")
	public int cameraPitch;

	@ObfuscatedName("client.wb")
	public int cameraYaw;

	@ObfuscatedName("client.xb")
	public int rights;

	@ObfuscatedName("client.Mb")
	public int weightCarried;

	@ObfuscatedName("client.Ub")
	public int lastHoveredInterfaceId;

	@ObfuscatedName("client.Zb")
	public int playerCount;

	@ObfuscatedName("client.bc")
	public int entityUpdateCount;

	@ObfuscatedName("client.ec")
	public int cameraAnticheatAngle;

	@ObfuscatedName("client.gc")
	public int _flowObfuscator13;

	@ObfuscatedName("client.hc")
	public int friendCount;

	@ObfuscatedName("client.ic")
	public int friendListStatus;

	@ObfuscatedName("client.vc")
	public int bankArrangeMode;

	@ObfuscatedName("client.wc")
	public int crossX;

	@ObfuscatedName("client.xc")
	public int crossY;

	@ObfuscatedName("client.yc")
	public int crossCycle;

	@ObfuscatedName("client.zc")
	public int crossMode;

	@ObfuscatedName("client.Ac")
	public int currentLevel;

	@ObfuscatedName("client.Gc")
	public static int oplogic5;

	@ObfuscatedName("client.Pc")
	public int hintPlayer;

	@ObfuscatedName("client.Qc")
	public int hintTileX;

	@ObfuscatedName("client.Rc")
	public int hintTileZ;

	@ObfuscatedName("client.Sc")
	public int hintHeight;

	@ObfuscatedName("client.Tc")
	public int hintOffsetX;

	@ObfuscatedName("client.Uc")
	public int hintOffsetZ;

	@ObfuscatedName("client.Wc")
	public static int gamelogic1;

	@ObfuscatedName("client.Xc")
	public static int oplogic9;

	@ObfuscatedName("client.bd")
	public int sceneDelta;

	@ObfuscatedName("client.ed")
	public int menuArea;

	@ObfuscatedName("client.fd")
	public int menuX;

	@ObfuscatedName("client.gd")
	public int menuY;

	@ObfuscatedName("client.hd")
	public int menuWidth;

	@ObfuscatedName("client.id")
	public int menuHeight;

	@ObfuscatedName("client.od")
	public static int portOffset;

	@ObfuscatedName("client.rd")
	public int _flowObfuscator19;

	@ObfuscatedName("client.Ed")
	public int chatCount;

	@ObfuscatedName("client.Od")
	public int cameraPitchClamp;

	@ObfuscatedName("client.Qd")
	public static int oplogic3;

	@ObfuscatedName("client.Sd")
	public int cameraOffsetCycle;

	@ObfuscatedName("client.Td")
	public int objDragCycles;

	@ObfuscatedName("client.Wd")
	public int scrollInputPadding;

	@ObfuscatedName("client.Zd")
	public int cutsceneDstLocalTileX;

	@ObfuscatedName("client.ae")
	public int cutsceneDstLocalTileZ;

	@ObfuscatedName("client.be")
	public int cutsceneDstHeight;

	@ObfuscatedName("client.ce")
	public int cutsceneRotateSpeed;

	@ObfuscatedName("client.de")
	public int cutsceneRotateAcceleration;

	@ObfuscatedName("client.je")
	public static int gamelogic2;

	@ObfuscatedName("client.ke")
	public int daysSinceLastLogin;

	@ObfuscatedName("client.le")
	public int packetSize;

	@ObfuscatedName("client.me")
	public int packetType;

	@ObfuscatedName("client.ne")
	public int idleNetCycles;

	@ObfuscatedName("client.oe")
	public int heartbeatTimer;

	@ObfuscatedName("client.pe")
	public int idleTimeout;

	@ObfuscatedName("client.se")
	public int orbitCameraX;

	@ObfuscatedName("client.te")
	public int orbitCameraZ;

	@ObfuscatedName("client.ue")
	public int sendCameraDelay;

	@ObfuscatedName("client.ye")
	public int _flowObfuscator24;

	@ObfuscatedName("client.ze")
	public int minimapState;

	@ObfuscatedName("client.Ae")
	public int lastWriteDuplicates;

	@ObfuscatedName("client.Be")
	public int sceneState;

	@ObfuscatedName("client.Ee")
	public int viewportHoveredInterfaceIndex;

	@ObfuscatedName("client.Me")
	public int sceneBaseTileX;

	@ObfuscatedName("client.Ne")
	public int sceneBaseTileZ;

	@ObfuscatedName("client.Oe")
	public int scenePrevBaseTileX;

	@ObfuscatedName("client.Pe")
	public int scenePrevBaseTileZ;

	@ObfuscatedName("client.Qe")
	public int loginAttempts;

	@ObfuscatedName("client.Re")
	public int chatHoveredInterfaceIndex;

	@ObfuscatedName("client.Se")
	public int flameGradientCycle0;

	@ObfuscatedName("client.Te")
	public int flameGradientCycle1;

	@ObfuscatedName("client.Ye")
	public int isMember;

	@ObfuscatedName("client.af")
	public int sidebarHoveredInterfaceIndex;

	@ObfuscatedName("client.df")
	public static int gamelogic3;

	@ObfuscatedName("client.hf")
	public int inMultizone;

	@ObfuscatedName("client.of")
	public static int drawCycle;

	@ObfuscatedName("client.pf")
	public int waveCount;

	@ObfuscatedName("client.rf")
	public int socialAction;

	@ObfuscatedName("client.tf")
	public int hoveredSlot;

	@ObfuscatedName("client.uf")
	public int hoveredSlotParentId;

	@ObfuscatedName("client.wf")
	public int sceneCenterZoneX;

	@ObfuscatedName("client.xf")
	public int sceneCenterZoneZ;

	@ObfuscatedName("client.yf")
	public int activeMapFunctionCount;

	@ObfuscatedName("client.Gf")
	public int lastProgressPercent;

	@ObfuscatedName("client.Lf")
	public int objDragInterfaceId;

	@ObfuscatedName("client.Mf")
	public int objDragSlot;

	@ObfuscatedName("client.Nf")
	public int objDragArea;

	@ObfuscatedName("client.Of")
	public int objGrabX;

	@ObfuscatedName("client.Pf")
	public int objGrabY;

	@ObfuscatedName("client.Qf")
	public int chatScrollOffset;

	@ObfuscatedName("client.Yf")
	public static int gamelogic4;

	@ObfuscatedName("client.Zf")
	public int cutsceneSrcLocalTileX;

	@ObfuscatedName("client.ag")
	public int cutsceneSrcLocalTileZ;

	@ObfuscatedName("client.bg")
	public int cutsceneSrcHeight;

	@ObfuscatedName("client.cg")
	public int cutsceneMoveSpeed;

	@ObfuscatedName("client.dg")
	public int cutsceneMoveAcceleration;

	@ObfuscatedName("client.fg")
	public int systemUpdateTimer;

	@ObfuscatedName("client.sg")
	public static int gamelogic5;

	@ObfuscatedName("client.vg")
	public int warnMembersInNonMembers;

	@ObfuscatedName("client.Gg")
	public int cameraAnticheatOffsetZ;

	@ObfuscatedName("client.Ig")
	public int menuSize;

	@ObfuscatedName("client.Jg")
	public static int oplogic2;

	@ObfuscatedName("client.Lg")
	public int spellSelected;

	@ObfuscatedName("client.Mg")
	public int activeSpellId;

	@ObfuscatedName("client.Ng")
	public int activeSpellFlags;

	@ObfuscatedName("client.Rg")
	public static int gamelogic6;

	@ObfuscatedName("client.Xg")
	public int energy;

	@ObfuscatedName("client.dh")
	public int unreadMessages;

	@ObfuscatedName("client.eh")
	public static int oplogic7;

	@ObfuscatedName("client.kh")
	public static int loopCycle;

	@ObfuscatedName("client.qh")
	public int daysSinceRecoveriesChanged;

	@ObfuscatedName("client.sh")
	public int privateMessageCount;

	@ObfuscatedName("client.th")
	public int minimapZoom;

	@ObfuscatedName("client.yh")
	public static int oplogic1;

	@ObfuscatedName("client.Ih")
	public int orbitCameraYaw;

	@ObfuscatedName("client.Jh")
	public int orbitCameraYawVelocity;

	@ObfuscatedName("client.Kh")
	public int orbitCameraPitchVelocity;

	@ObfuscatedName("client.Lh")
	public static int oplogic6;

	@ObfuscatedName("client.Qh")
	public int lastAddress;

	@ObfuscatedName("client.Sh")
	public int splitPrivateChat;

	@ObfuscatedName("client.fi")
	public int frameCycle;

	@ObfuscatedName("client.gi")
	public int minimapAnticheatAngle;

	@ObfuscatedName("client.ki")
	public int dragCycles;

	@ObfuscatedName("client.ni")
	public int titleLoginField;

	@ObfuscatedName("client.ti")
	public int hintNpc;

	@ObfuscatedName("client.wi")
	public int chatbackInputOpen;

	@ObfuscatedName("client.xi")
	public static int oplogic8;

	@ObfuscatedName("client.yi")
	public int midiSong;

	@ObfuscatedName("client.Ii")
	public int lastWriteX;

	@ObfuscatedName("client.Ji")
	public int lastWriteY;

	@ObfuscatedName("client.Oi")
	public int selectedCycle;

	@ObfuscatedName("client.Pi")
	public int selectedInterface;

	@ObfuscatedName("client.Qi")
	public int selectedItem;

	@ObfuscatedName("client.Ri")
	public int selectedArea;

	@ObfuscatedName("client.Ti")
	public int tradeChatSetting;

	@ObfuscatedName("client.Ui")
	public int chatEffects;

	@ObfuscatedName("client.Wi")
	public int overrideChat;

	@ObfuscatedName("client.Yi")
	public int mouseButtonsOption;

	@ObfuscatedName("client.Zi")
	public int minimapOffsetCycle;

	@ObfuscatedName("client.cj")
	public int lastWaveLength;

	@ObfuscatedName("client.ej")
	public int nextMusicDelay;

	@ObfuscatedName("client.fj")
	public static int oplogic10;

	@ObfuscatedName("client.gj")
	public int flagSceneTileX;

	@ObfuscatedName("client.hj")
	public int flagSceneTileZ;

	@ObfuscatedName("client.jj")
	public int tryMoveNearest;

	@ObfuscatedName("client.kj")
	public int sceneCycle;

	@ObfuscatedName("client.nj")
	public int baseX;

	@ObfuscatedName("client.oj")
	public int baseZ;

	@ObfuscatedName("client.uj")
	public int flameCycle0;

	@ObfuscatedName("client.xj")
	public int cameraAnticheatOffsetX;

	@ObfuscatedName("client.Bj")
	public int objSelected;

	@ObfuscatedName("client.Cj")
	public int objSelectedSlot;

	@ObfuscatedName("client.Dj")
	public int objSelectedInterface;

	@ObfuscatedName("client.Ej")
	public int _flowObfuscator46;

	@ObfuscatedName("client.Gj")
	public int publicChatSetting;

	@ObfuscatedName("client.Hj")
	public static int oplogic4;

	@ObfuscatedName("client.Jj")
	public static int _flowObfuscator47;

	@ObfuscatedName("client.I")
	public int ignoreCount;

	@ObfuscatedName("client.T")
	public int titleScreenState;

	@ObfuscatedName("client.W")
	public int npcCount;

	@ObfuscatedName("client.Z")
	public int entityRemovalCount;

	@ObfuscatedName("client.bb")
	public int lastPacketType0;

	@ObfuscatedName("client.cb")
	public int lastPacketType1;

	@ObfuscatedName("client.db")
	public int lastPacketType2;

	@ObfuscatedName("client.fb")
	public int privateChatSetting;

	@ObfuscatedName("client.jd")
	public long socialName37;

	@ObfuscatedName("client.vh")
	public long lastWaveStartTime;

	@ObfuscatedName("client.mi")
	public long serverSeed;

	@ObfuscatedName("client.ri")
	public long prevMousePressTime;

	@ObfuscatedName("client.K")
	public long sceneLoadStartTime;

	@ObfuscatedName("client.Eb")
	public Pix32 imageMapmarker0;

	@ObfuscatedName("client.Fb")
	public Pix32 imageMapmarker1;

	@ObfuscatedName("client.Nc")
	public Pix32 genderButtonImage0;

	@ObfuscatedName("client.Oc")
	public Pix32 genderButtonImage1;

	@ObfuscatedName("client.fe")
	public Pix32 imageMapedge;

	@ObfuscatedName("client.Bf")
	public Pix32 imageMapdot0;

	@ObfuscatedName("client.Cf")
	public Pix32 imageMapdot1;

	@ObfuscatedName("client.Df")
	public Pix32 imageMapdot2;

	@ObfuscatedName("client.Ef")
	public Pix32 imageMapdot3;

	@ObfuscatedName("client.Ff")
	public Pix32 imageMapdot4;

	@ObfuscatedName("client.xg")
	public Pix32 imageCompass;

	@ObfuscatedName("client.Yh")
	public Pix32 imageFlamesLeft;

	@ObfuscatedName("client.Zh")
	public Pix32 imageFlamesRight;

	@ObfuscatedName("client.ij")
	public Pix32 imageMinimap;

	@ObfuscatedName("client.Bg")
	public static PlayerEntity localPlayer;

	@ObfuscatedName("client.zb")
	public Pix8 imageRedstone1v;

	@ObfuscatedName("client.Ab")
	public Pix8 imageRedstone2v;

	@ObfuscatedName("client.Bb")
	public Pix8 imageRedstone3v;

	@ObfuscatedName("client.Cb")
	public Pix8 imageRedstone1hv;

	@ObfuscatedName("client.Db")
	public Pix8 imageRedstone2hv;

	@ObfuscatedName("client.wd")
	public Pix8 imageTitlebox;

	@ObfuscatedName("client.xd")
	public Pix8 imageTitlebutton;

	@ObfuscatedName("client.Ce")
	public Pix8 imageScrollbar0;

	@ObfuscatedName("client.De")
	public Pix8 imageScrollbar1;

	@ObfuscatedName("client.Fe")
	public Pix8 imageBackbase1;

	@ObfuscatedName("client.Ge")
	public Pix8 imageBackbase2;

	@ObfuscatedName("client.He")
	public Pix8 imageBackhmid1;

	@ObfuscatedName("client.Sg")
	public Pix8 imageRedstone1;

	@ObfuscatedName("client.Tg")
	public Pix8 imageRedstone2;

	@ObfuscatedName("client.Ug")
	public Pix8 imageRedstone3;

	@ObfuscatedName("client.Vg")
	public Pix8 imageRedstone1h;

	@ObfuscatedName("client.Wg")
	public Pix8 imageRedstone2h;

	@ObfuscatedName("client.Th")
	public Pix8 imageInvback;

	@ObfuscatedName("client.Uh")
	public Pix8 imageMapback;

	@ObfuscatedName("client.Vh")
	public Pix8 imageChatback;

	@ObfuscatedName("client.vf")
	public OnDemand ondemand;

	@ObfuscatedName("client.lc")
	public PixMap areaBackleft1;

	@ObfuscatedName("client.mc")
	public PixMap areaBackleft2;

	@ObfuscatedName("client.nc")
	public PixMap areaBackright1;

	@ObfuscatedName("client.oc")
	public PixMap areaBackright2;

	@ObfuscatedName("client.pc")
	public PixMap areaBacktop1;

	@ObfuscatedName("client.qc")
	public PixMap areaBackvmid1;

	@ObfuscatedName("client.rc")
	public PixMap areaBackvmid2;

	@ObfuscatedName("client.sc")
	public PixMap areaBackvmid3;

	@ObfuscatedName("client.tc")
	public PixMap areaBackhmid2;

	@ObfuscatedName("client.ig")
	public PixMap imageTitle2;

	@ObfuscatedName("client.jg")
	public PixMap imageTitle3;

	@ObfuscatedName("client.kg")
	public PixMap imageTitle4;

	@ObfuscatedName("client.lg")
	public PixMap imageTitle0;

	@ObfuscatedName("client.mg")
	public PixMap imageTitle1;

	@ObfuscatedName("client.ng")
	public PixMap imageTitle5;

	@ObfuscatedName("client.og")
	public PixMap imageTitle6;

	@ObfuscatedName("client.pg")
	public PixMap imageTitle7;

	@ObfuscatedName("client.qg")
	public PixMap imageTitle8;

	@ObfuscatedName("client.yg")
	public PixMap areaBackbase1;

	@ObfuscatedName("client.zg")
	public PixMap areaBackbase2;

	@ObfuscatedName("client.Ag")
	public PixMap areaBackhmid1;

	@ObfuscatedName("client.mh")
	public PixMap areaSidebar;

	@ObfuscatedName("client.nh")
	public PixMap areaMapback;

	@ObfuscatedName("client.oh")
	public PixMap areaViewport;

	@ObfuscatedName("client.ph")
	public PixMap areaChatback;

	@ObfuscatedName("client.ee")
	public Isaac randomIn;

	@ObfuscatedName("client.rh")
	public ClientStream stream;

	@ObfuscatedName("client.cd")
	public World3D scene;

	@ObfuscatedName("client.ff")
	public Jagfile archiveTitle;

	@ObfuscatedName("client.pj")
	public PixFont fontPlain11;

	@ObfuscatedName("client.qj")
	public PixFont fontPlain12;

	@ObfuscatedName("client.rj")
	public PixFont fontBold12;

	@ObfuscatedName("client.sj")
	public PixFont fontQuill8;

	@ObfuscatedName("client.Nb")
	public MouseTracking mouseTracking;

	@ObfuscatedName("client.bf")
	public String lastProgressMessage;

	@ObfuscatedName("client.Og")
	public String spellCaption;

	@ObfuscatedName("client.Fj")
	public String objSelectedName;

	@ObfuscatedName("client.eb")
	public String modalMessage;

	@ObfuscatedName("client.S")
	public Socket jaggrabSocket;

	@ObfuscatedName("client.qd")
	public static boolean lowMemory;

	@ObfuscatedName("client.Xd")
	public static boolean started;

	@ObfuscatedName("client.fh")
	public static boolean showFps;

	@ObfuscatedName("client.ci")
	public static boolean flagged;

	@ObfuscatedName("client.Ci")
	public static boolean _flowObfuscator42;

	@ObfuscatedName("client.kb")
	public int[] flameGradient;

	@ObfuscatedName("client.lb")
	public int[] flameGradient0;

	@ObfuscatedName("client.mb")
	public int[] flameGradient1;

	@ObfuscatedName("client.nb")
	public int[] flameGradient2;

	@ObfuscatedName("client.Dh")
	public int[] areaChatbackOffsets;

	@ObfuscatedName("client.Eh")
	public int[] areaSidebarOffsets;

	@ObfuscatedName("client.Fh")
	public int[] areaViewportOffsets;

	@ObfuscatedName("client.Nh")
	public int[] flameBuffer0;

	@ObfuscatedName("client.Oh")
	public int[] flameBuffer1;

	@ObfuscatedName("client.Fi")
	public int[] sceneMapIndex;

	@ObfuscatedName("client.Gi")
	public int[] sceneMapLandFile;

	@ObfuscatedName("client.Hi")
	public int[] sceneMapLocFile;

	@ObfuscatedName("client.O")
	public int[] flameBuffer3;

	@ObfuscatedName("client.P")
	public int[] flameBuffer2;

	@ObfuscatedName("client.bh")
	public Pix8[] imageRunes;

	@ObfuscatedName("client.Gh")
	public byte[][] sceneMapLandData;

	@ObfuscatedName("client.Si")
	public byte[][] sceneMapLocData;

	@ObfuscatedName("client.dj")
	public byte[][][] levelTileFlags;

	@ObfuscatedName("client.li")
	public int[][][] levelHeightmap;

	@ObfuscatedName("client.a(II)Ljava/lang/String;")
	public static final String formatObjCountTagged(int arg0, int arg1) {
		String var2 = String.valueOf(arg0);
		for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
			var2 = var2.substring(0, var3) + "," + var2.substring(var3);
		}
		if (arg1 != 0) {
			_flowObfuscator41 = !_flowObfuscator41;
		}
		if (var2.length() > 8) {
			var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
		} else if (var2.length() > 4) {
			var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
		}
		return " " + var2;
	}

	@ObfuscatedName("client.g(I)V")
	public final void stopMidi(int arg0) {
		signlink.midifade = 0;
		signlink.midi = "stop";
		if (arg0 <= 0) {
			this._flowObfuscator38 = !this._flowObfuscator38;
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void loadArchiveChecksums(int arg0) {
		if (arg0 <= 0) {
			this._flowObfuscator40 = this.randomIn.nextInt();
		}
		int var2 = 5;
		this.archiveChecksum[8] = 0;
		int var3 = 0;
		while (this.archiveChecksum[8] == 0) {
			String var4 = "Unknown problem";
			this.drawProgress(20, (byte) 4, "Connecting to web server");
			try {
				DataInputStream var5 = this.openUrl("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 317);
				Packet var6 = new Packet(new byte[40], 891);
				var5.readFully(var6.data, 0, 40);
				var5.close();
				for (int var7 = 0; var7 < 9; var7++) {
					this.archiveChecksum[var7] = var6.g4();
				}
				int var8 = var6.g4();
				int var9 = 1234;
				for (int var10 = 0; var10 < 9; var10++) {
					var9 = (var9 << 1) + this.archiveChecksum[var10];
				}
				if (var8 != var9) {
					var4 = "checksum problem";
					this.archiveChecksum[8] = 0;
				}
			} catch (EOFException var13) {
				var4 = "EOF problem";
				this.archiveChecksum[8] = 0;
			} catch (IOException var14) {
				var4 = "connection problem";
				this.archiveChecksum[8] = 0;
			} catch (Exception var15) {
				var4 = "logic problem";
				this.archiveChecksum[8] = 0;
				if (!signlink.reporterror) {
					return;
				}
			}
			if (this.archiveChecksum[8] == 0) {
				var3++;
				for (int var11 = var2; var11 > 0; var11--) {
					if (var3 >= 10) {
						this.drawProgress(10, (byte) 4, "Game updated - please reload page");
						var11 = 10;
					} else {
						this.drawProgress(10, (byte) 4, var4 + " - Will retry in " + var11 + " secs.");
					}
					try {
						Thread.sleep(1000L);
					} catch (Exception var12) {
					}
				}
				var2 *= 2;
				if (var2 > 60) {
					var2 = 60;
				}
				this.jaggrabEnabled = !this.jaggrabEnabled;
			}
		}
	}

	@ObfuscatedName("client.b(II)Z")
	public final boolean isAddFriendOption(int arg0, int arg1) {
		if (arg1 < 0) {
			return false;
		}
		int var3 = this.menuAction[arg1];
		if (arg0 != 9) {
			this.packetType = -1;
		}
		if (var3 >= 2000) {
			var3 -= 2000;
		}
		return var3 == 337;
	}

	@ObfuscatedName("client.i(I)V")
	public final void drawChat(int arg0) {
		this.areaChatback.bind(0);
		Pix3D.lineOffset = this.areaChatbackOffsets;
		this.imageChatback.draw(0, 16083, 0);
		if (this.showSocialInput) {
			this.fontBold12.drawStringCenter(0, this.socialMessage, 23693, 40, 239);
			this.fontBold12.drawStringCenter(128, this.socialInput + "*", 23693, 60, 239);
		} else if (this.chatbackInputOpen == 1) {
			this.fontBold12.drawStringCenter(0, "Enter amount:", 23693, 40, 239);
			this.fontBold12.drawStringCenter(128, this.chatbackInput + "*", 23693, 60, 239);
		} else if (this.chatbackInputOpen == 2) {
			this.fontBold12.drawStringCenter(0, "Enter name:", 23693, 40, 239);
			this.fontBold12.drawStringCenter(128, this.chatbackInput + "*", 23693, 60, 239);
		} else if (this.modalMessage != null) {
			this.fontBold12.drawStringCenter(0, this.modalMessage, 23693, 40, 239);
			this.fontBold12.drawStringCenter(128, "Click to continue", 23693, 60, 239);
		} else if (this.chatInterfaceId != -1) {
			this.drawInterface(8, 0, 0, Component.instances[this.chatInterfaceId], 0);
		} else if (this.stickyChatInterfaceId == -1) {
			PixFont var2 = this.fontPlain12;
			int var3 = 0;
			Pix2D.setBounds(77, 0, false, 463, 0);
			for (int var4 = 0; var4 < 100; var4++) {
				if (this.messageText[var4] != null) {
					int var6 = this.messageType[var4];
					int var7 = 70 - var3 * 14 + this.chatScrollOffset;
					String var8 = this.messageSender[var4];
					byte var9 = 0;
					if (var8 != null && var8.startsWith("@cr1@")) {
						var8 = var8.substring(5);
						var9 = 1;
					}
					if (var8 != null && var8.startsWith("@cr2@")) {
						var8 = var8.substring(5);
						var9 = 2;
					}
					if (var6 == 0) {
						if (var7 > 0 && var7 < 110) {
							var2.drawString(0, this.messageText[var4], var7, 822, 4);
						}
						var3++;
					}
					if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.publicChatSetting == 0 || this.publicChatSetting == 1 && this.isFriend(false, var8))) {
						if (var7 > 0 && var7 < 110) {
							int var10 = 4;
							if (var9 == 1) {
								this.imageModIcons[0].draw(var10, 16083, var7 - 12);
								var10 += 14;
							}
							if (var9 == 2) {
								this.imageModIcons[1].draw(var10, 16083, var7 - 12);
								var10 += 14;
							}
							var2.drawString(0, var8 + ":", var7, 822, var10);
							int var11 = var10 + var2.stringWidthTag(this._flowObfuscator32, var8) + 8;
							var2.drawString(255, this.messageText[var4], var7, 822, var11);
						}
						var3++;
					}
					if ((var6 == 3 || var6 == 7) && this.splitPrivateChat == 0 && (var6 == 7 || this.privateChatSetting == 0 || this.privateChatSetting == 1 && this.isFriend(false, var8))) {
						if (var7 > 0 && var7 < 110) {
							byte var12 = 4;
							var2.drawString(0, "From", var7, 822, var12);
							int var13 = var12 + var2.stringWidthTag(this._flowObfuscator32, "From ");
							if (var9 == 1) {
								this.imageModIcons[0].draw(var13, 16083, var7 - 12);
								var13 += 14;
							}
							if (var9 == 2) {
								this.imageModIcons[1].draw(var13, 16083, var7 - 12);
								var13 += 14;
							}
							var2.drawString(0, var8 + ":", var7, 822, var13);
							int var14 = var13 + var2.stringWidthTag(this._flowObfuscator32, var8) + 8;
							var2.drawString(8388608, this.messageText[var4], var7, 822, var14);
						}
						var3++;
					}
					if (var6 == 4 && (this.tradeChatSetting == 0 || this.tradeChatSetting == 1 && this.isFriend(false, var8))) {
						if (var7 > 0 && var7 < 110) {
							var2.drawString(8388736, var8 + " " + this.messageText[var4], var7, 822, 4);
						}
						var3++;
					}
					if (var6 == 5 && this.splitPrivateChat == 0 && this.privateChatSetting < 2) {
						if (var7 > 0 && var7 < 110) {
							var2.drawString(8388608, this.messageText[var4], var7, 822, 4);
						}
						var3++;
					}
					if (var6 == 6 && this.splitPrivateChat == 0 && this.privateChatSetting < 2) {
						if (var7 > 0 && var7 < 110) {
							var2.drawString(0, "To " + var8 + ":", var7, 822, 4);
							var2.drawString(8388608, this.messageText[var4], var7, 822, var2.stringWidthTag(this._flowObfuscator32, "To " + var8) + 12);
						}
						var3++;
					}
					if (var6 == 8 && (this.tradeChatSetting == 0 || this.tradeChatSetting == 1 && this.isFriend(false, var8))) {
						if (var7 > 0 && var7 < 110) {
							var2.drawString(8270336, var8 + " " + this.messageText[var4], var7, 822, 4);
						}
						var3++;
					}
				}
			}
			Pix2D.resetBounds(4);
			this.chatScrollHeight = var3 * 14 + 7;
			if (this.chatScrollHeight < 78) {
				this.chatScrollHeight = 78;
			}
			this.drawScrollbar(519, 77, this.chatScrollHeight - this.chatScrollOffset - 77, 0, 463, this.chatScrollHeight);
			String var5;
			if (localPlayer == null || localPlayer.name == null) {
				var5 = JString.toSentenceCase(-45804, this.username);
			} else {
				var5 = localPlayer.name;
			}
			var2.drawString(0, var5 + ":", 90, 822, 4);
			var2.drawString(255, this.chatTyped + "*", 90, 822, var2.stringWidthTag(this._flowObfuscator32, var5 + ": ") + 6);
			Pix2D.drawHorizontalLine(77, 0, 479, 0, (byte) 4);
		} else {
			this.drawInterface(8, 0, 0, Component.instances[this.stickyChatInterfaceId], 0);
		}
		if (this.menuVisible && this.menuArea == 2) {
			this.drawMenu((byte) 9);
		}
		this.areaChatback.draw(357, 23680, super.graphics, 17);
		this.areaViewport.bind(0);
		Pix3D.lineOffset = this.areaViewportOffsets;
		if (arg0 < 6 || arg0 > 6) {
			this._flowObfuscator21 = !this._flowObfuscator21;
		}
	}

	public final void init() {
		nodeId = Integer.parseInt(this.getParameter("nodeid"));
		portOffset = Integer.parseInt(this.getParameter("portoff"));
		String var1 = this.getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			setLowMemory((byte) 77);
		} else {
			setHighMemory(false);
		}
		String var2 = this.getParameter("free");
		if (var2 != null && var2.equals("1")) {
			members = false;
		} else {
			members = true;
		}
		this.initApplet(503, false, 765);
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

	@ObfuscatedName("client.j(I)Ljava/net/Socket;")
	public final Socket openSocket(int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@ObfuscatedName("client.k(I)V")
	public final void handleMouseInput(int arg0) {
		if (arg0 != 4) {
			this.packetType = this.in.g1();
		}
		if (this.objDragArea != 0) {
			return;
		}
		int var2 = super.mouseClickButton;
		if (this.spellSelected == 1 && super.mouseClickX >= 516 && super.mouseClickY >= 160 && super.mouseClickX <= 765 && super.mouseClickY <= 205) {
			var2 = 0;
		}
		if (!this.menuVisible) {
			if (var2 == 1 && this.menuSize > 0) {
				int var13 = this.menuAction[this.menuSize - 1];
				if (var13 == 632 || var13 == 78 || var13 == 867 || var13 == 431 || var13 == 53 || var13 == 74 || var13 == 454 || var13 == 539 || var13 == 493 || var13 == 847 || var13 == 447 || var13 == 1125) {
					int var14 = this.menuParamB[this.menuSize - 1];
					int var15 = this.menuParamC[this.menuSize - 1];
					Component var16 = Component.instances[var15];
					if (var16.draggable || var16.swappable) {
						this.objGrabThreshold = false;
						this.objDragCycles = 0;
						this.objDragInterfaceId = var15;
						this.objDragSlot = var14;
						this.objDragArea = 2;
						this.objGrabX = super.mouseClickX;
						this.objGrabY = super.mouseClickY;
						if (Component.instances[var15].layer == this.viewportInterfaceId) {
							this.objDragArea = 1;
						}
						if (Component.instances[var15].layer == this.chatInterfaceId) {
							this.objDragArea = 3;
						}
						return;
					}
				}
			}
			if (var2 == 1 && (this.mouseButtonsOption == 1 || this.isAddFriendOption(9, this.menuSize - 1)) && this.menuSize > 2) {
				var2 = 2;
			}
			if (var2 == 1 && this.menuSize > 0) {
				this.useMenuOption(this.menuSize - 1, false);
			}
			if (var2 != 2 || this.menuSize <= 0) {
				return;
			}
			this.showContextMenu(true);
			return;
		}
		if (var2 != 1) {
			int var3 = super.mouseX;
			int var4 = super.mouseY;
			if (this.menuArea == 0) {
				var3 -= 4;
				var4 -= 4;
			}
			if (this.menuArea == 1) {
				var3 -= 553;
				var4 -= 205;
			}
			if (this.menuArea == 2) {
				var3 -= 17;
				var4 -= 357;
			}
			if (var3 < this.menuX - 10 || var3 > this.menuWidth + this.menuX + 10 || var4 < this.menuY - 10 || var4 > this.menuHeight + this.menuY + 10) {
				this.menuVisible = false;
				if (this.menuArea == 1) {
					this.redrawSidebar = true;
				}
				if (this.menuArea == 2) {
					this.redrawChatback = true;
				}
			}
		}
		if (var2 != 1) {
			return;
		}
		int var5 = this.menuX;
		int var6 = this.menuY;
		int var7 = this.menuWidth;
		int var8 = super.mouseClickX;
		int var9 = super.mouseClickY;
		if (this.menuArea == 0) {
			var8 -= 4;
			var9 -= 4;
		}
		if (this.menuArea == 1) {
			var8 -= 553;
			var9 -= 205;
		}
		if (this.menuArea == 2) {
			var8 -= 17;
			var9 -= 357;
		}
		int var10 = -1;
		for (int var11 = 0; var11 < this.menuSize; var11++) {
			int var12 = (this.menuSize - 1 - var11) * 15 + var6 + 31;
			if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
				var10 = var11;
			}
		}
		if (var10 != -1) {
			this.useMenuOption(var10, false);
		}
		this.menuVisible = false;
		if (this.menuArea == 1) {
			this.redrawSidebar = true;
		}
		if (this.menuArea == 2) {
			this.redrawChatback = true;
			return;
		}
	}

	@ObfuscatedName("client.a(ZI[B)V")
	public final void saveMidi(boolean arg0, int arg1, byte[] arg2) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg2, arg2.length);
		if (arg1 != 0) {
			this.packetType = this.in.g1();
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public final void buildScene(boolean arg0) {
		try {
			this.minimapLevel = -1;
			this.spotanims.clear();
			this.projectiles.clear();
			Pix3D.clearTexels(_flowObfuscator8);
			this.clearCache(false);
			this.scene.reset(619);
			System.gc();
			for (int var2 = 0; var2 < 4; var2++) {
				this.levelCollisionMap[var2].reset();
			}
			for (int var3 = 0; var3 < 4; var3++) {
				for (int var4 = 0; var4 < 104; var4++) {
					for (int var5 = 0; var5 < 104; var5++) {
						this.levelTileFlags[var3][var4][var5] = 0;
					}
				}
			}
			World var6 = new World(this.levelTileFlags, -60, 104, 104, this.levelHeightmap);
			int var7 = this.sceneMapLandData.length;
			this.out.p1isaac((byte) 6, 0);
			if (!this.sceneInstanced) {
				for (int var8 = 0; var8 < var7; var8++) {
					int var9 = (this.sceneMapIndex[var8] >> 8) * 64 - this.sceneBaseTileX;
					int var10 = (this.sceneMapIndex[var8] & 0xFF) * 64 - this.sceneBaseTileZ;
					byte[] var11 = this.sceneMapLandData[var8];
					if (var11 != null) {
						var6.readLand(var11, var10, var9, (this.sceneCenterZoneX - 6) * 8, (this.sceneCenterZoneZ - 6) * 8, (byte) 4, this.levelCollisionMap);
					}
				}
				for (int var12 = 0; var12 < var7; var12++) {
					int var13 = (this.sceneMapIndex[var12] >> 8) * 64 - this.sceneBaseTileX;
					int var14 = (this.sceneMapIndex[var12] & 0xFF) * 64 - this.sceneBaseTileZ;
					byte[] var15 = this.sceneMapLandData[var12];
					if (var15 == null && this.sceneCenterZoneZ < 800) {
						var6.stitchHeightmap(var14, 64, 0, 64, var13);
					}
				}
				gamelogic4++;
				if (gamelogic4 > 160) {
					gamelogic4 = 0;
					this.out.p1isaac((byte) 6, 238);
					this.out.p1(96);
				}
				this.out.p1isaac((byte) 6, 0);
				for (int var16 = 0; var16 < var7; var16++) {
					byte[] var17 = this.sceneMapLocData[var16];
					if (var17 != null) {
						int var18 = (this.sceneMapIndex[var16] >> 8) * 64 - this.sceneBaseTileX;
						int var19 = (this.sceneMapIndex[var16] & 0xFF) * 64 - this.sceneBaseTileZ;
						var6.readLoc(var18, this.levelCollisionMap, var19, 7, this.scene, var17);
					}
				}
			}
			if (this.sceneInstanced) {
				int var20 = 0;
				label252: while (true) {
					if (var20 >= 4) {
						for (int var30 = 0; var30 < 13; var30++) {
							for (int var31 = 0; var31 < 13; var31++) {
								int var32 = this.levelChunkBitset[0][var30][var31];
								if (var32 == -1) {
									var6.stitchHeightmap(var31 * 8, 8, 0, 8, var30 * 8);
								}
							}
						}
						this.out.p1isaac((byte) 6, 0);
						int var33 = 0;
						while (true) {
							if (var33 >= 4) {
								break label252;
							}
							for (int var34 = 0; var34 < 13; var34++) {
								for (int var35 = 0; var35 < 13; var35++) {
									int var36 = this.levelChunkBitset[var33][var34][var35];
									if (var36 != -1) {
										int var37 = var36 >> 24 & 0x3;
										int var38 = var36 >> 1 & 0x3;
										int var39 = var36 >> 14 & 0x3FF;
										int var40 = var36 >> 3 & 0x7FF;
										int var41 = (var39 / 8 << 8) + var40 / 8;
										for (int var42 = 0; var42 < this.sceneMapIndex.length; var42++) {
											if (this.sceneMapIndex[var42] == var41 && this.sceneMapLocData[var42] != null) {
												var6.readLocRegion(this.levelCollisionMap, this.scene, var37, var34 * 8, (var40 & 0x7) * 8, true, var33, this.sceneMapLocData[var42], (var39 & 0x7) * 8, var38, var35 * 8);
												break;
											}
										}
									}
								}
							}
							var33++;
						}
					}
					for (int var21 = 0; var21 < 13; var21++) {
						for (int var22 = 0; var22 < 13; var22++) {
							int var23 = this.levelChunkBitset[var20][var21][var22];
							if (var23 != -1) {
								int var24 = var23 >> 24 & 0x3;
								int var25 = var23 >> 1 & 0x3;
								int var26 = var23 >> 14 & 0x3FF;
								int var27 = var23 >> 3 & 0x7FF;
								int var28 = (var26 / 8 << 8) + var27 / 8;
								for (int var29 = 0; var29 < this.sceneMapIndex.length; var29++) {
									if (this.sceneMapIndex[var29] == var28 && this.sceneMapLandData[var29] != null) {
										var6.readLandRegion(var24, var25, this.levelCollisionMap, 9, var21 * 8, (var26 & 0x7) * 8, this.sceneMapLandData[var29], (var27 & 0x7) * 8, var20, var22 * 8);
										break;
									}
								}
							}
						}
					}
					var20++;
				}
			}
			this.out.p1isaac((byte) 6, 0);
			var6.build(this.levelCollisionMap, this.scene, 2);
			this.areaViewport.bind(0);
			this.out.p1isaac((byte) 6, 0);
			int var43 = World.currentLevel;
			if (var43 > this.currentLevel) {
				var43 = this.currentLevel;
			}
			if (var43 < this.currentLevel - 1) {
				int var44 = this.currentLevel - 1;
			}
			if (lowMemory) {
				this.scene.setMinLevel(World.currentLevel, -34686);
			} else {
				this.scene.setMinLevel(0, -34686);
			}
			for (int var45 = 0; var45 < 104; var45++) {
				for (int var46 = 0; var46 < 104; var46++) {
					this.sortObjStacks(var45, var46);
				}
			}
			gamelogic3++;
			if (gamelogic3 > 98) {
				gamelogic3 = 0;
				this.out.p1isaac((byte) 6, 150);
			}
			this.clearTemporaryLocs(-919);
		} catch (Exception var59) {
		}
		LocType.modelCacheStatic.clear();
		this.ingame &= arg0;
		if (super.frame != null) {
			this.out.p1isaac((byte) 6, 210);
			this.out.p4(1057001181);
		}
		if (lowMemory && signlink.cache_dat != null) {
			int var48 = this.ondemand.getFileCount(79, 0);
			for (int var49 = 0; var49 < var48; var49++) {
				int var50 = this.ondemand.getModelFlags(var49, -203);
				if ((var50 & 0x79) == 0) {
					Model.unload(116, var49);
				}
			}
		}
		System.gc();
		Pix3D.initPool(20, true);
		this.ondemand.clearPrefetches(0);
		int var51 = (this.sceneCenterZoneX - 6) / 8 - 1;
		int var52 = (this.sceneCenterZoneX + 6) / 8 + 1;
		int var53 = (this.sceneCenterZoneZ - 6) / 8 - 1;
		int var54 = (this.sceneCenterZoneZ + 6) / 8 + 1;
		if (this.withinTutorialIsland) {
			var51 = 49;
			var52 = 50;
			var53 = 49;
			var54 = 50;
		}
		for (int var55 = var51; var55 <= var52; var55++) {
			for (int var56 = var53; var56 <= var54; var56++) {
				if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
					int var57 = this.ondemand.getMapFile(0, 0, var56, var55);
					if (var57 != -1) {
						this.ondemand.prefetch(var57, 3, false);
					}
					int var58 = this.ondemand.getMapFile(1, 0, var56, var55);
					if (var58 != -1) {
						this.ondemand.prefetch(var58, 3, false);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void clearCache(boolean arg0) {
		LocType.modelCacheStatic.clear();
		LocType.modelCacheDynamic.clear();
		NpcType.modelCacheStatic.clear();
		ObjType.modelCache.clear();
		ObjType.iconCache.clear();
		if (arg0) {
			this.packetType = -1;
		}
		PlayerEntity.modelCache.clear();
		SpotAnimType.modelCache.clear();
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void createMinimap(boolean arg0, int arg1) {
		int[] var3 = this.imageMinimap.pixels;
		int var4 = var3.length;
		for (int var5 = 0; var5 < var4; var5++) {
			var3[var5] = 0;
		}
		for (int var6 = 1; var6 < 103; var6++) {
			int var23 = (103 - var6) * 512 * 4 + 24628;
			for (int var24 = 1; var24 < 103; var24++) {
				if ((this.levelTileFlags[arg1][var24][var6] & 0x18) == 0) {
					this.scene.drawMinimapTile(var3, var23, 512, arg1, var24, var6);
				}
				if (arg1 < 3 && (this.levelTileFlags[arg1 + 1][var24][var6] & 0x8) != 0) {
					this.scene.drawMinimapTile(var3, var23, 512, arg1 + 1, var24, var6);
				}
				var23 += 4;
			}
		}
		int var7 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10);
		int var8 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		this.imageMinimap.bind(0);
		for (int var9 = 1; var9 < 103; var9++) {
			for (int var22 = 1; var22 < 103; var22++) {
				if ((this.levelTileFlags[arg1][var22][var9] & 0x18) == 0) {
					this.drawMinimapLoc(var9, -960, var7, var22, var8, arg1);
				}
				if (arg1 < 3 && (this.levelTileFlags[arg1 + 1][var22][var9] & 0x8) != 0) {
					this.drawMinimapLoc(var9, -960, var7, var22, var8, arg1 + 1);
				}
			}
		}
		this.areaViewport.bind(0);
		this.ingame &= arg0;
		this.activeMapFunctionCount = 0;
		for (int var10 = 0; var10 < 104; var10++) {
			for (int var11 = 0; var11 < 104; var11++) {
				int var12 = this.scene.getGroundDecorationBitset(this.currentLevel, var10, var11);
				if (var12 != 0) {
					int var13 = var12 >> 14 & 0x7FFF;
					int var14 = LocType.get(var13).mapfunction;
					if (var14 >= 0) {
						int var15 = var10;
						int var16 = var11;
						if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
							byte var17 = 104;
							byte var18 = 104;
							int[][] var19 = this.levelCollisionMap[this.currentLevel].flags;
							for (int var20 = 0; var20 < 10; var20++) {
								int var21 = (int) (Math.random() * 4.0D);
								if (var21 == 0 && var15 > 0 && var15 > var10 - 3 && (var19[var15 - 1][var16] & 0x1280108) == 0) {
									var15--;
								}
								if (var21 == 1 && var15 < var17 - 1 && var15 < var10 + 3 && (var19[var15 + 1][var16] & 0x1280180) == 0) {
									var15++;
								}
								if (var21 == 2 && var16 > 0 && var16 > var11 - 3 && (var19[var15][var16 - 1] & 0x1280102) == 0) {
									var16--;
								}
								if (var21 == 3 && var16 < var18 - 1 && var16 < var11 + 3 && (var19[var15][var16 + 1] & 0x1280120) == 0) {
									var16++;
								}
							}
						}
						this.activeMapFunctions[this.activeMapFunctionCount] = this.imageMapfunction[var14];
						this.activeMapFunctionX[this.activeMapFunctionCount] = var15;
						this.activeMapFunctionZ[this.activeMapFunctionCount] = var16;
						this.activeMapFunctionCount++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void sortObjStacks(int arg0, int arg1) {
		LinkList var3 = this.levelObjStacks[this.currentLevel][arg0][arg1];
		if (var3 == null) {
			this.scene.removeObjStack(this.currentLevel, arg0, arg1);
			return;
		}
		int var4 = -99999999;
		ObjStackEntity var5 = null;
		for (ObjStackEntity var6 = (ObjStackEntity) var3.head(); var6 != null; var6 = (ObjStackEntity) var3.next(false)) {
			ObjType var11 = ObjType.get(var6.type);
			int var12 = var11.cost;
			if (var11.stackable) {
				var12 = (var6.count + 1) * var12;
			}
			if (var12 > var4) {
				var4 = var12;
				var5 = var6;
			}
		}
		var3.addHead(-493, var5);
		ObjStackEntity var7 = null;
		ObjStackEntity var8 = null;
		for (ObjStackEntity var9 = (ObjStackEntity) var3.head(); var9 != null; var9 = (ObjStackEntity) var3.next(false)) {
			if (var5.type != var9.type && var7 == null) {
				var7 = var9;
			}
			if (var5.type != var9.type && var7.type != var9.type && var8 == null) {
				var8 = var9;
			}
		}
		int var10 = (arg1 << 7) + arg0 + 1610612736;
		this.scene.addObjStack((byte) 7, arg0, var10, var7, this.getHeightmapY(this.currentLevel, arg1 * 128 + 64, true, arg0 * 128 + 64), var8, var5, this.currentLevel, arg1);
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void pushNpcs(boolean arg0, int arg1) {
		for (int var3 = 0; var3 < this.npcCount; var3++) {
			NpcEntity var4 = this.npcs[this.npcIds[var3]];
			int var5 = (this.npcIds[var3] << 14) + 536870912;
			if (var4 != null && var4.isVisible(_flowObfuscator41) && var4.type.alwaysontop == arg0) {
				int var6 = var4.x >> 7;
				int var7 = var4.z >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.size == 1 && (var4.x & 0x7F) == 64 && (var4.z & 0x7F) == 64) {
						if (this.tileLastOccupiedCycle[var6][var7] == this.sceneCycle) {
							continue;
						}
						this.tileLastOccupiedCycle[var6][var7] = this.sceneCycle;
					}
					if (!var4.type.active) {
						var5 += Integer.MIN_VALUE;
					}
					this.scene.addTemporary(this.currentLevel, var4.yaw, (byte) 6, this.getHeightmapY(this.currentLevel, var4.z, true, var4.x), var5, var4.z, (var4.size - 1) * 64 + 60, var4.x, var4, var4.needsForwardDrawPadding);
				}
			}
		}
		if (arg1 == -30815) {
			;
		}
	}

	@ObfuscatedName("client.l(I)Z")
	public final boolean replayWave(int arg0) {
		if (arg0 != 11456) {
			throw new NullPointerException();
		}
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void showLoadError(String arg0) {
		System.out.println(arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "loaderror_" + arg0 + ".html"));
		} catch (Exception var3) {
			var3.printStackTrace();
		}
		while (true) {
			while (true) {
				try {
					Thread.sleep(1000L);
				} catch (Exception var4) {
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILDUCMKFAY;IIII)V")
	public final void handleInterfaceInput(int arg0, int arg1, Component arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2.type != 0 || arg2.children == null || arg2.hide || (arg3 < arg0 || arg5 < arg4 || arg3 > arg2.width + arg0 || arg5 > arg2.height + arg4)) {
			return;
		}
		int var8 = arg2.children.length;
		if (arg1 != 13037) {
			this.levelObjStacks = null;
		}
		for (int var9 = 0; var9 < var8; var9++) {
			int var10 = arg2.childX[var9] + arg0;
			int var11 = arg2.childY[var9] + arg4 - arg6;
			Component var12 = Component.instances[arg2.children[var9]];
			int var13 = var12.x + var10;
			int var14 = var12.y + var11;
			if ((var12.overlayer >= 0 || var12.overColour != 0) && arg3 >= var13 && arg5 >= var14 && arg3 < var12.width + var13 && arg5 < var12.height + var14) {
				if (var12.overlayer >= 0) {
					this.lastHoveredInterfaceId = var12.overlayer;
				} else {
					this.lastHoveredInterfaceId = var12.id;
				}
			}
			if (var12.type == 0) {
				this.handleInterfaceInput(var13, 13037, var12, arg3, var14, arg5, var12.scrollPosition);
				if (var12.scroll > var12.height) {
					this.handleScrollInput(var12.width + var13, var12.height, arg3, arg5, var12, var14, true, var12.scroll, 0);
				}
			} else {
				if (var12.buttonType == 1 && arg3 >= var13 && arg5 >= var14 && arg3 < var12.width + var13 && arg5 < var12.height + var14) {
					boolean var15 = false;
					if (var12.clientCode != 0) {
						var15 = this.handleSocialMenuOption(var12, false);
					}
					if (!var15) {
						this.menuOption[this.menuSize] = var12.option;
						this.menuAction[this.menuSize] = 315;
						this.menuParamC[this.menuSize] = var12.id;
						this.menuSize++;
					}
				}
				if (var12.buttonType == 2 && this.spellSelected == 0 && arg3 >= var13 && arg5 >= var14 && arg3 < var12.width + var13 && arg5 < var12.height + var14) {
					String var16 = var12.targetVerb;
					if (var16.indexOf(" ") != -1) {
						var16 = var16.substring(0, var16.indexOf(" "));
					}
					this.menuOption[this.menuSize] = var16 + " @gre@" + var12.targetText;
					this.menuAction[this.menuSize] = 626;
					this.menuParamC[this.menuSize] = var12.id;
					this.menuSize++;
				}
				if (var12.buttonType == 3 && arg3 >= var13 && arg5 >= var14 && arg3 < var12.width + var13 && arg5 < var12.height + var14) {
					this.menuOption[this.menuSize] = "Close";
					this.menuAction[this.menuSize] = 200;
					this.menuParamC[this.menuSize] = var12.id;
					this.menuSize++;
				}
				if (var12.buttonType == 4 && arg3 >= var13 && arg5 >= var14 && arg3 < var12.width + var13 && arg5 < var12.height + var14) {
					this.menuOption[this.menuSize] = var12.option;
					this.menuAction[this.menuSize] = 169;
					this.menuParamC[this.menuSize] = var12.id;
					this.menuSize++;
				}
				if (var12.buttonType == 5 && arg3 >= var13 && arg5 >= var14 && arg3 < var12.width + var13 && arg5 < var12.height + var14) {
					this.menuOption[this.menuSize] = var12.option;
					this.menuAction[this.menuSize] = 646;
					this.menuParamC[this.menuSize] = var12.id;
					this.menuSize++;
				}
				if (var12.buttonType == 6 && !this.pressedContinueOption && arg3 >= var13 && arg5 >= var14 && arg3 < var12.width + var13 && arg5 < var12.height + var14) {
					this.menuOption[this.menuSize] = var12.option;
					this.menuAction[this.menuSize] = 679;
					this.menuParamC[this.menuSize] = var12.id;
					this.menuSize++;
				}
				if (var12.type == 2) {
					int var17 = 0;
					for (int var18 = 0; var18 < var12.height; var18++) {
						for (int var19 = 0; var19 < var12.width; var19++) {
							int var20 = (var12.marginX + 32) * var19 + var13;
							int var21 = (var12.marginY + 32) * var18 + var14;
							if (var17 < 20) {
								var20 += var12.invSlotOffsetX[var17];
								var21 += var12.invSlotOffsetY[var17];
							}
							if (arg3 >= var20 && arg5 >= var21 && arg3 < var20 + 32 && arg5 < var21 + 32) {
								this.hoveredSlot = var17;
								this.hoveredSlotParentId = var12.id;
								if (var12.invSlotObjId[var17] > 0) {
									ObjType var22 = ObjType.get(var12.invSlotObjId[var17] - 1);
									if (this.objSelected == 1 && var12.interactable) {
										if (this.objSelectedInterface != var12.id || this.objSelectedSlot != var17) {
											this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @lre@" + var22.name;
											this.menuAction[this.menuSize] = 870;
											this.menuParamA[this.menuSize] = var22.type;
											this.menuParamB[this.menuSize] = var17;
											this.menuParamC[this.menuSize] = var12.id;
											this.menuSize++;
										}
									} else if (this.spellSelected != 1 || !var12.interactable) {
										if (var12.interactable) {
											for (int var23 = 4; var23 >= 3; var23--) {
												if (var22.iop != null && var22.iop[var23] != null) {
													this.menuOption[this.menuSize] = var22.iop[var23] + " @lre@" + var22.name;
													if (var23 == 3) {
														this.menuAction[this.menuSize] = 493;
													}
													if (var23 == 4) {
														this.menuAction[this.menuSize] = 847;
													}
													this.menuParamA[this.menuSize] = var22.type;
													this.menuParamB[this.menuSize] = var17;
													this.menuParamC[this.menuSize] = var12.id;
													this.menuSize++;
												} else if (var23 == 4) {
													this.menuOption[this.menuSize] = "Drop @lre@" + var22.name;
													this.menuAction[this.menuSize] = 847;
													this.menuParamA[this.menuSize] = var22.type;
													this.menuParamB[this.menuSize] = var17;
													this.menuParamC[this.menuSize] = var12.id;
													this.menuSize++;
												}
											}
										}
										if (var12.usable) {
											this.menuOption[this.menuSize] = "Use @lre@" + var22.name;
											this.menuAction[this.menuSize] = 447;
											this.menuParamA[this.menuSize] = var22.type;
											this.menuParamB[this.menuSize] = var17;
											this.menuParamC[this.menuSize] = var12.id;
											this.menuSize++;
										}
										if (var12.interactable && var22.iop != null) {
											for (int var24 = 2; var24 >= 0; var24--) {
												if (var22.iop[var24] != null) {
													this.menuOption[this.menuSize] = var22.iop[var24] + " @lre@" + var22.name;
													if (var24 == 0) {
														this.menuAction[this.menuSize] = 74;
													}
													if (var24 == 1) {
														this.menuAction[this.menuSize] = 454;
													}
													if (var24 == 2) {
														this.menuAction[this.menuSize] = 539;
													}
													this.menuParamA[this.menuSize] = var22.type;
													this.menuParamB[this.menuSize] = var17;
													this.menuParamC[this.menuSize] = var12.id;
													this.menuSize++;
												}
											}
										}
										if (var12.iop != null) {
											for (int var25 = 4; var25 >= 0; var25--) {
												if (var12.iop[var25] != null) {
													this.menuOption[this.menuSize] = var12.iop[var25] + " @lre@" + var22.name;
													if (var25 == 0) {
														this.menuAction[this.menuSize] = 632;
													}
													if (var25 == 1) {
														this.menuAction[this.menuSize] = 78;
													}
													if (var25 == 2) {
														this.menuAction[this.menuSize] = 867;
													}
													if (var25 == 3) {
														this.menuAction[this.menuSize] = 431;
													}
													if (var25 == 4) {
														this.menuAction[this.menuSize] = 53;
													}
													this.menuParamA[this.menuSize] = var22.type;
													this.menuParamB[this.menuSize] = var17;
													this.menuParamC[this.menuSize] = var12.id;
													this.menuSize++;
												}
											}
										}
										this.menuOption[this.menuSize] = "Examine @lre@" + var22.name;
										this.menuAction[this.menuSize] = 1125;
										this.menuParamA[this.menuSize] = var22.type;
										this.menuParamB[this.menuSize] = var17;
										this.menuParamC[this.menuSize] = var12.id;
										this.menuSize++;
									} else if ((this.activeSpellFlags & 0x10) == 16) {
										this.menuOption[this.menuSize] = this.spellCaption + " @lre@" + var22.name;
										this.menuAction[this.menuSize] = 543;
										this.menuParamA[this.menuSize] = var22.type;
										this.menuParamB[this.menuSize] = var17;
										this.menuParamC[this.menuSize] = var12.id;
										this.menuSize++;
									}
								}
							}
							var17++;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void drawScrollbar(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.imageScrollbar0.draw(arg4, 16083, arg3);
		this.imageScrollbar1.draw(arg4, 16083, arg1 + arg3 - 16);
		Pix2D.fillRect(arg1 - 32, arg3 + 16, arg4, this.SCROLLBAR_TRACK, 16, 0);
		int var7 = (arg1 - 32) * arg1 / arg5;
		if (var7 < 8) {
			var7 = 8;
		}
		int var8 = (arg1 - 32 - var7) * arg2 / (arg5 - arg1);
		Pix2D.fillRect(var7, arg3 + 16 + var8, arg4, this.SCROLLBAR_GRIP_FOREGROUND, 16, 0);
		Pix2D.drawVerticalLine(arg3 + 16 + var8, this.SCROLLBAR_GRIP_HIGHLIGHT, var7, arg4, this._flowObfuscator35);
		Pix2D.drawVerticalLine(arg3 + 16 + var8, this.SCROLLBAR_GRIP_HIGHLIGHT, var7, arg4 + 1, this._flowObfuscator35);
		Pix2D.drawHorizontalLine(arg3 + 16 + var8, this.SCROLLBAR_GRIP_HIGHLIGHT, 16, arg4, (byte) 4);
		Pix2D.drawHorizontalLine(arg3 + 17 + var8, this.SCROLLBAR_GRIP_HIGHLIGHT, 16, arg4, (byte) 4);
		if (arg0 <= 0) {
			this._flowObfuscator30 = this.randomIn.nextInt();
		}
		Pix2D.drawVerticalLine(arg3 + 16 + var8, this.SCROLLBAR_GRIP_LOWLIGHT, var7, arg4 + 15, this._flowObfuscator35);
		Pix2D.drawVerticalLine(arg3 + 17 + var8, this.SCROLLBAR_GRIP_LOWLIGHT, var7 - 1, arg4 + 14, this._flowObfuscator35);
		Pix2D.drawHorizontalLine(arg3 + 15 + var8 + var7, this.SCROLLBAR_GRIP_LOWLIGHT, 16, arg4, (byte) 4);
		Pix2D.drawHorizontalLine(arg3 + 14 + var8 + var7, this.SCROLLBAR_GRIP_LOWLIGHT, 15, arg4 + 1, (byte) 4);
	}

	@ObfuscatedName("client.a(LMBMGIXGO;II)V")
	public final void readNpcInfo(Packet arg0, int arg1, int arg2) {
		this.entityRemovalCount = 0;
		this.entityUpdateCount = 0;
		if (arg2 <= 0) {
			this._flowObfuscator10 = this.randomIn.nextInt();
		}
		this.readNpcs(arg0, -45, arg1);
		this.readNewNpcs(arg1, arg0, (byte) 2);
		this.readNpcUpdates(arg1, arg0, true);
		for (int var4 = 0; var4 < this.entityRemovalCount; var4++) {
			int var6 = this.entityRemovalIds[var4];
			if (loopCycle != this.npcs[var6].cycle) {
				this.npcs[var6].type = null;
				this.npcs[var6] = null;
			}
		}
		if (arg0.pos != arg1) {
			signlink.reporterror(this.username + " size mismatch in getnpcpos - pos:" + arg0.pos + " psize:" + arg1);
			throw new RuntimeException("eek");
		}
		for (int var5 = 0; var5 < this.npcCount; var5++) {
			if (this.npcs[this.npcIds[var5]] == null) {
				signlink.reporterror(this.username + " null entry in npc list - pos:" + var5 + " size:" + this.npcCount);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void handleChatSettingsInput(boolean arg0) {
		this.ingame &= arg0;
		if (super.mouseClickButton != 1) {
			return;
		}
		if (super.mouseClickX >= 6 && super.mouseClickX <= 106 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.publicChatSetting = (this.publicChatSetting + 1) % 4;
			this.redrawPrivacySettings = true;
			this.redrawChatback = true;
			this.out.p1isaac((byte) 6, 95);
			this.out.p1(this.publicChatSetting);
			this.out.p1(this.privateChatSetting);
			this.out.p1(this.tradeChatSetting);
		}
		if (super.mouseClickX >= 135 && super.mouseClickX <= 235 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.privateChatSetting = (this.privateChatSetting + 1) % 3;
			this.redrawPrivacySettings = true;
			this.redrawChatback = true;
			this.out.p1isaac((byte) 6, 95);
			this.out.p1(this.publicChatSetting);
			this.out.p1(this.privateChatSetting);
			this.out.p1(this.tradeChatSetting);
		}
		if (super.mouseClickX >= 273 && super.mouseClickX <= 373 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.tradeChatSetting = (this.tradeChatSetting + 1) % 3;
			this.redrawPrivacySettings = true;
			this.redrawChatback = true;
			this.out.p1isaac((byte) 6, 95);
			this.out.p1(this.publicChatSetting);
			this.out.p1(this.privateChatSetting);
			this.out.p1(this.tradeChatSetting);
		}
		if (super.mouseClickX >= 412 && super.mouseClickX <= 512 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			if (this.viewportInterfaceId == -1) {
				this.closeInterfaces(537);
				this.reportAbuseInput = "";
				this.reportAbuseMuteOption = false;
				for (int var2 = 0; var2 < Component.instances.length; var2++) {
					if (Component.instances[var2] != null && Component.instances[var2].clientCode == 600) {
						this.reportAbuseInterfaceId = this.viewportInterfaceId = Component.instances[var2].layer;
						break;
					}
				}
			} else {
				this.addMessage("Please close the interface you have open before using 'report abuse'", 0, "", this._flowObfuscator21);
			}
		}
		gamelogic1++;
		if (gamelogic1 <= 1386) {
			return;
		}
		gamelogic1 = 0;
		this.out.p1isaac((byte) 6, 165);
		this.out.p1(0);
		int var3 = this.out.pos;
		this.out.p1(139);
		this.out.p1(150);
		this.out.p2(32131);
		this.out.p1((int) (Math.random() * 256.0D));
		this.out.p2(3250);
		this.out.p1(177);
		this.out.p2(24859);
		this.out.p1(119);
		if ((int) (Math.random() * 2.0D) == 0) {
			this.out.p2(47234);
		}
		if ((int) (Math.random() * 2.0D) == 0) {
			this.out.p1(21);
		}
		this.out.psize1(this.out.pos - var3, (byte) 0);
		return;
	}

	@ObfuscatedName("client.d(ZI)V")
	public final void updateVarp(boolean arg0, int arg1) {
		int var3 = VarpType.instances[arg1].clientcode;
		if (var3 == 0) {
			return;
		}
		int var4 = this.varps[arg1];
		if (arg0) {
			this._flowObfuscator19 = this.randomIn.nextInt();
		}
		if (var3 == 1) {
			if (var4 == 1) {
				Pix3D.setBrightness(0.9D, _flowObfuscator37);
			}
			if (var4 == 2) {
				Pix3D.setBrightness(0.8D, _flowObfuscator37);
			}
			if (var4 == 3) {
				Pix3D.setBrightness(0.7D, _flowObfuscator37);
			}
			if (var4 == 4) {
				Pix3D.setBrightness(0.6D, _flowObfuscator37);
			}
			ObjType.iconCache.clear();
			this.redrawTitleBackground = true;
		}
		if (var3 == 3) {
			boolean var5 = this.midiActive;
			if (var4 == 0) {
				this.setMidiVolume((byte) 0, this.midiActive, 0);
				this.midiActive = true;
			}
			if (var4 == 1) {
				this.setMidiVolume((byte) 0, this.midiActive, -400);
				this.midiActive = true;
			}
			if (var4 == 2) {
				this.setMidiVolume((byte) 0, this.midiActive, -800);
				this.midiActive = true;
			}
			if (var4 == 3) {
				this.setMidiVolume((byte) 0, this.midiActive, -1200);
				this.midiActive = true;
			}
			if (var4 == 4) {
				this.midiActive = false;
			}
			if (this.midiActive != var5 && !lowMemory) {
				if (this.midiActive) {
					this.midiSong = this.nextMidiSong;
					this.midiFading = true;
					this.ondemand.request(2, this.midiSong);
				} else {
					this.stopMidi(860);
				}
				this.nextMusicDelay = 0;
			}
		}
		if (var3 == 4) {
			if (var4 == 0) {
				this.waveEnabled = true;
				this.setWaveVolume((byte) 2, 0);
			}
			if (var4 == 1) {
				this.waveEnabled = true;
				this.setWaveVolume((byte) 2, -400);
			}
			if (var4 == 2) {
				this.waveEnabled = true;
				this.setWaveVolume((byte) 2, -800);
			}
			if (var4 == 3) {
				this.waveEnabled = true;
				this.setWaveVolume((byte) 2, -1200);
			}
			if (var4 == 4) {
				this.waveEnabled = false;
			}
		}
		if (var3 == 5) {
			this.mouseButtonsOption = var4;
		}
		if (var3 == 6) {
			this.chatEffects = var4;
		}
		if (var3 == 8) {
			this.splitPrivateChat = var4;
			this.redrawChatback = true;
		}
		if (var3 == 9) {
			this.bankArrangeMode = var4;
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void draw2DEntityElements(int arg0) {
		this.chatCount = 0;
		for (int var2 = -1; var2 < this.npcCount + this.playerCount; var2++) {
			PathingEntity var19;
			if (var2 == -1) {
				var19 = localPlayer;
			} else if (var2 < this.playerCount) {
				var19 = this.players[this.playerIds[var2]];
			} else {
				var19 = this.npcs[this.npcIds[var2 - this.playerCount]];
			}
			if (var19 != null && var19.isVisible(_flowObfuscator41)) {
				if (var19 instanceof NpcEntity) {
					NpcType var20 = ((NpcEntity) var19).type;
					if (var20.multinpc != null) {
						var20 = var20.getMultiNpc(this._flowObfuscator10);
					}
					if (var20 == null) {
						continue;
					}
				}
				if (var2 >= this.playerCount) {
					NpcType var24 = ((NpcEntity) var19).type;
					if (var24.headicon >= 0 && var24.headicon < this.imageHeadicons.length) {
						this.projectFromGround(true, var19, var19.height + 15);
						if (this.projectX > -1) {
							this.imageHeadicons[var24.headicon].draw(this.projectX - 12, 16083, this.projectY - 30);
						}
					}
					if (this.hintType == 1 && this.npcIds[var2 - this.playerCount] == this.hintNpc && loopCycle % 20 < 10) {
						this.projectFromGround(true, var19, var19.height + 15);
						if (this.projectX > -1) {
							this.imageHeadicons[2].draw(this.projectX - 12, 16083, this.projectY - 28);
						}
					}
				} else {
					int var21 = 30;
					PlayerEntity var22 = (PlayerEntity) var19;
					if (var22.headicons != 0) {
						this.projectFromGround(true, var19, var19.height + 15);
						if (this.projectX > -1) {
							for (int var23 = 0; var23 < 8; var23++) {
								if ((var22.headicons & 0x1 << var23) != 0) {
									this.imageHeadicons[var23].draw(this.projectX - 12, 16083, this.projectY - var21);
									var21 -= 25;
								}
							}
						}
					}
					if (var2 >= 0 && this.hintType == 10 && this.playerIds[var2] == this.hintPlayer) {
						this.projectFromGround(true, var19, var19.height + 15);
						if (this.projectX > -1) {
							this.imageHeadicons[7].draw(this.projectX - 12, 16083, this.projectY - var21);
						}
					}
				}
				if (var19.chat != null && (var2 >= this.playerCount || this.publicChatSetting == 0 || this.publicChatSetting == 3 || this.publicChatSetting == 1 && this.isFriend(false, ((PlayerEntity) var19).name))) {
					this.projectFromGround(true, var19, var19.height);
					if (this.projectX > -1 && this.chatCount < this.MAX_CHATS) {
						this.chatWidth[this.chatCount] = this.fontBold12.stringWidth(var19.chat, true) / 2;
						this.chatHeight[this.chatCount] = this.fontBold12.height;
						this.chatX[this.chatCount] = this.projectX;
						this.chatY[this.chatCount] = this.projectY;
						this.chatColors[this.chatCount] = var19.chatColor;
						this.chatStyles[this.chatCount] = var19.chatStyle;
						this.chatTimers[this.chatCount] = var19.chatTimer;
						this.chats[this.chatCount++] = var19.chat;
						if (this.chatEffects == 0 && var19.chatStyle >= 1 && var19.chatStyle <= 3) {
							this.chatHeight[this.chatCount] += 10;
							this.chatY[this.chatCount] += 5;
						}
						if (this.chatEffects == 0 && var19.chatStyle == 4) {
							this.chatWidth[this.chatCount] = 60;
						}
						if (this.chatEffects == 0 && var19.chatStyle == 5) {
							this.chatHeight[this.chatCount] += 5;
						}
					}
				}
				if (var19.combatCycle > loopCycle) {
					this.projectFromGround(true, var19, var19.height + 15);
					if (this.projectX > -1) {
						int var25 = var19.health * 30 / var19.totalHealth;
						if (var25 > 30) {
							var25 = 30;
						}
						Pix2D.fillRect(5, this.projectY - 3, this.projectX - 15, 65280, var25, 0);
						Pix2D.fillRect(5, this.projectY - 3, this.projectX - 15 + var25, 16711680, 30 - var25, 0);
					}
				}
				for (int var26 = 0; var26 < 4; var26++) {
					if (var19.damageCycle[var26] > loopCycle) {
						this.projectFromGround(true, var19, var19.height / 2);
						if (this.projectX > -1) {
							if (var26 == 1) {
								this.projectY -= 20;
							}
							if (var26 == 2) {
								this.projectX -= 15;
								this.projectY -= 10;
							}
							if (var26 == 3) {
								this.projectX += 15;
								this.projectY -= 10;
							}
							this.imageHitmarks[var19.damageType[var26]].draw(this.projectX - 12, 16083, this.projectY - 12);
							this.fontPlain11.drawStringCenter(0, String.valueOf(var19.damage[var26]), 23693, this.projectY + 4, this.projectX);
							this.fontPlain11.drawStringCenter(16777215, String.valueOf(var19.damage[var26]), 23693, this.projectY + 3, this.projectX - 1);
						}
					}
				}
			}
		}
		if (arg0 != 0) {
			this.load();
		}
		for (int var3 = 0; var3 < this.chatCount; var3++) {
			int var4 = this.chatX[var3];
			int var5 = this.chatY[var3];
			int var6 = this.chatWidth[var3];
			int var7 = this.chatHeight[var3];
			boolean var8 = true;
			while (var8) {
				var8 = false;
				for (int var18 = 0; var18 < var3; var18++) {
					if (var5 + 2 > this.chatY[var18] - this.chatHeight[var18] && var5 - var7 < this.chatY[var18] + 2 && var4 - var6 < this.chatWidth[var18] + this.chatX[var18] && var4 + var6 > this.chatX[var18] - this.chatWidth[var18] && this.chatY[var18] - this.chatHeight[var18] < var5) {
						var5 = this.chatY[var18] - this.chatHeight[var18];
						var8 = true;
					}
				}
			}
			this.projectX = this.chatX[var3];
			this.projectY = this.chatY[var3] = var5;
			String var9 = this.chats[var3];
			if (this.chatEffects == 0) {
				int var10 = 16776960;
				if (this.chatColors[var3] < 6) {
					var10 = this.CHAT_COLORS[this.chatColors[var3]];
				}
				if (this.chatColors[var3] == 6) {
					var10 = this.sceneCycle % 20 < 10 ? 16711680 : 16776960;
				}
				if (this.chatColors[var3] == 7) {
					var10 = this.sceneCycle % 20 < 10 ? 255 : 65535;
				}
				if (this.chatColors[var3] == 8) {
					var10 = this.sceneCycle % 20 < 10 ? 45056 : 8454016;
				}
				if (this.chatColors[var3] == 9) {
					int var11 = 150 - this.chatTimers[var3];
					if (var11 < 50) {
						var10 = var11 * 1280 + 16711680;
					} else if (var11 < 100) {
						var10 = 16776960 - (var11 - 50) * 327680;
					} else if (var11 < 150) {
						var10 = (var11 - 100) * 5 + 65280;
					}
				}
				if (this.chatColors[var3] == 10) {
					int var12 = 150 - this.chatTimers[var3];
					if (var12 < 50) {
						var10 = var12 * 5 + 16711680;
					} else if (var12 < 100) {
						var10 = 16711935 - (var12 - 50) * 327680;
					} else if (var12 < 150) {
						var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
					}
				}
				if (this.chatColors[var3] == 11) {
					int var13 = 150 - this.chatTimers[var3];
					if (var13 < 50) {
						var10 = 16777215 - var13 * 327685;
					} else if (var13 < 100) {
						var10 = (var13 - 50) * 327685 + 65280;
					} else if (var13 < 150) {
						var10 = 16777215 - (var13 - 100) * 327680;
					}
				}
				if (this.chatStyles[var3] == 0) {
					this.fontBold12.drawStringCenter(0, var9, 23693, this.projectY + 1, this.projectX);
					this.fontBold12.drawStringCenter(var10, var9, 23693, this.projectY, this.projectX);
				}
				if (this.chatStyles[var3] == 1) {
					this.fontBold12.drawStringWave(0, true, var9, this.projectX, this.sceneCycle, this.projectY + 1);
					this.fontBold12.drawStringWave(var10, true, var9, this.projectX, this.sceneCycle, this.projectY);
				}
				if (this.chatStyles[var3] == 2) {
					this.fontBold12.drawStringWave2(this.projectX, var9, this.sceneCycle, this.projectY + 1, this._flowObfuscator36, 0);
					this.fontBold12.drawStringWave2(this.projectX, var9, this.sceneCycle, this.projectY, this._flowObfuscator36, var10);
				}
				if (this.chatStyles[var3] == 3) {
					this.fontBold12.drawStringShake(150 - this.chatTimers[var3], var9, true, this.sceneCycle, this.projectY + 1, this.projectX, 0);
					this.fontBold12.drawStringShake(150 - this.chatTimers[var3], var9, true, this.sceneCycle, this.projectY, this.projectX, var10);
				}
				if (this.chatStyles[var3] == 4) {
					int var14 = this.fontBold12.stringWidth(var9, true);
					int var15 = (150 - this.chatTimers[var3]) * (var14 + 100) / 150;
					Pix2D.setBounds(334, this.projectX - 50, false, this.projectX + 50, 0);
					this.fontBold12.drawString(0, var9, this.projectY + 1, 822, this.projectX + 50 - var15);
					this.fontBold12.drawString(var10, var9, this.projectY, 822, this.projectX + 50 - var15);
					Pix2D.resetBounds(4);
				}
				if (this.chatStyles[var3] == 5) {
					int var16 = 150 - this.chatTimers[var3];
					int var17 = 0;
					if (var16 < 25) {
						var17 = var16 - 25;
					} else if (var16 > 125) {
						var17 = var16 - 125;
					}
					Pix2D.setBounds(this.projectY + 5, 0, false, 512, this.projectY - this.fontBold12.height - 1);
					this.fontBold12.drawStringCenter(0, var9, 23693, this.projectY + 1 + var17, this.projectX);
					this.fontBold12.drawStringCenter(var10, var9, 23693, this.projectY + var17, this.projectX);
					Pix2D.resetBounds(4);
				}
			} else {
				this.fontBold12.drawStringCenter(0, var9, 23693, this.projectY + 1, this.projectX);
				this.fontBold12.drawStringCenter(16776960, var9, 23693, this.projectY, this.projectX);
			}
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void removeFriend(boolean arg0, long arg1) {
		if (arg1 == 0L) {
			return;
		}
		for (int var4 = 0; var4 < this.friendCount; var4++) {
			if (this.friendName37[var4] == arg1) {
				this.friendCount--;
				this.redrawSidebar = true;
				for (int var5 = var4; var5 < this.friendCount; var5++) {
					this.friendName[var5] = this.friendName[var5 + 1];
					this.friendWorld[var5] = this.friendWorld[var5 + 1];
					this.friendName37[var5] = this.friendName37[var5 + 1];
				}
				this.out.p1isaac((byte) 6, 215);
				this.out.p8(5, arg1);
				break;
			}
		}
		if (!arg0) {
			;
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void drawSidebar(byte arg0) {
		this.areaSidebar.bind(0);
		Pix3D.lineOffset = this.areaSidebarOffsets;
		if (arg0 != -81) {
			return;
		}
		this.imageInvback.draw(0, 16083, 0);
		if (this.sidebarInterfaceId != -1) {
			this.drawInterface(8, 0, 0, Component.instances[this.sidebarInterfaceId], 0);
		} else if (this.tabInterfaceId[this.selectedTab] != -1) {
			this.drawInterface(8, 0, 0, Component.instances[this.tabInterfaceId[this.selectedTab]], 0);
		}
		if (this.menuVisible && this.menuArea == 1) {
			this.drawMenu((byte) 9);
		}
		this.areaSidebar.draw(205, 23680, super.graphics, 553);
		this.areaViewport.bind(0);
		Pix3D.lineOffset = this.areaViewportOffsets;
	}

	@ObfuscatedName("client.d(II)V")
	public final void updateTextures(int arg0, int arg1) {
		if (arg0 <= 0) {
			this.packetType = -1;
		}
		if (lowMemory) {
			return;
		}
		if (Pix3D.textureCycle[17] >= arg1) {
			Pix8 var3 = Pix3D.textures[17];
			int var4 = var3.cropBottom * var3.cropRight - 1;
			int var5 = this.sceneDelta * var3.cropRight * 2;
			byte[] var6 = var3.pixels;
			byte[] var7 = this.textureBuffer;
			for (int var8 = 0; var8 <= var4; var8++) {
				var7[var8] = var6[var8 - var5 & var4];
			}
			var3.pixels = var7;
			this.textureBuffer = var6;
			Pix3D.pushTexture(17, -477);
			cyclelogic2++;
			if (cyclelogic2 > 1235) {
				cyclelogic2 = 0;
				this.out.p1isaac((byte) 6, 226);
				this.out.p1(0);
				int var9 = this.out.pos;
				this.out.p2(58722);
				this.out.p1(240);
				this.out.p2((int) (Math.random() * 65536.0D));
				this.out.p1((int) (Math.random() * 256.0D));
				if ((int) (Math.random() * 2.0D) == 0) {
					this.out.p2(51825);
				}
				this.out.p1((int) (Math.random() * 256.0D));
				this.out.p2((int) (Math.random() * 65536.0D));
				this.out.p2(7130);
				this.out.p2((int) (Math.random() * 65536.0D));
				this.out.p2(61657);
				this.out.psize1(this.out.pos - var9, (byte) 0);
			}
		}
		if (Pix3D.textureCycle[24] >= arg1) {
			Pix8 var10 = Pix3D.textures[24];
			int var11 = var10.cropBottom * var10.cropRight - 1;
			int var12 = this.sceneDelta * var10.cropRight * 2;
			byte[] var13 = var10.pixels;
			byte[] var14 = this.textureBuffer;
			for (int var15 = 0; var15 <= var11; var15++) {
				var14[var15] = var13[var15 - var12 & var11];
			}
			var10.pixels = var14;
			this.textureBuffer = var13;
			Pix3D.pushTexture(24, -477);
		}
		if (Pix3D.textureCycle[34] < arg1) {
			return;
		}
		Pix8 var16 = Pix3D.textures[34];
		int var17 = var16.cropBottom * var16.cropRight - 1;
		int var18 = this.sceneDelta * var16.cropRight * 2;
		byte[] var19 = var16.pixels;
		byte[] var20 = this.textureBuffer;
		for (int var21 = 0; var21 <= var17; var21++) {
			var20[var21] = var19[var21 - var18 & var17];
		}
		var16.pixels = var20;
		this.textureBuffer = var19;
		Pix3D.pushTexture(34, -477);
		return;
	}

	@ObfuscatedName("client.c(B)V")
	public final void updateEntityChats(byte arg0) {
		if (arg0 != -92) {
			this.out.p1(214);
		}
		for (int var2 = -1; var2 < this.playerCount; var2++) {
			int var6;
			if (var2 == -1) {
				var6 = this.LOCAL_PLAYER_INDEX;
			} else {
				var6 = this.playerIds[var2];
			}
			PlayerEntity var7 = this.players[var6];
			if (var7 != null && var7.chatTimer > 0) {
				var7.chatTimer--;
				if (var7.chatTimer == 0) {
					var7.chat = null;
				}
			}
		}
		for (int var3 = 0; var3 < this.npcCount; var3++) {
			int var4 = this.npcIds[var3];
			NpcEntity var5 = this.npcs[var4];
			if (var5 != null && var5.chatTimer > 0) {
				var5.chatTimer--;
				if (var5.chatTimer == 0) {
					var5.chat = null;
				}
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void applyCutscene(byte arg0) {
		int var2 = this.cutsceneSrcLocalTileX * 128 + 64;
		int var3 = this.cutsceneSrcLocalTileZ * 128 + 64;
		int var4 = this.getHeightmapY(this.currentLevel, var3, true, var2) - this.cutsceneSrcHeight;
		if (this.cameraX < var2) {
			this.cameraX += (var2 - this.cameraX) * this.cutsceneMoveAcceleration / 1000 + this.cutsceneMoveSpeed;
			if (this.cameraX > var2) {
				this.cameraX = var2;
			}
		}
		if (this.cameraX > var2) {
			this.cameraX -= (this.cameraX - var2) * this.cutsceneMoveAcceleration / 1000 + this.cutsceneMoveSpeed;
			if (this.cameraX < var2) {
				this.cameraX = var2;
			}
		}
		if (this.cameraY < var4) {
			this.cameraY += (var4 - this.cameraY) * this.cutsceneMoveAcceleration / 1000 + this.cutsceneMoveSpeed;
			if (this.cameraY > var4) {
				this.cameraY = var4;
			}
		}
		if (this.cameraY > var4) {
			this.cameraY -= (this.cameraY - var4) * this.cutsceneMoveAcceleration / 1000 + this.cutsceneMoveSpeed;
			if (this.cameraY < var4) {
				this.cameraY = var4;
			}
		}
		if (this.cameraZ < var3) {
			this.cameraZ += (var3 - this.cameraZ) * this.cutsceneMoveAcceleration / 1000 + this.cutsceneMoveSpeed;
			if (this.cameraZ > var3) {
				this.cameraZ = var3;
			}
		}
		if (this.cameraZ > var3) {
			this.cameraZ -= (this.cameraZ - var3) * this.cutsceneMoveAcceleration / 1000 + this.cutsceneMoveSpeed;
			if (this.cameraZ < var3) {
				this.cameraZ = var3;
			}
		}
		int var5 = this.cutsceneDstLocalTileX * 128 + 64;
		int var6 = this.cutsceneDstLocalTileZ * 128 + 64;
		int var7 = this.getHeightmapY(this.currentLevel, var6, true, var5) - this.cutsceneDstHeight;
		int var8 = var5 - this.cameraX;
		int var9 = var7 - this.cameraY;
		int var10 = var6 - this.cameraZ;
		int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
		int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 0x7FF;
		if (arg0 == 5) {
			boolean var13 = false;
		}
		int var14 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 0x7FF;
		if (var12 < 128) {
			var12 = 128;
		}
		if (var12 > 383) {
			var12 = 383;
		}
		if (this.cameraPitch < var12) {
			this.cameraPitch += (var12 - this.cameraPitch) * this.cutsceneRotateAcceleration / 1000 + this.cutsceneRotateSpeed;
			if (this.cameraPitch > var12) {
				this.cameraPitch = var12;
			}
		}
		if (this.cameraPitch > var12) {
			this.cameraPitch -= (this.cameraPitch - var12) * this.cutsceneRotateAcceleration / 1000 + this.cutsceneRotateSpeed;
			if (this.cameraPitch < var12) {
				this.cameraPitch = var12;
			}
		}
		int var15 = var14 - this.cameraYaw;
		if (var15 > 1024) {
			var15 -= 2048;
		}
		if (var15 < -1024) {
			var15 += 2048;
		}
		if (var15 > 0) {
			this.cameraYaw += this.cutsceneRotateAcceleration * var15 / 1000 + this.cutsceneRotateSpeed;
			this.cameraYaw &= 0x7FF;
		}
		if (var15 < 0) {
			this.cameraYaw -= -var15 * this.cutsceneRotateAcceleration / 1000 + this.cutsceneRotateSpeed;
			this.cameraYaw &= 0x7FF;
		}
		int var16 = var14 - this.cameraYaw;
		if (var16 > 1024) {
			var16 -= 2048;
		}
		if (var16 < -1024) {
			var16 += 2048;
		}
		if (var16 < 0 && var15 > 0 || var16 > 0 && var15 < 0) {
			this.cameraYaw = var14;
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void drawMenu(byte arg0) {
		int var2 = this.menuX;
		int var3 = this.menuY;
		int var4 = this.menuWidth;
		int var5 = this.menuHeight;
		int var6 = 6116423;
		Pix2D.fillRect(var5, var3, var2, var6, var4, 0);
		if (arg0 != 9) {
			return;
		}
		boolean var7 = false;
		Pix2D.fillRect(16, var3 + 1, var2 + 1, 0, var4 - 2, 0);
		Pix2D.drawRect(var2 + 1, var4 - 2, var5 - 19, 0, var3 + 18, true);
		this.fontBold12.drawString(var6, "Choose Option", var3 + 14, 822, var2 + 3);
		int var8 = super.mouseX;
		int var9 = super.mouseY;
		if (this.menuArea == 0) {
			var8 -= 4;
			var9 -= 4;
		}
		if (this.menuArea == 1) {
			var8 -= 553;
			var9 -= 205;
		}
		if (this.menuArea == 2) {
			var8 -= 17;
			var9 -= 357;
		}
		for (int var10 = 0; var10 < this.menuSize; var10++) {
			int var11 = (this.menuSize - 1 - var10) * 15 + var3 + 31;
			int var12 = 16777215;
			if (var8 > var2 && var8 < var2 + var4 && var9 > var11 - 13 && var9 < var11 + 3) {
				var12 = 16776960;
			}
			this.fontBold12.drawStringTag(false, true, var2 + 3, var12, this.menuOption[var10], var11);
		}
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void addFriend(byte arg0, long arg1) {
		if (arg1 == 0L) {
			return;
		}
		if (this.friendCount >= 100 && this.isMember != 1) {
			this.addMessage("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "", this._flowObfuscator21);
		} else if (this.friendCount >= 200) {
			this.addMessage("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "", this._flowObfuscator21);
		} else {
			String var4 = JString.toSentenceCase(-45804, JString.fromBase37(arg1, (byte) -99));
			for (int var5 = 0; var5 < this.friendCount; var5++) {
				if (this.friendName37[var5] == arg1) {
					this.addMessage(var4 + " is already on your friend list", 0, "", this._flowObfuscator21);
					return;
				}
			}
			if (arg0 != 68) {
				this.packetType = -1;
			}
			for (int var6 = 0; var6 < this.ignoreCount; var6++) {
				if (this.ignoreName37[var6] == arg1) {
					this.addMessage("Please remove " + var4 + " from your ignore list first", 0, "", this._flowObfuscator21);
					return;
				}
			}
			if (!var4.equals(localPlayer.name)) {
				this.friendName[this.friendCount] = var4;
				this.friendName37[this.friendCount] = arg1;
				this.friendWorld[this.friendCount] = 0;
				this.friendCount++;
				this.redrawSidebar = true;
				this.out.p1isaac((byte) 6, 188);
				this.out.p8(5, arg1);
			}
		}
	}

	@ObfuscatedName("client.a(IIZI)I")
	public final int getHeightmapY(int arg0, int arg1, boolean arg2, int arg3) {
		this.ingame &= arg2;
		int var5 = arg3 >> 7;
		int var6 = arg1 >> 7;
		if (var5 < 0 || var6 < 0 || var5 > 103 || var6 > 103) {
			return 0;
		}
		int var7 = arg0;
		if (arg0 < 3 && (this.levelTileFlags[1][var5][var6] & 0x2) == 2) {
			var7 = arg0 + 1;
		}
		int var8 = arg3 & 0x7F;
		int var9 = arg1 & 0x7F;
		int var10 = (128 - var8) * this.levelHeightmap[var7][var5][var6] + this.levelHeightmap[var7][var5 + 1][var6] * var8 >> 7;
		int var11 = (128 - var8) * this.levelHeightmap[var7][var5][var6 + 1] + this.levelHeightmap[var7][var5 + 1][var6 + 1] * var8 >> 7;
		return (128 - var9) * var10 + var9 * var11 >> 7;
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public static final String formatObjCount(int arg0, int arg1) {
		if (arg0 != -33245) {
			_flowObfuscator8 = -65;
		}
		if (arg1 < 100000) {
			return String.valueOf(arg1);
		} else if (arg1 < 10000000) {
			return arg1 / 1000 + "K";
		} else {
			return arg1 / 1000000 + "M";
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void logout(boolean arg0) {
		try {
			if (this.stream != null) {
				this.stream.close();
			}
		} catch (Exception var3) {
		}
		this.stream = null;
		if (!arg0) {
			return;
		}
		this.ingame = false;
		this.titleScreenState = 0;
		this.username = "";
		this.password = "";
		this.clearCache(false);
		this.scene.reset(619);
		for (int var2 = 0; var2 < 4; var2++) {
			this.levelCollisionMap[var2].reset();
		}
		System.gc();
		this.stopMidi(860);
		this.nextMidiSong = -1;
		this.midiSong = -1;
		this.nextMusicDelay = 0;
	}

	@ObfuscatedName("client.n(I)V")
	public final void validateCharacterDesign(int arg0) {
		if (arg0 != 0) {
			this.packetType = -1;
		}
		this.updateDesignModel = true;
		for (int var2 = 0; var2 < 7; var2++) {
			this.designIdentikits[var2] = -1;
			for (int var3 = 0; var3 < IdkType.count; var3++) {
				if (!IdkType.instances[var3].disable && IdkType.instances[var3].type == var2 + (this.designGenderMale ? 0 : 7)) {
					this.designIdentikits[var2] = var3;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILMBMGIXGO;B)V")
	public final void readNewNpcs(int arg0, Packet arg1, byte arg2) {
		if (arg2 != 2) {
			for (int var4 = 1; var4 > 0; var4++) {
			}
		}
		while (arg1.bitPos + 21 < arg0 * 8) {
			int var5 = arg1.gBit(14, 0);
			if (var5 == 16383) {
				break;
			}
			if (this.npcs[var5] == null) {
				this.npcs[var5] = new NpcEntity();
			}
			NpcEntity var6 = this.npcs[var5];
			this.npcIds[this.npcCount++] = var5;
			var6.cycle = loopCycle;
			int var7 = arg1.gBit(5, 0);
			if (var7 > 15) {
				var7 -= 32;
			}
			int var8 = arg1.gBit(5, 0);
			if (var8 > 15) {
				var8 -= 32;
			}
			int var9 = arg1.gBit(1, 0);
			var6.type = NpcType.get(arg1.gBit(12, 0));
			int var10 = arg1.gBit(1, 0);
			if (var10 == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = var5;
			}
			var6.size = var6.type.size;
			var6.turnSpeed = var6.type.turnspeed;
			var6.seqWalkId = var6.type.walkanim;
			var6.seqTurnAroundId = var6.type.walkanim_b;
			var6.seqTurnLeftId = var6.type.walkanim_r;
			var6.seqTurnRightId = var6.type.walkanim_l;
			var6.seqStandId = var6.type.readyanim;
			var6.move(localPlayer.pathTileX[0] + var8, localPlayer.pathTileZ[0] + var7, var9 == 1, false);
		}
		arg1.accessBytes(true);
	}

	@ObfuscatedName("client.c(I)V")
	public final void update(int arg0) {
		if (this.errorStarted || this.errorLoading || this.errorHost) {
			return;
		}
		loopCycle++;
		if (this.ingame) {
			this.updateGame(this._flowObfuscator40);
		} else {
			this.updateTitle(true);
		}
		this.handleOnDemandRequests(false);
		if (this._flowObfuscator27 != arg0) {
			_flowObfuscator14 = true;
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void pushPlayers(int arg0, boolean arg1) {
		if (localPlayer.x >> 7 == this.flagSceneTileX && localPlayer.z >> 7 == this.flagSceneTileZ) {
			this.flagSceneTileX = 0;
		}
		int var3 = this.playerCount;
		if (arg0 != 0) {
			for (int var4 = 1; var4 > 0; var4++) {
			}
		}
		if (arg1) {
			var3 = 1;
		}
		for (int var5 = 0; var5 < var3; var5++) {
			PlayerEntity var6;
			int var7;
			if (arg1) {
				var6 = localPlayer;
				var7 = this.LOCAL_PLAYER_INDEX << 14;
			} else {
				var6 = this.players[this.playerIds[var5]];
				var7 = this.playerIds[var5] << 14;
			}
			if (var6 != null && var6.isVisible(_flowObfuscator41)) {
				var6.lowmem = false;
				if ((lowMemory && this.playerCount > 50 || this.playerCount > 200) && !arg1 && var6.secondarySeqId == var6.seqStandId) {
					var6.lowmem = true;
				}
				int var8 = var6.x >> 7;
				int var9 = var6.z >> 7;
				if (var8 >= 0 && var8 < 104 && var9 >= 0 && var9 < 104) {
					if (var6.locModel == null || loopCycle < var6.locStartCycle || loopCycle >= var6.locStopCycle) {
						if ((var6.x & 0x7F) == 64 && (var6.z & 0x7F) == 64) {
							if (this.tileLastOccupiedCycle[var8][var9] == this.sceneCycle) {
								continue;
							}
							this.tileLastOccupiedCycle[var8][var9] = this.sceneCycle;
						}
						var6.y = this.getHeightmapY(this.currentLevel, var6.z, true, var6.x);
						this.scene.addTemporary(this.currentLevel, var6.yaw, (byte) 6, var6.y, var7, var6.z, 60, var6.x, var6, var6.needsForwardDrawPadding);
					} else {
						var6.lowmem = false;
						var6.y = this.getHeightmapY(this.currentLevel, var6.z, true, var6.x);
						this.scene.addTemporary(60, this.currentLevel, var6.z, var6, var6.yaw, var6.maxTileZ, var6.x, var6.y, var6.minTileX, var6.maxTileX, var7, var6.minTileZ, (byte) 35);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILDUCMKFAY;)Z")
	public final boolean handleInterfaceAction(int arg0, Component arg1) {
		if (arg0 <= 0) {
			this.packetType = -1;
		}
		int var3 = arg1.clientCode;
		if (this.friendListStatus == 2) {
			if (var3 == 201) {
				this.redrawChatback = true;
				this.chatbackInputOpen = 0;
				this.showSocialInput = true;
				this.socialInput = "";
				this.socialAction = 1;
				this.socialMessage = "Enter name of friend to add to list";
			}
			if (var3 == 202) {
				this.redrawChatback = true;
				this.chatbackInputOpen = 0;
				this.showSocialInput = true;
				this.socialInput = "";
				this.socialAction = 2;
				this.socialMessage = "Enter name of friend to delete from list";
			}
		}
		if (var3 == 205) {
			this.idleTimeout = 250;
			return true;
		}
		if (var3 == 501) {
			this.redrawChatback = true;
			this.chatbackInputOpen = 0;
			this.showSocialInput = true;
			this.socialInput = "";
			this.socialAction = 4;
			this.socialMessage = "Enter name of player to add to list";
		}
		if (var3 == 502) {
			this.redrawChatback = true;
			this.chatbackInputOpen = 0;
			this.showSocialInput = true;
			this.socialInput = "";
			this.socialAction = 5;
			this.socialMessage = "Enter name of player to delete from list";
		}
		if (var3 >= 300 && var3 <= 313) {
			int var4 = (var3 - 300) / 2;
			int var5 = var3 & 0x1;
			int var6 = this.designIdentikits[var4];
			if (var6 != -1) {
				while (true) {
					if (var5 == 0) {
						var6--;
						if (var6 < 0) {
							var6 = IdkType.count - 1;
						}
					}
					if (var5 == 1) {
						var6++;
						if (var6 >= IdkType.count) {
							var6 = 0;
						}
					}
					if (!IdkType.instances[var6].disable && IdkType.instances[var6].type == var4 + (this.designGenderMale ? 0 : 7)) {
						this.designIdentikits[var4] = var6;
						this.updateDesignModel = true;
						break;
					}
				}
			}
		}
		if (var3 >= 314 && var3 <= 323) {
			int var7 = (var3 - 314) / 2;
			int var8 = var3 & 0x1;
			int var9 = this.designColors[var7];
			if (var8 == 0) {
				var9--;
				if (var9 < 0) {
					var9 = DESIGN_BODY_COLOR[var7].length - 1;
				}
			}
			if (var8 == 1) {
				var9++;
				if (var9 >= DESIGN_BODY_COLOR[var7].length) {
					var9 = 0;
				}
			}
			this.designColors[var7] = var9;
			this.updateDesignModel = true;
		}
		if (var3 == 324 && !this.designGenderMale) {
			this.designGenderMale = true;
			this.validateCharacterDesign(0);
		}
		if (var3 == 325 && this.designGenderMale) {
			this.designGenderMale = false;
			this.validateCharacterDesign(0);
		}
		if (var3 == 326) {
			this.out.p1isaac((byte) 6, 101);
			this.out.p1(this.designGenderMale ? 0 : 1);
			for (int var10 = 0; var10 < 7; var10++) {
				this.out.p1(this.designIdentikits[var10]);
			}
			for (int var11 = 0; var11 < 5; var11++) {
				this.out.p1(this.designColors[var11]);
			}
			return true;
		}
		if (var3 == 613) {
			this.reportAbuseMuteOption = !this.reportAbuseMuteOption;
		}
		if (var3 >= 601 && var3 <= 612) {
			this.closeInterfaces(537);
			if (this.reportAbuseInput.length() > 0) {
				this.out.p1isaac((byte) 6, 218);
				this.out.p8(5, JString.toBase37(this.reportAbuseInput));
				this.out.p1(var3 - 601);
				this.out.p1(this.reportAbuseMuteOption ? 1 : 0);
			}
		}
		return false;
	}

	@ObfuscatedName("client.a(IBLMBMGIXGO;)V")
	public final void readPlayerUpdates(int arg0, byte arg1, Packet arg2) {
		if (arg1 != 2) {
			return;
		}
		boolean var4 = false;
		for (int var5 = 0; var5 < this.entityUpdateCount; var5++) {
			int var6 = this.entityUpdateIds[var5];
			PlayerEntity var7 = this.players[var6];
			int var8 = arg2.g1();
			if ((var8 & 0x40) != 0) {
				var8 += arg2.g1() << 8;
			}
			this.readPlayerUpdates(var8, var6, arg2, this._flowObfuscator17, var7);
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void drawMinimapLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = this.scene.getWallBitset(arg5, arg3, arg0);
		if (arg1 >= 0) {
			return;
		}
		if (var7 != 0) {
			int var8 = this.scene.getInfo(arg5, arg3, arg0, var7);
			int var9 = var8 >> 6 & 0x3;
			int var10 = var8 & 0x1F;
			int var11 = arg2;
			if (var7 > 0) {
				var11 = arg4;
			}
			int[] var12 = this.imageMinimap.pixels;
			int var13 = (103 - arg0) * 512 * 4 + arg3 * 4 + 24624;
			int var14 = var7 >> 14 & 0x7FFF;
			LocType var15 = LocType.get(var14);
			if (var15.mapscene == -1) {
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
				Pix8 var16 = this.imageMapscene[var15.mapscene];
				if (var16 != null) {
					int var17 = (var15.width * 4 - var16.cropRight) / 2;
					int var18 = (var15.length * 4 - var16.cropBottom) / 2;
					var16.draw(arg3 * 4 + 48 + var17, 16083, (104 - arg0 - var15.length) * 4 + 48 + var18);
				}
			}
		}
		int var19 = this.scene.getLocBitset(arg5, arg3, arg0);
		if (var19 != 0) {
			int var20 = this.scene.getInfo(arg5, arg3, arg0, var19);
			int var21 = var20 >> 6 & 0x3;
			int var22 = var20 & 0x1F;
			int var23 = var19 >> 14 & 0x7FFF;
			LocType var24 = LocType.get(var23);
			if (var24.mapscene != -1) {
				Pix8 var25 = this.imageMapscene[var24.mapscene];
				if (var25 != null) {
					int var26 = (var24.width * 4 - var25.cropRight) / 2;
					int var27 = (var24.length * 4 - var25.cropBottom) / 2;
					var25.draw(arg3 * 4 + 48 + var26, 16083, (104 - arg0 - var24.length) * 4 + 48 + var27);
				}
			} else if (var22 == 9) {
				int var28 = 15658734;
				if (var19 > 0) {
					var28 = 15597568;
				}
				int[] var29 = this.imageMinimap.pixels;
				int var30 = (103 - arg0) * 512 * 4 + arg3 * 4 + 24624;
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
		int var31 = this.scene.getGroundDecorationBitset(arg5, arg3, arg0);
		if (var31 == 0) {
			return;
		}
		int var32 = var31 >> 14 & 0x7FFF;
		LocType var33 = LocType.get(var32);
		if (var33.mapscene == -1) {
			return;
		}
		Pix8 var34 = this.imageMapscene[var33.mapscene];
		if (var34 != null) {
			int var35 = (var33.width * 4 - var34.cropRight) / 2;
			int var36 = (var33.length * 4 - var34.cropBottom) / 2;
			var34.draw(arg3 * 4 + 48 + var35, 16083, (104 - arg0 - var33.length) * 4 + 48 + var36);
			return;
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void loadTitleImages(int arg0) {
		this.imageTitlebox = new Pix8(this.archiveTitle, "titlebox", 0);
		if (arg0 <= 0) {
			_flowObfuscator42 = !_flowObfuscator42;
		}
		this.imageTitlebutton = new Pix8(this.archiveTitle, "titlebutton", 0);
		this.imageRunes = new Pix8[12];
		int var2 = 0;
		try {
			var2 = Integer.parseInt(this.getParameter("fl_icon"));
		} catch (Exception var19) {
		}
		if (var2 == 0) {
			for (int var3 = 0; var3 < 12; var3++) {
				this.imageRunes[var3] = new Pix8(this.archiveTitle, "runes", var3);
			}
		} else {
			for (int var4 = 0; var4 < 12; var4++) {
				this.imageRunes[var4] = new Pix8(this.archiveTitle, "runes", (var4 & 0x3) + 12);
			}
		}
		this.imageFlamesLeft = new Pix32(128, 265);
		this.imageFlamesRight = new Pix32(128, 265);
		for (int var5 = 0; var5 < 33920; var5++) {
			this.imageFlamesLeft.pixels[var5] = this.imageTitle0.data[var5];
		}
		for (int var6 = 0; var6 < 33920; var6++) {
			this.imageFlamesRight.pixels[var6] = this.imageTitle1.data[var6];
		}
		this.flameGradient0 = new int[256];
		for (int var7 = 0; var7 < 64; var7++) {
			this.flameGradient0[var7] = var7 * 262144;
		}
		for (int var8 = 0; var8 < 64; var8++) {
			this.flameGradient0[var8 + 64] = var8 * 1024 + 16711680;
		}
		for (int var9 = 0; var9 < 64; var9++) {
			this.flameGradient0[var9 + 128] = var9 * 4 + 16776960;
		}
		for (int var10 = 0; var10 < 64; var10++) {
			this.flameGradient0[var10 + 192] = 16777215;
		}
		this.flameGradient1 = new int[256];
		for (int var11 = 0; var11 < 64; var11++) {
			this.flameGradient1[var11] = var11 * 1024;
		}
		for (int var12 = 0; var12 < 64; var12++) {
			this.flameGradient1[var12 + 64] = var12 * 4 + 65280;
		}
		for (int var13 = 0; var13 < 64; var13++) {
			this.flameGradient1[var13 + 128] = var13 * 262144 + 65535;
		}
		for (int var14 = 0; var14 < 64; var14++) {
			this.flameGradient1[var14 + 192] = 16777215;
		}
		this.flameGradient2 = new int[256];
		for (int var15 = 0; var15 < 64; var15++) {
			this.flameGradient2[var15] = var15 * 4;
		}
		for (int var16 = 0; var16 < 64; var16++) {
			this.flameGradient2[var16 + 64] = var16 * 262144 + 255;
		}
		for (int var17 = 0; var17 < 64; var17++) {
			this.flameGradient2[var17 + 128] = var17 * 1024 + 16711935;
		}
		for (int var18 = 0; var18 < 64; var18++) {
			this.flameGradient2[var18 + 192] = 16777215;
		}
		this.flameGradient = new int[256];
		this.flameBuffer0 = new int[32768];
		this.flameBuffer1 = new int[32768];
		this.updateFlameBuffer(null, -135);
		this.flameBuffer3 = new int[32768];
		this.flameBuffer2 = new int[32768];
		this.drawProgress(10, (byte) 4, "Connecting to fileserver");
		if (!this.flameActive) {
			this.flamesThread = true;
			this.flameActive = true;
			this.startThread(this, 2);
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public static final void setHighMemory(boolean arg0) {
		World3D.lowMemory = false;
		Pix3D.lowMemory = false;
		lowMemory = false;
		World.lowMemory = false;
		if (arg0) {
			_flowObfuscator14 = true;
		}
		LocType.lowMemory = false;
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 317);
			if (arg0.length == 5) {
				nodeId = Integer.parseInt(arg0[0]);
				portOffset = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					setLowMemory((byte) 77);
				} else if (arg0[2].equals("highmem")) {
					setHighMemory(false);
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					members = false;
				} else if (arg0[3].equals("members")) {
					members = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.initApplication(503, false, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void updateSceneState(int arg0) {
		if (arg0 != -48877) {
			return;
		}
		if (lowMemory && this.sceneState == 2 && World.levelBuilt != this.currentLevel) {
			this.areaViewport.bind(0);
			this.fontPlain12.drawStringCenter(0, "Loading - please wait.", 23693, 151, 257);
			this.fontPlain12.drawStringCenter(16777215, "Loading - please wait.", 23693, 150, 256);
			this.areaViewport.draw(4, 23680, super.graphics, 4);
			this.sceneState = 1;
			this.sceneLoadStartTime = System.currentTimeMillis();
		}
		if (this.sceneState == 1) {
			int var2 = this.checkScene((byte) -95);
			if (var2 != 0 && System.currentTimeMillis() - this.sceneLoadStartTime > 360000L) {
				signlink.reporterror(this.username + " glcfb " + this.serverSeed + "," + var2 + "," + lowMemory + "," + this.fileStreams[0] + "," + this.ondemand.remaining() + "," + this.currentLevel + "," + this.sceneCenterZoneX + "," + this.sceneCenterZoneZ);
				this.sceneLoadStartTime = System.currentTimeMillis();
			}
		}
		if (this.sceneState == 2 && this.minimapLevel != this.currentLevel) {
			this.minimapLevel = this.currentLevel;
			this.createMinimap(true, this.currentLevel);
		}
	}

	@ObfuscatedName("client.f(B)I")
	public final int checkScene(byte arg0) {
		for (int var2 = 0; var2 < this.sceneMapLandData.length; var2++) {
			if (this.sceneMapLandData[var2] == null && this.sceneMapLandFile[var2] != -1) {
				return -1;
			}
			if (this.sceneMapLocData[var2] == null && this.sceneMapLocFile[var2] != -1) {
				return -2;
			}
		}
		boolean var3 = true;
		if (arg0 != -95) {
			return 0;
		}
		for (int var4 = 0; var4 < this.sceneMapLandData.length; var4++) {
			byte[] var5 = this.sceneMapLocData[var4];
			if (var5 != null) {
				int var6 = (this.sceneMapIndex[var4] >> 8) * 64 - this.sceneBaseTileX;
				int var7 = (this.sceneMapIndex[var4] & 0xFF) * 64 - this.sceneBaseTileZ;
				if (this.sceneInstanced) {
					var6 = 10;
					var7 = 10;
				}
				var3 &= World.validateLocs(var6, var5, var7, 6);
			}
		}
		if (!var3) {
			return -3;
		} else if (this.awaitingSync) {
			return -4;
		} else {
			this.sceneState = 2;
			World.levelBuilt = this.currentLevel;
			this.buildScene(true);
			this.out.p1isaac((byte) 6, 121);
			return 0;
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void pushProjectiles(int arg0) {
		while (arg0 >= 0) {
			this.load();
		}
		for (ProjectileEntity var2 = (ProjectileEntity) this.projectiles.head(); var2 != null; var2 = (ProjectileEntity) this.projectiles.next(false)) {
			if (this.currentLevel != var2.level || loopCycle > var2.endCycle) {
				var2.unlink();
			} else if (loopCycle >= var2.startCycle) {
				if (var2.target > 0) {
					NpcEntity var3 = this.npcs[var2.target - 1];
					if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.z >= 0 && var3.z < 13312) {
						var2.updateVelocity(loopCycle, var3.z, this.getHeightmapY(var2.level, var3.z, true, var3.x) - var2.offsetY, var3.x, (byte) -83);
					}
				}
				if (var2.target < 0) {
					int var4 = -var2.target - 1;
					PlayerEntity var5;
					if (this.localPid == var4) {
						var5 = localPlayer;
					} else {
						var5 = this.players[var4];
					}
					if (var5 != null && var5.x >= 0 && var5.x < 13312 && var5.z >= 0 && var5.z < 13312) {
						var2.updateVelocity(loopCycle, var5.z, this.getHeightmapY(var2.level, var5.z, true, var5.x) - var2.offsetY, var5.x, (byte) -83);
					}
				}
				var2.update(this.sceneDelta, this._flowObfuscator24);
				this.scene.addTemporary(this.currentLevel, var2.yaw, (byte) 6, (int) var2.y, -1, (int) var2.z, 60, (int) var2.x, var2, false);
			}
		}
	}

	public final AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@ObfuscatedName("client.r(I)V")
	public final void loadTitleBackground(int arg0) {
		byte[] var2 = this.archiveTitle.read("title.dat", null);
		Pix32 var3 = new Pix32(var2, this);
		this.imageTitle0.bind(0);
		var3.blitOpaque(0, 0, -32357);
		this.imageTitle1.bind(0);
		var3.blitOpaque(-637, 0, -32357);
		this.imageTitle2.bind(0);
		var3.blitOpaque(-128, 0, -32357);
		this.imageTitle3.bind(0);
		var3.blitOpaque(-202, -371, -32357);
		this.imageTitle4.bind(0);
		var3.blitOpaque(-202, -171, -32357);
		this.imageTitle5.bind(0);
		var3.blitOpaque(0, -265, -32357);
		this.imageTitle6.bind(0);
		var3.blitOpaque(-562, -265, -32357);
		this.imageTitle7.bind(0);
		var3.blitOpaque(-128, -171, -32357);
		this.imageTitle8.bind(0);
		var3.blitOpaque(-562, -171, -32357);
		int[] var4 = new int[var3.cropRight];
		for (int var5 = 0; var5 < var3.cropBottom; var5++) {
			for (int var10 = 0; var10 < var3.cropRight; var10++) {
				var4[var10] = var3.pixels[var3.cropRight * var5 + (var3.cropRight - var10 - 1)];
			}
			for (int var11 = 0; var11 < var3.cropRight; var11++) {
				var3.pixels[var3.cropRight * var5 + var11] = var4[var11];
			}
		}
		this.imageTitle0.bind(0);
		var3.blitOpaque(382, 0, -32357);
		this.imageTitle1.bind(0);
		var3.blitOpaque(-255, 0, -32357);
		this.imageTitle2.bind(0);
		var3.blitOpaque(254, 0, -32357);
		this.imageTitle3.bind(0);
		var3.blitOpaque(180, -371, -32357);
		this.imageTitle4.bind(0);
		var3.blitOpaque(180, -171, -32357);
		this.imageTitle5.bind(0);
		var3.blitOpaque(382, -265, -32357);
		this.imageTitle6.bind(0);
		var3.blitOpaque(-180, -265, -32357);
		this.imageTitle7.bind(0);
		var3.blitOpaque(254, -171, -32357);
		this.imageTitle8.bind(0);
		if (arg0 != 0) {
			return;
		}
		var3.blitOpaque(-180, -171, -32357);
		Pix32 var6 = new Pix32(this.archiveTitle, "logo", 0);
		this.imageTitle2.bind(0);
		var6.draw(382 - var6.cropRight / 2 - 128, 16083, 18);
		Object var7 = null;
		Object var8 = null;
		Object var9 = null;
		System.gc();
	}

	@ObfuscatedName("client.f(Z)V")
	public final void handleOnDemandRequests(boolean arg0) {
		if (arg0) {
			this._flowObfuscator12 = -72;
		}
		while (true) {
			OnDemandRequest var2 = this.ondemand.poll();
			if (var2 == null) {
				return;
			}
			if (var2.archive == 0) {
				Model.unpack(var2.data, -4036, var2.file);
				if ((this.ondemand.getModelFlags(var2.file, -203) & 0x62) != 0) {
					this.redrawSidebar = true;
					if (this.chatInterfaceId != -1) {
						this.redrawChatback = true;
					}
				}
			}
			if (var2.archive == 1 && var2.data != null) {
				AnimFrame.unpack(var2.data, false);
			}
			if (var2.archive == 2 && this.midiSong == var2.file && var2.data != null) {
				this.saveMidi(this.midiFading, 0, var2.data);
			}
			if (var2.archive == 3 && this.sceneState == 1) {
				for (int var3 = 0; var3 < this.sceneMapLandData.length; var3++) {
					if (this.sceneMapLandFile[var3] == var2.file) {
						this.sceneMapLandData[var3] = var2.data;
						if (var2.data == null) {
							this.sceneMapLandFile[var3] = -1;
						}
						break;
					}
					if (this.sceneMapLocFile[var3] == var2.file) {
						this.sceneMapLocData[var3] = var2.data;
						if (var2.data == null) {
							this.sceneMapLocFile[var3] = -1;
						}
						break;
					}
				}
			}
			if (var2.archive == 93 && this.ondemand.hasMapLocFile(var2.file, -520)) {
				World.prefetchLocs((byte) -107, new Packet(var2.data, 891), this.ondemand);
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void updateFlames(int arg0) {
		short var2 = 256;
		for (int var3 = 10; var3 < 117; var3++) {
			int var18 = (int) (Math.random() * 100.0D);
			if (var18 < 50) {
				this.flameBuffer3[(var2 - 2 << 7) + var3] = 255;
			}
		}
		if (arg0 != 25106) {
			this.load();
		}
		for (int var4 = 0; var4 < 100; var4++) {
			int var15 = (int) (Math.random() * 124.0D) + 2;
			int var16 = (int) (Math.random() * 128.0D) + 128;
			int var17 = (var16 << 7) + var15;
			this.flameBuffer3[var17] = 192;
		}
		for (int var5 = 1; var5 < var2 - 1; var5++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var5 << 7) + var13;
				this.flameBuffer2[var14] = (this.flameBuffer3[var14 - 1] + this.flameBuffer3[var14 + 1] + this.flameBuffer3[var14 - 128] + this.flameBuffer3[var14 + 128]) / 4;
			}
		}
		this.flameCycle0 += 128;
		if (this.flameCycle0 > this.flameBuffer0.length) {
			this.flameCycle0 -= this.flameBuffer0.length;
			int var6 = (int) (Math.random() * 12.0D);
			this.updateFlameBuffer(this.imageRunes[var6], -135);
		}
		for (int var7 = 1; var7 < var2 - 1; var7++) {
			for (int var10 = 1; var10 < 127; var10++) {
				int var11 = (var7 << 7) + var10;
				int var12 = this.flameBuffer2[var11 + 128] - this.flameBuffer0[this.flameCycle0 + var11 & this.flameBuffer0.length - 1] / 5;
				if (var12 < 0) {
					var12 = 0;
				}
				this.flameBuffer3[var11] = var12;
			}
		}
		for (int var8 = 0; var8 < var2 - 1; var8++) {
			this.flameLineOffset[var8] = this.flameLineOffset[var8 + 1];
		}
		this.flameLineOffset[var2 - 1] = (int) (Math.sin((double) loopCycle / 14.0D) * 16.0D + Math.sin((double) loopCycle / 15.0D) * 14.0D + Math.sin((double) loopCycle / 16.0D) * 12.0D);
		if (this.flameGradientCycle0 > 0) {
			this.flameGradientCycle0 -= 4;
		}
		if (this.flameGradientCycle1 > 0) {
			this.flameGradientCycle1 -= 4;
		}
		if (this.flameGradientCycle0 != 0 || this.flameGradientCycle1 != 0) {
			return;
		}
		int var9 = (int) (Math.random() * 2000.0D);
		if (var9 == 0) {
			this.flameGradientCycle0 = 1024;
		}
		if (var9 == 1) {
			this.flameGradientCycle1 = 1024;
			return;
		}
	}

	@ObfuscatedName("client.a([BBI)Z")
	public final boolean saveWave(byte[] arg0, byte arg1, int arg2) {
		if (arg1 != 116) {
			throw new NullPointerException();
		}
		return arg0 == null ? true : signlink.wavesave(arg0, arg2);
	}

	@ObfuscatedName("client.a(IB)V")
	public final void resetInterfaceAnimation(int arg0, byte arg1) {
		Component var3 = Component.instances[arg0];
		for (int var4 = 0; var4 < var3.children.length && var3.children[var4] != -1; var4++) {
			Component var5 = Component.instances[var3.children[var4]];
			if (var5.type == 1) {
				this.resetInterfaceAnimation(var5.id, (byte) 6);
			}
			var5.animFrame = 0;
			var5.animCycle = 0;
		}
		if (arg1 == 6) {
			boolean var6 = false;
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void drawTileHint(int arg0) {
		if (this.hintType != 2) {
			return;
		}
		this.projectFromGround((this.hintTileX - this.sceneBaseTileX << 7) + this.hintOffsetX, this.hintHeight * 2, this._flowObfuscator9, (this.hintTileZ - this.sceneBaseTileZ << 7) + this.hintOffsetZ);
		if (arg0 >= 0) {
			_flowObfuscator41 = !_flowObfuscator41;
		}
		if (this.projectX > -1 && loopCycle % 20 < 10) {
			this.imageHeadicons[2].draw(this.projectX - 12, 16083, this.projectY - 28);
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void updateGame(int arg0) {
		if (this.systemUpdateTimer > 1) {
			this.systemUpdateTimer--;
		}
		if (this.idleTimeout > 0) {
			this.idleTimeout--;
		}
		for (int var2 = 0; var2 < 5 && this.read(true); var2++) {
		}
		if (!this.ingame) {
			return;
		}
		Object var3 = this.mouseTracking.lock;
		synchronized (this.mouseTracking.lock) {
			if (!flagged) {
				this.mouseTracking.length = 0;
			} else if (super.mouseClickButton != 0 || this.mouseTracking.length >= 40) {
				this.out.p1isaac((byte) 6, 45);
				this.out.p1(0);
				int var4 = this.out.pos;
				int var5 = 0;
				for (int var6 = 0; var6 < this.mouseTracking.length && var4 - this.out.pos < 240; var6++) {
					var5++;
					int var7 = this.mouseTracking.y[var6];
					if (var7 < 0) {
						var7 = 0;
					} else if (var7 > 502) {
						var7 = 502;
					}
					int var8 = this.mouseTracking.x[var6];
					if (var8 < 0) {
						var8 = 0;
					} else if (var8 > 764) {
						var8 = 764;
					}
					int var9 = var7 * 765 + var8;
					if (this.mouseTracking.y[var6] == -1 && this.mouseTracking.x[var6] == -1) {
						var8 = -1;
						var7 = -1;
						var9 = 524287;
					}
					if (this.lastWriteX != var8 || this.lastWriteY != var7) {
						int var10 = var8 - this.lastWriteX;
						this.lastWriteX = var8;
						int var11 = var7 - this.lastWriteY;
						this.lastWriteY = var7;
						if (this.lastWriteDuplicates < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
							var10 += 32;
							var11 += 32;
							this.out.p2((this.lastWriteDuplicates << 12) + (var10 << 6) + var11);
							this.lastWriteDuplicates = 0;
						} else if (this.lastWriteDuplicates < 8) {
							this.out.p3((this.lastWriteDuplicates << 19) + 8388608 + var9);
							this.lastWriteDuplicates = 0;
						} else {
							this.out.p4((this.lastWriteDuplicates << 19) + -1073741824 + var9);
							this.lastWriteDuplicates = 0;
						}
					} else if (this.lastWriteDuplicates < 2047) {
						this.lastWriteDuplicates++;
					}
				}
				this.out.psize1(this.out.pos - var4, (byte) 0);
				if (var5 >= this.mouseTracking.length) {
					this.mouseTracking.length = 0;
				} else {
					this.mouseTracking.length -= var5;
					for (int var12 = 0; var12 < this.mouseTracking.length; var12++) {
						this.mouseTracking.x[var12] = this.mouseTracking.x[var5 + var12];
						this.mouseTracking.y[var12] = this.mouseTracking.y[var5 + var12];
					}
				}
			}
		}
		if (super.mouseClickButton != 0) {
			long var13 = (super.mouseClickTime - this.prevMousePressTime) / 50L;
			if (var13 > 4095L) {
				var13 = 4095L;
			}
			this.prevMousePressTime = super.mouseClickTime;
			int var15 = super.mouseClickY;
			if (var15 < 0) {
				var15 = 0;
			} else if (var15 > 502) {
				var15 = 502;
			}
			int var16 = super.mouseClickX;
			if (var16 < 0) {
				var16 = 0;
			} else if (var16 > 764) {
				var16 = 764;
			}
			int var17 = var15 * 765 + var16;
			byte var18 = 0;
			if (super.mouseClickButton == 2) {
				var18 = 1;
			}
			int var19 = (int) var13;
			this.out.p1isaac((byte) 6, 241);
			this.out.p4((var18 << 19) + (var19 << 20) + var17);
		}
		if (this.sendCameraDelay > 0) {
			this.sendCameraDelay--;
		}
		if (super.actionKey[1] == 1 || super.actionKey[2] == 1 || super.actionKey[3] == 1 || super.actionKey[4] == 1) {
			this.sendCamera = true;
		}
		if (this.sendCamera && this.sendCameraDelay <= 0) {
			this.sendCameraDelay = 20;
			this.sendCamera = false;
			this.out.p1isaac((byte) 6, 86);
			this.out.p2(this.orbitCameraPitch);
			this.out.p2_alt2(-431, this.orbitCameraYaw);
		}
		if (super.hasFocus && !this.focused) {
			this.focused = true;
			this.out.p1isaac((byte) 6, 3);
			this.out.p1(1);
		}
		if (!super.hasFocus && this.focused) {
			this.focused = false;
			this.out.p1isaac((byte) 6, 3);
			this.out.p1(0);
		}
		this.updateSceneState(-48877);
		this.updateTemporaryLocs((byte) 8);
		this.updateAudio(false);
		this.idleNetCycles++;
		if (this.idleNetCycles > 750) {
			this.tryReconnect(-670);
		}
		this.updatePlayers((byte) -74);
		this.updateNpcs(-8066);
		this.updateEntityChats((byte) -92);
		this.sceneDelta++;
		if (this.crossMode != 0) {
			this.crossCycle += 20;
			if (this.crossCycle >= 400) {
				this.crossMode = 0;
			}
		}
		if (this.selectedArea != 0) {
			this.selectedCycle++;
			if (this.selectedCycle >= 15) {
				if (this.selectedArea == 2) {
					this.redrawSidebar = true;
				}
				if (this.selectedArea == 3) {
					this.redrawChatback = true;
				}
				this.selectedArea = 0;
			}
		}
		if (this.objDragArea != 0) {
			this.objDragCycles++;
			if (super.mouseX > this.objGrabX + 5 || super.mouseX < this.objGrabX - 5 || super.mouseY > this.objGrabY + 5 || super.mouseY < this.objGrabY - 5) {
				this.objGrabThreshold = true;
			}
			if (super.mouseButton == 0) {
				if (this.objDragArea == 2) {
					this.redrawSidebar = true;
				}
				if (this.objDragArea == 3) {
					this.redrawChatback = true;
				}
				this.objDragArea = 0;
				if (this.objGrabThreshold && this.objDragCycles >= 5) {
					this.hoveredSlotParentId = -1;
					this.handleInput(0);
					if (this.objDragInterfaceId == this.hoveredSlotParentId && this.objDragSlot != this.hoveredSlot) {
						Component var20 = Component.instances[this.objDragInterfaceId];
						byte var21 = 0;
						if (this.bankArrangeMode == 1 && var20.clientCode == 206) {
							var21 = 1;
						}
						if (var20.invSlotObjId[this.hoveredSlot] <= 0) {
							var21 = 0;
						}
						if (var20.swappable) {
							int var22 = this.objDragSlot;
							int var23 = this.hoveredSlot;
							var20.invSlotObjId[var23] = var20.invSlotObjId[var22];
							var20.invSlotObjCount[var23] = var20.invSlotObjCount[var22];
							var20.invSlotObjId[var22] = -1;
							var20.invSlotObjCount[var22] = 0;
						} else if (var21 == 1) {
							int var24 = this.objDragSlot;
							int var25 = this.hoveredSlot;
							while (var24 != var25) {
								if (var24 > var25) {
									var20.swapObj(var24, (byte) 9, var24 - 1);
									var24--;
								} else if (var24 < var25) {
									var20.swapObj(var24, (byte) 9, var24 + 1);
									var24++;
								}
							}
						} else {
							var20.swapObj(this.objDragSlot, (byte) 9, this.hoveredSlot);
						}
						this.out.p1isaac((byte) 6, 214);
						this.out.p2_alt3(0, this.objDragInterfaceId);
						this.out.p1_alt2(var21, 0);
						this.out.p2_alt3(0, this.objDragSlot);
						this.out.p2_alt1(true, this.hoveredSlot);
					}
				} else if ((this.mouseButtonsOption == 1 || this.isAddFriendOption(9, this.menuSize - 1)) && this.menuSize > 2) {
					this.showContextMenu(true);
				} else if (this.menuSize > 0) {
					this.useMenuOption(this.menuSize - 1, false);
				}
				this.selectedCycle = 10;
				super.mouseClickButton = 0;
			}
		}
		if (World3D.clickTileX != -1) {
			int var26 = World3D.clickTileX;
			int var27 = World3D.clickTileZ;
			boolean var28 = this.tryMove(0, 0, 0, -11308, 0, localPlayer.pathTileZ[0], 0, 0, var27, localPlayer.pathTileX[0], true, var26);
			World3D.clickTileX = -1;
			if (var28) {
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 1;
				this.crossCycle = 0;
			}
		}
		if (super.mouseClickButton == 1 && this.modalMessage != null) {
			this.modalMessage = null;
			this.redrawChatback = true;
			super.mouseClickButton = 0;
		}
		this.handleMouseInput(4);
		this.handleMinimapInput(true);
		this.handleTabInput(19);
		this.handleChatSettingsInput(true);
		if (super.mouseButton == 1 || super.mouseClickButton == 1) {
			this.dragCycles++;
		}
		if (this.sceneState == 2) {
			this.updateOrbitCamera(3);
		}
		if (this.sceneState == 2 && this.cutscene) {
			this.applyCutscene((byte) 5);
		}
		for (int var29 = 0; var29 < 5; var29++) {
			int var10002 = this.cameraModifierCycle[var29]++;
		}
		this.handleInputKey(732);
		super.idleCycles++;
		if (super.idleCycles > 4500) {
			this.idleTimeout = 250;
			super.idleCycles -= 500;
			this.out.p1isaac((byte) 6, 202);
		}
		this.cameraOffsetCycle++;
		if (arg0 >= 0) {
			this.levelObjStacks = null;
		}
		if (this.cameraOffsetCycle > 500) {
			this.cameraOffsetCycle = 0;
			int var30 = (int) (Math.random() * 8.0D);
			if ((var30 & 0x1) == 1) {
				this.cameraAnticheatOffsetX += this.cameraOffsetXModifier;
			}
			if ((var30 & 0x2) == 2) {
				this.cameraAnticheatOffsetZ += this.cameraOffsetZModifier;
			}
			if ((var30 & 0x4) == 4) {
				this.cameraAnticheatAngle += this.cameraOffsetYawModifier;
			}
		}
		if (this.cameraAnticheatOffsetX < -50) {
			this.cameraOffsetXModifier = 2;
		}
		if (this.cameraAnticheatOffsetX > 50) {
			this.cameraOffsetXModifier = -2;
		}
		if (this.cameraAnticheatOffsetZ < -55) {
			this.cameraOffsetZModifier = 2;
		}
		if (this.cameraAnticheatOffsetZ > 55) {
			this.cameraOffsetZModifier = -2;
		}
		if (this.cameraAnticheatAngle < -40) {
			this.cameraOffsetYawModifier = 1;
		}
		if (this.cameraAnticheatAngle > 40) {
			this.cameraOffsetYawModifier = -1;
		}
		this.minimapOffsetCycle++;
		if (this.minimapOffsetCycle > 500) {
			this.minimapOffsetCycle = 0;
			int var31 = (int) (Math.random() * 8.0D);
			if ((var31 & 0x1) == 1) {
				this.minimapAnticheatAngle += this.minimapAngleModifier;
			}
			if ((var31 & 0x2) == 2) {
				this.minimapZoom += this.minimapZoomModifier;
			}
		}
		if (this.minimapAnticheatAngle < -60) {
			this.minimapAngleModifier = 2;
		}
		if (this.minimapAnticheatAngle > 60) {
			this.minimapAngleModifier = -2;
		}
		if (this.minimapZoom < -20) {
			this.minimapZoomModifier = 1;
		}
		if (this.minimapZoom > 10) {
			this.minimapZoomModifier = -1;
		}
		this.heartbeatTimer++;
		if (this.heartbeatTimer > 50) {
			this.out.p1isaac((byte) 6, 0);
		}
		try {
			if (this.stream != null && this.out.pos > 0) {
				this.stream.write(this.out.pos, 0, this.out.data, 0);
				this.out.pos = 0;
				this.heartbeatTimer = 0;
			}
		} catch (IOException var33) {
			this.tryReconnect(-670);
		} catch (Exception var34) {
			this.logout(true);
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void clearTemporaryLocs(int arg0) {
		LocAddEntity var2 = (LocAddEntity) this.temporaryLocs.head();
		while (arg0 >= 0) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
		while (var2 != null) {
			if (var2.duration == -1) {
				var2.delay = 0;
				this.storeLoc(false, var2);
			} else {
				var2.unlink();
			}
			var2 = (LocAddEntity) this.temporaryLocs.next(false);
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void loadTitle(int arg0) {
		if (this.imageTitle2 != null) {
			return;
		}
		super.drawArea = null;
		this.areaChatback = null;
		this.areaMapback = null;
		this.areaSidebar = null;
		this.areaViewport = null;
		this.areaBackbase1 = null;
		this.areaBackbase2 = null;
		this.areaBackhmid1 = null;
		this.imageTitle0 = new PixMap(128, 265, this.getBaseComponent(0), 0);
		Pix2D.clear(this._flowObfuscator38);
		this.imageTitle1 = new PixMap(128, 265, this.getBaseComponent(0), 0);
		Pix2D.clear(this._flowObfuscator38);
		this.imageTitle2 = new PixMap(509, 171, this.getBaseComponent(0), 0);
		Pix2D.clear(this._flowObfuscator38);
		this.imageTitle3 = new PixMap(360, 132, this.getBaseComponent(0), 0);
		Pix2D.clear(this._flowObfuscator38);
		this.imageTitle4 = new PixMap(360, 200, this.getBaseComponent(0), 0);
		Pix2D.clear(this._flowObfuscator38);
		this.imageTitle5 = new PixMap(202, 238, this.getBaseComponent(0), 0);
		if (arg0 < 0 || arg0 > 0) {
			this.levelObjStacks = null;
		}
		Pix2D.clear(this._flowObfuscator38);
		this.imageTitle6 = new PixMap(203, 238, this.getBaseComponent(0), 0);
		Pix2D.clear(this._flowObfuscator38);
		this.imageTitle7 = new PixMap(74, 94, this.getBaseComponent(0), 0);
		Pix2D.clear(this._flowObfuscator38);
		this.imageTitle8 = new PixMap(75, 94, this.getBaseComponent(0), 0);
		Pix2D.clear(this._flowObfuscator38);
		if (this.archiveTitle != null) {
			this.loadTitleBackground(0);
			this.loadTitleImages(215);
		}
		this.redrawTitleBackground = true;
	}

	@ObfuscatedName("client.a(IBLjava/lang/String;)V")
	public final void drawProgress(int arg0, byte arg1, String arg2) {
		this.lastProgressPercent = arg0;
		this.lastProgressMessage = arg2;
		this.loadTitle(0);
		if (this.archiveTitle == null) {
			super.drawProgress(arg0, (byte) 4, arg2);
			return;
		}
		this.imageTitle4.bind(0);
		short var4 = 360;
		short var5 = 200;
		byte var6 = 20;
		this.fontBold12.drawStringCenter(16777215, "RuneScape is loading - please wait...", 23693, var5 / 2 - 26 - var6, var4 / 2);
		int var7 = var5 / 2 - 18 - var6;
		Pix2D.drawRect(var4 / 2 - 152, 304, 34, 9179409, var7, true);
		Pix2D.drawRect(var4 / 2 - 151, 302, 32, 0, var7 + 1, true);
		Pix2D.fillRect(30, var7 + 2, var4 / 2 - 150, 9179409, arg0 * 3, 0);
		Pix2D.fillRect(30, var7 + 2, arg0 * 3 + (var4 / 2 - 150), 0, 300 - arg0 * 3, 0);
		this.fontBold12.drawStringCenter(16777215, arg2, 23693, var5 / 2 + 5 - var6, var4 / 2);
		this.imageTitle4.draw(171, 23680, super.graphics, 202);
		if (arg1 != 4) {
			for (int var8 = 1; var8 > 0; var8++) {
			}
		}
		if (!this.redrawTitleBackground) {
			return;
		}
		this.redrawTitleBackground = false;
		if (!this.flameActive) {
			this.imageTitle0.draw(0, 23680, super.graphics, 0);
			this.imageTitle1.draw(0, 23680, super.graphics, 637);
		}
		this.imageTitle2.draw(0, 23680, super.graphics, 128);
		this.imageTitle3.draw(371, 23680, super.graphics, 202);
		this.imageTitle5.draw(265, 23680, super.graphics, 0);
		this.imageTitle6.draw(265, 23680, super.graphics, 562);
		this.imageTitle7.draw(171, 23680, super.graphics, 128);
		this.imageTitle8.draw(171, 23680, super.graphics, 562);
	}

	@ObfuscatedName("client.a(IIIILDUCMKFAY;IZII)V")
	public final void handleScrollInput(int arg0, int arg1, int arg2, int arg3, Component arg4, int arg5, boolean arg6, int arg7, int arg8) {
		if (this.scrollGrabbed) {
			this.scrollInputPadding = 32;
		} else {
			this.scrollInputPadding = 0;
		}
		this.scrollGrabbed = false;
		this.packetSize += arg8;
		if (arg2 >= arg0 && arg2 < arg0 + 16 && arg3 >= arg5 && arg3 < arg5 + 16) {
			arg4.scrollPosition -= this.dragCycles * 4;
			if (arg6) {
				this.redrawSidebar = true;
				return;
			}
		} else if (arg2 >= arg0 && arg2 < arg0 + 16 && arg3 >= arg1 + arg5 - 16 && arg3 < arg1 + arg5) {
			arg4.scrollPosition += this.dragCycles * 4;
			if (arg6) {
				this.redrawSidebar = true;
				return;
			}
		} else if (arg2 >= arg0 - this.scrollInputPadding && arg2 < arg0 + 16 + this.scrollInputPadding && arg3 >= arg5 + 16 && arg3 < arg1 + arg5 - 16 && this.dragCycles > 0) {
			int var10 = (arg1 - 32) * arg1 / arg7;
			if (var10 < 8) {
				var10 = 8;
			}
			int var11 = arg3 - arg5 - 16 - var10 / 2;
			int var12 = arg1 - 32 - var10;
			arg4.scrollPosition = (arg7 - arg1) * var11 / var12;
			if (arg6) {
				this.redrawSidebar = true;
			}
			this.scrollGrabbed = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(IIII)Z")
	public final boolean interactWithLoc(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg0 >> 14 & 0x7FFF;
		int var6 = this.scene.getInfo(this.currentLevel, arg2, arg1, arg0);
		if (arg3 >= 0) {
			throw new NullPointerException();
		} else if (var6 == -1) {
			return false;
		} else {
			int var7 = var6 & 0x1F;
			int var8 = var6 >> 6 & 0x3;
			if (var7 == 10 || var7 == 11 || var7 == 22) {
				LocType var9 = LocType.get(var5);
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
				this.tryMove(2, 0, var11, -11308, 0, localPlayer.pathTileZ[0], var10, var12, arg1, localPlayer.pathTileX[0], false, arg2);
			} else {
				this.tryMove(2, var8, 0, -11308, var7 + 1, localPlayer.pathTileZ[0], 0, 0, arg1, localPlayer.pathTileX[0], false, arg2);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			return true;
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;IBI)LXTGLDHGX;")
	public final Jagfile loadArchive(int arg0, String arg1, String arg2, int arg3, byte arg4, int arg5) {
		byte[] var7 = null;
		int var8 = 5;
		try {
			if (this.fileStreams[0] != null) {
				var7 = this.fileStreams[0].read(true, arg0);
			}
		} catch (Exception var30) {
		}
		if (var7 != null) {
			this.crc32.reset();
			this.crc32.update(var7);
			int var9 = (int) this.crc32.getValue();
			if (arg3 != var9) {
				var7 = null;
			}
		}
		if (var7 != null) {
			return new Jagfile(44820, var7);
		}
		int var11 = 0;
		while (var7 == null) {
			String var12 = "Unknown error";
			this.drawProgress(arg5, (byte) 4, "Requesting " + arg1);
			Object var13 = null;
			try {
				int var14 = 0;
				DataInputStream var15 = this.openUrl(arg2 + arg3);
				byte[] var16 = new byte[6];
				var15.readFully(var16, 0, 6);
				Packet var17 = new Packet(var16, 891);
				var17.pos = 3;
				int var18 = var17.g3() + 6;
				int var19 = 6;
				var7 = new byte[var18];
				for (int var20 = 0; var20 < 6; var20++) {
					var7[var20] = var16[var20];
				}
				while (var19 < var18) {
					int var21 = var18 - var19;
					if (var21 > 1000) {
						var21 = 1000;
					}
					int var22 = var15.read(var7, var19, var21);
					if (var22 < 0) {
						(new StringBuffer("Length error: ")).append(var19).append("/").append(var18).toString();
						throw new IOException("EOF");
					}
					var19 += var22;
					int var23 = var19 * 100 / var18;
					if (var14 != var23) {
						this.drawProgress(arg5, (byte) 4, "Loading " + arg1 + " - " + var23 + "%");
					}
					var14 = var23;
				}
				var15.close();
				try {
					if (this.fileStreams[0] != null) {
						this.fileStreams[0].write(var7.length, var7, (byte) 2, arg0);
					}
				} catch (Exception var29) {
					this.fileStreams[0] = null;
				}
				if (var7 != null) {
					this.crc32.reset();
					this.crc32.update(var7);
					int var24 = (int) this.crc32.getValue();
					if (arg3 != var24) {
						var7 = null;
						var11++;
						var12 = "Checksum error: " + var24;
					}
				}
			} catch (IOException var31) {
				if (var12.equals("Unknown error")) {
					var12 = "Connection error";
				}
				var7 = null;
			} catch (NullPointerException var32) {
				var12 = "Null error";
				var7 = null;
				if (!signlink.reporterror) {
					return null;
				}
			} catch (ArrayIndexOutOfBoundsException var33) {
				var12 = "Bounds error";
				var7 = null;
				if (!signlink.reporterror) {
					return null;
				}
			} catch (Exception var34) {
				var12 = "Unexpected error";
				var7 = null;
				if (!signlink.reporterror) {
					return null;
				}
			}
			if (var7 == null) {
				for (int var26 = var8; var26 > 0; var26--) {
					if (var11 >= 3) {
						this.drawProgress(arg5, (byte) 4, "Game updated - please reload page");
						var26 = 10;
					} else {
						this.drawProgress(arg5, (byte) 4, var12 + " - Retrying in " + var26);
					}
					try {
						Thread.sleep(1000L);
					} catch (Exception var28) {
					}
				}
				var8 *= 2;
				if (var8 > 60) {
					var8 = 60;
				}
				this.jaggrabEnabled = !this.jaggrabEnabled;
			}
		}
		Jagfile var27 = new Jagfile(44820, var7);
		if (arg4 != -41) {
			throw new NullPointerException();
		}
		return var27;
	}

	@ObfuscatedName("client.x(I)V")
	public final void tryReconnect(int arg0) {
		if (this.idleTimeout > 0) {
			this.logout(true);
			return;
		}
		this.areaViewport.bind(0);
		this.fontPlain12.drawStringCenter(0, "Connection lost", 23693, 144, 257);
		this.fontPlain12.drawStringCenter(16777215, "Connection lost", 23693, 143, 256);
		this.fontPlain12.drawStringCenter(0, "Please wait - attempting to reestablish", 23693, 159, 257);
		this.fontPlain12.drawStringCenter(16777215, "Please wait - attempting to reestablish", 23693, 158, 256);
		while (arg0 >= 0) {
			this.out.p1(164);
		}
		this.areaViewport.draw(4, 23680, super.graphics, 4);
		this.minimapState = 0;
		this.flagSceneTileX = 0;
		ClientStream var2 = this.stream;
		this.ingame = false;
		this.loginAttempts = 0;
		this.login(this.username, this.password, true);
		if (!this.ingame) {
			this.logout(true);
		}
		try {
			var2.close();
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void useMenuOption(int arg0, boolean arg1) {
		if (arg0 < 0) {
			return;
		}
		if (this.chatbackInputOpen != 0) {
			this.chatbackInputOpen = 0;
			this.redrawChatback = true;
		}
		int var3 = this.menuParamB[arg0];
		int var4 = this.menuParamC[arg0];
		int var5 = this.menuAction[arg0];
		int var6 = this.menuParamA[arg0];
		if (var5 >= 2000) {
			var5 -= 2000;
		}
		if (var5 == 582) {
			NpcEntity var7 = this.npcs[var6];
			if (var7 != null) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var7.pathTileZ[0], localPlayer.pathTileX[0], false, var7.pathTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				this.out.p1isaac((byte) 6, 57);
				this.out.p2_alt2(-431, this._flowObfuscator46);
				this.out.p2_alt2(-431, var6);
				this.out.p2_alt1(true, this.objSelectedSlot);
				this.out.p2_alt2(-431, this.objSelectedInterface);
			}
		}
		if (var5 == 234) {
			boolean var8 = this.tryMove(2, 0, 0, -11308, 0, localPlayer.pathTileZ[0], 0, 0, var4, localPlayer.pathTileX[0], false, var3);
			if (!var8) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var4, localPlayer.pathTileX[0], false, var3);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			this.out.p1isaac((byte) 6, 236);
			this.out.p2_alt1(true, this.sceneBaseTileZ + var4);
			this.out.p2(var6);
			this.out.p2_alt1(true, this.sceneBaseTileX + var3);
		}
		if (var5 == 62 && this.interactWithLoc(var6, var4, var3, -770)) {
			this.out.p1isaac((byte) 6, 192);
			this.out.p2(this.objSelectedInterface);
			this.out.p2_alt1(true, var6 >> 14 & 0x7FFF);
			this.out.p2_alt3(0, this.sceneBaseTileZ + var4);
			this.out.p2_alt1(true, this.objSelectedSlot);
			this.out.p2_alt3(0, this.sceneBaseTileX + var3);
			this.out.p2(this._flowObfuscator46);
		}
		if (var5 == 511) {
			boolean var10 = this.tryMove(2, 0, 0, -11308, 0, localPlayer.pathTileZ[0], 0, 0, var4, localPlayer.pathTileX[0], false, var3);
			if (!var10) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var4, localPlayer.pathTileX[0], false, var3);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			this.out.p1isaac((byte) 6, 25);
			this.out.p2_alt1(true, this.objSelectedInterface);
			this.out.p2_alt2(-431, this._flowObfuscator46);
			this.out.p2(var6);
			this.out.p2_alt2(-431, this.sceneBaseTileZ + var4);
			this.out.p2_alt3(0, this.objSelectedSlot);
			this.out.p2(this.sceneBaseTileX + var3);
		}
		if (var5 == 74) {
			this.out.p1isaac((byte) 6, 122);
			this.out.p2_alt3(0, var4);
			this.out.p2_alt2(-431, var3);
			this.out.p2_alt1(true, var6);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.instances[var4].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.instances[var4].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 315) {
			Component var12 = Component.instances[var4];
			boolean var13 = true;
			if (var12.clientCode > 0) {
				var13 = this.handleInterfaceAction(505, var12);
			}
			if (var13) {
				this.out.p1isaac((byte) 6, 185);
				this.out.p2(var4);
			}
		}
		if (var5 == 561) {
			PlayerEntity var14 = this.players[var6];
			if (var14 != null) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var14.pathTileZ[0], localPlayer.pathTileX[0], false, var14.pathTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				oplogic6 += var6;
				if (oplogic6 >= 90) {
					this.out.p1isaac((byte) 6, 136);
					oplogic6 = 0;
				}
				this.out.p1isaac((byte) 6, 128);
				this.out.p2(var6);
			}
		}
		if (var5 == 20) {
			NpcEntity var15 = this.npcs[var6];
			if (var15 != null) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var15.pathTileZ[0], localPlayer.pathTileX[0], false, var15.pathTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				this.out.p1isaac((byte) 6, 155);
				this.out.p2_alt1(true, var6);
			}
		}
		if (var5 == 779) {
			PlayerEntity var16 = this.players[var6];
			if (var16 != null) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var16.pathTileZ[0], localPlayer.pathTileX[0], false, var16.pathTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				this.out.p1isaac((byte) 6, 153);
				this.out.p2_alt1(true, var6);
			}
		}
		if (var5 == 516) {
			if (this.menuVisible) {
				this.scene.click(false, var4 - 4, var3 - 4);
			} else {
				this.scene.click(false, super.mouseClickY - 4, super.mouseClickX - 4);
			}
		}
		if (var5 == 1062) {
			oplogic5 += this.sceneBaseTileX;
			if (oplogic5 >= 113) {
				this.out.p1isaac((byte) 6, 183);
				this.out.p3(15086193);
				oplogic5 = 0;
			}
			this.interactWithLoc(var6, var4, var3, -770);
			this.out.p1isaac((byte) 6, 228);
			this.out.p2_alt2(-431, var6 >> 14 & 0x7FFF);
			this.out.p2_alt2(-431, this.sceneBaseTileZ + var4);
			this.out.p2(this.sceneBaseTileX + var3);
		}
		if (var5 == 679 && !this.pressedContinueOption) {
			this.out.p1isaac((byte) 6, 40);
			this.out.p2(var4);
			this.pressedContinueOption = true;
		}
		if (var5 == 431) {
			this.out.p1isaac((byte) 6, 129);
			this.out.p2_alt2(-431, var3);
			this.out.p2(var4);
			this.out.p2_alt2(-431, var6);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.instances[var4].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.instances[var4].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 337 || var5 == 42 || var5 == 792 || var5 == 322) {
			String var17 = this.menuOption[arg0];
			int var18 = var17.indexOf("@whi@");
			if (var18 != -1) {
				long var19 = JString.toBase37(var17.substring(var18 + 5).trim());
				if (var5 == 337) {
					this.addFriend((byte) 68, var19);
				}
				if (var5 == 42) {
					this.addIgnore(var19, 4);
				}
				if (var5 == 792) {
					this.removeFriend(false, var19);
				}
				if (var5 == 322) {
					this.removeIgnore(3, var19);
				}
			}
		}
		if (var5 == 53) {
			this.out.p1isaac((byte) 6, 135);
			this.out.p2_alt1(true, var3);
			this.out.p2_alt2(-431, var4);
			this.out.p2_alt1(true, var6);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.instances[var4].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.instances[var4].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 539) {
			this.out.p1isaac((byte) 6, 16);
			this.out.p2_alt2(-431, var6);
			this.out.p2_alt3(0, var3);
			this.out.p2_alt3(0, var4);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.instances[var4].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.instances[var4].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 484 || var5 == 6) {
			String var21 = this.menuOption[arg0];
			int var22 = var21.indexOf("@whi@");
			if (var22 != -1) {
				String var23 = var21.substring(var22 + 5).trim();
				String var24 = JString.toSentenceCase(-45804, JString.fromBase37(JString.toBase37(var23), (byte) -99));
				boolean var25 = false;
				for (int var26 = 0; var26 < this.playerCount; var26++) {
					PlayerEntity var27 = this.players[this.playerIds[var26]];
					if (var27 != null && var27.name != null && var27.name.equalsIgnoreCase(var24)) {
						this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var27.pathTileZ[0], localPlayer.pathTileX[0], false, var27.pathTileX[0]);
						if (var5 == 484) {
							this.out.p1isaac((byte) 6, 139);
							this.out.p2_alt1(true, this.playerIds[var26]);
						}
						if (var5 == 6) {
							oplogic6 += var6;
							if (oplogic6 >= 90) {
								this.out.p1isaac((byte) 6, 136);
								oplogic6 = 0;
							}
							this.out.p1isaac((byte) 6, 128);
							this.out.p2(this.playerIds[var26]);
						}
						var25 = true;
						break;
					}
				}
				if (!var25) {
					this.addMessage("Unable to find " + var24, 0, "", this._flowObfuscator21);
				}
			}
		}
		if (var5 == 870) {
			this.out.p1isaac((byte) 6, 53);
			this.out.p2(var3);
			this.out.p2_alt2(-431, this.objSelectedSlot);
			this.out.p2_alt3(0, var6);
			this.out.p2(this.objSelectedInterface);
			this.out.p2_alt1(true, this._flowObfuscator46);
			this.out.p2(var4);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.instances[var4].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.instances[var4].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 847) {
			this.out.p1isaac((byte) 6, 87);
			this.out.p2_alt2(-431, var6);
			this.out.p2(var4);
			this.out.p2_alt2(-431, var3);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.instances[var4].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.instances[var4].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 626) {
			Component var28 = Component.instances[var4];
			this.spellSelected = 1;
			this.activeSpellId = var4;
			this.activeSpellFlags = var28.targetMask;
			this.objSelected = 0;
			this.redrawSidebar = true;
			String var29 = var28.targetVerb;
			if (var29.indexOf(" ") != -1) {
				var29 = var29.substring(0, var29.indexOf(" "));
			}
			String var30 = var28.targetVerb;
			if (var30.indexOf(" ") != -1) {
				var30 = var30.substring(var30.indexOf(" ") + 1);
			}
			this.spellCaption = var29 + " " + var28.targetText + " " + var30;
			if (this.activeSpellFlags == 16) {
				this.redrawSidebar = true;
				this.selectedTab = 3;
				this.redrawSideicons = true;
			}
			return;
		}
		if (var5 == 78) {
			this.out.p1isaac((byte) 6, 117);
			this.out.p2_alt3(0, var4);
			this.out.p2_alt3(0, var6);
			this.out.p2_alt1(true, var3);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.instances[var4].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.instances[var4].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 27) {
			PlayerEntity var31 = this.players[var6];
			if (var31 != null) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var31.pathTileZ[0], localPlayer.pathTileX[0], false, var31.pathTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				oplogic3 += var6;
				if (oplogic3 >= 54) {
					this.out.p1isaac((byte) 6, 189);
					this.out.p1(234);
					oplogic3 = 0;
				}
				this.out.p1isaac((byte) 6, 73);
				this.out.p2_alt1(true, var6);
			}
		}
		if (var5 == 213) {
			boolean var32 = this.tryMove(2, 0, 0, -11308, 0, localPlayer.pathTileZ[0], 0, 0, var4, localPlayer.pathTileX[0], false, var3);
			if (!var32) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var4, localPlayer.pathTileX[0], false, var3);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			this.out.p1isaac((byte) 6, 79);
			this.out.p2_alt1(true, this.sceneBaseTileZ + var4);
			this.out.p2(var6);
			this.out.p2_alt2(-431, this.sceneBaseTileX + var3);
		}
		if (var5 == 632) {
			this.out.p1isaac((byte) 6, 145);
			this.out.p2_alt2(-431, var4);
			this.out.p2_alt2(-431, var3);
			this.out.p2_alt2(-431, var6);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.instances[var4].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.instances[var4].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 493) {
			this.out.p1isaac((byte) 6, 75);
			this.out.p2_alt3(0, var4);
			this.out.p2_alt1(true, var3);
			this.out.p2_alt2(-431, var6);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.instances[var4].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.instances[var4].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 652) {
			boolean var34 = this.tryMove(2, 0, 0, -11308, 0, localPlayer.pathTileZ[0], 0, 0, var4, localPlayer.pathTileX[0], false, var3);
			if (!var34) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var4, localPlayer.pathTileX[0], false, var3);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			this.out.p1isaac((byte) 6, 156);
			this.out.p2_alt2(-431, this.sceneBaseTileX + var3);
			this.out.p2_alt1(true, this.sceneBaseTileZ + var4);
			this.out.p2_alt3(0, var6);
		}
		if (var5 == 94) {
			boolean var36 = this.tryMove(2, 0, 0, -11308, 0, localPlayer.pathTileZ[0], 0, 0, var4, localPlayer.pathTileX[0], false, var3);
			if (!var36) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var4, localPlayer.pathTileX[0], false, var3);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			this.out.p1isaac((byte) 6, 181);
			this.out.p2_alt1(true, this.sceneBaseTileZ + var4);
			this.out.p2(var6);
			this.out.p2_alt1(true, this.sceneBaseTileX + var3);
			this.out.p2_alt2(-431, this.activeSpellId);
		}
		if (var5 == 646) {
			this.out.p1isaac((byte) 6, 185);
			this.out.p2(var4);
			Component var38 = Component.instances[var4];
			if (var38.scripts != null && var38.scripts[0][0] == 5) {
				int var39 = var38.scripts[0][1];
				if (this.varps[var39] != var38.scriptOperand[0]) {
					this.varps[var39] = var38.scriptOperand[0];
					this.updateVarp(false, var39);
					this.redrawSidebar = true;
				}
			}
		}
		if (var5 == 225) {
			NpcEntity var40 = this.npcs[var6];
			if (var40 != null) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var40.pathTileZ[0], localPlayer.pathTileX[0], false, var40.pathTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				oplogic8 += var6;
				if (oplogic8 >= 85) {
					this.out.p1isaac((byte) 6, 230);
					this.out.p1(239);
					oplogic8 = 0;
				}
				this.out.p1isaac((byte) 6, 17);
				this.out.p2_alt3(0, var6);
			}
		}
		if (var5 == 965) {
			NpcEntity var41 = this.npcs[var6];
			if (var41 != null) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var41.pathTileZ[0], localPlayer.pathTileX[0], false, var41.pathTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				oplogic2++;
				if (oplogic2 >= 96) {
					this.out.p1isaac((byte) 6, 152);
					this.out.p1(88);
					oplogic2 = 0;
				}
				this.out.p1isaac((byte) 6, 21);
				this.out.p2(var6);
			}
		}
		if (var5 == 413) {
			NpcEntity var42 = this.npcs[var6];
			if (var42 != null) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var42.pathTileZ[0], localPlayer.pathTileX[0], false, var42.pathTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				this.out.p1isaac((byte) 6, 131);
				this.out.p2_alt3(0, var6);
				this.out.p2_alt2(-431, this.activeSpellId);
			}
		}
		if (var5 == 200) {
			this.closeInterfaces(537);
		}
		if (var5 == 1025) {
			NpcEntity var43 = this.npcs[var6];
			if (var43 != null) {
				NpcType var44 = var43.type;
				if (var44.multinpc != null) {
					var44 = var44.getMultiNpc(this._flowObfuscator10);
				}
				if (var44 != null) {
					String var45;
					if (var44.desc == null) {
						var45 = "It's a " + var44.name + ".";
					} else {
						var45 = new String(var44.desc);
					}
					this.addMessage(var45, 0, "", this._flowObfuscator21);
				}
			}
		}
		if (var5 == 900) {
			this.interactWithLoc(var6, var4, var3, -770);
			this.out.p1isaac((byte) 6, 252);
			this.out.p2_alt3(0, var6 >> 14 & 0x7FFF);
			this.out.p2_alt1(true, this.sceneBaseTileZ + var4);
			this.out.p2_alt2(-431, this.sceneBaseTileX + var3);
		}
		if (var5 == 412) {
			NpcEntity var46 = this.npcs[var6];
			if (var46 != null) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var46.pathTileZ[0], localPlayer.pathTileX[0], false, var46.pathTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				this.out.p1isaac((byte) 6, 72);
				this.out.p2_alt2(-431, var6);
			}
		}
		if (var5 == 365) {
			PlayerEntity var47 = this.players[var6];
			if (var47 != null) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var47.pathTileZ[0], localPlayer.pathTileX[0], false, var47.pathTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				this.out.p1isaac((byte) 6, 249);
				this.out.p2_alt2(-431, var6);
				this.out.p2_alt1(true, this.activeSpellId);
			}
		}
		if (var5 == 729) {
			PlayerEntity var48 = this.players[var6];
			if (var48 != null) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var48.pathTileZ[0], localPlayer.pathTileX[0], false, var48.pathTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				this.out.p1isaac((byte) 6, 39);
				this.out.p2_alt1(true, var6);
			}
		}
		if (var5 == 577) {
			PlayerEntity var49 = this.players[var6];
			if (var49 != null) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var49.pathTileZ[0], localPlayer.pathTileX[0], false, var49.pathTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				this.out.p1isaac((byte) 6, 139);
				this.out.p2_alt1(true, var6);
			}
		}
		if (var5 == 956 && this.interactWithLoc(var6, var4, var3, -770)) {
			this.out.p1isaac((byte) 6, 35);
			this.out.p2_alt1(true, this.sceneBaseTileX + var3);
			this.out.p2_alt2(-431, this.activeSpellId);
			this.out.p2_alt2(-431, this.sceneBaseTileZ + var4);
			this.out.p2_alt1(true, var6 >> 14 & 0x7FFF);
		}
		if (var5 == 567) {
			boolean var50 = this.tryMove(2, 0, 0, -11308, 0, localPlayer.pathTileZ[0], 0, 0, var4, localPlayer.pathTileX[0], false, var3);
			if (!var50) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var4, localPlayer.pathTileX[0], false, var3);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			this.out.p1isaac((byte) 6, 23);
			this.out.p2_alt1(true, this.sceneBaseTileZ + var4);
			this.out.p2_alt1(true, var6);
			this.out.p2_alt1(true, this.sceneBaseTileX + var3);
		}
		if (var5 == 867) {
			if ((var6 & 0x3) == 0) {
				oplogic1++;
			}
			if (oplogic1 >= 59) {
				this.out.p1isaac((byte) 6, 200);
				this.out.p2(25501);
				oplogic1 = 0;
			}
			this.out.p1isaac((byte) 6, 43);
			this.out.p2_alt1(true, var4);
			this.out.p2_alt2(-431, var6);
			this.out.p2_alt2(-431, var3);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.instances[var4].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.instances[var4].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 543) {
			this.out.p1isaac((byte) 6, 237);
			this.out.p2(var3);
			this.out.p2_alt2(-431, var6);
			this.out.p2(var4);
			this.out.p2_alt2(-431, this.activeSpellId);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.instances[var4].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.instances[var4].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 606) {
			String var52 = this.menuOption[arg0];
			int var53 = var52.indexOf("@whi@");
			if (var53 != -1) {
				if (this.viewportInterfaceId == -1) {
					this.closeInterfaces(537);
					this.reportAbuseInput = var52.substring(var53 + 5).trim();
					this.reportAbuseMuteOption = false;
					for (int var54 = 0; var54 < Component.instances.length; var54++) {
						if (Component.instances[var54] != null && Component.instances[var54].clientCode == 600) {
							this.reportAbuseInterfaceId = this.viewportInterfaceId = Component.instances[var54].layer;
							break;
						}
					}
				} else {
					this.addMessage("Please close the interface you have open before using 'report abuse'", 0, "", this._flowObfuscator21);
				}
			}
		}
		if (var5 == 491) {
			PlayerEntity var55 = this.players[var6];
			if (var55 != null) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var55.pathTileZ[0], localPlayer.pathTileX[0], false, var55.pathTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				this.out.p1isaac((byte) 6, 14);
				this.out.p2_alt2(-431, this.objSelectedInterface);
				this.out.p2(var6);
				this.out.p2(this._flowObfuscator46);
				this.out.p2_alt1(true, this.objSelectedSlot);
			}
		}
		if (var5 == 639) {
			String var56 = this.menuOption[arg0];
			int var57 = var56.indexOf("@whi@");
			if (var57 != -1) {
				long var58 = JString.toBase37(var56.substring(var57 + 5).trim());
				int var60 = -1;
				for (int var61 = 0; var61 < this.friendCount; var61++) {
					if (this.friendName37[var61] == var58) {
						var60 = var61;
						break;
					}
				}
				if (var60 != -1 && this.friendWorld[var60] > 0) {
					this.redrawChatback = true;
					this.chatbackInputOpen = 0;
					this.showSocialInput = true;
					this.socialInput = "";
					this.socialAction = 3;
					this.socialName37 = this.friendName37[var60];
					this.socialMessage = "Enter message to send to " + this.friendName[var60];
				}
			}
		}
		if (var5 == 454) {
			this.out.p1isaac((byte) 6, 41);
			this.out.p2(var6);
			this.out.p2_alt2(-431, var3);
			this.out.p2_alt2(-431, var4);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.instances[var4].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.instances[var4].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 478) {
			NpcEntity var62 = this.npcs[var6];
			if (var62 != null) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var62.pathTileZ[0], localPlayer.pathTileX[0], false, var62.pathTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				if ((var6 & 0x3) == 0) {
					oplogic7++;
				}
				if (oplogic7 >= 53) {
					this.out.p1isaac((byte) 6, 85);
					this.out.p1(66);
					oplogic7 = 0;
				}
				this.out.p1isaac((byte) 6, 18);
				this.out.p2_alt1(true, var6);
			}
		}
		if (var5 == 113) {
			this.interactWithLoc(var6, var4, var3, -770);
			this.out.p1isaac((byte) 6, 70);
			this.out.p2_alt1(true, this.sceneBaseTileX + var3);
			this.out.p2(this.sceneBaseTileZ + var4);
			this.out.p2_alt3(0, var6 >> 14 & 0x7FFF);
		}
		if (var5 == 872) {
			this.interactWithLoc(var6, var4, var3, -770);
			this.out.p1isaac((byte) 6, 234);
			this.out.p2_alt3(0, this.sceneBaseTileX + var3);
			this.out.p2_alt2(-431, var6 >> 14 & 0x7FFF);
			this.out.p2_alt3(0, this.sceneBaseTileZ + var4);
		}
		if (var5 == 502) {
			this.interactWithLoc(var6, var4, var3, -770);
			this.out.p1isaac((byte) 6, 132);
			this.out.p2_alt3(0, this.sceneBaseTileX + var3);
			this.out.p2(var6 >> 14 & 0x7FFF);
			this.out.p2_alt2(-431, this.sceneBaseTileZ + var4);
		}
		if (var5 == 1125) {
			ObjType var63 = ObjType.get(var6);
			Component var64 = Component.instances[var4];
			String var65;
			if (var64 != null && var64.invSlotObjCount[var3] >= 100000) {
				var65 = var64.invSlotObjCount[var3] + " x " + var63.name;
			} else if (var63.desc == null) {
				var65 = "It's a " + var63.name + ".";
			} else {
				var65 = new String(var63.desc);
			}
			this.addMessage(var65, 0, "", this._flowObfuscator21);
		}
		if (var5 == 169) {
			this.out.p1isaac((byte) 6, 185);
			this.out.p2(var4);
			Component var66 = Component.instances[var4];
			if (var66.scripts != null && var66.scripts[0][0] == 5) {
				int var67 = var66.scripts[0][1];
				this.varps[var67] = 1 - this.varps[var67];
				this.updateVarp(false, var67);
				this.redrawSidebar = true;
			}
		}
		if (var5 == 447) {
			this.objSelected = 1;
			this.objSelectedSlot = var3;
			this.objSelectedInterface = var4;
			this._flowObfuscator46 = var6;
			this.objSelectedName = ObjType.get(var6).name;
			this.spellSelected = 0;
			this.redrawSidebar = true;
			return;
		}
		if (var5 == 1226) {
			int var68 = var6 >> 14 & 0x7FFF;
			LocType var69 = LocType.get(var68);
			String var70;
			if (var69.desc == null) {
				var70 = "It's a " + var69.name + ".";
			} else {
				var70 = new String(var69.desc);
			}
			this.addMessage(var70, 0, "", this._flowObfuscator21);
		}
		if (var5 == 244) {
			boolean var71 = this.tryMove(2, 0, 0, -11308, 0, localPlayer.pathTileZ[0], 0, 0, var4, localPlayer.pathTileX[0], false, var3);
			if (!var71) {
				this.tryMove(2, 0, 1, -11308, 0, localPlayer.pathTileZ[0], 1, 0, var4, localPlayer.pathTileX[0], false, var3);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			this.out.p1isaac((byte) 6, 253);
			this.out.p2_alt1(true, this.sceneBaseTileX + var3);
			this.out.p2_alt3(0, this.sceneBaseTileZ + var4);
			this.out.p2_alt2(-431, var6);
		}
		if (var5 == 1448) {
			ObjType var73 = ObjType.get(var6);
			String var74;
			if (var73.desc == null) {
				var74 = "It's a " + var73.name + ".";
			} else {
				var74 = new String(var73.desc);
			}
			this.addMessage(var74, 0, "", this._flowObfuscator21);
		}
		this.objSelected = 0;
		if (!arg1) {
			this.spellSelected = 0;
			this.redrawSidebar = true;
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void drawWildyLevel(int arg0) {
		this.overrideChat = 0;
		int var2 = (localPlayer.x >> 7) + this.sceneBaseTileX;
		int var3 = (localPlayer.z >> 7) + this.sceneBaseTileZ;
		int var4 = 58 / arg0;
		if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
			this.overrideChat = 1;
		}
		if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
			this.overrideChat = 1;
		}
		if (this.overrideChat == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
			this.overrideChat = 0;
		}
	}

	public final void run() {
		if (this.flamesThread) {
			this.runFlames((byte) 59);
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void handleViewportOptions(int arg0) {
		if (this.objSelected == 0 && this.spellSelected == 0) {
			this.menuOption[this.menuSize] = "Walk here";
			this.menuAction[this.menuSize] = 516;
			this.menuParamB[this.menuSize] = super.mouseX;
			this.menuParamC[this.menuSize] = super.mouseY;
			this.menuSize++;
		}
		int var2 = -1;
		for (int var3 = 0; var3 < Model.pickedCount; var3++) {
			int var4 = Model.pickedBitsets[var3];
			int var5 = var4 & 0x7F;
			int var6 = var4 >> 7 & 0x7F;
			int var7 = var4 >> 29 & 0x3;
			int var8 = var4 >> 14 & 0x7FFF;
			if (var2 != var4) {
				var2 = var4;
				if (var7 == 2 && this.scene.getInfo(this.currentLevel, var5, var6, var4) >= 0) {
					LocType var9 = LocType.get(var8);
					if (var9.multiloc != null) {
						var9 = var9.getMultiLoc(true);
					}
					if (var9 == null) {
						continue;
					}
					if (this.objSelected == 1) {
						this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @cya@" + var9.name;
						this.menuAction[this.menuSize] = 62;
						this.menuParamA[this.menuSize] = var4;
						this.menuParamB[this.menuSize] = var5;
						this.menuParamC[this.menuSize] = var6;
						this.menuSize++;
					} else if (this.spellSelected != 1) {
						if (var9.op != null) {
							for (int var10 = 4; var10 >= 0; var10--) {
								if (var9.op[var10] != null) {
									this.menuOption[this.menuSize] = var9.op[var10] + " @cya@" + var9.name;
									if (var10 == 0) {
										this.menuAction[this.menuSize] = 502;
									}
									if (var10 == 1) {
										this.menuAction[this.menuSize] = 900;
									}
									if (var10 == 2) {
										this.menuAction[this.menuSize] = 113;
									}
									if (var10 == 3) {
										this.menuAction[this.menuSize] = 872;
									}
									if (var10 == 4) {
										this.menuAction[this.menuSize] = 1062;
									}
									this.menuParamA[this.menuSize] = var4;
									this.menuParamB[this.menuSize] = var5;
									this.menuParamC[this.menuSize] = var6;
									this.menuSize++;
								}
							}
						}
						this.menuOption[this.menuSize] = "Examine @cya@" + var9.name;
						this.menuAction[this.menuSize] = 1226;
						this.menuParamA[this.menuSize] = var9.type << 14;
						this.menuParamB[this.menuSize] = var5;
						this.menuParamC[this.menuSize] = var6;
						this.menuSize++;
					} else if ((this.activeSpellFlags & 0x4) == 4) {
						this.menuOption[this.menuSize] = this.spellCaption + " @cya@" + var9.name;
						this.menuAction[this.menuSize] = 956;
						this.menuParamA[this.menuSize] = var4;
						this.menuParamB[this.menuSize] = var5;
						this.menuParamC[this.menuSize] = var6;
						this.menuSize++;
					}
				}
				if (var7 == 1) {
					NpcEntity var11 = this.npcs[var8];
					if (var11.type.size == 1 && (var11.x & 0x7F) == 64 && (var11.z & 0x7F) == 64) {
						for (int var12 = 0; var12 < this.npcCount; var12++) {
							NpcEntity var15 = this.npcs[this.npcIds[var12]];
							if (var15 != null && var11 != var15 && var15.type.size == 1 && var11.x == var15.x && var11.z == var15.z) {
								this.addNPCOptions(var15.type, this.npcIds[var12], false, var6, var5);
							}
						}
						for (int var13 = 0; var13 < this.playerCount; var13++) {
							PlayerEntity var14 = this.players[this.playerIds[var13]];
							if (var14 != null && var11.x == var14.x && var11.z == var14.z) {
								this.addPlayerOptions(var5, this.playerIds[var13], var14, false, var6);
							}
						}
					}
					this.addNPCOptions(var11.type, var8, false, var6, var5);
				}
				if (var7 == 0) {
					PlayerEntity var16 = this.players[var8];
					if ((var16.x & 0x7F) == 64 && (var16.z & 0x7F) == 64) {
						for (int var17 = 0; var17 < this.npcCount; var17++) {
							NpcEntity var20 = this.npcs[this.npcIds[var17]];
							if (var20 != null && var20.type.size == 1 && var16.x == var20.x && var16.z == var20.z) {
								this.addNPCOptions(var20.type, this.npcIds[var17], false, var6, var5);
							}
						}
						for (int var18 = 0; var18 < this.playerCount; var18++) {
							PlayerEntity var19 = this.players[this.playerIds[var18]];
							if (var19 != null && var16 != var19 && var16.x == var19.x && var16.z == var19.z) {
								this.addPlayerOptions(var5, this.playerIds[var18], var19, false, var6);
							}
						}
					}
					this.addPlayerOptions(var5, var8, var16, false, var6);
				}
				if (var7 == 3) {
					LinkList var21 = this.levelObjStacks[this.currentLevel][var5][var6];
					if (var21 != null) {
						for (ObjStackEntity var22 = (ObjStackEntity) var21.tail(5); var22 != null; var22 = (ObjStackEntity) var21.prev(8)) {
							ObjType var23 = ObjType.get(var22.type);
							if (this.objSelected == 1) {
								this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @lre@" + var23.name;
								this.menuAction[this.menuSize] = 511;
								this.menuParamA[this.menuSize] = var22.type;
								this.menuParamB[this.menuSize] = var5;
								this.menuParamC[this.menuSize] = var6;
								this.menuSize++;
							} else if (this.spellSelected != 1) {
								for (int var24 = 4; var24 >= 0; var24--) {
									if (var23.op != null && var23.op[var24] != null) {
										this.menuOption[this.menuSize] = var23.op[var24] + " @lre@" + var23.name;
										if (var24 == 0) {
											this.menuAction[this.menuSize] = 652;
										}
										if (var24 == 1) {
											this.menuAction[this.menuSize] = 567;
										}
										if (var24 == 2) {
											this.menuAction[this.menuSize] = 234;
										}
										if (var24 == 3) {
											this.menuAction[this.menuSize] = 244;
										}
										if (var24 == 4) {
											this.menuAction[this.menuSize] = 213;
										}
										this.menuParamA[this.menuSize] = var22.type;
										this.menuParamB[this.menuSize] = var5;
										this.menuParamC[this.menuSize] = var6;
										this.menuSize++;
									} else if (var24 == 2) {
										this.menuOption[this.menuSize] = "Take @lre@" + var23.name;
										this.menuAction[this.menuSize] = 234;
										this.menuParamA[this.menuSize] = var22.type;
										this.menuParamB[this.menuSize] = var5;
										this.menuParamC[this.menuSize] = var6;
										this.menuSize++;
									}
								}
								this.menuOption[this.menuSize] = "Examine @lre@" + var23.name;
								this.menuAction[this.menuSize] = 1448;
								this.menuParamA[this.menuSize] = var22.type;
								this.menuParamB[this.menuSize] = var5;
								this.menuParamC[this.menuSize] = var6;
								this.menuSize++;
							} else if ((this.activeSpellFlags & 0x1) == 1) {
								this.menuOption[this.menuSize] = this.spellCaption + " @lre@" + var23.name;
								this.menuAction[this.menuSize] = 94;
								this.menuParamA[this.menuSize] = var22.type;
								this.menuParamB[this.menuSize] = var5;
								this.menuParamC[this.menuSize] = var6;
								this.menuSize++;
							}
						}
					}
				}
			}
		}
		if (arg0 != 33660) {
			this.packetType = this.in.g1();
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void unload(int arg0) {
		signlink.reporterror = false;
		try {
			if (this.stream != null) {
				this.stream.close();
			}
		} catch (Exception var3) {
		}
		this.stream = null;
		this.stopMidi(860);
		if (this.mouseTracking != null) {
			this.mouseTracking.active = false;
		}
		this.mouseTracking = null;
		this.ondemand.stop();
		this.ondemand = null;
		this.chatBuffer = null;
		this.out = null;
		this.login = null;
		this.in = null;
		this.sceneMapIndex = null;
		this.sceneMapLandData = null;
		this.sceneMapLocData = null;
		this.sceneMapLandFile = null;
		this.sceneMapLocFile = null;
		this.levelHeightmap = null;
		this.levelTileFlags = null;
		this.scene = null;
		this.levelCollisionMap = null;
		this.bfsDirection = null;
		this.bfsCost = null;
		this.bfsStepX = null;
		this.bfsStepZ = null;
		this.textureBuffer = null;
		this.areaSidebar = null;
		this.areaMapback = null;
		this.areaViewport = null;
		this.areaChatback = null;
		this.areaBackbase1 = null;
		this.areaBackbase2 = null;
		this.areaBackhmid1 = null;
		this.areaBackleft1 = null;
		this.areaBackleft2 = null;
		this.areaBackright1 = null;
		this.areaBackright2 = null;
		this.areaBacktop1 = null;
		this.areaBackvmid1 = null;
		this.areaBackvmid2 = null;
		this.areaBackvmid3 = null;
		this.areaBackhmid2 = null;
		this.imageInvback = null;
		this.imageMapback = null;
		this.imageChatback = null;
		this.imageBackbase1 = null;
		this.imageBackbase2 = null;
		this.imageBackhmid1 = null;
		this.imageSideicons = null;
		this.imageRedstone1 = null;
		this.imageRedstone2 = null;
		this.imageRedstone3 = null;
		this.imageRedstone1h = null;
		this.imageRedstone2h = null;
		this.imageRedstone1v = null;
		this.imageRedstone2v = null;
		this.imageRedstone3v = null;
		this.imageRedstone1hv = null;
		this.imageRedstone2hv = null;
		this.imageCompass = null;
		this.imageHitmarks = null;
		this.imageHeadicons = null;
		this.imageCrosses = null;
		this.imageMapdot0 = null;
		this.imageMapdot1 = null;
		this.imageMapdot2 = null;
		this.imageMapdot3 = null;
		this.imageMapdot4 = null;
		this.imageMapscene = null;
		this.imageMapfunction = null;
		this.tileLastOccupiedCycle = null;
		this.players = null;
		this.playerIds = null;
		this.entityUpdateIds = null;
		this.playerAppearanceBuffer = null;
		this.entityRemovalIds = null;
		this.npcs = null;
		this.npcIds = null;
		this.levelObjStacks = null;
		this.temporaryLocs = null;
		int var2 = 55 / arg0;
		this.projectiles = null;
		this.spotanims = null;
		this.menuParamB = null;
		this.menuParamC = null;
		this.menuAction = null;
		this.menuParamA = null;
		this.menuOption = null;
		this.varps = null;
		this.activeMapFunctionX = null;
		this.activeMapFunctionZ = null;
		this.activeMapFunctions = null;
		this.imageMinimap = null;
		this.friendName = null;
		this.friendName37 = null;
		this.friendWorld = null;
		this.imageTitle0 = null;
		this.imageTitle1 = null;
		this.imageTitle2 = null;
		this.imageTitle3 = null;
		this.imageTitle4 = null;
		this.imageTitle5 = null;
		this.imageTitle6 = null;
		this.imageTitle7 = null;
		this.imageTitle8 = null;
		this.unloadTitle(3);
		LocType.unload(-501);
		NpcType.unload(-501);
		ObjType.unload(-501);
		FloType.instances = null;
		IdkType.instances = null;
		Component.instances = null;
		OIBEELAZ.instances = null;
		SeqType.instances = null;
		SpotAnimType.instances = null;
		SpotAnimType.modelCache = null;
		VarpType.instances = null;
		super.drawArea = null;
		PlayerEntity.modelCache = null;
		Pix3D.unload(-501);
		World3D.unload(-501);
		Model.unload(-501);
		AnimFrame.unload(-501);
		System.gc();
		if (Linkable._flowObfuscator2) {
		}
	}

	@ObfuscatedName("client.g(B)V")
	public void debug(byte arg0) {
		System.out.println("============");
		System.out.println("flame-cycle:" + this.frameCycle);
		if (this.ondemand != null) {
			System.out.println("Od-cycle:" + this.ondemand.cycle);
		}
		System.out.println("loop-cycle:" + loopCycle);
		System.out.println("draw-cycle:" + drawCycle);
		System.out.println("ptype:" + this.packetType);
		if (arg0 == 1) {
			boolean var2 = false;
		} else {
			this._flowObfuscator19 = 281;
		}
		System.out.println("psize:" + this.packetSize);
		if (this.stream != null) {
			this.stream.debug((byte) 1);
		}
		super.showDebug = true;
	}

	@ObfuscatedName("client.f(I)Ljava/awt/Component;")
	public final java.awt.Component getBaseComponent(int arg0) {
		this.packetSize += arg0;
		if (signlink.mainapp == null) {
			return super.frame == null ? this : super.frame;
		} else {
			return signlink.mainapp;
		}
	}

	@ObfuscatedName("client.A(I)V")
	public final void handleInputKey(int arg0) {
		int var2 = 55 / arg0;
		while (true) {
			int var3;
			do {
				while (true) {
					var3 = this.pollKey(-796);
					if (var3 == -1) {
						return;
					}
					if (this.viewportInterfaceId != -1 && this.reportAbuseInterfaceId == this.viewportInterfaceId) {
						if (var3 == 8 && this.reportAbuseInput.length() > 0) {
							this.reportAbuseInput = this.reportAbuseInput.substring(0, this.reportAbuseInput.length() - 1);
						}
						break;
					}
					if (this.showSocialInput) {
						if (var3 >= 32 && var3 <= 122 && this.socialInput.length() < 80) {
							this.socialInput = this.socialInput + (char) var3;
							this.redrawChatback = true;
						}
						if (var3 == 8 && this.socialInput.length() > 0) {
							this.socialInput = this.socialInput.substring(0, this.socialInput.length() - 1);
							this.redrawChatback = true;
						}
						if (var3 == 13 || var3 == 10) {
							this.showSocialInput = false;
							this.redrawChatback = true;
							if (this.socialAction == 1) {
								long var4 = JString.toBase37(this.socialInput);
								this.addFriend((byte) 68, var4);
							}
							if (this.socialAction == 2 && this.friendCount > 0) {
								long var6 = JString.toBase37(this.socialInput);
								this.removeFriend(false, var6);
							}
							if (this.socialAction == 3 && this.socialInput.length() > 0) {
								this.out.p1isaac((byte) 6, 126);
								this.out.p1(0);
								int var8 = this.out.pos;
								this.out.p8(5, this.socialName37);
								WordPack.pack(this.socialInput, this._flowObfuscator45, this.out);
								this.out.psize1(this.out.pos - var8, (byte) 0);
								this.socialInput = WordPack.format(this.socialInput, 0);
								this.socialInput = WordFilter.filter(this.socialInput, 0);
								this.addMessage(this.socialInput, 6, JString.toSentenceCase(-45804, JString.fromBase37(this.socialName37, (byte) -99)), this._flowObfuscator21);
								if (this.privateChatSetting == 2) {
									this.privateChatSetting = 1;
									this.redrawPrivacySettings = true;
									this.out.p1isaac((byte) 6, 95);
									this.out.p1(this.publicChatSetting);
									this.out.p1(this.privateChatSetting);
									this.out.p1(this.tradeChatSetting);
								}
							}
							if (this.socialAction == 4 && this.ignoreCount < 100) {
								long var9 = JString.toBase37(this.socialInput);
								this.addIgnore(var9, 4);
							}
							if (this.socialAction == 5 && this.ignoreCount > 0) {
								long var11 = JString.toBase37(this.socialInput);
								this.removeIgnore(3, var11);
							}
						}
					} else if (this.chatbackInputOpen == 1) {
						if (var3 >= 48 && var3 <= 57 && this.chatbackInput.length() < 10) {
							this.chatbackInput = this.chatbackInput + (char) var3;
							this.redrawChatback = true;
						}
						if (var3 == 8 && this.chatbackInput.length() > 0) {
							this.chatbackInput = this.chatbackInput.substring(0, this.chatbackInput.length() - 1);
							this.redrawChatback = true;
						}
						if (var3 == 13 || var3 == 10) {
							if (this.chatbackInput.length() > 0) {
								int var13 = 0;
								try {
									var13 = Integer.parseInt(this.chatbackInput);
								} catch (Exception var23) {
								}
								this.out.p1isaac((byte) 6, 208);
								this.out.p4(var13);
							}
							this.chatbackInputOpen = 0;
							this.redrawChatback = true;
						}
					} else if (this.chatbackInputOpen == 2) {
						if (var3 >= 32 && var3 <= 122 && this.chatbackInput.length() < 12) {
							this.chatbackInput = this.chatbackInput + (char) var3;
							this.redrawChatback = true;
						}
						if (var3 == 8 && this.chatbackInput.length() > 0) {
							this.chatbackInput = this.chatbackInput.substring(0, this.chatbackInput.length() - 1);
							this.redrawChatback = true;
						}
						if (var3 == 13 || var3 == 10) {
							if (this.chatbackInput.length() > 0) {
								this.out.p1isaac((byte) 6, 60);
								this.out.p8(5, JString.toBase37(this.chatbackInput));
							}
							this.chatbackInputOpen = 0;
							this.redrawChatback = true;
						}
					} else if (this.chatInterfaceId == -1) {
						if (var3 >= 32 && var3 <= 122 && this.chatTyped.length() < 80) {
							this.chatTyped = this.chatTyped + (char) var3;
							this.redrawChatback = true;
						}
						if (var3 == 8 && this.chatTyped.length() > 0) {
							this.chatTyped = this.chatTyped.substring(0, this.chatTyped.length() - 1);
							this.redrawChatback = true;
						}
						if ((var3 == 13 || var3 == 10) && this.chatTyped.length() > 0) {
							if (this.rights == 2) {
								if (this.chatTyped.equals("::clientdrop")) {
									this.tryReconnect(-670);
								}
								if (this.chatTyped.equals("::lag")) {
									this.debug((byte) 1);
								}
								if (this.chatTyped.equals("::prefetchmusic")) {
									for (int var14 = 0; var14 < this.ondemand.getFileCount(79, 2); var14++) {
										this.ondemand.prefetch((byte) 1, 2, var14, (byte) 8);
									}
								}
								if (this.chatTyped.equals("::fpson")) {
									showFps = true;
								}
								if (this.chatTyped.equals("::fpsoff")) {
									showFps = false;
								}
								if (this.chatTyped.equals("::noclip")) {
									for (int var15 = 0; var15 < 4; var15++) {
										for (int var16 = 1; var16 < 103; var16++) {
											for (int var17 = 1; var17 < 103; var17++) {
												this.levelCollisionMap[var15].flags[var16][var17] = 0;
											}
										}
									}
								}
							}
							if (this.chatTyped.startsWith("::")) {
								this.out.p1isaac((byte) 6, 103);
								this.out.p1(this.chatTyped.length() - 1);
								this.out.pjstr(this.chatTyped.substring(2));
							} else {
								String var18 = this.chatTyped.toLowerCase();
								byte var19 = 0;
								if (var18.startsWith("yellow:")) {
									var19 = 0;
									this.chatTyped = this.chatTyped.substring(7);
								} else if (var18.startsWith("red:")) {
									var19 = 1;
									this.chatTyped = this.chatTyped.substring(4);
								} else if (var18.startsWith("green:")) {
									var19 = 2;
									this.chatTyped = this.chatTyped.substring(6);
								} else if (var18.startsWith("cyan:")) {
									var19 = 3;
									this.chatTyped = this.chatTyped.substring(5);
								} else if (var18.startsWith("purple:")) {
									var19 = 4;
									this.chatTyped = this.chatTyped.substring(7);
								} else if (var18.startsWith("white:")) {
									var19 = 5;
									this.chatTyped = this.chatTyped.substring(6);
								} else if (var18.startsWith("flash1:")) {
									var19 = 6;
									this.chatTyped = this.chatTyped.substring(7);
								} else if (var18.startsWith("flash2:")) {
									var19 = 7;
									this.chatTyped = this.chatTyped.substring(7);
								} else if (var18.startsWith("flash3:")) {
									var19 = 8;
									this.chatTyped = this.chatTyped.substring(7);
								} else if (var18.startsWith("glow1:")) {
									var19 = 9;
									this.chatTyped = this.chatTyped.substring(6);
								} else if (var18.startsWith("glow2:")) {
									var19 = 10;
									this.chatTyped = this.chatTyped.substring(6);
								} else if (var18.startsWith("glow3:")) {
									var19 = 11;
									this.chatTyped = this.chatTyped.substring(6);
								}
								String var20 = this.chatTyped.toLowerCase();
								byte var21 = 0;
								if (var20.startsWith("wave:")) {
									var21 = 1;
									this.chatTyped = this.chatTyped.substring(5);
								} else if (var20.startsWith("wave2:")) {
									var21 = 2;
									this.chatTyped = this.chatTyped.substring(6);
								} else if (var20.startsWith("shake:")) {
									var21 = 3;
									this.chatTyped = this.chatTyped.substring(6);
								} else if (var20.startsWith("scroll:")) {
									var21 = 4;
									this.chatTyped = this.chatTyped.substring(7);
								} else if (var20.startsWith("slide:")) {
									var21 = 5;
									this.chatTyped = this.chatTyped.substring(6);
								}
								this.out.p1isaac((byte) 6, 4);
								this.out.p1(0);
								int var22 = this.out.pos;
								this.out.p1_alt3(301, var21);
								this.out.p1_alt3(301, var19);
								this.chatBuffer.pos = 0;
								WordPack.pack(this.chatTyped, this._flowObfuscator45, this.chatBuffer);
								this.out.pdata_alt2(0, this._flowObfuscator39, this.chatBuffer.data, this.chatBuffer.pos);
								this.out.psize1(this.out.pos - var22, (byte) 0);
								this.chatTyped = WordPack.format(this.chatTyped, 0);
								this.chatTyped = WordFilter.filter(this.chatTyped, 0);
								localPlayer.chat = this.chatTyped;
								localPlayer.chatColor = var19;
								localPlayer.chatStyle = var21;
								localPlayer.chatTimer = 150;
								if (this.rights == 2) {
									this.addMessage(localPlayer.chat, 2, "@cr2@" + localPlayer.name, this._flowObfuscator21);
								} else if (this.rights == 1) {
									this.addMessage(localPlayer.chat, 2, "@cr1@" + localPlayer.name, this._flowObfuscator21);
								} else {
									this.addMessage(localPlayer.chat, 2, localPlayer.name, this._flowObfuscator21);
								}
								if (this.publicChatSetting == 2) {
									this.publicChatSetting = 3;
									this.redrawPrivacySettings = true;
									this.out.p1isaac((byte) 6, 95);
									this.out.p1(this.publicChatSetting);
									this.out.p1(this.privateChatSetting);
									this.out.p1(this.tradeChatSetting);
								}
							}
							this.chatTyped = "";
							this.redrawChatback = true;
						}
					}
				}
			} while ((var3 < 97 || var3 > 122) && (var3 < 65 || var3 > 90) && (var3 < 48 || var3 > 57) && var3 != 32);
			if (this.reportAbuseInput.length() < 12) {
				this.reportAbuseInput = this.reportAbuseInput + (char) var3;
			}
		}
	}

	@ObfuscatedName("client.a(III)V")
	public final void handlePrivateChatInput(int arg0, int arg1, int arg2) {
		if (this._flowObfuscator7 != arg2) {
			this._flowObfuscator7 = this.randomIn.nextInt();
		}
		int var4 = 0;
		for (int var5 = 0; var5 < 100; var5++) {
			if (this.messageText[var5] != null) {
				int var6 = this.messageType[var5];
				int var7 = 70 - var4 * 14 + this.chatScrollOffset + 4;
				if (var7 < -20) {
					break;
				}
				String var8 = this.messageSender[var5];
				boolean var9 = false;
				if (var8 != null && var8.startsWith("@cr1@")) {
					var8 = var8.substring(5);
					boolean var10 = true;
				}
				if (var8 != null && var8.startsWith("@cr2@")) {
					var8 = var8.substring(5);
					boolean var11 = true;
				}
				if (var6 == 0) {
					var4++;
				}
				if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.publicChatSetting == 0 || this.publicChatSetting == 1 && this.isFriend(false, var8))) {
					if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(localPlayer.name)) {
						if (this.rights >= 1) {
							this.menuOption[this.menuSize] = "Report abuse @whi@" + var8;
							this.menuAction[this.menuSize] = 606;
							this.menuSize++;
						}
						this.menuOption[this.menuSize] = "Add ignore @whi@" + var8;
						this.menuAction[this.menuSize] = 42;
						this.menuSize++;
						this.menuOption[this.menuSize] = "Add friend @whi@" + var8;
						this.menuAction[this.menuSize] = 337;
						this.menuSize++;
					}
					var4++;
				}
				if ((var6 == 3 || var6 == 7) && this.splitPrivateChat == 0 && (var6 == 7 || this.privateChatSetting == 0 || this.privateChatSetting == 1 && this.isFriend(false, var8))) {
					if (arg1 > var7 - 14 && arg1 <= var7) {
						if (this.rights >= 1) {
							this.menuOption[this.menuSize] = "Report abuse @whi@" + var8;
							this.menuAction[this.menuSize] = 606;
							this.menuSize++;
						}
						this.menuOption[this.menuSize] = "Add ignore @whi@" + var8;
						this.menuAction[this.menuSize] = 42;
						this.menuSize++;
						this.menuOption[this.menuSize] = "Add friend @whi@" + var8;
						this.menuAction[this.menuSize] = 337;
						this.menuSize++;
					}
					var4++;
				}
				if (var6 == 4 && (this.tradeChatSetting == 0 || this.tradeChatSetting == 1 && this.isFriend(false, var8))) {
					if (arg1 > var7 - 14 && arg1 <= var7) {
						this.menuOption[this.menuSize] = "Accept trade @whi@" + var8;
						this.menuAction[this.menuSize] = 484;
						this.menuSize++;
					}
					var4++;
				}
				if ((var6 == 5 || var6 == 6) && this.splitPrivateChat == 0 && this.privateChatSetting < 2) {
					var4++;
				}
				if (var6 == 8 && (this.tradeChatSetting == 0 || this.tradeChatSetting == 1 && this.isFriend(false, var8))) {
					if (arg1 > var7 - 14 && arg1 <= var7) {
						this.menuOption[this.menuSize] = "Accept challenge @whi@" + var8;
						this.menuAction[this.menuSize] = 6;
						this.menuSize++;
					}
					var4++;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILDUCMKFAY;)V")
	public final void updateInterfaceContent(int arg0, Component arg1) {
		int var3 = arg1.clientCode;
		if (arg0 <= 0) {
			this.out.p1(49);
		}
		if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
			if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
				int var5 = this.friendCount;
				if (this.friendListStatus != 2) {
					var5 = 0;
				}
				if (var3 > 800) {
					var3 -= 701;
				} else {
					var3 -= 101;
				}
				if (var3 >= var5) {
					arg1.text = "";
					arg1.buttonType = 0;
				} else {
					if (this.friendWorld[var3] == 0) {
						arg1.text = "@red@Offline";
					} else if (this.friendWorld[var3] == nodeId) {
						arg1.text = "@gre@World-" + (this.friendWorld[var3] - 9);
					} else {
						arg1.text = "@yel@World-" + (this.friendWorld[var3] - 9);
					}
					arg1.buttonType = 1;
				}
			} else if (var3 == 203) {
				int var6 = this.friendCount;
				if (this.friendListStatus != 2) {
					var6 = 0;
				}
				arg1.scroll = var6 * 15 + 20;
				if (arg1.scroll <= arg1.height) {
					arg1.scroll = arg1.height + 1;
				}
			} else if (var3 >= 401 && var3 <= 500) {
				var3 -= 401;
				if (var3 == 0 && this.friendListStatus == 0) {
					arg1.text = "Loading ignore list";
					arg1.buttonType = 0;
				} else if (var3 == 1 && this.friendListStatus == 0) {
					arg1.text = "Please wait...";
					arg1.buttonType = 0;
				} else {
					int var7 = this.ignoreCount;
					if (this.friendListStatus == 0) {
						var7 = 0;
					}
					if (var3 >= var7) {
						arg1.text = "";
						arg1.buttonType = 0;
					} else {
						arg1.text = JString.toSentenceCase(-45804, JString.fromBase37(this.ignoreName37[var3], (byte) -99));
						arg1.buttonType = 1;
					}
				}
			} else if (var3 == 503) {
				arg1.scroll = this.ignoreCount * 15 + 20;
				if (arg1.scroll <= arg1.height) {
					arg1.scroll = arg1.height + 1;
				}
			} else if (var3 == 327) {
				arg1.xan = 150;
				arg1.yan = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 0x7FF;
				if (this.updateDesignModel) {
					for (int var8 = 0; var8 < 7; var8++) {
						int var15 = this.designIdentikits[var8];
						if (var15 >= 0 && !IdkType.instances[var15].validateModel((byte) 2)) {
							return;
						}
					}
					this.updateDesignModel = false;
					Model[] var9 = new Model[7];
					int var10 = 0;
					for (int var11 = 0; var11 < 7; var11++) {
						int var14 = this.designIdentikits[var11];
						if (var14 >= 0) {
							var9[var10++] = IdkType.instances[var14].getModel(false);
						}
					}
					Model var12 = new Model(var10, var9, -38);
					for (int var13 = 0; var13 < 5; var13++) {
						if (this.designColors[var13] != 0) {
							var12.recolour(DESIGN_BODY_COLOR[var13][0], DESIGN_BODY_COLOR[var13][this.designColors[var13]]);
							if (var13 == 1) {
								var12.recolour(DESIGN_HAIR_COLOR[0], DESIGN_HAIR_COLOR[this.designColors[var13]]);
							}
						}
					}
					var12.createLabelReferences((byte) -71);
					var12.applyTransform(SeqType.instances[localPlayer.seqStandId].frames[0], 40542);
					var12.calculateNormals(64, 850, -30, -50, -30, true);
					arg1.modelType = 5;
					arg1.model = 0;
					Component.cacheModel(0, this._flowObfuscator22, 5, var12);
				}
			} else if (var3 == 324) {
				if (this.genderButtonImage0 == null) {
					this.genderButtonImage0 = arg1.graphic;
					this.genderButtonImage1 = arg1.activeGraphic;
				}
				if (this.designGenderMale) {
					arg1.graphic = this.genderButtonImage1;
				} else {
					arg1.graphic = this.genderButtonImage0;
				}
			} else if (var3 == 325) {
				if (this.genderButtonImage0 == null) {
					this.genderButtonImage0 = arg1.graphic;
					this.genderButtonImage1 = arg1.activeGraphic;
				}
				if (this.designGenderMale) {
					arg1.graphic = this.genderButtonImage0;
				} else {
					arg1.graphic = this.genderButtonImage1;
				}
			} else if (var3 == 600) {
				arg1.text = this.reportAbuseInput;
				if (loopCycle % 20 < 10) {
					arg1.text = arg1.text + "|";
				} else {
					arg1.text = arg1.text + " ";
				}
			} else {
				if (var3 == 613) {
					if (this.rights < 1) {
						arg1.text = "";
					} else if (this.reportAbuseMuteOption) {
						arg1.colour = 16711680;
						arg1.text = "Moderator option: Mute player for 48 hours: <ON>";
					} else {
						arg1.colour = 16777215;
						arg1.text = "Moderator option: Mute player for 48 hours: <OFF>";
					}
				}
				if (var3 == 650 || var3 == 655) {
					if (this.lastAddress == 0) {
						arg1.text = "";
					} else {
						String var16;
						if (this.daysSinceLastLogin == 0) {
							var16 = "earlier today";
						} else if (this.daysSinceLastLogin == 1) {
							var16 = "yesterday";
						} else {
							var16 = this.daysSinceLastLogin + " days ago";
						}
						arg1.text = "You last logged in " + var16 + " from: " + signlink.dns;
					}
				}
				if (var3 == 651) {
					if (this.unreadMessages == 0) {
						arg1.text = "0 unread messages";
						arg1.colour = 16776960;
					}
					if (this.unreadMessages == 1) {
						arg1.text = "1 unread message";
						arg1.colour = 65280;
					}
					if (this.unreadMessages > 1) {
						arg1.text = this.unreadMessages + " unread messages";
						arg1.colour = 65280;
					}
				}
				if (var3 == 652) {
					if (this.daysSinceRecoveriesChanged == 201) {
						if (this.warnMembersInNonMembers == 1) {
							arg1.text = "@yel@This is a non-members world: @whi@Since you are a member we";
						} else {
							arg1.text = "";
						}
					} else if (this.daysSinceRecoveriesChanged == 200) {
						arg1.text = "You have not yet set any password recovery questions.";
					} else {
						String var17;
						if (this.daysSinceRecoveriesChanged == 0) {
							var17 = "Earlier today";
						} else if (this.daysSinceRecoveriesChanged == 1) {
							var17 = "Yesterday";
						} else {
							var17 = this.daysSinceRecoveriesChanged + " days ago";
						}
						arg1.text = var17 + " you changed your recovery questions";
					}
				}
				if (var3 == 653) {
					if (this.daysSinceRecoveriesChanged == 201) {
						if (this.warnMembersInNonMembers == 1) {
							arg1.text = "@whi@recommend you use a members world instead. You may use";
						} else {
							arg1.text = "";
						}
					} else if (this.daysSinceRecoveriesChanged == 200) {
						arg1.text = "We strongly recommend you do so now to secure your account.";
					} else {
						arg1.text = "If you do not remember making this change then cancel it immediately";
					}
				}
				if (var3 == 654) {
					if (this.daysSinceRecoveriesChanged == 201) {
						if (this.warnMembersInNonMembers == 1) {
							arg1.text = "@whi@this world but member benefits are unavailable whilst here.";
						} else {
							arg1.text = "";
						}
					} else if (this.daysSinceRecoveriesChanged == 200) {
						arg1.text = "Do this from the 'account management' area on our front webpage";
					} else {
						arg1.text = "Do this from the 'account management' area on our front webpage";
					}
				}
			}
		} else if (var3 == 1 && this.friendListStatus == 0) {
			arg1.text = "Loading friend list";
			arg1.buttonType = 0;
		} else if (var3 == 1 && this.friendListStatus == 1) {
			arg1.text = "Connecting to friendserver";
			arg1.buttonType = 0;
		} else if (var3 == 2 && this.friendListStatus != 2) {
			arg1.text = "Please wait...";
			arg1.buttonType = 0;
		} else {
			int var4 = this.friendCount;
			if (this.friendListStatus != 2) {
				var4 = 0;
			}
			if (var3 > 700) {
				var3 -= 601;
			} else {
				var3--;
			}
			if (var3 >= var4) {
				arg1.text = "";
				arg1.buttonType = 0;
			} else {
				arg1.text = this.friendName[var3];
				arg1.buttonType = 1;
			}
		}
	}

	@ObfuscatedName("client.h(B)V")
	public final void drawPrivateMessages(byte arg0) {
		if (this.splitPrivateChat == 0) {
			return;
		}
		PixFont var2 = this.fontPlain12;
		if (this._flowObfuscator44 != arg0) {
			_flowObfuscator42 = !_flowObfuscator42;
		}
		int var3 = 0;
		if (this.systemUpdateTimer != 0) {
			var3 = 1;
		}
		for (int var4 = 0; var4 < 100; var4++) {
			if (this.messageText[var4] != null) {
				int var5 = this.messageType[var4];
				String var6 = this.messageSender[var4];
				byte var7 = 0;
				if (var6 != null && var6.startsWith("@cr1@")) {
					var6 = var6.substring(5);
					var7 = 1;
				}
				if (var6 != null && var6.startsWith("@cr2@")) {
					var6 = var6.substring(5);
					var7 = 2;
				}
				if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.privateChatSetting == 0 || this.privateChatSetting == 1 && this.isFriend(false, var6))) {
					int var8 = 329 - var3 * 13;
					byte var9 = 4;
					var2.drawString(0, "From", var8, 822, var9);
					var2.drawString(65535, "From", var8 - 1, 822, var9);
					int var10 = var9 + var2.stringWidthTag(this._flowObfuscator32, "From ");
					if (var7 == 1) {
						this.imageModIcons[0].draw(var10, 16083, var8 - 12);
						var10 += 14;
					}
					if (var7 == 2) {
						this.imageModIcons[1].draw(var10, 16083, var8 - 12);
						var10 += 14;
					}
					var2.drawString(0, var6 + ": " + this.messageText[var4], var8, 822, var10);
					var2.drawString(65535, var6 + ": " + this.messageText[var4], var8 - 1, 822, var10);
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
				if (var5 == 5 && this.privateChatSetting < 2) {
					int var11 = 329 - var3 * 13;
					var2.drawString(0, this.messageText[var4], var11, 822, 4);
					var2.drawString(65535, this.messageText[var4], var11 - 1, 822, 4);
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
				if (var5 == 6 && this.privateChatSetting < 2) {
					int var12 = 329 - var3 * 13;
					var2.drawString(0, "To " + var6 + ": " + this.messageText[var4], var12, 822, 4);
					var2.drawString(65535, "To " + var6 + ": " + this.messageText[var4], var12 - 1, 822, 4);
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;Z)V")
	public final void addMessage(String arg0, int arg1, String arg2, boolean arg3) {
		if (arg3) {
			return;
		}
		if (arg1 == 0 && this.stickyChatInterfaceId != -1) {
			this.modalMessage = arg0;
			super.mouseClickButton = 0;
		}
		if (this.chatInterfaceId == -1) {
			this.redrawChatback = true;
		}
		for (int var5 = 99; var5 > 0; var5--) {
			this.messageType[var5] = this.messageType[var5 - 1];
			this.messageSender[var5] = this.messageSender[var5 - 1];
			this.messageText[var5] = this.messageText[var5 - 1];
		}
		this.messageType[0] = arg1;
		this.messageSender[0] = arg2;
		this.messageText[0] = arg0;
	}

	@ObfuscatedName("client.B(I)V")
	public final void handleTabInput(int arg0) {
		int var2 = 72 / arg0;
		if (super.mouseClickButton != 1) {
			return;
		}
		if (super.mouseClickX >= 539 && super.mouseClickX <= 573 && super.mouseClickY >= 169 && super.mouseClickY < 205 && this.tabInterfaceId[0] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 0;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 569 && super.mouseClickX <= 599 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.tabInterfaceId[1] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 1;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 597 && super.mouseClickX <= 627 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.tabInterfaceId[2] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 2;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 625 && super.mouseClickX <= 669 && super.mouseClickY >= 168 && super.mouseClickY < 203 && this.tabInterfaceId[3] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 3;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 666 && super.mouseClickX <= 696 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.tabInterfaceId[4] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 4;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 694 && super.mouseClickX <= 724 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.tabInterfaceId[5] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 5;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 722 && super.mouseClickX <= 756 && super.mouseClickY >= 169 && super.mouseClickY < 205 && this.tabInterfaceId[6] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 6;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 540 && super.mouseClickX <= 574 && super.mouseClickY >= 466 && super.mouseClickY < 502 && this.tabInterfaceId[7] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 7;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 572 && super.mouseClickX <= 602 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.tabInterfaceId[8] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 8;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 599 && super.mouseClickX <= 629 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.tabInterfaceId[9] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 9;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 627 && super.mouseClickX <= 671 && super.mouseClickY >= 467 && super.mouseClickY < 502 && this.tabInterfaceId[10] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 10;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 669 && super.mouseClickX <= 699 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.tabInterfaceId[11] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 11;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 696 && super.mouseClickX <= 726 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.tabInterfaceId[12] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 12;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 724 && super.mouseClickX <= 758 && super.mouseClickY >= 466 && super.mouseClickY < 502 && this.tabInterfaceId[13] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 13;
			this.redrawSideicons = true;
			return;
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void prepareGameScreen(int arg0) {
		if (this.areaChatback != null) {
			return;
		}
		this.unloadTitle(3);
		super.drawArea = null;
		this.imageTitle2 = null;
		this.imageTitle3 = null;
		this.imageTitle4 = null;
		this.imageTitle0 = null;
		this.imageTitle1 = null;
		this.imageTitle5 = null;
		this.imageTitle6 = null;
		this.imageTitle7 = null;
		this.imageTitle8 = null;
		this.areaChatback = new PixMap(479, 96, this.getBaseComponent(0), 0);
		this.areaMapback = new PixMap(172, 156, this.getBaseComponent(0), 0);
		Pix2D.clear(this._flowObfuscator38);
		this.imageMapback.draw(0, 16083, 0);
		this.areaSidebar = new PixMap(190, 261, this.getBaseComponent(0), 0);
		this.areaViewport = new PixMap(512, 334, this.getBaseComponent(0), 0);
		Pix2D.clear(this._flowObfuscator38);
		this.areaBackbase1 = new PixMap(496, 50, this.getBaseComponent(0), 0);
		if (arg0 != 1) {
			this.load();
		}
		this.areaBackbase2 = new PixMap(269, 37, this.getBaseComponent(0), 0);
		this.areaBackhmid1 = new PixMap(249, 45, this.getBaseComponent(0), 0);
		this.redrawTitleBackground = true;
	}

	@ObfuscatedName("client.g(Z)Ljava/lang/String;")
	public final String getHost(boolean arg0) {
		this.ingame &= arg0;
		if (signlink.mainapp == null) {
			return super.frame == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
		} else {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}
	}

	@ObfuscatedName("client.a(LCXGZMTJK;III)V")
	public final void drawMinimapHint(Pix32 arg0, int arg1, int arg2, int arg3) {
		int var5 = arg2 * arg2 + arg3 * arg3;
		if (arg1 >= 0) {
			this.load();
		}
		if (var5 <= 4225 || var5 >= 90000) {
			this.drawOnMinimap(arg0, arg3, arg2, false);
			return;
		}
		int var6 = this.minimapAnticheatAngle + this.orbitCameraYaw & 0x7FF;
		int var7 = Model.sin[var6];
		int var8 = Model.cos[var6];
		int var9 = var7 * 256 / (this.minimapZoom + 256);
		int var10 = var8 * 256 / (this.minimapZoom + 256);
		int var11 = arg2 * var9 + arg3 * var10 >> 16;
		int var12 = arg2 * var10 - arg3 * var9 >> 16;
		double var13 = Math.atan2((double) var11, (double) var12);
		int var15 = (int) (Math.sin(var13) * 63.0D);
		int var16 = (int) (Math.cos(var13) * 57.0D);
		this.imageMapedge.drawRotated(83 - var16 - 20, 15, 20, 15, 41960, 256, 20, var13, var15 + 94 + 4 - 10);
	}

	@ObfuscatedName("client.D(I)V")
	public final void handleInput(int arg0) {
		if (this.objDragArea != 0) {
			return;
		}
		this.menuOption[0] = "Cancel";
		this.menuAction[0] = 1107;
		this.menuSize = 1;
		this.handlePrivateChatInput(false);
		this.lastHoveredInterfaceId = 0;
		if (super.mouseX > 4 && super.mouseY > 4 && super.mouseX < 516 && super.mouseY < 338) {
			if (this.viewportInterfaceId == -1) {
				this.handleViewportOptions(33660);
			} else {
				this.handleInterfaceInput(4, 13037, Component.instances[this.viewportInterfaceId], super.mouseX, 4, super.mouseY, 0);
			}
		}
		if (this.viewportHoveredInterfaceIndex != this.lastHoveredInterfaceId) {
			this.viewportHoveredInterfaceIndex = this.lastHoveredInterfaceId;
		}
		this.lastHoveredInterfaceId = 0;
		if (super.mouseX > 553 && super.mouseY > 205 && super.mouseX < 743 && super.mouseY < 466) {
			if (this.sidebarInterfaceId != -1) {
				this.handleInterfaceInput(553, 13037, Component.instances[this.sidebarInterfaceId], super.mouseX, 205, super.mouseY, 0);
			} else if (this.tabInterfaceId[this.selectedTab] != -1) {
				this.handleInterfaceInput(553, 13037, Component.instances[this.tabInterfaceId[this.selectedTab]], super.mouseX, 205, super.mouseY, 0);
			}
		}
		if (this.sidebarHoveredInterfaceIndex != this.lastHoveredInterfaceId) {
			this.redrawSidebar = true;
			this.sidebarHoveredInterfaceIndex = this.lastHoveredInterfaceId;
		}
		this.lastHoveredInterfaceId = 0;
		if (super.mouseX > 17 && super.mouseY > 357 && super.mouseX < 496 && super.mouseY < 453) {
			if (this.chatInterfaceId != -1) {
				this.handleInterfaceInput(17, 13037, Component.instances[this.chatInterfaceId], super.mouseX, 357, super.mouseY, 0);
			} else if (super.mouseY < 434 && super.mouseX < 426) {
				this.handlePrivateChatInput(super.mouseX - 17, super.mouseY - 357, 9);
			}
		}
		if (this.chatInterfaceId != -1 && this.chatHoveredInterfaceIndex != this.lastHoveredInterfaceId) {
			this.redrawChatback = true;
			this.chatHoveredInterfaceIndex = this.lastHoveredInterfaceId;
		}
		boolean var2 = false;
		this.packetSize += arg0;
		while (!var2) {
			var2 = true;
			for (int var3 = 0; var3 < this.menuSize - 1; var3++) {
				if (this.menuAction[var3] < 1000 && this.menuAction[var3 + 1] > 1000) {
					String var4 = this.menuOption[var3];
					this.menuOption[var3] = this.menuOption[var3 + 1];
					this.menuOption[var3 + 1] = var4;
					int var5 = this.menuAction[var3];
					this.menuAction[var3] = this.menuAction[var3 + 1];
					this.menuAction[var3 + 1] = var5;
					int var6 = this.menuParamB[var3];
					this.menuParamB[var3] = this.menuParamB[var3 + 1];
					this.menuParamB[var3 + 1] = var6;
					int var7 = this.menuParamC[var3];
					this.menuParamC[var3] = this.menuParamC[var3 + 1];
					this.menuParamC[var3 + 1] = var7;
					int var8 = this.menuParamA[var3];
					this.menuParamA[var3] = this.menuParamA[var3 + 1];
					this.menuParamA[var3 + 1] = var8;
					var2 = false;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZIII)I")
	public final int mix(boolean arg0, int arg1, int arg2, int arg3) {
		if (!arg0) {
			this.levelObjStacks = null;
		}
		int var5 = 256 - arg3;
		return ((arg1 & 0xFF00FF) * var5 + (arg2 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg1 & 0xFF00) * var5 + (arg2 & 0xFF00) * arg3 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void login(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.loginMessage0 = "";
				this.loginMessage1 = "Connecting to server...";
				this.drawTitleScreen(true, false);
			}
			this.stream = new ClientStream(this, -978, this.openSocket(portOffset + 43594));
			long var4 = JString.toBase37(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			this.out.pos = 0;
			this.out.p1(14);
			this.out.p1(var6);
			this.stream.write(2, 0, this.out.data, 0);
			for (int var7 = 0; var7 < 8; var7++) {
				this.stream.read();
			}
			int var8 = this.stream.read();
			int var9 = var8;
			if (var8 == 0) {
				this.stream.read(this.in.data, 0, 8);
				this.in.pos = 0;
				this.serverSeed = this.in.g8(-35089);
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.serverSeed >> 32), (int) this.serverSeed };
				this.out.pos = 0;
				this.out.p1(10);
				this.out.p4(var10[0]);
				this.out.p4(var10[1]);
				this.out.p4(var10[2]);
				this.out.p4(var10[3]);
				this.out.p4(signlink.uid);
				this.out.pjstr(arg0);
				this.out.pjstr(arg1);
				this.out.rsaenc(RSA_EXPONENT, RSA_MODULUS, (byte) 0);
				this.login.pos = 0;
				if (arg2) {
					this.login.p1(18);
				} else {
					this.login.p1(16);
				}
				this.login.p1(this.out.pos + 36 + 1 + 1 + 2);
				this.login.p1(255);
				this.login.p2(317);
				this.login.p1(lowMemory ? 1 : 0);
				for (int var11 = 0; var11 < 9; var11++) {
					this.login.p4(this.archiveChecksum[var11]);
				}
				this.login.pdata(this.out.data, this.out.pos, true, 0);
				this.out.random = new Isaac(-436, var10);
				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}
				this.randomIn = new Isaac(-436, var10);
				this.stream.write(this.login.pos, 0, this.login.data, 0);
				var8 = this.stream.read();
			}
			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}
				this.login(arg0, arg1, arg2);
			} else if (var8 == 2) {
				this.rights = this.stream.read();
				flagged = this.stream.read() == 1;
				this.prevMousePressTime = 0L;
				this.lastWriteDuplicates = 0;
				this.mouseTracking.length = 0;
				super.hasFocus = true;
				this.focused = true;
				this.ingame = true;
				this.out.pos = 0;
				this.in.pos = 0;
				this.packetType = -1;
				this.lastPacketType0 = -1;
				this.lastPacketType1 = -1;
				this.lastPacketType2 = -1;
				this.packetSize = 0;
				this.idleNetCycles = 0;
				this.systemUpdateTimer = 0;
				this.idleTimeout = 0;
				this.hintType = 0;
				this.menuSize = 0;
				this.menuVisible = false;
				super.idleCycles = 0;
				for (int var13 = 0; var13 < 100; var13++) {
					this.messageText[var13] = null;
				}
				this.objSelected = 0;
				this.spellSelected = 0;
				this.sceneState = 0;
				this.waveCount = 0;
				this.cameraAnticheatOffsetX = (int) (Math.random() * 100.0D) - 50;
				this.cameraAnticheatOffsetZ = (int) (Math.random() * 110.0D) - 55;
				this.cameraAnticheatAngle = (int) (Math.random() * 80.0D) - 40;
				this.minimapAnticheatAngle = (int) (Math.random() * 120.0D) - 60;
				this.minimapZoom = (int) (Math.random() * 30.0D) - 20;
				this.orbitCameraYaw = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				this.minimapState = 0;
				this.minimapLevel = -1;
				this.flagSceneTileX = 0;
				this.flagSceneTileZ = 0;
				this.playerCount = 0;
				this.npcCount = 0;
				for (int var14 = 0; var14 < this.MAX_PLAYER_COUNT; var14++) {
					this.players[var14] = null;
					this.playerAppearanceBuffer[var14] = null;
				}
				for (int var15 = 0; var15 < 16384; var15++) {
					this.npcs[var15] = null;
				}
				localPlayer = this.players[this.LOCAL_PLAYER_INDEX] = new PlayerEntity();
				this.projectiles.clear();
				this.spotanims.clear();
				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							this.levelObjStacks[var16][var17][var18] = null;
						}
					}
				}
				this.temporaryLocs = new LinkList(169);
				this.friendListStatus = 0;
				this.friendCount = 0;
				this.stickyChatInterfaceId = -1;
				this.chatInterfaceId = -1;
				this.viewportInterfaceId = -1;
				this.sidebarInterfaceId = -1;
				this.viewportOverlayInterfaceId = -1;
				this.pressedContinueOption = false;
				this.selectedTab = 3;
				this.chatbackInputOpen = 0;
				this.menuVisible = false;
				this.showSocialInput = false;
				this.modalMessage = null;
				this.inMultizone = 0;
				this.flashingTab = -1;
				this.designGenderMale = true;
				this.validateCharacterDesign(0);
				for (int var19 = 0; var19 < 5; var19++) {
					this.designColors[var19] = 0;
				}
				for (int var20 = 0; var20 < 5; var20++) {
					this.playerOptions[var20] = null;
					this.playerOptionPushDown[var20] = false;
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
				oplogic10 = 0;
				this.prepareGameScreen(1);
			} else if (var8 == 3) {
				this.loginMessage0 = "";
				this.loginMessage1 = "Invalid username or password.";
			} else if (var8 == 4) {
				this.loginMessage0 = "Your account has been disabled.";
				this.loginMessage1 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				this.loginMessage0 = "Your account is already logged in.";
				this.loginMessage1 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				this.loginMessage0 = "RuneScape has been updated!";
				this.loginMessage1 = "Please reload this page.";
			} else if (var8 == 7) {
				this.loginMessage0 = "This world is full.";
				this.loginMessage1 = "Please use a different world.";
			} else if (var8 == 8) {
				this.loginMessage0 = "Unable to connect.";
				this.loginMessage1 = "Login server offline.";
			} else if (var8 == 9) {
				this.loginMessage0 = "Login limit exceeded.";
				this.loginMessage1 = "Too many connections from your address.";
			} else if (var8 == 10) {
				this.loginMessage0 = "Unable to connect.";
				this.loginMessage1 = "Bad session id.";
			} else if (var8 == 11) {
				this.loginMessage1 = "Login server rejected session.";
				this.loginMessage1 = "Please try again.";
			} else if (var8 == 12) {
				this.loginMessage0 = "You need a members account to login to this world.";
				this.loginMessage1 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				this.loginMessage0 = "Could not complete login.";
				this.loginMessage1 = "Please try using a different world.";
			} else if (var8 == 14) {
				this.loginMessage0 = "The server is being updated.";
				this.loginMessage1 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				this.ingame = true;
				this.out.pos = 0;
				this.in.pos = 0;
				this.packetType = -1;
				this.lastPacketType0 = -1;
				this.lastPacketType1 = -1;
				this.lastPacketType2 = -1;
				this.packetSize = 0;
				this.idleNetCycles = 0;
				this.systemUpdateTimer = 0;
				this.menuSize = 0;
				this.menuVisible = false;
				this.sceneLoadStartTime = System.currentTimeMillis();
			} else if (var8 == 16) {
				this.loginMessage0 = "Login attempts exceeded.";
				this.loginMessage1 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				this.loginMessage0 = "You are standing in a members-only area.";
				this.loginMessage1 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				this.loginMessage0 = "Invalid loginserver requested";
				this.loginMessage1 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var21 = this.stream.read(); var21 >= 0; var21--) {
					this.loginMessage0 = "You have only just left another world";
					this.loginMessage1 = "Your profile will be transferred in: " + var21 + " seconds";
					this.drawTitleScreen(true, false);
					try {
						Thread.sleep(1000L);
					} catch (Exception var23) {
					}
				}
				this.login(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				this.loginMessage0 = "Unexpected server response";
				this.loginMessage1 = "Please try using a different world.";
			} else if (var9 != 0) {
				this.loginMessage0 = "No response from server";
				this.loginMessage1 = "Please try using a different world.";
			} else if (this.loginAttempts < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}
				this.loginAttempts++;
				this.login(arg0, arg1, arg2);
			} else {
				this.loginMessage0 = "No response from loginserver";
				this.loginMessage1 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			this.loginMessage0 = "";
			this.loginMessage1 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIIIZI)Z")
	public final boolean tryMove(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
		byte var13 = 104;
		byte var14 = 104;
		for (int var15 = 0; var15 < var13; var15++) {
			for (int var36 = 0; var36 < var14; var36++) {
				this.bfsDirection[var15][var36] = 0;
				this.bfsCost[var15][var36] = 99999999;
			}
		}
		int var16 = arg9;
		int var17 = arg5;
		this.bfsDirection[arg9][arg5] = 99;
		this.bfsCost[arg9][arg5] = 0;
		byte var18 = 0;
		int var19 = 0;
		this.bfsStepX[var18] = arg9;
		int var37 = var18 + 1;
		this.bfsStepZ[var18] = arg5;
		boolean var20 = false;
		int var21 = this.bfsStepX.length;
		int[][] var22 = this.levelCollisionMap[this.currentLevel].flags;
		while (var37 != var19) {
			var16 = this.bfsStepX[var19];
			var17 = this.bfsStepZ[var19];
			var19 = (var19 + 1) % var21;
			if (arg11 == var16 && arg8 == var17) {
				var20 = true;
				break;
			}
			if (arg4 != 0) {
				if ((arg4 < 5 || arg4 == 10) && this.levelCollisionMap[this.currentLevel].reachedWall(arg11, var16, var17, 0, arg1, arg4 - 1, arg8)) {
					var20 = true;
					break;
				}
				if (arg4 < 10 && this.levelCollisionMap[this.currentLevel].reachedWallDecoration(arg11, arg8, var17, arg4 - 1, arg1, var16, 0)) {
					var20 = true;
					break;
				}
			}
			if (arg6 != 0 && arg2 != 0 && this.levelCollisionMap[this.currentLevel].reachedLoc((byte) 1, arg8, arg11, var16, arg2, arg7, arg6, var17)) {
				var20 = true;
				break;
			}
			int var35 = this.bfsCost[var16][var17] + 1;
			if (var16 > 0 && this.bfsDirection[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				this.bfsStepX[var37] = var16 - 1;
				this.bfsStepZ[var37] = var17;
				var37 = (var37 + 1) % var21;
				this.bfsDirection[var16 - 1][var17] = 2;
				this.bfsCost[var16 - 1][var17] = var35;
			}
			if (var16 < var13 - 1 && this.bfsDirection[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				this.bfsStepX[var37] = var16 + 1;
				this.bfsStepZ[var37] = var17;
				var37 = (var37 + 1) % var21;
				this.bfsDirection[var16 + 1][var17] = 8;
				this.bfsCost[var16 + 1][var17] = var35;
			}
			if (var17 > 0 && this.bfsDirection[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				this.bfsStepX[var37] = var16;
				this.bfsStepZ[var37] = var17 - 1;
				var37 = (var37 + 1) % var21;
				this.bfsDirection[var16][var17 - 1] = 1;
				this.bfsCost[var16][var17 - 1] = var35;
			}
			if (var17 < var14 - 1 && this.bfsDirection[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				this.bfsStepX[var37] = var16;
				this.bfsStepZ[var37] = var17 + 1;
				var37 = (var37 + 1) % var21;
				this.bfsDirection[var16][var17 + 1] = 4;
				this.bfsCost[var16][var17 + 1] = var35;
			}
			if (var16 > 0 && var17 > 0 && this.bfsDirection[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				this.bfsStepX[var37] = var16 - 1;
				this.bfsStepZ[var37] = var17 - 1;
				var37 = (var37 + 1) % var21;
				this.bfsDirection[var16 - 1][var17 - 1] = 3;
				this.bfsCost[var16 - 1][var17 - 1] = var35;
			}
			if (var16 < var13 - 1 && var17 > 0 && this.bfsDirection[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				this.bfsStepX[var37] = var16 + 1;
				this.bfsStepZ[var37] = var17 - 1;
				var37 = (var37 + 1) % var21;
				this.bfsDirection[var16 + 1][var17 - 1] = 9;
				this.bfsCost[var16 + 1][var17 - 1] = var35;
			}
			if (var16 > 0 && var17 < var14 - 1 && this.bfsDirection[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				this.bfsStepX[var37] = var16 - 1;
				this.bfsStepZ[var37] = var17 + 1;
				var37 = (var37 + 1) % var21;
				this.bfsDirection[var16 - 1][var17 + 1] = 6;
				this.bfsCost[var16 - 1][var17 + 1] = var35;
			}
			if (var16 < var13 - 1 && var17 < var14 - 1 && this.bfsDirection[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				this.bfsStepX[var37] = var16 + 1;
				this.bfsStepZ[var37] = var17 + 1;
				var37 = (var37 + 1) % var21;
				this.bfsDirection[var16 + 1][var17 + 1] = 12;
				this.bfsCost[var16 + 1][var17 + 1] = var35;
			}
		}
		this.tryMoveNearest = 0;
		if (!var20) {
			if (arg10) {
				int var23 = 100;
				for (int var24 = 1; var24 < 2; var24++) {
					for (int var25 = arg11 - var24; var25 <= arg11 + var24; var25++) {
						for (int var26 = arg8 - var24; var26 <= arg8 + var24; var26++) {
							if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.bfsCost[var25][var26] < var23) {
								var23 = this.bfsCost[var25][var26];
								var16 = var25;
								var17 = var26;
								this.tryMoveNearest = 1;
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
		byte var27 = 0;
		this.bfsStepX[var27] = var16;
		int var38 = var27 + 1;
		this.bfsStepZ[var27] = var17;
		if (arg3 != -11308) {
			for (int var28 = 1; var28 > 0; var28++) {
			}
		}
		int var29;
		int var30 = var29 = this.bfsDirection[var16][var17];
		while (arg9 != var16 || arg5 != var17) {
			if (var29 != var30) {
				var29 = var30;
				this.bfsStepX[var38] = var16;
				this.bfsStepZ[var38++] = var17;
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
			var30 = this.bfsDirection[var16][var17];
		}
		if (var38 > 0) {
			int var31 = var38;
			if (var38 > 25) {
				var31 = 25;
			}
			var38--;
			int var32 = this.bfsStepX[var38];
			int var33 = this.bfsStepZ[var38];
			oplogic4 += var31;
			if (oplogic4 >= 92) {
				this.out.p1isaac((byte) 6, 36);
				this.out.p4(0);
				oplogic4 = 0;
			}
			if (arg0 == 0) {
				this.out.p1isaac((byte) 6, 164);
				this.out.p1(var31 + var31 + 3);
			}
			if (arg0 == 1) {
				this.out.p1isaac((byte) 6, 248);
				this.out.p1(var31 + var31 + 3 + 14);
			}
			if (arg0 == 2) {
				this.out.p1isaac((byte) 6, 98);
				this.out.p1(var31 + var31 + 3);
			}
			this.out.p2_alt3(0, this.sceneBaseTileX + var32);
			this.flagSceneTileX = this.bfsStepX[0];
			this.flagSceneTileZ = this.bfsStepZ[0];
			for (int var34 = 1; var34 < var31; var34++) {
				var38--;
				this.out.p1(this.bfsStepX[var38] - var32);
				this.out.p1(this.bfsStepZ[var38] - var33);
			}
			this.out.p2_alt1(true, this.sceneBaseTileZ + var33);
			this.out.p1_alt2(super.actionKey[5] == 1 ? 1 : 0, 0);
			return true;
		} else if (arg0 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("client.a(ILMBMGIXGO;Z)V")
	public final void readNpcUpdates(int arg0, Packet arg1, boolean arg2) {
		for (int var4 = 0; var4 < this.entityUpdateCount; var4++) {
			int var5 = this.entityUpdateIds[var4];
			NpcEntity var6 = this.npcs[var5];
			int var7 = arg1.g1();
			if ((var7 & 0x10) != 0) {
				int var8 = arg1.g2_alt1((byte) 108);
				if (var8 == 65535) {
					var8 = -1;
				}
				int var9 = arg1.g1();
				if (var6.primarySeqId == var8 && var8 != -1) {
					int var10 = SeqType.instances[var8].replacemode;
					if (var10 == 1) {
						var6.primarySeqFrame = 0;
						var6.primarySeqCycle = 0;
						var6.primarySeqDelay = var9;
						var6.primarySeqLoop = 0;
					}
					if (var10 == 2) {
						var6.primarySeqLoop = 0;
					}
				} else if (var8 == -1 || var6.primarySeqId == -1 || SeqType.instances[var8].priority >= SeqType.instances[var6.primarySeqId].priority) {
					var6.primarySeqId = var8;
					var6.primarySeqFrame = 0;
					var6.primarySeqCycle = 0;
					var6.primarySeqDelay = var9;
					var6.primarySeqLoop = 0;
					var6.seqPathLength = var6.pathLength;
				}
			}
			if ((var7 & 0x8) != 0) {
				int var11 = arg1.g1_alt1(0);
				int var12 = arg1.g1_alt2(false);
				var6.hit(-35698, var12, var11, loopCycle);
				var6.combatCycle = loopCycle + 300;
				var6.health = arg1.g1_alt1(0);
				var6.totalHealth = arg1.g1();
			}
			if ((var7 & 0x80) != 0) {
				var6.spotanimId = arg1.g2();
				int var13 = arg1.g4();
				var6.spotanimHeight = var13 >> 16;
				var6.spotanimLastCycle = (var13 & 0xFFFF) + loopCycle;
				var6.spotanimFrame = 0;
				var6.spotanimCycle = 0;
				if (var6.spotanimLastCycle > loopCycle) {
					var6.spotanimFrame = -1;
				}
				if (var6.spotanimId == 65535) {
					var6.spotanimId = -1;
				}
			}
			if ((var7 & 0x20) != 0) {
				var6.targetId = arg1.g2();
				if (var6.targetId == 65535) {
					var6.targetId = -1;
				}
			}
			if ((var7 & 0x1) != 0) {
				var6.chat = arg1.gjstr();
				var6.chatTimer = 100;
			}
			if ((var7 & 0x40) != 0) {
				int var14 = arg1.g1_alt2(false);
				int var15 = arg1.g1_alt3(2);
				var6.hit(-35698, var15, var14, loopCycle);
				var6.combatCycle = loopCycle + 300;
				var6.health = arg1.g1_alt3(2);
				var6.totalHealth = arg1.g1_alt2(false);
			}
			if ((var7 & 0x2) != 0) {
				var6.type = NpcType.get(arg1.g2_alt3((byte) -74));
				var6.size = var6.type.size;
				var6.turnSpeed = var6.type.turnspeed;
				var6.seqWalkId = var6.type.walkanim;
				var6.seqTurnAroundId = var6.type.walkanim_b;
				var6.seqTurnLeftId = var6.type.walkanim_r;
				var6.seqTurnRightId = var6.type.walkanim_l;
				var6.seqStandId = var6.type.readyanim;
			}
			if ((var7 & 0x4) != 0) {
				var6.targetTileX = arg1.g2_alt1((byte) 108);
				var6.targetTile = arg1.g2_alt1((byte) 108);
			}
		}
		this.ingame &= arg2;
	}

	@ObfuscatedName("client.a(LCKDEJADD;IZII)V")
	public final void addNPCOptions(NpcType arg0, int arg1, boolean arg2, int arg3, int arg4) {
		if (this.menuSize >= 400) {
			return;
		}
		if (arg0.multinpc != null) {
			arg0 = arg0.getMultiNpc(this._flowObfuscator10);
		}
		if (arg0 == null || !arg0.active) {
			return;
		}
		String var6 = arg0.name;
		if (arg2) {
			_flowObfuscator14 = true;
		}
		if (arg0.vislevel != 0) {
			var6 = var6 + getCombatLevelColorTag(localPlayer.combatLevel, arg0.vislevel, true) + " (level-" + arg0.vislevel + ")";
		}
		if (this.objSelected == 1) {
			this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @yel@" + var6;
			this.menuAction[this.menuSize] = 582;
			this.menuParamA[this.menuSize] = arg1;
			this.menuParamB[this.menuSize] = arg4;
			this.menuParamC[this.menuSize] = arg3;
			this.menuSize++;
		} else if (this.spellSelected != 1) {
			if (arg0.op != null) {
				for (int var7 = 4; var7 >= 0; var7--) {
					if (arg0.op[var7] != null && !arg0.op[var7].equalsIgnoreCase("attack")) {
						this.menuOption[this.menuSize] = arg0.op[var7] + " @yel@" + var6;
						if (var7 == 0) {
							this.menuAction[this.menuSize] = 20;
						}
						if (var7 == 1) {
							this.menuAction[this.menuSize] = 412;
						}
						if (var7 == 2) {
							this.menuAction[this.menuSize] = 225;
						}
						if (var7 == 3) {
							this.menuAction[this.menuSize] = 965;
						}
						if (var7 == 4) {
							this.menuAction[this.menuSize] = 478;
						}
						this.menuParamA[this.menuSize] = arg1;
						this.menuParamB[this.menuSize] = arg4;
						this.menuParamC[this.menuSize] = arg3;
						this.menuSize++;
					}
				}
			}
			if (arg0.op != null) {
				for (int var8 = 4; var8 >= 0; var8--) {
					if (arg0.op[var8] != null && arg0.op[var8].equalsIgnoreCase("attack")) {
						short var9 = 0;
						if (arg0.vislevel > localPlayer.combatLevel) {
							var9 = 2000;
						}
						this.menuOption[this.menuSize] = arg0.op[var8] + " @yel@" + var6;
						if (var8 == 0) {
							this.menuAction[this.menuSize] = var9 + 20;
						}
						if (var8 == 1) {
							this.menuAction[this.menuSize] = var9 + 412;
						}
						if (var8 == 2) {
							this.menuAction[this.menuSize] = var9 + 225;
						}
						if (var8 == 3) {
							this.menuAction[this.menuSize] = var9 + 965;
						}
						if (var8 == 4) {
							this.menuAction[this.menuSize] = var9 + 478;
						}
						this.menuParamA[this.menuSize] = arg1;
						this.menuParamB[this.menuSize] = arg4;
						this.menuParamC[this.menuSize] = arg3;
						this.menuSize++;
					}
				}
			}
			this.menuOption[this.menuSize] = "Examine @yel@" + var6;
			this.menuAction[this.menuSize] = 1025;
			this.menuParamA[this.menuSize] = arg1;
			this.menuParamB[this.menuSize] = arg4;
			this.menuParamC[this.menuSize] = arg3;
			this.menuSize++;
		} else if ((this.activeSpellFlags & 0x2) == 2) {
			this.menuOption[this.menuSize] = this.spellCaption + " @yel@" + var6;
			this.menuAction[this.menuSize] = 413;
			this.menuParamA[this.menuSize] = arg1;
			this.menuParamB[this.menuSize] = arg4;
			this.menuParamC[this.menuSize] = arg3;
			this.menuSize++;
			return;
		}
	}

	@ObfuscatedName("client.a(IILDLZHLHNK;ZI)V")
	public final void addPlayerOptions(int arg0, int arg1, PlayerEntity arg2, boolean arg3, int arg4) {
		if (localPlayer == arg2 || (this.menuSize >= 400 || arg3)) {
			return;
		}
		String var6;
		if (arg2.skillLevel == 0) {
			var6 = arg2.name + getCombatLevelColorTag(localPlayer.combatLevel, arg2.combatLevel, true) + " (level-" + arg2.combatLevel + ")";
		} else {
			var6 = arg2.name + " (skill-" + arg2.skillLevel + ")";
		}
		if (this.objSelected == 1) {
			this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @whi@" + var6;
			this.menuAction[this.menuSize] = 491;
			this.menuParamA[this.menuSize] = arg1;
			this.menuParamB[this.menuSize] = arg0;
			this.menuParamC[this.menuSize] = arg4;
			this.menuSize++;
		} else if (this.spellSelected != 1) {
			for (int var7 = 4; var7 >= 0; var7--) {
				if (this.playerOptions[var7] != null) {
					this.menuOption[this.menuSize] = this.playerOptions[var7] + " @whi@" + var6;
					short var9 = 0;
					if (this.playerOptions[var7].equalsIgnoreCase("attack")) {
						if (arg2.combatLevel > localPlayer.combatLevel) {
							var9 = 2000;
						}
						if (localPlayer.team != 0 && arg2.team != 0) {
							if (localPlayer.team == arg2.team) {
								var9 = 2000;
							} else {
								var9 = 0;
							}
						}
					} else if (this.playerOptionPushDown[var7]) {
						var9 = 2000;
					}
					if (var7 == 0) {
						this.menuAction[this.menuSize] = var9 + 561;
					}
					if (var7 == 1) {
						this.menuAction[this.menuSize] = var9 + 779;
					}
					if (var7 == 2) {
						this.menuAction[this.menuSize] = var9 + 27;
					}
					if (var7 == 3) {
						this.menuAction[this.menuSize] = var9 + 577;
					}
					if (var7 == 4) {
						this.menuAction[this.menuSize] = var9 + 729;
					}
					this.menuParamA[this.menuSize] = arg1;
					this.menuParamB[this.menuSize] = arg0;
					this.menuParamC[this.menuSize] = arg4;
					this.menuSize++;
				}
			}
		} else if ((this.activeSpellFlags & 0x8) == 8) {
			this.menuOption[this.menuSize] = this.spellCaption + " @whi@" + var6;
			this.menuAction[this.menuSize] = 365;
			this.menuParamA[this.menuSize] = arg1;
			this.menuParamB[this.menuSize] = arg0;
			this.menuParamC[this.menuSize] = arg4;
			this.menuSize++;
		}
		for (int var8 = 0; var8 < this.menuSize; var8++) {
			if (this.menuAction[var8] == 516) {
				this.menuOption[var8] = "Walk here @whi@" + var6;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(ZLDYMVKFXP;)V")
	public final void storeLoc(boolean arg0, LocAddEntity arg1) {
		int var3 = 0;
		int var4 = -1;
		int var5 = 0;
		int var6 = 0;
		if (arg1.layer == 0) {
			var3 = this.scene.getWallBitset(arg1.level, arg1.localX, arg1.localZ);
		}
		if (arg1.layer == 1) {
			var3 = this.scene.getWallDecorationBitset(arg1.level, arg1.localX, 0, arg1.localZ);
		}
		if (arg1.layer == 2) {
			var3 = this.scene.getLocBitset(arg1.level, arg1.localX, arg1.localZ);
		}
		if (arg1.layer == 3) {
			var3 = this.scene.getGroundDecorationBitset(arg1.level, arg1.localX, arg1.localZ);
		}
		if (var3 != 0) {
			int var7 = this.scene.getInfo(arg1.level, arg1.localX, arg1.localZ, var3);
			var4 = var3 >> 14 & 0x7FFF;
			var5 = var7 & 0x1F;
			var6 = var7 >> 6;
		}
		arg1.previousType = var4;
		arg1.previousShape = var5;
		if (arg0) {
			for (int var8 = 1; var8 > 0; var8++) {
			}
		}
		arg1.previousRotation = var6;
	}

	@ObfuscatedName("client.h(Z)V")
	public final void updateAudio(boolean arg0) {
		if (arg0) {
			this.packetType = -1;
		}
		for (int var2 = 0; var2 < this.waveCount; var2++) {
			if (this.waveDelay[var2] <= 0) {
				boolean var3 = false;
				try {
					if (this.waveIds[var2] != this.lastWaveId || this.waveLoops[var2] != this.lastWaveLoops) {
						Packet var4 = Wave.generate(this.waveLoops[var2], this.waveIds[var2], false);
						if (System.currentTimeMillis() + (long) (var4.pos / 22) > (long) (this.lastWaveLength / 22) + this.lastWaveStartTime) {
							this.lastWaveLength = var4.pos;
							this.lastWaveStartTime = System.currentTimeMillis();
							if (this.saveWave(var4.data, (byte) 116, var4.pos)) {
								this.lastWaveId = this.waveIds[var2];
								this.lastWaveLoops = this.waveLoops[var2];
							} else {
								var3 = true;
							}
						}
					} else if (!this.replayWave(11456)) {
						var3 = true;
					}
				} catch (Exception var7) {
				}
				if (var3 && this.waveDelay[var2] != -5) {
					this.waveDelay[var2] = -5;
				} else {
					this.waveCount--;
					for (int var6 = var2; var6 < this.waveCount; var6++) {
						this.waveIds[var6] = this.waveIds[var6 + 1];
						this.waveLoops[var6] = this.waveLoops[var6 + 1];
						this.waveDelay[var6] = this.waveDelay[var6 + 1];
					}
					var2--;
				}
			} else {
				int var10002 = this.waveDelay[var2]--;
			}
		}
		if (this.nextMusicDelay <= 0) {
			return;
		}
		this.nextMusicDelay -= 20;
		if (this.nextMusicDelay < 0) {
			this.nextMusicDelay = 0;
		}
		if (this.nextMusicDelay == 0 && this.midiActive && !lowMemory) {
			this.midiSong = this.nextMidiSong;
			this.midiFading = true;
			this.ondemand.request(2, this.midiSong);
			return;
		}
	}

	@ObfuscatedName("client.a()V")
	public final void load() {
		this.drawProgress(20, (byte) 4, "Starting up");
		if (signlink.sunjava) {
			super.mindel = 5;
		}
		if (started) {
			this.errorStarted = true;
			return;
		}
		started = true;
		boolean var1 = false;
		String var2 = this.getHost(true);
		if (var2.endsWith("jagex.com")) {
			var1 = true;
		}
		if (var2.endsWith("runescape.com")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.2")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.229")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.228")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.227")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.226")) {
			var1 = true;
		}
		if (var2.endsWith("127.0.0.1")) {
			var1 = true;
		}
		if (!var1) {
			this.errorHost = true;
			return;
		}
		if (signlink.cache_dat != null) {
			for (int var3 = 0; var3 < 5; var3++) {
				this.fileStreams[var3] = new FileStream(500000, signlink.cache_dat, signlink.cache_idx[var3], var3 + 1, true);
			}
		}
		try {
			this.loadArchiveChecksums(533);
			this.archiveTitle = this.loadArchive(1, "title screen", "title", this.archiveChecksum[1], (byte) -41, 25);
			this.fontPlain11 = new PixFont(false, "p11_full", 0, this.archiveTitle);
			this.fontPlain12 = new PixFont(false, "p12_full", 0, this.archiveTitle);
			this.fontBold12 = new PixFont(false, "b12_full", 0, this.archiveTitle);
			this.fontQuill8 = new PixFont(true, "q8_full", 0, this.archiveTitle);
			this.loadTitleBackground(0);
			this.loadTitleImages(215);
			Jagfile var4 = this.loadArchive(2, "config", "config", this.archiveChecksum[2], (byte) -41, 30);
			Jagfile var5 = this.loadArchive(3, "interface", "interface", this.archiveChecksum[3], (byte) -41, 35);
			Jagfile var6 = this.loadArchive(4, "2d graphics", "media", this.archiveChecksum[4], (byte) -41, 40);
			Jagfile var7 = this.loadArchive(6, "textures", "textures", this.archiveChecksum[6], (byte) -41, 45);
			Jagfile var8 = this.loadArchive(7, "chat system", "wordenc", this.archiveChecksum[7], (byte) -41, 50);
			Jagfile var9 = this.loadArchive(8, "sound effects", "sounds", this.archiveChecksum[8], (byte) -41, 55);
			this.levelTileFlags = new byte[4][104][104];
			this.levelHeightmap = new int[4][105][105];
			this.scene = new World3D(104, (byte) 43, 104, this.levelHeightmap, 4);
			for (int var10 = 0; var10 < 4; var10++) {
				this.levelCollisionMap[var10] = new CollisionMap(104, 104, true);
			}
			this.imageMinimap = new Pix32(512, 512);
			Jagfile var11 = this.loadArchive(5, "update list", "versionlist", this.archiveChecksum[5], (byte) -41, 60);
			this.drawProgress(60, (byte) 4, "Connecting to update server");
			this.ondemand = new OnDemand();
			this.ondemand.load(var11, this);
			AnimFrame.init(this.ondemand.getAnimCount(0));
			Model.init(this.ondemand.getFileCount(79, 0), this.ondemand);
			if (!lowMemory) {
				this.midiSong = 0;
				try {
					this.midiSong = Integer.parseInt(this.getParameter("music"));
				} catch (Exception var70) {
				}
				this.midiFading = true;
				this.ondemand.request(2, this.midiSong);
				while (this.ondemand.remaining() > 0) {
					this.handleOnDemandRequests(false);
					try {
						Thread.sleep(100L);
					} catch (Exception var69) {
					}
					if (this.ondemand.failCount > 3) {
						this.showLoadError("ondemand");
						return;
					}
				}
			}
			this.drawProgress(65, (byte) 4, "Requesting animations");
			int var12 = this.ondemand.getFileCount(79, 1);
			for (int var13 = 0; var13 < var12; var13++) {
				this.ondemand.request(1, var13);
			}
			while (this.ondemand.remaining() > 0) {
				int var14 = var12 - this.ondemand.remaining();
				if (var14 > 0) {
					this.drawProgress(65, (byte) 4, "Loading animations - " + var14 * 100 / var12 + "%");
				}
				this.handleOnDemandRequests(false);
				try {
					Thread.sleep(100L);
				} catch (Exception var68) {
				}
				if (this.ondemand.failCount > 3) {
					this.showLoadError("ondemand");
					return;
				}
			}
			this.drawProgress(70, (byte) 4, "Requesting models");
			int var15 = this.ondemand.getFileCount(79, 0);
			for (int var16 = 0; var16 < var15; var16++) {
				int var17 = this.ondemand.getModelFlags(var16, -203);
				if ((var17 & 0x1) != 0) {
					this.ondemand.request(0, var16);
				}
			}
			int var18 = this.ondemand.remaining();
			while (this.ondemand.remaining() > 0) {
				int var19 = var18 - this.ondemand.remaining();
				if (var19 > 0) {
					this.drawProgress(70, (byte) 4, "Loading models - " + var19 * 100 / var18 + "%");
				}
				this.handleOnDemandRequests(false);
				try {
					Thread.sleep(100L);
				} catch (Exception var67) {
				}
			}
			if (this.fileStreams[0] != null) {
				this.drawProgress(75, (byte) 4, "Requesting maps");
				this.ondemand.request(3, this.ondemand.getMapFile(0, 0, 48, 47));
				this.ondemand.request(3, this.ondemand.getMapFile(1, 0, 48, 47));
				this.ondemand.request(3, this.ondemand.getMapFile(0, 0, 48, 48));
				this.ondemand.request(3, this.ondemand.getMapFile(1, 0, 48, 48));
				this.ondemand.request(3, this.ondemand.getMapFile(0, 0, 48, 49));
				this.ondemand.request(3, this.ondemand.getMapFile(1, 0, 48, 49));
				this.ondemand.request(3, this.ondemand.getMapFile(0, 0, 47, 47));
				this.ondemand.request(3, this.ondemand.getMapFile(1, 0, 47, 47));
				this.ondemand.request(3, this.ondemand.getMapFile(0, 0, 47, 48));
				this.ondemand.request(3, this.ondemand.getMapFile(1, 0, 47, 48));
				this.ondemand.request(3, this.ondemand.getMapFile(0, 0, 148, 48));
				this.ondemand.request(3, this.ondemand.getMapFile(1, 0, 148, 48));
				int var20 = this.ondemand.remaining();
				while (this.ondemand.remaining() > 0) {
					int var21 = var20 - this.ondemand.remaining();
					if (var21 > 0) {
						this.drawProgress(75, (byte) 4, "Loading maps - " + var21 * 100 / var20 + "%");
					}
					this.handleOnDemandRequests(false);
					try {
						Thread.sleep(100L);
					} catch (Exception var66) {
					}
				}
			}
			int var22 = this.ondemand.getFileCount(79, 0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = this.ondemand.getModelFlags(var23, -203);
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
					this.ondemand.prefetch(var25, 0, var23, (byte) 8);
				}
			}
			this.ondemand.prefetchMaps(members, 0);
			if (!lowMemory) {
				int var26 = this.ondemand.getFileCount(79, 2);
				for (int var27 = 1; var27 < var26; var27++) {
					if (this.ondemand.shouldPrefetchMidi(var27, 5)) {
						this.ondemand.prefetch((byte) 1, 2, var27, (byte) 8);
					}
				}
			}
			this.drawProgress(80, (byte) 4, "Unpacking media");
			this.imageInvback = new Pix8(var6, "invback", 0);
			this.imageChatback = new Pix8(var6, "chatback", 0);
			this.imageMapback = new Pix8(var6, "mapback", 0);
			this.imageBackbase1 = new Pix8(var6, "backbase1", 0);
			this.imageBackbase2 = new Pix8(var6, "backbase2", 0);
			this.imageBackhmid1 = new Pix8(var6, "backhmid1", 0);
			for (int var28 = 0; var28 < 13; var28++) {
				this.imageSideicons[var28] = new Pix8(var6, "sideicons", var28);
			}
			this.imageCompass = new Pix32(var6, "compass", 0);
			this.imageMapedge = new Pix32(var6, "mapedge", 0);
			this.imageMapedge.crop(5059);
			try {
				for (int var29 = 0; var29 < 100; var29++) {
					this.imageMapscene[var29] = new Pix8(var6, "mapscene", var29);
				}
			} catch (Exception var74) {
			}
			try {
				for (int var30 = 0; var30 < 100; var30++) {
					this.imageMapfunction[var30] = new Pix32(var6, "mapfunction", var30);
				}
			} catch (Exception var73) {
			}
			try {
				for (int var31 = 0; var31 < 20; var31++) {
					this.imageHitmarks[var31] = new Pix32(var6, "hitmarks", var31);
				}
			} catch (Exception var72) {
			}
			try {
				for (int var32 = 0; var32 < 20; var32++) {
					this.imageHeadicons[var32] = new Pix32(var6, "headicons", var32);
				}
			} catch (Exception var71) {
			}
			this.imageMapmarker0 = new Pix32(var6, "mapmarker", 0);
			this.imageMapmarker1 = new Pix32(var6, "mapmarker", 1);
			for (int var33 = 0; var33 < 8; var33++) {
				this.imageCrosses[var33] = new Pix32(var6, "cross", var33);
			}
			this.imageMapdot0 = new Pix32(var6, "mapdots", 0);
			this.imageMapdot1 = new Pix32(var6, "mapdots", 1);
			this.imageMapdot2 = new Pix32(var6, "mapdots", 2);
			this.imageMapdot3 = new Pix32(var6, "mapdots", 3);
			this.imageMapdot4 = new Pix32(var6, "mapdots", 4);
			this.imageScrollbar0 = new Pix8(var6, "scrollbar", 0);
			this.imageScrollbar1 = new Pix8(var6, "scrollbar", 1);
			this.imageRedstone1 = new Pix8(var6, "redstone1", 0);
			this.imageRedstone2 = new Pix8(var6, "redstone2", 0);
			this.imageRedstone3 = new Pix8(var6, "redstone3", 0);
			this.imageRedstone1h = new Pix8(var6, "redstone1", 0);
			this.imageRedstone1h.flipHorizontally(0);
			this.imageRedstone2h = new Pix8(var6, "redstone2", 0);
			this.imageRedstone2h.flipHorizontally(0);
			this.imageRedstone1v = new Pix8(var6, "redstone1", 0);
			this.imageRedstone1v.flipVertically(true);
			this.imageRedstone2v = new Pix8(var6, "redstone2", 0);
			this.imageRedstone2v.flipVertically(true);
			this.imageRedstone3v = new Pix8(var6, "redstone3", 0);
			this.imageRedstone3v.flipVertically(true);
			this.imageRedstone1hv = new Pix8(var6, "redstone1", 0);
			this.imageRedstone1hv.flipHorizontally(0);
			this.imageRedstone1hv.flipVertically(true);
			this.imageRedstone2hv = new Pix8(var6, "redstone2", 0);
			this.imageRedstone2hv.flipHorizontally(0);
			this.imageRedstone2hv.flipVertically(true);
			for (int var34 = 0; var34 < 2; var34++) {
				this.imageModIcons[var34] = new Pix8(var6, "mod_icons", var34);
			}
			Pix32 var35 = new Pix32(var6, "backleft1", 0);
			this.areaBackleft1 = new PixMap(var35.cropRight, var35.cropBottom, this.getBaseComponent(0), 0);
			var35.blitOpaque(0, 0, -32357);
			Pix32 var36 = new Pix32(var6, "backleft2", 0);
			this.areaBackleft2 = new PixMap(var36.cropRight, var36.cropBottom, this.getBaseComponent(0), 0);
			var36.blitOpaque(0, 0, -32357);
			Pix32 var37 = new Pix32(var6, "backright1", 0);
			this.areaBackright1 = new PixMap(var37.cropRight, var37.cropBottom, this.getBaseComponent(0), 0);
			var37.blitOpaque(0, 0, -32357);
			Pix32 var38 = new Pix32(var6, "backright2", 0);
			this.areaBackright2 = new PixMap(var38.cropRight, var38.cropBottom, this.getBaseComponent(0), 0);
			var38.blitOpaque(0, 0, -32357);
			Pix32 var39 = new Pix32(var6, "backtop1", 0);
			this.areaBacktop1 = new PixMap(var39.cropRight, var39.cropBottom, this.getBaseComponent(0), 0);
			var39.blitOpaque(0, 0, -32357);
			Pix32 var40 = new Pix32(var6, "backvmid1", 0);
			this.areaBackvmid1 = new PixMap(var40.cropRight, var40.cropBottom, this.getBaseComponent(0), 0);
			var40.blitOpaque(0, 0, -32357);
			Pix32 var41 = new Pix32(var6, "backvmid2", 0);
			this.areaBackvmid2 = new PixMap(var41.cropRight, var41.cropBottom, this.getBaseComponent(0), 0);
			var41.blitOpaque(0, 0, -32357);
			Pix32 var42 = new Pix32(var6, "backvmid3", 0);
			this.areaBackvmid3 = new PixMap(var42.cropRight, var42.cropBottom, this.getBaseComponent(0), 0);
			var42.blitOpaque(0, 0, -32357);
			Pix32 var43 = new Pix32(var6, "backhmid2", 0);
			this.areaBackhmid2 = new PixMap(var43.cropRight, var43.cropBottom, this.getBaseComponent(0), 0);
			var43.blitOpaque(0, 0, -32357);
			int var44 = (int) (Math.random() * 21.0D) - 10;
			int var45 = (int) (Math.random() * 21.0D) - 10;
			int var46 = (int) (Math.random() * 21.0D) - 10;
			int var47 = (int) (Math.random() * 41.0D) - 20;
			for (int var48 = 0; var48 < 100; var48++) {
				if (this.imageMapfunction[var48] != null) {
					this.imageMapfunction[var48].translate(var44 + var47, var45 + var47, var46 + var47, 0);
				}
				if (this.imageMapscene[var48] != null) {
					this.imageMapscene[var48].translate(var44 + var47, var45 + var47, var46 + var47, 0);
				}
			}
			this.drawProgress(83, (byte) 4, "Unpacking textures");
			Pix3D.unpackTextures(var7, 0);
			Pix3D.setBrightness(0.8D, _flowObfuscator37);
			Pix3D.initPool(20, true);
			this.drawProgress(86, (byte) 4, "Unpacking config");
			SeqType.unpack(0, var4);
			LocType.unpack(var4);
			FloType.unpack(0, var4);
			ObjType.unpack(var4);
			NpcType.unpack(var4);
			IdkType.unpack(0, var4);
			SpotAnimType.unpack(0, var4);
			VarpType.unpack(0, var4);
			VarbitType.unpack(0, var4);
			ObjType.membersWorld = members;
			if (!lowMemory) {
				this.drawProgress(90, (byte) 4, "Unpacking sounds");
				byte[] var49 = var9.read("sounds.dat", null);
				Packet var50 = new Packet(var49, 891);
				Wave.unpack(0, var50);
			}
			this.drawProgress(95, (byte) 4, "Unpacking interfaces");
			PixFont[] var51 = new PixFont[] { this.fontPlain11, this.fontPlain12, this.fontBold12, this.fontQuill8 };
			Component.unpack(var5, var51, (byte) -84, var6);
			this.drawProgress(100, (byte) 4, "Preparing game engine");
			for (int var52 = 0; var52 < 33; var52++) {
				int var53 = 999;
				int var54 = 0;
				for (int var55 = 0; var55 < 34; var55++) {
					if (this.imageMapback.pixels[this.imageMapback.cropRight * var52 + var55] == 0) {
						if (var53 == 999) {
							var53 = var55;
						}
					} else if (var53 != 999) {
						var54 = var55;
						break;
					}
				}
				this.compassMaskLineOffsets[var52] = var53;
				this.compassMaskLineLengths[var52] = var54 - var53;
			}
			for (int var56 = 5; var56 < 156; var56++) {
				int var57 = 999;
				int var58 = 0;
				for (int var59 = 25; var59 < 172; var59++) {
					if (this.imageMapback.pixels[this.imageMapback.cropRight * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
						if (var57 == 999) {
							var57 = var59;
						}
					} else if (var57 != 999) {
						var58 = var59;
						break;
					}
				}
				this.minimapMaskLineOffsets[var56 - 5] = var57 - 25;
				this.minimapMaskLineLengths[var56 - 5] = var58 - var57;
			}
			Pix3D.init3D(-950, 479, 96);
			this.areaChatbackOffsets = Pix3D.lineOffset;
			Pix3D.init3D(-950, 190, 261);
			this.areaSidebarOffsets = Pix3D.lineOffset;
			Pix3D.init3D(-950, 512, 334);
			this.areaViewportOffsets = Pix3D.lineOffset;
			int[] var60 = new int[9];
			for (int var61 = 0; var61 < 9; var61++) {
				int var62 = var61 * 32 + 128 + 15;
				int var63 = var62 * 3 + 600;
				int var64 = Pix3D.sin[var62];
				var60[var61] = var63 * var64 >> 16;
			}
			World3D.init(500, 800, 512, 334, var60, _flowObfuscator42);
			WordFilter.unpack(var8);
			this.mouseTracking = new MouseTracking(this, _flowObfuscator29);
			this.startThread(this.mouseTracking, 10);
			LocEntity.varProvider = this;
			LocType.varProvider = this;
			NpcType.varProvider = this;
		} catch (Exception var75) {
			signlink.reporterror("loaderror " + this.lastProgressMessage + " " + this.lastProgressPercent);
			this.errorLoading = true;
		}
	}

	@ObfuscatedName("client.a(LMBMGIXGO;IB)V")
	public final void readNewPlayers(Packet arg0, int arg1, byte arg2) {
		if (arg2 == 8) {
			boolean var4 = false;
		} else {
			this._flowObfuscator34 = -50;
		}
		while (arg0.bitPos + 10 < arg1 * 8) {
			int var5 = arg0.gBit(11, 0);
			if (var5 == 2047) {
				break;
			}
			if (this.players[var5] == null) {
				this.players[var5] = new PlayerEntity();
				if (this.playerAppearanceBuffer[var5] != null) {
					this.players[var5].read(0, this.playerAppearanceBuffer[var5]);
				}
			}
			this.playerIds[this.playerCount++] = var5;
			PlayerEntity var6 = this.players[var5];
			var6.cycle = loopCycle;
			int var7 = arg0.gBit(1, 0);
			if (var7 == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = var5;
			}
			int var8 = arg0.gBit(1, 0);
			int var9 = arg0.gBit(5, 0);
			if (var9 > 15) {
				var9 -= 32;
			}
			int var10 = arg0.gBit(5, 0);
			if (var10 > 15) {
				var10 -= 32;
			}
			var6.move(localPlayer.pathTileX[0] + var10, localPlayer.pathTileZ[0] + var9, var8 == 1, false);
		}
		arg0.accessBytes(true);
	}

	@ObfuscatedName("client.i(Z)V")
	public final void handleMinimapInput(boolean arg0) {
		this.ingame &= arg0;
		if (this.minimapState != 0 || super.mouseClickButton != 1) {
			return;
		}
		int var2 = super.mouseClickX - 25 - 550;
		int var3 = super.mouseClickY - 5 - 4;
		if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
			var2 -= 73;
			var3 -= 75;
			int var4 = this.minimapAnticheatAngle + this.orbitCameraYaw & 0x7FF;
			int var5 = Pix3D.sin[var4];
			int var6 = Pix3D.cos[var4];
			int var7 = (this.minimapZoom + 256) * var5 >> 8;
			int var8 = (this.minimapZoom + 256) * var6 >> 8;
			int var9 = var2 * var8 + var3 * var7 >> 11;
			int var10 = var3 * var8 - var2 * var7 >> 11;
			int var11 = localPlayer.x + var9 >> 7;
			int var12 = localPlayer.z - var10 >> 7;
			boolean var13 = this.tryMove(1, 0, 0, -11308, 0, localPlayer.pathTileZ[0], 0, 0, var12, localPlayer.pathTileX[0], true, var11);
			if (var13) {
				this.out.p1(var2);
				this.out.p1(var3);
				this.out.p2(this.orbitCameraYaw);
				this.out.p1(57);
				this.out.p1(this.minimapAnticheatAngle);
				this.out.p1(this.minimapZoom);
				this.out.p1(89);
				this.out.p2(localPlayer.x);
				this.out.p2(localPlayer.z);
				this.out.p1(this.tryMoveNearest);
				this.out.p1(63);
			}
		}
		gamelogic5++;
		if (gamelogic5 <= 1151) {
			return;
		}
		gamelogic5 = 0;
		this.out.p1isaac((byte) 6, 246);
		this.out.p1(0);
		int var14 = this.out.pos;
		if ((int) (Math.random() * 2.0D) == 0) {
			this.out.p1(101);
		}
		this.out.p1(197);
		this.out.p2((int) (Math.random() * 65536.0D));
		this.out.p1((int) (Math.random() * 256.0D));
		this.out.p1(67);
		this.out.p2(14214);
		if ((int) (Math.random() * 2.0D) == 0) {
			this.out.p2(29487);
		}
		this.out.p2((int) (Math.random() * 65536.0D));
		if ((int) (Math.random() * 2.0D) == 0) {
			this.out.p1(220);
		}
		this.out.p1(180);
		this.out.psize1(this.out.pos - var14, (byte) 0);
		return;
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public final String getIntString(int arg0, int arg1) {
		if (arg0 <= 0) {
			this.packetType = this.in.g1();
		}
		return arg1 < 999999999 ? String.valueOf(arg1) : "*";
	}

	@ObfuscatedName("client.E(I)V")
	public final void drawError(int arg0) {
		if (arg0 != -13873) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		Graphics var3 = this.getBaseComponent(0).getGraphics();
		var3.setColor(Color.black);
		var3.fillRect(0, 0, 765, 503);
		this.setFramerate(false, 1);
		if (this.errorLoading) {
			this.flameActive = false;
			var3.setFont(new Font("Helvetica", 1, 16));
			var3.setColor(Color.yellow);
			byte var4 = 35;
			var3.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var4);
			int var6 = var4 + 50;
			var3.setColor(Color.white);
			var3.drawString("To fix this try the following (in order):", 30, var6);
			int var7 = var6 + 50;
			var3.setColor(Color.white);
			var3.setFont(new Font("Helvetica", 1, 12));
			var3.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var7);
			int var8 = var7 + 30;
			var3.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var8);
			int var9 = var8 + 30;
			var3.drawString("3: Try using a different game-world", 30, var9);
			int var11 = var9 + 30;
			var3.drawString("4: Try rebooting your computer", 30, var11);
			int var13 = var11 + 30;
			var3.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var13);
		}
		if (this.errorHost) {
			this.flameActive = false;
			var3.setFont(new Font("Helvetica", 1, 20));
			var3.setColor(Color.white);
			var3.drawString("Error - unable to load game!", 50, 50);
			var3.drawString("To play RuneScape make sure you play from", 50, 100);
			var3.drawString("http://www.runescape.com", 50, 150);
		}
		if (!this.errorStarted) {
			return;
		}
		this.flameActive = false;
		var3.setColor(Color.yellow);
		byte var5 = 35;
		var3.drawString("Error a copy of RuneScape already appears to be loaded", 30, var5);
		int var10 = var5 + 50;
		var3.setColor(Color.white);
		var3.drawString("To fix this try the following (in order):", 30, var10);
		int var12 = var10 + 50;
		var3.setColor(Color.white);
		var3.setFont(new Font("Helvetica", 1, 12));
		var3.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var12);
		int var14 = var12 + 30;
		var3.drawString("2: Try rebooting your computer, and reloading", 30, var14);
		int var15 = var14 + 30;
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}
		try {
			if (super.frame != null) {
				return new URL("http://127.0.0.1:" + (portOffset + 80));
			}
		} catch (Exception var1) {
		}
		return super.getCodeBase();
	}

	@ObfuscatedName("client.F(I)V")
	public final void updateNpcs(int arg0) {
		for (int var2 = 0; var2 < this.npcCount; var2++) {
			int var3 = this.npcIds[var2];
			NpcEntity var4 = this.npcs[var3];
			if (var4 != null) {
				this.updateEntity(46988, var4.type.size, var4);
			}
		}
		if (arg0 != -8066) {
			this._flowObfuscator40 = 148;
		}
	}

	@ObfuscatedName("client.a(IILGQOSZKJC;)V")
	public final void updateEntity(int arg0, int arg1, PathingEntity arg2) {
		if (arg0 != 46988) {
			this.packetType = -1;
		}
		if (arg2.x < 128 || arg2.z < 128 || arg2.x >= 13184 || arg2.z >= 13184) {
			arg2.primarySeqId = -1;
			arg2.spotanimId = -1;
			arg2.forceMoveEndCycle = 0;
			arg2.forceMoveStartCycle = 0;
			arg2.x = arg2.pathTileX[0] * 128 + arg2.size * 64;
			arg2.z = arg2.pathTileZ[0] * 128 + arg2.size * 64;
			arg2.resetPath(true);
		}
		if (localPlayer == arg2 && (arg2.x < 1536 || arg2.z < 1536 || arg2.x >= 11776 || arg2.z >= 11776)) {
			arg2.primarySeqId = -1;
			arg2.spotanimId = -1;
			arg2.forceMoveEndCycle = 0;
			arg2.forceMoveStartCycle = 0;
			arg2.x = arg2.pathTileX[0] * 128 + arg2.size * 64;
			arg2.z = arg2.pathTileZ[0] * 128 + arg2.size * 64;
			arg2.resetPath(true);
		}
		if (arg2.forceMoveEndCycle > loopCycle) {
			this.updateForceMovement(arg2, true);
		} else if (arg2.forceMoveStartCycle >= loopCycle) {
			this.startForceMovement(arg2, this._flowObfuscator23);
		} else {
			this.updateMovement((byte) 34, arg2);
		}
		this.updateFacingDirection(arg2, -843);
		this.updateSequences(arg2, -805);
	}

	@ObfuscatedName("client.a(LGQOSZKJC;Z)V")
	public final void updateForceMovement(PathingEntity arg0, boolean arg1) {
		int var3 = arg0.forceMoveEndCycle - loopCycle;
		int var4 = arg0.forceMoveStartSceneTileX * 128 + arg0.size * 64;
		int var5 = arg0.forceMoveStartSceneTileZ * 128 + arg0.size * 64;
		arg0.x += (var4 - arg0.x) / var3;
		if (!arg1) {
			return;
		}
		arg0.z += (var5 - arg0.z) / var3;
		arg0.seqTrigger = 0;
		if (arg0.forceMoveFaceDirection == 0) {
			arg0.dstYaw = 1024;
		}
		if (arg0.forceMoveFaceDirection == 1) {
			arg0.dstYaw = 1536;
		}
		if (arg0.forceMoveFaceDirection == 2) {
			arg0.dstYaw = 0;
		}
		if (arg0.forceMoveFaceDirection == 3) {
			arg0.dstYaw = 512;
		}
	}

	@ObfuscatedName("client.a(LGQOSZKJC;B)V")
	public final void startForceMovement(PathingEntity arg0, byte arg1) {
		if (loopCycle == arg0.forceMoveStartCycle || arg0.primarySeqId == -1 || arg0.primarySeqDelay != 0 || arg0.primarySeqCycle + 1 > SeqType.instances[arg0.primarySeqId].getFrameDuration(arg0.primarySeqFrame, (byte) -39)) {
			int var3 = arg0.forceMoveStartCycle - arg0.forceMoveEndCycle;
			int var4 = loopCycle - arg0.forceMoveEndCycle;
			int var5 = arg0.forceMoveStartSceneTileX * 128 + arg0.size * 64;
			int var6 = arg0.forceMoveStartSceneTileZ * 128 + arg0.size * 64;
			int var7 = arg0.forceMoveEndSceneTileX * 128 + arg0.size * 64;
			int var8 = arg0.forceMoveEndSceneTileZ * 128 + arg0.size * 64;
			arg0.x = ((var3 - var4) * var5 + var4 * var7) / var3;
			arg0.z = ((var3 - var4) * var6 + var4 * var8) / var3;
		}
		arg0.seqTrigger = 0;
		if (arg0.forceMoveFaceDirection == 0) {
			arg0.dstYaw = 1024;
		}
		if (arg0.forceMoveFaceDirection == 1) {
			arg0.dstYaw = 1536;
		}
		if (arg0.forceMoveFaceDirection == 2) {
			arg0.dstYaw = 0;
		}
		if (arg0.forceMoveFaceDirection == 3) {
			arg0.dstYaw = 512;
		}
		arg0.yaw = arg0.dstYaw;
		if (this._flowObfuscator23 != arg1) {
			_flowObfuscator29 = -383;
		}
	}

	@ObfuscatedName("client.a(BLGQOSZKJC;)V")
	public final void updateMovement(byte arg0, PathingEntity arg1) {
		arg1.secondarySeqId = arg1.seqStandId;
		if (arg1.pathLength == 0) {
			arg1.seqTrigger = 0;
			return;
		}
		if (arg1.primarySeqId != -1 && arg1.primarySeqDelay == 0) {
			SeqType var3 = SeqType.instances[arg1.primarySeqId];
			if (arg1.seqPathLength > 0 && var3.preanim_move == 0) {
				arg1.seqTrigger++;
				return;
			}
			if (arg1.seqPathLength <= 0 && var3.postanim_move == 0) {
				arg1.seqTrigger++;
				return;
			}
		}
		int var4 = arg1.x;
		int var5 = arg1.z;
		int var6 = arg1.pathTileX[arg1.pathLength - 1] * 128 + arg1.size * 64;
		int var7 = arg1.pathTileZ[arg1.pathLength - 1] * 128 + arg1.size * 64;
		if (var6 - var4 > 256 || var6 - var4 < -256 || var7 - var5 > 256 || var7 - var5 < -256) {
			arg1.x = var6;
			arg1.z = var7;
			return;
		}
		if (var4 < var6) {
			if (var5 < var7) {
				arg1.dstYaw = 1280;
			} else if (var5 > var7) {
				arg1.dstYaw = 1792;
			} else {
				arg1.dstYaw = 1536;
			}
		} else if (var4 > var6) {
			if (var5 < var7) {
				arg1.dstYaw = 768;
			} else if (var5 > var7) {
				arg1.dstYaw = 256;
			} else {
				arg1.dstYaw = 512;
			}
		} else if (var5 < var7) {
			arg1.dstYaw = 1024;
		} else {
			arg1.dstYaw = 0;
		}
		int var8 = arg1.dstYaw - arg1.yaw & 0x7FF;
		if (var8 > 1024) {
			var8 -= 2048;
		}
		int var9 = arg1.seqTurnAroundId;
		if (var8 >= -256 && var8 <= 256) {
			var9 = arg1.seqWalkId;
		} else if (var8 >= 256 && var8 < 768) {
			var9 = arg1.seqTurnRightId;
		} else if (var8 >= -768 && var8 <= -256) {
			var9 = arg1.seqTurnLeftId;
		}
		if (var9 == -1) {
			var9 = arg1.seqWalkId;
		}
		arg1.secondarySeqId = var9;
		int var10 = 4;
		if (arg0 != 34) {
			_flowObfuscator29 = 285;
		}
		if (arg1.yaw != arg1.dstYaw && arg1.targetId == -1 && arg1.turnSpeed != 0) {
			var10 = 2;
		}
		if (arg1.pathLength > 2) {
			var10 = 6;
		}
		if (arg1.pathLength > 3) {
			var10 = 8;
		}
		if (arg1.seqTrigger > 0 && arg1.pathLength > 1) {
			var10 = 8;
			arg1.seqTrigger--;
		}
		if (arg1.pathRunning[arg1.pathLength - 1]) {
			var10 <<= 0x1;
		}
		if (var10 >= 8 && arg1.seqWalkId == arg1.secondarySeqId && arg1.seqRunId != -1) {
			arg1.secondarySeqId = arg1.seqRunId;
		}
		if (var4 < var6) {
			arg1.x += var10;
			if (arg1.x > var6) {
				arg1.x = var6;
			}
		} else if (var4 > var6) {
			arg1.x -= var10;
			if (arg1.x < var6) {
				arg1.x = var6;
			}
		}
		if (var5 < var7) {
			arg1.z += var10;
			if (arg1.z > var7) {
				arg1.z = var7;
			}
		} else if (var5 > var7) {
			arg1.z -= var10;
			if (arg1.z < var7) {
				arg1.z = var7;
			}
		}
		if (arg1.x != var6 || arg1.z != var7) {
			return;
		}
		arg1.pathLength--;
		if (arg1.seqPathLength > 0) {
			arg1.seqPathLength--;
			return;
		}
	}

	@ObfuscatedName("client.a(LGQOSZKJC;I)V")
	public final void updateFacingDirection(PathingEntity arg0, int arg1) {
		if (arg1 >= 0 || arg0.turnSpeed == 0) {
			return;
		}
		if (arg0.targetId != -1 && arg0.targetId < 32768) {
			NpcEntity var3 = this.npcs[arg0.targetId];
			if (var3 != null) {
				int var4 = arg0.x - var3.x;
				int var5 = arg0.z - var3.z;
				if (var4 != 0 || var5 != 0) {
					arg0.dstYaw = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
				}
			}
		}
		if (arg0.targetId >= 32768) {
			int var6 = arg0.targetId - 32768;
			if (this.localPid == var6) {
				var6 = this.LOCAL_PLAYER_INDEX;
			}
			PlayerEntity var7 = this.players[var6];
			if (var7 != null) {
				int var8 = arg0.x - var7.x;
				int var9 = arg0.z - var7.z;
				if (var8 != 0 || var9 != 0) {
					arg0.dstYaw = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.targetTileX != 0 || arg0.targetTile != 0) && (arg0.pathLength == 0 || arg0.seqTrigger > 0)) {
			int var10 = arg0.x - (arg0.targetTileX - this.sceneBaseTileX - this.sceneBaseTileX) * 64;
			int var11 = arg0.z - (arg0.targetTile - this.sceneBaseTileZ - this.sceneBaseTileZ) * 64;
			if (var10 != 0 || var11 != 0) {
				arg0.dstYaw = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
			}
			arg0.targetTileX = 0;
			arg0.targetTile = 0;
		}
		int var12 = arg0.dstYaw - arg0.yaw & 0x7FF;
		if (var12 == 0) {
			return;
		}
		if (var12 < arg0.turnSpeed || var12 > 2048 - arg0.turnSpeed) {
			arg0.yaw = arg0.dstYaw;
		} else if (var12 > 1024) {
			arg0.yaw -= arg0.turnSpeed;
		} else {
			arg0.yaw += arg0.turnSpeed;
		}
		arg0.yaw &= 0x7FF;
		if (arg0.secondarySeqId != arg0.seqStandId || arg0.yaw == arg0.dstYaw) {
			return;
		}
		if (arg0.seqTurnId != -1) {
			arg0.secondarySeqId = arg0.seqTurnId;
			return;
		}
		arg0.secondarySeqId = arg0.seqWalkId;
		return;
	}

	@ObfuscatedName("client.b(LGQOSZKJC;I)V")
	public final void updateSequences(PathingEntity arg0, int arg1) {
		if (arg1 >= 0) {
			_flowObfuscator14 = true;
		}
		arg0.needsForwardDrawPadding = false;
		if (arg0.secondarySeqId != -1) {
			SeqType var3 = SeqType.instances[arg0.secondarySeqId];
			arg0.secondarySeqCycle++;
			if (arg0.secondarySeqFrame < var3.frameCount && arg0.secondarySeqCycle > var3.getFrameDuration(arg0.secondarySeqFrame, (byte) -39)) {
				arg0.secondarySeqCycle = 0;
				arg0.secondarySeqFrame++;
			}
			if (arg0.secondarySeqFrame >= var3.frameCount) {
				arg0.secondarySeqCycle = 0;
				arg0.secondarySeqFrame = 0;
			}
		}
		if (arg0.spotanimId != -1 && loopCycle >= arg0.spotanimLastCycle) {
			if (arg0.spotanimFrame < 0) {
				arg0.spotanimFrame = 0;
			}
			SeqType var4 = SpotAnimType.instances[arg0.spotanimId].seq;
			arg0.spotanimCycle++;
			while (arg0.spotanimFrame < var4.frameCount && arg0.spotanimCycle > var4.getFrameDuration(arg0.spotanimFrame, (byte) -39)) {
				arg0.spotanimCycle -= var4.getFrameDuration(arg0.spotanimFrame, (byte) -39);
				arg0.spotanimFrame++;
			}
			if (arg0.spotanimFrame >= var4.frameCount && (arg0.spotanimFrame < 0 || arg0.spotanimFrame >= var4.frameCount)) {
				arg0.spotanimId = -1;
			}
		}
		if (arg0.primarySeqId != -1 && arg0.primarySeqDelay <= 1) {
			SeqType var5 = SeqType.instances[arg0.primarySeqId];
			if (var5.preanim_move == 1 && arg0.seqPathLength > 0 && arg0.forceMoveEndCycle <= loopCycle && arg0.forceMoveStartCycle < loopCycle) {
				arg0.primarySeqDelay = 1;
				return;
			}
		}
		if (arg0.primarySeqId != -1 && arg0.primarySeqDelay == 0) {
			SeqType var6 = SeqType.instances[arg0.primarySeqId];
			arg0.primarySeqCycle++;
			while (arg0.primarySeqFrame < var6.frameCount && arg0.primarySeqCycle > var6.getFrameDuration(arg0.primarySeqFrame, (byte) -39)) {
				arg0.primarySeqCycle -= var6.getFrameDuration(arg0.primarySeqFrame, (byte) -39);
				arg0.primarySeqFrame++;
			}
			if (arg0.primarySeqFrame >= var6.frameCount) {
				arg0.primarySeqFrame -= var6.replayoff;
				arg0.primarySeqLoop++;
				if (arg0.primarySeqLoop >= var6.replaycount) {
					arg0.primarySeqId = -1;
				}
				if (arg0.primarySeqFrame < 0 || arg0.primarySeqFrame >= var6.frameCount) {
					arg0.primarySeqId = -1;
				}
			}
			arg0.needsForwardDrawPadding = var6.stretches;
		}
		if (arg0.primarySeqDelay > 0) {
			arg0.primarySeqDelay--;
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void drawGame(boolean arg0) {
		if (!arg0) {
			this._flowObfuscator18 = this.randomIn.nextInt();
		}
		if (this.redrawTitleBackground) {
			this.redrawTitleBackground = false;
			this.areaBackleft1.draw(4, 23680, super.graphics, 0);
			this.areaBackleft2.draw(357, 23680, super.graphics, 0);
			this.areaBackright1.draw(4, 23680, super.graphics, 722);
			this.areaBackright2.draw(205, 23680, super.graphics, 743);
			this.areaBacktop1.draw(0, 23680, super.graphics, 0);
			this.areaBackvmid1.draw(4, 23680, super.graphics, 516);
			this.areaBackvmid2.draw(205, 23680, super.graphics, 516);
			this.areaBackvmid3.draw(357, 23680, super.graphics, 496);
			this.areaBackhmid2.draw(338, 23680, super.graphics, 0);
			this.redrawSidebar = true;
			this.redrawChatback = true;
			this.redrawSideicons = true;
			this.redrawPrivacySettings = true;
			if (this.sceneState != 2) {
				this.areaViewport.draw(4, 23680, super.graphics, 4);
				this.areaMapback.draw(4, 23680, super.graphics, 550);
			}
		}
		if (this.sceneState == 2) {
			this.drawScene((byte) 1);
		}
		if (this.menuVisible && this.menuArea == 1) {
			this.redrawSidebar = true;
		}
		if (this.sidebarInterfaceId != -1) {
			boolean var2 = this.updateInterfaceAnimation(this.sceneDelta, false, this.sidebarInterfaceId);
			if (var2) {
				this.redrawSidebar = true;
			}
		}
		if (this.selectedArea == 2) {
			this.redrawSidebar = true;
		}
		if (this.objDragArea == 2) {
			this.redrawSidebar = true;
		}
		if (this.redrawSidebar) {
			this.drawSidebar((byte) -81);
			this.redrawSidebar = false;
		}
		if (this.chatInterfaceId == -1) {
			this.chatInterface.scrollPosition = this.chatScrollHeight - this.chatScrollOffset - 77;
			if (super.mouseX > 448 && super.mouseX < 560 && super.mouseY > 332) {
				this.handleScrollInput(463, 77, super.mouseX - 17, super.mouseY - 357, this.chatInterface, 0, false, this.chatScrollHeight, 0);
			}
			int var3 = this.chatScrollHeight - 77 - this.chatInterface.scrollPosition;
			if (var3 < 0) {
				var3 = 0;
			}
			if (var3 > this.chatScrollHeight - 77) {
				var3 = this.chatScrollHeight - 77;
			}
			if (this.chatScrollOffset != var3) {
				this.chatScrollOffset = var3;
				this.redrawChatback = true;
			}
		}
		if (this.chatInterfaceId != -1) {
			boolean var4 = this.updateInterfaceAnimation(this.sceneDelta, false, this.chatInterfaceId);
			if (var4) {
				this.redrawChatback = true;
			}
		}
		if (this.selectedArea == 3) {
			this.redrawChatback = true;
		}
		if (this.objDragArea == 3) {
			this.redrawChatback = true;
		}
		if (this.modalMessage != null) {
			this.redrawChatback = true;
		}
		if (this.menuVisible && this.menuArea == 2) {
			this.redrawChatback = true;
		}
		if (this.redrawChatback) {
			this.drawChat(6);
			this.redrawChatback = false;
		}
		if (this.sceneState == 2) {
			this.drawMinimap(false);
			this.areaMapback.draw(4, 23680, super.graphics, 550);
		}
		if (this.flashingTab != -1) {
			this.redrawSideicons = true;
		}
		if (this.redrawSideicons) {
			if (this.flashingTab != -1 && this.selectedTab == this.flashingTab) {
				this.flashingTab = -1;
				this.out.p1isaac((byte) 6, 120);
				this.out.p1(this.selectedTab);
			}
			this.redrawSideicons = false;
			this.areaBackhmid1.bind(0);
			this.imageBackhmid1.draw(0, 16083, 0);
			if (this.sidebarInterfaceId == -1) {
				if (this.tabInterfaceId[this.selectedTab] != -1) {
					if (this.selectedTab == 0) {
						this.imageRedstone1.draw(22, 16083, 10);
					}
					if (this.selectedTab == 1) {
						this.imageRedstone2.draw(54, 16083, 8);
					}
					if (this.selectedTab == 2) {
						this.imageRedstone2.draw(82, 16083, 8);
					}
					if (this.selectedTab == 3) {
						this.imageRedstone3.draw(110, 16083, 8);
					}
					if (this.selectedTab == 4) {
						this.imageRedstone2h.draw(153, 16083, 8);
					}
					if (this.selectedTab == 5) {
						this.imageRedstone2h.draw(181, 16083, 8);
					}
					if (this.selectedTab == 6) {
						this.imageRedstone1h.draw(209, 16083, 9);
					}
				}
				if (this.tabInterfaceId[0] != -1 && (this.flashingTab != 0 || loopCycle % 20 < 10)) {
					this.imageSideicons[0].draw(29, 16083, 13);
				}
				if (this.tabInterfaceId[1] != -1 && (this.flashingTab != 1 || loopCycle % 20 < 10)) {
					this.imageSideicons[1].draw(53, 16083, 11);
				}
				if (this.tabInterfaceId[2] != -1 && (this.flashingTab != 2 || loopCycle % 20 < 10)) {
					this.imageSideicons[2].draw(82, 16083, 11);
				}
				if (this.tabInterfaceId[3] != -1 && (this.flashingTab != 3 || loopCycle % 20 < 10)) {
					this.imageSideicons[3].draw(115, 16083, 12);
				}
				if (this.tabInterfaceId[4] != -1 && (this.flashingTab != 4 || loopCycle % 20 < 10)) {
					this.imageSideicons[4].draw(153, 16083, 13);
				}
				if (this.tabInterfaceId[5] != -1 && (this.flashingTab != 5 || loopCycle % 20 < 10)) {
					this.imageSideicons[5].draw(180, 16083, 11);
				}
				if (this.tabInterfaceId[6] != -1 && (this.flashingTab != 6 || loopCycle % 20 < 10)) {
					this.imageSideicons[6].draw(208, 16083, 13);
				}
			}
			this.areaBackhmid1.draw(160, 23680, super.graphics, 516);
			this.areaBackbase2.bind(0);
			this.imageBackbase2.draw(0, 16083, 0);
			if (this.sidebarInterfaceId == -1) {
				if (this.tabInterfaceId[this.selectedTab] != -1) {
					if (this.selectedTab == 7) {
						this.imageRedstone1v.draw(42, 16083, 0);
					}
					if (this.selectedTab == 8) {
						this.imageRedstone2v.draw(74, 16083, 0);
					}
					if (this.selectedTab == 9) {
						this.imageRedstone2v.draw(102, 16083, 0);
					}
					if (this.selectedTab == 10) {
						this.imageRedstone3v.draw(130, 16083, 1);
					}
					if (this.selectedTab == 11) {
						this.imageRedstone2hv.draw(173, 16083, 0);
					}
					if (this.selectedTab == 12) {
						this.imageRedstone2hv.draw(201, 16083, 0);
					}
					if (this.selectedTab == 13) {
						this.imageRedstone1hv.draw(229, 16083, 0);
					}
				}
				if (this.tabInterfaceId[8] != -1 && (this.flashingTab != 8 || loopCycle % 20 < 10)) {
					this.imageSideicons[7].draw(74, 16083, 2);
				}
				if (this.tabInterfaceId[9] != -1 && (this.flashingTab != 9 || loopCycle % 20 < 10)) {
					this.imageSideicons[8].draw(102, 16083, 3);
				}
				if (this.tabInterfaceId[10] != -1 && (this.flashingTab != 10 || loopCycle % 20 < 10)) {
					this.imageSideicons[9].draw(137, 16083, 4);
				}
				if (this.tabInterfaceId[11] != -1 && (this.flashingTab != 11 || loopCycle % 20 < 10)) {
					this.imageSideicons[10].draw(174, 16083, 2);
				}
				if (this.tabInterfaceId[12] != -1 && (this.flashingTab != 12 || loopCycle % 20 < 10)) {
					this.imageSideicons[11].draw(201, 16083, 2);
				}
				if (this.tabInterfaceId[13] != -1 && (this.flashingTab != 13 || loopCycle % 20 < 10)) {
					this.imageSideicons[12].draw(226, 16083, 2);
				}
			}
			this.areaBackbase2.draw(466, 23680, super.graphics, 496);
			this.areaViewport.bind(0);
		}
		if (this.redrawPrivacySettings) {
			this.redrawPrivacySettings = false;
			this.areaBackbase1.bind(0);
			this.imageBackbase1.draw(0, 16083, 0);
			this.fontPlain12.drawStringCenterTag(16777215, 55, this._flowObfuscator18, "Public chat", 28, true);
			if (this.publicChatSetting == 0) {
				this.fontPlain12.drawStringCenterTag(65280, 55, this._flowObfuscator18, "On", 41, true);
			}
			if (this.publicChatSetting == 1) {
				this.fontPlain12.drawStringCenterTag(16776960, 55, this._flowObfuscator18, "Friends", 41, true);
			}
			if (this.publicChatSetting == 2) {
				this.fontPlain12.drawStringCenterTag(16711680, 55, this._flowObfuscator18, "Off", 41, true);
			}
			if (this.publicChatSetting == 3) {
				this.fontPlain12.drawStringCenterTag(65535, 55, this._flowObfuscator18, "Hide", 41, true);
			}
			this.fontPlain12.drawStringCenterTag(16777215, 184, this._flowObfuscator18, "Private chat", 28, true);
			if (this.privateChatSetting == 0) {
				this.fontPlain12.drawStringCenterTag(65280, 184, this._flowObfuscator18, "On", 41, true);
			}
			if (this.privateChatSetting == 1) {
				this.fontPlain12.drawStringCenterTag(16776960, 184, this._flowObfuscator18, "Friends", 41, true);
			}
			if (this.privateChatSetting == 2) {
				this.fontPlain12.drawStringCenterTag(16711680, 184, this._flowObfuscator18, "Off", 41, true);
			}
			this.fontPlain12.drawStringCenterTag(16777215, 324, this._flowObfuscator18, "Trade/compete", 28, true);
			if (this.tradeChatSetting == 0) {
				this.fontPlain12.drawStringCenterTag(65280, 324, this._flowObfuscator18, "On", 41, true);
			}
			if (this.tradeChatSetting == 1) {
				this.fontPlain12.drawStringCenterTag(16776960, 324, this._flowObfuscator18, "Friends", 41, true);
			}
			if (this.tradeChatSetting == 2) {
				this.fontPlain12.drawStringCenterTag(16711680, 324, this._flowObfuscator18, "Off", 41, true);
			}
			this.fontPlain12.drawStringCenterTag(16777215, 458, this._flowObfuscator18, "Report abuse", 33, true);
			this.areaBackbase1.draw(453, 23680, super.graphics, 0);
			this.areaViewport.bind(0);
		}
		this.sceneDelta = 0;
	}

	@ObfuscatedName("client.a(LDUCMKFAY;Z)Z")
	public final boolean handleSocialMenuOption(Component arg0, boolean arg1) {
		int var3 = arg0.clientCode;
		if (arg1) {
			this.load();
		}
		if (var3 >= 1 && var3 <= 200 || !(var3 < 701 || var3 > 900)) {
			if (var3 >= 801) {
				var3 -= 701;
			} else if (var3 >= 701) {
				var3 -= 601;
			} else if (var3 >= 101) {
				var3 -= 101;
			} else {
				var3--;
			}
			this.menuOption[this.menuSize] = "Remove @whi@" + this.friendName[var3];
			this.menuAction[this.menuSize] = 792;
			this.menuSize++;
			this.menuOption[this.menuSize] = "Message @whi@" + this.friendName[var3];
			this.menuAction[this.menuSize] = 639;
			this.menuSize++;
			return true;
		} else if (var3 >= 401 && var3 <= 500) {
			this.menuOption[this.menuSize] = "Remove @whi@" + arg0.text;
			this.menuAction[this.menuSize] = 322;
			this.menuSize++;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void pushSpotanims(boolean arg0) {
		SpotAnimEntity var2 = (SpotAnimEntity) this.spotanims.head();
		this.ingame &= arg0;
		while (var2 != null) {
			if (this.currentLevel != var2.level || var2.seqComplete) {
				var2.unlink();
			} else if (loopCycle >= var2.startCycle) {
				var2.update(this.sceneDelta, true);
				if (var2.seqComplete) {
					var2.unlink();
				} else {
					this.scene.addTemporary(var2.level, 0, (byte) 6, var2.y, -1, var2.z, 60, var2.x, var2, false);
				}
			}
			var2 = (SpotAnimEntity) this.spotanims.next(false);
		}
	}

	@ObfuscatedName("client.a(IIILDUCMKFAY;I)V")
	public final void drawInterface(int arg0, int arg1, int arg2, Component arg3, int arg4) {
		if (arg0 != 8) {
			this._flowObfuscator21 = !this._flowObfuscator21;
		}
		if (arg3.type != 0 || arg3.children == null || arg3.hide && this.viewportHoveredInterfaceIndex != arg3.id && this.sidebarHoveredInterfaceIndex != arg3.id && this.chatHoveredInterfaceIndex != arg3.id) {
			return;
		}
		int var6 = Pix2D.left;
		int var7 = Pix2D.top;
		int var8 = Pix2D.right;
		int var9 = Pix2D.bottom;
		Pix2D.setBounds(arg3.height + arg4, arg2, false, arg3.width + arg2, arg4);
		int var10 = arg3.children.length;
		for (int var11 = 0; var11 < var10; var11++) {
			int var12 = arg3.childX[var11] + arg2;
			int var13 = arg3.childY[var11] + arg4 - arg1;
			Component var14 = Component.instances[arg3.children[var11]];
			int var15 = var14.x + var12;
			int var16 = var14.y + var13;
			if (var14.clientCode > 0) {
				this.updateInterfaceContent(950, var14);
			}
			if (var14.type == 0) {
				if (var14.scrollPosition > var14.scroll - var14.height) {
					var14.scrollPosition = var14.scroll - var14.height;
				}
				if (var14.scrollPosition < 0) {
					var14.scrollPosition = 0;
				}
				this.drawInterface(8, var14.scrollPosition, var15, var14, var16);
				if (var14.scroll > var14.height) {
					this.drawScrollbar(519, var14.height, var14.scrollPosition, var16, var14.width + var15, var14.scroll);
				}
			} else if (var14.type != 1) {
				if (var14.type == 2) {
					int var17 = 0;
					for (int var18 = 0; var18 < var14.height; var18++) {
						for (int var19 = 0; var19 < var14.width; var19++) {
							int var20 = (var14.marginX + 32) * var19 + var15;
							int var21 = (var14.marginY + 32) * var18 + var16;
							if (var17 < 20) {
								var20 += var14.invSlotOffsetX[var17];
								var21 += var14.invSlotOffsetY[var17];
							}
							if (var14.invSlotObjId[var17] > 0) {
								int var22 = 0;
								int var23 = 0;
								int var24 = var14.invSlotObjId[var17] - 1;
								if (var20 > Pix2D.left - 32 && var20 < Pix2D.right && var21 > Pix2D.top - 32 && var21 < Pix2D.bottom || this.objDragArea != 0 && this.objDragSlot == var17) {
									int var25 = 0;
									if (this.objSelected == 1 && this.objSelectedSlot == var17 && this.objSelectedInterface == var14.id) {
										var25 = 16777215;
									}
									Pix32 var26 = ObjType.getIcon(var24, var14.invSlotObjCount[var17], var25, 9);
									if (var26 != null) {
										if (this.objDragArea != 0 && this.objDragSlot == var17 && this.objDragInterfaceId == var14.id) {
											var22 = super.mouseX - this.objGrabX;
											var23 = super.mouseY - this.objGrabY;
											if (var22 < 5 && var22 > -5) {
												var22 = 0;
											}
											if (var23 < 5 && var23 > -5) {
												var23 = 0;
											}
											if (this.objDragCycles < 5) {
												var22 = 0;
												var23 = 0;
											}
											var26.drawAlpha(var20 + var22, var21 + var23, 128, this._flowObfuscator25);
											if (var21 + var23 < Pix2D.top && arg3.scrollPosition > 0) {
												int var27 = (Pix2D.top - var21 - var23) * this.sceneDelta / 3;
												if (var27 > this.sceneDelta * 10) {
													var27 = this.sceneDelta * 10;
												}
												if (var27 > arg3.scrollPosition) {
													var27 = arg3.scrollPosition;
												}
												arg3.scrollPosition -= var27;
												this.objGrabY += var27;
											}
											if (var21 + var23 + 32 > Pix2D.bottom && arg3.scrollPosition < arg3.scroll - arg3.height) {
												int var28 = (var21 + var23 + 32 - Pix2D.bottom) * this.sceneDelta / 3;
												if (var28 > this.sceneDelta * 10) {
													var28 = this.sceneDelta * 10;
												}
												if (var28 > arg3.scroll - arg3.height - arg3.scrollPosition) {
													var28 = arg3.scroll - arg3.height - arg3.scrollPosition;
												}
												arg3.scrollPosition += var28;
												this.objGrabY -= var28;
											}
										} else if (this.selectedArea != 0 && this.selectedItem == var17 && this.selectedInterface == var14.id) {
											var26.drawAlpha(var20, var21, 128, this._flowObfuscator25);
										} else {
											var26.draw(var20, 16083, var21);
										}
										if (var26.width == 33 || var14.invSlotObjCount[var17] != 1) {
											int var29 = var14.invSlotObjCount[var17];
											this.fontPlain11.drawString(0, formatObjCount(-33245, var29), var21 + 10 + var23, 822, var20 + 1 + var22);
											this.fontPlain11.drawString(16776960, formatObjCount(-33245, var29), var21 + 9 + var23, 822, var20 + var22);
										}
									}
								}
							} else if (var14.invSlotGraphic != null && var17 < 20) {
								Pix32 var30 = var14.invSlotGraphic[var17];
								if (var30 != null) {
									var30.draw(var20, 16083, var21);
								}
							}
							var17++;
						}
					}
				} else if (var14.type == 3) {
					boolean var31 = false;
					if (this.chatHoveredInterfaceIndex == var14.id || this.sidebarHoveredInterfaceIndex == var14.id || this.viewportHoveredInterfaceIndex == var14.id) {
						var31 = true;
					}
					int var32;
					if (this.executeInterfaceScript(var14, false)) {
						var32 = var14.activeColour;
						if (var31 && var14.activeOverColour != 0) {
							var32 = var14.activeOverColour;
						}
					} else {
						var32 = var14.colour;
						if (var31 && var14.overColour != 0) {
							var32 = var14.overColour;
						}
					}
					if (var14.alpha == 0) {
						if (var14.fill) {
							Pix2D.fillRect(var14.height, var16, var15, var32, var14.width, 0);
						} else {
							Pix2D.drawRect(var15, var14.width, var14.height, var32, var16, true);
						}
					} else if (var14.fill) {
						Pix2D.fillRect(var32, var16, var14.width, var14.height, 256 - (var14.alpha & 0xFF), 0, var15);
					} else {
						Pix2D.drawRect(var16, var14.height, 256 - (var14.alpha & 0xFF), var32, var14.width, var15, -17319);
					}
				} else if (var14.type == 4) {
					PixFont var33 = var14.font;
					String var34 = var14.text;
					boolean var35 = false;
					if (this.chatHoveredInterfaceIndex == var14.id || this.sidebarHoveredInterfaceIndex == var14.id || this.viewportHoveredInterfaceIndex == var14.id) {
						var35 = true;
					}
					int var36;
					if (this.executeInterfaceScript(var14, false)) {
						var36 = var14.activeColour;
						if (var35 && var14.activeOverColour != 0) {
							var36 = var14.activeOverColour;
						}
						if (var14.activeText.length() > 0) {
							var34 = var14.activeText;
						}
					} else {
						var36 = var14.colour;
						if (var35 && var14.overColour != 0) {
							var36 = var14.overColour;
						}
					}
					if (var14.buttonType == 6 && this.pressedContinueOption) {
						var34 = "Please wait...";
						var36 = var14.colour;
					}
					if (Pix2D.width2d == 479) {
						if (var36 == 16776960) {
							var36 = 255;
						}
						if (var36 == 49152) {
							var36 = 16777215;
						}
					}
					int var37 = var33.height + var16;
					while (var34.length() > 0) {
						if (var34.indexOf("%") != -1) {
							label354: while (true) {
								int var38 = var34.indexOf("%1");
								if (var38 == -1) {
									while (true) {
										int var39 = var34.indexOf("%2");
										if (var39 == -1) {
											while (true) {
												int var40 = var34.indexOf("%3");
												if (var40 == -1) {
													while (true) {
														int var41 = var34.indexOf("%4");
														if (var41 == -1) {
															while (true) {
																int var42 = var34.indexOf("%5");
																if (var42 == -1) {
																	break label354;
																}
																var34 = var34.substring(0, var42) + this.getIntString(369, this.executeClientscript1(341, var14, 4)) + var34.substring(var42 + 2);
															}
														}
														var34 = var34.substring(0, var41) + this.getIntString(369, this.executeClientscript1(341, var14, 3)) + var34.substring(var41 + 2);
													}
												}
												var34 = var34.substring(0, var40) + this.getIntString(369, this.executeClientscript1(341, var14, 2)) + var34.substring(var40 + 2);
											}
										}
										var34 = var34.substring(0, var39) + this.getIntString(369, this.executeClientscript1(341, var14, 1)) + var34.substring(var39 + 2);
									}
								}
								var34 = var34.substring(0, var38) + this.getIntString(369, this.executeClientscript1(341, var14, 0)) + var34.substring(var38 + 2);
							}
						}
						int var43 = var34.indexOf("\\n");
						String var44;
						if (var43 == -1) {
							var44 = var34;
							var34 = "";
						} else {
							var44 = var34.substring(0, var43);
							var34 = var34.substring(var43 + 2);
						}
						if (var14.center) {
							var33.drawStringCenterTag(var36, var14.width / 2 + var15, this._flowObfuscator18, var44, var37, var14.shadowed);
						} else {
							var33.drawStringTag(false, var14.shadowed, var15, var36, var44, var37);
						}
						var37 += var33.height;
					}
				} else if (var14.type == 5) {
					Pix32 var45;
					if (this.executeInterfaceScript(var14, false)) {
						var45 = var14.activeGraphic;
					} else {
						var45 = var14.graphic;
					}
					if (var45 != null) {
						var45.draw(var15, 16083, var16);
					}
				} else if (var14.type == 6) {
					int var46 = Pix3D.centerX;
					int var47 = Pix3D.centerY;
					Pix3D.centerX = var14.width / 2 + var15;
					Pix3D.centerY = var14.height / 2 + var16;
					int var48 = Pix3D.sin[var14.xan] * var14.zoom >> 16;
					int var49 = Pix3D.cos[var14.xan] * var14.zoom >> 16;
					boolean var50 = this.executeInterfaceScript(var14, false);
					int var51;
					if (var50) {
						var51 = var14.activeAnim;
					} else {
						var51 = var14.anim;
					}
					Model var52;
					if (var51 == -1) {
						var52 = var14.getModel(0, -1, -1, var50);
					} else {
						SeqType var53 = SeqType.instances[var51];
						var52 = var14.getModel(0, var53.iframes[var14.animFrame], var53.frames[var14.animFrame], var50);
					}
					if (var52 != null) {
						var52.drawSimple(0, var14.yan, 0, var14.xan, 0, var48, var49);
					}
					Pix3D.centerX = var46;
					Pix3D.centerY = var47;
				} else if (var14.type == 7) {
					PixFont var54 = var14.font;
					int var55 = 0;
					for (int var56 = 0; var56 < var14.height; var56++) {
						for (int var57 = 0; var57 < var14.width; var57++) {
							if (var14.invSlotObjId[var55] > 0) {
								ObjType var58 = ObjType.get(var14.invSlotObjId[var55] - 1);
								String var59 = var58.name;
								if (var58.stackable || var14.invSlotObjCount[var55] != 1) {
									var59 = var59 + " x" + formatObjCountTagged(var14.invSlotObjCount[var55], 0);
								}
								int var60 = (var14.marginX + 115) * var57 + var15;
								int var61 = (var14.marginY + 12) * var56 + var16;
								if (var14.center) {
									var54.drawStringCenterTag(var14.colour, var14.width / 2 + var60, this._flowObfuscator18, var59, var61, var14.shadowed);
								} else {
									var54.drawStringTag(false, var14.shadowed, var60, var14.colour, var59, var61);
								}
							}
							var55++;
						}
					}
				}
			}
		}
		Pix2D.setBounds(var9, var6, false, var8, var7);
	}

	@ObfuscatedName("client.a(LDSMJIEPN;I)V")
	public final void updateFlameBuffer(Pix8 arg0, int arg1) {
		short var3 = 256;
		if (arg1 >= 0) {
			this.out.p1(126);
		}
		for (int var4 = 0; var4 < this.flameBuffer0.length; var4++) {
			this.flameBuffer0[var4] = 0;
		}
		for (int var5 = 0; var5 < 5000; var5++) {
			int var17 = (int) (Math.random() * 128.0D * (double) var3);
			this.flameBuffer0[var17] = (int) (Math.random() * 256.0D);
		}
		for (int var6 = 0; var6 < 20; var6++) {
			for (int var13 = 1; var13 < var3 - 1; var13++) {
				for (int var15 = 1; var15 < 127; var15++) {
					int var16 = (var13 << 7) + var15;
					this.flameBuffer1[var16] = (this.flameBuffer0[var16 - 1] + this.flameBuffer0[var16 + 1] + this.flameBuffer0[var16 - 128] + this.flameBuffer0[var16 + 128]) / 4;
				}
			}
			int[] var14 = this.flameBuffer0;
			this.flameBuffer0 = this.flameBuffer1;
			this.flameBuffer1 = var14;
		}
		if (arg0 == null) {
			return;
		}
		int var7 = 0;
		for (int var8 = 0; var8 < arg0.cropBottom; var8++) {
			for (int var9 = 0; var9 < arg0.cropRight; var9++) {
				if (arg0.pixels[var7++] != 0) {
					int var10 = var9 + 16 + arg0.cropLeft;
					int var11 = var8 + 16 + arg0.cropTop;
					int var12 = (var11 << 7) + var10;
					this.flameBuffer0[var12] = 0;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILMBMGIXGO;BLDLZHLHNK;)V")
	public final void readPlayerUpdates(int arg0, int arg1, Packet arg2, byte arg3, PlayerEntity arg4) {
		if (arg3 != 25) {
			this.levelObjStacks = null;
		}
		if ((arg0 & 0x400) != 0) {
			arg4.forceMoveStartSceneTileX = arg2.g1_alt3(2);
			arg4.forceMoveStartSceneTileZ = arg2.g1_alt3(2);
			arg4.forceMoveEndSceneTileX = arg2.g1_alt3(2);
			arg4.forceMoveEndSceneTileZ = arg2.g1_alt3(2);
			arg4.forceMoveEndCycle = arg2.g2_alt3((byte) -74) + loopCycle;
			arg4.forceMoveStartCycle = arg2.g2_alt2(true) + loopCycle;
			arg4.forceMoveFaceDirection = arg2.g1_alt3(2);
			arg4.resetPath(true);
		}
		if ((arg0 & 0x100) != 0) {
			arg4.spotanimId = arg2.g2_alt1((byte) 108);
			int var6 = arg2.g4();
			arg4.spotanimHeight = var6 >> 16;
			arg4.spotanimLastCycle = (var6 & 0xFFFF) + loopCycle;
			arg4.spotanimFrame = 0;
			arg4.spotanimCycle = 0;
			if (arg4.spotanimLastCycle > loopCycle) {
				arg4.spotanimFrame = -1;
			}
			if (arg4.spotanimId == 65535) {
				arg4.spotanimId = -1;
			}
		}
		if ((arg0 & 0x8) != 0) {
			int var7 = arg2.g2_alt1((byte) 108);
			if (var7 == 65535) {
				var7 = -1;
			}
			int var8 = arg2.g1_alt2(false);
			if (arg4.primarySeqId == var7 && var7 != -1) {
				int var9 = SeqType.instances[var7].replacemode;
				if (var9 == 1) {
					arg4.primarySeqFrame = 0;
					arg4.primarySeqCycle = 0;
					arg4.primarySeqDelay = var8;
					arg4.primarySeqLoop = 0;
				}
				if (var9 == 2) {
					arg4.primarySeqLoop = 0;
				}
			} else if (var7 == -1 || arg4.primarySeqId == -1 || SeqType.instances[var7].priority >= SeqType.instances[arg4.primarySeqId].priority) {
				arg4.primarySeqId = var7;
				arg4.primarySeqFrame = 0;
				arg4.primarySeqCycle = 0;
				arg4.primarySeqDelay = var8;
				arg4.primarySeqLoop = 0;
				arg4.seqPathLength = arg4.pathLength;
			}
		}
		if ((arg0 & 0x4) != 0) {
			arg4.chat = arg2.gjstr();
			if (arg4.chat.charAt(0) == '~') {
				arg4.chat = arg4.chat.substring(1);
				this.addMessage(arg4.chat, 2, arg4.name, this._flowObfuscator21);
			} else if (localPlayer == arg4) {
				this.addMessage(arg4.chat, 2, arg4.name, this._flowObfuscator21);
			}
			arg4.chatColor = 0;
			arg4.chatStyle = 0;
			arg4.chatTimer = 150;
		}
		if ((arg0 & 0x80) != 0) {
			int var10 = arg2.g2_alt1((byte) 108);
			int var11 = arg2.g1();
			int var12 = arg2.g1_alt2(false);
			int var13 = arg2.pos;
			if (arg4.name != null && arg4.visible) {
				long var14 = JString.toBase37(arg4.name);
				boolean var16 = false;
				if (var11 <= 1) {
					for (int var17 = 0; var17 < this.ignoreCount; var17++) {
						if (this.ignoreName37[var17] == var14) {
							var16 = true;
							break;
						}
					}
				}
				if (!var16 && this.overrideChat == 0) {
					try {
						this.chatBuffer.pos = 0;
						arg2.gdata_alt1(var12, 0, true, this.chatBuffer.data);
						this.chatBuffer.pos = 0;
						String var18 = WordPack.unpack(var12, true, this.chatBuffer);
						String var19 = WordFilter.filter(var18, 0);
						arg4.chat = var19;
						arg4.chatColor = var10 >> 8;
						arg4.chatStyle = var10 & 0xFF;
						arg4.chatTimer = 150;
						if (var11 == 2 || var11 == 3) {
							this.addMessage(var19, 1, "@cr2@" + arg4.name, this._flowObfuscator21);
						} else if (var11 == 1) {
							this.addMessage(var19, 1, "@cr1@" + arg4.name, this._flowObfuscator21);
						} else {
							this.addMessage(var19, 2, arg4.name, this._flowObfuscator21);
						}
					} catch (Exception var28) {
						signlink.reporterror("cde2");
					}
				}
			}
			arg2.pos = var12 + var13;
		}
		if ((arg0 & 0x1) != 0) {
			arg4.targetId = arg2.g2_alt1((byte) 108);
			if (arg4.targetId == 65535) {
				arg4.targetId = -1;
			}
		}
		if ((arg0 & 0x10) != 0) {
			int var21 = arg2.g1_alt2(false);
			byte[] var22 = new byte[var21];
			Packet var23 = new Packet(var22, 891);
			arg2.gdata(var21, this._flowObfuscator15, 0, var22);
			this.playerAppearanceBuffer[arg1] = var23;
			arg4.read(0, var23);
		}
		if ((arg0 & 0x2) != 0) {
			arg4.targetTileX = arg2.g2_alt3((byte) -74);
			arg4.targetTile = arg2.g2_alt1((byte) 108);
		}
		if ((arg0 & 0x20) != 0) {
			int var24 = arg2.g1();
			int var25 = arg2.g1_alt1(0);
			arg4.hit(-35698, var25, var24, loopCycle);
			arg4.combatCycle = loopCycle + 300;
			arg4.health = arg2.g1_alt2(false);
			arg4.totalHealth = arg2.g1();
		}
		if ((arg0 & 0x200) == 0) {
			return;
		}
		int var26 = arg2.g1();
		int var27 = arg2.g1_alt3(2);
		arg4.hit(-35698, var27, var26, loopCycle);
		arg4.combatCycle = loopCycle + 300;
		arg4.health = arg2.g1();
		arg4.totalHealth = arg2.g1_alt2(false);
	}

	@ObfuscatedName("client.G(I)V")
	public final void updateOrbitCamera(int arg0) {
		if (arg0 != 3) {
			this.packetType = -1;
		}
		try {
			int var2 = localPlayer.x + this.cameraAnticheatOffsetX;
			int var3 = localPlayer.z + this.cameraAnticheatOffsetZ;
			if (this.orbitCameraX - var2 < -500 || this.orbitCameraX - var2 > 500 || this.orbitCameraZ - var3 < -500 || this.orbitCameraZ - var3 > 500) {
				this.orbitCameraX = var2;
				this.orbitCameraZ = var3;
			}
			if (this.orbitCameraX != var2) {
				this.orbitCameraX += (var2 - this.orbitCameraX) / 16;
			}
			if (this.orbitCameraZ != var3) {
				this.orbitCameraZ += (var3 - this.orbitCameraZ) / 16;
			}
			if (super.actionKey[1] == 1) {
				this.orbitCameraYawVelocity += (-24 - this.orbitCameraYawVelocity) / 2;
			} else if (super.actionKey[2] == 1) {
				this.orbitCameraYawVelocity += (24 - this.orbitCameraYawVelocity) / 2;
			} else {
				this.orbitCameraYawVelocity /= 2;
			}
			if (super.actionKey[3] == 1) {
				this.orbitCameraPitchVelocity += (12 - this.orbitCameraPitchVelocity) / 2;
			} else if (super.actionKey[4] == 1) {
				this.orbitCameraPitchVelocity += (-12 - this.orbitCameraPitchVelocity) / 2;
			} else {
				this.orbitCameraPitchVelocity /= 2;
			}
			this.orbitCameraYaw = this.orbitCameraYawVelocity / 2 + this.orbitCameraYaw & 0x7FF;
			this.orbitCameraPitch += this.orbitCameraPitchVelocity / 2;
			if (this.orbitCameraPitch < 128) {
				this.orbitCameraPitch = 128;
			}
			if (this.orbitCameraPitch > 383) {
				this.orbitCameraPitch = 383;
			}
			int var4 = this.orbitCameraX >> 7;
			int var5 = this.orbitCameraZ >> 7;
			int var6 = this.getHeightmapY(this.currentLevel, this.orbitCameraZ, true, this.orbitCameraX);
			int var7 = 0;
			if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
				for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
					for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
						int var10 = this.currentLevel;
						if (var10 < 3 && (this.levelTileFlags[1][var8][var9] & 0x2) == 2) {
							var10++;
						}
						int var11 = var6 - this.levelHeightmap[var10][var8][var9];
						if (var11 > var7) {
							var7 = var11;
						}
					}
				}
			}
			gamelogic2++;
			if (gamelogic2 > 1512) {
				gamelogic2 = 0;
				this.out.p1isaac((byte) 6, 77);
				this.out.p1(0);
				int var12 = this.out.pos;
				this.out.p1((int) (Math.random() * 256.0D));
				this.out.p1(101);
				this.out.p1(233);
				this.out.p2(45092);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.out.p2(35784);
				}
				this.out.p1((int) (Math.random() * 256.0D));
				this.out.p1(64);
				this.out.p1(38);
				this.out.p2((int) (Math.random() * 65536.0D));
				this.out.p2((int) (Math.random() * 65536.0D));
				this.out.psize1(this.out.pos - var12, (byte) 0);
			}
			int var13 = var7 * 192;
			if (var13 > 98048) {
				var13 = 98048;
			}
			if (var13 < 32768) {
				var13 = 32768;
			}
			if (var13 > this.cameraPitchClamp) {
				this.cameraPitchClamp += (var13 - this.cameraPitchClamp) / 24;
			} else if (var13 < this.cameraPitchClamp) {
				this.cameraPitchClamp += (var13 - this.cameraPitchClamp) / 80;
			}
		} catch (Exception var14) {
			signlink.reporterror("glfc_ex " + localPlayer.x + "," + localPlayer.z + "," + this.orbitCameraX + "," + this.orbitCameraZ + "," + this.sceneCenterZoneX + "," + this.sceneCenterZoneZ + "," + this.sceneBaseTileX + "," + this.sceneBaseTileZ);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void draw(int arg0) {
		if (this.errorStarted || this.errorLoading || this.errorHost) {
			this.drawError(-13873);
			return;
		}
		drawCycle++;
		if (arg0 != 0) {
			this.packetType = -1;
		}
		if (this.ingame) {
			this.drawGame(true);
		} else {
			this.drawTitleScreen(false, false);
		}
		this.dragCycles = 0;
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;)Z")
	public final boolean isFriend(boolean arg0, String arg1) {
		if (arg1 == null) {
			return false;
		}
		for (int var3 = 0; var3 < this.friendCount; var3++) {
			if (arg1.equalsIgnoreCase(this.friendName[var3])) {
				return true;
			}
		}
		if (arg0) {
			this.out.p1(138);
		}
		return arg1.equalsIgnoreCase(localPlayer.name);
	}

	@ObfuscatedName("client.a(IIZ)Ljava/lang/String;")
	public static final String getCombatLevelColorTag(int arg0, int arg1, boolean arg2) {
		if (!arg2) {
			throw new NullPointerException();
		}
		int var3 = arg0 - arg1;
		if (var3 < -9) {
			return "@red@";
		} else if (var3 < -6) {
			return "@or3@";
		} else if (var3 < -3) {
			return "@or2@";
		} else if (var3 < 0) {
			return "@or1@";
		} else if (var3 > 9) {
			return "@gre@";
		} else if (var3 > 6) {
			return "@gr3@";
		} else if (var3 > 3) {
			return "@gr2@";
		} else if (var3 > 0) {
			return "@gr1@";
		} else {
			return "@yel@";
		}
	}

	@ObfuscatedName("client.a(BI)V")
	public final void setWaveVolume(byte arg0, int arg1) {
		if (arg0 == 2) {
			boolean var3 = false;
		} else {
			this.load();
		}
		signlink.wavevol = arg1;
	}

	@ObfuscatedName("client.H(I)V")
	public final void draw3DEntityElements(int arg0) {
		if (arg0 != 8) {
			this._flowObfuscator18 = 130;
		}
		this.drawPrivateMessages((byte) -13);
		if (this.crossMode == 1) {
			this.imageCrosses[this.crossCycle / 100].draw(this.crossX - 8 - 4, 16083, this.crossY - 8 - 4);
			gamelogic6++;
			if (gamelogic6 > 67) {
				gamelogic6 = 0;
				this.out.p1isaac((byte) 6, 78);
			}
		}
		if (this.crossMode == 2) {
			this.imageCrosses[this.crossCycle / 100 + 4].draw(this.crossX - 8 - 4, 16083, this.crossY - 8 - 4);
		}
		if (this.viewportOverlayInterfaceId != -1) {
			this.updateInterfaceAnimation(this.sceneDelta, false, this.viewportOverlayInterfaceId);
			this.drawInterface(8, 0, 0, Component.instances[this.viewportOverlayInterfaceId], 0);
		}
		if (this.viewportInterfaceId != -1) {
			this.updateInterfaceAnimation(this.sceneDelta, false, this.viewportInterfaceId);
			this.drawInterface(8, 0, 0, Component.instances[this.viewportInterfaceId], 0);
		}
		this.drawWildyLevel(184);
		if (!this.menuVisible) {
			this.handleInput(0);
			this.drawTooltip(45706);
		} else if (this.menuArea == 0) {
			this.drawMenu((byte) 9);
		}
		if (this.inMultizone == 1) {
			this.imageHeadicons[1].draw(472, 16083, 296);
		}
		if (showFps) {
			short var2 = 507;
			byte var3 = 20;
			int var4 = 16776960;
			if (super.fps < 15) {
				var4 = 16711680;
			}
			this.fontPlain12.drawStringRight("Fps:" + super.fps, var2, var4, (byte) -80, var3);
			int var12 = var3 + 15;
			Runtime var5 = Runtime.getRuntime();
			int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
			int var7 = 16776960;
			if (var6 > 33554432 && lowMemory) {
				int var8 = 16711680;
			}
			this.fontPlain12.drawStringRight("Mem:" + var6 + "k", var2, 16776960, (byte) -80, var12);
			var12 += 15;
		}
		if (this.systemUpdateTimer == 0) {
			return;
		}
		int var9 = this.systemUpdateTimer / 50;
		int var10 = var9 / 60;
		int var11 = var9 % 60;
		if (var11 < 10) {
			this.fontPlain12.drawString(16776960, "System update in: " + var10 + ":0" + var11, 329, 822, 4);
		} else {
			this.fontPlain12.drawString(16776960, "System update in: " + var10 + ":" + var11, 329, 822, 4);
		}
		cyclelogic1++;
		if (cyclelogic1 > 75) {
			cyclelogic1 = 0;
			this.out.p1isaac((byte) 6, 148);
			return;
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void addIgnore(long arg0, int arg1) {
		if (arg0 == 0L) {
			return;
		}
		if (this.ignoreCount >= 100) {
			this.addMessage("Your ignore list is full. Max of 100 hit", 0, "", this._flowObfuscator21);
			return;
		}
		String var4 = JString.toSentenceCase(-45804, JString.fromBase37(arg0, (byte) -99));
		for (int var5 = 0; var5 < this.ignoreCount; var5++) {
			if (this.ignoreName37[var5] == arg0) {
				this.addMessage(var4 + " is already on your ignore list", 0, "", this._flowObfuscator21);
				return;
			}
		}
		if (arg1 < 4 || arg1 > 4) {
			return;
		}
		for (int var6 = 0; var6 < this.friendCount; var6++) {
			if (this.friendName37[var6] == arg0) {
				this.addMessage("Please remove " + var4 + " from your friend list first", 0, "", this._flowObfuscator21);
				return;
			}
		}
		this.ignoreName37[this.ignoreCount++] = arg0;
		this.redrawSidebar = true;
		this.out.p1isaac((byte) 6, 133);
		this.out.p8(5, arg0);
	}

	@ObfuscatedName("client.i(B)V")
	public final void updatePlayers(byte arg0) {
		if (this._flowObfuscator20 != arg0) {
			return;
		}
		for (int var2 = -1; var2 < this.playerCount; var2++) {
			int var3;
			if (var2 == -1) {
				var3 = this.LOCAL_PLAYER_INDEX;
			} else {
				var3 = this.playerIds[var2];
			}
			PlayerEntity var4 = this.players[var3];
			if (var4 != null) {
				this.updateEntity(46988, 1, var4);
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void updateTemporaryLocs(byte arg0) {
		if (arg0 == 8) {
			boolean var2 = false;
		} else {
			this.out.p1(101);
		}
		if (this.sceneState != 2) {
			return;
		}
		for (LocAddEntity var3 = (LocAddEntity) this.temporaryLocs.head(); var3 != null; var3 = (LocAddEntity) this.temporaryLocs.next(false)) {
			if (var3.duration > 0) {
				var3.duration--;
			}
			if (var3.duration != 0) {
				if (var3.delay > 0) {
					var3.delay--;
				}
				if (var3.delay == 0 && var3.localX >= 1 && var3.localZ >= 1 && var3.localX <= 102 && var3.localZ <= 102 && (var3.type < 0 || World.isLocReady(var3.type, var3.shape, 8))) {
					this.addLoc(var3.localZ, var3.level, var3.rotation, var3.shape, var3.localX, var3.layer, var3.type, 4);
					var3.delay = -1;
					if (var3.previousType == var3.type && var3.previousType == -1) {
						var3.unlink();
					} else if (var3.previousType == var3.type && var3.previousRotation == var3.rotation && var3.previousShape == var3.shape) {
						var3.unlink();
					}
				}
			} else if (var3.previousType < 0 || World.isLocReady(var3.previousType, var3.previousShape, 8)) {
				this.addLoc(var3.localZ, var3.level, var3.previousRotation, var3.previousShape, var3.localX, var3.layer, var3.previousType, 4);
				var3.unlink();
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void showContextMenu(boolean arg0) {
		int var2 = this.fontBold12.stringWidthTag(this._flowObfuscator32, "Choose Option");
		this.ingame &= arg0;
		for (int var3 = 0; var3 < this.menuSize; var3++) {
			int var11 = this.fontBold12.stringWidthTag(this._flowObfuscator32, this.menuOption[var3]);
			if (var11 > var2) {
				var2 = var11;
			}
		}
		var2 += 8;
		int var4 = this.menuSize * 15 + 21;
		if (super.mouseClickX > 4 && super.mouseClickY > 4 && super.mouseClickX < 516 && super.mouseClickY < 338) {
			int var5 = super.mouseClickX - 4 - var2 / 2;
			if (var2 + var5 > 512) {
				var5 = 512 - var2;
			}
			if (var5 < 0) {
				var5 = 0;
			}
			int var6 = super.mouseClickY - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}
			if (var6 < 0) {
				var6 = 0;
			}
			this.menuVisible = true;
			this.menuArea = 0;
			this.menuX = var5;
			this.menuY = var6;
			this.menuWidth = var2;
			this.menuHeight = this.menuSize * 15 + 22;
		}
		if (super.mouseClickX > 553 && super.mouseClickY > 205 && super.mouseClickX < 743 && super.mouseClickY < 466) {
			int var7 = super.mouseClickX - 553 - var2 / 2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var2 + var7 > 190) {
				var7 = 190 - var2;
			}
			int var8 = super.mouseClickY - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}
			this.menuVisible = true;
			this.menuArea = 1;
			this.menuX = var7;
			this.menuY = var8;
			this.menuWidth = var2;
			this.menuHeight = this.menuSize * 15 + 22;
		}
		if (super.mouseClickX <= 17 || super.mouseClickY <= 357 || super.mouseClickX >= 496 || super.mouseClickY >= 453) {
			return;
		}
		int var9 = super.mouseClickX - 17 - var2 / 2;
		if (var9 < 0) {
			var9 = 0;
		} else if (var2 + var9 > 479) {
			var9 = 479 - var2;
		}
		int var10 = super.mouseClickY - 357;
		if (var10 < 0) {
			var10 = 0;
		} else if (var4 + var10 > 96) {
			var10 = 96 - var4;
		}
		this.menuVisible = true;
		this.menuArea = 2;
		this.menuX = var9;
		this.menuY = var10;
		this.menuWidth = var2;
		this.menuHeight = this.menuSize * 15 + 22;
	}

	@ObfuscatedName("client.b(LMBMGIXGO;IB)V")
	public final void readLocalPlayer(Packet arg0, int arg1, byte arg2) {
		arg0.accessBits(this._flowObfuscator33);
		if (arg2 == 5) {
			boolean var4 = false;
		} else {
			this.packetType = arg0.g1();
		}
		int var5 = arg0.gBit(1, 0);
		if (var5 == 0) {
			return;
		}
		int var6 = arg0.gBit(2, 0);
		if (var6 == 0) {
			this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
		} else if (var6 == 1) {
			int var7 = arg0.gBit(3, 0);
			localPlayer.step(false, (byte) 20, var7);
			int var8 = arg0.gBit(1, 0);
			if (var8 == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
			}
		} else if (var6 == 2) {
			int var9 = arg0.gBit(3, 0);
			localPlayer.step(true, (byte) 20, var9);
			int var10 = arg0.gBit(3, 0);
			localPlayer.step(true, (byte) 20, var10);
			int var11 = arg0.gBit(1, 0);
			if (var11 == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
			}
		} else if (var6 == 3) {
			this.currentLevel = arg0.gBit(2, 0);
			int var12 = arg0.gBit(1, 0);
			int var13 = arg0.gBit(1, 0);
			if (var13 == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
			}
			int var14 = arg0.gBit(7, 0);
			int var15 = arg0.gBit(7, 0);
			localPlayer.move(var15, var14, var12 == 1, false);
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void unloadTitle(int arg0) {
		this.flameActive = false;
		while (this.flameThread) {
			this.flameActive = false;
			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
		this.imageTitlebox = null;
		this.imageTitlebutton = null;
		this.imageRunes = null;
		this.flameGradient = null;
		this.flameGradient0 = null;
		this.flameGradient1 = null;
		this.flameGradient2 = null;
		this.flameBuffer0 = null;
		this.flameBuffer1 = null;
		this.flameBuffer3 = null;
		this.flameBuffer2 = null;
		this.imageFlamesLeft = null;
		this.imageFlamesRight = null;
		if (arg0 < 3 || arg0 > 3) {
			this.levelObjStacks = null;
		}
	}

	@ObfuscatedName("client.c(IZI)Z")
	public final boolean updateInterfaceAnimation(int arg0, boolean arg1, int arg2) {
		boolean var4 = false;
		if (arg1) {
			throw new NullPointerException();
		}
		Component var5 = Component.instances[arg2];
		for (int var6 = 0; var6 < var5.children.length && var5.children[var6] != -1; var6++) {
			Component var7 = Component.instances[var5.children[var6]];
			if (var7.type == 1) {
				var4 |= this.updateInterfaceAnimation(arg0, false, var7.id);
			}
			if (var7.type == 6 && (var7.anim != -1 || var7.activeAnim != -1)) {
				boolean var8 = this.executeInterfaceScript(var7, false);
				int var9;
				if (var8) {
					var9 = var7.activeAnim;
				} else {
					var9 = var7.anim;
				}
				if (var9 != -1) {
					SeqType var10 = SeqType.instances[var9];
					var7.animCycle += arg0;
					while (var7.animCycle > var10.getFrameDuration(var7.animFrame, (byte) -39)) {
						var7.animCycle -= var10.getFrameDuration(var7.animFrame, (byte) -39) + 1;
						var7.animFrame++;
						if (var7.animFrame >= var10.frameCount) {
							var7.animFrame -= var10.replayoff;
							if (var7.animFrame < 0 || var7.animFrame >= var10.frameCount) {
								var7.animFrame = 0;
							}
						}
						var4 = true;
					}
				}
			}
		}
		return var4;
	}

	@ObfuscatedName("client.J(I)I")
	public final int getTopLevel(int arg0) {
		if (arg0 <= 0) {
			_flowObfuscator41 = !_flowObfuscator41;
		}
		int var2 = 3;
		if (this.cameraPitch < 310) {
			int var3 = this.cameraX >> 7;
			int var4 = this.cameraZ >> 7;
			int var5 = localPlayer.x >> 7;
			int var6 = localPlayer.z >> 7;
			if ((this.levelTileFlags[this.currentLevel][var3][var4] & 0x4) != 0) {
				var2 = this.currentLevel;
			}
			int var7;
			if (var5 > var3) {
				var7 = var5 - var3;
			} else {
				var7 = var3 - var5;
			}
			int var8;
			if (var6 > var4) {
				var8 = var6 - var4;
			} else {
				var8 = var4 - var6;
			}
			if (var7 > var8) {
				int var9 = var8 * 65536 / var7;
				int var10 = 32768;
				while (var3 != var5) {
					if (var3 < var5) {
						var3++;
					} else if (var3 > var5) {
						var3--;
					}
					if ((this.levelTileFlags[this.currentLevel][var3][var4] & 0x4) != 0) {
						var2 = this.currentLevel;
					}
					var10 += var9;
					if (var10 >= 65536) {
						var10 -= 65536;
						if (var4 < var6) {
							var4++;
						} else if (var4 > var6) {
							var4--;
						}
						if ((this.levelTileFlags[this.currentLevel][var3][var4] & 0x4) != 0) {
							var2 = this.currentLevel;
						}
					}
				}
			} else {
				int var11 = var7 * 65536 / var8;
				int var12 = 32768;
				while (var4 != var6) {
					if (var4 < var6) {
						var4++;
					} else if (var4 > var6) {
						var4--;
					}
					if ((this.levelTileFlags[this.currentLevel][var3][var4] & 0x4) != 0) {
						var2 = this.currentLevel;
					}
					var12 += var11;
					if (var12 >= 65536) {
						var12 -= 65536;
						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}
						if ((this.levelTileFlags[this.currentLevel][var3][var4] & 0x4) != 0) {
							var2 = this.currentLevel;
						}
					}
				}
			}
		}
		if ((this.levelTileFlags[this.currentLevel][localPlayer.x >> 7][localPlayer.z >> 7] & 0x4) != 0) {
			var2 = this.currentLevel;
		}
		return var2;
	}

	@ObfuscatedName("client.K(I)I")
	public final int getTopLevelCutscene(int arg0) {
		while (arg0 >= 0) {
			this.out.p1(21);
		}
		int var2 = this.getHeightmapY(this.currentLevel, this.cameraZ, true, this.cameraX);
		if (var2 - this.cameraY >= 800 || (this.levelTileFlags[this.currentLevel][this.cameraX >> 7][this.cameraZ >> 7] & 0x4) == 0) {
			return 3;
		} else {
			return this.currentLevel;
		}
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void removeIgnore(int arg0, long arg1) {
		if (arg0 != 3) {
			this.load();
		}
		if (arg1 == 0L) {
			return;
		}
		for (int var4 = 0; var4 < this.ignoreCount; var4++) {
			if (this.ignoreName37[var4] == arg1) {
				this.ignoreCount--;
				this.redrawSidebar = true;
				for (int var5 = var4; var5 < this.ignoreCount; var5++) {
					this.ignoreName37[var5] = this.ignoreName37[var5 + 1];
				}
				this.out.p1isaac((byte) 6, 74);
				this.out.p8(5, arg1);
				return;
			}
		}
	}

	public final String getParameter(String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@ObfuscatedName("client.a(BZI)V")
	public final void setMidiVolume(byte arg0, boolean arg1, int arg2) {
		if (arg0 == 0) {
			boolean var4 = false;
		} else {
			this.levelObjStacks = null;
		}
		signlink.midivol = arg2;
		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(ILDUCMKFAY;I)I")
	public final int executeClientscript1(int arg0, Component arg1, int arg2) {
		int var4 = 91 / arg0;
		if (arg1.scripts == null || arg2 >= arg1.scripts.length) {
			return -2;
		}
		try {
			int[] var5 = arg1.scripts[arg2];
			int var6 = 0;
			int var7 = 0;
			byte var8 = 0;
			while (true) {
				int var9 = var5[var7++];
				int var10 = 0;
				byte var11 = 0;
				if (var9 == 0) {
					return var6;
				}
				if (var9 == 1) {
					var10 = this.skillLevel[var5[var7++]];
				}
				if (var9 == 2) {
					var10 = this.skillBaseLevel[var5[var7++]];
				}
				if (var9 == 3) {
					var10 = this.skillExperience[var5[var7++]];
				}
				if (var9 == 4) {
					Component var12 = Component.instances[var5[var7++]];
					int var13 = var5[var7++];
					if (var13 >= 0 && var13 < ObjType.count && (!ObjType.get(var13).members || members)) {
						for (int var14 = 0; var14 < var12.invSlotObjId.length; var14++) {
							if (var13 + 1 == var12.invSlotObjId[var14]) {
								var10 += var12.invSlotObjCount[var14];
							}
						}
					}
				}
				if (var9 == 5) {
					var10 = this.varps[var5[var7++]];
				}
				if (var9 == 6) {
					var10 = levelExperience[this.skillBaseLevel[var5[var7++]] - 1];
				}
				if (var9 == 7) {
					var10 = this.varps[var5[var7++]] * 100 / 46875;
				}
				if (var9 == 8) {
					var10 = localPlayer.combatLevel;
				}
				if (var9 == 9) {
					for (int var15 = 0; var15 < Stats.count; var15++) {
						if (Stats.enabled[var15]) {
							var10 += this.skillBaseLevel[var15];
						}
					}
				}
				if (var9 == 10) {
					Component var16 = Component.instances[var5[var7++]];
					int var17 = var5[var7++] + 1;
					if (var17 >= 0 && var17 < ObjType.count && (!ObjType.get(var17).members || members)) {
						for (int var18 = 0; var18 < var16.invSlotObjId.length; var18++) {
							if (var16.invSlotObjId[var18] == var17) {
								var10 = 999999999;
								break;
							}
						}
					}
				}
				if (var9 == 11) {
					var10 = this.energy;
				}
				if (var9 == 12) {
					var10 = this.weightCarried;
				}
				if (var9 == 13) {
					int var19 = this.varps[var5[var7++]];
					int var20 = var5[var7++];
					var10 = (var19 & 0x1 << var20) == 0 ? 0 : 1;
				}
				if (var9 == 14) {
					int var21 = var5[var7++];
					VarbitType var22 = VarbitType.instances[var21];
					int var23 = var22.basevar;
					int var24 = var22.startbit;
					int var25 = var22.endbit;
					int var26 = BITMASK[var25 - var24];
					var10 = this.varps[var23] >> var24 & var26;
				}
				if (var9 == 15) {
					var11 = 1;
				}
				if (var9 == 16) {
					var11 = 2;
				}
				if (var9 == 17) {
					var11 = 3;
				}
				if (var9 == 18) {
					var10 = (localPlayer.x >> 7) + this.sceneBaseTileX;
				}
				if (var9 == 19) {
					var10 = (localPlayer.z >> 7) + this.sceneBaseTileZ;
				}
				if (var9 == 20) {
					var10 = var5[var7++];
				}
				if (var11 == 0) {
					if (var8 == 0) {
						var6 += var10;
					}
					if (var8 == 1) {
						var6 -= var10;
					}
					if (var8 == 2 && var10 != 0) {
						var6 /= var10;
					}
					if (var8 == 3) {
						var6 *= var10;
					}
					var8 = 0;
				} else {
					var8 = var11;
				}
			}
		} catch (Exception var27) {
			return -1;
		}
	}

	@ObfuscatedName("client.L(I)V")
	public final void drawTooltip(int arg0) {
		if (this.menuSize < 2 && this.objSelected == 0 && this.spellSelected == 0) {
			return;
		}
		String var2;
		if (this.objSelected == 1 && this.menuSize < 2) {
			var2 = "Use " + this.objSelectedName + " with...";
		} else if (this.spellSelected == 1 && this.menuSize < 2) {
			var2 = this.spellCaption + "...";
		} else {
			var2 = this.menuOption[this.menuSize - 1];
		}
		if (this.menuSize > 2) {
			var2 = var2 + "@whi@ / " + (this.menuSize - 2) + " more options";
		}
		this.fontBold12.drawStringTooltip(true, 4, 16777215, var2, loopCycle / 1000, 973, 15);
		if (arg0 != 45706) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void drawMinimap(boolean arg0) {
		if (arg0) {
			return;
		}
		this.areaMapback.bind(0);
		if (this.minimapState == 2) {
			byte[] var2 = this.imageMapback.pixels;
			int[] var3 = Pix2D.data;
			int var4 = var2.length;
			for (int var5 = 0; var5 < var4; var5++) {
				if (var2[var5] == 0) {
					var3[var5] = 0;
				}
			}
			this.imageCompass.drawRotatedMasked(33, this.orbitCameraYaw, this.compassMaskLineLengths, 256, this.compassMaskLineOffsets, -236, 25, 0, 0, 33, 25);
			this.areaViewport.bind(0);
			return;
		}
		int var6 = this.minimapAnticheatAngle + this.orbitCameraYaw & 0x7FF;
		int var7 = localPlayer.x / 32 + 48;
		int var8 = 464 - localPlayer.z / 32;
		this.imageMinimap.drawRotatedMasked(151, var6, this.minimapMaskLineLengths, this.minimapZoom + 256, this.minimapMaskLineOffsets, -236, var8, 5, 25, 146, var7);
		this.imageCompass.drawRotatedMasked(33, this.orbitCameraYaw, this.compassMaskLineLengths, 256, this.compassMaskLineOffsets, -236, 25, 0, 0, 33, 25);
		for (int var9 = 0; var9 < this.activeMapFunctionCount; var9++) {
			int var39 = this.activeMapFunctionX[var9] * 4 + 2 - localPlayer.x / 32;
			int var40 = this.activeMapFunctionZ[var9] * 4 + 2 - localPlayer.z / 32;
			this.drawOnMinimap(this.activeMapFunctions[var9], var39, var40, false);
		}
		for (int var10 = 0; var10 < 104; var10++) {
			for (int var35 = 0; var35 < 104; var35++) {
				LinkList var36 = this.levelObjStacks[this.currentLevel][var10][var35];
				if (var36 != null) {
					int var37 = var10 * 4 + 2 - localPlayer.x / 32;
					int var38 = var35 * 4 + 2 - localPlayer.z / 32;
					this.drawOnMinimap(this.imageMapdot0, var37, var38, false);
				}
			}
		}
		for (int var11 = 0; var11 < this.npcCount; var11++) {
			NpcEntity var31 = this.npcs[this.npcIds[var11]];
			if (var31 != null && var31.isVisible(_flowObfuscator41)) {
				NpcType var32 = var31.type;
				if (var32.multinpc != null) {
					var32 = var32.getMultiNpc(this._flowObfuscator10);
				}
				if (var32 != null && var32.minimap && var32.active) {
					int var33 = var31.x / 32 - localPlayer.x / 32;
					int var34 = var31.z / 32 - localPlayer.z / 32;
					this.drawOnMinimap(this.imageMapdot1, var33, var34, false);
				}
			}
		}
		for (int var12 = 0; var12 < this.playerCount; var12++) {
			PlayerEntity var23 = this.players[this.playerIds[var12]];
			if (var23 != null && var23.isVisible(_flowObfuscator41)) {
				int var24 = var23.x / 32 - localPlayer.x / 32;
				int var25 = var23.z / 32 - localPlayer.z / 32;
				boolean var26 = false;
				long var27 = JString.toBase37(var23.name);
				for (int var29 = 0; var29 < this.friendCount; var29++) {
					if (this.friendName37[var29] == var27 && this.friendWorld[var29] != 0) {
						var26 = true;
						break;
					}
				}
				boolean var30 = false;
				if (localPlayer.team != 0 && var23.team != 0 && localPlayer.team == var23.team) {
					var30 = true;
				}
				if (var26) {
					this.drawOnMinimap(this.imageMapdot3, var24, var25, false);
				} else if (var30) {
					this.drawOnMinimap(this.imageMapdot4, var24, var25, false);
				} else {
					this.drawOnMinimap(this.imageMapdot2, var24, var25, false);
				}
			}
		}
		if (this.hintType != 0 && loopCycle % 20 < 10) {
			if (this.hintType == 1 && this.hintNpc >= 0 && this.hintNpc < this.npcs.length) {
				NpcEntity var13 = this.npcs[this.hintNpc];
				if (var13 != null) {
					int var14 = var13.x / 32 - localPlayer.x / 32;
					int var15 = var13.z / 32 - localPlayer.z / 32;
					this.drawMinimapHint(this.imageMapmarker1, -760, var15, var14);
				}
			}
			if (this.hintType == 2) {
				int var16 = (this.hintTileX - this.sceneBaseTileX) * 4 + 2 - localPlayer.x / 32;
				int var17 = (this.hintTileZ - this.sceneBaseTileZ) * 4 + 2 - localPlayer.z / 32;
				this.drawMinimapHint(this.imageMapmarker1, -760, var17, var16);
			}
			if (this.hintType == 10 && this.hintPlayer >= 0 && this.hintPlayer < this.players.length) {
				PlayerEntity var18 = this.players[this.hintPlayer];
				if (var18 != null) {
					int var19 = var18.x / 32 - localPlayer.x / 32;
					int var20 = var18.z / 32 - localPlayer.z / 32;
					this.drawMinimapHint(this.imageMapmarker1, -760, var20, var19);
				}
			}
		}
		if (this.flagSceneTileX != 0) {
			int var21 = this.flagSceneTileX * 4 + 2 - localPlayer.x / 32;
			int var22 = this.flagSceneTileZ * 4 + 2 - localPlayer.z / 32;
			this.drawOnMinimap(this.imageMapmarker0, var21, var22, false);
		}
		Pix2D.fillRect(3, 78, 97, 16777215, 3, 0);
		this.areaViewport.bind(0);
	}

	@ObfuscatedName("client.a(ZLGQOSZKJC;I)V")
	public final void projectFromGround(boolean arg0, PathingEntity arg1, int arg2) {
		if (!arg0) {
			this.packetType = this.in.g1();
		}
		this.projectFromGround(arg1.x, arg2, this._flowObfuscator9, arg1.z);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void projectFromGround(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 128 || arg3 < 128 || arg0 > 13056 || arg3 > 13056) {
			this.projectX = -1;
			this.projectY = -1;
			return;
		}
		int var5 = this.getHeightmapY(this.currentLevel, arg3, true, arg0) - arg1;
		int var6 = arg0 - this.cameraX;
		int var7 = var5 - this.cameraY;
		int var8 = arg3 - this.cameraZ;
		int var9 = Model.sin[this.cameraPitch];
		int var10 = Model.cos[this.cameraPitch];
		int var11 = Model.sin[this.cameraYaw];
		int var12 = Model.cos[this.cameraYaw];
		int var13 = var6 * var12 + var8 * var11 >> 16;
		int var14 = var8 * var12 - var6 * var11 >> 16;
		if (arg2 >= 0) {
			this.out.p1(27);
		}
		int var16 = var7 * var10 - var9 * var14 >> 16;
		int var17 = var7 * var9 + var10 * var14 >> 16;
		if (var17 >= 50) {
			this.projectX = (var13 << 9) / var17 + Pix3D.centerX;
			this.projectY = (var16 << 9) / var17 + Pix3D.centerY;
		} else {
			this.projectX = -1;
			this.projectY = -1;
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void handlePrivateChatInput(boolean arg0) {
		if (this.splitPrivateChat == 0) {
			return;
		}
		int var2 = 0;
		if (arg0) {
			this.packetType = -1;
		}
		if (this.systemUpdateTimer != 0) {
			var2 = 1;
		}
		for (int var3 = 0; var3 < 100; var3++) {
			if (this.messageText[var3] != null) {
				int var4 = this.messageType[var3];
				String var5 = this.messageSender[var3];
				boolean var6 = false;
				if (var5 != null && var5.startsWith("@cr1@")) {
					var5 = var5.substring(5);
					boolean var7 = true;
				}
				if (var5 != null && var5.startsWith("@cr2@")) {
					var5 = var5.substring(5);
					boolean var8 = true;
				}
				if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.privateChatSetting == 0 || this.privateChatSetting == 1 && this.isFriend(false, var5))) {
					int var9 = 329 - var2 * 13;
					if (super.mouseX > 4 && super.mouseY - 4 > var9 - 10 && super.mouseY - 4 <= var9 + 3) {
						int var10 = this.fontPlain12.stringWidthTag(this._flowObfuscator32, "From:  " + var5 + this.messageText[var3]) + 25;
						if (var10 > 450) {
							var10 = 450;
						}
						if (super.mouseX < var10 + 4) {
							if (this.rights >= 1) {
								this.menuOption[this.menuSize] = "Report abuse @whi@" + var5;
								this.menuAction[this.menuSize] = 2606;
								this.menuSize++;
							}
							this.menuOption[this.menuSize] = "Add ignore @whi@" + var5;
							this.menuAction[this.menuSize] = 2042;
							this.menuSize++;
							this.menuOption[this.menuSize] = "Add friend @whi@" + var5;
							this.menuAction[this.menuSize] = 2337;
							this.menuSize++;
						}
					}
					var2++;
					if (var2 >= 5) {
						return;
					}
				}
				if ((var4 == 5 || var4 == 6) && this.privateChatSetting < 2) {
					var2++;
					if (var2 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void appendLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		LocAddEntity var11 = null;
		for (LocAddEntity var12 = (LocAddEntity) this.temporaryLocs.head(); var12 != null; var12 = (LocAddEntity) this.temporaryLocs.next(false)) {
			if (var12.level == arg7 && var12.localX == arg8 && var12.localZ == arg5 && var12.layer == arg4) {
				var11 = var12;
				break;
			}
		}
		if (var11 == null) {
			var11 = new LocAddEntity();
			var11.level = arg7;
			var11.layer = arg4;
			var11.localX = arg8;
			var11.localZ = arg5;
			this.storeLoc(false, var11);
			this.temporaryLocs.addTail(var11);
		}
		var11.type = arg2;
		var11.shape = arg6;
		var11.rotation = arg3;
		var11.delay = arg9;
		var11.duration = arg1;
		if (arg0 > 0) {
			;
		}
	}

	@ObfuscatedName("client.b(LDUCMKFAY;Z)Z")
	public final boolean executeInterfaceScript(Component arg0, boolean arg1) {
		if (arg1) {
			this._flowObfuscator12 = -211;
		}
		if (arg0.scriptComparator == null) {
			return false;
		}
		for (int var3 = 0; var3 < arg0.scriptComparator.length; var3++) {
			int var4 = this.executeClientscript1(341, arg0, var3);
			int var5 = arg0.scriptOperand[var3];
			if (arg0.scriptComparator[var3] == 2) {
				if (var4 >= var5) {
					return false;
				}
			} else if (arg0.scriptComparator[var3] == 3) {
				if (var4 <= var5) {
					return false;
				}
			} else if (arg0.scriptComparator[var3] == 4) {
				if (var4 == var5) {
					return false;
				}
			} else if (var4 != var5) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream openUrl(String arg0) throws IOException {
		if (this.jaggrabEnabled) {
			if (this.jaggrabSocket != null) {
				try {
					this.jaggrabSocket.close();
				} catch (Exception var4) {
				}
				this.jaggrabSocket = null;
			}
			this.jaggrabSocket = this.openSocket(43595);
			this.jaggrabSocket.setSoTimeout(10000);
			InputStream var2 = this.jaggrabSocket.getInputStream();
			OutputStream var3 = this.jaggrabSocket.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		} else if (signlink.mainapp == null) {
			return new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
		} else {
			return signlink.openurl(arg0);
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void drawFlames(byte arg0) {
		short var2 = 256;
		if (this.flameGradientCycle0 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (this.flameGradientCycle0 > 768) {
					this.flameGradient[var3] = this.mix(true, this.flameGradient0[var3], this.flameGradient1[var3], 1024 - this.flameGradientCycle0);
				} else if (this.flameGradientCycle0 > 256) {
					this.flameGradient[var3] = this.flameGradient1[var3];
				} else {
					this.flameGradient[var3] = this.mix(true, this.flameGradient1[var3], this.flameGradient0[var3], 256 - this.flameGradientCycle0);
				}
			}
		} else if (this.flameGradientCycle1 > 0) {
			for (int var4 = 0; var4 < 256; var4++) {
				if (this.flameGradientCycle1 > 768) {
					this.flameGradient[var4] = this.mix(true, this.flameGradient0[var4], this.flameGradient2[var4], 1024 - this.flameGradientCycle1);
				} else if (this.flameGradientCycle1 > 256) {
					this.flameGradient[var4] = this.flameGradient2[var4];
				} else {
					this.flameGradient[var4] = this.mix(true, this.flameGradient2[var4], this.flameGradient0[var4], 256 - this.flameGradientCycle1);
				}
			}
		} else {
			for (int var5 = 0; var5 < 256; var5++) {
				this.flameGradient[var5] = this.flameGradient0[var5];
			}
		}
		for (int var6 = 0; var6 < 33920; var6++) {
			this.imageTitle0.data[var6] = this.imageFlamesLeft.pixels[var6];
		}
		int var7 = 0;
		int var8 = 1152;
		for (int var9 = 1; var9 < var2 - 1; var9++) {
			int var23 = (var2 - var9) * this.flameLineOffset[var9] / var2;
			int var24 = var23 + 22;
			if (var24 < 0) {
				var24 = 0;
			}
			var7 += var24;
			for (int var25 = var24; var25 < 128; var25++) {
				int var26 = this.flameBuffer3[var7++];
				if (var26 == 0) {
					var8++;
				} else {
					int var28 = 256 - var26;
					int var29 = this.flameGradient[var26];
					int var30 = this.imageTitle0.data[var8];
					this.imageTitle0.data[var8++] = ((var29 & 0xFF00FF) * var26 + (var30 & 0xFF00FF) * var28 & 0xFF00FF00) + ((var29 & 0xFF00) * var26 + (var30 & 0xFF00) * var28 & 0xFF0000) >> 8;
				}
			}
			var8 += var24;
		}
		this.imageTitle0.draw(0, 23680, super.graphics, 0);
		for (int var10 = 0; var10 < 33920; var10++) {
			this.imageTitle1.data[var10] = this.imageFlamesRight.pixels[var10];
		}
		int var11 = 0;
		int var12 = 1176;
		for (int var13 = 1; var13 < var2 - 1; var13++) {
			int var14 = (var2 - var13) * this.flameLineOffset[var13] / var2;
			int var15 = 103 - var14;
			int var16 = var12 + var14;
			for (int var17 = 0; var17 < var15; var17++) {
				int var18 = this.flameBuffer3[var11++];
				if (var18 == 0) {
					var16++;
				} else {
					int var20 = 256 - var18;
					int var21 = this.flameGradient[var18];
					int var22 = this.imageTitle1.data[var16];
					this.imageTitle1.data[var16++] = ((var21 & 0xFF00FF) * var18 + (var22 & 0xFF00FF) * var20 & 0xFF00FF00) + ((var21 & 0xFF00) * var18 + (var22 & 0xFF00) * var20 & 0xFF0000) >> 8;
				}
			}
			var11 += 128 - var15;
			var12 = 128 - var15 - var14 + var16;
		}
		this.imageTitle1.draw(0, 23680, super.graphics, 637);
		if (arg0 != 9) {
			this.packetType = this.in.g1();
		}
	}

	@ObfuscatedName("client.a(BILMBMGIXGO;)V")
	public final void readPlayers(byte arg0, int arg1, Packet arg2) {
		int var4 = arg2.gBit(8, 0);
		if (var4 < this.playerCount) {
			for (int var5 = var4; var5 < this.playerCount; var5++) {
				this.entityRemovalIds[this.entityRemovalCount++] = this.playerIds[var5];
			}
		}
		if (var4 > this.playerCount) {
			signlink.reporterror(this.username + " Too many players");
			throw new RuntimeException("eek");
		}
		this.playerCount = 0;
		for (int var6 = 0; var6 < var4; var6++) {
			int var7 = this.playerIds[var6];
			PlayerEntity var8 = this.players[var7];
			int var9 = arg2.gBit(1, 0);
			if (var9 == 0) {
				this.playerIds[this.playerCount++] = var7;
				var8.cycle = loopCycle;
			} else {
				int var10 = arg2.gBit(2, 0);
				if (var10 == 0) {
					this.playerIds[this.playerCount++] = var7;
					var8.cycle = loopCycle;
					this.entityUpdateIds[this.entityUpdateCount++] = var7;
				} else if (var10 == 1) {
					this.playerIds[this.playerCount++] = var7;
					var8.cycle = loopCycle;
					int var11 = arg2.gBit(3, 0);
					var8.step(false, (byte) 20, var11);
					int var12 = arg2.gBit(1, 0);
					if (var12 == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = var7;
					}
				} else if (var10 == 2) {
					this.playerIds[this.playerCount++] = var7;
					var8.cycle = loopCycle;
					int var13 = arg2.gBit(3, 0);
					var8.step(true, (byte) 20, var13);
					int var14 = arg2.gBit(3, 0);
					var8.step(true, (byte) 20, var14);
					int var15 = arg2.gBit(1, 0);
					if (var15 == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = var7;
					}
				} else if (var10 == 3) {
					this.entityRemovalIds[this.entityRemovalCount++] = var7;
				}
			}
		}
		if (arg0 != 2) {
			this._flowObfuscator18 = -80;
		}
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void drawTitleScreen(boolean arg0, boolean arg1) {
		this.loadTitle(0);
		this.imageTitle4.bind(0);
		this.imageTitlebox.draw(0, 16083, 0);
		short var3 = 360;
		short var4 = 200;
		if (arg1) {
			return;
		}
		if (this.titleScreenState == 0) {
			int var5 = var4 / 2 + 80;
			this.fontPlain11.drawStringCenterTag(7711145, var3 / 2, this._flowObfuscator18, this.ondemand.message, var5, true);
			int var6 = var4 / 2 - 20;
			this.fontBold12.drawStringCenterTag(16776960, var3 / 2, this._flowObfuscator18, "Welcome to RuneScape", var6, true);
			int var17 = var6 + 30;
			int var7 = var3 / 2 - 80;
			int var8 = var4 / 2 + 20;
			this.imageTitlebutton.draw(var7 - 73, 16083, var8 - 20);
			this.fontBold12.drawStringCenterTag(16777215, var7, this._flowObfuscator18, "New User", var8 + 5, true);
			int var9 = var3 / 2 + 80;
			this.imageTitlebutton.draw(var9 - 73, 16083, var8 - 20);
			this.fontBold12.drawStringCenterTag(16777215, var9, this._flowObfuscator18, "Existing User", var8 + 5, true);
		}
		if (this.titleScreenState == 2) {
			int var10 = var4 / 2 - 40;
			if (this.loginMessage0.length() > 0) {
				this.fontBold12.drawStringCenterTag(16776960, var3 / 2, this._flowObfuscator18, this.loginMessage0, var10 - 15, true);
				this.fontBold12.drawStringCenterTag(16776960, var3 / 2, this._flowObfuscator18, this.loginMessage1, var10, true);
				var10 += 30;
			} else {
				this.fontBold12.drawStringCenterTag(16776960, var3 / 2, this._flowObfuscator18, this.loginMessage1, var10 - 7, true);
				var10 += 30;
			}
			this.fontBold12.drawStringTag(false, true, var3 / 2 - 90, 16777215, "Username: " + this.username + (this.titleLoginField == 0 & loopCycle % 40 < 20 ? "@yel@|" : ""), var10);
			var10 += 15;
			this.fontBold12.drawStringTag(false, true, var3 / 2 - 88, 16777215, "Password: " + JString.censor(this.password, 0) + (this.titleLoginField == 1 & loopCycle % 40 < 20 ? "@yel@|" : ""), var10);
			var10 += 15;
			if (!arg0) {
				int var11 = var3 / 2 - 80;
				int var12 = var4 / 2 + 50;
				this.imageTitlebutton.draw(var11 - 73, 16083, var12 - 20);
				this.fontBold12.drawStringCenterTag(16777215, var11, this._flowObfuscator18, "Login", var12 + 5, true);
				int var13 = var3 / 2 + 80;
				this.imageTitlebutton.draw(var13 - 73, 16083, var12 - 20);
				this.fontBold12.drawStringCenterTag(16777215, var13, this._flowObfuscator18, "Cancel", var12 + 5, true);
			}
		}
		if (this.titleScreenState == 3) {
			this.fontBold12.drawStringCenterTag(16776960, var3 / 2, this._flowObfuscator18, "Create a free account", var4 / 2 - 60, true);
			int var14 = var4 / 2 - 35;
			this.fontBold12.drawStringCenterTag(16777215, var3 / 2, this._flowObfuscator18, "To create a new account you need to", var14, true);
			int var18 = var14 + 15;
			this.fontBold12.drawStringCenterTag(16777215, var3 / 2, this._flowObfuscator18, "go back to the main RuneScape webpage", var18, true);
			int var19 = var18 + 15;
			this.fontBold12.drawStringCenterTag(16777215, var3 / 2, this._flowObfuscator18, "and choose the red 'create account'", var19, true);
			int var20 = var19 + 15;
			this.fontBold12.drawStringCenterTag(16777215, var3 / 2, this._flowObfuscator18, "button at the top right of that page.", var20, true);
			int var21 = var20 + 15;
			int var15 = var3 / 2;
			int var16 = var4 / 2 + 50;
			this.imageTitlebutton.draw(var15 - 73, 16083, var16 - 20);
			this.fontBold12.drawStringCenterTag(16777215, var15, this._flowObfuscator18, "Cancel", var16 + 5, true);
		}
		this.imageTitle4.draw(171, 23680, super.graphics, 202);
		if (!this.redrawTitleBackground) {
			return;
		}
		this.redrawTitleBackground = false;
		this.imageTitle2.draw(0, 23680, super.graphics, 128);
		this.imageTitle3.draw(371, 23680, super.graphics, 202);
		this.imageTitle5.draw(265, 23680, super.graphics, 0);
		this.imageTitle6.draw(265, 23680, super.graphics, 562);
		this.imageTitle7.draw(171, 23680, super.graphics, 128);
		this.imageTitle8.draw(171, 23680, super.graphics, 562);
	}

	@ObfuscatedName("client.l(B)V")
	public final void runFlames(byte arg0) {
		this.flameThread = true;
		if (arg0 != 59) {
			this._flowObfuscator27 = -186;
		}
		try {
			long var2 = System.currentTimeMillis();
			int var4 = 0;
			int var5 = 20;
			while (this.flameActive) {
				this.frameCycle++;
				this.updateFlames(25106);
				this.updateFlames(25106);
				this.drawFlames((byte) 9);
				var4++;
				if (var4 > 10) {
					long var6 = System.currentTimeMillis();
					int var8 = (int) (var6 - var2) / 10 - var5;
					var5 = 40 - var8;
					if (var5 < 5) {
						var5 = 5;
					}
					var4 = 0;
					var2 = var6;
				}
				try {
					Thread.sleep((long) var5);
				} catch (Exception var9) {
				}
			}
		} catch (Exception var10) {
		}
		this.flameThread = false;
	}

	@ObfuscatedName("client.a(B)V")
	public final void refresh(byte arg0) {
		this.redrawTitleBackground = true;
		if (arg0 == 1) {
			boolean var2 = false;
		} else {
			this._flowObfuscator40 = this.randomIn.nextInt();
		}
	}

	@ObfuscatedName("client.a(ILMBMGIXGO;I)V")
	public final void readZonePacket(int arg0, Packet arg1, int arg2) {
		while (arg0 >= 0) {
			arg2 = -1;
		}
		if (arg2 == 84) {
			int var4 = arg1.g1();
			int var5 = (var4 >> 4 & 0x7) + this.baseX;
			int var6 = (var4 & 0x7) + this.baseZ;
			int var7 = arg1.g2();
			int var8 = arg1.g2();
			int var9 = arg1.g2();
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
				LinkList var10 = this.levelObjStacks[this.currentLevel][var5][var6];
				if (var10 != null) {
					for (ObjStackEntity var11 = (ObjStackEntity) var10.head(); var11 != null; var11 = (ObjStackEntity) var10.next(false)) {
						if ((var7 & 0x7FFF) == var11.type && var11.count == var8) {
							var11.count = var9;
							break;
						}
					}
					this.sortObjStacks(var5, var6);
				}
			}
			return;
		}
		if (arg2 == 105) {
			int var12 = arg1.g1();
			int var13 = (var12 >> 4 & 0x7) + this.baseX;
			int var14 = (var12 & 0x7) + this.baseZ;
			int var15 = arg1.g2();
			int var16 = arg1.g1();
			int var17 = var16 >> 4 & 0xF;
			int var18 = var16 & 0x7;
			if (localPlayer.pathTileX[0] >= var13 - var17 && localPlayer.pathTileX[0] <= var13 + var17 && localPlayer.pathTileZ[0] >= var14 - var17 && localPlayer.pathTileZ[0] <= var14 + var17 && this.waveEnabled && !lowMemory && this.waveCount < 50) {
				this.waveIds[this.waveCount] = var15;
				this.waveLoops[this.waveCount] = var18;
				this.waveDelay[this.waveCount] = Wave.delays[var15];
				this.waveCount++;
			}
		}
		if (arg2 == 215) {
			int var19 = arg1.g2_alt2(true);
			int var20 = arg1.g1_alt3(2);
			int var21 = (var20 >> 4 & 0x7) + this.baseX;
			int var22 = (var20 & 0x7) + this.baseZ;
			int var23 = arg1.g2_alt2(true);
			int var24 = arg1.g2();
			if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104 && this.localPid != var23) {
				ObjStackEntity var25 = new ObjStackEntity();
				var25.type = var19;
				var25.count = var24;
				if (this.levelObjStacks[this.currentLevel][var21][var22] == null) {
					this.levelObjStacks[this.currentLevel][var21][var22] = new LinkList(169);
				}
				this.levelObjStacks[this.currentLevel][var21][var22].addTail(var25);
				this.sortObjStacks(var21, var22);
			}
		} else if (arg2 == 156) {
			int var26 = arg1.g1_alt1(0);
			int var27 = (var26 >> 4 & 0x7) + this.baseX;
			int var28 = (var26 & 0x7) + this.baseZ;
			int var29 = arg1.g2();
			if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
				LinkList var30 = this.levelObjStacks[this.currentLevel][var27][var28];
				if (var30 != null) {
					for (ObjStackEntity var31 = (ObjStackEntity) var30.head(); var31 != null; var31 = (ObjStackEntity) var30.next(false)) {
						if ((var29 & 0x7FFF) == var31.type) {
							var31.unlink();
							break;
						}
					}
					if (var30.head() == null) {
						this.levelObjStacks[this.currentLevel][var27][var28] = null;
					}
					this.sortObjStacks(var27, var28);
				}
			}
		} else if (arg2 == 160) {
			int var32 = arg1.g1_alt3(2);
			int var33 = (var32 >> 4 & 0x7) + this.baseX;
			int var34 = (var32 & 0x7) + this.baseZ;
			int var35 = arg1.g1_alt3(2);
			int var36 = var35 >> 2;
			int var37 = var35 & 0x3;
			int var38 = this.LOC_LAYER[var36];
			int var39 = arg1.g2_alt2(true);
			if (var33 >= 0 && var34 >= 0 && var33 < 103 && var34 < 103) {
				int var40 = this.levelHeightmap[this.currentLevel][var33][var34];
				int var41 = this.levelHeightmap[this.currentLevel][var33 + 1][var34];
				int var42 = this.levelHeightmap[this.currentLevel][var33 + 1][var34 + 1];
				int var43 = this.levelHeightmap[this.currentLevel][var33][var34 + 1];
				if (var38 == 0) {
					Wall var44 = this.scene.getWall(this.currentLevel, var33, var34, false);
					if (var44 != null) {
						int var45 = var44.bitset >> 14 & 0x7FFF;
						if (var36 == 2) {
							var44.modelA = new LocEntity(var45, var37 + 4, 2, var41, (byte) 7, var42, var40, var43, var39, false);
							var44.modelB = new LocEntity(var45, var37 + 1 & 0x3, 2, var41, (byte) 7, var42, var40, var43, var39, false);
						} else {
							var44.modelA = new LocEntity(var45, var37, var36, var41, (byte) 7, var42, var40, var43, var39, false);
						}
					}
				}
				if (var38 == 1) {
					Decor var46 = this.scene.getWallDecoration(var33, 866, var34, this.currentLevel);
					if (var46 != null) {
						var46.field1195 = new LocEntity(var46.bitset >> 14 & 0x7FFF, 0, 4, var41, (byte) 7, var42, var40, var43, var39, false);
					}
				}
				if (var38 == 2) {
					Location var47 = this.scene.getLoc(var33, var34, (byte) 4, this.currentLevel);
					if (var36 == 11) {
						var36 = 10;
					}
					if (var47 != null) {
						var47.model = new LocEntity(var47.bitset >> 14 & 0x7FFF, var37, var36, var41, (byte) 7, var42, var40, var43, var39, false);
					}
				}
				if (var38 == 3) {
					GroundDecor var48 = this.scene.getGroundDecoration(var34, var33, this.currentLevel, 0);
					if (var48 != null) {
						var48.model = new LocEntity(var48.bitset >> 14 & 0x7FFF, var37, 22, var41, (byte) 7, var42, var40, var43, var39, false);
					}
				}
			}
		} else {
			if (arg2 == 147) {
				int var49 = arg1.g1_alt3(2);
				int var50 = (var49 >> 4 & 0x7) + this.baseX;
				int var51 = (var49 & 0x7) + this.baseZ;
				int var52 = arg1.g2();
				byte var53 = arg1.g1b_alt3(0);
				int var54 = arg1.g2_alt1((byte) 108);
				byte var55 = arg1.g1b_alt2((byte) -57);
				int var56 = arg1.g2();
				int var57 = arg1.g1_alt3(2);
				int var58 = var57 >> 2;
				int var59 = var57 & 0x3;
				int var60 = this.LOC_LAYER[var58];
				byte var61 = arg1.g1b();
				int var62 = arg1.g2();
				byte var63 = arg1.g1b_alt2((byte) -57);
				PlayerEntity var64;
				if (this.localPid == var52) {
					var64 = localPlayer;
				} else {
					var64 = this.players[var52];
				}
				if (var64 != null) {
					LocType var65 = LocType.get(var62);
					int var66 = this.levelHeightmap[this.currentLevel][var50][var51];
					int var67 = this.levelHeightmap[this.currentLevel][var50 + 1][var51];
					int var68 = this.levelHeightmap[this.currentLevel][var50 + 1][var51 + 1];
					int var69 = this.levelHeightmap[this.currentLevel][var50][var51 + 1];
					Model var70 = var65.getModel(var58, var59, var66, var67, var68, var69, -1);
					if (var70 != null) {
						this.appendLoc(404, var56 + 1, -1, 0, var60, var51, 0, this.currentLevel, var50, var54 + 1);
						var64.locStartCycle = loopCycle + var54;
						var64.locStopCycle = loopCycle + var56;
						var64.locModel = var70;
						int var71 = var65.width;
						int var72 = var65.length;
						if (var59 == 1 || var59 == 3) {
							var71 = var65.length;
							var72 = var65.width;
						}
						var64.locOffsetX = var50 * 128 + var71 * 64;
						var64.locOffsetZ = var51 * 128 + var72 * 64;
						var64.locOffsetY = this.getHeightmapY(this.currentLevel, var64.locOffsetZ, true, var64.locOffsetX);
						if (var61 > var53) {
							byte var73 = var61;
							var61 = var53;
							var53 = var73;
						}
						if (var63 > var55) {
							byte var74 = var63;
							var63 = var55;
							var55 = var74;
						}
						var64.minTileX = var50 + var61;
						var64.maxTileX = var50 + var53;
						var64.minTileZ = var51 + var63;
						var64.maxTileZ = var51 + var55;
					}
				}
			}
			if (arg2 == 151) {
				int var75 = arg1.g1_alt1(0);
				int var76 = (var75 >> 4 & 0x7) + this.baseX;
				int var77 = (var75 & 0x7) + this.baseZ;
				int var78 = arg1.g2_alt1((byte) 108);
				int var79 = arg1.g1_alt3(2);
				int var80 = var79 >> 2;
				int var81 = var79 & 0x3;
				int var82 = this.LOC_LAYER[var80];
				if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
					this.appendLoc(404, -1, var78, var81, var82, var77, var80, this.currentLevel, var76, 0);
				}
			} else if (arg2 == 4) {
				int var83 = arg1.g1();
				int var84 = (var83 >> 4 & 0x7) + this.baseX;
				int var85 = (var83 & 0x7) + this.baseZ;
				int var86 = arg1.g2();
				int var87 = arg1.g1();
				int var88 = arg1.g2();
				if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
					int var89 = var84 * 128 + 64;
					int var90 = var85 * 128 + 64;
					SpotAnimEntity var91 = new SpotAnimEntity(this.currentLevel, loopCycle, 6, var88, var86, this.getHeightmapY(this.currentLevel, var90, true, var89) - var87, var90, var89);
					this.spotanims.addTail(var91);
				}
			} else if (arg2 == 44) {
				int var92 = arg1.g2_alt3((byte) -74);
				int var93 = arg1.g2();
				int var94 = arg1.g1();
				int var95 = (var94 >> 4 & 0x7) + this.baseX;
				int var96 = (var94 & 0x7) + this.baseZ;
				if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
					ObjStackEntity var97 = new ObjStackEntity();
					var97.type = var92;
					var97.count = var93;
					if (this.levelObjStacks[this.currentLevel][var95][var96] == null) {
						this.levelObjStacks[this.currentLevel][var95][var96] = new LinkList(169);
					}
					this.levelObjStacks[this.currentLevel][var95][var96].addTail(var97);
					this.sortObjStacks(var95, var96);
				}
			} else if (arg2 == 101) {
				int var98 = arg1.g1_alt2(false);
				int var99 = var98 >> 2;
				int var100 = var98 & 0x3;
				int var101 = this.LOC_LAYER[var99];
				int var102 = arg1.g1();
				int var103 = (var102 >> 4 & 0x7) + this.baseX;
				int var104 = (var102 & 0x7) + this.baseZ;
				if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
					this.appendLoc(404, -1, -1, var100, var101, var104, var99, this.currentLevel, var103, 0);
				}
			} else if (arg2 == 117) {
				int var105 = arg1.g1();
				int var106 = (var105 >> 4 & 0x7) + this.baseX;
				int var107 = (var105 & 0x7) + this.baseZ;
				int var108 = var106 + arg1.g1b();
				int var109 = var107 + arg1.g1b();
				int var110 = arg1.g2b();
				int var111 = arg1.g2();
				int var112 = arg1.g1() * 4;
				int var113 = arg1.g1() * 4;
				int var114 = arg1.g2();
				int var115 = arg1.g2();
				int var116 = arg1.g1();
				int var117 = arg1.g1();
				if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104 && var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104 && var111 != 65535) {
					int var118 = var106 * 128 + 64;
					int var119 = var107 * 128 + 64;
					int var120 = var108 * 128 + 64;
					int var121 = var109 * 128 + 64;
					ProjectileEntity var122 = new ProjectileEntity(var116, var113, 46883, loopCycle + var114, loopCycle + var115, var117, this.currentLevel, this.getHeightmapY(this.currentLevel, var119, true, var118) - var112, var119, var118, var110, var111);
					var122.updateVelocity(loopCycle + var114, var121, this.getHeightmapY(this.currentLevel, var121, true, var120) - var113, var120, (byte) -83);
					this.projectiles.addTail(var122);
				}
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public static final void setLowMemory(byte arg0) {
		World3D.lowMemory = true;
		if (_flowObfuscator5 != arg0) {
			for (int var1 = 1; var1 > 0; var1++) {
			}
		}
		Pix3D.lowMemory = true;
		lowMemory = true;
		World.lowMemory = true;
		LocType.lowMemory = true;
	}

	@ObfuscatedName("client.b(LMBMGIXGO;II)V")
	public final void readNpcs(Packet arg0, int arg1, int arg2) {
		if (arg1 >= 0) {
			this._flowObfuscator33 = -7;
		}
		arg0.accessBits(this._flowObfuscator33);
		int var4 = arg0.gBit(8, 0);
		if (var4 < this.npcCount) {
			for (int var5 = var4; var5 < this.npcCount; var5++) {
				this.entityRemovalIds[this.entityRemovalCount++] = this.npcIds[var5];
			}
		}
		if (var4 > this.npcCount) {
			signlink.reporterror(this.username + " Too many npcs");
			throw new RuntimeException("eek");
		}
		this.npcCount = 0;
		for (int var6 = 0; var6 < var4; var6++) {
			int var7 = this.npcIds[var6];
			NpcEntity var8 = this.npcs[var7];
			int var9 = arg0.gBit(1, 0);
			if (var9 == 0) {
				this.npcIds[this.npcCount++] = var7;
				var8.cycle = loopCycle;
			} else {
				int var10 = arg0.gBit(2, 0);
				if (var10 == 0) {
					this.npcIds[this.npcCount++] = var7;
					var8.cycle = loopCycle;
					this.entityUpdateIds[this.entityUpdateCount++] = var7;
				} else if (var10 == 1) {
					this.npcIds[this.npcCount++] = var7;
					var8.cycle = loopCycle;
					int var11 = arg0.gBit(3, 0);
					var8.step(false, (byte) 20, var11);
					int var12 = arg0.gBit(1, 0);
					if (var12 == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = var7;
					}
				} else if (var10 == 2) {
					this.npcIds[this.npcCount++] = var7;
					var8.cycle = loopCycle;
					int var13 = arg0.gBit(3, 0);
					var8.step(true, (byte) 20, var13);
					int var14 = arg0.gBit(3, 0);
					var8.step(true, (byte) 20, var14);
					int var15 = arg0.gBit(1, 0);
					if (var15 == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = var7;
					}
				} else if (var10 == 3) {
					this.entityRemovalIds[this.entityRemovalCount++] = var7;
				}
			}
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void updateTitle(boolean arg0) {
		if (!arg0) {
			this.levelObjStacks = null;
		}
		if (this.titleScreenState == 0) {
			int var2 = super.screenWidth / 2 - 80;
			int var3 = super.screenHeight / 2 + 20;
			int var14 = var3 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var2 - 75 && super.mouseClickX <= var2 + 75 && super.mouseClickY >= var14 - 20 && super.mouseClickY <= var14 + 20) {
				this.titleScreenState = 3;
				this.titleLoginField = 0;
			}
			int var4 = super.screenWidth / 2 + 80;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var4 - 75 && super.mouseClickX <= var4 + 75 && super.mouseClickY >= var14 - 20 && super.mouseClickY <= var14 + 20) {
				this.loginMessage0 = "";
				this.loginMessage1 = "Enter your username & password.";
				this.titleScreenState = 2;
				this.titleLoginField = 0;
			}
		} else if (this.titleScreenState == 2) {
			int var5 = super.screenHeight / 2 - 40;
			int var15 = var5 + 30;
			int var16 = var15 + 25;
			if (super.mouseClickButton == 1 && super.mouseClickY >= var16 - 15 && super.mouseClickY < var16) {
				this.titleLoginField = 0;
			}
			var5 = var16 + 15;
			if (super.mouseClickButton == 1 && super.mouseClickY >= var5 - 15 && super.mouseClickY < var5) {
				this.titleLoginField = 1;
			}
			var5 += 15;
			int var6 = super.screenWidth / 2 - 80;
			int var7 = super.screenHeight / 2 + 50;
			int var17 = var7 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var6 - 75 && super.mouseClickX <= var6 + 75 && super.mouseClickY >= var17 - 20 && super.mouseClickY <= var17 + 20) {
				this.loginAttempts = 0;
				this.login(this.username, this.password, false);
				if (this.ingame) {
					return;
				}
			}
			int var8 = super.screenWidth / 2 + 80;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var8 - 75 && super.mouseClickX <= var8 + 75 && super.mouseClickY >= var17 - 20 && super.mouseClickY <= var17 + 20) {
				this.titleScreenState = 0;
				this.username = "";
				this.password = "";
			}
			while (true) {
				while (true) {
					int var9 = this.pollKey(-796);
					if (var9 == -1) {
						return;
					}
					boolean var10 = false;
					for (int var11 = 0; var11 < CHARSET.length(); var11++) {
						if (var9 == CHARSET.charAt(var11)) {
							var10 = true;
							break;
						}
					}
					if (this.titleLoginField == 0) {
						if (var9 == 8 && this.username.length() > 0) {
							this.username = this.username.substring(0, this.username.length() - 1);
						}
						if (var9 == 9 || var9 == 10 || var9 == 13) {
							this.titleLoginField = 1;
						}
						if (var10) {
							this.username = this.username + (char) var9;
						}
						if (this.username.length() > 12) {
							this.username = this.username.substring(0, 12);
						}
					} else if (this.titleLoginField == 1) {
						if (var9 == 8 && this.password.length() > 0) {
							this.password = this.password.substring(0, this.password.length() - 1);
						}
						if (var9 == 9 || var9 == 10 || var9 == 13) {
							this.titleLoginField = 0;
						}
						if (var10) {
							this.password = this.password + (char) var9;
						}
						if (this.password.length() > 20) {
							this.password = this.password.substring(0, 20);
						}
					}
				}
			}
		} else if (this.titleScreenState == 3) {
			int var12 = super.screenWidth / 2;
			int var13 = super.screenHeight / 2 + 50;
			int var18 = var13 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var12 - 75 && super.mouseClickX <= var12 + 75 && super.mouseClickY >= var18 - 20 && super.mouseClickY <= var18 + 20) {
				this.titleScreenState = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LCXGZMTJK;IIZ)V")
	public final void drawOnMinimap(Pix32 arg0, int arg1, int arg2, boolean arg3) {
		int var5 = this.minimapAnticheatAngle + this.orbitCameraYaw & 0x7FF;
		int var6 = arg1 * arg1 + arg2 * arg2;
		if (arg3 || var6 > 6400) {
			return;
		}
		int var7 = Model.sin[var5];
		int var8 = Model.cos[var5];
		int var9 = var7 * 256 / (this.minimapZoom + 256);
		int var10 = var8 * 256 / (this.minimapZoom + 256);
		int var11 = arg1 * var10 + arg2 * var9 >> 16;
		int var12 = arg2 * var10 - arg1 * var9 >> 16;
		if (var6 > 2500) {
			arg0.drawMasked(this.imageMapback, false, 83 - var12 - arg0.height / 2 - 4, var11 + 94 - arg0.width / 2 + 4);
		} else {
			arg0.draw(var11 + 94 - arg0.width / 2 + 4, 16083, 83 - var12 - arg0.height / 2 - 4);
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void addLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg7 < 4 || arg7 > 4) {
			this.packetType = this.in.g1();
		}
		if (arg4 < 1 || arg0 < 1 || arg4 > 102 || arg0 > 102) {
			return;
		}
		if (lowMemory && this.currentLevel != arg1) {
			return;
		}
		int var9 = 0;
		boolean var10 = true;
		boolean var11 = false;
		boolean var12 = false;
		if (arg5 == 0) {
			var9 = this.scene.getWallBitset(arg1, arg4, arg0);
		}
		if (arg5 == 1) {
			var9 = this.scene.getWallDecorationBitset(arg1, arg4, 0, arg0);
		}
		if (arg5 == 2) {
			var9 = this.scene.getLocBitset(arg1, arg4, arg0);
		}
		if (arg5 == 3) {
			var9 = this.scene.getGroundDecorationBitset(arg1, arg4, arg0);
		}
		if (var9 != 0) {
			int var13 = this.scene.getInfo(arg1, arg4, arg0, var9);
			int var14 = var9 >> 14 & 0x7FFF;
			int var15 = var13 & 0x1F;
			int var16 = var13 >> 6;
			if (arg5 == 0) {
				this.scene.removeWall(arg4, arg1, arg0, (byte) -119);
				LocType var17 = LocType.get(var14);
				if (var17.blockwalk) {
					this.levelCollisionMap[arg1].removeWall(var16, var15, var17.blockrange, true, arg4, arg0);
				}
			}
			if (arg5 == 1) {
				this.scene.removeWallDecoration(0, arg0, arg1, arg4);
			}
			if (arg5 == 2) {
				this.scene.removeLoc(arg1, -978, arg4, arg0);
				LocType var18 = LocType.get(var14);
				if (var18.width + arg4 > 103 || var18.width + arg0 > 103 || var18.length + arg4 > 103 || var18.length + arg0 > 103) {
					return;
				}
				if (var18.blockwalk) {
					this.levelCollisionMap[arg1].removeLoc(var16, var18.width, arg4, arg0, (byte) 6, var18.length, var18.blockrange);
				}
			}
			if (arg5 == 3) {
				this.scene.removeGroundDecoration((byte) 9, arg1, arg0, arg4);
				LocType var19 = LocType.get(var14);
				if (var19.blockwalk && var19.active) {
					this.levelCollisionMap[arg1].removeBlocked(360, arg0, arg4);
				}
			}
		}
		if (arg6 < 0) {
			return;
		}
		int var20 = arg1;
		if (arg1 < 3 && (this.levelTileFlags[1][arg4][arg0] & 0x2) == 2) {
			var20 = arg1 + 1;
		}
		World.addLoc(this.scene, arg2, arg0, arg3, var20, this.levelCollisionMap[arg1], this.levelHeightmap, arg4, arg6, arg1, (byte) 93);
		return;
	}

	@ObfuscatedName("client.b(ILMBMGIXGO;I)V")
	public final void readPlayerInfo(int arg0, Packet arg1, int arg2) {
		this.entityRemovalCount = 0;
		if (arg2 != 9759) {
			this.packetType = arg1.g1();
		}
		this.entityUpdateCount = 0;
		this.readLocalPlayer(arg1, arg0, (byte) 5);
		this.readPlayers((byte) 2, arg0, arg1);
		this.readNewPlayers(arg1, arg0, (byte) 8);
		this.readPlayerUpdates(arg0, (byte) 2, arg1);
		for (int var4 = 0; var4 < this.entityRemovalCount; var4++) {
			int var6 = this.entityRemovalIds[var4];
			if (loopCycle != this.players[var6].cycle) {
				this.players[var6] = null;
			}
		}
		if (arg1.pos != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.pos + " psize:" + arg0);
			throw new RuntimeException("eek");
		}
		for (int var5 = 0; var5 < this.playerCount; var5++) {
			if (this.players[this.playerIds[var5]] == null) {
				signlink.reporterror(this.username + " null entry in pl list - pos:" + var5 + " size:" + this.playerCount);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void orbitCamera(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = 2048 - arg2 & 0x7FF;
		int var9 = 2048 - arg5 & 0x7FF;
		int var10 = 0;
		int var11 = 0;
		int var12 = arg1;
		if (arg0 != 0) {
			this.load();
		}
		if (var8 != 0) {
			int var13 = Model.sin[var8];
			int var14 = Model.cos[var8];
			int var15 = var11 * var14 - arg1 * var13 >> 16;
			var12 = var11 * var13 + arg1 * var14 >> 16;
			var11 = var15;
		}
		if (var9 != 0) {
			int var16 = Model.sin[var9];
			int var17 = Model.cos[var9];
			int var18 = var10 * var17 + var12 * var16 >> 16;
			var12 = var12 * var17 - var10 * var16 >> 16;
			var10 = var18;
		}
		this.cameraX = arg3 - var10;
		this.cameraY = arg4 - var11;
		this.cameraZ = arg6 - var12;
		this.cameraPitch = arg2;
		this.cameraYaw = arg5;
	}

	@ObfuscatedName("client.p(Z)Z")
	public final boolean read(boolean arg0) {
		if (!arg0) {
			this.levelObjStacks = null;
		}
		if (this.stream == null) {
			return false;
		}
		try {
			int var2 = this.stream.available();
			if (var2 == 0) {
				return false;
			}
			if (this.packetType == -1) {
				this.stream.read(this.in.data, 0, 1);
				this.packetType = this.in.data[0] & 0xFF;
				if (this.randomIn != null) {
					this.packetType = this.packetType - this.randomIn.nextInt() & 0xFF;
				}
				this.packetSize = Protocol.serverProtSizes[this.packetType];
				var2--;
			}
			if (this.packetSize == -1) {
				if (var2 <= 0) {
					return false;
				}
				this.stream.read(this.in.data, 0, 1);
				this.packetSize = this.in.data[0] & 0xFF;
				var2--;
			}
			if (this.packetSize == -2) {
				if (var2 <= 1) {
					return false;
				}
				this.stream.read(this.in.data, 0, 2);
				this.in.pos = 0;
				this.packetSize = this.in.g2();
				var2 -= 2;
			}
			if (var2 < this.packetSize) {
				return false;
			}
			this.in.pos = 0;
			this.stream.read(this.in.data, 0, this.packetSize);
			this.idleNetCycles = 0;
			this.lastPacketType2 = this.lastPacketType1;
			this.lastPacketType1 = this.lastPacketType0;
			this.lastPacketType0 = this.packetType;
			if (this.packetType == 81) {
				this.readPlayerInfo(this.packetSize, this.in, 9759);
				this.awaitingSync = false;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 176) {
				this.daysSinceRecoveriesChanged = this.in.g1_alt2(false);
				this.unreadMessages = this.in.g2_alt2(true);
				this.warnMembersInNonMembers = this.in.g1();
				this.lastAddress = this.in.g4_alt3(true);
				this.daysSinceLastLogin = this.in.g2();
				if (this.lastAddress != 0 && this.viewportInterfaceId == -1) {
					signlink.dnslookup(JString.formatName(this.lastAddress, true));
					this.closeInterfaces(537);
					short var3 = 650;
					if (this.daysSinceRecoveriesChanged != 201 || this.warnMembersInNonMembers == 1) {
						var3 = 655;
					}
					this.reportAbuseInput = "";
					this.reportAbuseMuteOption = false;
					for (int var4 = 0; var4 < Component.instances.length; var4++) {
						if (Component.instances[var4] != null && Component.instances[var4].clientCode == var3) {
							this.viewportInterfaceId = Component.instances[var4].layer;
							break;
						}
					}
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 64) {
				this.baseX = this.in.g1_alt2(false);
				this.baseZ = this.in.g1_alt3(2);
				for (int var5 = this.baseX; var5 < this.baseX + 8; var5++) {
					for (int var6 = this.baseZ; var6 < this.baseZ + 8; var6++) {
						if (this.levelObjStacks[this.currentLevel][var5][var6] != null) {
							this.levelObjStacks[this.currentLevel][var5][var6] = null;
							this.sortObjStacks(var5, var6);
						}
					}
				}
				for (LocAddEntity var7 = (LocAddEntity) this.temporaryLocs.head(); var7 != null; var7 = (LocAddEntity) this.temporaryLocs.next(false)) {
					if (var7.localX >= this.baseX && var7.localX < this.baseX + 8 && var7.localZ >= this.baseZ && var7.localZ < this.baseZ + 8 && this.currentLevel == var7.level) {
						var7.duration = 0;
					}
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 185) {
				int var8 = this.in.g2_alt3((byte) -74);
				Component.instances[var8].modelType = 3;
				if (localPlayer.npc == null) {
					Component.instances[var8].model = (localPlayer.appearances[11] << 5) + (localPlayer.appearances[8] << 10) + (localPlayer.appearances[0] << 15) + (localPlayer.colors[0] << 25) + (localPlayer.colors[4] << 20) + localPlayer.appearances[1];
				} else {
					Component.instances[var8].model = (int) (localPlayer.npc.type + 305419896L);
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 107) {
				this.cutscene = false;
				for (int var9 = 0; var9 < 5; var9++) {
					this.cameraModifierEnabled[var9] = false;
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 72) {
				int var10 = this.in.g2_alt1((byte) 108);
				Component var11 = Component.instances[var10];
				for (int var12 = 0; var12 < var11.invSlotObjId.length; var12++) {
					var11.invSlotObjId[var12] = -1;
					var11.invSlotObjId[var12] = 0;
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 214) {
				this.ignoreCount = this.packetSize / 8;
				for (int var13 = 0; var13 < this.ignoreCount; var13++) {
					this.ignoreName37[var13] = this.in.g8(-35089);
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 166) {
				this.cutscene = true;
				this.cutsceneSrcLocalTileX = this.in.g1();
				this.cutsceneSrcLocalTileZ = this.in.g1();
				this.cutsceneSrcHeight = this.in.g2();
				this.cutsceneMoveSpeed = this.in.g1();
				this.cutsceneMoveAcceleration = this.in.g1();
				if (this.cutsceneMoveAcceleration >= 100) {
					this.cameraX = this.cutsceneSrcLocalTileX * 128 + 64;
					this.cameraZ = this.cutsceneSrcLocalTileZ * 128 + 64;
					this.cameraY = this.getHeightmapY(this.currentLevel, this.cameraZ, true, this.cameraX) - this.cutsceneSrcHeight;
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 134) {
				this.redrawSidebar = true;
				int var14 = this.in.g1();
				int var15 = this.in.g4_alt2((byte) 41);
				int var16 = this.in.g1();
				this.skillExperience[var14] = var15;
				this.skillLevel[var14] = var16;
				this.skillBaseLevel[var14] = 1;
				for (int var17 = 0; var17 < 98; var17++) {
					if (var15 >= levelExperience[var17]) {
						this.skillBaseLevel[var14] = var17 + 2;
					}
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 71) {
				int var18 = this.in.g2();
				int var19 = this.in.g1_alt1(0);
				if (var18 == 65535) {
					var18 = -1;
				}
				this.tabInterfaceId[var19] = var18;
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 74) {
				int var20 = this.in.g2_alt1((byte) 108);
				if (var20 == 65535) {
					var20 = -1;
				}
				if (this.nextMidiSong != var20 && this.midiActive && !lowMemory && this.nextMusicDelay == 0) {
					this.midiSong = var20;
					this.midiFading = true;
					this.ondemand.request(2, this.midiSong);
				}
				this.nextMidiSong = var20;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 121) {
				int var21 = this.in.g2_alt3((byte) -74);
				int var22 = this.in.g2_alt2(true);
				if (this.midiActive && !lowMemory) {
					this.midiSong = var21;
					this.midiFading = false;
					this.ondemand.request(2, this.midiSong);
					this.nextMusicDelay = var22;
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 109) {
				this.logout(true);
				this.packetType = -1;
				return false;
			}
			if (this.packetType == 70) {
				int var23 = this.in.g2b();
				int var24 = this.in.g2b_alt1(-665);
				int var25 = this.in.g2_alt1((byte) 108);
				Component var26 = Component.instances[var25];
				var26.x = var23;
				var26.y = var24;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 73 || this.packetType == 241) {
				int var27 = this.sceneCenterZoneX;
				int var28 = this.sceneCenterZoneZ;
				if (this.packetType == 73) {
					var27 = this.in.g2_alt2(true);
					var28 = this.in.g2();
					this.sceneInstanced = false;
				}
				if (this.packetType == 241) {
					var28 = this.in.g2_alt2(true);
					this.in.accessBits(this._flowObfuscator33);
					int var29 = 0;
					while (true) {
						if (var29 >= 4) {
							this.in.accessBytes(true);
							var27 = this.in.g2();
							this.sceneInstanced = true;
							break;
						}
						for (int var30 = 0; var30 < 13; var30++) {
							for (int var31 = 0; var31 < 13; var31++) {
								int var32 = this.in.gBit(1, 0);
								if (var32 == 1) {
									this.levelChunkBitset[var29][var30][var31] = this.in.gBit(26, 0);
								} else {
									this.levelChunkBitset[var29][var30][var31] = -1;
								}
							}
						}
						var29++;
					}
				}
				if (this.sceneCenterZoneX == var27 && this.sceneCenterZoneZ == var28 && this.sceneState == 2) {
					this.packetType = -1;
					return true;
				}
				this.sceneCenterZoneX = var27;
				this.sceneCenterZoneZ = var28;
				this.sceneBaseTileX = (this.sceneCenterZoneX - 6) * 8;
				this.sceneBaseTileZ = (this.sceneCenterZoneZ - 6) * 8;
				this.withinTutorialIsland = false;
				if ((this.sceneCenterZoneX / 8 == 48 || this.sceneCenterZoneX / 8 == 49) && this.sceneCenterZoneZ / 8 == 48) {
					this.withinTutorialIsland = true;
				}
				if (this.sceneCenterZoneX / 8 == 48 && this.sceneCenterZoneZ / 8 == 148) {
					this.withinTutorialIsland = true;
				}
				this.sceneState = 1;
				this.sceneLoadStartTime = System.currentTimeMillis();
				this.areaViewport.bind(0);
				this.fontPlain12.drawStringCenter(0, "Loading - please wait.", 23693, 151, 257);
				this.fontPlain12.drawStringCenter(16777215, "Loading - please wait.", 23693, 150, 256);
				this.areaViewport.draw(4, 23680, super.graphics, 4);
				if (this.packetType == 73) {
					int var33 = 0;
					int var34 = (this.sceneCenterZoneX - 6) / 8;
					label1094: while (true) {
						if (var34 > (this.sceneCenterZoneX + 6) / 8) {
							this.sceneMapLandData = new byte[var33][];
							this.sceneMapLocData = new byte[var33][];
							this.sceneMapIndex = new int[var33];
							this.sceneMapLandFile = new int[var33];
							this.sceneMapLocFile = new int[var33];
							int var36 = 0;
							int var37 = (this.sceneCenterZoneX - 6) / 8;
							while (true) {
								if (var37 > (this.sceneCenterZoneX + 6) / 8) {
									break label1094;
								}
								for (int var38 = (this.sceneCenterZoneZ - 6) / 8; var38 <= (this.sceneCenterZoneZ + 6) / 8; var38++) {
									this.sceneMapIndex[var36] = (var37 << 8) + var38;
									if (this.withinTutorialIsland && (var38 == 49 || var38 == 149 || var38 == 147 || var37 == 50 || var37 == 49 && var38 == 47)) {
										this.sceneMapLandFile[var36] = -1;
										this.sceneMapLocFile[var36] = -1;
										var36++;
									} else {
										int var39 = this.sceneMapLandFile[var36] = this.ondemand.getMapFile(0, 0, var38, var37);
										if (var39 != -1) {
											this.ondemand.request(3, var39);
										}
										int var40 = this.sceneMapLocFile[var36] = this.ondemand.getMapFile(1, 0, var38, var37);
										if (var40 != -1) {
											this.ondemand.request(3, var40);
										}
										var36++;
									}
								}
								var37++;
							}
						}
						for (int var35 = (this.sceneCenterZoneZ - 6) / 8; var35 <= (this.sceneCenterZoneZ + 6) / 8; var35++) {
							var33++;
						}
						var34++;
					}
				}
				if (this.packetType == 241) {
					int var41 = 0;
					int[] var42 = new int[676];
					int var43 = 0;
					label1053: while (true) {
						if (var43 >= 4) {
							this.sceneMapLandData = new byte[var41][];
							this.sceneMapLocData = new byte[var41][];
							this.sceneMapIndex = new int[var41];
							this.sceneMapLandFile = new int[var41];
							this.sceneMapLocFile = new int[var41];
							int var51 = 0;
							while (true) {
								if (var51 >= var41) {
									break label1053;
								}
								int var52 = this.sceneMapIndex[var51] = var42[var51];
								int var53 = var52 >> 8 & 0xFF;
								int var54 = var52 & 0xFF;
								int var55 = this.sceneMapLandFile[var51] = this.ondemand.getMapFile(0, 0, var54, var53);
								if (var55 != -1) {
									this.ondemand.request(3, var55);
								}
								int var56 = this.sceneMapLocFile[var51] = this.ondemand.getMapFile(1, 0, var54, var53);
								if (var56 != -1) {
									this.ondemand.request(3, var56);
								}
								var51++;
							}
						}
						for (int var44 = 0; var44 < 13; var44++) {
							for (int var45 = 0; var45 < 13; var45++) {
								int var46 = this.levelChunkBitset[var43][var44][var45];
								if (var46 != -1) {
									int var47 = var46 >> 14 & 0x3FF;
									int var48 = var46 >> 3 & 0x7FF;
									int var49 = (var47 / 8 << 8) + var48 / 8;
									for (int var50 = 0; var50 < var41; var50++) {
										if (var42[var50] == var49) {
											var49 = -1;
											break;
										}
									}
									if (var49 != -1) {
										var42[var41++] = var49;
									}
								}
							}
						}
						var43++;
					}
				}
				int var57 = this.sceneBaseTileX - this.scenePrevBaseTileX;
				int var58 = this.sceneBaseTileZ - this.scenePrevBaseTileZ;
				this.scenePrevBaseTileX = this.sceneBaseTileX;
				this.scenePrevBaseTileZ = this.sceneBaseTileZ;
				for (int var59 = 0; var59 < 16384; var59++) {
					NpcEntity var60 = this.npcs[var59];
					if (var60 != null) {
						for (int var61 = 0; var61 < 10; var61++) {
							var60.pathTileX[var61] -= var57;
							var60.pathTileZ[var61] -= var58;
						}
						var60.x -= var57 * 128;
						var60.z -= var58 * 128;
					}
				}
				for (int var62 = 0; var62 < this.MAX_PLAYER_COUNT; var62++) {
					PlayerEntity var63 = this.players[var62];
					if (var63 != null) {
						for (int var64 = 0; var64 < 10; var64++) {
							var63.pathTileX[var64] -= var57;
							var63.pathTileZ[var64] -= var58;
						}
						var63.x -= var57 * 128;
						var63.z -= var58 * 128;
					}
				}
				this.awaitingSync = true;
				byte var65 = 0;
				byte var66 = 104;
				byte var67 = 1;
				if (var57 < 0) {
					var65 = 103;
					var66 = -1;
					var67 = -1;
				}
				byte var68 = 0;
				byte var69 = 104;
				byte var70 = 1;
				if (var58 < 0) {
					var68 = 103;
					var69 = -1;
					var70 = -1;
				}
				for (int var71 = var65; var71 != var66; var71 += var67) {
					for (int var72 = var68; var72 != var69; var72 += var70) {
						int var73 = var57 + var71;
						int var74 = var58 + var72;
						for (int var75 = 0; var75 < 4; var75++) {
							if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
								this.levelObjStacks[var75][var71][var72] = this.levelObjStacks[var75][var73][var74];
							} else {
								this.levelObjStacks[var75][var71][var72] = null;
							}
						}
					}
				}
				for (LocAddEntity var76 = (LocAddEntity) this.temporaryLocs.head(); var76 != null; var76 = (LocAddEntity) this.temporaryLocs.next(false)) {
					var76.localX -= var57;
					var76.localZ -= var58;
					if (var76.localX < 0 || var76.localZ < 0 || var76.localX >= 104 || var76.localZ >= 104) {
						var76.unlink();
					}
				}
				if (this.flagSceneTileX != 0) {
					this.flagSceneTileX -= var57;
					this.flagSceneTileZ -= var58;
				}
				this.cutscene = false;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 208) {
				int var77 = this.in.g2b_alt1(-665);
				if (var77 >= 0) {
					this.resetInterfaceAnimation(var77, (byte) 6);
				}
				this.viewportOverlayInterfaceId = var77;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 99) {
				this.minimapState = this.in.g1();
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 75) {
				int var78 = this.in.g2_alt3((byte) -74);
				int var79 = this.in.g2_alt3((byte) -74);
				Component.instances[var79].modelType = 2;
				Component.instances[var79].model = var78;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 114) {
				this.systemUpdateTimer = this.in.g2_alt1((byte) 108) * 30;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 60) {
				this.baseZ = this.in.g1();
				this.baseX = this.in.g1_alt2(false);
				while (this.in.pos < this.packetSize) {
					int var80 = this.in.g1();
					this.readZonePacket(this._flowObfuscator34, this.in, var80);
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 35) {
				int var81 = this.in.g1();
				int var82 = this.in.g1();
				int var83 = this.in.g1();
				int var84 = this.in.g1();
				this.cameraModifierEnabled[var81] = true;
				this.cameraModifierJitter[var81] = var82;
				this.cameraModifierWobbleScale[var81] = var83;
				this.cameraModifierWobbleSpeed[var81] = var84;
				this.cameraModifierCycle[var81] = 0;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 174) {
				int var85 = this.in.g2();
				int var86 = this.in.g1();
				int var87 = this.in.g2();
				if (this.waveEnabled && !lowMemory && this.waveCount < 50) {
					this.waveIds[this.waveCount] = var85;
					this.waveLoops[this.waveCount] = var86;
					this.waveDelay[this.waveCount] = Wave.delays[var85] + var87;
					this.waveCount++;
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 104) {
				int var88 = this.in.g1_alt2(false);
				int var89 = this.in.g1_alt1(0);
				String var90 = this.in.gjstr();
				if (var88 >= 1 && var88 <= 5) {
					if (var90.equalsIgnoreCase("null")) {
						var90 = null;
					}
					this.playerOptions[var88 - 1] = var90;
					this.playerOptionPushDown[var88 - 1] = var89 == 0;
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 78) {
				this.flagSceneTileX = 0;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 253) {
				String var91 = this.in.gjstr();
				if (var91.endsWith(":tradereq:")) {
					String var92 = var91.substring(0, var91.indexOf(":"));
					long var93 = JString.toBase37(var92);
					boolean var95 = false;
					for (int var96 = 0; var96 < this.ignoreCount; var96++) {
						if (this.ignoreName37[var96] == var93) {
							var95 = true;
							break;
						}
					}
					if (!var95 && this.overrideChat == 0) {
						this.addMessage("wishes to trade with you.", 4, var92, this._flowObfuscator21);
					}
				} else if (var91.endsWith(":duelreq:")) {
					String var97 = var91.substring(0, var91.indexOf(":"));
					long var98 = JString.toBase37(var97);
					boolean var100 = false;
					for (int var101 = 0; var101 < this.ignoreCount; var101++) {
						if (this.ignoreName37[var101] == var98) {
							var100 = true;
							break;
						}
					}
					if (!var100 && this.overrideChat == 0) {
						this.addMessage("wishes to duel with you.", 8, var97, this._flowObfuscator21);
					}
				} else if (var91.endsWith(":chalreq:")) {
					String var102 = var91.substring(0, var91.indexOf(":"));
					long var103 = JString.toBase37(var102);
					boolean var105 = false;
					for (int var106 = 0; var106 < this.ignoreCount; var106++) {
						if (this.ignoreName37[var106] == var103) {
							var105 = true;
							break;
						}
					}
					if (!var105 && this.overrideChat == 0) {
						String var107 = var91.substring(var91.indexOf(":") + 1, var91.length() - 9);
						this.addMessage(var107, 8, var102, this._flowObfuscator21);
					}
				} else {
					this.addMessage(var91, 0, "", this._flowObfuscator21);
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 1) {
				for (int var108 = 0; var108 < this.players.length; var108++) {
					if (this.players[var108] != null) {
						this.players[var108].primarySeqId = -1;
					}
				}
				for (int var109 = 0; var109 < this.npcs.length; var109++) {
					if (this.npcs[var109] != null) {
						this.npcs[var109].primarySeqId = -1;
					}
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 50) {
				long var110 = this.in.g8(-35089);
				int var112 = this.in.g1();
				String var113 = JString.toSentenceCase(-45804, JString.fromBase37(var110, (byte) -99));
				for (int var114 = 0; var114 < this.friendCount; var114++) {
					if (this.friendName37[var114] == var110) {
						if (this.friendWorld[var114] != var112) {
							this.friendWorld[var114] = var112;
							this.redrawSidebar = true;
							if (var112 > 0) {
								this.addMessage(var113 + " has logged in.", 5, "", this._flowObfuscator21);
							}
							if (var112 == 0) {
								this.addMessage(var113 + " has logged out.", 5, "", this._flowObfuscator21);
							}
						}
						var113 = null;
						break;
					}
				}
				if (var113 != null && this.friendCount < 200) {
					this.friendName37[this.friendCount] = var110;
					this.friendName[this.friendCount] = var113;
					this.friendWorld[this.friendCount] = var112;
					this.friendCount++;
					this.redrawSidebar = true;
				}
				boolean var115 = false;
				while (!var115) {
					var115 = true;
					for (int var116 = 0; var116 < this.friendCount - 1; var116++) {
						if (this.friendWorld[var116] != nodeId && this.friendWorld[var116 + 1] == nodeId || this.friendWorld[var116] == 0 && this.friendWorld[var116 + 1] != 0) {
							int var117 = this.friendWorld[var116];
							this.friendWorld[var116] = this.friendWorld[var116 + 1];
							this.friendWorld[var116 + 1] = var117;
							String var118 = this.friendName[var116];
							this.friendName[var116] = this.friendName[var116 + 1];
							this.friendName[var116 + 1] = var118;
							long var119 = this.friendName37[var116];
							this.friendName37[var116] = this.friendName37[var116 + 1];
							this.friendName37[var116 + 1] = var119;
							this.redrawSidebar = true;
							var115 = false;
						}
					}
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 110) {
				if (this.selectedTab == 12) {
					this.redrawSidebar = true;
				}
				this.energy = this.in.g1();
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 254) {
				this.hintType = this.in.g1();
				if (this.hintType == 1) {
					this.hintNpc = this.in.g2();
				}
				if (this.hintType >= 2 && this.hintType <= 6) {
					if (this.hintType == 2) {
						this.hintOffsetX = 64;
						this.hintOffsetZ = 64;
					}
					if (this.hintType == 3) {
						this.hintOffsetX = 0;
						this.hintOffsetZ = 64;
					}
					if (this.hintType == 4) {
						this.hintOffsetX = 128;
						this.hintOffsetZ = 64;
					}
					if (this.hintType == 5) {
						this.hintOffsetX = 64;
						this.hintOffsetZ = 0;
					}
					if (this.hintType == 6) {
						this.hintOffsetX = 64;
						this.hintOffsetZ = 128;
					}
					this.hintType = 2;
					this.hintTileX = this.in.g2();
					this.hintTileZ = this.in.g2();
					this.hintHeight = this.in.g1();
				}
				if (this.hintType == 10) {
					this.hintPlayer = this.in.g2();
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 248) {
				int var121 = this.in.g2_alt2(true);
				int var122 = this.in.g2();
				if (this.chatInterfaceId != -1) {
					this.chatInterfaceId = -1;
					this.redrawChatback = true;
				}
				if (this.chatbackInputOpen != 0) {
					this.chatbackInputOpen = 0;
					this.redrawChatback = true;
				}
				this.viewportInterfaceId = var121;
				this.sidebarInterfaceId = var122;
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.pressedContinueOption = false;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 79) {
				int var123 = this.in.g2_alt1((byte) 108);
				int var124 = this.in.g2_alt2(true);
				Component var125 = Component.instances[var123];
				if (var125 != null && var125.type == 0) {
					if (var124 < 0) {
						var124 = 0;
					}
					if (var124 > var125.scroll - var125.height) {
						var124 = var125.scroll - var125.height;
					}
					var125.scrollPosition = var124;
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 68) {
				for (int var126 = 0; var126 < this.varps.length; var126++) {
					if (this.varCache[var126] != this.varps[var126]) {
						this.varps[var126] = this.varCache[var126];
						this.updateVarp(false, var126);
						this.redrawSidebar = true;
					}
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 196) {
				long var127 = this.in.g8(-35089);
				int var129 = this.in.g4();
				int var130 = this.in.g1();
				boolean var131 = false;
				for (int var132 = 0; var132 < 100; var132++) {
					if (this.messageIds[var132] == var129) {
						var131 = true;
						break;
					}
				}
				if (var130 <= 1) {
					for (int var133 = 0; var133 < this.ignoreCount; var133++) {
						if (this.ignoreName37[var133] == var127) {
							var131 = true;
							break;
						}
					}
				}
				if (!var131 && this.overrideChat == 0) {
					try {
						this.messageIds[this.privateMessageCount] = var129;
						this.privateMessageCount = (this.privateMessageCount + 1) % 100;
						String var134 = WordPack.unpack(this.packetSize - 13, true, this.in);
						if (var130 != 3) {
							var134 = WordFilter.filter(var134, 0);
						}
						if (var130 == 2 || var130 == 3) {
							this.addMessage(var134, 7, "@cr2@" + JString.toSentenceCase(-45804, JString.fromBase37(var127, (byte) -99)), this._flowObfuscator21);
						} else if (var130 == 1) {
							this.addMessage(var134, 7, "@cr1@" + JString.toSentenceCase(-45804, JString.fromBase37(var127, (byte) -99)), this._flowObfuscator21);
						} else {
							this.addMessage(var134, 3, JString.toSentenceCase(-45804, JString.fromBase37(var127, (byte) -99)), this._flowObfuscator21);
						}
					} catch (Exception var187) {
						signlink.reporterror("cde1");
					}
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 85) {
				this.baseZ = this.in.g1_alt2(false);
				this.baseX = this.in.g1_alt2(false);
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 24) {
				this.flashingTab = this.in.g1_alt3(2);
				if (this.selectedTab == this.flashingTab) {
					if (this.flashingTab == 3) {
						this.selectedTab = 1;
					} else {
						this.selectedTab = 3;
					}
					this.redrawSidebar = true;
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 246) {
				int var136 = this.in.g2_alt1((byte) 108);
				int var137 = this.in.g2();
				int var138 = this.in.g2();
				if (var138 == 65535) {
					Component.instances[var136].modelType = 0;
					this.packetType = -1;
					return true;
				}
				ObjType var139 = ObjType.get(var138);
				Component.instances[var136].modelType = 4;
				Component.instances[var136].model = var138;
				Component.instances[var136].xan = var139.xan2d;
				Component.instances[var136].yan = var139.yan2d;
				Component.instances[var136].zoom = var139.zoom2d * 100 / var137;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 171) {
				boolean var140 = this.in.g1() == 1;
				int var141 = this.in.g2();
				Component.instances[var141].hide = var140;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 142) {
				int var142 = this.in.g2_alt1((byte) 108);
				this.resetInterfaceAnimation(var142, (byte) 6);
				if (this.chatInterfaceId != -1) {
					this.chatInterfaceId = -1;
					this.redrawChatback = true;
				}
				if (this.chatbackInputOpen != 0) {
					this.chatbackInputOpen = 0;
					this.redrawChatback = true;
				}
				this.sidebarInterfaceId = var142;
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.viewportInterfaceId = -1;
				this.pressedContinueOption = false;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 126) {
				String var143 = this.in.gjstr();
				int var144 = this.in.g2_alt2(true);
				Component.instances[var144].text = var143;
				if (this.tabInterfaceId[this.selectedTab] == Component.instances[var144].layer) {
					this.redrawSidebar = true;
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 206) {
				this.publicChatSetting = this.in.g1();
				this.privateChatSetting = this.in.g1();
				this.tradeChatSetting = this.in.g1();
				this.redrawPrivacySettings = true;
				this.redrawChatback = true;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 240) {
				if (this.selectedTab == 12) {
					this.redrawSidebar = true;
				}
				this.weightCarried = this.in.g2b();
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 8) {
				int var145 = this.in.g2_alt3((byte) -74);
				int var146 = this.in.g2();
				Component.instances[var145].modelType = 1;
				Component.instances[var145].model = var146;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 122) {
				int var147 = this.in.g2_alt3((byte) -74);
				int var148 = this.in.g2_alt3((byte) -74);
				int var149 = var148 >> 10 & 0x1F;
				int var150 = var148 >> 5 & 0x1F;
				int var151 = var148 & 0x1F;
				Component.instances[var147].colour = (var151 << 3) + (var149 << 19) + (var150 << 11);
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 53) {
				this.redrawSidebar = true;
				int var152 = this.in.g2();
				Component var153 = Component.instances[var152];
				int var154 = this.in.g2();
				for (int var155 = 0; var155 < var154; var155++) {
					int var156 = this.in.g1();
					if (var156 == 255) {
						var156 = this.in.g4_alt3(true);
					}
					var153.invSlotObjId[var155] = this.in.g2_alt3((byte) -74);
					var153.invSlotObjCount[var155] = var156;
				}
				for (int var157 = var154; var157 < var153.invSlotObjId.length; var157++) {
					var153.invSlotObjId[var157] = 0;
					var153.invSlotObjCount[var157] = 0;
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 230) {
				int var158 = this.in.g2_alt2(true);
				int var159 = this.in.g2();
				int var160 = this.in.g2();
				int var161 = this.in.g2_alt3((byte) -74);
				Component.instances[var159].xan = var160;
				Component.instances[var159].yan = var161;
				Component.instances[var159].zoom = var158;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 221) {
				this.friendListStatus = this.in.g1();
				this.redrawSidebar = true;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 177) {
				this.cutscene = true;
				this.cutsceneDstLocalTileX = this.in.g1();
				this.cutsceneDstLocalTileZ = this.in.g1();
				this.cutsceneDstHeight = this.in.g2();
				this.cutsceneRotateSpeed = this.in.g1();
				this.cutsceneRotateAcceleration = this.in.g1();
				if (this.cutsceneRotateAcceleration >= 100) {
					int var162 = this.cutsceneDstLocalTileX * 128 + 64;
					int var163 = this.cutsceneDstLocalTileZ * 128 + 64;
					int var164 = this.getHeightmapY(this.currentLevel, var163, true, var162) - this.cutsceneDstHeight;
					int var165 = var162 - this.cameraX;
					int var166 = var164 - this.cameraY;
					int var167 = var163 - this.cameraZ;
					int var168 = (int) Math.sqrt((double) (var165 * var165 + var167 * var167));
					this.cameraPitch = (int) (Math.atan2((double) var166, (double) var168) * 325.949D) & 0x7FF;
					this.cameraYaw = (int) (Math.atan2((double) var165, (double) var167) * -325.949D) & 0x7FF;
					if (this.cameraPitch < 128) {
						this.cameraPitch = 128;
					}
					if (this.cameraPitch > 383) {
						this.cameraPitch = 383;
					}
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 249) {
				this.isMember = this.in.g1_alt1(0);
				this.localPid = this.in.g2_alt3((byte) -74);
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 65) {
				this.readNpcInfo(this.in, this.packetSize, 973);
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 27) {
				this.showSocialInput = false;
				this.chatbackInputOpen = 1;
				this.chatbackInput = "";
				this.redrawChatback = true;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 187) {
				this.showSocialInput = false;
				this.chatbackInputOpen = 2;
				this.chatbackInput = "";
				this.redrawChatback = true;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 97) {
				int var169 = this.in.g2();
				this.resetInterfaceAnimation(var169, (byte) 6);
				if (this.sidebarInterfaceId != -1) {
					this.sidebarInterfaceId = -1;
					this.redrawSidebar = true;
					this.redrawSideicons = true;
				}
				if (this.chatInterfaceId != -1) {
					this.chatInterfaceId = -1;
					this.redrawChatback = true;
				}
				if (this.chatbackInputOpen != 0) {
					this.chatbackInputOpen = 0;
					this.redrawChatback = true;
				}
				this.viewportInterfaceId = var169;
				this.pressedContinueOption = false;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 218) {
				int var170 = this.in.g2b_alt3(false);
				this.stickyChatInterfaceId = var170;
				this.redrawChatback = true;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 87) {
				int var171 = this.in.g2_alt1((byte) 108);
				int var172 = this.in.g4_alt2((byte) 41);
				this.varCache[var171] = var172;
				if (this.varps[var171] != var172) {
					this.varps[var171] = var172;
					this.updateVarp(false, var171);
					this.redrawSidebar = true;
					if (this.stickyChatInterfaceId != -1) {
						this.redrawChatback = true;
					}
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 36) {
				int var173 = this.in.g2_alt1((byte) 108);
				byte var174 = this.in.g1b();
				this.varCache[var173] = var174;
				if (this.varps[var173] != var174) {
					this.varps[var173] = var174;
					this.updateVarp(false, var173);
					this.redrawSidebar = true;
					if (this.stickyChatInterfaceId != -1) {
						this.redrawChatback = true;
					}
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 61) {
				this.inMultizone = this.in.g1();
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 200) {
				int var175 = this.in.g2();
				int var176 = this.in.g2b();
				Component var177 = Component.instances[var175];
				var177.anim = var176;
				if (var176 == -1) {
					var177.animFrame = 0;
					var177.animCycle = 0;
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 219) {
				if (this.sidebarInterfaceId != -1) {
					this.sidebarInterfaceId = -1;
					this.redrawSidebar = true;
					this.redrawSideicons = true;
				}
				if (this.chatInterfaceId != -1) {
					this.chatInterfaceId = -1;
					this.redrawChatback = true;
				}
				if (this.chatbackInputOpen != 0) {
					this.chatbackInputOpen = 0;
					this.redrawChatback = true;
				}
				this.viewportInterfaceId = -1;
				this.pressedContinueOption = false;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 34) {
				this.redrawSidebar = true;
				int var178 = this.in.g2();
				Component var179 = Component.instances[var178];
				while (this.in.pos < this.packetSize) {
					int var180 = this.in.gsmarts();
					int var181 = this.in.g2();
					int var182 = this.in.g1();
					if (var182 == 255) {
						var182 = this.in.g4();
					}
					if (var180 >= 0 && var180 < var179.invSlotObjId.length) {
						var179.invSlotObjId[var180] = var181;
						var179.invSlotObjCount[var180] = var182;
					}
				}
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 105 || this.packetType == 84 || this.packetType == 147 || this.packetType == 215 || this.packetType == 4 || this.packetType == 117 || this.packetType == 156 || this.packetType == 44 || this.packetType == 160 || this.packetType == 101 || this.packetType == 151) {
				this.readZonePacket(this._flowObfuscator34, this.in, this.packetType);
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 106) {
				this.selectedTab = this.in.g1_alt2(false);
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.packetType = -1;
				return true;
			}
			if (this.packetType == 164) {
				int var183 = this.in.g2_alt1((byte) 108);
				this.resetInterfaceAnimation(var183, (byte) 6);
				if (this.sidebarInterfaceId != -1) {
					this.sidebarInterfaceId = -1;
					this.redrawSidebar = true;
					this.redrawSideicons = true;
				}
				this.chatInterfaceId = var183;
				this.redrawChatback = true;
				this.viewportInterfaceId = -1;
				this.pressedContinueOption = false;
				this.packetType = -1;
				return true;
			}
			signlink.reporterror("T1 - " + this.packetType + "," + this.packetSize + " - " + this.lastPacketType1 + "," + this.lastPacketType2);
			this.logout(true);
		} catch (IOException var188) {
			this.tryReconnect(-670);
		} catch (Exception var189) {
			String var185 = "T2 - " + this.packetType + "," + this.lastPacketType1 + "," + this.lastPacketType2 + " - " + this.packetSize + "," + (localPlayer.pathTileX[0] + this.sceneBaseTileX) + "," + (localPlayer.pathTileZ[0] + this.sceneBaseTileZ) + " - ";
			for (int var186 = 0; var186 < this.packetSize && var186 < 50; var186++) {
				var185 = var185 + this.in.data[var186] + ",";
			}
			signlink.reporterror(var185);
			this.logout(true);
		}
		return true;
	}

	@ObfuscatedName("client.n(B)V")
	public final void drawScene(byte arg0) {
		this.sceneCycle++;
		this.pushPlayers(0, true);
		this.pushNpcs(true, this._flowObfuscator11);
		this.pushPlayers(0, false);
		this.pushNpcs(false, this._flowObfuscator11);
		this.pushProjectiles(-948);
		this.pushSpotanims(true);
		if (!this.cutscene) {
			int var2 = this.orbitCameraPitch;
			if (this.cameraPitchClamp / 256 > var2) {
				var2 = this.cameraPitchClamp / 256;
			}
			if (this.cameraModifierEnabled[4] && this.cameraModifierWobbleScale[4] + 128 > var2) {
				var2 = this.cameraModifierWobbleScale[4] + 128;
			}
			int var3 = this.orbitCameraYaw + this.cameraAnticheatAngle & 0x7FF;
			this.orbitCamera(0, var2 * 3 + 600, var2, this.orbitCameraX, this.getHeightmapY(this.currentLevel, localPlayer.z, true, localPlayer.x) - 50, var3, this.orbitCameraZ);
		}
		int var4;
		if (this.cutscene) {
			var4 = this.getTopLevelCutscene(this._flowObfuscator28);
		} else {
			var4 = this.getTopLevel(111);
		}
		int var5 = this.cameraX;
		int var6 = this.cameraY;
		int var7 = this.cameraZ;
		int var8 = this.cameraPitch;
		int var9 = this.cameraYaw;
		for (int var10 = 0; var10 < 5; var10++) {
			if (this.cameraModifierEnabled[var10]) {
				int var12 = (int) (Math.random() * (double) (this.cameraModifierJitter[var10] * 2 + 1) - (double) this.cameraModifierJitter[var10] + Math.sin((double) this.cameraModifierWobbleSpeed[var10] / 100.0D * (double) this.cameraModifierCycle[var10]) * (double) this.cameraModifierWobbleScale[var10]);
				if (var10 == 0) {
					this.cameraX += var12;
				}
				if (var10 == 1) {
					this.cameraY += var12;
				}
				if (var10 == 2) {
					this.cameraZ += var12;
				}
				if (var10 == 3) {
					this.cameraYaw = this.cameraYaw + var12 & 0x7FF;
				}
				if (var10 == 4) {
					this.cameraPitch += var12;
					if (this.cameraPitch < 128) {
						this.cameraPitch = 128;
					}
					if (this.cameraPitch > 383) {
						this.cameraPitch = 383;
					}
				}
			}
		}
		int var11 = Pix3D.cycle;
		Model.checkHover = true;
		if (arg0 != 1) {
			return;
		}
		Model.pickedCount = 0;
		Model.mouseX = super.mouseX - 4;
		Model.mouseY = super.mouseY - 4;
		Pix2D.clear(this._flowObfuscator38);
		this.scene.draw(this.cameraX, this.cameraZ, this.cameraYaw, this.cameraY, var4, this.cameraPitch, false);
		this.scene.clearTemporaryLocs((byte) 104);
		this.draw2DEntityElements(this._flowObfuscator13);
		this.drawTileHint(-252);
		this.updateTextures(854, var11);
		this.draw3DEntityElements(8);
		this.areaViewport.draw(4, 23680, super.graphics, 4);
		this.cameraX = var5;
		this.cameraY = var6;
		this.cameraZ = var7;
		this.cameraPitch = var8;
		this.cameraYaw = var9;
	}

	@ObfuscatedName("client.M(I)V")
	public final void closeInterfaces(int arg0) {
		this.out.p1isaac((byte) 6, 130);
		if (this.sidebarInterfaceId != -1) {
			this.sidebarInterfaceId = -1;
			this.redrawSidebar = true;
			this.pressedContinueOption = false;
			this.redrawSideicons = true;
		}
		if (this.chatInterfaceId != -1) {
			this.chatInterfaceId = -1;
			this.redrawChatback = true;
			this.pressedContinueOption = false;
		}
		this.viewportInterfaceId = -1;
		if (arg0 <= 0) {
			this.out.p1(13);
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var4 = var1 + 1;
			int var5 = (int) ((double) var4 + Math.pow(2.0D, (double) var4 / 7.0D) * 300.0D);
			var0 += var5;
			levelExperience[var1] = var0 / 4;
		}
		RSA_EXPONENT = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		_flowObfuscator29 = -192;
		CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		_flowObfuscator37 = 9;
		DESIGN_HAIR_COLOR = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		_flowObfuscator41 = true;
		BITMASK = new int[32];
		int var2 = 2;
		for (int var3 = 0; var3 < 32; var3++) {
			BITMASK[var3] = var2 - 1;
			var2 += var2;
		}
	}
}

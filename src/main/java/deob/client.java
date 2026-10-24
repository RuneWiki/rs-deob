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

@ObfuscatedName("client")
public final class client extends GameShell {

	@ObfuscatedName("client.L")
	public int[][] bfsCost = new int[104][104];

	@ObfuscatedName("client.M")
	public int[] friendWorld = new int[200];

	@ObfuscatedName("client.N")
	public LinkList[][][] levelObjStacks = new LinkList[4][104][104];

	@ObfuscatedName("client.R")
	public volatile boolean flameActive = false;

	@ObfuscatedName("client.U")
	public Packet chatBuffer = new Packet(new byte[5000]);

	@ObfuscatedName("client.V")
	public NpcEntity[] npcs = new NpcEntity[16384];

	@ObfuscatedName("client.X")
	public int[] npcIds = new int[16384];

	@ObfuscatedName("client.ab")
	public int[] entityRemovalIds = new int[1000];

	@ObfuscatedName("client.hb")
	public Packet login = Packet.alloc(1);

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

	@ObfuscatedName("client.Kb")
	public boolean[] cameraModifierEnabled = new boolean[5];

	@ObfuscatedName("client.Ob")
	public volatile boolean flamesThread = false;

	@ObfuscatedName("client.Pb")
	public String reportAbuseInput = "";

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
	public PlayerEntity[] players = new PlayerEntity[MAX_PLAYER_COUNT];

	@ObfuscatedName("client.ac")
	public int[] playerIds = new int[MAX_PLAYER_COUNT];

	@ObfuscatedName("client.cc")
	public int[] entityUpdateIds = new int[MAX_PLAYER_COUNT];

	@ObfuscatedName("client.dc")
	public Packet[] playerAppearanceBuffer = new Packet[MAX_PLAYER_COUNT];

	@ObfuscatedName("client.fc")
	public int cameraOffsetYawModifier = 1;

	@ObfuscatedName("client.jc")
	public int[][] bfsDirection = new int[104][104];

	@ObfuscatedName("client.kc")
	public int SCROLLBAR_GRIP_HIGHLIGHT = 0x766654;

	@ObfuscatedName("client.uc")
	public byte[] textureBuffer = new byte[16384];

	@ObfuscatedName("client.Ec")
	public int[] skillLevel = new int[Stats.count];

	@ObfuscatedName("client.Hc")
	public long[] ignoreName37 = new long[100];

	@ObfuscatedName("client.Ic")
	public boolean errorLoading = false;

	@ObfuscatedName("client.Jc")
	public int SCROLLBAR_GRIP_LOWLIGHT = 0x332D25;

	@ObfuscatedName("client.Kc")
	public int[] cameraModifierWobbleSpeed = new int[5];

	@ObfuscatedName("client.Lc")
	public int[][] tileLastOccupiedCycle = new int[104][104];

	@ObfuscatedName("client.Mc")
	public CRC32 crc32 = new CRC32();

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
	public int[] CHAT_COLORS = new int[] { 0xFFFF00, 0xFF0000, 0xFF00, 0xFFFF, 0xFF00FF, 0xFFFFFF };

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

	@ObfuscatedName("client.Fd")
	public int MAX_CHATS = 50;

	@ObfuscatedName("client.Gd")
	public int[] chatX = new int[MAX_CHATS];

	@ObfuscatedName("client.Hd")
	public int[] chatY = new int[MAX_CHATS];

	@ObfuscatedName("client.Id")
	public int[] chatHeight = new int[MAX_CHATS];

	@ObfuscatedName("client.Jd")
	public int[] chatWidth = new int[MAX_CHATS];

	@ObfuscatedName("client.Kd")
	public int[] chatColors = new int[MAX_CHATS];

	@ObfuscatedName("client.Ld")
	public int[] chatStyles = new int[MAX_CHATS];

	@ObfuscatedName("client.Md")
	public int[] chatTimers = new int[MAX_CHATS];

	@ObfuscatedName("client.Nd")
	public String[] chats = new String[MAX_CHATS];

	@ObfuscatedName("client.Pd")
	public int minimapLevel = -1;

	@ObfuscatedName("client.Rd")
	public Pix32[] imageHitmarks = new Pix32[20];

	@ObfuscatedName("client.Ud")
	public int[] designColors = new int[5];

	@ObfuscatedName("client.ge")
	public int SCROLLBAR_TRACK = 0x23201B;

	@ObfuscatedName("client.ie")
	public String chatbackInput = "";

	@ObfuscatedName("client.re")
	public LinkList projectiles = new LinkList();

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

	@ObfuscatedName("client.We")
	public int[] skillBaseLevel = new int[Stats.count];

	@ObfuscatedName("client.Xe")
	public int[] varCache = new int[2000];

	@ObfuscatedName("client.Ze")
	public boolean designGenderMale = true;

	@ObfuscatedName("client.ef")
	public int[] minimapMaskLineOffsets = new int[151];

	@ObfuscatedName("client.gf")
	public int flashingTab = -1;

	@ObfuscatedName("client.jf")
	public LinkList spotanims = new LinkList();

	@ObfuscatedName("client.kf")
	public int[] compassMaskLineLengths = new int[33];

	@ObfuscatedName("client.mf")
	public Component chatInterface = new Component();

	@ObfuscatedName("client.nf")
	public Pix8[] imageMapscene = new Pix8[100];

	@ObfuscatedName("client.qf")
	public int SCROLLBAR_GRIP_FOREGROUND = 0x4D4233;

	@ObfuscatedName("client.sf")
	public int[] designIdentikits = new int[7];

	@ObfuscatedName("client.zf")
	public int[] activeMapFunctionX = new int[1000];

	@ObfuscatedName("client.Af")
	public int[] activeMapFunctionZ = new int[1000];

	@ObfuscatedName("client.Hf")
	public boolean awaitingSync = false;

	@ObfuscatedName("client.Jf")
	public String[] friendName = new String[200];

	@ObfuscatedName("client.Kf")
	public Packet in = Packet.alloc(1);

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
	public LinkList temporaryLocs = new LinkList();

	@ObfuscatedName("client.Hh")
	public int orbitCameraPitch = 128;

	@ObfuscatedName("client.Mh")
	public int sidebarInterfaceId = -1;

	@ObfuscatedName("client.Ph")
	public Packet out = Packet.alloc(1);

	@ObfuscatedName("client.Wh")
	public String[] menuOption = new String[500];

	@ObfuscatedName("client.ai")
	public int[] cameraModifierWobbleScale = new int[5];

	@ObfuscatedName("client.ei")
	public int[] waveIds = new int[50];

	@ObfuscatedName("client.hi")
	public int minimapAngleModifier = 2;

	@ObfuscatedName("client.ii")
	public int chatScrollHeight = 78;

	@ObfuscatedName("client.ji")
	public String socialInput = "";

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

	@ObfuscatedName("client.vj")
	public int chatInterfaceId = -1;

	@ObfuscatedName("client.yj")
	public int cameraOffsetXModifier = 2;

	@ObfuscatedName("client.zj")
	public int[] bfsStepX = new int[4000];

	@ObfuscatedName("client.Aj")
	public int[] bfsStepZ = new int[4000];

	@ObfuscatedName("client.Ij")
	public int lastWaveLoops = -1;

	@ObfuscatedName("client.qb")
	public static BigInteger RSA_MODULUS = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.nd")
	public static int nodeId = 10;

	@ObfuscatedName("client.pd")
	public static boolean members = true;

	@ObfuscatedName("client.he")
	public static final int[][] DESIGN_BODY_COLOR = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.xe")
	public static int[] levelExperience = new int[99];

	@ObfuscatedName("client.Ke")
	public static BigInteger RSA_EXPONENT = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.lh")
	public static String CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.bi")
	public static final int[] DESIGN_HAIR_COLOR = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Di")
	public static int[] BITMASK = new int[32];

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

	@ObfuscatedName("client.zb")
	public Pix8 imageRedstone1v;

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

	@ObfuscatedName("client.kb")
	public int[] flameGradient;

	@ObfuscatedName("client.lb")
	public int[] flameGradient0;

	@ObfuscatedName("client.mb")
	public int[] flameGradient1;

	@ObfuscatedName("client.nb")
	public int[] flameGradient2;

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
	public static final String formatObjCountTagged(int arg0) {
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

	@ObfuscatedName("client.g(I)V")
	public final void stopMidi() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.h(I)V")
	public final void loadArchiveChecksums() {
		int var1 = 5;
		archiveChecksum[8] = 0;
		int var2 = 0;
		while (archiveChecksum[8] == 0) {
			String var3 = "Unknown problem";
			drawProgress(20, "Connecting to web server");

			try {
				DataInputStream var4 = openUrl("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 317);
				Packet var5 = new Packet(new byte[40]);
				var4.readFully(var5.data, 0, 40);
				var4.close();

				for (int var6 = 0; var6 < 9; var6++) {
					archiveChecksum[var6] = var5.g4();
				}

				int var7 = var5.g4();
				int var8 = 1234;
				for (int var9 = 0; var9 < 9; var9++) {
					var8 = (var8 << 1) + archiveChecksum[var9];
				}

				if (var7 != var8) {
					var3 = "checksum problem";
					archiveChecksum[8] = 0;
				}
			} catch (EOFException var12) {
				var3 = "EOF problem";
				archiveChecksum[8] = 0;
			} catch (IOException var13) {
				var3 = "connection problem";
				archiveChecksum[8] = 0;
			} catch (Exception var14) {
				var3 = "logic problem";
				archiveChecksum[8] = 0;

				if (!signlink.reporterror) {
					return;
				}
			}

			if (archiveChecksum[8] == 0) {
				var2++;
				for (int var10 = var1; var10 > 0; var10--) {
					if (var2 >= 10) {
						drawProgress(10, "Game updated - please reload page");
						var10 = 10;
					} else {
						drawProgress(10, var3 + " - Will retry in " + var10 + " secs.");
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

	@ObfuscatedName("client.b(II)Z")
	public final boolean isAddFriendOption(int arg0) {
		if (arg0 < 0) {
			return false;
		}

		int var2 = menuAction[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 337) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.i(I)V")
	public final void drawChat() {
		areaChatback.bind();
		Pix3D.lineOffset = areaChatbackOffsets;
		imageChatback.draw(0, 0);

		if (showSocialInput) {
			fontBold12.drawStringCenter(0, socialMessage, 40, 239);
			fontBold12.drawStringCenter(128, socialInput + "*", 60, 239);
		} else if (chatbackInputOpen == 1) {
			fontBold12.drawStringCenter(0, "Enter amount:", 40, 239);
			fontBold12.drawStringCenter(128, chatbackInput + "*", 60, 239);
		} else if (chatbackInputOpen == 2) {
			fontBold12.drawStringCenter(0, "Enter name:", 40, 239);
			fontBold12.drawStringCenter(128, chatbackInput + "*", 60, 239);
		} else if (modalMessage != null) {
			fontBold12.drawStringCenter(0, modalMessage, 40, 239);
			fontBold12.drawStringCenter(128, "Click to continue", 60, 239);
		} else if (chatInterfaceId != -1) {
			drawInterface(0, 0, Component.instances[chatInterfaceId], 0);
		} else if (stickyChatInterfaceId == -1) {
			PixFont var1 = fontPlain12;
			int var2 = 0;
			Pix2D.setBounds(77, 0, 463, 0);

			for (int var3 = 0; var3 < 100; var3++) {
				if (messageText[var3] != null) {
					int var4 = messageType[var3];
					int var5 = chatScrollOffset + 70 - var2 * 14;
					String var6 = messageSender[var3];
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
							var1.drawString(0, messageText[var3], var5, 4);
						}

						var2++;
					}

					if ((var4 == 1 || var4 == 2) && (var4 == 1 || publicChatSetting == 0 || publicChatSetting == 1 && isFriend(var6))) {
						if (var5 > 0 && var5 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								imageModIcons[0].draw(var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								imageModIcons[1].draw(var8, var5 - 12);
								var8 += 14;
							}

							var1.drawString(0, var6 + ":", var5, var8);
							var8 += var1.stringWidthTag(var6) + 8;
							var1.drawString(255, messageText[var3], var5, var8);
						}

						var2++;
					}

					if ((var4 == 3 || var4 == 7) && splitPrivateChat == 0 && (var4 == 7 || privateChatSetting == 0 || privateChatSetting == 1 && isFriend(var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var9 = 4;
							var1.drawString(0, "From", var5, var9);
							int var11 = var9 + var1.stringWidthTag("From ");
							if (var7 == 1) {
								imageModIcons[0].draw(var11, var5 - 12);
								var11 += 14;
							}

							if (var7 == 2) {
								imageModIcons[1].draw(var11, var5 - 12);
								var11 += 14;
							}

							var1.drawString(0, var6 + ":", var5, var11);
							var11 += var1.stringWidthTag(var6) + 8;
							var1.drawString(0x800000, messageText[var3], var5, var11);
						}

						var2++;
					}

					if (var4 == 4 && (tradeChatSetting == 0 || tradeChatSetting == 1 && isFriend(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(0x800080, var6 + " " + messageText[var3], var5, 4);
						}

						var2++;
					}

					if (var4 == 5 && splitPrivateChat == 0 && privateChatSetting < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(0x800000, messageText[var3], var5, 4);
						}

						var2++;
					}

					if (var4 == 6 && splitPrivateChat == 0 && privateChatSetting < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(0, "To " + var6 + ":", var5, 4);
							var1.drawString(0x800000, messageText[var3], var5, var1.stringWidthTag("To " + var6) + 12);
						}

						var2++;
					}

					if (var4 == 8 && (tradeChatSetting == 0 || tradeChatSetting == 1 && isFriend(var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.drawString(0x7E3200, var6 + " " + messageText[var3], var5, 4);
						}

						var2++;
					}
				}
			}

			Pix2D.resetBounds();
			chatScrollHeight = var2 * 14 + 7;
			if (chatScrollHeight < 78) {
				chatScrollHeight = 78;
			}

			drawScrollbar(77, chatScrollHeight - chatScrollOffset - 77, 0, 463, chatScrollHeight);
			String var10;
			if (localPlayer == null || localPlayer.name == null) {
				var10 = JString.toSentenceCase(username);
			} else {
				var10 = localPlayer.name;
			}

			var1.drawString(0, var10 + ":", 90, 4);
			var1.drawString(255, chatTyped + "*", 90, var1.stringWidthTag(var10 + ": ") + 6);
			Pix2D.drawHorizontalLine(77, 0, 479, 0);
		} else {
			drawInterface(0, 0, Component.instances[stickyChatInterfaceId], 0);
		}

		if (menuVisible && menuArea == 2) {
			drawMenu();
		}

		areaChatback.draw(357, graphics, 17);
		areaViewport.bind();
		Pix3D.lineOffset = areaViewportOffsets;
	}

	public final void init() {
		nodeId = Integer.parseInt(getParameter("nodeid"));
		portOffset = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			setLowMemory();
		} else {
			setHighMemory();
		}

		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			members = false;
		} else {
			members = true;
		}

		initApplet(503, 765);
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
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}

		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.k(I)V")
	public final void handleMouseInput() {
		if (objDragArea == 0) {
			int var1 = mouseClickButton;
			if (spellSelected == 1 && mouseClickX >= 516 && mouseClickY >= 160 && mouseClickX <= 765 && mouseClickY <= 205) {
				var1 = 0;
			}

			if (menuVisible) {
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
						menuVisible = false;

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
					for (int var10 = 0; var10 < menuSize; var10++) {
						int var11 = (menuSize - var10 - 1) * 15 + var5 + 31;
						if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
							var9 = var10;
						}
					}

					if (var9 != -1) {
						useMenuOption(var9);
					}

					menuVisible = false;

					if (menuArea == 1) {
						redrawSidebar = true;
					}

					if (menuArea == 2) {
						redrawChatback = true;
						return;
					}
				}
			} else {
				if (var1 == 1 && menuSize > 0) {
					int var12 = menuAction[menuSize - 1];
					if (var12 == 632 || var12 == 78 || var12 == 867 || var12 == 431 || var12 == 53 || var12 == 74 || var12 == 454 || var12 == 539 || var12 == 493 || var12 == 847 || var12 == 447 || var12 == 1125) {
						int var13 = menuParamB[menuSize - 1];
						int var14 = menuParamC[menuSize - 1];
						Component var15 = Component.instances[var14];
						if (var15.draggable || var15.swappable) {
							objGrabThreshold = false;
							objDragCycles = 0;
							objDragInterfaceId = var14;
							objDragSlot = var13;
							objDragArea = 2;
							objGrabX = mouseClickX;
							objGrabY = mouseClickY;

							if (Component.instances[var14].layer == viewportInterfaceId) {
								objDragArea = 1;
							}

							if (Component.instances[var14].layer == chatInterfaceId) {
								objDragArea = 3;
							}

							return;
						}
					}
				}

				if (var1 == 1 && (mouseButtonsOption == 1 || isAddFriendOption(menuSize - 1)) && menuSize > 2) {
					var1 = 2;
				}

				if (var1 == 1 && menuSize > 0) {
					useMenuOption(menuSize - 1);
				}

				if (var1 != 2 || menuSize <= 0) {
					return;
				}

				showContextMenu();
			}
		}
	}

	@ObfuscatedName("client.a(ZI[B)V")
	public final void saveMidi(boolean arg0, byte[] arg1) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg1, arg1.length);
	}

	@ObfuscatedName("client.a(Z)V")
	public final void buildScene() {
		try {
			minimapLevel = -1;
			spotanims.clear();
			projectiles.clear();
			Pix3D.clearTexels();
			clearCache();
			scene.reset();
			System.gc();

			for (int var1 = 0; var1 < 4; var1++) {
				levelCollisionMap[var1].reset();
			}

			for (int var2 = 0; var2 < 4; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						levelTileFlags[var2][var3][var4] = 0;
					}
				}
			}

			World var5 = new World(levelTileFlags, 104, 104, levelHeightmap);
			int var6 = sceneMapLandData.length;
			out.p1isaac(0);

			if (!sceneInstanced) {
				for (int var7 = 0; var7 < var6; var7++) {
					int var8 = (sceneMapIndex[var7] >> 8) * 64 - sceneBaseTileX;
					int var9 = (sceneMapIndex[var7] & 0xFF) * 64 - sceneBaseTileZ;
					byte[] var10 = sceneMapLandData[var7];
					if (var10 != null) {
						var5.readLand(var10, var9, var8, (sceneCenterZoneX - 6) * 8, (sceneCenterZoneZ - 6) * 8, levelCollisionMap);
					}
				}

				for (int var11 = 0; var11 < var6; var11++) {
					int var12 = (sceneMapIndex[var11] >> 8) * 64 - sceneBaseTileX;
					int var13 = (sceneMapIndex[var11] & 0xFF) * 64 - sceneBaseTileZ;
					byte[] var14 = sceneMapLandData[var11];
					if (var14 == null && sceneCenterZoneZ < 800) {
						var5.stitchHeightmap(var13, 64, 64, var12);
					}
				}

				gamelogic4++;
				if (gamelogic4 > 160) {
					gamelogic4 = 0;
					out.p1isaac(238);
					out.p1(96);
				}

				out.p1isaac(0);

				for (int var15 = 0; var15 < var6; var15++) {
					byte[] var16 = sceneMapLocData[var15];
					if (var16 != null) {
						int var17 = (sceneMapIndex[var15] >> 8) * 64 - sceneBaseTileX;
						int var18 = (sceneMapIndex[var15] & 0xFF) * 64 - sceneBaseTileZ;
						var5.readLoc(var17, levelCollisionMap, var18, scene, var16);
					}
				}
			}

			if (sceneInstanced) {
				for (int var19 = 0; var19 < 4; var19++) {
					for (int var20 = 0; var20 < 13; var20++) {
						for (int var21 = 0; var21 < 13; var21++) {
							int var22 = levelChunkBitset[var19][var20][var21];
							if (var22 != -1) {
								int var23 = var22 >> 24 & 0x3;
								int var24 = var22 >> 1 & 0x3;
								int var25 = var22 >> 14 & 0x3FF;
								int var26 = var22 >> 3 & 0x7FF;
								int var27 = (var25 / 8 << 8) + var26 / 8;
								for (int var28 = 0; var28 < sceneMapIndex.length; var28++) {
									if (sceneMapIndex[var28] == var27 && sceneMapLandData[var28] != null) {
										var5.readLandRegion(var23, var24, levelCollisionMap, var20 * 8, (var25 & 0x7) * 8, sceneMapLandData[var28], (var26 & 0x7) * 8, var19, var21 * 8);
										break;
									}
								}
							}
						}
					}
				}

				for (int var29 = 0; var29 < 13; var29++) {
					for (int var30 = 0; var30 < 13; var30++) {
						int var31 = levelChunkBitset[0][var29][var30];
						if (var31 == -1) {
							var5.stitchHeightmap(var30 * 8, 8, 8, var29 * 8);
						}
					}
				}

				out.p1isaac(0);

				for (int var32 = 0; var32 < 4; var32++) {
					for (int var33 = 0; var33 < 13; var33++) {
						for (int var34 = 0; var34 < 13; var34++) {
							int var35 = levelChunkBitset[var32][var33][var34];
							if (var35 != -1) {
								int var36 = var35 >> 24 & 0x3;
								int var37 = var35 >> 1 & 0x3;
								int var38 = var35 >> 14 & 0x3FF;
								int var39 = var35 >> 3 & 0x7FF;
								int var40 = (var38 / 8 << 8) + var39 / 8;
								for (int var41 = 0; var41 < sceneMapIndex.length; var41++) {
									if (sceneMapIndex[var41] == var40 && sceneMapLocData[var41] != null) {
										var5.readLocRegion(levelCollisionMap, scene, var36, var33 * 8, (var39 & 0x7) * 8, var32, sceneMapLocData[var41], (var38 & 0x7) * 8, var37, var34 * 8);
										break;
									}
								}
							}
						}
					}
				}
			}

			out.p1isaac(0);
			var5.build(levelCollisionMap, scene);
			areaViewport.bind();
			out.p1isaac(0);
			int var42 = World.currentLevel;
			if (var42 > currentLevel) {
				var42 = currentLevel;
			}

			if (var42 < currentLevel - 1) {
				int var43 = currentLevel - 1;
			}

			if (lowMemory) {
				scene.setMinLevel(World.currentLevel);
			} else {
				scene.setMinLevel(0);
			}

			for (int var44 = 0; var44 < 104; var44++) {
				for (int var45 = 0; var45 < 104; var45++) {
					sortObjStacks(var44, var45);
				}
			}

			gamelogic3++;
			if (gamelogic3 > 98) {
				gamelogic3 = 0;
				out.p1isaac(150);
			}

			clearTemporaryLocs();
		} catch (Exception var58) {
		}

		LocType.modelCacheStatic.clear();

		if (frame != null) {
			out.p1isaac(210);
			out.p4(1057001181);
		}

		if (lowMemory && signlink.cache_dat != null) {
			int var47 = ondemand.getFileCount(0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = ondemand.getModelFlags(var48);
				if ((var49 & 0x79) == 0) {
					Model.unload(var48);
				}
			}
		}

		System.gc();
		Pix3D.initPool(20);
		ondemand.clearPrefetches();
		int var50 = (sceneCenterZoneX - 6) / 8 - 1;
		int var51 = (sceneCenterZoneX + 6) / 8 + 1;
		int var52 = (sceneCenterZoneZ - 6) / 8 - 1;
		int var53 = (sceneCenterZoneZ + 6) / 8 + 1;
		if (withinTutorialIsland) {
			var50 = 49;
			var51 = 50;
			var52 = 49;
			var53 = 50;
		}

		for (int var54 = var50; var54 <= var51; var54++) {
			for (int var55 = var52; var55 <= var53; var55++) {
				if (var50 == var54 || var51 == var54 || var52 == var55 || var53 == var55) {
					int var56 = ondemand.getMapFile(0, var55, var54);
					if (var56 != -1) {
						ondemand.prefetch(var56, 3);
					}

					int var57 = ondemand.getMapFile(1, var55, var54);
					if (var57 != -1) {
						ondemand.prefetch(var57, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public final void clearCache() {
		LocType.modelCacheStatic.clear();
		LocType.modelCacheDynamic.clear();
		NpcType.modelCacheStatic.clear();
		ObjType.modelCache.clear();
		ObjType.iconCache.clear();
		PlayerEntity.modelCache.clear();
		SpotAnimType.modelCache.clear();
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void createMinimap(int arg0) {
		int[] var2 = imageMinimap.pixels;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}

		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((levelTileFlags[arg0][var7][var5] & 0x18) == 0) {
					scene.drawMinimapTile(var2, var6, 512, arg0, var7, var5);
				}

				if (arg0 < 3 && (levelTileFlags[arg0 + 1][var7][var5] & 0x8) != 0) {
					scene.drawMinimapTile(var2, var6, 512, arg0 + 1, var7, var5);
				}

				var6 += 4;
			}
		}

		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		imageMinimap.bind();

		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((levelTileFlags[arg0][var11][var10] & 0x18) == 0) {
					drawMinimapLoc(var10, var8, var11, var9, arg0);
				}

				if (arg0 < 3 && (levelTileFlags[arg0 + 1][var11][var10] & 0x8) != 0) {
					drawMinimapLoc(var10, var8, var11, var9, arg0 + 1);
				}
			}
		}

		areaViewport.bind();
		activeMapFunctionCount = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = scene.getGroundDecorationBitset(currentLevel, var12, var13);
				if (var14 != 0) {
					var14 = var14 >> 14 & 0x7FFF;
					int var15 = LocType.get(var14).mapfunction;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var13;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							byte var18 = 104;
							byte var19 = 104;
							int[][] var20 = levelCollisionMap[currentLevel].flags;
							for (int var21 = 0; var21 < 10; var21++) {
								int var22 = (int) (Math.random() * 4.0D);
								if (var22 == 0 && var16 > 0 && var16 > var12 - 3 && (var20[var16 - 1][var17] & 0x1280108) == 0) {
									var16--;
								}

								if (var22 == 1 && var16 < var18 - 1 && var16 < var12 + 3 && (var20[var16 + 1][var17] & 0x1280180) == 0) {
									var16++;
								}

								if (var22 == 2 && var17 > 0 && var17 > var13 - 3 && (var20[var16][var17 - 1] & 0x1280102) == 0) {
									var17--;
								}

								if (var22 == 3 && var17 < var19 - 1 && var17 < var13 + 3 && (var20[var16][var17 + 1] & 0x1280120) == 0) {
									var17++;
								}
							}
						}

						activeMapFunctions[activeMapFunctionCount] = imageMapfunction[var15];
						activeMapFunctionX[activeMapFunctionCount] = var16;
						activeMapFunctionZ[activeMapFunctionCount] = var17;
						activeMapFunctionCount++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void sortObjStacks(int arg0, int arg1) {
		LinkList var3 = levelObjStacks[currentLevel][arg0][arg1];
		if (var3 == null) {
			scene.removeObjStack(currentLevel, arg0, arg1);
		} else {
			int var4 = -99999999;
			ObjStackEntity var5 = null;
			for (ObjStackEntity var6 = (ObjStackEntity) var3.head(); var6 != null; var6 = (ObjStackEntity) var3.next()) {
				ObjType var7 = ObjType.get(var6.type);
				int var8 = var7.cost;
				if (var7.stackable) {
					var8 = (var6.count + 1) * var8;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.addHead(var5);
			ObjStackEntity var9 = null;
			ObjStackEntity var10 = null;
			for (ObjStackEntity var11 = (ObjStackEntity) var3.head(); var11 != null; var11 = (ObjStackEntity) var3.next()) {
				if (var5.type != var11.type && var9 == null) {
					var9 = var11;
				}

				if (var5.type != var11.type && var9.type != var11.type && var10 == null) {
					var10 = var11;
				}
			}

			int var12 = (arg1 << 7) + arg0 + 0x60000000;
			scene.addObjStack(arg0, var12, var9, getHeightmapY(currentLevel, arg1 * 128 + 64, arg0 * 128 + 64), var10, var5, currentLevel, arg1);
		}
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void pushNpcs(boolean arg0) {
		for (int var2 = 0; var2 < npcCount; var2++) {
			NpcEntity var3 = npcs[npcIds[var2]];
			int var4 = (npcIds[var2] << 14) + 0x20000000;
			if (var3 != null && var3.isVisible() && var3.type.alwaysontop == arg0) {
				int var5 = var3.x >> 7;
				int var6 = var3.z >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.size == 1 && (var3.x & 0x7F) == 0x40 && (var3.z & 0x7F) == 0x40) {
						if (tileLastOccupiedCycle[var5][var6] == sceneCycle) {
							continue;
						}

						tileLastOccupiedCycle[var5][var6] = sceneCycle;
					}

					if (!var3.type.active) {
						var4 += Integer.MIN_VALUE;
					}

					scene.addTemporary(currentLevel, var3.yaw, getHeightmapY(currentLevel, var3.z, var3.x), var4, var3.z, (var3.size - 1) * 64 + 60, var3.x, var3, var3.needsForwardDrawPadding);
				}
			}
		}
	}

	@ObfuscatedName("client.l(I)Z")
	public final boolean replayWave() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public final void showLoadError(String arg0) {
		System.out.println(arg0);

		try {
			getAppletContext().showDocument(new URL(getCodeBase(), "loaderror_" + arg0 + ".html"));
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
	public final void handleInterfaceInput(int arg0, Component arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1.type == 0 && arg1.children != null && !arg1.hide && (arg2 >= arg0 && arg4 >= arg3 && arg2 <= arg1.width + arg0 && arg4 <= arg1.height + arg3)) {
			int var7 = arg1.children.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = arg1.childX[var8] + arg0;
				int var10 = arg1.childY[var8] + arg3 - arg5;
				Component var11 = Component.instances[arg1.children[var8]];
				var9 += var11.x;
				var10 += var11.y;
				if ((var11.overlayer >= 0 || var11.overColour != 0) && arg2 >= var9 && arg4 >= var10 && arg2 < var11.width + var9 && arg4 < var11.height + var10) {
					if (var11.overlayer >= 0) {
						lastHoveredInterfaceId = var11.overlayer;
					} else {
						lastHoveredInterfaceId = var11.id;
					}
				}

				if (var11.type == 0) {
					handleInterfaceInput(var9, var11, arg2, var10, arg4, var11.scrollPosition);

					if (var11.scroll > var11.height) {
						handleScrollInput(var11.width + var9, var11.height, arg2, arg4, var11, var10, true, var11.scroll);
					}
				} else {
					if (var11.buttonType == 1 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.width + var9 && arg4 < var11.height + var10) {
						boolean var12 = false;
						if (var11.clientCode != 0) {
							var12 = handleSocialMenuOption(var11);
						}

						if (!var12) {
							menuOption[menuSize] = var11.option;
							menuAction[menuSize] = 315;
							menuParamC[menuSize] = var11.id;
							menuSize++;
						}
					}

					if (var11.buttonType == 2 && spellSelected == 0 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.width + var9 && arg4 < var11.height + var10) {
						String var13 = var11.targetVerb;
						if (var13.indexOf(" ") != -1) {
							var13 = var13.substring(0, var13.indexOf(" "));
						}

						menuOption[menuSize] = var13 + " @gre@" + var11.targetText;
						menuAction[menuSize] = 626;
						menuParamC[menuSize] = var11.id;
						menuSize++;
					}

					if (var11.buttonType == 3 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.width + var9 && arg4 < var11.height + var10) {
						menuOption[menuSize] = "Close";
						menuAction[menuSize] = 200;
						menuParamC[menuSize] = var11.id;
						menuSize++;
					}

					if (var11.buttonType == 4 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.width + var9 && arg4 < var11.height + var10) {
						menuOption[menuSize] = var11.option;
						menuAction[menuSize] = 169;
						menuParamC[menuSize] = var11.id;
						menuSize++;
					}

					if (var11.buttonType == 5 && arg2 >= var9 && arg4 >= var10 && arg2 < var11.width + var9 && arg4 < var11.height + var10) {
						menuOption[menuSize] = var11.option;
						menuAction[menuSize] = 646;
						menuParamC[menuSize] = var11.id;
						menuSize++;
					}

					if (var11.buttonType == 6 && !pressedContinueOption && arg2 >= var9 && arg4 >= var10 && arg2 < var11.width + var9 && arg4 < var11.height + var10) {
						menuOption[menuSize] = var11.option;
						menuAction[menuSize] = 679;
						menuParamC[menuSize] = var11.id;
						menuSize++;
					}

					if (var11.type == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var11.height; var15++) {
							for (int var16 = 0; var16 < var11.width; var16++) {
								int var17 = (var11.marginX + 32) * var16 + var9;
								int var18 = (var11.marginY + 32) * var15 + var10;
								if (var14 < 20) {
									var17 += var11.invSlotOffsetX[var14];
									var18 += var11.invSlotOffsetY[var14];
								}

								if (arg2 >= var17 && arg4 >= var18 && arg2 < var17 + 32 && arg4 < var18 + 32) {
									hoveredSlot = var14;
									hoveredSlotParentId = var11.id;

									if (var11.invSlotObjId[var14] > 0) {
										ObjType var19 = ObjType.get(var11.invSlotObjId[var14] - 1);
										if (objSelected == 1 && var11.interactable) {
											if (objSelectedInterface != var11.id || objSelectedSlot != var14) {
												menuOption[menuSize] = "Use " + objSelectedName + " with @lre@" + var19.name;
												menuAction[menuSize] = 870;
												menuParamA[menuSize] = var19.type;
												menuParamB[menuSize] = var14;
												menuParamC[menuSize] = var11.id;
												menuSize++;
											}
										} else if (spellSelected != 1 || !var11.interactable) {
											if (var11.interactable) {
												for (int var20 = 4; var20 >= 3; var20--) {
													if (var19.iop != null && var19.iop[var20] != null) {
														menuOption[menuSize] = var19.iop[var20] + " @lre@" + var19.name;

														if (var20 == 3) {
															menuAction[menuSize] = 493;
														}

														if (var20 == 4) {
															menuAction[menuSize] = 847;
														}

														menuParamA[menuSize] = var19.type;
														menuParamB[menuSize] = var14;
														menuParamC[menuSize] = var11.id;
														menuSize++;
													} else if (var20 == 4) {
														menuOption[menuSize] = "Drop @lre@" + var19.name;
														menuAction[menuSize] = 847;
														menuParamA[menuSize] = var19.type;
														menuParamB[menuSize] = var14;
														menuParamC[menuSize] = var11.id;
														menuSize++;
													}
												}
											}

											if (var11.usable) {
												menuOption[menuSize] = "Use @lre@" + var19.name;
												menuAction[menuSize] = 447;
												menuParamA[menuSize] = var19.type;
												menuParamB[menuSize] = var14;
												menuParamC[menuSize] = var11.id;
												menuSize++;
											}

											if (var11.interactable && var19.iop != null) {
												for (int var21 = 2; var21 >= 0; var21--) {
													if (var19.iop[var21] != null) {
														menuOption[menuSize] = var19.iop[var21] + " @lre@" + var19.name;

														if (var21 == 0) {
															menuAction[menuSize] = 74;
														}

														if (var21 == 1) {
															menuAction[menuSize] = 454;
														}

														if (var21 == 2) {
															menuAction[menuSize] = 539;
														}

														menuParamA[menuSize] = var19.type;
														menuParamB[menuSize] = var14;
														menuParamC[menuSize] = var11.id;
														menuSize++;
													}
												}
											}

											if (var11.iop != null) {
												for (int var22 = 4; var22 >= 0; var22--) {
													if (var11.iop[var22] != null) {
														menuOption[menuSize] = var11.iop[var22] + " @lre@" + var19.name;

														if (var22 == 0) {
															menuAction[menuSize] = 632;
														}

														if (var22 == 1) {
															menuAction[menuSize] = 78;
														}

														if (var22 == 2) {
															menuAction[menuSize] = 867;
														}

														if (var22 == 3) {
															menuAction[menuSize] = 431;
														}

														if (var22 == 4) {
															menuAction[menuSize] = 53;
														}

														menuParamA[menuSize] = var19.type;
														menuParamB[menuSize] = var14;
														menuParamC[menuSize] = var11.id;
														menuSize++;
													}
												}
											}

											menuOption[menuSize] = "Examine @lre@" + var19.name;
											menuAction[menuSize] = 1125;
											menuParamA[menuSize] = var19.type;
											menuParamB[menuSize] = var14;
											menuParamC[menuSize] = var11.id;
											menuSize++;
										} else if ((activeSpellFlags & 0x10) == 0x10) {
											menuOption[menuSize] = spellCaption + " @lre@" + var19.name;
											menuAction[menuSize] = 543;
											menuParamA[menuSize] = var19.type;
											menuParamB[menuSize] = var14;
											menuParamC[menuSize] = var11.id;
											menuSize++;
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

	@ObfuscatedName("client.a(IIIIII)V")
	public final void drawScrollbar(int arg0, int arg1, int arg2, int arg3, int arg4) {
		imageScrollbar0.draw(arg3, arg2);
		imageScrollbar1.draw(arg3, arg0 + arg2 - 16);
		Pix2D.fillRect(arg0 - 32, arg2 + 16, arg3, SCROLLBAR_TRACK, 16);
		int var6 = (arg0 - 32) * arg0 / arg4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = (arg0 - var6 - 32) * arg1 / (arg4 - arg0);
		Pix2D.fillRect(var6, arg2 + var7 + 16, arg3, SCROLLBAR_GRIP_FOREGROUND, 16);
		Pix2D.drawVerticalLine(arg2 + var7 + 16, SCROLLBAR_GRIP_HIGHLIGHT, var6, arg3);
		Pix2D.drawVerticalLine(arg2 + var7 + 16, SCROLLBAR_GRIP_HIGHLIGHT, var6, arg3 + 1);
		Pix2D.drawHorizontalLine(arg2 + var7 + 16, SCROLLBAR_GRIP_HIGHLIGHT, 16, arg3);
		Pix2D.drawHorizontalLine(arg2 + var7 + 17, SCROLLBAR_GRIP_HIGHLIGHT, 16, arg3);
		Pix2D.drawVerticalLine(arg2 + var7 + 16, SCROLLBAR_GRIP_LOWLIGHT, var6, arg3 + 15);
		Pix2D.drawVerticalLine(arg2 + var7 + 17, SCROLLBAR_GRIP_LOWLIGHT, var6 - 1, arg3 + 14);
		Pix2D.drawHorizontalLine(arg2 + var7 + var6 + 15, SCROLLBAR_GRIP_LOWLIGHT, 16, arg3);
		Pix2D.drawHorizontalLine(arg2 + var7 + var6 + 14, SCROLLBAR_GRIP_LOWLIGHT, 15, arg3 + 1);
	}

	@ObfuscatedName("client.a(LMBMGIXGO;II)V")
	public final void readNpcInfo(Packet arg0, int arg1) {
		entityRemovalCount = 0;
		entityUpdateCount = 0;
		readNpcs(arg0, arg1);
		readNewNpcs(arg1, arg0);
		readNpcUpdates(arg1, arg0);

		for (int var3 = 0; var3 < entityRemovalCount; var3++) {
			int var4 = entityRemovalIds[var3];
			if (loopCycle != npcs[var4].cycle) {
				npcs[var4].type = null;
				npcs[var4] = null;
			}
		}

		if (arg0.pos != arg1) {
			signlink.reporterror(username + " size mismatch in getnpcpos - pos:" + arg0.pos + " psize:" + arg1);
			throw new RuntimeException("eek");
		}

		for (int var5 = 0; var5 < npcCount; var5++) {
			if (npcs[npcIds[var5]] == null) {
				signlink.reporterror(username + " null entry in npc list - pos:" + var5 + " size:" + npcCount);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void handleChatSettingsInput() {
		if (mouseClickButton == 1) {
			if (mouseClickX >= 6 && mouseClickX <= 106 && mouseClickY >= 467 && mouseClickY <= 499) {
				publicChatSetting = (publicChatSetting + 1) % 4;
				redrawPrivacySettings = true;
				redrawChatback = true;
				out.p1isaac(95);
				out.p1(publicChatSetting);
				out.p1(privateChatSetting);
				out.p1(tradeChatSetting);
			}

			if (mouseClickX >= 135 && mouseClickX <= 235 && mouseClickY >= 467 && mouseClickY <= 499) {
				privateChatSetting = (privateChatSetting + 1) % 3;
				redrawPrivacySettings = true;
				redrawChatback = true;
				out.p1isaac(95);
				out.p1(publicChatSetting);
				out.p1(privateChatSetting);
				out.p1(tradeChatSetting);
			}

			if (mouseClickX >= 273 && mouseClickX <= 373 && mouseClickY >= 467 && mouseClickY <= 499) {
				tradeChatSetting = (tradeChatSetting + 1) % 3;
				redrawPrivacySettings = true;
				redrawChatback = true;
				out.p1isaac(95);
				out.p1(publicChatSetting);
				out.p1(privateChatSetting);
				out.p1(tradeChatSetting);
			}

			if (mouseClickX >= 412 && mouseClickX <= 512 && mouseClickY >= 467 && mouseClickY <= 499) {
				if (viewportInterfaceId == -1) {
					closeInterfaces();
					reportAbuseInput = "";
					reportAbuseMuteOption = false;

					for (int var1 = 0; var1 < Component.instances.length; var1++) {
						if (Component.instances[var1] != null && Component.instances[var1].clientCode == 600) {
							reportAbuseInterfaceId = viewportInterfaceId = Component.instances[var1].layer;
							break;
						}
					}
				} else {
					addMessage("Please close the interface you have open before using 'report abuse'", 0, "");
				}
			}

			gamelogic1++;
			if (gamelogic1 > 1386) {
				gamelogic1 = 0;
				out.p1isaac(165);
				out.p1(0);
				int var2 = out.pos;
				out.p1(139);
				out.p1(150);
				out.p2(32131);
				out.p1((int) (Math.random() * 256.0D));
				out.p2(3250);
				out.p1(177);
				out.p2(24859);
				out.p1(119);

				if ((int) (Math.random() * 2.0D) == 0) {
					out.p2(47234);
				}

				if ((int) (Math.random() * 2.0D) == 0) {
					out.p1(21);
				}

				out.psize1(out.pos - var2);
				return;
			}
		}
	}

	@ObfuscatedName("client.d(ZI)V")
	public final void updateVarp(int arg0) {
		int var2 = VarpType.instances[arg0].clientcode;
		if (var2 != 0) {
			int var3 = varps[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					Pix3D.setBrightness(0.9D);
				}

				if (var3 == 2) {
					Pix3D.setBrightness(0.8D);
				}

				if (var3 == 3) {
					Pix3D.setBrightness(0.7D);
				}

				if (var3 == 4) {
					Pix3D.setBrightness(0.6D);
				}

				ObjType.iconCache.clear();
				redrawTitleBackground = true;
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

				if (midiActive != var4 && !lowMemory) {
					if (midiActive) {
						midiSong = nextMidiSong;
						midiFading = true;
						ondemand.request(2, midiSong);
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
				mouseButtonsOption = var3;
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

	@ObfuscatedName("client.m(I)V")
	public final void draw2DEntityElements() {
		chatCount = 0;
		for (int var1 = -1; var1 < npcCount + playerCount; var1++) {
			PathingEntity var2;
			if (var1 == -1) {
				var2 = localPlayer;
			} else if (var1 < playerCount) {
				var2 = players[playerIds[var1]];
			} else {
				var2 = npcs[npcIds[var1 - playerCount]];
			}

			if (var2 != null && var2.isVisible()) {
				if (var2 instanceof NpcEntity) {
					NpcType var3 = ((NpcEntity) var2).type;
					if (var3.multinpc != null) {
						var3 = var3.getMultiNpc();
					}

					if (var3 == null) {
						continue;
					}
				}

				if (var1 >= playerCount) {
					NpcType var7 = ((NpcEntity) var2).type;
					if (var7.headicon >= 0 && var7.headicon < imageHeadicons.length) {
						projectFromGround(var2, var2.height + 15);

						if (projectX > -1) {
							imageHeadicons[var7.headicon].draw(projectX - 12, projectY - 30);
						}
					}

					if (hintType == 1 && npcIds[var1 - playerCount] == hintNpc && loopCycle % 20 < 10) {
						projectFromGround(var2, var2.height + 15);

						if (projectX > -1) {
							imageHeadicons[2].draw(projectX - 12, projectY - 28);
						}
					}
				} else {
					int var4 = 30;
					PlayerEntity var5 = (PlayerEntity) var2;
					if (var5.headicons != 0) {
						projectFromGround(var2, var2.height + 15);

						if (projectX > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.headicons & 1 << var6) != 0) {
									imageHeadicons[var6].draw(projectX - 12, projectY - var4);
									var4 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && hintType == 10 && playerIds[var1] == hintPlayer) {
						projectFromGround(var2, var2.height + 15);

						if (projectX > -1) {
							imageHeadicons[7].draw(projectX - 12, projectY - var4);
						}
					}
				}

				if (var2.chat != null && (var1 >= playerCount || publicChatSetting == 0 || publicChatSetting == 3 || publicChatSetting == 1 && isFriend(((PlayerEntity) var2).name))) {
					projectFromGround(var2, var2.height);

					if (projectX > -1 && chatCount < MAX_CHATS) {
						chatWidth[chatCount] = fontBold12.stringWidth(var2.chat) / 2;
						chatHeight[chatCount] = fontBold12.height;
						chatX[chatCount] = projectX;
						chatY[chatCount] = projectY;
						chatColors[chatCount] = var2.chatColor;
						chatStyles[chatCount] = var2.chatStyle;
						chatTimers[chatCount] = var2.chatTimer;
						chats[chatCount++] = var2.chat;

						if (chatEffects == 0 && var2.chatStyle >= 1 && var2.chatStyle <= 3) {
							chatHeight[chatCount] += 10;
							chatY[chatCount] += 5;
						}

						if (chatEffects == 0 && var2.chatStyle == 4) {
							chatWidth[chatCount] = 60;
						}

						if (chatEffects == 0 && var2.chatStyle == 5) {
							chatHeight[chatCount] += 5;
						}
					}
				}

				if (var2.combatCycle > loopCycle) {
					projectFromGround(var2, var2.height + 15);

					if (projectX > -1) {
						int var8 = var2.health * 30 / var2.totalHealth;
						if (var8 > 30) {
							var8 = 30;
						}

						Pix2D.fillRect(5, projectY - 3, projectX - 15, 0xFF00, var8);
						Pix2D.fillRect(5, projectY - 3, projectX - 15 + var8, 0xFF0000, 30 - var8);
					}
				}

				for (int var9 = 0; var9 < 4; var9++) {
					if (var2.damageCycle[var9] > loopCycle) {
						projectFromGround(var2, var2.height / 2);

						if (projectX > -1) {
							if (var9 == 1) {
								projectY -= 20;
							}

							if (var9 == 2) {
								projectX -= 15;
								projectY -= 10;
							}

							if (var9 == 3) {
								projectX += 15;
								projectY -= 10;
							}

							imageHitmarks[var2.damageType[var9]].draw(projectX - 12, projectY - 12);
							fontPlain11.drawStringCenter(0, String.valueOf(var2.damage[var9]), projectY + 4, projectX);
							fontPlain11.drawStringCenter(0xFFFFFF, String.valueOf(var2.damage[var9]), projectY + 3, projectX - 1);
						}
					}
				}
			}
		}

		for (int var10 = 0; var10 < chatCount; var10++) {
			int var11 = chatX[var10];
			int var12 = chatY[var10];
			int var13 = chatWidth[var10];
			int var14 = chatHeight[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > chatY[var16] - chatHeight[var16] && var12 - var14 < chatY[var16] + 2 && var11 - var13 < chatWidth[var16] + chatX[var16] && var11 + var13 > chatX[var16] - chatWidth[var16] && chatY[var16] - chatHeight[var16] < var12) {
						var12 = chatY[var16] - chatHeight[var16];
						var15 = true;
					}
				}
			}

			projectX = chatX[var10];
			projectY = chatY[var10] = var12;
			String var17 = chats[var10];
			if (chatEffects == 0) {
				int var18 = 0xFFFF00;
				if (chatColors[var10] < 6) {
					var18 = CHAT_COLORS[chatColors[var10]];
				}

				if (chatColors[var10] == 6) {
					var18 = sceneCycle % 20 < 10 ? 0xFF0000 : 0xFFFF00;
				}

				if (chatColors[var10] == 7) {
					var18 = sceneCycle % 20 < 10 ? 0xFF : 0xFFFF;
				}

				if (chatColors[var10] == 8) {
					var18 = sceneCycle % 20 < 10 ? 0xB000 : 0x80FF80;
				}

				if (chatColors[var10] == 9) {
					int var19 = 150 - chatTimers[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 0xFF0000;
					} else if (var19 < 100) {
						var18 = 0xFFFF00 - (var19 - 50) * 0x50000;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 0xFF00;
					}
				}

				if (chatColors[var10] == 10) {
					int var20 = 150 - chatTimers[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 0xFF0000;
					} else if (var20 < 100) {
						var18 = 0xFF00FF - (var20 - 50) * 0x50000;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 0x50000 + 255 - (var20 - 100) * 5;
					}
				}

				if (chatColors[var10] == 11) {
					int var21 = 150 - chatTimers[var10];
					if (var21 < 50) {
						var18 = 0xFFFFFF - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 0xFF00;
					} else if (var21 < 150) {
						var18 = 0xFFFFFF - (var21 - 100) * 0x50000;
					}
				}

				if (chatStyles[var10] == 0) {
					fontBold12.drawStringCenter(0, var17, projectY + 1, projectX);
					fontBold12.drawStringCenter(var18, var17, projectY, projectX);
				}

				if (chatStyles[var10] == 1) {
					fontBold12.drawStringWave(0, var17, projectX, sceneCycle, projectY + 1);
					fontBold12.drawStringWave(var18, var17, projectX, sceneCycle, projectY);
				}

				if (chatStyles[var10] == 2) {
					fontBold12.drawStringWave2(projectX, var17, sceneCycle, projectY + 1, 0);
					fontBold12.drawStringWave2(projectX, var17, sceneCycle, projectY, var18);
				}

				if (chatStyles[var10] == 3) {
					fontBold12.drawStringShake(150 - chatTimers[var10], var17, sceneCycle, projectY + 1, projectX, 0);
					fontBold12.drawStringShake(150 - chatTimers[var10], var17, sceneCycle, projectY, projectX, var18);
				}

				if (chatStyles[var10] == 4) {
					int var22 = fontBold12.stringWidth(var17);
					int var23 = (150 - chatTimers[var10]) * (var22 + 100) / 150;
					Pix2D.setBounds(334, projectX - 50, projectX + 50, 0);
					fontBold12.drawString(0, var17, projectY + 1, projectX + 50 - var23);
					fontBold12.drawString(var18, var17, projectY, projectX + 50 - var23);
					Pix2D.resetBounds();
				}

				if (chatStyles[var10] == 5) {
					int var24 = 150 - chatTimers[var10];
					int var25 = 0;
					if (var24 < 25) {
						var25 = var24 - 25;
					} else if (var24 > 125) {
						var25 = var24 - 125;
					}

					Pix2D.setBounds(projectY + 5, 0, 512, projectY - fontBold12.height - 1);
					fontBold12.drawStringCenter(0, var17, projectY + var25 + 1, projectX);
					fontBold12.drawStringCenter(var18, var17, projectY + var25, projectX);
					Pix2D.resetBounds();
				}
			} else {
				fontBold12.drawStringCenter(0, var17, projectY + 1, projectX);
				fontBold12.drawStringCenter(0xFFFF00, var17, projectY, projectX);
			}
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void removeFriend(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < friendCount; var3++) {
				if (friendName37[var3] == arg0) {
					friendCount--;
					redrawSidebar = true;

					for (int var4 = var3; var4 < friendCount; var4++) {
						friendName[var4] = friendName[var4 + 1];
						friendWorld[var4] = friendWorld[var4 + 1];
						friendName37[var4] = friendName37[var4 + 1];
					}

					out.p1isaac(215);
					out.p8(arg0);
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void drawSidebar() {
		areaSidebar.bind();
		Pix3D.lineOffset = areaSidebarOffsets;
		imageInvback.draw(0, 0);

		if (sidebarInterfaceId != -1) {
			drawInterface(0, 0, Component.instances[sidebarInterfaceId], 0);
		} else if (tabInterfaceId[selectedTab] != -1) {
			drawInterface(0, 0, Component.instances[tabInterfaceId[selectedTab]], 0);
		}

		if (menuVisible && menuArea == 1) {
			drawMenu();
		}

		areaSidebar.draw(205, graphics, 553);
		areaViewport.bind();
		Pix3D.lineOffset = areaViewportOffsets;
	}

	@ObfuscatedName("client.d(II)V")
	public final void updateTextures(int arg0) {
		if (!lowMemory) {
			if (Pix3D.textureCycle[17] >= arg0) {
				Pix8 var2 = Pix3D.textures[17];
				int var3 = var2.cropBottom * var2.cropRight - 1;
				int var4 = sceneDelta * var2.cropRight * 2;
				byte[] var5 = var2.pixels;
				byte[] var6 = textureBuffer;
				for (int var7 = 0; var7 <= var3; var7++) {
					var6[var7] = var5[var7 - var4 & var3];
				}

				var2.pixels = var6;
				textureBuffer = var5;
				Pix3D.pushTexture(17);
				cyclelogic2++;
				if (cyclelogic2 > 1235) {
					cyclelogic2 = 0;
					out.p1isaac(226);
					out.p1(0);
					int var8 = out.pos;
					out.p2(58722);
					out.p1(240);
					out.p2((int) (Math.random() * 65536.0D));
					out.p1((int) (Math.random() * 256.0D));

					if ((int) (Math.random() * 2.0D) == 0) {
						out.p2(51825);
					}

					out.p1((int) (Math.random() * 256.0D));
					out.p2((int) (Math.random() * 65536.0D));
					out.p2(7130);
					out.p2((int) (Math.random() * 65536.0D));
					out.p2(61657);
					out.psize1(out.pos - var8);
				}
			}

			if (Pix3D.textureCycle[24] >= arg0) {
				Pix8 var9 = Pix3D.textures[24];
				int var10 = var9.cropBottom * var9.cropRight - 1;
				int var11 = sceneDelta * var9.cropRight * 2;
				byte[] var12 = var9.pixels;
				byte[] var13 = textureBuffer;
				for (int var14 = 0; var14 <= var10; var14++) {
					var13[var14] = var12[var14 - var11 & var10];
				}

				var9.pixels = var13;
				textureBuffer = var12;
				Pix3D.pushTexture(24);
			}

			if (Pix3D.textureCycle[34] >= arg0) {
				Pix8 var15 = Pix3D.textures[34];
				int var16 = var15.cropBottom * var15.cropRight - 1;
				int var17 = sceneDelta * var15.cropRight * 2;
				byte[] var18 = var15.pixels;
				byte[] var19 = textureBuffer;
				for (int var20 = 0; var20 <= var16; var20++) {
					var19[var20] = var18[var20 - var17 & var16];
				}

				var15.pixels = var19;
				textureBuffer = var18;
				Pix3D.pushTexture(34);
				return;
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void updateEntityChats() {
		for (int var1 = -1; var1 < playerCount; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = LOCAL_PLAYER_INDEX;
			} else {
				var2 = playerIds[var1];
			}

			PlayerEntity var3 = players[var2];
			if (var3 != null && var3.chatTimer > 0) {
				var3.chatTimer--;
				if (var3.chatTimer == 0) {
					var3.chat = null;
				}
			}
		}

		for (int var4 = 0; var4 < npcCount; var4++) {
			int var5 = npcIds[var4];
			NpcEntity var6 = npcs[var5];
			if (var6 != null && var6.chatTimer > 0) {
				var6.chatTimer--;
				if (var6.chatTimer == 0) {
					var6.chat = null;
				}
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public final void applyCutscene() {
		int var1 = cutsceneSrcLocalTileX * 128 + 64;
		int var2 = cutsceneSrcLocalTileZ * 128 + 64;
		int var3 = getHeightmapY(currentLevel, var2, var1) - cutsceneSrcHeight;

		if (cameraX < var1) {
			cameraX += (var1 - cameraX) * cutsceneMoveAcceleration / 1000 + cutsceneMoveSpeed;
			if (cameraX > var1) {
				cameraX = var1;
			}
		}

		if (cameraX > var1) {
			cameraX -= (cameraX - var1) * cutsceneMoveAcceleration / 1000 + cutsceneMoveSpeed;
			if (cameraX < var1) {
				cameraX = var1;
			}
		}

		if (cameraY < var3) {
			cameraY += (var3 - cameraY) * cutsceneMoveAcceleration / 1000 + cutsceneMoveSpeed;
			if (cameraY > var3) {
				cameraY = var3;
			}
		}

		if (cameraY > var3) {
			cameraY -= (cameraY - var3) * cutsceneMoveAcceleration / 1000 + cutsceneMoveSpeed;
			if (cameraY < var3) {
				cameraY = var3;
			}
		}

		if (cameraZ < var2) {
			cameraZ += (var2 - cameraZ) * cutsceneMoveAcceleration / 1000 + cutsceneMoveSpeed;
			if (cameraZ > var2) {
				cameraZ = var2;
			}
		}

		if (cameraZ > var2) {
			cameraZ -= (cameraZ - var2) * cutsceneMoveAcceleration / 1000 + cutsceneMoveSpeed;
			if (cameraZ < var2) {
				cameraZ = var2;
			}
		}

		int var4 = cutsceneDstLocalTileX * 128 + 64;
		int var5 = cutsceneDstLocalTileZ * 128 + 64;
		int var6 = getHeightmapY(currentLevel, var5, var4) - cutsceneDstHeight;
		int var7 = var4 - cameraX;
		int var8 = var6 - cameraY;
		int var9 = var5 - cameraZ;
		int var10 = (int) Math.sqrt(var7 * var7 + var9 * var9);
		int var11 = (int) (Math.atan2(var8, var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2(var7, var9) * -325.949D) & 0x7FF;

		if (var11 < 128) {
			var11 = 128;
		}

		if (var11 > 383) {
			var11 = 383;
		}

		if (cameraPitch < var11) {
			cameraPitch += (var11 - cameraPitch) * cutsceneRotateAcceleration / 1000 + cutsceneRotateSpeed;
			if (cameraPitch > var11) {
				cameraPitch = var11;
			}
		}

		if (cameraPitch > var11) {
			cameraPitch -= (cameraPitch - var11) * cutsceneRotateAcceleration / 1000 + cutsceneRotateSpeed;
			if (cameraPitch < var11) {
				cameraPitch = var11;
			}
		}

		int var13 = var12 - cameraYaw;
		if (var13 > 1024) {
			var13 -= 2048;
		}

		if (var13 < -1024) {
			var13 += 2048;
		}

		if (var13 > 0) {
			cameraYaw += cutsceneRotateAcceleration * var13 / 1000 + cutsceneRotateSpeed;
			cameraYaw &= 0x7FF;
		}

		if (var13 < 0) {
			cameraYaw -= -var13 * cutsceneRotateAcceleration / 1000 + cutsceneRotateSpeed;
			cameraYaw &= 0x7FF;
		}

		int var14 = var12 - cameraYaw;
		if (var14 > 1024) {
			var14 -= 2048;
		}

		if (var14 < -1024) {
			var14 += 2048;
		}

		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			cameraYaw = var12;
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void drawMenu() {
		int var1 = menuX;
		int var2 = menuY;
		int var3 = menuWidth;
		int var4 = menuHeight;
		int var5 = 0x5D5447;
		Pix2D.fillRect(var4, var2, var1, var5, var3);
		Pix2D.fillRect(16, var2 + 1, var1 + 1, 0, var3 - 2);
		Pix2D.drawRect(var1 + 1, var3 - 2, var4 - 19, 0, var2 + 18);
		fontBold12.drawString(var5, "Choose Option", var2 + 14, var1 + 3);
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

		for (int var8 = 0; var8 < menuSize; var8++) {
			int var9 = (menuSize - var8 - 1) * 15 + var2 + 31;
			int var10 = 0xFFFFFF;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 0xFFFF00;
			}

			fontBold12.drawStringTag(true, var1 + 3, var10, menuOption[var8], var9);
		}
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void addFriend(long arg0) {
		if (arg0 != 0L) {
			if (friendCount >= 100 && isMember != 1) {
				addMessage("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
			} else if (friendCount >= 200) {
				addMessage("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
			} else {
				String var3 = JString.toSentenceCase(JString.fromBase37(arg0));
				for (int var4 = 0; var4 < friendCount; var4++) {
					if (friendName37[var4] == arg0) {
						addMessage(var3 + " is already on your friend list", 0, "");
						return;
					}
				}

				for (int var5 = 0; var5 < ignoreCount; var5++) {
					if (ignoreName37[var5] == arg0) {
						addMessage("Please remove " + var3 + " from your ignore list first", 0, "");
						return;
					}
				}

				if (!var3.equals(localPlayer.name)) {
					friendName[friendCount] = var3;
					friendName37[friendCount] = arg0;
					friendWorld[friendCount] = 0;
					friendCount++;
					redrawSidebar = true;
					out.p1isaac(188);
					out.p8(arg0);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIZI)I")
	public final int getHeightmapY(int arg0, int arg1, int arg2) {
		int var4 = arg2 >> 7;
		int var5 = arg1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = arg0;
			if (arg0 < 3 && (levelTileFlags[1][var4][var5] & 0x2) == 2) {
				var6 = arg0 + 1;
			}

			int var7 = arg2 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = (128 - var7) * levelHeightmap[var6][var4][var5] + levelHeightmap[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = (128 - var7) * levelHeightmap[var6][var4][var5 + 1] + levelHeightmap[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return (128 - var8) * var9 + var8 * var10 >> 7;
		}

		return 0;
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public static final String formatObjCount(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		}

		if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		}

		return arg0 / 1000000 + "M";
	}

	@ObfuscatedName("client.d(Z)V")
	public final void logout() {
		try {
			if (stream != null) {
				stream.close();
			}
		} catch (Exception var2) {
		}

		stream = null;
		ingame = false;
		titleScreenState = 0;
		username = "";
		password = "";
		clearCache();
		scene.reset();

		for (int var1 = 0; var1 < 4; var1++) {
			levelCollisionMap[var1].reset();
		}

		System.gc();
		stopMidi();
		nextMidiSong = -1;
		midiSong = -1;
		nextMusicDelay = 0;
	}

	@ObfuscatedName("client.n(I)V")
	public final void validateCharacterDesign() {
		updateDesignModel = true;

		for (int var1 = 0; var1 < 7; var1++) {
			designIdentikits[var1] = -1;
			for (int var2 = 0; var2 < IdkType.count; var2++) {
				if (!IdkType.instances[var2].disable && IdkType.instances[var2].type == var1 + (designGenderMale ? 0 : 7)) {
					designIdentikits[var1] = var2;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILMBMGIXGO;B)V")
	public final void readNewNpcs(int arg0, Packet arg1) {
		while (arg1.bitPos + 21 < arg0 * 8) {
			int var3 = arg1.gBit(14);
			if (var3 == 16383) {
				break;
			}

			if (npcs[var3] == null) {
				npcs[var3] = new NpcEntity();
			}

			NpcEntity var4 = npcs[var3];
			npcIds[npcCount++] = var3;
			var4.cycle = loopCycle;
			int var5 = arg1.gBit(5);
			if (var5 > 15) {
				var5 -= 32;
			}

			int var6 = arg1.gBit(5);
			if (var6 > 15) {
				var6 -= 32;
			}

			int var7 = arg1.gBit(1);
			var4.type = NpcType.get(arg1.gBit(12));
			int var8 = arg1.gBit(1);
			if (var8 == 1) {
				entityUpdateIds[entityUpdateCount++] = var3;
			}

			var4.size = var4.type.size;
			var4.turnSpeed = var4.type.turnspeed;
			var4.seqWalkId = var4.type.walkanim;
			var4.seqTurnAroundId = var4.type.walkanim_b;
			var4.seqTurnLeftId = var4.type.walkanim_r;
			var4.seqTurnRightId = var4.type.walkanim_l;
			var4.seqStandId = var4.type.readyanim;
			var4.move(localPlayer.pathTileX[0] + var6, localPlayer.pathTileZ[0] + var5, var7 == 1);
		}

		arg1.accessBytes();
	}

	@ObfuscatedName("client.c(I)V")
	public final void update() {
		if (!errorStarted && !errorLoading && !errorHost) {
			loopCycle++;

			if (ingame) {
				updateGame();
			} else {
				updateTitle();
			}

			handleOnDemandRequests();
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void pushPlayers(boolean arg0) {
		if (localPlayer.x >> 7 == flagSceneTileX && localPlayer.z >> 7 == flagSceneTileZ) {
			flagSceneTileX = 0;
		}

		int var2 = playerCount;
		if (arg0) {
			var2 = 1;
		}

		for (int var3 = 0; var3 < var2; var3++) {
			PlayerEntity var4;
			int var5;
			if (arg0) {
				var4 = localPlayer;
				var5 = LOCAL_PLAYER_INDEX << 14;
			} else {
				var4 = players[playerIds[var3]];
				var5 = playerIds[var3] << 14;
			}

			if (var4 != null && var4.isVisible()) {
				var4.lowmem = false;
				if ((lowMemory && playerCount > 50 || playerCount > 200) && !arg0 && var4.secondarySeqId == var4.seqStandId) {
					var4.lowmem = true;
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

						var4.y = getHeightmapY(currentLevel, var4.z, var4.x);
						scene.addTemporary(currentLevel, var4.yaw, var4.y, var5, var4.z, 60, var4.x, var4, var4.needsForwardDrawPadding);
					} else {
						var4.lowmem = false;
						var4.y = getHeightmapY(currentLevel, var4.z, var4.x);
						scene.addTemporary(60, currentLevel, var4.z, var4, var4.yaw, var4.maxTileZ, var4.x, var4.y, var4.minTileX, var4.maxTileX, var5, var4.minTileZ);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILDUCMKFAY;)Z")
	public final boolean handleInterfaceAction(Component arg0) {
		int var2 = arg0.clientCode;
		if (friendListStatus == 2) {
			if (var2 == 201) {
				redrawChatback = true;
				chatbackInputOpen = 0;
				showSocialInput = true;
				socialInput = "";
				socialAction = 1;
				socialMessage = "Enter name of friend to add to list";
			}

			if (var2 == 202) {
				redrawChatback = true;
				chatbackInputOpen = 0;
				showSocialInput = true;
				socialInput = "";
				socialAction = 2;
				socialMessage = "Enter name of friend to delete from list";
			}
		}

		if (var2 == 205) {
			idleTimeout = 250;
			return true;
		}

		if (var2 == 501) {
			redrawChatback = true;
			chatbackInputOpen = 0;
			showSocialInput = true;
			socialInput = "";
			socialAction = 4;
			socialMessage = "Enter name of player to add to list";
		}

		if (var2 == 502) {
			redrawChatback = true;
			chatbackInputOpen = 0;
			showSocialInput = true;
			socialInput = "";
			socialAction = 5;
			socialMessage = "Enter name of player to delete from list";
		}

		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = designIdentikits[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = IdkType.count - 1;
						}
					}

					if (var4 == 1) {
						var5++;
						if (var5 >= IdkType.count) {
							var5 = 0;
						}
					}

					if (!IdkType.instances[var5].disable && IdkType.instances[var5].type == var3 + (designGenderMale ? 0 : 7)) {
						break;
					}
				}

				designIdentikits[var3] = var5;
				updateDesignModel = true;
			}
		}

		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = designColors[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = DESIGN_BODY_COLOR[var6].length - 1;
				}
			}

			if (var7 == 1) {
				var8++;
				if (var8 >= DESIGN_BODY_COLOR[var6].length) {
					var8 = 0;
				}
			}

			designColors[var6] = var8;
			updateDesignModel = true;
		}

		if (var2 == 324 && !designGenderMale) {
			designGenderMale = true;
			validateCharacterDesign();
		}

		if (var2 == 325 && designGenderMale) {
			designGenderMale = false;
			validateCharacterDesign();
		}

		if (var2 == 326) {
			out.p1isaac(101);
			out.p1(designGenderMale ? 0 : 1);

			for (int var9 = 0; var9 < 7; var9++) {
				out.p1(designIdentikits[var9]);
			}

			for (int var10 = 0; var10 < 5; var10++) {
				out.p1(designColors[var10]);
			}

			return true;
		}

		if (var2 == 613) {
			reportAbuseMuteOption = !reportAbuseMuteOption;
		}

		if (var2 >= 601 && var2 <= 612) {
			closeInterfaces();

			if (reportAbuseInput.length() > 0) {
				out.p1isaac(218);
				out.p8(JString.toBase37(reportAbuseInput));
				out.p1(var2 - 601);
				out.p1(reportAbuseMuteOption ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.a(IBLMBMGIXGO;)V")
	public final void readPlayerUpdates(int arg0, Packet arg1) {
		for (int var3 = 0; var3 < entityUpdateCount; var3++) {
			int var4 = entityUpdateIds[var3];
			PlayerEntity var5 = players[var4];
			int var6 = arg1.g1();
			if ((var6 & 0x40) != 0) {
				var6 += arg1.g1() << 8;
			}

			readPlayerUpdates(var6, var4, arg1, var5);
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void drawMinimapLoc(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = scene.getWallBitset(arg4, arg2, arg0);
		if (var6 != 0) {
			int var7 = scene.getInfo(arg4, arg2, arg0, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg1;
			if (var6 > 0) {
				var10 = arg3;
			}

			int[] var11 = imageMinimap.pixels;
			int var12 = (103 - arg0) * 512 * 4 + arg2 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			LocType var14 = LocType.get(var13);
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
				Pix8 var15 = imageMapscene[var14.mapscene];
				if (var15 != null) {
					int var16 = (var14.width * 4 - var15.cropRight) / 2;
					int var17 = (var14.length * 4 - var15.cropBottom) / 2;
					var15.draw(arg2 * 4 + var16 + 48, (104 - arg0 - var14.length) * 4 + 48 + var17);
				}
			}
		}

		int var18 = scene.getLocBitset(arg4, arg2, arg0);
		if (var18 != 0) {
			int var19 = scene.getInfo(arg4, arg2, arg0, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			LocType var23 = LocType.get(var22);
			if (var23.mapscene != -1) {
				Pix8 var24 = imageMapscene[var23.mapscene];
				if (var24 != null) {
					int var25 = (var23.width * 4 - var24.cropRight) / 2;
					int var26 = (var23.length * 4 - var24.cropBottom) / 2;
					var24.draw(arg2 * 4 + var25 + 48, (104 - arg0 - var23.length) * 4 + 48 + var26);
				}
			} else if (var21 == 9) {
				int var27 = 0xEEEEEE;
				if (var18 > 0) {
					var27 = 0xEE0000;
				}

				int[] var28 = imageMinimap.pixels;
				int var29 = (103 - arg0) * 512 * 4 + arg2 * 4 + 24624;
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

		int var30 = scene.getGroundDecorationBitset(arg4, arg2, arg0);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			LocType var32 = LocType.get(var31);
			if (var32.mapscene != -1) {
				Pix8 var33 = imageMapscene[var32.mapscene];
				if (var33 != null) {
					int var34 = (var32.width * 4 - var33.cropRight) / 2;
					int var35 = (var32.length * 4 - var33.cropBottom) / 2;
					var33.draw(arg2 * 4 + var34 + 48, (104 - arg0 - var32.length) * 4 + 48 + var35);
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void loadTitleImages() {
		imageTitlebox = new Pix8(archiveTitle, "titlebox", 0);
		imageTitlebutton = new Pix8(archiveTitle, "titlebutton", 0);
		imageRunes = new Pix8[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}

		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				imageRunes[var2] = new Pix8(archiveTitle, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				imageRunes[var3] = new Pix8(archiveTitle, "runes", (var3 & 0x3) + 12);
			}
		}

		imageFlamesLeft = new Pix32(128, 265);
		imageFlamesRight = new Pix32(128, 265);

		for (int var4 = 0; var4 < 33920; var4++) {
			imageFlamesLeft.pixels[var4] = imageTitle0.data[var4];
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			imageFlamesRight.pixels[var5] = imageTitle1.data[var5];
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
		updateFlameBuffer(null);
		flameBuffer3 = new int[32768];
		flameBuffer2 = new int[32768];
		drawProgress(10, "Connecting to fileserver");

		if (!flameActive) {
			flamesThread = true;
			flameActive = true;
			startThread(this, 2);
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public static final void setHighMemory() {
		World3D.lowMemory = false;
		Pix3D.lowMemory = false;
		lowMemory = false;
		World.lowMemory = false;
		LocType.lowMemory = false;
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 317);

			if (arg0.length == 5) {
				nodeId = Integer.parseInt(arg0[0]);
				portOffset = Integer.parseInt(arg0[1]);

				if (arg0[2].equals("lowmem")) {
					setLowMemory();
				} else if (arg0[2].equals("highmem")) {
					setHighMemory();
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
				var1.initApplication(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void updateSceneState() {
		if (lowMemory && sceneState == 2 && World.levelBuilt != currentLevel) {
			areaViewport.bind();
			fontPlain12.drawStringCenter(0, "Loading - please wait.", 151, 257);
			fontPlain12.drawStringCenter(0xFFFFFF, "Loading - please wait.", 150, 256);
			areaViewport.draw(4, graphics, 4);
			sceneState = 1;
			sceneLoadStartTime = System.currentTimeMillis();
		}

		if (sceneState == 1) {
			int var1 = checkScene();
			if (var1 != 0 && System.currentTimeMillis() - sceneLoadStartTime > 360000L) {
				signlink.reporterror(username + " glcfb " + serverSeed + "," + var1 + "," + lowMemory + "," + fileStreams[0] + "," + ondemand.remaining() + "," + currentLevel + "," + sceneCenterZoneX + "," + sceneCenterZoneZ);
				sceneLoadStartTime = System.currentTimeMillis();
			}
		}

		if (sceneState == 2 && minimapLevel != currentLevel) {
			minimapLevel = currentLevel;
			createMinimap(currentLevel);
		}
	}

	@ObfuscatedName("client.f(B)I")
	public final int checkScene() {
		for (int var1 = 0; var1 < sceneMapLandData.length; var1++) {
			if (sceneMapLandData[var1] == null && sceneMapLandFile[var1] != -1) {
				return -1;
			}

			if (sceneMapLocData[var1] == null && sceneMapLocFile[var1] != -1) {
				return -2;
			}
		}

		boolean var2 = true;
		for (int var3 = 0; var3 < sceneMapLandData.length; var3++) {
			byte[] var4 = sceneMapLocData[var3];
			if (var4 != null) {
				int var5 = (sceneMapIndex[var3] >> 8) * 64 - sceneBaseTileX;
				int var6 = (sceneMapIndex[var3] & 0xFF) * 64 - sceneBaseTileZ;
				if (sceneInstanced) {
					var5 = 10;
					var6 = 10;
				}

				var2 &= World.validateLocs(var5, var4, var6);
			}
		}

		if (!var2) {
			return -3;
		} else if (awaitingSync) {
			return -4;
		} else {
			sceneState = 2;
			World.levelBuilt = currentLevel;
			buildScene();
			out.p1isaac(121);
			return 0;
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void pushProjectiles() {
		for (ProjectileEntity var1 = (ProjectileEntity) projectiles.head(); var1 != null; var1 = (ProjectileEntity) projectiles.next()) {
			if (currentLevel != var1.level || loopCycle > var1.endCycle) {
				var1.unlink();
			} else if (loopCycle >= var1.startCycle) {
				if (var1.target > 0) {
					NpcEntity var2 = npcs[var1.target - 1];
					if (var2 != null && var2.x >= 0 && var2.x < 13312 && var2.z >= 0 && var2.z < 13312) {
						var1.updateVelocity(loopCycle, var2.z, getHeightmapY(var1.level, var2.z, var2.x) - var1.offsetY, var2.x);
					}
				}

				if (var1.target < 0) {
					int var3 = -var1.target - 1;
					PlayerEntity var4;
					if (localPid == var3) {
						var4 = localPlayer;
					} else {
						var4 = players[var3];
					}

					if (var4 != null && var4.x >= 0 && var4.x < 13312 && var4.z >= 0 && var4.z < 13312) {
						var1.updateVelocity(loopCycle, var4.z, getHeightmapY(var1.level, var4.z, var4.x) - var1.offsetY, var4.x);
					}
				}

				var1.update(sceneDelta);
				scene.addTemporary(currentLevel, var1.yaw, (int) var1.y, -1, (int) var1.z, 60, (int) var1.x, var1, false);
			}
		}
	}

	public final AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}

		return super.getAppletContext();
	}

	@ObfuscatedName("client.r(I)V")
	public final void loadTitleBackground() {
		byte[] var1 = archiveTitle.read("title.dat", null);
		Pix32 var2 = new Pix32(var1, this);
		imageTitle0.bind();
		var2.blitOpaque(0, 0);
		imageTitle1.bind();
		var2.blitOpaque(-637, 0);
		imageTitle2.bind();
		var2.blitOpaque(-128, 0);
		imageTitle3.bind();
		var2.blitOpaque(-202, -371);
		imageTitle4.bind();
		var2.blitOpaque(-202, -171);
		imageTitle5.bind();
		var2.blitOpaque(0, -265);
		imageTitle6.bind();
		var2.blitOpaque(-562, -265);
		imageTitle7.bind();
		var2.blitOpaque(-128, -171);
		imageTitle8.bind();
		var2.blitOpaque(-562, -171);
		int[] var3 = new int[var2.cropRight];
		for (int var4 = 0; var4 < var2.cropBottom; var4++) {
			for (int var5 = 0; var5 < var2.cropRight; var5++) {
				var3[var5] = var2.pixels[var2.cropRight * var4 + var2.cropRight - var5 - 1];
			}

			for (int var6 = 0; var6 < var2.cropRight; var6++) {
				var2.pixels[var2.cropRight * var4 + var6] = var3[var6];
			}
		}

		imageTitle0.bind();
		var2.blitOpaque(382, 0);
		imageTitle1.bind();
		var2.blitOpaque(-255, 0);
		imageTitle2.bind();
		var2.blitOpaque(254, 0);
		imageTitle3.bind();
		var2.blitOpaque(180, -371);
		imageTitle4.bind();
		var2.blitOpaque(180, -171);
		imageTitle5.bind();
		var2.blitOpaque(382, -265);
		imageTitle6.bind();
		var2.blitOpaque(-180, -265);
		imageTitle7.bind();
		var2.blitOpaque(254, -171);
		imageTitle8.bind();
		var2.blitOpaque(-180, -171);
		Pix32 var7 = new Pix32(archiveTitle, "logo", 0);
		imageTitle2.bind();
		var7.draw(382 - var7.cropRight / 2 - 128, 18);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.f(Z)V")
	public final void handleOnDemandRequests() {
		while (true) {
			OnDemandRequest var1 = ondemand.poll();
			if (var1 == null) {
				return;
			}

			if (var1.archive == 0) {
				Model.unpack(var1.data, var1.file);

				if ((ondemand.getModelFlags(var1.file) & 0x62) != 0) {
					redrawSidebar = true;

					if (chatInterfaceId != -1) {
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
				for (int var2 = 0; var2 < sceneMapLandData.length; var2++) {
					if (sceneMapLandFile[var2] == var1.file) {
						sceneMapLandData[var2] = var1.data;

						if (var1.data == null) {
							sceneMapLandFile[var2] = -1;
						}

						break;
					}

					if (sceneMapLocFile[var2] == var1.file) {
						sceneMapLocData[var2] = var1.data;

						if (var1.data == null) {
							sceneMapLocFile[var2] = -1;
						}

						break;
					}
				}
			}

			if (var1.archive == 93 && ondemand.hasMapLocFile(var1.file)) {
				World.prefetchLocs(new Packet(var1.data), ondemand);
			}
		}
	}

	@ObfuscatedName("client.s(I)V")
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

		flameCycle0 += 128;
		if (flameCycle0 > flameBuffer0.length) {
			flameCycle0 -= flameBuffer0.length;
			int var11 = (int) (Math.random() * 12.0D);
			updateFlameBuffer(imageRunes[var11]);
		}

		for (int var12 = 1; var12 < var1 - 1; var12++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var12 << 7) + var13;
				int var15 = flameBuffer2[var14 + 128] - flameBuffer0[flameCycle0 + var14 & flameBuffer0.length - 1] / 5;
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

	@ObfuscatedName("client.a([BBI)Z")
	public final boolean saveWave(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}

		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.a(IB)V")
	public final void resetInterfaceAnimation(int arg0) {
		Component var2 = Component.instances[arg0];
		for (int var3 = 0; var3 < var2.children.length && var2.children[var3] != -1; var3++) {
			Component var4 = Component.instances[var2.children[var3]];
			if (var4.type == 1) {
				resetInterfaceAnimation(var4.id);
			}

			var4.animFrame = 0;
			var4.animCycle = 0;
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void drawTileHint() {
		if (hintType == 2) {
			projectFromGround((hintTileX - sceneBaseTileX << 7) + hintOffsetX, hintHeight * 2, (hintTileZ - sceneBaseTileZ << 7) + hintOffsetZ);

			if (projectX > -1 && loopCycle % 20 < 10) {
				imageHeadicons[2].draw(projectX - 12, projectY - 28);
			}
		}
	}

	@ObfuscatedName("client.u(I)V")
	public final void updateGame() {
		if (systemUpdateTimer > 1) {
			systemUpdateTimer--;
		}

		if (idleTimeout > 0) {
			idleTimeout--;
		}

		for (int var1 = 0; var1 < 5 && read(); var1++) {
		}

		if (ingame) {
			synchronized (mouseTracking.lock) {
				if (!flagged) {
					mouseTracking.length = 0;
				} else if (mouseClickButton != 0 || mouseTracking.length >= 40) {
					out.p1isaac(45);
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

						if (lastWriteX != var7 || lastWriteY != var6) {
							int var9 = var7 - lastWriteX;
							lastWriteX = var7;
							int var10 = var6 - lastWriteY;
							lastWriteY = var6;

							if (lastWriteDuplicates < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								out.p2((lastWriteDuplicates << 12) + (var9 << 6) + var10);
								lastWriteDuplicates = 0;
							} else if (lastWriteDuplicates < 8) {
								out.p3((lastWriteDuplicates << 19) + var8 + 0x800000);
								lastWriteDuplicates = 0;
							} else {
								out.p4((lastWriteDuplicates << 19) + var8 - 0x40000000);
								lastWriteDuplicates = 0;
							}
						} else if (lastWriteDuplicates < 2047) {
							lastWriteDuplicates++;
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
				long var12 = (mouseClickTime - prevMousePressTime) / 50L;
				if (var12 > 4095L) {
					var12 = 4095L;
				}

				prevMousePressTime = mouseClickTime;
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
				out.p1isaac(241);
				out.p4((var17 << 19) + (var18 << 20) + var16);
			}

			if (sendCameraDelay > 0) {
				sendCameraDelay--;
			}

			if (actionKey[1] == 1 || actionKey[2] == 1 || actionKey[3] == 1 || actionKey[4] == 1) {
				sendCamera = true;
			}

			if (sendCamera && sendCameraDelay <= 0) {
				sendCameraDelay = 20;
				sendCamera = false;
				out.p1isaac(86);
				out.p2(orbitCameraPitch);
				out.p2_alt2(orbitCameraYaw);
			}

			if (hasFocus && !focused) {
				focused = true;
				out.p1isaac(3);
				out.p1(1);
			}

			if (!hasFocus && focused) {
				focused = false;
				out.p1isaac(3);
				out.p1(0);
			}

			updateSceneState();
			updateTemporaryLocs();
			updateAudio();
			idleNetCycles++;
			if (idleNetCycles > 750) {
				tryReconnect();
			}

			updatePlayers();
			updateNpcs();
			updateEntityChats();
			sceneDelta++;

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
				objDragCycles++;

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

					if (objGrabThreshold && objDragCycles >= 5) {
						hoveredSlotParentId = -1;
						handleInput();

						if (objDragInterfaceId == hoveredSlotParentId && objDragSlot != hoveredSlot) {
							Component var19 = Component.instances[objDragInterfaceId];
							byte var20 = 0;
							if (bankArrangeMode == 1 && var19.clientCode == 206) {
								var20 = 1;
							}

							if (var19.invSlotObjId[hoveredSlot] <= 0) {
								var20 = 0;
							}

							if (var19.swappable) {
								int var21 = objDragSlot;
								int var22 = hoveredSlot;
								var19.invSlotObjId[var22] = var19.invSlotObjId[var21];
								var19.invSlotObjCount[var22] = var19.invSlotObjCount[var21];
								var19.invSlotObjId[var21] = -1;
								var19.invSlotObjCount[var21] = 0;
							} else if (var20 == 1) {
								int var23 = objDragSlot;
								int var24 = hoveredSlot;
								while (var23 != var24) {
									if (var23 > var24) {
										var19.swapObj(var23, var23 - 1);
										var23--;
									} else if (var23 < var24) {
										var19.swapObj(var23, var23 + 1);
										var23++;
									}
								}
							} else {
								var19.swapObj(objDragSlot, hoveredSlot);
							}

							out.p1isaac(214);
							out.p2_alt3(objDragInterfaceId);
							out.p1_alt2(var20);
							out.p2_alt3(objDragSlot);
							out.p2_alt1(hoveredSlot);
						}
					} else if ((mouseButtonsOption == 1 || isAddFriendOption(menuSize - 1)) && menuSize > 2) {
						showContextMenu();
					} else if (menuSize > 0) {
						useMenuOption(menuSize - 1);
					}

					selectedCycle = 10;
					mouseClickButton = 0;
				}
			}

			if (World3D.clickTileX != -1) {
				int var25 = World3D.clickTileX;
				int var26 = World3D.clickTileZ;
				boolean var27 = tryMove(0, 0, 0, 0, localPlayer.pathTileZ[0], 0, 0, var26, localPlayer.pathTileX[0], true, var25);
				World3D.clickTileX = -1;

				if (var27) {
					crossX = mouseClickX;
					crossY = mouseClickY;
					crossMode = 1;
					crossCycle = 0;
				}
			}

			if (mouseClickButton == 1 && modalMessage != null) {
				modalMessage = null;
				redrawChatback = true;
				mouseClickButton = 0;
			}

			handleMouseInput();
			handleMinimapInput();
			handleTabInput();
			handleChatSettingsInput();

			if (mouseButton == 1 || mouseClickButton == 1) {
				dragCycles++;
			}

			if (sceneState == 2) {
				updateOrbitCamera();
			}

			if (sceneState == 2 && cutscene) {
				applyCutscene();
			}

			for (int var28 = 0; var28 < 5; var28++) {
				cameraModifierCycle[var28]++;
			}

			handleInputKey();
			idleCycles++;
			if (idleCycles > 4500) {
				idleTimeout = 250;
				idleCycles -= 500;
				out.p1isaac(202);
			}

			cameraOffsetCycle++;
			if (cameraOffsetCycle > 500) {
				cameraOffsetCycle = 0;
				int var29 = (int) (Math.random() * 8.0D);
				if ((var29 & 0x1) == 1) {
					cameraAnticheatOffsetX += cameraOffsetXModifier;
				}

				if ((var29 & 0x2) == 2) {
					cameraAnticheatOffsetZ += cameraOffsetZModifier;
				}

				if ((var29 & 0x4) == 4) {
					cameraAnticheatAngle += cameraOffsetYawModifier;
				}
			}

			if (cameraAnticheatOffsetX < -50) {
				cameraOffsetXModifier = 2;
			}

			if (cameraAnticheatOffsetX > 50) {
				cameraOffsetXModifier = -2;
			}

			if (cameraAnticheatOffsetZ < -55) {
				cameraOffsetZModifier = 2;
			}

			if (cameraAnticheatOffsetZ > 55) {
				cameraOffsetZModifier = -2;
			}

			if (cameraAnticheatAngle < -40) {
				cameraOffsetYawModifier = 1;
			}

			if (cameraAnticheatAngle > 40) {
				cameraOffsetYawModifier = -1;
			}

			minimapOffsetCycle++;
			if (minimapOffsetCycle > 500) {
				minimapOffsetCycle = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 1) {
					minimapAnticheatAngle += minimapAngleModifier;
				}

				if ((var30 & 0x2) == 2) {
					minimapZoom += minimapZoomModifier;
				}
			}

			if (minimapAnticheatAngle < -60) {
				minimapAngleModifier = 2;
			}

			if (minimapAnticheatAngle > 60) {
				minimapAngleModifier = -2;
			}

			if (minimapZoom < -20) {
				minimapZoomModifier = 1;
			}

			if (minimapZoom > 10) {
				minimapZoomModifier = -1;
			}

			heartbeatTimer++;
			if (heartbeatTimer > 50) {
				out.p1isaac(0);
			}

			try {
				if (stream != null && out.pos > 0) {
					stream.write(out.pos, out.data, 0);
					out.pos = 0;
					heartbeatTimer = 0;
				}
			} catch (IOException var32) {
				tryReconnect();
			} catch (Exception var33) {
				logout();
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void clearTemporaryLocs() {
		for (LocAddEntity var1 = (LocAddEntity) temporaryLocs.head(); var1 != null; var1 = (LocAddEntity) temporaryLocs.next()) {
			if (var1.duration == -1) {
				var1.delay = 0;
				storeLoc(var1);
			} else {
				var1.unlink();
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void loadTitle() {
		if (imageTitle2 == null) {
			drawArea = null;
			areaChatback = null;
			areaMapback = null;
			areaSidebar = null;
			areaViewport = null;
			areaBackbase1 = null;
			areaBackbase2 = null;
			areaBackhmid1 = null;
			imageTitle0 = new PixMap(128, 265, getBaseComponent());
			Pix2D.clear();
			imageTitle1 = new PixMap(128, 265, getBaseComponent());
			Pix2D.clear();
			imageTitle2 = new PixMap(509, 171, getBaseComponent());
			Pix2D.clear();
			imageTitle3 = new PixMap(360, 132, getBaseComponent());
			Pix2D.clear();
			imageTitle4 = new PixMap(360, 200, getBaseComponent());
			Pix2D.clear();
			imageTitle5 = new PixMap(202, 238, getBaseComponent());
			Pix2D.clear();
			imageTitle6 = new PixMap(203, 238, getBaseComponent());
			Pix2D.clear();
			imageTitle7 = new PixMap(74, 94, getBaseComponent());
			Pix2D.clear();
			imageTitle8 = new PixMap(75, 94, getBaseComponent());
			Pix2D.clear();

			if (archiveTitle != null) {
				loadTitleBackground();
				loadTitleImages();
			}

			redrawTitleBackground = true;
		}
	}

	@ObfuscatedName("client.a(IBLjava/lang/String;)V")
	public final void drawProgress(int arg0, String arg1) {
		lastProgressPercent = arg0;
		lastProgressMessage = arg1;
		loadTitle();

		if (archiveTitle == null) {
			super.drawProgress(arg0, arg1);
		} else {
			imageTitle4.bind();
			short var3 = 360;
			short var4 = 200;
			byte var5 = 20;
			fontBold12.drawStringCenter(0xFFFFFF, "RuneScape is loading - please wait...", var4 / 2 - var5 - 26, var3 / 2);
			int var6 = var4 / 2 - var5 - 18;
			Pix2D.drawRect(var3 / 2 - 152, 304, 34, 0x8C1111, var6);
			Pix2D.drawRect(var3 / 2 - 151, 302, 32, 0, var6 + 1);
			Pix2D.fillRect(30, var6 + 2, var3 / 2 - 150, 0x8C1111, arg0 * 3);
			Pix2D.fillRect(30, var6 + 2, arg0 * 3 + (var3 / 2 - 150), 0, 300 - arg0 * 3);
			fontBold12.drawStringCenter(0xFFFFFF, arg1, var4 / 2 + 5 - var5, var3 / 2);
			imageTitle4.draw(171, graphics, 202);

			if (redrawTitleBackground) {
				redrawTitleBackground = false;

				if (!flameActive) {
					imageTitle0.draw(0, graphics, 0);
					imageTitle1.draw(0, graphics, 637);
				}

				imageTitle2.draw(0, graphics, 128);
				imageTitle3.draw(371, graphics, 202);
				imageTitle5.draw(265, graphics, 0);
				imageTitle6.draw(265, graphics, 562);
				imageTitle7.draw(171, graphics, 128);
				imageTitle8.draw(171, graphics, 562);
			}
		}
	}

	@ObfuscatedName("client.a(IIIILDUCMKFAY;IZII)V")
	public final void handleScrollInput(int arg0, int arg1, int arg2, int arg3, Component arg4, int arg5, boolean arg6, int arg7) {
		if (scrollGrabbed) {
			scrollInputPadding = 32;
		} else {
			scrollInputPadding = 0;
		}

		scrollGrabbed = false;
		if (arg2 >= arg0 && arg2 < arg0 + 16 && arg3 >= arg5 && arg3 < arg5 + 16) {
			arg4.scrollPosition -= dragCycles * 4;

			if (arg6) {
				redrawSidebar = true;
				return;
			}
		} else if (arg2 >= arg0 && arg2 < arg0 + 16 && arg3 >= arg1 + arg5 - 16 && arg3 < arg1 + arg5) {
			arg4.scrollPosition += dragCycles * 4;

			if (arg6) {
				redrawSidebar = true;
				return;
			}
		} else if (arg2 >= arg0 - scrollInputPadding && arg2 < arg0 + scrollInputPadding + 16 && arg3 >= arg5 + 16 && arg3 < arg1 + arg5 - 16 && dragCycles > 0) {
			int var9 = (arg1 - 32) * arg1 / arg7;
			if (var9 < 8) {
				var9 = 8;
			}

			int var10 = arg3 - arg5 - var9 / 2 - 16;
			int var11 = arg1 - var9 - 32;
			arg4.scrollPosition = (arg7 - arg1) * var10 / var11;

			if (arg6) {
				redrawSidebar = true;
			}

			scrollGrabbed = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(IIII)Z")
	public final boolean interactWithLoc(int arg0, int arg1, int arg2) {
		int var4 = arg0 >> 14 & 0x7FFF;
		int var5 = scene.getInfo(currentLevel, arg2, arg1, arg0);
		if (var5 == -1) {
			return false;
		}

		int var6 = var5 & 0x1F;
		int var7 = var5 >> 6 & 0x3;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			LocType var8 = LocType.get(var4);
			int var9;
			int var10;
			if (var7 == 0 || var7 == 2) {
				var9 = var8.width;
				var10 = var8.length;
			} else {
				var9 = var8.length;
				var10 = var8.width;
			}

			int var11 = var8.forceapproach;
			if (var7 != 0) {
				var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
			}

			tryMove(2, 0, var10, 0, localPlayer.pathTileZ[0], var9, var11, arg1, localPlayer.pathTileX[0], false, arg2);
		} else {
			tryMove(2, var7, 0, var6 + 1, localPlayer.pathTileZ[0], 0, 0, arg1, localPlayer.pathTileX[0], false, arg2);
		}

		crossX = mouseClickX;
		crossY = mouseClickY;
		crossMode = 2;
		crossCycle = 0;
		return true;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;IBI)LXTGLDHGX;")
	public final Jagfile loadArchive(int arg0, String arg1, String arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;

		try {
			if (fileStreams[0] != null) {
				var6 = fileStreams[0].read(arg0);
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
			return new Jagfile(var6);
		}

		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			drawProgress(arg4, "Requesting " + arg1);
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
						drawProgress(arg4, "Loading " + arg1 + " - " + var22 + "%");
					}

					var13 = var22;
				}

				var14.close();

				try {
					if (fileStreams[0] != null) {
						fileStreams[0].write(var6.length, var6, arg0);
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
						drawProgress(arg4, "Game updated - please reload page");
						var25 = 10;
					} else {
						drawProgress(arg4, var11 + " - Retrying in " + var25);
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

		return new Jagfile(var6);
	}

	@ObfuscatedName("client.x(I)V")
	public final void tryReconnect() {
		if (idleTimeout > 0) {
			logout();
		} else {
			areaViewport.bind();
			fontPlain12.drawStringCenter(0, "Connection lost", 144, 257);
			fontPlain12.drawStringCenter(0xFFFFFF, "Connection lost", 143, 256);
			fontPlain12.drawStringCenter(0, "Please wait - attempting to reestablish", 159, 257);
			fontPlain12.drawStringCenter(0xFFFFFF, "Please wait - attempting to reestablish", 158, 256);
			areaViewport.draw(4, graphics, 4);
			minimapState = 0;
			flagSceneTileX = 0;
			ClientStream var1 = stream;
			ingame = false;
			loginAttempts = 0;
			login(username, password, true);

			if (!ingame) {
				logout();
			}

			try {
				var1.close();
			} catch (Exception var2) {
			}
		}
	}

	@ObfuscatedName("client.b(IZ)V")
	public final void useMenuOption(int arg0) {
		if (arg0 >= 0) {
			if (chatbackInputOpen != 0) {
				chatbackInputOpen = 0;
				redrawChatback = true;
			}

			int var2 = menuParamB[arg0];
			int var3 = menuParamC[arg0];
			int var4 = menuAction[arg0];
			int var5 = menuParamA[arg0];

			if (var4 >= 2000) {
				var4 -= 2000;
			}

			if (var4 == 582) {
				NpcEntity var6 = npcs[var5];
				if (var6 != null) {
					tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var6.pathTileZ[0], localPlayer.pathTileX[0], false, var6.pathTileX[0]);
					crossX = mouseClickX;
					crossY = mouseClickY;
					crossMode = 2;
					crossCycle = 0;
					out.p1isaac(57);
					out.p2_alt2(_flowObfuscator46);
					out.p2_alt2(var5);
					out.p2_alt1(objSelectedSlot);
					out.p2_alt2(objSelectedInterface);
				}
			}

			if (var4 == 234) {
				boolean var7 = tryMove(2, 0, 0, 0, localPlayer.pathTileZ[0], 0, 0, var3, localPlayer.pathTileX[0], false, var2);
				if (!var7) {
					tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var3, localPlayer.pathTileX[0], false, var2);
				}

				crossX = mouseClickX;
				crossY = mouseClickY;
				crossMode = 2;
				crossCycle = 0;
				out.p1isaac(236);
				out.p2_alt1(sceneBaseTileZ + var3);
				out.p2(var5);
				out.p2_alt1(sceneBaseTileX + var2);
			}

			if (var4 == 62 && interactWithLoc(var5, var3, var2)) {
				out.p1isaac(192);
				out.p2(objSelectedInterface);
				out.p2_alt1(var5 >> 14 & 0x7FFF);
				out.p2_alt3(sceneBaseTileZ + var3);
				out.p2_alt1(objSelectedSlot);
				out.p2_alt3(sceneBaseTileX + var2);
				out.p2(_flowObfuscator46);
			}

			if (var4 == 511) {
				boolean var9 = tryMove(2, 0, 0, 0, localPlayer.pathTileZ[0], 0, 0, var3, localPlayer.pathTileX[0], false, var2);
				if (!var9) {
					tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var3, localPlayer.pathTileX[0], false, var2);
				}

				crossX = mouseClickX;
				crossY = mouseClickY;
				crossMode = 2;
				crossCycle = 0;
				out.p1isaac(25);
				out.p2_alt1(objSelectedInterface);
				out.p2_alt2(_flowObfuscator46);
				out.p2(var5);
				out.p2_alt2(sceneBaseTileZ + var3);
				out.p2_alt3(objSelectedSlot);
				out.p2(sceneBaseTileX + var2);
			}

			if (var4 == 74) {
				out.p1isaac(122);
				out.p2_alt3(var3);
				out.p2_alt2(var2);
				out.p2_alt1(var5);
				selectedCycle = 0;
				selectedInterface = var3;
				selectedItem = var2;
				selectedArea = 2;
				if (Component.instances[var3].layer == viewportInterfaceId) {
					selectedArea = 1;
				}

				if (Component.instances[var3].layer == chatInterfaceId) {
					selectedArea = 3;
				}
			}

			if (var4 == 315) {
				Component var11 = Component.instances[var3];
				boolean var12 = true;
				if (var11.clientCode > 0) {
					var12 = handleInterfaceAction(var11);
				}

				if (var12) {
					out.p1isaac(185);
					out.p2(var3);
				}
			}

			if (var4 == 561) {
				PlayerEntity var13 = players[var5];
				if (var13 != null) {
					tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var13.pathTileZ[0], localPlayer.pathTileX[0], false, var13.pathTileX[0]);
					crossX = mouseClickX;
					crossY = mouseClickY;
					crossMode = 2;
					crossCycle = 0;
					oplogic6 += var5;
					if (oplogic6 >= 90) {
						out.p1isaac(136);
						oplogic6 = 0;
					}

					out.p1isaac(128);
					out.p2(var5);
				}
			}

			if (var4 == 20) {
				NpcEntity var14 = npcs[var5];
				if (var14 != null) {
					tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var14.pathTileZ[0], localPlayer.pathTileX[0], false, var14.pathTileX[0]);
					crossX = mouseClickX;
					crossY = mouseClickY;
					crossMode = 2;
					crossCycle = 0;
					out.p1isaac(155);
					out.p2_alt1(var5);
				}
			}

			if (var4 == 779) {
				PlayerEntity var15 = players[var5];
				if (var15 != null) {
					tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var15.pathTileZ[0], localPlayer.pathTileX[0], false, var15.pathTileX[0]);
					crossX = mouseClickX;
					crossY = mouseClickY;
					crossMode = 2;
					crossCycle = 0;
					out.p1isaac(153);
					out.p2_alt1(var5);
				}
			}

			if (var4 == 516) {
				if (menuVisible) {
					scene.click(var3 - 4, var2 - 4);
				} else {
					scene.click(mouseClickY - 4, mouseClickX - 4);
				}
			}

			if (var4 == 1062) {
				oplogic5 += sceneBaseTileX;
				if (oplogic5 >= 113) {
					out.p1isaac(183);
					out.p3(0xE63271);
					oplogic5 = 0;
				}

				interactWithLoc(var5, var3, var2);
				out.p1isaac(228);
				out.p2_alt2(var5 >> 14 & 0x7FFF);
				out.p2_alt2(sceneBaseTileZ + var3);
				out.p2(sceneBaseTileX + var2);
			}

			if (var4 == 679 && !pressedContinueOption) {
				out.p1isaac(40);
				out.p2(var3);
				pressedContinueOption = true;
			}

			if (var4 == 431) {
				out.p1isaac(129);
				out.p2_alt2(var2);
				out.p2(var3);
				out.p2_alt2(var5);
				selectedCycle = 0;
				selectedInterface = var3;
				selectedItem = var2;
				selectedArea = 2;
				if (Component.instances[var3].layer == viewportInterfaceId) {
					selectedArea = 1;
				}

				if (Component.instances[var3].layer == chatInterfaceId) {
					selectedArea = 3;
				}
			}

			if (var4 == 337 || var4 == 42 || var4 == 792 || var4 == 322) {
				String var16 = menuOption[arg0];
				int var17 = var16.indexOf("@whi@");
				if (var17 != -1) {
					long var18 = JString.toBase37(var16.substring(var17 + 5).trim());
					if (var4 == 337) {
						addFriend(var18);
					}

					if (var4 == 42) {
						addIgnore(var18);
					}

					if (var4 == 792) {
						removeFriend(var18);
					}

					if (var4 == 322) {
						removeIgnore(var18);
					}
				}
			}

			if (var4 == 53) {
				out.p1isaac(135);
				out.p2_alt1(var2);
				out.p2_alt2(var3);
				out.p2_alt1(var5);
				selectedCycle = 0;
				selectedInterface = var3;
				selectedItem = var2;
				selectedArea = 2;
				if (Component.instances[var3].layer == viewportInterfaceId) {
					selectedArea = 1;
				}

				if (Component.instances[var3].layer == chatInterfaceId) {
					selectedArea = 3;
				}
			}

			if (var4 == 539) {
				out.p1isaac(16);
				out.p2_alt2(var5);
				out.p2_alt3(var2);
				out.p2_alt3(var3);
				selectedCycle = 0;
				selectedInterface = var3;
				selectedItem = var2;
				selectedArea = 2;
				if (Component.instances[var3].layer == viewportInterfaceId) {
					selectedArea = 1;
				}

				if (Component.instances[var3].layer == chatInterfaceId) {
					selectedArea = 3;
				}
			}

			if (var4 == 484 || var4 == 6) {
				String var20 = menuOption[arg0];
				int var21 = var20.indexOf("@whi@");
				if (var21 != -1) {
					var20 = var20.substring(var21 + 5).trim();
					String var22 = JString.toSentenceCase(JString.fromBase37(JString.toBase37(var20)));
					boolean var23 = false;
					for (int var24 = 0; var24 < playerCount; var24++) {
						PlayerEntity var25 = players[playerIds[var24]];
						if (var25 != null && var25.name != null && var25.name.equalsIgnoreCase(var22)) {
							tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var25.pathTileZ[0], localPlayer.pathTileX[0], false, var25.pathTileX[0]);

							if (var4 == 484) {
								out.p1isaac(139);
								out.p2_alt1(playerIds[var24]);
							}

							if (var4 == 6) {
								oplogic6 += var5;
								if (oplogic6 >= 90) {
									out.p1isaac(136);
									oplogic6 = 0;
								}

								out.p1isaac(128);
								out.p2(playerIds[var24]);
							}

							var23 = true;
							break;
						}
					}

					if (!var23) {
						addMessage("Unable to find " + var22, 0, "");
					}
				}
			}

			if (var4 == 870) {
				out.p1isaac(53);
				out.p2(var2);
				out.p2_alt2(objSelectedSlot);
				out.p2_alt3(var5);
				out.p2(objSelectedInterface);
				out.p2_alt1(_flowObfuscator46);
				out.p2(var3);
				selectedCycle = 0;
				selectedInterface = var3;
				selectedItem = var2;
				selectedArea = 2;
				if (Component.instances[var3].layer == viewportInterfaceId) {
					selectedArea = 1;
				}

				if (Component.instances[var3].layer == chatInterfaceId) {
					selectedArea = 3;
				}
			}

			if (var4 == 847) {
				out.p1isaac(87);
				out.p2_alt2(var5);
				out.p2(var3);
				out.p2_alt2(var2);
				selectedCycle = 0;
				selectedInterface = var3;
				selectedItem = var2;
				selectedArea = 2;
				if (Component.instances[var3].layer == viewportInterfaceId) {
					selectedArea = 1;
				}

				if (Component.instances[var3].layer == chatInterfaceId) {
					selectedArea = 3;
				}
			}

			if (var4 == 626) {
				Component var26 = Component.instances[var3];
				spellSelected = 1;
				activeSpellId = var3;
				activeSpellFlags = var26.targetMask;
				objSelected = 0;
				redrawSidebar = true;
				String var27 = var26.targetVerb;
				if (var27.indexOf(" ") != -1) {
					var27 = var27.substring(0, var27.indexOf(" "));
				}

				String var28 = var26.targetVerb;
				if (var28.indexOf(" ") != -1) {
					var28 = var28.substring(var28.indexOf(" ") + 1);
				}

				spellCaption = var27 + " " + var26.targetText + " " + var28;

				if (activeSpellFlags == 16) {
					redrawSidebar = true;
					selectedTab = 3;
					redrawSideicons = true;
				}
			} else {
				if (var4 == 78) {
					out.p1isaac(117);
					out.p2_alt3(var3);
					out.p2_alt3(var5);
					out.p2_alt1(var2);
					selectedCycle = 0;
					selectedInterface = var3;
					selectedItem = var2;
					selectedArea = 2;
					if (Component.instances[var3].layer == viewportInterfaceId) {
						selectedArea = 1;
					}

					if (Component.instances[var3].layer == chatInterfaceId) {
						selectedArea = 3;
					}
				}

				if (var4 == 27) {
					PlayerEntity var29 = players[var5];
					if (var29 != null) {
						tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var29.pathTileZ[0], localPlayer.pathTileX[0], false, var29.pathTileX[0]);
						crossX = mouseClickX;
						crossY = mouseClickY;
						crossMode = 2;
						crossCycle = 0;
						oplogic3 += var5;
						if (oplogic3 >= 54) {
							out.p1isaac(189);
							out.p1(234);
							oplogic3 = 0;
						}

						out.p1isaac(73);
						out.p2_alt1(var5);
					}
				}

				if (var4 == 213) {
					boolean var30 = tryMove(2, 0, 0, 0, localPlayer.pathTileZ[0], 0, 0, var3, localPlayer.pathTileX[0], false, var2);
					if (!var30) {
						tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var3, localPlayer.pathTileX[0], false, var2);
					}

					crossX = mouseClickX;
					crossY = mouseClickY;
					crossMode = 2;
					crossCycle = 0;
					out.p1isaac(79);
					out.p2_alt1(sceneBaseTileZ + var3);
					out.p2(var5);
					out.p2_alt2(sceneBaseTileX + var2);
				}

				if (var4 == 632) {
					out.p1isaac(145);
					out.p2_alt2(var3);
					out.p2_alt2(var2);
					out.p2_alt2(var5);
					selectedCycle = 0;
					selectedInterface = var3;
					selectedItem = var2;
					selectedArea = 2;
					if (Component.instances[var3].layer == viewportInterfaceId) {
						selectedArea = 1;
					}

					if (Component.instances[var3].layer == chatInterfaceId) {
						selectedArea = 3;
					}
				}

				if (var4 == 493) {
					out.p1isaac(75);
					out.p2_alt3(var3);
					out.p2_alt1(var2);
					out.p2_alt2(var5);
					selectedCycle = 0;
					selectedInterface = var3;
					selectedItem = var2;
					selectedArea = 2;
					if (Component.instances[var3].layer == viewportInterfaceId) {
						selectedArea = 1;
					}

					if (Component.instances[var3].layer == chatInterfaceId) {
						selectedArea = 3;
					}
				}

				if (var4 == 652) {
					boolean var32 = tryMove(2, 0, 0, 0, localPlayer.pathTileZ[0], 0, 0, var3, localPlayer.pathTileX[0], false, var2);
					if (!var32) {
						tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var3, localPlayer.pathTileX[0], false, var2);
					}

					crossX = mouseClickX;
					crossY = mouseClickY;
					crossMode = 2;
					crossCycle = 0;
					out.p1isaac(156);
					out.p2_alt2(sceneBaseTileX + var2);
					out.p2_alt1(sceneBaseTileZ + var3);
					out.p2_alt3(var5);
				}

				if (var4 == 94) {
					boolean var34 = tryMove(2, 0, 0, 0, localPlayer.pathTileZ[0], 0, 0, var3, localPlayer.pathTileX[0], false, var2);
					if (!var34) {
						tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var3, localPlayer.pathTileX[0], false, var2);
					}

					crossX = mouseClickX;
					crossY = mouseClickY;
					crossMode = 2;
					crossCycle = 0;
					out.p1isaac(181);
					out.p2_alt1(sceneBaseTileZ + var3);
					out.p2(var5);
					out.p2_alt1(sceneBaseTileX + var2);
					out.p2_alt2(activeSpellId);
				}

				if (var4 == 646) {
					out.p1isaac(185);
					out.p2(var3);
					Component var36 = Component.instances[var3];
					if (var36.scripts != null && var36.scripts[0][0] == 5) {
						int var37 = var36.scripts[0][1];
						if (varps[var37] != var36.scriptOperand[0]) {
							varps[var37] = var36.scriptOperand[0];
							updateVarp(var37);
							redrawSidebar = true;
						}
					}
				}

				if (var4 == 225) {
					NpcEntity var38 = npcs[var5];
					if (var38 != null) {
						tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var38.pathTileZ[0], localPlayer.pathTileX[0], false, var38.pathTileX[0]);
						crossX = mouseClickX;
						crossY = mouseClickY;
						crossMode = 2;
						crossCycle = 0;
						oplogic8 += var5;
						if (oplogic8 >= 85) {
							out.p1isaac(230);
							out.p1(239);
							oplogic8 = 0;
						}

						out.p1isaac(17);
						out.p2_alt3(var5);
					}
				}

				if (var4 == 965) {
					NpcEntity var39 = npcs[var5];
					if (var39 != null) {
						tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var39.pathTileZ[0], localPlayer.pathTileX[0], false, var39.pathTileX[0]);
						crossX = mouseClickX;
						crossY = mouseClickY;
						crossMode = 2;
						crossCycle = 0;
						oplogic2++;
						if (oplogic2 >= 96) {
							out.p1isaac(152);
							out.p1(88);
							oplogic2 = 0;
						}

						out.p1isaac(21);
						out.p2(var5);
					}
				}

				if (var4 == 413) {
					NpcEntity var40 = npcs[var5];
					if (var40 != null) {
						tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var40.pathTileZ[0], localPlayer.pathTileX[0], false, var40.pathTileX[0]);
						crossX = mouseClickX;
						crossY = mouseClickY;
						crossMode = 2;
						crossCycle = 0;
						out.p1isaac(131);
						out.p2_alt3(var5);
						out.p2_alt2(activeSpellId);
					}
				}

				if (var4 == 200) {
					closeInterfaces();
				}

				if (var4 == 1025) {
					NpcEntity var41 = npcs[var5];
					if (var41 != null) {
						NpcType var42 = var41.type;
						if (var42.multinpc != null) {
							var42 = var42.getMultiNpc();
						}

						if (var42 != null) {
							String var43;
							if (var42.desc == null) {
								var43 = "It's a " + var42.name + ".";
							} else {
								var43 = new String(var42.desc);
							}

							addMessage(var43, 0, "");
						}
					}
				}

				if (var4 == 900) {
					interactWithLoc(var5, var3, var2);
					out.p1isaac(252);
					out.p2_alt3(var5 >> 14 & 0x7FFF);
					out.p2_alt1(sceneBaseTileZ + var3);
					out.p2_alt2(sceneBaseTileX + var2);
				}

				if (var4 == 412) {
					NpcEntity var44 = npcs[var5];
					if (var44 != null) {
						tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var44.pathTileZ[0], localPlayer.pathTileX[0], false, var44.pathTileX[0]);
						crossX = mouseClickX;
						crossY = mouseClickY;
						crossMode = 2;
						crossCycle = 0;
						out.p1isaac(72);
						out.p2_alt2(var5);
					}
				}

				if (var4 == 365) {
					PlayerEntity var45 = players[var5];
					if (var45 != null) {
						tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var45.pathTileZ[0], localPlayer.pathTileX[0], false, var45.pathTileX[0]);
						crossX = mouseClickX;
						crossY = mouseClickY;
						crossMode = 2;
						crossCycle = 0;
						out.p1isaac(249);
						out.p2_alt2(var5);
						out.p2_alt1(activeSpellId);
					}
				}

				if (var4 == 729) {
					PlayerEntity var46 = players[var5];
					if (var46 != null) {
						tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var46.pathTileZ[0], localPlayer.pathTileX[0], false, var46.pathTileX[0]);
						crossX = mouseClickX;
						crossY = mouseClickY;
						crossMode = 2;
						crossCycle = 0;
						out.p1isaac(39);
						out.p2_alt1(var5);
					}
				}

				if (var4 == 577) {
					PlayerEntity var47 = players[var5];
					if (var47 != null) {
						tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var47.pathTileZ[0], localPlayer.pathTileX[0], false, var47.pathTileX[0]);
						crossX = mouseClickX;
						crossY = mouseClickY;
						crossMode = 2;
						crossCycle = 0;
						out.p1isaac(139);
						out.p2_alt1(var5);
					}
				}

				if (var4 == 956 && interactWithLoc(var5, var3, var2)) {
					out.p1isaac(35);
					out.p2_alt1(sceneBaseTileX + var2);
					out.p2_alt2(activeSpellId);
					out.p2_alt2(sceneBaseTileZ + var3);
					out.p2_alt1(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 567) {
					boolean var48 = tryMove(2, 0, 0, 0, localPlayer.pathTileZ[0], 0, 0, var3, localPlayer.pathTileX[0], false, var2);
					if (!var48) {
						tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var3, localPlayer.pathTileX[0], false, var2);
					}

					crossX = mouseClickX;
					crossY = mouseClickY;
					crossMode = 2;
					crossCycle = 0;
					out.p1isaac(23);
					out.p2_alt1(sceneBaseTileZ + var3);
					out.p2_alt1(var5);
					out.p2_alt1(sceneBaseTileX + var2);
				}

				if (var4 == 867) {
					if ((var5 & 0x3) == 0) {
						oplogic1++;
					}

					if (oplogic1 >= 59) {
						out.p1isaac(200);
						out.p2(25501);
						oplogic1 = 0;
					}

					out.p1isaac(43);
					out.p2_alt1(var3);
					out.p2_alt2(var5);
					out.p2_alt2(var2);
					selectedCycle = 0;
					selectedInterface = var3;
					selectedItem = var2;
					selectedArea = 2;
					if (Component.instances[var3].layer == viewportInterfaceId) {
						selectedArea = 1;
					}

					if (Component.instances[var3].layer == chatInterfaceId) {
						selectedArea = 3;
					}
				}

				if (var4 == 543) {
					out.p1isaac(237);
					out.p2(var2);
					out.p2_alt2(var5);
					out.p2(var3);
					out.p2_alt2(activeSpellId);
					selectedCycle = 0;
					selectedInterface = var3;
					selectedItem = var2;
					selectedArea = 2;
					if (Component.instances[var3].layer == viewportInterfaceId) {
						selectedArea = 1;
					}

					if (Component.instances[var3].layer == chatInterfaceId) {
						selectedArea = 3;
					}
				}

				if (var4 == 606) {
					String var50 = menuOption[arg0];
					int var51 = var50.indexOf("@whi@");
					if (var51 != -1) {
						if (viewportInterfaceId == -1) {
							closeInterfaces();
							reportAbuseInput = var50.substring(var51 + 5).trim();
							reportAbuseMuteOption = false;

							for (int var52 = 0; var52 < Component.instances.length; var52++) {
								if (Component.instances[var52] != null && Component.instances[var52].clientCode == 600) {
									reportAbuseInterfaceId = viewportInterfaceId = Component.instances[var52].layer;
									break;
								}
							}
						} else {
							addMessage("Please close the interface you have open before using 'report abuse'", 0, "");
						}
					}
				}

				if (var4 == 491) {
					PlayerEntity var53 = players[var5];
					if (var53 != null) {
						tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var53.pathTileZ[0], localPlayer.pathTileX[0], false, var53.pathTileX[0]);
						crossX = mouseClickX;
						crossY = mouseClickY;
						crossMode = 2;
						crossCycle = 0;
						out.p1isaac(14);
						out.p2_alt2(objSelectedInterface);
						out.p2(var5);
						out.p2(_flowObfuscator46);
						out.p2_alt1(objSelectedSlot);
					}
				}

				if (var4 == 639) {
					String var54 = menuOption[arg0];
					int var55 = var54.indexOf("@whi@");
					if (var55 != -1) {
						long var56 = JString.toBase37(var54.substring(var55 + 5).trim());
						int var58 = -1;
						for (int var59 = 0; var59 < friendCount; var59++) {
							if (friendName37[var59] == var56) {
								var58 = var59;
								break;
							}
						}

						if (var58 != -1 && friendWorld[var58] > 0) {
							redrawChatback = true;
							chatbackInputOpen = 0;
							showSocialInput = true;
							socialInput = "";
							socialAction = 3;
							socialName37 = friendName37[var58];
							socialMessage = "Enter message to send to " + friendName[var58];
						}
					}
				}

				if (var4 == 454) {
					out.p1isaac(41);
					out.p2(var5);
					out.p2_alt2(var2);
					out.p2_alt2(var3);
					selectedCycle = 0;
					selectedInterface = var3;
					selectedItem = var2;
					selectedArea = 2;
					if (Component.instances[var3].layer == viewportInterfaceId) {
						selectedArea = 1;
					}

					if (Component.instances[var3].layer == chatInterfaceId) {
						selectedArea = 3;
					}
				}

				if (var4 == 478) {
					NpcEntity var60 = npcs[var5];
					if (var60 != null) {
						tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var60.pathTileZ[0], localPlayer.pathTileX[0], false, var60.pathTileX[0]);
						crossX = mouseClickX;
						crossY = mouseClickY;
						crossMode = 2;
						crossCycle = 0;

						if ((var5 & 0x3) == 0) {
							oplogic7++;
						}

						if (oplogic7 >= 53) {
							out.p1isaac(85);
							out.p1(66);
							oplogic7 = 0;
						}

						out.p1isaac(18);
						out.p2_alt1(var5);
					}
				}

				if (var4 == 113) {
					interactWithLoc(var5, var3, var2);
					out.p1isaac(70);
					out.p2_alt1(sceneBaseTileX + var2);
					out.p2(sceneBaseTileZ + var3);
					out.p2_alt3(var5 >> 14 & 0x7FFF);
				}

				if (var4 == 872) {
					interactWithLoc(var5, var3, var2);
					out.p1isaac(234);
					out.p2_alt3(sceneBaseTileX + var2);
					out.p2_alt2(var5 >> 14 & 0x7FFF);
					out.p2_alt3(sceneBaseTileZ + var3);
				}

				if (var4 == 502) {
					interactWithLoc(var5, var3, var2);
					out.p1isaac(132);
					out.p2_alt3(sceneBaseTileX + var2);
					out.p2(var5 >> 14 & 0x7FFF);
					out.p2_alt2(sceneBaseTileZ + var3);
				}

				if (var4 == 1125) {
					ObjType var61 = ObjType.get(var5);
					Component var62 = Component.instances[var3];
					String var63;
					if (var62 != null && var62.invSlotObjCount[var2] >= 100000) {
						var63 = var62.invSlotObjCount[var2] + " x " + var61.name;
					} else if (var61.desc == null) {
						var63 = "It's a " + var61.name + ".";
					} else {
						var63 = new String(var61.desc);
					}

					addMessage(var63, 0, "");
				}

				if (var4 == 169) {
					out.p1isaac(185);
					out.p2(var3);
					Component var64 = Component.instances[var3];
					if (var64.scripts != null && var64.scripts[0][0] == 5) {
						int var65 = var64.scripts[0][1];
						varps[var65] = 1 - varps[var65];
						updateVarp(var65);
						redrawSidebar = true;
					}
				}

				if (var4 == 447) {
					objSelected = 1;
					objSelectedSlot = var2;
					objSelectedInterface = var3;
					_flowObfuscator46 = var5;
					objSelectedName = ObjType.get(var5).name;
					spellSelected = 0;
					redrawSidebar = true;
				} else {
					if (var4 == 1226) {
						int var66 = var5 >> 14 & 0x7FFF;
						LocType var67 = LocType.get(var66);
						String var68;
						if (var67.desc == null) {
							var68 = "It's a " + var67.name + ".";
						} else {
							var68 = new String(var67.desc);
						}

						addMessage(var68, 0, "");
					}

					if (var4 == 244) {
						boolean var69 = tryMove(2, 0, 0, 0, localPlayer.pathTileZ[0], 0, 0, var3, localPlayer.pathTileX[0], false, var2);
						if (!var69) {
							tryMove(2, 0, 1, 0, localPlayer.pathTileZ[0], 1, 0, var3, localPlayer.pathTileX[0], false, var2);
						}

						crossX = mouseClickX;
						crossY = mouseClickY;
						crossMode = 2;
						crossCycle = 0;
						out.p1isaac(253);
						out.p2_alt1(sceneBaseTileX + var2);
						out.p2_alt3(sceneBaseTileZ + var3);
						out.p2_alt2(var5);
					}

					if (var4 == 1448) {
						ObjType var71 = ObjType.get(var5);
						String var72;
						if (var71.desc == null) {
							var72 = "It's a " + var71.name + ".";
						} else {
							var72 = new String(var71.desc);
						}

						addMessage(var72, 0, "");
					}

					objSelected = 0;
					spellSelected = 0;
					redrawSidebar = true;
				}
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public final void drawWildyLevel() {
		overrideChat = 0;
		int var1 = (localPlayer.x >> 7) + sceneBaseTileX;
		int var2 = (localPlayer.z >> 7) + sceneBaseTileZ;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			overrideChat = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			overrideChat = 1;
		}

		if (overrideChat == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			overrideChat = 0;
		}
	}

	public final void run() {
		if (flamesThread) {
			runFlames();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.z(I)V")
	public final void handleViewportOptions() {
		if (objSelected == 0 && spellSelected == 0) {
			menuOption[menuSize] = "Walk here";
			menuAction[menuSize] = 516;
			menuParamB[menuSize] = mouseX;
			menuParamC[menuSize] = mouseY;
			menuSize++;
		}

		int var1 = -1;
		for (int var2 = 0; var2 < Model.pickedCount; var2++) {
			int var3 = Model.pickedBitsets[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var1 != var3) {
				var1 = var3;

				if (var6 == 2 && scene.getInfo(currentLevel, var4, var5, var3) >= 0) {
					LocType var8 = LocType.get(var7);
					if (var8.multiloc != null) {
						var8 = var8.getMultiLoc();
					}

					if (var8 == null) {
						continue;
					}

					if (objSelected == 1) {
						menuOption[menuSize] = "Use " + objSelectedName + " with @cya@" + var8.name;
						menuAction[menuSize] = 62;
						menuParamA[menuSize] = var3;
						menuParamB[menuSize] = var4;
						menuParamC[menuSize] = var5;
						menuSize++;
					} else if (spellSelected != 1) {
						if (var8.op != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8.op[var9] != null) {
									menuOption[menuSize] = var8.op[var9] + " @cya@" + var8.name;

									if (var9 == 0) {
										menuAction[menuSize] = 502;
									}

									if (var9 == 1) {
										menuAction[menuSize] = 900;
									}

									if (var9 == 2) {
										menuAction[menuSize] = 113;
									}

									if (var9 == 3) {
										menuAction[menuSize] = 872;
									}

									if (var9 == 4) {
										menuAction[menuSize] = 1062;
									}

									menuParamA[menuSize] = var3;
									menuParamB[menuSize] = var4;
									menuParamC[menuSize] = var5;
									menuSize++;
								}
							}
						}

						menuOption[menuSize] = "Examine @cya@" + var8.name;
						menuAction[menuSize] = 1226;
						menuParamA[menuSize] = var8.type << 14;
						menuParamB[menuSize] = var4;
						menuParamC[menuSize] = var5;
						menuSize++;
					} else if ((activeSpellFlags & 0x4) == 4) {
						menuOption[menuSize] = spellCaption + " @cya@" + var8.name;
						menuAction[menuSize] = 956;
						menuParamA[menuSize] = var3;
						menuParamB[menuSize] = var4;
						menuParamC[menuSize] = var5;
						menuSize++;
					}
				}

				if (var6 == 1) {
					NpcEntity var10 = npcs[var7];
					if (var10.type.size == 1 && (var10.x & 0x7F) == 0x40 && (var10.z & 0x7F) == 0x40) {
						for (int var11 = 0; var11 < npcCount; var11++) {
							NpcEntity var12 = npcs[npcIds[var11]];
							if (var12 != null && var10 != var12 && var12.type.size == 1 && var10.x == var12.x && var10.z == var12.z) {
								addNPCOptions(var12.type, npcIds[var11], var5, var4);
							}
						}

						for (int var13 = 0; var13 < playerCount; var13++) {
							PlayerEntity var14 = players[playerIds[var13]];
							if (var14 != null && var10.x == var14.x && var10.z == var14.z) {
								addPlayerOptions(var4, playerIds[var13], var14, var5);
							}
						}
					}

					addNPCOptions(var10.type, var7, var5, var4);
				}

				if (var6 == 0) {
					PlayerEntity var15 = players[var7];
					if ((var15.x & 0x7F) == 0x40 && (var15.z & 0x7F) == 0x40) {
						for (int var16 = 0; var16 < npcCount; var16++) {
							NpcEntity var17 = npcs[npcIds[var16]];
							if (var17 != null && var17.type.size == 1 && var15.x == var17.x && var15.z == var17.z) {
								addNPCOptions(var17.type, npcIds[var16], var5, var4);
							}
						}

						for (int var18 = 0; var18 < playerCount; var18++) {
							PlayerEntity var19 = players[playerIds[var18]];
							if (var19 != null && var15 != var19 && var15.x == var19.x && var15.z == var19.z) {
								addPlayerOptions(var4, playerIds[var18], var19, var5);
							}
						}
					}

					addPlayerOptions(var4, var7, var15, var5);
				}

				if (var6 == 3) {
					LinkList var20 = levelObjStacks[currentLevel][var4][var5];
					if (var20 != null) {
						for (ObjStackEntity var21 = (ObjStackEntity) var20.tail(); var21 != null; var21 = (ObjStackEntity) var20.prev()) {
							ObjType var22 = ObjType.get(var21.type);
							if (objSelected == 1) {
								menuOption[menuSize] = "Use " + objSelectedName + " with @lre@" + var22.name;
								menuAction[menuSize] = 511;
								menuParamA[menuSize] = var21.type;
								menuParamB[menuSize] = var4;
								menuParamC[menuSize] = var5;
								menuSize++;
							} else if (spellSelected != 1) {
								for (int var23 = 4; var23 >= 0; var23--) {
									if (var22.op != null && var22.op[var23] != null) {
										menuOption[menuSize] = var22.op[var23] + " @lre@" + var22.name;

										if (var23 == 0) {
											menuAction[menuSize] = 652;
										}

										if (var23 == 1) {
											menuAction[menuSize] = 567;
										}

										if (var23 == 2) {
											menuAction[menuSize] = 234;
										}

										if (var23 == 3) {
											menuAction[menuSize] = 244;
										}

										if (var23 == 4) {
											menuAction[menuSize] = 213;
										}

										menuParamA[menuSize] = var21.type;
										menuParamB[menuSize] = var4;
										menuParamC[menuSize] = var5;
										menuSize++;
									} else if (var23 == 2) {
										menuOption[menuSize] = "Take @lre@" + var22.name;
										menuAction[menuSize] = 234;
										menuParamA[menuSize] = var21.type;
										menuParamB[menuSize] = var4;
										menuParamC[menuSize] = var5;
										menuSize++;
									}
								}

								menuOption[menuSize] = "Examine @lre@" + var22.name;
								menuAction[menuSize] = 1448;
								menuParamA[menuSize] = var21.type;
								menuParamB[menuSize] = var4;
								menuParamC[menuSize] = var5;
								menuSize++;
							} else if ((activeSpellFlags & 0x1) == 1) {
								menuOption[menuSize] = spellCaption + " @lre@" + var22.name;
								menuAction[menuSize] = 94;
								menuParamA[menuSize] = var21.type;
								menuParamB[menuSize] = var4;
								menuParamC[menuSize] = var5;
								menuSize++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void unload() {
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
		ondemand.stop();
		ondemand = null;
		chatBuffer = null;
		out = null;
		login = null;
		in = null;
		sceneMapIndex = null;
		sceneMapLandData = null;
		sceneMapLocData = null;
		sceneMapLandFile = null;
		sceneMapLocFile = null;
		levelHeightmap = null;
		levelTileFlags = null;
		scene = null;
		levelCollisionMap = null;
		bfsDirection = null;
		bfsCost = null;
		bfsStepX = null;
		bfsStepZ = null;
		textureBuffer = null;
		areaSidebar = null;
		areaMapback = null;
		areaViewport = null;
		areaChatback = null;
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
		imageInvback = null;
		imageMapback = null;
		imageChatback = null;
		imageBackbase1 = null;
		imageBackbase2 = null;
		imageBackhmid1 = null;
		imageSideicons = null;
		imageRedstone1 = null;
		imageRedstone2 = null;
		imageRedstone3 = null;
		imageRedstone1h = null;
		imageRedstone2h = null;
		imageRedstone1v = null;
		imageRedstone2v = null;
		imageRedstone3v = null;
		imageRedstone1hv = null;
		imageRedstone2hv = null;
		imageCompass = null;
		imageHitmarks = null;
		imageHeadicons = null;
		imageCrosses = null;
		imageMapdot0 = null;
		imageMapdot1 = null;
		imageMapdot2 = null;
		imageMapdot3 = null;
		imageMapdot4 = null;
		imageMapscene = null;
		imageMapfunction = null;
		tileLastOccupiedCycle = null;
		players = null;
		playerIds = null;
		entityUpdateIds = null;
		playerAppearanceBuffer = null;
		entityRemovalIds = null;
		npcs = null;
		npcIds = null;
		levelObjStacks = null;
		temporaryLocs = null;
		projectiles = null;
		spotanims = null;
		menuParamB = null;
		menuParamC = null;
		menuAction = null;
		menuParamA = null;
		menuOption = null;
		varps = null;
		activeMapFunctionX = null;
		activeMapFunctionZ = null;
		activeMapFunctions = null;
		imageMinimap = null;
		friendName = null;
		friendName37 = null;
		friendWorld = null;
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
		FloType.instances = null;
		IdkType.instances = null;
		Component.instances = null;
		OIBEELAZ.instances = null;
		SeqType.instances = null;
		SpotAnimType.instances = null;
		SpotAnimType.modelCache = null;
		VarpType.instances = null;
		drawArea = null;
		PlayerEntity.modelCache = null;
		Pix3D.unload();
		World3D.unload();
		Model.unload();
		AnimFrame.unload();
		System.gc();
	}

	@ObfuscatedName("client.g(B)V")
	public void debug() {
		System.out.println("============");
		System.out.println("flame-cycle:" + frameCycle);

		if (ondemand != null) {
			System.out.println("Od-cycle:" + ondemand.cycle);
		}

		System.out.println("loop-cycle:" + loopCycle);
		System.out.println("draw-cycle:" + drawCycle);
		System.out.println("ptype:" + packetType);
		System.out.println("psize:" + packetSize);

		if (stream != null) {
			stream.debug();
		}

		showDebug = true;
	}

	@ObfuscatedName("client.f(I)Ljava/awt/Component;")
	public final java.awt.Component getBaseComponent() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		if (frame != null) {
			return frame;
		}

		return this;
	}

	@ObfuscatedName("client.A(I)V")
	public final void handleInputKey() {
		while (true) {
			int var1 = pollKey();
			if (var1 == -1) {
				return;
			}

			if (viewportInterfaceId != -1 && viewportInterfaceId == reportAbuseInterfaceId) {
				if (var1 == 8 && reportAbuseInput.length() > 0) {
					reportAbuseInput = reportAbuseInput.substring(0, reportAbuseInput.length() - 1);
				}

				if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && reportAbuseInput.length() < 12) {
					reportAbuseInput = reportAbuseInput + (char) var1;
				}
			} else if (showSocialInput) {
				if (var1 >= 32 && var1 <= 122 && socialInput.length() < 80) {
					socialInput = socialInput + (char) var1;
					redrawChatback = true;
				}

				if (var1 == 8 && socialInput.length() > 0) {
					socialInput = socialInput.substring(0, socialInput.length() - 1);
					redrawChatback = true;
				}

				if (var1 == 13 || var1 == 10) {
					showSocialInput = false;
					redrawChatback = true;

					if (socialAction == 1) {
						long var2 = JString.toBase37(socialInput);
						addFriend(var2);
					}

					if (socialAction == 2 && friendCount > 0) {
						long var4 = JString.toBase37(socialInput);
						removeFriend(var4);
					}

					if (socialAction == 3 && socialInput.length() > 0) {
						out.p1isaac(126);
						out.p1(0);
						int var6 = out.pos;
						out.p8(socialName37);
						WordPack.pack(socialInput, out);
						out.psize1(out.pos - var6);
						socialInput = WordPack.format(socialInput);
						socialInput = WordFilter.filter(socialInput);
						addMessage(socialInput, 6, JString.toSentenceCase(JString.fromBase37(socialName37)));

						if (privateChatSetting == 2) {
							privateChatSetting = 1;
							redrawPrivacySettings = true;
							out.p1isaac(95);
							out.p1(publicChatSetting);
							out.p1(privateChatSetting);
							out.p1(tradeChatSetting);
						}
					}

					if (socialAction == 4 && ignoreCount < 100) {
						long var7 = JString.toBase37(socialInput);
						addIgnore(var7);
					}

					if (socialAction == 5 && ignoreCount > 0) {
						long var9 = JString.toBase37(socialInput);
						removeIgnore(var9);
					}
				}
			} else if (chatbackInputOpen == 1) {
				if (var1 >= 48 && var1 <= 57 && chatbackInput.length() < 10) {
					chatbackInput = chatbackInput + (char) var1;
					redrawChatback = true;
				}

				if (var1 == 8 && chatbackInput.length() > 0) {
					chatbackInput = chatbackInput.substring(0, chatbackInput.length() - 1);
					redrawChatback = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (chatbackInput.length() > 0) {
						int var11 = 0;
						try {
							var11 = Integer.parseInt(chatbackInput);
						} catch (Exception var21) {
						}

						out.p1isaac(208);
						out.p4(var11);
					}

					chatbackInputOpen = 0;
					redrawChatback = true;
				}
			} else if (chatbackInputOpen == 2) {
				if (var1 >= 32 && var1 <= 122 && chatbackInput.length() < 12) {
					chatbackInput = chatbackInput + (char) var1;
					redrawChatback = true;
				}

				if (var1 == 8 && chatbackInput.length() > 0) {
					chatbackInput = chatbackInput.substring(0, chatbackInput.length() - 1);
					redrawChatback = true;
				}

				if (var1 == 13 || var1 == 10) {
					if (chatbackInput.length() > 0) {
						out.p1isaac(60);
						out.p8(JString.toBase37(chatbackInput));
					}

					chatbackInputOpen = 0;
					redrawChatback = true;
				}
			} else if (chatInterfaceId == -1) {
				if (var1 >= 32 && var1 <= 122 && chatTyped.length() < 80) {
					chatTyped = chatTyped + (char) var1;
					redrawChatback = true;
				}

				if (var1 == 8 && chatTyped.length() > 0) {
					chatTyped = chatTyped.substring(0, chatTyped.length() - 1);
					redrawChatback = true;
				}

				if ((var1 == 13 || var1 == 10) && chatTyped.length() > 0) {
					if (rights == 2) {
						if (chatTyped.equals("::clientdrop")) {
							tryReconnect();
						}

						if (chatTyped.equals("::lag")) {
							debug();
						}

						if (chatTyped.equals("::prefetchmusic")) {
							for (int var12 = 0; var12 < ondemand.getFileCount(2); var12++) {
								ondemand.prefetch((byte) 1, 2, var12);
							}
						}

						if (chatTyped.equals("::fpson")) {
							showFps = true;
						}

						if (chatTyped.equals("::fpsoff")) {
							showFps = false;
						}

						if (chatTyped.equals("::noclip")) {
							for (int var13 = 0; var13 < 4; var13++) {
								for (int var14 = 1; var14 < 103; var14++) {
									for (int var15 = 1; var15 < 103; var15++) {
										levelCollisionMap[var13].flags[var14][var15] = 0;
									}
								}
							}
						}
					}

					if (chatTyped.startsWith("::")) {
						out.p1isaac(103);
						out.p1(chatTyped.length() - 1);
						out.pjstr(chatTyped.substring(2));
					} else {
						String var16 = chatTyped.toLowerCase();
						byte var17 = 0;
						if (var16.startsWith("yellow:")) {
							var17 = 0;
							chatTyped = chatTyped.substring(7);
						} else if (var16.startsWith("red:")) {
							var17 = 1;
							chatTyped = chatTyped.substring(4);
						} else if (var16.startsWith("green:")) {
							var17 = 2;
							chatTyped = chatTyped.substring(6);
						} else if (var16.startsWith("cyan:")) {
							var17 = 3;
							chatTyped = chatTyped.substring(5);
						} else if (var16.startsWith("purple:")) {
							var17 = 4;
							chatTyped = chatTyped.substring(7);
						} else if (var16.startsWith("white:")) {
							var17 = 5;
							chatTyped = chatTyped.substring(6);
						} else if (var16.startsWith("flash1:")) {
							var17 = 6;
							chatTyped = chatTyped.substring(7);
						} else if (var16.startsWith("flash2:")) {
							var17 = 7;
							chatTyped = chatTyped.substring(7);
						} else if (var16.startsWith("flash3:")) {
							var17 = 8;
							chatTyped = chatTyped.substring(7);
						} else if (var16.startsWith("glow1:")) {
							var17 = 9;
							chatTyped = chatTyped.substring(6);
						} else if (var16.startsWith("glow2:")) {
							var17 = 10;
							chatTyped = chatTyped.substring(6);
						} else if (var16.startsWith("glow3:")) {
							var17 = 11;
							chatTyped = chatTyped.substring(6);
						}

						String var18 = chatTyped.toLowerCase();
						byte var19 = 0;
						if (var18.startsWith("wave:")) {
							var19 = 1;
							chatTyped = chatTyped.substring(5);
						} else if (var18.startsWith("wave2:")) {
							var19 = 2;
							chatTyped = chatTyped.substring(6);
						} else if (var18.startsWith("shake:")) {
							var19 = 3;
							chatTyped = chatTyped.substring(6);
						} else if (var18.startsWith("scroll:")) {
							var19 = 4;
							chatTyped = chatTyped.substring(7);
						} else if (var18.startsWith("slide:")) {
							var19 = 5;
							chatTyped = chatTyped.substring(6);
						}

						out.p1isaac(4);
						out.p1(0);
						int var20 = out.pos;
						out.p1_alt3(var19);
						out.p1_alt3(var17);
						chatBuffer.pos = 0;
						WordPack.pack(chatTyped, chatBuffer);
						out.pdata_alt2(0, chatBuffer.data, chatBuffer.pos);
						out.psize1(out.pos - var20);
						chatTyped = WordPack.format(chatTyped);
						chatTyped = WordFilter.filter(chatTyped);
						localPlayer.chat = chatTyped;
						localPlayer.chatColor = var17;
						localPlayer.chatStyle = var19;
						localPlayer.chatTimer = 150;

						if (rights == 2) {
							addMessage(localPlayer.chat, 2, "@cr2@" + localPlayer.name);
						} else if (rights == 1) {
							addMessage(localPlayer.chat, 2, "@cr1@" + localPlayer.name);
						} else {
							addMessage(localPlayer.chat, 2, localPlayer.name);
						}

						if (publicChatSetting == 2) {
							publicChatSetting = 3;
							redrawPrivacySettings = true;
							out.p1isaac(95);
							out.p1(publicChatSetting);
							out.p1(privateChatSetting);
							out.p1(tradeChatSetting);
						}
					}

					chatTyped = "";
					redrawChatback = true;
				}
			}
		}
	}

	@ObfuscatedName("client.a(III)V")
	public final void handlePrivateChatInput(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (messageText[var4] != null) {
				int var5 = messageType[var4];
				int var6 = chatScrollOffset + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}

				String var7 = messageSender[var4];
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

				if ((var5 == 1 || var5 == 2) && (var5 == 1 || publicChatSetting == 0 || publicChatSetting == 1 && isFriend(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(localPlayer.name)) {
						if (rights >= 1) {
							menuOption[menuSize] = "Report abuse @whi@" + var7;
							menuAction[menuSize] = 606;
							menuSize++;
						}

						menuOption[menuSize] = "Add ignore @whi@" + var7;
						menuAction[menuSize] = 42;
						menuSize++;
						menuOption[menuSize] = "Add friend @whi@" + var7;
						menuAction[menuSize] = 337;
						menuSize++;
					}

					var3++;
				}

				if ((var5 == 3 || var5 == 7) && splitPrivateChat == 0 && (var5 == 7 || privateChatSetting == 0 || privateChatSetting == 1 && isFriend(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (rights >= 1) {
							menuOption[menuSize] = "Report abuse @whi@" + var7;
							menuAction[menuSize] = 606;
							menuSize++;
						}

						menuOption[menuSize] = "Add ignore @whi@" + var7;
						menuAction[menuSize] = 42;
						menuSize++;
						menuOption[menuSize] = "Add friend @whi@" + var7;
						menuAction[menuSize] = 337;
						menuSize++;
					}

					var3++;
				}

				if (var5 == 4 && (tradeChatSetting == 0 || tradeChatSetting == 1 && isFriend(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						menuOption[menuSize] = "Accept trade @whi@" + var7;
						menuAction[menuSize] = 484;
						menuSize++;
					}

					var3++;
				}

				if ((var5 == 5 || var5 == 6) && splitPrivateChat == 0 && privateChatSetting < 2) {
					var3++;
				}

				if (var5 == 8 && (tradeChatSetting == 0 || tradeChatSetting == 1 && isFriend(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						menuOption[menuSize] = "Accept challenge @whi@" + var7;
						menuAction[menuSize] = 6;
						menuSize++;
					}

					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILDUCMKFAY;)V")
	public final void updateInterfaceContent(Component arg0) {
		int var2 = arg0.clientCode;
		if (var2 >= 1 && var2 <= 100 || var2 >= 701 && var2 <= 800) {
			if (var2 == 1 && friendListStatus == 0) {
				arg0.text = "Loading friend list";
				arg0.buttonType = 0;
			} else if (var2 == 1 && friendListStatus == 1) {
				arg0.text = "Connecting to friendserver";
				arg0.buttonType = 0;
			} else if (var2 == 2 && friendListStatus != 2) {
				arg0.text = "Please wait...";
				arg0.buttonType = 0;
			} else {
				int var3 = friendCount;
				if (friendListStatus != 2) {
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
					arg0.text = friendName[var2];
					arg0.buttonType = 1;
				}
			}
		} else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
			int var4 = friendCount;
			if (friendListStatus != 2) {
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
				if (friendWorld[var2] == 0) {
					arg0.text = "@red@Offline";
				} else if (friendWorld[var2] == nodeId) {
					arg0.text = "@gre@World-" + (friendWorld[var2] - 9);
				} else {
					arg0.text = "@yel@World-" + (friendWorld[var2] - 9);
				}

				arg0.buttonType = 1;
			}
		} else if (var2 == 203) {
			int var5 = friendCount;
			if (friendListStatus != 2) {
				var5 = 0;
			}

			arg0.scroll = var5 * 15 + 20;
			if (arg0.scroll <= arg0.height) {
				arg0.scroll = arg0.height + 1;
			}
		} else if (var2 >= 401 && var2 <= 500) {
			var2 -= 401;
			if (var2 == 0 && friendListStatus == 0) {
				arg0.text = "Loading ignore list";
				arg0.buttonType = 0;
			} else if (var2 == 1 && friendListStatus == 0) {
				arg0.text = "Please wait...";
				arg0.buttonType = 0;
			} else {
				int var6 = ignoreCount;
				if (friendListStatus == 0) {
					var6 = 0;
				}

				if (var2 >= var6) {
					arg0.text = "";
					arg0.buttonType = 0;
				} else {
					arg0.text = JString.toSentenceCase(JString.fromBase37(ignoreName37[var2]));
					arg0.buttonType = 1;
				}
			}
		} else if (var2 == 503) {
			arg0.scroll = ignoreCount * 15 + 20;
			if (arg0.scroll <= arg0.height) {
				arg0.scroll = arg0.height + 1;
			}
		} else if (var2 == 327) {
			arg0.xan = 150;
			arg0.yan = (int) (Math.sin(loopCycle / 40.0D) * 256.0D) & 0x7FF;

			if (updateDesignModel) {
				for (int var7 = 0; var7 < 7; var7++) {
					int var8 = designIdentikits[var7];
					if (var8 >= 0 && !IdkType.instances[var8].validateModel()) {
						return;
					}
				}

				updateDesignModel = false;
				Model[] var9 = new Model[7];
				int var10 = 0;
				for (int var11 = 0; var11 < 7; var11++) {
					int var12 = designIdentikits[var11];
					if (var12 >= 0) {
						var9[var10++] = IdkType.instances[var12].getModel();
					}
				}

				Model var13 = new Model(var10, var9);
				for (int var14 = 0; var14 < 5; var14++) {
					if (designColors[var14] != 0) {
						var13.recolour(DESIGN_BODY_COLOR[var14][0], DESIGN_BODY_COLOR[var14][designColors[var14]]);

						if (var14 == 1) {
							var13.recolour(DESIGN_HAIR_COLOR[0], DESIGN_HAIR_COLOR[designColors[var14]]);
						}
					}
				}

				var13.createLabelReferences();
				var13.applyTransform(SeqType.instances[localPlayer.seqStandId].frames[0]);
				var13.calculateNormals(64, 850, -30, -50, -30, true);
				arg0.modelType = 5;
				arg0.model = 0;
				Component.cacheModel(0, 5, var13);
			}
		} else if (var2 == 324) {
			if (genderButtonImage0 == null) {
				genderButtonImage0 = arg0.graphic;
				genderButtonImage1 = arg0.activeGraphic;
			}

			if (designGenderMale) {
				arg0.graphic = genderButtonImage1;
			} else {
				arg0.graphic = genderButtonImage0;
			}
		} else if (var2 == 325) {
			if (genderButtonImage0 == null) {
				genderButtonImage0 = arg0.graphic;
				genderButtonImage1 = arg0.activeGraphic;
			}

			if (designGenderMale) {
				arg0.graphic = genderButtonImage0;
			} else {
				arg0.graphic = genderButtonImage1;
			}
		} else if (var2 == 600) {
			arg0.text = reportAbuseInput;
			if (loopCycle % 20 < 10) {
				arg0.text = arg0.text + "|";
			} else {
				arg0.text = arg0.text + " ";
			}
		} else if (var2 == 613) {
			if (rights < 1) {
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
				String var15;
				if (daysSinceLastLogin == 0) {
					var15 = "earlier today";
				} else if (daysSinceLastLogin == 1) {
					var15 = "yesterday";
				} else {
					var15 = daysSinceLastLogin + " days ago";
				}

				arg0.text = "You last logged in " + var15 + " from: " + signlink.dns;
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
				String var16;
				if (daysSinceRecoveriesChanged == 0) {
					var16 = "Earlier today";
				} else if (daysSinceRecoveriesChanged == 1) {
					var16 = "Yesterday";
				} else {
					var16 = daysSinceRecoveriesChanged + " days ago";
				}

				arg0.text = var16 + " you changed your recovery questions";
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

	@ObfuscatedName("client.h(B)V")
	public final void drawPrivateMessages() {
		if (splitPrivateChat != 0) {
			PixFont var1 = fontPlain12;
			int var2 = 0;
			if (systemUpdateTimer != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; var3++) {
				if (messageText[var3] != null) {
					int var4 = messageType[var3];
					String var5 = messageSender[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					if ((var4 == 3 || var4 == 7) && (var4 == 7 || privateChatSetting == 0 || privateChatSetting == 1 && isFriend(var5))) {
						int var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.drawString(0, "From", var7, var8);
						var1.drawString(0xFFFF, "From", var7 - 1, var8);
						int var11 = var8 + var1.stringWidthTag("From ");
						if (var6 == 1) {
							imageModIcons[0].draw(var11, var7 - 12);
							var11 += 14;
						}

						if (var6 == 2) {
							imageModIcons[1].draw(var11, var7 - 12);
							var11 += 14;
						}

						var1.drawString(0, var5 + ": " + messageText[var3], var7, var11);
						var1.drawString(0xFFFF, var5 + ": " + messageText[var3], var7 - 1, var11);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && privateChatSetting < 2) {
						int var9 = 329 - var2 * 13;
						var1.drawString(0, messageText[var3], var9, 4);
						var1.drawString(0xFFFF, messageText[var3], var9 - 1, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && privateChatSetting < 2) {
						int var10 = 329 - var2 * 13;
						var1.drawString(0, "To " + var5 + ": " + messageText[var3], var10, 4);
						var1.drawString(0xFFFF, "To " + var5 + ": " + messageText[var3], var10 - 1, 4);
						var2++;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;Z)V")
	public final void addMessage(String arg0, int arg1, String arg2) {
		if (arg1 == 0 && stickyChatInterfaceId != -1) {
			modalMessage = arg0;
			mouseClickButton = 0;
		}

		if (chatInterfaceId == -1) {
			redrawChatback = true;
		}

		for (int var4 = 99; var4 > 0; var4--) {
			messageType[var4] = messageType[var4 - 1];
			messageSender[var4] = messageSender[var4 - 1];
			messageText[var4] = messageText[var4 - 1];
		}

		messageType[0] = arg1;
		messageSender[0] = arg2;
		messageText[0] = arg0;
	}

	@ObfuscatedName("client.B(I)V")
	public final void handleTabInput() {
		if (mouseClickButton == 1) {
			if (mouseClickX >= 539 && mouseClickX <= 573 && mouseClickY >= 169 && mouseClickY < 205 && tabInterfaceId[0] != -1) {
				redrawSidebar = true;
				selectedTab = 0;
				redrawSideicons = true;
			}

			if (mouseClickX >= 569 && mouseClickX <= 599 && mouseClickY >= 168 && mouseClickY < 205 && tabInterfaceId[1] != -1) {
				redrawSidebar = true;
				selectedTab = 1;
				redrawSideicons = true;
			}

			if (mouseClickX >= 597 && mouseClickX <= 627 && mouseClickY >= 168 && mouseClickY < 205 && tabInterfaceId[2] != -1) {
				redrawSidebar = true;
				selectedTab = 2;
				redrawSideicons = true;
			}

			if (mouseClickX >= 625 && mouseClickX <= 669 && mouseClickY >= 168 && mouseClickY < 203 && tabInterfaceId[3] != -1) {
				redrawSidebar = true;
				selectedTab = 3;
				redrawSideicons = true;
			}

			if (mouseClickX >= 666 && mouseClickX <= 696 && mouseClickY >= 168 && mouseClickY < 205 && tabInterfaceId[4] != -1) {
				redrawSidebar = true;
				selectedTab = 4;
				redrawSideicons = true;
			}

			if (mouseClickX >= 694 && mouseClickX <= 724 && mouseClickY >= 168 && mouseClickY < 205 && tabInterfaceId[5] != -1) {
				redrawSidebar = true;
				selectedTab = 5;
				redrawSideicons = true;
			}

			if (mouseClickX >= 722 && mouseClickX <= 756 && mouseClickY >= 169 && mouseClickY < 205 && tabInterfaceId[6] != -1) {
				redrawSidebar = true;
				selectedTab = 6;
				redrawSideicons = true;
			}

			if (mouseClickX >= 540 && mouseClickX <= 574 && mouseClickY >= 466 && mouseClickY < 502 && tabInterfaceId[7] != -1) {
				redrawSidebar = true;
				selectedTab = 7;
				redrawSideicons = true;
			}

			if (mouseClickX >= 572 && mouseClickX <= 602 && mouseClickY >= 466 && mouseClickY < 503 && tabInterfaceId[8] != -1) {
				redrawSidebar = true;
				selectedTab = 8;
				redrawSideicons = true;
			}

			if (mouseClickX >= 599 && mouseClickX <= 629 && mouseClickY >= 466 && mouseClickY < 503 && tabInterfaceId[9] != -1) {
				redrawSidebar = true;
				selectedTab = 9;
				redrawSideicons = true;
			}

			if (mouseClickX >= 627 && mouseClickX <= 671 && mouseClickY >= 467 && mouseClickY < 502 && tabInterfaceId[10] != -1) {
				redrawSidebar = true;
				selectedTab = 10;
				redrawSideicons = true;
			}

			if (mouseClickX >= 669 && mouseClickX <= 699 && mouseClickY >= 466 && mouseClickY < 503 && tabInterfaceId[11] != -1) {
				redrawSidebar = true;
				selectedTab = 11;
				redrawSideicons = true;
			}

			if (mouseClickX >= 696 && mouseClickX <= 726 && mouseClickY >= 466 && mouseClickY < 503 && tabInterfaceId[12] != -1) {
				redrawSidebar = true;
				selectedTab = 12;
				redrawSideicons = true;
			}

			if (mouseClickX >= 724 && mouseClickX <= 758 && mouseClickY >= 466 && mouseClickY < 502 && tabInterfaceId[13] != -1) {
				redrawSidebar = true;
				selectedTab = 13;
				redrawSideicons = true;
				return;
			}
		}
	}

	@ObfuscatedName("client.C(I)V")
	public final void prepareGameScreen() {
		if (areaChatback == null) {
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
			areaChatback = new PixMap(479, 96, getBaseComponent());
			areaMapback = new PixMap(172, 156, getBaseComponent());
			Pix2D.clear();
			imageMapback.draw(0, 0);
			areaSidebar = new PixMap(190, 261, getBaseComponent());
			areaViewport = new PixMap(512, 334, getBaseComponent());
			Pix2D.clear();
			areaBackbase1 = new PixMap(496, 50, getBaseComponent());
			areaBackbase2 = new PixMap(269, 37, getBaseComponent());
			areaBackhmid1 = new PixMap(249, 45, getBaseComponent());
			redrawTitleBackground = true;
		}
	}

	@ObfuscatedName("client.g(Z)Ljava/lang/String;")
	public final String getHost() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (frame != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.a(LCXGZMTJK;III)V")
	public final void drawMinimapHint(Pix32 arg0, int arg1, int arg2) {
		int var4 = arg1 * arg1 + arg2 * arg2;
		if (var4 > 4225 && var4 < 90000) {
			int var5 = minimapAnticheatAngle + orbitCameraYaw & 0x7FF;
			int var6 = Model.sin[var5];
			int var7 = Model.cos[var5];
			var6 = var6 * 256 / (minimapZoom + 256);
			var7 = var7 * 256 / (minimapZoom + 256);
			int var8 = arg1 * var6 + arg2 * var7 >> 16;
			int var9 = arg1 * var7 - arg2 * var6 >> 16;
			double var10 = Math.atan2(var8, var9);
			int var12 = (int) (Math.sin(var10) * 63.0D);
			int var13 = (int) (Math.cos(var10) * 57.0D);
			imageMapedge.drawRotated(83 - var13 - 20, 15, 20, 15, 256, 20, var10, var12 + 94 + 4 - 10);
		} else {
			drawOnMinimap(arg0, arg2, arg1);
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void handleInput() {
		if (objDragArea == 0) {
			menuOption[0] = "Cancel";
			menuAction[0] = 1107;
			menuSize = 1;
			handlePrivateChatInput();
			lastHoveredInterfaceId = 0;

			if (mouseX > 4 && mouseY > 4 && mouseX < 516 && mouseY < 338) {
				if (viewportInterfaceId == -1) {
					handleViewportOptions();
				} else {
					handleInterfaceInput(4, Component.instances[viewportInterfaceId], mouseX, 4, mouseY, 0);
				}
			}

			if (viewportHoveredInterfaceIndex != lastHoveredInterfaceId) {
				viewportHoveredInterfaceIndex = lastHoveredInterfaceId;
			}

			lastHoveredInterfaceId = 0;

			if (mouseX > 553 && mouseY > 205 && mouseX < 743 && mouseY < 466) {
				if (sidebarInterfaceId != -1) {
					handleInterfaceInput(553, Component.instances[sidebarInterfaceId], mouseX, 205, mouseY, 0);
				} else if (tabInterfaceId[selectedTab] != -1) {
					handleInterfaceInput(553, Component.instances[tabInterfaceId[selectedTab]], mouseX, 205, mouseY, 0);
				}
			}

			if (sidebarHoveredInterfaceIndex != lastHoveredInterfaceId) {
				redrawSidebar = true;
				sidebarHoveredInterfaceIndex = lastHoveredInterfaceId;
			}

			lastHoveredInterfaceId = 0;

			if (mouseX > 17 && mouseY > 357 && mouseX < 496 && mouseY < 453) {
				if (chatInterfaceId != -1) {
					handleInterfaceInput(17, Component.instances[chatInterfaceId], mouseX, 357, mouseY, 0);
				} else if (mouseY < 434 && mouseX < 426) {
					handlePrivateChatInput(mouseX - 17, mouseY - 357);
				}
			}

			if (chatInterfaceId != -1 && chatHoveredInterfaceIndex != lastHoveredInterfaceId) {
				redrawChatback = true;
				chatHoveredInterfaceIndex = lastHoveredInterfaceId;
			}

			boolean var1 = false;
			while (!var1) {
				var1 = true;
				for (int var2 = 0; var2 < menuSize - 1; var2++) {
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

	@ObfuscatedName("client.a(ZIII)I")
	public final int mix(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void login(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;

		try {
			if (!arg2) {
				loginMessage0 = "";
				loginMessage1 = "Connecting to server...";
				drawTitleScreen(true);
			}

			stream = new ClientStream(this, openSocket(portOffset + 43594));
			long var4 = JString.toBase37(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			out.pos = 0;
			out.p1(14);
			out.p1(var6);
			stream.write(2, out.data, 0);

			for (int var7 = 0; var7 < 8; var7++) {
				stream.read();
			}

			int var8 = stream.read();
			int var9 = var8;

			if (var8 == 0) {
				stream.read(in.data, 0, 8);
				in.pos = 0;
				serverSeed = in.g8();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (serverSeed >> 32), (int) serverSeed };
				out.pos = 0;
				out.p1(10);
				out.p4(var10[0]);
				out.p4(var10[1]);
				out.p4(var10[2]);
				out.p4(var10[3]);
				out.p4(signlink.uid);
				out.pjstr(arg0);
				out.pjstr(arg1);
				out.rsaenc(RSA_EXPONENT, RSA_MODULUS);
				login.pos = 0;

				if (arg2) {
					login.p1(18);
				} else {
					login.p1(16);
				}

				login.p1(out.pos + 36 + 1 + 1 + 2);
				login.p1(255);
				login.p2(317);
				login.p1(lowMemory ? 1 : 0);

				for (int var11 = 0; var11 < 9; var11++) {
					login.p4(archiveChecksum[var11]);
				}

				login.pdata(out.data, out.pos, 0);
				out.random = new Isaac(var10);

				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}

				randomIn = new Isaac(var10);
				stream.write(login.pos, login.data, 0);
				var8 = stream.read();
			}

			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}

				login(arg0, arg1, arg2);
			} else if (var8 == 2) {
				rights = stream.read();
				flagged = stream.read() == 1;
				prevMousePressTime = 0L;
				lastWriteDuplicates = 0;
				mouseTracking.length = 0;
				hasFocus = true;
				focused = true;
				ingame = true;
				out.pos = 0;
				in.pos = 0;
				packetType = -1;
				lastPacketType0 = -1;
				lastPacketType1 = -1;
				lastPacketType2 = -1;
				packetSize = 0;
				idleNetCycles = 0;
				systemUpdateTimer = 0;
				idleTimeout = 0;
				hintType = 0;
				menuSize = 0;
				menuVisible = false;
				idleCycles = 0;

				for (int var13 = 0; var13 < 100; var13++) {
					messageText[var13] = null;
				}

				objSelected = 0;
				spellSelected = 0;
				sceneState = 0;
				waveCount = 0;
				cameraAnticheatOffsetX = (int) (Math.random() * 100.0D) - 50;
				cameraAnticheatOffsetZ = (int) (Math.random() * 110.0D) - 55;
				cameraAnticheatAngle = (int) (Math.random() * 80.0D) - 40;
				minimapAnticheatAngle = (int) (Math.random() * 120.0D) - 60;
				minimapZoom = (int) (Math.random() * 30.0D) - 20;
				orbitCameraYaw = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				minimapState = 0;
				minimapLevel = -1;
				flagSceneTileX = 0;
				flagSceneTileZ = 0;
				playerCount = 0;
				npcCount = 0;

				for (int var14 = 0; var14 < MAX_PLAYER_COUNT; var14++) {
					players[var14] = null;
					playerAppearanceBuffer[var14] = null;
				}

				for (int var15 = 0; var15 < 16384; var15++) {
					npcs[var15] = null;
				}

				localPlayer = players[LOCAL_PLAYER_INDEX] = new PlayerEntity();
				projectiles.clear();
				spotanims.clear();

				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							levelObjStacks[var16][var17][var18] = null;
						}
					}
				}

				temporaryLocs = new LinkList();
				friendListStatus = 0;
				friendCount = 0;
				stickyChatInterfaceId = -1;
				chatInterfaceId = -1;
				viewportInterfaceId = -1;
				sidebarInterfaceId = -1;
				viewportOverlayInterfaceId = -1;
				pressedContinueOption = false;
				selectedTab = 3;
				chatbackInputOpen = 0;
				menuVisible = false;
				showSocialInput = false;
				modalMessage = null;
				inMultizone = 0;
				flashingTab = -1;
				designGenderMale = true;
				validateCharacterDesign();

				for (int var19 = 0; var19 < 5; var19++) {
					designColors[var19] = 0;
				}

				for (int var20 = 0; var20 < 5; var20++) {
					playerOptions[var20] = null;
					playerOptionPushDown[var20] = false;
				}

				oplogic1 = 0;
				oplogic2 = 0;
				oplogic3 = 0;
				oplogic4 = 0;
				oplogic5 = 0;
				oplogic6 = 0;
				oplogic7 = 0;
				oplogic8 = 0;
				prepareGameScreen();
			} else if (var8 == 3) {
				loginMessage0 = "";
				loginMessage1 = "Invalid username or password.";
			} else if (var8 == 4) {
				loginMessage0 = "Your account has been disabled.";
				loginMessage1 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				loginMessage0 = "Your account is already logged in.";
				loginMessage1 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				loginMessage0 = "RuneScape has been updated!";
				loginMessage1 = "Please reload this page.";
			} else if (var8 == 7) {
				loginMessage0 = "This world is full.";
				loginMessage1 = "Please use a different world.";
			} else if (var8 == 8) {
				loginMessage0 = "Unable to connect.";
				loginMessage1 = "Login server offline.";
			} else if (var8 == 9) {
				loginMessage0 = "Login limit exceeded.";
				loginMessage1 = "Too many connections from your address.";
			} else if (var8 == 10) {
				loginMessage0 = "Unable to connect.";
				loginMessage1 = "Bad session id.";
			} else if (var8 == 11) {
				loginMessage1 = "Login server rejected session.";
				loginMessage1 = "Please try again.";
			} else if (var8 == 12) {
				loginMessage0 = "You need a members account to login to this world.";
				loginMessage1 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				loginMessage0 = "Could not complete login.";
				loginMessage1 = "Please try using a different world.";
			} else if (var8 == 14) {
				loginMessage0 = "The server is being updated.";
				loginMessage1 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				ingame = true;
				out.pos = 0;
				in.pos = 0;
				packetType = -1;
				lastPacketType0 = -1;
				lastPacketType1 = -1;
				lastPacketType2 = -1;
				packetSize = 0;
				idleNetCycles = 0;
				systemUpdateTimer = 0;
				menuSize = 0;
				menuVisible = false;
				sceneLoadStartTime = System.currentTimeMillis();
			} else if (var8 == 16) {
				loginMessage0 = "Login attempts exceeded.";
				loginMessage1 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				loginMessage0 = "You are standing in a members-only area.";
				loginMessage1 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				loginMessage0 = "Invalid loginserver requested";
				loginMessage1 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var21 = stream.read(); var21 >= 0; var21--) {
					loginMessage0 = "You have only just left another world";
					loginMessage1 = "Your profile will be transferred in: " + var21 + " seconds";
					drawTitleScreen(true);

					try {
						Thread.sleep(1000L);
					} catch (Exception var23) {
					}
				}

				login(arg0, arg1, arg2);
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				loginMessage0 = "Unexpected server response";
				loginMessage1 = "Please try using a different world.";
			} else if (var9 != 0) {
				loginMessage0 = "No response from server";
				loginMessage1 = "Please try using a different world.";
			} else if (loginAttempts < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}

				loginAttempts++;
				login(arg0, arg1, arg2);
			} else {
				loginMessage0 = "No response from loginserver";
				loginMessage1 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			loginMessage0 = "";
			loginMessage1 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIIIZI)Z")
	public final boolean tryMove(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
		byte var12 = 104;
		byte var13 = 104;
		for (int var14 = 0; var14 < var12; var14++) {
			for (int var15 = 0; var15 < var13; var15++) {
				bfsDirection[var14][var15] = 0;
				bfsCost[var14][var15] = 99999999;
			}
		}

		int var16 = arg8;
		int var17 = arg4;
		bfsDirection[arg8][arg4] = 99;
		bfsCost[arg8][arg4] = 0;
		byte var18 = 0;
		int var19 = 0;
		bfsStepX[var18] = arg8;
		int var35 = var18 + 1;
		bfsStepZ[var18] = arg4;
		boolean var20 = false;
		int var21 = bfsStepX.length;
		int[][] var22 = levelCollisionMap[currentLevel].flags;
		while (var35 != var19) {
			var16 = bfsStepX[var19];
			var17 = bfsStepZ[var19];
			var19 = (var19 + 1) % var21;

			if (arg10 == var16 && arg7 == var17) {
				var20 = true;
				break;
			}

			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && levelCollisionMap[currentLevel].reachedWall(arg10, var16, var17, arg1, arg3 - 1, arg7)) {
					var20 = true;
					break;
				}

				if (arg3 < 10 && levelCollisionMap[currentLevel].reachedWallDecoration(arg10, arg7, var17, arg3 - 1, arg1, var16)) {
					var20 = true;
					break;
				}
			}

			if (arg5 != 0 && arg2 != 0 && levelCollisionMap[currentLevel].reachedLoc(arg7, arg10, var16, arg2, arg6, arg5, var17)) {
				var20 = true;
				break;
			}

			int var23 = bfsCost[var16][var17] + 1;
			if (var16 > 0 && bfsDirection[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				bfsStepX[var35] = var16 - 1;
				bfsStepZ[var35] = var17;
				var35 = (var35 + 1) % var21;
				bfsDirection[var16 - 1][var17] = 2;
				bfsCost[var16 - 1][var17] = var23;
			}

			if (var16 < var12 - 1 && bfsDirection[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				bfsStepX[var35] = var16 + 1;
				bfsStepZ[var35] = var17;
				var35 = (var35 + 1) % var21;
				bfsDirection[var16 + 1][var17] = 8;
				bfsCost[var16 + 1][var17] = var23;
			}

			if (var17 > 0 && bfsDirection[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				bfsStepX[var35] = var16;
				bfsStepZ[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				bfsDirection[var16][var17 - 1] = 1;
				bfsCost[var16][var17 - 1] = var23;
			}

			if (var17 < var13 - 1 && bfsDirection[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				bfsStepX[var35] = var16;
				bfsStepZ[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				bfsDirection[var16][var17 + 1] = 4;
				bfsCost[var16][var17 + 1] = var23;
			}

			if (var16 > 0 && var17 > 0 && bfsDirection[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				bfsStepX[var35] = var16 - 1;
				bfsStepZ[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				bfsDirection[var16 - 1][var17 - 1] = 3;
				bfsCost[var16 - 1][var17 - 1] = var23;
			}

			if (var16 < var12 - 1 && var17 > 0 && bfsDirection[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				bfsStepX[var35] = var16 + 1;
				bfsStepZ[var35] = var17 - 1;
				var35 = (var35 + 1) % var21;
				bfsDirection[var16 + 1][var17 - 1] = 9;
				bfsCost[var16 + 1][var17 - 1] = var23;
			}

			if (var16 > 0 && var17 < var13 - 1 && bfsDirection[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				bfsStepX[var35] = var16 - 1;
				bfsStepZ[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				bfsDirection[var16 - 1][var17 + 1] = 6;
				bfsCost[var16 - 1][var17 + 1] = var23;
			}

			if (var16 < var12 - 1 && var17 < var13 - 1 && bfsDirection[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				bfsStepX[var35] = var16 + 1;
				bfsStepZ[var35] = var17 + 1;
				var35 = (var35 + 1) % var21;
				bfsDirection[var16 + 1][var17 + 1] = 12;
				bfsCost[var16 + 1][var17 + 1] = var23;
			}
		}

		tryMoveNearest = 0;
		if (!var20) {
			if (arg9) {
				int var24 = 100;
				for (int var25 = 1; var25 < 2; var25++) {
					for (int var26 = arg10 - var25; var26 <= arg10 + var25; var26++) {
						for (int var27 = arg7 - var25; var27 <= arg7 + var25; var27++) {
							if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && bfsCost[var26][var27] < var24) {
								var24 = bfsCost[var26][var27];
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
		bfsStepX[var28] = var16;
		int var36 = var28 + 1;
		bfsStepZ[var28] = var17;
		int var29;
		int var30 = var29 = bfsDirection[var16][var17];
		while (arg8 != var16 || arg4 != var17) {
			if (var29 != var30) {
				var29 = var30;
				bfsStepX[var36] = var16;
				bfsStepZ[var36++] = var17;
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

			var30 = bfsDirection[var16][var17];
		}

		if (var36 <= 0) {
			if (arg0 == 1) {
				return false;
			}

			return true;
		}

		int var31 = var36;
		if (var36 > 25) {
			var31 = 25;
		}

		var36--;
		int var32 = bfsStepX[var36];
		int var33 = bfsStepZ[var36];
		oplogic4 += var31;
		if (oplogic4 >= 92) {
			out.p1isaac(36);
			out.p4(0);
			oplogic4 = 0;
		}

		if (arg0 == 0) {
			out.p1isaac(164);
			out.p1(var31 + var31 + 3);
		}

		if (arg0 == 1) {
			out.p1isaac(248);
			out.p1(var31 + var31 + 3 + 14);
		}

		if (arg0 == 2) {
			out.p1isaac(98);
			out.p1(var31 + var31 + 3);
		}

		out.p2_alt3(sceneBaseTileX + var32);
		flagSceneTileX = bfsStepX[0];
		flagSceneTileZ = bfsStepZ[0];

		for (int var34 = 1; var34 < var31; var34++) {
			var36--;
			out.p1(bfsStepX[var36] - var32);
			out.p1(bfsStepZ[var36] - var33);
		}

		out.p2_alt1(sceneBaseTileZ + var33);
		out.p1_alt2(actionKey[5] == 1 ? 1 : 0);
		return true;
	}

	@ObfuscatedName("client.a(ILMBMGIXGO;Z)V")
	public final void readNpcUpdates(int arg0, Packet arg1) {
		for (int var3 = 0; var3 < entityUpdateCount; var3++) {
			int var4 = entityUpdateIds[var3];
			NpcEntity var5 = npcs[var4];
			int var6 = arg1.g1();
			if ((var6 & 0x10) != 0) {
				int var7 = arg1.g2_alt1();
				if (var7 == 0xFFFF) {
					var7 = -1;
				}

				int var8 = arg1.g1();
				if (var5.primarySeqId == var7 && var7 != -1) {
					int var9 = SeqType.instances[var7].replacemode;
					if (var9 == 1) {
						var5.primarySeqFrame = 0;
						var5.primarySeqCycle = 0;
						var5.primarySeqDelay = var8;
						var5.primarySeqLoop = 0;
					}

					if (var9 == 2) {
						var5.primarySeqLoop = 0;
					}
				} else if (var7 == -1 || var5.primarySeqId == -1 || SeqType.instances[var7].priority >= SeqType.instances[var5.primarySeqId].priority) {
					var5.primarySeqId = var7;
					var5.primarySeqFrame = 0;
					var5.primarySeqCycle = 0;
					var5.primarySeqDelay = var8;
					var5.primarySeqLoop = 0;
					var5.seqPathLength = var5.pathLength;
				}
			}

			if ((var6 & 0x8) != 0) {
				int var10 = arg1.g1_alt1();
				int var11 = arg1.g1_alt2();
				var5.hit(var11, var10, loopCycle);
				var5.combatCycle = loopCycle + 300;
				var5.health = arg1.g1_alt1();
				var5.totalHealth = arg1.g1();
			}

			if ((var6 & 0x80) != 0) {
				var5.spotanimId = arg1.g2();
				int var12 = arg1.g4();
				var5.spotanimHeight = var12 >> 16;
				var5.spotanimLastCycle = (var12 & 0xFFFF) + loopCycle;
				var5.spotanimFrame = 0;
				var5.spotanimCycle = 0;

				if (var5.spotanimLastCycle > loopCycle) {
					var5.spotanimFrame = -1;
				}

				if (var5.spotanimId == 0xFFFF) {
					var5.spotanimId = -1;
				}
			}

			if ((var6 & 0x20) != 0) {
				var5.targetId = arg1.g2();
				if (var5.targetId == 0xFFFF) {
					var5.targetId = -1;
				}
			}

			if ((var6 & 0x1) != 0) {
				var5.chat = arg1.gjstr();
				var5.chatTimer = 100;
			}

			if ((var6 & 0x40) != 0) {
				int var13 = arg1.g1_alt2();
				int var14 = arg1.g1_alt3();
				var5.hit(var14, var13, loopCycle);
				var5.combatCycle = loopCycle + 300;
				var5.health = arg1.g1_alt3();
				var5.totalHealth = arg1.g1_alt2();
			}

			if ((var6 & 0x2) != 0) {
				var5.type = NpcType.get(arg1.g2_alt3());
				var5.size = var5.type.size;
				var5.turnSpeed = var5.type.turnspeed;
				var5.seqWalkId = var5.type.walkanim;
				var5.seqTurnAroundId = var5.type.walkanim_b;
				var5.seqTurnLeftId = var5.type.walkanim_r;
				var5.seqTurnRightId = var5.type.walkanim_l;
				var5.seqStandId = var5.type.readyanim;
			}

			if ((var6 & 0x4) != 0) {
				var5.targetTileX = arg1.g2_alt1();
				var5.targetTile = arg1.g2_alt1();
			}
		}
	}

	@ObfuscatedName("client.a(LCKDEJADD;IZII)V")
	public final void addNPCOptions(NpcType arg0, int arg1, int arg2, int arg3) {
		if (menuSize < 400) {
			if (arg0.multinpc != null) {
				arg0 = arg0.getMultiNpc();
			}

			if (arg0 != null && arg0.active) {
				String var5 = arg0.name;
				if (arg0.vislevel != 0) {
					var5 = var5 + getCombatLevelColorTag(localPlayer.combatLevel, arg0.vislevel) + " (level-" + arg0.vislevel + ")";
				}

				if (objSelected == 1) {
					menuOption[menuSize] = "Use " + objSelectedName + " with @yel@" + var5;
					menuAction[menuSize] = 582;
					menuParamA[menuSize] = arg1;
					menuParamB[menuSize] = arg3;
					menuParamC[menuSize] = arg2;
					menuSize++;
				} else if (spellSelected != 1) {
					if (arg0.op != null) {
						for (int var6 = 4; var6 >= 0; var6--) {
							if (arg0.op[var6] != null && !arg0.op[var6].equalsIgnoreCase("attack")) {
								menuOption[menuSize] = arg0.op[var6] + " @yel@" + var5;

								if (var6 == 0) {
									menuAction[menuSize] = 20;
								}

								if (var6 == 1) {
									menuAction[menuSize] = 412;
								}

								if (var6 == 2) {
									menuAction[menuSize] = 225;
								}

								if (var6 == 3) {
									menuAction[menuSize] = 965;
								}

								if (var6 == 4) {
									menuAction[menuSize] = 478;
								}

								menuParamA[menuSize] = arg1;
								menuParamB[menuSize] = arg3;
								menuParamC[menuSize] = arg2;
								menuSize++;
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

								menuOption[menuSize] = arg0.op[var7] + " @yel@" + var5;

								if (var7 == 0) {
									menuAction[menuSize] = var8 + 20;
								}

								if (var7 == 1) {
									menuAction[menuSize] = var8 + 412;
								}

								if (var7 == 2) {
									menuAction[menuSize] = var8 + 225;
								}

								if (var7 == 3) {
									menuAction[menuSize] = var8 + 965;
								}

								if (var7 == 4) {
									menuAction[menuSize] = var8 + 478;
								}

								menuParamA[menuSize] = arg1;
								menuParamB[menuSize] = arg3;
								menuParamC[menuSize] = arg2;
								menuSize++;
							}
						}
					}

					menuOption[menuSize] = "Examine @yel@" + var5;
					menuAction[menuSize] = 1025;
					menuParamA[menuSize] = arg1;
					menuParamB[menuSize] = arg3;
					menuParamC[menuSize] = arg2;
					menuSize++;
				} else if ((activeSpellFlags & 0x2) == 2) {
					menuOption[menuSize] = spellCaption + " @yel@" + var5;
					menuAction[menuSize] = 413;
					menuParamA[menuSize] = arg1;
					menuParamB[menuSize] = arg3;
					menuParamC[menuSize] = arg2;
					menuSize++;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILDLZHLHNK;ZI)V")
	public final void addPlayerOptions(int arg0, int arg1, PlayerEntity arg2, int arg3) {
		if (localPlayer != arg2 && menuSize < 400) {
			String var5;
			if (arg2.skillLevel == 0) {
				var5 = arg2.name + getCombatLevelColorTag(localPlayer.combatLevel, arg2.combatLevel) + " (level-" + arg2.combatLevel + ")";
			} else {
				var5 = arg2.name + " (skill-" + arg2.skillLevel + ")";
			}

			if (objSelected == 1) {
				menuOption[menuSize] = "Use " + objSelectedName + " with @whi@" + var5;
				menuAction[menuSize] = 491;
				menuParamA[menuSize] = arg1;
				menuParamB[menuSize] = arg0;
				menuParamC[menuSize] = arg3;
				menuSize++;
			} else if (spellSelected != 1) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (playerOptions[var6] != null) {
						menuOption[menuSize] = playerOptions[var6] + " @whi@" + var5;
						short var7 = 0;
						if (playerOptions[var6].equalsIgnoreCase("attack")) {
							if (arg2.combatLevel > localPlayer.combatLevel) {
								var7 = 2000;
							}

							if (localPlayer.team != 0 && arg2.team != 0) {
								if (localPlayer.team == arg2.team) {
									var7 = 2000;
								} else {
									var7 = 0;
								}
							}
						} else if (playerOptionPushDown[var6]) {
							var7 = 2000;
						}

						if (var6 == 0) {
							menuAction[menuSize] = var7 + 561;
						}

						if (var6 == 1) {
							menuAction[menuSize] = var7 + 779;
						}

						if (var6 == 2) {
							menuAction[menuSize] = var7 + 27;
						}

						if (var6 == 3) {
							menuAction[menuSize] = var7 + 577;
						}

						if (var6 == 4) {
							menuAction[menuSize] = var7 + 729;
						}

						menuParamA[menuSize] = arg1;
						menuParamB[menuSize] = arg0;
						menuParamC[menuSize] = arg3;
						menuSize++;
					}
				}
			} else if ((activeSpellFlags & 0x8) == 8) {
				menuOption[menuSize] = spellCaption + " @whi@" + var5;
				menuAction[menuSize] = 365;
				menuParamA[menuSize] = arg1;
				menuParamB[menuSize] = arg0;
				menuParamC[menuSize] = arg3;
				menuSize++;
			}

			for (int var8 = 0; var8 < menuSize; var8++) {
				if (menuAction[var8] == 516) {
					menuOption[var8] = "Walk here @whi@" + var5;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLDYMVKFXP;)V")
	public final void storeLoc(LocAddEntity arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;

		if (arg0.layer == 0) {
			var2 = scene.getWallBitset(arg0.level, arg0.localX, arg0.localZ);
		}

		if (arg0.layer == 1) {
			var2 = scene.getWallDecorationBitset(arg0.level, arg0.localX, arg0.localZ);
		}

		if (arg0.layer == 2) {
			var2 = scene.getLocBitset(arg0.level, arg0.localX, arg0.localZ);
		}

		if (arg0.layer == 3) {
			var2 = scene.getGroundDecorationBitset(arg0.level, arg0.localX, arg0.localZ);
		}

		if (var2 != 0) {
			int var6 = scene.getInfo(arg0.level, arg0.localX, arg0.localZ, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}

		arg0.previousType = var3;
		arg0.previousShape = var4;
		arg0.previousRotation = var5;
	}

	@ObfuscatedName("client.h(Z)V")
	public final void updateAudio() {
		for (int var1 = 0; var1 < waveCount; var1++) {
			if (waveDelay[var1] <= 0) {
				boolean var2 = false;
				try {
					if (waveIds[var1] != lastWaveId || waveLoops[var1] != lastWaveLoops) {
						Packet var3 = Wave.generate(waveLoops[var1], waveIds[var1]);
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

		if (nextMusicDelay > 0) {
			nextMusicDelay -= 20;
			if (nextMusicDelay < 0) {
				nextMusicDelay = 0;
			}

			if (nextMusicDelay == 0 && midiActive && !lowMemory) {
				midiSong = nextMidiSong;
				midiFading = true;
				ondemand.request(2, midiSong);
				return;
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void load() {
		drawProgress(20, "Starting up");

		if (signlink.sunjava) {
			mindel = 5;
		}

		if (started) {
			errorStarted = true;
		} else {
			started = true;
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

			if (var1) {
				if (signlink.cache_dat != null) {
					for (int var3 = 0; var3 < 5; var3++) {
						fileStreams[var3] = new FileStream(500000, signlink.cache_dat, signlink.cache_idx[var3], var3 + 1);
					}
				}

				try {
					loadArchiveChecksums();
					archiveTitle = loadArchive(1, "title screen", "title", archiveChecksum[1], 25);
					fontPlain11 = new PixFont(false, "p11_full", archiveTitle);
					fontPlain12 = new PixFont(false, "p12_full", archiveTitle);
					fontBold12 = new PixFont(false, "b12_full", archiveTitle);
					fontQuill8 = new PixFont(true, "q8_full", archiveTitle);
					loadTitleBackground();
					loadTitleImages();
					Jagfile var4 = loadArchive(2, "config", "config", archiveChecksum[2], 30);
					Jagfile var5 = loadArchive(3, "interface", "interface", archiveChecksum[3], 35);
					Jagfile var6 = loadArchive(4, "2d graphics", "media", archiveChecksum[4], 40);
					Jagfile var7 = loadArchive(6, "textures", "textures", archiveChecksum[6], 45);
					Jagfile var8 = loadArchive(7, "chat system", "wordenc", archiveChecksum[7], 50);
					Jagfile var9 = loadArchive(8, "sound effects", "sounds", archiveChecksum[8], 55);
					levelTileFlags = new byte[4][104][104];
					levelHeightmap = new int[4][105][105];
					scene = new World3D(104, 104, levelHeightmap, 4);

					for (int var10 = 0; var10 < 4; var10++) {
						levelCollisionMap[var10] = new CollisionMap(104, 104);
					}

					imageMinimap = new Pix32(512, 512);
					Jagfile var11 = loadArchive(5, "update list", "versionlist", archiveChecksum[5], 60);
					drawProgress(60, "Connecting to update server");
					ondemand = new OnDemand();
					ondemand.load(var11, this);
					AnimFrame.init(ondemand.getAnimCount());
					Model.init(ondemand.getFileCount(0), ondemand);

					if (!lowMemory) {
						midiSong = 0;
						try {
							midiSong = Integer.parseInt(getParameter("music"));
						} catch (Exception var70) {
						}

						midiFading = true;
						ondemand.request(2, midiSong);

						while (ondemand.remaining() > 0) {
							handleOnDemandRequests();

							try {
								Thread.sleep(100L);
							} catch (Exception var69) {
							}

							if (ondemand.failCount > 3) {
								showLoadError("ondemand");
								return;
							}
						}
					}

					drawProgress(65, "Requesting animations");
					int var12 = ondemand.getFileCount(1);
					for (int var13 = 0; var13 < var12; var13++) {
						ondemand.request(1, var13);
					}

					while (ondemand.remaining() > 0) {
						int var14 = var12 - ondemand.remaining();
						if (var14 > 0) {
							drawProgress(65, "Loading animations - " + var14 * 100 / var12 + "%");
						}

						handleOnDemandRequests();

						try {
							Thread.sleep(100L);
						} catch (Exception var68) {
						}

						if (ondemand.failCount > 3) {
							showLoadError("ondemand");
							return;
						}
					}

					drawProgress(70, "Requesting models");
					int var15 = ondemand.getFileCount(0);
					for (int var16 = 0; var16 < var15; var16++) {
						int var17 = ondemand.getModelFlags(var16);
						if ((var17 & 0x1) != 0) {
							ondemand.request(0, var16);
						}
					}

					int var18 = ondemand.remaining();
					while (ondemand.remaining() > 0) {
						int var19 = var18 - ondemand.remaining();
						if (var19 > 0) {
							drawProgress(70, "Loading models - " + var19 * 100 / var18 + "%");
						}

						handleOnDemandRequests();

						try {
							Thread.sleep(100L);
						} catch (Exception var67) {
						}
					}

					if (fileStreams[0] != null) {
						drawProgress(75, "Requesting maps");
						ondemand.request(3, ondemand.getMapFile(0, 48, 47));
						ondemand.request(3, ondemand.getMapFile(1, 48, 47));
						ondemand.request(3, ondemand.getMapFile(0, 48, 48));
						ondemand.request(3, ondemand.getMapFile(1, 48, 48));
						ondemand.request(3, ondemand.getMapFile(0, 48, 49));
						ondemand.request(3, ondemand.getMapFile(1, 48, 49));
						ondemand.request(3, ondemand.getMapFile(0, 47, 47));
						ondemand.request(3, ondemand.getMapFile(1, 47, 47));
						ondemand.request(3, ondemand.getMapFile(0, 47, 48));
						ondemand.request(3, ondemand.getMapFile(1, 47, 48));
						ondemand.request(3, ondemand.getMapFile(0, 148, 48));
						ondemand.request(3, ondemand.getMapFile(1, 148, 48));
						int var20 = ondemand.remaining();
						while (ondemand.remaining() > 0) {
							int var21 = var20 - ondemand.remaining();
							if (var21 > 0) {
								drawProgress(75, "Loading maps - " + var21 * 100 / var20 + "%");
							}

							handleOnDemandRequests();

							try {
								Thread.sleep(100L);
							} catch (Exception var66) {
							}
						}
					}

					int var22 = ondemand.getFileCount(0);
					for (int var23 = 0; var23 < var22; var23++) {
						int var24 = ondemand.getModelFlags(var23);
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
							ondemand.prefetch(var25, 0, var23);
						}
					}

					ondemand.prefetchMaps(members);

					if (!lowMemory) {
						int var26 = ondemand.getFileCount(2);
						for (int var27 = 1; var27 < var26; var27++) {
							if (ondemand.shouldPrefetchMidi(var27)) {
								ondemand.prefetch((byte) 1, 2, var27);
							}
						}
					}

					drawProgress(80, "Unpacking media");
					imageInvback = new Pix8(var6, "invback", 0);
					imageChatback = new Pix8(var6, "chatback", 0);
					imageMapback = new Pix8(var6, "mapback", 0);
					imageBackbase1 = new Pix8(var6, "backbase1", 0);
					imageBackbase2 = new Pix8(var6, "backbase2", 0);
					imageBackhmid1 = new Pix8(var6, "backhmid1", 0);

					for (int var28 = 0; var28 < 13; var28++) {
						imageSideicons[var28] = new Pix8(var6, "sideicons", var28);
					}

					imageCompass = new Pix32(var6, "compass", 0);
					imageMapedge = new Pix32(var6, "mapedge", 0);
					imageMapedge.crop();

					try {
						for (int var29 = 0; var29 < 100; var29++) {
							imageMapscene[var29] = new Pix8(var6, "mapscene", var29);
						}
					} catch (Exception var74) {
					}

					try {
						for (int var30 = 0; var30 < 100; var30++) {
							imageMapfunction[var30] = new Pix32(var6, "mapfunction", var30);
						}
					} catch (Exception var73) {
					}

					try {
						for (int var31 = 0; var31 < 20; var31++) {
							imageHitmarks[var31] = new Pix32(var6, "hitmarks", var31);
						}
					} catch (Exception var72) {
					}

					try {
						for (int var32 = 0; var32 < 20; var32++) {
							imageHeadicons[var32] = new Pix32(var6, "headicons", var32);
						}
					} catch (Exception var71) {
					}

					imageMapmarker0 = new Pix32(var6, "mapmarker", 0);
					imageMapmarker1 = new Pix32(var6, "mapmarker", 1);

					for (int var33 = 0; var33 < 8; var33++) {
						imageCrosses[var33] = new Pix32(var6, "cross", var33);
					}

					imageMapdot0 = new Pix32(var6, "mapdots", 0);
					imageMapdot1 = new Pix32(var6, "mapdots", 1);
					imageMapdot2 = new Pix32(var6, "mapdots", 2);
					imageMapdot3 = new Pix32(var6, "mapdots", 3);
					imageMapdot4 = new Pix32(var6, "mapdots", 4);
					imageScrollbar0 = new Pix8(var6, "scrollbar", 0);
					imageScrollbar1 = new Pix8(var6, "scrollbar", 1);
					imageRedstone1 = new Pix8(var6, "redstone1", 0);
					imageRedstone2 = new Pix8(var6, "redstone2", 0);
					imageRedstone3 = new Pix8(var6, "redstone3", 0);
					imageRedstone1h = new Pix8(var6, "redstone1", 0);
					imageRedstone1h.flipHorizontally();
					imageRedstone2h = new Pix8(var6, "redstone2", 0);
					imageRedstone2h.flipHorizontally();
					imageRedstone1v = new Pix8(var6, "redstone1", 0);
					imageRedstone1v.flipVertically();
					imageRedstone2v = new Pix8(var6, "redstone2", 0);
					imageRedstone2v.flipVertically();
					imageRedstone3v = new Pix8(var6, "redstone3", 0);
					imageRedstone3v.flipVertically();
					imageRedstone1hv = new Pix8(var6, "redstone1", 0);
					imageRedstone1hv.flipHorizontally();
					imageRedstone1hv.flipVertically();
					imageRedstone2hv = new Pix8(var6, "redstone2", 0);
					imageRedstone2hv.flipHorizontally();
					imageRedstone2hv.flipVertically();

					for (int var34 = 0; var34 < 2; var34++) {
						imageModIcons[var34] = new Pix8(var6, "mod_icons", var34);
					}

					Pix32 var35 = new Pix32(var6, "backleft1", 0);
					areaBackleft1 = new PixMap(var35.cropRight, var35.cropBottom, getBaseComponent());
					var35.blitOpaque(0, 0);
					Pix32 var36 = new Pix32(var6, "backleft2", 0);
					areaBackleft2 = new PixMap(var36.cropRight, var36.cropBottom, getBaseComponent());
					var36.blitOpaque(0, 0);
					Pix32 var37 = new Pix32(var6, "backright1", 0);
					areaBackright1 = new PixMap(var37.cropRight, var37.cropBottom, getBaseComponent());
					var37.blitOpaque(0, 0);
					Pix32 var38 = new Pix32(var6, "backright2", 0);
					areaBackright2 = new PixMap(var38.cropRight, var38.cropBottom, getBaseComponent());
					var38.blitOpaque(0, 0);
					Pix32 var39 = new Pix32(var6, "backtop1", 0);
					areaBacktop1 = new PixMap(var39.cropRight, var39.cropBottom, getBaseComponent());
					var39.blitOpaque(0, 0);
					Pix32 var40 = new Pix32(var6, "backvmid1", 0);
					areaBackvmid1 = new PixMap(var40.cropRight, var40.cropBottom, getBaseComponent());
					var40.blitOpaque(0, 0);
					Pix32 var41 = new Pix32(var6, "backvmid2", 0);
					areaBackvmid2 = new PixMap(var41.cropRight, var41.cropBottom, getBaseComponent());
					var41.blitOpaque(0, 0);
					Pix32 var42 = new Pix32(var6, "backvmid3", 0);
					areaBackvmid3 = new PixMap(var42.cropRight, var42.cropBottom, getBaseComponent());
					var42.blitOpaque(0, 0);
					Pix32 var43 = new Pix32(var6, "backhmid2", 0);
					areaBackhmid2 = new PixMap(var43.cropRight, var43.cropBottom, getBaseComponent());
					var43.blitOpaque(0, 0);
					int var44 = (int) (Math.random() * 21.0D) - 10;
					int var45 = (int) (Math.random() * 21.0D) - 10;
					int var46 = (int) (Math.random() * 21.0D) - 10;
					int var47 = (int) (Math.random() * 41.0D) - 20;
					for (int var48 = 0; var48 < 100; var48++) {
						if (imageMapfunction[var48] != null) {
							imageMapfunction[var48].translate(var44 + var47, var45 + var47, var46 + var47);
						}

						if (imageMapscene[var48] != null) {
							imageMapscene[var48].translate(var44 + var47, var45 + var47, var46 + var47);
						}
					}

					drawProgress(83, "Unpacking textures");
					Pix3D.unpackTextures(var7);
					Pix3D.setBrightness(0.8D);
					Pix3D.initPool(20);
					drawProgress(86, "Unpacking config");
					SeqType.unpack(var4);
					LocType.unpack(var4);
					FloType.unpack(var4);
					ObjType.unpack(var4);
					NpcType.unpack(var4);
					IdkType.unpack(var4);
					SpotAnimType.unpack(var4);
					VarpType.unpack(var4);
					VarbitType.unpack(var4);
					ObjType.membersWorld = members;

					if (!lowMemory) {
						drawProgress(90, "Unpacking sounds");
						byte[] var49 = var9.read("sounds.dat", null);
						Packet var50 = new Packet(var49);
						Wave.unpack(var50);
					}

					drawProgress(95, "Unpacking interfaces");
					PixFont[] var51 = new PixFont[] { fontPlain11, fontPlain12, fontBold12, fontQuill8 };
					Component.unpack(var5, var51, var6);
					drawProgress(100, "Preparing game engine");

					for (int var52 = 0; var52 < 33; var52++) {
						int var53 = 999;
						int var54 = 0;
						for (int var55 = 0; var55 < 34; var55++) {
							if (imageMapback.pixels[imageMapback.cropRight * var52 + var55] == 0) {
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
							if (imageMapback.pixels[imageMapback.cropRight * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
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

					Pix3D.init3D(479, 96);
					areaChatbackOffsets = Pix3D.lineOffset;
					Pix3D.init3D(190, 261);
					areaSidebarOffsets = Pix3D.lineOffset;
					Pix3D.init3D(512, 334);
					areaViewportOffsets = Pix3D.lineOffset;
					int[] var60 = new int[9];
					for (int var61 = 0; var61 < 9; var61++) {
						int var62 = var61 * 32 + 128 + 15;
						int var63 = var62 * 3 + 600;
						int var64 = Pix3D.sin[var62];
						var60[var61] = var63 * var64 >> 16;
					}

					World3D.init(500, 800, 512, 334, var60);
					WordFilter.unpack(var8);
					mouseTracking = new MouseTracking(this);
					startThread(mouseTracking, 10);
					LocEntity.varProvider = this;
					LocType.varProvider = this;
					NpcType.varProvider = this;
				} catch (Exception var75) {
					signlink.reporterror("loaderror " + lastProgressMessage + " " + lastProgressPercent);
					errorLoading = true;
				}
			} else {
				errorHost = true;
			}
		}
	}

	@ObfuscatedName("client.a(LMBMGIXGO;IB)V")
	public final void readNewPlayers(Packet arg0, int arg1) {
		while (arg0.bitPos + 10 < arg1 * 8) {
			int var3 = arg0.gBit(11);
			if (var3 == 2047) {
				break;
			}

			if (players[var3] == null) {
				players[var3] = new PlayerEntity();
				if (playerAppearanceBuffer[var3] != null) {
					players[var3].read(playerAppearanceBuffer[var3]);
				}
			}

			playerIds[playerCount++] = var3;
			PlayerEntity var4 = players[var3];
			var4.cycle = loopCycle;
			int var5 = arg0.gBit(1);
			if (var5 == 1) {
				entityUpdateIds[entityUpdateCount++] = var3;
			}

			int var6 = arg0.gBit(1);
			int var7 = arg0.gBit(5);
			if (var7 > 15) {
				var7 -= 32;
			}

			int var8 = arg0.gBit(5);
			if (var8 > 15) {
				var8 -= 32;
			}

			var4.move(localPlayer.pathTileX[0] + var8, localPlayer.pathTileZ[0] + var7, var6 == 1);
		}

		arg0.accessBytes();
	}

	@ObfuscatedName("client.i(Z)V")
	public final void handleMinimapInput() {
		if (minimapState == 0 && mouseClickButton == 1) {
			int var1 = mouseClickX - 25 - 550;
			int var2 = mouseClickY - 5 - 4;
			if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
				var1 -= 73;
				var2 -= 75;
				int var3 = minimapAnticheatAngle + orbitCameraYaw & 0x7FF;
				int var4 = Pix3D.sin[var3];
				int var5 = Pix3D.cos[var3];
				var4 = (minimapZoom + 256) * var4 >> 8;
				var5 = (minimapZoom + 256) * var5 >> 8;
				int var6 = var1 * var5 + var2 * var4 >> 11;
				int var7 = var2 * var5 - var1 * var4 >> 11;
				int var8 = localPlayer.x + var6 >> 7;
				int var9 = localPlayer.z - var7 >> 7;
				boolean var10 = tryMove(1, 0, 0, 0, localPlayer.pathTileZ[0], 0, 0, var9, localPlayer.pathTileX[0], true, var8);
				if (var10) {
					out.p1(var1);
					out.p1(var2);
					out.p2(orbitCameraYaw);
					out.p1(57);
					out.p1(minimapAnticheatAngle);
					out.p1(minimapZoom);
					out.p1(89);
					out.p2(localPlayer.x);
					out.p2(localPlayer.z);
					out.p1(tryMoveNearest);
					out.p1(63);
				}
			}

			gamelogic5++;
			if (gamelogic5 > 1151) {
				gamelogic5 = 0;
				out.p1isaac(246);
				out.p1(0);
				int var11 = out.pos;

				if ((int) (Math.random() * 2.0D) == 0) {
					out.p1(101);
				}

				out.p1(197);
				out.p2((int) (Math.random() * 65536.0D));
				out.p1((int) (Math.random() * 256.0D));
				out.p1(67);
				out.p2(14214);

				if ((int) (Math.random() * 2.0D) == 0) {
					out.p2(29487);
				}

				out.p2((int) (Math.random() * 65536.0D));

				if ((int) (Math.random() * 2.0D) == 0) {
					out.p1(220);
				}

				out.p1(180);
				out.psize1(out.pos - var11);
				return;
			}
		}
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public final String getIntString(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		}

		return "*";
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

	@ObfuscatedName("client.F(I)V")
	public final void updateNpcs() {
		for (int var1 = 0; var1 < npcCount; var1++) {
			int var2 = npcIds[var1];
			NpcEntity var3 = npcs[var2];
			if (var3 != null) {
				updateEntity(var3.type.size, var3);
			}
		}
	}

	@ObfuscatedName("client.a(IILGQOSZKJC;)V")
	public final void updateEntity(int arg0, PathingEntity arg1) {
		if (arg1.x < 128 || arg1.z < 128 || arg1.x >= 13184 || arg1.z >= 13184) {
			arg1.primarySeqId = -1;
			arg1.spotanimId = -1;
			arg1.forceMoveEndCycle = 0;
			arg1.forceMoveStartCycle = 0;
			arg1.x = arg1.pathTileX[0] * 128 + arg1.size * 64;
			arg1.z = arg1.pathTileZ[0] * 128 + arg1.size * 64;
			arg1.resetPath();
		}

		if (localPlayer == arg1 && (arg1.x < 1536 || arg1.z < 1536 || arg1.x >= 11776 || arg1.z >= 11776)) {
			arg1.primarySeqId = -1;
			arg1.spotanimId = -1;
			arg1.forceMoveEndCycle = 0;
			arg1.forceMoveStartCycle = 0;
			arg1.x = arg1.pathTileX[0] * 128 + arg1.size * 64;
			arg1.z = arg1.pathTileZ[0] * 128 + arg1.size * 64;
			arg1.resetPath();
		}

		if (arg1.forceMoveEndCycle > loopCycle) {
			updateForceMovement(arg1);
		} else if (arg1.forceMoveStartCycle >= loopCycle) {
			startForceMovement(arg1);
		} else {
			updateMovement(arg1);
		}

		updateFacingDirection(arg1);
		updateSequences(arg1);
	}

	@ObfuscatedName("client.a(LGQOSZKJC;Z)V")
	public final void updateForceMovement(PathingEntity arg0) {
		int var2 = arg0.forceMoveEndCycle - loopCycle;
		int var3 = arg0.forceMoveStartSceneTileX * 128 + arg0.size * 64;
		int var4 = arg0.forceMoveStartSceneTileZ * 128 + arg0.size * 64;
		arg0.x += (var3 - arg0.x) / var2;
		arg0.z += (var4 - arg0.z) / var2;
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
	public final void startForceMovement(PathingEntity arg0) {
		if (loopCycle == arg0.forceMoveStartCycle || arg0.primarySeqId == -1 || arg0.primarySeqDelay != 0 || arg0.primarySeqCycle + 1 > SeqType.instances[arg0.primarySeqId].getFrameDuration(arg0.primarySeqFrame)) {
			int var2 = arg0.forceMoveStartCycle - arg0.forceMoveEndCycle;
			int var3 = loopCycle - arg0.forceMoveEndCycle;
			int var4 = arg0.forceMoveStartSceneTileX * 128 + arg0.size * 64;
			int var5 = arg0.forceMoveStartSceneTileZ * 128 + arg0.size * 64;
			int var6 = arg0.forceMoveEndSceneTileX * 128 + arg0.size * 64;
			int var7 = arg0.forceMoveEndSceneTileZ * 128 + arg0.size * 64;
			arg0.x = ((var2 - var3) * var4 + var3 * var6) / var2;
			arg0.z = ((var2 - var3) * var5 + var3 * var7) / var2;
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
	}

	@ObfuscatedName("client.a(BLGQOSZKJC;)V")
	public final void updateMovement(PathingEntity arg0) {
		arg0.secondarySeqId = arg0.seqStandId;
		if (arg0.pathLength == 0) {
			arg0.seqTrigger = 0;
		} else {
			if (arg0.primarySeqId != -1 && arg0.primarySeqDelay == 0) {
				SeqType var2 = SeqType.instances[arg0.primarySeqId];
				if (arg0.seqPathLength > 0 && var2.preanim_move == 0) {
					arg0.seqTrigger++;
					return;
				}

				if (arg0.seqPathLength <= 0 && var2.postanim_move == 0) {
					arg0.seqTrigger++;
					return;
				}
			}

			int var3 = arg0.x;
			int var4 = arg0.z;
			int var5 = arg0.pathTileX[arg0.pathLength - 1] * 128 + arg0.size * 64;
			int var6 = arg0.pathTileZ[arg0.pathLength - 1] * 128 + arg0.size * 64;
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

				int var8 = arg0.seqTurnAroundId;
				if (var7 >= -256 && var7 <= 256) {
					var8 = arg0.seqWalkId;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = arg0.seqTurnRightId;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = arg0.seqTurnLeftId;
				}

				if (var8 == -1) {
					var8 = arg0.seqWalkId;
				}

				arg0.secondarySeqId = var8;
				int var9 = 4;
				if (arg0.yaw != arg0.dstYaw && arg0.targetId == -1 && arg0.turnSpeed != 0) {
					var9 = 2;
				}

				if (arg0.pathLength > 2) {
					var9 = 6;
				}

				if (arg0.pathLength > 3) {
					var9 = 8;
				}

				if (arg0.seqTrigger > 0 && arg0.pathLength > 1) {
					var9 = 8;
					arg0.seqTrigger--;
				}

				if (arg0.pathRunning[arg0.pathLength - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && arg0.seqWalkId == arg0.secondarySeqId && arg0.seqRunId != -1) {
					arg0.secondarySeqId = arg0.seqRunId;
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
					arg0.pathLength--;

					if (arg0.seqPathLength > 0) {
						arg0.seqPathLength--;
						return;
					}
				}
			} else {
				arg0.x = var5;
				arg0.z = var6;
			}
		}
	}

	@ObfuscatedName("client.a(LGQOSZKJC;I)V")
	public final void updateFacingDirection(PathingEntity arg0) {
		if (arg0.turnSpeed != 0) {
			if (arg0.targetId != -1 && arg0.targetId < 32768) {
				NpcEntity var2 = npcs[arg0.targetId];
				if (var2 != null) {
					int var3 = arg0.x - var2.x;
					int var4 = arg0.z - var2.z;
					if (var3 != 0 || var4 != 0) {
						arg0.dstYaw = (int) (Math.atan2(var3, var4) * 325.949D) & 0x7FF;
					}
				}
			}

			if (arg0.targetId >= 32768) {
				int var5 = arg0.targetId - 32768;
				if (localPid == var5) {
					var5 = LOCAL_PLAYER_INDEX;
				}

				PlayerEntity var6 = players[var5];
				if (var6 != null) {
					int var7 = arg0.x - var6.x;
					int var8 = arg0.z - var6.z;
					if (var7 != 0 || var8 != 0) {
						arg0.dstYaw = (int) (Math.atan2(var7, var8) * 325.949D) & 0x7FF;
					}
				}
			}

			if ((arg0.targetTileX != 0 || arg0.targetTile != 0) && (arg0.pathLength == 0 || arg0.seqTrigger > 0)) {
				int var9 = arg0.x - (arg0.targetTileX - sceneBaseTileX - sceneBaseTileX) * 64;
				int var10 = arg0.z - (arg0.targetTile - sceneBaseTileZ - sceneBaseTileZ) * 64;
				if (var9 != 0 || var10 != 0) {
					arg0.dstYaw = (int) (Math.atan2(var9, var10) * 325.949D) & 0x7FF;
				}

				arg0.targetTileX = 0;
				arg0.targetTile = 0;
			}

			int var11 = arg0.dstYaw - arg0.yaw & 0x7FF;
			if (var11 != 0) {
				if (var11 < arg0.turnSpeed || var11 > 2048 - arg0.turnSpeed) {
					arg0.yaw = arg0.dstYaw;
				} else if (var11 > 1024) {
					arg0.yaw -= arg0.turnSpeed;
				} else {
					arg0.yaw += arg0.turnSpeed;
				}

				arg0.yaw &= 0x7FF;
				if (arg0.secondarySeqId == arg0.seqStandId && arg0.yaw != arg0.dstYaw) {
					if (arg0.seqTurnId != -1) {
						arg0.secondarySeqId = arg0.seqTurnId;
						return;
					}

					arg0.secondarySeqId = arg0.seqWalkId;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.b(LGQOSZKJC;I)V")
	public final void updateSequences(PathingEntity arg0) {
		arg0.needsForwardDrawPadding = false;

		if (arg0.secondarySeqId != -1) {
			SeqType var2 = SeqType.instances[arg0.secondarySeqId];
			arg0.secondarySeqCycle++;
			if (arg0.secondarySeqFrame < var2.frameCount && arg0.secondarySeqCycle > var2.getFrameDuration(arg0.secondarySeqFrame)) {
				arg0.secondarySeqCycle = 0;
				arg0.secondarySeqFrame++;
			}

			if (arg0.secondarySeqFrame >= var2.frameCount) {
				arg0.secondarySeqCycle = 0;
				arg0.secondarySeqFrame = 0;
			}
		}

		if (arg0.spotanimId != -1 && loopCycle >= arg0.spotanimLastCycle) {
			if (arg0.spotanimFrame < 0) {
				arg0.spotanimFrame = 0;
			}

			SeqType var3 = SpotAnimType.instances[arg0.spotanimId].seq;
			arg0.spotanimCycle++;
			while (arg0.spotanimFrame < var3.frameCount && arg0.spotanimCycle > var3.getFrameDuration(arg0.spotanimFrame)) {
				arg0.spotanimCycle -= var3.getFrameDuration(arg0.spotanimFrame);
				arg0.spotanimFrame++;
			}

			if (arg0.spotanimFrame >= var3.frameCount && (arg0.spotanimFrame < 0 || arg0.spotanimFrame >= var3.frameCount)) {
				arg0.spotanimId = -1;
			}
		}

		if (arg0.primarySeqId != -1 && arg0.primarySeqDelay <= 1) {
			SeqType var4 = SeqType.instances[arg0.primarySeqId];
			if (var4.preanim_move == 1 && arg0.seqPathLength > 0 && arg0.forceMoveEndCycle <= loopCycle && arg0.forceMoveStartCycle < loopCycle) {
				arg0.primarySeqDelay = 1;
				return;
			}
		}

		if (arg0.primarySeqId != -1 && arg0.primarySeqDelay == 0) {
			SeqType var5 = SeqType.instances[arg0.primarySeqId];
			arg0.primarySeqCycle++;
			while (arg0.primarySeqFrame < var5.frameCount && arg0.primarySeqCycle > var5.getFrameDuration(arg0.primarySeqFrame)) {
				arg0.primarySeqCycle -= var5.getFrameDuration(arg0.primarySeqFrame);
				arg0.primarySeqFrame++;
			}

			if (arg0.primarySeqFrame >= var5.frameCount) {
				arg0.primarySeqFrame -= var5.replayoff;
				arg0.primarySeqLoop++;
				if (arg0.primarySeqLoop >= var5.replaycount) {
					arg0.primarySeqId = -1;
				}

				if (arg0.primarySeqFrame < 0 || arg0.primarySeqFrame >= var5.frameCount) {
					arg0.primarySeqId = -1;
				}
			}

			arg0.needsForwardDrawPadding = var5.stretches;
		}

		if (arg0.primarySeqDelay > 0) {
			arg0.primarySeqDelay--;
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void drawGame() {
		if (redrawTitleBackground) {
			redrawTitleBackground = false;
			areaBackleft1.draw(4, graphics, 0);
			areaBackleft2.draw(357, graphics, 0);
			areaBackright1.draw(4, graphics, 722);
			areaBackright2.draw(205, graphics, 743);
			areaBacktop1.draw(0, graphics, 0);
			areaBackvmid1.draw(4, graphics, 516);
			areaBackvmid2.draw(205, graphics, 516);
			areaBackvmid3.draw(357, graphics, 496);
			areaBackhmid2.draw(338, graphics, 0);
			redrawSidebar = true;
			redrawChatback = true;
			redrawSideicons = true;
			redrawPrivacySettings = true;

			if (sceneState != 2) {
				areaViewport.draw(4, graphics, 4);
				areaMapback.draw(4, graphics, 550);
			}
		}

		if (sceneState == 2) {
			drawScene();
		}

		if (menuVisible && menuArea == 1) {
			redrawSidebar = true;
		}

		if (sidebarInterfaceId != -1) {
			boolean var1 = updateInterfaceAnimation(sceneDelta, sidebarInterfaceId);
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
			drawSidebar();
			redrawSidebar = false;
		}

		if (chatInterfaceId == -1) {
			chatInterface.scrollPosition = chatScrollHeight - chatScrollOffset - 77;

			if (mouseX > 448 && mouseX < 560 && mouseY > 332) {
				handleScrollInput(463, 77, mouseX - 17, mouseY - 357, chatInterface, 0, false, chatScrollHeight);
			}

			int var2 = chatScrollHeight - chatInterface.scrollPosition - 77;
			if (var2 < 0) {
				var2 = 0;
			}

			if (var2 > chatScrollHeight - 77) {
				var2 = chatScrollHeight - 77;
			}

			if (chatScrollOffset != var2) {
				chatScrollOffset = var2;
				redrawChatback = true;
			}
		}

		if (chatInterfaceId != -1) {
			boolean var3 = updateInterfaceAnimation(sceneDelta, chatInterfaceId);
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

		if (modalMessage != null) {
			redrawChatback = true;
		}

		if (menuVisible && menuArea == 2) {
			redrawChatback = true;
		}

		if (redrawChatback) {
			drawChat();
			redrawChatback = false;
		}

		if (sceneState == 2) {
			drawMinimap();
			areaMapback.draw(4, graphics, 550);
		}

		if (flashingTab != -1) {
			redrawSideicons = true;
		}

		if (redrawSideicons) {
			if (flashingTab != -1 && selectedTab == flashingTab) {
				flashingTab = -1;
				out.p1isaac(120);
				out.p1(selectedTab);
			}

			redrawSideicons = false;
			areaBackhmid1.bind();
			imageBackhmid1.draw(0, 0);

			if (sidebarInterfaceId == -1) {
				if (tabInterfaceId[selectedTab] != -1) {
					if (selectedTab == 0) {
						imageRedstone1.draw(22, 10);
					}

					if (selectedTab == 1) {
						imageRedstone2.draw(54, 8);
					}

					if (selectedTab == 2) {
						imageRedstone2.draw(82, 8);
					}

					if (selectedTab == 3) {
						imageRedstone3.draw(110, 8);
					}

					if (selectedTab == 4) {
						imageRedstone2h.draw(153, 8);
					}

					if (selectedTab == 5) {
						imageRedstone2h.draw(181, 8);
					}

					if (selectedTab == 6) {
						imageRedstone1h.draw(209, 9);
					}
				}

				if (tabInterfaceId[0] != -1 && (flashingTab != 0 || loopCycle % 20 < 10)) {
					imageSideicons[0].draw(29, 13);
				}

				if (tabInterfaceId[1] != -1 && (flashingTab != 1 || loopCycle % 20 < 10)) {
					imageSideicons[1].draw(53, 11);
				}

				if (tabInterfaceId[2] != -1 && (flashingTab != 2 || loopCycle % 20 < 10)) {
					imageSideicons[2].draw(82, 11);
				}

				if (tabInterfaceId[3] != -1 && (flashingTab != 3 || loopCycle % 20 < 10)) {
					imageSideicons[3].draw(115, 12);
				}

				if (tabInterfaceId[4] != -1 && (flashingTab != 4 || loopCycle % 20 < 10)) {
					imageSideicons[4].draw(153, 13);
				}

				if (tabInterfaceId[5] != -1 && (flashingTab != 5 || loopCycle % 20 < 10)) {
					imageSideicons[5].draw(180, 11);
				}

				if (tabInterfaceId[6] != -1 && (flashingTab != 6 || loopCycle % 20 < 10)) {
					imageSideicons[6].draw(208, 13);
				}
			}

			areaBackhmid1.draw(160, graphics, 516);
			areaBackbase2.bind();
			imageBackbase2.draw(0, 0);

			if (sidebarInterfaceId == -1) {
				if (tabInterfaceId[selectedTab] != -1) {
					if (selectedTab == 7) {
						imageRedstone1v.draw(42, 0);
					}

					if (selectedTab == 8) {
						imageRedstone2v.draw(74, 0);
					}

					if (selectedTab == 9) {
						imageRedstone2v.draw(102, 0);
					}

					if (selectedTab == 10) {
						imageRedstone3v.draw(130, 1);
					}

					if (selectedTab == 11) {
						imageRedstone2hv.draw(173, 0);
					}

					if (selectedTab == 12) {
						imageRedstone2hv.draw(201, 0);
					}

					if (selectedTab == 13) {
						imageRedstone1hv.draw(229, 0);
					}
				}

				if (tabInterfaceId[8] != -1 && (flashingTab != 8 || loopCycle % 20 < 10)) {
					imageSideicons[7].draw(74, 2);
				}

				if (tabInterfaceId[9] != -1 && (flashingTab != 9 || loopCycle % 20 < 10)) {
					imageSideicons[8].draw(102, 3);
				}

				if (tabInterfaceId[10] != -1 && (flashingTab != 10 || loopCycle % 20 < 10)) {
					imageSideicons[9].draw(137, 4);
				}

				if (tabInterfaceId[11] != -1 && (flashingTab != 11 || loopCycle % 20 < 10)) {
					imageSideicons[10].draw(174, 2);
				}

				if (tabInterfaceId[12] != -1 && (flashingTab != 12 || loopCycle % 20 < 10)) {
					imageSideicons[11].draw(201, 2);
				}

				if (tabInterfaceId[13] != -1 && (flashingTab != 13 || loopCycle % 20 < 10)) {
					imageSideicons[12].draw(226, 2);
				}
			}

			areaBackbase2.draw(466, graphics, 496);
			areaViewport.bind();
		}

		if (redrawPrivacySettings) {
			redrawPrivacySettings = false;
			areaBackbase1.bind();
			imageBackbase1.draw(0, 0);
			fontPlain12.drawStringCenterTag(0xFFFFFF, 55, "Public chat", 28, true);

			if (publicChatSetting == 0) {
				fontPlain12.drawStringCenterTag(0xFF00, 55, "On", 41, true);
			}

			if (publicChatSetting == 1) {
				fontPlain12.drawStringCenterTag(0xFFFF00, 55, "Friends", 41, true);
			}

			if (publicChatSetting == 2) {
				fontPlain12.drawStringCenterTag(0xFF0000, 55, "Off", 41, true);
			}

			if (publicChatSetting == 3) {
				fontPlain12.drawStringCenterTag(0xFFFF, 55, "Hide", 41, true);
			}

			fontPlain12.drawStringCenterTag(0xFFFFFF, 184, "Private chat", 28, true);

			if (privateChatSetting == 0) {
				fontPlain12.drawStringCenterTag(0xFF00, 184, "On", 41, true);
			}

			if (privateChatSetting == 1) {
				fontPlain12.drawStringCenterTag(0xFFFF00, 184, "Friends", 41, true);
			}

			if (privateChatSetting == 2) {
				fontPlain12.drawStringCenterTag(0xFF0000, 184, "Off", 41, true);
			}

			fontPlain12.drawStringCenterTag(0xFFFFFF, 324, "Trade/compete", 28, true);

			if (tradeChatSetting == 0) {
				fontPlain12.drawStringCenterTag(0xFF00, 324, "On", 41, true);
			}

			if (tradeChatSetting == 1) {
				fontPlain12.drawStringCenterTag(0xFFFF00, 324, "Friends", 41, true);
			}

			if (tradeChatSetting == 2) {
				fontPlain12.drawStringCenterTag(0xFF0000, 324, "Off", 41, true);
			}

			fontPlain12.drawStringCenterTag(0xFFFFFF, 458, "Report abuse", 33, true);
			areaBackbase1.draw(453, graphics, 0);
			areaViewport.bind();
		}

		sceneDelta = 0;
	}

	@ObfuscatedName("client.a(LDUCMKFAY;Z)Z")
	public final boolean handleSocialMenuOption(Component arg0) {
		int var2 = arg0.clientCode;
		if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
			if (var2 >= 401 && var2 <= 500) {
				menuOption[menuSize] = "Remove @whi@" + arg0.text;
				menuAction[menuSize] = 322;
				menuSize++;
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

		menuOption[menuSize] = "Remove @whi@" + friendName[var2];
		menuAction[menuSize] = 792;
		menuSize++;
		menuOption[menuSize] = "Message @whi@" + friendName[var2];
		menuAction[menuSize] = 639;
		menuSize++;
		return true;
	}

	@ObfuscatedName("client.k(Z)V")
	public final void pushSpotanims() {
		for (SpotAnimEntity var1 = (SpotAnimEntity) spotanims.head(); var1 != null; var1 = (SpotAnimEntity) spotanims.next()) {
			if (currentLevel != var1.level || var1.seqComplete) {
				var1.unlink();
			} else if (loopCycle >= var1.startCycle) {
				var1.update(sceneDelta);

				if (var1.seqComplete) {
					var1.unlink();
				} else {
					scene.addTemporary(var1.level, 0, var1.y, -1, var1.z, 60, var1.x, var1, false);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIILDUCMKFAY;I)V")
	public final void drawInterface(int arg0, int arg1, Component arg2, int arg3) {
		if (arg2.type == 0 && arg2.children != null && (!arg2.hide || viewportHoveredInterfaceIndex == arg2.id || sidebarHoveredInterfaceIndex == arg2.id || chatHoveredInterfaceIndex == arg2.id)) {
			int var5 = Pix2D.left;
			int var6 = Pix2D.top;
			int var7 = Pix2D.right;
			int var8 = Pix2D.bottom;
			Pix2D.setBounds(arg2.height + arg3, arg1, arg2.width + arg1, arg3);
			int var9 = arg2.children.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg2.childX[var10] + arg1;
				int var12 = arg2.childY[var10] + arg3 - arg0;
				Component var13 = Component.instances[arg2.children[var10]];
				var11 += var13.x;
				var12 += var13.y;

				if (var13.clientCode > 0) {
					updateInterfaceContent(var13);
				}

				if (var13.type == 0) {
					if (var13.scrollPosition > var13.scroll - var13.height) {
						var13.scrollPosition = var13.scroll - var13.height;
					}

					if (var13.scrollPosition < 0) {
						var13.scrollPosition = 0;
					}

					drawInterface(var13.scrollPosition, var11, var13, var12);

					if (var13.scroll > var13.height) {
						drawScrollbar(var13.height, var13.scrollPosition, var12, var13.width + var11, var13.scroll);
					}
				} else if (var13.type != 1) {
					if (var13.type == 2) {
						int var14 = 0;
						for (int var15 = 0; var15 < var13.height; var15++) {
							for (int var16 = 0; var16 < var13.width; var16++) {
								int var17 = (var13.marginX + 32) * var16 + var11;
								int var18 = (var13.marginY + 32) * var15 + var12;
								if (var14 < 20) {
									var17 += var13.invSlotOffsetX[var14];
									var18 += var13.invSlotOffsetY[var14];
								}

								if (var13.invSlotObjId[var14] > 0) {
									int var19 = 0;
									int var20 = 0;
									int var21 = var13.invSlotObjId[var14] - 1;
									if (var17 > Pix2D.left - 32 && var17 < Pix2D.right && var18 > Pix2D.top - 32 && var18 < Pix2D.bottom || objDragArea != 0 && objDragSlot == var14) {
										int var22 = 0;
										if (objSelected == 1 && objSelectedSlot == var14 && objSelectedInterface == var13.id) {
											var22 = 0xFFFFFF;
										}

										Pix32 var23 = ObjType.getIcon(var21, var13.invSlotObjCount[var14], var22);
										if (var23 != null) {
											if (objDragArea != 0 && objDragSlot == var14 && objDragInterfaceId == var13.id) {
												var19 = mouseX - objGrabX;
												var20 = mouseY - objGrabY;

												if (var19 < 5 && var19 > -5) {
													var19 = 0;
												}

												if (var20 < 5 && var20 > -5) {
													var20 = 0;
												}

												if (objDragCycles < 5) {
													var19 = 0;
													var20 = 0;
												}

												var23.drawAlpha(var17 + var19, var18 + var20, 128);

												if (var18 + var20 < Pix2D.top && arg2.scrollPosition > 0) {
													int var24 = (Pix2D.top - var18 - var20) * sceneDelta / 3;
													if (var24 > sceneDelta * 10) {
														var24 = sceneDelta * 10;
													}

													if (var24 > arg2.scrollPosition) {
														var24 = arg2.scrollPosition;
													}

													arg2.scrollPosition -= var24;
													objGrabY += var24;
												}

												if (var18 + var20 + 32 > Pix2D.bottom && arg2.scrollPosition < arg2.scroll - arg2.height) {
													int var25 = (var18 + var20 + 32 - Pix2D.bottom) * sceneDelta / 3;
													if (var25 > sceneDelta * 10) {
														var25 = sceneDelta * 10;
													}

													if (var25 > arg2.scroll - arg2.height - arg2.scrollPosition) {
														var25 = arg2.scroll - arg2.height - arg2.scrollPosition;
													}

													arg2.scrollPosition += var25;
													objGrabY -= var25;
												}
											} else if (selectedArea != 0 && selectedItem == var14 && selectedInterface == var13.id) {
												var23.drawAlpha(var17, var18, 128);
											} else {
												var23.draw(var17, var18);
											}

											if (var23.width == 33 || var13.invSlotObjCount[var14] != 1) {
												int var26 = var13.invSlotObjCount[var14];
												fontPlain11.drawString(0, formatObjCount(var26), var18 + var20 + 10, var17 + 1 + var19);
												fontPlain11.drawString(0xFFFF00, formatObjCount(var26), var18 + var20 + 9, var17 + var19);
											}
										}
									}
								} else if (var13.invSlotGraphic != null && var14 < 20) {
									Pix32 var27 = var13.invSlotGraphic[var14];
									if (var27 != null) {
										var27.draw(var17, var18);
									}
								}

								var14++;
							}
						}
					} else if (var13.type == 3) {
						boolean var28 = false;
						if (chatHoveredInterfaceIndex == var13.id || sidebarHoveredInterfaceIndex == var13.id || viewportHoveredInterfaceIndex == var13.id) {
							var28 = true;
						}

						int var29;
						if (executeInterfaceScript(var13)) {
							var29 = var13.activeColour;
							if (var28 && var13.activeOverColour != 0) {
								var29 = var13.activeOverColour;
							}
						} else {
							var29 = var13.colour;
							if (var28 && var13.overColour != 0) {
								var29 = var13.overColour;
							}
						}

						if (var13.alpha == 0) {
							if (var13.fill) {
								Pix2D.fillRect(var13.height, var12, var11, var29, var13.width);
							} else {
								Pix2D.drawRect(var11, var13.width, var13.height, var29, var12);
							}
						} else if (var13.fill) {
							Pix2D.fillRect(var29, var12, var13.width, var13.height, 256 - (var13.alpha & 0xFF), var11);
						} else {
							Pix2D.drawRect(var12, var13.height, 256 - (var13.alpha & 0xFF), var29, var13.width, var11);
						}
					} else if (var13.type == 4) {
						PixFont var30 = var13.font;
						String var31 = var13.text;
						boolean var32 = false;
						if (chatHoveredInterfaceIndex == var13.id || sidebarHoveredInterfaceIndex == var13.id || viewportHoveredInterfaceIndex == var13.id) {
							var32 = true;
						}

						int var33;
						if (executeInterfaceScript(var13)) {
							var33 = var13.activeColour;
							if (var32 && var13.activeOverColour != 0) {
								var33 = var13.activeOverColour;
							}

							if (var13.activeText.length() > 0) {
								var31 = var13.activeText;
							}
						} else {
							var33 = var13.colour;
							if (var32 && var13.overColour != 0) {
								var33 = var13.overColour;
							}
						}

						if (var13.buttonType == 6 && pressedContinueOption) {
							var31 = "Please wait...";
							var33 = var13.colour;
						}

						if (Pix2D.width2d == 479) {
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

									var31 = var31.substring(0, var35) + getIntString(executeClientscript1(var13, 0)) + var31.substring(var35 + 2);
								}

								while (true) {
									int var36 = var31.indexOf("%2");
									if (var36 == -1) {
										break;
									}

									var31 = var31.substring(0, var36) + getIntString(executeClientscript1(var13, 1)) + var31.substring(var36 + 2);
								}

								while (true) {
									int var37 = var31.indexOf("%3");
									if (var37 == -1) {
										break;
									}

									var31 = var31.substring(0, var37) + getIntString(executeClientscript1(var13, 2)) + var31.substring(var37 + 2);
								}

								while (true) {
									int var38 = var31.indexOf("%4");
									if (var38 == -1) {
										break;
									}

									var31 = var31.substring(0, var38) + getIntString(executeClientscript1(var13, 3)) + var31.substring(var38 + 2);
								}

								while (true) {
									int var39 = var31.indexOf("%5");
									if (var39 == -1) {
										break;
									}

									var31 = var31.substring(0, var39) + getIntString(executeClientscript1(var13, 4)) + var31.substring(var39 + 2);
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

							if (var13.center) {
								var30.drawStringCenterTag(var33, var13.width / 2 + var11, var41, var34, var13.shadowed);
							} else {
								var30.drawStringTag(var13.shadowed, var11, var33, var41, var34);
							}

							var34 += var30.height;
						}
					} else if (var13.type == 5) {
						Pix32 var42;
						if (executeInterfaceScript(var13)) {
							var42 = var13.activeGraphic;
						} else {
							var42 = var13.graphic;
						}

						if (var42 != null) {
							var42.draw(var11, var12);
						}
					} else if (var13.type == 6) {
						int var43 = Pix3D.centerX;
						int var44 = Pix3D.centerY;
						Pix3D.centerX = var13.width / 2 + var11;
						Pix3D.centerY = var13.height / 2 + var12;
						int var45 = Pix3D.sin[var13.xan] * var13.zoom >> 16;
						int var46 = Pix3D.cos[var13.xan] * var13.zoom >> 16;
						boolean var47 = executeInterfaceScript(var13);
						int var48;
						if (var47) {
							var48 = var13.activeAnim;
						} else {
							var48 = var13.anim;
						}

						Model var49;
						if (var48 == -1) {
							var49 = var13.getModel(-1, -1, var47);
						} else {
							SeqType var50 = SeqType.instances[var48];
							var49 = var13.getModel(var50.iframes[var13.animFrame], var50.frames[var13.animFrame], var47);
						}

						if (var49 != null) {
							var49.drawSimple(0, var13.yan, 0, var13.xan, 0, var45, var46);
						}

						Pix3D.centerX = var43;
						Pix3D.centerY = var44;
					} else if (var13.type == 7) {
						PixFont var51 = var13.font;
						int var52 = 0;
						for (int var53 = 0; var53 < var13.height; var53++) {
							for (int var54 = 0; var54 < var13.width; var54++) {
								if (var13.invSlotObjId[var52] > 0) {
									ObjType var55 = ObjType.get(var13.invSlotObjId[var52] - 1);
									String var56 = var55.name;
									if (var55.stackable || var13.invSlotObjCount[var52] != 1) {
										var56 = var56 + " x" + formatObjCountTagged(var13.invSlotObjCount[var52]);
									}

									int var57 = (var13.marginX + 115) * var54 + var11;
									int var58 = (var13.marginY + 12) * var53 + var12;
									if (var13.center) {
										var51.drawStringCenterTag(var13.colour, var13.width / 2 + var57, var56, var58, var13.shadowed);
									} else {
										var51.drawStringTag(var13.shadowed, var57, var13.colour, var56, var58);
									}
								}

								var52++;
							}
						}
					}
				}
			}

			Pix2D.setBounds(var8, var5, var7, var6);
		}
	}

	@ObfuscatedName("client.a(LDSMJIEPN;I)V")
	public final void updateFlameBuffer(Pix8 arg0) {
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
			for (int var12 = 0; var12 < arg0.cropBottom; var12++) {
				for (int var13 = 0; var13 < arg0.cropRight; var13++) {
					if (arg0.pixels[var11++] != 0) {
						int var14 = var13 + arg0.cropLeft + 16;
						int var15 = var12 + arg0.cropTop + 16;
						int var16 = (var15 << 7) + var14;
						flameBuffer0[var16] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILMBMGIXGO;BLDLZHLHNK;)V")
	public final void readPlayerUpdates(int arg0, int arg1, Packet arg2, PlayerEntity arg3) {
		if ((arg0 & 0x400) != 0) {
			arg3.forceMoveStartSceneTileX = arg2.g1_alt3();
			arg3.forceMoveStartSceneTileZ = arg2.g1_alt3();
			arg3.forceMoveEndSceneTileX = arg2.g1_alt3();
			arg3.forceMoveEndSceneTileZ = arg2.g1_alt3();
			arg3.forceMoveEndCycle = arg2.g2_alt3() + loopCycle;
			arg3.forceMoveStartCycle = arg2.g2_alt2() + loopCycle;
			arg3.forceMoveFaceDirection = arg2.g1_alt3();
			arg3.resetPath();
		}

		if ((arg0 & 0x100) != 0) {
			arg3.spotanimId = arg2.g2_alt1();
			int var5 = arg2.g4();
			arg3.spotanimHeight = var5 >> 16;
			arg3.spotanimLastCycle = (var5 & 0xFFFF) + loopCycle;
			arg3.spotanimFrame = 0;
			arg3.spotanimCycle = 0;

			if (arg3.spotanimLastCycle > loopCycle) {
				arg3.spotanimFrame = -1;
			}

			if (arg3.spotanimId == 0xFFFF) {
				arg3.spotanimId = -1;
			}
		}

		if ((arg0 & 0x8) != 0) {
			int var6 = arg2.g2_alt1();
			if (var6 == 0xFFFF) {
				var6 = -1;
			}

			int var7 = arg2.g1_alt2();
			if (arg3.primarySeqId == var6 && var6 != -1) {
				int var8 = SeqType.instances[var6].replacemode;
				if (var8 == 1) {
					arg3.primarySeqFrame = 0;
					arg3.primarySeqCycle = 0;
					arg3.primarySeqDelay = var7;
					arg3.primarySeqLoop = 0;
				}

				if (var8 == 2) {
					arg3.primarySeqLoop = 0;
				}
			} else if (var6 == -1 || arg3.primarySeqId == -1 || SeqType.instances[var6].priority >= SeqType.instances[arg3.primarySeqId].priority) {
				arg3.primarySeqId = var6;
				arg3.primarySeqFrame = 0;
				arg3.primarySeqCycle = 0;
				arg3.primarySeqDelay = var7;
				arg3.primarySeqLoop = 0;
				arg3.seqPathLength = arg3.pathLength;
			}
		}

		if ((arg0 & 0x4) != 0) {
			arg3.chat = arg2.gjstr();
			if (arg3.chat.charAt(0) == '~') {
				arg3.chat = arg3.chat.substring(1);
				addMessage(arg3.chat, 2, arg3.name);
			} else if (localPlayer == arg3) {
				addMessage(arg3.chat, 2, arg3.name);
			}

			arg3.chatColor = 0;
			arg3.chatStyle = 0;
			arg3.chatTimer = 150;
		}

		if ((arg0 & 0x80) != 0) {
			int var9 = arg2.g2_alt1();
			int var10 = arg2.g1();
			int var11 = arg2.g1_alt2();
			int var12 = arg2.pos;

			if (arg3.name != null && arg3.visible) {
				long var13 = JString.toBase37(arg3.name);
				boolean var15 = false;
				if (var10 <= 1) {
					for (int var16 = 0; var16 < ignoreCount; var16++) {
						if (ignoreName37[var16] == var13) {
							var15 = true;
							break;
						}
					}
				}

				if (!var15 && overrideChat == 0) {
					try {
						chatBuffer.pos = 0;
						arg2.gdata_alt1(var11, 0, chatBuffer.data);
						chatBuffer.pos = 0;
						String var17 = WordPack.unpack(var11, chatBuffer);
						var17 = WordFilter.filter(var17);
						arg3.chat = var17;
						arg3.chatColor = var9 >> 8;
						arg3.chatStyle = var9 & 0xFF;
						arg3.chatTimer = 150;

						if (var10 == 2 || var10 == 3) {
							addMessage(var17, 1, "@cr2@" + arg3.name);
						} else if (var10 == 1) {
							addMessage(var17, 1, "@cr1@" + arg3.name);
						} else {
							addMessage(var17, 2, arg3.name);
						}
					} catch (Exception var26) {
						signlink.reporterror("cde2");
					}
				}
			}

			arg2.pos = var11 + var12;
		}

		if ((arg0 & 0x1) != 0) {
			arg3.targetId = arg2.g2_alt1();
			if (arg3.targetId == 0xFFFF) {
				arg3.targetId = -1;
			}
		}

		if ((arg0 & 0x10) != 0) {
			int var19 = arg2.g1_alt2();
			byte[] var20 = new byte[var19];
			Packet var21 = new Packet(var20);
			arg2.gdata(var19, 0, var20);
			playerAppearanceBuffer[arg1] = var21;
			arg3.read(var21);
		}

		if ((arg0 & 0x2) != 0) {
			arg3.targetTileX = arg2.g2_alt3();
			arg3.targetTile = arg2.g2_alt1();
		}

		if ((arg0 & 0x20) != 0) {
			int var22 = arg2.g1();
			int var23 = arg2.g1_alt1();
			arg3.hit(var23, var22, loopCycle);
			arg3.combatCycle = loopCycle + 300;
			arg3.health = arg2.g1_alt2();
			arg3.totalHealth = arg2.g1();
		}

		if ((arg0 & 0x200) != 0) {
			int var24 = arg2.g1();
			int var25 = arg2.g1_alt3();
			arg3.hit(var25, var24, loopCycle);
			arg3.combatCycle = loopCycle + 300;
			arg3.health = arg2.g1();
			arg3.totalHealth = arg2.g1_alt2();
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void updateOrbitCamera() {
		try {
			int var1 = localPlayer.x + cameraAnticheatOffsetX;
			int var2 = localPlayer.z + cameraAnticheatOffsetZ;
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

			if (actionKey[1] == 1) {
				orbitCameraYawVelocity += (-orbitCameraYawVelocity - 24) / 2;
			} else if (actionKey[2] == 1) {
				orbitCameraYawVelocity += (24 - orbitCameraYawVelocity) / 2;
			} else {
				orbitCameraYawVelocity /= 2;
			}

			if (actionKey[3] == 1) {
				orbitCameraPitchVelocity += (12 - orbitCameraPitchVelocity) / 2;
			} else if (actionKey[4] == 1) {
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
			int var5 = getHeightmapY(currentLevel, orbitCameraZ, orbitCameraX);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = currentLevel;
						if (var9 < 3 && (levelTileFlags[1][var7][var8] & 0x2) == 2) {
							var9++;
						}

						int var10 = var5 - levelHeightmap[var9][var7][var8];
						if (var10 > var6) {
							var6 = var10;
						}
					}
				}
			}

			gamelogic2++;
			if (gamelogic2 > 1512) {
				gamelogic2 = 0;
				out.p1isaac(77);
				out.p1(0);
				int var11 = out.pos;
				out.p1((int) (Math.random() * 256.0D));
				out.p1(101);
				out.p1(233);
				out.p2(45092);

				if ((int) (Math.random() * 2.0D) == 0) {
					out.p2(35784);
				}

				out.p1((int) (Math.random() * 256.0D));
				out.p1(64);
				out.p1(38);
				out.p2((int) (Math.random() * 65536.0D));
				out.p2((int) (Math.random() * 65536.0D));
				out.psize1(out.pos - var11);
			}

			int var12 = var6 * 192;
			if (var12 > 98048) {
				var12 = 98048;
			}

			if (var12 < 32768) {
				var12 = 32768;
			}

			if (var12 > cameraPitchClamp) {
				cameraPitchClamp += (var12 - cameraPitchClamp) / 24;
			} else if (var12 < cameraPitchClamp) {
				cameraPitchClamp += (var12 - cameraPitchClamp) / 80;
			}
		} catch (Exception var13) {
			signlink.reporterror("glfc_ex " + localPlayer.x + "," + localPlayer.z + "," + orbitCameraX + "," + orbitCameraZ + "," + sceneCenterZoneX + "," + sceneCenterZoneZ + "," + sceneBaseTileX + "," + sceneBaseTileZ);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void draw() {
		if (errorStarted || errorLoading || errorHost) {
			drawError();
		} else {
			drawCycle++;

			if (ingame) {
				drawGame();
			} else {
				drawTitleScreen(false);
			}

			dragCycles = 0;
		}
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;)Z")
	public final boolean isFriend(String arg0) {
		if (arg0 == null) {
			return false;
		}

		for (int var2 = 0; var2 < friendCount; var2++) {
			if (arg0.equalsIgnoreCase(friendName[var2])) {
				return true;
			}
		}

		if (arg0.equalsIgnoreCase(localPlayer.name)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("client.a(IIZ)Ljava/lang/String;")
	public static final String getCombatLevelColorTag(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(BI)V")
	public final void setWaveVolume(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.H(I)V")
	public final void draw3DEntityElements() {
		drawPrivateMessages();

		if (crossMode == 1) {
			imageCrosses[crossCycle / 100].draw(crossX - 8 - 4, crossY - 8 - 4);
			gamelogic6++;
			if (gamelogic6 > 67) {
				gamelogic6 = 0;
				out.p1isaac(78);
			}
		}

		if (crossMode == 2) {
			imageCrosses[crossCycle / 100 + 4].draw(crossX - 8 - 4, crossY - 8 - 4);
		}

		if (viewportOverlayInterfaceId != -1) {
			updateInterfaceAnimation(sceneDelta, viewportOverlayInterfaceId);
			drawInterface(0, 0, Component.instances[viewportOverlayInterfaceId], 0);
		}

		if (viewportInterfaceId != -1) {
			updateInterfaceAnimation(sceneDelta, viewportInterfaceId);
			drawInterface(0, 0, Component.instances[viewportInterfaceId], 0);
		}

		drawWildyLevel();

		if (!menuVisible) {
			handleInput();
			drawTooltip();
		} else if (menuArea == 0) {
			drawMenu();
		}

		if (inMultizone == 1) {
			imageHeadicons[1].draw(472, 296);
		}

		if (showFps) {
			short var1 = 507;
			int var2 = 20;
			int var3 = 0xFFFF00;
			if (fps < 15) {
				var3 = 0xFF0000;
			}

			fontPlain12.drawStringRight("Fps:" + fps, var1, var3, var2);
			var2 += 15;
			Runtime var4 = Runtime.getRuntime();
			int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
			int var6 = 0xFFFF00;

			if (var5 > 0x2000000 && lowMemory) {
				int var7 = 0xFF0000;
			}

			fontPlain12.drawStringRight("Mem:" + var5 + "k", var1, 0xFFFF00, var2);
			var2 += 15;
		}

		if (systemUpdateTimer != 0) {
			int var8 = systemUpdateTimer / 50;
			int var9 = var8 / 60;
			var8 %= 60;
			if (var8 < 10) {
				fontPlain12.drawString(0xFFFF00, "System update in: " + var9 + ":0" + var8, 329, 4);
			} else {
				fontPlain12.drawString(0xFFFF00, "System update in: " + var9 + ":" + var8, 329, 4);
			}

			cyclelogic1++;
			if (cyclelogic1 > 75) {
				cyclelogic1 = 0;
				out.p1isaac(148);
				return;
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public final void addIgnore(long arg0) {
		if (arg0 != 0L) {
			if (ignoreCount >= 100) {
				addMessage("Your ignore list is full. Max of 100 hit", 0, "");
			} else {
				String var3 = JString.toSentenceCase(JString.fromBase37(arg0));
				for (int var4 = 0; var4 < ignoreCount; var4++) {
					if (ignoreName37[var4] == arg0) {
						addMessage(var3 + " is already on your ignore list", 0, "");
						return;
					}
				}

				for (int var5 = 0; var5 < friendCount; var5++) {
					if (friendName37[var5] == arg0) {
						addMessage("Please remove " + var3 + " from your friend list first", 0, "");
						return;
					}
				}

				ignoreName37[ignoreCount++] = arg0;
				redrawSidebar = true;
				out.p1isaac(133);
				out.p8(arg0);
			}
		}
	}

	@ObfuscatedName("client.i(B)V")
	public final void updatePlayers() {
		for (int var1 = -1; var1 < playerCount; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = LOCAL_PLAYER_INDEX;
			} else {
				var2 = playerIds[var1];
			}

			PlayerEntity var3 = players[var2];
			if (var3 != null) {
				updateEntity(1, var3);
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public final void updateTemporaryLocs() {
		if (sceneState == 2) {
			for (LocAddEntity var1 = (LocAddEntity) temporaryLocs.head(); var1 != null; var1 = (LocAddEntity) temporaryLocs.next()) {
				if (var1.duration > 0) {
					var1.duration--;
				}

				if (var1.duration != 0) {
					if (var1.delay > 0) {
						var1.delay--;
					}

					if (var1.delay == 0 && var1.localX >= 1 && var1.localZ >= 1 && var1.localX <= 102 && var1.localZ <= 102 && (var1.type < 0 || World.isLocReady(var1.type, var1.shape))) {
						addLoc(var1.localZ, var1.level, var1.rotation, var1.shape, var1.localX, var1.layer, var1.type);
						var1.delay = -1;

						if (var1.previousType == var1.type && var1.previousType == -1) {
							var1.unlink();
						} else if (var1.previousType == var1.type && var1.previousRotation == var1.rotation && var1.previousShape == var1.shape) {
							var1.unlink();
						}
					}
				} else if (var1.previousType < 0 || World.isLocReady(var1.previousType, var1.previousShape)) {
					addLoc(var1.localZ, var1.level, var1.previousRotation, var1.previousShape, var1.localX, var1.layer, var1.previousType);
					var1.unlink();
				}
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public final void showContextMenu() {
		int var1 = fontBold12.stringWidthTag("Choose Option");
		for (int var2 = 0; var2 < menuSize; var2++) {
			int var3 = fontBold12.stringWidthTag(menuOption[var2]);
			if (var3 > var1) {
				var1 = var3;
			}
		}

		var1 += 8;
		int var4 = menuSize * 15 + 21;
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

			menuVisible = true;
			menuArea = 0;
			menuX = var5;
			menuY = var6;
			menuWidth = var1;
			menuHeight = menuSize * 15 + 22;
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

			menuVisible = true;
			menuArea = 1;
			menuX = var7;
			menuY = var8;
			menuWidth = var1;
			menuHeight = menuSize * 15 + 22;
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

			menuVisible = true;
			menuArea = 2;
			menuX = var9;
			menuY = var10;
			menuWidth = var1;
			menuHeight = menuSize * 15 + 22;
		}
	}

	@ObfuscatedName("client.b(LMBMGIXGO;IB)V")
	public final void readLocalPlayer(Packet arg0, int arg1) {
		arg0.accessBits();
		int var3 = arg0.gBit(1);
		if (var3 != 0) {
			int var4 = arg0.gBit(2);
			if (var4 == 0) {
				entityUpdateIds[entityUpdateCount++] = LOCAL_PLAYER_INDEX;
			} else if (var4 == 1) {
				int var5 = arg0.gBit(3);
				localPlayer.step(false, var5);
				int var6 = arg0.gBit(1);
				if (var6 == 1) {
					entityUpdateIds[entityUpdateCount++] = LOCAL_PLAYER_INDEX;
				}
			} else if (var4 == 2) {
				int var7 = arg0.gBit(3);
				localPlayer.step(true, var7);
				int var8 = arg0.gBit(3);
				localPlayer.step(true, var8);
				int var9 = arg0.gBit(1);
				if (var9 == 1) {
					entityUpdateIds[entityUpdateCount++] = LOCAL_PLAYER_INDEX;
				}
			} else if (var4 == 3) {
				currentLevel = arg0.gBit(2);
				int var10 = arg0.gBit(1);
				int var11 = arg0.gBit(1);
				if (var11 == 1) {
					entityUpdateIds[entityUpdateCount++] = LOCAL_PLAYER_INDEX;
				}

				int var12 = arg0.gBit(7);
				int var13 = arg0.gBit(7);
				localPlayer.move(var13, var12, var10 == 1);
			}
		}
	}

	@ObfuscatedName("client.I(I)V")
	public final void unloadTitle() {
		flameActive = false;
		while (flameThread) {
			flameActive = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}

		imageTitlebox = null;
		imageTitlebutton = null;
		imageRunes = null;
		flameGradient = null;
		flameGradient0 = null;
		flameGradient1 = null;
		flameGradient2 = null;
		flameBuffer0 = null;
		flameBuffer1 = null;
		flameBuffer3 = null;
		flameBuffer2 = null;
		imageFlamesLeft = null;
		imageFlamesRight = null;
	}

	@ObfuscatedName("client.c(IZI)Z")
	public final boolean updateInterfaceAnimation(int arg0, int arg1) {
		boolean var3 = false;
		Component var4 = Component.instances[arg1];
		for (int var5 = 0; var5 < var4.children.length && var4.children[var5] != -1; var5++) {
			Component var6 = Component.instances[var4.children[var5]];
			if (var6.type == 1) {
				var3 |= updateInterfaceAnimation(arg0, var6.id);
			}

			if (var6.type == 6 && (var6.anim != -1 || var6.activeAnim != -1)) {
				boolean var7 = executeInterfaceScript(var6);
				int var8;
				if (var7) {
					var8 = var6.activeAnim;
				} else {
					var8 = var6.anim;
				}

				if (var8 != -1) {
					SeqType var9 = SeqType.instances[var8];
					var6.animCycle += arg0;
					while (var6.animCycle > var9.getFrameDuration(var6.animFrame)) {
						var6.animCycle -= var9.getFrameDuration(var6.animFrame) + 1;
						var6.animFrame++;
						if (var6.animFrame >= var9.frameCount) {
							var6.animFrame -= var9.replayoff;
							if (var6.animFrame < 0 || var6.animFrame >= var9.frameCount) {
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

	@ObfuscatedName("client.J(I)I")
	public final int getTopLevel() {
		int var1 = 3;
		if (cameraPitch < 310) {
			int var2 = cameraX >> 7;
			int var3 = cameraZ >> 7;
			int var4 = localPlayer.x >> 7;
			int var5 = localPlayer.z >> 7;

			if ((levelTileFlags[currentLevel][var2][var3] & 0x4) != 0) {
				var1 = currentLevel;
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

					if ((levelTileFlags[currentLevel][var2][var3] & 0x4) != 0) {
						var1 = currentLevel;
					}

					var9 += var8;
					if (var9 >= 0x10000) {
						var9 -= 0x10000;

						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}

						if ((levelTileFlags[currentLevel][var2][var3] & 0x4) != 0) {
							var1 = currentLevel;
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

					if ((levelTileFlags[currentLevel][var2][var3] & 0x4) != 0) {
						var1 = currentLevel;
					}

					var11 += var10;
					if (var11 >= 0x10000) {
						var11 -= 0x10000;

						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}

						if ((levelTileFlags[currentLevel][var2][var3] & 0x4) != 0) {
							var1 = currentLevel;
						}
					}
				}
			}
		}

		if ((levelTileFlags[currentLevel][localPlayer.x >> 7][localPlayer.z >> 7] & 0x4) != 0) {
			var1 = currentLevel;
		}

		return var1;
	}

	@ObfuscatedName("client.K(I)I")
	public final int getTopLevelCutscene() {
		int var1 = getHeightmapY(currentLevel, cameraZ, cameraX);
		if (var1 - cameraY < 800 && (levelTileFlags[currentLevel][cameraX >> 7][cameraZ >> 7] & 0x4) != 0) {
			return currentLevel;
		}

		return 3;
	}

	@ObfuscatedName("client.a(IJ)V")
	public final void removeIgnore(long arg0) {
		if (arg0 != 0L) {
			for (int var3 = 0; var3 < ignoreCount; var3++) {
				if (ignoreName37[var3] == arg0) {
					ignoreCount--;
					redrawSidebar = true;

					for (int var4 = var3; var4 < ignoreCount; var4++) {
						ignoreName37[var4] = ignoreName37[var4 + 1];
					}

					out.p1isaac(74);
					out.p8(arg0);
					return;
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

	@ObfuscatedName("client.a(BZI)V")
	public final void setMidiVolume(boolean arg0, int arg1) {
		signlink.midivol = arg1;

		if (arg0) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(ILDUCMKFAY;I)I")
	public final int executeClientscript1(Component arg0, int arg1) {
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
					var8 = skillLevel[var3[var5++]];
				}

				if (var7 == 2) {
					var8 = skillBaseLevel[var3[var5++]];
				}

				if (var7 == 3) {
					var8 = skillExperience[var3[var5++]];
				}

				if (var7 == 4) {
					Component var10 = Component.instances[var3[var5++]];
					int var11 = var3[var5++];
					if (var11 >= 0 && var11 < ObjType.count && (!ObjType.get(var11).members || members)) {
						for (int var12 = 0; var12 < var10.invSlotObjId.length; var12++) {
							if (var11 + 1 == var10.invSlotObjId[var12]) {
								var8 += var10.invSlotObjCount[var12];
							}
						}
					}
				}

				if (var7 == 5) {
					var8 = varps[var3[var5++]];
				}

				if (var7 == 6) {
					var8 = levelExperience[skillBaseLevel[var3[var5++]] - 1];
				}

				if (var7 == 7) {
					var8 = varps[var3[var5++]] * 100 / 46875;
				}

				if (var7 == 8) {
					var8 = localPlayer.combatLevel;
				}

				if (var7 == 9) {
					for (int var13 = 0; var13 < Stats.count; var13++) {
						if (Stats.enabled[var13]) {
							var8 += skillBaseLevel[var13];
						}
					}
				}

				if (var7 == 10) {
					Component var14 = Component.instances[var3[var5++]];
					int var15 = var3[var5++] + 1;
					if (var15 >= 0 && var15 < ObjType.count && (!ObjType.get(var15).members || members)) {
						for (int var16 = 0; var16 < var14.invSlotObjId.length; var16++) {
							if (var14.invSlotObjId[var16] == var15) {
								var8 = 999999999;
								break;
							}
						}
					}
				}

				if (var7 == 11) {
					var8 = energy;
				}

				if (var7 == 12) {
					var8 = weightCarried;
				}

				if (var7 == 13) {
					int var17 = varps[var3[var5++]];
					int var18 = var3[var5++];
					var8 = (var17 & 1 << var18) == 0 ? 0 : 1;
				}

				if (var7 == 14) {
					int var19 = var3[var5++];
					VarbitType var20 = VarbitType.instances[var19];
					int var21 = var20.basevar;
					int var22 = var20.startbit;
					int var23 = var20.endbit;
					int var24 = BITMASK[var23 - var22];
					var8 = varps[var21] >> var22 & var24;
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
					var8 = (localPlayer.x >> 7) + sceneBaseTileX;
				}

				if (var7 == 19) {
					var8 = (localPlayer.z >> 7) + sceneBaseTileZ;
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

	@ObfuscatedName("client.L(I)V")
	public final void drawTooltip() {
		if (menuSize >= 2 || objSelected != 0 || spellSelected != 0) {
			String var1;
			if (objSelected == 1 && menuSize < 2) {
				var1 = "Use " + objSelectedName + " with...";
			} else if (spellSelected == 1 && menuSize < 2) {
				var1 = spellCaption + "...";
			} else {
				var1 = menuOption[menuSize - 1];
			}

			if (menuSize > 2) {
				var1 = var1 + "@whi@ / " + (menuSize - 2) + " more options";
			}

			fontBold12.drawStringTooltip(true, 4, 0xFFFFFF, var1, loopCycle / 1000, 15);
		}
	}

	@ObfuscatedName("client.m(Z)V")
	public final void drawMinimap() {
		areaMapback.bind();

		if (minimapState == 2) {
			byte[] var1 = imageMapback.pixels;
			int[] var2 = Pix2D.data;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}

			imageCompass.drawRotatedMasked(33, orbitCameraYaw, compassMaskLineLengths, 256, compassMaskLineOffsets, 25, 0, 0, 33, 25);
			areaViewport.bind();
		} else {
			int var5 = minimapAnticheatAngle + orbitCameraYaw & 0x7FF;
			int var6 = localPlayer.x / 32 + 48;
			int var7 = 464 - localPlayer.z / 32;
			imageMinimap.drawRotatedMasked(151, var5, minimapMaskLineLengths, minimapZoom + 256, minimapMaskLineOffsets, var7, 5, 25, 146, var6);
			imageCompass.drawRotatedMasked(33, orbitCameraYaw, compassMaskLineLengths, 256, compassMaskLineOffsets, 25, 0, 0, 33, 25);

			for (int var8 = 0; var8 < activeMapFunctionCount; var8++) {
				int var9 = activeMapFunctionX[var8] * 4 + 2 - localPlayer.x / 32;
				int var10 = activeMapFunctionZ[var8] * 4 + 2 - localPlayer.z / 32;
				drawOnMinimap(activeMapFunctions[var8], var9, var10);
			}

			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					LinkList var13 = levelObjStacks[currentLevel][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - localPlayer.x / 32;
						int var15 = var12 * 4 + 2 - localPlayer.z / 32;
						drawOnMinimap(imageMapdot0, var14, var15);
					}
				}
			}

			for (int var16 = 0; var16 < npcCount; var16++) {
				NpcEntity var17 = npcs[npcIds[var16]];
				if (var17 != null && var17.isVisible()) {
					NpcType var18 = var17.type;
					if (var18.multinpc != null) {
						var18 = var18.getMultiNpc();
					}

					if (var18 != null && var18.minimap && var18.active) {
						int var19 = var17.x / 32 - localPlayer.x / 32;
						int var20 = var17.z / 32 - localPlayer.z / 32;
						drawOnMinimap(imageMapdot1, var19, var20);
					}
				}
			}

			for (int var21 = 0; var21 < playerCount; var21++) {
				PlayerEntity var22 = players[playerIds[var21]];
				if (var22 != null && var22.isVisible()) {
					int var23 = var22.x / 32 - localPlayer.x / 32;
					int var24 = var22.z / 32 - localPlayer.z / 32;
					boolean var25 = false;
					long var26 = JString.toBase37(var22.name);
					for (int var28 = 0; var28 < friendCount; var28++) {
						if (friendName37[var28] == var26 && friendWorld[var28] != 0) {
							var25 = true;
							break;
						}
					}

					boolean var29 = false;
					if (localPlayer.team != 0 && var22.team != 0 && localPlayer.team == var22.team) {
						var29 = true;
					}

					if (var25) {
						drawOnMinimap(imageMapdot3, var23, var24);
					} else if (var29) {
						drawOnMinimap(imageMapdot4, var23, var24);
					} else {
						drawOnMinimap(imageMapdot2, var23, var24);
					}
				}
			}

			if (hintType != 0 && loopCycle % 20 < 10) {
				if (hintType == 1 && hintNpc >= 0 && hintNpc < npcs.length) {
					NpcEntity var30 = npcs[hintNpc];
					if (var30 != null) {
						int var31 = var30.x / 32 - localPlayer.x / 32;
						int var32 = var30.z / 32 - localPlayer.z / 32;
						drawMinimapHint(imageMapmarker1, var32, var31);
					}
				}

				if (hintType == 2) {
					int var33 = (hintTileX - sceneBaseTileX) * 4 + 2 - localPlayer.x / 32;
					int var34 = (hintTileZ - sceneBaseTileZ) * 4 + 2 - localPlayer.z / 32;
					drawMinimapHint(imageMapmarker1, var34, var33);
				}

				if (hintType == 10 && hintPlayer >= 0 && hintPlayer < players.length) {
					PlayerEntity var35 = players[hintPlayer];
					if (var35 != null) {
						int var36 = var35.x / 32 - localPlayer.x / 32;
						int var37 = var35.z / 32 - localPlayer.z / 32;
						drawMinimapHint(imageMapmarker1, var37, var36);
					}
				}
			}

			if (flagSceneTileX != 0) {
				int var38 = flagSceneTileX * 4 + 2 - localPlayer.x / 32;
				int var39 = flagSceneTileZ * 4 + 2 - localPlayer.z / 32;
				drawOnMinimap(imageMapmarker0, var38, var39);
			}

			Pix2D.fillRect(3, 78, 97, 0xFFFFFF, 3);
			areaViewport.bind();
		}
	}

	@ObfuscatedName("client.a(ZLGQOSZKJC;I)V")
	public final void projectFromGround(PathingEntity arg0, int arg1) {
		projectFromGround(arg0.x, arg1, arg0.z);
	}

	@ObfuscatedName("client.b(IIII)V")
	public final void projectFromGround(int arg0, int arg1, int arg2) {
		if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
			int var4 = getHeightmapY(currentLevel, arg2, arg0) - arg1;
			arg0 -= cameraX;
			var4 -= cameraY;
			arg2 -= cameraZ;
			int var5 = Model.sin[cameraPitch];
			int var6 = Model.cos[cameraPitch];
			int var7 = Model.sin[cameraYaw];
			int var8 = Model.cos[cameraYaw];
			int var9 = arg0 * var8 + arg2 * var7 >> 16;
			arg2 = arg2 * var8 - arg0 * var7 >> 16;
			int var11 = var4 * var6 - arg2 * var5 >> 16;
			arg2 = arg2 * var6 + var4 * var5 >> 16;
			if (arg2 >= 50) {
				projectX = (var9 << 9) / arg2 + Pix3D.centerX;
				projectY = (var11 << 9) / arg2 + Pix3D.centerY;
			} else {
				projectX = -1;
				projectY = -1;
			}
		} else {
			projectX = -1;
			projectY = -1;
		}
	}

	@ObfuscatedName("client.n(Z)V")
	public final void handlePrivateChatInput() {
		if (splitPrivateChat != 0) {
			int var1 = 0;
			if (systemUpdateTimer != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; var2++) {
				if (messageText[var2] != null) {
					int var3 = messageType[var2];
					String var4 = messageSender[var2];
					boolean var5 = false;

					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						boolean var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						boolean var7 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || privateChatSetting == 0 || privateChatSetting == 1 && isFriend(var4))) {
						int var8 = 329 - var1 * 13;
						if (mouseX > 4 && mouseY - 4 > var8 - 10 && mouseY - 4 <= var8 + 3) {
							int var9 = fontPlain12.stringWidthTag("From:  " + var4 + messageText[var2]) + 25;
							if (var9 > 450) {
								var9 = 450;
							}

							if (mouseX < var9 + 4) {
								if (rights >= 1) {
									menuOption[menuSize] = "Report abuse @whi@" + var4;
									menuAction[menuSize] = 2606;
									menuSize++;
								}

								menuOption[menuSize] = "Add ignore @whi@" + var4;
								menuAction[menuSize] = 2042;
								menuSize++;
								menuOption[menuSize] = "Add friend @whi@" + var4;
								menuAction[menuSize] = 2337;
								menuSize++;
							}
						}

						var1++;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && privateChatSetting < 2) {
						var1++;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void appendLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		LocAddEntity var10 = null;
		for (LocAddEntity var11 = (LocAddEntity) temporaryLocs.head(); var11 != null; var11 = (LocAddEntity) temporaryLocs.next()) {
			if (var11.level == arg6 && var11.localX == arg7 && var11.localZ == arg4 && var11.layer == arg3) {
				var10 = var11;
				break;
			}
		}

		if (var10 == null) {
			var10 = new LocAddEntity();
			var10.level = arg6;
			var10.layer = arg3;
			var10.localX = arg7;
			var10.localZ = arg4;
			storeLoc(var10);
			temporaryLocs.addTail(var10);
		}

		var10.type = arg1;
		var10.shape = arg5;
		var10.rotation = arg2;
		var10.delay = arg8;
		var10.duration = arg0;
	}

	@ObfuscatedName("client.b(LDUCMKFAY;Z)Z")
	public final boolean executeInterfaceScript(Component arg0) {
		if (arg0.scriptComparator == null) {
			return false;
		}

		for (int var2 = 0; var2 < arg0.scriptComparator.length; var2++) {
			int var3 = executeClientscript1(arg0, var2);
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

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
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

	@ObfuscatedName("client.k(B)V")
	public final void drawFlames() {
		short var1 = 256;

		if (flameGradientCycle0 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (flameGradientCycle0 > 768) {
					flameGradient[var2] = mix(flameGradient0[var2], flameGradient1[var2], 1024 - flameGradientCycle0);
				} else if (flameGradientCycle0 > 256) {
					flameGradient[var2] = flameGradient1[var2];
				} else {
					flameGradient[var2] = mix(flameGradient1[var2], flameGradient0[var2], 256 - flameGradientCycle0);
				}
			}
		} else if (flameGradientCycle1 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (flameGradientCycle1 > 768) {
					flameGradient[var3] = mix(flameGradient0[var3], flameGradient2[var3], 1024 - flameGradientCycle1);
				} else if (flameGradientCycle1 > 256) {
					flameGradient[var3] = flameGradient2[var3];
				} else {
					flameGradient[var3] = mix(flameGradient2[var3], flameGradient0[var3], 256 - flameGradientCycle1);
				}
			}
		} else {
			for (int var4 = 0; var4 < 256; var4++) {
				flameGradient[var4] = flameGradient0[var4];
			}
		}

		for (int var5 = 0; var5 < 33920; var5++) {
			imageTitle0.data[var5] = imageFlamesLeft.pixels[var5];
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
			imageTitle1.data[var16] = imageFlamesRight.pixels[var16];
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

		imageTitle1.draw(0, graphics, 637);
	}

	@ObfuscatedName("client.a(BILMBMGIXGO;)V")
	public final void readPlayers(int arg0, Packet arg1) {
		int var3 = arg1.gBit(8);
		if (var3 < playerCount) {
			for (int var4 = var3; var4 < playerCount; var4++) {
				entityRemovalIds[entityRemovalCount++] = playerIds[var4];
			}
		}

		if (var3 > playerCount) {
			signlink.reporterror(username + " Too many players");
			throw new RuntimeException("eek");
		}

		playerCount = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = playerIds[var5];
			PlayerEntity var7 = players[var6];
			int var8 = arg1.gBit(1);
			if (var8 == 0) {
				playerIds[playerCount++] = var6;
				var7.cycle = loopCycle;
			} else {
				int var9 = arg1.gBit(2);
				if (var9 == 0) {
					playerIds[playerCount++] = var6;
					var7.cycle = loopCycle;
					entityUpdateIds[entityUpdateCount++] = var6;
				} else if (var9 == 1) {
					playerIds[playerCount++] = var6;
					var7.cycle = loopCycle;
					int var10 = arg1.gBit(3);
					var7.step(false, var10);
					int var11 = arg1.gBit(1);
					if (var11 == 1) {
						entityUpdateIds[entityUpdateCount++] = var6;
					}
				} else if (var9 == 2) {
					playerIds[playerCount++] = var6;
					var7.cycle = loopCycle;
					int var12 = arg1.gBit(3);
					var7.step(true, var12);
					int var13 = arg1.gBit(3);
					var7.step(true, var13);
					int var14 = arg1.gBit(1);
					if (var14 == 1) {
						entityUpdateIds[entityUpdateCount++] = var6;
					}
				} else if (var9 == 3) {
					entityRemovalIds[entityRemovalCount++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZZ)V")
	public final void drawTitleScreen(boolean arg0) {
		loadTitle();
		imageTitle4.bind();
		imageTitlebox.draw(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (titleScreenState == 0) {
			int var4 = var3 / 2 + 80;
			fontPlain11.drawStringCenterTag(0x75A9A9, var2 / 2, ondemand.message, var4, true);
			int var5 = var3 / 2 - 20;
			fontBold12.drawStringCenterTag(0xFFFF00, var2 / 2, "Welcome to RuneScape", var5, true);
			var5 += 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			imageTitlebutton.draw(var6 - 73, var7 - 20);
			fontBold12.drawStringCenterTag(0xFFFFFF, var6, "New User", var7 + 5, true);
			int var8 = var2 / 2 + 80;
			imageTitlebutton.draw(var8 - 73, var7 - 20);
			fontBold12.drawStringCenterTag(0xFFFFFF, var8, "Existing User", var7 + 5, true);
		}

		if (titleScreenState == 2) {
			int var9 = var3 / 2 - 40;
			if (loginMessage0.length() > 0) {
				fontBold12.drawStringCenterTag(0xFFFF00, var2 / 2, loginMessage0, var9 - 15, true);
				fontBold12.drawStringCenterTag(0xFFFF00, var2 / 2, loginMessage1, var9, true);
				var9 += 30;
			} else {
				fontBold12.drawStringCenterTag(0xFFFF00, var2 / 2, loginMessage1, var9 - 7, true);
				var9 += 30;
			}

			fontBold12.drawStringTag(true, var2 / 2 - 90, 0xFFFFFF, "Username: " + username + (titleLoginField == 0 & loopCycle % 40 < 20 ? "@yel@|" : ""), var9);
			var9 += 15;
			fontBold12.drawStringTag(true, var2 / 2 - 88, 0xFFFFFF, "Password: " + JString.censor(password) + (titleLoginField == 1 & loopCycle % 40 < 20 ? "@yel@|" : ""), var9);
			var9 += 15;

			if (!arg0) {
				int var10 = var2 / 2 - 80;
				int var11 = var3 / 2 + 50;
				imageTitlebutton.draw(var10 - 73, var11 - 20);
				fontBold12.drawStringCenterTag(0xFFFFFF, var10, "Login", var11 + 5, true);
				int var12 = var2 / 2 + 80;
				imageTitlebutton.draw(var12 - 73, var11 - 20);
				fontBold12.drawStringCenterTag(0xFFFFFF, var12, "Cancel", var11 + 5, true);
			}
		}

		if (titleScreenState == 3) {
			fontBold12.drawStringCenterTag(0xFFFF00, var2 / 2, "Create a free account", var3 / 2 - 60, true);
			int var13 = var3 / 2 - 35;
			fontBold12.drawStringCenterTag(0xFFFFFF, var2 / 2, "To create a new account you need to", var13, true);
			var13 += 15;
			fontBold12.drawStringCenterTag(0xFFFFFF, var2 / 2, "go back to the main RuneScape webpage", var13, true);
			var13 += 15;
			fontBold12.drawStringCenterTag(0xFFFFFF, var2 / 2, "and choose the red 'create account'", var13, true);
			var13 += 15;
			fontBold12.drawStringCenterTag(0xFFFFFF, var2 / 2, "button at the top right of that page.", var13, true);
			var13 += 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			imageTitlebutton.draw(var14 - 73, var15 - 20);
			fontBold12.drawStringCenterTag(0xFFFFFF, var14, "Cancel", var15 + 5, true);
		}

		imageTitle4.draw(171, graphics, 202);

		if (redrawTitleBackground) {
			redrawTitleBackground = false;
			imageTitle2.draw(0, graphics, 128);
			imageTitle3.draw(371, graphics, 202);
			imageTitle5.draw(265, graphics, 0);
			imageTitle6.draw(265, graphics, 562);
			imageTitle7.draw(171, graphics, 128);
			imageTitle8.draw(171, graphics, 562);
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void runFlames() {
		flameThread = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (flameActive) {
				frameCycle++;
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

	@ObfuscatedName("client.a(B)V")
	public final void refresh() {
		redrawTitleBackground = true;
	}

	@ObfuscatedName("client.a(ILMBMGIXGO;I)V")
	public final void readZonePacket(Packet arg0, int arg1) {
		if (arg1 == 84) {
			int var3 = arg0.g1();
			int var4 = (var3 >> 4 & 0x7) + baseX;
			int var5 = (var3 & 0x7) + baseZ;
			int var6 = arg0.g2();
			int var7 = arg0.g2();
			int var8 = arg0.g2();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				LinkList var9 = levelObjStacks[currentLevel][var4][var5];
				if (var9 != null) {
					for (ObjStackEntity var10 = (ObjStackEntity) var9.head(); var10 != null; var10 = (ObjStackEntity) var9.next()) {
						if ((var6 & 0x7FFF) == var10.type && var10.count == var7) {
							var10.count = var8;
							break;
						}
					}

					sortObjStacks(var4, var5);
				}
			}
		} else {
			if (arg1 == 105) {
				int var11 = arg0.g1();
				int var12 = (var11 >> 4 & 0x7) + baseX;
				int var13 = (var11 & 0x7) + baseZ;
				int var14 = arg0.g2();
				int var15 = arg0.g1();
				int var16 = var15 >> 4 & 0xF;
				int var17 = var15 & 0x7;
				if (localPlayer.pathTileX[0] >= var12 - var16 && localPlayer.pathTileX[0] <= var12 + var16 && localPlayer.pathTileZ[0] >= var13 - var16 && localPlayer.pathTileZ[0] <= var13 + var16 && waveEnabled && !lowMemory && waveCount < 50) {
					waveIds[waveCount] = var14;
					waveLoops[waveCount] = var17;
					waveDelay[waveCount] = Wave.delays[var14];
					waveCount++;
				}
			}

			if (arg1 == 215) {
				int var18 = arg0.g2_alt2();
				int var19 = arg0.g1_alt3();
				int var20 = (var19 >> 4 & 0x7) + baseX;
				int var21 = (var19 & 0x7) + baseZ;
				int var22 = arg0.g2_alt2();
				int var23 = arg0.g2();
				if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104 && localPid != var22) {
					ObjStackEntity var24 = new ObjStackEntity();
					var24.type = var18;
					var24.count = var23;

					if (levelObjStacks[currentLevel][var20][var21] == null) {
						levelObjStacks[currentLevel][var20][var21] = new LinkList();
					}

					levelObjStacks[currentLevel][var20][var21].addTail(var24);
					sortObjStacks(var20, var21);
				}
			} else if (arg1 == 156) {
				int var25 = arg0.g1_alt1();
				int var26 = (var25 >> 4 & 0x7) + baseX;
				int var27 = (var25 & 0x7) + baseZ;
				int var28 = arg0.g2();
				if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
					LinkList var29 = levelObjStacks[currentLevel][var26][var27];
					if (var29 != null) {
						for (ObjStackEntity var30 = (ObjStackEntity) var29.head(); var30 != null; var30 = (ObjStackEntity) var29.next()) {
							if ((var28 & 0x7FFF) == var30.type) {
								var30.unlink();
								break;
							}
						}

						if (var29.head() == null) {
							levelObjStacks[currentLevel][var26][var27] = null;
						}

						sortObjStacks(var26, var27);
					}
				}
			} else if (arg1 == 160) {
				int var31 = arg0.g1_alt3();
				int var32 = (var31 >> 4 & 0x7) + baseX;
				int var33 = (var31 & 0x7) + baseZ;
				int var34 = arg0.g1_alt3();
				int var35 = var34 >> 2;
				int var36 = var34 & 0x3;
				int var37 = LOC_LAYER[var35];
				int var38 = arg0.g2_alt2();
				if (var32 >= 0 && var33 >= 0 && var32 < 103 && var33 < 103) {
					int var39 = levelHeightmap[currentLevel][var32][var33];
					int var40 = levelHeightmap[currentLevel][var32 + 1][var33];
					int var41 = levelHeightmap[currentLevel][var32 + 1][var33 + 1];
					int var42 = levelHeightmap[currentLevel][var32][var33 + 1];
					if (var37 == 0) {
						Wall var43 = scene.getWall(currentLevel, var32, var33);
						if (var43 != null) {
							int var44 = var43.bitset >> 14 & 0x7FFF;
							if (var35 == 2) {
								var43.modelA = new LocEntity(var44, var36 + 4, 2, var40, var41, var39, var42, var38, false);
								var43.modelB = new LocEntity(var44, var36 + 1 & 0x3, 2, var40, var41, var39, var42, var38, false);
							} else {
								var43.modelA = new LocEntity(var44, var36, var35, var40, var41, var39, var42, var38, false);
							}
						}
					}

					if (var37 == 1) {
						Decor var45 = scene.getWallDecoration(var32, var33, currentLevel);
						if (var45 != null) {
							var45.field1031 = new LocEntity(var45.bitset >> 14 & 0x7FFF, 0, 4, var40, var41, var39, var42, var38, false);
						}
					}

					if (var37 == 2) {
						Location var46 = scene.getLoc(var32, var33, currentLevel);

						if (var35 == 11) {
							var35 = 10;
						}

						if (var46 != null) {
							var46.model = new LocEntity(var46.bitset >> 14 & 0x7FFF, var36, var35, var40, var41, var39, var42, var38, false);
						}
					}

					if (var37 == 3) {
						GroundDecor var47 = scene.getGroundDecoration(var33, var32, currentLevel);
						if (var47 != null) {
							var47.model = new LocEntity(var47.bitset >> 14 & 0x7FFF, var36, 22, var40, var41, var39, var42, var38, false);
						}
					}
				}
			} else {
				if (arg1 == 147) {
					int var48 = arg0.g1_alt3();
					int var49 = (var48 >> 4 & 0x7) + baseX;
					int var50 = (var48 & 0x7) + baseZ;
					int var51 = arg0.g2();
					byte var52 = arg0.g1b_alt3();
					int var53 = arg0.g2_alt1();
					byte var54 = arg0.g1b_alt2();
					int var55 = arg0.g2();
					int var56 = arg0.g1_alt3();
					int var57 = var56 >> 2;
					int var58 = var56 & 0x3;
					int var59 = LOC_LAYER[var57];
					byte var60 = arg0.g1b();
					int var61 = arg0.g2();
					byte var62 = arg0.g1b_alt2();
					PlayerEntity var63;
					if (localPid == var51) {
						var63 = localPlayer;
					} else {
						var63 = players[var51];
					}

					if (var63 != null) {
						LocType var64 = LocType.get(var61);
						int var65 = levelHeightmap[currentLevel][var49][var50];
						int var66 = levelHeightmap[currentLevel][var49 + 1][var50];
						int var67 = levelHeightmap[currentLevel][var49 + 1][var50 + 1];
						int var68 = levelHeightmap[currentLevel][var49][var50 + 1];
						Model var69 = var64.getModel(var57, var58, var65, var66, var67, var68, -1);
						if (var69 != null) {
							appendLoc(var55 + 1, -1, 0, var59, var50, 0, currentLevel, var49, var53 + 1);
							var63.locStartCycle = loopCycle + var53;
							var63.locStopCycle = loopCycle + var55;
							var63.locModel = var69;
							int var70 = var64.width;
							int var71 = var64.length;
							if (var58 == 1 || var58 == 3) {
								var70 = var64.length;
								var71 = var64.width;
							}

							var63.locOffsetX = var49 * 128 + var70 * 64;
							var63.locOffsetZ = var50 * 128 + var71 * 64;
							var63.locOffsetY = getHeightmapY(currentLevel, var63.locOffsetZ, var63.locOffsetX);

							if (var60 > var52) {
								byte var72 = var60;
								var60 = var52;
								var52 = var72;
							}

							if (var62 > var54) {
								byte var73 = var62;
								var62 = var54;
								var54 = var73;
							}

							var63.minTileX = var49 + var60;
							var63.maxTileX = var49 + var52;
							var63.minTileZ = var50 + var62;
							var63.maxTileZ = var50 + var54;
						}
					}
				}

				if (arg1 == 151) {
					int var74 = arg0.g1_alt1();
					int var75 = (var74 >> 4 & 0x7) + baseX;
					int var76 = (var74 & 0x7) + baseZ;
					int var77 = arg0.g2_alt1();
					int var78 = arg0.g1_alt3();
					int var79 = var78 >> 2;
					int var80 = var78 & 0x3;
					int var81 = LOC_LAYER[var79];
					if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104) {
						appendLoc(-1, var77, var80, var81, var76, var79, currentLevel, var75, 0);
					}
				} else if (arg1 == 4) {
					int var82 = arg0.g1();
					int var83 = (var82 >> 4 & 0x7) + baseX;
					int var84 = (var82 & 0x7) + baseZ;
					int var85 = arg0.g2();
					int var86 = arg0.g1();
					int var87 = arg0.g2();
					if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
						var83 = var83 * 128 + 64;
						var84 = var84 * 128 + 64;
						SpotAnimEntity var88 = new SpotAnimEntity(currentLevel, loopCycle, var87, var85, getHeightmapY(currentLevel, var84, var83) - var86, var84, var83);
						spotanims.addTail(var88);
					}
				} else if (arg1 == 44) {
					int var89 = arg0.g2_alt3();
					int var90 = arg0.g2();
					int var91 = arg0.g1();
					int var92 = (var91 >> 4 & 0x7) + baseX;
					int var93 = (var91 & 0x7) + baseZ;
					if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104) {
						ObjStackEntity var94 = new ObjStackEntity();
						var94.type = var89;
						var94.count = var90;

						if (levelObjStacks[currentLevel][var92][var93] == null) {
							levelObjStacks[currentLevel][var92][var93] = new LinkList();
						}

						levelObjStacks[currentLevel][var92][var93].addTail(var94);
						sortObjStacks(var92, var93);
					}
				} else if (arg1 == 101) {
					int var95 = arg0.g1_alt2();
					int var96 = var95 >> 2;
					int var97 = var95 & 0x3;
					int var98 = LOC_LAYER[var96];
					int var99 = arg0.g1();
					int var100 = (var99 >> 4 & 0x7) + baseX;
					int var101 = (var99 & 0x7) + baseZ;
					if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
						appendLoc(-1, -1, var97, var98, var101, var96, currentLevel, var100, 0);
					}
				} else if (arg1 == 117) {
					int var102 = arg0.g1();
					int var103 = (var102 >> 4 & 0x7) + baseX;
					int var104 = (var102 & 0x7) + baseZ;
					int var105 = var103 + arg0.g1b();
					int var106 = var104 + arg0.g1b();
					int var107 = arg0.g2b();
					int var108 = arg0.g2();
					int var109 = arg0.g1() * 4;
					int var110 = arg0.g1() * 4;
					int var111 = arg0.g2();
					int var112 = arg0.g2();
					int var113 = arg0.g1();
					int var114 = arg0.g1();
					if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104 && var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && var108 != 0xFFFF) {
						var103 = var103 * 128 + 64;
						var104 = var104 * 128 + 64;
						var105 = var105 * 128 + 64;
						var106 = var106 * 128 + 64;
						ProjectileEntity var115 = new ProjectileEntity(var113, var110, loopCycle + var111, loopCycle + var112, var114, currentLevel, getHeightmapY(currentLevel, var104, var103) - var109, var104, var103, var107, var108);
						var115.updateVelocity(loopCycle + var111, var106, getHeightmapY(currentLevel, var106, var105) - var110, var105);
						projectiles.addTail(var115);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public static final void setLowMemory() {
		World3D.lowMemory = true;
		Pix3D.lowMemory = true;
		lowMemory = true;
		World.lowMemory = true;
		LocType.lowMemory = true;
	}

	@ObfuscatedName("client.b(LMBMGIXGO;II)V")
	public final void readNpcs(Packet arg0, int arg1) {
		arg0.accessBits();
		int var3 = arg0.gBit(8);
		if (var3 < npcCount) {
			for (int var4 = var3; var4 < npcCount; var4++) {
				entityRemovalIds[entityRemovalCount++] = npcIds[var4];
			}
		}

		if (var3 > npcCount) {
			signlink.reporterror(username + " Too many npcs");
			throw new RuntimeException("eek");
		}

		npcCount = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = npcIds[var5];
			NpcEntity var7 = npcs[var6];
			int var8 = arg0.gBit(1);
			if (var8 == 0) {
				npcIds[npcCount++] = var6;
				var7.cycle = loopCycle;
			} else {
				int var9 = arg0.gBit(2);
				if (var9 == 0) {
					npcIds[npcCount++] = var6;
					var7.cycle = loopCycle;
					entityUpdateIds[entityUpdateCount++] = var6;
				} else if (var9 == 1) {
					npcIds[npcCount++] = var6;
					var7.cycle = loopCycle;
					int var10 = arg0.gBit(3);
					var7.step(false, var10);
					int var11 = arg0.gBit(1);
					if (var11 == 1) {
						entityUpdateIds[entityUpdateCount++] = var6;
					}
				} else if (var9 == 2) {
					npcIds[npcCount++] = var6;
					var7.cycle = loopCycle;
					int var12 = arg0.gBit(3);
					var7.step(true, var12);
					int var13 = arg0.gBit(3);
					var7.step(true, var13);
					int var14 = arg0.gBit(1);
					if (var14 == 1) {
						entityUpdateIds[entityUpdateCount++] = var6;
					}
				} else if (var9 == 3) {
					entityRemovalIds[entityRemovalCount++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.o(Z)V")
	public final void updateTitle() {
		if (titleScreenState == 0) {
			int var1 = screenWidth / 2 - 80;
			int var2 = screenHeight / 2 + 20;
			var2 += 20;
			if (mouseClickButton == 1 && mouseClickX >= var1 - 75 && mouseClickX <= var1 + 75 && mouseClickY >= var2 - 20 && mouseClickY <= var2 + 20) {
				titleScreenState = 3;
				titleLoginField = 0;
			}

			int var3 = screenWidth / 2 + 80;
			if (mouseClickButton == 1 && mouseClickX >= var3 - 75 && mouseClickX <= var3 + 75 && mouseClickY >= var2 - 20 && mouseClickY <= var2 + 20) {
				loginMessage0 = "";
				loginMessage1 = "Enter your username & password.";
				titleScreenState = 2;
				titleLoginField = 0;
			}
		} else if (titleScreenState == 2) {
			int var4 = screenHeight / 2 - 40;
			var4 += 30;
			var4 += 25;
			if (mouseClickButton == 1 && mouseClickY >= var4 - 15 && mouseClickY < var4) {
				titleLoginField = 0;
			}

			var4 += 15;
			if (mouseClickButton == 1 && mouseClickY >= var4 - 15 && mouseClickY < var4) {
				titleLoginField = 1;
			}

			var4 += 15;
			int var5 = screenWidth / 2 - 80;
			int var6 = screenHeight / 2 + 50;
			var6 += 20;
			if (mouseClickButton == 1 && mouseClickX >= var5 - 75 && mouseClickX <= var5 + 75 && mouseClickY >= var6 - 20 && mouseClickY <= var6 + 20) {
				loginAttempts = 0;
				login(username, password, false);

				if (ingame) {
					return;
				}
			}

			int var7 = screenWidth / 2 + 80;
			if (mouseClickButton == 1 && mouseClickX >= var7 - 75 && mouseClickX <= var7 + 75 && mouseClickY >= var6 - 20 && mouseClickY <= var6 + 20) {
				titleScreenState = 0;
				username = "";
				password = "";
			}

			while (true) {
				int var8;
				boolean var9;
				var8 = pollKey();
				if (var8 == -1) {
					return;
				}

				var9 = false;
				for (int var10 = 0; var10 < CHARSET.length(); var10++) {
					if (var8 == CHARSET.charAt(var10)) {
						var9 = true;
						break;
					}
				}

				if (titleLoginField == 0) {
					if (var8 == 8 && username.length() > 0) {
						username = username.substring(0, username.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						titleLoginField = 1;
					}

					if (var9) {
						username = username + (char) var8;
					}

					if (username.length() > 12) {
						username = username.substring(0, 12);
					}
				} else if (titleLoginField == 1) {
					if (var8 == 8 && password.length() > 0) {
						password = password.substring(0, password.length() - 1);
					}

					if (var8 == 9 || var8 == 10 || var8 == 13) {
						titleLoginField = 0;
					}

					if (var9) {
						password = password + (char) var8;
					}

					if (password.length() > 20) {
						password = password.substring(0, 20);
					}
				}
			}
		} else if (titleScreenState == 3) {
			int var11 = screenWidth / 2;
			int var12 = screenHeight / 2 + 50;
			var12 += 20;
			if (mouseClickButton == 1 && mouseClickX >= var11 - 75 && mouseClickX <= var11 + 75 && mouseClickY >= var12 - 20 && mouseClickY <= var12 + 20) {
				titleScreenState = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.a(LCXGZMTJK;IIZ)V")
	public final void drawOnMinimap(Pix32 arg0, int arg1, int arg2) {
		int var4 = minimapAnticheatAngle + orbitCameraYaw & 0x7FF;
		int var5 = arg1 * arg1 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = Model.sin[var4];
			int var7 = Model.cos[var4];
			var6 = var6 * 256 / (minimapZoom + 256);
			var7 = var7 * 256 / (minimapZoom + 256);
			int var8 = arg1 * var7 + arg2 * var6 >> 16;
			int var9 = arg2 * var7 - arg1 * var6 >> 16;
			if (var5 > 2500) {
				arg0.drawMasked(imageMapback, 83 - var9 - arg0.height / 2 - 4, var8 + 94 - arg0.width / 2 + 4);
			} else {
				arg0.draw(var8 + 94 + 4 - arg0.width / 2, 83 - var9 - arg0.height / 2 - 4);
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void addLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg4 >= 1 && arg0 >= 1 && arg4 <= 102 && arg0 <= 102) {
			if (lowMemory && currentLevel != arg1) {
				return;
			}

			int var8 = 0;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;

			if (arg5 == 0) {
				var8 = scene.getWallBitset(arg1, arg4, arg0);
			}

			if (arg5 == 1) {
				var8 = scene.getWallDecorationBitset(arg1, arg4, arg0);
			}

			if (arg5 == 2) {
				var8 = scene.getLocBitset(arg1, arg4, arg0);
			}

			if (arg5 == 3) {
				var8 = scene.getGroundDecorationBitset(arg1, arg4, arg0);
			}

			if (var8 != 0) {
				int var12 = scene.getInfo(arg1, arg4, arg0, var8);
				int var13 = var8 >> 14 & 0x7FFF;
				int var14 = var12 & 0x1F;
				int var15 = var12 >> 6;
				if (arg5 == 0) {
					scene.removeWall(arg4, arg1, arg0);
					LocType var16 = LocType.get(var13);
					if (var16.blockwalk) {
						levelCollisionMap[arg1].removeWall(var15, var14, var16.blockrange, arg4, arg0);
					}
				}

				if (arg5 == 1) {
					scene.removeWallDecoration(arg0, arg1, arg4);
				}

				if (arg5 == 2) {
					scene.removeLoc(arg1, arg4, arg0);
					LocType var17 = LocType.get(var13);
					if (var17.width + arg4 > 103 || var17.width + arg0 > 103 || var17.length + arg4 > 103 || var17.length + arg0 > 103) {
						return;
					}

					if (var17.blockwalk) {
						levelCollisionMap[arg1].removeLoc(var15, var17.width, arg4, arg0, var17.length, var17.blockrange);
					}
				}

				if (arg5 == 3) {
					scene.removeGroundDecoration(arg1, arg0, arg4);
					LocType var18 = LocType.get(var13);
					if (var18.blockwalk && var18.active) {
						levelCollisionMap[arg1].removeBlocked(arg0, arg4);
					}
				}
			}

			if (arg6 >= 0) {
				int var19 = arg1;
				if (arg1 < 3 && (levelTileFlags[1][arg4][arg0] & 0x2) == 2) {
					var19 = arg1 + 1;
				}

				World.addLoc(scene, arg2, arg0, arg3, var19, levelCollisionMap[arg1], levelHeightmap, arg4, arg6, arg1);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(ILMBMGIXGO;I)V")
	public final void readPlayerInfo(int arg0, Packet arg1) {
		entityRemovalCount = 0;
		entityUpdateCount = 0;
		readLocalPlayer(arg1, arg0);
		readPlayers(arg0, arg1);
		readNewPlayers(arg1, arg0);
		readPlayerUpdates(arg0, arg1);

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
				signlink.reporterror(username + " null entry in pl list - pos:" + var5 + " size:" + playerCount);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void orbitCamera(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg1 & 0x7FF;
		int var8 = 2048 - arg4 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg0;
		if (var7 != 0) {
			int var12 = Model.sin[var7];
			int var13 = Model.cos[var7];
			int var14 = var10 * var13 - arg0 * var12 >> 16;
			var11 = var10 * var12 + arg0 * var13 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			int var15 = Model.sin[var8];
			int var16 = Model.cos[var8];
			int var17 = var9 * var16 + var11 * var15 >> 16;
			var11 = var11 * var16 - var9 * var15 >> 16;
			var9 = var17;
		}

		cameraX = arg2 - var9;
		cameraY = arg3 - var10;
		cameraZ = arg5 - var11;
		cameraPitch = arg1;
		cameraYaw = arg4;
	}

	@ObfuscatedName("client.p(Z)Z")
	public final boolean read() {
		if (stream == null) {
			return false;
		}

		try {
			int var1 = stream.available();
			if (var1 == 0) {
				return false;
			}

			if (packetType == -1) {
				stream.read(in.data, 0, 1);
				packetType = in.data[0] & 0xFF;
				if (randomIn != null) {
					packetType = packetType - randomIn.nextInt() & 0xFF;
				}

				packetSize = Protocol.serverProtSizes[packetType];
				var1--;
			}

			if (packetSize == -1) {
				if (var1 <= 0) {
					return false;
				}

				stream.read(in.data, 0, 1);
				packetSize = in.data[0] & 0xFF;
				var1--;
			}

			if (packetSize == -2) {
				if (var1 <= 1) {
					return false;
				}

				stream.read(in.data, 0, 2);
				in.pos = 0;
				packetSize = in.g2();
				var1 -= 2;
			}

			if (var1 < packetSize) {
				return false;
			}

			in.pos = 0;
			stream.read(in.data, 0, packetSize);
			idleNetCycles = 0;
			lastPacketType2 = lastPacketType1;
			lastPacketType1 = lastPacketType0;
			lastPacketType0 = packetType;

			if (packetType == 81) {
				readPlayerInfo(packetSize, in);
				awaitingSync = false;
				packetType = -1;
				return true;
			}

			if (packetType == 176) {
				daysSinceRecoveriesChanged = in.g1_alt2();
				unreadMessages = in.g2_alt2();
				warnMembersInNonMembers = in.g1();
				lastAddress = in.g4_alt3();
				daysSinceLastLogin = in.g2();

				if (lastAddress != 0 && viewportInterfaceId == -1) {
					signlink.dnslookup(JString.formatName(lastAddress));
					closeInterfaces();
					short var2 = 650;
					if (daysSinceRecoveriesChanged != 201 || warnMembersInNonMembers == 1) {
						var2 = 655;
					}

					reportAbuseInput = "";
					reportAbuseMuteOption = false;

					for (int var3 = 0; var3 < Component.instances.length; var3++) {
						if (Component.instances[var3] != null && Component.instances[var3].clientCode == var2) {
							viewportInterfaceId = Component.instances[var3].layer;
							break;
						}
					}
				}

				packetType = -1;
				return true;
			}

			if (packetType == 64) {
				baseX = in.g1_alt2();
				baseZ = in.g1_alt3();
				for (int var4 = baseX; var4 < baseX + 8; var4++) {
					for (int var5 = baseZ; var5 < baseZ + 8; var5++) {
						if (levelObjStacks[currentLevel][var4][var5] != null) {
							levelObjStacks[currentLevel][var4][var5] = null;
							sortObjStacks(var4, var5);
						}
					}
				}

				for (LocAddEntity var6 = (LocAddEntity) temporaryLocs.head(); var6 != null; var6 = (LocAddEntity) temporaryLocs.next()) {
					if (var6.localX >= baseX && var6.localX < baseX + 8 && var6.localZ >= baseZ && var6.localZ < baseZ + 8 && currentLevel == var6.level) {
						var6.duration = 0;
					}
				}

				packetType = -1;
				return true;
			}

			if (packetType == 185) {
				int var7 = in.g2_alt3();
				Component.instances[var7].modelType = 3;

				if (localPlayer.npc == null) {
					Component.instances[var7].model = (localPlayer.appearances[11] << 5) + (localPlayer.appearances[8] << 10) + (localPlayer.appearances[0] << 15) + (localPlayer.colors[0] << 25) + (localPlayer.colors[4] << 20) + localPlayer.appearances[1];
				} else {
					Component.instances[var7].model = (int) (localPlayer.npc.type + 0x12345678L);
				}

				packetType = -1;
				return true;
			}

			if (packetType == 107) {
				cutscene = false;

				for (int var8 = 0; var8 < 5; var8++) {
					cameraModifierEnabled[var8] = false;
				}

				packetType = -1;
				return true;
			}

			if (packetType == 72) {
				int var9 = in.g2_alt1();
				Component var10 = Component.instances[var9];
				for (int var11 = 0; var11 < var10.invSlotObjId.length; var11++) {
					var10.invSlotObjId[var11] = -1;
					var10.invSlotObjId[var11] = 0;
				}

				packetType = -1;
				return true;
			}

			if (packetType == 214) {
				ignoreCount = packetSize / 8;
				for (int var12 = 0; var12 < ignoreCount; var12++) {
					ignoreName37[var12] = in.g8();
				}

				packetType = -1;
				return true;
			}

			if (packetType == 166) {
				cutscene = true;
				cutsceneSrcLocalTileX = in.g1();
				cutsceneSrcLocalTileZ = in.g1();
				cutsceneSrcHeight = in.g2();
				cutsceneMoveSpeed = in.g1();
				cutsceneMoveAcceleration = in.g1();
				if (cutsceneMoveAcceleration >= 100) {
					cameraX = cutsceneSrcLocalTileX * 128 + 64;
					cameraZ = cutsceneSrcLocalTileZ * 128 + 64;
					cameraY = getHeightmapY(currentLevel, cameraZ, cameraX) - cutsceneSrcHeight;
				}

				packetType = -1;
				return true;
			}

			if (packetType == 134) {
				redrawSidebar = true;
				int var13 = in.g1();
				int var14 = in.g4_alt2();
				int var15 = in.g1();
				skillExperience[var13] = var14;
				skillLevel[var13] = var15;
				skillBaseLevel[var13] = 1;
				for (int var16 = 0; var16 < 98; var16++) {
					if (var14 >= levelExperience[var16]) {
						skillBaseLevel[var13] = var16 + 2;
					}
				}

				packetType = -1;
				return true;
			}

			if (packetType == 71) {
				int var17 = in.g2();
				int var18 = in.g1_alt1();

				if (var17 == 0xFFFF) {
					var17 = -1;
				}

				tabInterfaceId[var18] = var17;
				redrawSidebar = true;
				redrawSideicons = true;
				packetType = -1;
				return true;
			}

			if (packetType == 74) {
				int var19 = in.g2_alt1();
				if (var19 == 0xFFFF) {
					var19 = -1;
				}

				if (nextMidiSong != var19 && midiActive && !lowMemory && nextMusicDelay == 0) {
					midiSong = var19;
					midiFading = true;
					ondemand.request(2, midiSong);
				}

				nextMidiSong = var19;
				packetType = -1;
				return true;
			}

			if (packetType == 121) {
				int var20 = in.g2_alt3();
				int var21 = in.g2_alt2();
				if (midiActive && !lowMemory) {
					midiSong = var20;
					midiFading = false;
					ondemand.request(2, midiSong);
					nextMusicDelay = var21;
				}

				packetType = -1;
				return true;
			}

			if (packetType == 109) {
				logout();
				packetType = -1;
				return false;
			}

			if (packetType == 70) {
				int var22 = in.g2b();
				int var23 = in.g2b_alt1();
				int var24 = in.g2_alt1();
				Component var25 = Component.instances[var24];
				var25.x = var22;
				var25.y = var23;
				packetType = -1;
				return true;
			}

			if (packetType == 73 || packetType == 241) {
				int var26 = sceneCenterZoneX;
				int var27 = sceneCenterZoneZ;
				if (packetType == 73) {
					var26 = in.g2_alt2();
					var27 = in.g2();
					sceneInstanced = false;
				}

				if (packetType == 241) {
					var27 = in.g2_alt2();
					in.accessBits();

					for (int var28 = 0; var28 < 4; var28++) {
						for (int var29 = 0; var29 < 13; var29++) {
							for (int var30 = 0; var30 < 13; var30++) {
								int var31 = in.gBit(1);
								if (var31 == 1) {
									levelChunkBitset[var28][var29][var30] = in.gBit(26);
								} else {
									levelChunkBitset[var28][var29][var30] = -1;
								}
							}
						}
					}

					in.accessBytes();
					var26 = in.g2();
					sceneInstanced = true;
				}

				if (sceneCenterZoneX == var26 && sceneCenterZoneZ == var27 && sceneState == 2) {
					packetType = -1;
					return true;
				}

				sceneCenterZoneX = var26;
				sceneCenterZoneZ = var27;
				sceneBaseTileX = (sceneCenterZoneX - 6) * 8;
				sceneBaseTileZ = (sceneCenterZoneZ - 6) * 8;
				withinTutorialIsland = false;
				if ((sceneCenterZoneX / 8 == 48 || sceneCenterZoneX / 8 == 49) && sceneCenterZoneZ / 8 == 48) {
					withinTutorialIsland = true;
				}

				if (sceneCenterZoneX / 8 == 48 && sceneCenterZoneZ / 8 == 148) {
					withinTutorialIsland = true;
				}

				sceneState = 1;
				sceneLoadStartTime = System.currentTimeMillis();
				areaViewport.bind();
				fontPlain12.drawStringCenter(0, "Loading - please wait.", 151, 257);
				fontPlain12.drawStringCenter(0xFFFFFF, "Loading - please wait.", 150, 256);
				areaViewport.draw(4, graphics, 4);

				if (packetType == 73) {
					int var32 = 0;
					for (int var33 = (sceneCenterZoneX - 6) / 8; var33 <= (sceneCenterZoneX + 6) / 8; var33++) {
						for (int var34 = (sceneCenterZoneZ - 6) / 8; var34 <= (sceneCenterZoneZ + 6) / 8; var34++) {
							var32++;
						}
					}

					sceneMapLandData = new byte[var32][];
					sceneMapLocData = new byte[var32][];
					sceneMapIndex = new int[var32];
					sceneMapLandFile = new int[var32];
					sceneMapLocFile = new int[var32];
					int var35 = 0;
					for (int var36 = (sceneCenterZoneX - 6) / 8; var36 <= (sceneCenterZoneX + 6) / 8; var36++) {
						for (int var37 = (sceneCenterZoneZ - 6) / 8; var37 <= (sceneCenterZoneZ + 6) / 8; var37++) {
							sceneMapIndex[var35] = (var36 << 8) + var37;

							if (withinTutorialIsland && (var37 == 49 || var37 == 149 || var37 == 147 || var36 == 50 || var36 == 49 && var37 == 47)) {
								sceneMapLandFile[var35] = -1;
								sceneMapLocFile[var35] = -1;
								var35++;
							} else {
								int var38 = sceneMapLandFile[var35] = ondemand.getMapFile(0, var37, var36);
								if (var38 != -1) {
									ondemand.request(3, var38);
								}

								int var39 = sceneMapLocFile[var35] = ondemand.getMapFile(1, var37, var36);
								if (var39 != -1) {
									ondemand.request(3, var39);
								}

								var35++;
							}
						}
					}
				}

				if (packetType == 241) {
					int var40 = 0;
					int[] var41 = new int[676];
					for (int var42 = 0; var42 < 4; var42++) {
						for (int var43 = 0; var43 < 13; var43++) {
							for (int var44 = 0; var44 < 13; var44++) {
								int var45 = levelChunkBitset[var42][var43][var44];
								if (var45 != -1) {
									int var46 = var45 >> 14 & 0x3FF;
									int var47 = var45 >> 3 & 0x7FF;
									int var48 = (var46 / 8 << 8) + var47 / 8;
									for (int var49 = 0; var49 < var40; var49++) {
										if (var41[var49] == var48) {
											var48 = -1;
											break;
										}
									}

									if (var48 != -1) {
										var41[var40++] = var48;
									}
								}
							}
						}
					}

					sceneMapLandData = new byte[var40][];
					sceneMapLocData = new byte[var40][];
					sceneMapIndex = new int[var40];
					sceneMapLandFile = new int[var40];
					sceneMapLocFile = new int[var40];
					for (int var50 = 0; var50 < var40; var50++) {
						int var51 = sceneMapIndex[var50] = var41[var50];
						int var52 = var51 >> 8 & 0xFF;
						int var53 = var51 & 0xFF;
						int var54 = sceneMapLandFile[var50] = ondemand.getMapFile(0, var53, var52);
						if (var54 != -1) {
							ondemand.request(3, var54);
						}

						int var55 = sceneMapLocFile[var50] = ondemand.getMapFile(1, var53, var52);
						if (var55 != -1) {
							ondemand.request(3, var55);
						}
					}
				}

				int var56 = sceneBaseTileX - scenePrevBaseTileX;
				int var57 = sceneBaseTileZ - scenePrevBaseTileZ;
				scenePrevBaseTileX = sceneBaseTileX;
				scenePrevBaseTileZ = sceneBaseTileZ;

				for (int var58 = 0; var58 < 16384; var58++) {
					NpcEntity var59 = npcs[var58];
					if (var59 != null) {
						for (int var60 = 0; var60 < 10; var60++) {
							var59.pathTileX[var60] -= var56;
							var59.pathTileZ[var60] -= var57;
						}

						var59.x -= var56 * 128;
						var59.z -= var57 * 128;
					}
				}

				for (int var61 = 0; var61 < MAX_PLAYER_COUNT; var61++) {
					PlayerEntity var62 = players[var61];
					if (var62 != null) {
						for (int var63 = 0; var63 < 10; var63++) {
							var62.pathTileX[var63] -= var56;
							var62.pathTileZ[var63] -= var57;
						}

						var62.x -= var56 * 128;
						var62.z -= var57 * 128;
					}
				}

				awaitingSync = true;
				byte var64 = 0;
				byte var65 = 104;
				byte var66 = 1;
				if (var56 < 0) {
					var64 = 103;
					var65 = -1;
					var66 = -1;
				}

				byte var67 = 0;
				byte var68 = 104;
				byte var69 = 1;
				if (var57 < 0) {
					var67 = 103;
					var68 = -1;
					var69 = -1;
				}

				for (int var70 = var64; var70 != var65; var70 += var66) {
					for (int var71 = var67; var71 != var68; var71 += var69) {
						int var72 = var56 + var70;
						int var73 = var57 + var71;
						for (int var74 = 0; var74 < 4; var74++) {
							if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104) {
								levelObjStacks[var74][var70][var71] = levelObjStacks[var74][var72][var73];
							} else {
								levelObjStacks[var74][var70][var71] = null;
							}
						}
					}
				}

				for (LocAddEntity var75 = (LocAddEntity) temporaryLocs.head(); var75 != null; var75 = (LocAddEntity) temporaryLocs.next()) {
					var75.localX -= var56;
					var75.localZ -= var57;
					if (var75.localX < 0 || var75.localZ < 0 || var75.localX >= 104 || var75.localZ >= 104) {
						var75.unlink();
					}
				}

				if (flagSceneTileX != 0) {
					flagSceneTileX -= var56;
					flagSceneTileZ -= var57;
				}

				cutscene = false;
				packetType = -1;
				return true;
			}

			if (packetType == 208) {
				int var76 = in.g2b_alt1();
				if (var76 >= 0) {
					resetInterfaceAnimation(var76);
				}

				viewportOverlayInterfaceId = var76;
				packetType = -1;
				return true;
			}

			if (packetType == 99) {
				minimapState = in.g1();
				packetType = -1;
				return true;
			}

			if (packetType == 75) {
				int var77 = in.g2_alt3();
				int var78 = in.g2_alt3();
				Component.instances[var78].modelType = 2;
				Component.instances[var78].model = var77;
				packetType = -1;
				return true;
			}

			if (packetType == 114) {
				systemUpdateTimer = in.g2_alt1() * 30;
				packetType = -1;
				return true;
			}

			if (packetType == 60) {
				baseZ = in.g1();
				baseX = in.g1_alt2();

				while (in.pos < packetSize) {
					int var79 = in.g1();
					readZonePacket(in, var79);
				}

				packetType = -1;
				return true;
			}

			if (packetType == 35) {
				int var80 = in.g1();
				int var81 = in.g1();
				int var82 = in.g1();
				int var83 = in.g1();
				cameraModifierEnabled[var80] = true;
				cameraModifierJitter[var80] = var81;
				cameraModifierWobbleScale[var80] = var82;
				cameraModifierWobbleSpeed[var80] = var83;
				cameraModifierCycle[var80] = 0;
				packetType = -1;
				return true;
			}

			if (packetType == 174) {
				int var84 = in.g2();
				int var85 = in.g1();
				int var86 = in.g2();
				if (waveEnabled && !lowMemory && waveCount < 50) {
					waveIds[waveCount] = var84;
					waveLoops[waveCount] = var85;
					waveDelay[waveCount] = Wave.delays[var84] + var86;
					waveCount++;
				}

				packetType = -1;
				return true;
			}

			if (packetType == 104) {
				int var87 = in.g1_alt2();
				int var88 = in.g1_alt1();
				String var89 = in.gjstr();
				if (var87 >= 1 && var87 <= 5) {
					if (var89.equalsIgnoreCase("null")) {
						var89 = null;
					}

					playerOptions[var87 - 1] = var89;
					playerOptionPushDown[var87 - 1] = var88 == 0;
				}

				packetType = -1;
				return true;
			}

			if (packetType == 78) {
				flagSceneTileX = 0;
				packetType = -1;
				return true;
			}

			if (packetType == 253) {
				String var90 = in.gjstr();
				if (var90.endsWith(":tradereq:")) {
					String var91 = var90.substring(0, var90.indexOf(":"));
					long var92 = JString.toBase37(var91);
					boolean var94 = false;
					for (int var95 = 0; var95 < ignoreCount; var95++) {
						if (ignoreName37[var95] == var92) {
							var94 = true;
							break;
						}
					}

					if (!var94 && overrideChat == 0) {
						addMessage("wishes to trade with you.", 4, var91);
					}
				} else if (var90.endsWith(":duelreq:")) {
					String var96 = var90.substring(0, var90.indexOf(":"));
					long var97 = JString.toBase37(var96);
					boolean var99 = false;
					for (int var100 = 0; var100 < ignoreCount; var100++) {
						if (ignoreName37[var100] == var97) {
							var99 = true;
							break;
						}
					}

					if (!var99 && overrideChat == 0) {
						addMessage("wishes to duel with you.", 8, var96);
					}
				} else if (var90.endsWith(":chalreq:")) {
					String var101 = var90.substring(0, var90.indexOf(":"));
					long var102 = JString.toBase37(var101);
					boolean var104 = false;
					for (int var105 = 0; var105 < ignoreCount; var105++) {
						if (ignoreName37[var105] == var102) {
							var104 = true;
							break;
						}
					}

					if (!var104 && overrideChat == 0) {
						String var106 = var90.substring(var90.indexOf(":") + 1, var90.length() - 9);
						addMessage(var106, 8, var101);
					}
				} else {
					addMessage(var90, 0, "");
				}

				packetType = -1;
				return true;
			}

			if (packetType == 1) {
				for (int var107 = 0; var107 < players.length; var107++) {
					if (players[var107] != null) {
						players[var107].primarySeqId = -1;
					}
				}

				for (int var108 = 0; var108 < npcs.length; var108++) {
					if (npcs[var108] != null) {
						npcs[var108].primarySeqId = -1;
					}
				}

				packetType = -1;
				return true;
			}

			if (packetType == 50) {
				long var109 = in.g8();
				int var111 = in.g1();
				String var112 = JString.toSentenceCase(JString.fromBase37(var109));
				for (int var113 = 0; var113 < friendCount; var113++) {
					if (friendName37[var113] == var109) {
						if (friendWorld[var113] != var111) {
							friendWorld[var113] = var111;
							redrawSidebar = true;

							if (var111 > 0) {
								addMessage(var112 + " has logged in.", 5, "");
							}

							if (var111 == 0) {
								addMessage(var112 + " has logged out.", 5, "");
							}
						}

						var112 = null;
						break;
					}
				}

				if (var112 != null && friendCount < 200) {
					friendName37[friendCount] = var109;
					friendName[friendCount] = var112;
					friendWorld[friendCount] = var111;
					friendCount++;
					redrawSidebar = true;
				}

				boolean var114 = false;
				while (!var114) {
					var114 = true;
					for (int var115 = 0; var115 < friendCount - 1; var115++) {
						if (friendWorld[var115] != nodeId && friendWorld[var115 + 1] == nodeId || friendWorld[var115] == 0 && friendWorld[var115 + 1] != 0) {
							int var116 = friendWorld[var115];
							friendWorld[var115] = friendWorld[var115 + 1];
							friendWorld[var115 + 1] = var116;
							String var117 = friendName[var115];
							friendName[var115] = friendName[var115 + 1];
							friendName[var115 + 1] = var117;
							long var118 = friendName37[var115];
							friendName37[var115] = friendName37[var115 + 1];
							friendName37[var115 + 1] = var118;
							redrawSidebar = true;
							var114 = false;
						}
					}
				}

				packetType = -1;
				return true;
			}

			if (packetType == 110) {
				if (selectedTab == 12) {
					redrawSidebar = true;
				}

				energy = in.g1();
				packetType = -1;
				return true;
			}

			if (packetType == 254) {
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

				packetType = -1;
				return true;
			}

			if (packetType == 248) {
				int var120 = in.g2_alt2();
				int var121 = in.g2();

				if (chatInterfaceId != -1) {
					chatInterfaceId = -1;
					redrawChatback = true;
				}

				if (chatbackInputOpen != 0) {
					chatbackInputOpen = 0;
					redrawChatback = true;
				}

				viewportInterfaceId = var120;
				sidebarInterfaceId = var121;
				redrawSidebar = true;
				redrawSideicons = true;
				pressedContinueOption = false;
				packetType = -1;
				return true;
			}

			if (packetType == 79) {
				int var122 = in.g2_alt1();
				int var123 = in.g2_alt2();
				Component var124 = Component.instances[var122];
				if (var124 != null && var124.type == 0) {
					if (var123 < 0) {
						var123 = 0;
					}

					if (var123 > var124.scroll - var124.height) {
						var123 = var124.scroll - var124.height;
					}

					var124.scrollPosition = var123;
				}

				packetType = -1;
				return true;
			}

			if (packetType == 68) {
				for (int var125 = 0; var125 < varps.length; var125++) {
					if (varCache[var125] != varps[var125]) {
						varps[var125] = varCache[var125];
						updateVarp(var125);
						redrawSidebar = true;
					}
				}

				packetType = -1;
				return true;
			}

			if (packetType == 196) {
				long var126 = in.g8();
				int var128 = in.g4();
				int var129 = in.g1();
				boolean var130 = false;
				for (int var131 = 0; var131 < 100; var131++) {
					if (messageIds[var131] == var128) {
						var130 = true;
						break;
					}
				}

				if (var129 <= 1) {
					for (int var132 = 0; var132 < ignoreCount; var132++) {
						if (ignoreName37[var132] == var126) {
							var130 = true;
							break;
						}
					}
				}

				if (!var130 && overrideChat == 0) {
					try {
						messageIds[privateMessageCount] = var128;
						privateMessageCount = (privateMessageCount + 1) % 100;
						String var133 = WordPack.unpack(packetSize - 13, in);
						if (var129 != 3) {
							var133 = WordFilter.filter(var133);
						}

						if (var129 == 2 || var129 == 3) {
							addMessage(var133, 7, "@cr2@" + JString.toSentenceCase(JString.fromBase37(var126)));
						} else if (var129 == 1) {
							addMessage(var133, 7, "@cr1@" + JString.toSentenceCase(JString.fromBase37(var126)));
						} else {
							addMessage(var133, 3, JString.toSentenceCase(JString.fromBase37(var126)));
						}
					} catch (Exception var186) {
						signlink.reporterror("cde1");
					}
				}

				packetType = -1;
				return true;
			}

			if (packetType == 85) {
				baseZ = in.g1_alt2();
				baseX = in.g1_alt2();
				packetType = -1;
				return true;
			}

			if (packetType == 24) {
				flashingTab = in.g1_alt3();
				if (selectedTab == flashingTab) {
					if (flashingTab == 3) {
						selectedTab = 1;
					} else {
						selectedTab = 3;
					}

					redrawSidebar = true;
				}

				packetType = -1;
				return true;
			}

			if (packetType == 246) {
				int var135 = in.g2_alt1();
				int var136 = in.g2();
				int var137 = in.g2();
				if (var137 == 0xFFFF) {
					Component.instances[var135].modelType = 0;
					packetType = -1;
					return true;
				}

				ObjType var138 = ObjType.get(var137);
				Component.instances[var135].modelType = 4;
				Component.instances[var135].model = var137;
				Component.instances[var135].xan = var138.xan2d;
				Component.instances[var135].yan = var138.yan2d;
				Component.instances[var135].zoom = var138.zoom2d * 100 / var136;
				packetType = -1;
				return true;
			}

			if (packetType == 171) {
				boolean var139 = in.g1() == 1;
				int var140 = in.g2();
				Component.instances[var140].hide = var139;
				packetType = -1;
				return true;
			}

			if (packetType == 142) {
				int var141 = in.g2_alt1();
				resetInterfaceAnimation(var141);

				if (chatInterfaceId != -1) {
					chatInterfaceId = -1;
					redrawChatback = true;
				}

				if (chatbackInputOpen != 0) {
					chatbackInputOpen = 0;
					redrawChatback = true;
				}

				sidebarInterfaceId = var141;
				redrawSidebar = true;
				redrawSideicons = true;
				viewportInterfaceId = -1;
				pressedContinueOption = false;
				packetType = -1;
				return true;
			}

			if (packetType == 126) {
				String var142 = in.gjstr();
				int var143 = in.g2_alt2();
				Component.instances[var143].text = var142;

				if (tabInterfaceId[selectedTab] == Component.instances[var143].layer) {
					redrawSidebar = true;
				}

				packetType = -1;
				return true;
			}

			if (packetType == 206) {
				publicChatSetting = in.g1();
				privateChatSetting = in.g1();
				tradeChatSetting = in.g1();
				redrawPrivacySettings = true;
				redrawChatback = true;
				packetType = -1;
				return true;
			}

			if (packetType == 240) {
				if (selectedTab == 12) {
					redrawSidebar = true;
				}

				weightCarried = in.g2b();
				packetType = -1;
				return true;
			}

			if (packetType == 8) {
				int var144 = in.g2_alt3();
				int var145 = in.g2();
				Component.instances[var144].modelType = 1;
				Component.instances[var144].model = var145;
				packetType = -1;
				return true;
			}

			if (packetType == 122) {
				int var146 = in.g2_alt3();
				int var147 = in.g2_alt3();
				int var148 = var147 >> 10 & 0x1F;
				int var149 = var147 >> 5 & 0x1F;
				int var150 = var147 & 0x1F;
				Component.instances[var146].colour = (var150 << 3) + (var148 << 19) + (var149 << 11);
				packetType = -1;
				return true;
			}

			if (packetType == 53) {
				redrawSidebar = true;
				int var151 = in.g2();
				Component var152 = Component.instances[var151];
				int var153 = in.g2();
				for (int var154 = 0; var154 < var153; var154++) {
					int var155 = in.g1();
					if (var155 == 255) {
						var155 = in.g4_alt3();
					}

					var152.invSlotObjId[var154] = in.g2_alt3();
					var152.invSlotObjCount[var154] = var155;
				}

				for (int var156 = var153; var156 < var152.invSlotObjId.length; var156++) {
					var152.invSlotObjId[var156] = 0;
					var152.invSlotObjCount[var156] = 0;
				}

				packetType = -1;
				return true;
			}

			if (packetType == 230) {
				int var157 = in.g2_alt2();
				int var158 = in.g2();
				int var159 = in.g2();
				int var160 = in.g2_alt3();
				Component.instances[var158].xan = var159;
				Component.instances[var158].yan = var160;
				Component.instances[var158].zoom = var157;
				packetType = -1;
				return true;
			}

			if (packetType == 221) {
				friendListStatus = in.g1();
				redrawSidebar = true;
				packetType = -1;
				return true;
			}

			if (packetType == 177) {
				cutscene = true;
				cutsceneDstLocalTileX = in.g1();
				cutsceneDstLocalTileZ = in.g1();
				cutsceneDstHeight = in.g2();
				cutsceneRotateSpeed = in.g1();
				cutsceneRotateAcceleration = in.g1();
				if (cutsceneRotateAcceleration >= 100) {
					int var161 = cutsceneDstLocalTileX * 128 + 64;
					int var162 = cutsceneDstLocalTileZ * 128 + 64;
					int var163 = getHeightmapY(currentLevel, var162, var161) - cutsceneDstHeight;
					int var164 = var161 - cameraX;
					int var165 = var163 - cameraY;
					int var166 = var162 - cameraZ;
					int var167 = (int) Math.sqrt(var164 * var164 + var166 * var166);
					cameraPitch = (int) (Math.atan2(var165, var167) * 325.949D) & 0x7FF;
					cameraYaw = (int) (Math.atan2(var164, var166) * -325.949D) & 0x7FF;

					if (cameraPitch < 128) {
						cameraPitch = 128;
					}

					if (cameraPitch > 383) {
						cameraPitch = 383;
					}
				}

				packetType = -1;
				return true;
			}

			if (packetType == 249) {
				isMember = in.g1_alt1();
				localPid = in.g2_alt3();
				packetType = -1;
				return true;
			}

			if (packetType == 65) {
				readNpcInfo(in, packetSize);
				packetType = -1;
				return true;
			}

			if (packetType == 27) {
				showSocialInput = false;
				chatbackInputOpen = 1;
				chatbackInput = "";
				redrawChatback = true;
				packetType = -1;
				return true;
			}

			if (packetType == 187) {
				showSocialInput = false;
				chatbackInputOpen = 2;
				chatbackInput = "";
				redrawChatback = true;
				packetType = -1;
				return true;
			}

			if (packetType == 97) {
				int var168 = in.g2();
				resetInterfaceAnimation(var168);

				if (sidebarInterfaceId != -1) {
					sidebarInterfaceId = -1;
					redrawSidebar = true;
					redrawSideicons = true;
				}

				if (chatInterfaceId != -1) {
					chatInterfaceId = -1;
					redrawChatback = true;
				}

				if (chatbackInputOpen != 0) {
					chatbackInputOpen = 0;
					redrawChatback = true;
				}

				viewportInterfaceId = var168;
				pressedContinueOption = false;
				packetType = -1;
				return true;
			}

			if (packetType == 218) {
				int var169 = in.g2b_alt3();
				stickyChatInterfaceId = var169;
				redrawChatback = true;
				packetType = -1;
				return true;
			}

			if (packetType == 87) {
				int var170 = in.g2_alt1();
				int var171 = in.g4_alt2();
				varCache[var170] = var171;

				if (varps[var170] != var171) {
					varps[var170] = var171;
					updateVarp(var170);
					redrawSidebar = true;

					if (stickyChatInterfaceId != -1) {
						redrawChatback = true;
					}
				}

				packetType = -1;
				return true;
			}

			if (packetType == 36) {
				int var172 = in.g2_alt1();
				byte var173 = in.g1b();
				varCache[var172] = var173;

				if (varps[var172] != var173) {
					varps[var172] = var173;
					updateVarp(var172);
					redrawSidebar = true;

					if (stickyChatInterfaceId != -1) {
						redrawChatback = true;
					}
				}

				packetType = -1;
				return true;
			}

			if (packetType == 61) {
				inMultizone = in.g1();
				packetType = -1;
				return true;
			}

			if (packetType == 200) {
				int var174 = in.g2();
				int var175 = in.g2b();
				Component var176 = Component.instances[var174];
				var176.anim = var175;

				if (var175 == -1) {
					var176.animFrame = 0;
					var176.animCycle = 0;
				}

				packetType = -1;
				return true;
			}

			if (packetType == 219) {
				if (sidebarInterfaceId != -1) {
					sidebarInterfaceId = -1;
					redrawSidebar = true;
					redrawSideicons = true;
				}

				if (chatInterfaceId != -1) {
					chatInterfaceId = -1;
					redrawChatback = true;
				}

				if (chatbackInputOpen != 0) {
					chatbackInputOpen = 0;
					redrawChatback = true;
				}

				viewportInterfaceId = -1;
				pressedContinueOption = false;
				packetType = -1;
				return true;
			}

			if (packetType == 34) {
				redrawSidebar = true;
				int var177 = in.g2();
				Component var178 = Component.instances[var177];
				while (in.pos < packetSize) {
					int var179 = in.gsmarts();
					int var180 = in.g2();
					int var181 = in.g1();
					if (var181 == 255) {
						var181 = in.g4();
					}

					if (var179 >= 0 && var179 < var178.invSlotObjId.length) {
						var178.invSlotObjId[var179] = var180;
						var178.invSlotObjCount[var179] = var181;
					}
				}

				packetType = -1;
				return true;
			}

			if (packetType == 105 || packetType == 84 || packetType == 147 || packetType == 215 || packetType == 4 || packetType == 117 || packetType == 156 || packetType == 44 || packetType == 160 || packetType == 101 || packetType == 151) {
				readZonePacket(in, packetType);
				packetType = -1;
				return true;
			}

			if (packetType == 106) {
				selectedTab = in.g1_alt2();
				redrawSidebar = true;
				redrawSideicons = true;
				packetType = -1;
				return true;
			}

			if (packetType == 164) {
				int var182 = in.g2_alt1();
				resetInterfaceAnimation(var182);

				if (sidebarInterfaceId != -1) {
					sidebarInterfaceId = -1;
					redrawSidebar = true;
					redrawSideicons = true;
				}

				chatInterfaceId = var182;
				redrawChatback = true;
				viewportInterfaceId = -1;
				pressedContinueOption = false;
				packetType = -1;
				return true;
			}

			signlink.reporterror("T1 - " + packetType + "," + packetSize + " - " + lastPacketType1 + "," + lastPacketType2);
			logout();
		} catch (IOException var187) {
			tryReconnect();
		} catch (Exception var188) {
			String var184 = "T2 - " + packetType + "," + lastPacketType1 + "," + lastPacketType2 + " - " + packetSize + "," + (localPlayer.pathTileX[0] + sceneBaseTileX) + "," + (localPlayer.pathTileZ[0] + sceneBaseTileZ) + " - ";
			for (int var185 = 0; var185 < packetSize && var185 < 50; var185++) {
				var184 = var184 + in.data[var185] + ",";
			}

			signlink.reporterror(var184);
			logout();
		}

		return true;
	}

	@ObfuscatedName("client.n(B)V")
	public final void drawScene() {
		sceneCycle++;
		pushPlayers(true);
		pushNpcs(true);
		pushPlayers(false);
		pushNpcs(false);
		pushProjectiles();
		pushSpotanims();

		if (!cutscene) {
			int var1 = orbitCameraPitch;
			if (cameraPitchClamp / 256 > var1) {
				var1 = cameraPitchClamp / 256;
			}

			if (cameraModifierEnabled[4] && cameraModifierWobbleScale[4] + 128 > var1) {
				var1 = cameraModifierWobbleScale[4] + 128;
			}

			int var2 = orbitCameraYaw + cameraAnticheatAngle & 0x7FF;
			orbitCamera(var1 * 3 + 600, var1, orbitCameraX, getHeightmapY(currentLevel, localPlayer.z, localPlayer.x) - 50, var2, orbitCameraZ);
		}

		int var3;
		if (cutscene) {
			var3 = getTopLevelCutscene();
		} else {
			var3 = getTopLevel();
		}

		int var4 = cameraX;
		int var5 = cameraY;
		int var6 = cameraZ;
		int var7 = cameraPitch;
		int var8 = cameraYaw;

		for (int var9 = 0; var9 < 5; var9++) {
			if (cameraModifierEnabled[var9]) {
				int var10 = (int) (Math.random() * (cameraModifierJitter[var9] * 2 + 1) + Math.sin(cameraModifierWobbleSpeed[var9] / 100.0D * cameraModifierCycle[var9]) * cameraModifierWobbleScale[var9] - cameraModifierJitter[var9]);
				if (var9 == 0) {
					cameraX += var10;
				}

				if (var9 == 1) {
					cameraY += var10;
				}

				if (var9 == 2) {
					cameraZ += var10;
				}

				if (var9 == 3) {
					cameraYaw = cameraYaw + var10 & 0x7FF;
				}

				if (var9 == 4) {
					cameraPitch += var10;
					if (cameraPitch < 128) {
						cameraPitch = 128;
					}

					if (cameraPitch > 383) {
						cameraPitch = 383;
					}
				}
			}
		}

		int var11 = Pix3D.cycle;
		Model.checkHover = true;
		Model.pickedCount = 0;
		Model.mouseX = mouseX - 4;
		Model.mouseY = mouseY - 4;
		Pix2D.clear();
		scene.draw(cameraX, cameraZ, cameraYaw, cameraY, var3, cameraPitch);
		scene.clearTemporaryLocs();
		draw2DEntityElements();
		drawTileHint();
		updateTextures(var11);
		draw3DEntityElements();
		areaViewport.draw(4, graphics, 4);
		cameraX = var4;
		cameraY = var5;
		cameraZ = var6;
		cameraPitch = var7;
		cameraYaw = var8;
	}

	@ObfuscatedName("client.M(I)V")
	public final void closeInterfaces() {
		out.p1isaac(130);

		if (sidebarInterfaceId != -1) {
			sidebarInterfaceId = -1;
			redrawSidebar = true;
			pressedContinueOption = false;
			redrawSideicons = true;
		}

		if (chatInterfaceId != -1) {
			chatInterfaceId = -1;
			redrawChatback = true;
			pressedContinueOption = false;
		}

		viewportInterfaceId = -1;
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) (var2 + Math.pow(2.0D, var2 / 7.0D) * 300.0D);
			var0 += var3;
			levelExperience[var1] = var0 / 4;
		}

		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			BITMASK[var5] = var4 - 1;
			var4 += var4;
		}
	}
}

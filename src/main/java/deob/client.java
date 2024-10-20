package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import netscape.javascript.JSObject;

public final class client extends class122 {

    @ObfuscatedName("client.fz")
    public static boolean field1601 = false;

    @ObfuscatedName("client.fv")
    public static int field1569 = 50;

    @ObfuscatedName("client.fw")
    public static int field1567 = 0;

    @ObfuscatedName("client.fx")
    public static int[] field1563 = new int[field1569];

    @ObfuscatedName("client.gf")
    public static int field1579 = 0;

    @ObfuscatedName("client.fk")
    public static int[] field1576 = new int[field1569];

    @ObfuscatedName("client.fm")
    public static int[] field1643 = new int[field1569];

    @ObfuscatedName("client.fl")
    public static int[] field1680 = new int[field1569];

    @ObfuscatedName("client.fi")
    public static int[] field1571 = new int[field1569];

    @ObfuscatedName("client.fh")
    public static int field1479 = 0;

    @ObfuscatedName("client.fr")
    public static int[] field1574 = new int[field1569];

    @ObfuscatedName("client.fu")
    public static int field1600 = 0;

    @ObfuscatedName("client.ft")
    public static int field1564 = 0;

    @ObfuscatedName("client.fo")
    public static int field1598 = 0;

    @ObfuscatedName("client.fn")
    public static int field1565 = 0;

    @ObfuscatedName("client.fq")
    public static int[] field1575 = new int[field1569];

    @ObfuscatedName("client.fp")
    public static int field1561 = 128;

    @ObfuscatedName("client.gk")
    public static String[] field1577 = new String[field1569];

    @ObfuscatedName("client.gv")
    public static int[][] field1628 = new int[104][104];

    @ObfuscatedName("client.gt")
    public static int field1580 = -1;

    @ObfuscatedName("client.dv")
    public static int[][] field1538 = new int[104][104];

    @ObfuscatedName("client.dw")
    public static int field1547 = 1;

    @ObfuscatedName("client.dx")
    public static int field1545 = 2;

    @ObfuscatedName("client.dy")
    public static int field1546 = 0;

    @ObfuscatedName("client.dz")
    public static int field1544 = 0;

    @ObfuscatedName("client.ea")
    public static int field1554 = 0;

    @ObfuscatedName("client.de")
    public static int[][] field1539 = new int[104][104];

    @ObfuscatedName("client.dd")
    public static boolean field1615 = false;

    @ObfuscatedName("client.dg")
    public static int field1543 = 2;

    @ObfuscatedName("client.df")
    public static final int[] field1700 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dh")
    public static int[] field1732 = new int[4000];

    @ObfuscatedName("client.dk")
    public static int[][][] field1535 = new int[4][13][13];

    @ObfuscatedName("client.do")
    public static int field1723 = 0;

    @ObfuscatedName("client.dn")
    public static int[] field1540 = new int[4000];

    @ObfuscatedName("client.dp")
    public static int field1549 = 0;

    @ObfuscatedName("client.ds")
    public static int field1537 = 0;

    @ObfuscatedName("client.f")
    public static boolean field1478 = false;

    @ObfuscatedName("client.d")
    public static boolean field1681 = false;

    @ObfuscatedName("client.ev")
    public static int field1557 = 3353893;

    @ObfuscatedName("client.e")
    public static boolean field1477 = false;

    @ObfuscatedName("client.b")
    public static int field1486 = -1;

    @ObfuscatedName("client.a")
    public static int field1697 = 0;

    @ObfuscatedName("client.o")
    public static boolean field1678 = true;

    @ObfuscatedName("client.m")
    public static int field1483 = 0;

    @ObfuscatedName("client.fd")
    public static int field1558 = 7759444;

    @ObfuscatedName("client.k")
    public static int field1487 = -1;

    @ObfuscatedName("client.fb")
    public static boolean field1559 = false;

    @ObfuscatedName("client.fc")
    public static int field1568 = 0;

    @ObfuscatedName("client.i")
    public static int field1693 = 0;

    @ObfuscatedName("client.w")
    public static class8[] field1533 = new class8[4];

    @ObfuscatedName("client.v")
    public static long field1484 = 1L;

    @ObfuscatedName("client.u")
    public static int field1715 = -1;

    @ObfuscatedName("client.ee")
    public static int field1552 = 1;

    @ObfuscatedName("client.t")
    public static int field1687 = 1;

    @ObfuscatedName("client.s")
    public static boolean field1482 = true;

    @ObfuscatedName("client.r")
    public static int field1476 = 0;

    @ObfuscatedName("client.ej")
    public static int field1556 = 5063219;

    @ObfuscatedName("client.q")
    public static boolean field1560 = true;

    @ObfuscatedName("client.en")
    public static int field1555 = 2301979;

    @ObfuscatedName("client.em")
    public static int field1536 = 0;

    @ObfuscatedName("client.es")
    public static int field1730 = 0;

    @ObfuscatedName("client.z")
    public static int field1690 = 0;

    @ObfuscatedName("client.er")
    public static int field1550 = 2;

    @ObfuscatedName("client.ca")
    public static class134 field1515 = new class134(5000);

    @ObfuscatedName("client.bv")
    public static int field1512 = 0;

    @ObfuscatedName("client.bx")
    public static int field1507 = 0;

    @ObfuscatedName("client.bo")
    public static int field1665 = 0;

    @ObfuscatedName("client.bp")
    public static int field1508 = 0;

    @ObfuscatedName("client.bk")
    public static class58[] field1658 = new class58[32768];

    @ObfuscatedName("client.bm")
    public static int field1506 = 0;

    @ObfuscatedName("client.bc")
    public static int field1505 = 0;

    @ObfuscatedName("client.dc")
    public static int field1542 = 0;

    @ObfuscatedName("client.da")
    public static int field1548 = 0;

    @ObfuscatedName("client.cz")
    public static int field1498 = 0;

    @ObfuscatedName("client.cy")
    public static int field1521 = 0;

    @ObfuscatedName("client.cx")
    public static class134 field1517 = new class134(5000);

    @ObfuscatedName("client.cw")
    public static int field1525 = 0;

    @ObfuscatedName("client.ct")
    public static int field1528 = 0;

    @ObfuscatedName("client.cs")
    public static int field1522 = 0;

    @ObfuscatedName("client.cr")
    public static int field1616 = 0;

    @ObfuscatedName("client.co")
    public static int field1640 = 0;

    @ObfuscatedName("client.cm")
    public static int field1529 = 1;

    @ObfuscatedName("client.cn")
    public static boolean field1526 = false;

    @ObfuscatedName("client.ck")
    public static int field1518 = 0;

    @ObfuscatedName("client.cl")
    public static int field1531 = 1;

    @ObfuscatedName("client.ci")
    public static int field1527 = 0;

    @ObfuscatedName("client.ch")
    public static int field1524 = 0;

    @ObfuscatedName("client.ce")
    public static class134 field1497 = new class134(5000);

    @ObfuscatedName("client.cf")
    public static int field1519 = 0;

    @ObfuscatedName("client.ba")
    public static int[] field1520 = new int[32768];

    @ObfuscatedName("client.at")
    public static int field1573 = 0;

    @ObfuscatedName("client.aq")
    public static int field1704 = 0;

    @ObfuscatedName("client.ax")
    public static int field1647 = 0;

    @ObfuscatedName("client.au")
    public static int field1493 = 0;

    @ObfuscatedName("client.ai")
    public static class31 field1499 = new class31(new byte[5000]);

    @ObfuscatedName("client.ap")
    public static int field1501 = 0;

    @ObfuscatedName("client.ac")
    public static int field1502 = 0;

    @ObfuscatedName("client.ad")
    public static int field1607 = 0;

    @ObfuscatedName("client.aa")
    public static int field1491 = 0;

    @ObfuscatedName("client.ab")
    public static int field1490 = 0;

    @ObfuscatedName("client.ag")
    public static int field1495 = 0;

    @ObfuscatedName("client.ah")
    public static int field1496 = 0;

    @ObfuscatedName("client.gi")
    public static int field1581 = -1;

    @ObfuscatedName("client.gl")
    public static int field1582 = 0;

    @ObfuscatedName("client.gh")
    public static int field1583 = 0;

    @ObfuscatedName("client.gs")
    public static int field1584 = 0;

    @ObfuscatedName("client.gj")
    public static int field1585 = 0;

    @ObfuscatedName("client.gc")
    public static int field1503 = 0;

    @ObfuscatedName("client.gq")
    public static int field1513 = 0;

    @ObfuscatedName("client.gy")
    public static int field1588 = 0;

    @ObfuscatedName("client.gg")
    public static int field1712 = 0;

    @ObfuscatedName("client.gb")
    public static int field1728 = 0;

    @ObfuscatedName("client.gw")
    public static int field1591 = 0;

    @ObfuscatedName("client.gn")
    public static boolean field1638 = false;

    @ObfuscatedName("client.ge")
    public static int field1641 = 0;

    @ObfuscatedName("client.gm")
    public static int field1594 = 0;

    @ObfuscatedName("client.gu")
    public static class68[] field1595 = new class68[2048];

    @ObfuscatedName("client.ga")
    public static int field1562 = 0;

    @ObfuscatedName("client.go")
    public static int[] field1605 = new int[2048];

    @ObfuscatedName("client.hq")
    public static int field1514 = 0;

    @ObfuscatedName("client.hi")
    public static int[] field1599 = new int[2048];

    @ObfuscatedName("client.hu")
    public static class31[] field1642 = new class31[2048];

    @ObfuscatedName("client.ha")
    public static int field1541 = -1;

    @ObfuscatedName("client.hh")
    public static int field1613 = 0;

    @ObfuscatedName("client.hs")
    public static int field1603 = 0;

    @ObfuscatedName("client.he")
    public static int[] field1473 = new int[1000];

    @ObfuscatedName("client.hb")
    public static final int[] field1717 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ho")
    public static String[] field1494 = new String[8];

    @ObfuscatedName("client.hd")
    public static boolean[] field1572 = new boolean[8];

    @ObfuscatedName("client.hp")
    public static int[] field1608 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hj")
    public static class13[][][] field1609 = new class13[4][104][104];

    @ObfuscatedName("client.hy")
    public static class13 field1610 = new class13();

    @ObfuscatedName("client.hv")
    public static class13 field1611 = new class13();

    @ObfuscatedName("client.ht")
    public static class13 field1597 = new class13();

    @ObfuscatedName("client.hn")
    public static int[] field1551 = new int[25];

    @ObfuscatedName("client.hk")
    public static int[] field1614 = new int[25];

    @ObfuscatedName("client.hr")
    public static int[] field1602 = new int[25];

    @ObfuscatedName("client.hx")
    public static int field1485 = 0;

    @ObfuscatedName("client.hg")
    public static boolean field1633 = false;

    @ObfuscatedName("client.iv")
    public static int field1618 = 0;

    @ObfuscatedName("client.ij")
    public static int[] field1619 = new int[500];

    @ObfuscatedName("client.iw")
    public static int[] field1620 = new int[500];

    @ObfuscatedName("client.is")
    public static int[] field1621 = new int[500];

    @ObfuscatedName("client.ia")
    public static int[] field1488 = new int[500];

    @ObfuscatedName("client.id")
    public static String[] field1623 = new String[500];

    @ObfuscatedName("client.iu")
    public static String[] field1624 = new String[500];

    @ObfuscatedName("client.ir")
    public static int field1625 = -1;

    @ObfuscatedName("client.ib")
    public static int field1626 = -1;

    @ObfuscatedName("client.ii")
    public static int field1627 = 0;

    @ObfuscatedName("client.im")
    public static int field1659 = 50;

    @ObfuscatedName("client.ik")
    public static int field1629 = 0;

    @ObfuscatedName("client.it")
    public static String field1630 = null;

    @ObfuscatedName("client.iy")
    public static boolean field1631 = false;

    @ObfuscatedName("client.ic")
    public static int field1590 = -1;

    @ObfuscatedName("client.ip")
    public static String field1606 = null;

    @ObfuscatedName("client.in")
    public static String field1634 = null;

    @ObfuscatedName("client.jh")
    public static int field1635 = -1;

    @ObfuscatedName("client.jc")
    public static class2 field1636 = new class2(8);

    @ObfuscatedName("client.jf")
    public static int field1637 = 0;

    @ObfuscatedName("client.je")
    public static int field1672 = 0;

    @ObfuscatedName("client.ju")
    public static class75 field1639 = null;

    @ObfuscatedName("client.jz")
    public static int field1707 = 0;

    @ObfuscatedName("client.jx")
    public static int field1511 = 0;

    @ObfuscatedName("client.jb")
    public static int field1534 = 0;

    @ObfuscatedName("client.jd")
    public static boolean field1592 = false;

    @ObfuscatedName("client.ji")
    public static boolean field1644 = false;

    @ObfuscatedName("client.jq")
    public static boolean field1645 = false;

    @ObfuscatedName("client.jr")
    public static class75 field1646 = null;

    @ObfuscatedName("client.js")
    public static class75 field1481 = null;

    @ObfuscatedName("client.jp")
    public static int field1648 = 0;

    @ObfuscatedName("client.jv")
    public static int field1649 = 0;

    @ObfuscatedName("client.jw")
    public static class75 field1650 = null;

    @ObfuscatedName("client.jt")
    public static boolean field1651 = false;

    @ObfuscatedName("client.jm")
    public static int field1652 = -1;

    @ObfuscatedName("client.jy")
    public static int field1653 = -1;

    @ObfuscatedName("client.jo")
    public static boolean field1654 = false;

    @ObfuscatedName("client.jk")
    public static int field1655 = -1;

    @ObfuscatedName("client.jn")
    public static int field1656 = -1;

    @ObfuscatedName("client.jg")
    public static boolean field1657 = false;

    @ObfuscatedName("client.ki")
    public static int field1578 = 1;

    @ObfuscatedName("client.ku")
    public static int[] field1735 = new int[32];

    @ObfuscatedName("client.kf")
    public static int field1660 = 0;

    @ObfuscatedName("client.ko")
    public static int[] field1674 = new int[32];

    @ObfuscatedName("client.km")
    public static int field1662 = 0;

    @ObfuscatedName("client.kb")
    public static int[] field1663 = new int[32];

    @ObfuscatedName("client.kh")
    public static int field1664 = 0;

    @ObfuscatedName("client.kj")
    public static int field1617 = 0;

    @ObfuscatedName("client.ky")
    public static int field1666 = 0;

    @ObfuscatedName("client.ke")
    public static int field1667 = 0;

    @ObfuscatedName("client.kn")
    public static int field1475 = 0;

    @ObfuscatedName("client.kv")
    public static int[] field1669 = new int[2000];

    @ObfuscatedName("client.kx")
    public static String[] field1670 = new String[1000];

    @ObfuscatedName("client.kk")
    public static int field1671 = 0;

    @ObfuscatedName("client.kz")
    public static class13 field1500 = new class13();

    @ObfuscatedName("client.ka")
    public static class13 field1673 = new class13();

    @ObfuscatedName("client.kw")
    public static class13 field1679 = new class13();

    @ObfuscatedName("client.kt")
    public static class2 field1675 = new class2(512);

    @ObfuscatedName("client.kq")
    public static int field1523 = 0;

    @ObfuscatedName("client.kp")
    public static int field1677 = -2;

    @ObfuscatedName("client.kl")
    public static boolean[] field1668 = new boolean[100];

    @ObfuscatedName("client.lm")
    public static boolean[] field1705 = new boolean[100];

    @ObfuscatedName("client.lv")
    public static boolean[] field1587 = new boolean[100];

    @ObfuscatedName("client.lb")
    public static int[] field1721 = new int[100];

    @ObfuscatedName("client.lr")
    public static int[] field1682 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field1683 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field1684 = new int[100];

    @ObfuscatedName("client.le")
    public static int field1685 = 0;

    @ObfuscatedName("client.lh")
    public static int[] field1686 = new int[100];

    @ObfuscatedName("client.lw")
    public static String[] field1710 = new String[100];

    @ObfuscatedName("client.lj")
    public static String[] field1688 = new String[100];

    @ObfuscatedName("client.lq")
    public static String[] field1689 = new String[100];

    @ObfuscatedName("client.lt")
    public static int field1516 = 0;

    @ObfuscatedName("client.lp")
    public static int[] field1570 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lx")
    public static int field1692 = 0;

    @ObfuscatedName("client.lu")
    public static int field1566 = 0;

    @ObfuscatedName("client.li")
    public static long[] field1694 = new long[100];

    @ObfuscatedName("client.ll")
    public static int field1695 = 0;

    @ObfuscatedName("client.lz")
    public static int field1696 = 0;

    @ObfuscatedName("client.lc")
    public static int[] field1622 = new int[128];

    @ObfuscatedName("client.ln")
    public static int[] field1676 = new int[128];

    @ObfuscatedName("client.ls")
    public static long field1699 = -1L;

    @ObfuscatedName("client.lk")
    public static String field1589 = null;

    @ObfuscatedName("client.mq")
    public static String field1701 = null;

    @ObfuscatedName("client.mt")
    public static int field1702 = -1;

    @ObfuscatedName("client.mm")
    public static int field1703 = 0;

    @ObfuscatedName("client.ma")
    public static int[] field1472 = new int[1000];

    @ObfuscatedName("client.mv")
    public static int[] field1593 = new int[1000];

    @ObfuscatedName("client.mn")
    public static class143[] field1706 = new class143[1000];

    @ObfuscatedName("client.me")
    public static int field1509 = 0;

    @ObfuscatedName("client.mr")
    public static int field1708 = 0;

    @ObfuscatedName("client.mx")
    public static int field1709 = 0;

    @ObfuscatedName("client.mw")
    public static int field1530 = 255;

    @ObfuscatedName("client.mi")
    public static int field1711 = -1;

    @ObfuscatedName("client.mh")
    public static boolean field1489 = false;

    @ObfuscatedName("client.mz")
    public static int field1713 = 127;

    @ObfuscatedName("client.md")
    public static int field1714 = 127;

    @ObfuscatedName("client.ns")
    public static int field1719 = 0;

    @ObfuscatedName("client.nf")
    public static int[] field1612 = new int[50];

    @ObfuscatedName("client.nu")
    public static int[] field1492 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field1718 = new int[50];

    @ObfuscatedName("client.nw")
    public static int[] field1691 = new int[50];

    @ObfuscatedName("client.nn")
    public static class125[] field1720 = new class125[50];

    @ObfuscatedName("client.nv")
    public static boolean field1698 = false;

    @ObfuscatedName("client.nr")
    public static boolean[] field1586 = new boolean[5];

    @ObfuscatedName("client.ni")
    public static int[] field1716 = new int[5];

    @ObfuscatedName("client.nc")
    public static int[] field1724 = new int[5];

    @ObfuscatedName("client.nb")
    public static int[] field1725 = new int[5];

    @ObfuscatedName("client.oj")
    public static int[] field1604 = new int[5];

    @ObfuscatedName("client.ok")
    public static int field1727 = 0;

    @ObfuscatedName("client.om")
    public static int field1726 = 0;

    @ObfuscatedName("client.op")
    public static class74[] field1729 = new class74[400];

    @ObfuscatedName("client.og")
    public static class3 field1661 = new class3();

    @ObfuscatedName("client.oq")
    public static int field1731 = 0;

    @ObfuscatedName("client.of")
    public static class105[] field1474 = new class105[400];

    @ObfuscatedName("client.ov")
    public static class73 field1733 = new class73();

    @ObfuscatedName("client.oo")
    public static int field1734 = -1;

    @ObfuscatedName("client.oe")
    public static int field1632 = -1;

    @ObfuscatedName("client.r(B)V")
    public final void method1555() {
        Statics.field927 = field1476 == 0 ? 43594 : field1687 + 40000;
        Statics.field601 = field1476 == 0 ? 443 : field1687 + 50000;
        Statics.field1510 = Statics.field927;
        Statics.field235 = class15.field79;
        Statics.field696 = class15.field76;
        Statics.field2864 = class15.field77;
        Statics.field693 = class15.field78;
        class162.method3403();
        Canvas var1 = Statics.field2359;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class162.field2423);
        var1.addFocusListener(class162.field2423);
        Canvas var2 = Statics.field2359;
        var2.addMouseListener(class108.field1751);
        var2.addMouseMotionListener(class108.field1751);
        var2.addFocusListener(class108.field1751);
        class109 var3;
        try {
            var3 = new class109();
        } catch (Throwable var5) {
            var3 = null;
        }
        Statics.field2417 = var3;
        if (Statics.field2417 != null) {
            Statics.field2417.method1886(Statics.field2359);
        }
        Statics.field1885 = new class121(255, class150.field2257, class150.field2258, 500000);
        Statics.field1855 = class101.method3102();
        if (field1476 != 0) {
            field1681 = true;
        }
    }

    @ObfuscatedName("client.n(B)V")
    public final void method1556() {
        field1483++;
        this.method1559();
        class71.method1884();
        class79.method3168();
        method3467();
        class162.method3490();
        class108 var1 = class108.field1751;
        synchronized (class108.field1751) {
            class108.field1750 = class108.field1739;
            class108.field1742 = class108.field1744;
            class108.field1743 = class108.field1740;
            class108.field1748 = class108.field1741;
            class108.field1737 = class108.field1745;
            class108.field1749 = class108.field1746;
            class108.field1755 = class108.field1747;
            class108.field1741 = 0;
        }
        if (Statics.field2417 != null) {
            int var3 = Statics.field2417.method1888();
            field1671 = var3;
        }
        if (field1693 == 0) {
            method3267();
            class122.method757();
        } else if (field1693 == 5) {
            class103.method1164(this);
            method3267();
            class122.method757();
        } else if (field1693 == 10) {
            class103.method1164(this);
        } else if (field1693 == 20) {
            class103.method1164(this);
            method2723();
        } else if (field1693 == 25) {
            method3396();
        }
        if (field1693 == 30) {
            Statics.method720();
        } else if (field1693 == 40) {
            method2723();
        }
    }

    @ObfuscatedName("client.g(I)V")
    public final void method1557() {
        boolean var1 = class79.method728();
        if (var1 && field1489 && Statics.field223 != null) {
            Statics.field223.method3543();
        }
        if (field1870) {
            class162.method3233(Statics.field2359);
            class108.method3491(Statics.field2359);
            if (Statics.field2417 != null) {
                Statics.field2417.method1885(Statics.field2359);
            }
            this.method2037();
            Canvas var2 = Statics.field2359;
            var2.setFocusTraversalKeysEnabled(false);
            var2.addKeyListener(class162.field2423);
            var2.addFocusListener(class162.field2423);
            Canvas var3 = Statics.field2359;
            var3.addMouseListener(class108.field1751);
            var3.addMouseMotionListener(class108.field1751);
            var3.addFocusListener(class108.field1751);
            if (Statics.field2417 != null) {
                Statics.field2417.method1886(Statics.field2359);
            }
        }
        if (field1693 == 0) {
            class122.method632(class103.field1414, class103.field1415, (Color) null);
        } else if (field1693 == 5) {
            class103.method794(Statics.field561, Statics.field2355);
        } else if (field1693 == 10) {
            class103.method794(Statics.field561, Statics.field2355);
        } else if (field1693 == 20) {
            class103.method794(Statics.field561, Statics.field2355);
        } else if (field1693 == 25) {
            if (field1723 == 1) {
                if (field1528 > field1529) {
                    field1529 = field1528;
                }
                int var4 = (field1529 * 50 - field1528 * 50) / field1529;
                method1447(class98.field1172 + class94.field1092 + class94.field1087 + var4 + "%" + class94.field1090, false);
            } else if (field1723 == 2) {
                if (field1498 > field1531) {
                    field1531 = field1498;
                }
                int var5 = (field1531 * 50 - field1498 * 50) / field1531 + 50;
                method1447(class98.field1172 + class94.field1092 + class94.field1087 + var5 + "%" + class94.field1090, false);
            } else {
                method1447(class98.field1172, false);
            }
        } else if (field1693 == 30) {
            if (!field1633) {
                field1623[0] = class98.field1349;
                field1624[0] = "";
                field1621[0] = 1006;
                field1618 = 1;
            }
            if (field1635 != -1) {
                method1074(field1635);
            }
            for (int var6 = 0; var6 < field1523; var6++) {
                if (field1668[var6]) {
                    field1705[var6] = true;
                }
                field1587[var6] = field1668[var6];
                field1668[var6] = false;
            }
            field1677 = field1483;
            field1625 = -1;
            field1626 = -1;
            Statics.field936 = null;
            if (field1635 != -1) {
                field1523 = 0;
                method3453(field1635, 0, 0, 765, 503, 0, 0, -1);
            }
            class139.method2300();
            Statics.method3373();
            if (field1633) {
                int var12 = Statics.field906;
                int var13 = Statics.field1902;
                int var14 = Statics.field2742;
                int var15 = Statics.field141;
                int var16 = 6116423;
                class139.method2353(var12, var13, var14, var15, var16);
                class139.method2353(var12 + 1, var13 + 1, var14 - 2, 16, 0);
                class139.method2309(var12 + 1, var13 + 18, var14 - 2, var15 - 19, 0);
                Statics.field561.method62(class98.field1258, var12 + 3, var13 + 14, var16, -1);
                int var17 = class108.field1742;
                int var18 = class108.field1743;
                for (int var19 = 0; var19 < field1618; var19++) {
                    int var20 = (field1618 - 1 - var19) * 15 + var13 + 31;
                    int var21 = 16777215;
                    if (var17 > var12 && var17 < var12 + var14 && var18 > var20 - 13 && var18 < var20 + 3) {
                        var21 = 16776960;
                    }
                    class23 var22 = Statics.field561;
                    String var23;
                    if (field1624[var19].length() > 0) {
                        var23 = field1623[var19] + class98.field1286 + field1624[var19];
                    } else {
                        var23 = field1623[var19];
                    }
                    var22.method62(var23, var12 + 3, var20, var21, 0);
                }
                method2727(Statics.field906, Statics.field1902, Statics.field2742, Statics.field141);
            } else if (field1625 != -1) {
                int var7 = field1625;
                int var8 = field1626;
                if (field1618 >= 2 || field1629 != 0 || field1631) {
                    String var9;
                    if (field1629 == 1 && field1618 < 2) {
                        var9 = class98.field1267 + class98.field1286 + field1630 + " " + class94.field1091;
                    } else if (field1631 && field1618 < 2) {
                        var9 = field1606 + class98.field1286 + field1634 + " " + class94.field1091;
                    } else {
                        int var10 = field1618 - 1;
                        String var11;
                        if (field1624[var10].length() > 0) {
                            var11 = field1623[var10] + class98.field1286 + field1624[var10];
                        } else {
                            var11 = field1623[var10];
                        }
                        var9 = var11;
                    }
                    if (field1618 > 2) {
                        var9 = var9 + class94.method2110(16777215) + " " + '/' + " " + (field1618 - 2) + class98.field1142;
                    }
                    Statics.field561.method122(var9, var7 + 4, var8 + 15, 16777215, 0, field1483 / 1000);
                }
            }
            if (field1685 == 3) {
                for (int var24 = 0; var24 < field1523; var24++) {
                    if (field1587[var24]) {
                        class139.method2306(field1721[var24], field1682[var24], field1683[var24], field1684[var24], 16711935, 128);
                    } else if (field1705[var24]) {
                        class139.method2306(field1721[var24], field1682[var24], field1683[var24], field1684[var24], 16711680, 128);
                    }
                }
            }
            int var25 = Statics.field1863;
            int var26 = Statics.field387.field2735;
            int var27 = Statics.field387.field2683;
            int var28 = field1554;
            for (class66 var29 = (class66) class66.field621.method253(); var29 != null; var29 = (class66) class66.field621.method255()) {
                if (var29.field612 != -1 || var29.field605 != null) {
                    int var30 = 0;
                    if (var26 > var29.field609) {
                        var30 += var26 - var29.field609;
                    } else if (var26 < var29.field616) {
                        var30 += var29.field616 - var26;
                    }
                    if (var27 > var29.field610) {
                        var30 += var27 - var29.field610;
                    } else if (var27 < var29.field607) {
                        var30 += var29.field607 - var27;
                    }
                    if (var30 - 64 > var29.field611 || field1714 == 0 || var29.field606 != var25) {
                        if (var29.field613 != null) {
                            Statics.field1908.method3238(var29.field613);
                            var29.field613 = null;
                        }
                        if (var29.field608 != null) {
                            Statics.field1908.method3238(var29.field608);
                            var29.field608 = null;
                        }
                    } else {
                        var30 -= 64;
                        if (var30 < 0) {
                            var30 = 0;
                        }
                        int var31 = field1714 * (var29.field611 - var30) / var29.field611;
                        class125 var10000;
                        if (var29.field613 != null) {
                            var29.field613.method2918(var31);
                        } else if (var29.field612 >= 0) {
                            var10000 = (class125) null;
                            class125 var32 = class125.method2123(Statics.field237, var29.field612, 0);
                            if (var32 != null) {
                                class112 var33 = var32.method2112().method1932(Statics.field2743);
                                class160 var34 = class160.method2987(var33, 100, var31);
                                var34.method2901(-1);
                                Statics.field1908.method3240(var34);
                                var29.field613 = var34;
                            }
                        }
                        if (var29.field608 != null) {
                            var29.field608.method2918(var31);
                            if (!var29.field608.method47()) {
                                var29.field608 = null;
                            }
                        } else if (var29.field605 != null && (var29.field617 -= var28) <= 0) {
                            int var35 = (int) (Math.random() * (double) var29.field605.length);
                            var10000 = (class125) null;
                            class125 var36 = class125.method2123(Statics.field237, var29.field605[var35], 0);
                            if (var36 != null) {
                                class112 var37 = var36.method2112().method1932(Statics.field2743);
                                class160 var38 = class160.method2987(var37, 100, var31);
                                var38.method2901(0);
                                Statics.field1908.method3240(var38);
                                var29.field608 = var38;
                                var29.field617 = var29.field614 + (int) (Math.random() * (double) (var29.field615 - var29.field614));
                            }
                        }
                    }
                }
            }
            field1554 = 0;
        } else if (field1693 == 40) {
            method1447(class98.field1143 + class94.field1092 + class98.field1144, false);
        }
        if (field1693 == 30 && field1685 == 0 && !field1868) {
            try {
                Graphics var39 = Statics.field2359.getGraphics();
                for (int var40 = 0; var40 < field1523; var40++) {
                    if (field1705[var40]) {
                        Statics.field879.method2284(var39, field1721[var40], field1682[var40], field1683[var40], field1684[var40]);
                        field1705[var40] = false;
                    }
                }
            } catch (Exception var46) {
                Statics.field2359.repaint();
            }
        } else if (field1693 > 0) {
            try {
                Graphics var42 = Statics.field2359.getGraphics();
                Statics.field879.method2293(var42, 0, 0);
                field1868 = false;
                for (int var43 = 0; var43 < field1523; var43++) {
                    field1705[var43] = false;
                }
            } catch (Exception var45) {
                Statics.field2359.repaint();
            }
        }
    }

    @ObfuscatedName("client.e(I)V")
    public final void method1558() {
        if (Statics.field676 != null) {
            Statics.field676.field1042 = false;
        }
        Statics.field676 = null;
        if (Statics.field2646 != null) {
            Statics.field2646.method1979();
            Statics.field2646 = null;
        }
        class162.method3431();
        Statics.method3539();
        Statics.field2417 = null;
        if (Statics.field223 != null) {
            Statics.field223.method3544();
        }
        if (Statics.field926 != null) {
            Statics.field926.method3544();
        }
        class53.method3169();
        Object var1 = class71.field673;
        synchronized (class71.field673) {
            if (class71.field672 != 0) {
                class71.field672 = 1;
                try {
                    class71.field673.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        try {
            class150.field2257.method3213();
            for (int var4 = 0; var4 < Statics.field2253; var4++) {
                Statics.field1461[var4].method3213();
            }
            class150.field2258.method3213();
            class150.field2249.method3213();
        } catch (Exception var7) {
        }
    }

    @ObfuscatedName("client.x(B)V")
    public void method1559() {
        if (field1693 != 1000) {
            boolean var1 = class53.method2094();
            if (!var1) {
                this.method1612();
            }
        }
    }

    @ObfuscatedName("client.l(IS)V")
    public void method1561(int arg0) {
        Statics.field1051 = null;
        Statics.field985 = null;
        field1501 = 0;
        if (Statics.field927 == Statics.field1510) {
            Statics.field1510 = Statics.field601;
        } else {
            Statics.field1510 = Statics.field927;
        }
        field1505++;
        if (field1505 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field1693 <= 5) {
                this.method2032("js5connect_full");
                field1693 = 1000;
            } else {
                field1502 = 3000;
            }
        } else if (field1505 >= 2 && arg0 == 6) {
            this.method2032("js5connect_outofdate");
            field1693 = 1000;
        } else if (field1505 >= 4) {
            if (field1693 <= 5) {
                this.method2032("js5connect");
                field1693 = 1000;
            } else {
                field1502 = 3000;
            }
        }
    }

    public final void init() {
        if (!this.method2024()) {
            return;
        }
        class14[] var1 = new class14[] { class14.field67, class14.field71, class14.field66, class14.field73, class14.field68, class14.field72, class14.field70, class14.field65, class14.field69 };
        class14[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class14 var4 = var2[var3];
            String var5 = this.getParameter(var4.field74);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field74)) {
                    case 2:
                        Statics.field1480 = var5;
                        break;
                    case 3:
                        field1690 = Integer.parseInt(var5);
                        break;
                    case 4:
                        field1476 = Integer.parseInt(var5);
                        break;
                    case 5:
                        field1687 = Integer.parseInt(var5);
                        break;
                    case 6:
                        class85[] var6 = new class85[] { class85.field988, class85.field993, class85.field986, class85.field992, class85.field989, class85.field990 };
                        Statics.field2657 = (class85) class38.method928(var6, Integer.parseInt(var5));
                        if (Statics.field2657 == class85.field990) {
                            Statics.field1104 = class25.field119;
                        } else {
                            Statics.field1104 = class25.field125;
                        }
                        break;
                    case 7:
                        Statics.field1907 = class100.method936(Integer.parseInt(var5));
                        break;
                    case 8:
                        if (var5.equalsIgnoreCase(class94.field1100)) {
                        }
                        break;
                    case 9:
                        if (var5.equalsIgnoreCase(class94.field1100)) {
                            field1477 = true;
                        } else {
                            field1477 = false;
                        }
                }
            }
        }
        method761();
        Statics.field904 = this.getCodeBase().getHost();
        String var7 = Statics.field1907.field1375;
        byte var8 = 0;
        try {
            Statics.field2253 = 16;
            Statics.field2678 = var8;
            try {
                Statics.field2259 = System.getProperty("os.name");
            } catch (Exception var29) {
                Statics.field2259 = "Unknown";
            }
            Statics.field483 = Statics.field2259.toLowerCase();
            try {
                Statics.field234 = System.getProperty("user.home");
                if (Statics.field234 != null) {
                    Statics.field234 = Statics.field234 + "/";
                }
            } catch (Exception var28) {
            }
            try {
                if (Statics.field483.startsWith("win")) {
                    if (Statics.field234 == null) {
                        Statics.field234 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field234 == null) {
                    Statics.field234 = System.getenv("HOME");
                }
                if (Statics.field234 != null) {
                    Statics.field234 = Statics.field234 + "/";
                }
            } catch (Exception var27) {
            }
            if (Statics.field234 == null) {
                Statics.field234 = "~/";
            }
            Statics.field2553 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field234, "/tmp/", "" };
            Statics.field1067 = new String[] { ".jagex_cache_" + Statics.field2678, ".file_store_" + Statics.field2678 };
            label154: for (int var12 = 0; var12 < 4; var12++) {
                Statics.field2254 = class150.method3075("oldschool", var7, var12);
                if (!Statics.field2254.exists()) {
                    Statics.field2254.mkdirs();
                }
                File[] var13 = Statics.field2254.listFiles();
                if (var13 == null) {
                    break;
                }
                File[] var14 = var13;
                int var15 = 0;
                while (true) {
                    if (var15 >= var14.length) {
                        break label154;
                    }
                    File var16 = var14[var15];
                    if (!class150.method1054(var16, false)) {
                        break;
                    }
                    var15++;
                }
            }
            File var17 = Statics.field2254;
            Statics.field584 = var17;
            if (!Statics.field584.exists()) {
                throw new RuntimeException("");
            }
            class128.field1949 = true;
            try {
                File var18 = new File(Statics.field234, "random.dat");
                if (var18.exists()) {
                    class150.field2249 = new class167(new class170(var18, "rw", 25L), 24, 0);
                } else {
                    label132: for (int var19 = 0; var19 < Statics.field1067.length; var19++) {
                        for (int var20 = 0; var20 < Statics.field2553.length; var20++) {
                            File var21 = new File(Statics.field2553[var20] + Statics.field1067[var19] + File.separatorChar + "random.dat");
                            if (var21.exists()) {
                                class150.field2249 = new class167(new class170(var21, "rw", 25L), 24, 0);
                                break label132;
                            }
                        }
                    }
                }
                if (class150.field2249 == null) {
                    RandomAccessFile var22 = new RandomAccessFile(var18, "rw");
                    int var23 = var22.read();
                    var22.seek(0L);
                    var22.write(var23);
                    var22.seek(0L);
                    var22.close();
                    class150.field2249 = new class167(new class170(var18, "rw", 25L), 24, 0);
                }
            } catch (IOException var30) {
            }
            class150.field2257 = new class167(new class170(class128.method3281("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class150.field2258 = new class167(new class170(class128.method3281("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1461 = new class167[Statics.field2253];
            for (int var25 = 0; var25 < Statics.field2253; var25++) {
                Statics.field1461[var25] = new class167(new class170(class128.method3281("main_file_cache.idx" + var25), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var31) {
            class156.method2297((String) null, var31);
        }
        Statics.field1596 = this;
        this.method2023(765, 503, 30);
    }

    @ObfuscatedName("client.z(I)V")
    public void method1612() {
        if (class53.field431 >= 4) {
            this.method2032("js5crc");
            field1693 = 1000;
            return;
        }
        if (class53.field445 >= 4) {
            if (field1693 <= 5) {
                this.method2032("js5io");
                field1693 = 1000;
                return;
            }
            field1502 = 3000;
            class53.field445 = 3;
        }
        if (--field1502 + 1 > 0) {
            return;
        }
        try {
            if (field1501 == 0) {
                Statics.field1051 = Statics.field2009.method1904(Statics.field904, Statics.field1510);
                field1501++;
            }
            if (field1501 == 1) {
                if (Statics.field1051.field1467 == 2) {
                    this.method1561(-1);
                    return;
                }
                if (Statics.field1051.field1467 == 1) {
                    field1501++;
                }
            }
            if (field1501 == 2) {
                Statics.field985 = new class116((Socket) Statics.field1051.field1471, Statics.field2009);
                class31 var1 = new class31(5);
                var1.method357(15);
                var1.method360(30);
                Statics.field985.method1964(var1.field168, 0, 5);
                field1501++;
                Statics.field1096 = Statics.method1882();
            }
            if (field1501 == 3) {
                if (field1693 <= 5 || Statics.field985.method1968() > 0) {
                    int var2 = Statics.field985.method1978();
                    if (var2 != 0) {
                        this.method1561(var2);
                        return;
                    }
                    field1501++;
                } else if (Statics.method1882() - Statics.field1096 > 30000L) {
                    this.method1561(-2);
                    return;
                }
            }
            if (field1501 == 4) {
                class116 var3 = Statics.field985;
                boolean var4 = field1693 > 20;
                if (Statics.field439 != null) {
                    try {
                        Statics.field439.method1979();
                    } catch (Exception var14) {
                    }
                    Statics.field439 = null;
                }
                Statics.field439 = var3;
                class53.method1343(var4);
                class53.field428.field172 = 0;
                Statics.field968 = null;
                Statics.field716 = null;
                class53.field440 = 0;
                while (true) {
                    class91 var6 = (class91) class53.field436.method25();
                    if (var6 == null) {
                        while (true) {
                            class91 var7 = (class91) class53.field430.method25();
                            if (var7 == null) {
                                if (class53.field443 != 0) {
                                    try {
                                        class31 var8 = new class31(4);
                                        var8.method357(4);
                                        var8.method357(class53.field443);
                                        var8.method358(0);
                                        Statics.field439.method1964(var8.field168, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field439.method1979();
                                        } catch (Exception var12) {
                                        }
                                        class53.field445++;
                                        Statics.field439 = null;
                                    }
                                }
                                class53.field442 = 0;
                                Statics.field427 = Statics.method1882();
                                Statics.field1051 = null;
                                Statics.field985 = null;
                                field1501 = 0;
                                field1505 = 0;
                                return;
                            }
                            class53.field433.method3(var7);
                            class53.field434.method22(var7, var7.field11);
                            class53.field435++;
                            class53.field437--;
                        }
                    }
                    class53.field429.method22(var6, var6.field11);
                    class53.field426++;
                    class53.field432--;
                }
            }
        } catch (IOException var15) {
            this.method1561(-3);
        }
    }

    @ObfuscatedName("client.df(B)V")
    public static final void method1685() {
        field1515.method2253(33);
        field1515.method357(0);
    }

    @ObfuscatedName("client.o(B)V")
    public final void method1698() {
    }

    @ObfuscatedName("client.bu(IIIIIIIB)V")
    public static final void method1852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field1478 && Statics.field1863 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2658.method2392(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2658.method2393(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2658.method2394(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2658.method2458(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2658.method2396(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2658.method2371(arg0, arg2, arg3);
                class184 var15 = Statics.method2861(var12);
                if (var15.field2799 != 0) {
                    field1533[arg0].method178(arg2, arg3, var13, var14, var15.field2807);
                }
            }
            if (arg1 == 1) {
                Statics.field2658.method2457(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2658.method2385(arg0, arg2, arg3);
                class184 var16 = Statics.method2861(var12);
                if (var16.field2804 + arg2 > 103 || var16.field2804 + arg3 > 103 || var16.field2834 + arg2 > 103 || var16.field2834 + arg3 > 103) {
                    return;
                }
                if (var16.field2799 != 0) {
                    field1533[arg0].method195(arg2, arg3, var16.field2804, var16.field2834, var14, var16.field2807);
                }
            }
            if (arg1 == 3) {
                Statics.field2658.method2386(arg0, arg2, arg3);
                class184 var17 = Statics.method2861(var12);
                if (var17.field2799 == 1) {
                    field1533[arg0].method179(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class60.field512[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class60.method819(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field2658, field1533[arg0]);
    }

    @ObfuscatedName("fj.ar(B)I")
    public static final int method171() {
        if (Statics.field1855.field1381) {
            return Statics.field1863;
        }
        int var0 = 3;
        if (Statics.field1753 < 310) {
            int var1 = Statics.field671 >> 7;
            int var2 = Statics.field502 >> 7;
            int var3 = Statics.field387.field2735 >> 7;
            int var4 = Statics.field387.field2683 >> 7;
            if ((class60.field512[Statics.field1863][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1863;
            }
            int var5;
            if (var3 > var1) {
                var5 = var3 - var1;
            } else {
                var5 = var1 - var3;
            }
            int var6;
            if (var4 > var2) {
                var6 = var4 - var2;
            } else {
                var6 = var2 - var4;
            }
            if (var5 > var6) {
                int var7 = var6 * 65536 / var5;
                int var8 = 32768;
                while (var1 != var3) {
                    if (var1 < var3) {
                        var1++;
                    } else if (var1 > var3) {
                        var1--;
                    }
                    if ((class60.field512[Statics.field1863][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1863;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class60.field512[Statics.field1863][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1863;
                        }
                    }
                }
            } else {
                int var9 = var5 * 65536 / var6;
                int var10 = 32768;
                while (var2 != var4) {
                    if (var2 < var4) {
                        var2++;
                    } else if (var2 > var4) {
                        var2--;
                    }
                    if ((class60.field512[Statics.field1863][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1863;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class60.field512[Statics.field1863][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1863;
                        }
                    }
                }
            }
        }
        if ((class60.field512[Statics.field1863][Statics.field387.field2735 >> 7][Statics.field387.field2683 >> 7] & 0x4) != 0) {
            var0 = Statics.field1863;
        }
        return var0;
    }

    @ObfuscatedName("fj.bc(III)V")
    public static final void method211(int arg0, int arg1) {
        class13 var2 = field1609[Statics.field1863][arg0][arg1];
        if (var2 == null) {
            Statics.field2658.method2387(Statics.field1863, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class70 var4 = null;
        for (class70 var5 = (class70) var2.method253(); var5 != null; var5 = (class70) var2.method255()) {
            class165 var6 = class165.method3520(var5.field667);
            int var7 = var6.field2494;
            if (var6.field2493 == 1) {
                var7 = (var5.field666 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field2658.method2387(Statics.field1863, arg0, arg1);
            return;
        }
        var2.method249(var4);
        class70 var8 = null;
        class70 var9 = null;
        for (class70 var10 = (class70) var2.method253(); var10 != null; var10 = (class70) var2.method255()) {
            if (var4.field667 != var10.field667) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field667 != var10.field667 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field2658.method2373(Statics.field1863, arg0, arg1, method1185(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1863), var4, var11, var8, var9);
    }

    @ObfuscatedName("dv.cj(Lfb;I)V")
    public static void method319(class75 arg0) {
        if (field1677 == arg0.field843) {
            field1668[arg0.field842] = true;
        }
    }

    @ObfuscatedName("dy.cv(Lfb;S)V")
    public static final void method565(class75 arg0) {
        int var1 = arg0.field731;
        if (var1 == 324) {
            if (field1734 == -1) {
                field1734 = arg0.field751;
                field1632 = arg0.field743;
            }
            if (field1733.field695) {
                arg0.field751 = field1734;
            } else {
                arg0.field751 = field1632;
            }
        } else if (var1 == 325) {
            if (field1734 == -1) {
                field1734 = arg0.field751;
                field1632 = arg0.field743;
            }
            if (field1733.field695) {
                arg0.field751 = field1632;
            } else {
                arg0.field751 = field1734;
            }
        } else if (var1 == 327) {
            arg0.field732 = 150;
            arg0.field768 = (int) (Math.sin((double) field1483 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field825 = 5;
            arg0.field724 = 0;
        } else if (var1 == 328) {
            arg0.field732 = 150;
            arg0.field768 = (int) (Math.sin((double) field1483 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field825 = 5;
            arg0.field724 = 1;
        }
    }

    @ObfuscatedName("ec.dm(IIIILcs;I)V")
    public static final void method618(int arg0, int arg1, int arg2, int arg3, class143 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field1600 + field1549 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class151.field2285[var5];
        int var8 = class151.field2286[var5];
        int var9 = var7 * 256 / (field1730 + 256);
        int var10 = var8 * 256 / (field1730 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method2634(Statics.field2184, arg0 + 94 + var11 - arg4.field2166 / 2 + 4, arg1 + 83 - var12 - arg4.field2167 / 2 - 4);
        } else {
            arg4.method2621(arg0 + 94 + var11 - arg4.field2166 / 2 + 4, arg1 + 83 - var12 - arg4.field2167 / 2 - 4);
        }
    }

    @ObfuscatedName("ed.cx(Lo;IIII)V")
    public static final void method619(class68 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field387 == arg0 || field1618 >= 400) {
            return;
        }
        String var4;
        if (arg0.field634 == 0) {
            var4 = arg0.field632 + method745(arg0.field635, Statics.field387.field635) + " " + class94.field1087 + class98.field1282 + arg0.field635 + class94.field1090;
        } else {
            var4 = arg0.field632 + " " + class94.field1087 + class98.field1283 + arg0.field634 + class94.field1090;
        }
        if (field1629 == 1) {
            method725(class98.field1267, field1630 + " " + class94.field1091 + " " + class94.method2110(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field1631) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field1494[var5] != null) {
                    short var6 = 0;
                    if (field1494[var5].equalsIgnoreCase(class98.field1287)) {
                        if (arg0.field635 > Statics.field387.field635) {
                            var6 = 2000;
                        }
                        if (Statics.field387.field647 != 0 && arg0.field647 != 0) {
                            if (Statics.field387.field647 == arg0.field647) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field1572[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field1717[var5] + var6;
                    method725(field1494[var5], class94.method2110(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2448 & 0x8) == 8) {
            method725(field1606, field1634 + " " + class94.field1091 + " " + class94.method2110(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field1618; var9++) {
            if (field1621[var9] == 23) {
                field1624[var9] = class94.method2110(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("dk.cn([Lfb;IIIIIIII)V")
    public static final void method722(class75[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class75 var9 = arg0[var8];
            if (var9 != null && (!var9.field726 || var9.field809 == 0 || var9.field794 || method855(var9) != 0 || field1481 == var9) && var9.field738 == arg1 && (!var9.field726 || !method1163(var9))) {
                int var10 = var9.field741 + arg6;
                int var11 = var9.field733 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field809 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field809 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field798 + var10;
                    int var19 = var9.field737 + var11;
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
                    int var22 = var9.field798 + var10;
                    int var23 = var9.field737 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1646 == var9) {
                    field1654 = true;
                    field1655 = var10;
                    field1656 = var11;
                }
                if (!var9.field726 || var12 < var14 && var13 < var15) {
                    if (var9.field731 == 1337) {
                        method319(var9);
                    } else if (var9.field731 == 1338) {
                        method2888(var10, var11);
                    } else {
                        if (var9.field809 == 0) {
                            if (!var9.field726 && method1163(var9) && Statics.field408 != var9) {
                                continue;
                            }
                            method722(arg0, var9.field727, var12, var13, var14, var15, var10 - var9.field740, var11 - var9.field718);
                            if (var9.field835 != null) {
                                method722(var9.field835, var9.field727, var12, var13, var14, var15, var10 - var9.field740, var11 - var9.field718);
                            }
                            class86 var24 = (class86) field1636.method20((long) var9.field727);
                            if (var24 != null) {
                                int var25 = var24.field1000;
                                if (class75.method299(var25)) {
                                    method722(Statics.field826[var25], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field726) {
                            boolean var26;
                            if (class108.field1742 >= var12 && class108.field1743 >= var13 && class108.field1742 < var14 && class108.field1743 < var15) {
                                var26 = true;
                            } else {
                                var26 = false;
                            }
                            boolean var27 = false;
                            if (class108.field1750 == 1 && var26) {
                                var27 = true;
                            }
                            boolean var28 = false;
                            if (class108.field1748 == 1 && class108.field1737 >= var12 && class108.field1749 >= var13 && class108.field1737 < var14 && class108.field1749 < var15) {
                                var28 = true;
                            }
                            if (var28) {
                                int var29 = class108.field1737 - var10;
                                int var30 = class108.field1749 - var11;
                                if (field1646 == null && !field1633 && var9 != null) {
                                    class75 var31 = method1055(var9);
                                    if (var31 == null) {
                                        var31 = var9.field789;
                                    }
                                    if (var31 != null) {
                                        field1646 = var9;
                                        class75 var33 = method1055(var9);
                                        if (var33 == null) {
                                            var33 = var9.field789;
                                        }
                                        field1481 = var33;
                                        field1648 = var29;
                                        field1649 = var30;
                                        Statics.field558 = 0;
                                        field1657 = false;
                                    }
                                }
                            }
                            if (field1646 != null && field1646 != var9 && var26 && class12.method1339(method855(var9))) {
                                field1650 = var9;
                            }
                            if (field1481 == var9) {
                                field1651 = true;
                                field1652 = var10;
                                field1653 = var11;
                            }
                            if (var9.field794) {
                                if (var26 && field1671 != 0 && var9.field815 != null) {
                                    class72 var35 = new class72();
                                    var35.field682 = var9;
                                    var35.field687 = field1671;
                                    var35.field678 = var9.field815;
                                    field1500.method248(var35);
                                }
                                if (field1646 != null || Statics.field59 != null || field1633) {
                                    var28 = false;
                                    var27 = false;
                                    var26 = false;
                                }
                                if (!var9.field837 && var28) {
                                    var9.field837 = true;
                                    if (var9.field796 != null) {
                                        class72 var36 = new class72();
                                        var36.field682 = var9;
                                        var36.field680 = class108.field1737 - var10;
                                        var36.field687 = class108.field1749 - var11;
                                        var36.field678 = var9.field796;
                                        field1500.method248(var36);
                                    }
                                }
                                if (var9.field837 && var27 && var9.field746 != null) {
                                    class72 var37 = new class72();
                                    var37.field682 = var9;
                                    var37.field680 = class108.field1742 - var10;
                                    var37.field687 = class108.field1743 - var11;
                                    var37.field678 = var9.field746;
                                    field1500.method248(var37);
                                }
                                if (var9.field837 && !var27) {
                                    var9.field837 = false;
                                    if (var9.field722 != null) {
                                        class72 var38 = new class72();
                                        var38.field682 = var9;
                                        var38.field680 = class108.field1742 - var10;
                                        var38.field687 = class108.field1743 - var11;
                                        var38.field678 = var9.field722;
                                        field1679.method248(var38);
                                    }
                                }
                                if (var27 && var9.field799 != null) {
                                    class72 var39 = new class72();
                                    var39.field682 = var9;
                                    var39.field680 = class108.field1742 - var10;
                                    var39.field687 = class108.field1743 - var11;
                                    var39.field678 = var9.field799;
                                    field1500.method248(var39);
                                }
                                if (!var9.field771 && var26) {
                                    var9.field771 = true;
                                    if (var9.field800 != null) {
                                        class72 var40 = new class72();
                                        var40.field682 = var9;
                                        var40.field680 = class108.field1742 - var10;
                                        var40.field687 = class108.field1743 - var11;
                                        var40.field678 = var9.field800;
                                        field1500.method248(var40);
                                    }
                                }
                                if (var9.field771 && var26 && var9.field801 != null) {
                                    class72 var41 = new class72();
                                    var41.field682 = var9;
                                    var41.field680 = class108.field1742 - var10;
                                    var41.field687 = class108.field1743 - var11;
                                    var41.field678 = var9.field801;
                                    field1500.method248(var41);
                                }
                                if (var9.field771 && !var26) {
                                    var9.field771 = false;
                                    if (var9.field802 != null) {
                                        class72 var42 = new class72();
                                        var42.field682 = var9;
                                        var42.field680 = class108.field1742 - var10;
                                        var42.field687 = class108.field1743 - var11;
                                        var42.field678 = var9.field802;
                                        field1679.method248(var42);
                                    }
                                }
                                if (var9.field786 != null) {
                                    class72 var43 = new class72();
                                    var43.field682 = var9;
                                    var43.field678 = var9.field786;
                                    field1673.method248(var43);
                                }
                                if (var9.field807 != null && field1660 > var9.field828) {
                                    if (var9.field779 == null || field1660 - var9.field828 > 32) {
                                        class72 var48 = new class72();
                                        var48.field682 = var9;
                                        var48.field678 = var9.field807;
                                        field1500.method248(var48);
                                    } else {
                                        label398: for (int var44 = var9.field828; var44 < field1660; var44++) {
                                            int var45 = field1735[var44 & 0x1F];
                                            for (int var46 = 0; var46 < var9.field779.length; var46++) {
                                                if (var9.field779[var46] == var45) {
                                                    class72 var47 = new class72();
                                                    var47.field682 = var9;
                                                    var47.field678 = var9.field807;
                                                    field1500.method248(var47);
                                                    break label398;
                                                }
                                            }
                                        }
                                    }
                                    var9.field828 = field1660;
                                }
                                if (var9.field793 != null && field1662 > var9.field840) {
                                    if (var9.field760 == null || field1662 - var9.field840 > 32) {
                                        class72 var53 = new class72();
                                        var53.field682 = var9;
                                        var53.field678 = var9.field793;
                                        field1500.method248(var53);
                                    } else {
                                        label378: for (int var49 = var9.field840; var49 < field1662; var49++) {
                                            int var50 = field1674[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field760.length; var51++) {
                                                if (var9.field760[var51] == var50) {
                                                    class72 var52 = new class72();
                                                    var52.field682 = var9;
                                                    var52.field678 = var9.field793;
                                                    field1500.method248(var52);
                                                    break label378;
                                                }
                                            }
                                        }
                                    }
                                    var9.field840 = field1662;
                                }
                                if (var9.field811 != null && field1664 > var9.field841) {
                                    if (var9.field795 == null || field1664 - var9.field841 > 32) {
                                        class72 var58 = new class72();
                                        var58.field682 = var9;
                                        var58.field678 = var9.field811;
                                        field1500.method248(var58);
                                    } else {
                                        label358: for (int var54 = var9.field841; var54 < field1664; var54++) {
                                            int var55 = field1663[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field795.length; var56++) {
                                                if (var9.field795[var56] == var55) {
                                                    class72 var57 = new class72();
                                                    var57.field682 = var9;
                                                    var57.field678 = var9.field811;
                                                    field1500.method248(var57);
                                                    break label358;
                                                }
                                            }
                                        }
                                    }
                                    var9.field841 = field1664;
                                }
                                if (field1617 > var9.field838 && var9.field816 != null) {
                                    class72 var59 = new class72();
                                    var59.field682 = var9;
                                    var59.field678 = var9.field816;
                                    field1500.method248(var59);
                                }
                                if (field1666 > var9.field838 && var9.field818 != null) {
                                    class72 var60 = new class72();
                                    var60.field682 = var9;
                                    var60.field678 = var9.field818;
                                    field1500.method248(var60);
                                }
                                if (field1667 > var9.field838 && var9.field836 != null) {
                                    class72 var61 = new class72();
                                    var61.field682 = var9;
                                    var61.field678 = var9.field836;
                                    field1500.method248(var61);
                                }
                                if (field1475 > var9.field838 && var9.field820 != null) {
                                    class72 var62 = new class72();
                                    var62.field682 = var9;
                                    var62.field678 = var9.field820;
                                    field1500.method248(var62);
                                }
                                var9.field838 = field1578;
                                if (var9.field817 != null) {
                                    for (int var63 = 0; var63 < field1696; var63++) {
                                        class72 var64 = new class72();
                                        var64.field682 = var9;
                                        var64.field679 = field1676[var63];
                                        var64.field681 = field1622[var63];
                                        var64.field678 = var9.field817;
                                        field1500.method248(var64);
                                    }
                                }
                            }
                        }
                        if (!var9.field726) {
                            if (field1646 != null || Statics.field59 != null || field1633) {
                                return;
                            }
                            if ((var9.field777 >= 0 || var9.field752 != 0) && class108.field1742 >= var12 && class108.field1743 >= var13 && class108.field1742 < var14 && class108.field1743 < var15) {
                                if (var9.field777 >= 0) {
                                    Statics.field408 = arg0[var9.field777];
                                } else {
                                    Statics.field408 = var9;
                                }
                            }
                            if (var9.field809 == 8 && class108.field1742 >= var12 && class108.field1743 >= var13 && class108.field1742 < var14 && class108.field1743 < var15) {
                                Statics.field668 = var9;
                            }
                            if (var9.field763 > var9.field737) {
                                method1162(var9, var9.field798 + var10, var11, var9.field737, var9.field763, class108.field1742, class108.field1743);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dk.bz(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method725(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field1633 || field1618 >= 500) {
            return;
        }
        field1623[field1618] = arg0;
        field1624[field1618] = arg1;
        field1621[field1618] = arg2;
        field1488[field1618] = arg3;
        field1619[field1618] = arg4;
        field1620[field1618] = arg5;
        field1618++;
    }

    @ObfuscatedName("dl.bj(IB)Z")
    public static final boolean method743(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field1621[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("dn.co([Lfb;IIIIIIIII)V")
    public static final void method744(class75[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class139.method2344(arg2, arg3, arg4, arg5);
        class151.method2786();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class75 var10 = arg0[var9];
            if (var10 != null && (var10.field738 == arg1 || arg1 == -1412584499 && field1646 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1721[field1523] = var10.field741 + arg6;
                    field1682[field1523] = var10.field733 + arg7;
                    field1683[field1523] = var10.field798;
                    field1684[field1523] = var10.field737;
                    var11 = ++field1523 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field842 = var11;
                var10.field843 = field1483;
                if (!var10.field726 || !method1163(var10)) {
                    if (var10.field731 > 0) {
                        method565(var10);
                    }
                    int var12 = var10.field741 + arg6;
                    int var13 = var10.field733 + arg7;
                    int var14 = var10.field749;
                    if (field1646 == var10) {
                        if (arg1 != -1412584499 && !var10.field808) {
                            Statics.field2628 = arg0;
                            Statics.field1785 = arg6;
                            Statics.field1382 = arg7;
                            continue;
                        }
                        if (field1657 && field1651) {
                            int var15 = class108.field1742;
                            int var16 = class108.field1743;
                            int var17 = var15 - field1648;
                            int var18 = var16 - field1649;
                            if (var17 < field1652) {
                                var17 = field1652;
                            }
                            if (var10.field798 + var17 > field1652 + field1481.field798) {
                                var17 = field1652 + field1481.field798 - var10.field798;
                            }
                            if (var18 < field1653) {
                                var18 = field1653;
                            }
                            if (var10.field737 + var18 > field1653 + field1481.field737) {
                                var18 = field1653 + field1481.field737 - var10.field737;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field808) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field809 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field809 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field798 + var12;
                        int var26 = var10.field737 + var13;
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
                        int var29 = var10.field798 + var12;
                        int var30 = var10.field737 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field726 || var19 < var21 && var20 < var22) {
                        if (var10.field731 != 0) {
                            if (var10.field731 == 1337) {
                                field1625 = var12;
                                field1626 = var13;
                                Statics.method2093(var12, var13, var10.field798, var10.field737);
                                class139.method2344(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field731 == 1338) {
                                method3372(var12, var13, var11);
                                class139.method2344(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var31 = class108.field1742;
                        int var32 = class108.field1743;
                        if (!field1633 && var31 >= var19 && var32 >= var20 && var31 < var21 && var32 < var22) {
                            int var33 = var31 - var12;
                            int var34 = var32 - var13;
                            if (var10.field730 == 1) {
                                method725(var10.field791, "", 24, 0, 0, var10.field727);
                            }
                            if (var10.field730 == 2 && !field1631) {
                                int var35 = method855(var10);
                                int var36 = var35 >> 11 & 0x3F;
                                String var37;
                                if (var36 == 0) {
                                    var37 = null;
                                } else if (var10.field827 == null || var10.field827.trim().length() == 0) {
                                    var37 = null;
                                } else {
                                    var37 = var10.field827;
                                }
                                if (var37 != null) {
                                    method725(var37, class94.method2110(65280) + var10.field717, 25, 0, -1, var10.field727);
                                }
                            }
                            if (var10.field730 == 3) {
                                method725(class98.field1285, "", 26, 0, 0, var10.field727);
                            }
                            if (var10.field730 == 4) {
                                method725(var10.field791, "", 28, 0, 0, var10.field727);
                            }
                            if (var10.field730 == 5) {
                                method725(var10.field791, "", 29, 0, 0, var10.field727);
                            }
                            if (var10.field730 == 6 && field1639 == null) {
                                method725(var10.field791, "", 30, 0, -1, var10.field727);
                            }
                            if (var10.field809 == 2) {
                                int var39 = 0;
                                for (int var40 = 0; var40 < var10.field737; var40++) {
                                    for (int var41 = 0; var41 < var10.field798; var41++) {
                                        int var42 = (var10.field780 + 32) * var41;
                                        int var43 = (var10.field781 + 32) * var40;
                                        if (var39 < 20) {
                                            var42 += var10.field769[var39];
                                            var43 += var10.field783[var39];
                                        }
                                        if (var33 >= var42 && var34 >= var43 && var33 < var42 + 32 && var34 < var43 + 32) {
                                            field1591 = var39;
                                            Statics.field936 = var10;
                                            if (var10.field770[var39] > 0) {
                                                label1090: {
                                                    class165 var44 = class165.method3520(var10.field770[var39] - 1);
                                                    if (field1629 == 1) {
                                                        int var45 = method855(var10);
                                                        boolean var46 = (var45 >> 30 & 0x1) != 0;
                                                        if (var46) {
                                                            if (Statics.field1426 != var10.field727 || Statics.field1034 != var39) {
                                                                method725(class98.field1267, field1630 + " " + class94.field1091 + " " + class94.method2110(16748608) + var44.field2482, 31, var44.field2520, var39, var10.field727);
                                                            }
                                                            break label1090;
                                                        }
                                                    }
                                                    if (field1631) {
                                                        int var47 = method855(var10);
                                                        boolean var48 = (var47 >> 30 & 0x1) != 0;
                                                        if (var48) {
                                                            if ((Statics.field2448 & 0x10) == 16) {
                                                                method725(field1606, field1634 + " " + class94.field1091 + " " + class94.method2110(16748608) + var44.field2482, 32, var44.field2520, var39, var10.field727);
                                                            }
                                                            break label1090;
                                                        }
                                                    }
                                                    String[] var49 = var44.field2497;
                                                    if (field1645) {
                                                        var49 = method927(var49);
                                                    }
                                                    int var50 = method855(var10);
                                                    boolean var51 = (var50 >> 30 & 0x1) != 0;
                                                    if (var51) {
                                                        for (int var52 = 4; var52 >= 3; var52--) {
                                                            if (var49 != null && var49[var52] != null) {
                                                                byte var53;
                                                                if (var52 == 3) {
                                                                    var53 = 36;
                                                                } else {
                                                                    var53 = 37;
                                                                }
                                                                method725(var49[var52], class94.method2110(16748608) + var44.field2482, var53, var44.field2520, var39, var10.field727);
                                                            } else if (var52 == 4) {
                                                                method725(class98.field1210, class94.method2110(16748608) + var44.field2482, 37, var44.field2520, var39, var10.field727);
                                                            }
                                                        }
                                                    }
                                                    class12 var10000 = (class12) null;
                                                    if (class12.method1926(method855(var10))) {
                                                        method725(class98.field1267, class94.method2110(16748608) + var44.field2482, 38, var44.field2520, var39, var10.field727);
                                                    }
                                                    int var54 = method855(var10);
                                                    boolean var55 = (var54 >> 30 & 0x1) != 0;
                                                    if (var55 && var49 != null) {
                                                        for (int var56 = 2; var56 >= 0; var56--) {
                                                            if (var49[var56] != null) {
                                                                byte var57 = 0;
                                                                if (var56 == 0) {
                                                                    var57 = 33;
                                                                }
                                                                if (var56 == 1) {
                                                                    var57 = 34;
                                                                }
                                                                if (var56 == 2) {
                                                                    var57 = 35;
                                                                }
                                                                method725(var49[var56], class94.method2110(16748608) + var44.field2482, var57, var44.field2520, var39, var10.field727);
                                                            }
                                                        }
                                                    }
                                                    String[] var58 = var10.field792;
                                                    if (field1645) {
                                                        var58 = method927(var58);
                                                    }
                                                    if (var58 != null) {
                                                        for (int var59 = 4; var59 >= 0; var59--) {
                                                            if (var58[var59] != null) {
                                                                byte var60 = 0;
                                                                if (var59 == 0) {
                                                                    var60 = 39;
                                                                }
                                                                if (var59 == 1) {
                                                                    var60 = 40;
                                                                }
                                                                if (var59 == 2) {
                                                                    var60 = 41;
                                                                }
                                                                if (var59 == 3) {
                                                                    var60 = 42;
                                                                }
                                                                if (var59 == 4) {
                                                                    var60 = 43;
                                                                }
                                                                method725(var58[var59], class94.method2110(16748608) + var44.field2482, var60, var44.field2520, var39, var10.field727);
                                                            }
                                                        }
                                                    }
                                                    method725(class98.field1277, class94.method2110(16748608) + var44.field2482, 1005, var44.field2520, var39, var10.field727);
                                                }
                                            }
                                        }
                                        var39++;
                                    }
                                }
                            }
                            if (var10.field726) {
                                if (!field1631) {
                                    for (int var61 = 9; var61 >= 5; var61--) {
                                        int var62 = method855(var10);
                                        boolean var63 = (var62 >> var61 + 1 & 0x1) != 0;
                                        String var64;
                                        if (!var63 && var10.field814 == null) {
                                            var64 = null;
                                        } else if (var10.field788 == null || var10.field788.length <= var61 || var10.field788[var61] == null || var10.field788[var61].trim().length() == 0) {
                                            var64 = null;
                                        } else {
                                            var64 = var10.field788[var61];
                                        }
                                        if (var64 != null) {
                                            method725(var64, var10.field787, 1007, var61 + 1, var10.field728, var10.field727);
                                        }
                                    }
                                    String var66 = method813(var10);
                                    if (var66 != null) {
                                        method725(var66, var10.field787, 25, 0, var10.field728, var10.field727);
                                    }
                                    for (int var67 = 4; var67 >= 0; var67--) {
                                        int var68 = method855(var10);
                                        boolean var69 = (var68 >> var67 + 1 & 0x1) != 0;
                                        String var70;
                                        if (!var69 && var10.field814 == null) {
                                            var70 = null;
                                        } else if (var10.field788 == null || var10.field788.length <= var67 || var10.field788[var67] == null || var10.field788[var67].trim().length() == 0) {
                                            var70 = null;
                                        } else {
                                            var70 = var10.field788[var67];
                                        }
                                        if (var70 != null) {
                                            method725(var70, var10.field787, 57, var67 + 1, var10.field728, var10.field727);
                                        }
                                    }
                                    if (class12.method1357(method855(var10))) {
                                        method725(class98.field1141, "", 30, 0, var10.field728, var10.field727);
                                    }
                                } else if (class12.method2021(method855(var10)) && (Statics.field2448 & 0x20) == 32) {
                                    method725(field1606, field1634 + " " + class94.field1091 + " " + var10.field787, 58, 0, var10.field728, var10.field727);
                                }
                            }
                        }
                        if (var10.field809 == 0) {
                            if (!var10.field726 && method1163(var10) && Statics.field408 != var10) {
                                continue;
                            }
                            if (!var10.field726) {
                                if (var10.field718 > var10.field763 - var10.field737) {
                                    var10.field718 = var10.field763 - var10.field737;
                                }
                                if (var10.field718 < 0) {
                                    var10.field718 = 0;
                                }
                            }
                            method744(arg0, var10.field727, var19, var20, var21, var22, var12 - var10.field740, var13 - var10.field718, var11);
                            if (var10.field835 != null) {
                                method744(var10.field835, var10.field727, var19, var20, var21, var22, var12 - var10.field740, var13 - var10.field718, var11);
                            }
                            class86 var72 = (class86) field1636.method20((long) var10.field727);
                            if (var72 != null) {
                                if (var72.field996 == 0 && class108.field1742 >= var19 && class108.field1743 >= var20 && class108.field1742 < var21 && class108.field1743 < var22 && !field1633 && !field1644) {
                                    field1623[0] = class98.field1349;
                                    field1624[0] = "";
                                    field1621[0] = 1006;
                                    field1618 = 1;
                                }
                                method3453(var72.field1000, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class139.method2344(arg2, arg3, arg4, arg5);
                            class151.method2786();
                        }
                        if (field1587[var11] || field1685 > 1) {
                            if (var10.field809 == 0 && !var10.field726 && var10.field763 > var10.field737) {
                                int var73 = var10.field798 + var12;
                                int var74 = var10.field718;
                                int var75 = var10.field737;
                                int var76 = var10.field763;
                                Statics.field1773[0].method2710(var73, var13);
                                Statics.field1773[1].method2710(var73, var13 + var75 - 16);
                                class139.method2353(var73, var13 + 16, 16, var75 - 32, field1555);
                                int var77 = (var75 - 32) * var75 / var76;
                                if (var77 < 8) {
                                    var77 = 8;
                                }
                                int var78 = (var75 - 32 - var77) * var74 / (var76 - var75);
                                class139.method2353(var73, var13 + 16 + var78, 16, var77, field1556);
                                class139.method2303(var73, var13 + 16 + var78, var77, field1558);
                                class139.method2303(var73 + 1, var13 + 16 + var78, var77, field1558);
                                class139.method2348(var73, var13 + 16 + var78, 16, field1558);
                                class139.method2348(var73, var13 + 17 + var78, 16, field1558);
                                class139.method2303(var73 + 15, var13 + 16 + var78, var77, field1557);
                                class139.method2303(var73 + 14, var13 + 17 + var78, var77 - 1, field1557);
                                class139.method2348(var73, var13 + 15 + var78 + var77, 16, field1557);
                                class139.method2348(var73 + 1, var13 + 14 + var78 + var77, 15, field1557);
                            }
                            if (var10.field809 != 1) {
                                if (var10.field809 == 2) {
                                    int var79 = 0;
                                    for (int var80 = 0; var80 < var10.field737; var80++) {
                                        for (int var81 = 0; var81 < var10.field798; var81++) {
                                            int var82 = (var10.field780 + 32) * var81 + var12;
                                            int var83 = (var10.field781 + 32) * var80 + var13;
                                            if (var79 < 20) {
                                                var82 += var10.field769[var79];
                                                var83 += var10.field783[var79];
                                            }
                                            if (var10.field770[var79] > 0) {
                                                boolean var84 = false;
                                                boolean var85 = false;
                                                int var86 = var10.field770[var79] - 1;
                                                if (var82 + 32 > arg2 && var82 < arg4 && var83 + 32 > arg3 && var83 < arg5 || Statics.field59 == var10 && field1588 == var79) {
                                                    class143 var87;
                                                    if (field1629 == 1 && Statics.field1034 == var79 && Statics.field1426 == var10.field727) {
                                                        var87 = class165.method3489(var86, var10.field830[var79], 2, 0, false);
                                                    } else {
                                                        var87 = class165.method3489(var86, var10.field830[var79], 1, 3153952, false);
                                                    }
                                                    if (var87 == null) {
                                                        method319(var10);
                                                    } else if (Statics.field59 == var10 && field1588 == var79) {
                                                        int var88 = class108.field1742 - field1712;
                                                        int var89 = class108.field1743 - field1728;
                                                        if (var88 < 5 && var88 > -5) {
                                                            var88 = 0;
                                                        }
                                                        if (var89 < 5 && var89 > -5) {
                                                            var89 = 0;
                                                        }
                                                        if (field1641 < 5) {
                                                            var88 = 0;
                                                            var89 = 0;
                                                        }
                                                        var87.method2619(var82 + var88, var83 + var89, 128);
                                                        if (arg1 != -1) {
                                                            class75 var90 = arg0[arg1 & 0xFFFF];
                                                            if (var83 + var89 < class139.field2037 && var90.field718 > 0) {
                                                                int var91 = field1554 * (class139.field2037 - var83 - var89) / 3;
                                                                if (var91 > field1554 * 10) {
                                                                    var91 = field1554 * 10;
                                                                }
                                                                if (var91 > var90.field718) {
                                                                    var91 = var90.field718;
                                                                }
                                                                var90.field718 -= var91;
                                                                field1728 += var91;
                                                                method319(var90);
                                                            }
                                                            if (var83 + var89 + 32 > class139.field2038 && var90.field718 < var90.field763 - var90.field737) {
                                                                int var92 = field1554 * (var83 + var89 + 32 - class139.field2038) / 3;
                                                                if (var92 > field1554 * 10) {
                                                                    var92 = field1554 * 10;
                                                                }
                                                                if (var92 > var90.field763 - var90.field737 - var90.field718) {
                                                                    var92 = var90.field763 - var90.field737 - var90.field718;
                                                                }
                                                                var90.field718 += var92;
                                                                field1728 -= var92;
                                                                method319(var90);
                                                            }
                                                        }
                                                    } else if (Statics.field1452 == var10 && field1513 == var79) {
                                                        var87.method2619(var82, var83, 128);
                                                    } else {
                                                        var87.method2621(var82, var83);
                                                    }
                                                }
                                            } else if (var10.field784 != null && var79 < 20) {
                                                class143 var93 = var10.method1008(var79);
                                                if (var93 != null) {
                                                    var93.method2621(var82, var83);
                                                } else if (class75.field725) {
                                                    method319(var10);
                                                }
                                            }
                                            var79++;
                                        }
                                    }
                                } else if (var10.field809 == 3) {
                                    int var94;
                                    if (method3406(var10)) {
                                        var94 = var10.field745;
                                        if (Statics.field408 == var10 && var10.field747 != 0) {
                                            var94 = var10.field747;
                                        }
                                    } else {
                                        var94 = var10.field719;
                                        if (Statics.field408 == var10 && var10.field752 != 0) {
                                            var94 = var10.field752;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field748) {
                                            class139.method2353(var12, var13, var10.field798, var10.field737, var94);
                                        } else {
                                            class139.method2309(var12, var13, var10.field798, var10.field737, var94);
                                        }
                                    } else if (var10.field748) {
                                        class139.method2306(var12, var13, var10.field798, var10.field737, var94, 256 - (var14 & 0xFF));
                                    } else {
                                        class139.method2343(var12, var13, var10.field798, var10.field737, var94, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field809 == 4) {
                                    class23 var95 = var10.method1007();
                                    if (var95 != null) {
                                        String var96 = var10.field829;
                                        int var97;
                                        if (method3406(var10)) {
                                            var97 = var10.field745;
                                            if (Statics.field408 == var10 && var10.field747 != 0) {
                                                var97 = var10.field747;
                                            }
                                            if (var10.field775.length() > 0) {
                                                var96 = var10.field775;
                                            }
                                        } else {
                                            var97 = var10.field719;
                                            if (Statics.field408 == var10 && var10.field752 != 0) {
                                                var97 = var10.field752;
                                            }
                                        }
                                        if (var10.field726 && var10.field831 != -1) {
                                            class165 var98 = class165.method3520(var10.field831);
                                            var96 = var98.field2482;
                                            if (var96 == null) {
                                                var96 = "null";
                                            }
                                            if ((var98.field2493 == 1 || var10.field832 != 1) && var10.field832 != -1) {
                                                var96 = class94.method2110(16748608) + var96 + class94.field1093 + " " + 'x' + method932(var10.field832);
                                            }
                                        }
                                        if (field1639 == var10) {
                                            class98 var157 = (class98) null;
                                            var96 = class98.field1284;
                                            var97 = var10.field719;
                                        }
                                        if (!var10.field726) {
                                            var96 = method1309(var96, var10);
                                        }
                                        var95.method65(var96, var12, var13, var10.field798, var10.field737, var97, var10.field773 ? 0 : -1, var10.field739, var10.field778, var10.field776);
                                    } else if (class75.field725) {
                                        method319(var10);
                                    }
                                } else if (var10.field809 == 5) {
                                    if (var10.field726) {
                                        class143 var100;
                                        if (var10.field831 == -1) {
                                            var100 = var10.method1006(false);
                                        } else {
                                            var100 = class165.method3489(var10.field831, var10.field832, var10.field755, var10.field756, false);
                                        }
                                        if (var100 != null) {
                                            int var101 = var100.field2166;
                                            int var102 = var100.field2167;
                                            if (var10.field754) {
                                                class139.method2299(var12, var13, var10.field798 + var12, var10.field737 + var13);
                                                int var103 = (var10.field798 + (var101 - 1)) / var101;
                                                int var104 = (var10.field737 + (var102 - 1)) / var102;
                                                for (int var105 = 0; var105 < var103; var105++) {
                                                    for (int var106 = 0; var106 < var104; var106++) {
                                                        if (var10.field750 != 0) {
                                                            var100.method2702(var101 / 2 + var101 * var105 + var12, var102 / 2 + var102 * var106 + var13, var10.field750, 4096);
                                                        } else if (var14 == 0) {
                                                            var100.method2621(var101 * var105 + var12, var102 * var106 + var13);
                                                        } else {
                                                            var100.method2619(var101 * var105 + var12, var102 * var106 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class139.method2344(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var107 = var10.field798 * 4096 / var101;
                                                if (var10.field750 != 0) {
                                                    var100.method2702(var10.field798 / 2 + var12, var10.field737 / 2 + var13, var10.field750, var107);
                                                } else if (var14 != 0) {
                                                    var100.method2628(var12, var13, var10.field798, var10.field737, 256 - (var14 & 0xFF));
                                                } else if (var10.field798 == var101 && var10.field737 == var102) {
                                                    var100.method2621(var12, var13);
                                                } else {
                                                    var100.method2623(var12, var13, var10.field798, var10.field737);
                                                }
                                            }
                                        } else if (class75.field725) {
                                            method319(var10);
                                        }
                                    } else {
                                        class143 var99 = var10.method1006(method3406(var10));
                                        if (var99 != null) {
                                            var99.method2621(var12, var13);
                                        } else if (class75.field725) {
                                            method319(var10);
                                        }
                                    }
                                } else if (var10.field809 == 6) {
                                    boolean var108 = method3406(var10);
                                    int var109;
                                    if (var108) {
                                        var109 = var10.field764;
                                    } else {
                                        var109 = var10.field822;
                                    }
                                    class41 var110 = null;
                                    int var111 = 0;
                                    if (var10.field831 != -1) {
                                        class165 var112 = class165.method3520(var10.field831);
                                        if (var112 != null) {
                                            class165 var113 = var112.method3128(var10.field832);
                                            var110 = var113.method3161(1);
                                            if (var110 == null) {
                                                method319(var10);
                                            } else {
                                                var110.method704();
                                                var111 = var110.field2174 / 2;
                                            }
                                        }
                                    } else if (var10.field825 == 5) {
                                        if (var10.field724 == 0) {
                                            var110 = field1733.method966((class166) null, -1, (class166) null, -1);
                                        } else {
                                            var110 = Statics.field387.method784();
                                        }
                                    } else if (var109 == -1) {
                                        var110 = var10.method1009((class166) null, -1, var108, Statics.field387.field633);
                                        if (var110 == null && class75.field725) {
                                            method319(var10);
                                        }
                                    } else {
                                        class166 var114 = class166.method274(var109);
                                        var110 = var10.method1009(var114, var10.field774, var108, Statics.field387.field633);
                                        if (var110 == null && class75.field725) {
                                            method319(var10);
                                        }
                                    }
                                    class151.method2796(var10.field798 / 2 + var12, var10.field737 / 2 + var13);
                                    int var115 = var10.field720 * class151.field2285[var10.field732] >> 16;
                                    int var116 = var10.field720 * class151.field2286[var10.field732] >> 16;
                                    if (var110 != null) {
                                        if (var10.field726) {
                                            var110.method704();
                                            if (var10.field772) {
                                                var110.method657(0, var10.field768, var10.field819, var10.field732, var10.field797, var10.field766 + var111 + var115, var10.field766 + var116, var10.field720);
                                            } else {
                                                var110.method655(0, var10.field768, var10.field819, var10.field732, var10.field797, var10.field766 + var111 + var115, var10.field766 + var116);
                                            }
                                        } else {
                                            var110.method655(0, var10.field768, 0, var10.field732, 0, var115, var116);
                                        }
                                    }
                                    class151.method2788();
                                } else {
                                    if (var10.field809 == 7) {
                                        class23 var117 = var10.method1007();
                                        if (var117 == null) {
                                            if (class75.field725) {
                                                method319(var10);
                                            }
                                            continue;
                                        }
                                        int var118 = 0;
                                        for (int var119 = 0; var119 < var10.field737; var119++) {
                                            for (int var120 = 0; var120 < var10.field798; var120++) {
                                                if (var10.field770[var118] > 0) {
                                                    class165 var121 = class165.method3520(var10.field770[var118] - 1);
                                                    String var122;
                                                    if (var121.field2493 != 1 && var10.field830[var118] == 1) {
                                                        var122 = class94.method2110(16748608) + var121.field2482 + class94.field1093;
                                                    } else {
                                                        var122 = class94.method2110(16748608) + var121.field2482 + class94.field1093 + " " + 'x' + method932(var10.field830[var118]);
                                                    }
                                                    int var123 = (var10.field780 + 115) * var120 + var12;
                                                    int var124 = (var10.field781 + 12) * var119 + var13;
                                                    if (var10.field739 == 0) {
                                                        var117.method62(var122, var123, var124, var10.field719, var10.field773 ? 0 : -1);
                                                    } else if (var10.field739 == 1) {
                                                        var117.method81(var122, var10.field798 / 2 + var123, var124, var10.field719, var10.field773 ? 0 : -1);
                                                    } else {
                                                        var117.method63(var122, var10.field798 + var123 - 1, var124, var10.field719, var10.field773 ? 0 : -1);
                                                    }
                                                }
                                                var118++;
                                            }
                                        }
                                    }
                                    if (var10.field809 == 8 && Statics.field668 == var10 && field1659 == field1627) {
                                        int var125 = 0;
                                        int var126 = 0;
                                        class23 var127 = Statics.field1446;
                                        String var128 = var10.field829;
                                        String var129 = method1309(var128, var10);
                                        while (var129.length() > 0) {
                                            int var130 = var129.indexOf(class94.field1092);
                                            String var131;
                                            if (var130 == -1) {
                                                var131 = var129;
                                                var129 = "";
                                            } else {
                                                var131 = var129.substring(0, var130);
                                                var129 = var129.substring(var130 + 4);
                                            }
                                            int var132 = var127.method89(var131);
                                            if (var132 > var125) {
                                                var125 = var132;
                                            }
                                            var126 += var127.field19 + 1;
                                        }
                                        var125 += 6;
                                        var126 += 7;
                                        int var133 = var10.field798 + var12 - 5 - var125;
                                        int var134 = var10.field737 + var13 + 5;
                                        if (var133 < var12 + 5) {
                                            var133 = var12 + 5;
                                        }
                                        if (var125 + var133 > arg4) {
                                            var133 = arg4 - var125;
                                        }
                                        if (var126 + var134 > arg5) {
                                            var134 = arg5 - var126;
                                        }
                                        class139.method2353(var133, var134, var125, var126, 16777120);
                                        class139.method2309(var133, var134, var125, var126, 0);
                                        String var135 = var10.field829;
                                        int var136 = var127.field19 + var134 + 2;
                                        String var137 = method1309(var135, var10);
                                        while (var137.length() > 0) {
                                            int var138 = var137.indexOf(class94.field1092);
                                            String var139;
                                            if (var138 == -1) {
                                                var139 = var137;
                                                var137 = "";
                                            } else {
                                                var139 = var137.substring(0, var138);
                                                var137 = var137.substring(var138 + 4);
                                            }
                                            var127.method62(var139, var133 + 3, var136, 0, -1);
                                            var136 += var127.field19 + 1;
                                        }
                                    }
                                    if (var10.field809 == 9) {
                                        if (var10.field744 == 1) {
                                            class139.method2314(var12, var13, var10.field798 + var12, var10.field737 + var13, var10.field719);
                                        } else {
                                            int var140 = var10.field798 >= 0 ? var10.field798 : -var10.field798;
                                            int var141 = var10.field737 >= 0 ? var10.field737 : -var10.field737;
                                            int var142 = var140;
                                            if (var140 < var141) {
                                                var142 = var141;
                                            }
                                            if (var142 != 0) {
                                                int var143 = (var10.field798 << 16) / var142;
                                                int var144 = (var10.field737 << 16) / var142;
                                                if (var144 <= var143) {
                                                    var143 = -var143;
                                                } else {
                                                    var144 = -var144;
                                                }
                                                int var145 = var10.field744 * var144 >> 17;
                                                int var146 = var10.field744 * var144 + 1 >> 17;
                                                int var147 = var10.field744 * var143 >> 17;
                                                int var148 = var10.field744 * var143 + 1 >> 17;
                                                int var149 = var12 + var145;
                                                int var150 = var12 - var146;
                                                int var151 = var10.field798 + var12 - var146;
                                                int var152 = var10.field798 + var12 + var145;
                                                int var153 = var13 + var147;
                                                int var154 = var13 - var148;
                                                int var155 = var10.field737 + var13 - var148;
                                                int var156 = var10.field737 + var13 + var147;
                                                class151.method2794(var149, var150, var151);
                                                class151.method2797(var153, var154, var155, var149, var150, var151, var10.field719);
                                                class151.method2794(var149, var151, var152);
                                                class151.method2797(var153, var155, var156, var149, var151, var152, var10.field719);
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

    @ObfuscatedName("dq.ck(III)Ljava/lang/String;")
    public static final String method745(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class94.method2110(16711680);
        } else if (var2 < -6) {
            return class94.method2110(16723968);
        } else if (var2 < -3) {
            return class94.method2110(16740352);
        } else if (var2 < 0) {
            return class94.method2110(16756736);
        } else if (var2 > 9) {
            return class94.method2110(65280);
        } else if (var2 > 6) {
            return class94.method2110(4259584);
        } else if (var2 > 3) {
            return class94.method2110(8453888);
        } else if (var2 > 0) {
            return class94.method2110(12648192);
        } else {
            return class94.method2110(16776960);
        }
    }

    @ObfuscatedName("dq.bb(IIIIIIIIII)V")
    public static final void method746(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class61 var9 = null;
        for (class61 var10 = (class61) field1610.method253(); var10 != null; var10 = (class61) field1610.method255()) {
            if (var10.field533 == arg0 && var10.field535 == arg1 && var10.field537 == arg2 && var10.field534 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class61();
            var9.field533 = arg0;
            var9.field534 = arg3;
            var9.field535 = arg1;
            var9.field537 = arg2;
            method2005(var9);
            field1610.method248(var9);
        }
        var9.field540 = arg4;
        var9.field542 = arg5;
        var9.field541 = arg6;
        var9.field543 = arg7;
        var9.field536 = arg8;
    }

    @ObfuscatedName("dp.u(I)V")
    public static final void method747() {
        class164.method3282();
        class180.field2680.method910();
        class161.field2412.method910();
        class184.method926();
        class183.method1045();
        class165.method355();
        class166.field2527.method910();
        class166.field2528.method910();
        class173.method1307();
        class182.method2279();
        class179.method1931();
        class73.method3076();
        class75.method3448();
        ((class52) Statics.field2276).method759();
        class76.field848.method910();
        Statics.field2410.method1096();
        Statics.field477.method1096();
        Statics.field545.method1096();
        Statics.field237.method1096();
        Statics.field424.method1096();
        Statics.field1532.method1096();
        Statics.field1764.method1096();
        Statics.field887.method1096();
        Statics.field1504.method1096();
        Statics.field2345.method1096();
        Statics.field937.method1096();
        Statics.field2566.method1096();
    }

    @ObfuscatedName("dr.h(I)V")
    public static final void method761() {
        class141.field2070 = false;
        field1478 = false;
    }

    @ObfuscatedName("f.a(III)V")
    public static void method796(int arg0, int arg1) {
        if (field1530 != 0 && arg0 != -1) {
            class79.method3142(Statics.field937, arg0, 0, field1530, false);
            field1489 = true;
        }
    }

    @ObfuscatedName("f.bq(I)V")
    public static final void method797() {
        if (field1519 == 116) {
            int var0 = field1517.method394();
            int var1 = (var0 >> 4 & 0x7) + Statics.field2567;
            int var2 = (var0 & 0x7) + Statics.field456;
            int var3 = field1517.method394();
            int var4 = var3 >> 2;
            int var5 = var3 & 0x3;
            int var6 = field1700[var4];
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                method746(Statics.field1863, var1, var2, var6, -1, var4, var5, 0, -1);
            }
            return;
        }
        if (field1519 == 76) {
            int var7 = field1517.method396();
            int var8 = (var7 >> 4 & 0x7) + Statics.field2567;
            int var9 = (var7 & 0x7) + Statics.field456;
            byte var10 = field1517.method398();
            int var11 = field1517.method410();
            int var12 = field1517.method365();
            int var13 = field1517.method396();
            int var14 = var13 >> 2;
            int var15 = var13 & 0x3;
            int var16 = field1700[var14];
            byte var17 = field1517.method397();
            int var18 = field1517.method430();
            int var19 = field1517.method365();
            byte var20 = field1517.method399();
            byte var21 = field1517.method398();
            class68 var22;
            if (field1541 == var19) {
                var22 = Statics.field387;
            } else {
                var22 = field1595[var19];
            }
            if (var22 != null) {
                class184 var23 = Statics.method2861(var18);
                int var24;
                int var25;
                if (var15 == 1 || var15 == 3) {
                    var24 = var23.field2834;
                    var25 = var23.field2804;
                } else {
                    var24 = var23.field2804;
                    var25 = var23.field2834;
                }
                int var26 = (var24 >> 1) + var8;
                int var27 = (var24 + 1 >> 1) + var8;
                int var28 = (var25 >> 1) + var9;
                int var29 = (var25 + 1 >> 1) + var9;
                int[][] var30 = class60.field511[Statics.field1863];
                int var31 = var30[var26][var28] + var30[var27][var28] + var30[var26][var29] + var30[var27][var29] >> 2;
                int var32 = (var8 << 7) + (var24 << 6);
                int var33 = (var9 << 7) + (var25 << 6);
                class41 var34 = var23.method3498(var14, var15, var30, var32, var31, var33);
                if (var34 != null) {
                    method746(Statics.field1863, var8, var9, var16, -1, 0, 0, var11 + 1, var12 + 1);
                    var22.field636 = field1483 + var11;
                    var22.field637 = field1483 + var12;
                    var22.field641 = var34;
                    var22.field638 = var8 * 128 + var24 * 64;
                    var22.field640 = var9 * 128 + var25 * 64;
                    var22.field629 = var31;
                    if (var21 > var17) {
                        byte var35 = var21;
                        var21 = var17;
                        var17 = var35;
                    }
                    if (var20 > var10) {
                        byte var36 = var20;
                        var20 = var10;
                        var10 = var36;
                    }
                    var22.field642 = var8 + var21;
                    var22.field644 = var8 + var17;
                    var22.field630 = var9 + var20;
                    var22.field645 = var9 + var10;
                }
            }
        }
        if (field1519 == 131) {
            int var37 = field1517.method512();
            int var38 = (var37 >> 4 & 0x7) + Statics.field2567;
            int var39 = (var37 & 0x7) + Statics.field456;
            int var40 = field1517.method373();
            int var41 = field1517.method373();
            int var42 = field1517.method373();
            if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                class13 var43 = field1609[Statics.field1863][var38][var39];
                if (var43 != null) {
                    for (class70 var44 = (class70) var43.method253(); var44 != null; var44 = (class70) var43.method255()) {
                        if ((var40 & 0x7FFF) == var44.field667 && var44.field666 == var41) {
                            var44.field666 = var42;
                            break;
                        }
                    }
                    method211(var38, var39);
                }
            }
        } else if (field1519 == 92) {
            int var45 = field1517.method512();
            int var46 = (var45 >> 4 & 0x7) + Statics.field2567;
            int var47 = (var45 & 0x7) + Statics.field456;
            int var48 = field1517.method373();
            int var49 = field1517.method512();
            int var50 = field1517.method373();
            if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                int var51 = var46 * 128 + 64;
                int var52 = var47 * 128 + 64;
                class84 var53 = new class84(var48, Statics.field1863, var51, var52, method1185(var51, var52, Statics.field1863) - var49, var50, field1483);
                field1597.method248(var53);
            }
        } else if (field1519 == 99) {
            int var54 = field1517.method394();
            int var55 = (var54 >> 4 & 0x7) + Statics.field2567;
            int var56 = (var54 & 0x7) + Statics.field456;
            int var57 = field1517.method373();
            int var58 = field1517.method373();
            if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
                class70 var59 = new class70();
                var59.field667 = var58;
                var59.field666 = var57;
                if (field1609[Statics.field1863][var55][var56] == null) {
                    field1609[Statics.field1863][var55][var56] = new class13();
                }
                field1609[Statics.field1863][var55][var56].method248(var59);
                method211(var55, var56);
            }
        } else if (field1519 == 158) {
            int var60 = field1517.method430();
            int var61 = field1517.method512();
            int var62 = (var61 >> 4 & 0x7) + Statics.field2567;
            int var63 = (var61 & 0x7) + Statics.field456;
            if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
                class13 var64 = field1609[Statics.field1863][var62][var63];
                if (var64 != null) {
                    for (class70 var65 = (class70) var64.method253(); var65 != null; var65 = (class70) var64.method255()) {
                        if ((var60 & 0x7FFF) == var65.field667) {
                            var65.method44();
                            break;
                        }
                    }
                    if (var64.method253() == null) {
                        field1609[Statics.field1863][var62][var63] = null;
                    }
                    method211(var62, var63);
                }
            }
        } else if (field1519 == 214) {
            int var66 = field1517.method410();
            int var67 = field1517.method512();
            int var68 = (var67 >> 4 & 0x7) + Statics.field2567;
            int var69 = (var67 & 0x7) + Statics.field456;
            int var70 = field1517.method476();
            int var71 = var70 >> 2;
            int var72 = var70 & 0x3;
            int var73 = field1700[var71];
            if (var68 >= 0 && var69 >= 0 && var68 < 103 && var69 < 103) {
                if (var73 == 0) {
                    class159 var74 = Statics.field2658.method2406(Statics.field1863, var68, var69);
                    if (var74 != null) {
                        int var75 = var74.field2369 >> 14 & 0x7FFF;
                        if (var71 == 2) {
                            var74.field2375 = new class80(var75, 2, var72 + 4, Statics.field1863, var68, var69, var66, false, var74.field2375);
                            var74.field2368 = new class80(var75, 2, var72 + 1 & 0x3, Statics.field1863, var68, var69, var66, false, var74.field2368);
                        } else {
                            var74.field2375 = new class80(var75, var71, var72, Statics.field1863, var68, var69, var66, false, var74.field2375);
                        }
                    }
                }
                if (var73 == 1) {
                    class26 var76 = Statics.field2658.method2389(Statics.field1863, var68, var69);
                    if (var76 != null) {
                        int var77 = var76.field138 >> 14 & 0x7FFF;
                        if (var71 == 4 || var71 == 5) {
                            var76.field129 = new class80(var77, 4, var72, Statics.field1863, var68, var69, var66, false, var76.field129);
                        } else if (var71 == 6) {
                            var76.field129 = new class80(var77, 4, var72 + 4, Statics.field1863, var68, var69, var66, false, var76.field129);
                        } else if (var71 == 7) {
                            var76.field129 = new class80(var77, 4, (var72 + 2 & 0x3) + 4, Statics.field1863, var68, var69, var66, false, var76.field129);
                        } else if (var71 == 8) {
                            var76.field129 = new class80(var77, 4, var72 + 4, Statics.field1863, var68, var69, var66, false, var76.field129);
                            var76.field144 = new class80(var77, 4, (var72 + 2 & 0x3) + 4, Statics.field1863, var68, var69, var66, false, var76.field144);
                        }
                    }
                }
                if (var73 == 2) {
                    class152 var78 = Statics.field2658.method2502(Statics.field1863, var68, var69);
                    if (var71 == 11) {
                        var71 = 10;
                    }
                    if (var78 != null) {
                        var78.field2299 = new class80(var78.field2294 >> 14 & 0x7FFF, var71, var72, Statics.field1863, var68, var69, var66, false, var78.field2299);
                    }
                }
                if (var73 == 3) {
                    class46 var79 = Statics.field2658.method2391(Statics.field1863, var68, var69);
                    if (var79 != null) {
                        var79.field368 = new class80(var79.field375 >> 14 & 0x7FFF, 22, var72, Statics.field1863, var68, var69, var66, false, var79.field368);
                    }
                }
            }
        } else if (field1519 == 64) {
            int var80 = field1517.method365();
            int var81 = field1517.method394();
            int var82 = (var81 >> 4 & 0x7) + Statics.field2567;
            int var83 = (var81 & 0x7) + Statics.field456;
            int var84 = field1517.method410();
            int var85 = field1517.method373();
            if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104 && field1541 != var84) {
                class70 var86 = new class70();
                var86.field667 = var80;
                var86.field666 = var85;
                if (field1609[Statics.field1863][var82][var83] == null) {
                    field1609[Statics.field1863][var82][var83] = new class13();
                }
                field1609[Statics.field1863][var82][var83].method248(var86);
                method211(var82, var83);
            }
        } else if (field1519 == 31) {
            int var87 = field1517.method512();
            int var88 = (var87 >> 4 & 0x7) + Statics.field2567;
            int var89 = (var87 & 0x7) + Statics.field456;
            int var90 = var88 + field1517.method492();
            int var91 = var89 + field1517.method492();
            int var92 = field1517.method356();
            int var93 = field1517.method373();
            int var94 = field1517.method512() * 4;
            int var95 = field1517.method512() * 4;
            int var96 = field1517.method373();
            int var97 = field1517.method373();
            int var98 = field1517.method512();
            int var99 = field1517.method512();
            if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104 && var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104 && var93 != 65535) {
                int var100 = var88 * 128 + 64;
                int var101 = var89 * 128 + 64;
                int var102 = var90 * 128 + 64;
                int var103 = var91 * 128 + 64;
                class54 var104 = new class54(var93, Statics.field1863, var100, var101, method1185(var100, var101, Statics.field1863) - var94, field1483 + var96, field1483 + var97, var98, var99, var92, var95);
                var104.method782(var102, var103, method1185(var102, var103, Statics.field1863) - var95, field1483 + var96);
                field1611.method248(var104);
            }
        } else {
            if (field1519 == 26) {
                int var105 = field1517.method512();
                int var106 = (var105 >> 4 & 0x7) + Statics.field2567;
                int var107 = (var105 & 0x7) + Statics.field456;
                int var108 = field1517.method373();
                int var109 = field1517.method512();
                int var110 = var109 >> 4 & 0xF;
                int var111 = var109 & 0x7;
                int var112 = field1517.method512();
                if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104) {
                    int var113 = var110 + 1;
                    if (Statics.field387.field2734[0] >= var106 - var113 && Statics.field387.field2734[0] <= var106 + var113 && Statics.field387.field2698[0] >= var107 - var113 && Statics.field387.field2698[0] <= var107 + var113 && field1714 != 0 && var111 > 0 && field1719 < 50) {
                        field1612[field1719] = var108;
                        field1492[field1719] = var111;
                        field1718[field1719] = var112;
                        field1720[field1719] = null;
                        field1691[field1719] = (var106 << 16) + (var107 << 8) + var110;
                        field1719++;
                    }
                }
            }
            if (field1519 == 248) {
                int var114 = field1517.method373();
                int var115 = field1517.method394();
                int var116 = var115 >> 2;
                int var117 = var115 & 0x3;
                int var118 = field1700[var116];
                int var119 = field1517.method512();
                int var120 = (var119 >> 4 & 0x7) + Statics.field2567;
                int var121 = (var119 & 0x7) + Statics.field456;
                if (var120 >= 0 && var121 >= 0 && var120 < 104 && var121 < 104) {
                    method746(Statics.field1863, var120, var121, var118, var114, var116, var117, 0, -1);
                }
            }
        }
    }

    @ObfuscatedName("f.bi(II)V")
    public static final void method798(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field1619[arg0];
        int var2 = field1620[arg0];
        int var3 = field1621[arg0];
        int var4 = field1488[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 49) {
            class68 var5 = field1595[var4];
            if (var5 != null) {
                method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var5.field2734[0], var5.field2698[0], false, 0, 0, 1, 1, 0, 2);
                field1582 = class108.field1737;
                field1583 = class108.field1749;
                field1585 = 2;
                field1584 = 0;
                field1515.method2253(173);
                field1515.method584(var4);
            }
        }
        if (var3 == 39) {
            field1515.method2253(213);
            field1515.method360(var2);
            field1515.method537(var4);
            field1515.method358(var1);
            field1503 = 0;
            Statics.field1452 = class75.method1490(var2);
            field1513 = var1;
        }
        if (var3 == 44) {
            class68 var6 = field1595[var4];
            if (var6 != null) {
                method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var6.field2734[0], var6.field2698[0], false, 0, 0, 1, 1, 0, 2);
                field1582 = class108.field1737;
                field1583 = class108.field1749;
                field1585 = 2;
                field1584 = 0;
                field1515.method2253(247);
                field1515.method537(var4);
            }
        }
        if (var3 == 3) {
            method860(var1, var2, var4);
            field1515.method2253(26);
            field1515.method537(Statics.field2469 + var1);
            field1515.method401(var4 >> 14 & 0x7FFF);
            field1515.method358(Statics.field622 + var2);
        }
        if (var3 == 42) {
            field1515.method2253(42);
            field1515.method401(var1);
            field1515.method358(var4);
            field1515.method456(var2);
            field1503 = 0;
            Statics.field1452 = class75.method1490(var2);
            field1513 = var1;
        }
        if (var3 == 47) {
            class68 var7 = field1595[var4];
            if (var7 != null) {
                method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var7.field2734[0], var7.field2698[0], false, 0, 0, 1, 1, 0, 2);
                field1582 = class108.field1737;
                field1583 = class108.field1749;
                field1585 = 2;
                field1584 = 0;
                field1515.method2253(35);
                field1515.method537(var4);
            }
        }
        if (var3 == 15) {
            class68 var8 = field1595[var4];
            if (var8 != null) {
                method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var8.field2734[0], var8.field2698[0], false, 0, 0, 1, 1, 0, 2);
                field1582 = class108.field1737;
                field1583 = class108.field1749;
                field1585 = 2;
                field1584 = 0;
                field1515.method2253(132);
                field1515.method537(field1590);
                field1515.method537(var4);
                field1515.method360(Statics.field2659);
            }
        }
        if (var3 == 43) {
            field1515.method2253(124);
            field1515.method401(var1);
            field1515.method562(var2);
            field1515.method537(var4);
            field1503 = 0;
            Statics.field1452 = class75.method1490(var2);
            field1513 = var1;
        }
        if (var3 == 1004) {
            field1582 = class108.field1737;
            field1583 = class108.field1749;
            field1585 = 2;
            field1584 = 0;
            field1515.method2253(221);
            field1515.method584(var4);
        }
        if (var3 == 24) {
            class75 var9 = class75.method1490(var2);
            boolean var10 = true;
            if (var9.field731 > 0) {
                var10 = method3349(var9);
            }
            if (var10) {
                field1515.method2253(86);
                field1515.method360(var2);
            }
        }
        if (var3 == 28) {
            field1515.method2253(86);
            field1515.method360(var2);
            class75 var11 = class75.method1490(var2);
            if (var11.field767 != null && var11.field767[0][0] == 5) {
                int var12 = var11.field767[0][1];
                class19.field88[var12] = 1 - class19.field88[var12];
                method1546(var12);
            }
        }
        if (var3 == 19) {
            boolean var13 = method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var13) {
                method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field1582 = class108.field1737;
            field1583 = class108.field1749;
            field1585 = 2;
            field1584 = 0;
            field1515.method2253(116);
            field1515.method584(Statics.field2469 + var1);
            field1515.method537(Statics.field622 + var2);
            field1515.method584(var4);
        }
        if (var3 == 1002) {
            field1582 = class108.field1737;
            field1583 = class108.field1749;
            field1585 = 2;
            field1584 = 0;
            field1515.method2253(129);
            field1515.method537(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 37) {
            field1515.method2253(45);
            field1515.method401(var1);
            field1515.method562(var2);
            field1515.method401(var4);
            field1503 = 0;
            Statics.field1452 = class75.method1490(var2);
            field1513 = var1;
        }
        if (var3 == 46) {
            class68 var15 = field1595[var4];
            if (var15 != null) {
                method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var15.field2734[0], var15.field2698[0], false, 0, 0, 1, 1, 0, 2);
                field1582 = class108.field1737;
                field1583 = class108.field1749;
                field1585 = 2;
                field1584 = 0;
                field1515.method2253(93);
                field1515.method537(var4);
            }
        }
        if (var3 == 1 && method860(var1, var2, var4)) {
            field1515.method2253(87);
            field1515.method401(Statics.field1034);
            field1515.method584(Statics.field669);
            field1515.method411(Statics.field1426);
            field1515.method537(Statics.field2469 + var1);
            field1515.method401(var4 >> 14 & 0x7FFF);
            field1515.method584(Statics.field622 + var2);
        }
        if (var3 == 35) {
            field1515.method2253(114);
            field1515.method358(var4);
            field1515.method537(var1);
            field1515.method360(var2);
            field1503 = 0;
            Statics.field1452 = class75.method1490(var2);
            field1513 = var1;
        }
        if (var3 == 21) {
            boolean var16 = method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var16) {
                method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field1582 = class108.field1737;
            field1583 = class108.field1749;
            field1585 = 2;
            field1584 = 0;
            field1515.method2253(230);
            field1515.method584(Statics.field2469 + var1);
            field1515.method584(Statics.field622 + var2);
            field1515.method584(var4);
        }
        if (var3 == 34) {
            field1515.method2253(50);
            field1515.method360(var2);
            field1515.method584(var4);
            field1515.method584(var1);
            field1503 = 0;
            Statics.field1452 = class75.method1490(var2);
            field1513 = var1;
        }
        if (var3 == 50) {
            class68 var18 = field1595[var4];
            if (var18 != null) {
                method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var18.field2734[0], var18.field2698[0], false, 0, 0, 1, 1, 0, 2);
                field1582 = class108.field1737;
                field1583 = class108.field1749;
                field1585 = 2;
                field1584 = 0;
                field1515.method2253(64);
                field1515.method401(var4);
            }
        }
        if (var3 == 17) {
            boolean var19 = method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var19) {
                method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field1582 = class108.field1737;
            field1583 = class108.field1749;
            field1585 = 2;
            field1584 = 0;
            field1515.method2253(237);
            field1515.method537(Statics.field2469 + var1);
            field1515.method562(Statics.field2659);
            field1515.method401(var4);
            field1515.method401(Statics.field622 + var2);
            field1515.method401(field1590);
        }
        if (var3 == 6) {
            method860(var1, var2, var4);
            field1515.method2253(105);
            field1515.method537(Statics.field2469 + var1);
            field1515.method358(Statics.field622 + var2);
            field1515.method358(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 1001) {
            method860(var1, var2, var4);
            field1515.method2253(25);
            field1515.method358(var4 >> 14 & 0x7FFF);
            field1515.method401(Statics.field2469 + var1);
            field1515.method401(Statics.field622 + var2);
        }
        if (var3 == 7) {
            class58 var21 = field1658[var4];
            if (var21 != null) {
                method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var21.field2734[0], var21.field2698[0], false, 0, 0, 1, 1, 0, 2);
                field1582 = class108.field1737;
                field1583 = class108.field1749;
                field1585 = 2;
                field1584 = 0;
                field1515.method2253(118);
                field1515.method537(Statics.field669);
                field1515.method584(var4);
                field1515.method456(Statics.field1426);
                field1515.method401(Statics.field1034);
            }
        }
        if (var3 == 33) {
            field1515.method2253(253);
            field1515.method537(var1);
            field1515.method411(var2);
            field1515.method401(var4);
            field1503 = 0;
            Statics.field1452 = class75.method1490(var2);
            field1513 = var1;
        }
        if (var3 == 1005) {
            class75 var22 = class75.method1490(var2);
            if (var22 == null || var22.field830[var1] < 100000) {
                field1515.method2253(221);
                field1515.method584(var4);
            } else {
                method862(0, "", var22.field830[var1] + " x " + class165.method3520(var4).field2482);
            }
            field1503 = 0;
            Statics.field1452 = class75.method1490(var2);
            field1513 = var1;
        }
        if (var3 == 26) {
            method2360();
        }
        if (var3 == 29) {
            field1515.method2253(86);
            field1515.method360(var2);
            class75 var23 = class75.method1490(var2);
            if (var23.field767 != null && var23.field767[0][0] == 5) {
                int var24 = var23.field767[0][1];
                if (class19.field88[var24] != var23.field758[0]) {
                    class19.field88[var24] = var23.field758[0];
                    method1546(var24);
                }
            }
        }
        if (var3 == 12) {
            class58 var25 = field1658[var4];
            if (var25 != null) {
                method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var25.field2734[0], var25.field2698[0], false, 0, 0, 1, 1, 0, 2);
                field1582 = class108.field1737;
                field1583 = class108.field1749;
                field1585 = 2;
                field1584 = 0;
                field1515.method2253(177);
                field1515.method537(var4);
            }
        }
        if (var3 == 36) {
            field1515.method2253(245);
            field1515.method401(var1);
            field1515.method584(var4);
            field1515.method360(var2);
            field1503 = 0;
            Statics.field1452 = class75.method1490(var2);
            field1513 = var1;
        }
        if (var3 == 23) {
            Statics.field2658.method2403(Statics.field1863, var1, var2);
        }
        if (var3 == 4) {
            method860(var1, var2, var4);
            field1515.method2253(29);
            field1515.method358(Statics.field2469 + var1);
            field1515.method401(Statics.field622 + var2);
            field1515.method537(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 2 && method860(var1, var2, var4)) {
            field1515.method2253(79);
            field1515.method401(Statics.field622 + var2);
            field1515.method584(field1590);
            field1515.method401(var4 >> 14 & 0x7FFF);
            field1515.method537(Statics.field2469 + var1);
            field1515.method411(Statics.field2659);
        }
        if (var3 == 11) {
            class58 var26 = field1658[var4];
            if (var26 != null) {
                method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var26.field2734[0], var26.field2698[0], false, 0, 0, 1, 1, 0, 2);
                field1582 = class108.field1737;
                field1583 = class108.field1749;
                field1585 = 2;
                field1584 = 0;
                field1515.method2253(66);
                field1515.method358(var4);
            }
        }
        if (var3 == 57 || var3 == 1007) {
            method3357(var4, var2, var1, field1624[arg0]);
        }
        if (var3 == 31) {
            field1515.method2253(78);
            field1515.method584(Statics.field1034);
            field1515.method401(Statics.field669);
            field1515.method562(Statics.field1426);
            field1515.method562(var2);
            field1515.method401(var1);
            field1515.method584(var4);
            field1503 = 0;
            Statics.field1452 = class75.method1490(var2);
            field1513 = var1;
        }
        if (var3 == 45) {
            class68 var27 = field1595[var4];
            if (var27 != null) {
                method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var27.field2734[0], var27.field2698[0], false, 0, 0, 1, 1, 0, 2);
                field1582 = class108.field1737;
                field1583 = class108.field1749;
                field1585 = 2;
                field1584 = 0;
                field1515.method2253(234);
                field1515.method358(var4);
            }
        }
        if (var3 == 40) {
            field1515.method2253(242);
            field1515.method401(var4);
            field1515.method456(var2);
            field1515.method537(var1);
            field1503 = 0;
            Statics.field1452 = class75.method1490(var2);
            field1513 = var1;
        }
        if (var3 == 5) {
            method860(var1, var2, var4);
            field1515.method2253(189);
            field1515.method584(Statics.field622 + var2);
            field1515.method537(Statics.field2469 + var1);
            field1515.method537(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 30 && field1639 == null) {
            field1515.method2253(103);
            field1515.method456(var2);
            field1515.method358(var1);
            field1639 = class75.method811(var2, var1);
            method319(field1639);
        }
        if (var3 == 8) {
            class58 var28 = field1658[var4];
            if (var28 != null) {
                method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var28.field2734[0], var28.field2698[0], false, 0, 0, 1, 1, 0, 2);
                field1582 = class108.field1737;
                field1583 = class108.field1749;
                field1585 = 2;
                field1584 = 0;
                field1515.method2253(95);
                field1515.method401(field1590);
                field1515.method360(Statics.field2659);
                field1515.method537(var4);
            }
        }
        if (var3 == 41) {
            field1515.method2253(182);
            field1515.method584(var4);
            field1515.method411(var2);
            field1515.method401(var1);
            field1503 = 0;
            Statics.field1452 = class75.method1490(var2);
            field1513 = var1;
        }
        if (var3 == 51) {
            class68 var29 = field1595[var4];
            if (var29 != null) {
                method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var29.field2734[0], var29.field2698[0], false, 0, 0, 1, 1, 0, 2);
                field1582 = class108.field1737;
                field1583 = class108.field1749;
                field1585 = 2;
                field1584 = 0;
                field1515.method2253(205);
                field1515.method401(var4);
            }
        }
        if (var3 == 16) {
            boolean var30 = method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var30) {
                method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field1582 = class108.field1737;
            field1583 = class108.field1749;
            field1585 = 2;
            field1584 = 0;
            field1515.method2253(70);
            field1515.method401(Statics.field622 + var2);
            field1515.method358(Statics.field2469 + var1);
            field1515.method584(Statics.field669);
            field1515.method401(Statics.field1034);
            field1515.method584(var4);
            field1515.method411(Statics.field1426);
        }
        if (var3 == 58) {
            field1515.method2253(162);
            field1515.method562(Statics.field2659);
            field1515.method358(var1);
            field1515.method401(field1590);
            field1515.method360(var2);
        }
        if (var3 == 22) {
            boolean var32 = method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var32) {
                method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field1582 = class108.field1737;
            field1583 = class108.field1749;
            field1585 = 2;
            field1584 = 0;
            field1515.method2253(252);
            field1515.method584(Statics.field2469 + var1);
            field1515.method537(Statics.field622 + var2);
            field1515.method401(var4);
        }
        if (var3 == 32) {
            field1515.method2253(57);
            field1515.method411(Statics.field2659);
            field1515.method360(var2);
            field1515.method584(var4);
            field1515.method537(field1590);
            field1515.method537(var1);
            field1503 = 0;
            Statics.field1452 = class75.method1490(var2);
            field1513 = var1;
        }
        if (var3 == 48) {
            class68 var34 = field1595[var4];
            if (var34 != null) {
                method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var34.field2734[0], var34.field2698[0], false, 0, 0, 1, 1, 0, 2);
                field1582 = class108.field1737;
                field1583 = class108.field1749;
                field1585 = 2;
                field1584 = 0;
                field1515.method2253(32);
                field1515.method401(var4);
            }
        }
        if (var3 == 14) {
            class68 var35 = field1595[var4];
            if (var35 != null) {
                method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var35.field2734[0], var35.field2698[0], false, 0, 0, 1, 1, 0, 2);
                field1582 = class108.field1737;
                field1583 = class108.field1749;
                field1585 = 2;
                field1584 = 0;
                field1515.method2253(141);
                field1515.method401(var4);
                field1515.method456(Statics.field1426);
                field1515.method401(Statics.field669);
                field1515.method401(Statics.field1034);
            }
        }
        if (var3 == 25) {
            class75 var36 = class75.method811(var2, var1);
            if (var36 != null) {
                method1310();
                int var37 = method855(var36);
                int var38 = var37 >> 11 & 0x3F;
                class75 var40 = class75.method811(var2, var1);
                if (var40 != null && var40.field805 != null) {
                    class72 var41 = new class72();
                    var41.field682 = var40;
                    var41.field678 = var40.field805;
                    class65.method1306(var41);
                }
                field1631 = true;
                Statics.field2659 = var2;
                field1590 = var1;
                Statics.field2448 = var38;
                method319(var40);
                field1629 = 0;
                int var42 = method855(var36);
                int var43 = var42 >> 11 & 0x3F;
                String var44;
                if (var43 == 0) {
                    var44 = null;
                } else if (var36.field827 == null || var36.field827.trim().length() == 0) {
                    var44 = null;
                } else {
                    var44 = var36.field827;
                }
                field1606 = var44;
                if (field1606 == null) {
                    field1606 = "Null";
                }
                if (var36.field726) {
                    field1634 = var36.field787 + class94.method2110(16777215);
                } else {
                    field1634 = class94.method2110(65280) + var36.field717 + class94.method2110(16777215);
                }
            }
        } else if (var3 == 38) {
            method1310();
            class75 var45 = class75.method1490(var2);
            field1629 = 1;
            Statics.field1034 = var1;
            Statics.field1426 = var2;
            Statics.field669 = var4;
            method319(var45);
            field1630 = class94.method2110(16748608) + class165.method3520(var4).field2482 + class94.method2110(16777215);
            if (field1630 == null) {
                field1630 = "null";
            }
        } else {
            if (var3 == 1003) {
                field1582 = class108.field1737;
                field1583 = class108.field1749;
                field1585 = 2;
                field1584 = 0;
                class58 var46 = field1658[var4];
                if (var46 != null) {
                    class183 var47 = var46.field501;
                    if (var47.field2775 != null) {
                        var47 = var47.method3482();
                    }
                    if (var47 != null) {
                        field1515.method2253(6);
                        field1515.method537(var47.field2754);
                    }
                }
            }
            if (var3 == 13) {
                class58 var48 = field1658[var4];
                if (var48 != null) {
                    method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var48.field2734[0], var48.field2698[0], false, 0, 0, 1, 1, 0, 2);
                    field1582 = class108.field1737;
                    field1583 = class108.field1749;
                    field1585 = 2;
                    field1584 = 0;
                    field1515.method2253(217);
                    field1515.method537(var4);
                }
            }
            if (var3 == 10) {
                class58 var49 = field1658[var4];
                if (var49 != null) {
                    method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var49.field2734[0], var49.field2698[0], false, 0, 0, 1, 1, 0, 2);
                    field1582 = class108.field1737;
                    field1583 = class108.field1749;
                    field1585 = 2;
                    field1584 = 0;
                    field1515.method2253(243);
                    field1515.method401(var4);
                }
            }
            if (var3 == 18) {
                boolean var50 = method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
                if (!var50) {
                    method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
                }
                field1582 = class108.field1737;
                field1583 = class108.field1749;
                field1585 = 2;
                field1584 = 0;
                field1515.method2253(133);
                field1515.method537(Statics.field622 + var2);
                field1515.method358(Statics.field2469 + var1);
                field1515.method401(var4);
            }
            if (var3 == 20) {
                boolean var52 = method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
                if (!var52) {
                    method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
                }
                field1582 = class108.field1737;
                field1583 = class108.field1749;
                field1585 = 2;
                field1584 = 0;
                field1515.method2253(23);
                field1515.method584(Statics.field622 + var2);
                field1515.method401(var4);
                field1515.method584(Statics.field2469 + var1);
            }
            if (var3 == 9) {
                class58 var54 = field1658[var4];
                if (var54 != null) {
                    method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var54.field2734[0], var54.field2698[0], false, 0, 0, 1, 1, 0, 2);
                    field1582 = class108.field1737;
                    field1583 = class108.field1749;
                    field1585 = 2;
                    field1584 = 0;
                    field1515.method2253(178);
                    field1515.method537(var4);
                }
            }
            if (field1629 != 0) {
                field1629 = 0;
                method319(class75.method1490(Statics.field1426));
            }
            if (field1631) {
                method1310();
            }
            if (Statics.field1452 != null && field1503 == 0) {
                method319(Statics.field1452);
            }
        }
    }

    @ObfuscatedName("g.aa(I)V")
    public static final void method812() {
        if (field1478 && Statics.field1863 != field1527) {
            Statics.method937(Statics.field2661, Statics.field2029, Statics.field1863, Statics.field387.field2734[0], Statics.field387.field2698[0]);
        } else if (Statics.field1863 != field1702) {
            field1702 = Statics.field1863;
            method1186(Statics.field1863);
        }
    }

    @ObfuscatedName("g.de(Lfb;I)Ljava/lang/String;")
    public static String method813(class75 arg0) {
        int var1 = method855(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field827 == null || arg0.field827.trim().length() == 0) {
            return null;
        } else {
            return arg0.field827;
        }
    }

    @ObfuscatedName("d.bm(B)V")
    public static final void method820() {
        field1603 = 0;
        field1514 = 0;
        field1517.method2275();
        int var0 = field1517.method2270(1);
        if (var0 != 0) {
            int var1 = field1517.method2270(2);
            if (var1 == 0) {
                field1599[++field1514 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field1517.method2270(3);
                Statics.field387.method3444(var2, false);
                int var3 = field1517.method2270(1);
                if (var3 == 1) {
                    field1599[++field1514 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field1517.method2270(3);
                Statics.field387.method3444(var4, true);
                int var5 = field1517.method2270(3);
                Statics.field387.method3444(var5, true);
                int var6 = field1517.method2270(1);
                if (var6 == 1) {
                    field1599[++field1514 - 1] = 2047;
                }
            } else if (var1 == 3) {
                int var7 = field1517.method2270(7);
                int var8 = field1517.method2270(1);
                if (var8 == 1) {
                    field1599[++field1514 - 1] = 2047;
                }
                Statics.field1863 = field1517.method2270(2);
                int var9 = field1517.method2270(1);
                int var10 = field1517.method2270(7);
                Statics.field387.method3435(var10, var7, var9 == 1);
            }
        }
        int var11 = field1517.method2270(8);
        if (var11 < field1562) {
            for (int var12 = var11; var12 < field1562; var12++) {
                field1473[++field1603 - 1] = field1605[var12];
            }
        }
        if (var11 > field1562) {
            throw new RuntimeException("");
        }
        field1562 = 0;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = field1605[var13];
            class68 var15 = field1595[var14];
            int var16 = field1517.method2270(1);
            if (var16 == 0) {
                field1605[++field1562 - 1] = var14;
                var15.field2728 = field1483;
            } else {
                int var17 = field1517.method2270(2);
                if (var17 == 0) {
                    field1605[++field1562 - 1] = var14;
                    var15.field2728 = field1483;
                    field1599[++field1514 - 1] = var14;
                } else if (var17 == 1) {
                    field1605[++field1562 - 1] = var14;
                    var15.field2728 = field1483;
                    int var18 = field1517.method2270(3);
                    var15.method3444(var18, false);
                    int var19 = field1517.method2270(1);
                    if (var19 == 1) {
                        field1599[++field1514 - 1] = var14;
                    }
                } else if (var17 == 2) {
                    field1605[++field1562 - 1] = var14;
                    var15.field2728 = field1483;
                    int var20 = field1517.method2270(3);
                    var15.method3444(var20, true);
                    int var21 = field1517.method2270(3);
                    var15.method3444(var21, true);
                    int var22 = field1517.method2270(1);
                    if (var22 == 1) {
                        field1599[++field1514 - 1] = var14;
                    }
                } else if (var17 == 3) {
                    field1473[++field1603 - 1] = var14;
                }
            }
        }
        while (field1517.method2258(field1518) >= 11) {
            int var23 = field1517.method2270(11);
            if (var23 == 2047) {
                break;
            }
            boolean var27 = false;
            if (field1595[var23] == null) {
                field1595[var23] = new class68();
                if (field1642[var23] != null) {
                    field1595[var23].method919(field1642[var23]);
                }
                var27 = true;
            }
            field1605[++field1562 - 1] = var23;
            class68 var28 = field1595[var23];
            var28.field2728 = field1483;
            int var29 = field1517.method2270(5);
            if (var29 > 15) {
                var29 -= 32;
            }
            int var30 = field1608[field1517.method2270(3)];
            if (var27) {
                var28.field2707 = var28.field2684 = var30;
            }
            int var31 = field1517.method2270(1);
            int var32 = field1517.method2270(5);
            if (var32 > 15) {
                var32 -= 32;
            }
            int var33 = field1517.method2270(1);
            if (var33 == 1) {
                field1599[++field1514 - 1] = var23;
            }
            var28.method3435(Statics.field387.field2734[0] + var32, Statics.field387.field2698[0] + var29, var31 == 1);
        }
        field1517.method2266();
        method2893();
        for (int var24 = 0; var24 < field1603; var24++) {
            int var25 = field1473[var24];
            if (field1483 != field1595[var25].field2728) {
                field1595[var25] = null;
            }
        }
        if (field1518 != field1517.field172) {
            throw new RuntimeException(field1517.field172 + class94.field1088 + field1518);
        }
        for (int var26 = 0; var26 < field1562; var26++) {
            if (field1595[field1605[var26]] == null) {
                throw new RuntimeException(var26 + class94.field1088 + field1562);
            }
        }
    }

    @ObfuscatedName("e.ca(II)Z")
    public static boolean method826(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("e.bp(ILo;IB)V")
    public static final void method852(int arg0, class68 arg1, int arg2) {
        if ((arg2 & 0x8) != 0) {
            arg1.field2706 = field1517.method365();
            arg1.field2708 = field1517.method430();
        }
        if ((arg2 & 0x200) != 0) {
            int var3 = field1517.method512();
            int var4 = field1517.method394();
            arg1.method3440(var3, var4, field1483);
            arg1.field2702 = field1483 + 300;
            arg1.field2740 = field1517.method396();
            arg1.field2704 = field1517.method394();
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field2703 = field1517.method476();
            arg1.field2723 = field1517.method476();
            arg1.field2722 = field1517.method396();
            arg1.field2724 = field1517.method394();
            arg1.field2725 = field1517.method430() + field1483;
            arg1.field2730 = field1517.method365() + field1483;
            arg1.field2727 = field1517.method394();
            arg1.field2689 = 1;
            arg1.field2738 = 0;
        }
        if ((arg2 & 0x20) != 0) {
            int var5 = field1517.method410();
            int var6 = field1517.method394();
            int var7 = field1517.method476();
            int var8 = field1517.field172;
            if (arg1.field632 != null && arg1.field633 != null) {
                boolean var9 = false;
                if (var6 <= 1 && method1354(arg1.field632)) {
                    var9 = true;
                }
                if (!var9 && field1594 == 0) {
                    field1499.field172 = 0;
                    field1517.method417(field1499.field168, 0, var7);
                    field1499.field172 = 0;
                    class31 var10 = field1499;
                    String var11 = class24.method1179(var10, 32767);
                    String var12 = class6.method61(class99.method587(var11));
                    arg1.field2695 = var12.trim();
                    arg1.field2686 = var5 >> 8;
                    arg1.field2712 = var5 & 0xFF;
                    arg1.field2696 = 150;
                    if (var6 == 2 || var6 == 3) {
                        method862(1, class94.method1167(1) + arg1.field632, var12);
                    } else if (var6 == 1) {
                        method862(1, class94.method1167(0) + arg1.field632, var12);
                    } else {
                        method862(2, arg1.field632, var12);
                    }
                }
            }
            field1517.field172 = var7 + var8;
        }
        if ((arg2 & 0x80) != 0) {
            int var13 = field1517.method373();
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = field1517.method394();
            method1053(arg1, var13, var14);
        }
        if ((arg2 & 0x1) != 0) {
            int var15 = field1517.method512();
            int var16 = field1517.method476();
            arg1.method3440(var15, var16, field1483);
            arg1.field2702 = field1483 + 300;
            arg1.field2740 = field1517.method396();
            arg1.field2704 = field1517.method476();
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field2695 = field1517.method379();
            if (arg1.field2695.charAt(0) == '~') {
                arg1.field2695 = arg1.field2695.substring(1);
                method862(2, arg1.field632, arg1.field2695);
            } else if (Statics.field387 == arg1) {
                method862(2, arg1.field632, arg1.field2695);
            }
            arg1.field2686 = 0;
            arg1.field2712 = 0;
            arg1.field2696 = 150;
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field2716 = field1517.method430();
            int var17 = field1517.method415();
            arg1.field2720 = var17 >> 16;
            arg1.field2693 = (var17 & 0xFFFF) + field1483;
            arg1.field2717 = 0;
            arg1.field2718 = 0;
            if (arg1.field2693 > field1483) {
                arg1.field2717 = -1;
            }
            if (arg1.field2716 == 65535) {
                arg1.field2716 = -1;
            }
        }
        if ((arg2 & 0x4) != 0) {
            arg1.field2705 = field1517.method430();
            if (arg1.field2705 == 65535) {
                arg1.field2705 = -1;
            }
        }
        if ((arg2 & 0x2) == 0) {
            return;
        }
        int var18 = field1517.method512();
        byte[] var19 = new byte[var18];
        class31 var20 = new class31(var19);
        field1517.method416(var19, 0, var18);
        field1642[arg0] = var20;
        arg1.method919(var20);
    }

    @ObfuscatedName("b.du(Lfb;I)I")
    public static int method855(class75 arg0) {
        class20 var1 = (class20) field1675.method20(((long) arg0.field727 << 32) + (long) arg0.field728);
        return var1 == null ? arg0.field833 : var1.field90;
    }

    @ObfuscatedName("b.cm(Lt;ZI)V")
    public static final void method856(class86 arg0, boolean arg1) {
        int var2 = arg0.field1000;
        int var3 = (int) arg0.field11;
        arg0.method44();
        if (arg1) {
            class75.method292(var2);
        }
        method2109(var2);
        class75 var4 = class75.method1490(var3);
        if (var4 != null) {
            method319(var4);
        }
        method2856();
        if (field1635 != -1) {
            int var5 = field1635;
            if (class75.method299(var5)) {
                method3166(Statics.field826[var5], 1);
            }
        }
    }

    @ObfuscatedName("b.bh(IIII)Z")
    public static final boolean method860(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field2658.method2396(Statics.field1863, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class184 var7 = Statics.method2861(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field2804;
                var9 = var7.field2834;
            } else {
                var8 = var7.field2834;
                var9 = var7.field2804;
            }
            int var10 = var7.field2805;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method999(Statics.field387.field2734[0], Statics.field387.field2698[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method999(Statics.field387.field2734[0], Statics.field387.field2698[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field1582 = class108.field1737;
        field1583 = class108.field1749;
        field1585 = 2;
        field1584 = 0;
        return true;
    }

    @ObfuscatedName("b.dl(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method862(int arg0, String arg1, String arg2) {
        Statics.method1493(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("c.v(II)V")
    public static void method869(int arg0) {
        if (arg0 == -3) {
            Statics.method2889(class98.field1169, class98.field1170, class98.field1171);
        } else if (arg0 == -2) {
            Statics.method2889(class98.field1257, class98.field1173, class98.field1299);
        } else if (arg0 == -1) {
            Statics.method2889(class98.field1175, class98.field1198, class98.field1177);
        } else if (arg0 == 3) {
            Statics.method2889(class98.field1178, class98.field1179, class98.field1180);
        } else if (arg0 == 4) {
            Statics.method2889(class98.field1181, class98.field1182, class98.field1183);
        } else if (arg0 == 5) {
            Statics.method2889(class98.field1351, class98.field1185, class98.field1186);
        } else if (arg0 == 6) {
            Statics.method2889(class98.field1145, class98.field1309, class98.field1323);
        } else if (arg0 == 7) {
            Statics.method2889(class98.field1269, class98.field1191, class98.field1192);
        } else if (arg0 == 8) {
            Statics.method2889(class98.field1213, class98.field1276, class98.field1291);
        } else if (arg0 == 9) {
            Statics.method2889(class98.field1196, class98.field1344, class98.field1237);
        } else if (arg0 == 10) {
            Statics.method2889(class98.field1199, class98.field1345, class98.field1295);
        } else if (arg0 == 11) {
            Statics.method2889(class98.field1139, class98.field1203, class98.field1204);
        } else if (arg0 == 12) {
            Statics.method2889(class98.field1205, class98.field1206, class98.field1207);
        } else if (arg0 == 13) {
            Statics.method2889(class98.field1208, class98.field1322, class98.field1270);
        } else if (arg0 == 14) {
            Statics.method2889(class98.field1211, class98.field1212, class98.field1190);
        } else if (arg0 == 16) {
            Statics.method2889(class98.field1195, class98.field1215, class98.field1216);
        } else if (arg0 == 17) {
            Statics.method2889(class98.field1217, class98.field1218, class98.field1219);
        } else if (arg0 == 18) {
            Statics.method2889(class98.field1202, class98.field1221, class98.field1222);
        } else if (arg0 == 19) {
            Statics.method2889(class98.field1223, class98.field1224, class98.field1225);
        } else if (arg0 == 20) {
            Statics.method2889(class98.field1226, class98.field1227, class98.field1228);
        } else if (arg0 == 22) {
            Statics.method2889(class98.field1229, class98.field1318, class98.field1231);
        } else if (arg0 == 23) {
            Statics.method2889(class98.field1252, class98.field1335, class98.field1234);
        } else if (arg0 == 24) {
            Statics.method2889(class98.field1235, class98.field1236, class98.field1250);
        } else if (arg0 == 25) {
            Statics.method2889(class98.field1189, class98.field1136, class98.field1240);
        } else if (arg0 == 26) {
            Statics.method2889(class98.field1241, class98.field1298, class98.field1264);
        } else if (arg0 == 27) {
            Statics.method2889(class98.field1244, class98.field1245, class98.field1246);
        } else if (arg0 == 31) {
            Statics.method2889(class98.field1209, class98.field1254, class98.field1255);
        } else if (arg0 == 32) {
            Statics.method2889(class98.field1308, class98.field1242, class98.field1251);
        } else if (arg0 == 37) {
            Statics.method2889(class98.field1343, class98.field1260, class98.field1261);
        } else if (arg0 == 38) {
            Statics.method2889(class98.field1262, class98.field1263, class98.field1163);
        } else if (arg0 == 55) {
            Statics.method2889(class98.field1265, class98.field1232, class98.field1239);
        } else {
            Statics.method2889(class98.field1329, class98.field1197, class98.field1279);
        }
        method931(10);
    }

    @ObfuscatedName("a.i(IZZZI)Len;")
    public static class97 method896(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class121 var4 = null;
        if (class150.field2257 != null) {
            var4 = new class121(arg0, class150.field2257, Statics.field1461[arg0], 1000000);
        }
        return new class97(var4, Statics.field1885, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("n.do(IIIILcs;B)V")
    public static final void method900(int arg0, int arg1, int arg2, int arg3, class143 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method618(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field1600 + field1549 & 0x7FF;
        int var7 = class151.field2285[var6];
        int var8 = class151.field2286[var6];
        int var9 = var7 * 256 / (field1730 + 256);
        int var10 = var8 * 256 / (field1730 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field2679.method2631(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("o.cu([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method927(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("l.d(IIII)V")
    public static void method930(int arg0, int arg1, int arg2) {
        if (field1713 == 0 || arg1 == 0 || field1719 >= 50) {
            return;
        }
        field1612[field1719] = arg0;
        field1492[field1719] = arg1;
        field1718[field1719] = arg2;
        field1720[field1719] = null;
        field1691[field1719] = 0;
        field1719++;
    }

    @ObfuscatedName("l.f(II)V")
    public static void method931(int arg0) {
        if (field1693 == arg0) {
            return;
        }
        if (field1693 == 0) {
            Statics.field2400 = null;
            Statics.field2583 = null;
            Statics.field1851 = null;
        }
        if (arg0 == 20 || arg0 == 40) {
            field1506 = 0;
            field1507 = 0;
            field1508 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1722 != null) {
            Statics.field1722.method1979();
            Statics.field1722 = null;
        }
        if (field1693 == 25) {
            field1723 = 0;
            field1528 = 0;
            field1529 = 1;
            field1498 = 0;
            field1531 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class103.method1944(Statics.field2359, Statics.field2345, Statics.field887);
        } else {
            class103.method1353();
        }
        field1693 = arg0;
    }

    @ObfuscatedName("l.cs(II)Ljava/lang/String;")
    public static final String method932(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class94.field1088 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class94.method2110(65408) + var1.substring(0, var1.length() - 8) + class98.field1311 + " " + class94.field1087 + var1 + class94.field1090 + class94.field1093;
        } else if (var1.length() > 6) {
            return " " + class94.method2110(16777215) + var1.substring(0, var1.length() - 4) + class98.field1289 + " " + class94.field1087 + var1 + class94.field1090 + class94.field1093;
        } else {
            return " " + class94.method2110(16776960) + var1 + class94.field1093;
        }
    }

    @ObfuscatedName("l.ad(Laa;B)V")
    public static final void method935(class181 arg0) {
        if (arg0.field2732 == 0) {
            return;
        }
        if (arg0.field2705 != -1 && arg0.field2705 < 32768) {
            class58 var1 = field1658[arg0.field2705];
            if (var1 != null) {
                int var2 = arg0.field2735 - var1.field2735;
                int var3 = arg0.field2683 - var1.field2683;
                if (var2 != 0 || var3 != 0) {
                    arg0.field2707 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field2705 >= 32768) {
            int var4 = arg0.field2705 - 32768;
            if (field1541 == var4) {
                var4 = 2047;
            }
            class68 var5 = field1595[var4];
            if (var5 != null) {
                int var6 = arg0.field2735 - var5.field2735;
                int var7 = arg0.field2683 - var5.field2683;
                if (var6 != 0 || var7 != 0) {
                    arg0.field2707 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field2706 != 0 || arg0.field2708 != 0) && (arg0.field2689 == 0 || arg0.field2737 > 0)) {
            int var8 = arg0.field2735 - (arg0.field2706 * 64 - Statics.field2469 * 64 - Statics.field2469 * 64);
            int var9 = arg0.field2683 - (arg0.field2708 * 64 - Statics.field622 * 64 - Statics.field622 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field2707 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field2706 = 0;
            arg0.field2708 = 0;
        }
        int var10 = arg0.field2707 - arg0.field2684 & 0x7FF;
        if (var10 == 0) {
            arg0.field2731 = 0;
            return;
        }
        arg0.field2731++;
        if (var10 > 1024) {
            arg0.field2684 -= arg0.field2732;
            boolean var11 = true;
            if (var10 < arg0.field2732 || var10 > 2048 - arg0.field2732) {
                arg0.field2684 = arg0.field2707;
                var11 = false;
            }
            if (arg0.field2687 == arg0.field2682 && (arg0.field2731 > 25 || var11)) {
                if (arg0.field2688 == -1) {
                    arg0.field2682 = arg0.field2690;
                } else {
                    arg0.field2682 = arg0.field2688;
                }
            }
        } else {
            arg0.field2684 += arg0.field2732;
            boolean var12 = true;
            if (var10 < arg0.field2732 || var10 > 2048 - arg0.field2732) {
                arg0.field2684 = arg0.field2707;
                var12 = false;
            }
            if (arg0.field2687 == arg0.field2682 && (arg0.field2731 > 25 || var12)) {
                if (arg0.field2715 == -1) {
                    arg0.field2682 = arg0.field2690;
                } else {
                    arg0.field2682 = arg0.field2715;
                }
            }
        }
        arg0.field2684 &= 0x7FF;
    }

    @ObfuscatedName("k.be(IIIIZIIIIIIB)Z")
    public static final boolean method999(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field1538[var11][var12] = 0;
                field1539[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field1538[arg0][arg1] = 99;
        field1539[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field1540[var15] = arg0;
        int var36 = var15 + 1;
        field1732[var15] = arg1;
        boolean var17 = false;
        int var18 = field1540.length;
        int[][] var19 = field1533[Statics.field1863].field47;
        while (var36 != var16) {
            var13 = field1540[var16];
            var14 = field1732[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field1533[Statics.field1863].method209(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field1533[Statics.field1863].method182(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field1533[Statics.field1863].method176(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field1539[var13][var14] + 1;
            if (var13 > 0 && field1538[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field1540[var36] = var13 - 1;
                field1732[var36] = var14;
                var36 = (var36 + 1) % var18;
                field1538[var13 - 1][var14] = 2;
                field1539[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field1538[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field1540[var36] = var13 + 1;
                field1732[var36] = var14;
                var36 = (var36 + 1) % var18;
                field1538[var13 + 1][var14] = 8;
                field1539[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field1538[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field1540[var36] = var13;
                field1732[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field1538[var13][var14 - 1] = 1;
                field1539[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field1538[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field1540[var36] = var13;
                field1732[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field1538[var13][var14 + 1] = 4;
                field1539[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field1538[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field1540[var36] = var13 - 1;
                field1732[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field1538[var13 - 1][var14 - 1] = 3;
                field1539[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field1538[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field1540[var36] = var13 + 1;
                field1732[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field1538[var13 + 1][var14 - 1] = 9;
                field1539[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field1538[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field1540[var36] = var13 - 1;
                field1732[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field1538[var13 - 1][var14 + 1] = 6;
                field1539[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field1538[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field1540[var36] = var13 + 1;
                field1732[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field1538[var13 + 1][var14 + 1] = 12;
                field1539[var13 + 1][var14 + 1] = var20;
            }
        }
        field1537 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field1539[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg2) {
                            var26 = arg2 - var24;
                        } else if (var24 > arg2 + arg7 - 1) {
                            var26 = var24 - (arg2 + arg7 - 1);
                        }
                        int var27 = 0;
                        if (var25 < arg3) {
                            var27 = arg3 - var25;
                        } else if (var25 > arg3 + arg8 - 1) {
                            var27 = var25 - (arg3 + arg8 - 1);
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && field1539[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field1539[var24][var25];
                            var13 = var24;
                            var14 = var25;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg0 == var13 && arg1 == var14) {
                return false;
            }
            field1537 = 1;
        }
        byte var29 = 0;
        field1540[var29] = var13;
        int var37 = var29 + 1;
        field1732[var29] = var14;
        int var30;
        int var31 = var30 = field1538[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field1540[var37] = var13;
                field1732[var37++] = var14;
            }
            if ((var31 & 0x2) != 0) {
                var13++;
            } else if ((var31 & 0x8) != 0) {
                var13--;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            var31 = field1538[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field1540[var37];
            int var34 = field1732[var37];
            if (arg10 == 0) {
                field1515.method2253(172);
                field1515.method357(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field1515.method2253(222);
                field1515.method357(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field1515.method2253(40);
                field1515.method357(var32 + var32 + 3);
            }
            field1515.method584(Statics.field622 + var34);
            field1509 = field1540[0];
            field1708 = field1732[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field1515.method357(field1540[var37] - var33);
                field1515.method494(field1732[var37] - var34);
            }
            field1515.method357(class162.field2430[82] ? 1 : 0);
            field1515.method358(Statics.field2469 + var33);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("i.cq(B)V")
    public static void method1052() {
        for (class86 var0 = (class86) field1636.method25(); var0 != null; var0 = (class86) field1636.method23()) {
            int var1 = var0.field1000;
            if (class75.method299(var1)) {
                boolean var2 = true;
                class75[] var3 = Statics.field826[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field726;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field11;
                    class75 var6 = class75.method1490(var5);
                    if (var6 != null) {
                        method319(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.ai(Lo;IIB)V")
    public static void method1053(class68 arg0, int arg1, int arg2) {
        if (arg0.field2711 == arg1 && arg1 != -1) {
            int var3 = class166.method274(arg1).field2524;
            if (var3 == 1) {
                arg0.field2726 = 0;
                arg0.field2713 = 0;
                arg0.field2714 = arg2;
                arg0.field2709 = 0;
            }
            if (var3 == 2) {
                arg0.field2709 = 0;
            }
        } else if (arg1 == -1 || arg0.field2711 == -1 || class166.method274(arg1).field2549 >= class166.method274(arg0.field2711).field2549) {
            arg0.field2711 = arg1;
            arg0.field2726 = 0;
            arg0.field2713 = 0;
            arg0.field2714 = arg2;
            arg0.field2709 = 0;
            arg0.field2738 = arg0.field2689;
        }
    }

    @ObfuscatedName("i.ds(Lfb;I)Lfb;")
    public static class75 method1055(class75 arg0) {
        int var1 = class12.method320(method855(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class75.method1490(arg0.field738);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("i.bs(IIIII)V")
    public static final void method1056(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1523; var4++) {
            if (field1721[var4] + field1683[var4] > arg0 && field1721[var4] < arg0 + arg2 && field1684[var4] + field1682[var4] > arg1 && field1682[var4] < arg1 + arg3) {
                field1668[var4] = true;
            }
        }
    }

    @ObfuscatedName("eh.cg(II)V")
    public static final void method1074(int arg0) {
        if (class75.method299(arg0)) {
            method1919(Statics.field826[arg0], -1);
        }
    }

    @ObfuscatedName("eh.ak(ZI)V")
    public static final void method1077(boolean arg0) {
        method3467();
        field1521++;
        if (field1521 < 50 && !arg0) {
            return;
        }
        field1521 = 0;
        if (field1526 || Statics.field2646 == null) {
            return;
        }
        field1515.method2253(202);
        try {
            Statics.field2646.method1964(field1515.field168, 0, field1515.field172);
            field1515.field172 = 0;
        } catch (IOException var2) {
            field1526 = true;
        }
    }

    @ObfuscatedName("w.s(I)V")
    public static void method1079() {
        Statics.field2418 = new int[33];
        Statics.field856 = new int[33];
        Statics.field1049 = new int[151];
        Statics.field521 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field2184.field2182[Statics.field2184.field2180 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field2418[var0] = var1;
            Statics.field856[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field2184.field2182[Statics.field2184.field2180 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field1049[var4 - 5] = var5 - 25;
            Statics.field521[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("eg.cr(Lfb;IIIIIII)V")
    public static final void method1162(class75 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field1559) {
            field1598 = 32;
        } else {
            field1598 = 0;
        }
        field1559 = false;
        if (class108.field1750 != 0) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field718 -= 4;
                method319(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field718 += 4;
                method319(arg0);
            } else if (arg5 >= arg1 - field1598 && arg5 < field1598 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field718 = (arg4 - arg3) * var8 / var9;
                method319(arg0);
                field1559 = true;
            }
        }
        if (field1671 == 0) {
            return;
        }
        int var10 = arg0.field798;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field718 += field1671 * 45;
            method319(arg0);
        }
    }

    @ObfuscatedName("v.dv(Lfb;B)Z")
    public static boolean method1163(class75 arg0) {
        if (field1644) {
            if (method855(arg0) != 0) {
                return false;
            }
            if (arg0.field809 == 0) {
                return false;
            }
        }
        return arg0.field765;
    }

    @ObfuscatedName("v.bk(ILjava/lang/String;B)V")
    public static void method1165(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field1562; var3++) {
            class68 var4 = field1595[field1605[var3]];
            if (var4 != null && var4.field632 != null && var4.field632.equalsIgnoreCase(arg1)) {
                method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var4.field2734[0], var4.field2698[0], false, 0, 0, 1, 1, 0, 2);
                if (arg0 == 1) {
                    field1515.method2253(247);
                    field1515.method537(field1605[var3]);
                } else if (arg0 == 4) {
                    field1515.method2253(35);
                    field1515.method537(field1605[var3]);
                } else if (arg0 == 6) {
                    field1515.method2253(173);
                    field1515.method584(field1605[var3]);
                } else if (arg0 == 7) {
                    field1515.method2253(64);
                    field1515.method401(field1605[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            method862(0, "", class98.field1275 + arg1);
        }
    }

    @ObfuscatedName("u.q(Laq;IIIB)V")
    public static void method1178(class166 arg0, int arg1, int arg2, int arg3) {
        if (field1719 >= 50 || field1714 == 0 || arg0.field2545 == null || arg1 >= arg0.field2545.length) {
            return;
        }
        int var4 = arg0.field2545[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1612[field1719] = var5;
        field1492[field1719] = var6;
        field1718[field1719] = 0;
        field1720[field1719] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1691[field1719] = (var8 << 16) + (var9 << 8) + var7;
        field1719++;
    }

    @ObfuscatedName("ee.bl(I)V")
    public static final void method1182() {
        for (class61 var0 = (class61) field1610.method253(); var0 != null; var0 = (class61) field1610.method255()) {
            if (var0.field536 > 0) {
                var0.field536--;
            }
            if (var0.field536 == 0) {
                if (var0.field550 >= 0) {
                    int var1 = var0.field550;
                    int var2 = var0.field539;
                    class184 var3 = Statics.method2861(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method3494(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method1852(var0.field533, var0.field534, var0.field535, var0.field537, var0.field550, var0.field538, var0.field539);
                var0.method44();
            } else {
                if (var0.field543 > 0) {
                    var0.field543--;
                }
                if (var0.field543 == 0 && var0.field535 >= 1 && var0.field537 >= 1 && var0.field535 <= 102 && var0.field537 <= 102) {
                    if (var0.field540 >= 0) {
                        int var5 = var0.field540;
                        int var6 = var0.field542;
                        class184 var7 = Statics.method2861(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method3494(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method1852(var0.field533, var0.field534, var0.field535, var0.field537, var0.field540, var0.field541, var0.field542);
                    var0.field543 = -1;
                    if (var0.field550 == var0.field540 && var0.field550 == -1) {
                        var0.method44();
                    } else if (var0.field550 == var0.field540 && var0.field541 == var0.field538 && var0.field542 == var0.field539) {
                        var0.method44();
                    }
                }
            }
        }
    }

    @ObfuscatedName("t.ab(ZI)V")
    public static final void method1184(boolean arg0) {
        if (Statics.field387.field2735 >> 7 == field1509 && Statics.field387.field2683 >> 7 == field1708) {
            field1509 = 0;
        }
        int var1 = field1562;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class68 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field387;
                var4 = 33538048;
            } else {
                var3 = field1595[field1605[var2]];
                var4 = field1605[var2] << 14;
            }
            if (var3 != null && var3.method821()) {
                var3.field646 = false;
                if ((field1478 && field1562 > 50 || field1562 > 200) && !arg0 && var3.field2687 == var3.field2682) {
                    var3.field646 = true;
                }
                int var5 = var3.field2735 >> 7;
                int var6 = var3.field2683 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field641 == null || field1483 < var3.field636 || field1483 >= var3.field637) {
                        if ((var3.field2735 & 0x7F) == 64 && (var3.field2683 & 0x7F) == 64) {
                            if (field1579 == field1628[var5][var6]) {
                                continue;
                            }
                            field1628[var5][var6] = field1579;
                        }
                        var3.field643 = method1185(var3.field2735, var3.field2683, Statics.field1863);
                        Statics.field2658.method2495(Statics.field1863, var3.field2735, var3.field2683, var3.field643, 60, var3, var3.field2684, var4, var3.field2721);
                    } else {
                        var3.field646 = false;
                        var3.field643 = method1185(var3.field2735, var3.field2683, Statics.field1863);
                        Statics.field2658.method2378(Statics.field1863, var3.field2735, var3.field2683, var3.field643, 60, var3, var3.field2684, var4, var3.field642, var3.field630, var3.field644, var3.field645);
                    }
                }
            }
        }
    }

    @ObfuscatedName("t.av(IIII)I")
    public static final int method1185(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class60.field512[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class60.field511[var5][var3][var4] + class60.field511[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class60.field511[var5][var3][var4 + 1] + class60.field511[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("t.ao(II)V")
    public static final void method1186(int arg0) {
        int[] var1 = Statics.field1040.field2171;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class60.field512[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field2658.method2400(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class60.field512[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field2658.method2400(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1040.method2695();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class60.field512[arg0][var10][var9] & 0x18) == 0) {
                    method1542(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class60.field512[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method1542(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1703 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field2658.method2458(Statics.field1863, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = Statics.method2861(var14).field2817;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field1533[Statics.field1863].field47;
                            for (int var19 = 0; var19 < 10; var19++) {
                                int var20 = (int) (Math.random() * 4.0D);
                                if (var20 == 0 && var16 > 0 && var16 > var11 - 3 && (var18[var16 - 1][var17] & 0x12C0108) == 0) {
                                    var16--;
                                }
                                if (var20 == 1 && var16 < 103 && var16 < var11 + 3 && (var18[var16 + 1][var17] & 0x12C0180) == 0) {
                                    var16++;
                                }
                                if (var20 == 2 && var17 > 0 && var17 > var12 - 3 && (var18[var16][var17 - 1] & 0x12C0102) == 0) {
                                    var17--;
                                }
                                if (var20 == 3 && var17 < 103 && var17 < var12 + 3 && (var18[var16][var17 + 1] & 0x12C0120) == 0) {
                                    var17++;
                                }
                            }
                        }
                        field1706[field1703] = Statics.field2665[var15];
                        field1472[field1703] = var16;
                        field1593[field1703] = var17;
                        field1703++;
                    }
                }
            }
        }
        Statics.field879.method2282();
    }

    @ObfuscatedName("s.cy(Ljava/lang/String;Lfb;I)Ljava/lang/String;")
    public static String method1309(String arg0, class75 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2090(arg1, var2 - 1);
                    String var6;
                    if (var5 < 999999999) {
                        var6 = Integer.toString(var5);
                    } else {
                        var6 = "*";
                    }
                    arg0 = var4 + var6 + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var7 = arg0.indexOf("%dns");
                if (var7 == -1) {
                    break;
                }
                String var8 = "";
                if (Statics.field708 != null) {
                    var8 = class99.method3211(Statics.field708.field1463);
                    if (Statics.field708.field1471 != null) {
                        var8 = (String) Statics.field708.field1471;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("s.bv(I)V")
    public static void method1310() {
        if (!field1631) {
            return;
        }
        class75 var0 = class75.method811(Statics.field2659, field1590);
        if (var0 != null && var0.field806 != null) {
            class72 var1 = new class72();
            var1.field682 = var0;
            var1.field678 = var0.field806;
            class65.method1306(var1);
        }
        field1631 = false;
        method319(var0);
    }

    @ObfuscatedName("q.bf(B)V")
    public static final void method1336() {
        for (class61 var0 = (class61) field1610.method253(); var0 != null; var0 = (class61) field1610.method255()) {
            if (var0.field536 == -1) {
                var0.field543 = 0;
                method2005(var0);
            } else {
                var0.method44();
            }
        }
    }

    @ObfuscatedName("p.dr(Ljava/lang/String;B)Z")
    public static boolean method1354(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class57.method1168(arg0, Statics.field1104);
        for (int var2 = 0; var2 < field1731; var2++) {
            class105 var3 = field1474[var2];
            if (var1.equalsIgnoreCase(class57.method1168(var3.field1449, Statics.field1104))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class57.method1168(var3.field1444, Statics.field1104))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("em.ay(Ljava/lang/String;ZI)V")
    public static final void method1447(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1446.method59(arg0, 250);
        int var6 = Statics.field1446.method151(arg0, 250) * 13;
        class139.method2353(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class139.method2309(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1446.method65(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1056(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method2727(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field2359.getGraphics();
            Statics.field879.method2293(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field2359.repaint();
        }
    }

    @ObfuscatedName("eq.af(IIIIII)V")
    public static final void method1542(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2658.method2392(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2658.method2396(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1040.field2171;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class184 var13 = Statics.method2861(var12);
            if (var13.field2800 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var7 == 0) {
                        var10[var11] = var9;
                        var10[var11 + 512] = var9;
                        var10[var11 + 1024] = var9;
                        var10[var11 + 1536] = var9;
                    } else if (var7 == 1) {
                        var10[var11] = var9;
                        var10[var11 + 1] = var9;
                        var10[var11 + 2] = var9;
                        var10[var11 + 3] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 3] = var9;
                        var10[var11 + 3 + 512] = var9;
                        var10[var11 + 3 + 1024] = var9;
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 3) {
                        var10[var11 + 1536] = var9;
                        var10[var11 + 1536 + 1] = var9;
                        var10[var11 + 1536 + 2] = var9;
                        var10[var11 + 1536 + 3] = var9;
                    }
                }
                if (var8 == 3) {
                    if (var7 == 0) {
                        var10[var11] = var9;
                    } else if (var7 == 1) {
                        var10[var11 + 3] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 3) {
                        var10[var11 + 1536] = var9;
                    }
                }
                if (var8 == 2) {
                    if (var7 == 3) {
                        var10[var11] = var9;
                        var10[var11 + 512] = var9;
                        var10[var11 + 1024] = var9;
                        var10[var11 + 1536] = var9;
                    } else if (var7 == 0) {
                        var10[var11] = var9;
                        var10[var11 + 1] = var9;
                        var10[var11 + 2] = var9;
                        var10[var11 + 3] = var9;
                    } else if (var7 == 1) {
                        var10[var11 + 3] = var9;
                        var10[var11 + 3 + 512] = var9;
                        var10[var11 + 3 + 1024] = var9;
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 1536] = var9;
                        var10[var11 + 1536 + 1] = var9;
                        var10[var11 + 1536 + 2] = var9;
                        var10[var11 + 1536 + 3] = var9;
                    }
                }
            } else {
                class145 var14 = Statics.field2476[var13.field2800];
                if (var14 != null) {
                    int var15 = (var13.field2804 * 4 - var14.field2180) / 2;
                    int var16 = (var13.field2834 * 4 - var14.field2178) / 2;
                    var14.method2710(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field2834) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2658.method2394(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2658.method2396(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class184 var22 = Statics.method2861(var21);
            if (var22.field2800 != -1) {
                class145 var23 = Statics.field2476[var22.field2800];
                if (var23 != null) {
                    int var24 = (var22.field2804 * 4 - var23.field2180) / 2;
                    int var25 = (var22.field2834 * 4 - var23.field2178) / 2;
                    var23.method2710(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field2834) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1040.field2171;
                int var28 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var19 == 0 || var19 == 2) {
                    var27[var28 + 1536] = var26;
                    var27[var28 + 1024 + 1] = var26;
                    var27[var28 + 512 + 2] = var26;
                    var27[var28 + 3] = var26;
                } else {
                    var27[var28] = var26;
                    var27[var28 + 512 + 1] = var26;
                    var27[var28 + 1024 + 2] = var26;
                    var27[var28 + 1536 + 3] = var26;
                }
            }
        }
        int var29 = Statics.field2658.method2458(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class184 var31 = Statics.method2861(var30);
        if (var31.field2800 == -1) {
            return;
        }
        class145 var32 = Statics.field2476[var31.field2800];
        if (var32 != null) {
            int var33 = (var31.field2804 * 4 - var32.field2180) / 2;
            int var34 = (var31.field2834 * 4 - var32.field2178) / 2;
            var32.method2710(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field2834) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("x.di(Ljava/lang/String;B)V")
    public static final void method1545(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class57.method1168(arg0, Statics.field1104);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1727; var2++) {
            class74 var3 = field1729[var2];
            String var4 = var3.field705;
            String var5 = class57.method1168(var4, Statics.field1104);
            if (class95.method1548(arg0, var1, var4, var5)) {
                field1727--;
                for (int var6 = var2; var6 < field1727; var6++) {
                    field1729[var6] = field1729[var6 + 1];
                }
                field1666 = field1578;
                field1515.method2253(194);
                field1515.method357(class31.method1333(arg0));
                field1515.method506(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("x.cb(IB)V")
    public static final void method1546(int arg0) {
        method1052();
        for (class66 var1 = (class66) class66.field621.method253(); var1 != null; var1 = (class66) class66.field621.method255()) {
            if (var1.field619 != null) {
                var1.method898();
            }
        }
        int var2 = class179.method3127(arg0).field2664;
        if (var2 == 0) {
            return;
        }
        int var3 = class19.field88[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class151.method2791(0.9D);
                ((class52) Statics.field2276).method756(0.9D);
            }
            if (var3 == 2) {
                class151.method2791(0.8D);
                ((class52) Statics.field2276).method756(0.8D);
            }
            if (var3 == 3) {
                class151.method2791(0.7D);
                ((class52) Statics.field2276).method756(0.7D);
            }
            if (var3 == 4) {
                class151.method2791(0.6D);
                ((class52) Statics.field2276).method756(0.6D);
            }
            class165.method2769();
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (field1530 != var4) {
                if (field1530 == 0 && field1711 != -1) {
                    class79.method3142(Statics.field1532, field1711, 0, var4, false);
                    field1489 = false;
                } else if (var4 == 0) {
                    class79.method2782();
                    field1489 = false;
                } else if (class79.field881 == 0) {
                    Statics.field884.method1190(var4);
                } else {
                    Statics.field1856 = var4;
                }
                field1530 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field1713 = 127;
            }
            if (var3 == 1) {
                field1713 = 96;
            }
            if (var3 == 2) {
                field1713 = 64;
            }
            if (var3 == 3) {
                field1713 = 32;
            }
            if (var3 == 4) {
                field1713 = 0;
            }
        }
        if (var2 == 5) {
            field1485 = var3;
        }
        if (var2 == 6) {
            field1637 = var3;
        }
        if (var2 == 9) {
            field1672 = var3;
        }
        if (var2 != 10) {
            return;
        }
        if (var3 == 0) {
            field1714 = 127;
        }
        if (var3 == 1) {
            field1714 = 96;
        }
        if (var3 == 2) {
            field1714 = 64;
        }
        if (var3 == 3) {
            field1714 = 32;
        }
        if (var3 == 4) {
            field1714 = 0;
        }
    }

    @ObfuscatedName("cb.dq(Ljava/lang/String;ZI)V")
    public static final void method1549(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field1731 < 100 || field1613 == 1) || field1731 >= 400) {
            method862(0, "", class98.field1294);
            return;
        }
        String var2 = class57.method1168(arg0, Statics.field1104);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field1731; var3++) {
            class105 var4 = field1474[var3];
            String var5 = class57.method1168(var4.field1449, Statics.field1104);
            if (var5 != null && var5.equals(var2)) {
                method862(0, "", arg0 + class98.field1233);
                return;
            }
            if (var4.field1444 != null) {
                String var6 = class57.method1168(var4.field1444, Statics.field1104);
                if (var6 != null && var6.equals(var2)) {
                    method862(0, "", arg0 + class98.field1233);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field1727; var7++) {
            class74 var8 = field1729[var7];
            String var9 = class57.method1168(var8.field705, Statics.field1104);
            if (var9 != null && var9.equals(var2)) {
                method862(0, "", class98.field1300 + arg0 + class98.field1301);
                return;
            }
            if (var8.field703 != null) {
                String var10 = class57.method1168(var8.field703, Statics.field1104);
                if (var10 != null && var10.equals(var2)) {
                    method862(0, "", class98.field1300 + arg0 + class98.field1301);
                    return;
                }
            }
        }
        if (class57.method1168(Statics.field387.field632, Statics.field1104).equals(var2)) {
            method862(0, "", class98.field1174);
        } else {
            field1515.method2253(53);
            field1515.method357(class31.method1333(arg0));
            field1515.method506(arg0);
        }
    }

    @ObfuscatedName("bz.an(IIIII)V")
    public static final void method1881(int arg0, int arg1, int arg2, int arg3) {
        if (field1585 == 1) {
            Statics.field1431[field1584 / 100].method2621(field1582 - 8, field1583 - 8);
        }
        if (field1585 == 2) {
            Statics.field1431[field1584 / 100 + 4].method2621(field1582 - 8, field1583 - 8);
        }
        method2736();
        if (!field1681) {
            return;
        }
        int var4 = arg0 + 512 - 5;
        int var5 = arg1 + 20;
        Statics.field1446.method63("Fps:" + field1861, var4, var5, 16776960, -1);
        int var9 = var5 + 15;
        Runtime var6 = Runtime.getRuntime();
        int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        int var8 = 16776960;
        if (var7 > 32768 && field1478) {
            var8 = 16711680;
        }
        if (var7 > 65536 && !field1478) {
            var8 = 16711680;
        }
        Statics.field1446.method63("Mem:" + var7 + "k", var4, var9, var8, -1);
        var5 = var9 + 15;
    }

    @ObfuscatedName("bv.ci([Lfb;II)V")
    public static final void method1919(class75[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class75 var3 = arg0[var2];
            if (var3 != null && var3.field738 == arg1 && (!var3.field726 || !method1163(var3))) {
                if (var3.field809 == 0) {
                    if (!var3.field726 && method1163(var3) && Statics.field408 != var3) {
                        continue;
                    }
                    method1919(arg0, var3.field727);
                    if (var3.field835 != null) {
                        method1919(var3.field835, var3.field727);
                    }
                    class86 var4 = (class86) field1636.method20((long) var3.field727);
                    if (var4 != null) {
                        method1074(var4.field1000);
                    }
                }
                if (var3.field809 == 6) {
                    if (var3.field822 != -1 || var3.field764 != -1) {
                        boolean var5 = method3406(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field764;
                        } else {
                            var6 = var3.field822;
                        }
                        if (var6 != -1) {
                            class166 var7 = class166.method274(var6);
                            var3.field834 += field1554;
                            while (var3.field834 > var7.field2531[var3.field774]) {
                                var3.field834 -= var7.field2531[var3.field774];
                                var3.field774++;
                                if (var3.field774 >= var7.field2529.length) {
                                    var3.field774 -= var7.field2533;
                                    if (var3.field774 < 0 || var3.field774 >= var7.field2529.length) {
                                        var3.field774 = 0;
                                    }
                                }
                                method319(var3);
                            }
                        }
                    }
                    if (var3.field736 != 0 && !var3.field726) {
                        int var8 = var3.field736 >> 16;
                        int var9 = var3.field736 << 16 >> 16;
                        int var10 = field1554 * var8;
                        int var11 = field1554 * var9;
                        var3.field732 = var3.field732 + var10 & 0x7FF;
                        var3.field768 = var3.field768 + var11 & 0x7FF;
                        method319(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bs.br(I)V")
    public static final void method1941() {
        field1517.method2275();
        int var0 = field1517.method2270(8);
        if (var0 < field1512) {
            for (int var1 = var0; var1 < field1512; var1++) {
                field1473[++field1603 - 1] = field1520[var1];
            }
        }
        if (var0 > field1512) {
            throw new RuntimeException("");
        }
        field1512 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field1520[var2];
            class58 var4 = field1658[var3];
            int var5 = field1517.method2270(1);
            if (var5 == 0) {
                field1520[++field1512 - 1] = var3;
                var4.field2728 = field1483;
            } else {
                int var6 = field1517.method2270(2);
                if (var6 == 0) {
                    field1520[++field1512 - 1] = var3;
                    var4.field2728 = field1483;
                    field1599[++field1514 - 1] = var3;
                } else if (var6 == 1) {
                    field1520[++field1512 - 1] = var3;
                    var4.field2728 = field1483;
                    int var7 = field1517.method2270(3);
                    var4.method3444(var7, false);
                    int var8 = field1517.method2270(1);
                    if (var8 == 1) {
                        field1599[++field1514 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field1520[++field1512 - 1] = var3;
                    var4.field2728 = field1483;
                    int var9 = field1517.method2270(3);
                    var4.method3444(var9, true);
                    int var10 = field1517.method2270(3);
                    var4.method3444(var10, true);
                    int var11 = field1517.method2270(1);
                    if (var11 == 1) {
                        field1599[++field1514 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field1473[++field1603 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("bs.cd(II)V")
    public static final void method1943(int arg0) {
        if (!class75.method299(arg0)) {
            return;
        }
        class75[] var1 = Statics.field826[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class75 var3 = var1[var2];
            if (var3 != null) {
                var3.field774 = 0;
                var3.field834 = 0;
            }
        }
    }

    @ObfuscatedName("bs.az(IIII)V")
    public static final void method1945(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field1580 = -1;
            field1581 = -1;
            return;
        }
        int var3 = method1185(arg0, arg1, Statics.field1863) - arg2;
        int var4 = arg0 - Statics.field671;
        int var5 = var3 - Statics.field2032;
        int var6 = arg1 - Statics.field502;
        int var7 = class151.field2285[Statics.field1753];
        int var8 = class151.field2286[Statics.field1753];
        int var9 = class151.field2285[Statics.field352];
        int var10 = class151.field2286[Statics.field352];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field1580 = (var11 << 9) / var15 + 256;
            field1581 = (var14 << 9) / var15 + 167;
        } else {
            field1580 = -1;
            field1581 = -1;
        }
    }

    @ObfuscatedName("bo.dk(Ljava/lang/String;I)V")
    public static final void method1985(String arg0) {
        if (Statics.field854 != null) {
            field1515.method2253(134);
            field1515.method357(class31.method1333(arg0));
            field1515.method506(arg0);
        }
    }

    @ObfuscatedName("bq.bg(Lb;I)V")
    public static final void method2005(class61 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field534 == 0) {
            var1 = Statics.field2658.method2392(arg0.field533, arg0.field535, arg0.field537);
        }
        if (arg0.field534 == 1) {
            var1 = Statics.field2658.method2393(arg0.field533, arg0.field535, arg0.field537);
        }
        if (arg0.field534 == 2) {
            var1 = Statics.field2658.method2394(arg0.field533, arg0.field535, arg0.field537);
        }
        if (arg0.field534 == 3) {
            var1 = Statics.field2658.method2458(arg0.field533, arg0.field535, arg0.field537);
        }
        if (var1 != 0) {
            int var5 = Statics.field2658.method2396(arg0.field533, arg0.field535, arg0.field537, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field550 = var2;
        arg0.field539 = var3;
        arg0.field538 = var4;
    }

    @ObfuscatedName("bk.cw(Lfb;II)I")
    public static final int method2090(class75 arg0, int arg1) {
        if (arg0.field767 == null || arg1 >= arg0.field767.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field767[arg1];
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
                    var7 = field1551[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field1614[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field1602[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class75 var11 = class75.method1490(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class165.method3520(var12).field2495 || field1477)) {
                        for (int var13 = 0; var13 < var11.field770.length; var13++) {
                            if (var12 + 1 == var11.field770[var13]) {
                                var7 += var11.field830[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class19.field88[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class50.field415[field1614[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class19.field88[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field387.field635;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class50.field413[var14]) {
                            var7 += field1614[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class75 var17 = class75.method1490(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class165.method3520(var18).field2495 || field1477)) {
                        for (int var19 = 0; var19 < var17.field770.length; var19++) {
                            if (var18 + 1 == var17.field770[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1707;
                }
                if (var6 == 12) {
                    var7 = field1511;
                }
                if (var6 == 13) {
                    int var20 = class19.field88[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class19.method2891(var22);
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
                    var7 = (Statics.field387.field2735 >> 7) + Statics.field2469;
                }
                if (var6 == 19) {
                    var7 = (Statics.field387.field2683 >> 7) + Statics.field622;
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

    @ObfuscatedName("bk.ae(ZI)V")
    public static final void method2095(boolean arg0) {
        field1615 = arg0;
        if (!field1615) {
            int var1 = field1517.method430();
            int var2 = field1517.method410();
            int var3 = field1517.method410();
            int var4 = (field1518 - field1517.field172) / 16;
            Statics.field2551 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field2551[var5][var6] = field1517.method376();
                }
            }
            int var7 = field1517.method396();
            int var8 = field1517.method410();
            Statics.field623 = new int[var4];
            Statics.field1844 = new int[var4];
            Statics.field61 = new int[var4];
            Statics.field546 = new byte[var4][];
            Statics.field714 = new byte[var4][];
            boolean var9 = false;
            if ((var8 / 8 == 48 || var8 / 8 == 49) && var3 / 8 == 48) {
                var9 = true;
            }
            if (var8 / 8 == 48 && var3 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var8 - 6) / 8; var11 <= (var8 + 6) / 8; var11++) {
                for (int var12 = (var3 - 6) / 8; var12 <= (var3 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field623[var10] = var13;
                        Statics.field1844[var10] = Statics.field424.method1098("m" + var11 + "_" + var12);
                        Statics.field61[var10] = Statics.field424.method1098("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            Statics.method937(var8, var3, var7, var1, var2);
            return;
        }
        int var14 = field1517.method394();
        int var15 = field1517.method430();
        int var16 = field1517.method410();
        int var17 = field1517.method373();
        int var18 = field1517.method365();
        field1517.method2275();
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var20 = 0; var20 < 13; var20++) {
                for (int var21 = 0; var21 < 13; var21++) {
                    int var22 = field1517.method2270(1);
                    if (var22 == 1) {
                        field1535[var19][var20][var21] = field1517.method2270(26);
                    } else {
                        field1535[var19][var20][var21] = -1;
                    }
                }
            }
        }
        field1517.method2266();
        int var23 = (field1518 - field1517.field172) / 16;
        Statics.field2551 = new int[var23][4];
        for (int var24 = 0; var24 < var23; var24++) {
            for (int var25 = 0; var25 < 4; var25++) {
                Statics.field2551[var24][var25] = field1517.method415();
            }
        }
        Statics.field623 = new int[var23];
        Statics.field1844 = new int[var23];
        Statics.field61 = new int[var23];
        Statics.field546 = new byte[var23][];
        Statics.field714 = new byte[var23][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field1535[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field623[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field623[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field1844[var26] = Statics.field424.method1098("m" + var35 + "_" + var36);
                            Statics.field61[var26] = Statics.field424.method1098("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        Statics.method937(var17, var16, var14, var18, var15);
    }

    @ObfuscatedName("bm.db(II)V")
    public static void method2109(int arg0) {
        for (class20 var1 = (class20) field1675.method25(); var1 != null; var1 = (class20) field1675.method23()) {
            if ((long) arg0 == (var1.field11 >> 48 & 0xFFFFL)) {
                var1.method44();
            }
        }
    }

    @ObfuscatedName("bd.aq(Laa;B)V")
    public static final void method2206(class181 arg0) {
        arg0.field2721 = false;
        if (arg0.field2682 != -1) {
            class166 var1 = class166.method274(arg0.field2682);
            if (var1 == null || var1.field2529 == null) {
                arg0.field2682 = -1;
            } else {
                arg0.field2710++;
                if (arg0.field2733 < var1.field2529.length && arg0.field2710 > var1.field2531[arg0.field2733]) {
                    arg0.field2710 = 1;
                    arg0.field2733++;
                    method1178(var1, arg0.field2733, arg0.field2735, arg0.field2683);
                }
                if (arg0.field2733 >= var1.field2529.length) {
                    arg0.field2710 = 0;
                    arg0.field2733 = 0;
                    method1178(var1, arg0.field2733, arg0.field2735, arg0.field2683);
                }
            }
        }
        if (arg0.field2716 != -1 && field1483 >= arg0.field2693) {
            if (arg0.field2717 < 0) {
                arg0.field2717 = 0;
            }
            int var2 = class173.method2209(arg0.field2716).field2605;
            if (var2 == -1) {
                arg0.field2716 = -1;
            } else {
                class166 var3 = class166.method274(var2);
                if (var3 == null || var3.field2529 == null) {
                    arg0.field2716 = -1;
                } else {
                    arg0.field2718++;
                    if (arg0.field2717 < var3.field2529.length && arg0.field2718 > var3.field2531[arg0.field2717]) {
                        arg0.field2718 = 1;
                        arg0.field2717++;
                        method1178(var3, arg0.field2717, arg0.field2735, arg0.field2683);
                    }
                    if (arg0.field2717 >= var3.field2529.length && (arg0.field2717 < 0 || arg0.field2717 >= var3.field2529.length)) {
                        arg0.field2716 = -1;
                    }
                }
            }
        }
        if (arg0.field2711 != -1 && arg0.field2714 <= 1) {
            class166 var4 = class166.method274(arg0.field2711);
            if (var4.field2543 == 1 && arg0.field2738 > 0 && arg0.field2725 <= field1483 && arg0.field2730 < field1483) {
                arg0.field2714 = 1;
                return;
            }
        }
        if (arg0.field2711 != -1 && arg0.field2714 == 0) {
            class166 var5 = class166.method274(arg0.field2711);
            if (var5 == null || var5.field2529 == null) {
                arg0.field2711 = -1;
            } else {
                arg0.field2713++;
                if (arg0.field2726 < var5.field2529.length && arg0.field2713 > var5.field2531[arg0.field2726]) {
                    arg0.field2713 = 1;
                    arg0.field2726++;
                    method1178(var5, arg0.field2726, arg0.field2735, arg0.field2683);
                }
                if (arg0.field2726 >= var5.field2529.length) {
                    arg0.field2726 -= var5.field2533;
                    arg0.field2709++;
                    if (arg0.field2709 >= var5.field2539) {
                        arg0.field2711 = -1;
                    } else if (arg0.field2726 >= 0 && arg0.field2726 < var5.field2529.length) {
                        method1178(var5, arg0.field2726, arg0.field2735, arg0.field2683);
                    } else {
                        arg0.field2711 = -1;
                    }
                }
                arg0.field2721 = var5.field2535;
            }
        }
        if (arg0.field2714 > 0) {
            arg0.field2714--;
        }
    }

    @ObfuscatedName("bd.bn(I)V")
    public static final void method2207() {
        for (int var0 = 0; var0 < field1514; var0++) {
            int var1 = field1599[var0];
            class58 var2 = field1658[var1];
            int var3 = field1517.method512();
            if ((var3 & 0x4) != 0) {
                int var4 = field1517.method410();
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = field1517.method394();
                if (var2.field2711 == var4 && var4 != -1) {
                    int var6 = class166.method274(var4).field2524;
                    if (var6 == 1) {
                        var2.field2726 = 0;
                        var2.field2713 = 0;
                        var2.field2714 = var5;
                        var2.field2709 = 0;
                    }
                    if (var6 == 2) {
                        var2.field2709 = 0;
                    }
                } else if (var4 == -1 || var2.field2711 == -1 || class166.method274(var4).field2549 >= class166.method274(var2.field2711).field2549) {
                    var2.field2711 = var4;
                    var2.field2726 = 0;
                    var2.field2713 = 0;
                    var2.field2714 = var5;
                    var2.field2709 = 0;
                    var2.field2738 = var2.field2689;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field2716 = field1517.method365();
                int var7 = field1517.method376();
                var2.field2720 = var7 >> 16;
                var2.field2693 = (var7 & 0xFFFF) + field1483;
                var2.field2717 = 0;
                var2.field2718 = 0;
                if (var2.field2693 > field1483) {
                    var2.field2717 = -1;
                }
                if (var2.field2716 == 65535) {
                    var2.field2716 = -1;
                }
            }
            if ((var3 & 0x1) != 0) {
                var2.field2705 = field1517.method410();
                if (var2.field2705 == 65535) {
                    var2.field2705 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field2706 = field1517.method365();
                var2.field2708 = field1517.method365();
            }
            if ((var3 & 0x40) != 0) {
                var2.field2695 = field1517.method379();
                var2.field2696 = 100;
            }
            if ((var3 & 0x8) != 0) {
                var2.field501 = class183.method616(field1517.method430());
                var2.field2697 = var2.field501.field2756;
                var2.field2732 = var2.field501.field2779;
                var2.field2690 = var2.field501.field2762;
                var2.field2691 = var2.field501.field2765;
                var2.field2692 = var2.field501.field2785;
                var2.field2719 = var2.field501.field2763;
                var2.field2687 = var2.field501.field2786;
                var2.field2688 = var2.field501.field2760;
                var2.field2715 = var2.field501.field2761;
            }
            if ((var3 & 0x2) != 0) {
                int var8 = field1517.method396();
                int var9 = field1517.method476();
                var2.method3440(var8, var9, field1483);
                var2.field2702 = field1483 + 300;
                var2.field2740 = field1517.method396();
                var2.field2704 = field1517.method396();
            }
            if ((var3 & 0x80) != 0) {
                int var10 = field1517.method394();
                int var11 = field1517.method512();
                var2.method3440(var10, var11, field1483);
                var2.field2702 = field1483 + 300;
                var2.field2740 = field1517.method396();
                var2.field2704 = field1517.method396();
            }
        }
    }

    @ObfuscatedName("bd.dj(Ljava/lang/String;B)Z")
    public static boolean method2211(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class57.method1168(arg0, Statics.field1104);
        for (int var2 = 0; var2 < field1727; var2++) {
            if (var1.equalsIgnoreCase(class57.method1168(field1729[var2].field705, Statics.field1104))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class57.method1168(Statics.field387.field632, Statics.field1104))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("db.ax(Laa;IS)V")
    public static final void method2276(class181 arg0, int arg1) {
        if (arg0.field2725 > field1483) {
            int var2 = arg0.field2725 - field1483;
            int var3 = arg0.field2703 * 128 + arg0.field2697 * 64;
            int var4 = arg0.field2723 * 128 + arg0.field2697 * 64;
            arg0.field2735 += (var3 - arg0.field2735) / var2;
            arg0.field2683 += (var4 - arg0.field2683) / var2;
            arg0.field2737 = 0;
            if (arg0.field2727 == 0) {
                arg0.field2707 = 1024;
            }
            if (arg0.field2727 == 1) {
                arg0.field2707 = 1536;
            }
            if (arg0.field2727 == 2) {
                arg0.field2707 = 0;
            }
            if (arg0.field2727 == 3) {
                arg0.field2707 = 512;
            }
        } else if (arg0.field2730 >= field1483) {
            method3280(arg0);
        } else {
            method3412(arg0);
        }
        if (arg0.field2735 < 128 || arg0.field2683 < 128 || arg0.field2735 >= 13184 || arg0.field2683 >= 13184) {
            arg0.field2711 = -1;
            arg0.field2716 = -1;
            arg0.field2725 = 0;
            arg0.field2730 = 0;
            arg0.field2735 = arg0.field2734[0] * 128 + arg0.field2697 * 64;
            arg0.field2683 = arg0.field2698[0] * 128 + arg0.field2697 * 64;
            arg0.method3436();
        }
        if (Statics.field387 == arg0 && (arg0.field2735 < 1536 || arg0.field2683 < 1536 || arg0.field2735 >= 11776 || arg0.field2683 >= 11776)) {
            arg0.field2711 = -1;
            arg0.field2716 = -1;
            arg0.field2725 = 0;
            arg0.field2730 = 0;
            arg0.field2735 = arg0.field2734[0] * 128 + arg0.field2697 * 64;
            arg0.field2683 = arg0.field2698[0] * 128 + arg0.field2697 * 64;
            arg0.method3436();
        }
        method935(arg0);
        method2206(arg0);
    }

    @ObfuscatedName("cv.ct(B)V")
    public static final void method2360() {
        field1515.method2253(149);
        for (class86 var0 = (class86) field1636.method25(); var0 != null; var0 = (class86) field1636.method23()) {
            if (var0.field996 == 0 || var0.field996 == 3) {
                method856(var0, true);
            }
        }
        if (field1639 != null) {
            method319(field1639);
            field1639 = null;
        }
    }

    @ObfuscatedName("cv.aj(ZI)V")
    public static final void method2363(boolean arg0) {
        for (int var1 = 0; var1 < field1512; var1++) {
            class58 var2 = field1658[field1520[var1]];
            int var3 = (field1520[var1] << 14) + 536870912;
            if (var2 != null && var2.method821() && var2.field501.field2755 == arg0 && var2.field501.method3475()) {
                int var4 = var2.field2735 >> 7;
                int var5 = var2.field2683 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field2697 == 1 && (var2.field2735 & 0x7F) == 64 && (var2.field2683 & 0x7F) == 64) {
                        if (field1579 == field1628[var4][var5]) {
                            continue;
                        }
                        field1628[var4][var5] = field1579;
                    }
                    if (!var2.field501.field2783) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2658.method2495(Statics.field1863, var2.field2735, var2.field2683, method1185(var2.field2735 + (var2.field2697 * 64 - 64), var2.field2683 + (var2.field2697 * 64 - 64), Statics.field1863), var2.field2697 * 64 - 64 + 60, var2, var2.field2684, var3, var2.field2721);
                }
            }
        }
    }

    @ObfuscatedName("cq.ce(Lag;IIII)V")
    public static final void method2706(class183 arg0, int arg1, int arg2, int arg3) {
        if (field1618 >= 400) {
            return;
        }
        if (arg0.field2775 != null) {
            arg0 = arg0.method3482();
        }
        if (arg0 == null || !arg0.field2783) {
            return;
        }
        String var4 = arg0.field2764;
        if (arg0.field2780 != 0) {
            var4 = var4 + method745(arg0.field2780, Statics.field387.field635) + " " + class94.field1087 + class98.field1282 + arg0.field2780 + class94.field1090;
        }
        if (field1629 == 1) {
            method725(class98.field1267, field1630 + " " + class94.field1091 + " " + class94.method2110(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1631) {
            String[] var5 = arg0.field2770;
            if (field1645) {
                var5 = method927(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class98.field1287)) {
                        byte var7 = 0;
                        if (var6 == 0) {
                            var7 = 9;
                        }
                        if (var6 == 1) {
                            var7 = 10;
                        }
                        if (var6 == 2) {
                            var7 = 11;
                        }
                        if (var6 == 3) {
                            var7 = 12;
                        }
                        if (var6 == 4) {
                            var7 = 13;
                        }
                        method725(var5[var6], class94.method2110(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class98.field1287)) {
                        short var9 = 0;
                        if (arg0.field2780 > Statics.field387.field635) {
                            var9 = 2000;
                        }
                        int var10 = 0;
                        if (var8 == 0) {
                            var10 = var9 + 9;
                        }
                        if (var8 == 1) {
                            var10 = var9 + 10;
                        }
                        if (var8 == 2) {
                            var10 = var9 + 11;
                        }
                        if (var8 == 3) {
                            var10 = var9 + 12;
                        }
                        if (var8 == 4) {
                            var10 = var9 + 13;
                        }
                        method725(var5[var8], class94.method2110(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method725(class98.field1277, class94.method2110(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2448 & 0x2) == 2) {
            method725(field1606, field1634 + " " + class94.field1091 + " " + class94.method2110(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("co.m(I)V")
    public static final void method2723() {
        try {
            if (field1506 == 0) {
                if (Statics.field2646 != null) {
                    Statics.field2646.method1979();
                    Statics.field2646 = null;
                }
                Statics.field710 = null;
                field1526 = false;
                field1507 = 0;
                field1506 = 1;
            }
            if (field1506 == 1) {
                if (Statics.field710 == null) {
                    Statics.field710 = Statics.field2009.method1904(Statics.field904, Statics.field1510);
                }
                if (Statics.field710.field1467 == 2) {
                    throw new IOException();
                }
                if (Statics.field710.field1467 == 1) {
                    Statics.field2646 = new class116((Socket) Statics.field710.field1471, Statics.field2009);
                    Statics.field710 = null;
                    field1506 = 2;
                }
            }
            if (field1506 == 2) {
                field1515.field172 = 0;
                field1515.method357(14);
                Statics.field2646.method1964(field1515.field168, 0, 1);
                field1517.field172 = 0;
                field1506 = 3;
            }
            if (field1506 == 3) {
                if (Statics.field223 != null) {
                    Statics.field223.method3561();
                }
                if (Statics.field926 != null) {
                    Statics.field926.method3561();
                }
                int var0 = Statics.field2646.method1978();
                if (Statics.field223 != null) {
                    Statics.field223.method3561();
                }
                if (Statics.field926 != null) {
                    Statics.field926.method3561();
                }
                if (var0 != 0) {
                    method869(var0);
                    return;
                }
                field1517.field172 = 0;
                field1506 = 5;
            }
            if (field1506 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field1515.field172 = 0;
                field1515.method357(10);
                field1515.method360(var1[0]);
                field1515.method360(var1[1]);
                field1515.method360(var1[2]);
                field1515.method360(var1[3]);
                field1515.method557(0L);
                field1515.method506(class103.field1421);
                field1515.method389(class90.field1047, class90.field1048);
                field1497.field172 = 0;
                if (field1693 == 40) {
                    field1497.method357(18);
                } else {
                    field1497.method357(16);
                }
                field1497.method358(0);
                int var2 = field1497.field172;
                field1497.method360(30);
                field1497.method458(field1515.field168, 0, field1515.field172);
                int var3 = field1497.field172;
                field1497.method506(class103.field1420);
                field1497.method357(field1478 ? 1 : 0);
                class150.method2030(field1497);
                class31 var4 = new class31(Statics.field480.method615());
                Statics.field480.method605(var4);
                field1497.method458(var4.field168, 0, var4.field168.length);
                field1497.method360(Statics.field2410.field922);
                field1497.method360(Statics.field477.field922);
                field1497.method360(Statics.field2363.field922);
                field1497.method360(Statics.field545.field922);
                field1497.method360(Statics.field237.field922);
                field1497.method360(Statics.field424.field922);
                field1497.method360(Statics.field1532.field922);
                field1497.method360(Statics.field1764.field922);
                field1497.method360(Statics.field887.field922);
                field1497.method360(Statics.field1504.field922);
                field1497.method360(Statics.field2345.field922);
                field1497.method360(Statics.field937.field922);
                field1497.method360(Statics.field2566.field922);
                field1497.method360(Statics.field620.field922);
                field1497.method360(Statics.field715.field922);
                field1497.method360(Statics.field2647.field922);
                field1497.method387(var1, var3, field1497.field172);
                field1497.method367(field1497.field172 - var2);
                Statics.field2646.method1964(field1497.field168, 0, field1497.field172);
                field1515.method2256(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field1517.method2256(var1);
                field1506 = 6;
            }
            if (field1506 == 6 && Statics.field2646.method1968() > 0) {
                int var6 = Statics.field2646.method1978();
                if (var6 == 21 && field1693 == 20) {
                    field1506 = 7;
                } else if (var6 == 2) {
                    field1506 = 9;
                } else if (var6 == 15 && field1693 == 40) {
                    field1515.field172 = 0;
                    field1517.field172 = 0;
                    field1519 = -1;
                    field1616 = -1;
                    field1524 = -1;
                    field1525 = -1;
                    field1518 = 0;
                    field1640 = 0;
                    field1697 = 0;
                    field1618 = 0;
                    field1633 = false;
                    field1709 = 0;
                    field1509 = 0;
                    for (int var7 = 0; var7 < field1595.length; var7++) {
                        if (field1595[var7] != null) {
                            field1595[var7].field2705 = -1;
                        }
                    }
                    for (int var8 = 0; var8 < field1658.length; var8++) {
                        if (field1658[var8] != null) {
                            field1658[var8].field2705 = -1;
                        }
                    }
                    class62.field569 = new class2(32);
                    method931(30);
                    for (int var9 = 0; var9 < 100; var9++) {
                        field1668[var9] = true;
                    }
                    return;
                } else if (var6 == 23 && field1508 < 1) {
                    field1508++;
                    field1506 = 0;
                } else {
                    method869(var6);
                    return;
                }
            }
            if (field1506 == 7 && Statics.field2646.method1968() > 0) {
                field1665 = (Statics.field2646.method1978() + 3) * 60;
                field1506 = 8;
            }
            if (field1506 == 8) {
                field1507 = 0;
                Statics.method2889(class98.field1166, class98.field1253, field1665 / 60 + class98.field1168);
                if (--field1665 <= 0) {
                    field1506 = 0;
                }
            } else {
                if (field1506 == 9 && Statics.field2646.method1968() >= 8) {
                    field1534 = Statics.field2646.method1978();
                    field1592 = Statics.field2646.method1978() == 1;
                    field1541 = Statics.field2646.method1978();
                    field1541 <<= 0x8;
                    field1541 += Statics.field2646.method1978();
                    field1613 = Statics.field2646.method1978();
                    Statics.field2646.method1969(field1517.field168, 0, 1);
                    field1517.field172 = 0;
                    field1519 = field1517.method2254();
                    Statics.field2646.method1969(field1517.field168, 0, 2);
                    field1517.field172 = 0;
                    field1518 = field1517.method373();
                    if (field1613 == 1) {
                        try {
                            client var10 = Statics.field1596;
                            JSObject.getWindow(var10).call("zap", (Object[]) null);
                        } catch (Throwable var28) {
                        }
                    } else {
                        try {
                            client var12 = Statics.field1596;
                            JSObject.getWindow(var12).call("unzap", (Object[]) null);
                        } catch (Throwable var27) {
                        }
                    }
                    field1506 = 10;
                }
                if (field1506 != 10) {
                    field1507++;
                    if (field1507 > 2000) {
                        if (field1508 < 1) {
                            if (Statics.field927 == Statics.field1510) {
                                Statics.field1510 = Statics.field601;
                            } else {
                                Statics.field1510 = Statics.field927;
                            }
                            field1508++;
                            field1506 = 0;
                        } else {
                            method869(-3);
                        }
                    }
                } else if (Statics.field2646.method1968() >= field1518) {
                    field1517.field172 = 0;
                    Statics.field2646.method1969(field1517.field168, 0, field1518);
                    field1484 = 1L;
                    field1487 = -1;
                    Statics.field676.field1033 = 0;
                    Statics.field1020 = true;
                    field1560 = true;
                    field1699 = -1L;
                    class7.method1544();
                    field1515.field172 = 0;
                    field1517.field172 = 0;
                    field1519 = -1;
                    field1616 = -1;
                    field1524 = -1;
                    field1525 = -1;
                    field1640 = 0;
                    field1697 = 0;
                    field1522 = 0;
                    field1491 = 0;
                    field1618 = 0;
                    field1633 = false;
                    class108.method2079(0);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field1689[var14] = null;
                    }
                    field1516 = 0;
                    field1629 = 0;
                    field1631 = false;
                    field1719 = 0;
                    field1542 = (int) (Math.random() * 100.0D) - 50;
                    field1544 = (int) (Math.random() * 110.0D) - 55;
                    field1546 = (int) (Math.random() * 80.0D) - 40;
                    field1549 = (int) (Math.random() * 120.0D) - 60;
                    field1730 = (int) (Math.random() * 30.0D) - 20;
                    field1600 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field1709 = 0;
                    field1702 = -1;
                    field1509 = 0;
                    field1708 = 0;
                    field1562 = 0;
                    field1512 = 0;
                    for (int var15 = 0; var15 < 2048; var15++) {
                        field1595[var15] = null;
                        field1642[var15] = null;
                    }
                    for (int var16 = 0; var16 < 32768; var16++) {
                        field1658[var16] = null;
                    }
                    Statics.field387 = field1595[2047] = new class68();
                    field1611.method247();
                    field1597.method247();
                    for (int var17 = 0; var17 < 4; var17++) {
                        for (int var18 = 0; var18 < 104; var18++) {
                            for (int var19 = 0; var19 < 104; var19++) {
                                field1609[var17][var18][var19] = null;
                            }
                        }
                    }
                    field1610 = new class13();
                    field1726 = 0;
                    field1727 = 0;
                    field1731 = 0;
                    for (int var20 = 0; var20 < Statics.field2653; var20++) {
                        class179 var21 = class179.method3127(var20);
                        if (var21 != null && var21.field2664 == 0) {
                            class19.field87[var20] = 0;
                            class19.field88[var20] = 0;
                        }
                    }
                    for (int var22 = 0; var22 < field1669.length; var22++) {
                        field1669[var22] = -1;
                    }
                    if (field1635 != -1) {
                        class75.method292(field1635);
                    }
                    for (class86 var23 = (class86) field1636.method25(); var23 != null; var23 = (class86) field1636.method23()) {
                        method856(var23, true);
                    }
                    field1635 = -1;
                    field1636 = new class2(8);
                    field1639 = null;
                    field1633 = false;
                    field1618 = 0;
                    field1733.method960((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var24 = 0; var24 < 8; var24++) {
                        field1494[var24] = null;
                        field1572[var24] = false;
                    }
                    class62.field569 = new class2(32);
                    field1482 = true;
                    for (int var25 = 0; var25 < 100; var25++) {
                        field1668[var25] = true;
                    }
                    field1589 = null;
                    Statics.field1791 = 0;
                    Statics.field854 = null;
                    Statics.field2661 = -1;
                    method2095(false);
                    field1519 = -1;
                }
            }
        } catch (IOException var29) {
            if (field1508 < 1) {
                if (Statics.field927 == Statics.field1510) {
                    Statics.field1510 = Statics.field601;
                } else {
                    Statics.field1510 = Statics.field927;
                }
                field1508++;
                field1506 = 0;
            } else {
                method869(-2);
            }
        }
    }

    @ObfuscatedName("co.by(IIIIB)V")
    public static final void method2727(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1523; var4++) {
            if (field1721[var4] + field1683[var4] > arg0 && field1721[var4] < arg0 + arg2 && field1684[var4] + field1682[var4] > arg1 && field1682[var4] < arg1 + arg3) {
                field1705[var4] = true;
            }
        }
    }

    @ObfuscatedName("co.ac(I)V")
    public static final void method2736() {
        field1594 = 0;
        int var0 = (Statics.field387.field2735 >> 7) + Statics.field2469;
        int var1 = (Statics.field387.field2683 >> 7) + Statics.field622;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field1594 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field1594 = 1;
        }
        if (field1594 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field1594 = 0;
        }
    }

    @ObfuscatedName("ci.bw(I)V")
    public static void method2856() {
        for (int var0 = 0; var0 < field1618; var0++) {
            if (method826(field1621[var0])) {
                if (var0 < field1618 - 1) {
                    for (int var1 = var0; var1 < field1618 - 1; var1++) {
                        field1623[var1] = field1623[var1 + 1];
                        field1624[var1] = field1624[var1 + 1];
                        field1621[var1] = field1621[var1 + 1];
                        field1488[var1] = field1488[var1 + 1];
                        field1619[var1] = field1619[var1 + 1];
                        field1620[var1] = field1620[var1 + 1];
                    }
                }
                field1618--;
            }
        }
    }

    @ObfuscatedName("ci.dd(Ljava/lang/String;I)V")
    public static final void method2857(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class57.method1168(arg0, Statics.field1104);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1731; var2++) {
            class105 var3 = field1474[var2];
            String var4 = var3.field1449;
            String var5 = class57.method1168(var4, Statics.field1104);
            if (class95.method1548(arg0, var1, var4, var5)) {
                field1731--;
                for (int var6 = var2; var6 < field1731; var6++) {
                    field1474[var6] = field1474[var6 + 1];
                }
                field1666 = field1578;
                field1515.method2253(255);
                field1515.method357(class31.method1333(arg0));
                field1515.method506(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("cf.bo(I)V")
    public static final void method2881() {
        field1603 = 0;
        field1514 = 0;
        method1941();
        while (field1517.method2258(field1518) >= 27) {
            int var0 = field1517.method2270(15);
            if (var0 == 32767) {
                break;
            }
            boolean var4 = false;
            if (field1658[var0] == null) {
                field1658[var0] = new class58();
                var4 = true;
            }
            class58 var5 = field1658[var0];
            field1520[++field1512 - 1] = var0;
            var5.field2728 = field1483;
            var5.field501 = class183.method616(field1517.method2270(14));
            int var6 = field1517.method2270(1);
            if (var6 == 1) {
                field1599[++field1514 - 1] = var0;
            }
            int var7 = field1517.method2270(1);
            int var8 = field1608[field1517.method2270(3)];
            if (var4) {
                var5.field2707 = var5.field2684 = var8;
            }
            int var9 = field1517.method2270(5);
            if (var9 > 15) {
                var9 -= 32;
            }
            int var10 = field1517.method2270(5);
            if (var10 > 15) {
                var10 -= 32;
            }
            var5.field2697 = var5.field501.field2756;
            var5.field2732 = var5.field501.field2779;
            if (var5.field2732 == 0) {
                var5.field2684 = 0;
            }
            var5.field2690 = var5.field501.field2762;
            var5.field2691 = var5.field501.field2765;
            var5.field2692 = var5.field501.field2785;
            var5.field2719 = var5.field501.field2763;
            var5.field2687 = var5.field501.field2786;
            var5.field2688 = var5.field501.field2760;
            var5.field2715 = var5.field501.field2761;
            var5.method3435(Statics.field387.field2734[0] + var9, Statics.field387.field2698[0] + var10, var7 == 1);
        }
        field1517.method2266();
        method2207();
        for (int var1 = 0; var1 < field1603; var1++) {
            int var2 = field1473[var1];
            if (field1483 != field1658[var2].field2728) {
                field1658[var2].field501 = null;
                field1658[var2] = null;
            }
        }
        if (field1518 != field1517.field172) {
            throw new RuntimeException(field1517.field172 + class94.field1088 + field1518);
        }
        for (int var3 = 0; var3 < field1512; var3++) {
            if (field1658[field1520[var3]] == null) {
                throw new RuntimeException(var3 + class94.field1088 + field1512);
            }
        }
    }

    @ObfuscatedName("cf.at(III)V")
    public static final void method2888(int arg0, int arg1) {
        if (field1709 != 0 && field1709 != 3 || class108.field1748 != 1) {
            return;
        }
        int var2 = class108.field1737 - 25 - arg0;
        int var3 = class108.field1749 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field1600 + field1549 & 0x7FF;
        int var5 = class151.field2285[var4];
        int var6 = class151.field2286[var4];
        int var7 = (field1730 + 256) * var5 >> 8;
        int var8 = (field1730 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field387.field2735 + var9 >> 7;
        int var12 = Statics.field387.field2683 - var10 >> 7;
        boolean var13 = method999(Statics.field387.field2734[0], Statics.field387.field2698[0], var11, var12, true, 0, 0, 0, 0, 0, 1);
        if (!var13) {
            return;
        }
        field1515.method357(var2);
        field1515.method357(var3);
        field1515.method358(field1600);
        field1515.method357(57);
        field1515.method357(field1549);
        field1515.method357(field1730);
        field1515.method357(89);
        field1515.method358(Statics.field387.field2735);
        field1515.method358(Statics.field387.field2683);
        field1515.method357(field1537);
        field1515.method357(63);
    }

    @ObfuscatedName("cd.ap(IIIII)V")
    public static final void method2892(int arg0, int arg1, int arg2, int arg3) {
        field1568 = 0;
        for (int var4 = -1; var4 < field1562 + field1512; var4++) {
            class181 var5;
            if (var4 == -1) {
                var5 = Statics.field387;
            } else if (var4 < field1562) {
                var5 = field1595[field1605[var4]];
            } else {
                var5 = field1658[field1520[var4 - field1562]];
            }
            if (var5 != null && var5.method821()) {
                if (var5 instanceof class58) {
                    class183 var6 = ((class58) var5).field501;
                    if (var6.field2775 != null) {
                        var6 = var6.method3482();
                    }
                    if (var6 == null) {
                        continue;
                    }
                }
                if (var4 >= field1562) {
                    class183 var9 = ((class58) var5).field501;
                    if (var9.field2775 != null) {
                        var9 = var9.method3482();
                    }
                    if (var9.field2778 >= 0 && var9.field2778 < Statics.field554.length) {
                        method3120(var5, var5.field2729 + 15);
                        if (field1580 > -1) {
                            Statics.field554[var9.field2778].method2621(field1580 + arg0 - 12, field1581 + arg1 - 30);
                        }
                    }
                    if (field1491 == 1 && field1573 == field1520[var4 - field1562] && field1483 % 20 < 10) {
                        method3120(var5, var5.field2729 + 15);
                        if (field1580 > -1) {
                            Statics.field2207[0].method2621(field1580 + arg0 - 12, field1581 + arg1 - 28);
                        }
                    }
                } else {
                    int var7 = 30;
                    class68 var8 = (class68) var5;
                    if (var8.field631 != -1 || var8.field639 != -1) {
                        method3120(var5, var5.field2729 + 15);
                        if (field1580 > -1) {
                            if (var8.field631 != -1) {
                                Statics.field665[var8.field631].method2621(field1580 + arg0 - 12, field1581 + arg1 - var7);
                                var7 += 25;
                            }
                            if (var8.field639 != -1) {
                                Statics.field554[var8.field639].method2621(field1580 + arg0 - 12, field1581 + arg1 - var7);
                                var7 += 25;
                            }
                        }
                    }
                    if (var4 >= 0 && field1491 == 10 && field1493 == field1605[var4]) {
                        method3120(var5, var5.field2729 + 15);
                        if (field1580 > -1) {
                            Statics.field2207[1].method2621(field1580 + arg0 - 12, field1581 + arg1 - var7);
                        }
                    }
                }
                if (var5.field2695 != null && (var4 >= field1562 || field1692 == 0 || field1692 == 3 || field1692 == 1 && method2211(((class68) var5).field632))) {
                    method3120(var5, var5.field2729);
                    if (field1580 > -1 && field1568 < field1569) {
                        field1563[field1568] = Statics.field561.method89(var5.field2695) / 2;
                        field1680[field1568] = Statics.field561.field19;
                        field1643[field1568] = field1580;
                        field1571[field1568] = field1581;
                        field1574[field1568] = var5.field2686;
                        field1575[field1568] = var5.field2712;
                        field1576[field1568] = var5.field2696;
                        field1577[field1568] = var5.field2695;
                        field1568++;
                    }
                }
                if (var5.field2702 > field1483) {
                    method3120(var5, var5.field2729 + 15);
                    if (field1580 > -1) {
                        int var10 = var5.field2740 * 30 / var5.field2704;
                        if (var10 > 30) {
                            var10 = 30;
                        }
                        class139.method2353(field1580 + arg0 - 15, field1581 + arg1 - 3, var10, 5, 65280);
                        class139.method2353(field1580 + arg0 - 15 + var10, field1581 + arg1 - 3, 30 - var10, 5, 16711680);
                    }
                }
                for (int var11 = 0; var11 < 4; var11++) {
                    if (var5.field2701[var11] > field1483) {
                        method3120(var5, var5.field2729 / 2);
                        if (field1580 > -1) {
                            if (var11 == 1) {
                                field1581 -= 20;
                            }
                            if (var11 == 2) {
                                field1580 -= 15;
                                field1581 -= 10;
                            }
                            if (var11 == 3) {
                                field1580 += 15;
                                field1581 -= 10;
                            }
                            Statics.field2445[var5.field2700[var11]].method2621(field1580 + arg0 - 12, field1581 + arg1 - 12);
                            Statics.field2355.method81(Integer.toString(var5.field2699[var11]), field1580 + arg0 - 1, field1581 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var12 = 0; var12 < field1568; var12++) {
            int var13 = field1643[var12];
            int var14 = field1571[var12];
            int var15 = field1563[var12];
            int var16 = field1680[var12];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var18 = 0; var18 < var12; var18++) {
                    if (var14 + 2 > field1571[var18] - field1680[var18] && var14 - var16 < field1571[var18] + 2 && var13 - var15 < field1643[var18] + field1563[var18] && var13 + var15 > field1643[var18] - field1563[var18] && field1571[var18] - field1680[var18] < var14) {
                        var14 = field1571[var18] - field1680[var18];
                        var17 = true;
                    }
                }
            }
            field1580 = field1643[var12];
            field1581 = field1571[var12] = var14;
            String var19 = field1577[var12];
            if (field1637 == 0) {
                int var20 = 16776960;
                if (field1574[var12] < 6) {
                    var20 = field1570[field1574[var12]];
                }
                if (field1574[var12] == 6) {
                    var20 = field1579 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field1574[var12] == 7) {
                    var20 = field1579 % 20 < 10 ? 255 : 65535;
                }
                if (field1574[var12] == 8) {
                    var20 = field1579 % 20 < 10 ? 45056 : 8454016;
                }
                if (field1574[var12] == 9) {
                    int var21 = 150 - field1576[var12];
                    if (var21 < 50) {
                        var20 = var21 * 1280 + 16711680;
                    } else if (var21 < 100) {
                        var20 = 16776960 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var20 = (var21 - 100) * 5 + 65280;
                    }
                }
                if (field1574[var12] == 10) {
                    int var22 = 150 - field1576[var12];
                    if (var22 < 50) {
                        var20 = var22 * 5 + 16711680;
                    } else if (var22 < 100) {
                        var20 = 16711935 - (var22 - 50) * 327680;
                    } else if (var22 < 150) {
                        var20 = (var22 - 100) * 327680 + 255 - (var22 - 100) * 5;
                    }
                }
                if (field1574[var12] == 11) {
                    int var23 = 150 - field1576[var12];
                    if (var23 < 50) {
                        var20 = 16777215 - var23 * 327685;
                    } else if (var23 < 100) {
                        var20 = (var23 - 50) * 327685 + 65280;
                    } else if (var23 < 150) {
                        var20 = 16777215 - (var23 - 100) * 327680;
                    }
                }
                if (field1575[var12] == 0) {
                    Statics.field561.method81(var19, field1580 + arg0, field1581 + arg1, var20, 0);
                }
                if (field1575[var12] == 1) {
                    Statics.field561.method148(var19, field1580 + arg0, field1581 + arg1, var20, 0, field1579);
                }
                if (field1575[var12] == 2) {
                    Statics.field561.method88(var19, field1580 + arg0, field1581 + arg1, var20, 0, field1579);
                }
                if (field1575[var12] == 3) {
                    Statics.field561.method68(var19, field1580 + arg0, field1581 + arg1, var20, 0, field1579, 150 - field1576[var12]);
                }
                if (field1575[var12] == 4) {
                    int var24 = (150 - field1576[var12]) * (Statics.field561.method89(var19) + 100) / 150;
                    class139.method2299(field1580 + arg0 - 50, arg1, field1580 + arg0 + 50, arg1 + arg3);
                    Statics.field561.method62(var19, field1580 + arg0 + 50 - var24, field1581 + arg1, var20, 0);
                    class139.method2344(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field1575[var12] == 5) {
                    int var25 = 150 - field1576[var12];
                    int var26 = 0;
                    if (var25 < 25) {
                        var26 = var25 - 25;
                    } else if (var25 > 125) {
                        var26 = var25 - 125;
                    }
                    class139.method2299(arg0, field1581 + arg1 - Statics.field561.field19 - 1, arg0 + arg2, field1581 + arg1 + 5);
                    Statics.field561.method81(var19, field1580 + arg0, field1581 + arg1 + var26, var20, 0);
                    class139.method2344(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field561.method81(var19, field1580 + arg0, field1581 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("cd.bx(S)V")
    public static final void method2893() {
        for (int var0 = 0; var0 < field1514; var0++) {
            int var1 = field1599[var0];
            class68 var2 = field1595[var1];
            int var3 = field1517.method512();
            if ((var3 & 0x40) != 0) {
                var3 += field1517.method512() << 8;
            }
            method852(var1, var2, var3);
        }
    }

    @ObfuscatedName("as.al(Laa;IB)V")
    public static final void method3120(class181 arg0, int arg1) {
        method1945(arg0.field2735, arg0.field2683, arg1);
    }

    @ObfuscatedName("ar.cp([Lfb;II)V")
    public static final void method3166(class75[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class75 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field809 == 0) {
                    if (var3.field835 != null) {
                        method3166(var3.field835, arg1);
                    }
                    class86 var4 = (class86) field1636.method20((long) var3.field727);
                    if (var4 != null) {
                        int var5 = var4.field1000;
                        if (class75.method299(var5)) {
                            method3166(Statics.field826[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field821 != null) {
                    class72 var6 = new class72();
                    var6.field682 = var3;
                    var6.field678 = var3.field821;
                    class65.method1306(var6);
                }
                if (arg1 == 1 && var3.field785 != null) {
                    if (var3.field728 >= 0) {
                        class75 var7 = class75.method1490(var3.field727);
                        if (var7 == null || var7.field835 == null || var3.field728 >= var7.field835.length || var7.field835[var3.field728] != var3) {
                            continue;
                        }
                    }
                    class72 var8 = new class72();
                    var8.field682 = var3;
                    var8.field678 = var3.field785;
                    class65.method1306(var8);
                }
            }
        }
    }

    @ObfuscatedName("au.w(B)V")
    public static void method3267() {
        if (field1490 == 0) {
            Statics.field2658 = new class141(4, 104, 104, class60.field511);
            for (int var0 = 0; var0 < 4; var0++) {
                field1533[var0] = new class8(104, 104);
            }
            Statics.field1040 = new class143(512, 512);
            class103.field1415 = class98.field1194;
            class103.field1414 = 5;
            field1490 = 20;
        } else if (field1490 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class151.field2285[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class141.method2401(var1, 500, 800, 512, 334);
            class103.field1415 = class98.field1146;
            class103.field1414 = 10;
            field1490 = 30;
        } else if (field1490 == 30) {
            Statics.field2410 = method896(0, false, true, true);
            Statics.field477 = method896(1, false, true, true);
            Statics.field2363 = method896(2, true, false, true);
            Statics.field545 = method896(3, false, true, true);
            Statics.field237 = method896(4, false, true, true);
            Statics.field424 = method896(5, true, true, true);
            Statics.field1532 = method896(6, true, true, false);
            Statics.field1764 = method896(7, false, true, true);
            Statics.field887 = method896(8, false, true, true);
            Statics.field1504 = method896(9, false, true, true);
            Statics.field2345 = method896(10, false, true, true);
            Statics.field937 = method896(11, false, true, true);
            Statics.field2566 = method896(12, false, true, true);
            Statics.field620 = method896(13, true, false, true);
            Statics.field715 = method896(14, false, true, false);
            Statics.field2647 = method896(15, false, true, true);
            class103.field1415 = class98.field1147;
            class103.field1414 = 20;
            field1490 = 40;
        } else if (field1490 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2410.method1426() * 4 / 100;
            int var8 = var7 + Statics.field477.method1426() * 4 / 100;
            int var9 = var8 + Statics.field2363.method1426() * 2 / 100;
            int var10 = var9 + Statics.field545.method1426() * 2 / 100;
            int var11 = var10 + Statics.field237.method1426() * 6 / 100;
            int var12 = var11 + Statics.field424.method1426() * 4 / 100;
            int var13 = var12 + Statics.field1532.method1426() * 2 / 100;
            int var14 = var13 + Statics.field1764.method1426() * 60 / 100;
            int var15 = var14 + Statics.field887.method1426() * 2 / 100;
            int var16 = var15 + Statics.field1504.method1426() * 2 / 100;
            int var17 = var16 + Statics.field2345.method1426() * 2 / 100;
            int var18 = var17 + Statics.field937.method1426() * 2 / 100;
            int var19 = var18 + Statics.field2566.method1426() * 2 / 100;
            int var20 = var19 + Statics.field620.method1426() * 2 / 100;
            int var21 = var20 + Statics.field715.method1426() * 2 / 100;
            int var22 = var21 + Statics.field2647.method1426() * 2 / 100;
            if (var22 == 100) {
                class103.field1415 = class98.field1149;
                class103.field1414 = 30;
                field1490 = 45;
            } else {
                if (var22 != 0) {
                    class103.field1415 = class98.field1148 + var22 + "%";
                }
                class103.field1414 = 30;
            }
        } else if (field1490 == 45) {
            class186.method3360(22050, !field1478, 2);
            class87 var23 = new class87();
            var23.method1198(9, 128);
            Statics.field223 = class186.method2006(Statics.field2009, Statics.field2359, 0, 22050);
            Statics.field223.method3547(var23);
            class79.method1946(Statics.field2647, Statics.field715, Statics.field237, var23);
            Statics.field926 = class186.method2006(Statics.field2009, Statics.field2359, 1, 2048);
            Statics.field1908 = new class169();
            Statics.field926.method3547(Statics.field1908);
            Statics.field2743 = new class124(22050, Statics.field2851);
            class103.field1415 = class98.field1150;
            class103.field1414 = 35;
            field1490 = 50;
        } else if (field1490 == 50) {
            int var24 = 0;
            if (Statics.field2355 == null) {
                Statics.field2355 = class146.method1308(Statics.field887, Statics.field620, "p11_full", "");
            } else {
                var24++;
            }
            if (Statics.field1446 == null) {
                Statics.field1446 = class146.method1308(Statics.field887, Statics.field620, "p12_full", "");
            } else {
                var24++;
            }
            if (Statics.field561 == null) {
                Statics.field561 = class146.method1308(Statics.field887, Statics.field620, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class103.field1415 = class98.field1151 + var24 * 100 / 3 + "%";
                class103.field1414 = 40;
            } else {
                Statics.field480 = new class35(true);
                class103.field1415 = class98.field1152;
                class103.field1414 = 40;
                field1490 = 60;
            }
        } else if (field1490 == 60) {
            int var25 = class103.method1340(Statics.field2345, Statics.field887);
            int var26 = class103.method1850();
            if (var25 < var26) {
                class103.field1415 = class98.field1248 + var25 * 100 / var26 + "%";
                class103.field1414 = 50;
            } else {
                class103.field1415 = class98.field1154;
                class103.field1414 = 50;
                method931(5);
                field1490 = 70;
            }
        } else if (field1490 == 70) {
            if (Statics.field2363.method1087()) {
                class97 var27 = Statics.field2363;
                Statics.field2458 = var27;
                class97 var28 = Statics.field2363;
                Statics.field2673 = var28;
                class97 var29 = Statics.field2363;
                class97 var30 = Statics.field1764;
                Statics.field2416 = var29;
                Statics.field2409 = var30;
                Statics.field161 = Statics.field2416.method1093(3);
                class184.method1543(Statics.field2363, Statics.field1764, field1478);
                Statics.method1532(Statics.field2363, Statics.field1764);
                class97 var31 = Statics.field2363;
                class97 var32 = Statics.field1764;
                boolean var33 = field1477;
                class23 var34 = Statics.field2355;
                Statics.field2480 = var31;
                Statics.field2475 = var32;
                Statics.field2510 = var33;
                Statics.field2480.method1093(10);
                Statics.field1433 = var34;
                class166.method1355(Statics.field2363, Statics.field2410, Statics.field477);
                class173.method3488(Statics.field2363, Statics.field1764);
                class182.method1177(Statics.field2363);
                class97 var35 = Statics.field2363;
                Statics.field2654 = var35;
                Statics.field2653 = Statics.field2654.method1093(16);
                class75.method1344(Statics.field545, Statics.field1764, Statics.field887, Statics.field620);
                class176.method1942(Statics.field2363);
                class97 var36 = Statics.field2363;
                Statics.field2619 = var36;
                class103.field1415 = class98.field1156;
                class103.field1414 = 60;
                field1490 = 80;
            } else {
                class103.field1415 = class98.field1155 + Statics.field2363.method1424() + "%";
                class103.field1414 = 60;
            }
        } else if (field1490 == 80) {
            int var37 = 0;
            if (Statics.field2429 == null) {
                Statics.field2429 = class146.method1180(Statics.field887, "compass", "");
            } else {
                var37++;
            }
            if (Statics.field2679 == null) {
                Statics.field2679 = class146.method1180(Statics.field887, "mapedge", "");
            } else {
                var37++;
            }
            if (Statics.field2476 == null) {
                Statics.field2476 = class146.method3072(Statics.field887, "mapscene", "");
            } else {
                var37++;
            }
            if (Statics.field2665 == null) {
                Statics.field2665 = class146.method854(Statics.field887, "mapfunction", "");
            } else {
                var37++;
            }
            if (Statics.field2445 == null) {
                Statics.field2445 = class146.method854(Statics.field887, "hitmarks", "");
            } else {
                var37++;
            }
            if (Statics.field665 == null) {
                Statics.field665 = class146.method854(Statics.field887, "headicons_pk", "");
            } else {
                var37++;
            }
            if (Statics.field554 == null) {
                Statics.field554 = class146.method854(Statics.field887, "headicons_prayer", "");
            } else {
                var37++;
            }
            if (Statics.field2207 == null) {
                Statics.field2207 = class146.method854(Statics.field887, "headicons_hint", "");
            } else {
                var37++;
            }
            if (Statics.field2656 == null) {
                Statics.field2656 = class146.method854(Statics.field887, "mapmarker", "");
            } else {
                var37++;
            }
            if (Statics.field1431 == null) {
                Statics.field1431 = class146.method854(Statics.field887, "cross", "");
            } else {
                var37++;
            }
            if (Statics.field899 == null) {
                Statics.field899 = class146.method854(Statics.field887, "mapdots", "");
            } else {
                var37++;
            }
            if (Statics.field1773 == null) {
                Statics.field1773 = class146.method3072(Statics.field887, "scrollbar", "");
            } else {
                var37++;
            }
            if (Statics.field497 == null) {
                Statics.field497 = class146.method3072(Statics.field887, "mod_icons", "");
            } else {
                var37++;
            }
            if (Statics.field2184 == null) {
                Statics.field2184 = class146.method958(Statics.field887, "mapback", "");
            } else {
                var37++;
            }
            if (var37 < 14) {
                class103.field1415 = class98.field1157 + var37 * 100 / 14 + "%";
                class103.field1414 = 70;
            } else {
                Statics.field22 = Statics.field497;
                Statics.field2679.method2613();
                int var38 = (int) (Math.random() * 21.0D) - 10;
                int var39 = (int) (Math.random() * 21.0D) - 10;
                int var40 = (int) (Math.random() * 21.0D) - 10;
                int var41 = (int) (Math.random() * 41.0D) - 20;
                for (int var42 = 0; var42 < Statics.field2665.length; var42++) {
                    Statics.field2665[var42].method2612(var38 + var41, var39 + var41, var40 + var41);
                }
                Statics.field2476[0].method2709(var38 + var41, var39 + var41, var40 + var41);
                method1079();
                class103.field1415 = class98.field1158;
                class103.field1414 = 70;
                field1490 = 90;
            }
        } else if (field1490 == 90) {
            if (Statics.field1504.method1087()) {
                class52 var43 = new class52(Statics.field1504, Statics.field887, 20, 0.8D, field1478 ? 64 : 128);
                class151.method2790(var43);
                class151.method2791(0.8D);
                class103.field1415 = class98.field1160;
                class103.field1414 = 90;
                field1490 = 110;
            } else {
                class103.field1415 = class98.field1176 + Statics.field1504.method1424() + "%";
                class103.field1414 = 90;
            }
        } else if (field1490 == 110) {
            Statics.field676 = new class88();
            Statics.field2009.method1905(Statics.field676, 10);
            class103.field1415 = class98.field1161;
            class103.field1414 = 94;
            field1490 = 120;
        } else if (field1490 == 120) {
            if (Statics.field2345.method1101("huffman", "")) {
                class37 var44 = new class37(Statics.field2345.method1106("huffman", ""));
                class24.method2784(var44);
                class103.field1415 = class98.field1266;
                class103.field1414 = 96;
                field1490 = 130;
            } else {
                class103.field1415 = class98.field1280 + "%";
                class103.field1414 = 96;
            }
        } else if (field1490 == 130) {
            if (!Statics.field545.method1087()) {
                class103.field1415 = class98.field1164 + Statics.field545.method1424() * 4 / 5 + "%";
                class103.field1414 = 100;
            } else if (!Statics.field2566.method1087()) {
                class103.field1415 = class98.field1164 + (80 + Statics.field2566.method1424() / 6) + "%";
                class103.field1414 = 100;
            } else if (Statics.field620.method1087()) {
                class103.field1415 = class98.field1306;
                class103.field1414 = 100;
                field1490 = 140;
            } else {
                class103.field1415 = class98.field1164 + (96 + Statics.field620.method1424() / 20) + "%";
                class103.field1414 = 100;
            }
        } else if (field1490 == 140) {
            method931(10);
        }
    }

    @ObfuscatedName("au.ag(Laa;I)V")
    public static final void method3280(class181 arg0) {
        if (field1483 == arg0.field2730 || arg0.field2711 == -1 || arg0.field2714 != 0 || arg0.field2713 + 1 > class166.method274(arg0.field2711).field2531[arg0.field2726]) {
            int var1 = arg0.field2730 - arg0.field2725;
            int var2 = field1483 - arg0.field2725;
            int var3 = arg0.field2703 * 128 + arg0.field2697 * 64;
            int var4 = arg0.field2723 * 128 + arg0.field2697 * 64;
            int var5 = arg0.field2722 * 128 + arg0.field2697 * 64;
            int var6 = arg0.field2724 * 128 + arg0.field2697 * 64;
            arg0.field2735 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field2683 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field2737 = 0;
        if (arg0.field2727 == 0) {
            arg0.field2707 = 1024;
        }
        if (arg0.field2727 == 1) {
            arg0.field2707 = 1536;
        }
        if (arg0.field2727 == 2) {
            arg0.field2707 = 0;
        }
        if (arg0.field2727 == 3) {
            arg0.field2707 = 512;
        }
        arg0.field2684 = arg0.field2707;
    }

    @ObfuscatedName("ai.cz(Lfb;I)Z")
    public static final boolean method3349(class75 arg0) {
        int var1 = arg0.field731;
        if (var1 == 205) {
            field1522 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1733.method972(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1733.method962(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1733.method979(false);
        }
        if (var1 == 325) {
            field1733.method979(true);
        }
        if (var1 == 326) {
            field1515.method2253(166);
            field1733.method988(field1515);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aj.ba(IIILjava/lang/String;B)V")
    public static void method3357(int arg0, int arg1, int arg2, String arg3) {
        class75 var4 = class75.method811(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field814 != null) {
            class72 var5 = new class72();
            var5.field682 = var4;
            var5.field685 = arg0;
            var5.field686 = arg3;
            var5.field678 = var4.field814;
            class65.method1306(var5);
        }
        boolean var6 = true;
        if (var4.field731 > 0) {
            var6 = method3349(var4);
        }
        if (!var6) {
            return;
        }
        int var7 = method855(var4);
        int var8 = arg0 - 1;
        boolean var9 = (var7 >> var8 + 1 & 0x1) != 0;
        if (!var9) {
            return;
        }
        if (arg0 == 1) {
            field1515.method2253(54);
            field1515.method360(arg1);
            field1515.method358(arg2);
        }
        if (arg0 == 2) {
            field1515.method2253(19);
            field1515.method360(arg1);
            field1515.method358(arg2);
        }
        if (arg0 == 3) {
            field1515.method2253(196);
            field1515.method360(arg1);
            field1515.method358(arg2);
        }
        if (arg0 == 4) {
            field1515.method2253(31);
            field1515.method360(arg1);
            field1515.method358(arg2);
        }
        if (arg0 == 5) {
            field1515.method2253(201);
            field1515.method360(arg1);
            field1515.method358(arg2);
        }
        if (arg0 == 6) {
            field1515.method2253(8);
            field1515.method360(arg1);
            field1515.method358(arg2);
        }
        if (arg0 == 7) {
            field1515.method2253(52);
            field1515.method360(arg1);
            field1515.method358(arg2);
        }
        if (arg0 == 8) {
            field1515.method2253(111);
            field1515.method360(arg1);
            field1515.method358(arg2);
        }
        if (arg0 == 9) {
            field1515.method2253(232);
            field1515.method360(arg1);
            field1515.method358(arg2);
        }
        if (arg0 == 10) {
            field1515.method2253(22);
            field1515.method360(arg1);
            field1515.method358(arg2);
        }
    }

    @ObfuscatedName("ap.cl(IIII)V")
    public static final void method3372(int arg0, int arg1, int arg2) {
        method3467();
        class139.method2344(arg0, arg1, Statics.field2184.field2180 + arg0, Statics.field2184.field2178 + arg1);
        if (field1709 == 2 || field1709 == 5) {
            class139.method2301(arg0 + 25, arg1 + 5, 0, Statics.field1049, Statics.field521);
        } else {
            int var3 = field1600 + field1549 & 0x7FF;
            int var4 = Statics.field387.field2735 / 32 + 48;
            int var5 = 464 - Statics.field387.field2683 / 32;
            Statics.field1040.method2660(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field1730 + 256, Statics.field1049, Statics.field521);
            for (int var6 = 0; var6 < field1703; var6++) {
                int var7 = field1472[var6] * 4 + 2 - Statics.field387.field2735 / 32;
                int var8 = field1593[var6] * 4 + 2 - Statics.field387.field2683 / 32;
                method618(arg0, arg1, var7, var8, field1706[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class13 var11 = field1609[Statics.field1863][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field387.field2735 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field387.field2683 / 32;
                        method618(arg0, arg1, var12, var13, Statics.field899[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field1512; var14++) {
                class58 var15 = field1658[field1520[var14]];
                if (var15 != null && var15.method821()) {
                    class183 var16 = var15.field501;
                    if (var16 != null && var16.field2775 != null) {
                        var16 = var16.method3482();
                    }
                    if (var16 != null && var16.field2771 && var16.field2783) {
                        int var17 = var15.field2735 / 32 - Statics.field387.field2735 / 32;
                        int var18 = var15.field2683 / 32 - Statics.field387.field2683 / 32;
                        method618(arg0, arg1, var17, var18, Statics.field899[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field1562; var19++) {
                class68 var20 = field1595[field1605[var19]];
                if (var20 != null && var20.method821()) {
                    int var21 = var20.field2735 / 32 - Statics.field387.field2735 / 32;
                    int var22 = var20.field2683 / 32 - Statics.field387.field2683 / 32;
                    boolean var23 = false;
                    if (method2211(var20.field632)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field1791; var25++) {
                        if (var20.field632.equals(Statics.field854[var25].field482)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field387.field647 != 0 && var20.field647 != 0 && Statics.field387.field647 == var20.field647) {
                        var26 = true;
                    }
                    if (var23) {
                        method618(arg0, arg1, var21, var22, Statics.field899[3]);
                    } else if (var26) {
                        method618(arg0, arg1, var21, var22, Statics.field899[4]);
                    } else if (var24) {
                        method618(arg0, arg1, var21, var22, Statics.field899[5]);
                    } else {
                        method618(arg0, arg1, var21, var22, Statics.field899[2]);
                    }
                }
            }
            if (field1491 != 0 && field1483 % 20 < 10) {
                if (field1491 == 1 && field1573 >= 0 && field1573 < field1658.length) {
                    class58 var27 = field1658[field1573];
                    if (var27 != null) {
                        int var28 = var27.field2735 / 32 - Statics.field387.field2735 / 32;
                        int var29 = var27.field2683 / 32 - Statics.field387.field2683 / 32;
                        method900(arg0, arg1, var28, var29, Statics.field2656[1]);
                    }
                }
                if (field1491 == 2) {
                    int var30 = field1647 * 4 - Statics.field2469 * 4 + 2 - Statics.field387.field2735 / 32;
                    int var31 = field1495 * 4 - Statics.field622 * 4 + 2 - Statics.field387.field2683 / 32;
                    method900(arg0, arg1, var30, var31, Statics.field2656[1]);
                }
                if (field1491 == 10 && field1493 >= 0 && field1493 < field1595.length) {
                    class68 var32 = field1595[field1493];
                    if (var32 != null) {
                        int var33 = var32.field2735 / 32 - Statics.field387.field2735 / 32;
                        int var34 = var32.field2683 / 32 - Statics.field387.field2683 / 32;
                        method900(arg0, arg1, var33, var34, Statics.field2656[1]);
                    }
                }
            }
            if (field1509 != 0) {
                int var35 = field1509 * 4 + 2 - Statics.field387.field2735 / 32;
                int var36 = field1708 * 4 + 2 - Statics.field387.field2683 / 32;
                method618(arg0, arg1, var35, var36, Statics.field2656[0]);
            }
            class139.method2353(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field1709 < 3) {
            Statics.field2429.method2660(arg0, arg1, 33, 33, 25, 25, field1600, 256, Statics.field2418, Statics.field856);
        } else {
            class139.method2301(arg0, arg1, 0, Statics.field2418, Statics.field856);
        }
        if (field1587[arg2]) {
            Statics.field2184.method2710(arg0, arg1);
        }
        field1705[arg2] = true;
    }

    @ObfuscatedName("ac.aw(B)V")
    public static final void method3396() {
        method1077(false);
        field1528 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field546.length; var1++) {
            if (Statics.field1844[var1] != -1 && Statics.field546[var1] == null) {
                Statics.field546[var1] = Statics.field424.method1083(Statics.field1844[var1], 0);
                if (Statics.field546[var1] == null) {
                    var0 = false;
                    field1528++;
                }
            }
            if (Statics.field61[var1] != -1 && Statics.field714[var1] == null) {
                Statics.field714[var1] = Statics.field424.method1124(Statics.field61[var1], 0, Statics.field2551[var1]);
                if (Statics.field714[var1] == null) {
                    var0 = false;
                    field1528++;
                }
            }
        }
        if (!var0) {
            field1723 = 1;
            return;
        }
        field1498 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field546.length; var3++) {
            byte[] var4 = Statics.field714[var3];
            if (var4 != null) {
                int var5 = (Statics.field623[var3] >> 8) * 64 - Statics.field2469;
                int var6 = (Statics.field623[var3] & 0xFF) * 64 - Statics.field622;
                if (field1615) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class31 var9 = new class31(var4);
                int var10 = -1;
                label593: while (true) {
                    int var11 = var9.method384();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method384();
                            if (var16 == 0) {
                                continue label593;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method512() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class184 var22 = Statics.method2861(var10);
                                if (var19 != 22 || !field1478 || var22.field2808 != 0 || var22.field2799 == 1 || var22.field2828) {
                                    if (!var22.method3521()) {
                                        field1498++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method384();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method512();
                    }
                }
            }
        }
        if (!var2) {
            field1723 = 2;
            return;
        }
        if (field1723 != 0) {
            method1447(class98.field1172 + class94.field1092 + class94.field1087 + 100 + "%" + class94.field1090, true);
        }
        method3467();
        method747();
        method3467();
        Statics.field2658.method2366();
        method3467();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field1533[var23].method164();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class60.field512[var24][var25][var26] = 0;
                }
            }
        }
        method3467();
        class60.field513 = 99;
        Statics.field516 = new byte[4][104][104];
        Statics.field515 = new byte[4][104][104];
        Statics.field530 = new byte[4][104][104];
        Statics.field481 = new byte[4][104][104];
        Statics.field1053 = new int[4][105][105];
        Statics.field1079 = new byte[4][105][105];
        Statics.field562 = new int[105][105];
        Statics.field517 = new int[104];
        Statics.field514 = new int[104];
        Statics.field2645 = new int[104];
        Statics.field1095 = new int[104];
        Statics.field2630 = new int[104];
        int var27 = Statics.field546.length;
        class66.method2092();
        method1077(true);
        if (!field1615) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field623[var28] >> 8) * 64 - Statics.field2469;
                int var30 = (Statics.field623[var28] & 0xFF) * 64 - Statics.field622;
                byte[] var31 = Statics.field546[var28];
                if (var31 != null) {
                    method3467();
                    int var32 = Statics.field2661 * 8 - 48;
                    int var33 = Statics.field2029 * 8 - 48;
                    class8[] var34 = field1533;
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 64; var36++) {
                            for (int var37 = 0; var37 < 64; var37++) {
                                if (var29 + var36 > 0 && var29 + var36 < 103 && var30 + var37 > 0 && var30 + var37 < 103) {
                                    var34[var35].field47[var29 + var36][var30 + var37] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class31 var38 = new class31(var31);
                    for (int var39 = 0; var39 < 4; var39++) {
                        for (int var40 = 0; var40 < 64; var40++) {
                            for (int var41 = 0; var41 < 64; var41++) {
                                class60.method897(var38, var39, var29 + var40, var30 + var41, var32, var33, 0);
                            }
                        }
                    }
                }
            }
            for (int var42 = 0; var42 < var27; var42++) {
                int var43 = (Statics.field623[var42] >> 8) * 64 - Statics.field2469;
                int var44 = (Statics.field623[var42] & 0xFF) * 64 - Statics.field622;
                byte[] var45 = Statics.field546[var42];
                if (var45 == null && Statics.field2029 < 800) {
                    method3467();
                    class60.method770(var43, var44, 64, 64);
                }
            }
            method1077(true);
            for (int var46 = 0; var46 < var27; var46++) {
                byte[] var47 = Statics.field714[var46];
                if (var47 != null) {
                    int var48 = (Statics.field623[var46] >> 8) * 64 - Statics.field2469;
                    int var49 = (Statics.field623[var46] & 0xFF) * 64 - Statics.field622;
                    method3467();
                    class141 var50 = Statics.field2658;
                    class8[] var51 = field1533;
                    class31 var52 = new class31(var47);
                    int var53 = -1;
                    while (true) {
                        int var54 = var52.method384();
                        if (var54 == 0) {
                            break;
                        }
                        var53 += var54;
                        int var55 = 0;
                        while (true) {
                            int var56 = var52.method384();
                            if (var56 == 0) {
                                break;
                            }
                            var55 += var56 - 1;
                            int var57 = var55 & 0x3F;
                            int var58 = var55 >> 6 & 0x3F;
                            int var59 = var55 >> 12;
                            int var60 = var52.method512();
                            int var61 = var60 >> 2;
                            int var62 = var60 & 0x3;
                            int var63 = var48 + var58;
                            int var64 = var49 + var57;
                            if (var63 > 0 && var64 > 0 && var63 < 103 && var64 < 103) {
                                int var65 = var59;
                                if ((class60.field512[1][var63][var64] & 0x2) == 2) {
                                    var65 = var59 - 1;
                                }
                                class8 var66 = null;
                                if (var65 >= 0) {
                                    var66 = var51[var65];
                                }
                                class60.method2783(var59, var63, var64, var53, var62, var61, var50, var66);
                            }
                        }
                    }
                }
            }
        }
        if (field1615) {
            for (int var67 = 0; var67 < 4; var67++) {
                method3467();
                for (int var68 = 0; var68 < 13; var68++) {
                    for (int var69 = 0; var69 < 13; var69++) {
                        boolean var70 = false;
                        int var71 = field1535[var67][var68][var69];
                        if (var71 != -1) {
                            int var72 = var71 >> 24 & 0x3;
                            int var73 = var71 >> 1 & 0x3;
                            int var74 = var71 >> 14 & 0x3FF;
                            int var75 = var71 >> 3 & 0x7FF;
                            int var76 = (var74 / 8 << 8) + var75 / 8;
                            for (int var77 = 0; var77 < Statics.field623.length; var77++) {
                                if (Statics.field623[var77] == var76 && Statics.field546[var77] != null) {
                                    byte[] var78 = Statics.field546[var77];
                                    int var79 = var68 * 8;
                                    int var80 = var69 * 8;
                                    int var81 = (var74 & 0x7) * 8;
                                    int var82 = (var75 & 0x7) * 8;
                                    class8[] var83 = field1533;
                                    for (int var84 = 0; var84 < 8; var84++) {
                                        for (int var85 = 0; var85 < 8; var85++) {
                                            if (var79 + var84 > 0 && var79 + var84 < 103 && var80 + var85 > 0 && var80 + var85 < 103) {
                                                var83[var67].field47[var79 + var84][var80 + var85] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class31 var86 = new class31(var78);
                                    for (int var87 = 0; var87 < 4; var87++) {
                                        for (int var88 = 0; var88 < 64; var88++) {
                                            for (int var89 = 0; var89 < 64; var89++) {
                                                if (var72 == var87 && var88 >= var81 && var88 < var81 + 8 && var89 >= var82 && var89 < var82 + 8) {
                                                    int var93 = var88 & 0x7;
                                                    int var94 = var89 & 0x7;
                                                    int var96 = var73 & 0x3;
                                                    int var97;
                                                    if (var96 == 0) {
                                                        var97 = var93;
                                                    } else if (var96 == 1) {
                                                        var97 = var94;
                                                    } else if (var96 == 2) {
                                                        var97 = 7 - var93;
                                                    } else {
                                                        var97 = 7 - var94;
                                                    }
                                                    class60.method897(var86, var67, var79 + var97, var80 + class11.method818(var88 & 0x7, var89 & 0x7, var73), 0, 0, var73);
                                                } else {
                                                    class60.method897(var86, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var70 = true;
                                    break;
                                }
                            }
                        }
                        if (!var70) {
                            class60.method1188(var67, var68 * 8, var69 * 8);
                        }
                    }
                }
            }
            for (int var98 = 0; var98 < 13; var98++) {
                for (int var99 = 0; var99 < 13; var99++) {
                    int var100 = field1535[0][var98][var99];
                    if (var100 == -1) {
                        class60.method770(var98 * 8, var99 * 8, 8, 8);
                    }
                }
            }
            method1077(true);
            for (int var101 = 0; var101 < 4; var101++) {
                method3467();
                for (int var102 = 0; var102 < 13; var102++) {
                    label385: for (int var103 = 0; var103 < 13; var103++) {
                        int var104 = field1535[var101][var102][var103];
                        if (var104 != -1) {
                            int var105 = var104 >> 24 & 0x3;
                            int var106 = var104 >> 1 & 0x3;
                            int var107 = var104 >> 14 & 0x3FF;
                            int var108 = var104 >> 3 & 0x7FF;
                            int var109 = (var107 / 8 << 8) + var108 / 8;
                            for (int var110 = 0; var110 < Statics.field623.length; var110++) {
                                if (Statics.field623[var110] == var109 && Statics.field714[var110] != null) {
                                    byte[] var111 = Statics.field714[var110];
                                    int var112 = var102 * 8;
                                    int var113 = var103 * 8;
                                    int var114 = (var107 & 0x7) * 8;
                                    int var115 = (var108 & 0x7) * 8;
                                    class141 var116 = Statics.field2658;
                                    class8[] var117 = field1533;
                                    class31 var118 = new class31(var111);
                                    int var119 = -1;
                                    while (true) {
                                        int var120 = var118.method384();
                                        if (var120 == 0) {
                                            continue label385;
                                        }
                                        var119 += var120;
                                        int var121 = 0;
                                        while (true) {
                                            int var122 = var118.method384();
                                            if (var122 == 0) {
                                                break;
                                            }
                                            var121 += var122 - 1;
                                            int var123 = var121 & 0x3F;
                                            int var124 = var121 >> 6 & 0x3F;
                                            int var125 = var121 >> 12;
                                            int var126 = var118.method512();
                                            int var127 = var126 >> 2;
                                            int var128 = var126 & 0x3;
                                            if (var105 == var125 && var124 >= var114 && var124 < var114 + 8 && var123 >= var115 && var123 < var115 + 8) {
                                                class184 var129 = Statics.method2861(var119);
                                                int var131 = var124 & 0x7;
                                                int var132 = var123 & 0x7;
                                                int var134 = var129.field2804;
                                                int var135 = var129.field2834;
                                                if ((var128 & 0x1) == 1) {
                                                    int var136 = var134;
                                                    var134 = var135;
                                                    var135 = var136;
                                                }
                                                int var137 = var106 & 0x3;
                                                int var138;
                                                if (var137 == 0) {
                                                    var138 = var131;
                                                } else if (var137 == 1) {
                                                    var138 = var132;
                                                } else if (var137 == 2) {
                                                    var138 = 7 - var131 - (var134 - 1);
                                                } else {
                                                    var138 = 7 - var132 - (var135 - 1);
                                                }
                                                int var139 = var112 + var138;
                                                int var140 = var113 + class11.method602(var124 & 0x7, var123 & 0x7, var106, var129.field2804, var129.field2834, var128);
                                                if (var139 > 0 && var140 > 0 && var139 < 103 && var140 < 103) {
                                                    int var141 = var101;
                                                    if ((class60.field512[1][var139][var140] & 0x2) == 2) {
                                                        var141 = var101 - 1;
                                                    }
                                                    class8 var142 = null;
                                                    if (var141 >= 0) {
                                                        var142 = var117[var141];
                                                    }
                                                    class60.method2783(var101, var139, var140, var119, var106 + var128 & 0x3, var127, var116, var142);
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
        method1077(true);
        method747();
        method3467();
        class60.method3575(Statics.field2658, field1533);
        method1077(true);
        int var143 = class60.field513;
        if (var143 > Statics.field1863) {
            var143 = Statics.field1863;
        }
        if (var143 < Statics.field1863 - 1) {
            int var144 = Statics.field1863 - 1;
        }
        if (field1478) {
            Statics.field2658.method2448(class60.field513);
        } else {
            Statics.field2658.method2448(0);
        }
        for (int var145 = 0; var145 < 104; var145++) {
            for (int var146 = 0; var146 < 104; var146++) {
                method211(var145, var146);
            }
        }
        method3467();
        method1336();
        class184.field2792.method910();
        if (Statics.field2513 != null) {
            field1515.method2253(59);
            field1515.method360(1057001181);
        }
        if (!field1615) {
            int var147 = (Statics.field2661 - 6) / 8;
            int var148 = (Statics.field2661 + 6) / 8;
            int var149 = (Statics.field2029 - 6) / 8;
            int var150 = (Statics.field2029 + 6) / 8;
            for (int var151 = var147 - 1; var151 <= var148 + 1; var151++) {
                for (int var152 = var149 - 1; var152 <= var150 + 1; var152++) {
                    if (var151 < var147 || var151 > var148 || var152 < var149 || var152 > var150) {
                        Statics.field424.method1102("m" + var151 + "_" + var152);
                        Statics.field424.method1102("l" + var151 + "_" + var152);
                    }
                }
            }
        }
        method931(30);
        method3467();
        Statics.field516 = (byte[][][]) null;
        Statics.field515 = (byte[][][]) null;
        Statics.field530 = (byte[][][]) null;
        Statics.field481 = (byte[][][]) null;
        Statics.field1053 = (int[][][]) null;
        Statics.field1079 = (byte[][][]) null;
        Statics.field562 = (int[][]) null;
        Statics.field517 = null;
        Statics.field514 = null;
        Statics.field2645 = null;
        Statics.field1095 = null;
        Statics.field2630 = null;
        field1515.method2253(101);
        class122.method757();
    }

    @ObfuscatedName("ac.ch(Lfb;I)Z")
    public static final boolean method3406(class75 arg0) {
        if (arg0.field824 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field824.length; var1++) {
            int var2 = method2090(arg0, var1);
            int var3 = arg0.field758[var1];
            if (arg0.field824[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field824[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field824[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ac.ah(Laa;I)V")
    public static final void method3412(class181 arg0) {
        arg0.field2682 = arg0.field2687;
        if (arg0.field2689 == 0) {
            arg0.field2737 = 0;
            return;
        }
        if (arg0.field2711 != -1 && arg0.field2714 == 0) {
            class166 var1 = class166.method274(arg0.field2711);
            if (arg0.field2738 > 0 && var1.field2543 == 0) {
                arg0.field2737++;
                return;
            }
            if (arg0.field2738 <= 0 && var1.field2541 == 0) {
                arg0.field2737++;
                return;
            }
        }
        int var2 = arg0.field2735;
        int var3 = arg0.field2683;
        int var4 = arg0.field2734[arg0.field2689 - 1] * 128 + arg0.field2697 * 64;
        int var5 = arg0.field2698[arg0.field2689 - 1] * 128 + arg0.field2697 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field2735 = var4;
            arg0.field2683 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field2707 = 1280;
            } else if (var3 > var5) {
                arg0.field2707 = 1792;
            } else {
                arg0.field2707 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field2707 = 768;
            } else if (var3 > var5) {
                arg0.field2707 = 256;
            } else {
                arg0.field2707 = 512;
            }
        } else if (var3 < var5) {
            arg0.field2707 = 1024;
        } else if (var3 > var5) {
            arg0.field2707 = 0;
        }
        int var6 = arg0.field2707 - arg0.field2684 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field2691;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field2690;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field2719;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field2692;
        }
        if (var7 == -1) {
            var7 = arg0.field2690;
        }
        arg0.field2682 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class58) {
            var9 = ((class58) arg0).field501.field2784;
        }
        if (var9) {
            if (arg0.field2707 != arg0.field2684 && arg0.field2705 == -1 && arg0.field2732 != 0) {
                var8 = 2;
            }
            if (arg0.field2689 > 2) {
                var8 = 6;
            }
            if (arg0.field2689 > 3) {
                var8 = 8;
            }
            if (arg0.field2737 > 0 && arg0.field2689 > 1) {
                var8 = 8;
                arg0.field2737--;
            }
        } else {
            if (arg0.field2689 > 1) {
                var8 = 6;
            }
            if (arg0.field2689 > 2) {
                var8 = 8;
            }
            if (arg0.field2737 > 0 && arg0.field2689 > 1) {
                var8 = 8;
                arg0.field2737--;
            }
        }
        if (arg0.field2736[arg0.field2689 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field2690 == arg0.field2682 && arg0.field2694 != -1) {
            arg0.field2682 = arg0.field2694;
        }
        if (var2 < var4) {
            arg0.field2735 += var8;
            if (arg0.field2735 > var4) {
                arg0.field2735 = var4;
            }
        } else if (var2 > var4) {
            arg0.field2735 -= var8;
            if (arg0.field2735 < var4) {
                arg0.field2735 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field2683 += var8;
            if (arg0.field2683 > var5) {
                arg0.field2683 = var5;
            }
        } else if (var3 > var5) {
            arg0.field2683 -= var8;
            if (arg0.field2683 < var5) {
                arg0.field2683 = var5;
            }
        }
        if (arg0.field2735 == var4 && arg0.field2683 == var5) {
            arg0.field2689--;
            if (arg0.field2738 > 0) {
                arg0.field2738--;
            }
        }
    }

    @ObfuscatedName("ad.bt(I)V")
    public static final void method3428() {
        int var0 = Statics.field561.method89(class98.field1258);
        for (int var1 = 0; var1 < field1618; var1++) {
            class23 var2 = Statics.field561;
            String var3;
            if (field1624[var1].length() > 0) {
                var3 = field1623[var1] + class98.field1286 + field1624[var1];
            } else {
                var3 = field1623[var1];
            }
            int var4 = var2.method89(var3);
            if (var4 > var0) {
                var0 = var4;
            }
        }
        var0 += 8;
        int var5 = field1618 * 15 + 21;
        int var6 = class108.field1737 - var0 / 2;
        if (var0 + var6 > 765) {
            var6 = 765 - var0;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = class108.field1749;
        if (var5 + var7 > 503) {
            var7 = 503 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field1633 = true;
        Statics.field906 = var6;
        Statics.field1902 = var7;
        Statics.field2742 = var0;
        Statics.field141 = field1618 * 15 + 22;
    }

    @ObfuscatedName("aa.y(B)V")
    public static final void method3447() {
        if (field1522 > 0) {
            Statics.method1984();
        } else {
            method931(40);
            Statics.field1722 = Statics.field2646;
            Statics.field2646 = null;
        }
    }

    @ObfuscatedName("ab.cf(IIIIIIIIB)V")
    public static final void method3453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class75.method299(arg0)) {
            Statics.field2628 = null;
            method744(Statics.field826[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2628 != null) {
                method744(Statics.field2628, -1412584499, arg1, arg2, arg3, arg4, Statics.field1785, Statics.field1382, arg7);
                Statics.field2628 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1668[var8] = true;
            }
        } else {
            field1668[arg7] = true;
        }
    }

    @ObfuscatedName("ab.k(B)V")
    public static final void method3467() {
        if (Statics.field926 != null) {
            Statics.field926.method3541();
        }
        if (Statics.field223 != null) {
            Statics.field223.method3541();
        }
    }

    @ObfuscatedName("af.au(Ljava/lang/String;I)V")
    public static final void method3568(String arg0) {
        if (arg0.equalsIgnoreCase("::toggleroof")) {
            Statics.field1855.field1381 = !Statics.field1855.field1381;
            class101.method748();
            if (Statics.field1855.field1381) {
                method862(0, "", "Roofs are now all hidden");
            } else {
                method862(0, "", "Roofs will only be removed selectively");
            }
        }
        if (field1534 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                method3447();
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                field1681 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                field1681 = false;
            }
            if (arg0.equalsIgnoreCase("::noclip")) {
                for (int var1 = 0; var1 < 4; var1++) {
                    for (int var2 = 1; var2 < 103; var2++) {
                        for (int var3 = 1; var3 < 103; var3++) {
                            field1533[var1].field47[var2][var3] = 0;
                        }
                    }
                }
            }
            if (arg0.equalsIgnoreCase("::errortest") && field1476 == 2) {
                throw new RuntimeException();
            }
        }
        field1515.method2253(112);
        field1515.method357(arg0.length() - 1);
        field1515.method506(arg0.substring(2));
    }
}

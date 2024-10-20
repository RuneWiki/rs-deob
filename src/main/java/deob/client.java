package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;

public final class client extends class125 {

    @ObfuscatedName("client.fz")
    public static int field1620 = 0;

    @ObfuscatedName("client.fw")
    public static int field1624 = 50;

    @ObfuscatedName("client.fy")
    public static int field1760 = 7759444;

    @ObfuscatedName("client.fk")
    public static int field1623 = 0;

    @ObfuscatedName("client.fj")
    public static int field1617 = 0;

    @ObfuscatedName("client.fl")
    public static int[] field1693 = new int[field1624];

    @ObfuscatedName("client.ff")
    public static int[] field1686 = new int[field1624];

    @ObfuscatedName("client.fi")
    public static boolean field1705 = false;

    @ObfuscatedName("client.fr")
    public static int[] field1626 = new int[field1624];

    @ObfuscatedName("client.ft")
    public static int[] field1756 = new int[field1624];

    @ObfuscatedName("client.fo")
    public static int field1622 = 0;

    @ObfuscatedName("client.fn")
    public static int field1619 = 0;

    @ObfuscatedName("client.fq")
    public static boolean field1621 = false;

    @ObfuscatedName("client.fp")
    public static int[] field1611 = new int[field1624];

    @ObfuscatedName("client.gx")
    public static int field1635 = -1;

    @ObfuscatedName("client.gk")
    public static String[] field1632 = new String[field1624];

    @ObfuscatedName("client.gi")
    public static int[][] field1633 = new int[104][104];

    @ObfuscatedName("client.gu")
    public static int field1634 = 0;

    @ObfuscatedName("client.dt")
    public static int field1598 = 2;

    @ObfuscatedName("client.dw")
    public static final int[] field1591 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dz")
    public static int field1612 = 0;

    @ObfuscatedName("client.eb")
    public static int field1740 = 2301979;

    @ObfuscatedName("client.ed")
    public static int field1561 = 0;

    @ObfuscatedName("client.de")
    public static int field1587 = 0;

    @ObfuscatedName("client.dd")
    public static int[] field1595 = new int[4000];

    @ObfuscatedName("client.dg")
    public static int[][][] field1590 = new int[4][13][13];

    @ObfuscatedName("client.dh")
    public static int field1597 = 0;

    @ObfuscatedName("client.dk")
    public static int field1599 = 0;

    @ObfuscatedName("client.dj")
    public static boolean field1589 = false;

    @ObfuscatedName("client.dm")
    public static int field1604 = 0;

    @ObfuscatedName("client.dl")
    public static int[] field1774 = new int[4000];

    @ObfuscatedName("client.do")
    public static int field1602 = 1;

    @ObfuscatedName("client.dp")
    public static int field1726 = 0;

    @ObfuscatedName("client.ds")
    public static int[][] field1593 = new int[104][104];

    @ObfuscatedName("client.dr")
    public static int field1548 = 0;

    @ObfuscatedName("client.g")
    public static boolean field1537 = false;

    @ObfuscatedName("client.ev")
    public static int field1607 = 1;

    @ObfuscatedName("client.c")
    public static boolean field1547 = false;

    @ObfuscatedName("client.a")
    public static int field1606 = -1;

    @ObfuscatedName("client.fa")
    public static int[] field1790 = new int[field1624];

    @ObfuscatedName("client.o")
    public static int field1538 = 0;

    @ObfuscatedName("client.l")
    public static int field1781 = 0;

    @ObfuscatedName("client.m")
    public static boolean field1546 = true;

    @ObfuscatedName("client.fd")
    public static int field1544 = 0;

    @ObfuscatedName("client.j")
    public static boolean field1675 = false;

    @ObfuscatedName("client.fe")
    public static int field1616 = 128;

    @ObfuscatedName("client.k")
    public static boolean field1643 = true;

    @ObfuscatedName("client.fb")
    public static int[] field1629 = new int[field1624];

    @ObfuscatedName("client.fc")
    public static int field1711 = 0;

    @ObfuscatedName("client.i")
    public static int field1541 = 0;

    @ObfuscatedName("client.w")
    public static class8[] field1588 = new class8[4];

    @ObfuscatedName("client.eg")
    public static int field1751 = 5063219;

    @ObfuscatedName("client.v")
    public static int field1534 = 0;

    @ObfuscatedName("client.ef")
    public static int field1673 = 2;

    @ObfuscatedName("client.u")
    public static int field1543 = -1;

    @ObfuscatedName("client.ee")
    public static int field1608 = 0;

    @ObfuscatedName("client.t")
    public static int field1533 = 1;

    @ObfuscatedName("client.r")
    public static long field1542 = 1L;

    @ObfuscatedName("client.q")
    public static int field1539 = 0;

    @ObfuscatedName("client.p")
    public static int field1545 = -1;

    @ObfuscatedName("client.et")
    public static int field1594 = 3353893;

    @ObfuscatedName("client.z")
    public static boolean field1700 = true;

    @ObfuscatedName("client.eq")
    public static int field1609 = 0;

    @ObfuscatedName("client.cb")
    public static int field1574 = 0;

    @ObfuscatedName("client.by")
    public static int field1563 = 0;

    @ObfuscatedName("client.bs")
    public static int[] field1569 = new int[32768];

    @ObfuscatedName("client.bt")
    public static int field1568 = 0;

    @ObfuscatedName("client.bq")
    public static int field1768 = 0;

    @ObfuscatedName("client.bk")
    public static int field1562 = 0;

    @ObfuscatedName("client.bg")
    public static class62[] field1567 = new class62[32768];

    @ObfuscatedName("client.bi")
    public static int field1564 = 0;

    @ObfuscatedName("client.dc")
    public static int[][] field1618 = new int[104][104];

    @ObfuscatedName("client.db")
    public static int field1600 = 2;

    @ObfuscatedName("client.cz")
    public static class49 field1677 = new class49(5000);

    @ObfuscatedName("client.cy")
    public static int field1573 = 0;

    @ObfuscatedName("client.cw")
    public static int field1615 = 0;

    @ObfuscatedName("client.cv")
    public static int field1752 = 0;

    @ObfuscatedName("client.ct")
    public static int field1710 = 0;

    @ObfuscatedName("client.co")
    public static int field1580 = 0;

    @ObfuscatedName("client.cm")
    public static int field1578 = 0;

    @ObfuscatedName("client.cn")
    public static class49 field1572 = new class49(5000);

    @ObfuscatedName("client.ck")
    public static int field1791 = 0;

    @ObfuscatedName("client.ci")
    public static class49 field1570 = new class49(5000);

    @ObfuscatedName("client.cj")
    public static int field1783 = 1;

    @ObfuscatedName("client.ch")
    public static int field1695 = 1;

    @ObfuscatedName("client.ce")
    public static int field1714 = 0;

    @ObfuscatedName("client.cf")
    public static int field1730 = 0;

    @ObfuscatedName("client.cc")
    public static boolean field1652 = false;

    @ObfuscatedName("client.cd")
    public static int field1579 = 0;

    @ObfuscatedName("client.ba")
    public static int field1792 = 0;

    @ObfuscatedName("client.ar")
    public static int field1555 = 0;

    @ObfuscatedName("client.aq")
    public static int field1552 = 0;

    @ObfuscatedName("client.ax")
    public static int field1698 = 0;

    @ObfuscatedName("client.aw")
    public static int field1697 = 0;

    @ObfuscatedName("client.av")
    public static int field1744 = 0;

    @ObfuscatedName("client.ak")
    public static int field1553 = 0;

    @ObfuscatedName("client.ai")
    public static int field1723 = 0;

    @ObfuscatedName("client.ao")
    public static int field1560 = 0;

    @ObfuscatedName("client.am")
    public static int field1559 = 0;

    @ObfuscatedName("client.ac")
    public static int field1549 = 0;

    @ObfuscatedName("client.ab")
    public static int field1554 = 0;

    @ObfuscatedName("client.ah")
    public static class50 field1557 = new class50(new byte[5000]);

    @ObfuscatedName("client.gh")
    public static int field1636 = -1;

    @ObfuscatedName("client.gg")
    public static int field1571 = 0;

    @ObfuscatedName("client.gv")
    public static int field1638 = 0;

    @ObfuscatedName("client.gq")
    public static int field1639 = 0;

    @ObfuscatedName("client.gc")
    public static int field1640 = 0;

    @ObfuscatedName("client.ga")
    public static int field1641 = 0;

    @ObfuscatedName("client.gy")
    public static int field1727 = 0;

    @ObfuscatedName("client.ge")
    public static int field1662 = 0;

    @ObfuscatedName("client.gz")
    public static int field1644 = 0;

    @ObfuscatedName("client.gn")
    public static int field1645 = 0;

    @ObfuscatedName("client.gb")
    public static int field1648 = 0;

    @ObfuscatedName("client.gf")
    public static boolean field1725 = false;

    @ObfuscatedName("client.gm")
    public static int field1680 = 0;

    @ObfuscatedName("client.gl")
    public static int field1605 = 0;

    @ObfuscatedName("client.gp")
    public static class74[] field1650 = new class74[2048];

    @ObfuscatedName("client.gr")
    public static int field1651 = 0;

    @ObfuscatedName("client.gj")
    public static int[] field1731 = new int[2048];

    @ObfuscatedName("client.hq")
    public static int field1653 = 0;

    @ObfuscatedName("client.hr")
    public static int[] field1654 = new int[2048];

    @ObfuscatedName("client.hn")
    public static class50[] field1655 = new class50[2048];

    @ObfuscatedName("client.hf")
    public static int field1656 = -1;

    @ObfuscatedName("client.he")
    public static int field1657 = 0;

    @ObfuscatedName("client.ht")
    public static int field1658 = 0;

    @ObfuscatedName("client.hb")
    public static int[] field1672 = new int[1000];

    @ObfuscatedName("client.hz")
    public static final int[] field1660 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ha")
    public static String[] field1661 = new String[8];

    @ObfuscatedName("client.hv")
    public static boolean[] field1558 = new boolean[8];

    @ObfuscatedName("client.hj")
    public static int[] field1663 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hh")
    public static class15[][][] field1586 = new class15[4][104][104];

    @ObfuscatedName("client.hu")
    public static class15 field1665 = new class15();

    @ObfuscatedName("client.hw")
    public static class15 field1577 = new class15();

    @ObfuscatedName("client.hd")
    public static class15 field1667 = new class15();

    @ObfuscatedName("client.hp")
    public static int[] field1614 = new int[25];

    @ObfuscatedName("client.hx")
    public static int[] field1669 = new int[25];

    @ObfuscatedName("client.ho")
    public static int[] field1670 = new int[25];

    @ObfuscatedName("client.hs")
    public static int field1671 = 0;

    @ObfuscatedName("client.hk")
    public static boolean field1601 = false;

    @ObfuscatedName("client.iw")
    public static int field1627 = 0;

    @ObfuscatedName("client.ie")
    public static int[] field1674 = new int[500];

    @ObfuscatedName("client.id")
    public static int[] field1718 = new int[500];

    @ObfuscatedName("client.ih")
    public static int[] field1676 = new int[500];

    @ObfuscatedName("client.ip")
    public static int[] field1761 = new int[500];

    @ObfuscatedName("client.iy")
    public static String[] field1678 = new String[500];

    @ObfuscatedName("client.il")
    public static String[] field1556 = new String[500];

    @ObfuscatedName("client.is")
    public static int field1585 = -1;

    @ObfuscatedName("client.if")
    public static int field1681 = -1;

    @ObfuscatedName("client.iv")
    public static int field1682 = 0;

    @ObfuscatedName("client.ir")
    public static int field1683 = 50;

    @ObfuscatedName("client.ib")
    public static int field1684 = 0;

    @ObfuscatedName("client.it")
    public static String field1685 = null;

    @ObfuscatedName("client.ig")
    public static boolean field1530 = false;

    @ObfuscatedName("client.ia")
    public static int field1687 = -1;

    @ObfuscatedName("client.in")
    public static String field1688 = null;

    @ObfuscatedName("client.ii")
    public static String field1666 = null;

    @ObfuscatedName("client.ji")
    public static int field1690 = -1;

    @ObfuscatedName("client.jm")
    public static class3 field1691 = new class3(8);

    @ObfuscatedName("client.jn")
    public static int field1692 = 0;

    @ObfuscatedName("client.jf")
    public static int field1583 = 0;

    @ObfuscatedName("client.jl")
    public static class12 field1694 = null;

    @ObfuscatedName("client.je")
    public static int field1535 = 0;

    @ObfuscatedName("client.jk")
    public static int field1696 = 0;

    @ObfuscatedName("client.ja")
    public static int field1536 = 0;

    @ObfuscatedName("client.jb")
    public static boolean field1592 = false;

    @ObfuscatedName("client.jp")
    public static boolean field1762 = false;

    @ObfuscatedName("client.jr")
    public static boolean field1610 = false;

    @ObfuscatedName("client.jc")
    public static class12 field1701 = null;

    @ObfuscatedName("client.jz")
    public static class12 field1712 = null;

    @ObfuscatedName("client.jx")
    public static int field1703 = 0;

    @ObfuscatedName("client.jj")
    public static int field1646 = 0;

    @ObfuscatedName("client.js")
    public static class12 field1716 = null;

    @ObfuscatedName("client.jy")
    public static boolean field1706 = false;

    @ObfuscatedName("client.jv")
    public static int field1707 = -1;

    @ObfuscatedName("client.jw")
    public static int field1631 = -1;

    @ObfuscatedName("client.jq")
    public static boolean field1757 = false;

    @ObfuscatedName("client.jg")
    public static int field1596 = -1;

    @ObfuscatedName("client.jd")
    public static int field1532 = -1;

    @ObfuscatedName("client.ju")
    public static boolean field1664 = false;

    @ObfuscatedName("client.ki")
    public static int field1713 = 1;

    @ObfuscatedName("client.kf")
    public static int[] field1576 = new int[32];

    @ObfuscatedName("client.kn")
    public static int field1715 = 0;

    @ObfuscatedName("client.kd")
    public static int[] field1764 = new int[32];

    @ObfuscatedName("client.kj")
    public static int field1717 = 0;

    @ObfuscatedName("client.kr")
    public static int[] field1630 = new int[32];

    @ObfuscatedName("client.kk")
    public static int field1719 = 0;

    @ObfuscatedName("client.ky")
    public static int field1720 = 0;

    @ObfuscatedName("client.ka")
    public static int field1721 = 0;

    @ObfuscatedName("client.kt")
    public static int field1722 = 0;

    @ObfuscatedName("client.km")
    public static int field1794 = 0;

    @ObfuscatedName("client.kc")
    public static int[] field1689 = new int[2000];

    @ObfuscatedName("client.kz")
    public static String[] field1780 = new String[1000];

    @ObfuscatedName("client.kv")
    public static int field1613 = 0;

    @ObfuscatedName("client.kl")
    public static class15 field1759 = new class15();

    @ObfuscatedName("client.kg")
    public static class15 field1728 = new class15();

    @ObfuscatedName("client.kb")
    public static class15 field1729 = new class15();

    @ObfuscatedName("client.kw")
    public static class3 field1582 = new class3(512);

    @ObfuscatedName("client.ku")
    public static int field1566 = 0;

    @ObfuscatedName("client.kx")
    public static int field1732 = -2;

    @ObfuscatedName("client.kq")
    public static boolean[] field1733 = new boolean[100];

    @ObfuscatedName("client.ld")
    public static boolean[] field1734 = new boolean[100];

    @ObfuscatedName("client.lt")
    public static boolean[] field1735 = new boolean[100];

    @ObfuscatedName("client.lp")
    public static int[] field1736 = new int[100];

    @ObfuscatedName("client.lr")
    public static int[] field1747 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field1738 = new int[100];

    @ObfuscatedName("client.lv")
    public static int[] field1739 = new int[100];

    @ObfuscatedName("client.ly")
    public static int field1702 = 0;

    @ObfuscatedName("client.lj")
    public static int[] field1741 = new int[100];

    @ObfuscatedName("client.le")
    public static String[] field1737 = new String[100];

    @ObfuscatedName("client.lq")
    public static String[] field1743 = new String[100];

    @ObfuscatedName("client.lk")
    public static String[] field1668 = new String[100];

    @ObfuscatedName("client.la")
    public static int field1745 = 0;

    @ObfuscatedName("client.lz")
    public static int[] field1746 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ls")
    public static int field1699 = 0;

    @ObfuscatedName("client.lm")
    public static int field1748 = 0;

    @ObfuscatedName("client.lh")
    public static long[] field1749 = new long[100];

    @ObfuscatedName("client.lf")
    public static int field1750 = 0;

    @ObfuscatedName("client.lx")
    public static int field1679 = 0;

    @ObfuscatedName("client.li")
    public static int[] field1742 = new int[128];

    @ObfuscatedName("client.lu")
    public static int[] field1753 = new int[128];

    @ObfuscatedName("client.lb")
    public static long field1754 = -1L;

    @ObfuscatedName("client.lo")
    public static String field1755 = null;

    @ObfuscatedName("client.mi")
    public static String field1551 = null;

    @ObfuscatedName("client.mg")
    public static int field1550 = -1;

    @ObfuscatedName("client.mh")
    public static int field1758 = 0;

    @ObfuscatedName("client.mx")
    public static int[] field1581 = new int[1000];

    @ObfuscatedName("client.my")
    public static int[] field1642 = new int[1000];

    @ObfuscatedName("client.md")
    public static class156[] field1637 = new class156[1000];

    @ObfuscatedName("client.mf")
    public static int field1628 = 0;

    @ObfuscatedName("client.mj")
    public static int field1763 = 0;

    @ObfuscatedName("client.me")
    public static int field1647 = 0;

    @ObfuscatedName("client.mb")
    public static int field1765 = 255;

    @ObfuscatedName("client.mn")
    public static int field1766 = -1;

    @ObfuscatedName("client.mt")
    public static boolean field1767 = false;

    @ObfuscatedName("client.mo")
    public static int field1779 = 127;

    @ObfuscatedName("client.mq")
    public static int field1769 = 127;

    @ObfuscatedName("client.nr")
    public static int field1770 = 0;

    @ObfuscatedName("client.nl")
    public static int[] field1771 = new int[50];

    @ObfuscatedName("client.nx")
    public static int[] field1772 = new int[50];

    @ObfuscatedName("client.na")
    public static int[] field1773 = new int[50];

    @ObfuscatedName("client.nc")
    public static int[] field1704 = new int[50];

    @ObfuscatedName("client.ng")
    public static class118[] field1775 = new class118[50];

    @ObfuscatedName("client.nu")
    public static boolean field1776 = false;

    @ObfuscatedName("client.ny")
    public static boolean[] field1777 = new boolean[5];

    @ObfuscatedName("client.nb")
    public static int[] field1778 = new int[5];

    @ObfuscatedName("client.nv")
    public static int[] field1565 = new int[5];

    @ObfuscatedName("client.nn")
    public static int[] field1584 = new int[5];

    @ObfuscatedName("client.oy")
    public static int[] field1659 = new int[5];

    @ObfuscatedName("client.oc")
    public static int field1782 = 0;

    @ObfuscatedName("client.oj")
    public static int field1709 = 0;

    @ObfuscatedName("client.os")
    public static class94[] field1784 = new class94[400];

    @ObfuscatedName("client.ov")
    public static class18 field1785 = new class18();

    @ObfuscatedName("client.oh")
    public static int field1786 = 0;

    @ObfuscatedName("client.oq")
    public static class104[] field1787 = new class104[400];

    @ObfuscatedName("client.od")
    public static class13 field1788 = new class13();

    @ObfuscatedName("client.of")
    public static int field1789 = -1;

    @ObfuscatedName("client.ox")
    public static int field1575 = -1;

    public final void init() {
        if (!this.method2210()) {
            return;
        }
        class77[] var1 = new class77[] { class77.field894, class77.field893, class77.field892, class77.field890, class77.field889, class77.field891, class77.field896, class77.field899, class77.field895 };
        class77[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class77 var4 = var2[var3];
            String var5 = this.getParameter(var4.field898);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field898)) {
                    case 1:
                        if (var5.equalsIgnoreCase(class76.field885)) {
                            field1675 = true;
                        } else {
                            field1675 = false;
                        }
                        break;
                    case 2:
                        Statics.field2178 = var5;
                        break;
                    case 3:
                        Statics.field1603 = class36.method2346(Integer.parseInt(var5));
                        break;
                    case 4:
                        field1533 = Integer.parseInt(var5);
                        break;
                    case 5:
                        field1781 = Integer.parseInt(var5);
                        break;
                    case 6:
                        field1538 = Integer.parseInt(var5);
                    case 7:
                    default:
                        break;
                    case 8:
                        if (var5.equalsIgnoreCase(class76.field885)) {
                        }
                        break;
                    case 9:
                        class59[] var6 = new class59[] { class59.field637, class59.field634, class59.field638, class59.field636, class59.field635, class59.field633 };
                        Statics.field2107 = (class59) class44.method895(var6, Integer.parseInt(var5));
                        if (Statics.field2107 == class59.field636) {
                            Statics.field502 = class22.field235;
                        } else {
                            Statics.field502 = class22.field233;
                        }
                }
            }
        }
        class107.field1486 = false;
        field1537 = false;
        Statics.field584 = this.getCodeBase().getHost();
        String var7 = Statics.field1603.field446;
        byte var8 = 0;
        try {
            class137.method898("oldschool", var7, var8, 16);
        } catch (Exception var10) {
            class136.method1127((String) null, var10);
        }
        Statics.field1531 = this;
        this.method2258(765, 503, 28);
    }

    @ObfuscatedName("client.t(B)V")
    public final void method1667() {
        Statics.field2019 = field1781 == 0 ? 43594 : field1533 + 40000;
        Statics.field962 = field1781 == 0 ? 443 : field1533 + 50000;
        Statics.field1858 = Statics.field2019;
        Statics.field202 = class10.field53;
        Statics.field752 = class10.field52;
        Statics.field498 = class10.field55;
        Statics.field1221 = class10.field51;
        if (Statics.field1923.toLowerCase().indexOf("microsoft") == -1) {
            class113.field1888[44] = 71;
            class113.field1888[45] = 26;
            class113.field1888[46] = 72;
            class113.field1888[47] = 73;
            class113.field1888[59] = 57;
            class113.field1888[61] = 27;
            class113.field1888[91] = 42;
            class113.field1888[92] = 74;
            class113.field1888[93] = 43;
            class113.field1888[192] = 28;
            class113.field1888[222] = 58;
            class113.field1888[520] = 59;
        } else {
            class113.field1888[186] = 57;
            class113.field1888[187] = 27;
            class113.field1888[188] = 71;
            class113.field1888[189] = 26;
            class113.field1888[190] = 72;
            class113.field1888[191] = 73;
            class113.field1888[192] = 58;
            class113.field1888[219] = 42;
            class113.field1888[220] = 74;
            class113.field1888[221] = 43;
            class113.field1888[222] = 59;
            class113.field1888[223] = 28;
        }
        Canvas var1 = Statics.field1812;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class113.field1865);
        var1.addFocusListener(class113.field1865);
        Canvas var2 = Statics.field1812;
        var2.addMouseListener(class108.field1799);
        var2.addMouseMotionListener(class108.field1799);
        var2.addFocusListener(class108.field1799);
        class131 var3;
        try {
            var3 = new class131();
        } catch (Throwable var14) {
            var3 = null;
        }
        Statics.field533 = var3;
        if (Statics.field533 != null) {
            Statics.field533.method2018(Statics.field1812);
        }
        Statics.field2481 = new class114(255, class137.field2116, class137.field2126, 500000);
        class168 var5 = null;
        class56 var6 = new class56();
        try {
            var5 = class137.method3333("", Statics.field2107.field632, false);
            byte[] var7 = new byte[(int) var5.method2928()];
            int var9;
            for (int var8 = 0; var8 < var7.length; var8 += var9) {
                var9 = var5.method2910(var7, var8, var7.length - var8);
                if (var9 == -1) {
                    throw new IOException();
                }
            }
            var6 = new class56(new class50(var7));
        } catch (Exception var15) {
        }
        try {
            if (var5 != null) {
                var5.method2913();
            }
        } catch (Exception var13) {
        }
        Statics.field1898 = var6;
        if (field1781 != 0) {
            field1547 = true;
        }
    }

    @ObfuscatedName("client.f(I)V")
    public final void method1670() {
        if (Statics.field735 != null) {
            Statics.field735.field1382 = false;
        }
        Statics.field735 = null;
        if (Statics.field2080 != null) {
            Statics.field2080.method2290();
            Statics.field2080 = null;
        }
        class113.method552();
        class108.method2307();
        Statics.field533 = null;
        if (Statics.field2318 != null) {
            Statics.field2318.method3360();
        }
        if (Statics.field2461 != null) {
            Statics.field2461.method3360();
        }
        class79.method601();
        class5.method553();
        class137.method1143();
    }

    @ObfuscatedName("client.j(B)V")
    public void method1671() {
        if (field1539 == 1000) {
            return;
        }
        long var1 = class38.method2385();
        int var3 = (int) (var1 - Statics.field1394);
        Statics.field1394 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class79.field923 += var3;
        boolean var4;
        if (class79.field908 == 0 && class79.field921 == 0 && class79.field915 == 0 && class79.field918 == 0) {
            var4 = true;
        } else if (Statics.field924 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class79.field923 > 30000) {
                        throw new IOException();
                    }
                    while (class79.field921 < 20 && class79.field918 > 0) {
                        class81 var5 = (class81) class79.field909.method16();
                        class50 var6 = new class50(4);
                        var6.method666(1);
                        var6.method668((int) var5.field213);
                        Statics.field924.method2293(var6.field541, 0, 4);
                        class79.field911.method14(var5, var5.field213);
                        class79.field918--;
                        class79.field921++;
                    }
                    while (class79.field908 < 20 && class79.field915 > 0) {
                        class81 var7 = (class81) class79.field913.method249();
                        class50 var8 = new class50(4);
                        var8.method666(0);
                        var8.method668((int) var7.field213);
                        Statics.field924.method2293(var8.field541, 0, 4);
                        var7.method51();
                        class79.field910.method14(var7, var7.field213);
                        class79.field915--;
                        class79.field908++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field924.method2291();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class79.field923 = 0;
                        byte var11 = 0;
                        if (Statics.field1283 == null) {
                            var11 = 8;
                        } else if (class79.field919 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class79.field920.field540;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field924.method2299(class79.field920.field541, class79.field920.field540, var12);
                            if (class79.field922 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class79.field920.field541[class79.field920.field540 + var13] ^= class79.field922;
                                }
                            }
                            class79.field920.field540 += var12;
                            if (class79.field920.field540 < var11) {
                                break;
                            }
                            if (Statics.field1283 == null) {
                                class79.field920.field540 = 0;
                                int var14 = class79.field920.method726();
                                int var15 = class79.field920.method720();
                                int var16 = class79.field920.method726();
                                int var17 = class79.field920.method685();
                                long var18 = (long) ((var14 << 16) + var15);
                                class81 var20 = (class81) class79.field911.method20(var18);
                                Statics.field673 = true;
                                if (var20 == null) {
                                    var20 = (class81) class79.field910.method20(var18);
                                    Statics.field673 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1283 = var20;
                                Statics.field503 = new class50(var17 + var21 + Statics.field1283.field934);
                                Statics.field503.method666(var16);
                                Statics.field503.method669(var17);
                                class79.field919 = 8;
                                class79.field920.field540 = 0;
                            } else if (class79.field919 == 0) {
                                if (class79.field920.field541[0] == -1) {
                                    class79.field919 = 1;
                                    class79.field920.field540 = 0;
                                } else {
                                    Statics.field1283 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field503.field541.length - Statics.field1283.field934;
                            int var23 = 512 - class79.field919;
                            if (var23 > var22 - Statics.field503.field540) {
                                var23 = var22 - Statics.field503.field540;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field924.method2299(Statics.field503.field541, Statics.field503.field540, var23);
                            if (class79.field922 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field503.field541[Statics.field503.field540 + var24] ^= class79.field922;
                                }
                            }
                            Statics.field503.field540 += var23;
                            class79.field919 += var23;
                            if (Statics.field503.field540 == var22) {
                                if (Statics.field1283.field213 == 16711935L) {
                                    Statics.field1441 = Statics.field503;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class34 var26 = class79.field916[var25];
                                        if (var26 != null) {
                                            Statics.field1441.field540 = var25 * 8 + 5;
                                            int var27 = Statics.field1441.method685();
                                            int var28 = Statics.field1441.method685();
                                            var26.method491(var27, var28);
                                        }
                                    }
                                } else {
                                    class79.field917.reset();
                                    class79.field917.update(Statics.field503.field541, 0, var22);
                                    int var29 = (int) class79.field917.getValue();
                                    if (Statics.field1283.field935 != var29) {
                                        try {
                                            Statics.field924.method2290();
                                        } catch (Exception var35) {
                                        }
                                        class79.field907++;
                                        Statics.field924 = null;
                                        class79.field922 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class79.field907 = 0;
                                    class79.field912 = 0;
                                    Statics.field1283.field937.method492((int) (Statics.field1283.field213 & 0xFFFFL), Statics.field503.field541, (Statics.field1283.field213 & 0xFF0000L) == 16711680L, Statics.field673);
                                }
                                Statics.field1283.method234();
                                if (Statics.field673) {
                                    class79.field921--;
                                } else {
                                    class79.field908--;
                                }
                                class79.field919 = 0;
                                Statics.field1283 = null;
                                Statics.field503 = null;
                            } else {
                                if (class79.field919 != 512) {
                                    break;
                                }
                                class79.field919 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field924.method2290();
                } catch (Exception var34) {
                }
                class79.field912++;
                Statics.field924 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1902();
        }
    }

    @ObfuscatedName("client.g(IB)V")
    public void method1677(int arg0) {
        Statics.field2568 = null;
        Statics.field1452 = null;
        field1559 = 0;
        if (Statics.field2019 == Statics.field1858) {
            Statics.field1858 = Statics.field962;
        } else {
            Statics.field1858 = Statics.field2019;
        }
        field1562++;
        if (field1562 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field1539 <= 5) {
                this.method2214("js5connect_full");
                field1539 = 1000;
            } else {
                field1560 = 3000;
            }
        } else if (field1562 >= 2 && arg0 == 6) {
            this.method2214("js5connect_outofdate");
            field1539 = 1000;
        } else if (field1562 >= 4) {
            if (field1539 <= 5) {
                this.method2214("js5connect");
                field1539 = 1000;
            } else {
                field1560 = 3000;
            }
        }
    }

    @ObfuscatedName("client.k(B)V")
    public final void method1716() {
    }

    @ObfuscatedName("client.d(B)V")
    public final void method1766() {
        field1541++;
        this.method1671();
        while (true) {
            class15 var1 = class5.field15;
            class99 var2;
            synchronized (class5.field15) {
                var2 = (class99) class5.field16.method197();
            }
            if (var2 == null) {
                try {
                    if (class97.field1365 == 1) {
                        int var4 = Statics.field47.method964();
                        if (var4 > 0 && Statics.field47.method970()) {
                            int var5 = var4 - Statics.field1368;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field47.method979(var5);
                        } else {
                            Statics.field47.method1004();
                            Statics.field47.method1041();
                            if (Statics.field938 == null) {
                                class97.field1365 = 0;
                            } else {
                                class97.field1365 = 2;
                            }
                            Statics.field2599 = null;
                            Statics.field2062 = null;
                        }
                    }
                } catch (Exception var21) {
                    var21.printStackTrace();
                    Statics.field47.method1004();
                    class97.field1365 = 0;
                    Statics.field2599 = null;
                    Statics.field2062 = null;
                    Statics.field938 = null;
                }
                method1142();
                class113 var7 = class113.field1865;
                synchronized (class113.field1865) {
                    class113.field1887++;
                    class113.field1884 = class113.field1868;
                    class113.field1883 = 0;
                    if (class113.field1879 >= 0) {
                        while (class113.field1879 != class113.field1878) {
                            int var9 = class113.field1893[class113.field1878];
                            class113.field1878 = class113.field1878 + 1 & 0x7F;
                            if (var9 < 0) {
                                class113.field1876[~var9] = false;
                            } else {
                                if (!class113.field1876[var9] && class113.field1883 < class113.field1882.length - 1) {
                                    class113.field1882[++class113.field1883 - 1] = var9;
                                }
                                class113.field1876[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class113.field1876[var8] = false;
                        }
                        class113.field1879 = class113.field1878;
                    }
                    class113.field1868 = class113.field1885;
                }
                class108 var11 = class108.field1799;
                synchronized (class108.field1799) {
                    class108.field1800 = class108.field1797;
                    class108.field1801 = class108.field1805;
                    class108.field1802 = class108.field1795;
                    class108.field1807 = class108.field1803;
                    class108.field1808 = class108.field1804;
                    class108.field1809 = class108.field1806;
                    class108.field1810 = class108.field1796;
                    class108.field1803 = 0;
                }
                if (Statics.field533 != null) {
                    int var13 = Statics.field533.method2021();
                    field1613 = var13;
                }
                if (field1539 == 0) {
                    Statics.method1190();
                    Statics.field2031.method2187();
                    for (int var14 = 0; var14 < 32; var14++) {
                        field2005[var14] = 0L;
                    }
                    for (int var15 = 0; var15 < 32; var15++) {
                        field2006[var15] = 0L;
                    }
                    Statics.field557 = 0;
                } else if (field1539 == 5) {
                    class102.method2868(this);
                    Statics.method1190();
                    Statics.field2031.method2187();
                    for (int var16 = 0; var16 < 32; var16++) {
                        field2005[var16] = 0L;
                    }
                    for (int var17 = 0; var17 < 32; var17++) {
                        field2006[var17] = 0L;
                    }
                    Statics.field557 = 0;
                } else if (field1539 == 10) {
                    class102.method2868(this);
                } else if (field1539 == 20) {
                    class102.method2868(this);
                    method1947();
                } else if (field1539 == 25) {
                    method2368();
                }
                if (field1539 == 30) {
                    method2978();
                } else if (field1539 == 40) {
                    method1947();
                }
                return;
            }
            var2.field1375.method493(var2.field1377, (int) var2.field213, var2.field1374, false);
        }
    }

    @ObfuscatedName("client.l(I)V")
    public final void method1825() {
        boolean var1 = class97.method2349();
        if (var1 && field1767 && Statics.field2318 != null) {
            Statics.field2318.method3359();
        }
        if (field2009) {
            class113.method1180(Statics.field1812);
            Canvas var2 = Statics.field1812;
            var2.removeMouseListener(class108.field1799);
            var2.removeMouseMotionListener(class108.field1799);
            var2.removeFocusListener(class108.field1799);
            class108.field1797 = 0;
            if (Statics.field533 != null) {
                Statics.field533.method2019(Statics.field1812);
            }
            this.method2209();
            Canvas var3 = Statics.field1812;
            var3.setFocusTraversalKeysEnabled(false);
            var3.addKeyListener(class113.field1865);
            var3.addFocusListener(class113.field1865);
            Canvas var4 = Statics.field1812;
            var4.addMouseListener(class108.field1799);
            var4.addMouseMotionListener(class108.field1799);
            var4.addFocusListener(class108.field1799);
            if (Statics.field533 != null) {
                Statics.field533.method2018(Statics.field1812);
            }
        }
        if (field1539 == 0) {
            class125.method894(class102.field1414, class102.field1419, (Color) null);
        } else if (field1539 == 5) {
            class102.method3099(Statics.field1442, Statics.field1390);
        } else if (field1539 == 10) {
            class102.method3099(Statics.field1442, Statics.field1390);
        } else if (field1539 == 20) {
            class102.method3099(Statics.field1442, Statics.field1390);
        } else if (field1539 == 25) {
            if (field1587 == 1) {
                if (field1730 > field1695) {
                    field1695 = field1730;
                }
                int var5 = (field1695 * 50 - field1730 * 50) / field1695;
                method542(class85.field1013 + class76.field880 + class76.field877 + var5 + "%" + class76.field878, false);
            } else if (field1587 == 2) {
                if (field1615 > field1783) {
                    field1783 = field1615;
                }
                int var6 = (field1783 * 50 - field1615 * 50) / field1783 + 50;
                method542(class85.field1013 + class76.field880 + class76.field877 + var6 + "%" + class76.field878, false);
            } else {
                method542(class85.field1013, false);
            }
        } else if (field1539 == 30) {
            if (!field1601) {
                field1678[0] = class85.field1194;
                field1556[0] = "";
                field1676[0] = 1006;
                field1627 = 1;
            }
            if (field1690 != -1) {
                method1139(field1690);
            }
            for (int var7 = 0; var7 < field1566; var7++) {
                if (field1733[var7]) {
                    field1734[var7] = true;
                }
                field1735[var7] = field1733[var7];
                field1733[var7] = false;
            }
            field1732 = field1541;
            field1585 = -1;
            field1681 = -1;
            Statics.field2490 = null;
            if (field1690 != -1) {
                field1566 = 0;
                method1365(field1690, 0, 0, 765, 503, 0, 0, -1);
            }
            class146.method2393();
            method2516();
            if (field1601) {
                method2052();
            } else if (field1585 != -1) {
                int var8 = field1585;
                int var9 = field1681;
                if (field1627 >= 2 || field1684 != 0 || field1530) {
                    String var10;
                    if (field1684 == 1 && field1627 < 2) {
                        var10 = class85.field1099 + class85.field1131 + field1685 + " " + class76.field887;
                    } else if (field1530 && field1627 < 2) {
                        var10 = field1688 + class85.field1131 + field1666 + " " + class76.field887;
                    } else {
                        var10 = method2372(field1627 - 1);
                    }
                    if (field1627 > 2) {
                        var10 = var10 + class76.method1092(16777215) + " " + '/' + " " + (field1627 - 2) + class85.field1104;
                    }
                    Statics.field1442.method280(var10, var8 + 4, var9 + 15, 16777215, 0, field1541 / 1000);
                }
            }
            if (field1702 == 3) {
                for (int var11 = 0; var11 < field1566; var11++) {
                    if (field1735[var11]) {
                        class146.method2399(field1736[var11], field1747[var11], field1738[var11], field1739[var11], 16711935, 128);
                    } else if (field1734[var11]) {
                        class146.method2399(field1736[var11], field1747[var11], field1738[var11], field1739[var11], 16711680, 128);
                    }
                }
            }
            class69.method555(Statics.field2252, Statics.field1320.field2707, Statics.field1320.field2664, field1609);
            field1609 = 0;
        } else if (field1539 == 40) {
            method542(class85.field988 + class76.field880 + class85.field989, false);
        }
        if (field1539 == 30 && field1702 == 0 && !field1997) {
            try {
                Graphics var12 = Statics.field1812.getGraphics();
                for (int var13 = 0; var13 < field1566; var13++) {
                    if (field1734[var13]) {
                        Statics.field617.method1496(var12, field1736[var13], field1747[var13], field1738[var13], field1739[var13]);
                        field1734[var13] = false;
                    }
                }
            } catch (Exception var19) {
                Statics.field1812.repaint();
            }
        } else if (field1539 > 0) {
            try {
                Graphics var15 = Statics.field1812.getGraphics();
                Statics.field617.method1475(var15, 0, 0);
                field1997 = false;
                for (int var16 = 0; var16 < field1566; var16++) {
                    field1734[var16] = false;
                }
            } catch (Exception var18) {
                Statics.field1812.repaint();
            }
        }
    }

    @ObfuscatedName("client.x(B)V")
    public void method1902() {
        if (class79.field907 >= 4) {
            this.method2214("js5crc");
            field1539 = 1000;
            return;
        }
        if (class79.field912 >= 4) {
            if (field1539 <= 5) {
                this.method2214("js5io");
                field1539 = 1000;
                return;
            }
            field1560 = 3000;
            class79.field912 = 3;
        }
        if (--field1560 + 1 > 0) {
            return;
        }
        try {
            if (field1559 == 0) {
                Statics.field2568 = Statics.field1999.method2070(Statics.field584, Statics.field1858);
                field1559++;
            }
            if (field1559 == 1) {
                if (Statics.field2568.field2270 == 2) {
                    this.method1677(-1);
                    return;
                }
                if (Statics.field2568.field2270 == 1) {
                    field1559++;
                }
            }
            if (field1559 == 2) {
                Statics.field1452 = new class129((Socket) Statics.field2568.field2274, Statics.field1999);
                class50 var1 = new class50(5);
                var1.method666(15);
                var1.method669(28);
                Statics.field1452.method2293(var1.field541, 0, 5);
                field1559++;
                Statics.field560 = class38.method2385();
            }
            if (field1559 == 3) {
                if (field1539 <= 5 || Statics.field1452.method2291() > 0) {
                    int var2 = Statics.field1452.method2305();
                    if (var2 != 0) {
                        this.method1677(var2);
                        return;
                    }
                    field1559++;
                } else if (class38.method2385() - Statics.field560 > 30000L) {
                    this.method1677(-2);
                    return;
                }
            }
            if (field1559 == 4) {
                class129 var3 = Statics.field1452;
                boolean var4 = field1539 > 20;
                if (Statics.field924 != null) {
                    try {
                        Statics.field924.method2290();
                    } catch (Exception var14) {
                    }
                    Statics.field924 = null;
                }
                Statics.field924 = var3;
                class79.method1151(var4);
                class79.field920.field540 = 0;
                Statics.field1283 = null;
                Statics.field503 = null;
                class79.field919 = 0;
                while (true) {
                    class81 var6 = (class81) class79.field911.method16();
                    if (var6 == null) {
                        while (true) {
                            class81 var7 = (class81) class79.field910.method16();
                            if (var7 == null) {
                                if (class79.field922 != 0) {
                                    try {
                                        class50 var8 = new class50(4);
                                        var8.method666(4);
                                        var8.method666(class79.field922);
                                        var8.method667(0);
                                        Statics.field924.method2293(var8.field541, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field924.method2290();
                                        } catch (Exception var12) {
                                        }
                                        class79.field912++;
                                        Statics.field924 = null;
                                    }
                                }
                                class79.field923 = 0;
                                Statics.field1394 = class38.method2385();
                                Statics.field2568 = null;
                                Statics.field1452 = null;
                                field1559 = 0;
                                field1562 = 0;
                                return;
                            }
                            class79.field913.method255(var7);
                            class79.field914.method14(var7, var7.field213);
                            class79.field915++;
                            class79.field908--;
                        }
                    }
                    class79.field909.method14(var6, var6.field213);
                    class79.field918++;
                    class79.field921--;
                }
            }
        } catch (IOException var15) {
            this.method1677(-3);
        }
    }

    @ObfuscatedName("client.q(S)V")
    public static final void method1947() {
        try {
            if (field1563 == 0) {
                if (Statics.field2080 != null) {
                    Statics.field2080.method2290();
                    Statics.field2080 = null;
                }
                Statics.field791 = null;
                field1652 = false;
                field1564 = 0;
                field1563 = 1;
            }
            if (field1563 == 1) {
                if (Statics.field791 == null) {
                    Statics.field791 = Statics.field1999.method2070(Statics.field584, Statics.field1858);
                }
                if (Statics.field791.field2270 == 2) {
                    throw new IOException();
                }
                if (Statics.field791.field2270 == 1) {
                    Statics.field2080 = new class129((Socket) Statics.field791.field2274, Statics.field1999);
                    Statics.field791 = null;
                    field1563 = 2;
                }
            }
            if (field1563 == 2) {
                field1570.field540 = 0;
                field1570.method666(14);
                Statics.field2080.method2293(field1570.field541, 0, 1);
                field1572.field540 = 0;
                field1563 = 3;
            }
            if (field1563 == 3) {
                if (Statics.field2318 != null) {
                    Statics.field2318.method3365();
                }
                if (Statics.field2461 != null) {
                    Statics.field2461.method3365();
                }
                int var0 = Statics.field2080.method2305();
                if (Statics.field2318 != null) {
                    Statics.field2318.method3365();
                }
                if (Statics.field2461 != null) {
                    Statics.field2461.method3365();
                }
                if (var0 != 0) {
                    method3150(var0);
                    return;
                }
                field1572.field540 = 0;
                field1563 = 5;
            }
            if (field1563 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field1570.field540 = 0;
                field1570.method666(10);
                field1570.method669(var1[0]);
                field1570.method669(var1[1]);
                field1570.method669(var1[2]);
                field1570.method669(var1[3]);
                field1570.method765(0L);
                field1570.method671(class102.field1425);
                field1570.method698(class58.field619, class58.field616);
                field1677.field540 = 0;
                if (field1539 == 40) {
                    field1677.method666(18);
                } else {
                    field1677.method666(16);
                }
                field1677.method667(0);
                int var2 = field1677.field540;
                field1677.method669(28);
                field1677.method674(field1570.field541, 0, field1570.field540);
                int var3 = field1677.field540;
                field1677.method671(class102.field1424);
                field1677.method666(field1537 ? 1 : 0);
                class137.method1360(field1677);
                class50 var4 = new class50(Statics.field731.method1384());
                Statics.field731.method1385(var4);
                field1677.method674(var4.field541, 0, var4.field541.length);
                field1677.method669(Statics.field470.field1269);
                field1677.method669(Statics.field936.field1269);
                field1677.method669(Statics.field1296.field1269);
                field1677.method669(Statics.field1275.field1269);
                field1677.method669(Statics.field738.field1269);
                field1677.method669(Statics.field1708.field1269);
                field1677.method669(Statics.field1383.field1269);
                field1677.method669(Statics.field2525.field1269);
                field1677.method669(Statics.field344.field1269);
                field1677.method669(Statics.field654.field1269);
                field1677.method669(Statics.field552.field1269);
                field1677.method669(Statics.field905.field1269);
                field1677.method669(Statics.field884.field1269);
                field1677.method669(Statics.field390.field1269);
                field1677.method669(Statics.field2150.field1269);
                field1677.method669(Statics.field904.field1269);
                field1677.method696(var1, var3, field1677.field540);
                field1677.method676(field1677.field540 - var2);
                Statics.field2080.method2293(field1677.field541, 0, field1677.field540);
                field1570.method646(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field1572.method646(var1);
                field1563 = 6;
            }
            if (field1563 == 6 && Statics.field2080.method2291() > 0) {
                int var6 = Statics.field2080.method2305();
                if (var6 == 21 && field1539 == 20) {
                    field1563 = 7;
                } else if (var6 == 2) {
                    field1563 = 9;
                } else if (var6 == 15 && field1539 == 40) {
                    method1463();
                    return;
                } else if (var6 == 23 && field1768 < 1) {
                    field1768++;
                    field1563 = 0;
                } else {
                    method3150(var6);
                    return;
                }
            }
            if (field1563 == 7 && Statics.field2080.method2291() > 0) {
                field1792 = (Statics.field2080.method2305() + 3) * 60;
                field1563 = 8;
            }
            if (field1563 == 8) {
                field1564 = 0;
                class102.method1381(class85.field1146, class85.field1012, field1792 / 60 + class85.field1177);
                if (--field1792 <= 0) {
                    field1563 = 0;
                }
            } else {
                if (field1563 == 9 && Statics.field2080.method2291() >= 8) {
                    field1536 = Statics.field2080.method2305();
                    field1592 = Statics.field2080.method2305() == 1;
                    field1656 = Statics.field2080.method2305();
                    field1656 <<= 0x8;
                    field1656 += Statics.field2080.method2305();
                    field1657 = Statics.field2080.method2305();
                    Statics.field2080.method2299(field1572.field541, 0, 1);
                    field1572.field540 = 0;
                    field1574 = field1572.method644();
                    Statics.field2080.method2299(field1572.field541, 0, 2);
                    field1572.field540 = 0;
                    field1573 = field1572.method720();
                    if (field1657 == 1) {
                        try {
                            class119.method2126(Statics.field1531, "zap");
                        } catch (Throwable var26) {
                        }
                    } else {
                        try {
                            class119.method2126(Statics.field1531, "unzap");
                        } catch (Throwable var25) {
                        }
                    }
                    field1563 = 10;
                }
                if (field1563 != 10) {
                    field1564++;
                    if (field1564 > 2000) {
                        if (field1768 < 1) {
                            if (Statics.field2019 == Statics.field1858) {
                                Statics.field1858 = Statics.field962;
                            } else {
                                Statics.field1858 = Statics.field2019;
                            }
                            field1768++;
                            field1563 = 0;
                        } else {
                            method3150(-3);
                        }
                    }
                } else if (Statics.field2080.method2291() >= field1573) {
                    field1572.field540 = 0;
                    Statics.field2080.method2299(field1572.field541, 0, field1573);
                    field1542 = 1L;
                    field1545 = -1;
                    Statics.field735.field1385 = 0;
                    Statics.field666 = true;
                    field1546 = true;
                    field1754 = -1L;
                    class9.method1407();
                    field1570.field540 = 0;
                    field1572.field540 = 0;
                    field1574 = -1;
                    field1578 = -1;
                    field1579 = -1;
                    field1580 = -1;
                    field1791 = 0;
                    field1534 = 0;
                    field1714 = 0;
                    field1549 = 0;
                    field1627 = 0;
                    field1601 = false;
                    class108.field1811 = 0;
                    for (int var9 = 0; var9 < 100; var9++) {
                        field1668[var9] = null;
                    }
                    field1745 = 0;
                    field1684 = 0;
                    field1530 = false;
                    field1770 = 0;
                    field1597 = (int) (Math.random() * 100.0D) - 50;
                    field1599 = (int) (Math.random() * 110.0D) - 55;
                    field1726 = (int) (Math.random() * 80.0D) - 40;
                    field1604 = (int) (Math.random() * 120.0D) - 60;
                    field1561 = (int) (Math.random() * 30.0D) - 20;
                    field1617 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field1647 = 0;
                    field1550 = -1;
                    field1628 = 0;
                    field1763 = 0;
                    field1651 = 0;
                    field1568 = 0;
                    for (int var10 = 0; var10 < 2048; var10++) {
                        field1650[var10] = null;
                        field1655[var10] = null;
                    }
                    for (int var11 = 0; var11 < 32768; var11++) {
                        field1567[var11] = null;
                    }
                    Statics.field1320 = field1650[2047] = new class74();
                    field1577.method193();
                    field1667.method193();
                    for (int var12 = 0; var12 < 4; var12++) {
                        for (int var13 = 0; var13 < 104; var13++) {
                            for (int var14 = 0; var14 < 104; var14++) {
                                field1586[var12][var13][var14] = null;
                            }
                        }
                    }
                    field1665 = new class15();
                    field1709 = 0;
                    field1782 = 0;
                    field1786 = 0;
                    for (int var15 = 0; var15 < Statics.field2598; var15++) {
                        class175 var16 = class175.method1106(var15);
                        if (var16 != null && var16.field2596 == 0) {
                            class71.field797[var15] = 0;
                            class71.field800[var15] = 0;
                        }
                    }
                    for (int var17 = 0; var17 < field1689.length; var17++) {
                        field1689[var17] = -1;
                    }
                    if (field1690 != -1) {
                        int var18 = field1690;
                        if (var18 != -1 && Statics.field2091[var18]) {
                            Statics.field70.method1278(var18);
                            if (Statics.field173[var18] != null) {
                                boolean var19 = true;
                                for (int var20 = 0; var20 < Statics.field173[var18].length; var20++) {
                                    if (Statics.field173[var18][var20] != null) {
                                        if (Statics.field173[var18][var20].field81 == 2) {
                                            var19 = false;
                                        } else {
                                            Statics.field173[var18][var20] = null;
                                        }
                                    }
                                }
                                if (var19) {
                                    Statics.field173[var18] = null;
                                }
                                Statics.field2091[var18] = false;
                            }
                        }
                    }
                    for (class80 var21 = (class80) field1691.method16(); var21 != null; var21 = (class80) field1691.method17()) {
                        method2908(var21, true);
                    }
                    field1690 = -1;
                    field1691 = new class3(8);
                    field1694 = null;
                    field1601 = false;
                    field1627 = 0;
                    field1788.method182((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var22 = 0; var22 < 8; var22++) {
                        field1661[var22] = null;
                        field1558[var22] = false;
                    }
                    class66.field736 = new class3(32);
                    field1700 = true;
                    for (int var23 = 0; var23 < 100; var23++) {
                        field1733[var23] = true;
                    }
                    field1755 = null;
                    Statics.field768 = 0;
                    Statics.field2012 = null;
                    Statics.field1254 = -1;
                    method1167(false);
                    field1574 = -1;
                }
            }
        } catch (IOException var27) {
            if (field1768 < 1) {
                if (Statics.field2019 == Statics.field1858) {
                    Statics.field1858 = Statics.field962;
                } else {
                    Statics.field1858 = Statics.field2019;
                }
                field1768++;
                field1563 = 0;
            } else {
                method3150(-2);
            }
        }
    }

    @ObfuscatedName("client.cs(Lfi;III)V")
    public static final void method1948(class12 arg0, int arg1, int arg2) {
        if (field1701 != null || field1601 || arg0 == null || method535(arg0) == null) {
            return;
        }
        field1701 = arg0;
        field1712 = method535(arg0);
        field1703 = arg1;
        field1646 = arg2;
        Statics.field670 = 0;
        field1664 = false;
    }

    @ObfuscatedName("fj.ax(Lac;II)V")
    public static final void method54(class179 arg0, int arg1) {
        if (arg0.field2711 > field1541) {
            int var2 = arg0.field2711 - field1541;
            int var3 = arg0.field2683 * 128 + arg0.field2667 * 64;
            int var4 = arg0.field2667 * 64 + arg0.field2666 * 128;
            arg0.field2707 += (var3 - arg0.field2707) / var2;
            arg0.field2664 += (var4 - arg0.field2664) / var2;
            arg0.field2718 = 0;
            if (arg0.field2708 == 0) {
                arg0.field2702 = 1024;
            }
            if (arg0.field2708 == 1) {
                arg0.field2702 = 1536;
            }
            if (arg0.field2708 == 2) {
                arg0.field2702 = 0;
            }
            if (arg0.field2708 == 3) {
                arg0.field2702 = 512;
            }
        } else if (arg0.field2701 >= field1541) {
            if (field1541 == arg0.field2701 || arg0.field2692 == -1 || arg0.field2695 != 0 || arg0.field2694 + 1 > class173.method3098(arg0.field2692).field2588[arg0.field2693]) {
                int var5 = arg0.field2701 - arg0.field2711;
                int var6 = field1541 - arg0.field2711;
                int var7 = arg0.field2683 * 128 + arg0.field2667 * 64;
                int var8 = arg0.field2667 * 64 + arg0.field2666 * 128;
                int var9 = arg0.field2703 * 128 + arg0.field2667 * 64;
                int var10 = arg0.field2705 * 128 + arg0.field2667 * 64;
                arg0.field2707 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field2664 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field2718 = 0;
            if (arg0.field2708 == 0) {
                arg0.field2702 = 1024;
            }
            if (arg0.field2708 == 1) {
                arg0.field2702 = 1536;
            }
            if (arg0.field2708 == 2) {
                arg0.field2702 = 0;
            }
            if (arg0.field2708 == 3) {
                arg0.field2702 = 512;
            }
            arg0.field2706 = arg0.field2702;
        } else {
            method3377(arg0);
        }
        if (arg0.field2707 < 128 || arg0.field2664 < 128 || arg0.field2707 >= 13184 || arg0.field2664 >= 13184) {
            arg0.field2692 = -1;
            arg0.field2697 = -1;
            arg0.field2711 = 0;
            arg0.field2701 = 0;
            arg0.field2707 = arg0.field2676[0] * 128 + arg0.field2667 * 64;
            arg0.field2664 = arg0.field2716[0] * 128 + arg0.field2667 * 64;
            arg0.method3114();
        }
        if (Statics.field1320 == arg0 && (arg0.field2707 < 1536 || arg0.field2664 < 1536 || arg0.field2707 >= 11776 || arg0.field2664 >= 11776)) {
            arg0.field2692 = -1;
            arg0.field2697 = -1;
            arg0.field2711 = 0;
            arg0.field2701 = 0;
            arg0.field2707 = arg0.field2676[0] * 128 + arg0.field2667 * 64;
            arg0.field2664 = arg0.field2716[0] * 128 + arg0.field2667 * 64;
            arg0.method3114();
        }
        if (arg0.field2713 != 0) {
            if (arg0.field2686 != -1 && arg0.field2686 < 32768) {
                class62 var11 = field1567[arg0.field2686];
                if (var11 != null) {
                    int var12 = arg0.field2707 - var11.field2707;
                    int var13 = arg0.field2664 - var11.field2664;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field2702 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field2686 >= 32768) {
                int var14 = arg0.field2686 - 32768;
                if (field1656 == var14) {
                    var14 = 2047;
                }
                class74 var15 = field1650[var14];
                if (var15 != null) {
                    int var16 = arg0.field2707 - var15.field2707;
                    int var17 = arg0.field2664 - var15.field2664;
                    if (var16 != 0 || var17 != 0) {
                        arg0.field2702 = (int) (Math.atan2((double) var16, (double) var17) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field2674 != 0 || arg0.field2704 != 0) && (arg0.field2714 == 0 || arg0.field2718 > 0)) {
                int var18 = arg0.field2707 - (arg0.field2674 * 64 - Statics.field2043 * 64 - Statics.field2043 * 64);
                int var19 = arg0.field2664 - (arg0.field2704 * 64 - Statics.field403 * 64 - Statics.field403 * 64);
                if (var18 != 0 || var19 != 0) {
                    arg0.field2702 = (int) (Math.atan2((double) var18, (double) var19) * 325.949D) & 0x7FF;
                }
                arg0.field2674 = 0;
                arg0.field2704 = 0;
            }
            int var20 = arg0.field2702 - arg0.field2706 & 0x7FF;
            if (var20 == 0) {
                arg0.field2712 = 0;
            } else {
                arg0.field2712++;
                if (var20 > 1024) {
                    arg0.field2706 -= arg0.field2713;
                    boolean var21 = true;
                    if (var20 < arg0.field2713 || var20 > 2048 - arg0.field2713) {
                        arg0.field2706 = arg0.field2702;
                        var21 = false;
                    }
                    if (arg0.field2689 == arg0.field2668 && (arg0.field2712 > 25 || var21)) {
                        if (arg0.field2669 == -1) {
                            arg0.field2689 = arg0.field2678;
                        } else {
                            arg0.field2689 = arg0.field2669;
                        }
                    }
                } else {
                    arg0.field2706 += arg0.field2713;
                    boolean var22 = true;
                    if (var20 < arg0.field2713 || var20 > 2048 - arg0.field2713) {
                        arg0.field2706 = arg0.field2702;
                        var22 = false;
                    }
                    if (arg0.field2689 == arg0.field2668 && (arg0.field2712 > 25 || var22)) {
                        if (arg0.field2670 == -1) {
                            arg0.field2689 = arg0.field2678;
                        } else {
                            arg0.field2689 = arg0.field2670;
                        }
                    }
                }
                arg0.field2706 &= 0x7FF;
            }
        }
        arg0.field2682 = false;
        if (arg0.field2689 != -1) {
            class173 var24 = class173.method3098(arg0.field2689);
            if (var24 == null || var24.field2584 == null) {
                arg0.field2689 = -1;
            } else {
                arg0.field2691++;
                if (arg0.field2690 < var24.field2584.length && arg0.field2691 > var24.field2588[arg0.field2690]) {
                    arg0.field2691 = 1;
                    arg0.field2690++;
                    method486(var24, arg0.field2690, arg0.field2707, arg0.field2664);
                }
                if (arg0.field2690 >= var24.field2584.length) {
                    arg0.field2691 = 0;
                    arg0.field2690 = 0;
                    method486(var24, arg0.field2690, arg0.field2707, arg0.field2664);
                }
            }
        }
        if (arg0.field2697 != -1 && field1541 >= arg0.field2700) {
            if (arg0.field2698 < 0) {
                arg0.field2698 = 0;
            }
            int var25 = class184.method1375(arg0.field2697).field2814;
            if (var25 == -1) {
                arg0.field2697 = -1;
            } else {
                class173 var26 = class173.method3098(var25);
                if (var26 == null || var26.field2584 == null) {
                    arg0.field2697 = -1;
                } else {
                    arg0.field2699++;
                    if (arg0.field2698 < var26.field2584.length && arg0.field2699 > var26.field2588[arg0.field2698]) {
                        arg0.field2699 = 1;
                        arg0.field2698++;
                        method486(var26, arg0.field2698, arg0.field2707, arg0.field2664);
                    }
                    if (arg0.field2698 >= var26.field2584.length && (arg0.field2698 < 0 || arg0.field2698 >= var26.field2584.length)) {
                        arg0.field2697 = -1;
                    }
                }
            }
        }
        if (arg0.field2692 != -1 && arg0.field2695 <= 1) {
            class173 var27 = class173.method3098(arg0.field2692);
            if (var27.field2582 == 1 && arg0.field2719 > 0 && arg0.field2711 <= field1541 && arg0.field2701 < field1541) {
                arg0.field2695 = 1;
                return;
            }
        }
        if (arg0.field2692 != -1 && arg0.field2695 == 0) {
            class173 var28 = class173.method3098(arg0.field2692);
            if (var28 == null || var28.field2584 == null) {
                arg0.field2692 = -1;
            } else {
                arg0.field2694++;
                if (arg0.field2693 < var28.field2584.length && arg0.field2694 > var28.field2588[arg0.field2693]) {
                    arg0.field2694 = 1;
                    arg0.field2693++;
                    method486(var28, arg0.field2693, arg0.field2707, arg0.field2664);
                }
                if (arg0.field2693 >= var28.field2584.length) {
                    arg0.field2693 -= var28.field2575;
                    arg0.field2685++;
                    if (arg0.field2685 >= var28.field2581) {
                        arg0.field2692 = -1;
                    } else if (arg0.field2693 >= 0 && arg0.field2693 < var28.field2584.length) {
                        method486(var28, arg0.field2693, arg0.field2707, arg0.field2664);
                    } else {
                        arg0.field2692 = -1;
                    }
                }
                arg0.field2682 = var28.field2577;
            }
        }
        if (arg0.field2695 > 0) {
            arg0.field2695--;
        }
    }

    @ObfuscatedName("dw.du(Ljava/lang/String;II)V")
    public static final void method475(String arg0, int arg1) {
        field1570.method653(102);
        field1570.method666(class50.method2053(arg0) + 1);
        field1570.method671(arg0);
        field1570.method830(arg1);
    }

    @ObfuscatedName("dx.aq(Lk;III)V")
    public static void method476(class74 arg0, int arg1, int arg2) {
        if (arg0.field2692 == arg1 && arg1 != -1) {
            int var3 = class173.method3098(arg1).field2585;
            if (var3 == 1) {
                arg0.field2693 = 0;
                arg0.field2694 = 0;
                arg0.field2695 = arg2;
                arg0.field2685 = 0;
            }
            if (var3 == 2) {
                arg0.field2685 = 0;
            }
        } else if (arg1 == -1 || arg0.field2692 == -1 || class173.method3098(arg1).field2578 >= class173.method3098(arg0.field2692).field2578) {
            arg0.field2692 = arg1;
            arg0.field2693 = 0;
            arg0.field2694 = 0;
            arg0.field2695 = arg2;
            arg0.field2685 = 0;
            arg0.field2719 = arg0.field2714;
        }
    }

    @ObfuscatedName("ea.a(Lai;IIIB)V")
    public static void method486(class173 arg0, int arg1, int arg2, int arg3) {
        if (field1770 >= 50 || field1769 == 0 || arg0.field2574 == null || arg1 >= arg0.field2574.length) {
            return;
        }
        int var4 = arg0.field2574[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1771[field1770] = var5;
        field1772[field1770] = var6;
        field1773[field1770] = 0;
        field1775[field1770] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1704[field1770] = (var8 << 16) + (var9 << 8) + var7;
        field1770++;
    }

    @ObfuscatedName("ed.as(Lac;II)V")
    public static final void method533(class179 arg0, int arg1) {
        method1082(arg0.field2707, arg0.field2664, arg1);
    }

    @ObfuscatedName("de.cq(Lfi;B)Lfi;")
    public static class12 method535(class12 arg0) {
        class12 var1 = method1162(arg0);
        if (var1 == null) {
            var1 = arg0.field141;
        }
        return var1;
    }

    @ObfuscatedName("dd.bx(I)V")
    public static final void method537() {
        int var0 = Statics.field1442.method281(class85.field1124);
        for (int var1 = 0; var1 < field1627; var1++) {
            int var2 = Statics.field1442.method281(method2372(var1));
            if (var2 > var0) {
                var0 = var2;
            }
        }
        var0 += 8;
        int var3 = field1627 * 15 + 21;
        int var4 = class108.field1808 - var0 / 2;
        if (var0 + var4 > 765) {
            var4 = 765 - var0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class108.field1809;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        field1601 = true;
        Statics.field2722 = var4;
        Statics.field2061 = var5;
        Statics.field2477 = var0;
        Statics.field788 = field1627 * 15 + 22;
    }

    @ObfuscatedName("dd.cz(Lk;IIIB)V")
    public static final void method541(class74 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1320 == arg0 || field1627 >= 400) {
            return;
        }
        String var4;
        if (arg0.field852 == 0) {
            var4 = arg0.field855 + method1141(arg0.field851, Statics.field1320.field851) + " " + class76.field877 + class85.field1127 + arg0.field851 + class76.field878;
        } else {
            var4 = arg0.field855 + " " + class76.field877 + class85.field1128 + arg0.field852 + class76.field878;
        }
        if (field1684 == 1) {
            method1366(class85.field1099, field1685 + " " + class76.field887 + " " + class76.method1092(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field1530) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field1661[var5] != null) {
                    short var6 = 0;
                    if (field1661[var5].equalsIgnoreCase(class85.field1123)) {
                        if (arg0.field851 > Statics.field1320.field851) {
                            var6 = 2000;
                        }
                        if (Statics.field1320.field865 != 0 && arg0.field865 != 0) {
                            if (Statics.field1320.field865 == arg0.field865) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field1558[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field1660[var5] + var6;
                    method1366(field1661[var5], class76.method1092(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field561 & 0x8) == 8) {
            method1366(field1688, field1666 + " " + class76.field887 + " " + class76.method1092(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field1627; var9++) {
            if (field1676[var9] == 23) {
                field1556[var9] = class76.method1092(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("dd.ak(Ljava/lang/String;ZI)V")
    public static final void method542(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field784.method289(arg0, 250);
        int var6 = Statics.field784.method292(arg0, 250) * 13;
        class146.method2400(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class146.method2402(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field784.method284(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1085(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method1411(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1812.getGraphics();
            Statics.field617.method1475(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1812.repaint();
        }
    }

    @ObfuscatedName("dg.bu(IIB)V")
    public static final void method547(int arg0, int arg1) {
        class15 var2 = field1586[Statics.field2252][arg0][arg1];
        if (var2 == null) {
            Statics.field260.method1520(Statics.field2252, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class78 var4 = null;
        for (class78 var5 = (class78) var2.method212(); var5 != null; var5 = (class78) var2.method201()) {
            class176 var6 = class176.method3351(var5.field902);
            int var7 = var6.field2636;
            if (var6.field2621 == 1) {
                var7 = (var5.field903 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field260.method1520(Statics.field2252, arg0, arg1);
            return;
        }
        var2.method204(var4);
        class78 var8 = null;
        class78 var9 = null;
        for (class78 var10 = (class78) var2.method212(); var10 != null; var10 = (class78) var2.method201()) {
            if (var4.field902 != var10.field902) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field902 != var10.field902 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field260.method1506(Statics.field2252, arg0, arg1, method1447(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2252), var4, var11, var8, var9);
    }

    @ObfuscatedName("dg.bl(II)V")
    public static final void method548(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field1674[arg0];
        int var2 = field1718[arg0];
        int var3 = field1676[arg0];
        int var4 = field1761[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 36) {
            field1570.method653(45);
            field1570.method804(var2);
            field1570.method667(var1);
            field1570.method709(var4);
            field1641 = 0;
            Statics.field1463 = class12.method2369(var2);
            field1727 = var1;
        }
        if (var3 == 38) {
            method2064();
            class12 var5 = class12.method2369(var2);
            field1684 = 1;
            Statics.field2263 = var1;
            Statics.field1440 = var2;
            Statics.field868 = var4;
            method2390(var5);
            field1685 = class76.method1092(16748608) + class176.method3351(var4).field2614 + class76.method1092(16777215);
            if (field1685 == null) {
                field1685 = "null";
            }
            return;
        }
        if (var3 == 10) {
            class62 var6 = field1567[var4];
            if (var6 != null) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var6.field2676[0], var6.field2716[0], false, 0, 0, 1, 1, 0, 2);
                field1571 = class108.field1808;
                field1638 = class108.field1809;
                field1640 = 2;
                field1639 = 0;
                field1570.method653(173);
                field1570.method709(var4);
            }
        }
        if (var3 == 32) {
            field1570.method653(48);
            field1570.method669(var2);
            field1570.method708(var4);
            field1570.method732(Statics.field2039);
            field1570.method710(var1);
            field1570.method710(field1687);
            field1641 = 0;
            Statics.field1463 = class12.method2369(var2);
            field1727 = var1;
        }
        if (var3 == 17) {
            boolean var7 = method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var7) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field1571 = class108.field1808;
            field1638 = class108.field1809;
            field1640 = 2;
            field1639 = 0;
            field1570.method653(34);
            field1570.method819(Statics.field2039);
            field1570.method710(Statics.field2043 + var1);
            field1570.method709(Statics.field403 + var2);
            field1570.method710(var4);
            field1570.method667(field1687);
        }
        if (var3 == 24) {
            class12 var9 = class12.method2369(var2);
            boolean var10 = true;
            if (var9.field126 > 0) {
                var10 = Statics.method1081(var9);
            }
            if (var10) {
                field1570.method653(221);
                field1570.method669(var2);
            }
        }
        if (var3 == 9) {
            class62 var11 = field1567[var4];
            if (var11 != null) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var11.field2676[0], var11.field2716[0], false, 0, 0, 1, 1, 0, 2);
                field1571 = class108.field1808;
                field1638 = class108.field1809;
                field1640 = 2;
                field1639 = 0;
                field1570.method653(80);
                field1570.method708(var4);
            }
        }
        if (var3 == 37) {
            field1570.method653(253);
            field1570.method819(var2);
            field1570.method667(var1);
            field1570.method667(var4);
            field1641 = 0;
            Statics.field1463 = class12.method2369(var2);
            field1727 = var1;
        }
        if (var3 == 1005) {
            class12 var12 = class12.method2369(var2);
            if (var12 == null || var12.field169[var1] < 100000) {
                field1570.method653(23);
                field1570.method667(var4);
            } else {
                method2192(0, "", var12.field169[var1] + " x " + class176.method3351(var4).field2614);
            }
            field1641 = 0;
            Statics.field1463 = class12.method2369(var2);
            field1727 = var1;
        }
        if (var3 == 13) {
            class62 var13 = field1567[var4];
            if (var13 != null) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var13.field2676[0], var13.field2716[0], false, 0, 0, 1, 1, 0, 2);
                field1571 = class108.field1808;
                field1638 = class108.field1809;
                field1640 = 2;
                field1639 = 0;
                field1570.method653(22);
                field1570.method710(var4);
            }
        }
        if (var3 == 47) {
            class74 var14 = field1650[var4];
            if (var14 != null) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var14.field2676[0], var14.field2716[0], false, 0, 0, 1, 1, 0, 2);
                field1571 = class108.field1808;
                field1638 = class108.field1809;
                field1640 = 2;
                field1639 = 0;
                field1570.method653(30);
                field1570.method667(var4);
            }
        }
        if (var3 == 18) {
            boolean var15 = method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var15) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field1571 = class108.field1808;
            field1638 = class108.field1809;
            field1640 = 2;
            field1639 = 0;
            field1570.method653(232);
            field1570.method667(var4);
            field1570.method667(Statics.field403 + var2);
            field1570.method709(Statics.field2043 + var1);
        }
        if (var3 == 51) {
            class74 var17 = field1650[var4];
            if (var17 != null) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var17.field2676[0], var17.field2716[0], false, 0, 0, 1, 1, 0, 2);
                field1571 = class108.field1808;
                field1638 = class108.field1809;
                field1640 = 2;
                field1639 = 0;
                field1570.method653(212);
                field1570.method708(var4);
            }
        }
        if (var3 == 8) {
            class62 var18 = field1567[var4];
            if (var18 != null) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var18.field2676[0], var18.field2716[0], false, 0, 0, 1, 1, 0, 2);
                field1571 = class108.field1808;
                field1638 = class108.field1809;
                field1640 = 2;
                field1639 = 0;
                field1570.method653(7);
                field1570.method667(var4);
                field1570.method708(field1687);
                field1570.method732(Statics.field2039);
            }
        }
        if (var3 == 23) {
            Statics.field260.method1536(Statics.field2252, var1, var2);
        }
        if (var3 == 39) {
            field1570.method653(233);
            field1570.method709(var1);
            field1570.method804(var2);
            field1570.method708(var4);
            field1641 = 0;
            Statics.field1463 = class12.method2369(var2);
            field1727 = var1;
        }
        if (var3 == 20) {
            boolean var19 = method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var19) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field1571 = class108.field1808;
            field1638 = class108.field1809;
            field1640 = 2;
            field1639 = 0;
            field1570.method653(207);
            field1570.method710(Statics.field403 + var2);
            field1570.method710(Statics.field2043 + var1);
            field1570.method667(var4);
        }
        if (var3 == 11) {
            class62 var21 = field1567[var4];
            if (var21 != null) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var21.field2676[0], var21.field2716[0], false, 0, 0, 1, 1, 0, 2);
                field1571 = class108.field1808;
                field1638 = class108.field1809;
                field1640 = 2;
                field1639 = 0;
                field1570.method653(106);
                field1570.method709(var4);
            }
        }
        if (var3 == 1003) {
            field1571 = class108.field1808;
            field1638 = class108.field1809;
            field1640 = 2;
            field1639 = 0;
            class62 var22 = field1567[var4];
            if (var22 != null) {
                class171 var23 = var22.field678;
                if (var23.field2549 != null) {
                    var23 = var23.method2957();
                }
                if (var23 != null) {
                    field1570.method653(176);
                    field1570.method708(var23.field2532);
                }
            }
        }
        if (var3 == 16) {
            boolean var24 = method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var24) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field1571 = class108.field1808;
            field1638 = class108.field1809;
            field1640 = 2;
            field1639 = 0;
            field1570.method653(231);
            field1570.method710(var4);
            field1570.method710(Statics.field868);
            field1570.method709(Statics.field2043 + var1);
            field1570.method710(Statics.field403 + var2);
            field1570.method732(Statics.field1440);
            field1570.method710(Statics.field2263);
        }
        if (var3 == 3) {
            method1364(var1, var2, var4);
            field1570.method653(235);
            field1570.method709(var4 >> 14 & 0x7FFF);
            field1570.method708(Statics.field2043 + var1);
            field1570.method710(Statics.field403 + var2);
        }
        if (var3 == 7) {
            class62 var26 = field1567[var4];
            if (var26 != null) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var26.field2676[0], var26.field2716[0], false, 0, 0, 1, 1, 0, 2);
                field1571 = class108.field1808;
                field1638 = class108.field1809;
                field1640 = 2;
                field1639 = 0;
                field1570.method653(133);
                field1570.method709(Statics.field2263);
                field1570.method709(var4);
                field1570.method709(Statics.field868);
                field1570.method732(Statics.field1440);
            }
        }
        if (var3 == 44) {
            class74 var27 = field1650[var4];
            if (var27 != null) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var27.field2676[0], var27.field2716[0], false, 0, 0, 1, 1, 0, 2);
                field1571 = class108.field1808;
                field1638 = class108.field1809;
                field1640 = 2;
                field1639 = 0;
                field1570.method653(43);
                field1570.method709(var4);
            }
        }
        if (var3 == 46) {
            class74 var28 = field1650[var4];
            if (var28 != null) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var28.field2676[0], var28.field2716[0], false, 0, 0, 1, 1, 0, 2);
                field1571 = class108.field1808;
                field1638 = class108.field1809;
                field1640 = 2;
                field1639 = 0;
                field1570.method653(157);
                field1570.method709(var4);
            }
        }
        if (var3 == 35) {
            field1570.method653(230);
            field1570.method709(var1);
            field1570.method804(var2);
            field1570.method708(var4);
            field1641 = 0;
            Statics.field1463 = class12.method2369(var2);
            field1727 = var1;
        }
        if (var3 == 1004) {
            field1571 = class108.field1808;
            field1638 = class108.field1809;
            field1640 = 2;
            field1639 = 0;
            field1570.method653(23);
            field1570.method667(var4);
        }
        if (var3 == 41) {
            field1570.method653(52);
            field1570.method709(var1);
            field1570.method710(var4);
            field1570.method819(var2);
            field1641 = 0;
            Statics.field1463 = class12.method2369(var2);
            field1727 = var1;
        }
        if (var3 == 26) {
            field1570.method653(104);
            for (class80 var29 = (class80) field1691.method16(); var29 != null; var29 = (class80) field1691.method17()) {
                if (var29.field932 == 0 || var29.field932 == 3) {
                    method2908(var29, true);
                }
            }
            if (field1694 != null) {
                method2390(field1694);
                field1694 = null;
            }
        }
        if (var3 == 22) {
            boolean var30 = method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var30) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field1571 = class108.field1808;
            field1638 = class108.field1809;
            field1640 = 2;
            field1639 = 0;
            field1570.method653(29);
            field1570.method708(var4);
            field1570.method708(Statics.field403 + var2);
            field1570.method708(Statics.field2043 + var1);
        }
        if (var3 == 48) {
            class74 var32 = field1650[var4];
            if (var32 != null) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var32.field2676[0], var32.field2716[0], false, 0, 0, 1, 1, 0, 2);
                field1571 = class108.field1808;
                field1638 = class108.field1809;
                field1640 = 2;
                field1639 = 0;
                field1570.method653(118);
                field1570.method709(var4);
            }
        }
        if (var3 == 21) {
            boolean var33 = method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var33) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field1571 = class108.field1808;
            field1638 = class108.field1809;
            field1640 = 2;
            field1639 = 0;
            field1570.method653(181);
            field1570.method709(Statics.field403 + var2);
            field1570.method667(Statics.field2043 + var1);
            field1570.method710(var4);
        }
        if (var3 == 49) {
            class74 var35 = field1650[var4];
            if (var35 != null) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var35.field2676[0], var35.field2716[0], false, 0, 0, 1, 1, 0, 2);
                field1571 = class108.field1808;
                field1638 = class108.field1809;
                field1640 = 2;
                field1639 = 0;
                field1570.method653(51);
                field1570.method709(var4);
            }
        }
        if (var3 == 42) {
            field1570.method653(12);
            field1570.method669(var2);
            field1570.method709(var4);
            field1570.method710(var1);
            field1641 = 0;
            Statics.field1463 = class12.method2369(var2);
            field1727 = var1;
        }
        if (var3 == 45) {
            class74 var36 = field1650[var4];
            if (var36 != null) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var36.field2676[0], var36.field2716[0], false, 0, 0, 1, 1, 0, 2);
                field1571 = class108.field1808;
                field1638 = class108.field1809;
                field1640 = 2;
                field1639 = 0;
                field1570.method653(187);
                field1570.method708(var4);
            }
        }
        if (var3 == 40) {
            field1570.method653(28);
            field1570.method804(var2);
            field1570.method667(var1);
            field1570.method709(var4);
            field1641 = 0;
            Statics.field1463 = class12.method2369(var2);
            field1727 = var1;
        }
        if (var3 == 25) {
            class12 var37 = class12.method2328(var2, var1);
            if (var37 != null) {
                method2064();
                int var40 = method2929(var37);
                int var41 = var40 >> 11 & 0x3F;
                method2843(var2, var1, var41);
                field1684 = 0;
                field1688 = method3047(var37);
                if (field1688 == null) {
                    field1688 = "Null";
                }
                if (var37.field78) {
                    field1666 = var37.field139 + class76.method1092(16777215);
                } else {
                    field1666 = class76.method1092(65280) + var37.field177 + class76.method1092(16777215);
                }
            }
            return;
        }
        if (var3 == 1002) {
            field1571 = class108.field1808;
            field1638 = class108.field1809;
            field1640 = 2;
            field1639 = 0;
            field1570.method653(70);
            field1570.method710(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 4) {
            method1364(var1, var2, var4);
            field1570.method653(175);
            field1570.method710(Statics.field2043 + var1);
            field1570.method708(Statics.field403 + var2);
            field1570.method709(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 2 && method1364(var1, var2, var4)) {
            field1570.method653(255);
            field1570.method708(field1687);
            field1570.method709(var4 >> 14 & 0x7FFF);
            field1570.method732(Statics.field2039);
            field1570.method708(Statics.field403 + var2);
            field1570.method708(Statics.field2043 + var1);
        }
        if (var3 == 33) {
            field1570.method653(197);
            field1570.method732(var2);
            field1570.method709(var4);
            field1570.method708(var1);
            field1641 = 0;
            Statics.field1463 = class12.method2369(var2);
            field1727 = var1;
        }
        if (var3 == 19) {
            boolean var42 = method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var42) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field1571 = class108.field1808;
            field1638 = class108.field1809;
            field1640 = 2;
            field1639 = 0;
            field1570.method653(103);
            field1570.method708(var4);
            field1570.method710(Statics.field2043 + var1);
            field1570.method710(Statics.field403 + var2);
        }
        if (var3 == 5) {
            method1364(var1, var2, var4);
            field1570.method653(201);
            field1570.method710(Statics.field403 + var2);
            field1570.method710(Statics.field2043 + var1);
            field1570.method708(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 28) {
            field1570.method653(221);
            field1570.method669(var2);
            class12 var44 = class12.method2369(var2);
            if (var44.field100 != null && var44.field100[0][0] == 5) {
                int var45 = var44.field100[0][1];
                class71.field800[var45] = 1 - class71.field800[var45];
                method1148(var45);
            }
        }
        if (var3 == 43) {
            field1570.method653(65);
            field1570.method709(var1);
            field1570.method667(var4);
            field1570.method669(var2);
            field1641 = 0;
            Statics.field1463 = class12.method2369(var2);
            field1727 = var1;
        }
        if (var3 == 30 && field1694 == null) {
            method1208(var2, var1);
            field1694 = class12.method2328(var2, var1);
            method2390(field1694);
        }
        if (var3 == 6) {
            method1364(var1, var2, var4);
            field1570.method653(143);
            field1570.method667(Statics.field403 + var2);
            field1570.method667(var4 >> 14 & 0x7FFF);
            field1570.method708(Statics.field2043 + var1);
        }
        if (var3 == 14) {
            class74 var46 = field1650[var4];
            if (var46 != null) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var46.field2676[0], var46.field2716[0], false, 0, 0, 1, 1, 0, 2);
                field1571 = class108.field1808;
                field1638 = class108.field1809;
                field1640 = 2;
                field1639 = 0;
                field1570.method653(241);
                field1570.method732(Statics.field1440);
                field1570.method709(Statics.field868);
                field1570.method710(var4);
                field1570.method709(Statics.field2263);
            }
        }
        if (var3 == 50) {
            class74 var47 = field1650[var4];
            if (var47 != null) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var47.field2676[0], var47.field2716[0], false, 0, 0, 1, 1, 0, 2);
                field1571 = class108.field1808;
                field1638 = class108.field1809;
                field1640 = 2;
                field1639 = 0;
                field1570.method653(123);
                field1570.method709(var4);
            }
        }
        if (var3 == 58) {
            field1570.method653(5);
            field1570.method804(Statics.field2039);
            field1570.method708(var1);
            field1570.method709(field1687);
            field1570.method669(var2);
        }
        if (var3 == 15) {
            class74 var48 = field1650[var4];
            if (var48 != null) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var48.field2676[0], var48.field2716[0], false, 0, 0, 1, 1, 0, 2);
                field1571 = class108.field1808;
                field1638 = class108.field1809;
                field1640 = 2;
                field1639 = 0;
                field1570.method653(54);
                field1570.method732(Statics.field2039);
                field1570.method709(field1687);
                field1570.method667(var4);
            }
        }
        if (var3 == 34) {
            field1570.method653(97);
            field1570.method710(var1);
            field1570.method669(var2);
            field1570.method708(var4);
            field1641 = 0;
            Statics.field1463 = class12.method2369(var2);
            field1727 = var1;
        }
        if (var3 == 31) {
            field1570.method653(183);
            field1570.method804(Statics.field1440);
            field1570.method667(Statics.field868);
            field1570.method710(var4);
            field1570.method667(Statics.field2263);
            field1570.method804(var2);
            field1570.method709(var1);
            field1641 = 0;
            Statics.field1463 = class12.method2369(var2);
            field1727 = var1;
        }
        if (var3 == 29) {
            field1570.method653(221);
            field1570.method669(var2);
            class12 var49 = class12.method2369(var2);
            if (var49.field100 != null && var49.field100[0][0] == 5) {
                int var50 = var49.field100[0][1];
                if (class71.field800[var50] != var49.field164[0]) {
                    class71.field800[var50] = var49.field164[0];
                    method1148(var50);
                }
            }
        }
        if (var3 == 12) {
            class62 var51 = field1567[var4];
            if (var51 != null) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var51.field2676[0], var51.field2716[0], false, 0, 0, 1, 1, 0, 2);
                field1571 = class108.field1808;
                field1638 = class108.field1809;
                field1640 = 2;
                field1639 = 0;
                field1570.method653(225);
                field1570.method708(var4);
            }
        }
        if (var3 == 1 && method1364(var1, var2, var4)) {
            field1570.method653(190);
            field1570.method667(Statics.field403 + var2);
            field1570.method710(Statics.field2263);
            field1570.method708(Statics.field868);
            field1570.method732(Statics.field1440);
            field1570.method708(var4 >> 14 & 0x7FFF);
            field1570.method667(Statics.field2043 + var1);
        }
        if (var3 == 1001) {
            method1364(var1, var2, var4);
            field1570.method653(36);
            field1570.method708(Statics.field403 + var2);
            field1570.method710(Statics.field2043 + var1);
            field1570.method710(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 57 || var3 == 1007) {
            method1193(var4, var2, var1, field1556[arg0]);
        }
        if (field1684 != 0) {
            field1684 = 0;
            method2390(class12.method2369(Statics.field1440));
        }
        if (field1530) {
            method2064();
        }
        if (Statics.field1463 != null && field1641 == 0) {
            method2390(Statics.field1463);
        }
    }

    @ObfuscatedName("ds.c(Ljava/lang/String;B)V")
    public static final void method884(String arg0) {
        if (arg0.equalsIgnoreCase("::toggleroof")) {
            Statics.field1898.field581 = !Statics.field1898.field581;
            class56.method3354();
            if (Statics.field1898.field581) {
                method2192(0, "", "Roofs are now all hidden");
            } else {
                method2192(0, "", "Roofs will only be removed selectively");
            }
        }
        if (field1536 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                if (field1714 > 0) {
                    method1334();
                } else {
                    method897(40);
                    Statics.field733 = Statics.field2080;
                    Statics.field2080 = null;
                }
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                field1547 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                field1547 = false;
            }
            if (arg0.equalsIgnoreCase("::noclip")) {
                for (int var1 = 0; var1 < 4; var1++) {
                    for (int var2 = 1; var2 < 103; var2++) {
                        for (int var3 = 1; var3 < 103; var3++) {
                            field1588[var1].field42[var2][var3] = 0;
                        }
                    }
                }
            }
            if (arg0.equalsIgnoreCase("::errortest") && field1781 == 2) {
                throw new RuntimeException();
            }
        }
        field1570.method653(162);
        field1570.method666(arg0.length() - 1);
        field1570.method671(arg0.substring(2));
    }

    @ObfuscatedName("f.s(IB)V")
    public static void method897(int arg0) {
        if (field1539 == arg0) {
            return;
        }
        if (field1539 == 0) {
            class125.method896();
        }
        if (arg0 == 20 || arg0 == 40) {
            field1563 = 0;
            field1564 = 0;
            field1768 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field733 != null) {
            Statics.field733.method2290();
            Statics.field733 = null;
        }
        if (field1539 == 25) {
            field1587 = 0;
            field1730 = 0;
            field1695 = 1;
            field1615 = 0;
            field1783 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class102.method1093(Statics.field1812, Statics.field552, Statics.field344);
        } else if (Statics.field1418) {
            Statics.field1400 = null;
            Statics.field1401 = null;
            Statics.field1421 = null;
            Statics.field1427 = null;
            Statics.field1311 = null;
            Statics.field1404 = null;
            Statics.field1890 = null;
            Statics.field512 = null;
            Statics.field2516 = null;
            Statics.field2079 = null;
            Statics.field1433 = null;
            Statics.field2502 = null;
            Statics.field2111 = null;
            Statics.field1408 = null;
            Statics.field1402 = null;
            Statics.field1430 = null;
            Statics.field1403 = null;
            Statics.field419 = null;
            Statics.field723 = null;
            Statics.field19 = null;
            class97.field1365 = 1;
            Statics.field938 = null;
            Statics.field1366 = -1;
            Statics.field701 = -1;
            Statics.field1367 = 0;
            Statics.field2144 = false;
            Statics.field1368 = 2;
            class79.method1151(true);
            Statics.field1418 = false;
        }
        field1539 = arg0;
    }

    @ObfuscatedName("g.bw(IIIIIIIB)V")
    public static final void method953(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field1537 && Statics.field2252 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field260.method1611(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field260.method1519(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field260.method1554(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field260.method1528(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field260.method1505(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field260.method1648(arg0, arg2, arg3);
                class182 var15 = class182.method3383(var12);
                if (var15.field2771 != 0) {
                    field1588[arg0].method61(arg2, arg3, var13, var14, var15.field2778);
                }
            }
            if (arg1 == 1) {
                Statics.field260.method1517(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field260.method1518(arg0, arg2, arg3);
                class182 var16 = class182.method3383(var12);
                if (var16.field2777 + arg2 > 103 || var16.field2777 + arg3 > 103 || var16.field2769 + arg2 > 103 || var16.field2769 + arg3 > 103) {
                    return;
                }
                if (var16.field2771 != 0) {
                    field1588[arg0].method62(arg2, arg3, var16.field2777, var16.field2769, var14, var16.field2778);
                }
            }
            if (arg1 == 3) {
                Statics.field260.method1499(arg0, arg2, arg3);
                class182 var17 = class182.method3383(var12);
                if (var17.field2771 == 1) {
                    field1588[arg0].method64(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class88.field1237[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class88.method1188(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field260, field1588[arg0]);
    }

    @ObfuscatedName("g.ch(IIIB)Lw;")
    public static final class80 method961(int arg0, int arg1, int arg2) {
        class80 var3 = new class80();
        var3.field929 = arg1;
        var3.field932 = arg2;
        field1691.method14(var3, (long) arg0);
        method3128(arg1);
        class82.method2051(arg1);
        class12 var4 = class12.method2369(arg0);
        if (var4 != null) {
            method2390(var4);
        }
        if (field1694 != null) {
            method2390(field1694);
            field1694 = null;
        }
        method1453();
        if (field1690 != -1) {
            int var5 = field1690;
            if (class12.method536(var5)) {
                method2373(Statics.field173[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("d.bz(IB)Z")
    public static boolean method1080(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("d.av(IIII)V")
    public static final void method1082(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field1635 = -1;
            field1636 = -1;
            return;
        }
        int var3 = method1447(arg0, arg1, Statics.field2252) - arg2;
        int var4 = arg0 - Statics.field2127;
        int var5 = var3 - Statics.field653;
        int var6 = arg1 - Statics.field799;
        int var7 = class153.field2293[Statics.field954];
        int var8 = class153.field2299[Statics.field954];
        int var9 = class153.field2293[Statics.field2849];
        int var10 = class153.field2299[Statics.field2849];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field1635 = (var11 << 9) / var15 + 256;
            field1636 = (var14 << 9) / var15 + 167;
        } else {
            field1635 = -1;
            field1636 = -1;
        }
    }

    @ObfuscatedName("e.bq(IIIII)V")
    public static final void method1085(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1566; var4++) {
            if (field1738[var4] + field1736[var4] > arg0 && field1736[var4] < arg0 + arg2 && field1747[var4] + field1739[var4] > arg1 && field1747[var4] < arg1 + arg3) {
                field1733[var4] = true;
            }
        }
    }

    @ObfuscatedName("e.ce(Lfi;IIIIIII)V")
    public static final void method1090(class12 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field1705) {
            field1544 = 32;
        } else {
            field1544 = 0;
        }
        field1705 = false;
        if (class108.field1800 != 0) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field93 -= 4;
                method2390(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field93 += 4;
                method2390(arg0);
            } else if (arg5 >= arg1 - field1544 && arg5 < field1544 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field93 = (arg4 - arg3) * var8 / var9;
                method2390(arg0);
                field1705 = true;
            }
        }
        if (field1613 == 0) {
            return;
        }
        int var10 = arg0.field88;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field93 += field1613 * 45;
            method2390(arg0);
        }
    }

    @ObfuscatedName("b.bm(I)V")
    public static final void method1091() {
        field1658 = 0;
        field1653 = 0;
        method1154();
        int var0 = field1572.method656(8);
        if (var0 < field1651) {
            for (int var1 = var0; var1 < field1651; var1++) {
                field1672[++field1658 - 1] = field1731[var1];
            }
        }
        if (var0 > field1651) {
            throw new RuntimeException("");
        }
        field1651 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field1731[var2];
            class74 var4 = field1650[var3];
            int var5 = field1572.method656(1);
            if (var5 == 0) {
                field1731[++field1651 - 1] = var3;
                var4.field2671 = field1541;
            } else {
                int var6 = field1572.method656(2);
                if (var6 == 0) {
                    field1731[++field1651 - 1] = var3;
                    var4.field2671 = field1541;
                    field1654[++field1653 - 1] = var3;
                } else if (var6 == 1) {
                    field1731[++field1651 - 1] = var3;
                    var4.field2671 = field1541;
                    int var7 = field1572.method656(3);
                    var4.method3113(var7, false);
                    int var8 = field1572.method656(1);
                    if (var8 == 1) {
                        field1654[++field1653 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field1731[++field1651 - 1] = var3;
                    var4.field2671 = field1541;
                    int var9 = field1572.method656(3);
                    var4.method3113(var9, true);
                    int var10 = field1572.method656(3);
                    var4.method3113(var10, true);
                    int var11 = field1572.method656(1);
                    if (var11 == 1) {
                        field1654[++field1653 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field1672[++field1658 - 1] = var3;
                }
            }
        }
        method2274();
        method2380();
        for (int var12 = 0; var12 < field1658; var12++) {
            int var13 = field1672[var12];
            if (field1541 != field1650[var13].field2671) {
                field1650[var13] = null;
            }
        }
        if (field1573 != field1572.field540) {
            throw new RuntimeException(field1572.field540 + class76.field874 + field1573);
        }
        for (int var14 = 0; var14 < field1651; var14++) {
            if (field1650[field1731[var14]] == null) {
                throw new RuntimeException(var14 + class76.field874 + field1651);
            }
        }
    }

    @ObfuscatedName("c.ds(Lfi;II)Ljava/lang/String;")
    public static String method1096(class12 arg0, int arg1) {
        int var2 = method2929(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field166 == null) {
            return null;
        } else if (arg0.field140 == null || arg0.field140.length <= arg1 || arg0.field140[arg1] == null || arg0.field140[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field140[arg1];
        }
    }

    @ObfuscatedName("ey.cc([Lfi;IIIIIIII)V")
    public static final void method1101(class12[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class12 var9 = arg0[var8];
            if (var9 != null && (!var9.field78 || var9.field81 == 0 || var9.field146 || method2929(var9) != 0 || field1712 == var9) && var9.field90 == arg1 && (!var9.field78 || !method1108(var9))) {
                int var10 = var9.field176 + arg6;
                int var11 = var9.field85 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field81 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field81 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field88 + var10;
                    int var19 = var9.field89 + var11;
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
                    int var22 = var9.field88 + var10;
                    int var23 = var9.field89 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1701 == var9) {
                    field1757 = true;
                    field1596 = var10;
                    field1532 = var11;
                }
                if (!var9.field78 || var12 < var14 && var13 < var15) {
                    if (var9.field126 == 1337) {
                        method2390(var9);
                    } else if (var9.field126 != 1338) {
                        if (var9.field81 == 0) {
                            if (!var9.field78 && method1108(var9) && Statics.field2186 != var9) {
                                continue;
                            }
                            method1101(arg0, var9.field128, var12, var13, var14, var15, var10 - var9.field92, var11 - var9.field93);
                            if (var9.field187 != null) {
                                method1101(var9.field187, var9.field128, var12, var13, var14, var15, var10 - var9.field92, var11 - var9.field93);
                            }
                            class80 var36 = (class80) field1691.method20((long) var9.field128);
                            if (var36 != null) {
                                int var37 = var36.field929;
                                if (class12.method536(var37)) {
                                    method1101(Statics.field173[var37], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field78) {
                            boolean var38;
                            if (class108.field1801 >= var12 && class108.field1802 >= var13 && class108.field1801 < var14 && class108.field1802 < var15) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if (class108.field1800 == 1 && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if (class108.field1807 == 1 && class108.field1808 >= var12 && class108.field1809 >= var13 && class108.field1808 < var14 && class108.field1809 < var15) {
                                var40 = true;
                            }
                            if (var40) {
                                method1948(var9, class108.field1808 - var10, class108.field1809 - var11);
                            }
                            if (field1701 != null && field1701 != var9 && var38) {
                                int var41 = method2929(var9);
                                boolean var42 = (var41 >> 20 & 0x1) != 0;
                                if (var42) {
                                    field1716 = var9;
                                }
                            }
                            if (field1712 == var9) {
                                field1706 = true;
                                field1707 = var10;
                                field1631 = var11;
                            }
                            if (var9.field146) {
                                if (var38 && field1613 != 0 && var9.field162 != null) {
                                    class61 var43 = new class61();
                                    var43.field662 = var9;
                                    var43.field665 = field1613;
                                    var43.field664 = var9.field162;
                                    field1759.method219(var43);
                                }
                                if (field1701 != null || Statics.field1466 != null || field1601) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field189 && var40) {
                                    var9.field189 = true;
                                    if (var9.field148 != null) {
                                        class61 var44 = new class61();
                                        var44.field662 = var9;
                                        var44.field663 = class108.field1808 - var10;
                                        var44.field665 = class108.field1809 - var11;
                                        var44.field664 = var9.field148;
                                        field1759.method219(var44);
                                    }
                                }
                                if (var9.field189 && var39 && var9.field149 != null) {
                                    class61 var45 = new class61();
                                    var45.field662 = var9;
                                    var45.field663 = class108.field1801 - var10;
                                    var45.field665 = class108.field1802 - var11;
                                    var45.field664 = var9.field149;
                                    field1759.method219(var45);
                                }
                                if (var9.field189 && !var39) {
                                    var9.field189 = false;
                                    if (var9.field114 != null) {
                                        class61 var46 = new class61();
                                        var46.field662 = var9;
                                        var46.field663 = class108.field1801 - var10;
                                        var46.field665 = class108.field1802 - var11;
                                        var46.field664 = var9.field114;
                                        field1729.method219(var46);
                                    }
                                }
                                if (var39 && var9.field151 != null) {
                                    class61 var47 = new class61();
                                    var47.field662 = var9;
                                    var47.field663 = class108.field1801 - var10;
                                    var47.field665 = class108.field1802 - var11;
                                    var47.field664 = var9.field151;
                                    field1759.method219(var47);
                                }
                                if (!var9.field188 && var38) {
                                    var9.field188 = true;
                                    if (var9.field152 != null) {
                                        class61 var48 = new class61();
                                        var48.field662 = var9;
                                        var48.field663 = class108.field1801 - var10;
                                        var48.field665 = class108.field1802 - var11;
                                        var48.field664 = var9.field152;
                                        field1759.method219(var48);
                                    }
                                }
                                if (var9.field188 && var38 && var9.field153 != null) {
                                    class61 var49 = new class61();
                                    var49.field662 = var9;
                                    var49.field663 = class108.field1801 - var10;
                                    var49.field665 = class108.field1802 - var11;
                                    var49.field664 = var9.field153;
                                    field1759.method219(var49);
                                }
                                if (var9.field188 && !var38) {
                                    var9.field188 = false;
                                    if (var9.field142 != null) {
                                        class61 var50 = new class61();
                                        var50.field662 = var9;
                                        var50.field663 = class108.field1801 - var10;
                                        var50.field665 = class108.field1802 - var11;
                                        var50.field664 = var9.field142;
                                        field1729.method219(var50);
                                    }
                                }
                                if (var9.field165 != null) {
                                    class61 var51 = new class61();
                                    var51.field662 = var9;
                                    var51.field664 = var9.field165;
                                    field1728.method219(var51);
                                }
                                if (var9.field159 != null && field1715 > var9.field82) {
                                    if (var9.field76 == null || field1715 - var9.field82 > 32) {
                                        class61 var56 = new class61();
                                        var56.field662 = var9;
                                        var56.field664 = var9.field159;
                                        field1759.method219(var56);
                                    } else {
                                        label402: for (int var52 = var9.field82; var52 < field1715; var52++) {
                                            int var53 = field1576[var52 & 0x1F];
                                            for (int var54 = 0; var54 < var9.field76.length; var54++) {
                                                if (var9.field76[var54] == var53) {
                                                    class61 var55 = new class61();
                                                    var55.field662 = var9;
                                                    var55.field664 = var9.field159;
                                                    field1759.method219(var55);
                                                    break label402;
                                                }
                                            }
                                        }
                                    }
                                    var9.field82 = field1715;
                                }
                                if (var9.field161 != null && field1717 > var9.field192) {
                                    if (var9.field91 == null || field1717 - var9.field192 > 32) {
                                        class61 var61 = new class61();
                                        var61.field662 = var9;
                                        var61.field664 = var9.field161;
                                        field1759.method219(var61);
                                    } else {
                                        label382: for (int var57 = var9.field192; var57 < field1717; var57++) {
                                            int var58 = field1764[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var9.field91.length; var59++) {
                                                if (var9.field91[var59] == var58) {
                                                    class61 var60 = new class61();
                                                    var60.field662 = var9;
                                                    var60.field664 = var9.field161;
                                                    field1759.method219(var60);
                                                    break label382;
                                                }
                                            }
                                        }
                                    }
                                    var9.field192 = field1717;
                                }
                                if (var9.field110 != null && field1719 > var9.field193) {
                                    if (var9.field72 == null || field1719 - var9.field193 > 32) {
                                        class61 var66 = new class61();
                                        var66.field662 = var9;
                                        var66.field664 = var9.field110;
                                        field1759.method219(var66);
                                    } else {
                                        label362: for (int var62 = var9.field193; var62 < field1719; var62++) {
                                            int var63 = field1630[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var9.field72.length; var64++) {
                                                if (var9.field72[var64] == var63) {
                                                    class61 var65 = new class61();
                                                    var65.field662 = var9;
                                                    var65.field664 = var9.field110;
                                                    field1759.method219(var65);
                                                    break label362;
                                                }
                                            }
                                        }
                                    }
                                    var9.field193 = field1719;
                                }
                                if (field1720 > var9.field190 && var9.field185 != null) {
                                    class61 var67 = new class61();
                                    var67.field662 = var9;
                                    var67.field664 = var9.field185;
                                    field1759.method219(var67);
                                }
                                if (field1721 > var9.field190 && var9.field170 != null) {
                                    class61 var68 = new class61();
                                    var68.field662 = var9;
                                    var68.field664 = var9.field170;
                                    field1759.method219(var68);
                                }
                                if (field1722 > var9.field190 && var9.field171 != null) {
                                    class61 var69 = new class61();
                                    var69.field662 = var9;
                                    var69.field664 = var9.field171;
                                    field1759.method219(var69);
                                }
                                if (field1794 > var9.field190 && var9.field172 != null) {
                                    class61 var70 = new class61();
                                    var70.field662 = var9;
                                    var70.field664 = var9.field172;
                                    field1759.method219(var70);
                                }
                                var9.field190 = field1713;
                                if (var9.field69 != null) {
                                    for (int var71 = 0; var71 < field1679; var71++) {
                                        class61 var72 = new class61();
                                        var72.field662 = var9;
                                        var72.field667 = field1753[var71];
                                        var72.field668 = field1742[var71];
                                        var72.field664 = var9.field69;
                                        field1759.method219(var72);
                                    }
                                }
                            }
                        }
                        if (!var9.field78) {
                            if (field1701 != null || Statics.field1466 != null || field1601) {
                                return;
                            }
                            if ((var9.field178 >= 0 || var9.field144 != 0) && class108.field1801 >= var12 && class108.field1802 >= var13 && class108.field1801 < var14 && class108.field1802 < var15) {
                                if (var9.field178 >= 0) {
                                    Statics.field2186 = arg0[var9.field178];
                                } else {
                                    Statics.field2186 = var9;
                                }
                            }
                            if (var9.field81 == 8 && class108.field1801 >= var12 && class108.field1802 >= var13 && class108.field1801 < var14 && class108.field1802 < var15) {
                                Statics.field2179 = var9;
                            }
                            if (var9.field95 > var9.field89) {
                                method1090(var9, var9.field88 + var10, var11, var9.field89, var9.field95, class108.field1801, class108.field1802);
                            }
                        }
                    } else if ((field1647 == 0 || field1647 == 3) && class108.field1807 == 1) {
                        int var24 = class108.field1808 - 25 - var10;
                        int var25 = class108.field1809 - 5 - var11;
                        if (var24 >= 0 && var25 >= 0 && var24 < 146 && var25 < 151) {
                            var24 -= 73;
                            var25 -= 75;
                            int var26 = field1617 + field1604 & 0x7FF;
                            int var27 = class153.field2293[var26];
                            int var28 = class153.field2299[var26];
                            int var29 = (field1561 + 256) * var27 >> 8;
                            int var30 = (field1561 + 256) * var28 >> 8;
                            int var31 = var24 * var30 + var25 * var29 >> 11;
                            int var32 = var25 * var30 - var24 * var29 >> 11;
                            int var33 = Statics.field1320.field2707 + var31 >> 7;
                            int var34 = Statics.field1320.field2664 - var32 >> 7;
                            boolean var35 = method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var33, var34, true, 0, 0, 0, 0, 0, 1);
                            if (var35) {
                                field1570.method666(var24);
                                field1570.method666(var25);
                                field1570.method667(field1617);
                                field1570.method666(57);
                                field1570.method666(field1604);
                                field1570.method666(field1561);
                                field1570.method666(89);
                                field1570.method667(Statics.field1320.field2707);
                                field1570.method667(Statics.field1320.field2664);
                                field1570.method666(field1548);
                                field1570.method666(63);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("a.ae(I)V")
    public static final void method1107() {
        for (class65 var0 = (class65) field1665.method212(); var0 != null; var0 = (class65) field1665.method201()) {
            if (var0.field724 == -1) {
                var0.field711 = 0;
                method1329(var0);
            } else {
                var0.method234();
            }
        }
    }

    @ObfuscatedName("a.dr(Lfi;I)Z")
    public static boolean method1108(class12 arg0) {
        if (field1762) {
            if (method2929(arg0) != 0) {
                return false;
            }
            if (arg0.field81 == 0) {
                return false;
            }
        }
        return arg0.field179;
    }

    @ObfuscatedName("o.bc(ILjava/lang/String;S)V")
    public static void method1128(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field1651; var3++) {
            class74 var4 = field1650[field1731[var3]];
            if (var4 != null && var4.field855 != null && var4.field855.equalsIgnoreCase(arg1)) {
                method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var4.field2676[0], var4.field2716[0], false, 0, 0, 1, 1, 0, 2);
                if (arg0 == 1) {
                    field1570.method653(43);
                    field1570.method709(field1731[var3]);
                } else if (arg0 == 4) {
                    field1570.method653(30);
                    field1570.method667(field1731[var3]);
                } else if (arg0 == 6) {
                    field1570.method653(51);
                    field1570.method709(field1731[var3]);
                } else if (arg0 == 7) {
                    field1570.method653(123);
                    field1570.method709(field1731[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            method2192(0, "", class85.field1120 + arg1);
        }
    }

    @ObfuscatedName("o.cv(IB)Ljava/lang/String;")
    public static final String method1130(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class76.field874 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class76.method1092(65408) + var1.substring(0, var1.length() - 8) + class85.field1132 + " " + class76.field877 + var1 + class76.field878 + class76.field881;
        } else if (var1.length() > 6) {
            return " " + class76.method1092(16777215) + var1.substring(0, var1.length() - 4) + class85.field1144 + " " + class76.field877 + var1 + class76.field878 + class76.field881;
        } else {
            return " " + class76.method1092(16776960) + var1 + class76.field881;
        }
    }

    @ObfuscatedName("l.cg(IB)V")
    public static final void method1139(int arg0) {
        if (class12.method536(arg0)) {
            Statics.method2577(Statics.field173[arg0], -1);
        }
    }

    @ObfuscatedName("l.cn(III)Ljava/lang/String;")
    public static final String method1141(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class76.method1092(16711680);
        } else if (var2 < -6) {
            return class76.method1092(16723968);
        } else if (var2 < -3) {
            return class76.method1092(16740352);
        } else if (var2 < 0) {
            return class76.method1092(16756736);
        } else if (var2 > 9) {
            return class76.method1092(65280);
        } else if (var2 > 6) {
            return class76.method1092(4259584);
        } else if (var2 > 3) {
            return class76.method1092(8453888);
        } else if (var2 > 0) {
            return class76.method1092(12648192);
        } else {
            return class76.method1092(16776960);
        }
    }

    @ObfuscatedName("l.y(B)V")
    public static final void method1142() {
        if (Statics.field2461 != null) {
            Statics.field2461.method3358();
        }
        if (Statics.field2318 != null) {
            Statics.field2318.method3358();
        }
    }

    @ObfuscatedName("m.ck(Ljava/lang/String;Lfi;B)Ljava/lang/String;")
    public static String method1145(String arg0, class12 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method1209(method1214(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field450 != null) {
                    var5 = class91.method1335(Statics.field450.field2266);
                    if (Statics.field450.field2274 != null) {
                        var5 = (String) Statics.field450.field2274;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("m.cd(Lfi;S)Z")
    public static final boolean method1146(class12 arg0) {
        if (arg0.field181 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field181.length; var1++) {
            int var2 = method1214(arg0, var1);
            int var3 = arg0.field164[var1];
            if (arg0.field181[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field181[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field181[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("m.dn(Ljava/lang/String;B)Z")
    public static boolean method1147(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class53.method1409(arg0, Statics.field502);
        for (int var2 = 0; var2 < field1786; var2++) {
            class104 var3 = field1787[var2];
            if (var1.equalsIgnoreCase(class53.method1409(var3.field1450, Statics.field502))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class53.method1409(var3.field1439, Statics.field502))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("m.cf(IB)V")
    public static final void method1148(int arg0) {
        method3111();
        for (class69 var1 = (class69) class69.field755.method212(); var1 != null; var1 = (class69) class69.field755.method201()) {
            if (var1.field767 != null) {
                var1.method1132();
            }
        }
        int var2 = class175.method1106(arg0).field2596;
        if (var2 == 0) {
            return;
        }
        int var3 = class71.field800[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class153.method2524(0.9D);
                ((class135) Statics.field2282).method2343(0.9D);
            }
            if (var3 == 2) {
                class153.method2524(0.8D);
                ((class135) Statics.field2282).method2343(0.8D);
            }
            if (var3 == 3) {
                class153.method2524(0.7D);
                ((class135) Statics.field2282).method2343(0.7D);
            }
            if (var3 == 4) {
                class153.method2524(0.6D);
                ((class135) Statics.field2282).method2343(0.6D);
            }
            class176.method2333();
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
            if (field1765 != var4) {
                if (field1765 == 0 && field1766 != -1) {
                    class97.method2017(Statics.field1383, field1766, 0, var4, false);
                    field1767 = false;
                } else if (var4 == 0) {
                    Statics.field47.method1004();
                    class97.field1365 = 1;
                    Statics.field938 = null;
                    field1767 = false;
                } else {
                    class97.method1367(var4);
                }
                field1765 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field1779 = 127;
            }
            if (var3 == 1) {
                field1779 = 96;
            }
            if (var3 == 2) {
                field1779 = 64;
            }
            if (var3 == 3) {
                field1779 = 32;
            }
            if (var3 == 4) {
                field1779 = 0;
            }
        }
        if (var2 == 5) {
            field1671 = var3;
        }
        if (var2 == 6) {
            field1692 = var3;
        }
        if (var2 == 9) {
            field1583 = var3;
        }
        if (var2 != 10) {
            return;
        }
        if (var3 == 0) {
            field1769 = 127;
        }
        if (var3 == 1) {
            field1769 = 96;
        }
        if (var3 == 2) {
            field1769 = 64;
        }
        if (var3 == 3) {
            field1769 = 32;
        }
        if (var3 == 4) {
            field1769 = 0;
        }
    }

    @ObfuscatedName("fd.bo(B)V")
    public static final void method1154() {
        field1572.method655();
        int var0 = field1572.method656(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field1572.method656(2);
        if (var1 == 0) {
            field1654[++field1653 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field1572.method656(3);
            Statics.field1320.method3113(var2, false);
            int var3 = field1572.method656(1);
            if (var3 == 1) {
                field1654[++field1653 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field1572.method656(3);
            Statics.field1320.method3113(var4, true);
            int var5 = field1572.method656(3);
            Statics.field1320.method3113(var5, true);
            int var6 = field1572.method656(1);
            if (var6 == 1) {
                field1654[++field1653 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field1572.method656(1);
            if (var7 == 1) {
                field1654[++field1653 - 1] = 2047;
            }
            int var8 = field1572.method656(7);
            Statics.field2252 = field1572.method656(2);
            int var9 = field1572.method656(7);
            int var10 = field1572.method656(1);
            Statics.field1320.method3112(var8, var9, var10 == 1);
        }
    }

    @ObfuscatedName("j.dy(Lfi;I)Lfi;")
    public static class12 method1162(class12 arg0) {
        int var1 = method2929(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class12.method2369(arg0.field90);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("j.ap(IIIIIII)V")
    public static final void method1165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class153.field2293[var6];
            int var12 = class153.field2299[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class153.field2293[var7];
            int var15 = class153.field2299[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field2127 = arg0 - var8;
        Statics.field653 = arg1 - var9;
        Statics.field799 = arg2 - var10;
        Statics.field954 = arg3;
        Statics.field2849 = arg4;
    }

    @ObfuscatedName("fe.am(ZI)V")
    public static final void method1167(boolean arg0) {
        field1589 = arg0;
        if (!field1589) {
            int var1 = field1572.method860();
            int var2 = field1572.method860();
            int var3 = (field1573 - field1572.field540) / 16;
            Statics.field623 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field623[var4][var5] = field1572.method685();
                }
            }
            int var6 = field1572.method713();
            int var7 = field1572.method703();
            int var8 = field1572.method712();
            Statics.field751 = new int[var3];
            Statics.field2736 = new int[var3];
            Statics.field21 = new int[var3];
            Statics.field2112 = new byte[var3][];
            Statics.field866 = new byte[var3][];
            boolean var9 = false;
            if ((var8 / 8 == 48 || var8 / 8 == 49) && var1 / 8 == 48) {
                var9 = true;
            }
            if (var8 / 8 == 48 && var1 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var8 - 6) / 8; var11 <= (var8 + 6) / 8; var11++) {
                for (int var12 = (var1 - 6) / 8; var12 <= (var1 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field751[var10] = var13;
                        Statics.field2736[var10] = Statics.field1708.method1283("m" + var11 + "_" + var12);
                        Statics.field21[var10] = Statics.field1708.method1283("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            Statics.method1202(var8, var1, var7, var6, var2);
            return;
        }
        int var14 = field1572.method713();
        int var15 = field1572.method712();
        int var16 = field1572.method712();
        field1572.method655();
        for (int var17 = 0; var17 < 4; var17++) {
            for (int var18 = 0; var18 < 13; var18++) {
                for (int var19 = 0; var19 < 13; var19++) {
                    int var20 = field1572.method656(1);
                    if (var20 == 1) {
                        field1590[var17][var18][var19] = field1572.method656(26);
                    } else {
                        field1590[var17][var18][var19] = -1;
                    }
                }
            }
        }
        field1572.method649();
        int var21 = (field1573 - field1572.field540) / 16;
        Statics.field623 = new int[var21][4];
        for (int var22 = 0; var22 < var21; var22++) {
            for (int var23 = 0; var23 < 4; var23++) {
                Statics.field623[var22][var23] = field1572.method722();
            }
        }
        int var24 = field1572.method703();
        int var25 = field1572.method720();
        Statics.field751 = new int[var21];
        Statics.field2736 = new int[var21];
        Statics.field21 = new int[var21];
        Statics.field2112 = new byte[var21][];
        Statics.field866 = new byte[var21][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field1590[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field751[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field751[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field2736[var26] = Statics.field1708.method1283("m" + var35 + "_" + var36);
                            Statics.field21[var26] = Statics.field1708.method1283("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        Statics.method1202(var25, var14, var24, var15, var16);
    }

    @ObfuscatedName("k.ar(ZI)V")
    public static final void method1169(boolean arg0) {
        if (Statics.field1320.field2707 >> 7 == field1628 && Statics.field1320.field2664 >> 7 == field1763) {
            field1628 = 0;
        }
        int var1 = field1651;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class74 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field1320;
                var4 = 33538048;
            } else {
                var3 = field1650[field1731[var2]];
                var4 = field1731[var2] << 14;
            }
            if (var3 != null && var3.method1095()) {
                var3.field872 = false;
                if ((field1537 && field1651 > 50 || field1651 > 200) && !arg0 && var3.field2689 == var3.field2668) {
                    var3.field872 = true;
                }
                int var5 = var3.field2707 >> 7;
                int var6 = var3.field2664 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field859 == null || field1541 < var3.field854 || field1541 >= var3.field862) {
                        if ((var3.field2707 & 0x7F) == 64 && (var3.field2664 & 0x7F) == 64) {
                            if (field1634 == field1633[var5][var6]) {
                                continue;
                            }
                            field1633[var5][var6] = field1634;
                        }
                        var3.field853 = method1447(var3.field2707, var3.field2664, Statics.field2252);
                        Statics.field260.method1510(Statics.field2252, var3.field2707, var3.field2664, var3.field853, 60, var3, var3.field2706, var4, var3.field2682);
                    } else {
                        var3.field872 = false;
                        var3.field853 = method1447(var3.field2707, var3.field2664, Statics.field2252);
                        Statics.field260.method1511(Statics.field2252, var3.field2707, var3.field2664, var3.field853, 60, var3, var3.field2706, var4, var3.field871, var3.field861, var3.field860, var3.field856);
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.dg(I)V")
    public static final void method1170() {
        field1570.method653(120);
        field1570.method666(0);
    }

    @ObfuscatedName("k.ah(B)I")
    public static final int method1171() {
        if (Statics.field1898.field581) {
            return Statics.field2252;
        }
        int var0 = 3;
        if (Statics.field954 < 310) {
            int var1 = Statics.field2127 >> 7;
            int var2 = Statics.field799 >> 7;
            int var3 = Statics.field1320.field2707 >> 7;
            int var4 = Statics.field1320.field2664 >> 7;
            if ((class88.field1237[Statics.field2252][var1][var2] & 0x4) != 0) {
                var0 = Statics.field2252;
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
                    if ((class88.field1237[Statics.field2252][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2252;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class88.field1237[Statics.field2252][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2252;
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
                    if ((class88.field1237[Statics.field2252][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2252;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class88.field1237[Statics.field2252][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2252;
                        }
                    }
                }
            }
        }
        if ((class88.field1237[Statics.field2252][Statics.field1320.field2707 >> 7][Statics.field1320.field2664 >> 7] & 0x4) != 0) {
            var0 = Statics.field2252;
        }
        return var0;
    }

    @ObfuscatedName("k.ag(IIIIZIIIIIII)Z")
    public static final boolean method1173(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field1593[var11][var12] = 0;
                field1618[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field1593[arg0][arg1] = 99;
        field1618[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field1595[var15] = arg0;
        int var36 = var15 + 1;
        field1774[var15] = arg1;
        boolean var17 = false;
        int var18 = field1595.length;
        int[][] var19 = field1588[Statics.field2252].field42;
        while (var36 != var16) {
            var13 = field1595[var16];
            var14 = field1774[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field1588[Statics.field2252].method65(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field1588[Statics.field2252].method90(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field1588[Statics.field2252].method67(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field1618[var13][var14] + 1;
            if (var13 > 0 && field1593[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field1595[var36] = var13 - 1;
                field1774[var36] = var14;
                var36 = (var36 + 1) % var18;
                field1593[var13 - 1][var14] = 2;
                field1618[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field1593[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field1595[var36] = var13 + 1;
                field1774[var36] = var14;
                var36 = (var36 + 1) % var18;
                field1593[var13 + 1][var14] = 8;
                field1618[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field1593[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field1595[var36] = var13;
                field1774[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field1593[var13][var14 - 1] = 1;
                field1618[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field1593[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field1595[var36] = var13;
                field1774[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field1593[var13][var14 + 1] = 4;
                field1618[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field1593[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field1595[var36] = var13 - 1;
                field1774[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field1593[var13 - 1][var14 - 1] = 3;
                field1618[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field1593[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field1595[var36] = var13 + 1;
                field1774[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field1593[var13 + 1][var14 - 1] = 9;
                field1618[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field1593[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field1595[var36] = var13 - 1;
                field1774[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field1593[var13 - 1][var14 + 1] = 6;
                field1618[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field1593[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field1595[var36] = var13 + 1;
                field1774[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field1593[var13 + 1][var14 + 1] = 12;
                field1618[var13 + 1][var14 + 1] = var20;
            }
        }
        field1548 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field1618[var24][var25] < 100) {
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
                        if (var28 < var21 || var21 == var28 && field1618[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field1618[var24][var25];
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
            field1548 = 1;
        }
        byte var29 = 0;
        field1595[var29] = var13;
        int var37 = var29 + 1;
        field1774[var29] = var14;
        int var30;
        int var31 = var30 = field1593[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field1595[var37] = var13;
                field1774[var37++] = var14;
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
            var31 = field1593[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field1595[var37];
            int var34 = field1774[var37];
            if (arg10 == 0) {
                field1570.method653(0);
                field1570.method666(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field1570.method653(170);
                field1570.method666(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field1570.method653(110);
                field1570.method666(var32 + var32 + 3);
            }
            field1570.method709(Statics.field2043 + var33);
            field1570.method709(Statics.field403 + var34);
            field1570.method702(class113.field1876[82] ? 1 : 0);
            field1628 = field1595[0];
            field1763 = field1774[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field1570.method666(field1595[var37] - var33);
                field1570.method830(field1774[var37] - var34);
            }
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("i.bf(IIILjava/lang/String;I)V")
    public static void method1193(int arg0, int arg1, int arg2, String arg3) {
        class12 var4 = class12.method2328(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field166 != null) {
            class61 var5 = new class61();
            var5.field662 = var4;
            var5.field661 = arg0;
            var5.field669 = arg3;
            var5.field664 = var4.field166;
            class82.method1110(var5);
        }
        boolean var6 = true;
        if (var4.field126 > 0) {
            var6 = Statics.method1081(var4);
        }
        if (!var6) {
            return;
        }
        int var7 = method2929(var4);
        int var8 = arg0 - 1;
        boolean var9 = (var7 >> var8 + 1 & 0x1) != 0;
        if (!var9) {
            return;
        }
        if (arg0 == 1) {
            field1570.method653(24);
            field1570.method669(arg1);
            field1570.method667(arg2);
        }
        if (arg0 == 2) {
            field1570.method653(184);
            field1570.method669(arg1);
            field1570.method667(arg2);
        }
        if (arg0 == 3) {
            field1570.method653(136);
            field1570.method669(arg1);
            field1570.method667(arg2);
        }
        if (arg0 == 4) {
            field1570.method653(10);
            field1570.method669(arg1);
            field1570.method667(arg2);
        }
        if (arg0 == 5) {
            field1570.method653(203);
            field1570.method669(arg1);
            field1570.method667(arg2);
        }
        if (arg0 == 6) {
            field1570.method653(134);
            field1570.method669(arg1);
            field1570.method667(arg2);
        }
        if (arg0 == 7) {
            field1570.method653(84);
            field1570.method669(arg1);
            field1570.method667(arg2);
        }
        if (arg0 == 8) {
            field1570.method653(63);
            field1570.method669(arg1);
            field1570.method667(arg2);
        }
        if (arg0 == 9) {
            field1570.method653(132);
            field1570.method669(arg1);
            field1570.method667(arg2);
        }
        if (arg0 == 10) {
            field1570.method653(193);
            field1570.method669(arg1);
            field1570.method667(arg2);
        }
    }

    @ObfuscatedName("ef.bg(III)V")
    public static void method1208(int arg0, int arg1) {
        field1570.method653(115);
        field1570.method804(arg0);
        field1570.method710(arg1);
    }

    @ObfuscatedName("u.cm(II)Ljava/lang/String;")
    public static final String method1209(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("u.m(IB)V")
    public static void method1211(int arg0) {
        if (arg0 == -1 && !field1767) {
            Statics.field47.method1004();
            class97.field1365 = 1;
            Statics.field938 = null;
        } else if (arg0 != -1 && field1766 != arg0 && field1765 != 0 && !field1767) {
            class97.method2371(2, Statics.field1383, arg0, 0, field1765, false);
        }
        field1766 = arg0;
    }

    @ObfuscatedName("u.co(Lfi;II)I")
    public static final int method1214(class12 arg0, int arg1) {
        if (arg0.field100 == null || arg1 >= arg0.field100.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field100[arg1];
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
                    var7 = field1614[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field1669[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field1670[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class12 var11 = class12.method2369(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class176.method3351(var12).field2610 || field1675)) {
                        for (int var13 = 0; var13 < var11.field127.length; var13++) {
                            if (var12 + 1 == var11.field127[var13]) {
                                var7 += var11.field169[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class71.field800[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class45.field496[field1669[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class71.field800[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1320.field851;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class45.field495[var14]) {
                            var7 += field1669[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class12 var17 = class12.method2369(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class176.method3351(var18).field2610 || field1675)) {
                        for (int var19 = 0; var19 < var17.field127.length; var19++) {
                            if (var18 + 1 == var17.field127[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1535;
                }
                if (var6 == 12) {
                    var7 = field1696;
                }
                if (var6 == 13) {
                    int var20 = class71.field800[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class71.method2005(var22);
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
                    var7 = (Statics.field1320.field2707 >> 7) + Statics.field2043;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1320.field2664 >> 7) + Statics.field403;
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

    @ObfuscatedName("t.aa(II)V")
    public static final void method1215(int arg0) {
        int[] var1 = Statics.field2434.field2346;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class88.field1237[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field260.method1617(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class88.field1237[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field260.method1617(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2434.method2638();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class88.field1237[arg0][var10][var9] & 0x18) == 0) {
                    method2387(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class88.field1237[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2387(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1758 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field260.method1528(Statics.field2252, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class182.method3383(var14).field2782;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field1588[Statics.field2252].field42;
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
                        field1637[field1758] = Statics.field710[var15];
                        field1581[field1758] = var16;
                        field1642[field1758] = var17;
                        field1758++;
                    }
                }
            }
        }
        Statics.field617.method2374();
    }

    @ObfuscatedName("t.da(Ljava/lang/String;I)Z")
    public static boolean method1218(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class53.method1409(arg0, Statics.field502);
        for (int var2 = 0; var2 < field1782; var2++) {
            if (var1.equalsIgnoreCase(class53.method1409(field1784[var2].field1321, Statics.field502))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class53.method1409(Statics.field1320.field855, Statics.field502))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("s.ai(ZB)V")
    public static final void method1263(boolean arg0) {
        for (int var1 = 0; var1 < field1568; var1++) {
            class62 var2 = field1567[field1569[var1]];
            int var3 = (field1569[var1] << 14) + 536870912;
            if (var2 != null && var2.method1095() && var2.field678.field2565 == arg0 && var2.field678.method2958()) {
                int var4 = var2.field2707 >> 7;
                int var5 = var2.field2664 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field2667 == 1 && (var2.field2707 & 0x7F) == 64 && (var2.field2664 & 0x7F) == 64) {
                        if (field1634 == field1633[var4][var5]) {
                            continue;
                        }
                        field1633[var4][var5] = field1634;
                    }
                    if (!var2.field678.field2561) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field260.method1510(Statics.field2252, var2.field2707, var2.field2664, method1447(var2.field2707 + (var2.field2667 * 64 - 64), var2.field2664 + (var2.field2667 * 64 - 64), Statics.field2252), var2.field2667 * 64 - 64 + 60, var2, var2.field2706, var3, var2.field2682);
                }
            }
        }
    }

    @ObfuscatedName("s.aj(B)V")
    public static final void method1264() {
        if (field1574 == 69) {
            int var0 = field1572.method712();
            int var1 = field1572.method726();
            int var2 = (var1 >> 4 & 0x7) + Statics.field618;
            int var3 = (var1 & 0x7) + Statics.field1330;
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class15 var4 = field1586[Statics.field2252][var2][var3];
                if (var4 != null) {
                    for (class78 var5 = (class78) var4.method212(); var5 != null; var5 = (class78) var4.method201()) {
                        if ((var0 & 0x7FFF) == var5.field902) {
                            var5.method234();
                            break;
                        }
                    }
                    if (var4.method212() == null) {
                        field1586[Statics.field2252][var2][var3] = null;
                    }
                    method547(var2, var3);
                }
            }
        } else if (field1574 == 179) {
            int var6 = field1572.method713();
            int var7 = field1572.method720();
            int var8 = field1572.method720();
            int var9 = field1572.method703();
            int var10 = (var9 >> 4 & 0x7) + Statics.field618;
            int var11 = (var9 & 0x7) + Statics.field1330;
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && field1656 != var8) {
                class78 var12 = new class78();
                var12.field902 = var6;
                var12.field903 = var7;
                if (field1586[Statics.field2252][var10][var11] == null) {
                    field1586[Statics.field2252][var10][var11] = new class15();
                }
                field1586[Statics.field2252][var10][var11].method219(var12);
                method547(var10, var11);
            }
        } else if (field1574 == 8) {
            int var13 = field1572.method703();
            int var14 = var13 >> 2;
            int var15 = var13 & 0x3;
            int var16 = field1591[var14];
            int var17 = field1572.method720();
            int var18 = field1572.method762();
            int var19 = (var18 >> 4 & 0x7) + Statics.field618;
            int var20 = (var18 & 0x7) + Statics.field1330;
            if (var19 >= 0 && var20 >= 0 && var19 < 103 && var20 < 103) {
                if (var16 == 0) {
                    class144 var21 = Statics.field260.method1592(Statics.field2252, var19, var20);
                    if (var21 != null) {
                        int var22 = var21.field2194 >> 14 & 0x7FFF;
                        if (var14 == 2) {
                            var21.field2192 = new class60(var22, 2, var15 + 4, Statics.field2252, var19, var20, var17, false, var21.field2192);
                            var21.field2193 = new class60(var22, 2, var15 + 1 & 0x3, Statics.field2252, var19, var20, var17, false, var21.field2193);
                        } else {
                            var21.field2192 = new class60(var22, var14, var15, Statics.field2252, var19, var20, var17, false, var21.field2192);
                        }
                    }
                }
                if (var16 == 1) {
                    class30 var23 = Statics.field260.method1522(Statics.field2252, var19, var20);
                    if (var23 != null) {
                        int var24 = var23.field387 >> 14 & 0x7FFF;
                        if (var14 == 4 || var14 == 5) {
                            var23.field385 = new class60(var24, 4, var15, Statics.field2252, var19, var20, var17, false, var23.field385);
                        } else if (var14 == 6) {
                            var23.field385 = new class60(var24, 4, var15 + 4, Statics.field2252, var19, var20, var17, false, var23.field385);
                        } else if (var14 == 7) {
                            var23.field385 = new class60(var24, 4, (var15 + 2 & 0x3) + 4, Statics.field2252, var19, var20, var17, false, var23.field385);
                        } else if (var14 == 8) {
                            var23.field385 = new class60(var24, 4, var15 + 4, Statics.field2252, var19, var20, var17, false, var23.field385);
                            var23.field388 = new class60(var24, 4, (var15 + 2 & 0x3) + 4, Statics.field2252, var19, var20, var17, false, var23.field388);
                        }
                    }
                }
                if (var16 == 2) {
                    class142 var25 = Statics.field260.method1523(Statics.field2252, var19, var20);
                    if (var14 == 11) {
                        var14 = 10;
                    }
                    if (var25 != null) {
                        var25.field2167 = new class60(var25.field2175 >> 14 & 0x7FFF, var14, var15, Statics.field2252, var19, var20, var17, false, var25.field2167);
                    }
                }
                if (var16 == 3) {
                    class40 var26 = Statics.field260.method1603(Statics.field2252, var19, var20);
                    if (var26 != null) {
                        var26.field474 = new class60(var26.field476 >> 14 & 0x7FFF, 22, var15, Statics.field2252, var19, var20, var17, false, var26.field474);
                    }
                }
            }
        } else if (field1574 == 112) {
            int var27 = field1572.method726();
            int var28 = (var27 >> 4 & 0x7) + Statics.field618;
            int var29 = (var27 & 0x7) + Statics.field1330;
            int var30 = field1572.method720();
            int var31 = field1572.method720();
            int var32 = field1572.method720();
            if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                class15 var33 = field1586[Statics.field2252][var28][var29];
                if (var33 != null) {
                    for (class78 var34 = (class78) var33.method212(); var34 != null; var34 = (class78) var33.method201()) {
                        if ((var30 & 0x7FFF) == var34.field902 && var34.field903 == var31) {
                            var34.field903 = var32;
                            break;
                        }
                    }
                    method547(var28, var29);
                }
            }
        } else if (field1574 == 70) {
            int var35 = field1572.method726();
            int var36 = (var35 >> 4 & 0x7) + Statics.field618;
            int var37 = (var35 & 0x7) + Statics.field1330;
            int var38 = field1572.method720();
            int var39 = field1572.method726();
            int var40 = field1572.method720();
            if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                int var41 = var36 * 128 + 64;
                int var42 = var37 * 128 + 64;
                class84 var43 = new class84(var38, Statics.field2252, var41, var42, method1447(var41, var42, Statics.field2252) - var39, var40, field1541);
                field1667.method219(var43);
            }
        } else {
            if (field1574 == 189) {
                int var44 = field1572.method712();
                byte var45 = field1572.method779();
                int var46 = field1572.method726();
                int var47 = (var46 >> 4 & 0x7) + Statics.field618;
                int var48 = (var46 & 0x7) + Statics.field1330;
                byte var49 = field1572.method707();
                int var50 = field1572.method712();
                int var51 = field1572.method720();
                int var52 = field1572.method726();
                int var53 = var52 >> 2;
                int var54 = var52 & 0x3;
                int var55 = field1591[var53];
                byte var56 = field1572.method707();
                int var57 = field1572.method712();
                byte var58 = field1572.method707();
                class74 var59;
                if (field1656 == var50) {
                    var59 = Statics.field1320;
                } else {
                    var59 = field1650[var50];
                }
                if (var59 != null) {
                    class182 var60 = class182.method3383(var51);
                    int var61;
                    int var62;
                    if (var54 == 1 || var54 == 3) {
                        var61 = var60.field2769;
                        var62 = var60.field2777;
                    } else {
                        var61 = var60.field2777;
                        var62 = var60.field2769;
                    }
                    int var63 = (var61 >> 1) + var47;
                    int var64 = (var61 + 1 >> 1) + var47;
                    int var65 = (var62 >> 1) + var48;
                    int var66 = (var62 + 1 >> 1) + var48;
                    int[][] var67 = class88.field1247[Statics.field2252];
                    int var68 = var67[var63][var65] + var67[var64][var65] + var67[var63][var66] + var67[var64][var66] >> 2;
                    int var69 = (var47 << 7) + (var61 << 6);
                    int var70 = (var48 << 7) + (var62 << 6);
                    class27 var71 = var60.method3294(var53, var54, var67, var69, var68, var70);
                    if (var71 != null) {
                        method2267(Statics.field2252, var47, var48, var55, -1, 0, 0, var44 + 1, var57 + 1);
                        var59.field854 = field1541 + var44;
                        var59.field862 = field1541 + var57;
                        var59.field859 = var71;
                        var59.field857 = var47 * 128 + var61 * 64;
                        var59.field858 = var48 * 128 + var62 * 64;
                        var59.field870 = var68;
                        if (var49 > var58) {
                            byte var72 = var49;
                            var49 = var58;
                            var58 = var72;
                        }
                        if (var45 > var56) {
                            byte var73 = var45;
                            var45 = var56;
                            var56 = var73;
                        }
                        var59.field871 = var47 + var49;
                        var59.field860 = var47 + var58;
                        var59.field861 = var45 + var48;
                        var59.field856 = var48 + var56;
                    }
                }
            }
            if (field1574 == 10) {
                int var74 = field1572.method726();
                int var75 = (var74 >> 4 & 0x7) + Statics.field618;
                int var76 = (var74 & 0x7) + Statics.field1330;
                int var77 = field1572.method720();
                int var78 = field1572.method726();
                int var79 = var78 >> 4 & 0xF;
                int var80 = var78 & 0x7;
                int var81 = field1572.method726();
                if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104) {
                    int var82 = var79 + 1;
                    if (Statics.field1320.field2676[0] >= var75 - var82 && Statics.field1320.field2676[0] <= var75 + var82 && Statics.field1320.field2716[0] >= var76 - var82 && Statics.field1320.field2716[0] <= var76 + var82 && field1769 != 0 && var80 > 0 && field1770 < 50) {
                        field1771[field1770] = var77;
                        field1772[field1770] = var80;
                        field1773[field1770] = var81;
                        field1775[field1770] = null;
                        field1704[field1770] = (var75 << 16) + (var76 << 8) + var79;
                        field1770++;
                    }
                }
            }
            if (field1574 == 237) {
                int var83 = field1572.method705();
                int var84 = (var83 >> 4 & 0x7) + Statics.field618;
                int var85 = (var83 & 0x7) + Statics.field1330;
                int var86 = field1572.method726();
                int var87 = var86 >> 2;
                int var88 = var86 & 0x3;
                int var89 = field1591[var87];
                if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
                    method2267(Statics.field2252, var84, var85, var89, -1, var87, var88, 0, -1);
                }
            } else if (field1574 == 73) {
                int var90 = field1572.method860();
                int var91 = field1572.method860();
                int var92 = field1572.method762();
                int var93 = (var92 >> 4 & 0x7) + Statics.field618;
                int var94 = (var92 & 0x7) + Statics.field1330;
                if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                    class78 var95 = new class78();
                    var95.field902 = var90;
                    var95.field903 = var91;
                    if (field1586[Statics.field2252][var93][var94] == null) {
                        field1586[Statics.field2252][var93][var94] = new class15();
                    }
                    field1586[Statics.field2252][var93][var94].method219(var95);
                    method547(var93, var94);
                }
            } else if (field1574 == 17) {
                int var96 = field1572.method705();
                int var97 = var96 >> 2;
                int var98 = var96 & 0x3;
                int var99 = field1591[var97];
                int var100 = field1572.method703();
                int var101 = (var100 >> 4 & 0x7) + Statics.field618;
                int var102 = (var100 & 0x7) + Statics.field1330;
                int var103 = field1572.method720();
                if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
                    method2267(Statics.field2252, var101, var102, var99, var103, var97, var98, 0, -1);
                }
            } else if (field1574 == 245) {
                int var104 = field1572.method726();
                int var105 = (var104 >> 4 & 0x7) + Statics.field618;
                int var106 = (var104 & 0x7) + Statics.field1330;
                int var107 = var105 + field1572.method681();
                int var108 = var106 + field1572.method681();
                int var109 = field1572.method683();
                int var110 = field1572.method720();
                int var111 = field1572.method726() * 4;
                int var112 = field1572.method726() * 4;
                int var113 = field1572.method720();
                int var114 = field1572.method720();
                int var115 = field1572.method726();
                int var116 = field1572.method726();
                if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104 && var110 != 65535) {
                    int var117 = var105 * 128 + 64;
                    int var118 = var106 * 128 + 64;
                    int var119 = var107 * 128 + 64;
                    int var120 = var108 * 128 + 64;
                    class72 var121 = new class72(var110, Statics.field2252, var117, var118, method1447(var117, var118, Statics.field2252) - var111, field1541 + var113, field1541 + var114, var115, var116, var109, var112);
                    var121.method1158(var119, var120, method1447(var119, var120, Statics.field2252) - var112, field1541 + var113);
                    field1577.method219(var121);
                }
            }
        }
    }

    @ObfuscatedName("ek.bj(La;I)V")
    public static final void method1329(class65 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field712 == 0) {
            var1 = Statics.field260.method1611(arg0.field725, arg0.field713, arg0.field714);
        }
        if (arg0.field712 == 1) {
            var1 = Statics.field260.method1519(arg0.field725, arg0.field713, arg0.field714);
        }
        if (arg0.field712 == 2) {
            var1 = Statics.field260.method1554(arg0.field725, arg0.field713, arg0.field714);
        }
        if (arg0.field712 == 3) {
            var1 = Statics.field260.method1528(arg0.field725, arg0.field713, arg0.field714);
        }
        if (var1 != 0) {
            int var5 = Statics.field260.method1505(arg0.field725, arg0.field713, arg0.field714, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field718 = var2;
        arg0.field717 = var3;
        arg0.field716 = var4;
    }

    @ObfuscatedName("r.ab(IIIII)V")
    public static final void method1330(int arg0, int arg1, int arg2, int arg3) {
        class146.method2396(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class153.method2519();
        field1634++;
        method1169(true);
        method1263(true);
        method1169(false);
        method1263(false);
        for (class72 var4 = (class72) field1577.method212(); var4 != null; var4 = (class72) field1577.method201()) {
            if (Statics.field2252 != var4.field802 || field1541 > var4.field808) {
                var4.method234();
            } else if (field1541 >= var4.field807) {
                if (var4.field811 > 0) {
                    class62 var5 = field1567[var4.field811 - 1];
                    if (var5 != null && var5.field2707 >= 0 && var5.field2707 < 13312 && var5.field2664 >= 0 && var5.field2664 < 13312) {
                        var4.method1158(var5.field2707, var5.field2664, method1447(var5.field2707, var5.field2664, var4.field802) - var4.field806, field1541);
                    }
                }
                if (var4.field811 < 0) {
                    int var6 = -var4.field811 - 1;
                    class74 var7;
                    if (field1656 == var6) {
                        var7 = Statics.field1320;
                    } else {
                        var7 = field1650[var6];
                    }
                    if (var7 != null && var7.field2707 >= 0 && var7.field2707 < 13312 && var7.field2664 >= 0 && var7.field2664 < 13312) {
                        var4.method1158(var7.field2707, var7.field2664, method1447(var7.field2707, var7.field2664, var4.field802) - var4.field806, field1541);
                    }
                }
                var4.method1164(field1609);
                Statics.field260.method1510(Statics.field2252, (int) var4.field813, (int) var4.field829, (int) var4.field820, 60, var4, var4.field821, -1, false);
            }
        }
        for (class84 var8 = (class84) field1667.method212(); var8 != null; var8 = (class84) field1667.method201()) {
            if (Statics.field2252 != var8.field967 || var8.field974) {
                var8.method234();
            } else if (field1541 >= var8.field966) {
                var8.method1210(field1609);
                if (var8.field974) {
                    var8.method234();
                } else {
                    Statics.field260.method1510(var8.field967, var8.field965, var8.field969, var8.field970, 60, var8, 0, -1, false);
                }
            }
        }
        if (!field1776) {
            int var9 = field1616;
            if (field1622 / 256 > var9) {
                var9 = field1622 / 256;
            }
            if (field1777[4] && field1565[4] + 128 > var9) {
                var9 = field1565[4] + 128;
            }
            int var10 = field1726 + field1617 & 0x7FF;
            method1165(Statics.field2329, method1447(Statics.field1320.field2707, Statics.field1320.field2664, Statics.field2252) - 50, Statics.field2484, var9, var10, var9 * 3 + 600);
        }
        int var11;
        if (field1776) {
            int var12;
            if (Statics.field1898.field581) {
                var12 = Statics.field2252;
            } else {
                int var13 = method1447(Statics.field2127, Statics.field799, Statics.field2252);
                if (var13 - Statics.field653 >= 800 || (class88.field1237[Statics.field2252][Statics.field2127 >> 7][Statics.field799 >> 7] & 0x4) == 0) {
                    var12 = 3;
                } else {
                    var12 = Statics.field2252;
                }
            }
            var11 = var12;
        } else {
            var11 = method1171();
        }
        int var14 = Statics.field2127;
        int var15 = Statics.field653;
        int var16 = Statics.field799;
        int var17 = Statics.field954;
        int var18 = Statics.field2849;
        for (int var19 = 0; var19 < 5; var19++) {
            if (field1777[var19]) {
                int var20 = (int) (Math.random() * (double) (field1778[var19] * 2 + 1) - (double) field1778[var19] + Math.sin((double) field1584[var19] / 100.0D * (double) field1659[var19]) * (double) field1565[var19]);
                if (var19 == 0) {
                    Statics.field2127 += var20;
                }
                if (var19 == 1) {
                    Statics.field653 += var20;
                }
                if (var19 == 2) {
                    Statics.field799 += var20;
                }
                if (var19 == 3) {
                    Statics.field2849 = Statics.field2849 + var20 & 0x7FF;
                }
                if (var19 == 4) {
                    Statics.field954 += var20;
                    if (Statics.field954 < 128) {
                        Statics.field954 = 128;
                    }
                    if (Statics.field954 > 383) {
                        Statics.field954 = 383;
                    }
                }
            }
        }
        int var21 = class108.field1801;
        int var22 = class108.field1802;
        if (var21 >= arg0 && var21 < arg0 + arg2 && var22 >= arg1 && var22 < arg1 + arg3) {
            class27.field328 = true;
            class27.field265 = 0;
            class27.field318 = class108.field1801 - arg0;
            class27.field322 = class108.field1802 - arg1;
        } else {
            class27.field328 = false;
            class27.field265 = 0;
        }
        method1142();
        class146.method2400(arg0, arg1, arg2, arg3, 0);
        method1142();
        Statics.field260.method1594(Statics.field2127, Statics.field653, Statics.field799, Statics.field954, Statics.field2849, var11);
        method1142();
        Statics.field260.method1512();
        field1623 = 0;
        for (int var23 = -1; var23 < field1651 + field1568; var23++) {
            class179 var24;
            if (var23 == -1) {
                var24 = Statics.field1320;
            } else if (var23 < field1651) {
                var24 = field1650[field1731[var23]];
            } else {
                var24 = field1567[field1569[var23 - field1651]];
            }
            if (var24 != null && var24.method1095()) {
                if (var24 instanceof class62) {
                    class171 var25 = ((class62) var24).field678;
                    if (var25.field2549 != null) {
                        var25 = var25.method2957();
                    }
                    if (var25 == null) {
                        continue;
                    }
                }
                if (var23 >= field1651) {
                    class171 var28 = ((class62) var24).field678;
                    if (var28.field2549 != null) {
                        var28 = var28.method2957();
                    }
                    if (var28.field2556 >= 0 && var28.field2556 < Statics.field526.length) {
                        method533(var24, var24.field2710 + 15);
                        if (field1635 > -1) {
                            Statics.field526[var28.field2556].method2591(field1635 + arg0 - 12, field1636 + arg1 - 30);
                        }
                    }
                    if (field1549 == 1 && field1698 == field1569[var23 - field1651] && field1541 % 20 < 10) {
                        method533(var24, var24.field2710 + 15);
                        if (field1635 > -1) {
                            Statics.field2086[0].method2591(field1635 + arg0 - 12, field1636 + arg1 - 28);
                        }
                    }
                } else {
                    int var26 = 30;
                    class74 var27 = (class74) var24;
                    if (var27.field864 != -1 || var27.field850 != -1) {
                        method533(var24, var24.field2710 + 15);
                        if (field1635 > -1) {
                            if (var27.field864 != -1) {
                                Statics.field978[var27.field864].method2591(field1635 + arg0 - 12, field1636 + arg1 - var26);
                                var26 += 25;
                            }
                            if (var27.field850 != -1) {
                                Statics.field526[var27.field850].method2591(field1635 + arg0 - 12, field1636 + arg1 - var26);
                                var26 += 25;
                            }
                        }
                    }
                    if (var23 >= 0 && field1549 == 10 && field1697 == field1731[var23]) {
                        method533(var24, var24.field2710 + 15);
                        if (field1635 > -1) {
                            Statics.field2086[1].method2591(field1635 + arg0 - 12, field1636 + arg1 - var26);
                        }
                    }
                }
                if (var24.field2684 != null && (var23 >= field1651 || field1699 == 0 || field1699 == 3 || field1699 == 1 && method1218(((class74) var24).field855))) {
                    method533(var24, var24.field2710);
                    if (field1635 > -1 && field1623 < field1624) {
                        field1756[field1623] = Statics.field1442.method281(var24.field2684) / 2;
                        field1790[field1623] = Statics.field1442.field244;
                        field1611[field1623] = field1635;
                        field1626[field1623] = field1636;
                        field1629[field1623] = var24.field2687;
                        field1686[field1623] = var24.field2679;
                        field1693[field1623] = var24.field2665;
                        field1632[field1623] = var24.field2684;
                        field1623++;
                    }
                }
                if (var24.field2677 > field1541) {
                    method533(var24, var24.field2710 + 15);
                    if (field1635 > -1) {
                        int var29 = var24.field2663 * 30 / var24.field2715;
                        if (var29 > 30) {
                            var29 = 30;
                        }
                        class146.method2400(field1635 + arg0 - 15, field1636 + arg1 - 3, var29, 5, 65280);
                        class146.method2400(field1635 + arg0 - 15 + var29, field1636 + arg1 - 3, 30 - var29, 5, 16711680);
                    }
                }
                for (int var30 = 0; var30 < 4; var30++) {
                    if (var24.field2696[var30] > field1541) {
                        method533(var24, var24.field2710 / 2);
                        if (field1635 > -1) {
                            if (var30 == 1) {
                                field1636 -= 20;
                            }
                            if (var30 == 2) {
                                field1635 -= 15;
                                field1636 -= 10;
                            }
                            if (var30 == 3) {
                                field1635 += 15;
                                field1636 -= 10;
                            }
                            Statics.field2504[var24.field2681[var30]].method2591(field1635 + arg0 - 12, field1636 + arg1 - 12);
                            Statics.field1390.method302(Integer.toString(var24.field2680[var30]), field1635 + arg0 - 1, field1636 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var31 = 0; var31 < field1623; var31++) {
            int var32 = field1611[var31];
            int var33 = field1626[var31];
            int var34 = field1756[var31];
            int var35 = field1790[var31];
            boolean var36 = true;
            while (var36) {
                var36 = false;
                for (int var37 = 0; var37 < var31; var37++) {
                    if (var33 + 2 > field1626[var37] - field1790[var37] && var33 - var35 < field1626[var37] + 2 && var32 - var34 < field1756[var37] + field1611[var37] && var32 + var34 > field1611[var37] - field1756[var37] && field1626[var37] - field1790[var37] < var33) {
                        var33 = field1626[var37] - field1790[var37];
                        var36 = true;
                    }
                }
            }
            field1635 = field1611[var31];
            field1636 = field1626[var31] = var33;
            String var38 = field1632[var31];
            if (field1692 == 0) {
                int var39 = 16776960;
                if (field1629[var31] < 6) {
                    var39 = field1746[field1629[var31]];
                }
                if (field1629[var31] == 6) {
                    var39 = field1634 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field1629[var31] == 7) {
                    var39 = field1634 % 20 < 10 ? 255 : 65535;
                }
                if (field1629[var31] == 8) {
                    var39 = field1634 % 20 < 10 ? 45056 : 8454016;
                }
                if (field1629[var31] == 9) {
                    int var40 = 150 - field1693[var31];
                    if (var40 < 50) {
                        var39 = var40 * 1280 + 16711680;
                    } else if (var40 < 100) {
                        var39 = 16776960 - (var40 - 50) * 327680;
                    } else if (var40 < 150) {
                        var39 = (var40 - 100) * 5 + 65280;
                    }
                }
                if (field1629[var31] == 10) {
                    int var41 = 150 - field1693[var31];
                    if (var41 < 50) {
                        var39 = var41 * 5 + 16711680;
                    } else if (var41 < 100) {
                        var39 = 16711935 - (var41 - 50) * 327680;
                    } else if (var41 < 150) {
                        var39 = (var41 - 100) * 327680 + 255 - (var41 - 100) * 5;
                    }
                }
                if (field1629[var31] == 11) {
                    int var42 = 150 - field1693[var31];
                    if (var42 < 50) {
                        var39 = 16777215 - var42 * 327685;
                    } else if (var42 < 100) {
                        var39 = (var42 - 50) * 327685 + 65280;
                    } else if (var42 < 150) {
                        var39 = 16777215 - (var42 - 100) * 327680;
                    }
                }
                if (field1686[var31] == 0) {
                    Statics.field1442.method302(var38, field1635 + arg0, field1636 + arg1, var39, 0);
                }
                if (field1686[var31] == 1) {
                    Statics.field1442.method290(var38, field1635 + arg0, field1636 + arg1, var39, 0, field1634);
                }
                if (field1686[var31] == 2) {
                    Statics.field1442.method291(var38, field1635 + arg0, field1636 + arg1, var39, 0, field1634);
                }
                if (field1686[var31] == 3) {
                    Statics.field1442.method278(var38, field1635 + arg0, field1636 + arg1, var39, 0, field1634, 150 - field1693[var31]);
                }
                if (field1686[var31] == 4) {
                    int var43 = (150 - field1693[var31]) * (Statics.field1442.method281(var38) + 100) / 150;
                    class146.method2395(field1635 + arg0 - 50, arg1, field1635 + arg0 + 50, arg1 + arg3);
                    Statics.field1442.method286(var38, field1635 + arg0 + 50 - var43, field1636 + arg1, var39, 0);
                    class146.method2396(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field1686[var31] == 5) {
                    int var44 = 150 - field1693[var31];
                    int var45 = 0;
                    if (var44 < 25) {
                        var45 = var44 - 25;
                    } else if (var44 > 125) {
                        var45 = var44 - 125;
                    }
                    class146.method2395(arg0, field1636 + arg1 - Statics.field1442.field244 - 1, arg0 + arg2, field1636 + arg1 + 5);
                    Statics.field1442.method302(var38, field1635 + arg0, field1636 + arg1 + var45, var39, 0);
                    class146.method2396(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1442.method302(var38, field1635 + arg0, field1636 + arg1, 16776960, 0);
            }
        }
        if (field1549 == 2) {
            method1082((field1552 - Statics.field2043 << 7) + field1555, (field1553 - Statics.field403 << 7) + field1723, field1554 * 2);
            if (field1635 > -1 && field1541 % 20 < 10) {
                Statics.field2086[0].method2591(field1635 + arg0 - 12, field1636 + arg1 - 28);
            }
        }
        ((class135) Statics.field2282).method2334(field1609);
        if (field1640 == 1) {
            Statics.field2474[field1639 / 100].method2591(field1571 - 8, field1638 - 8);
        }
        if (field1640 == 2) {
            Statics.field2474[field1639 / 100 + 4].method2591(field1571 - 8, field1638 - 8);
        }
        method1392();
        if (field1547) {
            int var46 = arg0 + 512 - 5;
            int var47 = arg1 + 20;
            Statics.field784.method287("Fps:" + field2011, var46, var47, 16776960, -1);
            int var81 = var47 + 15;
            Runtime var48 = Runtime.getRuntime();
            int var49 = (int) ((var48.totalMemory() - var48.freeMemory()) / 1024L);
            int var50 = 16776960;
            if (var49 > 32768 && field1537) {
                var50 = 16711680;
            }
            if (var49 > 65536 && !field1537) {
                var50 = 16711680;
            }
            Statics.field784.method287("Mem:" + var49 + "k", var46, var81, var50, -1);
            var47 = var81 + 15;
        }
        Statics.field2127 = var14;
        Statics.field653 = var15;
        Statics.field799 = var16;
        Statics.field954 = var17;
        Statics.field2849 = var18;
        if (field1700) {
            byte var51 = 0;
            int var52 = class79.field921 + class79.field918 + var51;
            if (var52 == 0) {
                field1700 = false;
            }
        }
        if (field1700) {
            class146.method2400(arg0, arg1, arg2, arg3, 0);
            method542(class85.field1013, false);
        }
        if (field1700 || field1601 || var21 < arg0 || var21 >= arg0 + arg2 || var22 < arg1 || var22 >= arg1 + arg3) {
            return;
        }
        if (field1684 == 0 && !field1530) {
            method1366(class85.field1020, "", 23, 0, var21 - arg0, var22 - arg1);
        }
        int var54 = -1;
        for (int var55 = 0; var55 < class27.field265; var55++) {
            int var56 = class27.field304[var55];
            int var57 = var56 & 0x7F;
            int var58 = var56 >> 7 & 0x7F;
            int var59 = var56 >> 29 & 0x3;
            int var60 = var56 >> 14 & 0x7FFF;
            if (var54 != var56) {
                var54 = var56;
                if (var59 == 2 && Statics.field260.method1505(Statics.field2252, var57, var58, var56) >= 0) {
                    class182 var61 = class182.method3383(var60);
                    if (var61.field2796 != null) {
                        var61 = var61.method3297();
                    }
                    if (var61 == null) {
                        continue;
                    }
                    if (field1684 == 1) {
                        method1366(class85.field1099, field1685 + " " + class76.field887 + " " + class76.method1092(65535) + var61.field2799, 1, var56, var57, var58);
                    } else if (!field1530) {
                        String[] var62 = var61.field2770;
                        if (field1610) {
                            var62 = method2275(var62);
                        }
                        if (var62 != null) {
                            for (int var63 = 4; var63 >= 0; var63--) {
                                if (var62[var63] != null) {
                                    short var64 = 0;
                                    if (var63 == 0) {
                                        var64 = 3;
                                    }
                                    if (var63 == 1) {
                                        var64 = 4;
                                    }
                                    if (var63 == 2) {
                                        var64 = 5;
                                    }
                                    if (var63 == 3) {
                                        var64 = 6;
                                    }
                                    if (var63 == 4) {
                                        var64 = 1001;
                                    }
                                    method1366(var62[var63], class76.method1092(65535) + var61.field2799, var64, var56, var57, var58);
                                }
                            }
                        }
                        method1366(class85.field1126, class76.method1092(65535) + var61.field2799, 1002, var61.field2761 << 14, var57, var58);
                    } else if ((Statics.field561 & 0x4) == 4) {
                        method1366(field1688, field1666 + " " + class76.field887 + " " + class76.method1092(65535) + var61.field2799, 2, var56, var57, var58);
                    }
                }
                if (var59 == 1) {
                    class62 var65 = field1567[var60];
                    if (var65.field678.field2563 == 1 && (var65.field2707 & 0x7F) == 64 && (var65.field2664 & 0x7F) == 64) {
                        for (int var66 = 0; var66 < field1568; var66++) {
                            class62 var67 = field1567[field1569[var66]];
                            if (var67 != null && var65 != var67 && var67.field678.field2563 == 1 && var65.field2707 == var67.field2707 && var65.field2664 == var67.field2664) {
                                method2327(var67.field678, field1569[var66], var57, var58);
                            }
                        }
                        for (int var68 = 0; var68 < field1651; var68++) {
                            class74 var69 = field1650[field1731[var68]];
                            if (var69 != null && var65.field2707 == var69.field2707 && var65.field2664 == var69.field2664) {
                                method541(var69, field1731[var68], var57, var58);
                            }
                        }
                    }
                    method2327(var65.field678, var60, var57, var58);
                }
                if (var59 == 0) {
                    class74 var70 = field1650[var60];
                    if ((var70.field2707 & 0x7F) == 64 && (var70.field2664 & 0x7F) == 64) {
                        for (int var71 = 0; var71 < field1568; var71++) {
                            class62 var72 = field1567[field1569[var71]];
                            if (var72 != null && var72.field678.field2563 == 1 && var70.field2707 == var72.field2707 && var70.field2664 == var72.field2664) {
                                method2327(var72.field678, field1569[var71], var57, var58);
                            }
                        }
                        for (int var73 = 0; var73 < field1651; var73++) {
                            class74 var74 = field1650[field1731[var73]];
                            if (var74 != null && var70 != var74 && var70.field2707 == var74.field2707 && var70.field2664 == var74.field2664) {
                                method541(var74, field1731[var73], var57, var58);
                            }
                        }
                    }
                    method541(var70, var60, var57, var58);
                }
                if (var59 == 3) {
                    class15 var75 = field1586[Statics.field2252][var57][var58];
                    if (var75 != null) {
                        for (class78 var76 = (class78) var75.method200(); var76 != null; var76 = (class78) var75.method202()) {
                            class176 var77 = class176.method3351(var76.field902);
                            if (field1684 == 1) {
                                method1366(class85.field1099, field1685 + " " + class76.field887 + " " + class76.method1092(16748608) + var77.field2614, 16, var76.field902, var57, var58);
                            } else if (!field1530) {
                                String[] var78 = var77.field2643;
                                if (field1610) {
                                    var78 = method2275(var78);
                                }
                                for (int var79 = 4; var79 >= 0; var79--) {
                                    if (var78 != null && var78[var79] != null) {
                                        byte var80 = 0;
                                        if (var79 == 0) {
                                            var80 = 18;
                                        }
                                        if (var79 == 1) {
                                            var80 = 19;
                                        }
                                        if (var79 == 2) {
                                            var80 = 20;
                                        }
                                        if (var79 == 3) {
                                            var80 = 21;
                                        }
                                        if (var79 == 4) {
                                            var80 = 22;
                                        }
                                        method1366(var78[var79], class76.method1092(16748608) + var77.field2614, var80, var76.field902, var57, var58);
                                    } else if (var79 == 2) {
                                        method1366(class85.field981, class76.method1092(16748608) + var77.field2614, 20, var76.field902, var57, var58);
                                    }
                                }
                                method1366(class85.field1126, class76.method1092(16748608) + var77.field2614, 1004, var76.field902, var57, var58);
                            } else if ((Statics.field561 & 0x1) == 1) {
                                method1366(field1688, field1666 + " " + class76.field887 + " " + class76.method1092(16748608) + var77.field2614, 17, var76.field902, var57, var58);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.di(IIIILce;B)V")
    public static final void method1331(int arg0, int arg1, int arg2, int arg3, class156 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method2578(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field1617 + field1604 & 0x7FF;
        int var7 = class153.field2293[var6];
        int var8 = class153.field2299[var6];
        int var9 = var7 * 256 / (field1561 + 256);
        int var10 = var8 * 256 / (field1561 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field2141.method2602(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("r.r(I)V")
    public static final void method1334() {
        if (Statics.field2080 != null) {
            Statics.field2080.method2290();
            Statics.field2080 = null;
        }
        method2029();
        Statics.field260.method1527();
        for (int var0 = 0; var0 < 4; var0++) {
            field1588[var0].method56();
        }
        System.gc();
        class97.field1365 = 1;
        Statics.field938 = null;
        Statics.field1366 = -1;
        Statics.field701 = -1;
        Statics.field1367 = 0;
        Statics.field2144 = false;
        Statics.field1368 = 2;
        field1766 = -1;
        field1767 = false;
        class69.method2386();
        method897(10);
    }

    @ObfuscatedName("q.e(IZZZB)Leb;")
    public static class34 method1363(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class114 var4 = null;
        if (class137.field2116 != null) {
            var4 = new class114(arg0, class137.field2116, Statics.field2143[arg0], 1000000);
        }
        return new class34(var4, Statics.field2481, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("q.ay(IIIB)Z")
    public static final boolean method1364(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field260.method1505(Statics.field2252, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class182 var7 = class182.method3383(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field2777;
                var9 = var7.field2769;
            } else {
                var8 = var7.field2769;
                var9 = var7.field2777;
            }
            int var10 = var7.field2792;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field1571 = class108.field1808;
        field1638 = class108.field1809;
        field1640 = 2;
        field1639 = 0;
        return true;
    }

    @ObfuscatedName("q.cy(IIIIIIIIB)V")
    public static final void method1365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class12.method536(arg0)) {
            Statics.field564 = null;
            Statics.method1333(Statics.field173[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field564 != null) {
                Statics.method1333(Statics.field564, -1412584499, arg1, arg2, arg3, arg4, Statics.field925, Statics.field2851, arg7);
                Statics.field564 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1733[var8] = true;
            }
        } else {
            field1733[arg7] = true;
        }
    }

    @ObfuscatedName("q.bs(Ljava/lang/String;Ljava/lang/String;IIIIS)V")
    public static final void method1366(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field1601 || field1627 >= 500) {
            return;
        }
        field1678[field1627] = arg0;
        field1556[field1627] = arg1;
        field1676[field1627] = arg2;
        field1761[field1627] = arg3;
        field1674[field1627] = arg4;
        field1718[field1627] = arg5;
        field1627++;
    }

    @ObfuscatedName("en.ad(B)V")
    public static final void method1392() {
        field1605 = 0;
        int var0 = (Statics.field1320.field2707 >> 7) + Statics.field2043;
        int var1 = (Statics.field1320.field2664 >> 7) + Statics.field403;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field1605 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field1605 = 1;
        }
        if (field1605 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field1605 = 0;
        }
    }

    @ObfuscatedName("z.ba(IIIII)V")
    public static final void method1411(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1566; var4++) {
            if (field1738[var4] + field1736[var4] > arg0 && field1736[var4] < arg0 + arg2 && field1747[var4] + field1739[var4] > arg1 && field1747[var4] < arg1 + arg3) {
                field1734[var4] = true;
            }
        }
    }

    @ObfuscatedName("y.dw(II)V")
    public static void method1434(int arg0) {
        for (class1 var1 = (class1) field1582.method16(); var1 != null; var1 = (class1) field1582.method17()) {
            if ((long) arg0 == (var1.field213 >> 48 & 0xFFFFL)) {
                var1.method234();
            }
        }
    }

    @ObfuscatedName("y.au(IIII)I")
    public static final int method1447(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class88.field1237[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class88.field1247[var5][var3][var4] + class88.field1247[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class88.field1247[var5][var3][var4 + 1] + class88.field1247[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("y.bv(I)V")
    public static void method1453() {
        for (int var0 = 0; var0 < field1627; var0++) {
            if (method1080(field1676[var0])) {
                if (var0 < field1627 - 1) {
                    for (int var1 = var0; var1 < field1627 - 1; var1++) {
                        field1678[var1] = field1678[var1 + 1];
                        field1556[var1] = field1556[var1 + 1];
                        field1676[var1] = field1676[var1 + 1];
                        field1761[var1] = field1761[var1 + 1];
                        field1674[var1] = field1674[var1 + 1];
                        field1718[var1] = field1718[var1 + 1];
                    }
                }
                field1627--;
            }
        }
    }

    @ObfuscatedName("eq.z(I)V")
    public static void method1463() {
        field1570.field540 = 0;
        field1572.field540 = 0;
        field1574 = -1;
        field1578 = -1;
        field1579 = -1;
        field1580 = -1;
        field1573 = 0;
        field1791 = 0;
        field1534 = 0;
        field1627 = 0;
        field1601 = false;
        field1647 = 0;
        field1628 = 0;
        for (int var0 = 0; var0 < field1650.length; var0++) {
            if (field1650[var0] != null) {
                field1650[var0].field2686 = -1;
            }
        }
        for (int var1 = 0; var1 < field1567.length; var1++) {
            if (field1567[var1] != null) {
                field1567[var1].field2686 = -1;
            }
        }
        class66.field736 = new class3(32);
        method897(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field1733[var2] = true;
        }
    }

    @ObfuscatedName("bx.dj(Ljava/lang/String;I)V")
    public static final void method2028(String arg0) {
        if (Statics.field2012 != null) {
            field1570.method653(149);
            field1570.method666(class50.method2053(arg0));
            field1570.method671(arg0);
        }
    }

    @ObfuscatedName("bx.n(I)V")
    public static final void method2029() {
        class164.method1368();
        class165.field2452.method5();
        class180.field2725.method5();
        class182.method2923();
        class171.field2543.method5();
        class171.field2534.method5();
        class176.method1374();
        class173.field2569.method5();
        class173.field2570.method5();
        class184.field2810.method5();
        class184.field2820.method5();
        class169.field2507.method5();
        class175.method1402();
        class13.field199.method5();
        class12.field74.method5();
        class12.field75.method5();
        class12.field111.method5();
        ((class135) Statics.field2282).method2330();
        class86.field1220.method5();
        Statics.field470.method1291();
        Statics.field936.method1291();
        Statics.field1275.method1291();
        Statics.field738.method1291();
        Statics.field1708.method1291();
        Statics.field1383.method1291();
        Statics.field2525.method1291();
        Statics.field344.method1291();
        Statics.field654.method1291();
        Statics.field552.method1291();
        Statics.field905.method1291();
        Statics.field884.method1291();
    }

    @ObfuscatedName("bs.bi(I)V")
    public static final void method2052() {
        int var0 = Statics.field2722;
        int var1 = Statics.field2061;
        int var2 = Statics.field2477;
        int var3 = Statics.field788;
        int var4 = 6116423;
        class146.method2400(var0, var1, var2, var3, var4);
        class146.method2400(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class146.method2402(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1442.method286(class85.field1124, var0 + 3, var1 + 14, var4, -1);
        int var5 = class108.field1801;
        int var6 = class108.field1802;
        for (int var7 = 0; var7 < field1627; var7++) {
            int var8 = (field1627 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field1442.method286(method2372(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field2722;
        int var11 = Statics.field2061;
        int var12 = Statics.field2477;
        int var13 = Statics.field788;
        for (int var14 = 0; var14 < field1566; var14++) {
            if (field1738[var14] + field1736[var14] > var10 && field1736[var14] < var10 + var12 && field1747[var14] + field1739[var14] > var11 && field1747[var14] < var11 + var13) {
                field1734[var14] = true;
            }
        }
    }

    @ObfuscatedName("bu.br(I)V")
    public static void method2064() {
        if (!field1530) {
            return;
        }
        class12 var0 = class12.method2328(Statics.field2039, field1687);
        if (var0 != null && var0.field167 != null) {
            class61 var1 = new class61();
            var1.field662 = var0;
            var1.field664 = var0.field167;
            class82.method1110(var1);
        }
        field1530 = false;
        method2390(var0);
    }

    @ObfuscatedName("bt.bk(ILk;IB)V")
    public static final void method2089(int arg0, class74 arg1, int arg2) {
        if ((arg2 & 0x200) != 0) {
            int var3 = field1572.method726();
            int var4 = field1572.method703();
            arg1.method3115(var3, var4, field1541);
            arg1.field2677 = field1541 + 300;
            arg1.field2663 = field1572.method705();
            arg1.field2715 = field1572.method703();
        }
        if ((arg2 & 0x1) != 0) {
            int var5 = field1572.method713();
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = field1572.method726();
            method476(arg1, var5, var6);
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field2684 = field1572.method688();
            if (arg1.field2684.charAt(0) == '~') {
                arg1.field2684 = arg1.field2684.substring(1);
                method2192(2, arg1.field855, arg1.field2684);
            } else if (Statics.field1320 == arg1) {
                method2192(2, arg1.field855, arg1.field2684);
            }
            arg1.field2687 = 0;
            arg1.field2679 = 0;
            arg1.field2665 = 150;
        }
        if ((arg2 & 0x80) != 0) {
            int var7 = field1572.method726();
            byte[] var8 = new byte[var7];
            class50 var9 = new class50(var8);
            field1572.method704(var8, 0, var7);
            field1655[arg0] = var9;
            arg1.method1168(var9);
        }
        if ((arg2 & 0x8) != 0) {
            int var10 = field1572.method713();
            int var11 = field1572.method762();
            int var12 = field1572.method705();
            int var13 = field1572.field540;
            if (arg1.field855 != null && arg1.field863 != null) {
                boolean var14 = false;
                if (var11 <= 1 && method1147(arg1.field855)) {
                    var14 = true;
                }
                if (!var14 && field1605 == 0) {
                    field1557.field540 = 0;
                    field1572.method725(field1557.field541, 0, var12);
                    field1557.field540 = 0;
                    String var15 = class25.method357(class91.method2844(class24.method3337(field1557)));
                    arg1.field2684 = var15.trim();
                    arg1.field2687 = var10 >> 8;
                    arg1.field2679 = var10 & 0xFF;
                    arg1.field2665 = 150;
                    if (var11 == 2 || var11 == 3) {
                        method2192(1, class76.method2095(1) + arg1.field855, var15);
                    } else if (var11 == 1) {
                        method2192(1, class76.method2095(0) + arg1.field855, var15);
                    } else {
                        method2192(2, arg1.field855, var15);
                    }
                }
            }
            field1572.field540 = var12 + var13;
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field2683 = field1572.method705();
            arg1.field2666 = field1572.method703();
            arg1.field2703 = field1572.method762();
            arg1.field2705 = field1572.method703();
            arg1.field2711 = field1572.method860() + field1541;
            arg1.field2701 = field1572.method720() + field1541;
            arg1.field2708 = field1572.method703();
            arg1.field2714 = 1;
            arg1.field2719 = 0;
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field2697 = field1572.method720();
            int var16 = field1572.method818();
            arg1.field2709 = var16 >> 16;
            arg1.field2700 = (var16 & 0xFFFF) + field1541;
            arg1.field2698 = 0;
            arg1.field2699 = 0;
            if (arg1.field2700 > field1541) {
                arg1.field2698 = -1;
            }
            if (arg1.field2697 == 65535) {
                arg1.field2697 = -1;
            }
        }
        if ((arg2 & 0x2) != 0) {
            arg1.field2674 = field1572.method713();
            arg1.field2704 = field1572.method860();
        }
        if ((arg2 & 0x40) != 0) {
            int var17 = field1572.method762();
            int var18 = field1572.method705();
            arg1.method3115(var17, var18, field1541);
            arg1.field2677 = field1541 + 300;
            arg1.field2663 = field1572.method705();
            arg1.field2715 = field1572.method762();
        }
        if ((arg2 & 0x4) != 0) {
            arg1.field2686 = field1572.method712();
            if (arg1.field2686 == 65535) {
                arg1.field2686 = -1;
            }
        }
    }

    @ObfuscatedName("bl.dx(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method2192(int arg0, String arg1, String arg2) {
        method2904(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("bf.az(IIIIIIIIII)V")
    public static final void method2267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class65 var9 = null;
        for (class65 var10 = (class65) field1665.method212(); var10 != null; var10 = (class65) field1665.method201()) {
            if (var10.field725 == arg0 && var10.field713 == arg1 && var10.field714 == arg2 && var10.field712 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class65();
            var9.field725 = arg0;
            var9.field712 = arg3;
            var9.field713 = arg1;
            var9.field714 = arg2;
            method1329(var9);
            field1665.method219(var9);
        }
        var9.field715 = arg4;
        var9.field720 = arg5;
        var9.field719 = arg6;
        var9.field711 = arg7;
        var9.field724 = arg8;
    }

    @ObfuscatedName("bg.bn(I)V")
    public static final void method2274() {
        while (true) {
            if (field1572.method650(field1573) >= 11) {
                int var0 = field1572.method656(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field1650[var0] == null) {
                        field1650[var0] = new class74();
                        if (field1655[var0] != null) {
                            field1650[var0].method1168(field1655[var0]);
                        }
                        var1 = true;
                    }
                    field1731[++field1651 - 1] = var0;
                    class74 var2 = field1650[var0];
                    var2.field2671 = field1541;
                    int var3 = field1663[field1572.method656(3)];
                    if (var1) {
                        var2.field2702 = var2.field2706 = var3;
                    }
                    int var4 = field1572.method656(1);
                    if (var4 == 1) {
                        field1654[++field1653 - 1] = var0;
                    }
                    int var5 = field1572.method656(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field1572.method656(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field1572.method656(1);
                    var2.method3112(Statics.field1320.field2676[0] + var5, Statics.field1320.field2716[0] + var6, var7 == 1);
                    continue;
                }
            }
            field1572.method649();
            return;
        }
    }

    @ObfuscatedName("bg.cu([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2275(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("bh.v(I)V")
    public static final void method2276() {
        int var0 = field1597 + Statics.field1320.field2707;
        int var1 = field1599 + Statics.field1320.field2664;
        if (Statics.field2329 - var0 < -500 || Statics.field2329 - var0 > 500 || Statics.field2484 - var1 < -500 || Statics.field2484 - var1 > 500) {
            Statics.field2329 = var0;
            Statics.field2484 = var1;
        }
        if (Statics.field2329 != var0) {
            Statics.field2329 += (var0 - Statics.field2329) / 16;
        }
        if (Statics.field2484 != var1) {
            Statics.field2484 += (var1 - Statics.field2484) / 16;
        }
        if (class113.field1876[96]) {
            field1711 += (-24 - field1711) / 2;
        } else if (class113.field1876[97]) {
            field1711 += (24 - field1711) / 2;
        } else {
            field1711 /= 2;
        }
        if (class113.field1876[98]) {
            field1619 += (12 - field1619) / 2;
        } else if (class113.field1876[99]) {
            field1619 += (-12 - field1619) / 2;
        } else {
            field1619 /= 2;
        }
        field1617 = field1711 / 2 + field1617 & 0x7FF;
        field1616 += field1619 / 2;
        if (field1616 < 128) {
            field1616 = 128;
        }
        if (field1616 > 383) {
            field1616 = 383;
        }
        int var2 = Statics.field2329 >> 7;
        int var3 = Statics.field2484 >> 7;
        int var4 = method1447(Statics.field2329, Statics.field2484, Statics.field2252);
        int var5 = 0;
        if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
            for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                    int var8 = Statics.field2252;
                    if (var8 < 3 && (class88.field1237[1][var6][var7] & 0x2) == 2) {
                        var8++;
                    }
                    int var9 = var4 - class88.field1247[var8][var6][var7];
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
        if (var10 > field1622) {
            field1622 += (var10 - field1622) / 24;
        } else if (var10 < field1622) {
            field1622 += (var10 - field1622) / 80;
        }
    }

    @ObfuscatedName("db.ci(Lak;IIIB)V")
    public static final void method2327(class171 arg0, int arg1, int arg2, int arg3) {
        if (field1627 >= 400) {
            return;
        }
        if (arg0.field2549 != null) {
            arg0 = arg0.method2957();
        }
        if (arg0 == null || !arg0.field2561) {
            return;
        }
        String var4 = arg0.field2533;
        if (arg0.field2550 != 0) {
            var4 = var4 + method1141(arg0.field2550, Statics.field1320.field851) + " " + class76.field877 + class85.field1127 + arg0.field2550 + class76.field878;
        }
        if (field1684 == 1) {
            method1366(class85.field1099, field1685 + " " + class76.field887 + " " + class76.method1092(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1530) {
            String[] var5 = arg0.field2558;
            if (field1610) {
                var5 = method2275(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class85.field1123)) {
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
                        method1366(var5[var6], class76.method1092(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class85.field1123)) {
                        short var9 = 0;
                        if (arg0.field2550 > Statics.field1320.field851) {
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
                        method1366(var5[var8], class76.method1092(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method1366(class85.field1126, class76.method1092(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field561 & 0x2) == 2) {
            method1366(field1688, field1666 + " " + class76.field887 + " " + class76.method1092(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("da.cp(I)V")
    public static final void method2332() {
        method2390(field1701);
        Statics.field670++;
        if (field1757 && field1706) {
            int var0 = class108.field1801;
            int var1 = class108.field1802;
            int var2 = var0 - field1703;
            int var3 = var1 - field1646;
            if (var2 < field1707) {
                var2 = field1707;
            }
            if (field1701.field88 + var2 > field1707 + field1712.field88) {
                var2 = field1707 + field1712.field88 - field1701.field88;
            }
            if (var3 < field1631) {
                var3 = field1631;
            }
            if (field1701.field89 + var3 > field1631 + field1712.field89) {
                var3 = field1631 + field1712.field89 - field1701.field89;
            }
            int var4 = var2 - field1596;
            int var5 = var3 - field1532;
            int var6 = field1701.field175;
            if (Statics.field670 > field1701.field143 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field1664 = true;
            }
            int var7 = field1712.field92 + (var2 - field1707);
            int var8 = field1712.field93 + (var3 - field1631);
            if (field1701.field155 != null && field1664) {
                class61 var9 = new class61();
                var9.field662 = field1701;
                var9.field663 = var7;
                var9.field665 = var8;
                var9.field664 = field1701.field155;
                class82.method1110(var9);
            }
            if (class108.field1800 == 0) {
                if (field1664) {
                    if (field1701.field156 != null) {
                        class61 var10 = new class61();
                        var10.field662 = field1701;
                        var10.field663 = var7;
                        var10.field665 = var8;
                        var10.field671 = field1716;
                        var10.field664 = field1701.field156;
                        class82.method1110(var10);
                    }
                    if (field1716 != null && method1162(field1701) != null) {
                        field1570.method653(57);
                        field1570.method669(field1716.field128);
                        field1570.method669(field1701.field128);
                        field1570.method709(field1701.field80);
                        field1570.method708(field1716.field80);
                    }
                } else if ((field1671 == 1 || method2846(field1627 - 1)) && field1627 > 2) {
                    method537();
                } else if (field1627 > 0) {
                    method548(field1627 - 1);
                }
                field1701 = null;
            }
        } else if (Statics.field670 > 1) {
            field1701 = null;
        }
    }

    @ObfuscatedName("cy.an(B)V")
    public static final void method2368() {
        method2930(false);
        field1730 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field2112.length; var1++) {
            if (Statics.field2736[var1] != -1 && Statics.field2112[var1] == null) {
                Statics.field2112[var1] = Statics.field1708.method1266(Statics.field2736[var1], 0);
                if (Statics.field2112[var1] == null) {
                    var0 = false;
                    field1730++;
                }
            }
            if (Statics.field21[var1] != -1 && Statics.field866[var1] == null) {
                Statics.field866[var1] = Statics.field1708.method1296(Statics.field21[var1], 0, Statics.field623[var1]);
                if (Statics.field866[var1] == null) {
                    var0 = false;
                    field1730++;
                }
            }
        }
        if (!var0) {
            field1587 = 1;
            return;
        }
        field1615 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field2112.length; var3++) {
            byte[] var4 = Statics.field866[var3];
            if (var4 != null) {
                int var5 = (Statics.field751[var3] >> 8) * 64 - Statics.field2043;
                int var6 = (Statics.field751[var3] & 0xFF) * 64 - Statics.field403;
                if (field1589) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class50 var9 = new class50(var4);
                int var10 = -1;
                label1057: while (true) {
                    int var11 = var9.method754();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method754();
                            if (var16 == 0) {
                                continue label1057;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method726() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class182 var22 = class182.method3383(var10);
                                if (var19 != 22 || !field1537 || var22.field2767 != 0 || var22.field2771 == 1 || var22.field2793) {
                                    if (!var22.method3293()) {
                                        field1615++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method754();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method726();
                    }
                }
            }
        }
        if (!var2) {
            field1587 = 2;
            return;
        }
        if (field1587 != 0) {
            method542(class85.field1013 + class76.field880 + class76.field877 + 100 + "%" + class76.field878, true);
        }
        method1142();
        method2029();
        method1142();
        Statics.field260.method1527();
        method1142();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field1588[var23].method56();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class88.field1237[var24][var25][var26] = 0;
                }
            }
        }
        method1142();
        class88.field1238 = 99;
        Statics.field1239 = new byte[4][104][104];
        Statics.field964 = new byte[4][104][104];
        Statics.field1241 = new byte[4][104][104];
        Statics.field1252 = new byte[4][104][104];
        Statics.field448 = new int[4][105][105];
        Statics.field1242 = new byte[4][105][105];
        Statics.field1236 = new int[105][105];
        Statics.field1244 = new int[104];
        Statics.field2135 = new int[104];
        Statics.field544 = new int[104];
        Statics.field2735 = new int[104];
        Statics.field2503 = new int[104];
        int var27 = Statics.field2112.length;
        class69.method2386();
        method2930(true);
        if (!field1589) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field751[var28] >> 8) * 64 - Statics.field2043;
                int var30 = (Statics.field751[var28] & 0xFF) * 64 - Statics.field403;
                byte[] var31 = Statics.field2112[var28];
                if (var31 != null) {
                    method1142();
                    class88.method2375(var31, var29, var30, Statics.field1254 * 8 - 48, Statics.field971 * 8 - 48, field1588);
                }
            }
            for (int var32 = 0; var32 < var27; var32++) {
                int var33 = (Statics.field751[var32] >> 8) * 64 - Statics.field2043;
                int var34 = (Statics.field751[var32] & 0xFF) * 64 - Statics.field403;
                byte[] var35 = Statics.field2112[var32];
                if (var35 == null && Statics.field971 < 800) {
                    method1142();
                    Statics.method3120(var33, var34, 64, 64);
                }
            }
            method2930(true);
            for (int var36 = 0; var36 < var27; var36++) {
                byte[] var37 = Statics.field866[var36];
                if (var37 != null) {
                    int var38 = (Statics.field751[var36] >> 8) * 64 - Statics.field2043;
                    int var39 = (Statics.field751[var36] & 0xFF) * 64 - Statics.field403;
                    method1142();
                    class107 var40 = Statics.field260;
                    class8[] var41 = field1588;
                    class50 var42 = new class50(var37);
                    int var43 = -1;
                    while (true) {
                        int var44 = var42.method754();
                        if (var44 == 0) {
                            break;
                        }
                        var43 += var44;
                        int var45 = 0;
                        while (true) {
                            int var46 = var42.method754();
                            if (var46 == 0) {
                                break;
                            }
                            var45 += var46 - 1;
                            int var47 = var45 & 0x3F;
                            int var48 = var45 >> 6 & 0x3F;
                            int var49 = var45 >> 12;
                            int var50 = var42.method726();
                            int var51 = var50 >> 2;
                            int var52 = var50 & 0x3;
                            int var53 = var38 + var48;
                            int var54 = var39 + var47;
                            if (var53 > 0 && var54 > 0 && var53 < 103 && var54 < 103) {
                                int var55 = var49;
                                if ((class88.field1237[1][var53][var54] & 0x2) == 2) {
                                    var55 = var49 - 1;
                                }
                                class8 var56 = null;
                                if (var55 >= 0) {
                                    var56 = var41[var55];
                                }
                                class88.method2345(var49, var53, var54, var43, var52, var51, var40, var56);
                            }
                        }
                    }
                }
            }
        }
        if (field1589) {
            for (int var57 = 0; var57 < 4; var57++) {
                method1142();
                for (int var58 = 0; var58 < 13; var58++) {
                    for (int var59 = 0; var59 < 13; var59++) {
                        boolean var60 = false;
                        int var61 = field1590[var57][var58][var59];
                        if (var61 != -1) {
                            int var62 = var61 >> 24 & 0x3;
                            int var63 = var61 >> 1 & 0x3;
                            int var64 = var61 >> 14 & 0x3FF;
                            int var65 = var61 >> 3 & 0x7FF;
                            int var66 = (var64 / 8 << 8) + var65 / 8;
                            for (int var67 = 0; var67 < Statics.field751.length; var67++) {
                                if (Statics.field751[var67] == var66 && Statics.field2112[var67] != null) {
                                    class88.method1172(Statics.field2112[var67], var57, var58 * 8, var59 * 8, var62, (var64 & 0x7) * 8, (var65 & 0x7) * 8, var63, field1588);
                                    var60 = true;
                                    break;
                                }
                            }
                        }
                        if (!var60) {
                            class88.method2937(var57, var58 * 8, var59 * 8);
                        }
                    }
                }
            }
            for (int var68 = 0; var68 < 13; var68++) {
                for (int var69 = 0; var69 < 13; var69++) {
                    int var70 = field1590[0][var68][var69];
                    if (var70 == -1) {
                        Statics.method3120(var68 * 8, var69 * 8, 8, 8);
                    }
                }
            }
            method2930(true);
            for (int var71 = 0; var71 < 4; var71++) {
                method1142();
                for (int var72 = 0; var72 < 13; var72++) {
                    label919: for (int var73 = 0; var73 < 13; var73++) {
                        int var74 = field1590[var71][var72][var73];
                        if (var74 != -1) {
                            int var75 = var74 >> 24 & 0x3;
                            int var76 = var74 >> 1 & 0x3;
                            int var77 = var74 >> 14 & 0x3FF;
                            int var78 = var74 >> 3 & 0x7FF;
                            int var79 = (var77 / 8 << 8) + var78 / 8;
                            for (int var80 = 0; var80 < Statics.field751.length; var80++) {
                                if (Statics.field751[var80] == var79 && Statics.field866[var80] != null) {
                                    byte[] var81 = Statics.field866[var80];
                                    int var82 = var72 * 8;
                                    int var83 = var73 * 8;
                                    int var84 = (var77 & 0x7) * 8;
                                    int var85 = (var78 & 0x7) * 8;
                                    class107 var86 = Statics.field260;
                                    class8[] var87 = field1588;
                                    class50 var88 = new class50(var81);
                                    int var89 = -1;
                                    while (true) {
                                        int var90 = var88.method754();
                                        if (var90 == 0) {
                                            continue label919;
                                        }
                                        var89 += var90;
                                        int var91 = 0;
                                        while (true) {
                                            int var92 = var88.method754();
                                            if (var92 == 0) {
                                                break;
                                            }
                                            var91 += var92 - 1;
                                            int var93 = var91 & 0x3F;
                                            int var94 = var91 >> 6 & 0x3F;
                                            int var95 = var91 >> 12;
                                            int var96 = var88.method726();
                                            int var97 = var96 >> 2;
                                            int var98 = var96 & 0x3;
                                            if (var75 == var95 && var94 >= var84 && var94 < var84 + 8 && var93 >= var85 && var93 < var85 + 8) {
                                                class182 var99 = class182.method3383(var89);
                                                int var100 = var82 + class4.method3110(var94 & 0x7, var93 & 0x7, var76, var99.field2777, var99.field2769, var98);
                                                int var101 = var83 + class4.method1372(var94 & 0x7, var93 & 0x7, var76, var99.field2777, var99.field2769, var98);
                                                if (var100 > 0 && var101 > 0 && var100 < 103 && var101 < 103) {
                                                    int var102 = var71;
                                                    if ((class88.field1237[1][var100][var101] & 0x2) == 2) {
                                                        var102 = var71 - 1;
                                                    }
                                                    class8 var103 = null;
                                                    if (var102 >= 0) {
                                                        var103 = var87[var102];
                                                    }
                                                    class88.method2345(var71, var100, var101, var89, var76 + var98 & 0x3, var97, var86, var103);
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
        method2930(true);
        method2029();
        method1142();
        class107 var104 = Statics.field260;
        class8[] var105 = field1588;
        for (int var106 = 0; var106 < 4; var106++) {
            for (int var107 = 0; var107 < 104; var107++) {
                for (int var108 = 0; var108 < 104; var108++) {
                    if ((class88.field1237[var106][var107][var108] & 0x1) == 1) {
                        int var109 = var106;
                        if ((class88.field1237[1][var107][var108] & 0x2) == 2) {
                            var109 = var106 - 1;
                        }
                        if (var109 >= 0) {
                            var105[var109].method94(var107, var108);
                        }
                    }
                }
            }
        }
        class88.field1251 += (int) (Math.random() * 5.0D) - 2;
        if (class88.field1251 < -8) {
            class88.field1251 = -8;
        }
        if (class88.field1251 > 8) {
            class88.field1251 = 8;
        }
        class88.field1240 += (int) (Math.random() * 5.0D) - 2;
        if (class88.field1240 < -16) {
            class88.field1240 = -16;
        }
        if (class88.field1240 > 16) {
            class88.field1240 = 16;
        }
        for (int var110 = 0; var110 < 4; var110++) {
            byte[][] var111 = Statics.field1242[var110];
            int var112 = (int) Math.sqrt(5100.0D);
            int var113 = var112 * 768 >> 8;
            for (int var114 = 1; var114 < 103; var114++) {
                for (int var115 = 1; var115 < 103; var115++) {
                    int var116 = class88.field1247[var110][var115 + 1][var114] - class88.field1247[var110][var115 - 1][var114];
                    int var117 = class88.field1247[var110][var115][var114 + 1] - class88.field1247[var110][var115][var114 - 1];
                    int var118 = (int) Math.sqrt((double) (var117 * var117 + var116 * var116 + 65536));
                    int var119 = (var116 << 8) / var118;
                    int var120 = 65536 / var118;
                    int var121 = (var117 << 8) / var118;
                    int var122 = (var121 * -50 + var119 * -50 + var120 * -10) / var113 + 96;
                    int var123 = (var111[var115][var114] >> 1) + (var111[var115][var114 + 1] >> 3) + (var111[var115][var114 - 1] >> 2) + (var111[var115 - 1][var114] >> 2) + (var111[var115 + 1][var114] >> 3);
                    Statics.field1236[var115][var114] = var122 - var123;
                }
            }
            for (int var124 = 0; var124 < 104; var124++) {
                Statics.field1244[var124] = 0;
                Statics.field2135[var124] = 0;
                Statics.field544[var124] = 0;
                Statics.field2735[var124] = 0;
                Statics.field2503[var124] = 0;
            }
            for (int var125 = -5; var125 < 109; var125++) {
                for (int var126 = 0; var126 < 104; var126++) {
                    int var127 = var125 + 5;
                    int var10002;
                    if (var127 >= 0 && var127 < 104) {
                        int var128 = Statics.field1239[var110][var127][var126] & 0xFF;
                        if (var128 > 0) {
                            int var129 = var128 - 1;
                            class165 var130 = (class165) class165.field2452.method1((long) var129);
                            class165 var131;
                            if (var130 == null) {
                                byte[] var132 = Statics.field2454.method1266(1, var129);
                                class165 var133 = new class165();
                                if (var132 != null) {
                                    var133.method2855(new class50(var132), var129);
                                }
                                var133.method2845();
                                class165.field2452.method4(var133, (long) var129);
                                var131 = var133;
                            } else {
                                var131 = var130;
                            }
                            Statics.field1244[var126] += var131.field2455;
                            Statics.field2135[var126] += var131.field2456;
                            Statics.field544[var126] += var131.field2457;
                            Statics.field2735[var126] += var131.field2458;
                            var10002 = Statics.field2503[var126]++;
                        }
                    }
                    int var135 = var125 - 5;
                    if (var135 >= 0 && var135 < 104) {
                        int var136 = Statics.field1239[var110][var135][var126] & 0xFF;
                        if (var136 > 0) {
                            int var137 = var136 - 1;
                            class165 var138 = (class165) class165.field2452.method1((long) var137);
                            class165 var139;
                            if (var138 == null) {
                                byte[] var140 = Statics.field2454.method1266(1, var137);
                                class165 var141 = new class165();
                                if (var140 != null) {
                                    var141.method2855(new class50(var140), var137);
                                }
                                var141.method2845();
                                class165.field2452.method4(var141, (long) var137);
                                var139 = var141;
                            } else {
                                var139 = var138;
                            }
                            Statics.field1244[var126] -= var139.field2455;
                            Statics.field2135[var126] -= var139.field2456;
                            Statics.field544[var126] -= var139.field2457;
                            Statics.field2735[var126] -= var139.field2458;
                            var10002 = Statics.field2503[var126]--;
                        }
                    }
                }
                if (var125 >= 1 && var125 < 103) {
                    int var143 = 0;
                    int var144 = 0;
                    int var145 = 0;
                    int var146 = 0;
                    int var147 = 0;
                    for (int var148 = -5; var148 < 109; var148++) {
                        int var149 = var148 + 5;
                        if (var149 >= 0 && var149 < 104) {
                            var143 += Statics.field1244[var149];
                            var144 += Statics.field2135[var149];
                            var145 += Statics.field544[var149];
                            var146 += Statics.field2735[var149];
                            var147 += Statics.field2503[var149];
                        }
                        int var150 = var148 - 5;
                        if (var150 >= 0 && var150 < 104) {
                            var143 -= Statics.field1244[var150];
                            var144 -= Statics.field2135[var150];
                            var145 -= Statics.field544[var150];
                            var146 -= Statics.field2735[var150];
                            var147 -= Statics.field2503[var150];
                        }
                        if (var148 >= 1 && var148 < 103 && (!field1537 || (class88.field1237[0][var125][var148] & 0x2) != 0 || (class88.field1237[var110][var125][var148] & 0x10) == 0 && class88.method2186(var110, var125, var148) == field1710)) {
                            if (var110 < class88.field1238) {
                                class88.field1238 = var110;
                            }
                            int var151 = Statics.field1239[var110][var125][var148] & 0xFF;
                            int var152 = Statics.field964[var110][var125][var148] & 0xFF;
                            if (var151 > 0 || var152 > 0) {
                                int var153 = class88.field1247[var110][var125][var148];
                                int var154 = class88.field1247[var110][var125 + 1][var148];
                                int var155 = class88.field1247[var110][var125 + 1][var148 + 1];
                                int var156 = class88.field1247[var110][var125][var148 + 1];
                                int var157 = Statics.field1236[var125][var148];
                                int var158 = Statics.field1236[var125 + 1][var148];
                                int var159 = Statics.field1236[var125 + 1][var148 + 1];
                                int var160 = Statics.field1236[var125][var148 + 1];
                                int var161 = -1;
                                int var162 = -1;
                                if (var151 > 0) {
                                    int var163 = var143 * 256 / var146;
                                    int var164 = var144 / var147;
                                    int var165 = var145 / var147;
                                    var161 = class88.method468(var163, var164, var165);
                                    int var166 = class88.field1251 + var163 & 0xFF;
                                    int var167 = class88.field1240 + var165;
                                    if (var167 < 0) {
                                        var167 = 0;
                                    } else if (var167 > 255) {
                                        var167 = 255;
                                    }
                                    var162 = class88.method468(var166, var164, var167);
                                }
                                if (var110 > 0) {
                                    boolean var168 = true;
                                    if (var151 == 0 && Statics.field1241[var110][var125][var148] != 0) {
                                        var168 = false;
                                    }
                                    if (var152 > 0) {
                                        int var169 = var152 - 1;
                                        class164 var170 = (class164) class164.field2435.method1((long) var169);
                                        class164 var171;
                                        if (var170 == null) {
                                            byte[] var172 = Statics.field2447.method1266(4, var169);
                                            class164 var173 = new class164();
                                            if (var172 != null) {
                                                var173.method2830(new class50(var172), var169);
                                            }
                                            var173.method2828();
                                            class164.field2435.method4(var173, (long) var169);
                                            var171 = var173;
                                        } else {
                                            var171 = var170;
                                        }
                                        if (!var171.field2438) {
                                            var168 = false;
                                        }
                                    }
                                    if (var168 && var153 == var154 && var153 == var155 && var153 == var156) {
                                        Statics.field448[var110][var125][var148] |= 0x924;
                                    }
                                }
                                int var174 = 0;
                                if (var162 != -1) {
                                    var174 = class153.field2294[Statics.method2066(var162, 96)];
                                }
                                if (var152 == 0) {
                                    var104.method1507(var110, var125, var148, 0, 0, -1, var153, var154, var155, var156, Statics.method2066(var161, var157), Statics.method2066(var161, var158), Statics.method2066(var161, var159), Statics.method2066(var161, var160), 0, 0, 0, 0, var174, 0);
                                } else {
                                    int var175 = Statics.field1241[var110][var125][var148] + 1;
                                    byte var176 = Statics.field1252[var110][var125][var148];
                                    class164 var177 = class164.method2514(var152 - 1);
                                    int var178 = var177.field2437;
                                    int var179;
                                    int var180;
                                    if (var178 >= 0) {
                                        var179 = Statics.field2282.method557(var178);
                                        var180 = -1;
                                    } else if (var177.field2436 == 16711935) {
                                        var180 = -2;
                                        var178 = -1;
                                        var179 = -2;
                                    } else {
                                        var180 = class88.method468(var177.field2440, var177.field2446, var177.field2442);
                                        int var181 = class88.field1251 + var177.field2440 & 0xFF;
                                        int var182 = class88.field1240 + var177.field2442;
                                        if (var182 < 0) {
                                            var182 = 0;
                                        } else if (var182 > 255) {
                                            var182 = 255;
                                        }
                                        var179 = class88.method468(var181, var177.field2446, var182);
                                    }
                                    int var183 = 0;
                                    if (var179 != -2) {
                                        var183 = class153.field2294[class88.method1100(var179, 96)];
                                    }
                                    if (var177.field2439 != -1) {
                                        int var184 = class88.field1251 + var177.field2443 & 0xFF;
                                        int var185 = class88.field1240 + var177.field2445;
                                        if (var185 < 0) {
                                            var185 = 0;
                                        } else if (var185 > 255) {
                                            var185 = 255;
                                        }
                                        int var186 = class88.method468(var184, var177.field2444, var185);
                                        var183 = class153.field2294[class88.method1100(var186, 96)];
                                    }
                                    var104.method1507(var110, var125, var148, var175, var176, var178, var153, var154, var155, var156, Statics.method2066(var161, var157), Statics.method2066(var161, var158), Statics.method2066(var161, var159), Statics.method2066(var161, var160), class88.method1100(var180, var157), class88.method1100(var180, var158), class88.method1100(var180, var159), class88.method1100(var180, var160), var174, var183);
                                }
                            }
                        }
                    }
                }
            }
            for (int var187 = 1; var187 < 103; var187++) {
                for (int var188 = 1; var188 < 103; var188++) {
                    var104.method1503(var110, var188, var187, class88.method2186(var110, var188, var187));
                }
            }
            Statics.field1239[var110] = (byte[][]) null;
            Statics.field964[var110] = (byte[][]) null;
            Statics.field1241[var110] = (byte[][]) null;
            Statics.field1252[var110] = (byte[][]) null;
            Statics.field1242[var110] = (byte[][]) null;
        }
        var104.method1530(-50, -10, -50);
        for (int var189 = 0; var189 < 104; var189++) {
            for (int var190 = 0; var190 < 104; var190++) {
                if ((class88.field1237[1][var189][var190] & 0x2) == 2) {
                    var104.method1501(var189, var190);
                }
            }
        }
        int var191 = 1;
        int var192 = 2;
        int var193 = 4;
        for (int var194 = 0; var194 < 4; var194++) {
            if (var194 > 0) {
                var191 <<= 0x3;
                var192 <<= 0x3;
                var193 <<= 0x3;
            }
            for (int var195 = 0; var195 <= var194; var195++) {
                for (int var196 = 0; var196 <= 104; var196++) {
                    for (int var197 = 0; var197 <= 104; var197++) {
                        if ((Statics.field448[var195][var197][var196] & var191) != 0) {
                            int var198 = var196;
                            int var199 = var196;
                            int var200 = var195;
                            int var201 = var195;
                            while (var198 > 0 && (Statics.field448[var195][var197][var198 - 1] & var191) != 0) {
                                var198--;
                            }
                            while (var199 < 104 && (Statics.field448[var195][var197][var199 + 1] & var191) != 0) {
                                var199++;
                            }
                            label652: while (var200 > 0) {
                                for (int var202 = var198; var202 <= var199; var202++) {
                                    if ((Statics.field448[var200 - 1][var197][var202] & var191) == 0) {
                                        break label652;
                                    }
                                }
                                var200--;
                            }
                            label641: while (var201 < var194) {
                                for (int var203 = var198; var203 <= var199; var203++) {
                                    if ((Statics.field448[var201 + 1][var197][var203] & var191) == 0) {
                                        break label641;
                                    }
                                }
                                var201++;
                            }
                            int var204 = (var201 + 1 - var200) * (var199 - var198 + 1);
                            if (var204 >= 8) {
                                short var205 = 240;
                                int var206 = class88.field1247[var201][var197][var198] - var205;
                                int var207 = class88.field1247[var200][var197][var198];
                                class107.method1502(var194, 1, var197 * 128, var197 * 128, var198 * 128, var199 * 128 + 128, var206, var207);
                                for (int var208 = var200; var208 <= var201; var208++) {
                                    for (int var209 = var198; var209 <= var199; var209++) {
                                        Statics.field448[var208][var197][var209] &= ~var191;
                                    }
                                }
                            }
                        }
                        if ((Statics.field448[var195][var197][var196] & var192) != 0) {
                            int var210 = var197;
                            int var211 = var197;
                            int var212 = var195;
                            int var213 = var195;
                            while (var210 > 0 && (Statics.field448[var195][var210 - 1][var196] & var192) != 0) {
                                var210--;
                            }
                            while (var211 < 104 && (Statics.field448[var195][var211 + 1][var196] & var192) != 0) {
                                var211++;
                            }
                            label705: while (var212 > 0) {
                                for (int var214 = var210; var214 <= var211; var214++) {
                                    if ((Statics.field448[var212 - 1][var214][var196] & var192) == 0) {
                                        break label705;
                                    }
                                }
                                var212--;
                            }
                            label694: while (var213 < var194) {
                                for (int var215 = var210; var215 <= var211; var215++) {
                                    if ((Statics.field448[var213 + 1][var215][var196] & var192) == 0) {
                                        break label694;
                                    }
                                }
                                var213++;
                            }
                            int var216 = (var213 + 1 - var212) * (var211 - var210 + 1);
                            if (var216 >= 8) {
                                short var217 = 240;
                                int var218 = class88.field1247[var213][var210][var196] - var217;
                                int var219 = class88.field1247[var212][var210][var196];
                                class107.method1502(var194, 2, var210 * 128, var211 * 128 + 128, var196 * 128, var196 * 128, var218, var219);
                                for (int var220 = var212; var220 <= var213; var220++) {
                                    for (int var221 = var210; var221 <= var211; var221++) {
                                        Statics.field448[var220][var221][var196] &= ~var192;
                                    }
                                }
                            }
                        }
                        if ((Statics.field448[var195][var197][var196] & var193) != 0) {
                            int var222 = var197;
                            int var223 = var197;
                            int var224 = var196;
                            int var225 = var196;
                            while (var224 > 0 && (Statics.field448[var195][var197][var224 - 1] & var193) != 0) {
                                var224--;
                            }
                            while (var225 < 104 && (Statics.field448[var195][var197][var225 + 1] & var193) != 0) {
                                var225++;
                            }
                            label758: while (var222 > 0) {
                                for (int var226 = var224; var226 <= var225; var226++) {
                                    if ((Statics.field448[var195][var222 - 1][var226] & var193) == 0) {
                                        break label758;
                                    }
                                }
                                var222--;
                            }
                            label747: while (var223 < 104) {
                                for (int var227 = var224; var227 <= var225; var227++) {
                                    if ((Statics.field448[var195][var223 + 1][var227] & var193) == 0) {
                                        break label747;
                                    }
                                }
                                var223++;
                            }
                            if ((var223 - var222 + 1) * (var225 - var224 + 1) >= 4) {
                                int var228 = class88.field1247[var195][var222][var224];
                                class107.method1502(var194, 4, var222 * 128, var223 * 128 + 128, var224 * 128, var225 * 128 + 128, var228, var228);
                                for (int var229 = var222; var229 <= var223; var229++) {
                                    for (int var230 = var224; var230 <= var225; var230++) {
                                        Statics.field448[var195][var229][var230] &= ~var193;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method2930(true);
        int var231 = class88.field1238;
        if (var231 > Statics.field2252) {
            var231 = Statics.field2252;
        }
        if (var231 < Statics.field2252 - 1) {
            int var232 = Statics.field2252 - 1;
        }
        if (field1537) {
            Statics.field260.method1500(class88.field1238);
        } else {
            Statics.field260.method1500(0);
        }
        for (int var233 = 0; var233 < 104; var233++) {
            for (int var234 = 0; var234 < 104; var234++) {
                method547(var233, var234);
            }
        }
        method1142();
        method1107();
        class182.field2757.method5();
        if (Statics.field1929 != null) {
            field1570.method653(140);
            field1570.method669(1057001181);
        }
        if (!field1589) {
            int var235 = (Statics.field1254 - 6) / 8;
            int var236 = (Statics.field1254 + 6) / 8;
            int var237 = (Statics.field971 - 6) / 8;
            int var238 = (Statics.field971 + 6) / 8;
            for (int var239 = var235 - 1; var239 <= var236 + 1; var239++) {
                for (int var240 = var237 - 1; var240 <= var238 + 1; var240++) {
                    if (var239 < var235 || var239 > var236 || var240 < var237 || var240 > var238) {
                        Statics.field1708.method1274("m" + var239 + "_" + var240);
                        Statics.field1708.method1274("l" + var239 + "_" + var240);
                    }
                }
            }
        }
        method897(30);
        method1142();
        Statics.field1239 = (byte[][][]) null;
        Statics.field964 = (byte[][][]) null;
        Statics.field1241 = (byte[][][]) null;
        Statics.field1252 = (byte[][][]) null;
        Statics.field448 = (int[][][]) null;
        Statics.field1242 = (byte[][][]) null;
        Statics.field1236 = (int[][]) null;
        Statics.field1244 = null;
        Statics.field2135 = null;
        Statics.field544 = null;
        Statics.field2735 = null;
        Statics.field2503 = null;
        field1570.method653(250);
        Statics.field2031.method2187();
        for (int var241 = 0; var241 < 32; var241++) {
            field2005[var241] = 0L;
        }
        for (int var242 = 0; var242 < 32; var242++) {
            field2006[var242] = 0L;
        }
        Statics.field557 = 0;
    }

    @ObfuscatedName("cw.bd(II)Ljava/lang/String;")
    public static String method2372(int arg0) {
        return field1556[arg0].length() > 0 ? field1678[arg0] + class85.field1131 + field1556[arg0] : field1678[arg0];
    }

    @ObfuscatedName("cw.cl([Lfi;II)V")
    public static final void method2373(class12[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class12 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field81 == 0) {
                    if (var3.field187 != null) {
                        method2373(var3.field187, arg1);
                    }
                    class80 var4 = (class80) field1691.method20((long) var3.field128);
                    if (var4 != null) {
                        int var5 = var4.field929;
                        if (class12.method536(var5)) {
                            method2373(Statics.field173[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field98 != null) {
                    class61 var6 = new class61();
                    var6.field662 = var3;
                    var6.field664 = var3.field98;
                    class82.method1110(var6);
                }
                if (arg1 == 1 && var3.field174 != null) {
                    if (var3.field80 >= 0) {
                        class12 var7 = class12.method2369(var3.field128);
                        if (var7 == null || var7.field187 == null || var3.field80 >= var7.field187.length || var7.field187[var3.field80] != var3) {
                            continue;
                        }
                    }
                    class61 var8 = new class61();
                    var8.field662 = var3;
                    var8.field664 = var3.field174;
                    class82.method1110(var8);
                }
            }
        }
    }

    @ObfuscatedName("cv.de(IIII)V")
    public static final void method2377(int arg0, int arg1, int arg2) {
        method1142();
        class146.method2396(arg0, arg1, Statics.field1915.field2239 + arg0, Statics.field1915.field2237 + arg1);
        if (field1647 == 2 || field1647 == 5) {
            class146.method2409(arg0 + 25, arg1 + 5, 0, Statics.field848, Statics.field875);
        } else {
            int var3 = field1617 + field1604 & 0x7FF;
            int var4 = Statics.field1320.field2707 / 32 + 48;
            int var5 = 464 - Statics.field1320.field2664 / 32;
            Statics.field2434.method2609(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field1561 + 256, Statics.field848, Statics.field875);
            for (int var6 = 0; var6 < field1758; var6++) {
                int var7 = field1581[var6] * 4 + 2 - Statics.field1320.field2707 / 32;
                int var8 = field1642[var6] * 4 + 2 - Statics.field1320.field2664 / 32;
                method2578(arg0, arg1, var7, var8, field1637[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class15 var11 = field1586[Statics.field2252][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field1320.field2707 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field1320.field2664 / 32;
                        method2578(arg0, arg1, var12, var13, Statics.field2450[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field1568; var14++) {
                class62 var15 = field1567[field1569[var14]];
                if (var15 != null && var15.method1095()) {
                    class171 var16 = var15.field678;
                    if (var16 != null && var16.field2549 != null) {
                        var16 = var16.method2957();
                    }
                    if (var16 != null && var16.field2544 && var16.field2561) {
                        int var17 = var15.field2707 / 32 - Statics.field1320.field2707 / 32;
                        int var18 = var15.field2664 / 32 - Statics.field1320.field2664 / 32;
                        method2578(arg0, arg1, var17, var18, Statics.field2450[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field1651; var19++) {
                class74 var20 = field1650[field1731[var19]];
                if (var20 != null && var20.method1095()) {
                    int var21 = var20.field2707 / 32 - Statics.field1320.field2707 / 32;
                    int var22 = var20.field2664 / 32 - Statics.field1320.field2664 / 32;
                    boolean var23 = false;
                    if (method1218(var20.field855)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field768; var25++) {
                        if (var20.field855.equals(Statics.field2012[var25].field563)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field1320.field865 != 0 && var20.field865 != 0 && Statics.field1320.field865 == var20.field865) {
                        var26 = true;
                    }
                    if (var23) {
                        method2578(arg0, arg1, var21, var22, Statics.field2450[3]);
                    } else if (var26) {
                        method2578(arg0, arg1, var21, var22, Statics.field2450[4]);
                    } else if (var24) {
                        method2578(arg0, arg1, var21, var22, Statics.field2450[5]);
                    } else {
                        method2578(arg0, arg1, var21, var22, Statics.field2450[2]);
                    }
                }
            }
            if (field1549 != 0 && field1541 % 20 < 10) {
                if (field1549 == 1 && field1698 >= 0 && field1698 < field1567.length) {
                    class62 var27 = field1567[field1698];
                    if (var27 != null) {
                        int var28 = var27.field2707 / 32 - Statics.field1320.field2707 / 32;
                        int var29 = var27.field2664 / 32 - Statics.field1320.field2664 / 32;
                        method1331(arg0, arg1, var28, var29, Statics.field1889[1]);
                    }
                }
                if (field1549 == 2) {
                    int var30 = field1552 * 4 - Statics.field2043 * 4 + 2 - Statics.field1320.field2707 / 32;
                    int var31 = field1553 * 4 - Statics.field403 * 4 + 2 - Statics.field1320.field2664 / 32;
                    method1331(arg0, arg1, var30, var31, Statics.field1889[1]);
                }
                if (field1549 == 10 && field1697 >= 0 && field1697 < field1650.length) {
                    class74 var32 = field1650[field1697];
                    if (var32 != null) {
                        int var33 = var32.field2707 / 32 - Statics.field1320.field2707 / 32;
                        int var34 = var32.field2664 / 32 - Statics.field1320.field2664 / 32;
                        method1331(arg0, arg1, var33, var34, Statics.field1889[1]);
                    }
                }
            }
            if (field1628 != 0) {
                int var35 = field1628 * 4 + 2 - Statics.field1320.field2707 / 32;
                int var36 = field1763 * 4 + 2 - Statics.field1320.field2664 / 32;
                method2578(arg0, arg1, var35, var36, Statics.field1889[0]);
            }
            class146.method2400(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field1647 < 3) {
            Statics.field792.method2609(arg0, arg1, 33, 33, 25, 25, field1617, 256, Statics.field1435, Statics.field2486);
        } else {
            class146.method2409(arg0, arg1, 0, Statics.field1435, Statics.field2486);
        }
        if (field1735[arg2]) {
            Statics.field1915.method2463(arg0, arg1);
        }
        field1734[arg2] = true;
    }

    @ObfuscatedName("cv.be(I)V")
    public static final void method2380() {
        for (int var0 = 0; var0 < field1653; var0++) {
            int var1 = field1654[var0];
            class74 var2 = field1650[var1];
            int var3 = field1572.method726();
            if ((var3 & 0x20) != 0) {
                var3 += field1572.method726() << 8;
            }
            method2089(var1, var2, var3);
        }
    }

    @ObfuscatedName("ct.af(I)Z")
    public static final boolean method2383() {
        if (Statics.field2080 == null) {
            return false;
        }
        try {
            int var0 = Statics.field2080.method2291();
            if (var0 == 0) {
                return false;
            }
            if (field1574 == -1) {
                Statics.field2080.method2299(field1572.field541, 0, 1);
                field1572.field540 = 0;
                field1574 = field1572.method644();
                field1573 = class73.field846[field1574];
                var0--;
            }
            if (field1573 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field2080.method2299(field1572.field541, 0, 1);
                field1573 = field1572.field541[0] & 0xFF;
                var0--;
            }
            if (field1573 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field2080.method2299(field1572.field541, 0, 2);
                field1572.field540 = 0;
                field1573 = field1572.method720();
                var0 -= 2;
            }
            if (var0 < field1573) {
                return false;
            }
            field1572.field540 = 0;
            Statics.field2080.method2299(field1572.field541, 0, field1573);
            field1791 = 0;
            field1580 = field1579;
            field1579 = field1578;
            field1578 = field1574;
            if (field1574 == 153) {
                int var1 = field1572.method712();
                int var2 = field1572.method860();
                int var3 = field1572.method818();
                class12 var4 = class12.method2369(var3);
                var4.field123 = (var2 << 16) + var1;
                field1574 = -1;
                return true;
            }
            if (field1574 == 119) {
                if (field1690 != -1) {
                    int var5 = field1690;
                    if (class12.method536(var5)) {
                        method2373(Statics.field173[var5], 0);
                    }
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 133) {
                field1647 = field1572.method726();
                field1574 = -1;
                return true;
            }
            if (field1574 == 180) {
                int var6 = field1572.method720();
                int var7 = field1572.method685();
                class71.field797[var6] = var7;
                if (class71.field800[var6] != var7) {
                    class71.field800[var6] = var7;
                    method1148(var6);
                }
                field1576[++field1715 - 1 & 0x1F] = var6;
                field1574 = -1;
                return true;
            }
            if (field1574 == 148) {
                int var8 = field1573 + field1572.field540;
                int var9 = field1572.method720();
                int var10 = field1572.method720();
                if (field1690 != var9) {
                    field1690 = var9;
                    method3128(field1690);
                    class82.method2051(field1690);
                    for (int var11 = 0; var11 < 100; var11++) {
                        field1733[var11] = true;
                    }
                }
                while (var10-- > 0) {
                    int var12 = field1572.method685();
                    int var13 = field1572.method720();
                    int var14 = field1572.method726();
                    class80 var15 = (class80) field1691.method20((long) var12);
                    if (var15 != null && var15.field929 != var13) {
                        method2908(var15, true);
                        var15 = null;
                    }
                    if (var15 == null) {
                        var15 = method961(var12, var13, var14);
                    }
                    var15.field927 = true;
                }
                for (class80 var16 = (class80) field1691.method16(); var16 != null; var16 = (class80) field1691.method17()) {
                    if (var16.field927) {
                        var16.field927 = false;
                    } else {
                        method2908(var16, true);
                    }
                }
                field1582 = new class3(512);
                while (field1572.field540 < var8) {
                    int var17 = field1572.method685();
                    int var18 = field1572.method720();
                    int var19 = field1572.method720();
                    int var20 = field1572.method685();
                    for (int var21 = var18; var21 <= var19; var21++) {
                        long var22 = ((long) var17 << 32) + (long) var21;
                        field1582.method14(new class1(var20), var22);
                    }
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 213) {
                int var24 = field1572.method720();
                if (var24 == 65535) {
                    var24 = -1;
                }
                int var25 = field1572.method713();
                if (var25 == 65535) {
                    var25 = -1;
                }
                int var26 = field1572.method722();
                int var27 = field1572.method722();
                for (int var28 = var25; var28 <= var24; var28++) {
                    long var29 = ((long) var26 << 32) + (long) var28;
                    class17 var31 = field1582.method20(var29);
                    if (var31 != null) {
                        var31.method234();
                    }
                    field1582.method14(new class1(var27), var29);
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 202) {
                method1091();
                field1574 = -1;
                return true;
            }
            if (field1574 == 134) {
                String var32 = field1572.method688();
                long var33 = field1572.method871();
                long var35 = (long) field1572.method720();
                long var37 = (long) field1572.method728();
                int var39 = field1572.method726();
                long var40 = (var35 << 32) + var37;
                boolean var42 = false;
                for (int var43 = 0; var43 < 100; var43++) {
                    if (field1749[var43] == var40) {
                        var42 = true;
                        break;
                    }
                }
                if (var39 <= 1 && method1147(var32)) {
                    var42 = true;
                }
                if (!var42 && field1605 == 0) {
                    field1749[field1750] = var40;
                    field1750 = (field1750 + 1) % 100;
                    String var44 = class25.method357(class91.method2844(class24.method3337(field1572)));
                    if (var39 == 2 || var39 == 3) {
                        method2904(9, class76.method2095(1) + var32, var44, class103.method3035(var33));
                    } else if (var39 == 1) {
                        method2904(9, class76.method2095(0) + var32, var44, class103.method3035(var33));
                    } else {
                        method2904(9, var32, var44, class103.method3035(var33));
                    }
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 60) {
                for (int var45 = 0; var45 < field1650.length; var45++) {
                    if (field1650[var45] != null) {
                        field1650[var45].field2692 = -1;
                    }
                }
                for (int var46 = 0; var46 < field1567.length; var46++) {
                    if (field1567[var46] != null) {
                        field1567[var46].field2692 = -1;
                    }
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 155) {
                String var47 = field1572.method688();
                Object[] var48 = new Object[var47.length() + 1];
                for (int var49 = var47.length() - 1; var49 >= 0; var49--) {
                    if (var47.charAt(var49) == 's') {
                        var48[var49 + 1] = field1572.method688();
                    } else {
                        var48[var49 + 1] = Integer.valueOf(field1572.method685());
                    }
                }
                var48[0] = Integer.valueOf(field1572.method685());
                class61 var50 = new class61();
                var50.field664 = var48;
                class82.method1110(var50);
                field1574 = -1;
                return true;
            }
            if (field1574 == 139) {
                method3111();
                int var51 = field1572.method762();
                int var52 = field1572.method721();
                int var53 = field1572.method705();
                field1670[var53] = var52;
                field1614[var53] = var51;
                field1669[var53] = 1;
                for (int var54 = 0; var54 < 98; var54++) {
                    if (var52 >= class45.field496[var54]) {
                        field1669[var53] = var54 + 2;
                    }
                }
                field1630[++field1719 - 1 & 0x1F] = var53;
                field1574 = -1;
                return true;
            }
            if (field1574 == 33) {
                int var55 = field1572.method721();
                int var56 = field1572.method860();
                int var57 = var56 >> 10 & 0x1F;
                int var58 = var56 >> 5 & 0x1F;
                int var59 = var56 & 0x1F;
                int var60 = (var59 << 3) + (var57 << 19) + (var58 << 11);
                class12 var61 = class12.method2369(var55);
                if (var61.field96 != var60) {
                    var61.field96 = var60;
                    method2390(var61);
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 248) {
                field1549 = field1572.method726();
                if (field1549 == 1) {
                    field1698 = field1572.method720();
                }
                if (field1549 >= 2 && field1549 <= 6) {
                    if (field1549 == 2) {
                        field1555 = 64;
                        field1723 = 64;
                    }
                    if (field1549 == 3) {
                        field1555 = 0;
                        field1723 = 64;
                    }
                    if (field1549 == 4) {
                        field1555 = 128;
                        field1723 = 64;
                    }
                    if (field1549 == 5) {
                        field1555 = 64;
                        field1723 = 0;
                    }
                    if (field1549 == 6) {
                        field1555 = 64;
                        field1723 = 128;
                    }
                    field1549 = 2;
                    field1552 = field1572.method720();
                    field1553 = field1572.method720();
                    field1554 = field1572.method726();
                }
                if (field1549 == 10) {
                    field1697 = field1572.method720();
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 197) {
                int var62 = field1572.method818();
                boolean var63 = field1572.method703() == 1;
                class12 var64 = class12.method2369(var62);
                if (var64.field179 != var63) {
                    var64.field179 = var63;
                    method2390(var64);
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 227) {
                field1658 = 0;
                field1653 = 0;
                field1572.method655();
                int var65 = field1572.method656(8);
                if (var65 < field1568) {
                    for (int var66 = var65; var66 < field1568; var66++) {
                        field1672[++field1658 - 1] = field1569[var66];
                    }
                }
                if (var65 > field1568) {
                    throw new RuntimeException("");
                }
                field1568 = 0;
                for (int var67 = 0; var67 < var65; var67++) {
                    int var68 = field1569[var67];
                    class62 var69 = field1567[var68];
                    int var70 = field1572.method656(1);
                    if (var70 == 0) {
                        field1569[++field1568 - 1] = var68;
                        var69.field2671 = field1541;
                    } else {
                        int var71 = field1572.method656(2);
                        if (var71 == 0) {
                            field1569[++field1568 - 1] = var68;
                            var69.field2671 = field1541;
                            field1654[++field1653 - 1] = var68;
                        } else if (var71 == 1) {
                            field1569[++field1568 - 1] = var68;
                            var69.field2671 = field1541;
                            int var72 = field1572.method656(3);
                            var69.method3113(var72, false);
                            int var73 = field1572.method656(1);
                            if (var73 == 1) {
                                field1654[++field1653 - 1] = var68;
                            }
                        } else if (var71 == 2) {
                            field1569[++field1568 - 1] = var68;
                            var69.field2671 = field1541;
                            int var74 = field1572.method656(3);
                            var69.method3113(var74, true);
                            int var75 = field1572.method656(3);
                            var69.method3113(var75, true);
                            int var76 = field1572.method656(1);
                            if (var76 == 1) {
                                field1654[++field1653 - 1] = var68;
                            }
                        } else if (var71 == 3) {
                            field1672[++field1658 - 1] = var68;
                        }
                    }
                }
                method3127();
                for (int var77 = 0; var77 < field1653; var77++) {
                    int var78 = field1654[var77];
                    class62 var79 = field1567[var78];
                    int var80 = field1572.method726();
                    if ((var80 & 0x10) != 0) {
                        var79.field2686 = field1572.method860();
                        if (var79.field2686 == 65535) {
                            var79.field2686 = -1;
                        }
                    }
                    if ((var80 & 0x4) != 0) {
                        var79.field678 = class171.method2388(field1572.method712());
                        var79.field2667 = var79.field678.field2563;
                        var79.field2713 = var79.field678.field2557;
                        var79.field2678 = var79.field678.field2540;
                        var79.field2672 = var79.field678.field2541;
                        var79.field2673 = var79.field678.field2542;
                        var79.field2688 = var79.field678.field2537;
                        var79.field2668 = var79.field678.field2559;
                        var79.field2669 = var79.field678.field2538;
                        var79.field2670 = var79.field678.field2539;
                    }
                    if ((var80 & 0x8) != 0) {
                        int var81 = field1572.method705();
                        int var82 = field1572.method703();
                        var79.method3115(var81, var82, field1541);
                        var79.field2677 = field1541 + 300;
                        var79.field2663 = field1572.method705();
                        var79.field2715 = field1572.method703();
                    }
                    if ((var80 & 0x1) != 0) {
                        var79.field2697 = field1572.method712();
                        int var83 = field1572.method721();
                        var79.field2709 = var83 >> 16;
                        var79.field2700 = (var83 & 0xFFFF) + field1541;
                        var79.field2698 = 0;
                        var79.field2699 = 0;
                        if (var79.field2700 > field1541) {
                            var79.field2698 = -1;
                        }
                        if (var79.field2697 == 65535) {
                            var79.field2697 = -1;
                        }
                    }
                    if ((var80 & 0x20) != 0) {
                        var79.field2674 = field1572.method713();
                        var79.field2704 = field1572.method720();
                    }
                    if ((var80 & 0x40) != 0) {
                        int var84 = field1572.method720();
                        if (var84 == 65535) {
                            var84 = -1;
                        }
                        int var85 = field1572.method726();
                        if (var79.field2692 == var84 && var84 != -1) {
                            int var86 = class173.method3098(var84).field2585;
                            if (var86 == 1) {
                                var79.field2693 = 0;
                                var79.field2694 = 0;
                                var79.field2695 = var85;
                                var79.field2685 = 0;
                            }
                            if (var86 == 2) {
                                var79.field2685 = 0;
                            }
                        } else if (var84 == -1 || var79.field2692 == -1 || class173.method3098(var84).field2578 >= class173.method3098(var79.field2692).field2578) {
                            var79.field2692 = var84;
                            var79.field2693 = 0;
                            var79.field2694 = 0;
                            var79.field2695 = var85;
                            var79.field2685 = 0;
                            var79.field2719 = var79.field2714;
                        }
                    }
                    if ((var80 & 0x80) != 0) {
                        int var87 = field1572.method762();
                        int var88 = field1572.method703();
                        var79.method3115(var87, var88, field1541);
                        var79.field2677 = field1541 + 300;
                        var79.field2663 = field1572.method705();
                        var79.field2715 = field1572.method726();
                    }
                    if ((var80 & 0x2) != 0) {
                        var79.field2684 = field1572.method688();
                        var79.field2665 = 100;
                    }
                }
                for (int var89 = 0; var89 < field1658; var89++) {
                    int var90 = field1672[var89];
                    if (field1541 != field1567[var90].field2671) {
                        field1567[var90].field678 = null;
                        field1567[var90] = null;
                    }
                }
                if (field1573 != field1572.field540) {
                    throw new RuntimeException(field1572.field540 + class76.field874 + field1573);
                }
                for (int var91 = 0; var91 < field1568; var91++) {
                    if (field1567[field1569[var91]] == null) {
                        throw new RuntimeException(var91 + class76.field874 + field1568);
                    }
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 175) {
                String var92 = field1572.method688();
                String var93 = class25.method357(class91.method2844(class24.method3337(field1572)));
                method2192(6, var92, var93);
                field1574 = -1;
                return true;
            }
            if (field1574 == 125) {
                field1572.field540 += 28;
                if (field1572.method700()) {
                    class49 var94 = field1572;
                    int var95 = field1572.field540 - 28;
                    if (class137.field2121 != null) {
                        try {
                            class137.field2121.method2877(0L);
                            class137.field2121.method2883(var94.field541, var95, 24);
                        } catch (Exception var283) {
                        }
                    }
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 78) {
                String var97 = field1572.method688();
                int var98 = field1572.method705();
                int var99 = field1572.method762();
                if (var99 >= 1 && var99 <= 8) {
                    if (var97.equalsIgnoreCase("null")) {
                        var97 = null;
                    }
                    field1661[var99 - 1] = var97;
                    field1558[var99 - 1] = var98 == 0;
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 222) {
                int var100 = field1572.method726();
                int var101 = field1572.method726();
                int var102 = field1572.method726();
                int var103 = field1572.method726();
                field1777[var100] = true;
                field1778[var100] = var101;
                field1565[var100] = var102;
                field1584[var100] = var103;
                field1659[var100] = 0;
                field1574 = -1;
                return true;
            }
            if (field1574 == 83) {
                byte var104 = field1572.method681();
                int var105 = field1572.method712();
                class71.field797[var105] = var104;
                if (class71.field800[var105] != var104) {
                    class71.field800[var105] = var104;
                    method1148(var105);
                }
                field1576[++field1715 - 1 & 0x1F] = var105;
                field1574 = -1;
                return true;
            }
            if (field1574 == 86) {
                int var106 = field1572.method712();
                int var107 = field1572.method685();
                class12 var108 = class12.method2369(var107);
                if (var108.field163 != 2 || var108.field112 != var106) {
                    var108.field163 = 2;
                    var108.field112 = var106;
                    method2390(var108);
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 111) {
                String var109 = field1572.method688();
                if (var109.endsWith(":tradereq:")) {
                    String var110 = var109.substring(0, var109.indexOf(":"));
                    boolean var111 = false;
                    if (method1147(var110)) {
                        var111 = true;
                    }
                    if (!var111 && field1605 == 0) {
                        method2192(4, var110, class85.field1116);
                    }
                } else if (var109.endsWith(":duelreq:")) {
                    String var112 = var109.substring(0, var109.indexOf(":"));
                    boolean var113 = false;
                    if (method1147(var112)) {
                        var113 = true;
                    }
                    if (!var113 && field1605 == 0) {
                        method2192(8, var112, class85.field1117);
                    }
                } else if (var109.endsWith(":chalreq:")) {
                    String var114 = var109.substring(0, var109.indexOf(":"));
                    boolean var115 = false;
                    if (method1147(var114)) {
                        var115 = true;
                    }
                    if (!var115 && field1605 == 0) {
                        String var116 = var109.substring(var109.indexOf(":") + 1, var109.length() - 9);
                        method2192(8, var114, var116);
                    }
                } else if (var109.endsWith(":assistreq:")) {
                    String var117 = var109.substring(0, var109.indexOf(":"));
                    boolean var118 = false;
                    if (method1147(var117)) {
                        var118 = true;
                    }
                    if (!var118 && field1605 == 0) {
                        method2192(10, var117, "");
                    }
                } else if (var109.endsWith(":clan:")) {
                    String var119 = var109.substring(0, var109.indexOf(":clan:"));
                    method2192(11, "", var119);
                } else if (var109.endsWith(":trade:")) {
                    String var120 = var109.substring(0, var109.indexOf(":trade:"));
                    if (field1605 == 0) {
                        method2192(12, "", var120);
                    }
                } else if (var109.endsWith(":assist:")) {
                    String var121 = var109.substring(0, var109.indexOf(":assist:"));
                    if (field1605 == 0) {
                        method2192(13, "", var121);
                    }
                } else {
                    method2192(0, "", var109);
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 218) {
                int var122 = field1572.method860();
                int var123 = field1572.method720();
                int var124 = field1572.method860();
                int var125 = field1572.method722();
                class12 var126 = class12.method2369(var125);
                if (var126.field117 != var124 || var126.field120 != var123 || var126.field150 != var122) {
                    var126.field117 = var124;
                    var126.field120 = var123;
                    var126.field150 = var122;
                    method2390(var126);
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 92) {
                int var127 = field1572.method818();
                int var128 = field1572.method713();
                class12 var129 = class12.method2369(var127);
                if (var129.field163 != 1 || var129.field112 != var128) {
                    var129.field163 = 1;
                    var129.field112 = var128;
                    method2390(var129);
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 77) {
                String var130 = field1572.method688();
                long var131 = (long) field1572.method720();
                long var133 = (long) field1572.method728();
                int var135 = field1572.method726();
                long var136 = (var131 << 32) + var133;
                boolean var138 = false;
                for (int var139 = 0; var139 < 100; var139++) {
                    if (field1749[var139] == var136) {
                        var138 = true;
                        break;
                    }
                }
                if (method1147(var130)) {
                    var138 = true;
                }
                if (!var138 && field1605 == 0) {
                    field1749[field1750] = var136;
                    field1750 = (field1750 + 1) % 100;
                    String var140 = class25.method357(class91.method2844(class24.method3337(field1572)));
                    if (var135 == 2 || var135 == 3) {
                        method2192(7, class76.method2095(1) + var130, var140);
                    } else if (var135 == 1) {
                        method2192(7, class76.method2095(0) + var130, var140);
                    } else {
                        method2192(3, var130, var140);
                    }
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 254) {
                int var141 = field1572.method715();
                int var142 = field1572.method818();
                class12 var143 = class12.method2369(var142);
                if (var143.field115 != var141 || var141 == -1) {
                    var143.field115 = var141;
                    var143.field147 = 0;
                    var143.field186 = 0;
                    method2390(var143);
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 196) {
                method3111();
                field1696 = field1572.method683();
                field1794 = field1713;
                field1574 = -1;
                return true;
            }
            if (field1574 == 172) {
                field1722 = field1713;
                if (field1573 == 0) {
                    field1755 = null;
                    field1551 = null;
                    Statics.field768 = 0;
                    Statics.field2012 = null;
                    field1574 = -1;
                    return true;
                }
                field1551 = field1572.method688();
                long var144 = field1572.method871();
                long var146 = var144;
                String var148;
                if (var144 <= 0L || var144 >= 6582952005840035281L) {
                    var148 = null;
                } else if (var144 % 37L == 0L) {
                    var148 = null;
                } else {
                    int var149 = 0;
                    for (long var150 = var144; var150 != 0L; var150 /= 37L) {
                        var149++;
                    }
                    StringBuilder var152 = new StringBuilder(var149);
                    while (var146 != 0L) {
                        long var153 = var146;
                        var146 /= 37L;
                        var152.append(class103.field1437[(int) (var153 - var146 * 37L)]);
                    }
                    var148 = var152.reverse().toString();
                }
                field1755 = var148;
                Statics.field1326 = field1572.method681();
                int var155 = field1572.method726();
                if (var155 == 255) {
                    field1574 = -1;
                    return true;
                }
                Statics.field768 = var155;
                class54[] var156 = new class54[100];
                for (int var157 = 0; var157 < Statics.field768; var157++) {
                    var156[var157] = new class54();
                    var156[var157].field563 = field1572.method688();
                    var156[var157].field565 = class53.method1409(var156[var157].field563, Statics.field502);
                    var156[var157].field558 = field1572.method720();
                    var156[var157].field559 = field1572.method681();
                    field1572.method688();
                    if (var156[var157].field563.equals(Statics.field1320.field855)) {
                        Statics.field2035 = var156[var157].field559;
                    }
                }
                boolean var158 = false;
                int var159 = Statics.field768;
                while (var159 > 0) {
                    boolean var160 = true;
                    var159--;
                    for (int var161 = 0; var161 < var159; var161++) {
                        if (var156[var161].field565.compareTo(var156[var161 + 1].field565) > 0) {
                            class54 var162 = var156[var161];
                            var156[var161] = var156[var161 + 1];
                            var156[var161 + 1] = var162;
                            var160 = false;
                        }
                    }
                    if (var160) {
                        break;
                    }
                }
                Statics.field2012 = var156;
                field1574 = -1;
                return true;
            }
            if (field1574 == 214) {
                Statics.field1330 = field1572.method762();
                Statics.field618 = field1572.method703();
                for (int var163 = Statics.field618; var163 < Statics.field618 + 8; var163++) {
                    for (int var164 = Statics.field1330; var164 < Statics.field1330 + 8; var164++) {
                        if (field1586[Statics.field2252][var163][var164] != null) {
                            field1586[Statics.field2252][var163][var164] = null;
                            method547(var163, var164);
                        }
                    }
                }
                for (class65 var165 = (class65) field1665.method212(); var165 != null; var165 = (class65) field1665.method201()) {
                    if (var165.field713 >= Statics.field618 && var165.field713 < Statics.field618 + 8 && var165.field714 >= Statics.field1330 && var165.field714 < Statics.field1330 + 8 && Statics.field2252 == var165.field725) {
                        var165.field724 = 0;
                    }
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 217) {
                method1334();
                field1574 = -1;
                return false;
            }
            if (field1574 == 50) {
                while (field1572.field540 < field1573) {
                    boolean var166 = field1572.method726() == 1;
                    String var167 = field1572.method688();
                    String var168 = field1572.method688();
                    int var169 = field1572.method720();
                    int var170 = field1572.method726();
                    int var171 = field1572.method726();
                    boolean var172 = (var171 & 0x2) != 0;
                    boolean var173 = (var171 & 0x1) != 0;
                    if (var169 > 0) {
                        field1572.method688();
                        field1572.method726();
                        field1572.method685();
                    }
                    field1572.method688();
                    for (int var174 = 0; var174 < field1782; var174++) {
                        class94 var175 = field1784[var174];
                        if (var166) {
                            if (var168.equals(var175.field1321)) {
                                var175.field1321 = var167;
                                var175.field1315 = var168;
                                var167 = null;
                                break;
                            }
                        } else if (var167.equals(var175.field1321)) {
                            if (var175.field1316 != var169) {
                                boolean var176 = true;
                                for (class167 var177 = (class167) field1785.method235(); var177 != null; var177 = (class167) field1785.method238()) {
                                    if (var177.field2483.equals(var167)) {
                                        if (var169 != 0 && var177.field2487 == 0) {
                                            var177.method1124();
                                            var176 = false;
                                        } else if (var169 == 0 && var177.field2487 != 0) {
                                            var177.method1124();
                                            var176 = false;
                                        }
                                    }
                                }
                                if (var176) {
                                    field1785.method236(new class167(var167, var169));
                                }
                                var175.field1316 = var169;
                            }
                            var175.field1315 = var168;
                            var175.field1314 = var170;
                            var175.field1318 = var172;
                            var175.field1319 = var173;
                            var167 = null;
                            break;
                        }
                    }
                    if (var167 != null && field1782 < 400) {
                        class94 var178 = new class94();
                        field1784[field1782] = var178;
                        var178.field1321 = var167;
                        var178.field1315 = var168;
                        var178.field1316 = var169;
                        var178.field1314 = var170;
                        var178.field1318 = var172;
                        var178.field1319 = var173;
                        field1782++;
                    }
                }
                field1709 = 2;
                field1721 = field1713;
                boolean var179 = false;
                int var180 = field1782;
                while (var180 > 0) {
                    boolean var181 = true;
                    var180--;
                    for (int var182 = 0; var182 < var180; var182++) {
                        boolean var183 = false;
                        class94 var184 = field1784[var182];
                        class94 var185 = field1784[var182 + 1];
                        if (field1533 != var184.field1316 && field1533 == var185.field1316) {
                            var183 = true;
                        }
                        if (!var183 && var184.field1316 == 0 && var185.field1316 != 0) {
                            var183 = true;
                        }
                        if (!var183 && !var184.field1318 && var185.field1318) {
                            var183 = true;
                        }
                        if (!var183 && !var184.field1319 && var185.field1319) {
                            var183 = true;
                        }
                        if (var183) {
                            class94 var186 = field1784[var182];
                            field1784[var182] = field1784[var182 + 1];
                            field1784[var182 + 1] = var186;
                            var181 = false;
                        }
                    }
                    if (var181) {
                        break;
                    }
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 128) {
                field1709 = 1;
                field1721 = field1713;
                field1574 = -1;
                return true;
            }
            if (field1574 == 244) {
                int var187 = field1572.method685();
                int var188 = field1572.method720();
                if (var187 < -70000) {
                    var188 += 32768;
                }
                class12 var189;
                if (var187 >= 0) {
                    var189 = class12.method2369(var187);
                } else {
                    var189 = null;
                }
                while (field1572.field540 < field1573) {
                    int var190 = field1572.method754();
                    int var191 = field1572.method720();
                    int var192 = 0;
                    if (var191 != 0) {
                        var192 = field1572.method726();
                        if (var192 == 255) {
                            var192 = field1572.method685();
                        }
                    }
                    if (var189 != null && var190 >= 0 && var190 < var189.field127.length) {
                        var189.field127[var190] = var191;
                        var189.field169[var190] = var192;
                    }
                    class66.method892(var188, var190, var191 - 1, var192);
                }
                if (var189 != null) {
                    method2390(var189);
                }
                method3111();
                field1764[++field1717 - 1 & 0x1F] = var188 & 0x7FFF;
                field1574 = -1;
                return true;
            }
            if (field1574 == 203) {
                int var193 = field1572.method712();
                class66.method2306(var193);
                field1764[++field1717 - 1 & 0x1F] = var193 & 0x7FFF;
                field1574 = -1;
                return true;
            }
            if (field1574 == 67) {
                field1534 = field1572.method713() * 30;
                field1794 = field1713;
                field1574 = -1;
                return true;
            }
            if (field1574 == 150) {
                Statics.field618 = field1572.method726();
                Statics.field1330 = field1572.method705();
                while (field1572.field540 < field1573) {
                    field1574 = field1572.method726();
                    method1264();
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 109) {
                field1776 = false;
                for (int var194 = 0; var194 < 5; var194++) {
                    field1777[var194] = false;
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 55) {
                int var195 = field1572.method720();
                if (var195 == 65535) {
                    var195 = -1;
                }
                method1211(var195);
                field1574 = -1;
                return true;
            }
            if (field1574 == 195) {
                int var196 = field1572.method713();
                if (var196 == 65535) {
                    var196 = -1;
                }
                int var197 = field1572.method717();
                if (field1765 != 0 && var196 != -1) {
                    class97.method2017(Statics.field905, var196, 0, field1765, false);
                    field1767 = true;
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 170) {
                Statics.field618 = field1572.method762();
                Statics.field1330 = field1572.method762();
                field1574 = -1;
                return true;
            }
            if (field1574 == 117) {
                field1776 = true;
                Statics.field562 = field1572.method726();
                Statics.field748 = field1572.method726();
                Statics.field1279 = field1572.method720();
                Statics.field869 = field1572.method726();
                Statics.field743 = field1572.method726();
                if (Statics.field743 >= 100) {
                    Statics.field2127 = Statics.field562 * 128 + 64;
                    Statics.field799 = Statics.field748 * 128 + 64;
                    Statics.field653 = method1447(Statics.field2127, Statics.field799, Statics.field2252) - Statics.field1279;
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 30) {
                class9.method2006(field1572, field1573);
                field1574 = -1;
                return true;
            }
            if (field1574 == 171) {
                for (int var198 = 0; var198 < class71.field800.length; var198++) {
                    if (class71.field800[var198] != class71.field797[var198]) {
                        class71.field800[var198] = class71.field797[var198];
                        method1148(var198);
                        field1576[++field1715 - 1 & 0x1F] = var198;
                    }
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 207) {
                method1167(true);
                field1574 = -1;
                return true;
            }
            if (field1574 == 24) {
                int var199 = field1572.method860();
                field1690 = var199;
                method3128(var199);
                class82.method2051(field1690);
                for (int var200 = 0; var200 < 100; var200++) {
                    field1733[var200] = true;
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 40) {
                method3111();
                field1535 = field1572.method726();
                field1794 = field1713;
                field1574 = -1;
                return true;
            }
            if (field1574 == 12) {
                method1167(false);
                field1574 = -1;
                return true;
            }
            if (field1574 == 205) {
                int var201 = field1572.method720();
                int var202 = field1572.method722();
                class12 var203 = class12.method2369(var202);
                if (var203 != null && var203.field81 == 0) {
                    if (var201 > var203.field95 - var203.field89) {
                        var201 = var203.field95 - var203.field89;
                    }
                    if (var201 < 0) {
                        var201 = 0;
                    }
                    if (var203.field93 != var201) {
                        var203.field93 = var201;
                        method2390(var203);
                    }
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 5) {
                int var204 = field1572.method818();
                int var205 = field1572.method684();
                int var206 = field1572.method715();
                class12 var207 = class12.method2369(var204);
                int var208 = var207.field86 + var206;
                int var209 = var207.field182 + var205;
                if (var207.field176 != var208 || var207.field85 != var209) {
                    var207.field176 = var208;
                    var207.field85 = var209;
                    method2390(var207);
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 242) {
                int var210 = field1572.method722();
                class12 var211 = class12.method2369(var210);
                for (int var212 = 0; var212 < var211.field127.length; var212++) {
                    var211.field127[var212] = -1;
                    var211.field127[var212] = 0;
                }
                method2390(var211);
                field1574 = -1;
                return true;
            }
            if (field1574 == 166) {
                int var213 = field1572.method720();
                int var214 = field1572.method726();
                int var215 = field1572.method720();
                method3046(var213, var214, var215);
                field1574 = -1;
                return true;
            }
            if (field1574 == 10 || field1574 == 112 || field1574 == 189 || field1574 == 179 || field1574 == 70 || field1574 == 245 || field1574 == 69 || field1574 == 73 || field1574 == 8 || field1574 == 237 || field1574 == 17) {
                method1264();
                field1574 = -1;
                return true;
            }
            if (field1574 == 142) {
                field1776 = true;
                Statics.field20 = field1572.method726();
                Statics.field2472 = field1572.method726();
                Statics.field2476 = field1572.method720();
                Statics.field1446 = field1572.method726();
                Statics.field1853 = field1572.method726();
                if (Statics.field1853 >= 100) {
                    int var216 = Statics.field20 * 128 + 64;
                    int var217 = Statics.field2472 * 128 + 64;
                    int var218 = method1447(var216, var217, Statics.field2252) - Statics.field2476;
                    int var219 = var216 - Statics.field2127;
                    int var220 = var218 - Statics.field653;
                    int var221 = var217 - Statics.field799;
                    int var222 = (int) Math.sqrt((double) (var219 * var219 + var221 * var221));
                    Statics.field954 = (int) (Math.atan2((double) var220, (double) var222) * 325.949D) & 0x7FF;
                    Statics.field2849 = (int) (Math.atan2((double) var219, (double) var221) * -325.949D) & 0x7FF;
                    if (Statics.field954 < 128) {
                        Statics.field954 = 128;
                    }
                    if (Statics.field954 > 383) {
                        Statics.field954 = 383;
                    }
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 59) {
                while (field1572.field540 < field1573) {
                    int var223 = field1572.method726();
                    boolean var224 = (var223 & 0x1) == 1;
                    String var225 = field1572.method688();
                    String var226 = field1572.method688();
                    field1572.method688();
                    for (int var227 = 0; var227 < field1786; var227++) {
                        class104 var228 = field1787[var227];
                        if (var224) {
                            if (var226.equals(var228.field1450)) {
                                var228.field1450 = var225;
                                var228.field1439 = var226;
                                var225 = null;
                                break;
                            }
                        } else if (var225.equals(var228.field1450)) {
                            var228.field1450 = var225;
                            var228.field1439 = var226;
                            var225 = null;
                            break;
                        }
                    }
                    if (var225 != null && field1786 < 400) {
                        class104 var229 = new class104();
                        field1787[field1786] = var229;
                        var229.field1450 = var225;
                        var229.field1439 = var226;
                        field1786++;
                    }
                }
                field1721 = field1713;
                field1574 = -1;
                return true;
            }
            if (field1574 == 98) {
                String var230 = field1572.method688();
                int var231 = field1572.method685();
                class12 var232 = class12.method2369(var231);
                if (!var230.equals(var232.field122)) {
                    var232.field122 = var230;
                    method2390(var232);
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 220) {
                int var233 = field1572.method685();
                class80 var234 = (class80) field1691.method20((long) var233);
                if (var234 != null) {
                    method2908(var234, true);
                }
                if (field1694 != null) {
                    method2390(field1694);
                    field1694 = null;
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 72) {
                for (int var235 = 0; var235 < Statics.field2598; var235++) {
                    class175 var236 = class175.method1106(var235);
                    if (var236 != null && var236.field2596 == 0) {
                        class71.field797[var235] = 0;
                        class71.field800[var235] = 0;
                    }
                }
                method3111();
                field1715 += 32;
                field1574 = -1;
                return true;
            }
            if (field1574 == 140) {
                int var237 = field1572.method818();
                class12 var238 = class12.method2369(var237);
                var238.field163 = 3;
                var238.field112 = Statics.field1320.field863.method173();
                method2390(var238);
                field1574 = -1;
                return true;
            }
            if (field1574 == 199) {
                int var239 = field1572.method818();
                int var240 = field1572.method720();
                int var241 = field1572.method762();
                class80 var242 = (class80) field1691.method20((long) var239);
                if (var242 != null) {
                    method2908(var242, var242.field929 != var240);
                }
                method961(var239, var240, var241);
                field1574 = -1;
                return true;
            }
            if (field1574 == 76) {
                field1628 = 0;
                field1574 = -1;
                return true;
            }
            if (field1574 == 79) {
                int var243 = field1572.method685();
                int var244 = field1572.method720();
                if (var243 < -70000) {
                    var244 += 32768;
                }
                class12 var245;
                if (var243 >= 0) {
                    var245 = class12.method2369(var243);
                } else {
                    var245 = null;
                }
                if (var245 != null) {
                    for (int var246 = 0; var246 < var245.field127.length; var246++) {
                        var245.field127[var246] = 0;
                        var245.field169[var246] = 0;
                    }
                }
                class66 var247 = (class66) class66.field736.method20((long) var244);
                if (var247 != null) {
                    for (int var248 = 0; var248 < var247.field727.length; var248++) {
                        var247.field727[var248] = -1;
                        var247.field729[var248] = 0;
                    }
                }
                int var249 = field1572.method720();
                for (int var250 = 0; var250 < var249; var250++) {
                    int var251 = field1572.method703();
                    if (var251 == 255) {
                        var251 = field1572.method722();
                    }
                    int var252 = field1572.method712();
                    if (var245 != null && var250 < var245.field127.length) {
                        var245.field127[var250] = var252;
                        var245.field169[var250] = var251;
                    }
                    class66.method892(var244, var250, var252 - 1, var251);
                }
                if (var245 != null) {
                    method2390(var245);
                }
                method3111();
                field1764[++field1717 - 1 & 0x1F] = var244 & 0x7FFF;
                field1574 = -1;
                return true;
            }
            if (field1574 == 167) {
                int var253 = field1572.method818();
                int var254 = field1572.method712();
                if (var254 == 65535) {
                    var254 = -1;
                }
                int var255 = field1572.method722();
                class12 var256 = class12.method2369(var255);
                if (var256.field78) {
                    var256.field183 = var254;
                    var256.field184 = var253;
                    class176 var258 = class176.method3351(var254);
                    var256.field117 = var258.field2623;
                    var256.field120 = var258.field2617;
                    var256.field79 = var258.field2618;
                    var256.field121 = var258.field2619;
                    var256.field118 = var258.field2620;
                    var256.field150 = var258.field2615;
                    if (var256.field88 > 0) {
                        var256.field150 = var256.field150 * 32 / var256.field88;
                    }
                    method2390(var256);
                } else if (var254 == -1) {
                    var256.field163 = 0;
                    field1574 = -1;
                    return true;
                } else {
                    class176 var257 = class176.method3351(var254);
                    var256.field163 = 4;
                    var256.field112 = var254;
                    var256.field117 = var257.field2623;
                    var256.field120 = var257.field2617;
                    var256.field150 = var257.field2615 * 100 / var253;
                    method2390(var256);
                }
                field1574 = -1;
                return true;
            }
            if (field1574 == 132) {
                int var259 = field1572.method726();
                class64[] var260 = new class64[] { class64.field703, class64.field707, class64.field708 };
                class64[] var261 = var260;
                int var262 = 0;
                class64 var264;
                while (true) {
                    if (var262 >= var261.length) {
                        var264 = null;
                        break;
                    }
                    class64 var263 = var261[var262];
                    if (var263.field705 == var259) {
                        var264 = var263;
                        break;
                    }
                    var262++;
                }
                Statics.field396 = var264;
                field1574 = -1;
                return true;
            }
            if (field1574 == 101) {
                int var265 = field1572.method721();
                Statics.field450 = Statics.field1999.method2072(var265);
                field1574 = -1;
                return true;
            }
            if (field1574 == 235) {
                field1699 = field1572.method726();
                field1748 = field1572.method726();
                field1574 = -1;
                return true;
            }
            if (field1574 == 120) {
                int var266 = field1572.method703();
                int var267 = field1572.method705();
                int var268 = field1572.method705();
                Statics.field2252 = var267 >> 1;
                Statics.field1320.method3112(var268, var266, (var267 & 0x1) == 1);
                field1574 = -1;
                return true;
            }
            if (field1574 == 114) {
                String var269 = field1572.method688();
                int var270 = field1572.method720();
                byte var271 = field1572.method681();
                boolean var272 = false;
                if (var271 == -128) {
                    var272 = true;
                }
                if (var272) {
                    if (Statics.field768 == 0) {
                        field1574 = -1;
                        return true;
                    }
                    boolean var273 = false;
                    int var274;
                    for (var274 = 0; var274 < Statics.field768 && (!Statics.field2012[var274].field563.equals(var269) || Statics.field2012[var274].field558 != var270); var274++) {
                    }
                    if (var274 < Statics.field768) {
                        while (var274 < Statics.field768 - 1) {
                            Statics.field2012[var274] = Statics.field2012[var274 + 1];
                            var274++;
                        }
                        Statics.field768--;
                        Statics.field2012[Statics.field768] = null;
                    }
                } else {
                    field1572.method688();
                    class54 var275 = new class54();
                    var275.field563 = var269;
                    var275.field565 = class53.method1409(var275.field563, Statics.field502);
                    var275.field558 = var270;
                    var275.field559 = var271;
                    int var276;
                    for (var276 = Statics.field768 - 1; var276 >= 0; var276--) {
                        int var277 = Statics.field2012[var276].field565.compareTo(var275.field563);
                        if (var277 == 0) {
                            Statics.field2012[var276].field558 = var270;
                            Statics.field2012[var276].field559 = var271;
                            if (var269.equals(Statics.field1320.field855)) {
                                Statics.field2035 = var271;
                            }
                            field1722 = field1713;
                            field1574 = -1;
                            return true;
                        }
                        if (var277 < 0) {
                            break;
                        }
                    }
                    if (Statics.field768 >= Statics.field2012.length) {
                        field1574 = -1;
                        return true;
                    }
                    for (int var278 = Statics.field768 - 1; var278 > var276; var278--) {
                        Statics.field2012[var278 + 1] = Statics.field2012[var278];
                    }
                    if (Statics.field768 == 0) {
                        Statics.field2012 = new class54[100];
                    }
                    Statics.field2012[var276 + 1] = var275;
                    Statics.field768++;
                    if (var269.equals(Statics.field1320.field855)) {
                        Statics.field2035 = var271;
                    }
                }
                field1722 = field1713;
                field1574 = -1;
                return true;
            }
            class136.method1127("" + field1574 + class76.field874 + field1579 + class76.field874 + field1580 + class76.field874 + field1573, (Throwable) null);
            method1334();
        } catch (IOException var284) {
            if (field1714 > 0) {
                method1334();
            } else {
                method897(40);
                Statics.field733 = Statics.field2080;
                Statics.field2080 = null;
            }
        } catch (Exception var285) {
            String var281 = "" + field1574 + class76.field874 + field1579 + class76.field874 + field1580 + class76.field874 + field1573 + class76.field874 + (Statics.field2043 + Statics.field1320.field2676[0]) + class76.field874 + (Statics.field403 + Statics.field1320.field2716[0]) + class76.field874;
            for (int var282 = 0; var282 < field1573 && var282 < 50; var282++) {
                var281 = var281 + field1572.field541[var282] + class76.field874;
            }
            class136.method1127(var281, var285);
            method1334();
        }
        return true;
    }

    @ObfuscatedName("cs.at(IIIIII)V")
    public static final void method2387(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field260.method1611(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field260.method1505(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2434.field2346;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class182 var13 = class182.method3383(var12);
            if (var13.field2783 == -1) {
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
                class148 var14 = Statics.field769[var13.field2783];
                if (var14 != null) {
                    int var15 = (var13.field2777 * 4 - var14.field2239) / 2;
                    int var16 = (var13.field2769 * 4 - var14.field2237) / 2;
                    var14.method2463(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field2769) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field260.method1554(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field260.method1505(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class182 var22 = class182.method3383(var21);
            if (var22.field2783 != -1) {
                class148 var23 = Statics.field769[var22.field2783];
                if (var23 != null) {
                    int var24 = (var22.field2777 * 4 - var23.field2239) / 2;
                    int var25 = (var22.field2769 * 4 - var23.field2237) / 2;
                    var23.method2463(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field2769) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2434.field2346;
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
        int var29 = Statics.field260.method1528(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class182 var31 = class182.method3383(var30);
        if (var31.field2783 == -1) {
            return;
        }
        class148 var32 = Statics.field769[var31.field2783];
        if (var32 != null) {
            int var33 = (var31.field2777 * 4 - var32.field2239) / 2;
            int var34 = (var31.field2769 * 4 - var32.field2237) / 2;
            var32.method2463(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field2769) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("cr.cr(Lfi;I)V")
    public static void method2390(class12 arg0) {
        if (field1732 == arg0.field195) {
            field1733[arg0.field194] = true;
        }
    }

    @ObfuscatedName("cl.bt(B)V")
    public static final void method2516() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field1627 - 1; var1++) {
                if (field1676[var1] < 1000 && field1676[var1 + 1] > 1000) {
                    String var2 = field1556[var1];
                    field1556[var1] = field1556[var1 + 1];
                    field1556[var1 + 1] = var2;
                    String var3 = field1678[var1];
                    field1678[var1] = field1678[var1 + 1];
                    field1678[var1 + 1] = var3;
                    int var4 = field1676[var1];
                    field1676[var1] = field1676[var1 + 1];
                    field1676[var1 + 1] = var4;
                    int var5 = field1674[var1];
                    field1674[var1] = field1674[var1 + 1];
                    field1674[var1 + 1] = var5;
                    int var6 = field1718[var1];
                    field1718[var1] = field1718[var1 + 1];
                    field1718[var1 + 1] = var6;
                    int var7 = field1761[var1];
                    field1761[var1] = field1761[var1 + 1];
                    field1761[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ch.df(IIIILce;S)V")
    public static final void method2578(int arg0, int arg1, int arg2, int arg3, class156 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field1617 + field1604 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class153.field2293[var5];
        int var8 = class153.field2299[var5];
        int var9 = var7 * 256 / (field1561 + 256);
        int var10 = var8 * 256 / (field1561 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method2613(Statics.field1915, arg0 + 94 + var11 - arg4.field2348 / 2 + 4, arg1 + 83 - var12 - arg4.field2344 / 2 - 4);
        } else {
            arg4.method2591(arg0 + 94 + var11 - arg4.field2348 / 2 + 4, arg1 + 83 - var12 - arg4.field2344 / 2 - 4);
        }
    }

    @ObfuscatedName("as.bb(IIII)V")
    public static void method2843(int arg0, int arg1, int arg2) {
        class12 var3 = class12.method2328(arg0, arg1);
        if (var3 != null && var3.field157 != null) {
            class61 var4 = new class61();
            var4.field662 = var3;
            var4.field664 = var3.field157;
            class82.method1110(var4);
        }
        field1530 = true;
        Statics.field2039 = arg0;
        field1687 = arg1;
        Statics.field561 = arg2;
        method2390(var3);
    }

    @ObfuscatedName("ar.bp(IB)Z")
    public static final boolean method2846(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field1676[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("aq.dv(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method2904(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field1741[var4] = field1741[var4 - 1];
            field1737[var4] = field1737[var4 - 1];
            field1668[var4] = field1668[var4 - 1];
            field1743[var4] = field1743[var4 - 1];
        }
        field1741[0] = arg0;
        field1737[0] = arg1;
        field1668[0] = arg2;
        field1743[0] = arg3;
        field1745++;
        field1720 = field1713;
    }

    @ObfuscatedName("ax.cw(Lw;ZB)V")
    public static final void method2908(class80 arg0, boolean arg1) {
        int var2 = arg0.field929;
        int var3 = (int) arg0.field213;
        arg0.method234();
        if (arg1 && var2 != -1 && Statics.field2091[var2]) {
            Statics.field70.method1278(var2);
            if (Statics.field173[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field173[var2].length; var5++) {
                    if (Statics.field173[var2][var5] != null) {
                        if (Statics.field173[var2][var5].field81 == 2) {
                            var4 = false;
                        } else {
                            Statics.field173[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field173[var2] = null;
                }
                Statics.field2091[var2] = false;
            }
        }
        method1434(var2);
        class12 var6 = class12.method2369(var3);
        if (var6 != null) {
            method2390(var6);
        }
        method1453();
        if (field1690 != -1) {
            int var7 = field1690;
            if (class12.method536(var7)) {
                method2373(Statics.field173[var7], 1);
            }
        }
    }

    @ObfuscatedName("aw.dq(Lfi;I)I")
    public static int method2929(class12 arg0) {
        class1 var1 = (class1) field1582.method20(((long) arg0.field128 << 32) + (long) arg0.field80);
        return var1 == null ? arg0.field138 : var1.field1;
    }

    @ObfuscatedName("aw.al(ZI)V")
    public static final void method2930(boolean arg0) {
        method1142();
        field1752++;
        if (field1752 < 50 && !arg0) {
            return;
        }
        field1752 = 0;
        if (field1652 || Statics.field2080 == null) {
            return;
        }
        field1570.method653(146);
        try {
            Statics.field2080.method2293(field1570.field541, 0, field1570.field540);
            field1570.field540 = 0;
        } catch (IOException var2) {
            field1652 = true;
        }
    }

    @ObfuscatedName("ak.u(I)V")
    public static final void method2978() {
        if (field1534 > 1) {
            field1534--;
        }
        if (field1714 > 0) {
            field1714--;
        }
        if (field1652) {
            field1652 = false;
            if (field1714 > 0) {
                method1334();
            } else {
                method897(40);
                Statics.field733 = Statics.field2080;
                Statics.field2080 = null;
            }
            return;
        }
        for (int var0 = 0; var0 < 100 && method2383(); var0++) {
        }
        if (field1539 != 30) {
            return;
        }
        class9.method1456(field1570, 20);
        Object var1 = Statics.field735.field1384;
        synchronized (Statics.field735.field1384) {
            if (!field1643) {
                Statics.field735.field1385 = 0;
            } else if (class108.field1807 != 0 || Statics.field735.field1385 >= 40) {
                field1570.method653(108);
                field1570.method666(0);
                int var2 = field1570.field540;
                int var3 = 0;
                for (int var4 = 0; var4 < Statics.field735.field1385 && field1570.field540 - var2 < 240; var4++) {
                    var3++;
                    int var5 = Statics.field735.field1379[var4];
                    if (var5 < 0) {
                        var5 = 0;
                    } else if (var5 > 502) {
                        var5 = 502;
                    }
                    int var6 = Statics.field735.field1381[var4];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 764) {
                        var6 = 764;
                    }
                    int var7 = var5 * 765 + var6;
                    if (Statics.field735.field1379[var4] == -1 && Statics.field735.field1381[var4] == -1) {
                        var6 = -1;
                        var5 = -1;
                        var7 = 524287;
                    }
                    if (field1543 != var6 || field1606 != var5) {
                        int var8 = var6 - field1543;
                        field1543 = var6;
                        int var9 = var5 - field1606;
                        field1606 = var5;
                        if (field1545 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                            var8 += 32;
                            var9 += 32;
                            field1570.method667((field1545 << 12) + (var8 << 6) + var9);
                            field1545 = 0;
                        } else if (field1545 < 8) {
                            field1570.method668((field1545 << 19) + 8388608 + var7);
                            field1545 = 0;
                        } else {
                            field1570.method669((field1545 << 19) + -1073741824 + var7);
                            field1545 = 0;
                        }
                    } else if (field1545 < 2047) {
                        field1545++;
                    }
                }
                field1570.method677(field1570.field540 - var2);
                if (var3 >= Statics.field735.field1385) {
                    Statics.field735.field1385 = 0;
                } else {
                    Statics.field735.field1385 -= var3;
                    for (int var10 = 0; var10 < Statics.field735.field1385; var10++) {
                        Statics.field735.field1381[var10] = Statics.field735.field1381[var3 + var10];
                        Statics.field735.field1379[var10] = Statics.field735.field1379[var3 + var10];
                    }
                }
            }
        }
        if (class108.field1807 != 0) {
            long var12 = (class108.field1810 - field1542 * -1L) / 50L;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            field1542 = class108.field1810 * -1L;
            int var14 = class108.field1809;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            int var15 = class108.field1808;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var16 = var14 * 765 + var15;
            byte var17 = 0;
            if (class108.field1807 == 2) {
                var17 = 1;
            }
            int var18 = (int) var12;
            field1570.method653(64);
            field1570.method669((var17 << 19) + (var18 << 20) + var16);
        }
        if (class113.field1883 > 0) {
            field1570.method653(222);
            field1570.method667(0);
            int var19 = field1570.field540;
            long var20 = class38.method2385();
            for (int var22 = 0; var22 < class113.field1883; var22++) {
                long var23 = var20 - field1754;
                if (var23 > 16777215L) {
                    var23 = 16777215L;
                }
                field1754 = var20;
                field1570.method830(class113.field1882[var22]);
                field1570.method716((int) var23);
            }
            field1570.method676(field1570.field540 - var19);
        }
        if (field1620 > 0) {
            field1620--;
        }
        if (class113.field1876[96] || class113.field1876[97] || class113.field1876[98] || class113.field1876[99]) {
            field1621 = true;
        }
        if (field1621 && field1620 <= 0) {
            field1620 = 20;
            field1621 = false;
            field1570.method653(79);
            field1570.method708(field1617);
            field1570.method667(field1616);
        }
        if (Statics.field666 && !field1546) {
            field1546 = true;
            field1570.method653(167);
            field1570.method666(1);
        }
        if (!Statics.field666 && field1546) {
            field1546 = false;
            field1570.method653(167);
            field1570.method666(0);
        }
        if (field1537 && Statics.field2252 != field1710) {
            Statics.method1202(Statics.field1254, Statics.field971, Statics.field2252, Statics.field1320.field2676[0], Statics.field1320.field2716[0]);
        } else if (Statics.field2252 != field1550) {
            field1550 = Statics.field2252;
            method1215(Statics.field2252);
        }
        if (field1539 != 30) {
            return;
        }
        for (class65 var25 = (class65) field1665.method212(); var25 != null; var25 = (class65) field1665.method201()) {
            if (var25.field724 > 0) {
                var25.field724--;
            }
            if (var25.field724 != 0) {
                if (var25.field711 > 0) {
                    var25.field711--;
                }
                if (var25.field711 == 0 && var25.field713 >= 1 && var25.field714 >= 1 && var25.field713 <= 102 && var25.field714 <= 102 && (var25.field715 < 0 || class88.method1105(var25.field715, var25.field720))) {
                    method953(var25.field725, var25.field712, var25.field713, var25.field714, var25.field715, var25.field719, var25.field720);
                    var25.field711 = -1;
                    if (var25.field718 == var25.field715 && var25.field718 == -1) {
                        var25.method234();
                    } else if (var25.field718 == var25.field715 && var25.field719 == var25.field716 && var25.field720 == var25.field717) {
                        var25.method234();
                    }
                }
            } else if (var25.field718 < 0 || class88.method1105(var25.field718, var25.field717)) {
                method953(var25.field725, var25.field712, var25.field713, var25.field714, var25.field718, var25.field716, var25.field717);
                var25.method234();
            }
        }
        int var10002;
        for (int var26 = 0; var26 < field1770; var26++) {
            var10002 = field1773[var26]--;
            if (field1773[var26] >= -10) {
                class118 var28 = field1775[var26];
                if (var28 == null) {
                    class118 var10000 = (class118) null;
                    var28 = class118.method2123(Statics.field738, field1771[var26], 0);
                    if (var28 == null) {
                        continue;
                    }
                    field1773[var26] += var28.method2118();
                    field1775[var26] = var28;
                }
                if (field1773[var26] < 0) {
                    int var35;
                    if (field1704[var26] == 0) {
                        var35 = field1779;
                    } else {
                        int var29 = (field1704[var26] & 0xFF) * 128;
                        int var30 = field1704[var26] >> 16 & 0xFF;
                        int var31 = var30 * 128 + 64 - Statics.field1320.field2707;
                        if (var31 < 0) {
                            var31 = -var31;
                        }
                        int var32 = field1704[var26] >> 8 & 0xFF;
                        int var33 = var32 * 128 + 64 - Statics.field1320.field2664;
                        if (var33 < 0) {
                            var33 = -var33;
                        }
                        int var34 = var31 + var33 - 128;
                        if (var34 > var29) {
                            field1773[var26] = -100;
                            continue;
                        }
                        if (var34 < 0) {
                            var34 = 0;
                        }
                        var35 = field1769 * (var29 - var34) / var29;
                    }
                    if (var35 > 0) {
                        class120 var36 = var28.method2113().method2128(Statics.field1249);
                        class181 var37 = class181.method3153(var36, 100, var35);
                        var37.method3238(field1772[var26] - 1);
                        Statics.field675.method2799(var37);
                    }
                    field1773[var26] = -100;
                }
            } else {
                field1770--;
                for (int var27 = var26; var27 < field1770; var27++) {
                    field1771[var27] = field1771[var27 + 1];
                    field1775[var27] = field1775[var27 + 1];
                    field1772[var27] = field1772[var27 + 1];
                    field1773[var27] = field1773[var27 + 1];
                    field1704[var27] = field1704[var27 + 1];
                }
                var26--;
            }
        }
        if (field1767) {
            boolean var38;
            if (class97.field1365 == 0) {
                var38 = Statics.field47.method970();
            } else {
                var38 = true;
            }
            if (!var38) {
                if (field1765 != 0 && field1766 != -1) {
                    class97.method2017(Statics.field1383, field1766, 0, field1765, false);
                }
                field1767 = false;
            }
        }
        field1791++;
        if (field1791 <= 750) {
            for (int var39 = -1; var39 < field1651; var39++) {
                int var40;
                if (var39 == -1) {
                    var40 = 2047;
                } else {
                    var40 = field1731[var39];
                }
                class74 var41 = field1650[var40];
                if (var41 != null) {
                    method54(var41, 1);
                }
            }
            Statics.method3342();
            for (int var42 = -1; var42 < field1651; var42++) {
                int var43;
                if (var42 == -1) {
                    var43 = 2047;
                } else {
                    var43 = field1731[var42];
                }
                class74 var44 = field1650[var43];
                if (var44 != null && var44.field2665 > 0) {
                    var44.field2665--;
                    if (var44.field2665 == 0) {
                        var44.field2684 = null;
                    }
                }
            }
            for (int var45 = 0; var45 < field1568; var45++) {
                int var46 = field1569[var45];
                class62 var47 = field1567[var46];
                if (var47 != null && var47.field2665 > 0) {
                    var47.field2665--;
                    if (var47.field2665 == 0) {
                        var47.field2684 = null;
                    }
                }
            }
            field1609++;
            if (field1640 != 0) {
                field1639 += 20;
                if (field1639 >= 400) {
                    field1640 = 0;
                }
            }
            if (Statics.field1463 != null) {
                field1641++;
                if (field1641 >= 15) {
                    method2390(Statics.field1463);
                    Statics.field1463 = null;
                }
            }
            if (Statics.field1466 != null) {
                method2390(Statics.field1466);
                field1680++;
                if (class108.field1801 > field1644 + 5 || class108.field1801 < field1644 - 5 || class108.field1802 > field1645 + 5 || class108.field1802 < field1645 - 5) {
                    field1725 = true;
                }
                if (class108.field1800 == 0) {
                    if (field1725 && field1680 >= 5) {
                        if (Statics.field2490 == Statics.field1466 && field1662 != field1648) {
                            class12 var48 = Statics.field1466;
                            byte var49 = 0;
                            if (field1583 == 1 && var48.field126 == 206) {
                                var49 = 1;
                            }
                            if (var48.field127[field1648] <= 0) {
                                var49 = 0;
                            }
                            int var50 = method2929(var48);
                            boolean var51 = (var50 >> 29 & 0x1) != 0;
                            if (var51) {
                                int var52 = field1662;
                                int var53 = field1648;
                                var48.field127[var53] = var48.field127[var52];
                                var48.field169[var53] = var48.field169[var52];
                                var48.field127[var52] = -1;
                                var48.field169[var52] = 0;
                            } else if (var49 == 1) {
                                int var54 = field1662;
                                int var55 = field1648;
                                while (var54 != var55) {
                                    if (var54 > var55) {
                                        var48.method136(var54 - 1, var54);
                                        var54--;
                                    } else if (var54 < var55) {
                                        var48.method136(var54 + 1, var54);
                                        var54++;
                                    }
                                }
                            } else {
                                var48.method136(field1648, field1662);
                            }
                            field1570.method653(138);
                            field1570.method710(field1648);
                            field1570.method819(Statics.field1466.field128);
                            field1570.method709(field1662);
                            field1570.method702(var49);
                        }
                    } else if ((field1671 == 1 || method2846(field1627 - 1)) && field1627 > 2) {
                        method537();
                    } else if (field1627 > 0) {
                        method548(field1627 - 1);
                    }
                    field1641 = 10;
                    class108.field1807 = 0;
                    Statics.field1466 = null;
                }
            }
            class12 var56 = Statics.field2186;
            class12 var57 = Statics.field2179;
            Statics.field2186 = null;
            Statics.field2179 = null;
            field1716 = null;
            field1757 = false;
            field1706 = false;
            field1679 = 0;
            while (true) {
                class113 var58 = class113.field1865;
                boolean var59;
                synchronized (class113.field1865) {
                    if (class113.field1884 == class113.field1868) {
                        var59 = false;
                    } else {
                        Statics.field1444 = class113.field1881[class113.field1884];
                        Statics.field2265 = class113.field1880[class113.field1884];
                        class113.field1884 = class113.field1884 + 1 & 0x7F;
                        var59 = true;
                    }
                }
                if (!var59 || field1679 >= 128) {
                    int var61 = field1690;
                    if (class12.method536(var61)) {
                        method1101(Statics.field173[var61], -1, 0, 0, 765, 503, 0, 0);
                    }
                    field1713++;
                    while (true) {
                        class61 var62;
                        class12 var63;
                        class12 var64;
                        do {
                            var62 = (class61) field1728.method197();
                            if (var62 == null) {
                                while (true) {
                                    class61 var65;
                                    class12 var66;
                                    class12 var67;
                                    do {
                                        var65 = (class61) field1729.method197();
                                        if (var65 == null) {
                                            while (true) {
                                                class61 var68;
                                                class12 var69;
                                                class12 var70;
                                                do {
                                                    var68 = (class61) field1759.method197();
                                                    if (var68 == null) {
                                                        if (field1701 != null) {
                                                            method2332();
                                                        }
                                                        if (class107.field1503 != -1) {
                                                            int var71 = class107.field1503;
                                                            int var72 = class107.field1506;
                                                            boolean var73 = method1173(Statics.field1320.field2676[0], Statics.field1320.field2716[0], var71, var72, true, 0, 0, 0, 0, 0, 0);
                                                            class107.field1503 = -1;
                                                            if (var73) {
                                                                field1571 = class108.field1808;
                                                                field1638 = class108.field1809;
                                                                field1640 = 1;
                                                                field1639 = 0;
                                                            }
                                                        }
                                                        method3030();
                                                        if (Statics.field2186 != var56) {
                                                            if (var56 != null) {
                                                                method2390(var56);
                                                            }
                                                            if (Statics.field2186 != null) {
                                                                method2390(Statics.field2186);
                                                            }
                                                        }
                                                        if (Statics.field2179 != var57 && field1683 == field1682) {
                                                            if (var57 != null) {
                                                                method2390(var57);
                                                            }
                                                            if (Statics.field2179 != null) {
                                                                method2390(Statics.field2179);
                                                            }
                                                        }
                                                        if (Statics.field2179 == null) {
                                                            if (field1682 > 0) {
                                                                field1682--;
                                                            }
                                                        } else if (field1682 < field1683) {
                                                            field1682++;
                                                            if (field1683 == field1682) {
                                                                method2390(Statics.field2179);
                                                            }
                                                        }
                                                        method2276();
                                                        if (field1776) {
                                                            int var74 = Statics.field562 * 128 + 64;
                                                            int var75 = Statics.field748 * 128 + 64;
                                                            int var76 = method1447(var74, var75, Statics.field2252) - Statics.field1279;
                                                            if (Statics.field2127 < var74) {
                                                                Statics.field2127 += Statics.field743 * (var74 - Statics.field2127) / 1000 + Statics.field869;
                                                                if (Statics.field2127 > var74) {
                                                                    Statics.field2127 = var74;
                                                                }
                                                            }
                                                            if (Statics.field2127 > var74) {
                                                                Statics.field2127 -= Statics.field743 * (Statics.field2127 - var74) / 1000 + Statics.field869;
                                                                if (Statics.field2127 < var74) {
                                                                    Statics.field2127 = var74;
                                                                }
                                                            }
                                                            if (Statics.field653 < var76) {
                                                                Statics.field653 += Statics.field743 * (var76 - Statics.field653) / 1000 + Statics.field869;
                                                                if (Statics.field653 > var76) {
                                                                    Statics.field653 = var76;
                                                                }
                                                            }
                                                            if (Statics.field653 > var76) {
                                                                Statics.field653 -= Statics.field743 * (Statics.field653 - var76) / 1000 + Statics.field869;
                                                                if (Statics.field653 < var76) {
                                                                    Statics.field653 = var76;
                                                                }
                                                            }
                                                            if (Statics.field799 < var75) {
                                                                Statics.field799 += Statics.field743 * (var75 - Statics.field799) / 1000 + Statics.field869;
                                                                if (Statics.field799 > var75) {
                                                                    Statics.field799 = var75;
                                                                }
                                                            }
                                                            if (Statics.field799 > var75) {
                                                                Statics.field799 -= Statics.field743 * (Statics.field799 - var75) / 1000 + Statics.field869;
                                                                if (Statics.field799 < var75) {
                                                                    Statics.field799 = var75;
                                                                }
                                                            }
                                                            int var77 = Statics.field20 * 128 + 64;
                                                            int var78 = Statics.field2472 * 128 + 64;
                                                            int var79 = method1447(var77, var78, Statics.field2252) - Statics.field2476;
                                                            int var80 = var77 - Statics.field2127;
                                                            int var81 = var79 - Statics.field653;
                                                            int var82 = var78 - Statics.field799;
                                                            int var83 = (int) Math.sqrt((double) (var80 * var80 + var82 * var82));
                                                            int var84 = (int) (Math.atan2((double) var81, (double) var83) * 325.949D) & 0x7FF;
                                                            int var85 = (int) (Math.atan2((double) var80, (double) var82) * -325.949D) & 0x7FF;
                                                            if (var84 < 128) {
                                                                var84 = 128;
                                                            }
                                                            if (var84 > 383) {
                                                                var84 = 383;
                                                            }
                                                            if (Statics.field954 < var84) {
                                                                Statics.field954 += Statics.field1853 * (var84 - Statics.field954) / 1000 + Statics.field1446;
                                                                if (Statics.field954 > var84) {
                                                                    Statics.field954 = var84;
                                                                }
                                                            }
                                                            if (Statics.field954 > var84) {
                                                                Statics.field954 -= Statics.field1853 * (Statics.field954 - var84) / 1000 + Statics.field1446;
                                                                if (Statics.field954 < var84) {
                                                                    Statics.field954 = var84;
                                                                }
                                                            }
                                                            int var86 = var85 - Statics.field2849;
                                                            if (var86 > 1024) {
                                                                var86 -= 2048;
                                                            }
                                                            if (var86 < -1024) {
                                                                var86 += 2048;
                                                            }
                                                            if (var86 > 0) {
                                                                Statics.field2849 += Statics.field1853 * var86 / 1000 + Statics.field1446;
                                                                Statics.field2849 &= 0x7FF;
                                                            }
                                                            if (var86 < 0) {
                                                                Statics.field2849 -= Statics.field1853 * -var86 / 1000 + Statics.field1446;
                                                                Statics.field2849 &= 0x7FF;
                                                            }
                                                            int var87 = var85 - Statics.field2849;
                                                            if (var87 > 1024) {
                                                                var87 -= 2048;
                                                            }
                                                            if (var87 < -1024) {
                                                                var87 += 2048;
                                                            }
                                                            if (var87 < 0 && var86 > 0 || var87 > 0 && var86 < 0) {
                                                                Statics.field2849 = var85;
                                                            }
                                                        }
                                                        for (int var88 = 0; var88 < 5; var88++) {
                                                            var10002 = field1659[var88]++;
                                                        }
                                                        int var89 = class108.method2513();
                                                        int var90 = class113.method2907();
                                                        if (var89 > 15000 && var90 > 15000) {
                                                            field1714 = 250;
                                                            class108.method2309(14500);
                                                            field1570.method653(139);
                                                        }
                                                        field1612++;
                                                        if (field1612 > 500) {
                                                            field1612 = 0;
                                                            int var91 = (int) (Math.random() * 8.0D);
                                                            if ((var91 & 0x1) == 1) {
                                                                field1597 += field1598;
                                                            }
                                                            if ((var91 & 0x2) == 2) {
                                                                field1599 += field1600;
                                                            }
                                                            if ((var91 & 0x4) == 4) {
                                                                field1726 += field1602;
                                                            }
                                                        }
                                                        if (field1597 < -50) {
                                                            field1598 = 2;
                                                        }
                                                        if (field1597 > 50) {
                                                            field1598 = -2;
                                                        }
                                                        if (field1599 < -55) {
                                                            field1600 = 2;
                                                        }
                                                        if (field1599 > 55) {
                                                            field1600 = -2;
                                                        }
                                                        if (field1726 < -40) {
                                                            field1602 = 1;
                                                        }
                                                        if (field1726 > 40) {
                                                            field1602 = -1;
                                                        }
                                                        field1608++;
                                                        if (field1608 > 500) {
                                                            field1608 = 0;
                                                            int var92 = (int) (Math.random() * 8.0D);
                                                            if ((var92 & 0x1) == 1) {
                                                                field1604 += field1673;
                                                            }
                                                            if ((var92 & 0x2) == 2) {
                                                                field1561 += field1607;
                                                            }
                                                        }
                                                        if (field1604 < -60) {
                                                            field1673 = 2;
                                                        }
                                                        if (field1604 > 60) {
                                                            field1673 = -2;
                                                        }
                                                        if (field1561 < -20) {
                                                            field1607 = 1;
                                                        }
                                                        if (field1561 > 10) {
                                                            field1607 = -1;
                                                        }
                                                        for (class167 var93 = (class167) field1785.method235(); var93 != null; var93 = (class167) field1785.method238()) {
                                                            if ((long) var93.field2491 < class38.method2385() / 1000L - 5L) {
                                                                if (var93.field2487 > 0) {
                                                                    method2192(5, "", var93.field2483 + class85.field1118);
                                                                }
                                                                if (var93.field2487 == 0) {
                                                                    method2192(5, "", var93.field2483 + class85.field1007);
                                                                }
                                                                var93.method1124();
                                                            }
                                                        }
                                                        field1752++;
                                                        if (field1752 > 50) {
                                                            field1570.method653(146);
                                                        }
                                                        try {
                                                            if (Statics.field2080 != null && field1570.field540 > 0) {
                                                                Statics.field2080.method2293(field1570.field541, 0, field1570.field540);
                                                                field1570.field540 = 0;
                                                                field1752 = 0;
                                                            }
                                                        } catch (IOException var96) {
                                                            if (field1714 > 0) {
                                                                method1334();
                                                            } else {
                                                                method897(40);
                                                                Statics.field733 = Statics.field2080;
                                                                Statics.field2080 = null;
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    var69 = var68.field662;
                                                    if (var69.field80 < 0) {
                                                        break;
                                                    }
                                                    var70 = class12.method2369(var69.field90);
                                                } while (var70 == null || var70.field187 == null || var69.field80 >= var70.field187.length || var70.field187[var69.field80] != var69);
                                                class82.method1110(var68);
                                            }
                                        }
                                        var66 = var65.field662;
                                        if (var66.field80 < 0) {
                                            break;
                                        }
                                        var67 = class12.method2369(var66.field90);
                                    } while (var67 == null || var67.field187 == null || var66.field80 >= var67.field187.length || var67.field187[var66.field80] != var66);
                                    class82.method1110(var65);
                                }
                            }
                            var63 = var62.field662;
                            if (var63.field80 < 0) {
                                break;
                            }
                            var64 = class12.method2369(var63.field90);
                        } while (var64 == null || var64.field187 == null || var63.field80 >= var64.field187.length || var64.field187[var63.field80] != var63);
                        class82.method1110(var62);
                    }
                }
                field1753[field1679] = Statics.field1444;
                field1742[field1679] = Statics.field2265;
                field1679++;
            }
        } else if (field1714 > 0) {
            method1334();
        } else {
            method897(40);
            Statics.field733 = Statics.field2080;
            Statics.field2080 = null;
        }
    }

    @ObfuscatedName("ai.bh(I)V")
    public static final void method3030() {
        if (Statics.field1466 != null || field1701 != null) {
            return;
        }
        int var12;
        int var13;
        label157: {
            int var0 = class108.field1807;
            if (field1601) {
                if (var0 != 1) {
                    int var1 = class108.field1801;
                    int var2 = class108.field1802;
                    if (var1 < Statics.field2722 - 10 || var1 > Statics.field2722 + Statics.field2477 + 10 || var2 < Statics.field2061 - 10 || var2 > Statics.field788 + Statics.field2061 + 10) {
                        field1601 = false;
                        method1085(Statics.field2722, Statics.field2061, Statics.field2477, Statics.field788);
                    }
                }
                if (var0 == 1) {
                    int var3 = Statics.field2722;
                    int var4 = Statics.field2061;
                    int var5 = Statics.field2477;
                    int var6 = class108.field1808;
                    int var7 = class108.field1809;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field1627; var9++) {
                        int var10 = (field1627 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        method548(var8);
                    }
                    field1601 = false;
                    method1085(Statics.field2722, Statics.field2061, Statics.field2477, Statics.field788);
                }
            } else {
                if (var0 == 1 && field1627 > 0) {
                    int var11 = field1676[field1627 - 1];
                    if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                        var12 = field1674[field1627 - 1];
                        var13 = field1718[field1627 - 1];
                        class12 var14 = class12.method2369(var13);
                        int var15 = method2929(var14);
                        boolean var16 = (var15 >> 28 & 0x1) != 0;
                        if (var16) {
                            break label157;
                        }
                        int var17 = method2929(var14);
                        boolean var18 = (var17 >> 29 & 0x1) != 0;
                        if (var18) {
                            break label157;
                        }
                    }
                }
                if (var0 == 1 && (field1671 == 1 && field1627 > 2 || method2846(field1627 - 1))) {
                    var0 = 2;
                }
                if (var0 == 1 && field1627 > 0) {
                    method548(field1627 - 1);
                }
                if (var0 == 2 && field1627 > 0) {
                    method537();
                }
            }
            return;
        }
        field1725 = false;
        field1680 = 0;
        if (Statics.field1466 != null) {
            method2390(Statics.field1466);
        }
        Statics.field1466 = class12.method2369(var13);
        field1662 = var12;
        field1644 = class108.field1808;
        field1645 = class108.field1809;
        method2390(Statics.field1466);
    }

    @ObfuscatedName("ao.p(IIIB)V")
    public static void method3046(int arg0, int arg1, int arg2) {
        if (field1779 == 0 || arg1 == 0 || field1770 >= 50) {
            return;
        }
        field1771[field1770] = arg0;
        field1772[field1770] = arg1;
        field1773[field1770] = arg2;
        field1775[field1770] = null;
        field1704[field1770] = 0;
        field1770++;
    }

    @ObfuscatedName("ao.dc(Lfi;I)Ljava/lang/String;")
    public static String method3047(class12 arg0) {
        int var1 = method2929(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field145 == null || arg0.field145.trim().length() == 0) {
            return null;
        } else {
            return arg0.field145;
        }
    }

    @ObfuscatedName("am.ca(S)V")
    public static void method3111() {
        for (class80 var0 = (class80) field1691.method16(); var0 != null; var0 = (class80) field1691.method17()) {
            int var1 = var0.field929;
            if (class12.method536(var1)) {
                boolean var2 = true;
                class12[] var3 = Statics.field173[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field78;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field213;
                    class12 var6 = class12.method2369(var5);
                    if (var6 != null) {
                        method2390(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ac.by(I)V")
    public static final void method3127() {
        while (true) {
            if (field1572.method650(field1573) >= 27) {
                int var0 = field1572.method656(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field1567[var0] == null) {
                        field1567[var0] = new class62();
                        var1 = true;
                    }
                    class62 var2 = field1567[var0];
                    field1569[++field1568 - 1] = var0;
                    var2.field2671 = field1541;
                    int var3 = field1572.method656(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field1572.method656(1);
                    int var5 = field1572.method656(1);
                    if (var5 == 1) {
                        field1654[++field1653 - 1] = var0;
                    }
                    int var6 = field1663[field1572.method656(3)];
                    if (var1) {
                        var2.field2702 = var2.field2706 = var6;
                    }
                    var2.field678 = class171.method2388(field1572.method656(14));
                    int var7 = field1572.method656(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.field2667 = var2.field678.field2563;
                    var2.field2713 = var2.field678.field2557;
                    if (var2.field2713 == 0) {
                        var2.field2706 = 0;
                    }
                    var2.field2678 = var2.field678.field2540;
                    var2.field2672 = var2.field678.field2541;
                    var2.field2673 = var2.field678.field2542;
                    var2.field2688 = var2.field678.field2537;
                    var2.field2668 = var2.field678.field2559;
                    var2.field2669 = var2.field678.field2538;
                    var2.field2670 = var2.field678.field2539;
                    var2.method3112(Statics.field1320.field2676[0] + var7, Statics.field1320.field2716[0] + var3, var4 == 1);
                    continue;
                }
            }
            field1572.method649();
            return;
        }
    }

    @ObfuscatedName("ac.ct(II)V")
    public static final void method3128(int arg0) {
        if (!class12.method536(arg0)) {
            return;
        }
        class12[] var1 = Statics.field173[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class12 var3 = var1[var2];
            if (var3 != null) {
                var3.field147 = 0;
                var3.field186 = 0;
            }
        }
    }

    @ObfuscatedName("ad.i(II)V")
    public static void method3150(int arg0) {
        if (arg0 == -3) {
            class102.method1381(class85.field1014, class85.field1036, class85.field1016);
        } else if (arg0 == -2) {
            class102.method1381(class85.field1017, class85.field1018, class85.field1154);
        } else if (arg0 == -1) {
            class102.method1381(class85.field1066, class85.field1021, class85.field1022);
        } else if (arg0 == 3) {
            class102.method1381(class85.field1023, class85.field1024, class85.field1025);
        } else if (arg0 == 4) {
            class102.method1381(class85.field1026, class85.field1172, class85.field1028);
        } else if (arg0 == 5) {
            class102.method1381(class85.field1029, class85.field1196, class85.field1087);
        } else if (arg0 == 6) {
            class102.method1381(class85.field1054, class85.field1033, class85.field1034);
        } else if (arg0 == 7) {
            class102.method1381(class85.field1035, class85.field995, class85.field1037);
        } else if (arg0 == 8) {
            class102.method1381(class85.field1038, class85.field1039, class85.field1134);
        } else if (arg0 == 9) {
            class102.method1381(class85.field1100, class85.field1015, class85.field1043);
        } else if (arg0 == 10) {
            class102.method1381(class85.field1044, class85.field1138, class85.field1046);
        } else if (arg0 == 11) {
            class102.method1381(class85.field1047, class85.field1048, class85.field1049);
        } else if (arg0 == 12) {
            class102.method1381(class85.field1030, class85.field1051, class85.field1052);
        } else if (arg0 == 13) {
            class102.method1381(class85.field1053, class85.field1109, class85.field1055);
        } else if (arg0 == 14) {
            class102.method1381(class85.field1056, class85.field1057, class85.field1027);
        } else if (arg0 == 16) {
            class102.method1381(class85.field1059, class85.field1205, class85.field1135);
        } else if (arg0 == 17) {
            class102.method1381(class85.field1062, class85.field1063, class85.field1145);
        } else if (arg0 == 18) {
            class102.method1381(class85.field1065, class85.field1031, class85.field1067);
        } else if (arg0 == 19) {
            class102.method1381(class85.field1068, class85.field1108, class85.field1070);
        } else if (arg0 == 20) {
            class102.method1381(class85.field1071, class85.field1072, class85.field1073);
        } else if (arg0 == 22) {
            class102.method1381(class85.field1080, class85.field1075, class85.field1076);
        } else if (arg0 == 23) {
            class102.method1381(class85.field1129, class85.field1078, class85.field1164);
        } else if (arg0 == 24) {
            class102.method1381(class85.field1159, class85.field1204, class85.field1082);
        } else if (arg0 == 25) {
            class102.method1381(class85.field1083, class85.field1173, class85.field1085);
        } else if (arg0 == 26) {
            class102.method1381(class85.field1006, class85.field1143, class85.field1088);
        } else if (arg0 == 27) {
            class102.method1381(class85.field1149, class85.field1090, class85.field1091);
        } else if (arg0 == 31) {
            class102.method1381(class85.field1098, class85.field1119, class85.field1079);
        } else if (arg0 == 32) {
            class102.method1381(class85.field1101, class85.field1084, class85.field1103);
        } else if (arg0 == 37) {
            class102.method1381(class85.field980, class85.field1105, class85.field1110);
        } else if (arg0 == 38) {
            class102.method1381(class85.field1107, class85.field1148, class85.field1202);
        } else if (arg0 == 55) {
            class102.method1381(class85.field1019, class85.field1111, class85.field1112);
        } else {
            class102.method1381(class85.field1113, class85.field1114, class85.field1092);
        }
        method897(10);
    }

    @ObfuscatedName("ae.aw(Lac;I)V")
    public static final void method3377(class179 arg0) {
        arg0.field2689 = arg0.field2668;
        if (arg0.field2714 == 0) {
            arg0.field2718 = 0;
            return;
        }
        if (arg0.field2692 != -1 && arg0.field2695 == 0) {
            class173 var1 = class173.method3098(arg0.field2692);
            if (arg0.field2719 > 0 && var1.field2582 == 0) {
                arg0.field2718++;
                return;
            }
            if (arg0.field2719 <= 0 && var1.field2583 == 0) {
                arg0.field2718++;
                return;
            }
        }
        int var2 = arg0.field2707;
        int var3 = arg0.field2664;
        int var4 = arg0.field2676[arg0.field2714 - 1] * 128 + arg0.field2667 * 64;
        int var5 = arg0.field2716[arg0.field2714 - 1] * 128 + arg0.field2667 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field2707 = var4;
            arg0.field2664 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field2702 = 1280;
            } else if (var3 > var5) {
                arg0.field2702 = 1792;
            } else {
                arg0.field2702 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field2702 = 768;
            } else if (var3 > var5) {
                arg0.field2702 = 256;
            } else {
                arg0.field2702 = 512;
            }
        } else if (var3 < var5) {
            arg0.field2702 = 1024;
        } else if (var3 > var5) {
            arg0.field2702 = 0;
        }
        int var6 = arg0.field2702 - arg0.field2706 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field2672;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field2678;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field2688;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field2673;
        }
        if (var7 == -1) {
            var7 = arg0.field2678;
        }
        arg0.field2689 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class62) {
            var9 = ((class62) arg0).field678.field2562;
        }
        if (var9) {
            if (arg0.field2706 != arg0.field2702 && arg0.field2686 == -1 && arg0.field2713 != 0) {
                var8 = 2;
            }
            if (arg0.field2714 > 2) {
                var8 = 6;
            }
            if (arg0.field2714 > 3) {
                var8 = 8;
            }
            if (arg0.field2718 > 0 && arg0.field2714 > 1) {
                var8 = 8;
                arg0.field2718--;
            }
        } else {
            if (arg0.field2714 > 1) {
                var8 = 6;
            }
            if (arg0.field2714 > 2) {
                var8 = 8;
            }
            if (arg0.field2718 > 0 && arg0.field2714 > 1) {
                var8 = 8;
                arg0.field2718--;
            }
        }
        if (arg0.field2717[arg0.field2714 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field2689 == arg0.field2678 && arg0.field2675 != -1) {
            arg0.field2689 = arg0.field2675;
        }
        if (var2 < var4) {
            arg0.field2707 += var8;
            if (arg0.field2707 > var4) {
                arg0.field2707 = var4;
            }
        } else if (var2 > var4) {
            arg0.field2707 -= var8;
            if (arg0.field2707 < var4) {
                arg0.field2707 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field2664 += var8;
            if (arg0.field2664 > var5) {
                arg0.field2664 = var5;
            }
        } else if (var3 > var5) {
            arg0.field2664 -= var8;
            if (arg0.field2664 < var5) {
                arg0.field2664 = var5;
            }
        }
        if (arg0.field2707 == var4 && arg0.field2664 == var5) {
            arg0.field2714--;
            if (arg0.field2719 > 0) {
                arg0.field2719--;
            }
        }
    }
}

package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import netscape.javascript.JSObject;

public final class client extends class114 {

    @ObfuscatedName("client.fz")
    public static int field1547 = 0;

    @ObfuscatedName("client.fv")
    public static int field1688 = 128;

    @ObfuscatedName("client.fw")
    public static int field1556 = 50;

    @ObfuscatedName("client.fx")
    public static int field1565 = 0;

    @ObfuscatedName("client.fy")
    public static int field1545 = 7759444;

    @ObfuscatedName("client.gd")
    public static int[][] field1542 = new int[104][104];

    @ObfuscatedName("client.fk")
    public static int field1555 = 0;

    @ObfuscatedName("client.fm")
    public static int[] field1572 = new int[field1556];

    @ObfuscatedName("client.fg")
    public static int[] field1557 = new int[field1556];

    @ObfuscatedName("client.fi")
    public static int[] field1560 = new int[field1556];

    @ObfuscatedName("client.fh")
    public static int field1552 = 0;

    @ObfuscatedName("client.fr")
    public static int field1551 = 0;

    @ObfuscatedName("client.fu")
    public static boolean field1646 = false;

    @ObfuscatedName("client.ft")
    public static boolean field1553 = false;

    @ObfuscatedName("client.fo")
    public static int[] field1563 = new int[field1556];

    @ObfuscatedName("client.fn")
    public static int[] field1559 = new int[field1556];

    @ObfuscatedName("client.fq")
    public static int[] field1616 = new int[field1556];

    @ObfuscatedName("client.gx")
    public static String[] field1564 = new String[field1556];

    @ObfuscatedName("client.gl")
    public static int field1567 = -1;

    @ObfuscatedName("client.gg")
    public static int field1566 = 0;

    @ObfuscatedName("client.du")
    public static int[] field1590 = new int[4000];

    @ObfuscatedName("client.dv")
    public static int field1533 = 0;

    @ObfuscatedName("client.dw")
    public static int field1535 = 0;

    @ObfuscatedName("client.dx")
    public static int field1571 = 0;

    @ObfuscatedName("client.dz")
    public static int field1524 = 0;

    @ObfuscatedName("client.de")
    public static int field1534 = 1;

    @ObfuscatedName("client.dg")
    public static int field1530 = 2;

    @ObfuscatedName("client.df")
    public static int[][][] field1522 = new int[4][13][13];

    @ObfuscatedName("client.dh")
    public static int[] field1527 = new int[4000];

    @ObfuscatedName("client.dj")
    public static int field1661 = 0;

    @ObfuscatedName("client.dl")
    public static int field1536 = 0;

    @ObfuscatedName("client.do")
    public static int field1615 = 0;

    @ObfuscatedName("client.dp")
    public static int[][] field1659 = new int[104][104];

    @ObfuscatedName("client.ds")
    public static int[][] field1526 = new int[104][104];

    @ObfuscatedName("client.dr")
    public static boolean field1521 = false;

    @ObfuscatedName("client.g")
    public static boolean field1463 = false;

    @ObfuscatedName("client.eu")
    public static int field1540 = 0;

    @ObfuscatedName("client.e")
    public static int field1466 = 0;

    @ObfuscatedName("client.b")
    public static boolean field1458 = true;

    @ObfuscatedName("client.a")
    public static boolean field1464 = false;

    @ObfuscatedName("client.n")
    public static boolean field1475 = false;

    @ObfuscatedName("client.o")
    public static int field1468 = 0;

    @ObfuscatedName("client.l")
    public static boolean field1474 = true;

    @ObfuscatedName("client.fd")
    public static int[] field1558 = new int[field1556];

    @ObfuscatedName("client.fe")
    public static int field1549 = 0;

    @ObfuscatedName("client.h")
    public static int field1724 = -1;

    @ObfuscatedName("client.fc")
    public static int field1554 = 0;

    @ObfuscatedName("client.i")
    public static int field1537 = 1;

    @ObfuscatedName("client.eh")
    public static int field1562 = 5063219;

    @ObfuscatedName("client.w")
    public static class15[] field1520 = new class15[4];

    @ObfuscatedName("client.ef")
    public static int field1512 = 2301979;

    @ObfuscatedName("client.u")
    public static int field1465 = 0;

    @ObfuscatedName("client.t")
    public static int field1670 = -1;

    @ObfuscatedName("client.s")
    public static long field1528 = 1L;

    @ObfuscatedName("client.r")
    public static int field1711 = -1;

    @ObfuscatedName("client.ej")
    public static int field1592 = 0;

    @ObfuscatedName("client.q")
    public static int field1680 = 0;

    @ObfuscatedName("client.ei")
    public static int field1613 = 2;

    @ObfuscatedName("client.p")
    public static boolean field1623 = true;

    @ObfuscatedName("client.ep")
    public static int field1544 = 3353893;

    @ObfuscatedName("client.eo")
    public static int field1539 = 1;

    @ObfuscatedName("client.et")
    public static int field1541 = 0;

    @ObfuscatedName("client.z")
    public static int field1461 = 0;

    @ObfuscatedName("client.cb")
    public static int field1456 = 0;

    @ObfuscatedName("client.bw")
    public static int field1621 = 0;

    @ObfuscatedName("client.by")
    public static int field1495 = 0;

    @ObfuscatedName("client.br")
    public static class66[] field1491 = new class66[32768];

    @ObfuscatedName("client.bn")
    public static int field1639 = 0;

    @ObfuscatedName("client.bp")
    public static int field1494 = 0;

    @ObfuscatedName("client.bi")
    public static int field1493 = 0;

    @ObfuscatedName("client.bc")
    public static int field1500 = 0;

    @ObfuscatedName("client.be")
    public static int[] field1482 = new int[32768];

    @ObfuscatedName("client.dc")
    public static final int[] field1523 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.db")
    public static int field1532 = 2;

    @ObfuscatedName("client.cz")
    public static class41 field1503 = new class41(5000);

    @ObfuscatedName("client.cy")
    public static int field1514 = 0;

    @ObfuscatedName("client.cv")
    public static int field1509 = 0;

    @ObfuscatedName("client.cu")
    public static int field1507 = 0;

    @ObfuscatedName("client.ct")
    public static int field1506 = 0;

    @ObfuscatedName("client.cs")
    public static int field1473 = 0;

    @ObfuscatedName("client.co")
    public static int field1517 = 0;

    @ObfuscatedName("client.cn")
    public static int field1510 = 0;

    @ObfuscatedName("client.ck")
    public static int field1516 = 1;

    @ObfuscatedName("client.cl")
    public static int field1531 = 0;

    @ObfuscatedName("client.cj")
    public static int field1625 = 0;

    @ObfuscatedName("client.cg")
    public static class41 field1504 = new class41(5000);

    @ObfuscatedName("client.ch")
    public static int field1518 = 1;

    @ObfuscatedName("client.cf")
    public static class41 field1695 = new class41(5000);

    @ObfuscatedName("client.cc")
    public static boolean field1513 = false;

    @ObfuscatedName("client.cd")
    public static int field1508 = 0;

    @ObfuscatedName("client.as")
    public static int field1538 = 0;

    @ObfuscatedName("client.ar")
    public static int field1499 = 0;

    @ObfuscatedName("client.ax")
    public static int field1697 = 0;

    @ObfuscatedName("client.aw")
    public static int field1488 = 0;

    @ObfuscatedName("client.av")
    public static int field1489 = 0;

    @ObfuscatedName("client.ai")
    public static class28 field1485 = new class28(new byte[5000]);

    @ObfuscatedName("client.aj")
    public static int field1486 = 0;

    @ObfuscatedName("client.ao")
    public static int field1529 = 0;

    @ObfuscatedName("client.an")
    public static int field1599 = 0;

    @ObfuscatedName("client.ac")
    public static int field1662 = 0;

    @ObfuscatedName("client.aa")
    public static int field1668 = 0;

    @ObfuscatedName("client.ah")
    public static int field1481 = 0;

    @ObfuscatedName("client.gk")
    public static int field1568 = -1;

    @ObfuscatedName("client.gu")
    public static int field1476 = 0;

    @ObfuscatedName("client.gi")
    public static int field1570 = 0;

    @ObfuscatedName("client.gn")
    public static int field1614 = 0;

    @ObfuscatedName("client.ga")
    public static int field1548 = 0;

    @ObfuscatedName("client.gv")
    public static int field1573 = 0;

    @ObfuscatedName("client.gy")
    public static int field1574 = 0;

    @ObfuscatedName("client.go")
    public static int field1576 = 0;

    @ObfuscatedName("client.gw")
    public static int field1577 = 0;

    @ObfuscatedName("client.gs")
    public static int field1496 = 0;

    @ObfuscatedName("client.gj")
    public static int field1579 = 0;

    @ObfuscatedName("client.gq")
    public static boolean field1648 = false;

    @ObfuscatedName("client.gf")
    public static int field1581 = 0;

    @ObfuscatedName("client.gh")
    public static int field1582 = 0;

    @ObfuscatedName("client.gp")
    public static class61[] field1583 = new class61[2048];

    @ObfuscatedName("client.gb")
    public static int field1584 = 0;

    @ObfuscatedName("client.gt")
    public static int[] field1525 = new int[2048];

    @ObfuscatedName("client.hh")
    public static int field1628 = 0;

    @ObfuscatedName("client.hf")
    public static int[] field1587 = new int[2048];

    @ObfuscatedName("client.hv")
    public static class28[] field1588 = new class28[2048];

    @ObfuscatedName("client.hj")
    public static int field1589 = -1;

    @ObfuscatedName("client.hk")
    public static int field1640 = 0;

    @ObfuscatedName("client.hc")
    public static int field1591 = 0;

    @ObfuscatedName("client.hp")
    public static int[] field1638 = new int[1000];

    @ObfuscatedName("client.hy")
    public static final int[] field1593 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hw")
    public static String[] field1594 = new String[8];

    @ObfuscatedName("client.ho")
    public static boolean[] field1624 = new boolean[8];

    @ObfuscatedName("client.hn")
    public static int[] field1596 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hx")
    public static class71[][][] field1597 = new class71[4][104][104];

    @ObfuscatedName("client.hs")
    public static class71 field1598 = new class71();

    @ObfuscatedName("client.hm")
    public static class71 field1483 = new class71();

    @ObfuscatedName("client.hz")
    public static class71 field1600 = new class71();

    @ObfuscatedName("client.hi")
    public static int[] field1601 = new int[25];

    @ObfuscatedName("client.hl")
    public static int[] field1602 = new int[25];

    @ObfuscatedName("client.hr")
    public static int[] field1479 = new int[25];

    @ObfuscatedName("client.ha")
    public static int field1604 = 0;

    @ObfuscatedName("client.hq")
    public static boolean field1605 = false;

    @ObfuscatedName("client.ib")
    public static int field1606 = 0;

    @ObfuscatedName("client.iw")
    public static int[] field1607 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field1511 = new int[500];

    @ObfuscatedName("client.ij")
    public static int[] field1609 = new int[500];

    @ObfuscatedName("client.is")
    public static int[] field1610 = new int[500];

    @ObfuscatedName("client.iy")
    public static String[] field1627 = new String[500];

    @ObfuscatedName("client.io")
    public static String[] field1612 = new String[500];

    @ObfuscatedName("client.ig")
    public static int field1632 = -1;

    @ObfuscatedName("client.ia")
    public static int field1681 = -1;

    @ObfuscatedName("client.ip")
    public static int field1645 = 0;

    @ObfuscatedName("client.ir")
    public static int field1501 = 50;

    @ObfuscatedName("client.ie")
    public static int field1675 = 0;

    @ObfuscatedName("client.it")
    public static String field1519 = null;

    @ObfuscatedName("client.il")
    public static boolean field1619 = false;

    @ObfuscatedName("client.iq")
    public static int field1471 = -1;

    @ObfuscatedName("client.id")
    public static String field1644 = null;

    @ObfuscatedName("client.ik")
    public static String field1578 = null;

    @ObfuscatedName("client.jb")
    public static int field1608 = -1;

    @ObfuscatedName("client.ja")
    public static class3 field1505 = new class3(8);

    @ObfuscatedName("client.jc")
    public static int field1643 = 0;

    @ObfuscatedName("client.je")
    public static int field1626 = 0;

    @ObfuscatedName("client.jn")
    public static class17 field1620 = null;

    @ObfuscatedName("client.jg")
    public static int field1650 = 0;

    @ObfuscatedName("client.jr")
    public static int field1629 = 0;

    @ObfuscatedName("client.jx")
    public static int field1630 = 0;

    @ObfuscatedName("client.jy")
    public static boolean field1480 = false;

    @ObfuscatedName("client.jm")
    public static boolean field1631 = false;

    @ObfuscatedName("client.ju")
    public static boolean field1633 = false;

    @ObfuscatedName("client.jz")
    public static class17 field1634 = null;

    @ObfuscatedName("client.jo")
    public static class17 field1694 = null;

    @ObfuscatedName("client.js")
    public static int field1636 = 0;

    @ObfuscatedName("client.jd")
    public static int field1637 = 0;

    @ObfuscatedName("client.jt")
    public static class17 field1658 = null;

    @ObfuscatedName("client.jk")
    public static boolean field1459 = false;

    @ObfuscatedName("client.jw")
    public static int field1708 = -1;

    @ObfuscatedName("client.jl")
    public static int field1641 = -1;

    @ObfuscatedName("client.jq")
    public static boolean field1642 = false;

    @ObfuscatedName("client.jv")
    public static int field1709 = -1;

    @ObfuscatedName("client.jp")
    public static int field1546 = -1;

    @ObfuscatedName("client.jf")
    public static boolean field1502 = false;

    @ObfuscatedName("client.kp")
    public static int field1472 = 1;

    @ObfuscatedName("client.ko")
    public static int[] field1667 = new int[32];

    @ObfuscatedName("client.kv")
    public static int field1550 = 0;

    @ObfuscatedName("client.kq")
    public static int[] field1617 = new int[32];

    @ObfuscatedName("client.ks")
    public static int field1490 = 0;

    @ObfuscatedName("client.ku")
    public static int[] field1651 = new int[32];

    @ObfuscatedName("client.kg")
    public static int field1652 = 0;

    @ObfuscatedName("client.kk")
    public static int field1585 = 0;

    @ObfuscatedName("client.kr")
    public static int field1635 = 0;

    @ObfuscatedName("client.kl")
    public static int field1655 = 0;

    @ObfuscatedName("client.ki")
    public static int field1656 = 0;

    @ObfuscatedName("client.kc")
    public static int[] field1657 = new int[2000];

    @ObfuscatedName("client.ka")
    public static String[] field1477 = new String[1000];

    @ObfuscatedName("client.kw")
    public static int field1580 = 0;

    @ObfuscatedName("client.km")
    public static class71 field1660 = new class71();

    @ObfuscatedName("client.ky")
    public static class71 field1492 = new class71();

    @ObfuscatedName("client.kd")
    public static class71 field1586 = new class71();

    @ObfuscatedName("client.kz")
    public static class3 field1663 = new class3(512);

    @ObfuscatedName("client.kx")
    public static int field1664 = 0;

    @ObfuscatedName("client.kh")
    public static int field1665 = -2;

    @ObfuscatedName("client.ke")
    public static boolean[] field1666 = new boolean[100];

    @ObfuscatedName("client.lm")
    public static boolean[] field1603 = new boolean[100];

    @ObfuscatedName("client.lq")
    public static boolean[] field1649 = new boolean[100];

    @ObfuscatedName("client.lr")
    public static int[] field1669 = new int[100];

    @ObfuscatedName("client.lh")
    public static int[] field1693 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field1484 = new int[100];

    @ObfuscatedName("client.ld")
    public static int[] field1671 = new int[100];

    @ObfuscatedName("client.le")
    public static int field1673 = 0;

    @ObfuscatedName("client.lp")
    public static int[] field1674 = new int[100];

    @ObfuscatedName("client.ls")
    public static String[] field1569 = new String[100];

    @ObfuscatedName("client.ly")
    public static String[] field1676 = new String[100];

    @ObfuscatedName("client.lx")
    public static String[] field1515 = new String[100];

    @ObfuscatedName("client.lf")
    public static int field1678 = 0;

    @ObfuscatedName("client.lw")
    public static int[] field1679 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lz")
    public static int field1561 = 0;

    @ObfuscatedName("client.li")
    public static int field1595 = 0;

    @ObfuscatedName("client.lo")
    public static long[] field1682 = new long[100];

    @ObfuscatedName("client.lu")
    public static int field1683 = 0;

    @ObfuscatedName("client.lb")
    public static int field1684 = 0;

    @ObfuscatedName("client.lg")
    public static int[] field1677 = new int[128];

    @ObfuscatedName("client.lv")
    public static int[] field1686 = new int[128];

    @ObfuscatedName("client.ln")
    public static long field1687 = -1L;

    @ObfuscatedName("client.lc")
    public static String field1654 = null;

    @ObfuscatedName("client.mo")
    public static String field1689 = null;

    @ObfuscatedName("client.mz")
    public static int field1690 = -1;

    @ObfuscatedName("client.mx")
    public static int field1691 = 0;

    @ObfuscatedName("client.mc")
    public static int[] field1692 = new int[1000];

    @ObfuscatedName("client.mt")
    public static int[] field1467 = new int[1000];

    @ObfuscatedName("client.mr")
    public static class140[] field1653 = new class140[1000];

    @ObfuscatedName("client.ms")
    public static int field1478 = 0;

    @ObfuscatedName("client.mw")
    public static int field1696 = 0;

    @ObfuscatedName("client.mh")
    public static int field1672 = 0;

    @ObfuscatedName("client.mv")
    public static int field1698 = 255;

    @ObfuscatedName("client.ml")
    public static int field1699 = -1;

    @ObfuscatedName("client.mu")
    public static boolean field1700 = false;

    @ObfuscatedName("client.mi")
    public static int field1701 = 127;

    @ObfuscatedName("client.me")
    public static int field1702 = 127;

    @ObfuscatedName("client.nz")
    public static int field1703 = 0;

    @ObfuscatedName("client.nh")
    public static int[] field1704 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field1705 = new int[50];

    @ObfuscatedName("client.nl")
    public static int[] field1706 = new int[50];

    @ObfuscatedName("client.nu")
    public static int[] field1707 = new int[50];

    @ObfuscatedName("client.ne")
    public static class110[] field1714 = new class110[50];

    @ObfuscatedName("client.nf")
    public static boolean field1710 = false;

    @ObfuscatedName("client.ns")
    public static boolean[] field1647 = new boolean[5];

    @ObfuscatedName("client.na")
    public static int[] field1712 = new int[5];

    @ObfuscatedName("client.ng")
    public static int[] field1685 = new int[5];

    @ObfuscatedName("client.nq")
    public static int[] field1469 = new int[5];

    @ObfuscatedName("client.ot")
    public static int[] field1715 = new int[5];

    @ObfuscatedName("client.oq")
    public static int field1716 = 0;

    @ObfuscatedName("client.or")
    public static int field1717 = 0;

    @ObfuscatedName("client.on")
    public static class90[] field1718 = new class90[400];

    @ObfuscatedName("client.og")
    public static class77 field1543 = new class77();

    @ObfuscatedName("client.oa")
    public static int field1720 = 0;

    @ObfuscatedName("client.om")
    public static class102[] field1721 = new class102[400];

    @ObfuscatedName("client.oi")
    public static class67 field1722 = new class67();

    @ObfuscatedName("client.ow")
    public static int field1723 = -1;

    @ObfuscatedName("client.oc")
    public static int field1618 = -1;

    @ObfuscatedName("client.m(I)V")
    public final void method1590() {
    }

    public final void init() {
        if (!this.method1989()) {
            return;
        }
        class4[] var1 = class4.method1954();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class4 var3 = var1[var2];
            String var4 = this.getParameter(var3.field41);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field41)) {
                    case 1:
                        if (var4.equalsIgnoreCase(class62.field928)) {
                            field1463 = true;
                        } else {
                            field1463 = false;
                        }
                    case 2:
                    default:
                        break;
                    case 3:
                        field1537 = Integer.parseInt(var4);
                        break;
                    case 4:
                        field1461 = Integer.parseInt(var4);
                        break;
                    case 5:
                        Statics.field528 = var4;
                        break;
                    case 6:
                        field1465 = Integer.parseInt(var4);
                        break;
                    case 7:
                        class96[] var5 = class96.method855();
                        int var6 = Integer.parseInt(var4);
                        class96[] var7 = var5;
                        int var8 = 0;
                        class96 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class96 var9 = var7[var8];
                            if (var6 == var9.method542()) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field550 = (class96) var10;
                        if (Statics.field550 == class96.field1342) {
                            Statics.field1462 = class24.field236;
                        } else {
                            Statics.field1462 = class24.field243;
                        }
                        break;
                    case 8:
                        if (var4.equalsIgnoreCase(class62.field928)) {
                        }
                        break;
                    case 9:
                        Statics.field1460 = class91.method2809(Integer.parseInt(var4));
                }
            }
        }
        class139.field2072 = false;
        field1464 = false;
        Statics.field2585 = this.getCodeBase().getHost();
        String var11 = Statics.field1460.field1288;
        byte var12 = 0;
        try {
            class153.method1220("oldschool", var11, var12, 16);
        } catch (Exception var14) {
            class136.method1295((String) null, var14);
        }
        Statics.field1457 = this;
        this.method1987(765, 503, 29);
    }

    @ObfuscatedName("client.x(I)V")
    public final void method1592() {
        Statics.field406 = field1461 == 0 ? 43594 : field1537 + 40000;
        Statics.field635 = field1461 == 0 ? 443 : field1537 + 50000;
        Statics.field1242 = Statics.field406;
        Statics.field981 = class10.field66;
        Statics.field987 = class10.field64;
        Statics.field557 = class10.field65;
        Statics.field1926 = class10.field69;
        if (Statics.field1935.toLowerCase().indexOf("microsoft") == -1) {
            class132.field1973[44] = 71;
            class132.field1973[45] = 26;
            class132.field1973[46] = 72;
            class132.field1973[47] = 73;
            class132.field1973[59] = 57;
            class132.field1973[61] = 27;
            class132.field1973[91] = 42;
            class132.field1973[92] = 74;
            class132.field1973[93] = 43;
            class132.field1973[192] = 28;
            class132.field1973[222] = 58;
            class132.field1973[520] = 59;
        } else {
            class132.field1973[186] = 57;
            class132.field1973[187] = 27;
            class132.field1973[188] = 71;
            class132.field1973[189] = 26;
            class132.field1973[190] = 72;
            class132.field1973[191] = 73;
            class132.field1973[192] = 58;
            class132.field1973[219] = 42;
            class132.field1973[220] = 74;
            class132.field1973[221] = 43;
            class132.field1973[222] = 59;
            class132.field1973[223] = 28;
        }
        Canvas var1 = Statics.field1009;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class132.field1964);
        var1.addFocusListener(class132.field1964);
        class116.method1946(Statics.field1009);
        Statics.field1876 = class129.method2634();
        if (Statics.field1876 != null) {
            Statics.field1876.method2208(Statics.field1009);
        }
        Statics.field410 = new class113(255, class153.field2318, class153.field2319, 500000);
        class167 var2 = null;
        class65 var3 = new class65();
        try {
            var2 = class153.method3260("", Statics.field550.field1348, false);
            byte[] var4 = new byte[(int) var2.method3015()];
            int var6;
            for (int var5 = 0; var5 < var4.length; var5 += var6) {
                var6 = var2.method3016(var4, var5, var4.length - var5);
                if (var6 == -1) {
                    throw new IOException();
                }
            }
            var3 = new class65(new class28(var4));
        } catch (Exception var11) {
        }
        try {
            if (var2 != null) {
                var2.method3014();
            }
        } catch (Exception var10) {
        }
        Statics.field1861 = var3;
        if (field1461 != 0) {
            field1475 = true;
        }
    }

    @ObfuscatedName("client.d(B)V")
    public final void method1593() {
        field1468++;
        this.method1596();
        class5.method941();
        try {
            if (class101.field1381 == 1) {
                int var1 = Statics.field1383.method582();
                if (var1 > 0 && Statics.field1383.method641()) {
                    int var2 = var1 - Statics.field1388;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field1383.method581(var2);
                } else {
                    Statics.field1383.method587();
                    Statics.field1383.method585();
                    if (Statics.field1384 == null) {
                        class101.field1381 = 0;
                    } else {
                        class101.field1381 = 2;
                    }
                    Statics.field1389 = null;
                    Statics.field1390 = null;
                }
            }
        } catch (Exception var234) {
            var234.printStackTrace();
            Statics.field1383.method587();
            class101.field1381 = 0;
            Statics.field1389 = null;
            Statics.field1390 = null;
            Statics.field1384 = null;
        }
        method3229();
        class132.method3037();
        class116 var4 = class116.field1811;
        synchronized (class116.field1811) {
            class116.field1809 = class116.field1806;
            class116.field1810 = class116.field1807;
            class116.field1816 = class116.field1808;
            class116.field1815 = class116.field1804;
            class116.field1817 = class116.field1813;
            class116.field1805 = class116.field1814;
            class116.field1819 = class116.field1812;
            class116.field1804 = 0;
        }
        if (Statics.field1876 != null) {
            int var6 = Statics.field1876.method2210();
            field1580 = var6;
        }
        if (field1466 == 0) {
            method2053();
            Statics.field1094.method2069();
            for (int var7 = 0; var7 < 32; var7++) {
                field1783[var7] = 0L;
            }
            for (int var8 = 0; var8 < 32; var8++) {
                field1792[var8] = 0L;
            }
            Statics.field1330 = 0;
        } else if (field1466 == 5) {
            class86.method2252(this);
            method2053();
            Statics.field1094.method2069();
            for (int var9 = 0; var9 < 32; var9++) {
                field1783[var9] = 0L;
            }
            for (int var10 = 0; var10 < 32; var10++) {
                field1792[var10] = 0L;
            }
            Statics.field1330 = 0;
        } else if (field1466 == 10) {
            class86.method2252(this);
        } else if (field1466 == 20) {
            class86.method2252(this);
            method3464();
        } else if (field1466 == 25) {
            method957(false);
            field1531 = 0;
            boolean var11 = true;
            for (int var12 = 0; var12 < Statics.field1058.length; var12++) {
                if (Statics.field1380[var12] != -1 && Statics.field1058[var12] == null) {
                    Statics.field1058[var12] = Statics.field2690.method1298(Statics.field1380[var12], 0);
                    if (Statics.field1058[var12] == null) {
                        var11 = false;
                        field1531++;
                    }
                }
                if (Statics.field1251[var12] != -1 && Statics.field289[var12] == null) {
                    Statics.field289[var12] = Statics.field2690.method1299(Statics.field1251[var12], 0, Statics.field1264[var12]);
                    if (Statics.field289[var12] == null) {
                        var11 = false;
                        field1531++;
                    }
                }
            }
            if (var11) {
                field1517 = 0;
                boolean var13 = true;
                for (int var14 = 0; var14 < Statics.field1058.length; var14++) {
                    byte[] var15 = Statics.field289[var14];
                    if (var15 != null) {
                        int var16 = (Statics.field968[var14] >> 8) * 64 - Statics.field2722;
                        int var17 = (Statics.field968[var14] & 0xFF) * 64 - Statics.field1915;
                        if (field1521) {
                            var16 = 10;
                            var17 = 10;
                        }
                        boolean var19 = true;
                        class28 var20 = new class28(var15);
                        int var21 = -1;
                        label1205: while (true) {
                            int var22 = var20.method325();
                            if (var22 == 0) {
                                var13 &= var19;
                                break;
                            }
                            var21 += var22;
                            int var23 = 0;
                            boolean var24 = false;
                            while (true) {
                                while (!var24) {
                                    int var26 = var20.method325();
                                    if (var26 == 0) {
                                        continue label1205;
                                    }
                                    var23 += var26 - 1;
                                    int var27 = var23 & 0x3F;
                                    int var28 = var23 >> 6 & 0x3F;
                                    int var29 = var20.method450() >> 2;
                                    int var30 = var16 + var28;
                                    int var31 = var17 + var27;
                                    if (var30 > 0 && var31 > 0 && var30 < 103 && var31 < 103) {
                                        class181 var32 = class181.method925(var21);
                                        if (var29 != 22 || !field1464 || var32.field2777 != 0 || var32.field2794 == 1 || var32.field2797) {
                                            if (!var32.method3422()) {
                                                field1517++;
                                                var19 = false;
                                            }
                                            var24 = true;
                                        }
                                    }
                                }
                                int var25 = var20.method325();
                                if (var25 == 0) {
                                    break;
                                }
                                var20.method450();
                            }
                        }
                    }
                }
                if (var13) {
                    if (field1661 != 0) {
                        method3258(class57.field647 + class62.field934 + class62.field924 + 100 + "%" + class62.field935, true);
                    }
                    method3229();
                    method1471();
                    method3229();
                    Statics.field967.method2324();
                    method3229();
                    System.gc();
                    for (int var34 = 0; var34 < 4; var34++) {
                        field1520[var34].method86();
                    }
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 104; var36++) {
                            for (int var37 = 0; var37 < 104; var37++) {
                                class72.field1050[var35][var36][var37] = 0;
                            }
                        }
                    }
                    method3229();
                    class72.field1035 = 99;
                    Statics.field1037 = new byte[4][104][104];
                    Statics.field1036 = new byte[4][104][104];
                    Statics.field1038 = new byte[4][104][104];
                    Statics.field1040 = new byte[4][104][104];
                    Statics.field2056 = new int[4][105][105];
                    Statics.field1328 = new byte[4][105][105];
                    Statics.field1877 = new int[105][105];
                    Statics.field523 = new int[104];
                    Statics.field1048 = new int[104];
                    Statics.field1065 = new int[104];
                    Statics.field569 = new int[104];
                    Statics.field973 = new int[104];
                    int var38 = Statics.field1058.length;
                    for (class104 var39 = (class104) class104.field1424.method1104(); var39 != null; var39 = (class104) class104.field1424.method1106()) {
                        if (var39.field1416 != null) {
                            Statics.field2665.method2835(var39.field1416);
                            var39.field1416 = null;
                        }
                        if (var39.field1421 != null) {
                            Statics.field2665.method2835(var39.field1421);
                            var39.field1421 = null;
                        }
                    }
                    class104.field1424.method1098();
                    method957(true);
                    if (!field1521) {
                        int var40 = 0;
                        label1137: while (true) {
                            if (var40 >= var38) {
                                for (int var54 = 0; var54 < var38; var54++) {
                                    int var55 = (Statics.field968[var54] >> 8) * 64 - Statics.field2722;
                                    int var56 = (Statics.field968[var54] & 0xFF) * 64 - Statics.field1915;
                                    byte[] var57 = Statics.field1058[var54];
                                    if (var57 == null && Statics.field2469 < 800) {
                                        method3229();
                                        class72.method2629(var55, var56, 64, 64);
                                    }
                                }
                                method957(true);
                                int var58 = 0;
                                while (true) {
                                    if (var58 >= var38) {
                                        break label1137;
                                    }
                                    byte[] var59 = Statics.field289[var58];
                                    if (var59 != null) {
                                        int var60 = (Statics.field968[var58] >> 8) * 64 - Statics.field2722;
                                        int var61 = (Statics.field968[var58] & 0xFF) * 64 - Statics.field1915;
                                        method3229();
                                        class72.method692(var59, var60, var61, Statics.field967, field1520);
                                    }
                                    var58++;
                                }
                            }
                            int var41 = (Statics.field968[var40] >> 8) * 64 - Statics.field2722;
                            int var42 = (Statics.field968[var40] & 0xFF) * 64 - Statics.field1915;
                            byte[] var43 = Statics.field1058[var40];
                            if (var43 != null) {
                                method3229();
                                int var44 = Statics.field1359 * 8 - 48;
                                int var45 = Statics.field2469 * 8 - 48;
                                class15[] var46 = field1520;
                                int var47 = 0;
                                label1134: while (true) {
                                    if (var47 >= 4) {
                                        class28 var50 = new class28(var43);
                                        int var51 = 0;
                                        while (true) {
                                            if (var51 >= 4) {
                                                break label1134;
                                            }
                                            for (int var52 = 0; var52 < 64; var52++) {
                                                for (int var53 = 0; var53 < 64; var53++) {
                                                    class72.method3036(var50, var51, var41 + var52, var42 + var53, var44, var45, 0);
                                                }
                                            }
                                            var51++;
                                        }
                                    }
                                    for (int var48 = 0; var48 < 64; var48++) {
                                        for (int var49 = 0; var49 < 64; var49++) {
                                            if (var41 + var48 > 0 && var41 + var48 < 103 && var42 + var49 > 0 && var42 + var49 < 103) {
                                                var46[var47].field95[var41 + var48][var42 + var49] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var47++;
                                }
                            }
                            var40++;
                        }
                    }
                    if (field1521) {
                        int var62 = 0;
                        label1083: while (true) {
                            if (var62 >= 4) {
                                for (int var80 = 0; var80 < 13; var80++) {
                                    for (int var81 = 0; var81 < 13; var81++) {
                                        int var82 = field1522[0][var80][var81];
                                        if (var82 == -1) {
                                            class72.method2629(var80 * 8, var81 * 8, 8, 8);
                                        }
                                    }
                                }
                                method957(true);
                                int var83 = 0;
                                while (true) {
                                    if (var83 >= 4) {
                                        break label1083;
                                    }
                                    method3229();
                                    for (int var84 = 0; var84 < 13; var84++) {
                                        for (int var85 = 0; var85 < 13; var85++) {
                                            int var86 = field1522[var83][var84][var85];
                                            if (var86 != -1) {
                                                int var87 = var86 >> 24 & 0x3;
                                                int var88 = var86 >> 1 & 0x3;
                                                int var89 = var86 >> 14 & 0x3FF;
                                                int var90 = var86 >> 3 & 0x7FF;
                                                int var91 = (var89 / 8 << 8) + var90 / 8;
                                                for (int var92 = 0; var92 < Statics.field968.length; var92++) {
                                                    if (Statics.field968[var92] == var91 && Statics.field289[var92] != null) {
                                                        class72.method1491(Statics.field289[var92], var83, var84 * 8, var85 * 8, var87, (var89 & 0x7) * 8, (var90 & 0x7) * 8, var88, Statics.field967, field1520);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var83++;
                                }
                            }
                            method3229();
                            for (int var63 = 0; var63 < 13; var63++) {
                                for (int var64 = 0; var64 < 13; var64++) {
                                    boolean var65 = false;
                                    int var66 = field1522[var62][var63][var64];
                                    if (var66 != -1) {
                                        int var67 = var66 >> 24 & 0x3;
                                        int var68 = var66 >> 1 & 0x3;
                                        int var69 = var66 >> 14 & 0x3FF;
                                        int var70 = var66 >> 3 & 0x7FF;
                                        int var71 = (var69 / 8 << 8) + var70 / 8;
                                        for (int var72 = 0; var72 < Statics.field968.length; var72++) {
                                            if (Statics.field968[var72] == var71 && Statics.field1058[var72] != null) {
                                                class72.method1902(Statics.field1058[var72], var62, var63 * 8, var64 * 8, var67, (var69 & 0x7) * 8, (var70 & 0x7) * 8, var68, field1520);
                                                var65 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var65) {
                                        int var73 = var62;
                                        int var74 = var63 * 8;
                                        int var75 = var64 * 8;
                                        for (int var76 = 0; var76 < 8; var76++) {
                                            for (int var77 = 0; var77 < 8; var77++) {
                                                class72.field1034[var73][var74 + var76][var75 + var77] = 0;
                                            }
                                        }
                                        if (var74 > 0) {
                                            for (int var78 = 1; var78 < 8; var78++) {
                                                class72.field1034[var73][var74][var75 + var78] = class72.field1034[var73][var74 - 1][var75 + var78];
                                            }
                                        }
                                        if (var75 > 0) {
                                            for (int var79 = 1; var79 < 8; var79++) {
                                                class72.field1034[var73][var74 + var79][var75] = class72.field1034[var73][var74 + var79][var75 - 1];
                                            }
                                        }
                                        if (var74 > 0 && class72.field1034[var73][var74 - 1][var75] != 0) {
                                            class72.field1034[var73][var74][var75] = class72.field1034[var73][var74 - 1][var75];
                                        } else if (var75 > 0 && class72.field1034[var73][var74][var75 - 1] != 0) {
                                            class72.field1034[var73][var74][var75] = class72.field1034[var73][var74][var75 - 1];
                                        } else if (var74 > 0 && var75 > 0 && class72.field1034[var73][var74 - 1][var75 - 1] != 0) {
                                            class72.field1034[var73][var74][var75] = class72.field1034[var73][var74 - 1][var75 - 1];
                                        }
                                    }
                                }
                            }
                            var62++;
                        }
                    }
                    method957(true);
                    method1471();
                    method3229();
                    class139 var93 = Statics.field967;
                    class15[] var94 = field1520;
                    for (int var95 = 0; var95 < 4; var95++) {
                        for (int var96 = 0; var96 < 104; var96++) {
                            for (int var97 = 0; var97 < 104; var97++) {
                                if ((class72.field1050[var95][var96][var97] & 0x1) == 1) {
                                    int var98 = var95;
                                    if ((class72.field1050[1][var96][var97] & 0x2) == 2) {
                                        var98 = var95 - 1;
                                    }
                                    if (var98 >= 0) {
                                        var94[var98].method89(var96, var97);
                                    }
                                }
                            }
                        }
                    }
                    class72.field1045 += (int) (Math.random() * 5.0D) - 2;
                    if (class72.field1045 < -8) {
                        class72.field1045 = -8;
                    }
                    if (class72.field1045 > 8) {
                        class72.field1045 = 8;
                    }
                    class72.field1051 += (int) (Math.random() * 5.0D) - 2;
                    if (class72.field1051 < -16) {
                        class72.field1051 = -16;
                    }
                    if (class72.field1051 > 16) {
                        class72.field1051 = 16;
                    }
                    for (int var99 = 0; var99 < 4; var99++) {
                        byte[][] var100 = Statics.field1328[var99];
                        int var101 = (int) Math.sqrt(5100.0D);
                        int var102 = var101 * 768 >> 8;
                        for (int var103 = 1; var103 < 103; var103++) {
                            for (int var104 = 1; var104 < 103; var104++) {
                                int var105 = class72.field1034[var99][var104 + 1][var103] - class72.field1034[var99][var104 - 1][var103];
                                int var106 = class72.field1034[var99][var104][var103 + 1] - class72.field1034[var99][var104][var103 - 1];
                                int var107 = (int) Math.sqrt((double) (var106 * var106 + var105 * var105 + 65536));
                                int var108 = (var105 << 8) / var107;
                                int var109 = 65536 / var107;
                                int var110 = (var106 << 8) / var107;
                                int var111 = (var110 * -50 + var108 * -50 + var109 * -10) / var102 + 96;
                                int var112 = (var100[var104][var103] >> 1) + (var100[var104][var103 + 1] >> 3) + (var100[var104][var103 - 1] >> 2) + (var100[var104 - 1][var103] >> 2) + (var100[var104 + 1][var103] >> 3);
                                Statics.field1877[var104][var103] = var111 - var112;
                            }
                        }
                        for (int var113 = 0; var113 < 104; var113++) {
                            Statics.field523[var113] = 0;
                            Statics.field1048[var113] = 0;
                            Statics.field1065[var113] = 0;
                            Statics.field569[var113] = 0;
                            Statics.field973[var113] = 0;
                        }
                        for (int var114 = -5; var114 < 109; var114++) {
                            for (int var115 = 0; var115 < 104; var115++) {
                                int var116 = var114 + 5;
                                int var10002;
                                if (var116 >= 0 && var116 < 104) {
                                    int var117 = Statics.field1037[var99][var116][var115] & 0xFF;
                                    if (var117 > 0) {
                                        int var118 = var117 - 1;
                                        class178 var119 = (class178) class178.field2724.method1196((long) var118);
                                        class178 var120;
                                        if (var119 == null) {
                                            byte[] var121 = Statics.field2199.method1298(1, var118);
                                            class178 var122 = new class178();
                                            if (var121 != null) {
                                                var122.method3246(new class28(var121), var118);
                                            }
                                            var122.method3245();
                                            class178.field2724.method1184(var122, (long) var118);
                                            var120 = var122;
                                        } else {
                                            var120 = var119;
                                        }
                                        Statics.field523[var115] += var120.field2725;
                                        Statics.field1048[var115] += var120.field2726;
                                        Statics.field1065[var115] += var120.field2727;
                                        Statics.field569[var115] += var120.field2728;
                                        var10002 = Statics.field973[var115]++;
                                    }
                                }
                                int var124 = var114 - 5;
                                if (var124 >= 0 && var124 < 104) {
                                    int var125 = Statics.field1037[var99][var124][var115] & 0xFF;
                                    if (var125 > 0) {
                                        int var126 = var125 - 1;
                                        class178 var127 = (class178) class178.field2724.method1196((long) var126);
                                        class178 var128;
                                        if (var127 == null) {
                                            byte[] var129 = Statics.field2199.method1298(1, var126);
                                            class178 var130 = new class178();
                                            if (var129 != null) {
                                                var130.method3246(new class28(var129), var126);
                                            }
                                            var130.method3245();
                                            class178.field2724.method1184(var130, (long) var126);
                                            var128 = var130;
                                        } else {
                                            var128 = var127;
                                        }
                                        Statics.field523[var115] -= var128.field2725;
                                        Statics.field1048[var115] -= var128.field2726;
                                        Statics.field1065[var115] -= var128.field2727;
                                        Statics.field569[var115] -= var128.field2728;
                                        var10002 = Statics.field973[var115]--;
                                    }
                                }
                            }
                            if (var114 >= 1 && var114 < 103) {
                                int var132 = 0;
                                int var133 = 0;
                                int var134 = 0;
                                int var135 = 0;
                                int var136 = 0;
                                for (int var137 = -5; var137 < 109; var137++) {
                                    int var138 = var137 + 5;
                                    if (var138 >= 0 && var138 < 104) {
                                        var132 += Statics.field523[var138];
                                        var133 += Statics.field1048[var138];
                                        var134 += Statics.field1065[var138];
                                        var135 += Statics.field569[var138];
                                        var136 += Statics.field973[var138];
                                    }
                                    int var139 = var137 - 5;
                                    if (var139 >= 0 && var139 < 104) {
                                        var132 -= Statics.field523[var139];
                                        var133 -= Statics.field1048[var139];
                                        var134 -= Statics.field1065[var139];
                                        var135 -= Statics.field569[var139];
                                        var136 -= Statics.field973[var139];
                                    }
                                    if (var137 >= 1 && var137 < 103) {
                                        if (field1464 && (class72.field1050[0][var114][var137] & 0x2) == 0) {
                                            if ((class72.field1050[var99][var114][var137] & 0x10) != 0) {
                                                continue;
                                            }
                                            int var140;
                                            if ((class72.field1050[var99][var114][var137] & 0x8) != 0) {
                                                var140 = 0;
                                            } else if (var99 <= 0 || (class72.field1050[1][var114][var137] & 0x2) == 0) {
                                                var140 = var99;
                                            } else {
                                                var140 = var99 - 1;
                                            }
                                            if (field1514 != var140) {
                                                continue;
                                            }
                                        }
                                        if (var99 < class72.field1035) {
                                            class72.field1035 = var99;
                                        }
                                        int var141 = Statics.field1037[var99][var114][var137] & 0xFF;
                                        int var142 = Statics.field1036[var99][var114][var137] & 0xFF;
                                        if (var141 > 0 || var142 > 0) {
                                            int var143 = class72.field1034[var99][var114][var137];
                                            int var144 = class72.field1034[var99][var114 + 1][var137];
                                            int var145 = class72.field1034[var99][var114 + 1][var137 + 1];
                                            int var146 = class72.field1034[var99][var114][var137 + 1];
                                            int var147 = Statics.field1877[var114][var137];
                                            int var148 = Statics.field1877[var114 + 1][var137];
                                            int var149 = Statics.field1877[var114 + 1][var137 + 1];
                                            int var150 = Statics.field1877[var114][var137 + 1];
                                            int var151 = -1;
                                            int var152 = -1;
                                            if (var141 > 0) {
                                                int var153 = var132 * 256 / var135;
                                                int var154 = var133 / var136;
                                                int var155 = var134 / var136;
                                                var151 = class72.method907(var153, var154, var155);
                                                int var156 = class72.field1045 + var153 & 0xFF;
                                                int var157 = class72.field1051 + var155;
                                                if (var157 < 0) {
                                                    var157 = 0;
                                                } else if (var157 > 255) {
                                                    var157 = 255;
                                                }
                                                var152 = class72.method907(var156, var154, var157);
                                            }
                                            if (var99 > 0) {
                                                boolean var158 = true;
                                                if (var141 == 0 && Statics.field1038[var99][var114][var137] != 0) {
                                                    var158 = false;
                                                }
                                                if (var142 > 0 && !class177.method1360(var142 - 1).field2706) {
                                                    var158 = false;
                                                }
                                                if (var158 && var143 == var144 && var143 == var145 && var143 == var146) {
                                                    Statics.field2056[var99][var114][var137] |= 0x924;
                                                }
                                            }
                                            int var159 = 0;
                                            if (var152 != -1) {
                                                var159 = class155.field2342[class72.method906(var152, 96)];
                                            }
                                            if (var142 == 0) {
                                                var93.method2308(var99, var114, var137, 0, 0, -1, var143, var144, var145, var146, class72.method906(var151, var147), class72.method906(var151, var148), class72.method906(var151, var149), class72.method906(var151, var150), 0, 0, 0, 0, var159, 0);
                                            } else {
                                                int var160 = Statics.field1038[var99][var114][var137] + 1;
                                                byte var161 = Statics.field1040[var99][var114][var137];
                                                class177 var162 = class177.method1360(var142 - 1);
                                                int var163 = var162.field2702;
                                                int var164;
                                                int var165;
                                                if (var163 >= 0) {
                                                    var164 = Statics.field2323.method845(var163);
                                                    var165 = -1;
                                                } else if (var162.field2715 == 16711935) {
                                                    var165 = -2;
                                                    var163 = -1;
                                                    var164 = -2;
                                                } else {
                                                    var165 = class72.method907(var162.field2708, var162.field2709, var162.field2718);
                                                    int var166 = class72.field1045 + var162.field2708 & 0xFF;
                                                    int var167 = class72.field1051 + var162.field2718;
                                                    if (var167 < 0) {
                                                        var167 = 0;
                                                    } else if (var167 > 255) {
                                                        var167 = 255;
                                                    }
                                                    var164 = class72.method907(var166, var162.field2709, var167);
                                                }
                                                int var168 = 0;
                                                if (var164 != -2) {
                                                    var168 = class155.field2342[class72.method1217(var164, 96)];
                                                }
                                                if (var162.field2707 != -1) {
                                                    int var169 = class72.field1045 + var162.field2720 & 0xFF;
                                                    int var170 = class72.field1051 + var162.field2713;
                                                    if (var170 < 0) {
                                                        var170 = 0;
                                                    } else if (var170 > 255) {
                                                        var170 = 255;
                                                    }
                                                    int var171 = class72.method907(var169, var162.field2716, var170);
                                                    var168 = class155.field2342[class72.method1217(var171, 96)];
                                                }
                                                var93.method2308(var99, var114, var137, var160, var161, var163, var143, var144, var145, var146, class72.method906(var151, var147), class72.method906(var151, var148), class72.method906(var151, var149), class72.method906(var151, var150), class72.method1217(var165, var147), class72.method1217(var165, var148), class72.method1217(var165, var149), class72.method1217(var165, var150), var159, var168);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var172 = 1; var172 < 103; var172++) {
                            for (int var173 = 1; var173 < 103; var173++) {
                                int var178;
                                if ((class72.field1050[var99][var173][var172] & 0x8) != 0) {
                                    var178 = 0;
                                } else if (var99 <= 0 || (class72.field1050[1][var173][var172] & 0x2) == 0) {
                                    var178 = var99;
                                } else {
                                    var178 = var99 - 1;
                                }
                                var93.method2436(var99, var173, var172, var178);
                            }
                        }
                        Statics.field1037[var99] = (byte[][]) null;
                        Statics.field1036[var99] = (byte[][]) null;
                        Statics.field1038[var99] = (byte[][]) null;
                        Statics.field1040[var99] = (byte[][]) null;
                        Statics.field1328[var99] = (byte[][]) null;
                    }
                    var93.method2334(-50, -10, -50);
                    for (int var179 = 0; var179 < 104; var179++) {
                        for (int var180 = 0; var180 < 104; var180++) {
                            if ((class72.field1050[1][var179][var180] & 0x2) == 2) {
                                var93.method2305(var179, var180);
                            }
                        }
                    }
                    int var181 = 1;
                    int var182 = 2;
                    int var183 = 4;
                    for (int var184 = 0; var184 < 4; var184++) {
                        if (var184 > 0) {
                            var181 <<= 0x3;
                            var182 <<= 0x3;
                            var183 <<= 0x3;
                        }
                        for (int var185 = 0; var185 <= var184; var185++) {
                            for (int var186 = 0; var186 <= 104; var186++) {
                                for (int var187 = 0; var187 <= 104; var187++) {
                                    if ((Statics.field2056[var185][var187][var186] & var181) != 0) {
                                        int var188 = var186;
                                        int var189 = var186;
                                        int var190 = var185;
                                        int var191 = var185;
                                        while (var188 > 0 && (Statics.field2056[var185][var187][var188 - 1] & var181) != 0) {
                                            var188--;
                                        }
                                        while (var189 < 104 && (Statics.field2056[var185][var187][var189 + 1] & var181) != 0) {
                                            var189++;
                                        }
                                        label725: while (var190 > 0) {
                                            for (int var192 = var188; var192 <= var189; var192++) {
                                                if ((Statics.field2056[var190 - 1][var187][var192] & var181) == 0) {
                                                    break label725;
                                                }
                                            }
                                            var190--;
                                        }
                                        label714: while (var191 < var184) {
                                            for (int var193 = var188; var193 <= var189; var193++) {
                                                if ((Statics.field2056[var191 + 1][var187][var193] & var181) == 0) {
                                                    break label714;
                                                }
                                            }
                                            var191++;
                                        }
                                        int var194 = (var191 + 1 - var190) * (var189 - var188 + 1);
                                        if (var194 >= 8) {
                                            short var195 = 240;
                                            int var196 = class72.field1034[var191][var187][var188] - var195;
                                            int var197 = class72.field1034[var190][var187][var188];
                                            class139.method2306(var184, 1, var187 * 128, var187 * 128, var188 * 128, var189 * 128 + 128, var196, var197);
                                            for (int var198 = var190; var198 <= var191; var198++) {
                                                for (int var199 = var188; var199 <= var189; var199++) {
                                                    Statics.field2056[var198][var187][var199] &= ~var181;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field2056[var185][var187][var186] & var182) != 0) {
                                        int var200 = var187;
                                        int var201 = var187;
                                        int var202 = var185;
                                        int var203 = var185;
                                        while (var200 > 0 && (Statics.field2056[var185][var200 - 1][var186] & var182) != 0) {
                                            var200--;
                                        }
                                        while (var201 < 104 && (Statics.field2056[var185][var201 + 1][var186] & var182) != 0) {
                                            var201++;
                                        }
                                        label778: while (var202 > 0) {
                                            for (int var204 = var200; var204 <= var201; var204++) {
                                                if ((Statics.field2056[var202 - 1][var204][var186] & var182) == 0) {
                                                    break label778;
                                                }
                                            }
                                            var202--;
                                        }
                                        label767: while (var203 < var184) {
                                            for (int var205 = var200; var205 <= var201; var205++) {
                                                if ((Statics.field2056[var203 + 1][var205][var186] & var182) == 0) {
                                                    break label767;
                                                }
                                            }
                                            var203++;
                                        }
                                        int var206 = (var203 + 1 - var202) * (var201 - var200 + 1);
                                        if (var206 >= 8) {
                                            short var207 = 240;
                                            int var208 = class72.field1034[var203][var200][var186] - var207;
                                            int var209 = class72.field1034[var202][var200][var186];
                                            class139.method2306(var184, 2, var200 * 128, var201 * 128 + 128, var186 * 128, var186 * 128, var208, var209);
                                            for (int var210 = var202; var210 <= var203; var210++) {
                                                for (int var211 = var200; var211 <= var201; var211++) {
                                                    Statics.field2056[var210][var211][var186] &= ~var182;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field2056[var185][var187][var186] & var183) != 0) {
                                        int var212 = var187;
                                        int var213 = var187;
                                        int var214 = var186;
                                        int var215 = var186;
                                        while (var214 > 0 && (Statics.field2056[var185][var187][var214 - 1] & var183) != 0) {
                                            var214--;
                                        }
                                        while (var215 < 104 && (Statics.field2056[var185][var187][var215 + 1] & var183) != 0) {
                                            var215++;
                                        }
                                        label831: while (var212 > 0) {
                                            for (int var216 = var214; var216 <= var215; var216++) {
                                                if ((Statics.field2056[var185][var212 - 1][var216] & var183) == 0) {
                                                    break label831;
                                                }
                                            }
                                            var212--;
                                        }
                                        label820: while (var213 < 104) {
                                            for (int var217 = var214; var217 <= var215; var217++) {
                                                if ((Statics.field2056[var185][var213 + 1][var217] & var183) == 0) {
                                                    break label820;
                                                }
                                            }
                                            var213++;
                                        }
                                        if ((var213 - var212 + 1) * (var215 - var214 + 1) >= 4) {
                                            int var218 = class72.field1034[var185][var212][var214];
                                            class139.method2306(var184, 4, var212 * 128, var213 * 128 + 128, var214 * 128, var215 * 128 + 128, var218, var218);
                                            for (int var219 = var212; var219 <= var213; var219++) {
                                                for (int var220 = var214; var220 <= var215; var220++) {
                                                    Statics.field2056[var185][var219][var220] &= ~var183;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method957(true);
                    int var221 = class72.field1035;
                    if (var221 > Statics.field933) {
                        var221 = Statics.field933;
                    }
                    if (var221 < Statics.field933 - 1) {
                        int var222 = Statics.field933 - 1;
                    }
                    if (field1464) {
                        Statics.field967.method2375(class72.field1035);
                    } else {
                        Statics.field967.method2375(0);
                    }
                    for (int var223 = 0; var223 < 104; var223++) {
                        for (int var224 = 0; var224 < 104; var224++) {
                            method1359(var223, var224);
                        }
                    }
                    method3229();
                    method3254();
                    class181.field2774.method1188();
                    if (Statics.field580 != null) {
                        field1695.method746(252);
                        field1695.method302(1057001181);
                    }
                    if (!field1521) {
                        int var225 = (Statics.field1359 - 6) / 8;
                        int var226 = (Statics.field1359 + 6) / 8;
                        int var227 = (Statics.field2469 - 6) / 8;
                        int var228 = (Statics.field2469 + 6) / 8;
                        for (int var229 = var225 - 1; var229 <= var226 + 1; var229++) {
                            for (int var230 = var227 - 1; var230 <= var228 + 1; var230++) {
                                if (var229 < var225 || var229 > var226 || var230 < var227 || var230 > var228) {
                                    Statics.field2690.method1314("m" + var229 + "_" + var230);
                                    Statics.field2690.method1314("l" + var229 + "_" + var230);
                                }
                            }
                        }
                    }
                    method1179(30);
                    method3229();
                    class72.method1450();
                    field1695.method746(169);
                    Statics.field1094.method2069();
                    for (int var231 = 0; var231 < 32; var231++) {
                        field1783[var231] = 0L;
                    }
                    for (int var232 = 0; var232 < 32; var232++) {
                        field1792[var232] = 0L;
                    }
                    Statics.field1330 = 0;
                } else {
                    field1661 = 2;
                }
            } else {
                field1661 = 1;
            }
        }
        if (field1466 == 30) {
            method1467();
        } else if (field1466 == 40) {
            method3464();
        }
    }

    @ObfuscatedName("client.g(B)V")
    public final void method1595() {
        if (Statics.field1470 != null) {
            Statics.field1470.field1327 = false;
        }
        Statics.field1470 = null;
        if (Statics.field2549 != null) {
            Statics.field2549.method2148();
            Statics.field2549 = null;
        }
        Statics.method1363();
        if (class116.field1811 != null) {
            class116 var1 = class116.field1811;
            synchronized (class116.field1811) {
                class116.field1811 = null;
            }
        }
        Statics.field1876 = null;
        if (Statics.field579 != null) {
            Statics.field579.method2929();
        }
        if (Statics.field1729 != null) {
            Statics.field1729.method2929();
        }
        if (Statics.field1443 != null) {
            Statics.field1443.method2148();
        }
        class5.method3253();
        class153.method3163();
    }

    @ObfuscatedName("client.a(I)V")
    public void method1596() {
        if (field1466 == 1000) {
            return;
        }
        long var1 = class42.method1378();
        int var3 = (int) (var1 - Statics.field1272);
        Statics.field1272 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class105.field1427 += var3;
        boolean var4;
        if (class105.field1440 == 0 && class105.field1431 == 0 && class105.field1434 == 0 && class105.field1429 == 0) {
            var4 = true;
        } else if (Statics.field1443 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class105.field1427 > 30000) {
                        throw new IOException();
                    }
                    while (class105.field1431 < 20 && class105.field1429 > 0) {
                        class79 var5 = (class79) class105.field1428.method14();
                        class28 var6 = new class28(4);
                        var6.method443(1);
                        var6.method301((int) var5.field76);
                        Statics.field1443.method2153(var6.field306, 0, 4);
                        class105.field1432.method9(var5, var5.field76);
                        class105.field1429--;
                        class105.field1431++;
                    }
                    while (class105.field1440 < 20 && class105.field1434 > 0) {
                        class79 var7 = (class79) class105.field1433.method173();
                        class28 var8 = new class28(4);
                        var8.method443(0);
                        var8.method301((int) var7.field76);
                        Statics.field1443.method2153(var8.field306, 0, 4);
                        var7.method49();
                        class105.field1435.method9(var7, var7.field76);
                        class105.field1434--;
                        class105.field1440++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field1443.method2136();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class105.field1427 = 0;
                        byte var11 = 0;
                        if (Statics.field1437 == null) {
                            var11 = 8;
                        } else if (class105.field1442 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class105.field1438.field303;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field1443.method2139(class105.field1438.field306, class105.field1438.field303, var12);
                            if (class105.field1444 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class105.field1438.field306[class105.field1438.field303 + var13] ^= class105.field1444;
                                }
                            }
                            class105.field1438.field303 += var12;
                            if (class105.field1438.field303 < var11) {
                                break;
                            }
                            if (Statics.field1437 == null) {
                                class105.field1438.field303 = 0;
                                int var14 = class105.field1438.method450();
                                int var15 = class105.field1438.method349();
                                int var16 = class105.field1438.method450();
                                int var17 = class105.field1438.method504();
                                long var18 = (long) ((var14 << 16) + var15);
                                class79 var20 = (class79) class105.field1432.method8(var18);
                                Statics.field2167 = true;
                                if (var20 == null) {
                                    var20 = (class79) class105.field1435.method8(var18);
                                    Statics.field2167 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1437 = var20;
                                Statics.field1929 = new class28(var17 + var21 + Statics.field1437.field1109);
                                Statics.field1929.method443(var16);
                                Statics.field1929.method302(var17);
                                class105.field1442 = 8;
                                class105.field1438.field303 = 0;
                            } else if (class105.field1442 == 0) {
                                if (class105.field1438.field306[0] == -1) {
                                    class105.field1442 = 1;
                                    class105.field1438.field303 = 0;
                                } else {
                                    Statics.field1437 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field1929.field306.length - Statics.field1437.field1109;
                            int var23 = 512 - class105.field1442;
                            if (var23 > var22 - Statics.field1929.field303) {
                                var23 = var22 - Statics.field1929.field303;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field1443.method2139(Statics.field1929.field306, Statics.field1929.field303, var23);
                            if (class105.field1444 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field1929.field306[Statics.field1929.field303 + var24] ^= class105.field1444;
                                }
                            }
                            Statics.field1929.field303 += var23;
                            class105.field1442 += var23;
                            if (Statics.field1929.field303 == var22) {
                                if (Statics.field1437.field76 == 16711935L) {
                                    Statics.field1441 = Statics.field1929;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class83 var26 = class105.field1439[var25];
                                        if (var26 != null) {
                                            Statics.field1441.field303 = var25 * 8 + 5;
                                            int var27 = Statics.field1441.method504();
                                            int var28 = Statics.field1441.method504();
                                            var26.method1230(var27, var28);
                                        }
                                    }
                                } else {
                                    class105.field1426.reset();
                                    class105.field1426.update(Statics.field1929.field306, 0, var22);
                                    int var29 = (int) class105.field1426.getValue();
                                    if (Statics.field1437.field1107 != var29) {
                                        try {
                                            Statics.field1443.method2148();
                                        } catch (Exception var35) {
                                        }
                                        class105.field1436++;
                                        Statics.field1443 = null;
                                        class105.field1444 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class105.field1436 = 0;
                                    class105.field1445 = 0;
                                    Statics.field1437.field1110.method1231((int) (Statics.field1437.field76 & 0xFFFFL), Statics.field1929.field306, (Statics.field1437.field76 & 0xFF0000L) == 16711680L, Statics.field2167);
                                }
                                Statics.field1437.method76();
                                if (Statics.field2167) {
                                    class105.field1431--;
                                } else {
                                    class105.field1440--;
                                }
                                class105.field1442 = 0;
                                Statics.field1437 = null;
                                Statics.field1929 = null;
                            } else {
                                if (class105.field1442 != 512) {
                                    break;
                                }
                                class105.field1442 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field1443.method2148();
                } catch (Exception var34) {
                }
                class105.field1445++;
                Statics.field1443 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1842();
        }
    }

    @ObfuscatedName("client.k(II)V")
    public void method1671(int arg0) {
        Statics.field1487 = null;
        Statics.field1280 = null;
        field1488 = 0;
        if (Statics.field406 == Statics.field1242) {
            Statics.field1242 = Statics.field635;
        } else {
            Statics.field1242 = Statics.field406;
        }
        field1493++;
        if (field1493 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field1466 <= 5) {
                this.method2000("js5connect_full");
                field1466 = 1000;
            } else {
                field1489 = 3000;
            }
        } else if (field1493 >= 2 && arg0 == 6) {
            this.method2000("js5connect_outofdate");
            field1466 = 1000;
        } else if (field1493 >= 4) {
            if (field1466 <= 5) {
                this.method2000("js5connect");
                field1466 = 1000;
            } else {
                field1489 = 3000;
            }
        }
    }

    @ObfuscatedName("client.j(I)V")
    public final void method1707() {
        boolean var1 = class101.method864();
        if (var1 && field1700 && Statics.field579 != null) {
            Statics.field579.method2924();
        }
        if (field1795) {
            Canvas var2 = Statics.field1009;
            var2.removeKeyListener(class132.field1964);
            var2.removeFocusListener(class132.field1964);
            class132.field1968 = -1;
            class116.method2810(Statics.field1009);
            if (Statics.field1876 != null) {
                Statics.field1876.method2212(Statics.field1009);
            }
            this.method1988();
            Canvas var3 = Statics.field1009;
            var3.setFocusTraversalKeysEnabled(false);
            var3.addKeyListener(class132.field1964);
            var3.addFocusListener(class132.field1964);
            class116.method1946(Statics.field1009);
            if (Statics.field1876 != null) {
                Statics.field1876.method2208(Statics.field1009);
            }
        }
        if (field1466 == 0) {
            int var4 = class86.field1218;
            String var5 = class86.field1210;
            Color var6 = null;
            try {
                Graphics var7 = Statics.field1009.getGraphics();
                if (Statics.field1112 == null) {
                    Statics.field1112 = new Font("Helvetica", 1, 13);
                    Statics.field1780 = Statics.field1009.getFontMetrics(Statics.field1112);
                }
                if (field1794) {
                    field1794 = false;
                    var7.setColor(Color.black);
                    var7.fillRect(0, 0, Statics.field1932, Statics.field1257);
                }
                if (var6 == null) {
                    var6 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1284 == null) {
                        Statics.field1284 = Statics.field1009.createImage(304, 34);
                    }
                    Graphics var8 = Statics.field1284.getGraphics();
                    var8.setColor(var6);
                    var8.drawRect(0, 0, 303, 33);
                    var8.fillRect(2, 2, var4 * 3, 30);
                    var8.setColor(Color.black);
                    var8.drawRect(1, 1, 301, 31);
                    var8.fillRect(var4 * 3 + 2, 2, 300 - var4 * 3, 30);
                    var8.setFont(Statics.field1112);
                    var8.setColor(Color.white);
                    var8.drawString(var5, (304 - Statics.field1780.stringWidth(var5)) / 2, 22);
                    var7.drawImage(Statics.field1284, Statics.field1932 / 2 - 152, Statics.field1257 / 2 - 18, (ImageObserver) null);
                } catch (Exception var56) {
                    int var10 = Statics.field1932 / 2 - 152;
                    int var11 = Statics.field1257 / 2 - 18;
                    var7.setColor(var6);
                    var7.drawRect(var10, var11, 303, 33);
                    var7.fillRect(var10 + 2, var11 + 2, var4 * 3, 30);
                    var7.setColor(Color.black);
                    var7.drawRect(var10 + 1, var11 + 1, 301, 31);
                    var7.fillRect(var4 * 3 + var10 + 2, var11 + 2, 300 - var4 * 3, 30);
                    var7.setFont(Statics.field1112);
                    var7.setColor(Color.white);
                    var7.drawString(var5, var10 + (304 - Statics.field1780.stringWidth(var5)) / 2, var11 + 22);
                }
            } catch (Exception var57) {
                Statics.field1009.repaint();
            }
        } else if (field1466 == 5) {
            class86.method917(Statics.field2627, Statics.field620);
        } else if (field1466 == 10) {
            class86.method917(Statics.field2627, Statics.field620);
        } else if (field1466 == 20) {
            class86.method917(Statics.field2627, Statics.field620);
        } else if (field1466 == 25) {
            if (field1661 == 1) {
                if (field1531 > field1516) {
                    field1516 = field1531;
                }
                int var13 = (field1516 * 50 - field1531 * 50) / field1516;
                method3258(class57.field647 + class62.field934 + class62.field924 + var13 + "%" + class62.field935, false);
            } else if (field1661 == 2) {
                if (field1517 > field1518) {
                    field1518 = field1517;
                }
                int var14 = (field1518 * 50 - field1517 * 50) / field1518 + 50;
                method3258(class57.field647 + class62.field934 + class62.field924 + var14 + "%" + class62.field935, false);
            } else {
                method3258(class57.field647, false);
            }
        } else if (field1466 == 30) {
            if (!field1605) {
                field1627[0] = class57.field854;
                field1612[0] = "";
                field1609[0] = 1006;
                field1606 = 1;
            }
            if (field1608 != -1) {
                method1380(field1608);
            }
            for (int var15 = 0; var15 < field1664; var15++) {
                if (field1666[var15]) {
                    field1603[var15] = true;
                }
                field1649[var15] = field1666[var15];
                field1666[var15] = false;
            }
            field1665 = field1468;
            field1632 = -1;
            field1681 = -1;
            Statics.field1575 = null;
            if (field1608 != -1) {
                field1664 = 0;
                int var16 = field1608;
                if (class17.method856(var16)) {
                    Statics.field1308 = null;
                    method1175(Statics.field116[var16], -1, 0, 0, 765, 503, 0, 0, -1);
                    if (Statics.field1308 != null) {
                        method1175(Statics.field1308, -1412584499, 0, 0, 765, 503, Statics.field1933, Statics.field1020, -1);
                        Statics.field1308 = null;
                    }
                } else {
                    for (int var17 = 0; var17 < 100; var17++) {
                        field1666[var17] = true;
                    }
                }
            }
            class106.method1530();
            Statics.method1096();
            if (field1605) {
                int var23 = Statics.field1279;
                int var24 = Statics.field1099;
                int var25 = Statics.field2055;
                int var26 = Statics.field1265;
                int var27 = 6116423;
                class106.method1537(var23, var24, var25, var26, var27);
                class106.method1537(var23 + 1, var24 + 1, var25 - 2, 16, 0);
                class106.method1539(var23 + 1, var24 + 18, var25 - 2, var26 - 19, 0);
                Statics.field2627.method221(class57.field784, var23 + 3, var24 + 14, var27, -1);
                int var28 = class116.field1810;
                int var29 = class116.field1816;
                for (int var30 = 0; var30 < field1606; var30++) {
                    int var31 = (field1606 - 1 - var30) * 15 + var24 + 31;
                    int var32 = 16777215;
                    if (var28 > var23 && var28 < var23 + var25 && var29 > var31 - 13 && var29 < var31 + 3) {
                        var32 = 16776960;
                    }
                    class23 var33 = Statics.field2627;
                    String var34;
                    if (field1612[var30].length() > 0) {
                        var34 = field1627[var30] + class57.field755 + field1612[var30];
                    } else {
                        var34 = field1627[var30];
                    }
                    var33.method221(var34, var23 + 3, var31, var32, 0);
                }
                method2301(Statics.field1279, Statics.field1099, Statics.field2055, Statics.field1265);
            } else if (field1632 != -1) {
                int var18 = field1632;
                int var19 = field1681;
                if (field1606 >= 2 || field1675 != 0 || field1619) {
                    String var20;
                    if (field1675 == 1 && field1606 < 2) {
                        var20 = class57.field781 + class57.field755 + field1519 + " " + class62.field926;
                    } else if (field1619 && field1606 < 2) {
                        var20 = field1644 + class57.field755 + field1578 + " " + class62.field926;
                    } else {
                        int var21 = field1606 - 1;
                        String var22;
                        if (field1612[var21].length() > 0) {
                            var22 = field1627[var21] + class57.field755 + field1612[var21];
                        } else {
                            var22 = field1627[var21];
                        }
                        var20 = var22;
                    }
                    if (field1606 > 2) {
                        var20 = var20 + class62.method1489(16777215) + " " + '/' + " " + (field1606 - 2) + class57.field785;
                    }
                    Statics.field2627.method228(var20, var18 + 4, var19 + 15, 16777215, 0, field1468 / 1000);
                }
            }
            if (field1673 == 3) {
                for (int var35 = 0; var35 < field1664; var35++) {
                    if (field1649[var35]) {
                        class106.method1536(field1669[var35], field1693[var35], field1484[var35], field1671[var35], 16711935, 128);
                    } else if (field1603[var35]) {
                        class106.method1536(field1669[var35], field1693[var35], field1484[var35], field1671[var35], 16711680, 128);
                    }
                }
            }
            int var36 = Statics.field933;
            int var37 = Statics.field1393.field2461;
            int var38 = Statics.field1393.field2500;
            int var39 = field1541;
            for (class104 var40 = (class104) class104.field1424.method1104(); var40 != null; var40 = (class104) class104.field1424.method1106()) {
                if (var40.field1415 != -1 || var40.field1419 != null) {
                    int var41 = 0;
                    if (var37 > var40.field1412) {
                        var41 += var37 - var40.field1412;
                    } else if (var37 < var40.field1409) {
                        var41 += var40.field1409 - var37;
                    }
                    if (var38 > var40.field1413) {
                        var41 += var38 - var40.field1413;
                    } else if (var38 < var40.field1411) {
                        var41 += var40.field1411 - var38;
                    }
                    if (var41 - 64 > var40.field1414 || field1702 == 0 || var40.field1410 != var36) {
                        if (var40.field1416 != null) {
                            Statics.field2665.method2835(var40.field1416);
                            var40.field1416 = null;
                        }
                        if (var40.field1421 != null) {
                            Statics.field2665.method2835(var40.field1421);
                            var40.field1421 = null;
                        }
                    } else {
                        var41 -= 64;
                        if (var41 < 0) {
                            var41 = 0;
                        }
                        int var42 = field1702 * (var40.field1414 - var41) / var40.field1414;
                        class110 var10000;
                        if (var40.field1416 != null) {
                            var40.field1416.method3272(var42);
                        } else if (var40.field1415 >= 0) {
                            var10000 = (class110) null;
                            class110 var43 = class110.method1932(Statics.field411, var40.field1415, 0);
                            if (var43 != null) {
                                class117 var44 = var43.method1929().method2109(Statics.field1611);
                                class180 var45 = class180.method3268(var44, 100, var42);
                                var45.method3271(-1);
                                Statics.field2665.method2842(var45);
                                var40.field1416 = var45;
                            }
                        }
                        if (var40.field1421 != null) {
                            var40.field1421.method3272(var42);
                            if (!var40.field1421.method78()) {
                                var40.field1421 = null;
                            }
                        } else if (var40.field1419 != null && (var40.field1423 -= var39) <= 0) {
                            int var46 = (int) (Math.random() * (double) var40.field1419.length);
                            var10000 = (class110) null;
                            class110 var47 = class110.method1932(Statics.field411, var40.field1419[var46], 0);
                            if (var47 != null) {
                                class117 var48 = var47.method1929().method2109(Statics.field1611);
                                class180 var49 = class180.method3268(var48, 100, var42);
                                var49.method3271(0);
                                Statics.field2665.method2842(var49);
                                var40.field1421 = var49;
                                var40.field1423 = var40.field1417 + (int) (Math.random() * (double) (var40.field1418 - var40.field1417));
                            }
                        }
                    }
                }
            }
            field1541 = 0;
        } else if (field1466 == 40) {
            method3258(class57.field841 + class62.field934 + class57.field807, false);
        }
        if (field1466 == 30 && field1673 == 0 && !field1794) {
            try {
                Graphics var50 = Statics.field1009.getGraphics();
                for (int var51 = 0; var51 < field1664; var51++) {
                    if (field1603[var51]) {
                        Statics.field1059.method2627(var50, field1669[var51], field1693[var51], field1484[var51], field1671[var51]);
                        field1603[var51] = false;
                    }
                }
            } catch (Exception var59) {
                Statics.field1009.repaint();
            }
        } else if (field1466 > 0) {
            try {
                Graphics var53 = Statics.field1009.getGraphics();
                Statics.field1059.method2597(var53, 0, 0);
                field1794 = false;
                for (int var54 = 0; var54 < field1664; var54++) {
                    field1603[var54] = false;
                }
            } catch (Exception var58) {
                Statics.field1009.repaint();
            }
        }
    }

    @ObfuscatedName("client.u(I)V")
    public void method1842() {
        if (class105.field1436 >= 4) {
            this.method2000("js5crc");
            field1466 = 1000;
            return;
        }
        if (class105.field1445 >= 4) {
            if (field1466 <= 5) {
                this.method2000("js5io");
                field1466 = 1000;
                return;
            }
            field1489 = 3000;
            class105.field1445 = 3;
        }
        if (--field1489 + 1 > 0) {
            return;
        }
        try {
            if (field1488 == 0) {
                Statics.field1487 = Statics.field2717.method2222(Statics.field2585, Statics.field1242);
                field1488++;
            }
            if (field1488 == 1) {
                if (Statics.field1487.field2364 == 2) {
                    this.method1671(-1);
                    return;
                }
                if (Statics.field1487.field2364 == 1) {
                    field1488++;
                }
            }
            if (field1488 == 2) {
                Statics.field1280 = new class121((Socket) Statics.field1487.field2360, Statics.field2717);
                class28 var1 = new class28(5);
                var1.method443(15);
                var1.method302(29);
                Statics.field1280.method2153(var1.field306, 0, 5);
                field1488++;
                Statics.field581 = class42.method1378();
            }
            if (field1488 == 3) {
                if (field1466 <= 5 || Statics.field1280.method2136() > 0) {
                    int var2 = Statics.field1280.method2137();
                    if (var2 != 0) {
                        this.method1671(var2);
                        return;
                    }
                    field1488++;
                } else if (class42.method1378() - Statics.field581 > 30000L) {
                    this.method1671(-2);
                    return;
                }
            }
            if (field1488 == 4) {
                class121 var3 = Statics.field1280;
                boolean var4 = field1466 > 20;
                if (Statics.field1443 != null) {
                    try {
                        Statics.field1443.method2148();
                    } catch (Exception var14) {
                    }
                    Statics.field1443 = null;
                }
                Statics.field1443 = var3;
                class105.method1088(var4);
                class105.field1438.field303 = 0;
                Statics.field1437 = null;
                Statics.field1929 = null;
                class105.field1442 = 0;
                while (true) {
                    class79 var6 = (class79) class105.field1432.method14();
                    if (var6 == null) {
                        while (true) {
                            class79 var7 = (class79) class105.field1435.method14();
                            if (var7 == null) {
                                if (class105.field1444 != 0) {
                                    try {
                                        class28 var8 = new class28(4);
                                        var8.method443(4);
                                        var8.method443(class105.field1444);
                                        var8.method300(0);
                                        Statics.field1443.method2153(var8.field306, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field1443.method2148();
                                        } catch (Exception var12) {
                                        }
                                        class105.field1445++;
                                        Statics.field1443 = null;
                                    }
                                }
                                class105.field1427 = 0;
                                Statics.field1272 = class42.method1378();
                                Statics.field1487 = null;
                                Statics.field1280 = null;
                                field1488 = 0;
                                field1493 = 0;
                                return;
                            }
                            class105.field1433.method172(var7);
                            class105.field1446.method9(var7, var7.field76);
                            class105.field1434++;
                            class105.field1440--;
                        }
                    }
                    class105.field1428.method9(var6, var6.field76);
                    class105.field1429++;
                    class105.field1431--;
                }
            }
        } catch (IOException var15) {
            this.method1671(-3);
        }
    }

    @ObfuscatedName("du.cx(Lfu;I)Lfu;")
    public static class17 method295(class17 arg0) {
        class17 var1 = arg0;
        int var2 = method1362(arg0);
        int var3 = var2 >> 17 & 0x7;
        int var4 = var3;
        class17 var5;
        if (var3 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var1;
                    break;
                }
                var1 = class17.method865(var1.field123);
                if (var1 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class17 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field174;
        }
        return var7;
    }

    @ObfuscatedName("dl.cp(Lfu;S)V")
    public static void method854(class17 arg0) {
        if (field1665 == arg0.field228) {
            field1666[arg0.field227] = true;
        }
    }

    @ObfuscatedName("ew.cl(IB)V")
    public static final void method883(int arg0) {
        if (!class17.method856(arg0)) {
            return;
        }
        class17[] var1 = Statics.field116[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class17 var3 = var1[var2];
            if (var3 != null) {
                var3.field218 = 0;
                var3.field219 = 0;
            }
        }
    }

    @ObfuscatedName("ew.p(IZZZB)Lef;")
    public static class83 method884(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class113 var4 = null;
        if (class153.field2318 != null) {
            var4 = new class113(arg0, class153.field2318, Statics.field1057[arg0], 1000000);
        }
        return new class83(var4, Statics.field410, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("f.dk(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static final void method897(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field1674[var4] = field1674[var4 - 1];
            field1569[var4] = field1569[var4 - 1];
            field1515[var4] = field1515[var4 - 1];
            field1676[var4] = field1676[var4 - 1];
        }
        field1674[0] = arg0;
        field1569[0] = arg1;
        field1515[0] = arg2;
        field1676[0] = arg3;
        field1678++;
        field1585 = field1472;
    }

    @ObfuscatedName("ex.w(I)V")
    public static final void method903() {
        if (Statics.field2549 != null) {
            Statics.field2549.method2148();
            Statics.field2549 = null;
        }
        method1471();
        Statics.field967.method2324();
        for (int var0 = 0; var0 < 4; var0++) {
            field1520[var0].method86();
        }
        System.gc();
        class101.method2166(2);
        field1699 = -1;
        field1700 = false;
        for (class104 var1 = (class104) class104.field1424.method1104(); var1 != null; var1 = (class104) class104.field1424.method1106()) {
            if (var1.field1416 != null) {
                Statics.field2665.method2835(var1.field1416);
                var1.field1416 = null;
            }
            if (var1.field1421 != null) {
                Statics.field2665.method2835(var1.field1421);
                var1.field1421 = null;
            }
        }
        class104.field1424.method1098();
        method1179(10);
    }

    @ObfuscatedName("g.ct(Lb;IIII)V")
    public static final void method915(class61 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1393 == arg0 || field1606 >= 400) {
            return;
        }
        String var9;
        if (arg0.field904 == 0) {
            String var4 = arg0.field918;
            int var5 = arg0.field905;
            int var6 = Statics.field1393.field905;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class62.method1489(16711680);
            } else if (var7 < -6) {
                var8 = class62.method1489(16723968);
            } else if (var7 < -3) {
                var8 = class62.method1489(16740352);
            } else if (var7 < 0) {
                var8 = class62.method1489(16756736);
            } else if (var7 > 9) {
                var8 = class62.method1489(65280);
            } else if (var7 > 6) {
                var8 = class62.method1489(4259584);
            } else if (var7 > 3) {
                var8 = class62.method1489(8453888);
            } else if (var7 > 0) {
                var8 = class62.method1489(12648192);
            } else {
                var8 = class62.method1489(16776960);
            }
            var9 = var4 + var8 + " " + class62.field924 + class57.field787 + arg0.field905 + class62.field935;
        } else {
            var9 = arg0.field918 + " " + class62.field924 + class57.field686 + arg0.field904 + class62.field935;
        }
        if (field1675 == 1) {
            method1086(class57.field781, field1519 + " " + class62.field926 + " " + class62.method1489(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field1619) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field1594[var10] != null) {
                    short var11 = 0;
                    if (field1594[var10].equalsIgnoreCase(class57.field783)) {
                        if (arg0.field905 > Statics.field1393.field905) {
                            var11 = 2000;
                        }
                        if (Statics.field1393.field919 != 0 && arg0.field919 != 0) {
                            if (Statics.field1393.field919 == arg0.field919) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field1624[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field1593[var10] + var11;
                    method1086(field1594[var10], class62.method1489(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field963 & 0x8) == 8) {
            method1086(field1644, field1578 + " " + class62.field926 + " " + class62.method1489(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field1606; var14++) {
            if (field1609[var14] == 23) {
                field1612[var14] = class62.method1489(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("g.dq(Li;ZI)V")
    public static final void method916(class78 arg0, boolean arg1) {
        int var2 = arg0.field1103;
        int var3 = (int) arg0.field76;
        arg0.method76();
        if (arg1) {
            class17.method1985(var2);
        }
        method2162(var2);
        class17 var4 = class17.method865(var3);
        if (var4 != null) {
            method854(var4);
        }
        for (int var5 = 0; var5 < field1606; var5++) {
            int var6 = field1609[var5];
            boolean var7 = var6 == 57 || var6 == 58 || var6 == 1007 || var6 == 25 || var6 == 30;
            if (var7) {
                if (var5 < field1606 - 1) {
                    for (int var8 = var5; var8 < field1606 - 1; var8++) {
                        field1627[var8] = field1627[var8 + 1];
                        field1612[var8] = field1612[var8 + 1];
                        field1609[var8] = field1609[var8 + 1];
                        field1610[var8] = field1610[var8 + 1];
                        field1607[var8] = field1607[var8 + 1];
                        field1511[var8] = field1511[var8 + 1];
                    }
                }
                field1606--;
            }
        }
        if (field1608 != -1) {
            method1505(field1608, 1);
        }
    }

    @ObfuscatedName("g.bd(I)V")
    public static void method918() {
        if (!field1619) {
            return;
        }
        class17 var0 = class17.method3203(Statics.field2194, field1471);
        if (var0 != null && var0.field191 != null) {
            class82 var1 = new class82();
            var1.field1148 = var0;
            var1.field1158 = var0.field191;
            class92.method3230(var1);
        }
        field1619 = false;
        method854(var0);
    }

    @ObfuscatedName("eu.bq(IIIIZIIIIIII)Z")
    public static final boolean method921(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field1659[var11][var12] = 0;
                field1526[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field1659[arg0][arg1] = 99;
        field1526[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field1527[var15] = arg0;
        int var36 = var15 + 1;
        field1590[var15] = arg1;
        boolean var17 = false;
        int var18 = field1527.length;
        int[][] var19 = field1520[Statics.field933].field95;
        while (var36 != var16) {
            var13 = field1527[var16];
            var14 = field1590[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field1520[Statics.field933].method96(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field1520[Statics.field933].method91(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field1520[Statics.field933].method98(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field1526[var13][var14] + 1;
            if (var13 > 0 && field1659[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field1527[var36] = var13 - 1;
                field1590[var36] = var14;
                var36 = (var36 + 1) % var18;
                field1659[var13 - 1][var14] = 2;
                field1526[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field1659[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field1527[var36] = var13 + 1;
                field1590[var36] = var14;
                var36 = (var36 + 1) % var18;
                field1659[var13 + 1][var14] = 8;
                field1526[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field1659[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field1527[var36] = var13;
                field1590[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field1659[var13][var14 - 1] = 1;
                field1526[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field1659[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field1527[var36] = var13;
                field1590[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field1659[var13][var14 + 1] = 4;
                field1526[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field1659[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field1527[var36] = var13 - 1;
                field1590[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field1659[var13 - 1][var14 - 1] = 3;
                field1526[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field1659[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field1527[var36] = var13 + 1;
                field1590[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field1659[var13 + 1][var14 - 1] = 9;
                field1526[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field1659[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field1527[var36] = var13 - 1;
                field1590[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field1659[var13 - 1][var14 + 1] = 6;
                field1526[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field1659[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field1527[var36] = var13 + 1;
                field1590[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field1659[var13 + 1][var14 + 1] = 12;
                field1526[var13 + 1][var14 + 1] = var20;
            }
        }
        field1524 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field1526[var24][var25] < 100) {
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
                        if (var28 < var21 || var21 == var28 && field1526[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field1526[var24][var25];
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
            field1524 = 1;
        }
        byte var29 = 0;
        field1527[var29] = var13;
        int var37 = var29 + 1;
        field1590[var29] = var14;
        int var30;
        int var31 = var30 = field1659[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field1527[var37] = var13;
                field1590[var37++] = var14;
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
            var31 = field1659[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field1527[var37];
            int var34 = field1590[var37];
            if (arg10 == 0) {
                field1695.method746(226);
                field1695.method443(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field1695.method746(245);
                field1695.method443(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field1695.method746(84);
                field1695.method443(var32 + var32 + 3);
            }
            field1695.method300(Statics.field1915 + var34);
            field1695.method300(Statics.field2722 + var33);
            field1695.method333(class132.field1965[82] ? 1 : 0);
            field1478 = field1527[0];
            field1696 = field1590[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field1695.method333(field1527[var37] - var33);
                field1695.method335(field1590[var37] - var34);
            }
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("d.ab(IIII)I")
    public static final int method924(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class72.field1050[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class72.field1034[var5][var3][var4] + class72.field1034[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class72.field1034[var5][var3][var4 + 1] + class72.field1034[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("e.bk(IIIII)V")
    public static final void method933(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1664; var4++) {
            if (field1669[var4] + field1484[var4] > arg0 && field1669[var4] < arg0 + arg2 && field1693[var4] + field1671[var4] > arg1 && field1693[var4] < arg1 + arg3) {
                field1666[var4] = true;
            }
        }
    }

    @ObfuscatedName("b.as(Lar;IIII)V")
    public static void method936(class165 arg0, int arg1, int arg2, int arg3) {
        if (field1703 >= 50 || field1702 == 0 || arg0.field2524 == null || arg1 >= arg0.field2524.length) {
            return;
        }
        int var4 = arg0.field2524[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1704[field1703] = var5;
        field1705[field1703] = var6;
        field1706[field1703] = 0;
        field1714[field1703] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1707[field1703] = (var8 << 16) + (var9 << 8) + var7;
        field1703++;
    }

    @ObfuscatedName("b.bm(IIIB)Z")
    public static final boolean method946(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field967.method2333(Statics.field933, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class181 var7 = class181.method925(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field2791;
                var9 = var7.field2758;
            } else {
                var8 = var7.field2758;
                var9 = var7.field2791;
            }
            int var10 = var7.field2787;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field1476 = class116.field1817;
        field1570 = class116.field1805;
        field1548 = 2;
        field1614 = 0;
        return true;
    }

    @ObfuscatedName("c.ca([Lfu;IB)V")
    public static final void method954(class17[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class17 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field114 == 0) {
                    if (var3.field220 != null) {
                        method954(var3.field220, arg1);
                    }
                    class78 var4 = (class78) field1505.method8((long) var3.field167);
                    if (var4 != null) {
                        method1505(var4.field1103, arg1);
                    }
                }
                if (arg1 == 0 && var3.field206 != null) {
                    class82 var5 = new class82();
                    var5.field1148 = var3;
                    var5.field1158 = var3.field206;
                    class92.method3230(var5);
                }
                if (arg1 == 1 && var3.field207 != null) {
                    if (var3.field113 >= 0) {
                        class17 var6 = class17.method865(var3.field167);
                        if (var6 == null || var6.field220 == null || var3.field113 >= var6.field220.length || var6.field220[var3.field113] != var3) {
                            continue;
                        }
                    }
                    class82 var7 = new class82();
                    var7.field1148 = var3;
                    var7.field1158 = var3.field207;
                    class92.method3230(var7);
                }
            }
        }
    }

    @ObfuscatedName("c.dn(IIIILcv;B)V")
    public static final void method955(int arg0, int arg1, int arg2, int arg3, class140 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method1393(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field1549 + field1536 & 0x7FF;
        int var7 = class155.field2344[var6];
        int var8 = class155.field2332[var6];
        int var9 = var7 * 256 / (field1592 + 256);
        int var10 = var8 * 256 / (field1592 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1295.method2500(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("c.at(ZI)V")
    public static final void method957(boolean arg0) {
        method3229();
        field1508++;
        if (field1508 < 50 && !arg0) {
            return;
        }
        field1508 = 0;
        if (field1513 || Statics.field2549 == null) {
            return;
        }
        field1695.method746(151);
        try {
            Statics.field2549.method2153(field1695.field306, 0, field1695.field303);
            field1695.field303 = 0;
        } catch (IOException var2) {
            field1513 = true;
        }
    }

    @ObfuscatedName("a.cc(Lfu;II)I")
    public static final int method1022(class17 arg0, int arg1) {
        if (arg0.field208 == null || arg1 >= arg0.field208.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field208[arg1];
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
                    var7 = field1601[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field1602[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field1479[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class17 var11 = class17.method865(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class172.method934(var12).field2621 || field1463)) {
                        for (int var13 = 0; var13 < var11.field201.length; var13++) {
                            if (var12 + 1 == var11.field201[var13]) {
                                var7 += var11.field215[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class1.field4[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class46.field522[field1602[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class1.field4[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1393.field905;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class46.field524[var14]) {
                            var7 += field1602[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class17 var17 = class17.method865(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class172.method934(var18).field2621 || field1463)) {
                        for (int var19 = 0; var19 < var17.field201.length; var19++) {
                            if (var18 + 1 == var17.field201[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1650;
                }
                if (var6 == 12) {
                    var7 = field1629;
                }
                if (var6 == 13) {
                    int var20 = class1.field4[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class1.method945(var22);
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
                    var7 = (Statics.field1393.field2461 >> 7) + Statics.field2722;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1393.field2500 >> 7) + Statics.field1915;
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

    @ObfuscatedName("a.cm(I)V")
    public static final void method1029() {
        method854(field1634);
        Statics.field1052++;
        if (field1642 && field1459) {
            int var0 = class116.field1810;
            int var1 = class116.field1816;
            int var2 = var0 - field1636;
            int var3 = var1 - field1637;
            if (var2 < field1708) {
                var2 = field1708;
            }
            if (field1634.field121 + var2 > field1708 + field1694.field121) {
                var2 = field1708 + field1694.field121 - field1634.field121;
            }
            if (var3 < field1641) {
                var3 = field1641;
            }
            if (field1634.field122 + var3 > field1641 + field1694.field122) {
                var3 = field1641 + field1694.field122 - field1634.field122;
            }
            int var4 = var2 - field1709;
            int var5 = var3 - field1546;
            int var6 = field1634.field175;
            if (Statics.field1052 > field1634.field176 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field1502 = true;
            }
            int var7 = field1694.field125 + (var2 - field1708);
            int var8 = field1694.field126 + (var3 - field1641);
            if (field1634.field188 != null && field1502) {
                class82 var9 = new class82();
                var9.field1148 = field1634;
                var9.field1157 = var7;
                var9.field1150 = var8;
                var9.field1158 = field1634.field188;
                class92.method3230(var9);
            }
            if (class116.field1809 == 0) {
                if (field1502) {
                    if (field1634.field157 != null) {
                        class82 var10 = new class82();
                        var10.field1148 = field1634;
                        var10.field1157 = var7;
                        var10.field1150 = var8;
                        var10.field1147 = field1658;
                        var10.field1158 = field1634.field157;
                        class92.method3230(var10);
                    }
                    if (field1658 != null) {
                        class17 var11 = field1634;
                        int var12 = method1362(var11);
                        int var13 = var12 >> 17 & 0x7;
                        int var14 = var13;
                        class17 var15;
                        if (var13 == 0) {
                            var15 = null;
                        } else {
                            int var16 = 0;
                            while (true) {
                                if (var16 >= var14) {
                                    var15 = var11;
                                    break;
                                }
                                var11 = class17.method865(var11.field123);
                                if (var11 == null) {
                                    var15 = null;
                                    break;
                                }
                                var16++;
                            }
                        }
                        if (var15 != null) {
                            field1695.method746(128);
                            field1695.method346(field1658.field167);
                            field1695.method343(field1658.field113);
                            field1695.method342(field1634.field113);
                            field1695.method351(field1634.field167);
                        }
                    }
                } else {
                    label120: {
                        label91: {
                            if (field1604 != 1) {
                                int var17 = field1606 - 1;
                                boolean var18;
                                if (var17 < 0) {
                                    var18 = false;
                                } else {
                                    int var19 = field1609[var17];
                                    if (var19 >= 2000) {
                                        var19 -= 2000;
                                    }
                                    if (var19 == 1007) {
                                        var18 = true;
                                    } else {
                                        var18 = false;
                                    }
                                }
                                if (!var18) {
                                    break label91;
                                }
                            }
                            if (field1606 > 2) {
                                method3084();
                                break label120;
                            }
                        }
                        if (field1606 > 0) {
                            method3167(field1606 - 1);
                        }
                    }
                }
                field1634 = null;
            }
        } else if (Statics.field1052 > 1) {
            field1634 = null;
        }
    }

    @ObfuscatedName("n.dd(Lfu;I)Z")
    public static final boolean method1034(class17 arg0) {
        int var1 = arg0.field118;
        if (var1 == 205) {
            field1509 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1722.method1038(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1722.method1039(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1722.method1051(false);
        }
        if (var1 == 325) {
            field1722.method1051(true);
        }
        if (var1 == 326) {
            field1695.method746(37);
            field1722.method1063(field1695);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("n.ay(IIIIII)V")
    public static final void method1035(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1359 == arg0 && Statics.field2469 == arg1 && field1514 == arg2 || !field1464) {
            return;
        }
        Statics.field1359 = arg0;
        Statics.field2469 = arg1;
        field1514 = arg2;
        if (!field1464) {
            field1514 = 0;
        }
        method1179(25);
        method3258(class57.field647, true);
        int var5 = Statics.field2722;
        int var6 = Statics.field1915;
        Statics.field2722 = (arg0 - 6) * 8;
        Statics.field1915 = (arg1 - 6) * 8;
        int var7 = Statics.field2722 - var5;
        int var8 = Statics.field1915 - var6;
        int var9 = Statics.field2722;
        int var10 = Statics.field1915;
        for (int var11 = 0; var11 < 32768; var11++) {
            class66 var12 = field1491[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field2503[var13] -= var7;
                    var12.field2507[var13] -= var8;
                }
                var12.field2461 -= var7 * 128;
                var12.field2500 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class61 var15 = field1583[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field2503[var16] -= var7;
                    var15.field2507[var16] -= var8;
                }
                var15.field2461 -= var7 * 128;
                var15.field2500 -= var8 * 128;
            }
        }
        Statics.field933 = arg2;
        Statics.field1393.method2956(arg3, arg4, false);
        byte var17 = 0;
        byte var18 = 104;
        byte var19 = 1;
        if (var7 < 0) {
            var17 = 103;
            var18 = -1;
            var19 = -1;
        }
        byte var20 = 0;
        byte var21 = 104;
        byte var22 = 1;
        if (var8 < 0) {
            var20 = 103;
            var21 = -1;
            var22 = -1;
        }
        for (int var23 = var17; var23 != var18; var23 += var19) {
            for (int var24 = var20; var24 != var21; var24 += var22) {
                int var25 = var7 + var23;
                int var26 = var8 + var24;
                for (int var27 = 0; var27 < 4; var27++) {
                    if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                        field1597[var27][var23][var24] = field1597[var27][var25][var26];
                    } else {
                        field1597[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class80 var28 = (class80) field1598.method1104(); var28 != null; var28 = (class80) field1598.method1106()) {
            var28.field1125 -= var7;
            var28.field1115 -= var8;
            if (var28.field1125 < 0 || var28.field1115 < 0 || var28.field1125 >= 104 || var28.field1115 >= 104) {
                var28.method76();
            }
        }
        if (field1478 != 0) {
            field1478 -= var7;
            field1696 -= var8;
        }
        field1703 = 0;
        field1710 = false;
        field1690 = -1;
        field1600.method1098();
        field1483.method1098();
    }

    @ObfuscatedName("o.dc(Ljava/lang/String;ZI)V")
    public static final void method1074(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field1720 < 100 || field1640 == 1) || field1720 >= 400) {
            method1199(0, "", class57.field799);
            return;
        }
        String var2 = class103.method740(arg0, Statics.field1462);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field1720; var3++) {
            class102 var4 = field1721[var3];
            String var5 = class103.method740(var4.field1400, Statics.field1462);
            if (var5 != null && var5.equals(var2)) {
                method1199(0, "", arg0 + class57.field800);
                return;
            }
            if (var4.field1399 != null) {
                String var6 = class103.method740(var4.field1399, Statics.field1462);
                if (var6 != null && var6.equals(var2)) {
                    method1199(0, "", arg0 + class57.field800);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field1716; var7++) {
            class90 var8 = field1718[var7];
            String var9 = class103.method740(var8.field1278, Statics.field1462);
            if (var9 != null && var9.equals(var2)) {
                method1199(0, "", class57.field704 + arg0 + class57.field806);
                return;
            }
            if (var8.field1275 != null) {
                String var10 = class103.method740(var8.field1275, Statics.field1462);
                if (var10 != null && var10.equals(var2)) {
                    method1199(0, "", class57.field704 + arg0 + class57.field806);
                    return;
                }
            }
        }
        if (class103.method740(Statics.field1393.field918, Statics.field1462).equals(var2)) {
            method1199(0, "", class57.field802);
        } else {
            field1695.method746(80);
            field1695.method443(class28.method2628(arg0));
            field1695.method303(arg0);
        }
    }

    @ObfuscatedName("o.au(ZI)V")
    public static final void method1075(boolean arg0) {
        if (Statics.field1393.field2461 >> 7 == field1478 && Statics.field1393.field2500 >> 7 == field1696) {
            field1478 = 0;
        }
        int var1 = field1584;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class61 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field1393;
                var4 = 33538048;
            } else {
                var3 = field1583[field1525[var2]];
                var4 = field1525[var2] << 14;
            }
            if (var3 != null && var3.method944()) {
                var3.field920 = false;
                if ((field1464 && field1584 > 50 || field1584 > 200) && !arg0 && var3.field2480 == var3.field2459) {
                    var3.field920 = true;
                }
                int var5 = var3.field2461 >> 7;
                int var6 = var3.field2500 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field913 == null || field1468 < var3.field908 || field1468 >= var3.field909) {
                        if ((var3.field2461 & 0x7F) == 64 && (var3.field2500 & 0x7F) == 64) {
                            if (field1566 == field1542[var5][var6]) {
                                continue;
                            }
                            field1542[var5][var6] = field1566;
                        }
                        var3.field907 = method924(var3.field2461, var3.field2500, Statics.field933);
                        Statics.field967.method2343(Statics.field933, var3.field2461, var3.field2500, var3.field907, 60, var3, var3.field2490, var4, var3.field2457);
                    } else {
                        var3.field920 = false;
                        var3.field907 = method924(var3.field2461, var3.field2500, Statics.field933);
                        Statics.field967.method2315(Statics.field933, var3.field2461, var3.field2500, var3.field907, 60, var3, var3.field2490, var4, var3.field906, var3.field915, var3.field916, var3.field902);
                    }
                }
            }
        }
    }

    @ObfuscatedName("o.t(IB)V")
    public static void method1076(int arg0) {
        if (arg0 == -3) {
            class86.method1490(class57.field674, class57.field844, class57.field676);
        } else if (arg0 == -2) {
            class86.method1490(class57.field677, class57.field678, class57.field850);
        } else if (arg0 == -1) {
            class86.method1490(class57.field680, class57.field863, class57.field724);
        } else if (arg0 == 3) {
            class86.method1490(class57.field798, class57.field684, class57.field685);
        } else if (arg0 == 4) {
            class86.method1490(class57.field743, class57.field662, class57.field658);
        } else if (arg0 == 5) {
            class86.method1490(class57.field689, class57.field690, class57.field792);
        } else if (arg0 == 6) {
            class86.method1490(class57.field692, class57.field645, class57.field694);
        } else if (arg0 == 7) {
            class86.method1490(class57.field814, class57.field736, class57.field697);
        } else if (arg0 == 8) {
            class86.method1490(class57.field698, class57.field699, class57.field745);
        } else if (arg0 == 9) {
            class86.method1490(class57.field701, class57.field811, class57.field703);
        } else if (arg0 == 10) {
            class86.method1490(class57.field846, class57.field643, class57.field706);
        } else if (arg0 == 11) {
            class86.method1490(class57.field715, class57.field730, class57.field679);
        } else if (arg0 == 12) {
            class86.method1490(class57.field833, class57.field711, class57.field712);
        } else if (arg0 == 13) {
            class86.method1490(class57.field713, class57.field714, class57.field862);
        } else if (arg0 == 14) {
            class86.method1490(class57.field716, class57.field652, class57.field825);
        } else if (arg0 == 16) {
            class86.method1490(class57.field654, class57.field720, class57.field758);
        } else if (arg0 == 17) {
            class86.method1490(class57.field688, class57.field866, class57.field865);
        } else if (arg0 == 18) {
            class86.method1490(class57.field725, class57.field726, class57.field727);
        } else if (arg0 == 19) {
            class86.method1490(class57.field657, class57.field729, class57.field681);
        } else if (arg0 == 20) {
            class86.method1490(class57.field683, class57.field732, class57.field693);
        } else if (arg0 == 22) {
            class86.method1490(class57.field734, class57.field735, class57.field722);
        } else if (arg0 == 23) {
            class86.method1490(class57.field737, class57.field738, class57.field741);
        } else if (arg0 == 24) {
            class86.method1490(class57.field740, class57.field700, class57.field742);
        } else if (arg0 == 25) {
            class86.method1490(class57.field839, class57.field744, class57.field721);
        } else if (arg0 == 26) {
            class86.method1490(class57.field747, class57.field731, class57.field748);
        } else if (arg0 == 27) {
            class86.method1490(class57.field749, class57.field860, class57.field751);
        } else if (arg0 == 31) {
            class86.method1490(class57.field786, class57.field746, class57.field760);
        } else if (arg0 == 32) {
            class86.method1490(class57.field761, class57.field762, class57.field763);
        } else if (arg0 == 37) {
            class86.method1490(class57.field764, class57.field710, class57.field766);
        } else if (arg0 == 38) {
            class86.method1490(class57.field767, class57.field768, class57.field769);
        } else if (arg0 == 55) {
            class86.method1490(class57.field695, class57.field771, class57.field772);
        } else {
            class86.method1490(class57.field773, class57.field774, class57.field775);
        }
        method1179(10);
    }

    @ObfuscatedName("o.df(Ljava/lang/String;I)Z")
    public static boolean method1079(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class103.method740(arg0, Statics.field1462);
        for (int var2 = 0; var2 < field1720; var2++) {
            class102 var3 = field1721[var2];
            if (var1.equalsIgnoreCase(class103.method740(var3.field1400, Statics.field1462))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class103.method740(var3.field1399, Statics.field1462))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("l.cg(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method1086(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field1605 || field1606 >= 500) {
            return;
        }
        field1627[field1606] = arg0;
        field1612[field1606] = arg1;
        field1609[field1606] = arg2;
        field1610[field1606] = arg3;
        field1607[field1606] = arg4;
        field1511[field1606] = arg5;
        field1606++;
    }

    @ObfuscatedName("l.an(Las;S)V")
    public static final void method1087(class164 arg0) {
        int var1 = arg0.field2497 - field1468;
        int var2 = arg0.field2498 * 128 + arg0.field2458 * 64;
        int var3 = arg0.field2495 * 128 + arg0.field2458 * 64;
        arg0.field2461 += (var2 - arg0.field2461) / var1;
        arg0.field2500 += (var3 - arg0.field2500) / var1;
        arg0.field2509 = 0;
        if (arg0.field2499 == 0) {
            arg0.field2502 = 1024;
        }
        if (arg0.field2499 == 1) {
            arg0.field2502 = 1536;
        }
        if (arg0.field2499 == 2) {
            arg0.field2502 = 0;
        }
        if (arg0.field2499 == 3) {
            arg0.field2502 = 512;
        }
    }

    @ObfuscatedName("m.ac(IIII)V")
    public static void method1093(int arg0, int arg1, int arg2) {
        if (field1701 == 0 || arg1 == 0 || field1703 >= 50) {
            return;
        }
        field1704[field1703] = arg0;
        field1705[field1703] = arg1;
        field1706[field1703] = arg2;
        field1714[field1703] = null;
        field1707[field1703] = 0;
        field1703++;
    }

    @ObfuscatedName("m.al(ZI)V")
    public static final void method1094(boolean arg0) {
        for (int var1 = 0; var1 < field1500; var1++) {
            class66 var2 = field1491[field1482[var1]];
            int var3 = (field1482[var1] << 14) + 536870912;
            if (var2 != null && var2.method944() && var2.field971.field2840 == arg0 && var2.field971.method3452()) {
                int var4 = var2.field2461 >> 7;
                int var5 = var2.field2500 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field2458 == 1 && (var2.field2461 & 0x7F) == 64 && (var2.field2500 & 0x7F) == 64) {
                        if (field1566 == field1542[var4][var5]) {
                            continue;
                        }
                        field1542[var4][var5] = field1566;
                    }
                    if (!var2.field971.field2848) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field967.method2343(Statics.field933, var2.field2461, var2.field2500, method924(var2.field2461 + (var2.field2458 * 64 - 64), var2.field2500 + (var2.field2458 * 64 - 64), Statics.field933), var2.field2458 * 64 - 64 + 60, var2, var2.field2490, var3, var2.field2457);
                }
            }
        }
    }

    @ObfuscatedName("m.bf(I)V")
    public static final void method1095() {
        field1591 = 0;
        field1628 = 0;
        method2983();
        method1177();
        method2637();
        method1198();
        for (int var0 = 0; var0 < field1591; var0++) {
            int var1 = field1638[var0];
            if (field1468 != field1583[var1].field2484) {
                field1583[var1] = null;
            }
        }
        if (field1625 != field1504.field303) {
            throw new RuntimeException(field1504.field303 + class62.field922 + field1625);
        }
        for (int var2 = 0; var2 < field1584; var2++) {
            if (field1583[field1525[var2]] == null) {
                throw new RuntimeException(var2 + class62.field922 + field1584);
            }
        }
    }

    @ObfuscatedName("j.bg(IIIIII)V")
    public static final void method1148(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field967.method2329(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field967.method2333(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field234.field2135;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class181 var13 = class181.method925(var12);
            if (var13.field2807 == -1) {
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
                class149 var14 = Statics.field609[var13.field2807];
                if (var14 != null) {
                    int var15 = (var13.field2791 * 4 - var14.field2231) / 2;
                    int var16 = (var13.field2758 * 4 - var14.field2227) / 2;
                    var14.method2640(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field2758) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field967.method2424(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field967.method2333(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class181 var22 = class181.method925(var21);
            if (var22.field2807 != -1) {
                class149 var23 = Statics.field609[var22.field2807];
                if (var23 != null) {
                    int var24 = (var22.field2791 * 4 - var23.field2231) / 2;
                    int var25 = (var22.field2758 * 4 - var23.field2227) / 2;
                    var23.method2640(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field2758) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field234.field2135;
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
        int var29 = Statics.field967.method2332(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class181 var31 = class181.method925(var30);
        if (var31.field2807 == -1) {
            return;
        }
        class149 var32 = Statics.field609[var31.field2807];
        if (var32 != null) {
            int var33 = (var31.field2791 * 4 - var32.field2231) / 2;
            int var34 = (var31.field2758 * 4 - var32.field2227) / 2;
            var32.method2640(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field2758) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("j.cu([Lfu;IIIIIIIII)V")
    public static final void method1175(class17[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class106.method1531(arg2, arg3, arg4, arg5);
        class155.method2752();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class17 var10 = arg0[var9];
            if (var10 != null && (var10.field123 == arg1 || arg1 == -1412584499 && field1634 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1669[field1664] = var10.field117 + arg6;
                    field1693[field1664] = var10.field180 + arg7;
                    field1484[field1664] = var10.field121;
                    field1671[field1664] = var10.field122;
                    var11 = ++field1664 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field227 = var11;
                var10.field228 = field1468;
                if (!var10.field111 || !method3149(var10)) {
                    if (var10.field118 > 0) {
                        method1509(var10);
                    }
                    int var12 = var10.field117 + arg6;
                    int var13 = var10.field180 + arg7;
                    int var14 = var10.field144;
                    if (field1634 == var10) {
                        if (arg1 != -1412584499 && !var10.field140) {
                            Statics.field1308 = arg0;
                            Statics.field1933 = arg6;
                            Statics.field1020 = arg7;
                            continue;
                        }
                        if (field1502 && field1459) {
                            int var15 = class116.field1810;
                            int var16 = class116.field1816;
                            int var17 = var15 - field1636;
                            int var18 = var16 - field1637;
                            if (var17 < field1708) {
                                var17 = field1708;
                            }
                            if (var10.field121 + var17 > field1708 + field1694.field121) {
                                var17 = field1708 + field1694.field121 - var10.field121;
                            }
                            if (var18 < field1641) {
                                var18 = field1641;
                            }
                            if (var10.field122 + var18 > field1641 + field1694.field122) {
                                var18 = field1641 + field1694.field122 - var10.field122;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field140) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field114 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field114 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field121 + var12;
                        int var26 = var10.field122 + var13;
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
                        int var29 = var10.field121 + var12;
                        int var30 = var10.field122 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field111 || var19 < var21 && var20 < var22) {
                        if (var10.field118 != 0) {
                            if (var10.field118 == 1337) {
                                field1632 = var12;
                                field1681 = var13;
                                int var31 = var10.field121;
                                int var32 = var10.field122;
                                class106.method1531(var12, var13, var12 + var31, var13 + var32);
                                class155.method2752();
                                field1566++;
                                method1075(true);
                                method1094(true);
                                method1075(false);
                                method1094(false);
                                method1181();
                                for (class76 var33 = (class76) field1600.method1104(); var33 != null; var33 = (class76) field1600.method1106()) {
                                    if (Statics.field933 != var33.field1079 || var33.field1091) {
                                        var33.method76();
                                    } else if (field1468 >= var33.field1078) {
                                        var33.method1197(field1541);
                                        if (var33.field1091) {
                                            var33.method76();
                                        } else {
                                            Statics.field967.method2343(var33.field1079, var33.field1080, var33.field1081, var33.field1086, 60, var33, 0, -1, false);
                                        }
                                    }
                                }
                                if (!field1710) {
                                    int var34 = field1688;
                                    if (field1554 / 256 > var34) {
                                        var34 = field1554 / 256;
                                    }
                                    if (field1647[4] && field1685[4] + 128 > var34) {
                                        var34 = field1685[4] + 128;
                                    }
                                    int var35 = field1549 + field1533 & 0x7FF;
                                    method1214(Statics.field2691, method924(Statics.field1393.field2461, Statics.field1393.field2500, Statics.field933) - 50, Statics.field1401, var34, var35, var34 * 3 + 600);
                                }
                                int var36;
                                if (field1710) {
                                    var36 = method1289();
                                } else {
                                    var36 = method1389();
                                }
                                int var37 = Statics.field974;
                                int var38 = Statics.field1088;
                                int var39 = Statics.field2357;
                                int var40 = Statics.field1404;
                                int var41 = Statics.field1162;
                                for (int var42 = 0; var42 < 5; var42++) {
                                    if (field1647[var42]) {
                                        int var43 = (int) (Math.random() * (double) (field1712[var42] * 2 + 1) - (double) field1712[var42] + Math.sin((double) field1469[var42] / 100.0D * (double) field1715[var42]) * (double) field1685[var42]);
                                        if (var42 == 0) {
                                            Statics.field974 += var43;
                                        }
                                        if (var42 == 1) {
                                            Statics.field1088 += var43;
                                        }
                                        if (var42 == 2) {
                                            Statics.field2357 += var43;
                                        }
                                        if (var42 == 3) {
                                            Statics.field1162 = Statics.field1162 + var43 & 0x7FF;
                                        }
                                        if (var42 == 4) {
                                            Statics.field1404 += var43;
                                            if (Statics.field1404 < 128) {
                                                Statics.field1404 = 128;
                                            }
                                            if (Statics.field1404 > 383) {
                                                Statics.field1404 = 383;
                                            }
                                        }
                                    }
                                }
                                int var44 = class116.field1810;
                                int var45 = class116.field1816;
                                if (var44 >= var12 && var44 < var12 + var31 && var45 >= var13 && var45 < var13 + var32) {
                                    class43.field469 = true;
                                    class43.field506 = 0;
                                    class43.field500 = class116.field1810 - var12;
                                    class43.field464 = class116.field1816 - var13;
                                } else {
                                    class43.field469 = false;
                                    class43.field506 = 0;
                                }
                                method3229();
                                class106.method1537(var12, var13, var31, var32, 0);
                                method3229();
                                Statics.field967.method2394(Statics.field974, Statics.field1088, Statics.field2357, Statics.field1404, Statics.field1162, var36);
                                method3229();
                                Statics.field967.method2455();
                                method2062(var12, var13, var31, var32);
                                if (field1538 == 2) {
                                    method2928((field1529 - Statics.field2722 << 7) + field1599, (field1481 - Statics.field1915 << 7) + field1499, field1668 * 2);
                                    if (field1567 > -1 && field1468 % 20 < 10) {
                                        Statics.field1824[0].method2489(field1567 + var12 - 12, field1568 + var13 - 28);
                                    }
                                }
                                ((class135) Statics.field2323).method2283(field1541);
                                method3210(var12, var13, var31, var32);
                                Statics.field974 = var37;
                                Statics.field1088 = var38;
                                Statics.field2357 = var39;
                                Statics.field1404 = var40;
                                Statics.field1162 = var41;
                                if (field1623 && class105.method1033(true, false) == 0) {
                                    field1623 = false;
                                }
                                if (field1623) {
                                    class106.method1537(var12, var13, var31, var32, 0);
                                    method3258(class57.field647, false);
                                }
                                if (!field1623 && !field1605 && var44 >= var12 && var44 < var12 + var31 && var45 >= var13 && var45 < var13 + var32) {
                                    if (field1675 == 0 && !field1619) {
                                        method1086(class57.field666, "", 23, 0, var44 - var12, var45 - var13);
                                    }
                                    int var46 = -1;
                                    for (int var47 = 0; var47 < class43.field506; var47++) {
                                        int var48 = class43.field503[var47];
                                        int var49 = var48 & 0x7F;
                                        int var50 = var48 >> 7 & 0x7F;
                                        int var51 = var48 >> 29 & 0x3;
                                        int var52 = var48 >> 14 & 0x7FFF;
                                        if (var46 != var48) {
                                            var46 = var48;
                                            if (var51 == 2 && Statics.field967.method2333(Statics.field933, var49, var50, var48) >= 0) {
                                                class181 var53 = class181.method925(var52);
                                                if (var53.field2800 != null) {
                                                    var53 = var53.method3392();
                                                }
                                                if (var53 == null) {
                                                    continue;
                                                }
                                                if (field1675 == 1) {
                                                    method1086(class57.field781, field1519 + " " + class62.field926 + " " + class62.method1489(65535) + var53.field2768, 1, var48, var49, var50);
                                                } else if (!field1619) {
                                                    String[] var54 = var53.field2785;
                                                    if (field1633) {
                                                        var54 = method1219(var54);
                                                    }
                                                    if (var54 != null) {
                                                        for (int var55 = 4; var55 >= 0; var55--) {
                                                            if (var54[var55] != null) {
                                                                short var56 = 0;
                                                                if (var55 == 0) {
                                                                    var56 = 3;
                                                                }
                                                                if (var55 == 1) {
                                                                    var56 = 4;
                                                                }
                                                                if (var55 == 2) {
                                                                    var56 = 5;
                                                                }
                                                                if (var55 == 3) {
                                                                    var56 = 6;
                                                                }
                                                                if (var55 == 4) {
                                                                    var56 = 1001;
                                                                }
                                                                method1086(var54[var55], class62.method1489(65535) + var53.field2768, var56, var48, var49, var50);
                                                            }
                                                        }
                                                    }
                                                    method1086(class57.field782, class62.method1489(65535) + var53.field2768, 1002, var53.field2761 << 14, var49, var50);
                                                } else if ((Statics.field963 & 0x4) == 4) {
                                                    method1086(field1644, field1578 + " " + class62.field926 + " " + class62.method1489(65535) + var53.field2768, 2, var48, var49, var50);
                                                }
                                            }
                                            if (var51 == 1) {
                                                class66 var57 = field1491[var52];
                                                if (var57.field971.field2829 == 1 && (var57.field2461 & 0x7F) == 64 && (var57.field2500 & 0x7F) == 64) {
                                                    for (int var58 = 0; var58 < field1500; var58++) {
                                                        class66 var59 = field1491[field1482[var58]];
                                                        if (var59 != null && var57 != var59 && var59.field971.field2829 == 1 && var57.field2461 == var59.field2461 && var57.field2500 == var59.field2500) {
                                                            Statics.method920(var59.field971, field1482[var58], var49, var50);
                                                        }
                                                    }
                                                    for (int var60 = 0; var60 < field1584; var60++) {
                                                        class61 var61 = field1583[field1525[var60]];
                                                        if (var61 != null && var57.field2461 == var61.field2461 && var57.field2500 == var61.field2500) {
                                                            method915(var61, field1525[var60], var49, var50);
                                                        }
                                                    }
                                                }
                                                Statics.method920(var57.field971, var52, var49, var50);
                                            }
                                            if (var51 == 0) {
                                                class61 var62 = field1583[var52];
                                                if ((var62.field2461 & 0x7F) == 64 && (var62.field2500 & 0x7F) == 64) {
                                                    for (int var63 = 0; var63 < field1500; var63++) {
                                                        class66 var64 = field1491[field1482[var63]];
                                                        if (var64 != null && var64.field971.field2829 == 1 && var62.field2461 == var64.field2461 && var62.field2500 == var64.field2500) {
                                                            Statics.method920(var64.field971, field1482[var63], var49, var50);
                                                        }
                                                    }
                                                    for (int var65 = 0; var65 < field1584; var65++) {
                                                        class61 var66 = field1583[field1525[var65]];
                                                        if (var66 != null && var62 != var66 && var62.field2461 == var66.field2461 && var62.field2500 == var66.field2500) {
                                                            method915(var66, field1525[var65], var49, var50);
                                                        }
                                                    }
                                                }
                                                method915(var62, var52, var49, var50);
                                            }
                                            if (var51 == 3) {
                                                class71 var67 = field1597[Statics.field933][var49][var50];
                                                if (var67 != null) {
                                                    for (class68 var68 = (class68) var67.method1105(); var68 != null; var68 = (class68) var67.method1113()) {
                                                        class172 var69 = class172.method934(var68.field990);
                                                        if (field1675 == 1) {
                                                            method1086(class57.field781, field1519 + " " + class62.field926 + " " + class62.method1489(16748608) + var69.field2608, 16, var68.field990, var49, var50);
                                                        } else if (!field1619) {
                                                            String[] var70 = var69.field2622;
                                                            if (field1633) {
                                                                var70 = method1219(var70);
                                                            }
                                                            for (int var71 = 4; var71 >= 0; var71--) {
                                                                if (var70 != null && var70[var71] != null) {
                                                                    byte var72 = 0;
                                                                    if (var71 == 0) {
                                                                        var72 = 18;
                                                                    }
                                                                    if (var71 == 1) {
                                                                        var72 = 19;
                                                                    }
                                                                    if (var71 == 2) {
                                                                        var72 = 20;
                                                                    }
                                                                    if (var71 == 3) {
                                                                        var72 = 21;
                                                                    }
                                                                    if (var71 == 4) {
                                                                        var72 = 22;
                                                                    }
                                                                    method1086(var70[var71], class62.method1489(16748608) + var69.field2608, var72, var68.field990, var49, var50);
                                                                } else if (var71 == 2) {
                                                                    method1086(class57.field641, class62.method1489(16748608) + var69.field2608, 20, var68.field990, var49, var50);
                                                                }
                                                            }
                                                            method1086(class57.field782, class62.method1489(16748608) + var69.field2608, 1004, var68.field990, var49, var50);
                                                        } else if ((Statics.field963 & 0x1) == 1) {
                                                            method1086(field1644, field1578 + " " + class62.field926 + " " + class62.method1489(16748608) + var69.field2608, 17, var68.field990, var49, var50);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                class106.method1531(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field118 == 1338) {
                                method3229();
                                class106.method1531(var12, var13, Statics.field307.field2231 + var12, Statics.field307.field2227 + var13);
                                if (field1672 == 2 || field1672 == 5) {
                                    class106.method1546(var12 + 25, var13 + 5, 0, Statics.field2355, Statics.field1885);
                                } else {
                                    int var73 = field1549 + field1536 & 0x7FF;
                                    int var74 = Statics.field1393.field2461 / 32 + 48;
                                    int var75 = 464 - Statics.field1393.field2500 / 32;
                                    Statics.field234.method2523(var12 + 25, var13 + 5, 146, 151, var74, var75, var73, field1592 + 256, Statics.field2355, Statics.field1885);
                                    for (int var76 = 0; var76 < field1691; var76++) {
                                        int var77 = field1692[var76] * 4 + 2 - Statics.field1393.field2461 / 32;
                                        int var78 = field1467[var76] * 4 + 2 - Statics.field1393.field2500 / 32;
                                        method1393(var12, var13, var77, var78, field1653[var76]);
                                    }
                                    for (int var79 = 0; var79 < 104; var79++) {
                                        for (int var80 = 0; var80 < 104; var80++) {
                                            class71 var81 = field1597[Statics.field933][var79][var80];
                                            if (var81 != null) {
                                                int var82 = var79 * 4 + 2 - Statics.field1393.field2461 / 32;
                                                int var83 = var80 * 4 + 2 - Statics.field1393.field2500 / 32;
                                                method1393(var12, var13, var82, var83, Statics.field1118[0]);
                                            }
                                        }
                                    }
                                    for (int var84 = 0; var84 < field1500; var84++) {
                                        class66 var85 = field1491[field1482[var84]];
                                        if (var85 != null && var85.method944()) {
                                            class184 var86 = var85.field971;
                                            if (var86 != null && var86.field2819 != null) {
                                                var86 = var86.method3457();
                                            }
                                            if (var86 != null && var86.field2823 && var86.field2848) {
                                                int var87 = var85.field2461 / 32 - Statics.field1393.field2461 / 32;
                                                int var88 = var85.field2500 / 32 - Statics.field1393.field2500 / 32;
                                                method1393(var12, var13, var87, var88, Statics.field1118[1]);
                                            }
                                        }
                                    }
                                    for (int var89 = 0; var89 < field1584; var89++) {
                                        class61 var90 = field1583[field1525[var89]];
                                        if (var90 != null && var90.method944()) {
                                            int var91 = var90.field2461 / 32 - Statics.field1393.field2461 / 32;
                                            int var92 = var90.field2500 / 32 - Statics.field1393.field2500 / 32;
                                            boolean var93 = false;
                                            if (method2157(var90.field918)) {
                                                var93 = true;
                                            }
                                            boolean var94 = false;
                                            for (int var95 = 0; var95 < Statics.field2438; var95++) {
                                                if (var90.field918.equals(Statics.field1267[var95].field878)) {
                                                    var94 = true;
                                                    break;
                                                }
                                            }
                                            boolean var96 = false;
                                            if (Statics.field1393.field919 != 0 && var90.field919 != 0 && Statics.field1393.field919 == var90.field919) {
                                                var96 = true;
                                            }
                                            if (var93) {
                                                method1393(var12, var13, var91, var92, Statics.field1118[3]);
                                            } else if (var96) {
                                                method1393(var12, var13, var91, var92, Statics.field1118[4]);
                                            } else if (var94) {
                                                method1393(var12, var13, var91, var92, Statics.field1118[5]);
                                            } else {
                                                method1393(var12, var13, var91, var92, Statics.field1118[2]);
                                            }
                                        }
                                    }
                                    if (field1538 != 0 && field1468 % 20 < 10) {
                                        if (field1538 == 1 && field1662 >= 0 && field1662 < field1491.length) {
                                            class66 var97 = field1491[field1662];
                                            if (var97 != null) {
                                                int var98 = var97.field2461 / 32 - Statics.field1393.field2461 / 32;
                                                int var99 = var97.field2500 / 32 - Statics.field1393.field2500 / 32;
                                                method955(var12, var13, var98, var99, Statics.field1227[1]);
                                            }
                                        }
                                        if (field1538 == 2) {
                                            int var100 = field1529 * 4 - Statics.field2722 * 4 + 2 - Statics.field1393.field2461 / 32;
                                            int var101 = field1481 * 4 - Statics.field1915 * 4 + 2 - Statics.field1393.field2500 / 32;
                                            method955(var12, var13, var100, var101, Statics.field1227[1]);
                                        }
                                        if (field1538 == 10 && field1697 >= 0 && field1697 < field1583.length) {
                                            class61 var102 = field1583[field1697];
                                            if (var102 != null) {
                                                int var103 = var102.field2461 / 32 - Statics.field1393.field2461 / 32;
                                                int var104 = var102.field2500 / 32 - Statics.field1393.field2500 / 32;
                                                method955(var12, var13, var103, var104, Statics.field1227[1]);
                                            }
                                        }
                                    }
                                    if (field1478 != 0) {
                                        int var105 = field1478 * 4 + 2 - Statics.field1393.field2461 / 32;
                                        int var106 = field1696 * 4 + 2 - Statics.field1393.field2500 / 32;
                                        method1393(var12, var13, var105, var106, Statics.field1227[0]);
                                    }
                                    class106.method1537(var12 + 93 + 4, var13 + 82 - 4, 3, 3, 16777215);
                                }
                                if (field1672 < 3) {
                                    Statics.field1367.method2523(var12, var13, 33, 33, 25, 25, field1549, 256, Statics.field1093, Statics.field515);
                                } else {
                                    class106.method1546(var12, var13, 0, Statics.field1093, Statics.field515);
                                }
                                if (field1649[var11]) {
                                    Statics.field307.method2640(var12, var13);
                                }
                                field1603[var11] = true;
                                class106.method1531(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var107 = class116.field1810;
                        int var108 = class116.field1816;
                        if (!field1605 && var107 >= var19 && var108 >= var20 && var107 < var21 && var108 < var22) {
                            int var109 = var107 - var12;
                            int var110 = var108 - var13;
                            if (var10.field160 == 1) {
                                method1086(var10.field131, "", 24, 0, 0, var10.field167);
                            }
                            if (var10.field160 == 2 && !field1619) {
                                String var111 = method3029(var10);
                                if (var111 != null) {
                                    method1086(var111, class62.method1489(65280) + var10.field212, 25, 0, -1, var10.field167);
                                }
                            }
                            if (var10.field160 == 3) {
                                method1086(class57.field790, "", 26, 0, 0, var10.field167);
                            }
                            if (var10.field160 == 4) {
                                method1086(var10.field131, "", 28, 0, 0, var10.field167);
                            }
                            if (var10.field160 == 5) {
                                method1086(var10.field131, "", 29, 0, 0, var10.field167);
                            }
                            if (var10.field160 == 6 && field1620 == null) {
                                method1086(var10.field131, "", 30, 0, -1, var10.field167);
                            }
                            if (var10.field114 == 2) {
                                int var112 = 0;
                                for (int var113 = 0; var113 < var10.field122; var113++) {
                                    for (int var114 = 0; var114 < var10.field121; var114++) {
                                        int var115 = (var10.field177 + 32) * var114;
                                        int var116 = (var10.field166 + 32) * var113;
                                        if (var112 < 20) {
                                            var115 += var10.field168[var112];
                                            var116 += var10.field112[var112];
                                        }
                                        if (var109 >= var115 && var110 >= var116 && var109 < var115 + 32 && var110 < var116 + 32) {
                                            field1579 = var112;
                                            Statics.field1575 = var10;
                                            if (var10.field201[var112] > 0) {
                                                label1615: {
                                                    class172 var117 = class172.method934(var10.field201[var112] - 1);
                                                    if (field1675 == 1) {
                                                        int var118 = method1362(var10);
                                                        boolean var119 = (var118 >> 30 & 0x1) != 0;
                                                        if (var119) {
                                                            if (Statics.field2032 != var10.field167 || Statics.field1071 != var112) {
                                                                method1086(class57.field781, field1519 + " " + class62.field926 + " " + class62.method1489(16748608) + var117.field2608, 31, var117.field2636, var112, var10.field167);
                                                            }
                                                            break label1615;
                                                        }
                                                    }
                                                    if (field1619) {
                                                        int var120 = method1362(var10);
                                                        boolean var121 = (var120 >> 30 & 0x1) != 0;
                                                        if (var121) {
                                                            if ((Statics.field963 & 0x10) == 16) {
                                                                method1086(field1644, field1578 + " " + class62.field926 + " " + class62.method1489(16748608) + var117.field2608, 32, var117.field2636, var112, var10.field167);
                                                            }
                                                            break label1615;
                                                        }
                                                    }
                                                    String[] var122 = var117.field2623;
                                                    if (field1633) {
                                                        var122 = method1219(var122);
                                                    }
                                                    int var123 = method1362(var10);
                                                    boolean var124 = (var123 >> 30 & 0x1) != 0;
                                                    if (var124) {
                                                        for (int var125 = 4; var125 >= 3; var125--) {
                                                            if (var122 != null && var122[var125] != null) {
                                                                byte var126;
                                                                if (var125 == 3) {
                                                                    var126 = 36;
                                                                } else {
                                                                    var126 = 37;
                                                                }
                                                                method1086(var122[var125], class62.method1489(16748608) + var117.field2608, var126, var117.field2636, var112, var10.field167);
                                                            } else if (var125 == 4) {
                                                                method1086(class57.field719, class62.method1489(16748608) + var117.field2608, 37, var117.field2636, var112, var10.field167);
                                                            }
                                                        }
                                                    }
                                                    int var127 = method1362(var10);
                                                    boolean var128 = (var127 >> 31 & 0x1) != 0;
                                                    if (var128) {
                                                        method1086(class57.field781, class62.method1489(16748608) + var117.field2608, 38, var117.field2636, var112, var10.field167);
                                                    }
                                                    int var129 = method1362(var10);
                                                    boolean var130 = (var129 >> 30 & 0x1) != 0;
                                                    if (var130 && var122 != null) {
                                                        for (int var131 = 2; var131 >= 0; var131--) {
                                                            if (var122[var131] != null) {
                                                                byte var132 = 0;
                                                                if (var131 == 0) {
                                                                    var132 = 33;
                                                                }
                                                                if (var131 == 1) {
                                                                    var132 = 34;
                                                                }
                                                                if (var131 == 2) {
                                                                    var132 = 35;
                                                                }
                                                                method1086(var122[var131], class62.method1489(16748608) + var117.field2608, var132, var117.field2636, var112, var10.field167);
                                                            }
                                                        }
                                                    }
                                                    String[] var133 = var10.field225;
                                                    if (field1633) {
                                                        var133 = method1219(var133);
                                                    }
                                                    if (var133 != null) {
                                                        for (int var134 = 4; var134 >= 0; var134--) {
                                                            if (var133[var134] != null) {
                                                                byte var135 = 0;
                                                                if (var134 == 0) {
                                                                    var135 = 39;
                                                                }
                                                                if (var134 == 1) {
                                                                    var135 = 40;
                                                                }
                                                                if (var134 == 2) {
                                                                    var135 = 41;
                                                                }
                                                                if (var134 == 3) {
                                                                    var135 = 42;
                                                                }
                                                                if (var134 == 4) {
                                                                    var135 = 43;
                                                                }
                                                                method1086(var133[var134], class62.method1489(16748608) + var117.field2608, var135, var117.field2636, var112, var10.field167);
                                                            }
                                                        }
                                                    }
                                                    method1086(class57.field782, class62.method1489(16748608) + var117.field2608, 1005, var117.field2636, var112, var10.field167);
                                                }
                                            }
                                        }
                                        var112++;
                                    }
                                }
                            }
                            if (var10.field111) {
                                if (!field1619) {
                                    for (int var136 = 9; var136 >= 5; var136--) {
                                        String var137 = method1395(var10, var136);
                                        if (var137 != null) {
                                            method1086(var137, var10.field172, 1007, var136 + 1, var10.field113, var10.field167);
                                        }
                                    }
                                    String var138 = method3029(var10);
                                    if (var138 != null) {
                                        method1086(var138, var10.field172, 25, 0, var10.field113, var10.field167);
                                    }
                                    for (int var139 = 4; var139 >= 0; var139--) {
                                        String var140 = method1395(var10, var139);
                                        if (var140 != null) {
                                            method1086(var140, var10.field172, 57, var139 + 1, var10.field113, var10.field167);
                                        }
                                    }
                                    if (class12.method297(method1362(var10))) {
                                        method1086(class57.field646, "", 30, 0, var10.field113, var10.field167);
                                    }
                                } else if (class12.method3262(method1362(var10)) && (Statics.field963 & 0x20) == 32) {
                                    method1086(field1644, field1578 + " " + class62.field926 + " " + var10.field172, 58, 0, var10.field113, var10.field167);
                                }
                            }
                        }
                        if (var10.field114 == 0) {
                            if (!var10.field111 && method3149(var10) && Statics.field1087 != var10) {
                                continue;
                            }
                            if (!var10.field111) {
                                if (var10.field126 > var10.field128 - var10.field122) {
                                    var10.field126 = var10.field128 - var10.field122;
                                }
                                if (var10.field126 < 0) {
                                    var10.field126 = 0;
                                }
                            }
                            method1175(arg0, var10.field167, var19, var20, var21, var22, var12 - var10.field125, var13 - var10.field126, var11);
                            if (var10.field220 != null) {
                                method1175(var10.field220, var10.field167, var19, var20, var21, var22, var12 - var10.field125, var13 - var10.field126, var11);
                            }
                            class78 var141 = (class78) field1505.method8((long) var10.field167);
                            if (var141 != null) {
                                if (var141.field1101 == 0 && class116.field1810 >= var19 && class116.field1816 >= var20 && class116.field1810 < var21 && class116.field1816 < var22 && !field1605 && !field1631) {
                                    field1627[0] = class57.field854;
                                    field1612[0] = "";
                                    field1609[0] = 1006;
                                    field1606 = 1;
                                }
                                int var142 = var141.field1103;
                                if (class17.method856(var142)) {
                                    Statics.field1308 = null;
                                    method1175(Statics.field116[var142], -1, var19, var20, var21, var22, var12, var13, var11);
                                    if (Statics.field1308 != null) {
                                        method1175(Statics.field1308, -1412584499, var19, var20, var21, var22, Statics.field1933, Statics.field1020, var11);
                                        Statics.field1308 = null;
                                    }
                                } else if (var11 == -1) {
                                    for (int var143 = 0; var143 < 100; var143++) {
                                        field1666[var143] = true;
                                    }
                                } else {
                                    field1666[var11] = true;
                                }
                            }
                            class106.method1531(arg2, arg3, arg4, arg5);
                            class155.method2752();
                        }
                        if (field1649[var11] || field1673 > 1) {
                            if (var10.field114 == 0 && !var10.field111 && var10.field128 > var10.field122) {
                                method1387(var10.field121 + var12, var13, var10.field126, var10.field122, var10.field128);
                            }
                            if (var10.field114 != 1) {
                                if (var10.field114 == 2) {
                                    int var144 = 0;
                                    for (int var145 = 0; var145 < var10.field122; var145++) {
                                        for (int var146 = 0; var146 < var10.field121; var146++) {
                                            int var147 = (var10.field177 + 32) * var146 + var12;
                                            int var148 = (var10.field166 + 32) * var145 + var13;
                                            if (var144 < 20) {
                                                var147 += var10.field168[var144];
                                                var148 += var10.field112[var144];
                                            }
                                            if (var10.field201[var144] > 0) {
                                                boolean var149 = false;
                                                boolean var150 = false;
                                                int var151 = var10.field201[var144] - 1;
                                                if (var147 + 32 > arg2 && var147 < arg4 && var148 + 32 > arg3 && var148 < arg5 || Statics.field1919 == var10 && field1576 == var144) {
                                                    class140 var152;
                                                    if (field1675 == 1 && Statics.field1071 == var144 && Statics.field2032 == var10.field167) {
                                                        var152 = class172.method1085(var151, var10.field215[var144], 2, 0, false);
                                                    } else {
                                                        var152 = class172.method1085(var151, var10.field215[var144], 1, 3153952, false);
                                                    }
                                                    if (var152 == null) {
                                                        method854(var10);
                                                    } else if (Statics.field1919 == var10 && field1576 == var144) {
                                                        int var153 = class116.field1810 - field1577;
                                                        int var154 = class116.field1816 - field1496;
                                                        if (var153 < 5 && var153 > -5) {
                                                            var153 = 0;
                                                        }
                                                        if (var154 < 5 && var154 > -5) {
                                                            var154 = 0;
                                                        }
                                                        if (field1581 < 5) {
                                                            var153 = 0;
                                                            var154 = 0;
                                                        }
                                                        var152.method2495(var147 + var153, var148 + var154, 128);
                                                        if (arg1 != -1) {
                                                            class17 var155 = arg0[arg1 & 0xFFFF];
                                                            if (var148 + var154 < class106.field1451 && var155.field126 > 0) {
                                                                int var156 = field1541 * (class106.field1451 - var148 - var154) / 3;
                                                                if (var156 > field1541 * 10) {
                                                                    var156 = field1541 * 10;
                                                                }
                                                                if (var156 > var155.field126) {
                                                                    var156 = var155.field126;
                                                                }
                                                                var155.field126 -= var156;
                                                                field1496 += var156;
                                                                method854(var155);
                                                            }
                                                            if (var148 + var154 + 32 > class106.field1452 && var155.field126 < var155.field128 - var155.field122) {
                                                                int var157 = field1541 * (var148 + var154 + 32 - class106.field1452) / 3;
                                                                if (var157 > field1541 * 10) {
                                                                    var157 = field1541 * 10;
                                                                }
                                                                if (var157 > var155.field128 - var155.field122 - var155.field126) {
                                                                    var157 = var155.field128 - var155.field122 - var155.field126;
                                                                }
                                                                var155.field126 += var157;
                                                                field1496 -= var157;
                                                                method854(var155);
                                                            }
                                                        }
                                                    } else if (Statics.field962 == var10 && field1574 == var144) {
                                                        var152.method2495(var147, var148, 128);
                                                    } else {
                                                        var152.method2489(var147, var148);
                                                    }
                                                }
                                            } else if (var10.field169 != null && var144 < 20) {
                                                class140 var158 = var10.method138(var144);
                                                if (var158 != null) {
                                                    var158.method2489(var147, var148);
                                                } else if (class17.field214) {
                                                    method854(var10);
                                                }
                                            }
                                            var144++;
                                        }
                                    }
                                } else if (var10.field114 == 3) {
                                    int var159;
                                    if (method1492(var10)) {
                                        var159 = var10.field130;
                                        if (Statics.field1087 == var10 && var10.field132 != 0) {
                                            var159 = var10.field132;
                                        }
                                    } else {
                                        var159 = var10.field129;
                                        if (Statics.field1087 == var10 && var10.field223 != 0) {
                                            var159 = var10.field223;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field133) {
                                            class106.method1537(var12, var13, var10.field121, var10.field122, var159);
                                        } else {
                                            class106.method1539(var12, var13, var10.field121, var10.field122, var159);
                                        }
                                    } else if (var10.field133) {
                                        class106.method1536(var12, var13, var10.field121, var10.field122, var159, 256 - (var14 & 0xFF));
                                    } else {
                                        class106.method1573(var12, var13, var10.field121, var10.field122, var159, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field114 == 4) {
                                    class23 var160 = var10.method163();
                                    if (var160 != null) {
                                        String var161 = var10.field205;
                                        int var162;
                                        if (method1492(var10)) {
                                            var162 = var10.field130;
                                            if (Statics.field1087 == var10 && var10.field132 != 0) {
                                                var162 = var10.field132;
                                            }
                                            if (var10.field162.length() > 0) {
                                                var161 = var10.field162;
                                            }
                                        } else {
                                            var162 = var10.field129;
                                            if (Statics.field1087 == var10 && var10.field223 != 0) {
                                                var162 = var10.field223;
                                            }
                                        }
                                        if (var10.field111 && var10.field216 != -1) {
                                            class172 var163 = class172.method934(var10.field216);
                                            var161 = var163.field2608;
                                            if (var161 == null) {
                                                var161 = "null";
                                            }
                                            if ((var163.field2644 == 1 || var10.field217 != 1) && var10.field217 != -1) {
                                                var161 = class62.method1489(16748608) + var161 + class62.field925 + " " + 'x' + method2187(var10.field217);
                                            }
                                        }
                                        if (field1620 == var10) {
                                            class57 var10000 = (class57) null;
                                            var161 = class57.field789;
                                            var162 = var10.field129;
                                        }
                                        if (!var10.field111) {
                                            var161 = method2284(var161, var10);
                                        }
                                        var160.method224(var161, var12, var13, var10.field121, var10.field122, var162, var10.field164 ? 0 : -1, var10.field115, var10.field163, var10.field143);
                                    } else if (class17.field214) {
                                        method854(var10);
                                    }
                                } else if (var10.field114 == 5) {
                                    if (var10.field111) {
                                        class140 var165;
                                        if (var10.field216 == -1) {
                                            var165 = var10.method137(false);
                                        } else {
                                            var165 = class172.method1085(var10.field216, var10.field217, var10.field196, var10.field124, false);
                                        }
                                        if (var165 != null) {
                                            int var166 = var165.field2133;
                                            int var167 = var165.field2137;
                                            if (var10.field139) {
                                                class106.method1586(var12, var13, var10.field121 + var12, var10.field122 + var13);
                                                int var168 = (var10.field121 + (var166 - 1)) / var166;
                                                int var169 = (var10.field122 + (var167 - 1)) / var167;
                                                for (int var170 = 0; var170 < var168; var170++) {
                                                    for (int var171 = 0; var171 < var169; var171++) {
                                                        if (var10.field138 != 0) {
                                                            var165.method2501(var166 / 2 + var166 * var170 + var12, var167 / 2 + var167 * var171 + var13, var10.field138, 4096);
                                                        } else if (var14 == 0) {
                                                            var165.method2489(var166 * var170 + var12, var167 * var171 + var13);
                                                        } else {
                                                            var165.method2495(var166 * var170 + var12, var167 * var171 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class106.method1531(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var172 = var10.field121 * 4096 / var166;
                                                if (var10.field138 != 0) {
                                                    var165.method2501(var10.field121 / 2 + var12, var10.field122 / 2 + var13, var10.field138, var172);
                                                } else if (var14 != 0) {
                                                    var165.method2558(var12, var13, var10.field121, var10.field122, 256 - (var14 & 0xFF));
                                                } else if (var10.field121 == var166 && var10.field122 == var167) {
                                                    var165.method2489(var12, var13);
                                                } else {
                                                    var165.method2491(var12, var13, var10.field121, var10.field122);
                                                }
                                            }
                                        } else if (class17.field214) {
                                            method854(var10);
                                        }
                                    } else {
                                        class140 var164 = var10.method137(method1492(var10));
                                        if (var164 != null) {
                                            var164.method2489(var12, var13);
                                        } else if (class17.field214) {
                                            method854(var10);
                                        }
                                    }
                                } else if (var10.field114 == 6) {
                                    boolean var173 = method1492(var10);
                                    int var174;
                                    if (var173) {
                                        var174 = var10.field149;
                                    } else {
                                        var174 = var10.field141;
                                    }
                                    class43 var175 = null;
                                    int var176 = 0;
                                    if (var10.field216 != -1) {
                                        class172 var177 = class172.method934(var10.field216);
                                        if (var177 != null) {
                                            class172 var178 = var177.method3126(var10.field217);
                                            var175 = var178.method3095(1);
                                            if (var175 == null) {
                                                method854(var10);
                                            } else {
                                                var175.method778();
                                                var176 = var175.field1455 / 2;
                                            }
                                        }
                                    } else if (var10.field134 == 5) {
                                        if (var10.field145 == 0) {
                                            var175 = field1722.method1067((class165) null, -1, (class165) null, -1);
                                        } else {
                                            var175 = Statics.field1393.method908();
                                        }
                                    } else if (var174 == -1) {
                                        var175 = var10.method139((class165) null, -1, var173, Statics.field1393.field911);
                                        if (var175 == null && class17.field214) {
                                            method854(var10);
                                        }
                                    } else {
                                        class165 var179 = class165.method3233(var174);
                                        var175 = var10.method139(var179, var10.field218, var173, Statics.field1393.field911);
                                        if (var175 == null && class17.field214) {
                                            method854(var10);
                                        }
                                    }
                                    class155.method2755(var10.field121 / 2 + var12, var10.field122 / 2 + var13);
                                    int var180 = var10.field155 * class155.field2344[var10.field159] >> 16;
                                    int var181 = var10.field155 * class155.field2332[var10.field159] >> 16;
                                    if (var175 != null) {
                                        if (var10.field111) {
                                            var175.method778();
                                            if (var10.field170) {
                                                var175.method789(0, var10.field153, var10.field154, var10.field159, var10.field189, var10.field151 + var176 + var180, var10.field151 + var181, var10.field155);
                                            } else {
                                                var175.method795(0, var10.field153, var10.field154, var10.field159, var10.field189, var10.field151 + var176 + var180, var10.field151 + var181);
                                            }
                                        } else {
                                            var175.method795(0, var10.field153, 0, var10.field159, 0, var180, var181);
                                        }
                                    }
                                    class155.method2754();
                                } else {
                                    if (var10.field114 == 7) {
                                        class23 var182 = var10.method163();
                                        if (var182 == null) {
                                            if (class17.field214) {
                                                method854(var10);
                                            }
                                            continue;
                                        }
                                        int var183 = 0;
                                        for (int var184 = 0; var184 < var10.field122; var184++) {
                                            for (int var185 = 0; var185 < var10.field121; var185++) {
                                                if (var10.field201[var183] > 0) {
                                                    class172 var186 = class172.method934(var10.field201[var183] - 1);
                                                    String var187;
                                                    if (var186.field2644 != 1 && var10.field215[var183] == 1) {
                                                        var187 = class62.method1489(16748608) + var186.field2608 + class62.field925;
                                                    } else {
                                                        var187 = class62.method1489(16748608) + var186.field2608 + class62.field925 + " " + 'x' + method2187(var10.field215[var183]);
                                                    }
                                                    int var188 = (var10.field177 + 115) * var185 + var12;
                                                    int var189 = (var10.field166 + 12) * var184 + var13;
                                                    if (var10.field115 == 0) {
                                                        var182.method221(var187, var188, var189, var10.field129, var10.field164 ? 0 : -1);
                                                    } else if (var10.field115 == 1) {
                                                        var182.method223(var187, var10.field121 / 2 + var188, var189, var10.field129, var10.field164 ? 0 : -1);
                                                    } else {
                                                        var182.method222(var187, var10.field121 + var188 - 1, var189, var10.field129, var10.field164 ? 0 : -1);
                                                    }
                                                }
                                                var183++;
                                            }
                                        }
                                    }
                                    if (var10.field114 == 8 && Statics.field1089 == var10 && field1645 == field1501) {
                                        int var190 = 0;
                                        int var191 = 0;
                                        class23 var192 = Statics.field1408;
                                        String var193 = var10.field205;
                                        String var194 = method2284(var193, var10);
                                        while (var194.length() > 0) {
                                            int var195 = var194.indexOf(class62.field934);
                                            String var196;
                                            if (var195 == -1) {
                                                var196 = var194;
                                                var194 = "";
                                            } else {
                                                var196 = var194.substring(0, var195);
                                                var194 = var194.substring(var195 + 4);
                                            }
                                            int var197 = var192.method216(var196);
                                            if (var197 > var190) {
                                                var190 = var197;
                                            }
                                            var191 += var192.field253 + 1;
                                        }
                                        var190 += 6;
                                        var191 += 7;
                                        int var198 = var10.field121 + var12 - 5 - var190;
                                        int var199 = var10.field122 + var13 + 5;
                                        if (var198 < var12 + 5) {
                                            var198 = var12 + 5;
                                        }
                                        if (var190 + var198 > arg4) {
                                            var198 = arg4 - var190;
                                        }
                                        if (var191 + var199 > arg5) {
                                            var199 = arg5 - var191;
                                        }
                                        class106.method1537(var198, var199, var190, var191, 16777120);
                                        class106.method1539(var198, var199, var190, var191, 0);
                                        String var200 = var10.field205;
                                        int var201 = var192.field253 + var199 + 2;
                                        String var202 = method2284(var200, var10);
                                        while (var202.length() > 0) {
                                            int var203 = var202.indexOf(class62.field934);
                                            String var204;
                                            if (var203 == -1) {
                                                var204 = var202;
                                                var202 = "";
                                            } else {
                                                var204 = var202.substring(0, var203);
                                                var202 = var202.substring(var203 + 4);
                                            }
                                            var192.method221(var204, var198 + 3, var201, 0, -1);
                                            var201 += var192.field253 + 1;
                                        }
                                    }
                                    if (var10.field114 == 9) {
                                        if (var10.field135 == 1) {
                                            class106.method1547(var12, var13, var10.field121 + var12, var10.field122 + var13, var10.field129);
                                        } else {
                                            int var205 = var10.field121 >= 0 ? var10.field121 : -var10.field121;
                                            int var206 = var10.field122 >= 0 ? var10.field122 : -var10.field122;
                                            int var207 = var205;
                                            if (var205 < var206) {
                                                var207 = var206;
                                            }
                                            if (var207 != 0) {
                                                int var208 = (var10.field121 << 16) / var207;
                                                int var209 = (var10.field122 << 16) / var207;
                                                if (var209 <= var208) {
                                                    var208 = -var208;
                                                } else {
                                                    var209 = -var209;
                                                }
                                                int var210 = var10.field135 * var209 >> 17;
                                                int var211 = var10.field135 * var209 + 1 >> 17;
                                                int var212 = var10.field135 * var208 >> 17;
                                                int var213 = var10.field135 * var208 + 1 >> 17;
                                                int var214 = var12 + var210;
                                                int var215 = var12 - var211;
                                                int var216 = var10.field121 + var12 - var211;
                                                int var217 = var10.field121 + var12 + var210;
                                                int var218 = var13 + var212;
                                                int var219 = var13 - var213;
                                                int var220 = var10.field122 + var13 - var213;
                                                int var221 = var10.field122 + var13 + var212;
                                                class155.method2803(var214, var215, var216);
                                                class155.method2763(var218, var219, var220, var214, var215, var216, var10.field129);
                                                class155.method2803(var214, var216, var217);
                                                class155.method2763(var218, var220, var221, var214, var216, var217, var10.field129);
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

    @ObfuscatedName("j.bl(B)V")
    public static final void method1177() {
        int var0 = field1504.method747(8);
        if (var0 < field1584) {
            for (int var1 = var0; var1 < field1584; var1++) {
                field1638[++field1591 - 1] = field1525[var1];
            }
        }
        if (var0 > field1584) {
            throw new RuntimeException("");
        }
        field1584 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field1525[var2];
            class61 var4 = field1583[var3];
            int var5 = field1504.method747(1);
            if (var5 == 0) {
                field1525[++field1584 - 1] = var3;
                var4.field2484 = field1468;
            } else {
                int var6 = field1504.method747(2);
                if (var6 == 0) {
                    field1525[++field1584 - 1] = var3;
                    var4.field2484 = field1468;
                    field1587[++field1628 - 1] = var3;
                } else if (var6 == 1) {
                    field1525[++field1584 - 1] = var3;
                    var4.field2484 = field1468;
                    int var7 = field1504.method747(3);
                    var4.method2970(var7, false);
                    int var8 = field1504.method747(1);
                    if (var8 == 1) {
                        field1587[++field1628 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field1525[++field1584 - 1] = var3;
                    var4.field2484 = field1468;
                    int var9 = field1504.method747(3);
                    var4.method2970(var9, true);
                    int var10 = field1504.method747(3);
                    var4.method2970(var10, true);
                    int var11 = field1504.method747(1);
                    if (var11 == 1) {
                        field1587[++field1628 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field1638[++field1591 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("j.by(S)V")
    public static final void method1178() {
        for (class80 var0 = (class80) field1598.method1104(); var0 != null; var0 = (class80) field1598.method1106()) {
            if (var0.field1127 > 0) {
                var0.field1127--;
            }
            if (var0.field1127 != 0) {
                if (var0.field1122 > 0) {
                    var0.field1122--;
                }
                if (var0.field1122 == 0 && var0.field1125 >= 1 && var0.field1115 >= 1 && var0.field1125 <= 102 && var0.field1115 <= 102 && (var0.field1124 < 0 || class72.method1453(var0.field1124, var0.field1121))) {
                    method3427(var0.field1119, var0.field1123, var0.field1125, var0.field1115, var0.field1124, var0.field1120, var0.field1121);
                    var0.field1122 = -1;
                    if (var0.field1124 == var0.field1116 && var0.field1116 == -1) {
                        var0.method76();
                    } else if (var0.field1124 == var0.field1116 && var0.field1120 == var0.field1117 && var0.field1121 == var0.field1113) {
                        var0.method76();
                    }
                }
            } else if (var0.field1116 < 0 || class72.method1453(var0.field1116, var0.field1113)) {
                method3427(var0.field1119, var0.field1123, var0.field1125, var0.field1115, var0.field1116, var0.field1117, var0.field1113);
                var0.method76();
            }
        }
    }

    @ObfuscatedName("fe.y(II)V")
    public static void method1179(int arg0) {
        if (field1466 == arg0) {
            return;
        }
        if (field1466 == 0) {
            class114.method922();
        }
        if (arg0 == 20 || arg0 == 40) {
            field1494 = 0;
            field1495 = 0;
            field1639 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2560 != null) {
            Statics.field2560.method2148();
            Statics.field2560 = null;
        }
        if (field1466 == 25) {
            field1661 = 0;
            field1531 = 0;
            field1516 = 1;
            field1517 = 0;
            field1518 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class86.method958(Statics.field1009, Statics.field1497, Statics.field417);
        } else if (Statics.field1198) {
            Statics.field1271 = null;
            Statics.field1196 = null;
            Statics.field2195 = null;
            Statics.field1374 = null;
            Statics.field1222 = null;
            Statics.field73 = null;
            Statics.field552 = null;
            Statics.field1821 = null;
            Statics.field1875 = null;
            Statics.field1 = null;
            Statics.field1221 = null;
            Statics.field1916 = null;
            Statics.field1873 = null;
            Statics.field2156 = null;
            Statics.field1229 = null;
            Statics.field985 = null;
            Statics.field988 = null;
            Statics.field1195 = null;
            Statics.field1322 = null;
            Statics.field1420 = null;
            class101.method2166(2);
            class105.method1088(true);
            Statics.field1198 = false;
        }
        field1466 = arg0;
    }

    @ObfuscatedName("fe.ah(I)V")
    public static final void method1180() {
        for (int var0 = -1; var0 < field1584; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field1525[var0];
            }
            class61 var2 = field1583[var1];
            if (var2 != null) {
                method1182(var2, 1);
            }
        }
    }

    @ObfuscatedName("k.aw(I)V")
    public static final void method1181() {
        for (class56 var0 = (class56) field1483.method1104(); var0 != null; var0 = (class56) field1483.method1106()) {
            if (Statics.field933 != var0.field610 || field1468 > var0.field624) {
                var0.method76();
            } else if (field1468 >= var0.field615) {
                if (var0.field616 > 0) {
                    class66 var1 = field1491[var0.field616 - 1];
                    if (var1 != null && var1.field2461 >= 0 && var1.field2461 < 13312 && var1.field2500 >= 0 && var1.field2500 < 13312) {
                        var0.method914(var1.field2461, var1.field2500, method924(var1.field2461, var1.field2500, var0.field610) - var0.field614, field1468);
                    }
                }
                if (var0.field616 < 0) {
                    int var2 = -var0.field616 - 1;
                    class61 var3;
                    if (field1589 == var2) {
                        var3 = Statics.field1393;
                    } else {
                        var3 = field1583[var2];
                    }
                    if (var3 != null && var3.field2461 >= 0 && var3.field2461 < 13312 && var3.field2500 >= 0 && var3.field2500 < 13312) {
                        var0.method914(var3.field2461, var3.field2500, method924(var3.field2461, var3.field2500, var0.field610) - var0.field614, field1468);
                    }
                }
                var0.method905(field1541);
                Statics.field967.method2343(Statics.field933, (int) var0.field621, (int) var0.field622, (int) var0.field623, 60, var0, var0.field629, -1, false);
            }
        }
    }

    @ObfuscatedName("k.aa(Las;II)V")
    public static final void method1182(class164 arg0, int arg1) {
        if (arg0.field2497 > field1468) {
            method1087(arg0);
        } else if (arg0.field2454 >= field1468) {
            method1371(arg0);
        } else {
            arg0.field2480 = arg0.field2459;
            if (arg0.field2505 == 0) {
                arg0.field2509 = 0;
            } else {
                label205: {
                    if (arg0.field2483 != -1 && arg0.field2470 == 0) {
                        class165 var2 = class165.method3233(arg0.field2483);
                        if (arg0.field2474 > 0 && var2.field2533 == 0) {
                            arg0.field2509++;
                            break label205;
                        }
                        if (arg0.field2474 <= 0 && var2.field2530 == 0) {
                            arg0.field2509++;
                            break label205;
                        }
                    }
                    int var3 = arg0.field2461;
                    int var4 = arg0.field2500;
                    int var5 = arg0.field2503[arg0.field2505 - 1] * 128 + arg0.field2458 * 64;
                    int var6 = arg0.field2507[arg0.field2505 - 1] * 128 + arg0.field2458 * 64;
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        if (var3 < var5) {
                            if (var4 < var6) {
                                arg0.field2502 = 1280;
                            } else if (var4 > var6) {
                                arg0.field2502 = 1792;
                            } else {
                                arg0.field2502 = 1536;
                            }
                        } else if (var3 > var5) {
                            if (var4 < var6) {
                                arg0.field2502 = 768;
                            } else if (var4 > var6) {
                                arg0.field2502 = 256;
                            } else {
                                arg0.field2502 = 512;
                            }
                        } else if (var4 < var6) {
                            arg0.field2502 = 1024;
                        } else if (var4 > var6) {
                            arg0.field2502 = 0;
                        }
                        int var7 = arg0.field2502 - arg0.field2490 & 0x7FF;
                        if (var7 > 1024) {
                            var7 -= 2048;
                        }
                        int var8 = arg0.field2463;
                        if (var7 >= -256 && var7 <= 256) {
                            var8 = arg0.field2462;
                        } else if (var7 >= 256 && var7 < 768) {
                            var8 = arg0.field2516;
                        } else if (var7 >= -768 && var7 <= -256) {
                            var8 = arg0.field2464;
                        }
                        if (var8 == -1) {
                            var8 = arg0.field2462;
                        }
                        arg0.field2480 = var8;
                        int var9 = 4;
                        boolean var10 = true;
                        if (arg0 instanceof class66) {
                            var10 = ((class66) arg0).field971.field2815;
                        }
                        if (var10) {
                            if (arg0.field2502 != arg0.field2490 && arg0.field2455 == -1 && arg0.field2504 != 0) {
                                var9 = 2;
                            }
                            if (arg0.field2505 > 2) {
                                var9 = 6;
                            }
                            if (arg0.field2505 > 3) {
                                var9 = 8;
                            }
                            if (arg0.field2509 > 0 && arg0.field2505 > 1) {
                                var9 = 8;
                                arg0.field2509--;
                            }
                        } else {
                            if (arg0.field2505 > 1) {
                                var9 = 6;
                            }
                            if (arg0.field2505 > 2) {
                                var9 = 8;
                            }
                            if (arg0.field2509 > 0 && arg0.field2505 > 1) {
                                var9 = 8;
                                arg0.field2509--;
                            }
                        }
                        if (arg0.field2508[arg0.field2505 - 1]) {
                            var9 <<= 0x1;
                        }
                        if (var9 >= 8 && arg0.field2480 == arg0.field2462 && arg0.field2466 != -1) {
                            arg0.field2480 = arg0.field2466;
                        }
                        if (var3 < var5) {
                            arg0.field2461 += var9;
                            if (arg0.field2461 > var5) {
                                arg0.field2461 = var5;
                            }
                        } else if (var3 > var5) {
                            arg0.field2461 -= var9;
                            if (arg0.field2461 < var5) {
                                arg0.field2461 = var5;
                            }
                        }
                        if (var4 < var6) {
                            arg0.field2500 += var9;
                            if (arg0.field2500 > var6) {
                                arg0.field2500 = var6;
                            }
                        } else if (var4 > var6) {
                            arg0.field2500 -= var9;
                            if (arg0.field2500 < var6) {
                                arg0.field2500 = var6;
                            }
                        }
                        if (arg0.field2461 == var5 && arg0.field2500 == var6) {
                            arg0.field2505--;
                            if (arg0.field2474 > 0) {
                                arg0.field2474--;
                            }
                        }
                    } else {
                        arg0.field2461 = var5;
                        arg0.field2500 = var6;
                    }
                }
            }
        }
        if (arg0.field2461 < 128 || arg0.field2500 < 128 || arg0.field2461 >= 13184 || arg0.field2500 >= 13184) {
            arg0.field2483 = -1;
            arg0.field2488 = -1;
            arg0.field2497 = 0;
            arg0.field2454 = 0;
            arg0.field2461 = arg0.field2503[0] * 128 + arg0.field2458 * 64;
            arg0.field2500 = arg0.field2507[0] * 128 + arg0.field2458 * 64;
            arg0.method2968();
        }
        if (Statics.field1393 == arg0 && (arg0.field2461 < 1536 || arg0.field2500 < 1536 || arg0.field2461 >= 11776 || arg0.field2500 >= 11776)) {
            arg0.field2483 = -1;
            arg0.field2488 = -1;
            arg0.field2497 = 0;
            arg0.field2454 = 0;
            arg0.field2461 = arg0.field2503[0] * 128 + arg0.field2458 * 64;
            arg0.field2500 = arg0.field2507[0] * 128 + arg0.field2458 * 64;
            arg0.method2968();
        }
        method3442(arg0);
        method2063(arg0);
    }

    @ObfuscatedName("h.bh(I)V")
    public static final void method1198() {
        for (int var0 = 0; var0 < field1628; var0++) {
            int var1 = field1587[var0];
            class61 var2 = field1583[var1];
            int var3 = field1504.method450();
            if ((var3 & 0x20) != 0) {
                var3 += field1504.method450() << 8;
            }
            if ((var3 & 0x1) != 0) {
                var2.field2455 = field1504.method349();
                if (var2.field2455 == 65535) {
                    var2.field2455 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field2478 = field1504.method345();
                var2.field2479 = field1504.method345();
            }
            if ((var3 & 0x8) != 0) {
                var2.field2467 = field1504.method451();
                if (var2.field2467.charAt(0) == '~') {
                    var2.field2467 = var2.field2467.substring(1);
                    method1199(2, var2.field918, var2.field2467);
                } else if (Statics.field1393 == var2) {
                    method1199(2, var2.field918, var2.field2467);
                }
                var2.field2492 = 0;
                var2.field2486 = 0;
                var2.field2468 = 150;
            }
            if ((var3 & 0x400) != 0) {
                var2.field2498 = field1504.method336();
                var2.field2495 = field1504.method486();
                var2.field2494 = field1504.method402();
                var2.field2496 = field1504.method336();
                var2.field2497 = field1504.method327() + field1468;
                var2.field2454 = field1504.method349() + field1468;
                var2.field2499 = field1504.method450();
                var2.field2505 = 1;
                var2.field2474 = 0;
            }
            if ((var3 & 0x80) != 0) {
                int var4 = field1504.method402();
                int var5 = field1504.method336();
                var2.method2960(var4, var5, field1468);
                var2.field2465 = field1468 + 300;
                var2.field2506 = field1504.method450();
                var2.field2476 = field1504.method402();
            }
            if ((var3 & 0x100) != 0) {
                var2.field2488 = field1504.method327();
                int var6 = field1504.method355();
                var2.field2471 = var6 >> 16;
                var2.field2491 = (var6 & 0xFFFF) + field1468;
                var2.field2475 = 0;
                var2.field2514 = 0;
                if (var2.field2491 > field1468) {
                    var2.field2475 = -1;
                }
                if (var2.field2488 == 65535) {
                    var2.field2488 = -1;
                }
            }
            if ((var3 & 0x2) != 0) {
                int var7 = field1504.method327();
                int var8 = field1504.method402();
                int var9 = field1504.method486();
                int var10 = field1504.field303;
                if (var2.field918 != null && var2.field911 != null) {
                    boolean var11 = false;
                    if (var8 <= 1 && method1079(var2.field918)) {
                        var11 = true;
                    }
                    if (!var11 && field1582 == 0) {
                        field1485.field303 = 0;
                        field1504.method356(field1485.field306, 0, var9);
                        field1485.field303 = 0;
                        String var12 = class25.method220(class97.method1216(class6.method2975(field1485)));
                        var2.field2467 = var12.trim();
                        var2.field2492 = var7 >> 8;
                        var2.field2486 = var7 & 0xFF;
                        var2.field2468 = 150;
                        if (var8 == 2 || var8 == 3) {
                            method1199(1, class62.method904(1) + var2.field918, var12);
                        } else if (var8 == 1) {
                            method1199(1, class62.method904(0) + var2.field918, var12);
                        } else {
                            method1199(2, var2.field918, var12);
                        }
                    }
                }
                field1504.field303 = var9 + var10;
            }
            if ((var3 & 0x4) != 0) {
                int var13 = field1504.method305();
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = field1504.method450();
                Statics.method898(var2, var13, var14);
            }
            if ((var3 & 0x40) != 0) {
                int var15 = field1504.method336();
                byte[] var16 = new byte[var15];
                class28 var17 = new class28(var16);
                field1504.method322(var16, 0, var15);
                field1588[var1] = var17;
                var2.method935(var17);
            }
            if ((var3 & 0x200) != 0) {
                int var18 = field1504.method486();
                int var19 = field1504.method336();
                var2.method2960(var18, var19, field1468);
                var2.field2465 = field1468 + 300;
                var2.field2506 = field1504.method336();
                var2.field2476 = field1504.method336();
            }
        }
    }

    @ObfuscatedName("h.dt(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method1199(int arg0, String arg1, String arg2) {
        method897(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("i.ak(IIIIIIB)V")
    public static final void method1214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class155.field2344[var6];
            int var12 = class155.field2332[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class155.field2344[var7];
            int var15 = class155.field2332[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field974 = arg0 - var8;
        Statics.field1088 = arg1 - var9;
        Statics.field2357 = arg2 - var10;
        Statics.field1404 = arg3;
        Statics.field1162 = arg4;
    }

    @ObfuscatedName("w.ce([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1219(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("eg.cw(Lfu;III)V")
    public static final void method1222(class17 arg0, int arg1, int arg2) {
        if (field1634 != null || field1605 || arg0 == null || method295(arg0) == null) {
            return;
        }
        field1634 = arg0;
        field1694 = method295(arg0);
        field1636 = arg1;
        field1637 = arg2;
        Statics.field1052 = 0;
        field1502 = false;
    }

    @ObfuscatedName("t.af(I)I")
    public static final int method1289() {
        if (Statics.field1861.field958) {
            return Statics.field933;
        } else {
            int var0 = method924(Statics.field974, Statics.field2357, Statics.field933);
            return var0 - Statics.field1088 >= 800 || (class72.field1050[Statics.field933][Statics.field974 >> 7][Statics.field2357 >> 7] & 0x4) == 0 ? 3 : Statics.field933;
        }
    }

    @ObfuscatedName("t.cy(I)V")
    public static void method1293() {
        for (class78 var0 = (class78) field1505.method14(); var0 != null; var0 = (class78) field1505.method12()) {
            int var1 = var0.field1103;
            if (class17.method856(var1)) {
                boolean var2 = true;
                class17[] var3 = Statics.field116[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field111;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field76;
                    class17 var6 = class17.method865(var5);
                    if (var6 != null) {
                        method854(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.bw(III)V")
    public static final void method1359(int arg0, int arg1) {
        class71 var2 = field1597[Statics.field933][arg0][arg1];
        if (var2 == null) {
            Statics.field967.method2326(Statics.field933, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class68 var4 = null;
        for (class68 var5 = (class68) var2.method1104(); var5 != null; var5 = (class68) var2.method1106()) {
            class172 var6 = class172.method934(var5.field990);
            int var7 = var6.field2620;
            if (var6.field2644 == 1) {
                var7 = (var5.field991 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field967.method2326(Statics.field933, arg0, arg1);
            return;
        }
        var2.method1107(var4);
        class68 var8 = null;
        class68 var9 = null;
        for (class68 var10 = (class68) var2.method1104(); var10 != null; var10 = (class68) var2.method1106()) {
            if (var4.field990 != var10.field990) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field990 != var10.field990 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field967.method2361(Statics.field933, arg0, arg1, method924(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field933), var4, var11, var8, var9);
    }

    @ObfuscatedName("s.ds(Lfu;I)I")
    public static int method1362(class17 arg0) {
        class14 var1 = (class14) field1663.method8(((long) arg0.field167 << 32) + (long) arg0.field113);
        return var1 == null ? arg0.field104 : var1.field79;
    }

    @ObfuscatedName("r.ar(Las;B)V")
    public static final void method1371(class164 arg0) {
        if (field1468 == arg0.field2454 || arg0.field2483 == -1 || arg0.field2470 != 0 || arg0.field2485 + 1 > class165.method3233(arg0.field2483).field2526[arg0.field2477]) {
            int var1 = arg0.field2454 - arg0.field2497;
            int var2 = field1468 - arg0.field2497;
            int var3 = arg0.field2498 * 128 + arg0.field2458 * 64;
            int var4 = arg0.field2495 * 128 + arg0.field2458 * 64;
            int var5 = arg0.field2494 * 128 + arg0.field2458 * 64;
            int var6 = arg0.field2496 * 128 + arg0.field2458 * 64;
            arg0.field2461 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field2500 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field2509 = 0;
        if (arg0.field2499 == 0) {
            arg0.field2502 = 1024;
        }
        if (arg0.field2499 == 1) {
            arg0.field2502 = 1536;
        }
        if (arg0.field2499 == 2) {
            arg0.field2502 = 0;
        }
        if (arg0.field2499 == 3) {
            arg0.field2502 = 512;
        }
        arg0.field2490 = arg0.field2502;
    }

    @ObfuscatedName("r.aq(ZI)V")
    public static final void method1372(boolean arg0) {
        field1521 = arg0;
        if (!field1521) {
            int var1 = field1504.method450();
            int var2 = field1504.method327();
            int var3 = field1504.method349();
            int var4 = field1504.method305();
            int var5 = field1504.method345();
            int var6 = (field1625 - field1504.field303) / 16;
            Statics.field1264 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    Statics.field1264[var7][var8] = field1504.method390();
                }
            }
            Statics.field968 = new int[var6];
            Statics.field1380 = new int[var6];
            Statics.field1251 = new int[var6];
            Statics.field1058 = new byte[var6][];
            Statics.field289 = new byte[var6][];
            boolean var9 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var4 / 8 == 48) {
                var9 = true;
            }
            if (var2 / 8 == 48 && var4 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var2 - 6) / 8; var11 <= (var2 + 6) / 8; var11++) {
                for (int var12 = (var4 - 6) / 8; var12 <= (var4 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field968[var10] = var13;
                        Statics.field1380[var10] = Statics.field2690.method1310("m" + var11 + "_" + var12);
                        Statics.field1251[var10] = Statics.field2690.method1310("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method1035(var2, var4, var1, var5, var3);
            return;
        }
        int var14 = field1504.method327();
        int var15 = field1504.method345();
        field1504.method753();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = field1504.method747(1);
                    if (var19 == 1) {
                        field1522[var16][var17][var18] = field1504.method747(26);
                    } else {
                        field1522[var16][var17][var18] = -1;
                    }
                }
            }
        }
        field1504.method745();
        int var20 = (field1625 - field1504.field303) / 16;
        Statics.field1264 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var22 = 0; var22 < 4; var22++) {
                Statics.field1264[var21][var22] = field1504.method390();
            }
        }
        int var23 = field1504.method349();
        int var24 = field1504.method349();
        int var25 = field1504.method336();
        Statics.field968 = new int[var20];
        Statics.field1380 = new int[var20];
        Statics.field1251 = new int[var20];
        Statics.field1058 = new byte[var20][];
        Statics.field289 = new byte[var20][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field1522[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field968[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field968[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field1380[var26] = Statics.field2690.method1310("m" + var35 + "_" + var36);
                            Statics.field1251[var26] = Statics.field2690.method1310("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method1035(var15, var23, var25, var24, var14);
    }

    @ObfuscatedName("r.ba(II)V")
    public static final void method1373(int arg0) {
        int[] var1 = Statics.field234.field2135;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class72.field1050[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field967.method2466(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class72.field1050[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field967.method2466(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field234.method2560();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class72.field1050[arg0][var10][var9] & 0x18) == 0) {
                    method1148(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class72.field1050[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method1148(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1691 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field967.method2332(Statics.field933, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class181.method925(var14).field2786;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field1520[Statics.field933].field95;
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
                        field1653[field1691] = Statics.field1024[var15];
                        field1692[field1691] = var16;
                        field1467[field1691] = var17;
                        field1691++;
                    }
                }
            }
        }
        Statics.field1059.method2826();
    }

    @ObfuscatedName("ej.cn(Lfu;IIIIIIB)V")
    public static final void method1375(class17 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field1646) {
            field1547 = 32;
        } else {
            field1547 = 0;
        }
        field1646 = false;
        if (class116.field1809 != 0) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field126 -= 4;
                method854(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field126 += 4;
                method854(arg0);
            } else if (arg5 >= arg1 - field1547 && arg5 < field1547 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field126 = (arg4 - arg3) * var8 / var9;
                method854(arg0);
                field1646 = true;
            }
        }
        if (field1580 == 0) {
            return;
        }
        int var10 = arg0.field121;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field126 += field1580 * 45;
            method854(arg0);
        }
    }

    @ObfuscatedName("ej.ao(I)V")
    public static final void method1377() {
        int var0 = field1571 + Statics.field1393.field2461;
        int var1 = field1615 + Statics.field1393.field2500;
        if (Statics.field2691 - var0 < -500 || Statics.field2691 - var0 > 500 || Statics.field1401 - var1 < -500 || Statics.field1401 - var1 > 500) {
            Statics.field2691 = var0;
            Statics.field1401 = var1;
        }
        if (Statics.field2691 != var0) {
            Statics.field2691 += (var0 - Statics.field2691) / 16;
        }
        if (Statics.field1401 != var1) {
            Statics.field1401 += (var1 - Statics.field1401) / 16;
        }
        if (class132.field1965[96]) {
            field1565 += (-24 - field1565) / 2;
        } else if (class132.field1965[97]) {
            field1565 += (24 - field1565) / 2;
        } else {
            field1565 /= 2;
        }
        if (class132.field1965[98]) {
            field1551 += (12 - field1551) / 2;
        } else if (class132.field1965[99]) {
            field1551 += (-12 - field1551) / 2;
        } else {
            field1551 /= 2;
        }
        field1549 = field1565 / 2 + field1549 & 0x7FF;
        field1688 += field1551 / 2;
        if (field1688 < 128) {
            field1688 = 128;
        }
        if (field1688 > 383) {
            field1688 = 383;
        }
        int var2 = Statics.field2691 >> 7;
        int var3 = Statics.field1401 >> 7;
        int var4 = method924(Statics.field2691, Statics.field1401, Statics.field933);
        int var5 = 0;
        if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
            for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                    int var8 = Statics.field933;
                    if (var8 < 3 && (class72.field1050[1][var6][var7] & 0x2) == 2) {
                        var8++;
                    }
                    int var9 = var4 - class72.field1034[var8][var6][var7];
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
        if (var10 > field1554) {
            field1554 += (var10 - field1554) / 24;
        } else if (var10 < field1554) {
            field1554 += (var10 - field1554) / 80;
        }
    }

    @ObfuscatedName("q.ck(II)V")
    public static final void method1380(int arg0) {
        if (class17.method856(arg0)) {
            Statics.method296(Statics.field116[arg0], -1);
        }
    }

    @ObfuscatedName("ei.cs(IIIIII)V")
    public static final void method1387(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1025[0].method2640(arg0, arg1);
        Statics.field1025[1].method2640(arg0, arg1 + arg3 - 16);
        class106.method1537(arg0, arg1 + 16, 16, arg3 - 32, field1512);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class106.method1537(arg0, arg1 + 16 + var6, 16, var5, field1562);
        class106.method1543(arg0, arg1 + 16 + var6, var5, field1545);
        class106.method1543(arg0 + 1, arg1 + 16 + var6, var5, field1545);
        class106.method1541(arg0, arg1 + 16 + var6, 16, field1545);
        class106.method1541(arg0, arg1 + 17 + var6, 16, field1545);
        class106.method1543(arg0 + 15, arg1 + 16 + var6, var5, field1544);
        class106.method1543(arg0 + 14, arg1 + 17 + var6, var5 - 1, field1544);
        class106.method1541(arg0, arg1 + 15 + var6 + var5, 16, field1544);
        class106.method1541(arg0 + 1, arg1 + 14 + var6 + var5, 15, field1544);
    }

    @ObfuscatedName("p.av(B)I")
    public static final int method1389() {
        if (Statics.field1861.field958) {
            return Statics.field933;
        }
        int var0 = 3;
        if (Statics.field1404 < 310) {
            int var1 = Statics.field974 >> 7;
            int var2 = Statics.field2357 >> 7;
            int var3 = Statics.field1393.field2461 >> 7;
            int var4 = Statics.field1393.field2500 >> 7;
            if ((class72.field1050[Statics.field933][var1][var2] & 0x4) != 0) {
                var0 = Statics.field933;
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
                    if ((class72.field1050[Statics.field933][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field933;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class72.field1050[Statics.field933][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field933;
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
                    if ((class72.field1050[Statics.field933][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field933;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class72.field1050[Statics.field933][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field933;
                        }
                    }
                }
            }
        }
        if ((class72.field1050[Statics.field933][Statics.field1393.field2461 >> 7][Statics.field1393.field2500 >> 7] & 0x4) != 0) {
            var0 = Statics.field933;
        }
        return var0;
    }

    @ObfuscatedName("p.da(IIIILcv;I)V")
    public static final void method1393(int arg0, int arg1, int arg2, int arg3, class140 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field1549 + field1536 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class155.field2344[var5];
        int var8 = class155.field2332[var5];
        int var9 = var7 * 256 / (field1592 + 256);
        int var10 = var8 * 256 / (field1592 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method2540(Statics.field307, arg0 + 94 + var11 - arg4.field2133 / 2 + 4, arg1 + 83 - var12 - arg4.field2137 / 2 - 4);
        } else {
            arg4.method2489(arg0 + 94 + var11 - arg4.field2133 / 2 + 4, arg1 + 83 - var12 - arg4.field2137 / 2 - 4);
        }
    }

    @ObfuscatedName("p.du(Lfu;II)Ljava/lang/String;")
    public static String method1395(class17 arg0, int arg1) {
        if (!class12.method292(method1362(arg0), arg1) && arg0.field152 == null) {
            return null;
        } else if (arg0.field173 == null || arg0.field173.length <= arg1 || arg0.field173[arg1] == null || arg0.field173[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field173[arg1];
        }
    }

    @ObfuscatedName("en.h(I)V")
    public static void method1451() {
        field1695.field303 = 0;
        field1504.field303 = 0;
        field1506 = -1;
        field1510 = -1;
        field1473 = -1;
        field1456 = -1;
        field1625 = 0;
        field1507 = 0;
        field1680 = 0;
        field1606 = 0;
        field1605 = false;
        field1672 = 0;
        field1478 = 0;
        for (int var0 = 0; var0 < field1583.length; var0++) {
            if (field1583[var0] != null) {
                field1583[var0].field2455 = -1;
            }
        }
        for (int var1 = 0; var1 < field1491.length; var1++) {
            if (field1491[var1] != null) {
                field1491[var1].field2455 = -1;
            }
        }
        class54.method1092();
        method1179(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field1666[var2] = true;
        }
    }

    @ObfuscatedName("z.n(I)V")
    public static final void method1467() {
        if (field1680 > 1) {
            field1680--;
        }
        if (field1509 > 0) {
            field1509--;
        }
        if (field1513) {
            field1513 = false;
            method2631();
            return;
        }
        for (int var0 = 0; var0 < 100 && method1503(); var0++) {
        }
        if (field1466 != 30) {
            return;
        }
        class19.method959(field1695, 57);
        Object var1 = Statics.field1470.field1325;
        synchronized (Statics.field1470.field1325) {
            if (!field1458) {
                Statics.field1470.field1324 = 0;
            } else if (class116.field1815 != 0 || Statics.field1470.field1324 >= 40) {
                field1695.method746(65);
                field1695.method443(0);
                int var2 = field1695.field303;
                int var3 = 0;
                for (int var4 = 0; var4 < Statics.field1470.field1324 && field1695.field303 - var2 < 240; var4++) {
                    var3++;
                    int var5 = Statics.field1470.field1323[var4];
                    if (var5 < 0) {
                        var5 = 0;
                    } else if (var5 > 502) {
                        var5 = 502;
                    }
                    int var6 = Statics.field1470.field1326[var4];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 764) {
                        var6 = 764;
                    }
                    int var7 = var5 * 765 + var6;
                    if (Statics.field1470.field1323[var4] == -1 && Statics.field1470.field1326[var4] == -1) {
                        var6 = -1;
                        var5 = -1;
                        var7 = 524287;
                    }
                    if (field1724 != var6 || field1670 != var5) {
                        int var8 = var6 - field1724;
                        field1724 = var6;
                        int var9 = var5 - field1670;
                        field1670 = var5;
                        if (field1711 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                            var8 += 32;
                            var9 += 32;
                            field1695.method300((field1711 << 12) + (var8 << 6) + var9);
                            field1711 = 0;
                        } else if (field1711 < 8) {
                            field1695.method301((field1711 << 19) + 8388608 + var7);
                            field1711 = 0;
                        } else {
                            field1695.method302((field1711 << 19) + -1073741824 + var7);
                            field1711 = 0;
                        }
                    } else if (field1711 < 2047) {
                        field1711++;
                    }
                }
                field1695.method494(field1695.field303 - var2);
                if (var3 >= Statics.field1470.field1324) {
                    Statics.field1470.field1324 = 0;
                } else {
                    Statics.field1470.field1324 -= var3;
                    for (int var10 = 0; var10 < Statics.field1470.field1324; var10++) {
                        Statics.field1470.field1326[var10] = Statics.field1470.field1326[var3 + var10];
                        Statics.field1470.field1323[var10] = Statics.field1470.field1323[var3 + var10];
                    }
                }
            }
        }
        if (class116.field1815 != 0) {
            long var12 = (class116.field1819 - field1528 * -1L) / 50L;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            field1528 = class116.field1819 * -1L;
            int var14 = class116.field1805;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            int var15 = class116.field1817;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var16 = var14 * 765 + var15;
            byte var17 = 0;
            if (class116.field1815 == 2) {
                var17 = 1;
            }
            int var18 = (int) var12;
            field1695.method746(231);
            field1695.method302((var17 << 19) + (var18 << 20) + var16);
        }
        if (class132.field1972 > 0) {
            field1695.method746(27);
            field1695.method300(0);
            int var19 = field1695.field303;
            long var20 = class42.method1378();
            for (int var22 = 0; var22 < class132.field1972; var22++) {
                long var23 = var20 - field1687;
                if (var23 > 16777215L) {
                    var23 = 16777215L;
                }
                field1687 = var20;
                field1695.method334(class132.field1971[var22]);
                field1695.method348((int) var23);
            }
            field1695.method312(field1695.field303 - var19);
        }
        if (field1552 > 0) {
            field1552--;
        }
        if (class132.field1965[96] || class132.field1965[97] || class132.field1965[98] || class132.field1965[99]) {
            field1553 = true;
        }
        if (field1553 && field1552 <= 0) {
            field1552 = 20;
            field1553 = false;
            field1695.method746(118);
            field1695.method343(field1688);
            field1695.method342(field1549);
        }
        if (Statics.field2304 && !field1474) {
            field1474 = true;
            field1695.method746(136);
            field1695.method443(1);
        }
        if (!Statics.field2304 && field1474) {
            field1474 = false;
            field1695.method746(136);
            field1695.method443(0);
        }
        method1965();
        if (field1466 != 30) {
            return;
        }
        method1178();
        int var10002;
        for (int var25 = 0; var25 < field1703; var25++) {
            var10002 = field1706[var25]--;
            if (field1706[var25] >= -10) {
                class110 var27 = field1714[var25];
                if (var27 == null) {
                    class110 var10000 = (class110) null;
                    var27 = class110.method1932(Statics.field411, field1704[var25], 0);
                    if (var27 == null) {
                        continue;
                    }
                    field1706[var25] += var27.method1930();
                    field1714[var25] = var27;
                }
                if (field1706[var25] < 0) {
                    int var34;
                    if (field1707[var25] == 0) {
                        var34 = field1701;
                    } else {
                        int var28 = (field1707[var25] & 0xFF) * 128;
                        int var29 = field1707[var25] >> 16 & 0xFF;
                        int var30 = var29 * 128 + 64 - Statics.field1393.field2461;
                        if (var30 < 0) {
                            var30 = -var30;
                        }
                        int var31 = field1707[var25] >> 8 & 0xFF;
                        int var32 = var31 * 128 + 64 - Statics.field1393.field2500;
                        if (var32 < 0) {
                            var32 = -var32;
                        }
                        int var33 = var30 + var32 - 128;
                        if (var33 > var28) {
                            field1706[var25] = -100;
                            continue;
                        }
                        if (var33 < 0) {
                            var33 = 0;
                        }
                        var34 = field1702 * (var28 - var33) / var28;
                    }
                    if (var34 > 0) {
                        class117 var35 = var27.method1929().method2109(Statics.field1611);
                        class180 var36 = class180.method3268(var35, 100, var34);
                        var36.method3271(field1705[var25] - 1);
                        Statics.field2665.method2842(var36);
                    }
                    field1706[var25] = -100;
                }
            } else {
                field1703--;
                for (int var26 = var25; var26 < field1703; var26++) {
                    field1704[var26] = field1704[var26 + 1];
                    field1714[var26] = field1714[var26 + 1];
                    field1705[var26] = field1705[var26 + 1];
                    field1706[var26] = field1706[var26 + 1];
                    field1707[var26] = field1707[var26 + 1];
                }
                var25--;
            }
        }
        if (field1700 && !class101.method3251()) {
            if (field1698 != 0 && field1699 != -1) {
                class101.method1488(Statics.field888, field1699, 0, field1698, false);
            }
            field1700 = false;
        }
        field1507++;
        if (field1507 > 750) {
            method2631();
            return;
        }
        method1180();
        for (int var37 = 0; var37 < field1500; var37++) {
            int var38 = field1482[var37];
            class66 var39 = field1491[var38];
            if (var39 != null) {
                method1182(var39, var39.field971.field2829);
            }
        }
        for (int var40 = -1; var40 < field1584; var40++) {
            int var41;
            if (var40 == -1) {
                var41 = 2047;
            } else {
                var41 = field1525[var40];
            }
            class61 var42 = field1583[var41];
            if (var42 != null && var42.field2468 > 0) {
                var42.field2468--;
                if (var42.field2468 == 0) {
                    var42.field2467 = null;
                }
            }
        }
        for (int var43 = 0; var43 < field1500; var43++) {
            int var44 = field1482[var43];
            class66 var45 = field1491[var44];
            if (var45 != null && var45.field2468 > 0) {
                var45.field2468--;
                if (var45.field2468 == 0) {
                    var45.field2467 = null;
                }
            }
        }
        field1541++;
        if (field1548 != 0) {
            field1614 += 20;
            if (field1614 >= 400) {
                field1548 = 0;
            }
        }
        if (Statics.field962 != null) {
            field1573++;
            if (field1573 >= 15) {
                method854(Statics.field962);
                Statics.field962 = null;
            }
        }
        if (Statics.field1919 != null) {
            method854(Statics.field1919);
            field1581++;
            if (class116.field1810 > field1577 + 5 || class116.field1810 < field1577 - 5 || class116.field1816 > field1496 + 5 || class116.field1816 < field1496 - 5) {
                field1648 = true;
            }
            if (class116.field1809 == 0) {
                if (!field1648 || field1581 < 5) {
                    label819: {
                        label647: {
                            if (field1604 != 1) {
                                int var52 = field1606 - 1;
                                boolean var53;
                                if (var52 < 0) {
                                    var53 = false;
                                } else {
                                    int var54 = field1609[var52];
                                    if (var54 >= 2000) {
                                        var54 -= 2000;
                                    }
                                    if (var54 == 1007) {
                                        var53 = true;
                                    } else {
                                        var53 = false;
                                    }
                                }
                                if (!var53) {
                                    break label647;
                                }
                            }
                            if (field1606 > 2) {
                                method3084();
                                break label819;
                            }
                        }
                        if (field1606 > 0) {
                            method3167(field1606 - 1);
                        }
                    }
                } else if (Statics.field1919 == Statics.field1575 && field1579 != field1576) {
                    class17 var46 = Statics.field1919;
                    byte var47 = 0;
                    if (field1626 == 1 && var46.field118 == 206) {
                        var47 = 1;
                    }
                    if (var46.field201[field1579] <= 0) {
                        var47 = 0;
                    }
                    if (class12.method2652(method1362(var46))) {
                        int var48 = field1576;
                        int var49 = field1579;
                        var46.field201[var49] = var46.field201[var48];
                        var46.field215[var49] = var46.field215[var48];
                        var46.field201[var48] = -1;
                        var46.field215[var48] = 0;
                    } else if (var47 == 1) {
                        int var50 = field1576;
                        int var51 = field1579;
                        while (var50 != var51) {
                            if (var50 > var51) {
                                var46.method136(var50 - 1, var50);
                                var50--;
                            } else if (var50 < var51) {
                                var46.method136(var50 + 1, var50);
                                var50++;
                            }
                        }
                    } else {
                        var46.method136(field1579, field1576);
                    }
                    field1695.method746(166);
                    field1695.method343(field1576);
                    field1695.method351(Statics.field1919.field167);
                    field1695.method334(var47);
                    field1695.method343(field1579);
                }
                field1573 = 10;
                class116.field1815 = 0;
                Statics.field1919 = null;
            }
        }
        class17 var55 = Statics.field1087;
        class17 var56 = Statics.field1089;
        Statics.field1087 = null;
        Statics.field1089 = null;
        field1658 = null;
        field1642 = false;
        field1459 = false;
        for (field1684 = 0; class132.method1398() && field1684 < 128; field1684++) {
            field1686[field1684] = Statics.field2655;
            field1677[field1684] = Statics.field2557;
        }
        method2083(field1608, 0, 0, 765, 503, 0, 0);
        field1472++;
        while (true) {
            class82 var57;
            class17 var58;
            class17 var59;
            do {
                var57 = (class82) field1492.method1102();
                if (var57 == null) {
                    while (true) {
                        class82 var60;
                        class17 var61;
                        class17 var62;
                        do {
                            var60 = (class82) field1586.method1102();
                            if (var60 == null) {
                                while (true) {
                                    class82 var63;
                                    class17 var64;
                                    class17 var65;
                                    do {
                                        var63 = (class82) field1660.method1102();
                                        if (var63 == null) {
                                            if (field1634 != null) {
                                                method1029();
                                            }
                                            if (class139.field2104 != -1) {
                                                int var66 = class139.field2104;
                                                int var67 = class139.field2105;
                                                boolean var68 = method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var66, var67, true, 0, 0, 0, 0, 0, 0);
                                                class139.field2104 = -1;
                                                if (var68) {
                                                    field1476 = class116.field1817;
                                                    field1570 = class116.field1805;
                                                    field1548 = 1;
                                                    field1614 = 0;
                                                }
                                            }
                                            method1500();
                                            if (Statics.field1087 != var55) {
                                                if (var55 != null) {
                                                    method854(var55);
                                                }
                                                if (Statics.field1087 != null) {
                                                    method854(Statics.field1087);
                                                }
                                            }
                                            if (Statics.field1089 != var56 && field1645 == field1501) {
                                                if (var56 != null) {
                                                    method854(var56);
                                                }
                                                if (Statics.field1089 != null) {
                                                    method854(Statics.field1089);
                                                }
                                            }
                                            if (Statics.field1089 == null) {
                                                if (field1645 > 0) {
                                                    field1645--;
                                                }
                                            } else if (field1645 < field1501) {
                                                field1645++;
                                                if (field1645 == field1501) {
                                                    method854(Statics.field1089);
                                                }
                                            }
                                            method1377();
                                            if (field1710) {
                                                int var69 = Statics.field2512 * 128 + 64;
                                                int var70 = Statics.field1798 * 128 + 64;
                                                int var71 = method924(var69, var70, Statics.field933) - Statics.field427;
                                                if (Statics.field974 < var69) {
                                                    Statics.field974 += Statics.field927 * (var69 - Statics.field974) / 1000 + Statics.field1725;
                                                    if (Statics.field974 > var69) {
                                                        Statics.field974 = var69;
                                                    }
                                                }
                                                if (Statics.field974 > var69) {
                                                    Statics.field974 -= Statics.field927 * (Statics.field974 - var69) / 1000 + Statics.field1725;
                                                    if (Statics.field974 < var69) {
                                                        Statics.field974 = var69;
                                                    }
                                                }
                                                if (Statics.field1088 < var71) {
                                                    Statics.field1088 += Statics.field927 * (var71 - Statics.field1088) / 1000 + Statics.field1725;
                                                    if (Statics.field1088 > var71) {
                                                        Statics.field1088 = var71;
                                                    }
                                                }
                                                if (Statics.field1088 > var71) {
                                                    Statics.field1088 -= Statics.field927 * (Statics.field1088 - var71) / 1000 + Statics.field1725;
                                                    if (Statics.field1088 < var71) {
                                                        Statics.field1088 = var71;
                                                    }
                                                }
                                                if (Statics.field2357 < var70) {
                                                    Statics.field2357 += Statics.field927 * (var70 - Statics.field2357) / 1000 + Statics.field1725;
                                                    if (Statics.field2357 > var70) {
                                                        Statics.field2357 = var70;
                                                    }
                                                }
                                                if (Statics.field2357 > var70) {
                                                    Statics.field2357 -= Statics.field927 * (Statics.field2357 - var70) / 1000 + Statics.field1725;
                                                    if (Statics.field2357 < var70) {
                                                        Statics.field2357 = var70;
                                                    }
                                                }
                                                int var72 = Statics.field1349 * 128 + 64;
                                                int var73 = Statics.field2692 * 128 + 64;
                                                int var74 = method924(var72, var73, Statics.field933) - Statics.field876;
                                                int var75 = var72 - Statics.field974;
                                                int var76 = var74 - Statics.field1088;
                                                int var77 = var73 - Statics.field2357;
                                                int var78 = (int) Math.sqrt((double) (var75 * var75 + var77 * var77));
                                                int var79 = (int) (Math.atan2((double) var76, (double) var78) * 325.949D) & 0x7FF;
                                                int var80 = (int) (Math.atan2((double) var75, (double) var77) * -325.949D) & 0x7FF;
                                                if (var79 < 128) {
                                                    var79 = 128;
                                                }
                                                if (var79 > 383) {
                                                    var79 = 383;
                                                }
                                                if (Statics.field1404 < var79) {
                                                    Statics.field1404 += Statics.field1728 * (var79 - Statics.field1404) / 1000 + Statics.field879;
                                                    if (Statics.field1404 > var79) {
                                                        Statics.field1404 = var79;
                                                    }
                                                }
                                                if (Statics.field1404 > var79) {
                                                    Statics.field1404 -= Statics.field1728 * (Statics.field1404 - var79) / 1000 + Statics.field879;
                                                    if (Statics.field1404 < var79) {
                                                        Statics.field1404 = var79;
                                                    }
                                                }
                                                int var81 = var80 - Statics.field1162;
                                                if (var81 > 1024) {
                                                    var81 -= 2048;
                                                }
                                                if (var81 < -1024) {
                                                    var81 += 2048;
                                                }
                                                if (var81 > 0) {
                                                    Statics.field1162 += Statics.field1728 * var81 / 1000 + Statics.field879;
                                                    Statics.field1162 &= 0x7FF;
                                                }
                                                if (var81 < 0) {
                                                    Statics.field1162 -= Statics.field1728 * -var81 / 1000 + Statics.field879;
                                                    Statics.field1162 &= 0x7FF;
                                                }
                                                int var82 = var80 - Statics.field1162;
                                                if (var82 > 1024) {
                                                    var82 -= 2048;
                                                }
                                                if (var82 < -1024) {
                                                    var82 += 2048;
                                                }
                                                if (var82 < 0 && var81 > 0 || var82 > 0 && var81 < 0) {
                                                    Statics.field1162 = var80;
                                                }
                                            }
                                            for (int var83 = 0; var83 < 5; var83++) {
                                                var10002 = field1715[var83]++;
                                            }
                                            int var84 = class116.method1361();
                                            int var85 = class132.method2272();
                                            if (var84 > 15000 && var85 > 15000) {
                                                field1509 = 250;
                                                class116.field1818 = 14500;
                                                field1695.method746(75);
                                            }
                                            field1535++;
                                            if (field1535 > 500) {
                                                field1535 = 0;
                                                int var86 = (int) (Math.random() * 8.0D);
                                                if ((var86 & 0x1) == 1) {
                                                    field1571 += field1530;
                                                }
                                                if ((var86 & 0x2) == 2) {
                                                    field1615 += field1532;
                                                }
                                                if ((var86 & 0x4) == 4) {
                                                    field1533 += field1534;
                                                }
                                            }
                                            if (field1571 < -50) {
                                                field1530 = 2;
                                            }
                                            if (field1571 > 50) {
                                                field1530 = -2;
                                            }
                                            if (field1615 < -55) {
                                                field1532 = 2;
                                            }
                                            if (field1615 > 55) {
                                                field1532 = -2;
                                            }
                                            if (field1533 < -40) {
                                                field1534 = 1;
                                            }
                                            if (field1533 > 40) {
                                                field1534 = -1;
                                            }
                                            field1540++;
                                            if (field1540 > 500) {
                                                field1540 = 0;
                                                int var87 = (int) (Math.random() * 8.0D);
                                                if ((var87 & 0x1) == 1) {
                                                    field1536 += field1613;
                                                }
                                                if ((var87 & 0x2) == 2) {
                                                    field1592 += field1539;
                                                }
                                            }
                                            if (field1536 < -60) {
                                                field1613 = 2;
                                            }
                                            if (field1536 > 60) {
                                                field1613 = -2;
                                            }
                                            if (field1592 < -20) {
                                                field1539 = 1;
                                            }
                                            if (field1592 > 10) {
                                                field1539 = -1;
                                            }
                                            for (class179 var88 = (class179) field1543.method1205(); var88 != null; var88 = (class179) field1543.method1208()) {
                                                if ((long) var88.field2737 < class42.method1378() / 1000L - 5L) {
                                                    if (var88.field2738 > 0) {
                                                        method1199(5, "", var88.field2735 + class57.field778);
                                                    }
                                                    if (var88.field2738 == 0) {
                                                        method1199(5, "", var88.field2735 + class57.field779);
                                                    }
                                                    var88.method192();
                                                }
                                            }
                                            field1508++;
                                            if (field1508 > 50) {
                                                field1695.method746(151);
                                            }
                                            try {
                                                if (Statics.field2549 != null && field1695.field303 > 0) {
                                                    Statics.field2549.method2153(field1695.field306, 0, field1695.field303);
                                                    field1695.field303 = 0;
                                                    field1508 = 0;
                                                }
                                            } catch (IOException var90) {
                                                method2631();
                                            }
                                            return;
                                        }
                                        var64 = var63.field1148;
                                        if (var64.field113 < 0) {
                                            break;
                                        }
                                        var65 = class17.method865(var64.field123);
                                    } while (var65 == null || var65.field220 == null || var64.field113 >= var65.field220.length || var65.field220[var64.field113] != var64);
                                    class92.method3230(var63);
                                }
                            }
                            var61 = var60.field1148;
                            if (var61.field113 < 0) {
                                break;
                            }
                            var62 = class17.method865(var61.field123);
                        } while (var62 == null || var62.field220 == null || var61.field113 >= var62.field220.length || var62.field220[var61.field113] != var61);
                        class92.method3230(var60);
                    }
                }
                var58 = var57.field1148;
                if (var58.field113 < 0) {
                    break;
                }
                var59 = class17.method865(var58.field123);
            } while (var59 == null || var59.field220 == null || var58.field113 >= var59.field220.length || var59.field220[var58.field113] != var58);
            class92.method3230(var57);
        }
    }

    @ObfuscatedName("z.bt(IIII)V")
    public static void method1469(int arg0, int arg1, int arg2) {
        class17 var3 = class17.method3203(arg0, arg1);
        if (var3 != null && var3.field190 != null) {
            class82 var4 = new class82();
            var4.field1148 = var3;
            var4.field1158 = var3.field190;
            class92.method3230(var4);
        }
        field1619 = true;
        Statics.field2194 = arg0;
        field1471 = arg1;
        Statics.field963 = arg2;
        method854(var3);
    }

    @ObfuscatedName("z.r(I)V")
    public static final void method1471() {
        class177.method2173();
        class178.method1396();
        class185.field2862.method1188();
        class181.method1370();
        class184.field2817.method1188();
        class184.field2818.method1188();
        class172.method1218();
        class165.method3202();
        class173.field2657.method1188();
        class173.field2652.method1188();
        class174.method3144();
        class169.field2567.method1188();
        class67.method1587();
        class17.field107.method1188();
        class17.field108.method1188();
        class17.field109.method1188();
        ((class135) Statics.field2323).method2282();
        class70.field1018.method1188();
        Statics.field2711.method1322();
        Statics.field1713.method1322();
        Statics.field898.method1322();
        Statics.field411.method1322();
        Statics.field2690.method1322();
        Statics.field888.method1322();
        Statics.field2734.method1322();
        Statics.field417.method1322();
        Statics.field1770.method1322();
        Statics.field1497.method1322();
        Statics.field1114.method1322();
        Statics.field246.method1322();
    }

    @ObfuscatedName("y.cb(Lfu;I)Z")
    public static final boolean method1492(class17 arg0) {
        if (arg0.field209 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field209.length; var1++) {
            int var2 = method1022(arg0, var1);
            int var3 = arg0.field210[var1];
            if (arg0.field209[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field209[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field209[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("er.bc(I)V")
    public static final void method1500() {
        if (Statics.field1919 != null || field1634 != null) {
            return;
        }
        int var0 = class116.field1815;
        if (field1605) {
            if (var0 != 1) {
                int var1 = class116.field1810;
                int var2 = class116.field1816;
                if (var1 < Statics.field1279 - 10 || var1 > Statics.field2055 + Statics.field1279 + 10 || var2 < Statics.field1099 - 10 || var2 > Statics.field1265 + Statics.field1099 + 10) {
                    field1605 = false;
                    method933(Statics.field1279, Statics.field1099, Statics.field2055, Statics.field1265);
                }
            }
            if (var0 == 1) {
                int var3 = Statics.field1279;
                int var4 = Statics.field1099;
                int var5 = Statics.field2055;
                int var6 = class116.field1817;
                int var7 = class116.field1805;
                int var8 = -1;
                for (int var9 = 0; var9 < field1606; var9++) {
                    int var10 = (field1606 - 1 - var9) * 15 + var4 + 31;
                    if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                        var8 = var9;
                    }
                }
                if (var8 != -1) {
                    method3167(var8);
                }
                field1605 = false;
                method933(Statics.field1279, Statics.field1099, Statics.field2055, Statics.field1265);
            }
            return;
        }
        if (var0 == 1 && field1606 > 0) {
            int var11 = field1609[field1606 - 1];
            if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                label168: {
                    int var12 = field1607[field1606 - 1];
                    int var13 = field1511[field1606 - 1];
                    class17 var14 = class17.method865(var13);
                    int var15 = method1362(var14);
                    boolean var16 = (var15 >> 28 & 0x1) != 0;
                    if (!var16) {
                        class12 var10000 = (class12) null;
                        if (!class12.method2652(method1362(var14))) {
                            break label168;
                        }
                    }
                    field1648 = false;
                    field1581 = 0;
                    if (Statics.field1919 != null) {
                        method854(Statics.field1919);
                    }
                    Statics.field1919 = class17.method865(var13);
                    field1576 = var12;
                    field1577 = class116.field1817;
                    field1496 = class116.field1805;
                    method854(Statics.field1919);
                    return;
                }
            }
        }
        if (var0 == 1) {
            label170: {
                if (field1604 != 1 || field1606 <= 2) {
                    int var17 = field1606 - 1;
                    boolean var18;
                    if (var17 < 0) {
                        var18 = false;
                    } else {
                        int var19 = field1609[var17];
                        if (var19 >= 2000) {
                            var19 -= 2000;
                        }
                        if (var19 == 1007) {
                            var18 = true;
                        } else {
                            var18 = false;
                        }
                    }
                    if (!var18) {
                        break label170;
                    }
                }
                var0 = 2;
            }
        }
        if (var0 == 1 && field1606 > 0) {
            method3167(field1606 - 1);
        }
        if (var0 == 2 && field1606 > 0) {
            method3084();
        }
    }

    @ObfuscatedName("x.bv(B)Z")
    public static final boolean method1503() {
        if (Statics.field2549 == null) {
            return false;
        }
        try {
            int var0 = Statics.field2549.method2136();
            if (var0 == 0) {
                return false;
            }
            if (field1506 == -1) {
                Statics.field2549.method2139(field1504.field306, 0, 1);
                field1504.field303 = 0;
                field1506 = field1504.method759();
                field1625 = class2.field19[field1506];
                var0--;
            }
            if (field1625 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field2549.method2139(field1504.field306, 0, 1);
                field1625 = field1504.field306[0] & 0xFF;
                var0--;
            }
            if (field1625 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field2549.method2139(field1504.field306, 0, 2);
                field1504.field303 = 0;
                field1625 = field1504.method349();
                var0 -= 2;
            }
            if (var0 < field1625) {
                return false;
            }
            field1504.field303 = 0;
            Statics.field2549.method2139(field1504.field306, 0, field1625);
            field1507 = 0;
            field1456 = field1473;
            field1473 = field1510;
            field1510 = field1506;
            if (field1506 == 100) {
                String var1 = field1504.method451();
                if (var1.endsWith(":tradereq:")) {
                    String var2 = var1.substring(0, var1.indexOf(":"));
                    boolean var3 = false;
                    if (method1079(var2)) {
                        var3 = true;
                    }
                    if (!var3 && field1582 == 0) {
                        method1199(4, var2, class57.field776);
                    }
                } else if (var1.endsWith(":duelreq:")) {
                    String var4 = var1.substring(0, var1.indexOf(":"));
                    boolean var5 = false;
                    if (method1079(var4)) {
                        var5 = true;
                    }
                    if (!var5 && field1582 == 0) {
                        method1199(8, var4, class57.field777);
                    }
                } else if (var1.endsWith(":chalreq:")) {
                    String var6 = var1.substring(0, var1.indexOf(":"));
                    boolean var7 = false;
                    if (method1079(var6)) {
                        var7 = true;
                    }
                    if (!var7 && field1582 == 0) {
                        String var8 = var1.substring(var1.indexOf(":") + 1, var1.length() - 9);
                        method1199(8, var6, var8);
                    }
                } else if (var1.endsWith(":assistreq:")) {
                    String var9 = var1.substring(0, var1.indexOf(":"));
                    boolean var10 = false;
                    if (method1079(var9)) {
                        var10 = true;
                    }
                    if (!var10 && field1582 == 0) {
                        method1199(10, var9, "");
                    }
                } else if (var1.endsWith(":clan:")) {
                    String var11 = var1.substring(0, var1.indexOf(":clan:"));
                    method1199(11, "", var11);
                } else if (var1.endsWith(":trade:")) {
                    String var12 = var1.substring(0, var1.indexOf(":trade:"));
                    if (field1582 == 0) {
                        method1199(12, "", var12);
                    }
                } else if (var1.endsWith(":assist:")) {
                    String var13 = var1.substring(0, var1.indexOf(":assist:"));
                    if (field1582 == 0) {
                        method1199(13, "", var13);
                    }
                } else {
                    method1199(0, "", var1);
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 143) {
                field1561 = field1504.method450();
                field1595 = field1504.method450();
                field1506 = -1;
                return true;
            }
            if (field1506 == 132) {
                int var14 = field1504.method355();
                int var15 = field1504.method349();
                if (var15 == 65535) {
                    var15 = -1;
                }
                int var16 = field1504.method390();
                class17 var17 = class17.method865(var14);
                if (var17.field111) {
                    var17.field216 = var15;
                    var17.field217 = var16;
                    class172 var19 = class172.method934(var15);
                    var17.field159 = var19.field2634;
                    var17.field153 = var19.field2615;
                    var17.field154 = var19.field2617;
                    var17.field189 = var19.field2614;
                    var17.field151 = var19.field2618;
                    var17.field155 = var19.field2616;
                    if (var17.field121 > 0) {
                        var17.field155 = var17.field155 * 32 / var17.field121;
                    }
                    method854(var17);
                } else if (var15 == -1) {
                    var17.field134 = 0;
                    field1506 = -1;
                    return true;
                } else {
                    class172 var18 = class172.method934(var15);
                    var17.field134 = 4;
                    var17.field145 = var15;
                    var17.field159 = var18.field2634;
                    var17.field153 = var18.field2615;
                    var17.field155 = var18.field2616 * 100 / var16;
                    method854(var17);
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 101) {
                boolean var20 = field1504.method450() == 1;
                int var21 = field1504.method390();
                class17 var22 = class17.method865(var21);
                if (var22.field182 != var20) {
                    var22.field182 = var20;
                    method854(var22);
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 175) {
                int var23 = field1504.method486();
                int var24 = field1504.method353();
                int var25 = field1504.method327();
                class78 var26 = (class78) field1505.method8((long) var24);
                if (var26 != null) {
                    method916(var26, var26.field1103 != var25);
                }
                class78 var27 = new class78();
                var27.field1103 = var25;
                var27.field1101 = var23;
                field1505.method9(var27, (long) var24);
                method883(var25);
                class92.method737(var25);
                class17 var28 = class17.method865(var24);
                if (var28 != null) {
                    method854(var28);
                }
                if (field1620 != null) {
                    method854(field1620);
                    field1620 = null;
                }
                for (int var29 = 0; var29 < field1606; var29++) {
                    int var30 = field1609[var29];
                    boolean var31 = var30 == 57 || var30 == 58 || var30 == 1007 || var30 == 25 || var30 == 30;
                    if (var31) {
                        if (var29 < field1606 - 1) {
                            for (int var32 = var29; var32 < field1606 - 1; var32++) {
                                field1627[var32] = field1627[var32 + 1];
                                field1612[var32] = field1612[var32 + 1];
                                field1609[var32] = field1609[var32 + 1];
                                field1610[var32] = field1610[var32 + 1];
                                field1607[var32] = field1607[var32 + 1];
                                field1511[var32] = field1511[var32 + 1];
                            }
                        }
                        field1606--;
                    }
                }
                if (field1608 != -1) {
                    method1505(field1608, 1);
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 247) {
                field1538 = field1504.method450();
                if (field1538 == 1) {
                    field1662 = field1504.method349();
                }
                if (field1538 >= 2 && field1538 <= 6) {
                    if (field1538 == 2) {
                        field1599 = 64;
                        field1499 = 64;
                    }
                    if (field1538 == 3) {
                        field1599 = 0;
                        field1499 = 64;
                    }
                    if (field1538 == 4) {
                        field1599 = 128;
                        field1499 = 64;
                    }
                    if (field1538 == 5) {
                        field1599 = 64;
                        field1499 = 0;
                    }
                    if (field1538 == 6) {
                        field1599 = 64;
                        field1499 = 128;
                    }
                    field1538 = 2;
                    field1529 = field1504.method349();
                    field1481 = field1504.method349();
                    field1668 = field1504.method450();
                }
                if (field1538 == 10) {
                    field1697 = field1504.method349();
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 104) {
                field1672 = field1504.method450();
                field1506 = -1;
                return true;
            }
            if (field1506 == 117) {
                int var33 = field1504.method390();
                class17 var34 = class17.method865(var33);
                for (int var35 = 0; var35 < var34.field201.length; var35++) {
                    var34.field201[var35] = -1;
                    var34.field201[var35] = 0;
                }
                method854(var34);
                field1506 = -1;
                return true;
            }
            if (field1506 == 248) {
                int var36 = field1504.method315();
                int var37 = field1504.method347();
                int var38 = field1504.method355();
                class17 var39 = class17.method865(var38);
                int var40 = var39.field119 + var36;
                int var41 = var39.field120 + var37;
                if (var39.field117 != var40 || var39.field180 != var41) {
                    var39.field117 = var40;
                    var39.field180 = var41;
                    method854(var39);
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 221) {
                while (field1504.field303 < field1625) {
                    int var42 = field1504.method450();
                    boolean var43 = (var42 & 0x1) == 1;
                    String var44 = field1504.method451();
                    String var45 = field1504.method451();
                    field1504.method451();
                    for (int var46 = 0; var46 < field1720; var46++) {
                        class102 var47 = field1721[var46];
                        if (var43) {
                            if (var45.equals(var47.field1400)) {
                                var47.field1400 = var44;
                                var47.field1399 = var45;
                                var44 = null;
                                break;
                            }
                        } else if (var44.equals(var47.field1400)) {
                            var47.field1400 = var44;
                            var47.field1399 = var45;
                            var44 = null;
                            break;
                        }
                    }
                    if (var44 != null && field1720 < 400) {
                        class102 var48 = new class102();
                        field1721[field1720] = var48;
                        var48.field1400 = var44;
                        var48.field1399 = var45;
                        field1720++;
                    }
                }
                field1635 = field1472;
                field1506 = -1;
                return true;
            }
            if (field1506 == 215) {
                Statics.field1332 = field1504.method402();
                Statics.field1207 = field1504.method450();
                for (int var49 = Statics.field1207; var49 < Statics.field1207 + 8; var49++) {
                    for (int var50 = Statics.field1332; var50 < Statics.field1332 + 8; var50++) {
                        if (field1597[Statics.field933][var49][var50] != null) {
                            field1597[Statics.field933][var49][var50] = null;
                            method1359(var49, var50);
                        }
                    }
                }
                for (class80 var51 = (class80) field1598.method1104(); var51 != null; var51 = (class80) field1598.method1106()) {
                    if (var51.field1125 >= Statics.field1207 && var51.field1125 < Statics.field1207 + 8 && var51.field1115 >= Statics.field1332 && var51.field1115 < Statics.field1332 + 8 && Statics.field933 == var51.field1119) {
                        var51.field1127 = 0;
                    }
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 202) {
                Statics.field1207 = field1504.method402();
                Statics.field1332 = field1504.method336();
                while (field1504.field303 < field1625) {
                    field1506 = field1504.method450();
                    Statics.method1986();
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 190) {
                Statics.field1332 = field1504.method450();
                Statics.field1207 = field1504.method450();
                field1506 = -1;
                return true;
            }
            if (field1506 == 111 || field1506 == 70 || field1506 == 144 || field1506 == 36 || field1506 == 195 || field1506 == 238 || field1506 == 87 || field1506 == 205 || field1506 == 146 || field1506 == 37 || field1506 == 191) {
                Statics.method1986();
                field1506 = -1;
                return true;
            }
            if (field1506 == 60) {
                int var52 = field1504.method390();
                int var53 = field1504.method345();
                int var54 = var53 >> 10 & 0x1F;
                int var55 = var53 >> 5 & 0x1F;
                int var56 = var53 & 0x1F;
                int var57 = (var56 << 3) + (var54 << 19) + (var55 << 11);
                class17 var58 = class17.method865(var52);
                if (var58.field129 != var57) {
                    var58.field129 = var57;
                    method854(var58);
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 89) {
                int var59 = field1504.method504();
                int var60 = field1504.method349();
                if (var59 < -70000) {
                    var60 += 32768;
                }
                class17 var61;
                if (var59 >= 0) {
                    var61 = class17.method865(var59);
                } else {
                    var61 = null;
                }
                while (field1504.field303 < field1625) {
                    int var62 = field1504.method325();
                    int var63 = field1504.method349();
                    int var64 = 0;
                    if (var63 != 0) {
                        var64 = field1504.method450();
                        if (var64 == 255) {
                            var64 = field1504.method504();
                        }
                    }
                    if (var61 != null && var62 >= 0 && var62 < var61.field201.length) {
                        var61.field201[var62] = var63;
                        var61.field215[var62] = var64;
                    }
                    class54.method3168(var60, var62, var63 - 1, var64);
                }
                if (var61 != null) {
                    method854(var61);
                }
                method1293();
                field1617[++field1490 - 1 & 0x1F] = var60 & 0x7FFF;
                field1506 = -1;
                return true;
            }
            if (field1506 == 234) {
                class41 var65 = field1504;
                int var66 = field1625;
                class9 var67 = new class9();
                var67.field58 = var65.method450();
                var67.field56 = var65.method504();
                var67.field57 = new int[var67.field58];
                var67.field62 = new int[var67.field58];
                var67.field59 = new Field[var67.field58];
                var67.field60 = new int[var67.field58];
                var67.field61 = new Method[var67.field58];
                var67.field55 = new byte[var67.field58][][];
                for (int var68 = 0; var68 < var67.field58; var68++) {
                    try {
                        int var69 = var65.method450();
                        if (var69 == 0 || var69 == 1 || var69 == 2) {
                            String var70 = new String(var65.method451());
                            String var71 = new String(var65.method451());
                            int var72 = 0;
                            if (var69 == 1) {
                                var72 = var65.method504();
                            }
                            var67.field57[var68] = var69;
                            var67.field60[var68] = var72;
                            var67.field59[var68] = class19.method1527(var70).getDeclaredField(var71);
                        } else if (var69 == 3 || var69 == 4) {
                            String var73 = new String(var65.method451());
                            String var74 = new String(var65.method451());
                            int var75 = var65.method450();
                            String[] var76 = new String[var75];
                            for (int var77 = 0; var77 < var75; var77++) {
                                var76[var77] = new String(var65.method451());
                            }
                            byte[][] var78 = new byte[var75][];
                            if (var69 == 3) {
                                for (int var79 = 0; var79 < var75; var79++) {
                                    int var80 = var65.method504();
                                    var78[var79] = new byte[var80];
                                    var65.method322(var78[var79], 0, var80);
                                }
                            }
                            var67.field57[var68] = var69;
                            Class[] var81 = new Class[var75];
                            for (int var82 = 0; var82 < var75; var82++) {
                                var81[var82] = class19.method1527(var76[var82]);
                            }
                            var67.field61[var68] = class19.method1527(var73).getDeclaredMethod(var74, var81);
                            var67.field55[var68] = var78;
                        }
                    } catch (ClassNotFoundException var292) {
                        var67.field62[var68] = -1;
                    } catch (SecurityException var293) {
                        var67.field62[var68] = -2;
                    } catch (NullPointerException var294) {
                        var67.field62[var68] = -3;
                    } catch (Exception var295) {
                        var67.field62[var68] = -4;
                    } catch (Throwable var296) {
                        var67.field62[var68] = -5;
                    }
                }
                class19.field230.method1099(var67);
                field1506 = -1;
                return true;
            }
            if (field1506 == 19) {
                method1372(true);
                field1506 = -1;
                return true;
            }
            if (field1506 == 243) {
                String var88 = field1504.method451();
                long var89 = (long) field1504.method349();
                long var91 = (long) field1504.method316();
                int var93 = field1504.method450();
                long var94 = (var89 << 32) + var91;
                boolean var96 = false;
                for (int var97 = 0; var97 < 100; var97++) {
                    if (field1682[var97] == var94) {
                        var96 = true;
                        break;
                    }
                }
                if (method1079(var88)) {
                    var96 = true;
                }
                if (!var96 && field1582 == 0) {
                    field1682[field1683] = var94;
                    field1683 = (field1683 + 1) % 100;
                    String var98 = class25.method220(class97.method1216(class6.method2975(field1504)));
                    if (var93 == 2 || var93 == 3) {
                        method1199(7, class62.method904(1) + var88, var98);
                    } else if (var93 == 1) {
                        method1199(7, class62.method904(0) + var88, var98);
                    } else {
                        method1199(3, var88, var98);
                    }
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 77) {
                method1095();
                field1506 = -1;
                return true;
            }
            if (field1506 == 88) {
                int var99 = field1504.method355();
                Statics.field2151 = Statics.field2717.method2248(var99);
                field1506 = -1;
                return true;
            }
            if (field1506 == 240) {
                method1372(false);
                field1506 = -1;
                return true;
            }
            if (field1506 == 107) {
                method1293();
                field1650 = field1504.method450();
                field1656 = field1472;
                field1506 = -1;
                return true;
            }
            if (field1506 == 121) {
                int var100 = field1504.method450();
                int var101 = field1504.method450();
                int var102 = field1504.method450();
                int var103 = field1504.method450();
                field1647[var100] = true;
                field1712[var100] = var101;
                field1685[var100] = var102;
                field1469[var100] = var103;
                field1715[var100] = 0;
                field1506 = -1;
                return true;
            }
            if (field1506 == 99) {
                int var104 = field1504.method345();
                int var105 = field1504.method353();
                class17 var106 = class17.method865(var105);
                if (var106.field134 != 1 || var106.field145 != var104) {
                    var106.field134 = 1;
                    var106.field145 = var104;
                    method854(var106);
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 164) {
                field1591 = 0;
                field1628 = 0;
                method2300();
                method3256();
                for (int var107 = 0; var107 < field1628; var107++) {
                    int var108 = field1587[var107];
                    class66 var109 = field1491[var108];
                    int var110 = field1504.method450();
                    if ((var110 & 0x2) != 0) {
                        var109.field2455 = field1504.method349();
                        if (var109.field2455 == 65535) {
                            var109.field2455 = -1;
                        }
                    }
                    if ((var110 & 0x20) != 0) {
                        var109.field2478 = field1504.method349();
                        var109.field2479 = field1504.method305();
                    }
                    if ((var110 & 0x8) != 0) {
                        var109.field971 = class184.method3428(field1504.method345());
                        var109.field2458 = var109.field971.field2829;
                        var109.field2504 = var109.field971.field2844;
                        var109.field2462 = var109.field971.field2836;
                        var109.field2463 = var109.field971.field2828;
                        var109.field2464 = var109.field971.field2845;
                        var109.field2516 = var109.field971.field2839;
                        var109.field2459 = var109.field971.field2830;
                        var109.field2460 = var109.field971.field2825;
                        var109.field2489 = var109.field971.field2827;
                    }
                    if ((var110 & 0x1) != 0) {
                        int var111 = field1504.method486();
                        int var112 = field1504.method486();
                        var109.method2960(var111, var112, field1468);
                        var109.field2465 = field1468 + 300;
                        var109.field2506 = field1504.method450();
                        var109.field2476 = field1504.method336();
                    }
                    if ((var110 & 0x10) != 0) {
                        int var113 = field1504.method486();
                        int var114 = field1504.method450();
                        var109.method2960(var113, var114, field1468);
                        var109.field2465 = field1468 + 300;
                        var109.field2506 = field1504.method336();
                        var109.field2476 = field1504.method336();
                    }
                    if ((var110 & 0x40) != 0) {
                        int var115 = field1504.method345();
                        if (var115 == 65535) {
                            var115 = -1;
                        }
                        int var116 = field1504.method486();
                        if (var109.field2483 == var115 && var115 != -1) {
                            int var117 = class165.method3233(var115).field2535;
                            if (var117 == 1) {
                                var109.field2477 = 0;
                                var109.field2485 = 0;
                                var109.field2470 = var116;
                                var109.field2487 = 0;
                            }
                            if (var117 == 2) {
                                var109.field2487 = 0;
                            }
                        } else if (var115 == -1 || var109.field2483 == -1 || class165.method3233(var115).field2529 >= class165.method3233(var109.field2483).field2529) {
                            var109.field2483 = var115;
                            var109.field2477 = 0;
                            var109.field2485 = 0;
                            var109.field2470 = var116;
                            var109.field2487 = 0;
                            var109.field2474 = var109.field2505;
                        }
                    }
                    if ((var110 & 0x4) != 0) {
                        var109.field2488 = field1504.method349();
                        int var118 = field1504.method390();
                        var109.field2471 = var118 >> 16;
                        var109.field2491 = (var118 & 0xFFFF) + field1468;
                        var109.field2475 = 0;
                        var109.field2514 = 0;
                        if (var109.field2491 > field1468) {
                            var109.field2475 = -1;
                        }
                        if (var109.field2488 == 65535) {
                            var109.field2488 = -1;
                        }
                    }
                    if ((var110 & 0x80) != 0) {
                        var109.field2467 = field1504.method451();
                        var109.field2468 = 100;
                    }
                }
                for (int var119 = 0; var119 < field1591; var119++) {
                    int var120 = field1638[var119];
                    if (field1468 != field1491[var120].field2484) {
                        field1491[var120].field971 = null;
                        field1491[var120] = null;
                    }
                }
                if (field1625 != field1504.field303) {
                    throw new RuntimeException(field1504.field303 + class62.field922 + field1625);
                }
                for (int var121 = 0; var121 < field1500; var121++) {
                    if (field1491[field1482[var121]] == null) {
                        throw new RuntimeException(var121 + class62.field922 + field1500);
                    }
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 160) {
                int var122 = field1504.method327();
                byte var123 = field1504.method340();
                class1.field2[var122] = var123;
                if (class1.field4[var122] != var123) {
                    class1.field4[var122] = var123;
                    method3055(var122);
                }
                field1667[++field1550 - 1 & 0x1F] = var122;
                field1506 = -1;
                return true;
            }
            if (field1506 == 182) {
                Statics.field578 = class85.method2158(field1504.method450());
                field1506 = -1;
                return true;
            }
            if (field1506 == 56) {
                field1710 = false;
                for (int var124 = 0; var124 < 5; var124++) {
                    field1647[var124] = false;
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 118) {
                method1293();
                field1629 = field1504.method315();
                field1656 = field1472;
                field1506 = -1;
                return true;
            }
            if (field1506 == 119) {
                int var125 = field1504.method450();
                int var126 = field1504.method450();
                int var127 = field1504.method450();
                Statics.field933 = var125 >> 1;
                Statics.field1393.method2956(var127, var126, (var125 & 0x1) == 1);
                field1506 = -1;
                return true;
            }
            if (field1506 == 126) {
                String var128 = field1504.method451();
                Object[] var129 = new Object[var128.length() + 1];
                for (int var130 = var128.length() - 1; var130 >= 0; var130--) {
                    if (var128.charAt(var130) == 's') {
                        var129[var130 + 1] = field1504.method451();
                    } else {
                        var129[var130 + 1] = Integer.valueOf(field1504.method504());
                    }
                }
                var129[0] = Integer.valueOf(field1504.method504());
                class82 var131 = new class82();
                var131.field1158 = var129;
                class92.method3230(var131);
                field1506 = -1;
                return true;
            }
            if (field1506 == 197) {
                int var132 = field1504.method305();
                int var133 = field1504.method345();
                int var134 = field1504.method353();
                class17 var135 = class17.method865(var134);
                var135.field156 = (var133 << 16) + var132;
                field1506 = -1;
                return true;
            }
            if (field1506 == 110) {
                field1478 = 0;
                field1506 = -1;
                return true;
            }
            if (field1506 == 74) {
                for (int var136 = 0; var136 < Statics.field1228; var136++) {
                    class169 var137 = class169.method3058(var136);
                    if (var137 != null && var137.field2570 == 0) {
                        class1.field2[var136] = 0;
                        class1.field4[var136] = 0;
                    }
                }
                method1293();
                field1550 += 32;
                field1506 = -1;
                return true;
            }
            if (field1506 == 128) {
                if (field1608 != -1) {
                    method1505(field1608, 0);
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 120) {
                method1293();
                int var138 = field1504.method336();
                int var139 = field1504.method355();
                int var140 = field1504.method402();
                field1479[var138] = var139;
                field1601[var138] = var140;
                field1602[var138] = 1;
                for (int var141 = 0; var141 < 98; var141++) {
                    if (var139 >= class46.field522[var141]) {
                        field1602[var138] = var141 + 2;
                    }
                }
                field1651[++field1652 - 1 & 0x1F] = var138;
                field1506 = -1;
                return true;
            }
            if (field1506 == 72) {
                int var142 = field1504.method327();
                if (var142 == 65535) {
                    var142 = -1;
                }
                int var143 = field1504.method353();
                int var144 = field1504.method305();
                if (var144 == 65535) {
                    var144 = -1;
                }
                int var145 = field1504.method355();
                for (int var146 = var144; var146 <= var142; var146++) {
                    long var147 = ((long) var145 << 32) + (long) var146;
                    class13 var149 = field1663.method8(var147);
                    if (var149 != null) {
                        var149.method76();
                    }
                    field1663.method9(new class14(var143), var147);
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 187) {
                int var150 = field1504.method305();
                if (var150 == 65535) {
                    var150 = -1;
                }
                if (var150 == -1 && !field1700) {
                    Statics.field1383.method587();
                    class101.field1381 = 1;
                    Statics.field1384 = null;
                } else if (var150 != -1 && field1699 != var150 && field1698 != 0 && !field1700) {
                    class83 var151 = Statics.field888;
                    int var152 = field1698;
                    class101.field1381 = 1;
                    Statics.field1384 = var151;
                    Statics.field1385 = var150;
                    Statics.field1394 = 0;
                    Statics.field1801 = var152;
                    Statics.field2356 = false;
                    Statics.field1388 = 2;
                }
                field1699 = var150;
                field1506 = -1;
                return true;
            }
            if (field1506 == 218) {
                int var153 = field1504.method338();
                int var154 = field1504.method345();
                if (var154 == 65535) {
                    var154 = -1;
                }
                if (field1698 != 0 && var154 != -1) {
                    class101.method1488(Statics.field1114, var154, 0, field1698, false);
                    field1700 = true;
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 176) {
                field1710 = true;
                Statics.field1349 = field1504.method450();
                Statics.field2692 = field1504.method450();
                Statics.field876 = field1504.method349();
                Statics.field879 = field1504.method450();
                Statics.field1728 = field1504.method450();
                if (Statics.field1728 >= 100) {
                    int var155 = Statics.field1349 * 128 + 64;
                    int var156 = Statics.field2692 * 128 + 64;
                    int var157 = method924(var155, var156, Statics.field933) - Statics.field876;
                    int var158 = var155 - Statics.field974;
                    int var159 = var157 - Statics.field1088;
                    int var160 = var156 - Statics.field2357;
                    int var161 = (int) Math.sqrt((double) (var158 * var158 + var160 * var160));
                    Statics.field1404 = (int) (Math.atan2((double) var159, (double) var161) * 325.949D) & 0x7FF;
                    Statics.field1162 = (int) (Math.atan2((double) var158, (double) var160) * -325.949D) & 0x7FF;
                    if (Statics.field1404 < 128) {
                        Statics.field1404 = 128;
                    }
                    if (Statics.field1404 > 383) {
                        Statics.field1404 = 383;
                    }
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 21) {
                int var162 = field1504.method349();
                int var163 = field1504.method390();
                class17 var164 = class17.method865(var163);
                if (var164.field134 != 2 || var164.field145 != var162) {
                    var164.field134 = 2;
                    var164.field145 = var162;
                    method854(var164);
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 166) {
                int var165 = field1504.method345();
                field1608 = var165;
                method883(var165);
                class92.method737(field1608);
                for (int var166 = 0; var166 < 100; var166++) {
                    field1666[var166] = true;
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 139) {
                field1710 = true;
                Statics.field2512 = field1504.method450();
                Statics.field1798 = field1504.method450();
                Statics.field427 = field1504.method349();
                Statics.field1725 = field1504.method450();
                Statics.field927 = field1504.method450();
                if (Statics.field927 >= 100) {
                    Statics.field974 = Statics.field2512 * 128 + 64;
                    Statics.field2357 = Statics.field1798 * 128 + 64;
                    Statics.field1088 = method924(Statics.field974, Statics.field2357, Statics.field933) - Statics.field427;
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 196) {
                int var167 = field1504.method347();
                int var168 = field1504.method355();
                class17 var169 = class17.method865(var168);
                if (var169.field141 != var167 || var167 == -1) {
                    var169.field141 = var167;
                    var169.field218 = 0;
                    var169.field219 = 0;
                    method854(var169);
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 225) {
                int var170 = field1504.method345();
                int var171 = field1504.method305();
                int var172 = field1504.method390();
                int var173 = field1504.method345();
                class17 var174 = class17.method865(var172);
                if (var174.field159 != var170 || var174.field153 != var171 || var174.field155 != var173) {
                    var174.field159 = var170;
                    var174.field153 = var171;
                    var174.field155 = var173;
                    method854(var174);
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 48) {
                field1717 = 1;
                field1635 = field1472;
                field1506 = -1;
                return true;
            }
            if (field1506 == 95) {
                String var175 = field1504.method451();
                long var176 = field1504.method318();
                long var178 = (long) field1504.method349();
                long var180 = (long) field1504.method316();
                int var182 = field1504.method450();
                long var183 = (var178 << 32) + var180;
                boolean var185 = false;
                for (int var186 = 0; var186 < 100; var186++) {
                    if (field1682[var186] == var183) {
                        var185 = true;
                        break;
                    }
                }
                if (var182 <= 1 && method1079(var175)) {
                    var185 = true;
                }
                if (!var185 && field1582 == 0) {
                    field1682[field1683] = var183;
                    field1683 = (field1683 + 1) % 100;
                    String var187 = class25.method220(class97.method1216(class6.method2975(field1504)));
                    if (var182 == 2 || var182 == 3) {
                        method897(9, class62.method904(1) + var175, var187, class59.method1225(var176));
                    } else if (var182 == 1) {
                        method897(9, class62.method904(0) + var175, var187, class59.method1225(var176));
                    } else {
                        method897(9, var175, var187, class59.method1225(var176));
                    }
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 49) {
                while (field1504.field303 < field1625) {
                    boolean var188 = field1504.method450() == 1;
                    String var189 = field1504.method451();
                    String var190 = field1504.method451();
                    int var191 = field1504.method349();
                    int var192 = field1504.method450();
                    int var193 = field1504.method450();
                    boolean var194 = (var193 & 0x2) != 0;
                    boolean var195 = (var193 & 0x1) != 0;
                    if (var191 > 0) {
                        field1504.method451();
                        field1504.method450();
                        field1504.method504();
                    }
                    field1504.method451();
                    for (int var196 = 0; var196 < field1716; var196++) {
                        class90 var197 = field1718[var196];
                        if (var188) {
                            if (var190.equals(var197.field1278)) {
                                var197.field1278 = var189;
                                var197.field1275 = var190;
                                var189 = null;
                                break;
                            }
                        } else if (var189.equals(var197.field1278)) {
                            if (var197.field1276 != var191) {
                                boolean var198 = true;
                                for (class179 var199 = (class179) field1543.method1205(); var199 != null; var199 = (class179) field1543.method1208()) {
                                    if (var199.field2735.equals(var189)) {
                                        if (var191 != 0 && var199.field2738 == 0) {
                                            var199.method192();
                                            var198 = false;
                                        } else if (var191 == 0 && var199.field2738 != 0) {
                                            var199.method192();
                                            var198 = false;
                                        }
                                    }
                                }
                                if (var198) {
                                    field1543.method1204(new class179(var189, var191));
                                }
                                var197.field1276 = var191;
                            }
                            var197.field1275 = var190;
                            var197.field1277 = var192;
                            var197.field1274 = var194;
                            var197.field1282 = var195;
                            var189 = null;
                            break;
                        }
                    }
                    if (var189 != null && field1716 < 400) {
                        class90 var200 = new class90();
                        field1718[field1716] = var200;
                        var200.field1278 = var189;
                        var200.field1275 = var190;
                        var200.field1276 = var191;
                        var200.field1277 = var192;
                        var200.field1274 = var194;
                        var200.field1282 = var195;
                        field1716++;
                    }
                }
                field1717 = 2;
                field1635 = field1472;
                boolean var201 = false;
                int var202 = field1716;
                while (var202 > 0) {
                    boolean var203 = true;
                    var202--;
                    for (int var204 = 0; var204 < var202; var204++) {
                        boolean var205 = false;
                        class90 var206 = field1718[var204];
                        class90 var207 = field1718[var204 + 1];
                        if (field1537 != var206.field1276 && field1537 == var207.field1276) {
                            var205 = true;
                        }
                        if (!var205 && var206.field1276 == 0 && var207.field1276 != 0) {
                            var205 = true;
                        }
                        if (!var205 && !var206.field1274 && var207.field1274) {
                            var205 = true;
                        }
                        if (!var205 && !var206.field1282 && var207.field1282) {
                            var205 = true;
                        }
                        if (var205) {
                            class90 var208 = field1718[var204];
                            field1718[var204] = field1718[var204 + 1];
                            field1718[var204 + 1] = var208;
                            var203 = false;
                        }
                    }
                    if (var203) {
                        break;
                    }
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 38) {
                int var209 = field1504.method504();
                int var210 = field1504.method345();
                class1.field2[var210] = var209;
                if (class1.field4[var210] != var209) {
                    class1.field4[var210] = var209;
                    method3055(var210);
                }
                field1667[++field1550 - 1 & 0x1F] = var210;
                field1506 = -1;
                return true;
            }
            if (field1506 == 35) {
                String var211 = field1504.method451();
                int var212 = field1504.method353();
                class17 var213 = class17.method865(var212);
                if (!var211.equals(var213.field205)) {
                    var213.field205 = var211;
                    method854(var213);
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 194) {
                String var214 = field1504.method451();
                int var215 = field1504.method450();
                int var216 = field1504.method336();
                if (var215 >= 1 && var215 <= 8) {
                    if (var214.equalsIgnoreCase("null")) {
                        var214 = null;
                    }
                    field1594[var215 - 1] = var214;
                    field1624[var215 - 1] = var216 == 0;
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 97) {
                int var217 = field1504.method504();
                class78 var218 = (class78) field1505.method8((long) var217);
                if (var218 != null) {
                    method916(var218, true);
                }
                if (field1620 != null) {
                    method854(field1620);
                    field1620 = null;
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 52) {
                int var219 = field1504.method504();
                int var220 = field1504.method349();
                if (var219 < -70000) {
                    var220 += 32768;
                }
                class17 var221;
                if (var219 >= 0) {
                    var221 = class17.method865(var219);
                } else {
                    var221 = null;
                }
                if (var221 != null) {
                    for (int var222 = 0; var222 < var221.field201.length; var222++) {
                        var221.field201[var222] = 0;
                        var221.field215[var222] = 0;
                    }
                }
                class54.method3047(var220);
                int var223 = field1504.method349();
                for (int var224 = 0; var224 < var223; var224++) {
                    int var225 = field1504.method327();
                    int var226 = field1504.method402();
                    if (var226 == 255) {
                        var226 = field1504.method390();
                    }
                    if (var221 != null && var224 < var221.field201.length) {
                        var221.field201[var224] = var225;
                        var221.field215[var224] = var226;
                    }
                    class54.method3168(var220, var224, var225 - 1, var226);
                }
                if (var221 != null) {
                    method854(var221);
                }
                method1293();
                field1617[++field1490 - 1 & 0x1F] = var220 & 0x7FFF;
                field1506 = -1;
                return true;
            }
            if (field1506 == 241) {
                field1504.field303 += 28;
                if (field1504.method332()) {
                    class41 var227 = field1504;
                    int var228 = field1504.field303 - 28;
                    if (class153.field2317 != null) {
                        try {
                            class153.field2317.method3187(0L);
                            class153.field2317.method3184(var227.field306, var228, 24);
                        } catch (Exception var291) {
                        }
                    }
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 179) {
                for (int var230 = 0; var230 < field1583.length; var230++) {
                    if (field1583[var230] != null) {
                        field1583[var230].field2483 = -1;
                    }
                }
                for (int var231 = 0; var231 < field1491.length; var231++) {
                    if (field1491[var231] != null) {
                        field1491[var231].field2483 = -1;
                    }
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 91) {
                int var232 = field1504.method345();
                class54.method1386(var232);
                field1617[++field1490 - 1 & 0x1F] = var232 & 0x7FFF;
                field1506 = -1;
                return true;
            }
            if (field1506 == 15) {
                field1655 = field1472;
                if (field1625 == 0) {
                    field1654 = null;
                    field1689 = null;
                    Statics.field2438 = 0;
                    Statics.field1267 = null;
                    field1506 = -1;
                    return true;
                }
                field1689 = field1504.method451();
                long var233 = field1504.method318();
                field1654 = class59.method2630(var233);
                Statics.field2698 = field1504.method313();
                int var235 = field1504.method450();
                if (var235 == 255) {
                    field1506 = -1;
                    return true;
                }
                Statics.field2438 = var235;
                class58[] var236 = new class58[100];
                for (int var237 = 0; var237 < Statics.field2438; var237++) {
                    var236[var237] = new class58();
                    var236[var237].field878 = field1504.method451();
                    var236[var237].field873 = class103.method740(var236[var237].field878, Statics.field1462);
                    var236[var237].field875 = field1504.method349();
                    var236[var237].field872 = field1504.method313();
                    field1504.method451();
                    if (var236[var237].field878.equals(Statics.field1393.field918)) {
                        Statics.field2054 = var236[var237].field872;
                    }
                }
                boolean var238 = false;
                int var239 = Statics.field2438;
                while (var239 > 0) {
                    boolean var240 = true;
                    var239--;
                    for (int var241 = 0; var241 < var239; var241++) {
                        if (var236[var241].field873.compareTo(var236[var241 + 1].field873) > 0) {
                            class58 var242 = var236[var241];
                            var236[var241] = var236[var241 + 1];
                            var236[var241 + 1] = var242;
                            var240 = false;
                        }
                    }
                    if (var240) {
                        break;
                    }
                }
                Statics.field1267 = var236;
                field1506 = -1;
                return true;
            }
            if (field1506 == 228) {
                method903();
                field1506 = -1;
                return false;
            }
            if (field1506 == 252) {
                int var243 = field1625 + field1504.field303;
                int var244 = field1504.method349();
                int var245 = field1504.method349();
                if (field1608 != var244) {
                    field1608 = var244;
                    method883(field1608);
                    class92.method737(field1608);
                    for (int var246 = 0; var246 < 100; var246++) {
                        field1666[var246] = true;
                    }
                }
                while (var245-- > 0) {
                    int var247 = field1504.method504();
                    int var248 = field1504.method349();
                    int var249 = field1504.method450();
                    class78 var250 = (class78) field1505.method8((long) var247);
                    if (var250 != null && var250.field1103 != var248) {
                        method916(var250, true);
                        var250 = null;
                    }
                    if (var250 == null) {
                        class78 var251 = new class78();
                        var251.field1103 = var248;
                        var251.field1101 = var249;
                        field1505.method9(var251, (long) var247);
                        method883(var248);
                        class92.method737(var248);
                        class17 var252 = class17.method865(var247);
                        if (var252 != null) {
                            method854(var252);
                        }
                        if (field1620 != null) {
                            method854(field1620);
                            field1620 = null;
                        }
                        for (int var253 = 0; var253 < field1606; var253++) {
                            int var254 = field1609[var253];
                            boolean var255 = var254 == 57 || var254 == 58 || var254 == 1007 || var254 == 25 || var254 == 30;
                            if (var255) {
                                if (var253 < field1606 - 1) {
                                    for (int var256 = var253; var256 < field1606 - 1; var256++) {
                                        field1627[var256] = field1627[var256 + 1];
                                        field1612[var256] = field1612[var256 + 1];
                                        field1609[var256] = field1609[var256 + 1];
                                        field1610[var256] = field1610[var256 + 1];
                                        field1607[var256] = field1607[var256 + 1];
                                        field1511[var256] = field1511[var256 + 1];
                                    }
                                }
                                field1606--;
                            }
                        }
                        if (field1608 != -1) {
                            method1505(field1608, 1);
                        }
                        var250 = var251;
                    }
                    var250.field1100 = true;
                }
                for (class78 var258 = (class78) field1505.method14(); var258 != null; var258 = (class78) field1505.method12()) {
                    if (var258.field1100) {
                        var258.field1100 = false;
                    } else {
                        method916(var258, true);
                    }
                }
                field1663 = new class3(512);
                while (field1504.field303 < var243) {
                    int var259 = field1504.method504();
                    int var260 = field1504.method349();
                    int var261 = field1504.method349();
                    int var262 = field1504.method504();
                    for (int var263 = var260; var263 <= var261; var263++) {
                        long var264 = ((long) var259 << 32) + (long) var263;
                        field1663.method9(new class14(var262), var264);
                    }
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 94) {
                String var266 = field1504.method451();
                String var267 = class25.method220(class97.method1216(class6.method2975(field1504)));
                method1199(6, var266, var267);
                field1506 = -1;
                return true;
            }
            if (field1506 == 30) {
                field1680 = field1504.method345() * 30;
                field1656 = field1472;
                field1506 = -1;
                return true;
            }
            if (field1506 == 250) {
                int var268 = field1504.method305();
                int var269 = field1504.method353();
                class17 var270 = class17.method865(var269);
                if (var270 != null && var270.field114 == 0) {
                    if (var268 > var270.field128 - var270.field122) {
                        var268 = var270.field128 - var270.field122;
                    }
                    if (var268 < 0) {
                        var268 = 0;
                    }
                    if (var270.field126 != var268) {
                        var270.field126 = var268;
                        method854(var270);
                    }
                }
                field1506 = -1;
                return true;
            }
            if (field1506 == 200) {
                String var271 = field1504.method451();
                int var272 = field1504.method349();
                byte var273 = field1504.method313();
                boolean var274 = false;
                if (var273 == -128) {
                    var274 = true;
                }
                if (var274) {
                    if (Statics.field2438 == 0) {
                        field1506 = -1;
                        return true;
                    }
                    boolean var275 = false;
                    int var276;
                    for (var276 = 0; var276 < Statics.field2438 && (!Statics.field1267[var276].field878.equals(var271) || Statics.field1267[var276].field875 != var272); var276++) {
                    }
                    if (var276 < Statics.field2438) {
                        while (var276 < Statics.field2438 - 1) {
                            Statics.field1267[var276] = Statics.field1267[var276 + 1];
                            var276++;
                        }
                        Statics.field2438--;
                        Statics.field1267[Statics.field2438] = null;
                    }
                } else {
                    field1504.method451();
                    class58 var277 = new class58();
                    var277.field878 = var271;
                    var277.field873 = class103.method740(var277.field878, Statics.field1462);
                    var277.field875 = var272;
                    var277.field872 = var273;
                    int var278;
                    for (var278 = Statics.field2438 - 1; var278 >= 0; var278--) {
                        int var279 = Statics.field1267[var278].field873.compareTo(var277.field878);
                        if (var279 == 0) {
                            Statics.field1267[var278].field875 = var272;
                            Statics.field1267[var278].field872 = var273;
                            if (var271.equals(Statics.field1393.field918)) {
                                Statics.field2054 = var273;
                            }
                            field1655 = field1472;
                            field1506 = -1;
                            return true;
                        }
                        if (var279 < 0) {
                            break;
                        }
                    }
                    if (Statics.field2438 >= Statics.field1267.length) {
                        field1506 = -1;
                        return true;
                    }
                    for (int var280 = Statics.field2438 - 1; var280 > var278; var280--) {
                        Statics.field1267[var280 + 1] = Statics.field1267[var280];
                    }
                    if (Statics.field2438 == 0) {
                        Statics.field1267 = new class58[100];
                    }
                    Statics.field1267[var278 + 1] = var277;
                    Statics.field2438++;
                    if (var271.equals(Statics.field1393.field918)) {
                        Statics.field2054 = var273;
                    }
                }
                field1655 = field1472;
                field1506 = -1;
                return true;
            }
            if (field1506 == 159) {
                int var281 = field1504.method355();
                class17 var282 = class17.method865(var281);
                var282.field134 = 3;
                var282.field145 = Statics.field1393.field911.method1045();
                method854(var282);
                field1506 = -1;
                return true;
            }
            if (field1506 == 174) {
                int var283 = field1504.method349();
                int var284 = field1504.method450();
                int var285 = field1504.method349();
                method1093(var283, var284, var285);
                field1506 = -1;
                return true;
            }
            if (field1506 == 57) {
                for (int var286 = 0; var286 < class1.field4.length; var286++) {
                    if (class1.field4[var286] != class1.field2[var286]) {
                        class1.field4[var286] = class1.field2[var286];
                        method3055(var286);
                        field1667[++field1550 - 1 & 0x1F] = var286;
                    }
                }
                field1506 = -1;
                return true;
            }
            class136.method1295("" + field1506 + class62.field922 + field1473 + class62.field922 + field1456 + class62.field922 + field1625, (Throwable) null);
            method903();
        } catch (IOException var297) {
            method2631();
        } catch (Exception var298) {
            String var289 = "" + field1506 + class62.field922 + field1473 + class62.field922 + field1456 + class62.field922 + field1625 + class62.field922 + (Statics.field2722 + Statics.field1393.field2503[0]) + class62.field922 + (Statics.field1915 + Statics.field1393.field2507[0]) + class62.field922;
            for (int var290 = 0; var290 < field1625 && var290 < 50; var290++) {
                var289 = var289 + field1504.field306[var290] + class62.field922;
            }
            class136.method1295(var289, var298);
            method903();
        }
        return true;
    }

    @ObfuscatedName("x.cr(III)V")
    public static final void method1505(int arg0, int arg1) {
        if (class17.method856(arg0)) {
            method954(Statics.field116[arg0], arg1);
        }
    }

    @ObfuscatedName("x.dj(Lfu;I)V")
    public static final void method1509(class17 arg0) {
        int var1 = arg0.field118;
        if (var1 == 324) {
            if (field1723 == -1) {
                field1723 = arg0.field136;
                field1618 = arg0.field137;
            }
            if (field1722.field977) {
                arg0.field136 = field1723;
            } else {
                arg0.field136 = field1618;
            }
        } else if (var1 == 325) {
            if (field1723 == -1) {
                field1723 = arg0.field136;
                field1618 = arg0.field137;
            }
            if (field1722.field977) {
                arg0.field136 = field1618;
            } else {
                arg0.field136 = field1723;
            }
        } else if (var1 == 327) {
            arg0.field159 = 150;
            arg0.field153 = (int) (Math.sin((double) field1468 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field134 = 5;
            arg0.field145 = 0;
        } else if (var1 == 328) {
            arg0.field159 = 150;
            arg0.field153 = (int) (Math.sin((double) field1468 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field134 = 5;
            arg0.field145 = 1;
        }
    }

    @ObfuscatedName("ca.dz(B)V")
    public static final void method1588() {
        field1695.method746(214);
        field1695.method443(0);
    }

    @ObfuscatedName("bx.ax(S)V")
    public static final void method1965() {
        if (field1464 && Statics.field933 != field1514) {
            method1035(Statics.field1359, Statics.field2469, Statics.field933, Statics.field1393.field2503[0], Statics.field1393.field2507[0]);
        } else if (Statics.field933 != field1690) {
            field1690 = Statics.field933;
            method1373(Statics.field933);
        }
    }

    @ObfuscatedName("br.e(I)V")
    public static void method2053() {
        if (field1486 == 0) {
            Statics.field967 = new class139(4, 104, 104, class72.field1034);
            for (int var0 = 0; var0 < 4; var0++) {
                field1520[var0] = new class15(104, 104);
            }
            Statics.field234 = new class140(512, 512);
            class86.field1210 = class57.field650;
            class86.field1218 = 5;
            field1486 = 20;
        } else if (field1486 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class155.field2344[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class139.method2338(var1, 500, 800, 512, 334);
            class86.field1210 = class57.field718;
            class86.field1218 = 10;
            field1486 = 30;
        } else if (field1486 == 30) {
            Statics.field2711 = method884(0, false, true, true);
            Statics.field1713 = method884(1, false, true, true);
            Statics.field278 = method884(2, true, false, true);
            Statics.field898 = method884(3, false, true, true);
            Statics.field411 = method884(4, false, true, true);
            Statics.field2690 = method884(5, true, true, true);
            Statics.field888 = method884(6, true, true, false);
            Statics.field2734 = method884(7, false, true, true);
            Statics.field417 = method884(8, false, true, true);
            Statics.field1770 = method884(9, false, true, true);
            Statics.field1497 = method884(10, false, true, true);
            Statics.field1114 = method884(11, false, true, true);
            Statics.field246 = method884(12, false, true, true);
            Statics.field1719 = method884(13, true, false, true);
            Statics.field1978 = method884(14, false, true, false);
            Statics.field998 = method884(15, false, true, true);
            class86.field1210 = class57.field648;
            class86.field1218 = 20;
            field1486 = 40;
        } else if (field1486 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2711.method1227() * 4 / 100;
            int var8 = var7 + Statics.field1713.method1227() * 4 / 100;
            int var9 = var8 + Statics.field278.method1227() * 2 / 100;
            int var10 = var9 + Statics.field898.method1227() * 2 / 100;
            int var11 = var10 + Statics.field411.method1227() * 6 / 100;
            int var12 = var11 + Statics.field2690.method1227() * 4 / 100;
            int var13 = var12 + Statics.field888.method1227() * 2 / 100;
            int var14 = var13 + Statics.field2734.method1227() * 60 / 100;
            int var15 = var14 + Statics.field417.method1227() * 2 / 100;
            int var16 = var15 + Statics.field1770.method1227() * 2 / 100;
            int var17 = var16 + Statics.field1497.method1227() * 2 / 100;
            int var18 = var17 + Statics.field1114.method1227() * 2 / 100;
            int var19 = var18 + Statics.field246.method1227() * 2 / 100;
            int var20 = var19 + Statics.field1719.method1227() * 2 / 100;
            int var21 = var20 + Statics.field1978.method1227() * 2 / 100;
            int var22 = var21 + Statics.field998.method1227() * 2 / 100;
            if (var22 == 100) {
                class86.field1210 = class57.field822;
                class86.field1218 = 30;
                field1486 = 45;
            } else {
                if (var22 != 0) {
                    class86.field1210 = class57.field759 + var22 + "%";
                }
                class86.field1218 = 30;
            }
        } else if (field1486 == 45) {
            boolean var23 = !field1464;
            Statics.field1914 = 22050;
            Statics.field1773 = var23;
            Statics.field534 = 2;
            class35 var24 = new class35();
            var24.method589(9, 128);
            Statics.field579 = class163.method1138(Statics.field2717, Statics.field1009, 0, 22050);
            Statics.field579.method2925(var24);
            class101.method1259(Statics.field998, Statics.field1978, Statics.field411, var24);
            Statics.field1729 = class163.method1138(Statics.field2717, Statics.field1009, 1, 2048);
            Statics.field2665 = new class160();
            Statics.field1729.method2925(Statics.field2665);
            Statics.field1611 = new class111(22050, Statics.field1914);
            class86.field1210 = class57.field655;
            class86.field1218 = 35;
            field1486 = 50;
        } else if (field1486 == 50) {
            int var25 = 0;
            if (Statics.field620 == null) {
                Statics.field620 = class141.method2277(Statics.field417, Statics.field1719, "p11_full", "");
            } else {
                var25++;
            }
            if (Statics.field1408 == null) {
                Statics.field1408 = class141.method2277(Statics.field417, Statics.field1719, "p12_full", "");
            } else {
                var25++;
            }
            if (Statics.field2627 == null) {
                Statics.field2627 = class141.method2277(Statics.field417, Statics.field1719, "b12_full", "");
            } else {
                var25++;
            }
            if (var25 < 3) {
                class86.field1210 = class57.field656 + var25 * 100 / 3 + "%";
                class86.field1218 = 40;
            } else {
                Statics.field1867 = new class36(true);
                class86.field1210 = class57.field642;
                class86.field1218 = 40;
                field1486 = 60;
            }
        } else if (field1486 == 60) {
            int var26 = class86.method869(Statics.field1497, Statics.field417);
            int var27 = class86.method3164();
            if (var26 < var27) {
                class86.field1210 = class57.field705 + var26 * 100 / var27 + "%";
                class86.field1218 = 50;
            } else {
                class86.field1210 = class57.field659;
                class86.field1218 = 50;
                method1179(5);
                field1486 = 70;
            }
        } else if (field1486 == 70) {
            if (Statics.field278.method1302()) {
                class177.method3462(Statics.field278);
                class83 var28 = Statics.field278;
                Statics.field2199 = var28;
                class185.method1903(Statics.field278, Statics.field2734);
                class83 var29 = Statics.field278;
                class83 var30 = Statics.field2734;
                boolean var31 = field1464;
                Statics.field2764 = var29;
                Statics.field2759 = var30;
                class181.field2765 = var31;
                class184.method3161(Statics.field278, Statics.field2734);
                class83 var32 = Statics.field278;
                class83 var33 = Statics.field2734;
                boolean var34 = field1463;
                class23 var35 = Statics.field620;
                Statics.field2631 = var32;
                Statics.field2606 = var33;
                Statics.field2602 = var34;
                Statics.field2631.method1352(10);
                Statics.field2158 = var35;
                class165.method1294(Statics.field278, Statics.field2711, Statics.field1713);
                class83 var36 = Statics.field278;
                class83 var37 = Statics.field2734;
                Statics.field2654 = var36;
                Statics.field2650 = var37;
                class174.method1510(Statics.field278);
                class83 var38 = Statics.field278;
                Statics.field2568 = var38;
                Statics.field1228 = Statics.field2568.method1352(16);
                Statics.method3465(Statics.field898, Statics.field2734, Statics.field417, Statics.field1719);
                class83 var39 = Statics.field278;
                Statics.field2553 = var39;
                class83 var40 = Statics.field278;
                Statics.field2584 = var40;
                class86.field1210 = class57.field661;
                class86.field1218 = 60;
                field1486 = 80;
            } else {
                class86.field1210 = class57.field660 + Statics.field278.method1235() + "%";
                class86.field1218 = 60;
            }
        } else if (field1486 == 80) {
            int var41 = 0;
            if (Statics.field1367 == null) {
                class83 var42 = Statics.field417;
                int var43 = var42.method1310("compass");
                int var44 = var42.method1311(var43, "");
                class140 var45 = class141.method3052(var42, var43, var44);
                Statics.field1367 = var45;
            } else {
                var41++;
            }
            if (Statics.field1295 == null) {
                class83 var46 = Statics.field417;
                int var47 = var46.method1310("mapedge");
                int var48 = var46.method1311(var47, "");
                class140 var49 = class141.method3052(var46, var47, var48);
                Statics.field1295 = var49;
            } else {
                var41++;
            }
            if (Statics.field609 == null) {
                Statics.field609 = class141.method2164(Statics.field417, "mapscene", "");
            } else {
                var41++;
            }
            if (Statics.field1024 == null) {
                Statics.field1024 = class141.method3232(Statics.field417, "mapfunction", "");
            } else {
                var41++;
            }
            if (Statics.field2850 == null) {
                Statics.field2850 = class141.method3232(Statics.field417, "hitmarks", "");
            } else {
                var41++;
            }
            if (Statics.field1249 == null) {
                Statics.field1249 = class141.method3232(Statics.field417, "headicons_pk", "");
            } else {
                var41++;
            }
            if (Statics.field2511 == null) {
                Statics.field2511 = class141.method3232(Statics.field417, "headicons_prayer", "");
            } else {
                var41++;
            }
            if (Statics.field1824 == null) {
                Statics.field1824 = class141.method3232(Statics.field417, "headicons_hint", "");
            } else {
                var41++;
            }
            if (Statics.field1227 == null) {
                Statics.field1227 = class141.method3232(Statics.field417, "mapmarker", "");
            } else {
                var41++;
            }
            if (Statics.field2733 == null) {
                Statics.field2733 = class141.method3232(Statics.field417, "cross", "");
            } else {
                var41++;
            }
            if (Statics.field1118 == null) {
                Statics.field1118 = class141.method3232(Statics.field417, "mapdots", "");
            } else {
                var41++;
            }
            if (Statics.field1025 == null) {
                Statics.field1025 = class141.method2164(Statics.field417, "scrollbar", "");
            } else {
                var41++;
            }
            if (Statics.field1403 == null) {
                Statics.field1403 = class141.method2164(Statics.field417, "mod_icons", "");
            } else {
                var41++;
            }
            if (Statics.field307 == null) {
                Statics.field307 = class141.method1397(Statics.field417, "mapback", "");
            } else {
                var41++;
            }
            if (var41 < 14) {
                class86.field1210 = class57.field728 + var41 * 100 / 14 + "%";
                class86.field1218 = 70;
            } else {
                Statics.field256 = Statics.field1403;
                Statics.field1295.method2482();
                int var50 = (int) (Math.random() * 21.0D) - 10;
                int var51 = (int) (Math.random() * 21.0D) - 10;
                int var52 = (int) (Math.random() * 21.0D) - 10;
                int var53 = (int) (Math.random() * 41.0D) - 20;
                for (int var54 = 0; var54 < Statics.field1024.length; var54++) {
                    Statics.field1024[var54].method2481(var50 + var53, var51 + var53, var52 + var53);
                }
                Statics.field609[0].method2644(var50 + var53, var51 + var53, var52 + var53);
                method3021();
                class86.field1210 = class57.field663;
                class86.field1218 = 70;
                field1486 = 90;
            }
        } else if (field1486 == 90) {
            if (Statics.field1770.method1302()) {
                class135 var55 = new class135(Statics.field1770, Statics.field417, 20, 0.8D, field1464 ? 64 : 128);
                class155.method2756(var55);
                class155.method2796(0.8D);
                class86.field1210 = class57.field696;
                class86.field1218 = 90;
                field1486 = 110;
            } else {
                class86.field1210 = class57.field805 + Statics.field1770.method1235() + "%";
                class86.field1218 = 90;
            }
        } else if (field1486 == 110) {
            Statics.field1470 = new class94();
            Statics.field2717.method2224(Statics.field1470, 10);
            class86.field1210 = class57.field810;
            class86.field1218 = 94;
            field1486 = 120;
        } else if (field1486 == 120) {
            if (Statics.field1497.method1318("huffman", "")) {
                class51 var56 = new class51(Statics.field1497.method1312("huffman", ""));
                class6.method876(var56);
                class86.field1210 = class57.field668;
                class86.field1218 = 96;
                field1486 = 130;
            } else {
                class86.field1210 = class57.field653 + "%";
                class86.field1218 = 96;
            }
        } else if (field1486 == 130) {
            if (!Statics.field898.method1302()) {
                class86.field1210 = class57.field669 + Statics.field898.method1235() * 4 / 5 + "%";
                class86.field1218 = 100;
            } else if (!Statics.field246.method1302()) {
                class86.field1210 = class57.field669 + (80 + Statics.field246.method1235() / 6) + "%";
                class86.field1218 = 100;
            } else if (Statics.field1719.method1302()) {
                class86.field1210 = class57.field670;
                class86.field1218 = 100;
                field1486 = 140;
            } else {
                class86.field1210 = class57.field669 + (96 + Statics.field1719.method1235() / 20) + "%";
                class86.field1218 = 100;
            }
        } else if (field1486 == 140) {
            method1179(10);
        }
    }

    @ObfuscatedName("br.ap(IIIII)V")
    public static final void method2062(int arg0, int arg1, int arg2, int arg3) {
        field1555 = 0;
        for (int var4 = -1; var4 < field1584 + field1500; var4++) {
            class164 var5;
            if (var4 == -1) {
                var5 = Statics.field1393;
            } else if (var4 < field1584) {
                var5 = field1583[field1525[var4]];
            } else {
                var5 = field1491[field1482[var4 - field1584]];
            }
            if (var5 != null && var5.method944()) {
                if (var5 instanceof class66) {
                    class184 var6 = ((class66) var5).field971;
                    if (var6.field2819 != null) {
                        var6 = var6.method3457();
                    }
                    if (var6 == null) {
                        continue;
                    }
                }
                if (var4 >= field1584) {
                    class184 var9 = ((class66) var5).field971;
                    if (var9.field2819 != null) {
                        var9 = var9.method3457();
                    }
                    if (var9.field2843 >= 0 && var9.field2843 < Statics.field2511.length) {
                        method3159(var5, var5.field2501 + 15);
                        if (field1567 > -1) {
                            Statics.field2511[var9.field2843].method2489(field1567 + arg0 - 12, field1568 + arg1 - 30);
                        }
                    }
                    if (field1538 == 1 && field1662 == field1482[var4 - field1584] && field1468 % 20 < 10) {
                        method3159(var5, var5.field2501 + 15);
                        if (field1567 > -1) {
                            Statics.field1824[0].method2489(field1567 + arg0 - 12, field1568 + arg1 - 28);
                        }
                    }
                } else {
                    int var7 = 30;
                    class61 var8 = (class61) var5;
                    if (var8.field903 != -1 || var8.field917 != -1) {
                        method3159(var5, var5.field2501 + 15);
                        if (field1567 > -1) {
                            if (var8.field903 != -1) {
                                Statics.field1249[var8.field903].method2489(field1567 + arg0 - 12, field1568 + arg1 - var7);
                                var7 += 25;
                            }
                            if (var8.field917 != -1) {
                                Statics.field2511[var8.field917].method2489(field1567 + arg0 - 12, field1568 + arg1 - var7);
                                var7 += 25;
                            }
                        }
                    }
                    if (var4 >= 0 && field1538 == 10 && field1697 == field1525[var4]) {
                        method3159(var5, var5.field2501 + 15);
                        if (field1567 > -1) {
                            Statics.field1824[1].method2489(field1567 + arg0 - 12, field1568 + arg1 - var7);
                        }
                    }
                }
                if (var5.field2467 != null && (var4 >= field1584 || field1561 == 0 || field1561 == 3 || field1561 == 1 && method2157(((class61) var5).field918))) {
                    method3159(var5, var5.field2501);
                    if (field1567 > -1 && field1555 < field1556) {
                        field1560[field1555] = Statics.field2627.method216(var5.field2467) / 2;
                        field1559[field1555] = Statics.field2627.field253;
                        field1557[field1555] = field1567;
                        field1558[field1555] = field1568;
                        field1616[field1555] = var5.field2492;
                        field1572[field1555] = var5.field2486;
                        field1563[field1555] = var5.field2468;
                        field1564[field1555] = var5.field2467;
                        field1555++;
                    }
                }
                if (var5.field2465 > field1468) {
                    method3159(var5, var5.field2501 + 15);
                    if (field1567 > -1) {
                        int var10 = var5.field2506 * 30 / var5.field2476;
                        if (var10 > 30) {
                            var10 = 30;
                        }
                        class106.method1537(field1567 + arg0 - 15, field1568 + arg1 - 3, var10, 5, 65280);
                        class106.method1537(field1567 + arg0 - 15 + var10, field1568 + arg1 - 3, 30 - var10, 5, 16711680);
                    }
                }
                for (int var11 = 0; var11 < 4; var11++) {
                    if (var5.field2473[var11] > field1468) {
                        method3159(var5, var5.field2501 / 2);
                        if (field1567 > -1) {
                            if (var11 == 1) {
                                field1568 -= 20;
                            }
                            if (var11 == 2) {
                                field1567 -= 15;
                                field1568 -= 10;
                            }
                            if (var11 == 3) {
                                field1567 += 15;
                                field1568 -= 10;
                            }
                            Statics.field2850[var5.field2472[var11]].method2489(field1567 + arg0 - 12, field1568 + arg1 - 12);
                            Statics.field620.method223(Integer.toString(var5.field2456[var11]), field1567 + arg0 - 1, field1568 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var12 = 0; var12 < field1555; var12++) {
            int var13 = field1557[var12];
            int var14 = field1558[var12];
            int var15 = field1560[var12];
            int var16 = field1559[var12];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var18 = 0; var18 < var12; var18++) {
                    if (var14 + 2 > field1558[var18] - field1559[var18] && var14 - var16 < field1558[var18] + 2 && var13 - var15 < field1560[var18] + field1557[var18] && var13 + var15 > field1557[var18] - field1560[var18] && field1558[var18] - field1559[var18] < var14) {
                        var14 = field1558[var18] - field1559[var18];
                        var17 = true;
                    }
                }
            }
            field1567 = field1557[var12];
            field1568 = field1558[var12] = var14;
            String var19 = field1564[var12];
            if (field1643 == 0) {
                int var20 = 16776960;
                if (field1616[var12] < 6) {
                    var20 = field1679[field1616[var12]];
                }
                if (field1616[var12] == 6) {
                    var20 = field1566 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field1616[var12] == 7) {
                    var20 = field1566 % 20 < 10 ? 255 : 65535;
                }
                if (field1616[var12] == 8) {
                    var20 = field1566 % 20 < 10 ? 45056 : 8454016;
                }
                if (field1616[var12] == 9) {
                    int var21 = 150 - field1563[var12];
                    if (var21 < 50) {
                        var20 = var21 * 1280 + 16711680;
                    } else if (var21 < 100) {
                        var20 = 16776960 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var20 = (var21 - 100) * 5 + 65280;
                    }
                }
                if (field1616[var12] == 10) {
                    int var22 = 150 - field1563[var12];
                    if (var22 < 50) {
                        var20 = var22 * 5 + 16711680;
                    } else if (var22 < 100) {
                        var20 = 16711935 - (var22 - 50) * 327680;
                    } else if (var22 < 150) {
                        var20 = (var22 - 100) * 327680 + 255 - (var22 - 100) * 5;
                    }
                }
                if (field1616[var12] == 11) {
                    int var23 = 150 - field1563[var12];
                    if (var23 < 50) {
                        var20 = 16777215 - var23 * 327685;
                    } else if (var23 < 100) {
                        var20 = (var23 - 50) * 327685 + 65280;
                    } else if (var23 < 150) {
                        var20 = 16777215 - (var23 - 100) * 327680;
                    }
                }
                if (field1572[var12] == 0) {
                    Statics.field2627.method223(var19, field1567 + arg0, field1568 + arg1, var20, 0);
                }
                if (field1572[var12] == 1) {
                    Statics.field2627.method232(var19, field1567 + arg0, field1568 + arg1, var20, 0, field1566);
                }
                if (field1572[var12] == 2) {
                    Statics.field2627.method226(var19, field1567 + arg0, field1568 + arg1, var20, 0, field1566);
                }
                if (field1572[var12] == 3) {
                    Statics.field2627.method227(var19, field1567 + arg0, field1568 + arg1, var20, 0, field1566, 150 - field1563[var12]);
                }
                if (field1572[var12] == 4) {
                    int var24 = (150 - field1563[var12]) * (Statics.field2627.method216(var19) + 100) / 150;
                    class106.method1586(field1567 + arg0 - 50, arg1, field1567 + arg0 + 50, arg1 + arg3);
                    Statics.field2627.method221(var19, field1567 + arg0 + 50 - var24, field1568 + arg1, var20, 0);
                    class106.method1531(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field1572[var12] == 5) {
                    int var25 = 150 - field1563[var12];
                    int var26 = 0;
                    if (var25 < 25) {
                        var26 = var25 - 25;
                    } else if (var25 > 125) {
                        var26 = var25 - 125;
                    }
                    class106.method1586(arg0, field1568 + arg1 - Statics.field2627.field253 - 1, arg0 + arg2, field1568 + arg1 + 5);
                    Statics.field2627.method223(var19, field1567 + arg0, field1568 + arg1 + var26, var20, 0);
                    class106.method1531(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field2627.method223(var19, field1567 + arg0, field1568 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("br.ae(Las;I)V")
    public static final void method2063(class164 arg0) {
        arg0.field2457 = false;
        if (arg0.field2480 != -1) {
            class165 var1 = class165.method3233(arg0.field2480);
            if (var1 == null || var1.field2522 == null) {
                arg0.field2480 = -1;
            } else {
                arg0.field2482++;
                if (arg0.field2481 < var1.field2522.length && arg0.field2482 > var1.field2526[arg0.field2481]) {
                    arg0.field2482 = 1;
                    arg0.field2481++;
                    method936(var1, arg0.field2481, arg0.field2461, arg0.field2500);
                }
                if (arg0.field2481 >= var1.field2522.length) {
                    arg0.field2482 = 0;
                    arg0.field2481 = 0;
                    method936(var1, arg0.field2481, arg0.field2461, arg0.field2500);
                }
            }
        }
        if (arg0.field2488 != -1 && field1468 >= arg0.field2491) {
            if (arg0.field2475 < 0) {
                arg0.field2475 = 0;
            }
            int var2 = class173.method1223(arg0.field2488).field2661;
            if (var2 == -1) {
                arg0.field2488 = -1;
            } else {
                class165 var3 = class165.method3233(var2);
                if (var3 == null || var3.field2522 == null) {
                    arg0.field2488 = -1;
                } else {
                    arg0.field2514++;
                    if (arg0.field2475 < var3.field2522.length && arg0.field2514 > var3.field2526[arg0.field2475]) {
                        arg0.field2514 = 1;
                        arg0.field2475++;
                        method936(var3, arg0.field2475, arg0.field2461, arg0.field2500);
                    }
                    if (arg0.field2475 >= var3.field2522.length && (arg0.field2475 < 0 || arg0.field2475 >= var3.field2522.length)) {
                        arg0.field2488 = -1;
                    }
                }
            }
        }
        if (arg0.field2483 != -1 && arg0.field2470 <= 1) {
            class165 var4 = class165.method3233(arg0.field2483);
            if (var4.field2533 == 1 && arg0.field2474 > 0 && arg0.field2497 <= field1468 && arg0.field2454 < field1468) {
                arg0.field2470 = 1;
                return;
            }
        }
        if (arg0.field2483 != -1 && arg0.field2470 == 0) {
            class165 var5 = class165.method3233(arg0.field2483);
            if (var5 == null || var5.field2522 == null) {
                arg0.field2483 = -1;
            } else {
                arg0.field2485++;
                if (arg0.field2477 < var5.field2522.length && arg0.field2485 > var5.field2526[arg0.field2477]) {
                    arg0.field2485 = 1;
                    arg0.field2477++;
                    method936(var5, arg0.field2477, arg0.field2461, arg0.field2500);
                }
                if (arg0.field2477 >= var5.field2522.length) {
                    arg0.field2477 -= var5.field2536;
                    arg0.field2487++;
                    if (arg0.field2487 >= var5.field2532) {
                        arg0.field2483 = -1;
                    } else if (arg0.field2477 >= 0 && arg0.field2477 < var5.field2522.length) {
                        method936(var5, arg0.field2477, arg0.field2461, arg0.field2500);
                    } else {
                        arg0.field2483 = -1;
                    }
                }
                arg0.field2457 = var5.field2528;
            }
        }
        if (arg0.field2470 > 0) {
            arg0.field2470--;
        }
    }

    @ObfuscatedName("bu.f(I)V")
    public static void method2067() {
        field1528 = 1L;
        field1711 = -1;
        Statics.field1470.field1324 = 0;
        Statics.field2304 = true;
        field1474 = true;
        field1687 = -1L;
        class19.method660();
        field1695.field303 = 0;
        field1504.field303 = 0;
        field1506 = -1;
        field1510 = -1;
        field1473 = -1;
        field1456 = -1;
        field1507 = 0;
        field1680 = 0;
        field1509 = 0;
        field1538 = 0;
        field1606 = 0;
        field1605 = false;
        class116.field1818 = 0;
        for (int var0 = 0; var0 < 100; var0++) {
            field1515[var0] = null;
        }
        field1678 = 0;
        field1675 = 0;
        field1619 = false;
        field1703 = 0;
        field1571 = (int) (Math.random() * 100.0D) - 50;
        field1615 = (int) (Math.random() * 110.0D) - 55;
        field1533 = (int) (Math.random() * 80.0D) - 40;
        field1536 = (int) (Math.random() * 120.0D) - 60;
        field1592 = (int) (Math.random() * 30.0D) - 20;
        field1549 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field1672 = 0;
        field1690 = -1;
        field1478 = 0;
        field1696 = 0;
        field1584 = 0;
        field1500 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            field1583[var1] = null;
            field1588[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field1491[var2] = null;
        }
        Statics.field1393 = field1583[2047] = new class61();
        field1483.method1098();
        field1600.method1098();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field1597[var3][var4][var5] = null;
                }
            }
        }
        field1598 = new class71();
        field1717 = 0;
        field1716 = 0;
        field1720 = 0;
        for (int var6 = 0; var6 < Statics.field1228; var6++) {
            class169 var7 = class169.method3058(var6);
            if (var7 != null && var7.field2570 == 0) {
                class1.field2[var6] = 0;
                class1.field4[var6] = 0;
            }
        }
        for (int var8 = 0; var8 < field1657.length; var8++) {
            field1657[var8] = -1;
        }
        if (field1608 != -1) {
            class17.method1985(field1608);
        }
        for (class78 var9 = (class78) field1505.method14(); var9 != null; var9 = (class78) field1505.method12()) {
            method916(var9, true);
        }
        field1608 = -1;
        field1505 = new class3(8);
        field1620 = null;
        field1605 = false;
        field1606 = 0;
        field1722.method1037((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var10 = 0; var10 < 8; var10++) {
            field1594[var10] = null;
            field1624[var10] = false;
        }
        class54.method1092();
        field1623 = true;
        for (int var11 = 0; var11 < 100; var11++) {
            field1666[var11] = true;
        }
        field1654 = null;
        Statics.field2438 = 0;
        Statics.field1267 = null;
    }

    @ObfuscatedName("bu.ci([Lfu;IIIIIIIB)V")
    public static final void method2077(class17[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class17 var9 = arg0[var8];
            if (var9 != null && (!var9.field111 || var9.field114 == 0 || var9.field179 || method1362(var9) != 0 || field1694 == var9) && var9.field123 == arg1 && (!var9.field111 || !method3149(var9))) {
                int var10 = var9.field117 + arg6;
                int var11 = var9.field180 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field114 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field114 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field121 + var10;
                    int var19 = var9.field122 + var11;
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
                    int var22 = var9.field121 + var10;
                    int var23 = var9.field122 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1634 == var9) {
                    field1642 = true;
                    field1709 = var10;
                    field1546 = var11;
                }
                if (!var9.field111 || var12 < var14 && var13 < var15) {
                    if (var9.field118 == 1337) {
                        method854(var9);
                    } else if (var9.field118 != 1338) {
                        if (var9.field114 == 0) {
                            if (!var9.field111 && method3149(var9) && Statics.field1087 != var9) {
                                continue;
                            }
                            method2077(arg0, var9.field167, var12, var13, var14, var15, var10 - var9.field125, var11 - var9.field126);
                            if (var9.field220 != null) {
                                method2077(var9.field220, var9.field167, var12, var13, var14, var15, var10 - var9.field125, var11 - var9.field126);
                            }
                            class78 var36 = (class78) field1505.method8((long) var9.field167);
                            if (var36 != null) {
                                method2083(var36.field1103, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field111) {
                            boolean var37;
                            if (class116.field1810 >= var12 && class116.field1816 >= var13 && class116.field1810 < var14 && class116.field1816 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if (class116.field1809 == 1 && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if (class116.field1815 == 1 && class116.field1817 >= var12 && class116.field1805 >= var13 && class116.field1817 < var14 && class116.field1805 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method1222(var9, class116.field1817 - var10, class116.field1805 - var11);
                            }
                            if (field1634 != null && field1634 != var9 && var37 && class12.method2633(method1362(var9))) {
                                field1658 = var9;
                            }
                            if (field1694 == var9) {
                                field1459 = true;
                                field1708 = var10;
                                field1641 = var11;
                            }
                            if (var9.field179) {
                                if (var37 && field1580 != 0 && var9.field200 != null) {
                                    class82 var40 = new class82();
                                    var40.field1148 = var9;
                                    var40.field1150 = field1580;
                                    var40.field1158 = var9.field200;
                                    field1660.method1099(var40);
                                }
                                if (field1634 != null || Statics.field1919 != null || field1605) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field222 && var39) {
                                    var9.field222 = true;
                                    if (var9.field181 != null) {
                                        class82 var41 = new class82();
                                        var41.field1148 = var9;
                                        var41.field1157 = class116.field1817 - var10;
                                        var41.field1150 = class116.field1805 - var11;
                                        var41.field1158 = var9.field181;
                                        field1660.method1099(var41);
                                    }
                                }
                                if (var9.field222 && var38 && var9.field199 != null) {
                                    class82 var42 = new class82();
                                    var42.field1148 = var9;
                                    var42.field1157 = class116.field1810 - var10;
                                    var42.field1150 = class116.field1816 - var11;
                                    var42.field1158 = var9.field199;
                                    field1660.method1099(var42);
                                }
                                if (var9.field222 && !var38) {
                                    var9.field222 = false;
                                    if (var9.field213 != null) {
                                        class82 var43 = new class82();
                                        var43.field1148 = var9;
                                        var43.field1157 = class116.field1810 - var10;
                                        var43.field1150 = class116.field1816 - var11;
                                        var43.field1158 = var9.field213;
                                        field1586.method1099(var43);
                                    }
                                }
                                if (var38 && var9.field184 != null) {
                                    class82 var44 = new class82();
                                    var44.field1148 = var9;
                                    var44.field1157 = class116.field1810 - var10;
                                    var44.field1150 = class116.field1816 - var11;
                                    var44.field1158 = var9.field184;
                                    field1660.method1099(var44);
                                }
                                if (!var9.field221 && var37) {
                                    var9.field221 = true;
                                    if (var9.field185 != null) {
                                        class82 var45 = new class82();
                                        var45.field1148 = var9;
                                        var45.field1157 = class116.field1810 - var10;
                                        var45.field1150 = class116.field1816 - var11;
                                        var45.field1158 = var9.field185;
                                        field1660.method1099(var45);
                                    }
                                }
                                if (var9.field221 && var37 && var9.field150 != null) {
                                    class82 var46 = new class82();
                                    var46.field1148 = var9;
                                    var46.field1157 = class116.field1810 - var10;
                                    var46.field1150 = class116.field1816 - var11;
                                    var46.field1158 = var9.field150;
                                    field1660.method1099(var46);
                                }
                                if (var9.field221 && !var37) {
                                    var9.field221 = false;
                                    if (var9.field127 != null) {
                                        class82 var47 = new class82();
                                        var47.field1148 = var9;
                                        var47.field1157 = class116.field1810 - var10;
                                        var47.field1150 = class116.field1816 - var11;
                                        var47.field1158 = var9.field127;
                                        field1586.method1099(var47);
                                    }
                                }
                                if (var9.field198 != null) {
                                    class82 var48 = new class82();
                                    var48.field1148 = var9;
                                    var48.field1158 = var9.field198;
                                    field1492.method1099(var48);
                                }
                                if (var9.field192 != null && field1550 > var9.field224) {
                                    if (var9.field193 == null || field1550 - var9.field224 > 32) {
                                        class82 var53 = new class82();
                                        var53.field1148 = var9;
                                        var53.field1158 = var9.field192;
                                        field1660.method1099(var53);
                                    } else {
                                        label394: for (int var49 = var9.field224; var49 < field1550; var49++) {
                                            int var50 = field1667[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field193.length; var51++) {
                                                if (var9.field193[var51] == var50) {
                                                    class82 var52 = new class82();
                                                    var52.field1148 = var9;
                                                    var52.field1158 = var9.field192;
                                                    field1660.method1099(var52);
                                                    break label394;
                                                }
                                            }
                                        }
                                    }
                                    var9.field224 = field1550;
                                }
                                if (var9.field194 != null && field1490 > var9.field183) {
                                    if (var9.field195 == null || field1490 - var9.field183 > 32) {
                                        class82 var58 = new class82();
                                        var58.field1148 = var9;
                                        var58.field1158 = var9.field194;
                                        field1660.method1099(var58);
                                    } else {
                                        label374: for (int var54 = var9.field183; var54 < field1490; var54++) {
                                            int var55 = field1617[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field195.length; var56++) {
                                                if (var9.field195[var56] == var55) {
                                                    class82 var57 = new class82();
                                                    var57.field1148 = var9;
                                                    var57.field1158 = var9.field194;
                                                    field1660.method1099(var57);
                                                    break label374;
                                                }
                                            }
                                        }
                                    }
                                    var9.field183 = field1490;
                                }
                                if (var9.field197 != null && field1652 > var9.field142) {
                                    if (var9.field161 == null || field1652 - var9.field142 > 32) {
                                        class82 var63 = new class82();
                                        var63.field1148 = var9;
                                        var63.field1158 = var9.field197;
                                        field1660.method1099(var63);
                                    } else {
                                        label354: for (int var59 = var9.field142; var59 < field1652; var59++) {
                                            int var60 = field1651[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field161.length; var61++) {
                                                if (var9.field161[var61] == var60) {
                                                    class82 var62 = new class82();
                                                    var62.field1148 = var9;
                                                    var62.field1158 = var9.field197;
                                                    field1660.method1099(var62);
                                                    break label354;
                                                }
                                            }
                                        }
                                    }
                                    var9.field142 = field1652;
                                }
                                if (field1585 > var9.field203 && var9.field148 != null) {
                                    class82 var64 = new class82();
                                    var64.field1148 = var9;
                                    var64.field1158 = var9.field148;
                                    field1660.method1099(var64);
                                }
                                if (field1635 > var9.field203 && var9.field165 != null) {
                                    class82 var65 = new class82();
                                    var65.field1148 = var9;
                                    var65.field1158 = var9.field165;
                                    field1660.method1099(var65);
                                }
                                if (field1655 > var9.field203 && var9.field204 != null) {
                                    class82 var66 = new class82();
                                    var66.field1148 = var9;
                                    var66.field1158 = var9.field204;
                                    field1660.method1099(var66);
                                }
                                if (field1656 > var9.field203 && var9.field110 != null) {
                                    class82 var67 = new class82();
                                    var67.field1148 = var9;
                                    var67.field1158 = var9.field110;
                                    field1660.method1099(var67);
                                }
                                var9.field203 = field1472;
                                if (var9.field187 != null) {
                                    for (int var68 = 0; var68 < field1684; var68++) {
                                        class82 var69 = new class82();
                                        var69.field1148 = var9;
                                        var69.field1153 = field1686[var68];
                                        var69.field1154 = field1677[var68];
                                        var69.field1158 = var9.field187;
                                        field1660.method1099(var69);
                                    }
                                }
                            }
                        }
                        if (!var9.field111) {
                            if (field1634 != null || Statics.field1919 != null || field1605) {
                                return;
                            }
                            if ((var9.field211 >= 0 || var9.field223 != 0) && class116.field1810 >= var12 && class116.field1816 >= var13 && class116.field1810 < var14 && class116.field1816 < var15) {
                                if (var9.field211 >= 0) {
                                    Statics.field1087 = arg0[var9.field211];
                                } else {
                                    Statics.field1087 = var9;
                                }
                            }
                            if (var9.field114 == 8 && class116.field1810 >= var12 && class116.field1816 >= var13 && class116.field1810 < var14 && class116.field1816 < var15) {
                                Statics.field1089 = var9;
                            }
                            if (var9.field128 > var9.field122) {
                                method1375(var9, var9.field121 + var10, var11, var9.field122, var9.field128, class116.field1810, class116.field1816);
                            }
                        }
                    } else if ((field1672 == 0 || field1672 == 3) && class116.field1815 == 1) {
                        int var24 = class116.field1817 - 25 - var10;
                        int var25 = class116.field1805 - 5 - var11;
                        if (var24 >= 0 && var25 >= 0 && var24 < 146 && var25 < 151) {
                            var24 -= 73;
                            var25 -= 75;
                            int var26 = field1549 + field1536 & 0x7FF;
                            int var27 = class155.field2344[var26];
                            int var28 = class155.field2332[var26];
                            int var29 = (field1592 + 256) * var27 >> 8;
                            int var30 = (field1592 + 256) * var28 >> 8;
                            int var31 = var24 * var30 + var25 * var29 >> 11;
                            int var32 = var25 * var30 - var24 * var29 >> 11;
                            int var33 = Statics.field1393.field2461 + var31 >> 7;
                            int var34 = Statics.field1393.field2500 - var32 >> 7;
                            boolean var35 = method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var33, var34, true, 0, 0, 0, 0, 0, 1);
                            if (var35) {
                                field1695.method443(var24);
                                field1695.method443(var25);
                                field1695.method300(field1549);
                                field1695.method443(57);
                                field1695.method443(field1536);
                                field1695.method443(field1592);
                                field1695.method443(89);
                                field1695.method300(Statics.field1393.field2461);
                                field1695.method300(Statics.field1393.field2500);
                                field1695.method443(field1524);
                                field1695.method443(63);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bt.cq(IIIIIIIB)V")
    public static final void method2083(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class17.method856(arg0)) {
            method2077(Statics.field116[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("bj.dr(Ljava/lang/String;S)Z")
    public static boolean method2157(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class103.method740(arg0, Statics.field1462);
        for (int var2 = 0; var2 < field1716; var2++) {
            if (var1.equalsIgnoreCase(class103.method740(field1718[var2].field1278, Statics.field1462))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class103.method740(Statics.field1393.field918, Statics.field1462))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bk.dp(IB)V")
    public static void method2162(int arg0) {
        for (class14 var1 = (class14) field1663.method14(); var1 != null; var1 = (class14) field1663.method12()) {
            if ((var1.field76 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method76();
            }
        }
    }

    @ObfuscatedName("bm.bo(IIIIIIIIII)V")
    public static final void method2169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80 var9 = null;
        for (class80 var10 = (class80) field1598.method1104(); var10 != null; var10 = (class80) field1598.method1106()) {
            if (var10.field1119 == arg0 && var10.field1125 == arg1 && var10.field1115 == arg2 && var10.field1123 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class80();
            var9.field1119 = arg0;
            var9.field1123 = arg3;
            var9.field1125 = arg1;
            var9.field1115 = arg2;
            method2295(var9);
            field1598.method1099(var9);
        }
        var9.field1124 = arg4;
        var9.field1121 = arg5;
        var9.field1120 = arg6;
        var9.field1122 = arg7;
        var9.field1127 = arg8;
    }

    @ObfuscatedName("bh.cv(IB)Ljava/lang/String;")
    public static final String method2187(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class62.field922 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class62.method1489(65408) + var1.substring(0, var1.length() - 8) + class57.field853 + " " + class62.field924 + var1 + class62.field935 + class62.field925;
        } else if (var1.length() > 6) {
            return " " + class62.method1489(16777215) + var1.substring(0, var1.length() - 4) + class57.field794 + " " + class62.field924 + var1 + class62.field935 + class62.field925;
        } else {
            return " " + class62.method1489(16776960) + var1 + class62.field925;
        }
    }

    @ObfuscatedName("da.cd(Ljava/lang/String;Lfu;I)Ljava/lang/String;")
    public static String method2284(String arg0, class17 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1022(arg1, var2 - 1);
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
                if (Statics.field2151 != null) {
                    int var9 = Statics.field2151.field2366;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field2151.field2360 != null) {
                        var8 = (String) Statics.field2151.field2360;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("da.bp(Lw;I)V")
    public static final void method2295(class80 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1123 == 0) {
            var1 = Statics.field967.method2329(arg0.field1119, arg0.field1125, arg0.field1115);
        }
        if (arg0.field1123 == 1) {
            var1 = Statics.field967.method2330(arg0.field1119, arg0.field1125, arg0.field1115);
        }
        if (arg0.field1123 == 2) {
            var1 = Statics.field967.method2424(arg0.field1119, arg0.field1125, arg0.field1115);
        }
        if (arg0.field1123 == 3) {
            var1 = Statics.field967.method2332(arg0.field1119, arg0.field1125, arg0.field1115);
        }
        if (var1 != 0) {
            int var5 = Statics.field967.method2333(arg0.field1119, arg0.field1125, arg0.field1115, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1116 = var2;
        arg0.field1113 = var3;
        arg0.field1117 = var4;
    }

    @ObfuscatedName("cz.bj(I)V")
    public static final void method2300() {
        field1504.method753();
        int var0 = field1504.method747(8);
        if (var0 < field1500) {
            for (int var1 = var0; var1 < field1500; var1++) {
                field1638[++field1591 - 1] = field1482[var1];
            }
        }
        if (var0 > field1500) {
            throw new RuntimeException("");
        }
        field1500 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field1482[var2];
            class66 var4 = field1491[var3];
            int var5 = field1504.method747(1);
            if (var5 == 0) {
                field1482[++field1500 - 1] = var3;
                var4.field2484 = field1468;
            } else {
                int var6 = field1504.method747(2);
                if (var6 == 0) {
                    field1482[++field1500 - 1] = var3;
                    var4.field2484 = field1468;
                    field1587[++field1628 - 1] = var3;
                } else if (var6 == 1) {
                    field1482[++field1500 - 1] = var3;
                    var4.field2484 = field1468;
                    int var7 = field1504.method747(3);
                    var4.method2970(var7, false);
                    int var8 = field1504.method747(1);
                    if (var8 == 1) {
                        field1587[++field1628 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field1482[++field1500 - 1] = var3;
                    var4.field2484 = field1468;
                    int var9 = field1504.method747(3);
                    var4.method2970(var9, true);
                    int var10 = field1504.method747(3);
                    var4.method2970(var10, true);
                    int var11 = field1504.method747(1);
                    if (var11 == 1) {
                        field1587[++field1628 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field1638[++field1591 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("cy.br(IIIII)V")
    public static final void method2301(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1664; var4++) {
            if (field1669[var4] + field1484[var4] > arg0 && field1669[var4] < arg0 + arg2 && field1693[var4] + field1671[var4] > arg1 && field1693[var4] < arg1 + arg3) {
                field1603[var4] = true;
            }
        }
    }

    @ObfuscatedName("co.l(B)V")
    public static final void method2631() {
        if (field1509 > 0) {
            method903();
        } else {
            method1179(40);
            Statics.field2560 = Statics.field2549;
            Statics.field2549 = null;
        }
    }

    @ObfuscatedName("cm.bu(I)V")
    public static final void method2637() {
        while (true) {
            if (field1504.method749(field1625) >= 11) {
                int var0 = field1504.method747(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field1583[var0] == null) {
                        field1583[var0] = new class61();
                        if (field1588[var0] != null) {
                            field1583[var0].method935(field1588[var0]);
                        }
                        var1 = true;
                    }
                    field1525[++field1584 - 1] = var0;
                    class61 var2 = field1583[var0];
                    var2.field2484 = field1468;
                    int var3 = field1504.method747(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field1504.method747(1);
                    int var5 = field1596[field1504.method747(3)];
                    if (var1) {
                        var2.field2502 = var2.field2490 = var5;
                    }
                    int var6 = field1504.method747(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field1504.method747(1);
                    if (var7 == 1) {
                        field1587[++field1628 - 1] = var0;
                    }
                    var2.method2956(Statics.field1393.field2503[0] + var6, Statics.field1393.field2507[0] + var3, var4 == 1);
                    continue;
                }
            }
            field1504.method745();
            return;
        }
    }

    @ObfuscatedName("at.ag(IIII)V")
    public static final void method2928(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field1567 = -1;
            field1568 = -1;
            return;
        }
        int var3 = method924(arg0, arg1, Statics.field933) - arg2;
        int var4 = arg0 - Statics.field974;
        int var5 = var3 - Statics.field1088;
        int var6 = arg1 - Statics.field2357;
        int var7 = class155.field2344[Statics.field1404];
        int var8 = class155.field2332[Statics.field1404];
        int var9 = class155.field2344[Statics.field1162];
        int var10 = class155.field2332[Statics.field1162];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field1567 = (var11 << 9) / var15 + 256;
            field1568 = (var14 << 9) / var15 + 167;
        } else {
            field1567 = -1;
            field1568 = -1;
        }
    }

    @ObfuscatedName("at.di(Ljava/lang/String;II)V")
    public static final void method2954(String arg0, int arg1) {
        field1695.method746(168);
        field1695.method443(class28.method2628(arg0) + 1);
        field1695.method443(arg1);
        field1695.method303(arg0);
    }

    @ObfuscatedName("ar.bb(I)V")
    public static final void method2983() {
        field1504.method753();
        int var0 = field1504.method747(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field1504.method747(2);
        if (var1 == 0) {
            field1587[++field1628 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field1504.method747(3);
            Statics.field1393.method2970(var2, false);
            int var3 = field1504.method747(1);
            if (var3 == 1) {
                field1587[++field1628 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field1504.method747(3);
            Statics.field1393.method2970(var4, true);
            int var5 = field1504.method747(3);
            Statics.field1393.method2970(var5, true);
            int var6 = field1504.method747(1);
            if (var6 == 1) {
                field1587[++field1628 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field1504.method747(1);
            if (var7 == 1) {
                field1587[++field1628 - 1] = 2047;
            }
            int var8 = field1504.method747(1);
            Statics.field933 = field1504.method747(2);
            int var9 = field1504.method747(7);
            int var10 = field1504.method747(7);
            Statics.field1393.method2956(var9, var10, var8 == 1);
        }
    }

    @ObfuscatedName("ax.o(I)V")
    public static void method3021() {
        Statics.field1093 = new int[33];
        Statics.field515 = new int[33];
        Statics.field2355 = new int[151];
        Statics.field1885 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field307.field2226[Statics.field307.field2231 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field1093[var0] = var1;
            Statics.field515[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field307.field2226[Statics.field307.field2231 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field2355[var4 - 5] = var5 - 25;
            Statics.field1885[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("aw.dx(Lfu;I)Ljava/lang/String;")
    public static String method3029(class17 arg0) {
        if (class12.method2632(method1362(arg0)) == 0) {
            return null;
        } else if (arg0.field178 == null || arg0.field178.trim().length() == 0) {
            return null;
        } else {
            return arg0.field178;
        }
    }

    @ObfuscatedName("au.ch(II)V")
    public static final void method3055(int arg0) {
        method1293();
        for (class104 var1 = (class104) class104.field1424.method1104(); var1 != null; var1 = (class104) class104.field1424.method1106()) {
            if (var1.field1422 != null) {
                var1.method1508();
            }
        }
        int var2 = class169.method3058(arg0).field2570;
        if (var2 == 0) {
            return;
        }
        int var3 = class1.field4[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class155.method2796(0.9D);
                ((class135) Statics.field2323).method2280(0.9D);
            }
            if (var3 == 2) {
                class155.method2796(0.8D);
                ((class135) Statics.field2323).method2280(0.8D);
            }
            if (var3 == 3) {
                class155.method2796(0.7D);
                ((class135) Statics.field2323).method2280(0.7D);
            }
            if (var3 == 4) {
                class155.method2796(0.6D);
                ((class135) Statics.field2323).method2280(0.6D);
            }
            class172.method770();
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
            if (field1698 != var4) {
                if (field1698 == 0 && field1699 != -1) {
                    class101.method1488(Statics.field888, field1699, 0, var4, false);
                    field1700 = false;
                } else if (var4 == 0) {
                    Statics.field1383.method587();
                    class101.field1381 = 1;
                    Statics.field1384 = null;
                    field1700 = false;
                } else if (class101.field1381 == 0) {
                    Statics.field1383.method581(var4);
                } else {
                    Statics.field1801 = var4;
                }
                field1698 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field1701 = 127;
            }
            if (var3 == 1) {
                field1701 = 96;
            }
            if (var3 == 2) {
                field1701 = 64;
            }
            if (var3 == 3) {
                field1701 = 32;
            }
            if (var3 == 4) {
                field1701 = 0;
            }
        }
        if (var2 == 5) {
            field1604 = var3;
        }
        if (var2 == 6) {
            field1643 = var3;
        }
        if (var2 == 9) {
            field1626 = var3;
        }
        if (var2 != 10) {
            return;
        }
        if (var3 == 0) {
            field1702 = 127;
        }
        if (var3 == 1) {
            field1702 = 96;
        }
        if (var3 == 2) {
            field1702 = 64;
        }
        if (var3 == 3) {
            field1702 = 32;
        }
        if (var3 == 4) {
            field1702 = 0;
        }
    }

    @ObfuscatedName("al.be(S)V")
    public static final void method3084() {
        int var0 = Statics.field2627.method216(class57.field784);
        for (int var1 = 0; var1 < field1606; var1++) {
            class23 var2 = Statics.field2627;
            String var3;
            if (field1612[var1].length() > 0) {
                var3 = field1627[var1] + class57.field755 + field1612[var1];
            } else {
                var3 = field1627[var1];
            }
            int var4 = var2.method216(var3);
            if (var4 > var0) {
                var0 = var4;
            }
        }
        var0 += 8;
        int var5 = field1606 * 15 + 21;
        int var6 = class116.field1817 - var0 / 2;
        if (var0 + var6 > 765) {
            var6 = 765 - var0;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = class116.field1805;
        if (var5 + var7 > 503) {
            var7 = 503 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field1605 = true;
        Statics.field1279 = var6;
        Statics.field1099 = var7;
        Statics.field2055 = var0;
        Statics.field1265 = field1606 * 15 + 22;
    }

    @ObfuscatedName("ai.dm(I)V")
    public static final void method3135() {
        field1695.method746(250);
        for (class78 var0 = (class78) field1505.method14(); var0 != null; var0 = (class78) field1505.method12()) {
            if (var0.field1101 == 0 || var0.field1101 == 3) {
                method916(var0, true);
            }
        }
        if (field1620 != null) {
            method854(field1620);
            field1620 = null;
        }
    }

    @ObfuscatedName("aj.dh(Lfu;I)Z")
    public static boolean method3149(class17 arg0) {
        if (field1631) {
            if (method1362(arg0) != 0) {
                return false;
            }
            if (arg0.field114 == 0) {
                return false;
            }
        }
        return arg0.field182;
    }

    @ObfuscatedName("aj.az(Las;II)V")
    public static final void method3159(class164 arg0, int arg1) {
        method2928(arg0.field2461, arg0.field2500, arg1);
    }

    @ObfuscatedName("aj.bz(II)V")
    public static final void method3167(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field1607[arg0];
        int var2 = field1511[arg0];
        int var3 = field1609[arg0];
        int var4 = field1610[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 1002) {
            field1476 = class116.field1817;
            field1570 = class116.field1805;
            field1548 = 2;
            field1614 = 0;
            field1695.method746(154);
            field1695.method342(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 38) {
            method918();
            class17 var5 = class17.method865(var2);
            field1675 = 1;
            Statics.field1071 = var1;
            Statics.field2032 = var2;
            Statics.field1141 = var4;
            method854(var5);
            field1519 = class62.method1489(16748608) + class172.method934(var4).field2608 + class62.method1489(16777215);
            if (field1519 == null) {
                field1519 = "null";
            }
            return;
        }
        if (var3 == 34) {
            field1695.method746(236);
            field1695.method302(var2);
            field1695.method300(var4);
            field1695.method343(var1);
            field1573 = 0;
            Statics.field962 = class17.method865(var2);
            field1574 = var1;
        }
        if (var3 == 39) {
            field1695.method746(152);
            field1695.method343(var1);
            field1695.method341(var4);
            field1695.method346(var2);
            field1573 = 0;
            Statics.field962 = class17.method865(var2);
            field1574 = var1;
        }
        if (var3 == 12) {
            class66 var6 = field1491[var4];
            if (var6 != null) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var6.field2503[0], var6.field2507[0], false, 0, 0, 1, 1, 0, 2);
                field1476 = class116.field1817;
                field1570 = class116.field1805;
                field1548 = 2;
                field1614 = 0;
                field1695.method746(115);
                field1695.method342(var4);
            }
        }
        if (var3 == 1003) {
            field1476 = class116.field1817;
            field1570 = class116.field1805;
            field1548 = 2;
            field1614 = 0;
            class66 var7 = field1491[var4];
            if (var7 != null) {
                class184 var8 = var7.field971;
                if (var8.field2819 != null) {
                    var8 = var8.method3457();
                }
                if (var8 != null) {
                    field1695.method746(85);
                    field1695.method341(var8.field2821);
                }
            }
        }
        if (var3 == 11) {
            class66 var9 = field1491[var4];
            if (var9 != null) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var9.field2503[0], var9.field2507[0], false, 0, 0, 1, 1, 0, 2);
                field1476 = class116.field1817;
                field1570 = class116.field1805;
                field1548 = 2;
                field1614 = 0;
                field1695.method746(5);
                field1695.method343(var4);
            }
        }
        if (var3 == 57 || var3 == 1007) {
            method3169(var4, var2, var1, field1612[arg0]);
        }
        if (var3 == 42) {
            field1695.method746(110);
            field1695.method346(var2);
            field1695.method342(var4);
            field1695.method341(var1);
            field1573 = 0;
            Statics.field962 = class17.method865(var2);
            field1574 = var1;
        }
        if (var3 == 31) {
            field1695.method746(216);
            field1695.method343(Statics.field1141);
            field1695.method350(var2);
            field1695.method300(var4);
            field1695.method351(Statics.field2032);
            field1695.method342(var1);
            field1695.method341(Statics.field1071);
            field1573 = 0;
            Statics.field962 = class17.method865(var2);
            field1574 = var1;
        }
        if (var3 == 20) {
            boolean var10 = method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var10) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field1476 = class116.field1817;
            field1570 = class116.field1805;
            field1548 = 2;
            field1614 = 0;
            field1695.method746(72);
            field1695.method342(Statics.field1915 + var2);
            field1695.method342(var4);
            field1695.method300(Statics.field2722 + var1);
        }
        if (var3 == 40) {
            field1695.method746(202);
            field1695.method341(var4);
            field1695.method346(var2);
            field1695.method341(var1);
            field1573 = 0;
            Statics.field962 = class17.method865(var2);
            field1574 = var1;
        }
        if (var3 == 14) {
            class61 var12 = field1583[var4];
            if (var12 != null) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var12.field2503[0], var12.field2507[0], false, 0, 0, 1, 1, 0, 2);
                field1476 = class116.field1817;
                field1570 = class116.field1805;
                field1548 = 2;
                field1614 = 0;
                field1695.method746(235);
                field1695.method346(Statics.field2032);
                field1695.method300(Statics.field1141);
                field1695.method300(Statics.field1071);
                field1695.method341(var4);
            }
        }
        if (var3 == 6) {
            method946(var1, var2, var4);
            field1695.method746(107);
            field1695.method341(var4 >> 14 & 0x7FFF);
            field1695.method341(Statics.field2722 + var1);
            field1695.method342(Statics.field1915 + var2);
        }
        if (var3 == 51) {
            class61 var13 = field1583[var4];
            if (var13 != null) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var13.field2503[0], var13.field2507[0], false, 0, 0, 1, 1, 0, 2);
                field1476 = class116.field1817;
                field1570 = class116.field1805;
                field1548 = 2;
                field1614 = 0;
                field1695.method746(138);
                field1695.method341(var4);
            }
        }
        if (var3 == 48) {
            class61 var14 = field1583[var4];
            if (var14 != null) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var14.field2503[0], var14.field2507[0], false, 0, 0, 1, 1, 0, 2);
                field1476 = class116.field1817;
                field1570 = class116.field1805;
                field1548 = 2;
                field1614 = 0;
                field1695.method746(30);
                field1695.method343(var4);
            }
        }
        if (var3 == 46) {
            class61 var15 = field1583[var4];
            if (var15 != null) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var15.field2503[0], var15.field2507[0], false, 0, 0, 1, 1, 0, 2);
                field1476 = class116.field1817;
                field1570 = class116.field1805;
                field1548 = 2;
                field1614 = 0;
                field1695.method746(198);
                field1695.method341(var4);
            }
        }
        if (var3 == 47) {
            class61 var16 = field1583[var4];
            if (var16 != null) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var16.field2503[0], var16.field2507[0], false, 0, 0, 1, 1, 0, 2);
                field1476 = class116.field1817;
                field1570 = class116.field1805;
                field1548 = 2;
                field1614 = 0;
                field1695.method746(148);
                field1695.method343(var4);
            }
        }
        if (var3 == 8) {
            class66 var17 = field1491[var4];
            if (var17 != null) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var17.field2503[0], var17.field2507[0], false, 0, 0, 1, 1, 0, 2);
                field1476 = class116.field1817;
                field1570 = class116.field1805;
                field1548 = 2;
                field1614 = 0;
                field1695.method746(109);
                field1695.method351(Statics.field2194);
                field1695.method342(field1471);
                field1695.method341(var4);
            }
        }
        if (var3 == 17) {
            boolean var18 = method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var18) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field1476 = class116.field1817;
            field1570 = class116.field1805;
            field1548 = 2;
            field1614 = 0;
            field1695.method746(188);
            field1695.method341(Statics.field1915 + var2);
            field1695.method342(Statics.field2722 + var1);
            field1695.method300(var4);
            field1695.method342(field1471);
            field1695.method302(Statics.field2194);
        }
        if (var3 == 7) {
            class66 var20 = field1491[var4];
            if (var20 != null) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var20.field2503[0], var20.field2507[0], false, 0, 0, 1, 1, 0, 2);
                field1476 = class116.field1817;
                field1570 = class116.field1805;
                field1548 = 2;
                field1614 = 0;
                field1695.method746(254);
                field1695.method341(var4);
                field1695.method300(Statics.field1141);
                field1695.method302(Statics.field2032);
                field1695.method342(Statics.field1071);
            }
        }
        if (var3 == 33) {
            field1695.method746(195);
            field1695.method342(var1);
            field1695.method342(var4);
            field1695.method302(var2);
            field1573 = 0;
            Statics.field962 = class17.method865(var2);
            field1574 = var1;
        }
        if (var3 == 28) {
            field1695.method746(255);
            field1695.method302(var2);
            class17 var21 = class17.method865(var2);
            if (var21.field208 != null && var21.field208[0][0] == 5) {
                int var22 = var21.field208[0][1];
                class1.field4[var22] = 1 - class1.field4[var22];
                method3055(var22);
            }
        }
        if (var3 == 44) {
            class61 var23 = field1583[var4];
            if (var23 != null) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var23.field2503[0], var23.field2507[0], false, 0, 0, 1, 1, 0, 2);
                field1476 = class116.field1817;
                field1570 = class116.field1805;
                field1548 = 2;
                field1614 = 0;
                field1695.method746(159);
                field1695.method342(var4);
            }
        }
        if (var3 == 16) {
            boolean var24 = method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var24) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field1476 = class116.field1817;
            field1570 = class116.field1805;
            field1548 = 2;
            field1614 = 0;
            field1695.method746(93);
            field1695.method350(Statics.field2032);
            field1695.method342(Statics.field1915 + var2);
            field1695.method342(var4);
            field1695.method300(Statics.field1141);
            field1695.method343(Statics.field2722 + var1);
            field1695.method342(Statics.field1071);
        }
        if (var3 == 37) {
            field1695.method746(160);
            field1695.method350(var2);
            field1695.method342(var1);
            field1695.method342(var4);
            field1573 = 0;
            Statics.field962 = class17.method865(var2);
            field1574 = var1;
        }
        if (var3 == 15) {
            class61 var26 = field1583[var4];
            if (var26 != null) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var26.field2503[0], var26.field2507[0], false, 0, 0, 1, 1, 0, 2);
                field1476 = class116.field1817;
                field1570 = class116.field1805;
                field1548 = 2;
                field1614 = 0;
                field1695.method746(223);
                field1695.method341(var4);
                field1695.method341(field1471);
                field1695.method351(Statics.field2194);
            }
        }
        if (var3 == 35) {
            field1695.method746(70);
            field1695.method342(var4);
            field1695.method351(var2);
            field1695.method342(var1);
            field1573 = 0;
            Statics.field962 = class17.method865(var2);
            field1574 = var1;
        }
        if (var3 == 43) {
            field1695.method746(201);
            field1695.method342(var4);
            field1695.method346(var2);
            field1695.method300(var1);
            field1573 = 0;
            Statics.field962 = class17.method865(var2);
            field1574 = var1;
        }
        if (var3 == 9) {
            class66 var27 = field1491[var4];
            if (var27 != null) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var27.field2503[0], var27.field2507[0], false, 0, 0, 1, 1, 0, 2);
                field1476 = class116.field1817;
                field1570 = class116.field1805;
                field1548 = 2;
                field1614 = 0;
                field1695.method746(111);
                field1695.method341(var4);
            }
        }
        if (var3 == 1001) {
            method946(var1, var2, var4);
            field1695.method746(239);
            field1695.method300(Statics.field2722 + var1);
            field1695.method342(var4 >> 14 & 0x7FFF);
            field1695.method342(Statics.field1915 + var2);
        }
        if (var3 == 3) {
            method946(var1, var2, var4);
            field1695.method746(227);
            field1695.method341(var4 >> 14 & 0x7FFF);
            field1695.method342(Statics.field1915 + var2);
            field1695.method343(Statics.field2722 + var1);
        }
        if (var3 == 58) {
            field1695.method746(224);
            field1695.method302(Statics.field2194);
            field1695.method302(var2);
            field1695.method300(var1);
            field1695.method341(field1471);
        }
        if (var3 == 41) {
            field1695.method746(232);
            field1695.method341(var1);
            field1695.method341(var4);
            field1695.method346(var2);
            field1573 = 0;
            Statics.field962 = class17.method865(var2);
            field1574 = var1;
        }
        if (var3 == 10) {
            class66 var28 = field1491[var4];
            if (var28 != null) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var28.field2503[0], var28.field2507[0], false, 0, 0, 1, 1, 0, 2);
                field1476 = class116.field1817;
                field1570 = class116.field1805;
                field1548 = 2;
                field1614 = 0;
                field1695.method746(206);
                field1695.method341(var4);
            }
        }
        if (var3 == 1 && method946(var1, var2, var4)) {
            field1695.method746(58);
            field1695.method300(Statics.field1141);
            field1695.method343(Statics.field1071);
            field1695.method302(Statics.field2032);
            field1695.method341(Statics.field1915 + var2);
            field1695.method300(var4 >> 14 & 0x7FFF);
            field1695.method300(Statics.field2722 + var1);
        }
        if (var3 == 30 && field1620 == null) {
            field1695.method746(183);
            field1695.method343(var1);
            field1695.method302(var2);
            field1620 = class17.method3203(var2, var1);
            method854(field1620);
        }
        if (var3 == 18) {
            boolean var29 = method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var29) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field1476 = class116.field1817;
            field1570 = class116.field1805;
            field1548 = 2;
            field1614 = 0;
            field1695.method746(56);
            field1695.method343(var4);
            field1695.method343(Statics.field1915 + var2);
            field1695.method342(Statics.field2722 + var1);
        }
        if (var3 == 32) {
            field1695.method746(162);
            field1695.method302(Statics.field2194);
            field1695.method343(field1471);
            field1695.method341(var4);
            field1695.method346(var2);
            field1695.method343(var1);
            field1573 = 0;
            Statics.field962 = class17.method865(var2);
            field1574 = var1;
        }
        if (var3 == 29) {
            field1695.method746(255);
            field1695.method302(var2);
            class17 var31 = class17.method865(var2);
            if (var31.field208 != null && var31.field208[0][0] == 5) {
                int var32 = var31.field208[0][1];
                if (class1.field4[var32] != var31.field210[0]) {
                    class1.field4[var32] = var31.field210[0];
                    method3055(var32);
                }
            }
        }
        if (var3 == 26) {
            method3135();
        }
        if (var3 == 4) {
            method946(var1, var2, var4);
            field1695.method746(54);
            field1695.method343(Statics.field2722 + var1);
            field1695.method342(var4 >> 14 & 0x7FFF);
            field1695.method300(Statics.field1915 + var2);
        }
        if (var3 == 45) {
            class61 var33 = field1583[var4];
            if (var33 != null) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var33.field2503[0], var33.field2507[0], false, 0, 0, 1, 1, 0, 2);
                field1476 = class116.field1817;
                field1570 = class116.field1805;
                field1548 = 2;
                field1614 = 0;
                field1695.method746(234);
                field1695.method343(var4);
            }
        }
        if (var3 == 13) {
            class66 var34 = field1491[var4];
            if (var34 != null) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var34.field2503[0], var34.field2507[0], false, 0, 0, 1, 1, 0, 2);
                field1476 = class116.field1817;
                field1570 = class116.field1805;
                field1548 = 2;
                field1614 = 0;
                field1695.method746(229);
                field1695.method342(var4);
            }
        }
        if (var3 == 23) {
            Statics.field967.method2317(Statics.field933, var1, var2);
        }
        if (var3 == 21) {
            boolean var35 = method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var35) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field1476 = class116.field1817;
            field1570 = class116.field1805;
            field1548 = 2;
            field1614 = 0;
            field1695.method746(167);
            field1695.method343(var4);
            field1695.method341(Statics.field2722 + var1);
            field1695.method300(Statics.field1915 + var2);
        }
        if (var3 == 2 && method946(var1, var2, var4)) {
            field1695.method746(12);
            field1695.method341(Statics.field1915 + var2);
            field1695.method343(Statics.field2722 + var1);
            field1695.method350(Statics.field2194);
            field1695.method343(field1471);
            field1695.method300(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 19) {
            boolean var37 = method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var37) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field1476 = class116.field1817;
            field1570 = class116.field1805;
            field1548 = 2;
            field1614 = 0;
            field1695.method746(179);
            field1695.method343(Statics.field1915 + var2);
            field1695.method341(var4);
            field1695.method300(Statics.field2722 + var1);
        }
        if (var3 == 5) {
            method946(var1, var2, var4);
            field1695.method746(25);
            field1695.method343(Statics.field2722 + var1);
            field1695.method343(var4 >> 14 & 0x7FFF);
            field1695.method341(Statics.field1915 + var2);
        }
        if (var3 == 36) {
            field1695.method746(238);
            field1695.method346(var2);
            field1695.method343(var1);
            field1695.method342(var4);
            field1573 = 0;
            Statics.field962 = class17.method865(var2);
            field1574 = var1;
        }
        if (var3 == 24) {
            class17 var39 = class17.method865(var2);
            boolean var40 = true;
            if (var39.field118 > 0) {
                var40 = method1034(var39);
            }
            if (var40) {
                field1695.method746(255);
                field1695.method302(var2);
            }
        }
        if (var3 == 25) {
            class17 var41 = class17.method3203(var2, var1);
            if (var41 != null) {
                method918();
                method1469(var2, var1, class12.method2632(method1362(var41)));
                field1675 = 0;
                field1644 = method3029(var41);
                if (field1644 == null) {
                    field1644 = "Null";
                }
                if (var41.field111) {
                    field1578 = var41.field172 + class62.method1489(16777215);
                } else {
                    field1578 = class62.method1489(65280) + var41.field212 + class62.method1489(16777215);
                }
            }
            return;
        }
        if (var3 == 1004) {
            field1476 = class116.field1817;
            field1570 = class116.field1805;
            field1548 = 2;
            field1614 = 0;
            field1695.method746(247);
            field1695.method300(var4);
        }
        if (var3 == 22) {
            boolean var42 = method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var42) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field1476 = class116.field1817;
            field1570 = class116.field1805;
            field1548 = 2;
            field1614 = 0;
            field1695.method746(121);
            field1695.method342(Statics.field1915 + var2);
            field1695.method342(Statics.field2722 + var1);
            field1695.method342(var4);
        }
        if (var3 == 50) {
            class61 var44 = field1583[var4];
            if (var44 != null) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var44.field2503[0], var44.field2507[0], false, 0, 0, 1, 1, 0, 2);
                field1476 = class116.field1817;
                field1570 = class116.field1805;
                field1548 = 2;
                field1614 = 0;
                field1695.method746(193);
                field1695.method341(var4);
            }
        }
        if (var3 == 49) {
            class61 var45 = field1583[var4];
            if (var45 != null) {
                method921(Statics.field1393.field2503[0], Statics.field1393.field2507[0], var45.field2503[0], var45.field2507[0], false, 0, 0, 1, 1, 0, 2);
                field1476 = class116.field1817;
                field1570 = class116.field1805;
                field1548 = 2;
                field1614 = 0;
                field1695.method746(88);
                field1695.method341(var4);
            }
        }
        if (var3 == 1005) {
            class17 var46 = class17.method865(var2);
            if (var46 == null || var46.field215[var1] < 100000) {
                field1695.method746(247);
                field1695.method300(var4);
            } else {
                method1199(0, "", var46.field215[var1] + " x " + class172.method934(var4).field2608);
            }
            field1573 = 0;
            Statics.field962 = class17.method865(var2);
            field1574 = var1;
        }
        if (field1675 != 0) {
            field1675 = 0;
            method854(class17.method865(Statics.field2032));
        }
        if (field1619) {
            method918();
        }
        if (Statics.field962 != null && field1573 == 0) {
            method854(Statics.field962);
        }
    }

    @ObfuscatedName("aj.cf(IIILjava/lang/String;B)V")
    public static void method3169(int arg0, int arg1, int arg2, String arg3) {
        class17 var4 = class17.method3203(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field152 != null) {
            class82 var5 = new class82();
            var5.field1148 = var4;
            var5.field1161 = arg0;
            var5.field1152 = arg3;
            var5.field1158 = var4.field152;
            class92.method3230(var5);
        }
        boolean var6 = true;
        if (var4.field118 > 0) {
            var6 = method1034(var4);
        }
        if (!var6 || !class12.method292(method1362(var4), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field1695.method746(62);
            field1695.method302(arg1);
            field1695.method300(arg2);
        }
        if (arg0 == 2) {
            field1695.method746(29);
            field1695.method302(arg1);
            field1695.method300(arg2);
        }
        if (arg0 == 3) {
            field1695.method746(116);
            field1695.method302(arg1);
            field1695.method300(arg2);
        }
        if (arg0 == 4) {
            field1695.method746(51);
            field1695.method302(arg1);
            field1695.method300(arg2);
        }
        if (arg0 == 5) {
            field1695.method746(74);
            field1695.method302(arg1);
            field1695.method300(arg2);
        }
        if (arg0 == 6) {
            field1695.method746(8);
            field1695.method302(arg1);
            field1695.method300(arg2);
        }
        if (arg0 == 7) {
            field1695.method746(208);
            field1695.method302(arg1);
            field1695.method300(arg2);
        }
        if (arg0 == 8) {
            field1695.method746(20);
            field1695.method302(arg1);
            field1695.method300(arg2);
        }
        if (arg0 == 9) {
            field1695.method746(218);
            field1695.method302(arg1);
            field1695.method300(arg2);
        }
        if (arg0 == 10) {
            field1695.method746(78);
            field1695.method302(arg1);
            field1695.method300(arg2);
        }
    }

    @ObfuscatedName("am.ad(IIIII)V")
    public static final void method3210(int arg0, int arg1, int arg2, int arg3) {
        if (field1548 == 1) {
            Statics.field2733[field1614 / 100].method2489(field1476 - 8, field1570 - 8);
        }
        if (field1548 == 2) {
            Statics.field2733[field1614 / 100 + 4].method2489(field1476 - 8, field1570 - 8);
        }
        field1582 = 0;
        int var4 = (Statics.field1393.field2461 >> 7) + Statics.field2722;
        int var5 = (Statics.field1393.field2500 >> 7) + Statics.field1915;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field1582 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field1582 = 1;
        }
        if (field1582 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field1582 = 0;
        }
        if (!field1475) {
            return;
        }
        int var6 = arg0 + 512 - 5;
        int var7 = arg1 + 20;
        Statics.field1408.method222("Fps:" + field1790, var6, var7, 16776960, -1);
        int var11 = var7 + 15;
        Runtime var8 = Runtime.getRuntime();
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        int var10 = 16776960;
        if (var9 > 32768 && field1464) {
            var10 = 16711680;
        }
        if (var9 > 65536 && !field1464) {
            var10 = 16711680;
        }
        Statics.field1408.method222("Mem:" + var9 + "k", var6, var11, var10, -1);
        var7 = var11 + 15;
    }

    @ObfuscatedName("am.q(B)V")
    public static final void method3229() {
        if (Statics.field1729 != null) {
            Statics.field1729.method2922();
        }
        if (Statics.field579 != null) {
            Statics.field579.method2922();
        }
    }

    @ObfuscatedName("an.bi(I)V")
    public static final void method3254() {
        for (class80 var0 = (class80) field1598.method1104(); var0 != null; var0 = (class80) field1598.method1106()) {
            if (var0.field1127 == -1) {
                var0.field1122 = 0;
                method2295(var0);
            } else {
                var0.method76();
            }
        }
    }

    @ObfuscatedName("an.bs(I)V")
    public static final void method3256() {
        while (true) {
            if (field1504.method749(field1625) >= 27) {
                int var0 = field1504.method747(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field1491[var0] == null) {
                        field1491[var0] = new class66();
                        var1 = true;
                    }
                    class66 var2 = field1491[var0];
                    field1482[++field1500 - 1] = var0;
                    var2.field2484 = field1468;
                    int var3 = field1504.method747(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field1504.method747(1);
                    if (var4 == 1) {
                        field1587[++field1628 - 1] = var0;
                    }
                    int var5 = field1596[field1504.method747(3)];
                    if (var1) {
                        var2.field2502 = var2.field2490 = var5;
                    }
                    int var6 = field1504.method747(1);
                    int var7 = field1504.method747(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.field971 = class184.method3428(field1504.method747(14));
                    var2.field2458 = var2.field971.field2829;
                    var2.field2504 = var2.field971.field2844;
                    if (var2.field2504 == 0) {
                        var2.field2490 = 0;
                    }
                    var2.field2462 = var2.field971.field2836;
                    var2.field2463 = var2.field971.field2828;
                    var2.field2464 = var2.field971.field2845;
                    var2.field2516 = var2.field971.field2839;
                    var2.field2459 = var2.field971.field2830;
                    var2.field2460 = var2.field971.field2825;
                    var2.field2489 = var2.field971.field2827;
                    var2.method2956(Statics.field1393.field2503[0] + var7, Statics.field1393.field2507[0] + var3, var6 == 1);
                    continue;
                }
            }
            field1504.method745();
            return;
        }
    }

    @ObfuscatedName("an.aj(Ljava/lang/String;ZB)V")
    public static final void method3258(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1408.method218(arg0, 250);
        int var6 = Statics.field1408.method219(arg0, 250) * 13;
        class106.method1537(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class106.method1539(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1408.method224(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method933(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method2301(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1009.getGraphics();
            Statics.field1059.method2597(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1009.repaint();
        }
    }

    @ObfuscatedName("aa.dy(Ljava/lang/String;I)V")
    public static final void method3426(String arg0) {
        if (!arg0.equals("")) {
            field1695.method746(214);
            field1695.method443(class28.method2628(arg0));
            field1695.method303(arg0);
        }
    }

    @ObfuscatedName("aa.bn(IIIIIIII)V")
    public static final void method3427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field1464 && Statics.field933 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field967.method2329(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field967.method2330(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field967.method2424(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field967.method2332(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field967.method2333(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field967.method2320(arg0, arg2, arg3);
                class181 var15 = class181.method925(var12);
                if (var15.field2794 != 0) {
                    field1520[arg0].method92(arg2, arg3, var13, var14, var15.field2767);
                }
            }
            if (arg1 == 1) {
                Statics.field967.method2321(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field967.method2322(arg0, arg2, arg3);
                class181 var16 = class181.method925(var12);
                if (var16.field2791 + arg2 > 103 || var16.field2791 + arg3 > 103 || var16.field2758 + arg2 > 103 || var16.field2758 + arg3 > 103) {
                    return;
                }
                if (var16.field2794 != 0) {
                    field1520[arg0].method107(arg2, arg3, var16.field2791, var16.field2758, var14, var16.field2767);
                }
            }
            if (arg1 == 3) {
                Statics.field967.method2312(arg0, arg2, arg3);
                class181 var17 = class181.method925(var12);
                if (var17.field2794 == 1) {
                    field1520[arg0].method95(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class72.field1050[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class72.method1358(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field967, field1520[arg0]);
    }

    @ObfuscatedName("ah.ai(Las;I)V")
    public static final void method3442(class164 arg0) {
        if (arg0.field2504 == 0) {
            return;
        }
        if (arg0.field2455 != -1 && arg0.field2455 < 32768) {
            class66 var1 = field1491[arg0.field2455];
            if (var1 != null) {
                int var2 = arg0.field2461 - var1.field2461;
                int var3 = arg0.field2500 - var1.field2500;
                if (var2 != 0 || var3 != 0) {
                    arg0.field2502 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field2455 >= 32768) {
            int var4 = arg0.field2455 - 32768;
            if (field1589 == var4) {
                var4 = 2047;
            }
            class61 var5 = field1583[var4];
            if (var5 != null) {
                int var6 = arg0.field2461 - var5.field2461;
                int var7 = arg0.field2500 - var5.field2500;
                if (var6 != 0 || var7 != 0) {
                    arg0.field2502 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field2478 != 0 || arg0.field2479 != 0) && (arg0.field2505 == 0 || arg0.field2509 > 0)) {
            int var8 = arg0.field2461 - (arg0.field2478 * 64 - Statics.field2722 * 64 - Statics.field2722 * 64);
            int var9 = arg0.field2500 - (arg0.field2479 * 64 - Statics.field1915 * 64 - Statics.field1915 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field2502 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field2478 = 0;
            arg0.field2479 = 0;
        }
        int var10 = arg0.field2502 - arg0.field2490 & 0x7FF;
        if (var10 == 0) {
            arg0.field2510 = 0;
            return;
        }
        arg0.field2510++;
        if (var10 > 1024) {
            arg0.field2490 -= arg0.field2504;
            boolean var11 = true;
            if (var10 < arg0.field2504 || var10 > 2048 - arg0.field2504) {
                arg0.field2490 = arg0.field2502;
                var11 = false;
            }
            if (arg0.field2480 == arg0.field2459 && (arg0.field2510 > 25 || var11)) {
                if (arg0.field2460 == -1) {
                    arg0.field2480 = arg0.field2462;
                } else {
                    arg0.field2480 = arg0.field2460;
                }
            }
        } else {
            arg0.field2490 += arg0.field2504;
            boolean var12 = true;
            if (var10 < arg0.field2504 || var10 > 2048 - arg0.field2504) {
                arg0.field2490 = arg0.field2502;
                var12 = false;
            }
            if (arg0.field2480 == arg0.field2459 && (arg0.field2510 > 25 || var12)) {
                if (arg0.field2489 == -1) {
                    arg0.field2480 = arg0.field2462;
                } else {
                    arg0.field2480 = arg0.field2489;
                }
            }
        }
        arg0.field2490 &= 0x7FF;
    }

    @ObfuscatedName("ah.s(I)V")
    public static final void method3464() {
        try {
            if (field1494 == 0) {
                if (Statics.field2549 != null) {
                    Statics.field2549.method2148();
                    Statics.field2549 = null;
                }
                Statics.field1159 = null;
                field1513 = false;
                field1495 = 0;
                field1494 = 1;
            }
            if (field1494 == 1) {
                if (Statics.field1159 == null) {
                    Statics.field1159 = Statics.field2717.method2222(Statics.field2585, Statics.field1242);
                }
                if (Statics.field1159.field2364 == 2) {
                    throw new IOException();
                }
                if (Statics.field1159.field2364 == 1) {
                    Statics.field2549 = new class121((Socket) Statics.field1159.field2360, Statics.field2717);
                    Statics.field1159 = null;
                    field1494 = 2;
                }
            }
            if (field1494 == 2) {
                field1695.field303 = 0;
                field1695.method443(14);
                Statics.field2549.method2153(field1695.field306, 0, 1);
                field1504.field303 = 0;
                field1494 = 3;
            }
            if (field1494 == 3) {
                if (Statics.field579 != null) {
                    Statics.field579.method2938();
                }
                if (Statics.field1729 != null) {
                    Statics.field1729.method2938();
                }
                int var0 = Statics.field2549.method2137();
                if (Statics.field579 != null) {
                    Statics.field579.method2938();
                }
                if (Statics.field1729 != null) {
                    Statics.field1729.method2938();
                }
                if (var0 != 0) {
                    method1076(var0);
                    return;
                }
                field1504.field303 = 0;
                field1494 = 5;
            }
            if (field1494 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field1695.field303 = 0;
                field1695.method443(10);
                field1695.method302(var1[0]);
                field1695.method302(var1[1]);
                field1695.method302(var1[2]);
                field1695.method302(var1[3]);
                field1695.method362(0L);
                field1695.method303(class86.field1216);
                field1695.method308(class100.field1377, class100.field1375);
                field1503.field303 = 0;
                if (field1466 == 40) {
                    field1503.method443(18);
                } else {
                    field1503.method443(16);
                }
                field1503.method300(0);
                int var2 = field1503.field303;
                field1503.method302(29);
                field1503.method306(field1695.field306, 0, field1695.field303);
                int var3 = field1503.field303;
                field1503.method303(class86.field1219);
                field1503.method443(field1464 ? 1 : 0);
                class153.method3008(field1503);
                class28 var4 = new class28(Statics.field1867.method694());
                Statics.field1867.method693(var4);
                field1503.method306(var4.field306, 0, var4.field306.length);
                field1503.method302(Statics.field2711.field1244);
                field1503.method302(Statics.field1713.field1244);
                field1503.method302(Statics.field278.field1244);
                field1503.method302(Statics.field898.field1244);
                field1503.method302(Statics.field411.field1244);
                field1503.method302(Statics.field2690.field1244);
                field1503.method302(Statics.field888.field1244);
                field1503.method302(Statics.field2734.field1244);
                field1503.method302(Statics.field417.field1244);
                field1503.method302(Statics.field1770.field1244);
                field1503.method302(Statics.field1497.field1244);
                field1503.method302(Statics.field1114.field1244);
                field1503.method302(Statics.field246.field1244);
                field1503.method302(Statics.field1719.field1244);
                field1503.method302(Statics.field1978.field1244);
                field1503.method302(Statics.field998.field1244);
                field1503.method328(var1, var3, field1503.field303);
                field1503.method312(field1503.field303 - var2);
                Statics.field2549.method2153(field1503.field306, 0, field1503.field303);
                field1695.method763(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field1504.method763(var1);
                field1494 = 6;
            }
            if (field1494 == 6 && Statics.field2549.method2136() > 0) {
                int var6 = Statics.field2549.method2137();
                if (var6 == 21 && field1466 == 20) {
                    field1494 = 7;
                } else if (var6 == 2) {
                    field1494 = 9;
                } else if (var6 == 15 && field1466 == 40) {
                    method1451();
                    return;
                } else if (var6 == 23 && field1639 < 1) {
                    field1639++;
                    field1494 = 0;
                } else {
                    method1076(var6);
                    return;
                }
            }
            if (field1494 == 7 && Statics.field2549.method2136() > 0) {
                field1621 = (Statics.field2549.method2137() + 3) * 60;
                field1494 = 8;
            }
            if (field1494 == 8) {
                field1495 = 0;
                class86.method1490(class57.field671, class57.field672, field1621 / 60 + class57.field673);
                if (--field1621 <= 0) {
                    field1494 = 0;
                }
            } else {
                if (field1494 == 9 && Statics.field2549.method2136() >= 8) {
                    field1630 = Statics.field2549.method2137();
                    field1480 = Statics.field2549.method2137() == 1;
                    field1589 = Statics.field2549.method2137();
                    field1589 <<= 0x8;
                    field1589 += Statics.field2549.method2137();
                    field1640 = Statics.field2549.method2137();
                    Statics.field2549.method2139(field1504.field306, 0, 1);
                    field1504.field303 = 0;
                    field1506 = field1504.method759();
                    Statics.field2549.method2139(field1504.field306, 0, 2);
                    field1504.field303 = 0;
                    field1625 = field1504.method349();
                    if (field1640 == 1) {
                        try {
                            class123.method2167(Statics.field1457, "zap");
                        } catch (Throwable var12) {
                        }
                    } else {
                        try {
                            client var8 = Statics.field1457;
                            JSObject.getWindow(var8).call("unzap", (Object[]) null);
                        } catch (Throwable var11) {
                        }
                    }
                    field1494 = 10;
                }
                if (field1494 != 10) {
                    field1495++;
                    if (field1495 > 2000) {
                        if (field1639 < 1) {
                            if (Statics.field406 == Statics.field1242) {
                                Statics.field1242 = Statics.field635;
                            } else {
                                Statics.field1242 = Statics.field406;
                            }
                            field1639++;
                            field1494 = 0;
                        } else {
                            method1076(-3);
                        }
                    }
                } else if (Statics.field2549.method2136() >= field1625) {
                    field1504.field303 = 0;
                    Statics.field2549.method2139(field1504.field306, 0, field1625);
                    method2067();
                    Statics.field1359 = -1;
                    method1372(false);
                    field1506 = -1;
                }
            }
        } catch (IOException var13) {
            if (field1639 < 1) {
                if (Statics.field406 == Statics.field1242) {
                    Statics.field1242 = Statics.field635;
                } else {
                    Statics.field1242 = Statics.field406;
                }
                field1639++;
                field1494 = 0;
            } else {
                method1076(-2);
            }
        }
    }
}

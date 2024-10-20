package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("eb")
public final class class147 extends class344 implements Runnable {

    @ObfuscatedName("eb.i")
    public OutputStream field1573;

    @ObfuscatedName("eb.w")
    public InputStream field1575;

    @ObfuscatedName("eb.s")
    public Socket field1580;

    @ObfuscatedName("eb.a")
    public boolean field1571 = false;

    @ObfuscatedName("eb.o")
    public class143 field1572;

    @ObfuscatedName("eb.g")
    public class149 field1570;

    @ObfuscatedName("eb.e")
    public byte[] field1574;

    @ObfuscatedName("eb.p")
    public int field1581 = 0;

    @ObfuscatedName("eb.j")
    public int field1569 = 0;

    @ObfuscatedName("eb.b")
    public boolean field1577 = false;

    @ObfuscatedName("eb.x")
    public final int field1578;

    @ObfuscatedName("eb.y")
    public final int field1579;

    public class147(Socket arg0, class143 arg1, int arg2) throws IOException {
        this.field1572 = arg1;
        this.field1580 = arg0;
        this.field1578 = arg2;
        this.field1579 = arg2 - 100;
        this.field1580.setSoTimeout(30000);
        this.field1580.setTcpNoDelay(true);
        this.field1580.setReceiveBufferSize(65536);
        this.field1580.setSendBufferSize(65536);
        this.field1575 = this.field1580.getInputStream();
        this.field1573 = this.field1580.getOutputStream();
    }

    @ObfuscatedName("eb.i(B)V")
    public void method2613() {
        if (this.field1571) {
            return;
        }
        synchronized (this) {
            this.field1571 = true;
            this.notifyAll();
        }
        if (this.field1570 != null) {
            while (this.field1570.field1596 == 0) {
                class399.method2872(1L);
            }
            if (this.field1570.field1596 == 1) {
                try {
                    ((Thread) this.field1570.field1597).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1570 = null;
    }

    public void finalize() {
        this.method2613();
    }

    @ObfuscatedName("eb.w(I)I")
    public int method2612() throws IOException {
        return this.field1571 ? 0 : this.field1575.read();
    }

    @ObfuscatedName("eb.s(I)I")
    public int method2615() throws IOException {
        return this.field1571 ? 0 : this.field1575.available();
    }

    @ObfuscatedName("eb.a(II)Z")
    public boolean method2616(int arg0) throws IOException {
        if (this.field1571) {
            return false;
        } else {
            return this.field1575.available() >= arg0;
        }
    }

    @ObfuscatedName("eb.o([BIII)I")
    public int method2617(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1571) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field1575.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("eb.g([BIIB)V")
    public void method2618(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1571) {
            return;
        }
        if (this.field1577) {
            this.field1577 = false;
            throw new IOException();
        }
        if (this.field1574 == null) {
            this.field1574 = new byte[this.field1578];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1574[this.field1569] = arg0[arg1 + var5];
                this.field1569 = (this.field1569 + 1) % this.field1578;
                if ((this.field1581 + this.field1579) % this.field1578 == this.field1569) {
                    throw new IOException();
                }
            }
            if (this.field1570 == null) {
                this.field1570 = this.field1572.method2570(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field1581 == this.field1569) {
                            if (this.field1571) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1581;
                        if (this.field1569 >= this.field1581) {
                            var4 = this.field1569 - this.field1581;
                        } else {
                            var4 = this.field1578 - this.field1581;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1573.write(this.field1574, var3, var4);
                    } catch (IOException var12) {
                        this.field1577 = true;
                    }
                    this.field1581 = (this.field1581 + var4) % this.field1578;
                    try {
                        if (this.field1581 == this.field1569) {
                            this.field1573.flush();
                        }
                    } catch (IOException var11) {
                        this.field1577 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1575 != null) {
                        this.field1575.close();
                    }
                    if (this.field1573 != null) {
                        this.field1573.close();
                    }
                    if (this.field1580 != null) {
                        this.field1580.close();
                    }
                } catch (IOException var10) {
                }
                this.field1574 = null;
                break;
            }
        } catch (Exception var15) {
            class425.method2652((String) null, var15);
        }
    }

    @ObfuscatedName("eb.e([BIII)V")
    public void method2642(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method2618(arg0, arg1, arg2);
    }
}

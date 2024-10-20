package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fw")
public final class class181 extends class316 implements Runnable {

    @ObfuscatedName("fw.h")
    public InputStream field2086;

    @ObfuscatedName("fw.v")
    public OutputStream field2082;

    @ObfuscatedName("fw.x")
    public Socket field2083;

    @ObfuscatedName("fw.w")
    public boolean field2091 = false;

    @ObfuscatedName("fw.t")
    public class176 field2087;

    @ObfuscatedName("fw.j")
    public class175 field2084;

    @ObfuscatedName("fw.n")
    public byte[] field2092;

    @ObfuscatedName("fw.p")
    public int field2088 = 0;

    @ObfuscatedName("fw.l")
    public int field2089 = 0;

    @ObfuscatedName("fw.z")
    public boolean field2090 = false;

    @ObfuscatedName("fw.u")
    public final int field2085;

    @ObfuscatedName("fw.e")
    public final int field2081;

    public class181(Socket arg0, class176 arg1, int arg2) throws IOException {
        this.field2087 = arg1;
        this.field2083 = arg0;
        this.field2085 = arg2;
        this.field2081 = arg2 - 100;
        this.field2083.setSoTimeout(30000);
        this.field2083.setTcpNoDelay(true);
        this.field2083.setReceiveBufferSize(65536);
        this.field2083.setSendBufferSize(65536);
        this.field2086 = this.field2083.getInputStream();
        this.field2082 = this.field2083.getOutputStream();
    }

    @ObfuscatedName("fw.h(B)V")
    public void method3288() {
        if (this.field2091) {
            return;
        }
        synchronized (this) {
            this.field2091 = true;
            this.notifyAll();
        }
        if (this.field2084 != null) {
            while (this.field2084.field2046 == 0) {
                class309.method3812(1L);
            }
            if (this.field2084.field2046 == 1) {
                try {
                    ((Thread) this.field2084.field2048).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2084 = null;
    }

    public void finalize() {
        this.method3288();
    }

    @ObfuscatedName("fw.v(B)I")
    public int method3290() throws IOException {
        return this.field2091 ? 0 : this.field2086.read();
    }

    @ObfuscatedName("fw.x(I)I")
    public int method3291() throws IOException {
        return this.field2091 ? 0 : this.field2086.available();
    }

    @ObfuscatedName("fw.w(IB)Z")
    public boolean method3292(int arg0) throws IOException {
        if (this.field2091) {
            return false;
        } else {
            return this.field2086.available() >= arg0;
        }
    }

    @ObfuscatedName("fw.t([BIIB)I")
    public int method3305(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2091) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2086.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fw.j([BIII)V")
    public void method3294(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2091) {
            return;
        }
        if (this.field2090) {
            this.field2090 = false;
            throw new IOException();
        }
        if (this.field2092 == null) {
            this.field2092 = new byte[this.field2085];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2092[this.field2089] = arg0[arg1 + var5];
                this.field2089 = (this.field2089 + 1) % this.field2085;
                if ((this.field2088 + this.field2081) % this.field2085 == this.field2089) {
                    throw new IOException();
                }
            }
            if (this.field2084 == null) {
                this.field2084 = this.field2087.method3265(this, 3);
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
                        if (this.field2089 == this.field2088) {
                            if (this.field2091) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2088;
                        if (this.field2089 >= this.field2088) {
                            var4 = this.field2089 - this.field2088;
                        } else {
                            var4 = this.field2085 - this.field2088;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2082.write(this.field2092, var3, var4);
                    } catch (IOException var12) {
                        this.field2090 = true;
                    }
                    this.field2088 = (this.field2088 + var4) % this.field2085;
                    try {
                        if (this.field2089 == this.field2088) {
                            this.field2082.flush();
                        }
                    } catch (IOException var11) {
                        this.field2090 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2086 != null) {
                        this.field2086.close();
                    }
                    if (this.field2082 != null) {
                        this.field2082.close();
                    }
                    if (this.field2083 != null) {
                        this.field2083.close();
                    }
                } catch (IOException var10) {
                }
                this.field2092 = null;
                break;
            }
        } catch (Exception var15) {
            class352.method3694((String) null, var15);
        }
    }

    @ObfuscatedName("fw.n([BIII)V")
    public void method3307(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3294(arg0, arg1, arg2);
    }
}

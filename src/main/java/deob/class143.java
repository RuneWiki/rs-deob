package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("eu")
public final class class143 implements Runnable {

    @ObfuscatedName("eu.i")
    public OutputStream field2171;

    @ObfuscatedName("eu.v")
    public InputStream field2175;

    @ObfuscatedName("eu.f")
    public Socket field2172;

    @ObfuscatedName("eu.h")
    public boolean field2174 = false;

    @ObfuscatedName("eu.a")
    public class136 field2179;

    @ObfuscatedName("eu.s")
    public class146 field2170;

    @ObfuscatedName("eu.p")
    public byte[] field2173;

    @ObfuscatedName("eu.r")
    public int field2177 = 0;

    @ObfuscatedName("eu.k")
    public int field2178 = 0;

    @ObfuscatedName("eu.d")
    public boolean field2176 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2179 = arg1;
        this.field2172 = arg0;
        this.field2172.setSoTimeout(30000);
        this.field2172.setTcpNoDelay(true);
        this.field2172.setReceiveBufferSize(16384);
        this.field2172.setSendBufferSize(16384);
        this.field2175 = this.field2172.getInputStream();
        this.field2171 = this.field2172.getOutputStream();
    }

    @ObfuscatedName("eu.h(I)V")
    public void method2779() {
        if (this.field2174) {
            return;
        }
        synchronized (this) {
            this.field2174 = true;
            this.notifyAll();
        }
        if (this.field2170 != null) {
            while (this.field2170.field2204 == 0) {
                class127.method848(1L);
            }
            if (this.field2170.field2204 == 1) {
                try {
                    ((Thread) this.field2170.field2212).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2170 = null;
    }

    public void finalize() {
        this.method2779();
    }

    @ObfuscatedName("eu.a(B)I")
    public int method2773() throws IOException {
        return this.field2174 ? 0 : this.field2175.read();
    }

    @ObfuscatedName("eu.s(B)I")
    public int method2774() throws IOException {
        return this.field2174 ? 0 : this.field2175.available();
    }

    @ObfuscatedName("eu.p([BIII)V")
    public void method2775(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2174) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2175.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("eu.r([BIIB)V")
    public void method2778(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2174) {
            return;
        }
        if (this.field2176) {
            this.field2176 = false;
            throw new IOException();
        }
        if (this.field2173 == null) {
            this.field2173 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2173[this.field2178] = arg0[arg1 + var5];
                this.field2178 = (this.field2178 + 1) % 5000;
                if ((this.field2177 + 4900) % 5000 == this.field2178) {
                    throw new IOException();
                }
            }
            if (this.field2170 == null) {
                this.field2170 = this.field2179.method2683(this, 3);
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
                        if (this.field2178 == this.field2177) {
                            if (this.field2174) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2177;
                        if (this.field2178 >= this.field2177) {
                            var4 = this.field2178 - this.field2177;
                        } else {
                            var4 = 5000 - this.field2177;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2171.write(this.field2173, var3, var4);
                    } catch (IOException var12) {
                        this.field2176 = true;
                    }
                    this.field2177 = (this.field2177 + var4) % 5000;
                    try {
                        if (this.field2178 == this.field2177) {
                            this.field2171.flush();
                        }
                    } catch (IOException var11) {
                        this.field2176 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2175 != null) {
                        this.field2175.close();
                    }
                    if (this.field2171 != null) {
                        this.field2171.close();
                    }
                    if (this.field2172 != null) {
                        this.field2172.close();
                    }
                } catch (IOException var10) {
                }
                this.field2173 = null;
                break;
            }
        } catch (Exception var15) {
            Statics.method929((String) null, var15);
        }
    }
}

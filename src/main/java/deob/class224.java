package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ia")
public class class224 {

    @ObfuscatedName("ia.aw")
    public Map field2403 = new HashMap();

    @ObfuscatedName("ia.al")
    public int field2401 = 0;

    @ObfuscatedName("ia.ai")
    public static final class224 field2402 = new class224();

    @ObfuscatedName("ia.aq(Lorg/json/JSONObject;ILel;I)V")
    public void method4001(JSONObject arg0, int arg1, class114 arg2) {
        this.field2403.clear();
        JSONObject var4;
        try {
            var4 = arg0;
            this.field2401 = arg1;
            arg0.getLong("lastfullsyncat");
            arg0.getLong("lastcardupdatedat");
        } catch (Exception var8) {
            return;
        }
        try {
            this.method3993(var4.getJSONArray("crmcomponents"), this.field2401, arg2);
        } catch (Exception var7) {
        }
    }

    @ObfuscatedName("ia.aw(Lorg/json/JSONArray;ILel;I)V")
    public void method3993(JSONArray arg0, int arg1, class114 arg2) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            JSONObject var5 = arg0.getJSONObject(var4);
            if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
                String var6 = var5.getString("platform");
                if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
                    class222 var7 = new class222();
                    try {
                        var7.method3952(var5, arg1, arg2);
                    } catch (Exception var10) {
                    }
                    if (!var7.field2388.isEmpty()) {
                        String var9 = var5.getString("location");
                        this.field2403.put(var9, var7);
                    }
                }
            }
        }
        this.field2403 = this.method3995();
        class318.method2218();
    }

    @ObfuscatedName("ia.al(B)Ljava/util/Map;")
    public Map method3995() {
        HashMap var1 = new HashMap();
        ArrayList var2 = new ArrayList();
        var2.addAll(this.field2403.entrySet());
        boolean var3 = false;
        while (!var3) {
            var3 = true;
            for (int var4 = 0; var4 < var2.size() - 1; var4++) {
                if (((class222) ((Entry) var2.get(var4)).getValue()).method3984() > ((class222) ((Entry) var2.get(var4 + 1)).getValue()).method3984()) {
                    Entry var5 = (Entry) var2.get(var4);
                    var2.set(var4, var2.get(var4 + 1));
                    var2.set(var4 + 1, var5);
                    var3 = false;
                }
            }
        }
        Iterator var6 = var2.iterator();
        while (var6.hasNext()) {
            Entry var7 = (Entry) var6.next();
            var1.put(var7.getKey(), var7.getValue());
        }
        return var1;
    }

    @ObfuscatedName("ia.ai(Ljava/lang/String;B)Lit;")
    public class222 method3996(String arg0) {
        return (class222) this.field2403.get(arg0);
    }
}

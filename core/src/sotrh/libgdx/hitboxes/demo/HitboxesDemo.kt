package sotrh.libgdx.hitboxes.demo

import com.artemis.World
import com.artemis.WorldConfigurationBuilder
import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class HitboxesDemo : ApplicationAdapter() {

    lateinit var world: World

    override fun create() {
        val worldConfig = WorldConfigurationBuilder().build()
        world = World(worldConfig)
    }

    override fun render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        world.setDelta(Gdx.graphics.deltaTime)
        world.process()
    }

    override fun dispose() {
    }
}

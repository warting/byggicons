package se.byggappen.icons

import androidx.compose.ui.graphics.vector.ImageVector
import se.byggappen.icons.byggicons.Camera
import se.byggappen.icons.byggicons.Edit
import se.byggappen.icons.byggicons.Email
import se.byggappen.icons.byggicons.Google
import se.byggappen.icons.byggicons.Hammer
import se.byggappen.icons.byggicons.Home
import se.byggappen.icons.byggicons.Image
import se.byggappen.icons.byggicons.Light
import se.byggappen.icons.byggicons.Menu
import se.byggappen.icons.byggicons.People
import se.byggappen.icons.byggicons.Plus
import se.byggappen.icons.byggicons.Profile
import se.byggappen.icons.byggicons.Project
import se.byggappen.icons.byggicons.Search
import se.byggappen.icons.byggicons.Settings
import se.byggappen.icons.byggicons.Talk
import se.byggappen.icons.byggicons.Toolbar
import se.byggappen.icons.byggicons.Trash
import kotlin.collections.List as ____KtList

public object ByggIcons

private var __AllAssets: ____KtList<ImageVector>? = null

public val ByggIcons.AllAssets: ____KtList<ImageVector>
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(Settings, Camera, Profile, Image, Project, Google, People, Toolbar, Light,
        Search, Plus, Hammer, Edit, Trash, Menu, Email, Talk, Home)
    return __AllAssets!!
  }
